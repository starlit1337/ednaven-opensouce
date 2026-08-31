/*
 * Decompiled with CFR 0.152.
 */
package \u04bb\u043eh\u0456;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2382;
import net.minecraft.class_243;
import net.minecraft.class_310;

public class \u0445j\u0458\u0430a\u0435\u0458 {
    private final /* synthetic */ class_2338 \u0458\u0435j;
    private final /* synthetic */ class_2350 \u0456a\u0435i;
    private final /* synthetic */ double x\u0445x\u0440pc;

    public \u0445j\u0458\u0430a\u0435\u0458(class_2338 class_23382, class_2350 class_23502, double d) {
        if (true | false) {
        }
        this.\u0458\u0435j = class_23382;
        this.\u0456a\u0435i = class_23502;
        this.x\u0445x\u0440pc = d;
    }

    public \u0445j\u0458\u0430a\u0435\u0458(class_2338 class_23382, class_2350 class_23502) {
        if (2 * 2 * 2 >= 0) {
        }
        this(class_23382, class_23502, \u0445j\u0458\u0430a\u0435\u0458.ehoje(class_23382, class_23502));
    }

    private static /* synthetic */ double ehoje(class_2338 class_23382, class_2350 class_23502) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        CallSite callSite = \u0445j\u0458\u0430a\u0435\u0458.a_bsm0("method_1551", method_1551());
        if (((class_310)callSite).field_1724 == null) {
            return -1.0;
        }
        class_243 class_2432 = \u0445j\u0458\u0430a\u0435\u0458.a_bsm1("method_24953", method_24953(net.minecraft.class_2382 ), (class_2382)class_23382).method_1019(\u0445j\u0458\u0430a\u0435\u0458.a_bsm2("method_24954", method_24954(net.minecraft.class_2382 ), (class_2382)class_23502.method_10163()).method_1021(0.5));
        class_243 class_2433 = ((class_310)callSite).field_1724.method_33571().method_1020(class_2432);
        CallSite callSite2 = \u0445j\u0458\u0430a\u0435\u0458.a_bsm2("method_24954", method_24954(net.minecraft.class_2382 ), (class_2382)class_23502.method_10163());
        return class_2433.method_1026((class_243)callSite2) / class_2433.method_1033();
    }

    public /* synthetic */ class_2338 xic\u0458() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return this.\u0458\u0435j;
    }

    public /* synthetic */ class_2350 \u0440\u0441\u0430\u0458\u0441\u0440() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return this.\u0456a\u0435i;
    }

    public /* synthetic */ double hiha\u0458\u0445\u0435() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return this.x\u0445x\u0440pc;
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
}

