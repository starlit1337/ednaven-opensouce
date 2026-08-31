/*
 * Decompiled with CFR 0.152.
 */
package \u04bb\u043eh\u0456;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.List;
import java.util.function.ToDoubleFunction;
import net.minecraft.class_1799;
import net.minecraft.class_2382;
import net.minecraft.class_310;
import \u0441j\u0455\u0440.j\u0435\u0456;

public class csa {
    private final /* synthetic */ List<class_2382> c\u0441\u0445\u04bbe;
    private final /* synthetic */ class_1799 aax\u0440h\u0441;
    private final /* synthetic */ j\u0435\u0456 o\u043e\u0455\u0440\u04bb;
    private final /* synthetic */ ToDoubleFunction<class_2382> hh\u0435i\u0430\u043e;
    public static final /* synthetic */ ToDoubleFunction<class_2382> \u0445\u0435pp\u0441p\u04bb;

    public csa(List<class_2382> list, class_1799 class_17992, j\u0435\u0456 j\u0435\u04562, ToDoubleFunction<class_2382> toDoubleFunction) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        this.c\u0441\u0445\u04bbe = list;
        this.aax\u0440h\u0441 = class_17992;
        this.o\u043e\u0455\u0440\u04bb = j\u0435\u04562;
        this.hh\u0435i\u0430\u043e = toDoubleFunction;
    }

    public /* synthetic */ List<class_2382> j\u0435\u0458\u0458h\u0435() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return this.c\u0441\u0445\u04bbe;
    }

    public /* synthetic */ class_1799 e\u0455ih() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return this.aax\u0440h\u0441;
    }

    public /* synthetic */ j\u0435\u0456 \u0458\u0441\u0458c\u043e() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return this.o\u043e\u0455\u0440\u04bb;
    }

    public /* synthetic */ ToDoubleFunction<class_2382> \u0435j\u043ep() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return this.hh\u0435i\u0430\u043e;
    }

    static {
        \u0445\u0435pp\u0441p\u04bb = class_23822 -> {
            if (2 * 2 * 2 >= 0) {
            }
            CallSite callSite = csa.a_bsm0("method_1551", method_1551());
            if (((class_310)callSite).field_1724 == null) {
                return 0.0;
            }
            CallSite callSite2 = csa.a_bsm1("method_24953", method_24953(net.minecraft.class_2382 ), (class_2382)class_23822);
            return -callSite2.method_1025(((class_310)callSite).field_1724.method_19538());
        };
    }

    private static /* synthetic */ CallSite a_bsm0(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm1(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }
}

