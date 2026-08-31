# EdNaven_Fabric — 源码工程

由 `EdNaven_Fabric-3.3-LATEST.jar` 反编译整理而来的 Gradle 源码工程，结构对齐 Southside 工程
（`settings.gradle` + `gradle.properties` + `build.gradle` + `src/main/java` + `src/main/resources`），
目标是 `gradle build` 后产出可直接丢进 `mods/` 目录的 Fabric mod jar。

## 基本信息

| 项 | 值 |
|---|---|
| Mod ID | `ednaven_fabric` |
| 版本 | 3.3-LATEST |
| Minecraft | 1.20.6 |
| Fabric Loader | ≥ 0.18.4 |
| Java | **21**（mixins.json 的 compatibilityLevel 就是 JAVA_21） |
| 入口 | `tech.naven.fabric.NavenModInitializer`（空壳，真实逻辑在 Mixin） |
| Mixin 包 | `tech.naven.Y`（33 个 client Mixin + `x`） |

## 目录结构

```
EdNaven-fabric/
├── build.gradle              # Fabric Loom 构建脚本
├── settings.gradle
├── gradle.properties         # 版本变量与 JDK 21 路径
├── libs/                     # 原 jar 内嵌依赖（javacv/ffmpeg/skija/javacpp/collection）
└── src/main/
    ├── java/
    │   ├── tech/naven/       # 核心：fabric 入口 + Y(Mixin 包) + utils
    │   └── <中文包名>/        # EdNaven 的水面混淆层（anti-tamper），不可删
    └── resources/
        ├── fabric.mod.json
        ├── ednaven_fabric.mixins.json
        └── ednaven.accesswidener
```

## 构建

需要 **JDK 21** 与网络（首次构建会下载 Minecraft、Intermediary 映射、Fabric Loader、Loom）。

```powershell
cd "C:\Users\zh201\WorkBuddy\2026-08-26-21-28-31\EdNaven-fabric"

# 用本地已有的 Gradle 8.5（工程目录下没放 wrapper）
& "C:\Users\zh201\WorkBuddy\2026-08-26-21-28-31\gradle-8.5\bin\gradle.bat" build

# 想生成 wrapper 的话（首次构建成功后执行）
& "C:\Users\zh201\WorkBuddy\2026-08-26-21-28-31\gradle-8.5\bin\gradle.bat" wrapper --gradle-version 8.5
```

产物：`build/libs/EdNaven_Fabric-3.3-LATEST.jar`（**用这个**，不要拿 `-dev` 或 `-sources` 的）。
`gradle packageMod` 会额外打成 `EdNaven_Fabric.zip` 方便分发。

## 三个关键设计（改动前必读）

### 1. mappings 必须是 Intermediary，不能用 Yarn
反编译出来的源码里 Minecraft 类全是 **Intermediary 中间名**：

```java
import net.minecraft.class_310;   // = Minecraft
import net.minecraft.class_638;   // = ClientWorld
```

所以 `build.gradle` 里是 `mappings "net.fabricmc:intermediary:1.20.6:v2"`。
**换成 Yarn 会导致全量编译失败**——Yarn 会把 `class_310` 命名成 `Minecraft`，源码里的 import 全部失效。

### 2. libs/ 里的内嵌依赖要打回 `META-INF/jars`
`fabric.mod.json` 用 `jars` 字段声明了 9 个内嵌依赖（javacv、ffmpeg、skija、javacpp、collection），
源码里的视频播放 / 字体渲染（`io.github.humbleui.skija.*`、`org.bytedeco.javacv.*`）都依赖它们。

`build.gradle` 的 `jar` 任务里已经有：
```groovy
from('libs') { into 'META-INF/jars' }
```
**删掉这行，运行时会 NoClassDefFoundError。**

### 3. 中文包名是混淆层，不能随手删
`src/main/java` 下的中文包名（如 `аее`、`хаpр`）是 EdNaven 自己的水面混淆（anti-tamper），
核心 Mixin 会引用它们。Java 允许 Unicode 标识符，编译没问题，但**必须保持 UTF-8 编码**
（构建脚本里已设置 `options.encoding = 'UTF-8'`）。

## 已知限制

- 反编译产物可能存在个别 CFR 输出问题（不可达语句、重复局部变量、泛型擦除导致的强转缺失等）。
  首次构建若报编译错误，按错误逐条修即可，通常集中在少数几个文件。
- 未做反混淆重命名：类名仍是 `class_310` 与中文包名。想要 Southside 那种全英文可读命名，
  需要额外做「Intermediary → Yarn」的重命名 + 中文包名重构，属于独立工作量。
