/*
 * Decompiled with CFR 0.152.
 */
package \u0440\u0440\u0440;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class \u0441\u0445s {
    private static /* synthetic */ double \u0440sp;
    private static /* synthetic */ long p\u0455p;

    public \u0441\u0445s() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
    }

    public static /* synthetic */ float cii\u0456cx(float f, float f2, float f3) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        boolean bl = f < f2;
        double d = (double)f + (double)((f2 - f) * \u0441\u0445s.o\u043e\u0435\u0455(f3)) * \u0441\u0445s.xj\u0456\u043ej\u0430() * 100.0;
        if (bl) {
            return (float)\u0441\u0445s.a_bsm0("min", min(double double ), (double)f2, (double)d);
        }
        return (float)\u0441\u0445s.a_bsm1("max", max(double double ), (double)f2, (double)d);
    }

    private static /* synthetic */ float o\u043e\u0435\u0455(float f) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        float f2 = f < 0.2f ? 3.125f * (f * f) : (f > 0.8f ? -3.125f * (f * f) + 6.25f * f - 2.125f : 1.25f * (f - 0.1f));
        return \u0441\u0445s.x\u0435a\u0440\u0430\u0435(f2);
    }

    private static /* synthetic */ float x\u0435a\u0440\u0430\u0435(float f) {
        Object object;
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (f < 0.0f) {
            object = 0.0f;
            switch (0) {
                default: {
                    break;
                }
                case 1: {
                    break;
                }
                case 2: {
                    break;
                }
            }
        } else {
            object = \u0441\u0445s.a_bsm2("min", min(float float ), (float)f, (float)1.0f);
        }
        return object;
    }

    public static /* synthetic */ void \u04bb\u0440\u0440j\u0440i() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        CallSite callSite = \u0441\u0445s.a_bsm3("nanoTime", nanoTime());
        \u0441\u0445s.\u04bbie\u0435\u0440\u0445((double)\u0441\u0445s.a_bsm0("min", min(double double ), (double)((double)(callSite - p\u0455p) / 1.0E9), (double)0.1));
        p\u0455p = (long)callSite;
    }

    public static /* synthetic */ double xj\u0456\u043ej\u0430() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return \u0440sp;
    }

    public static /* synthetic */ void \u04bbie\u0435\u0440\u0445(double d) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        \u0440sp = d;
    }

    static {
        \u0440sp = 0.0;
        p\u0455p = System.nanoTime();
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

