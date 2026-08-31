/*
 * Decompiled with CFR 0.152.
 */
package oe\u043eo\u043ej;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import x\u0445so\u0456.i\u0430\u0455\u0455pi\u0430;
import x\u0445so\u0456.\u0430\u0435s;
import \u0430\u043e\u0445p\u0456.isj\u0440\u0455\u04bb;

public class \u0458ip
extends isj\u0440\u0455\u04bb {
    private final /* synthetic */ Runnable sap\u0440;
    private final /* synthetic */ i\u0430\u0455\u0455pi\u0430 \u0456ia\u0435co;
    private final /* synthetic */ i\u0430\u0455\u0455pi\u0430 e\u0458\u0440e\u0445\u0430;

    public \u0458ip(double d, double d2, double d3, double d4, Runnable runnable) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        super(d, d2, d3, d4);
        this.\u0456ia\u0435co = new i\u0430\u0455\u0455pi\u0430(\u0430\u0435s.a\u0455sc, 500L);
        this.e\u0458\u0440e\u0445\u0430 = new i\u0430\u0455\u0455pi\u0430(\u0430\u0435s.s\u043eec\u0455e\u0440, 250L);
        this.sap\u0440 = runnable;
    }

    public /* synthetic */ void draw(int n, int n2, float f) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        this.e\u0458\u0440e\u0445\u0430.\u0440\u0458jj\u0435hp(\u0458ip.a_bsm0("\u0441\u0435a\u043ex", \u0441\u0435a\u043ex(double double double double int int ), (double)this.a\u0458ea\u0440c\u0441(), (double)this.i\u0440x\u0435\u0430hj(), (double)this.p\u0435\u0455(), (double)this.\u0455j\u0430\u0440\u0455(), (int)n, (int)n2) != false ? 80.0 : 45.0);
    }

    public /* synthetic */ void ic\u0430() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        this.sap\u0440.run();
    }

    public /* synthetic */ i\u0430\u0455\u0455pi\u0430 ei\u0445o\u0430eo() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return this.\u0456ia\u0435co;
    }

    public /* synthetic */ i\u0430\u0455\u0455pi\u0430 \u0435\u0458j() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return this.e\u0458\u0440e\u0445\u0430;
    }

    private static /* synthetic */ CallSite a_bsm0(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }
}

