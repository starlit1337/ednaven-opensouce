/*
 * Decompiled with CFR 0.152.
 */
package tech.naven.y;

import c\u0445is.\u0458i\u0458;
import java.util.List;
import net.minecraft.class_2561;
import net.minecraft.class_327;
import net.minecraft.class_355;
import net.minecraft.class_5348;
import net.minecraft.class_5481;
import net.minecraft.class_640;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import \u043e\u0445\u0440\u0430ose.i\u0456\u0445\u0430\u0441p;
import \u0440o\u0456\u0445o.\u0445\u0440\u0430\u0435\u0445\u043e;

/*
 * Renamed from tech.naven.Y.f
 */
@Mixin(value={class_355.class})
public abstract class f_0 {
    @Shadow
    public abstract class_2561 method_1918(class_640 var1);

    @Redirect(method={"method_1919"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_327;method_1728(Lnet/minecraft/class_5348;I)Ljava/util/List;", ordinal=0))
    public List<class_5481> hookHeader(class_327 class_3272, class_5348 class_53482, int n) {
        class_2561 class_25612 = (class_2561)class_53482;
        \u0458i\u0458 \u0458i\u04582 = new \u0458i\u0458(i\u0456\u0445\u0430\u0441p.j\u0445c, class_25612);
        \u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0458poi\u0440().\u0435ecjj\u0458(\u0458i\u04582);
        return class_3272.method_1728((class_5348)\u0458i\u04582.\u0441\u04bb\u0456c\u0455(), n);
    }

    @Redirect(method={"method_1919"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_327;method_1728(Lnet/minecraft/class_5348;I)Ljava/util/List;", ordinal=1))
    public List<class_5481> hookFooter(class_327 class_3272, class_5348 class_53482, int n) {
        class_2561 class_25612 = (class_2561)class_53482;
        \u0458i\u0458 \u0458i\u04582 = new \u0458i\u0458(i\u0456\u0445\u0430\u0441p.\u0456\u0455j\u0445\u0456\u0458, class_25612);
        \u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0458poi\u0440().\u0435ecjj\u0458(\u0458i\u04582);
        return class_3272.method_1728((class_5348)\u0458i\u04582.\u0441\u04bb\u0456c\u0455(), n);
    }

    @Redirect(method={"method_1919"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_355;method_1918(Lnet/minecraft/class_640;)Lnet/minecraft/class_2561;"))
    public class_2561 hookName(class_355 class_3552, class_640 class_6402) {
        class_2561 class_25612 = this.method_1918(class_6402);
        \u0458i\u0458 \u0458i\u04582 = new \u0458i\u0458(i\u0456\u0445\u0430\u0441p.\u0435\u043e\u0441\u0455p, class_25612);
        \u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0458poi\u0440().\u0435ecjj\u0458(\u0458i\u04582);
        return \u0458i\u04582.\u0441\u04bb\u0456c\u0455();
    }
}

