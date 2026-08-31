/*
 * Decompiled with CFR 0.152.
 */
package \u0441j\u0455\u0440;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Objects;
import net.minecraft.class_1297;
import net.minecraft.class_1922;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_2382;
import net.minecraft.class_243;
import net.minecraft.class_2482;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_3726;
import \u0441j\u0455\u0440.s\u043ehc;
import \u0441j\u0455\u0440.\u0458\u0445x\u0435\u0455;
import \u04bb\u043eh\u0456.csa;
import \u04bb\u043eh\u0456.\u0445j\u0458\u0430a\u0435\u0458;

public class \u0456xi\u0441\u0445o {
    public \u0456xi\u0441\u0445o() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
    }

    public static /* synthetic */ s\u043ehc j\u0458\u0458e\u0445\u0445(class_2680 class_26802, class_2338 class_23382, \u0445j\u0458\u0430a\u0435\u0458 \u0445j\u0458\u0430a\u0435\u04582, csa csa2) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        CallSite callSite = \u0456xi\u0441\u0445o.a_bsm0("method_1551", method_1551());
        if (((class_310)callSite).field_1687 == null || ((class_310)callSite).field_1724 == null) {
            return null;
        }
        boolean bl = class_26802.method_26204() instanceof class_2482;
        CallSite callSite2 = \u0456xi\u0441\u0445o.a_bsm1("method_16195", method_16195(net.minecraft.class_1297 ), (class_1297)((class_310)callSite).field_1724);
        return class_26802.method_26172((class_1922)((class_310)callSite).field_1687, class_23382, (class_3726)callSite2).method_1090().stream().map(class_2383 -> {
            if ((3 * 3 + 3) % 2 == 0) {
            }
            \u0458\u0445x\u0435\u0455 \u0458\u0445x\u0435\u04552 = \u0456xi\u0441\u0445o.\u0455cico(class_2383, \u0445j\u0458\u0430a\u0435\u04582.\u0440\u0441\u0430\u0458\u0441\u0440());
            if (bl && (\u0458\u0445x\u0435\u04552 = \u0458\u0445x\u0435\u04552.ph\u0458(0.5).xoa\u0435()) == null) {
                return null;
            }
            class_243 class_2432 = csa2.\u0458\u0441\u0458c\u043e().producePositionOnFace(\u0458\u0445x\u0435\u04552, class_23382);
            return new s\u043ehc(\u0458\u0445x\u0435\u04552, class_2432);
        }).filter(Objects::nonNull).max(\u0456xi\u0441\u0445o.a_bsm2("comparingDouble", comparingDouble(java.util.function.ToDoubleFunction<? super T> ), s\u043ehc2 -> {
            if (true | false) {
            }
            CallSite callSite = \u0456xi\u0441\u0445o.a_bsm3("method_24954", method_24954(net.minecraft.class_2382 ), (class_2382)\u0445j\u0458\u0430a\u0435\u04582.\u0440\u0441\u0430\u0458\u0441\u0440().method_10163());
            return s\u043ehc2.ch\u04bb\u0435().method_1023(0.5, 0.5, 0.5).method_18806((class_243)callSite).method_1027();
        }).thenComparingDouble(s\u043ehc2 -> {
            if (2 * 2 * 2 >= 0) {
            }
            return s\u043ehc2.ch\u04bb\u0435().field_1351;
        })).orElse(null);
    }

    private static /* synthetic */ \u0458\u0445x\u0435\u0455 \u0455cico(class_238 class_2383, class_2350 class_23502) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return new \u0458\u0445x\u0435\u0455(new class_243(class_23502 == class_2350.field_11039 ? class_2383.field_1323 : class_2383.field_1320, class_23502 == class_2350.field_11033 ? class_2383.field_1322 : class_2383.field_1325, class_23502 == class_2350.field_11043 ? class_2383.field_1321 : class_2383.field_1324), new class_243(class_23502 == class_2350.field_11034 ? class_2383.field_1320 : class_2383.field_1323, class_23502 == class_2350.field_11036 ? class_2383.field_1325 : class_2383.field_1322, class_23502 == class_2350.field_11035 ? class_2383.field_1324 : class_2383.field_1321));
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

