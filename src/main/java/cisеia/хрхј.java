/*
 * Decompiled with CFR 0.152.
 */
package cis\u0435ia;

import io.github.humbleui.skija.Font;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import j\u0435a\u0435ca.pj\u0456oj\u0435\u0440;
import oe\u043eo\u043ej.\u0458ip;
import x\u0445so\u0456.i\u0430\u0455\u0455pi\u0430;
import x\u0445so\u0456.\u0430\u0435s;

public class \u0445\u0440\u0445\u0458
extends \u0458ip {
    private static final /* synthetic */ Font \u043e\u0430iei\u0445i;
    private final /* synthetic */ i\u0430\u0455\u0455pi\u0430 scip;
    public /* synthetic */ String c\u0455\u043eos\u0445a;

    public \u0445\u0440\u0445\u0458(double d, double d2, double d3, double d4, Runnable runnable, String string) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        super(d, d2, d3, d4, runnable);
        this.scip = new i\u0430\u0455\u0455pi\u0430(\u0430\u0435s.s\u043eec\u0455e\u0440, 250L);
        this.c\u0455\u043eos\u0445a = string;
    }

    @Override
    public /* synthetic */ void draw(int n, int n2, float f) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        this.scip.\u0440\u0458jj\u0435hp(\u0445\u0440\u0445\u0458.a_bsm0("\u0441\u0435a\u043ex", \u0441\u0435a\u043ex(double double double double int int ), (double)this.a\u0458ea\u0440c\u0441(), (double)this.i\u0440x\u0435\u0430hj(), (double)this.p\u0435\u0455(), (double)this.\u0455j\u0430\u0440\u0455(), (int)n, (int)n2) != false ? 70.0 : 0.0);
        CallSite callSite = \u0445\u0440\u0445\u0458.a_bsm1("withAlpha", withAlpha(java.awt.Color int ), (Color)Color.black, (int)((int)this.scip.xax\u04bb()));
        CallSite callSite2 = \u0445\u0440\u0445\u0458.a_bsm1("withAlpha", withAlpha(java.awt.Color int ), (Color)Color.WHITE, (int)(-1455348866 + 1455349016));
        s\u0430\u04bb\u0458.add(() -> this.\u0435s\u0440j((Color)((Object)callSite), (Color)((Object)callSite2)));
    }

    private /* synthetic */ void \u0435s\u0440j(Color color, Color color2) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        \u0445\u0440\u0445\u0458.a_bsm2("\u0445a\u0440c\u0445h", \u0445a\u0440c\u0445h(float float float float float java.awt.Color ), (float)((float)this.a\u0458ea\u0440c\u0441()), (float)((float)this.i\u0440x\u0435\u0430hj()), (float)((float)this.p\u0435\u0455()), (float)((float)this.\u0455j\u0430\u0440\u0455()), (float)5.0f, (Color)color);
        \u0445\u0440\u0445\u0458.a_bsm3("j\u0455\u0445", j\u0455\u0445(java.lang.String float float java.awt.Color io.github.humbleui.skija.Font ), (String)this.c\u0455\u043eos\u0445a, (float)((float)(this.a\u0458ea\u0440c\u0441() + this.p\u0435\u0455() / 2.0)), (float)((float)(this.i\u0440x\u0435\u0430hj() + this.\u0455j\u0430\u0440\u0455() / 2.0) - \u043e\u0430iei\u0445i.getMetrics().getHeight() / 2.0f + 3.0f), (Color)color2, (Font)\u043e\u0430iei\u0445i);
    }

    static {
        \u043e\u0430iei\u0445i = pj\u0456oj\u0435\u0440.h\u0441eh(8.0f);
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

