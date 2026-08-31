/*
 * Decompiled with CFR 0.152.
 */
package \u04bb\u04bb\u0456\u0445;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import \u04bb\u04bb\u0456\u0445.\u04bb\u0441\u0456\u0440o;

public final class xoh {
    public static final /* synthetic */ xoh \u04bbc\u043epsh;
    private final /* synthetic */ double x\u0441p\u0440\u0455;
    private final /* synthetic */ double \u0435\u0456jci;
    private final /* synthetic */ double \u0458\u0455\u0458xe;
    private final /* synthetic */ double \u0455\u0458\u0455\u0440o;
    private final /* synthetic */ double \u043ei\u0458hjjc;
    private final /* synthetic */ double \u04bb\u0458c\u0441h\u04bb;
    private final /* synthetic */ double[] \u0435\u0430\u0455p;
    private final /* synthetic */ double \u0440\u0458\u0458\u043es\u0440;
    private final /* synthetic */ double ac\u0440\u0441o\u0445;
    private final /* synthetic */ double pjpxpe\u04bb;

    public /* synthetic */ double hpo\u0445() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return this.x\u0441p\u0440\u0455;
    }

    public /* synthetic */ double s\u04bb\u0430() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return this.\u04bb\u0458c\u0441h\u04bb;
    }

    public /* synthetic */ double \u0455j\u0441\u0430\u0445() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return this.\u0435\u0456jci;
    }

    /* synthetic */ double \u0455x\u04bb\u0455\u0441\u0458() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return this.\u0458\u0455\u0458xe;
    }

    /* synthetic */ double \u0445\u0441\u0456() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return this.\u0455\u0458\u0455\u0440o;
    }

    /* synthetic */ double \u0430p\u043eci() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return this.\u043ei\u0458hjjc;
    }

    public /* synthetic */ double[] \u0435js\u04bb() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return this.\u0435\u0430\u0455p;
    }

    /* synthetic */ double p\u0435ea() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return this.\u0440\u0458\u0458\u043es\u0440;
    }

    public /* synthetic */ double sc\u0435\u0440() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return this.ac\u0440\u0441o\u0445;
    }

    /* synthetic */ double \u0440\u0456\u0441\u0445\u043e\u04bbo() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return this.pjpxpe\u04bb;
    }

    public static /* synthetic */ xoh \u0441\u043e\u0445\u0440cp\u0430(double[] dArray, double d, double object, double d2, boolean bl) {
        double d3;
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        object = xoh.a_bsm0("max", max(double double ), (double)0.1, (double)object);
        double[][] dArray2 = \u04bb\u0441\u0456\u0440o.\u0458\u0441\u0445\u0440;
        double[] dArray3 = dArray;
        double d4 = dArray3[0] * dArray2[0][0] + dArray3[1] * dArray2[0][1] + dArray3[2] * dArray2[0][2];
        double d5 = dArray3[0] * dArray2[1][0] + dArray3[1] * dArray2[1][1] + dArray3[2] * dArray2[1][2];
        double d6 = dArray3[0] * dArray2[2][0] + dArray3[1] * dArray2[2][1] + dArray3[2] * dArray2[2][2];
        double d7 = 0.8 + d2 / 10.0;
        CallSite callSite = d7 >= 0.9 ? xoh.a_bsm1("\u0435h\u0458\u0455\u043ecc", \u0435h\u0458\u0455\u043ecc(double double double ), (double)0.59, (double)0.69, (double)((d7 - 0.9) * 10.0)) : xoh.a_bsm1("\u0435h\u0458\u0455\u043ecc", \u0435h\u0458\u0455\u043ecc(double double double ), (double)0.525, (double)0.59, (double)((d7 - 0.8) * 10.0));
        Object object2 = bl ? 1.0 : d7 * (1.0 - 0.2777777777777778 * xoh.a_bsm2("exp", exp(double ), (double)((-d - 42.0) / 92.0)));
        object2 = xoh.a_bsm3("\u0430\u0456\u0455", \u0430\u0456\u0455(double double double ), (double)0.0, (double)1.0, (double)object2);
        double d8 = d7;
        double[] dArray4 = new double[]{object2 * (100.0 / d4) + 1.0 - object2, object2 * (100.0 / d5) + 1.0 - object2, object2 * (100.0 / d6) + 1.0 - object2};
        double d9 = 1.0 / (5.0 * d + 1.0);
        double d10 = d9 * d9 * d9 * d9;
        double d11 = 1.0 - d10;
        double d12 = d10 * d + 0.1 * d11 * d11 * xoh.a_bsm4("cbrt", cbrt(double ), (double)(5.0 * d));
        reference var33_19 = xoh.a_bsm5("ox\u0435oo\u0455", ox\u0435oo\u0455(double ), (double)object) / dArray[1];
        double d13 = 1.48 + xoh.a_bsm6("sqrt", sqrt(double ), (double)var33_19);
        double d14 = d3 = 0.725 / xoh.a_bsm7("pow", pow(double double ), (double)var33_19, (double)0.2);
        double[] dArray5 = new double[]{(double)xoh.a_bsm7("pow", pow(double double ), (double)(d12 * dArray4[0] * d4 / 100.0), (double)0.42), (double)xoh.a_bsm7("pow", pow(double double ), (double)(d12 * dArray4[1] * d5 / 100.0), (double)0.42), (double)xoh.a_bsm7("pow", pow(double double ), (double)(d12 * dArray4[2] * d6 / 100.0), (double)0.42)};
        double[] dArray6 = new double[]{400.0 * dArray5[0] / (dArray5[0] + 27.13), 400.0 * dArray5[1] / (dArray5[1] + 27.13), 400.0 * dArray5[2] / (dArray5[2] + 27.13)};
        double d15 = (2.0 * dArray6[0] + dArray6[1] + 0.05 * dArray6[2]) * d3;
        return new xoh((double)var33_19, d15, d3, d14, (double)callSite, d8, dArray4, d12, (double)xoh.a_bsm7("pow", pow(double double ), (double)d12, (double)0.25), d13);
    }

    public static /* synthetic */ xoh \u0440\u0458\u0456\u043e\u0455(double d) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return xoh.\u0441\u043e\u0445\u0440cp\u0430((double[])xoh.a_bsm8("ss\u0445h\u0456\u0435", ss\u0445h\u0456\u0435()), 63.66197723675813 * xoh.a_bsm5("ox\u0435oo\u0455", ox\u0435oo\u0455(double ), (double)50.0) / 100.0, d, 2.0, false);
    }

    private xoh(double d, double d2, double d3, double d4, double d5, double d6, double[] dArray, double d7, double d8, double d9) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        this.\u04bb\u0458c\u0441h\u04bb = d;
        this.x\u0441p\u0440\u0455 = d2;
        this.\u0435\u0456jci = d3;
        this.\u0458\u0455\u0458xe = d4;
        this.\u0455\u0458\u0455\u0440o = d5;
        this.\u043ei\u0458hjjc = d6;
        this.\u0435\u0430\u0455p = dArray;
        this.\u0440\u0458\u0458\u043es\u0440 = d7;
        this.ac\u0440\u0441o\u0445 = d8;
        this.pjpxpe\u04bb = d9;
    }

    static {
        \u04bbc\u043epsh = xoh.\u0440\u0458\u0456\u043e\u0455(50.0);
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
}

