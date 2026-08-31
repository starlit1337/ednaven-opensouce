/*
 * Decompiled with CFR 0.152.
 */
package \u0430cp;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import \u0430cp.\u0430xaih;

public final class \u0456\u0456o\u0445
implements \u0430xaih {
    public \u0456\u0456o\u0445() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
    }

    @Override
    public /* synthetic */ double[] fromInt(int n) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        CallSite callSite = \u0456\u0456o\u0445.a_bsm0("e\u0445a", e\u0445a(int ), (int)n);
        return new double[]{(double)callSite[0], (double)callSite[1], (double)callSite[2]};
    }

    @Override
    public /* synthetic */ int toInt(double[] dArray) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return (int)\u0456\u0456o\u0445.a_bsm1("s\u0455x", s\u0455x(double double double ), (double)dArray[0], (double)dArray[1], (double)dArray[2]);
    }

    @Override
    public /* synthetic */ double distance(double[] dArray, double[] dArray2) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        double d = dArray[0] - dArray2[0];
        double d2 = dArray[1] - dArray2[1];
        double d3 = dArray[2] - dArray2[2];
        return d * d + d2 * d2 + d3 * d3;
    }

    private static /* synthetic */ CallSite a_bsm0(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm1(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }
}

