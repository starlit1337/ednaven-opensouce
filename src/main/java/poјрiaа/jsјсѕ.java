/*
 * Decompiled with CFR 0.152.
 */
package po\u0458\u0440ia\u0430;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import po\u0458\u0440ia\u0430.\u0456\u0435cp\u0440s\u04bb;
import po\u0458\u0440ia\u0430.\u04bb\u0435\u0458;

public class js\u0458\u0441\u0455 {
    public js\u0458\u0441\u0455() {
        if (2 * 2 * 2 >= 0) {
        }
    }

    public static /* synthetic */ \u0456\u0435cp\u0440s\u04bb apo(\u04bb\u0435\u0458 \u04bb\u0435\u04582) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        if (\u04bb\u0435\u04582 == null) {
            return null;
        }
        int n = \u04bb\u0435\u04582.s\u0456\u0455\u0435\u0456\u0455();
        int n2 = \u04bb\u0435\u04582.\u0445\u04bbs();
        int n3 = \u04bb\u0435\u04582.\u0435j\u04bb\u0456je();
        float f = (float)js\u0458\u0441\u0455.a_bsm0("min", min(int int ), (int)n, (int)js\u0458\u0441\u0455.a_bsm0("min", min(int int ), (int)n3, (int)n2));
        float f2 = (float)js\u0458\u0441\u0455.a_bsm1("max", max(int int ), (int)n, (int)js\u0458\u0441\u0455.a_bsm1("max", max(int int ), (int)n3, (int)n2));
        float f3 = f2 - f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = (f2 + f) / 2.0f;
        if (f3 == 0.0f) {
            f4 = 0.0f;
            f5 = 0.0f;
        } else {
            f5 = f6 < 128.0f ? 256.0f * f3 / (f2 + f) : 256.0f * f3 / (512.0f - f2 - f);
            float f7 = (360.0f * (f2 - (float)n) / 6.0f + 360.0f * f3 / 2.0f) / f3;
            float f8 = (360.0f * (f2 - (float)n2) / 6.0f + 360.0f * f3 / 2.0f) / f3;
            float f9 = (360.0f * (f2 - (float)n3) / 6.0f + 360.0f * f3 / 2.0f) / f3;
            if ((float)n == f2) {
                f4 = f9 - f8;
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
            } else if ((float)n2 == f2) {
                f4 = 120.0f + f7 - f9;
            } else if ((float)n3 == f2) {
                f4 = 240.0f + f8 - f7;
            }
            if (f4 < 0.0f) {
                f4 += 360.0f;
            }
            if (f4 >= 360.0f) {
                f4 -= 360.0f;
            }
            if (f6 >= 256.0f) {
                f6 = 255.0f;
            }
            if (f5 >= 256.0f) {
                f5 = 255.0f;
            }
        }
        return new \u0456\u0435cp\u0440s\u04bb(f4, f5, f6);
    }

    public static /* synthetic */ \u04bb\u0435\u0458 ssi\u0441\u0441p(\u0456\u0435cp\u0440s\u04bb \u0456\u0435cp\u0440s\u04bb2) {
        float f;
        float f2;
        float f3;
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if (\u0456\u0435cp\u0440s\u04bb2 == null) {
            return null;
        }
        float f4 = \u0456\u0435cp\u0440s\u04bb2.\u0456\u0458\u043eaj();
        float f5 = \u0456\u0435cp\u0440s\u04bb2.\u04bb\u0458p\u0455p();
        float f6 = \u0456\u0435cp\u0440s\u04bb2.pxx();
        if (f5 == 0.0f) {
            f3 = f6;
            f2 = f6;
            f = f6;
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
            float f7 = f6 < 128.0f ? f6 * (256.0f + f5) / 256.0f : f6 + f5 - f5 * f6 / 256.0f;
            if (f7 > 255.0f) {
                f7 = (float)js\u0458\u0441\u0455.a_bsm2("round", round(float ), (float)f7);
            }
            if (f7 > 254.0f) {
                f7 = 255.0f;
            }
            float f8 = 2.0f * f6 - f7;
            f3 = js\u0458\u0441\u0455.ho\u0440\u0455hs(f8, f7, f4 + 120.0f);
            f2 = js\u0458\u0441\u0455.ho\u0440\u0455hs(f8, f7, f4);
            f = js\u0458\u0441\u0455.ho\u0440\u0455hs(f8, f7, f4 - 120.0f);
        }
        f3 = f3 < 0.0f ? 0.0f : f3;
        f3 = f3 > 255.0f ? 255.0f : f3;
        f2 = f2 < 0.0f ? 0.0f : f2;
        f2 = f2 > 255.0f ? 255.0f : f2;
        f = f < 0.0f ? 0.0f : f;
        f = f > 255.0f ? 255.0f : f;
        return new \u04bb\u0435\u0458((int)js\u0458\u0441\u0455.a_bsm2("round", round(float ), (float)f3), (int)js\u0458\u0441\u0455.a_bsm2("round", round(float ), (float)f2), (int)js\u0458\u0441\u0455.a_bsm2("round", round(float ), (float)f));
    }

    public static /* synthetic */ float ho\u0440\u0455hs(float f, float f2, float f3) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (f3 < 0.0f) {
            f3 += 360.0f;
        }
        if (f3 >= 360.0f) {
            f3 -= 360.0f;
        }
        if (f3 < 60.0f) {
            return f + (f2 - f) * f3 / 60.0f;
        }
        if (f3 < 180.0f) {
            return f2;
        }
        if (f3 < 240.0f) {
            return f + (f2 - f) * (240.0f - f3) / 60.0f;
        }
        return f;
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

