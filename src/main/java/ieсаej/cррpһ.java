/*
 * Decompiled with CFR 0.152.
 */
package ie\u0441\u0430ej;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class c\u0440\u0440p\u04bb {
    public /* synthetic */ double \u0435s\u04bb;
    public /* synthetic */ double \u0445hh\u043e;
    public /* synthetic */ double \u0455s\u0430j\u0445ch;

    public c\u0440\u0440p\u04bb(double d, double d2, double d3) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        this.\u0435s\u04bb = d;
        this.\u0445hh\u043e = d2;
        this.\u0455s\u0430j\u0445ch = d3;
    }

    public /* synthetic */ c\u0440\u0440p\u04bb j\u0458\u0456\u0455hx\u0441(double d, double d2, double d3) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return new c\u0440\u0440p\u04bb(this.\u0435s\u04bb + d, this.\u0445hh\u043e + d2, this.\u0455s\u0430j\u0445ch + d3);
    }

    public /* synthetic */ c\u0440\u0440p\u04bb \u0440\u0430a\u0455\u0455(c\u0440\u0440p\u04bb c\u0440\u0440p\u04bb2) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return this.j\u0458\u0456\u0455hx\u0441(c\u0440\u0440p\u04bb2.\u0435s\u04bb, c\u0440\u0440p\u04bb2.\u0445hh\u043e, c\u0440\u0440p\u04bb2.\u0455s\u0430j\u0445ch);
    }

    public /* synthetic */ double j\u0456\u0441cc\u04bbs() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return (double)c\u0440\u0440p\u04bb.a_bsm0("sqrt", sqrt(double ), (double)(this.\u0435s\u04bb * this.\u0435s\u04bb + this.\u0445hh\u043e * this.\u0445hh\u043e + this.\u0455s\u0430j\u0445ch * this.\u0455s\u0430j\u0445ch));
    }

    public /* synthetic */ c\u0440\u0440p\u04bb \u0445\u0455\u0430\u0430\u0435\u0441(double d) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return new c\u0440\u0440p\u04bb(this.\u0435s\u04bb * d, this.\u0445hh\u043e * d, this.\u0455s\u0430j\u0445ch * d);
    }

    public /* synthetic */ double sep\u0430\u0441\u0435(c\u0440\u0440p\u04bb c\u0440\u0440p\u04bb2) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return (double)c\u0440\u0440p\u04bb.a_bsm0("sqrt", sqrt(double ), (double)(c\u0440\u0440p\u04bb.a_bsm1("pow", pow(double double ), (double)(c\u0440\u0440p\u04bb2.\u0435s\u04bb - this.\u0435s\u04bb), (double)2.0) + c\u0440\u0440p\u04bb.a_bsm1("pow", pow(double double ), (double)(c\u0440\u0440p\u04bb2.\u0445hh\u043e - this.\u0445hh\u043e), (double)2.0) + c\u0440\u0440p\u04bb.a_bsm1("pow", pow(double double ), (double)(c\u0440\u0440p\u04bb2.\u0455s\u0430j\u0445ch - this.\u0455s\u0430j\u0445ch), (double)2.0)));
    }

    public /* synthetic */ boolean equals(Object object) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (!(object instanceof c\u0440\u0440p\u04bb)) {
            return false;
        }
        c\u0440\u0440p\u04bb c\u0440\u0440p\u04bb2 = (c\u0440\u0440p\u04bb)object;
        return c\u0440\u0440p\u04bb.a_bsm2("floor", floor(double ), (double)this.\u0435s\u04bb) == c\u0440\u0440p\u04bb.a_bsm2("floor", floor(double ), (double)c\u0440\u0440p\u04bb2.\u0435s\u04bb) && c\u0440\u0440p\u04bb.a_bsm2("floor", floor(double ), (double)this.\u0445hh\u043e) == c\u0440\u0440p\u04bb.a_bsm2("floor", floor(double ), (double)c\u0440\u0440p\u04bb2.\u0445hh\u043e) && c\u0440\u0440p\u04bb.a_bsm2("floor", floor(double ), (double)this.\u0455s\u0430j\u0445ch) == c\u0440\u0440p\u04bb.a_bsm2("floor", floor(double ), (double)c\u0440\u0440p\u04bb2.\u0455s\u0430j\u0445ch);
    }

    public /* synthetic */ double a\u0458ea\u0440c\u0441() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return this.\u0435s\u04bb;
    }

    public /* synthetic */ double i\u0440x\u0435\u0430hj() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return this.\u0445hh\u043e;
    }

    public /* synthetic */ double \u0440\u0456\u0441\u0445\u043e\u04bbo() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return this.\u0455s\u0430j\u0445ch;
    }

    public /* synthetic */ void \u0430j\u0456\u043e\u0441\u0441(double d) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        this.\u0435s\u04bb = d;
    }

    public /* synthetic */ void \u0458pj\u0455hj\u0435(double d) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        this.\u0445hh\u043e = d;
    }

    public /* synthetic */ void rmIPIAkMd(double d) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        this.\u0455s\u0430j\u0445ch = d;
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

