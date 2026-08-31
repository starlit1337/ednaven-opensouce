/*
 * Decompiled with CFR 0.152.
 */
package \u0440\u04bbe;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class \u04bbja {
    private \u04bbja() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
    }

    public static /* synthetic */ int \u0458is\u0440cai(double d) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if (d < 0.0) {
            return -1;
        }
        if (d == 0.0) {
            return 0;
        }
        return 1;
    }

    public static /* synthetic */ double \u0435h\u0458\u0455\u043ecc(double d, double d2, double d3) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return (1.0 - d3) * d + d3 * d2;
    }

    public static /* synthetic */ int ep\u04bb\u0441\u0435x(int n, int n2, int n3) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (n3 < n) {
            return n;
        }
        if (n3 > n2) {
            return n2;
        }
        return n3;
    }

    public static /* synthetic */ double \u0430\u0456\u0455(double d, double d2, double d3) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        if (d3 < d) {
            return d;
        }
        if (d3 > d2) {
            return d2;
        }
        return d3;
    }

    public static /* synthetic */ int \u0458x\u0445\u0456\u0441\u043ei(int n) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if ((n %= -593078249 + 593078609) < 0) {
            n += -327637866 + 327638226;
        }
        return n;
    }

    public static /* synthetic */ double a\u04bbj\u043e\u043ec(double d) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        if ((d %= 360.0) < 0.0) {
            d += 360.0;
        }
        return d;
    }

    public static /* synthetic */ double o\u0458aah(double d, double d2) {
        double d3;
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return (d3 = \u04bbja.a\u04bbj\u043e\u043ec(d2 - d)) <= 180.0 ? 1.0 : -1.0;
    }

    public static /* synthetic */ double cx\u0435j(double d, double d2) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return 180.0 - \u04bbja.a_bsm0("abs", abs(double ), (double)(\u04bbja.a_bsm0("abs", abs(double ), (double)(d - d2)) - 180.0));
    }

    public static /* synthetic */ double[] \u0435\u0440h(double[] dArray, double[][] dArray2) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        double d = dArray[0] * dArray2[0][0] + dArray[1] * dArray2[0][1] + dArray[2] * dArray2[0][2];
        double d2 = dArray[0] * dArray2[1][0] + dArray[1] * dArray2[1][1] + dArray[2] * dArray2[1][2];
        double d3 = dArray[0] * dArray2[2][0] + dArray[1] * dArray2[2][1] + dArray[2] * dArray2[2][2];
        return new double[]{d, d2, d3};
    }

    private static /* synthetic */ CallSite a_bsm0(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }
}

