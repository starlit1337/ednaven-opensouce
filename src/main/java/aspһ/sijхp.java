/*
 * Decompiled with CFR 0.152.
 */
package asp\u04bb;

import asp\u04bb.\u0430phj;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import \u04bb\u04bb\u0456\u0445.\u0435\u043ea\u0440\u0458;

@Deprecated
public final class sij\u0445p {
    public /* synthetic */ \u0430phj \u043e\u0440\u0441;
    public /* synthetic */ \u0430phj \u04bbe\u043ec;
    public /* synthetic */ \u0430phj cc\u0430\u0440i;
    public /* synthetic */ \u0430phj coo;
    public /* synthetic */ \u0430phj \u0440\u04bb\u0441;
    public /* synthetic */ \u0430phj s\u0445\u0455\u0445a;

    @Deprecated
    public static sij\u0445p p\u0456h\u04bbshp(int n) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return new sij\u0445p(n, false);
    }

    @Deprecated
    public static sij\u0445p \u0441p\u0440(int n) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return new sij\u0445p(n, true);
    }

    private sij\u0445p(int n, boolean bl) {
        if (true | false) {
        }
        CallSite callSite = sij\u0445p.a_bsm0("h\u043ec\u0430\u043eo", h\u043ec\u0430\u043eo(int ), (int)n);
        double d = ((\u0435\u043ea\u0440\u0458)((Object)callSite)).\u0440os\u043eo();
        double d2 = ((\u0435\u043ea\u0440\u0458)((Object)callSite)).\u04bbeis\u0430();
        if (bl) {
            this.\u043e\u0440\u0441 = sij\u0445p.a_bsm1("oipa\u0455j", oipa\u0455j(double double ), (double)d, (double)d2);
            this.\u04bbe\u043ec = sij\u0445p.a_bsm1("oipa\u0455j", oipa\u0455j(double double ), (double)d, (double)(d2 / 3.0));
            this.cc\u0430\u0440i = sij\u0445p.a_bsm1("oipa\u0455j", oipa\u0455j(double double ), (double)(d + 60.0), (double)(d2 / 2.0));
            this.coo = sij\u0445p.a_bsm1("oipa\u0455j", oipa\u0455j(double double ), (double)d, (double)sij\u0445p.a_bsm2("min", min(double double ), (double)(d2 / 12.0), (double)4.0));
            this.\u0440\u04bb\u0441 = sij\u0445p.a_bsm1("oipa\u0455j", oipa\u0455j(double double ), (double)d, (double)sij\u0445p.a_bsm2("min", min(double double ), (double)(d2 / 6.0), (double)8.0));
        } else {
            this.\u043e\u0440\u0441 = sij\u0445p.a_bsm1("oipa\u0455j", oipa\u0455j(double double ), (double)d, (double)sij\u0445p.a_bsm3("max", max(double double ), (double)48.0, (double)d2));
            this.\u04bbe\u043ec = sij\u0445p.a_bsm1("oipa\u0455j", oipa\u0455j(double double ), (double)d, (double)16.0);
            this.cc\u0430\u0440i = sij\u0445p.a_bsm1("oipa\u0455j", oipa\u0455j(double double ), (double)(d + 60.0), (double)24.0);
            this.coo = sij\u0445p.a_bsm1("oipa\u0455j", oipa\u0455j(double double ), (double)d, (double)4.0);
            this.\u0440\u04bb\u0441 = sij\u0445p.a_bsm1("oipa\u0455j", oipa\u0455j(double double ), (double)d, (double)8.0);
        }
        this.s\u0445\u0455\u0445a = sij\u0445p.a_bsm1("oipa\u0455j", oipa\u0455j(double double ), (double)25.0, (double)84.0);
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

