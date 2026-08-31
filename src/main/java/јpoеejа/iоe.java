/*
 * Decompiled with CFR 0.152.
 */
package \u0458po\u0435ej\u0430;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public final class i\u043ee {
    private final /* synthetic */ double \u0435\u04bbhi;
    private final /* synthetic */ double \u0441e\u0455ija;
    private final /* synthetic */ double e\u0430\u0455ax;
    private final /* synthetic */ double h\u04bbei\u0455hi;

    public i\u043ee(double d, double d2, double d3, double d4) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        this.\u0435\u04bbhi = d;
        this.\u0441e\u0455ija = d2;
        this.e\u0430\u0455ax = d3;
        this.h\u04bbei\u0455hi = d4;
    }

    public /* synthetic */ double \u0456a\u043eo\u04bb\u0445(double d) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if (d <= -1.0) {
            return this.\u0435\u04bbhi;
        }
        if (d < 0.0) {
            return (double)i\u043ee.a_bsm0("\u0435h\u0458\u0455\u043ecc", \u0435h\u0458\u0455\u043ecc(double double double ), (double)this.\u0435\u04bbhi, (double)this.\u0441e\u0455ija, (double)((d - -1.0) / 1.0));
        }
        if (d < 0.5) {
            return (double)i\u043ee.a_bsm0("\u0435h\u0458\u0455\u043ecc", \u0435h\u0458\u0455\u043ecc(double double double ), (double)this.\u0441e\u0455ija, (double)this.e\u0430\u0455ax, (double)((d - 0.0) / 0.5));
        }
        if (d < 1.0) {
            return (double)i\u043ee.a_bsm0("\u0435h\u0458\u0455\u043ecc", \u0435h\u0458\u0455\u043ecc(double double double ), (double)this.e\u0430\u0455ax, (double)this.h\u04bbei\u0455hi, (double)((d - 0.5) / 0.5));
        }
        return this.h\u04bbei\u0455hi;
    }

    private static /* synthetic */ CallSite a_bsm0(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }
}

