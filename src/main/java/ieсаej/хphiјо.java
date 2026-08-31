/*
 * Decompiled with CFR 0.152.
 */
package ie\u0441\u0430ej;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.stream.Stream;
import net.minecraft.class_1923;
import net.minecraft.class_2586;
import net.minecraft.class_2818;
import net.minecraft.class_310;

public class \u0445phi\u0458\u043e {
    private static final /* synthetic */ class_310 \u0458a\u0440;

    public \u0445phi\u0458\u043e() {
        if (true | false) {
        }
    }

    public static /* synthetic */ Stream<class_2586> \u0456is() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return ((Stream)((Object)\u0445phi\u0458\u043e.a_bsm0("requireNonNull", requireNonNull(T ), \u0445phi\u0458\u043e.\u0456\u04bb\u0445a()))).flatMap(class_28182 -> {
            if ((3 * 3 + 3) % 2 == 0) {
            }
            return class_28182.method_12214().values().stream();
        });
    }

    public static /* synthetic */ Stream<class_2818> \u0456\u04bb\u0445a() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        if (\u0445phi\u0458\u043e.\u0458a\u0440.field_1724 == null || \u0445phi\u0458\u043e.\u0458a\u0440.field_1687 == null) {
            return null;
        }
        reference var0 = \u0445phi\u0458\u043e.a_bsm1("max", max(int int ), (int)2, (int)\u0445phi\u0458\u043e.\u0458a\u0440.field_1690.method_38521()) + 3;
        reference var1_1 = var0 * 2 + true;
        class_1923 class_19233 = \u0445phi\u0458\u043e.\u0458a\u0440.field_1724.method_31476();
        class_1923 class_19235 = new class_1923(class_19233.field_9181 - var0, class_19233.field_9180 - var0);
        class_1923 class_19236 = new class_1923(class_19233.field_9181 + var0, class_19233.field_9180 + var0);
        return \u0445phi\u0458\u043e.a_bsm2("iterate", iterate(T java.util.function.UnaryOperator<T> ), (Object)class_19235, class_19234 -> {
            if (true | false) {
            }
            int n = class_19234.field_9181;
            int n2 = class_19234.field_9180;
            if (++n > class_19232.field_9181) {
                n = class_19233.field_9181;
                ++n2;
            }
            if (n2 > class_19232.field_9180) {
                byte[] byArray = new byte[-911978139 + 911978164];
                byArray[0] = -1462876118 + 1462876045;
                byArray[1] = -149758069 + 149758093;
                byArray[2] = -1406248499 + 1406248584;
                byArray[3] = -28626647 + 28626640;
                byArray[4] = -444812551 + 444812618;
                byArray[5] = -113650104 + 113650194;
                byArray[-1259256049 + 1259256055] = -1523195401 + 1523195459;
                byArray[-1834174530 + 1834174537] = -1648857402 + 1648857410;
                byArray[-97420202 + 97420210] = -2004806209 + 2004806131;
                byArray[-821154872 + 821154881] = -1972999797 + 1972999684;
                byArray[-787863525 + 787863535] = -326059025 + 326059129;
                byArray[-1304993615 + 1304993626] = -1970444374 + 1970444389;
                byArray[-689207221 + 689207233] = -1924118972 + 1924118852;
                byArray[-960670619 + 960670632] = -594994470 + 594994560;
                byArray[-1583924494 + 1583924508] = -1272565818 + 1272565725;
                byArray[-400916022 + 400916037] = -1799037371 + 1799037338;
                byArray[-717952884 + 717952900] = -888029481 + 888029509;
                byArray[-133162488 + 133162505] = -1306656981 + 1306657098;
                byArray[-2018542149 + 2018542167] = -184672716 + 184672634;
                byArray[-530330581 + 530330600] = -568796061 + 568796117;
                byArray[-140998047 + 140998067] = -263741164 + 263741209;
                byArray[-1743216340 + 1743216361] = -984875125 + 984875160;
                byArray[-1554858991 + 1554859013] = -694164199 + 694164253;
                byArray[-1327246760 + 1327246783] = -456718715 + 456718750;
                byArray[-56768023 + 56768047] = -1026849402 + 1026849477;
                throw new IllegalStateException((String)((Object)\u0445phi\u0458\u043e.a_bsm3("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-1629772850 + 620306438), (int)(-682671856 + 789824850))));
            }
            return new class_1923(n, n2);
        }).limit((long)var1_1 * (long)var1_1).filter(class_19232 -> {
            if (2 * 2 * 2 >= 0) {
            }
            return \u0445phi\u0458\u043e.\u0458a\u0440.field_1687.method_8393(class_19232.field_9181, class_19232.field_9180);
        }).map(class_19232 -> {
            if (true | false) {
            }
            return \u0445phi\u0458\u043e.\u0458a\u0440.field_1687.method_8497(class_19232.field_9181, class_19232.field_9180);
        });
    }

    static {
        \u0458a\u0440 = class_310.method_1551();
    }

    private static /* synthetic */ CallSite a_bsm0(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm1(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm2(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm3(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }
}

