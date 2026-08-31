/*
 * Decompiled with CFR 0.152.
 */
package \u0441j\u0455\u0440;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Iterator;
import net.minecraft.class_1293;
import net.minecraft.class_1294;
import net.minecraft.class_1297;
import net.minecraft.class_1922;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_265;
import net.minecraft.class_310;
import net.minecraft.class_3726;
import net.minecraft.class_746;
import \u0441j\u0455\u0440.o\u0445pj;

public class o\u0440\u0455\u0441\u0456 {
    private final /* synthetic */ class_746 \u0435\u0430\u0435\u0430;
    private final /* synthetic */ double \u0456\u0455e\u0440x\u0445;
    private final /* synthetic */ double s\u0441c;
    private final /* synthetic */ double \u0455j\u0430\u04bbhep;
    private final /* synthetic */ double ex\u043eh\u043ea\u04bb;
    private final /* synthetic */ double sxio;
    private final /* synthetic */ double \u04bbep\u0456\u0441;
    private final /* synthetic */ class_310 \u0430c\u043e\u0458\u0435;

    public o\u0440\u0455\u0441\u0456(class_746 class_7462, double d, double d2, double d3, double d4, double d5, double d6) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        this.\u0430c\u043e\u0458\u0435 = o\u0440\u0455\u0441\u0456.a_bsm0("method_1551", method_1551());
        this.\u0435\u0430\u0435\u0430 = class_7462;
        this.\u0456\u0455e\u0440x\u0445 = d;
        this.s\u0441c = d2;
        this.\u0455j\u0430\u04bbhep = d3;
        this.ex\u043eh\u043ea\u04bb = d4;
        this.sxio = d5;
        this.\u04bbep\u0456\u0441 = d6;
    }

    public static /* synthetic */ o\u0440\u0455\u0441\u0456 xi\u0458i\u0435es(class_746 class_7462) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return new o\u0440\u0455\u0441\u0456(class_7462, class_7462.method_23317(), class_7462.method_23318(), class_7462.method_23321(), class_7462.method_18798().field_1352, class_7462.method_18798().field_1351, class_7462.method_18798().field_1350);
    }

    public /* synthetic */ class_243 hhs(int n) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if (this.\u0430c\u043e\u0458\u0435.field_1687 == null) {
            return class_243.field_1353;
        }
        double d = this.\u0456\u0455e\u0440x\u0445;
        double d2 = this.s\u0441c;
        double d3 = this.\u0455j\u0430\u04bbhep;
        double d4 = this.ex\u043eh\u043ea\u04bb;
        double d5 = this.sxio;
        double d6 = this.\u04bbep\u0456\u0441;
        float f = this.\u0435\u0430\u0435\u0430.field_3913.field_3907;
        float f2 = this.\u0435\u0430\u0435\u0430.field_3913.field_3905;
        float f3 = this.\u0435\u0430\u0435\u0430.method_36454();
        boolean bl = this.\u0435\u0430\u0435\u0430.method_5624();
        for (int i = 0; i < n; ++i) {
            if (this.\u0435\u0430\u0435\u0430.method_6128()) {
                class_243 class_2432 = this.o\u0455i\u0430hp\u0440(d4, d5, d6, i);
                d += class_2432.field_1352;
                d2 += class_2432.field_1351;
                d3 += class_2432.field_1350;
                d4 = class_2432.field_1352 * 0.99;
                d5 = class_2432.field_1351 * 0.98;
                d6 = class_2432.field_1350 * 0.99;
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
                continue;
            }
            if (f2 != 0.0f || f != 0.0f) {
                float f4 = bl ? 0.026f : 0.02f;
                class_243 class_2433 = this.aex\u0455\u0456(new class_243((double)f, 0.0, (double)f2), f4, f3);
                d4 += class_2433.field_1352;
                d6 += class_2433.field_1350;
            }
            d += d4;
            d2 += d5;
            d3 += d6;
            double d7 = d5 <= 0.0 && this.ae\u0430h(i) ? 0.01 : 0.08;
            d4 *= 0.91;
            d5 = (d5 - d7) * 0.98;
            d6 *= 0.91;
        }
        return new class_243(d, d2, d3);
    }

    public /* synthetic */ o\u0445pj \u043e\u0456\u0430(int n) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if (this.\u0430c\u043e\u0458\u0435.field_1687 == null) {
            return null;
        }
        double d = this.\u0456\u0455e\u0440x\u0445;
        double d2 = this.s\u0441c;
        double d3 = this.\u0455j\u0430\u04bbhep;
        double d4 = this.ex\u043eh\u043ea\u04bb;
        double d5 = this.sxio;
        double d6 = this.\u04bbep\u0456\u0441;
        float f = this.\u0435\u0430\u0435\u0430.field_3913.field_3907;
        float f2 = this.\u0435\u0430\u0435\u0430.field_3913.field_3905;
        float f3 = this.\u0435\u0430\u0435\u0430.method_36454();
        boolean bl = this.\u0435\u0430\u0435\u0430.method_5624();
        int n2 = 0;
        for (int i = 0; i < n; ++i) {
            class_243 class_2432;
            if (this.\u0435\u0430\u0435\u0430.method_6128()) {
                class_2432 = this.o\u0455i\u0430hp\u0440(d4, d5, d6, n2);
            } else {
                if (f2 != 0.0f || f != 0.0f) {
                    float f4 = bl ? 0.026f : 0.02f;
                    class_243 class_2433 = this.aex\u0455\u0456(new class_243((double)f, 0.0, (double)f2), f4, f3);
                    d4 += class_2433.field_1352;
                    d6 += class_2433.field_1350;
                }
                class_2432 = new class_243(d4, d5, d6);
            }
            double d7 = d + class_2432.field_1352;
            double d8 = d2 + class_2432.field_1351;
            double d9 = d3 + class_2432.field_1350;
            o\u0445pj o\u0445pj2 = this.sj\u0441hx(d, d2, d3, d7, d8, d9, n2);
            if (o\u0445pj2 != null) {
                return o\u0445pj2;
            }
            d = d7;
            d2 = d8;
            d3 = d9;
            if (this.\u0435\u0430\u0435\u0430.method_6128()) {
                d4 = class_2432.field_1352 * 0.99;
                d5 = class_2432.field_1351 * 0.98;
                d6 = class_2432.field_1350 * 0.99;
            } else {
                double d10 = d5 <= 0.0 && this.ae\u0430h(n2) ? 0.01 : 0.08;
                d4 *= 0.91;
                d5 = (d5 - d10) * 0.98;
                d6 *= 0.91;
            }
            ++n2;
        }
        return null;
    }

    private /* synthetic */ o\u0445pj sj\u0441hx(double d, double d2, double d3, double d4, double d5, double d6, int n) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if (this.\u0430c\u043e\u0458\u0435.field_1687 == null || d5 >= d2) {
            return null;
        }
        double d7 = (double)this.\u0435\u0430\u0435\u0430.method_17681() / 2.0;
        class_238 class_2383 = new class_238((double)(o\u0440\u0455\u0441\u0456.a_bsm1("min", min(double double ), (double)d, (double)d4) - d7), d5 - 1.0E-4, (double)(o\u0440\u0455\u0441\u0456.a_bsm1("min", min(double double ), (double)d3, (double)d6) - d7), (double)(o\u0440\u0455\u0441\u0456.a_bsm2("max", max(double double ), (double)d, (double)d4) + d7), d2 + 1.0E-4, (double)(o\u0440\u0455\u0441\u0456.a_bsm2("max", max(double double ), (double)d3, (double)d6) + d7));
        class_2338 class_23382 = null;
        double d8 = 0.0;
        Object object = Double.MAX_VALUE;
        Object object2 = 0.0;
        Object object3 = Double.MAX_VALUE;
        Iterator iterator = o\u0440\u0455\u0441\u0456.a_bsm4("method_10094", method_10094(int int int int int int ), (int)o\u0440\u0455\u0441\u0456.a_bsm3("method_15357", method_15357(double ), (double)class_2383.field_1323), (int)o\u0440\u0455\u0441\u0456.a_bsm3("method_15357", method_15357(double ), (double)class_2383.field_1322), (int)o\u0440\u0455\u0441\u0456.a_bsm3("method_15357", method_15357(double ), (double)class_2383.field_1321), (int)o\u0440\u0455\u0441\u0456.a_bsm3("method_15357", method_15357(double ), (double)class_2383.field_1320), (int)o\u0440\u0455\u0441\u0456.a_bsm3("method_15357", method_15357(double ), (double)class_2383.field_1325), (int)o\u0440\u0455\u0441\u0456.a_bsm3("method_15357", method_15357(double ), (double)class_2383.field_1324)).iterator();
        while (iterator.hasNext()) {
            class_2338 class_23383 = (class_2338)iterator.next();
            class_265 class_2652 = this.\u0430c\u043e\u0458\u0435.field_1687.method_8320(class_23383).method_26194((class_1922)this.\u0430c\u043e\u0458\u0435.field_1687, class_23383, (class_3726)o\u0440\u0455\u0441\u0456.a_bsm5("method_16195", method_16195(net.minecraft.class_1297 ), (class_1297)this.\u0435\u0430\u0435\u0430));
            block5: for (class_238 class_2384 : class_2652.method_1090()) {
                boolean bl;
                class_238 class_2385 = class_2384.method_996(class_23383);
                if (class_2385.field_1325 > d2 + 1.0E-4) continue;
                if (class_2385.field_1325 < d5 - 1.0E-4) {
                    switch (0) {
                        default: {
                            continue block5;
                        }
                        case 1: {
                            continue block5;
                        }
                        case 2: 
                    }
                    continue;
                }
                CallSite callSite = o\u0440\u0455\u0441\u0456.a_bsm6("method_15350", method_15350(double double double ), (double)((d2 - class_2385.field_1325) / (d2 - d5)), (double)0.0, (double)1.0);
                CallSite callSite2 = o\u0440\u0455\u0441\u0456.a_bsm7("method_16436", method_16436(double double double ), (double)callSite, (double)d, (double)d4);
                CallSite callSite3 = o\u0440\u0455\u0441\u0456.a_bsm7("method_16436", method_16436(double double double ), (double)callSite, (double)d3, (double)d6);
                reference var38_24 = o\u0440\u0455\u0441\u0456.a_bsm1("min", min(double double ), (double)(callSite2 + d7), (double)class_2385.field_1320) - o\u0440\u0455\u0441\u0456.a_bsm2("max", max(double double ), (double)(callSite2 - d7), (double)class_2385.field_1323);
                reference var40_25 = o\u0440\u0455\u0441\u0456.a_bsm1("min", min(double double ), (double)(callSite3 + d7), (double)class_2385.field_1324) - o\u0440\u0455\u0441\u0456.a_bsm2("max", max(double double ), (double)(callSite3 - d7), (double)class_2385.field_1321);
                reference var42_26 = o\u0440\u0455\u0441\u0456.a_bsm2("max", max(double double ), (double)0.0, (double)var38_24) * o\u0440\u0455\u0441\u0456.a_bsm2("max", max(double double ), (double)0.0, (double)var40_25);
                if (var42_26 <= 1.0E-7) continue;
                double d9 = (class_2385.field_1323 + class_2385.field_1320) * 0.5;
                double d10 = (class_2385.field_1321 + class_2385.field_1324) * 0.5;
                reference var48_29 = o\u0440\u0455\u0441\u0456.a_bsm8("method_33723", method_33723(double ), (double)(callSite2 - d9)) + o\u0440\u0455\u0441\u0456.a_bsm8("method_33723", method_33723(double ), (double)(callSite3 - d10));
                boolean bl2 = callSite < object - 1.0E-7;
                boolean bl3 = bl = o\u0440\u0455\u0441\u0456.a_bsm9("abs", abs(double ), (double)(callSite - object)) <= 1.0E-7;
                if (!bl2 && (!bl || !(var42_26 > object2 + 1.0E-7) && (!(o\u0440\u0455\u0441\u0456.a_bsm9("abs", abs(double ), (double)(var42_26 - object2)) <= 1.0E-7) || !(var48_29 < object3)))) continue;
                class_23382 = new class_2338(class_23383.method_10263(), class_23383.method_10264(), class_23383.method_10260());
                d8 = class_2385.field_1325;
                object = callSite;
                object2 = var42_26;
                object3 = var48_29;
            }
        }
        return class_23382 == null ? null : new o\u0445pj(class_23382, n, d8);
    }

    private /* synthetic */ class_243 o\u0455i\u0430hp\u0440(double d, double d2, double d3, int n) {
        Object object;
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        double d4 = d2 <= 0.0 && this.ae\u0430h(n) ? 0.01 : 0.08;
        class_243 class_2432 = this.\u0435\u0430\u0435\u0430.method_5720();
        float f = this.\u0435\u0430\u0435\u0430.method_36455() * ((float)Math.PI / 180);
        CallSite callSite = o\u0440\u0455\u0441\u0456.a_bsm10("sqrt", sqrt(double ), (double)(class_2432.field_1352 * class_2432.field_1352 + class_2432.field_1350 * class_2432.field_1350));
        CallSite callSite2 = o\u0440\u0455\u0441\u0456.a_bsm10("sqrt", sqrt(double ), (double)(d * d + d3 * d3));
        Object object2 = o\u0440\u0455\u0441\u0456.a_bsm11("method_15362", method_15362(float ), (float)f);
        object2 = (float)((double)(object2 * object2) * o\u0440\u0455\u0441\u0456.a_bsm1("min", min(double double ), (double)(class_2432.method_1033() / 0.4), (double)1.0));
        class_243 class_2433 = new class_243(d, d2, d3).method_1031(0.0, d4 * (-1.0 + (double)object2 * 0.75), 0.0);
        if (class_2433.field_1351 < 0.0 && callSite > 0.0) {
            object = class_2433.field_1351 * -0.1 * (double)object2;
            class_2433 = class_2433.method_1031(class_2432.field_1352 * object / callSite, object, class_2432.field_1350 * object / callSite);
        }
        if (f < 0.0f && callSite > 0.0) {
            object = callSite2 * (double)(-o\u0440\u0455\u0441\u0456.a_bsm12("method_15374", method_15374(float ), (float)f)) * 0.04;
            class_2433 = class_2433.method_1031(-class_2432.field_1352 * object / callSite, object * 3.2, -class_2432.field_1350 * object / callSite);
        }
        if (callSite > 0.0) {
            class_2433 = class_2433.method_1031((class_2432.field_1352 / callSite * callSite2 - class_2433.field_1352) * 0.1, 0.0, (class_2432.field_1350 / callSite * callSite2 - class_2433.field_1350) * 0.1);
        }
        return class_2433;
    }

    private /* synthetic */ class_243 aex\u0455\u0456(class_243 class_2432, float f, float f2) {
        class_243 class_2433;
        double d;
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        if ((d = class_2432.method_1027()) < 1.0E-7) {
            return class_243.field_1353;
        }
        if (d > 1.0) {
            class_2433 = class_2432.method_1029();
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
            class_2433 = class_2432;
        }
        class_243 class_2434 = class_2433.method_1021((double)f);
        CallSite callSite = o\u0440\u0455\u0441\u0456.a_bsm12("method_15374", method_15374(float ), (float)(f2 * ((float)Math.PI / 180)));
        CallSite callSite2 = o\u0440\u0455\u0441\u0456.a_bsm11("method_15362", method_15362(float ), (float)(f2 * ((float)Math.PI / 180)));
        return new class_243(class_2434.field_1352 * (double)callSite2 - class_2434.field_1350 * (double)callSite, class_2434.field_1351, class_2434.field_1350 * (double)callSite2 + class_2434.field_1352 * (double)callSite);
    }

    private /* synthetic */ boolean ae\u0430h(int n) {
        class_1293 class_12932;
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return (class_12932 = this.\u0435\u0430\u0435\u0430.method_6112(class_1294.field_5906)) != null && class_12932.method_5584() > n;
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

    private static /* synthetic */ CallSite a_bsm4(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm5(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm6(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm7(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm8(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm9(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm10(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm11(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm12(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }
}

