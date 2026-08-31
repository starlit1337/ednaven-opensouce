/*
 * Decompiled with CFR 0.152.
 */
package ie\u0441\u0430ej;

import c\u0445is.\u043e\u0458o\u0445xp\u0440;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_310;

public class \u0430cc\u0430h {
    private static final /* synthetic */ class_310 \u0458\u0440c;

    public \u0430cc\u0430h() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
    }

    public static /* synthetic */ float sph\u0440\u0456\u0455() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        float f = \u0430cc\u0430h.\u0458\u0440c.field_1724.method_36454();
        float f2 = \u0430cc\u0430h.\u0458\u0440c.field_1724.field_3913.field_3905;
        float f3 = \u0430cc\u0430h.\u0458\u0440c.field_1724.field_3913.field_3907;
        if (f2 < 0.0f) {
            f += 180.0f;
        }
        float f4 = 1.0f;
        if (f2 < 0.0f) {
            f4 = -0.5f;
        } else if (f2 > 0.0f) {
            f4 = 0.5f;
        }
        if (f3 > 0.0f) {
            f -= 90.0f * f4;
        }
        if (f3 < 0.0f) {
            f += 90.0f * f4;
        }
        return f;
    }

    private static /* synthetic */ float e\u0445oox\u04bb\u0435(float f, float f2) {
        boolean bl;
        boolean bl2;
        boolean bl3;
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        if (\u0430cc\u0430h.\u0458\u0440c.field_1724 == null) {
            return 0.0f;
        }
        float f3 = \u0430cc\u0430h.\u0458\u0440c.field_1724.method_36454();
        boolean bl4 = f > 0.0f;
        boolean bl5 = f < 0.0f;
        boolean bl6 = f2 > 0.0f;
        boolean bl7 = bl3 = f2 < 0.0f;
        if (bl6 || bl3) {
            bl2 = true;
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
            bl2 = false;
        }
        boolean bl8 = bl2;
        boolean bl9 = bl = bl4 || bl5;
        if (f != 0.0f || f2 != 0.0f) {
            if (bl5 && !bl8) {
                return f3 + 180.0f;
            }
            if (bl4 && bl3) {
                return f3 + 45.0f;
            }
            if (bl4 && bl6) {
                return f3 - 45.0f;
            }
            if (!bl && bl3) {
                return f3 + 90.0f;
            }
            if (!bl) {
                return f3 - 90.0f;
            }
            if (bl5 && bl3) {
                return f3 + 135.0f;
            }
            if (bl5) {
                return f3 - 135.0f;
            }
        }
        return f3;
    }

    public static /* synthetic */ void epix(\u043e\u0458o\u0445xp\u0440 \u043e\u0458o\u0445xp\u04402, float f) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        float f2 = \u043e\u0458o\u0445xp\u04402.\u0458\u0430\u0441\u0441\u0458c\u0455();
        float f3 = \u043e\u0458o\u0445xp\u04402.ej\u0435\u0430c();
        int n = -304896905 + 304896950;
        float f4 = 22.5f;
        CallSite callSite = \u0430cc\u0430h.a_bsm1("max", max(float float ), (float)\u0430cc\u0430h.a_bsm0("abs", abs(float ), (float)f2), (float)\u0430cc\u0430h.a_bsm0("abs", abs(float ), (float)f3));
        double d = (double)\u0430cc\u0430h.a_bsm2("method_15393", method_15393(float ), (float)(\u0430cc\u0430h.e\u0445oox\u04bb\u0435(f2, f3) - f));
        CallSite callSite2 = \u0430cc\u0430h.a_bsm3("abs", abs(double ), (double)d);
        f2 = 0.0f;
        f3 = 0.0f;
        if (callSite2 <= (double)((float)n + f4)) {
            f2 += 1.0f;
        } else if (callSite2 >= (double)(180.0f - (float)n - f4)) {
            f2 -= 1.0f;
        }
        if (d >= (double)((float)n - f4) && d <= (double)(180.0f - (float)n + f4)) {
            f3 -= 1.0f;
        } else if (d <= (double)((float)(-n) + f4) && d >= (double)(-180.0f + (float)n - f4)) {
            f3 += 1.0f;
        }
        \u043e\u0458o\u0445xp\u04402.xoj(f2 *= callSite);
        \u043e\u0458o\u0445xp\u04402.pca\u043e(f3 *= callSite);
    }

    public static /* synthetic */ boolean \u0455pia\u0456\u0441() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return \u0430cc\u0430h.\u0458\u0440c.field_1724 != null && (\u0430cc\u0430h.\u0458\u0440c.field_1724.field_3913.field_3907 != 0.0f || \u0430cc\u0430h.\u0458\u0440c.field_1724.field_3913.field_3905 != 0.0f || \u0430cc\u0430h.\u0458\u0440c.field_1690.field_1913.method_1434() || \u0430cc\u0430h.\u0458\u0440c.field_1690.field_1849.method_1434() || \u0430cc\u0430h.\u0458\u0440c.field_1690.field_1894.method_1434() || \u0430cc\u0430h.\u0458\u0440c.field_1690.field_1881.method_1434());
    }

    static {
        \u0458\u0440c = class_310.method_1551();
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

