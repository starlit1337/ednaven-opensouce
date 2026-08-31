/*
 * Decompiled with CFR 0.152.
 */
package x\u0445so\u0456;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import x\u0445so\u0456.\u0430\u0435s;

public class i\u0430\u0455\u0455pi\u0430 {
    private /* synthetic */ \u0430\u0435s jx\u0455\u043ec;
    private /* synthetic */ long o\u0440\u0456hho;
    private /* synthetic */ long \u0440\u043e\u0458\u0455;
    private /* synthetic */ long \u0455\u0430\u0440\u043e\u0435\u0455a;
    private /* synthetic */ double \u0435\u0435oh;
    private /* synthetic */ double h\u0430\u0435;
    private /* synthetic */ double h\u0441x\u0456;
    private /* synthetic */ boolean jp\u0440\u04bb;
    private /* synthetic */ boolean ip\u043ee\u043e\u0435;

    public i\u0430\u0455\u0455pi\u0430(\u0430\u0435s \u0430\u0435s2, long l2) {
        if (true | false) {
        }
        this.jx\u0455\u043ec = \u0430\u0435s2;
        this.\u0455\u0430\u0440\u043e\u0435\u0455a = (long)i\u0430\u0455\u0455pi\u0430.a_bsm0("currentTimeMillis", currentTimeMillis());
        this.o\u0440\u0456hho = l2;
    }

    public /* synthetic */ void \u0440\u0458jj\u0435hp(double d) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        this.\u0440\u043e\u0458\u0455 = (long)i\u0430\u0455\u0455pi\u0430.a_bsm0("currentTimeMillis", currentTimeMillis());
        if (this.h\u0430\u0435 != d) {
            this.h\u0430\u0435 = d;
            this.\u0441\u0458e();
        } else {
            boolean bl = this.jp\u0440\u04bb = this.\u0440\u043e\u0458\u0455 - this.o\u0440\u0456hho > this.\u0455\u0430\u0440\u043e\u0435\u0455a;
            if (this.jp\u0440\u04bb) {
                this.h\u0441x\u0456 = d;
                return;
            }
        }
        double d2 = this.jx\u0455\u043ec.getFunction().apply((Double)((Object)i\u0430\u0455\u0455pi\u0430.a_bsm1("valueOf", valueOf(double ), (double)this.\u0445c\u0440es\u0440())));
        this.h\u0441x\u0456 = this.h\u0441x\u0456 > d ? this.\u0435\u0435oh - (this.\u0435\u0435oh - d) * d2 : this.\u0435\u0435oh + (d - this.\u0435\u0435oh) * d2;
    }

    public /* synthetic */ double \u0445c\u0440es\u0440() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return (double)(i\u0430\u0455\u0455pi\u0430.a_bsm0("currentTimeMillis", currentTimeMillis()) - this.\u0455\u0430\u0440\u043e\u0435\u0455a) / (double)this.o\u0440\u0456hho;
    }

    public /* synthetic */ void \u0441\u0458e() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        this.\u0455\u0430\u0440\u043e\u0435\u0455a = (long)i\u0430\u0455\u0455pi\u0430.a_bsm0("currentTimeMillis", currentTimeMillis());
        this.\u0435\u0435oh = this.h\u0441x\u0456;
        this.jp\u0440\u04bb = false;
    }

    public /* synthetic */ \u0430\u0435s \u0445\u0458c\u0440\u0455eh() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return this.jx\u0455\u043ec;
    }

    public /* synthetic */ long as\u0456\u0435ccj() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return this.o\u0440\u0456hho;
    }

    public /* synthetic */ long c\u04bbes\u0458o() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return this.\u0440\u043e\u0458\u0455;
    }

    public /* synthetic */ long sioe() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return this.\u0455\u0430\u0440\u043e\u0435\u0455a;
    }

    public /* synthetic */ double e\u0456\u0456\u0445() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return this.\u0435\u0435oh;
    }

    public /* synthetic */ double \u0445h\u0441s() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return this.h\u0430\u0435;
    }

    public /* synthetic */ double xax\u04bb() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return this.h\u0441x\u0456;
    }

    public /* synthetic */ boolean sxec\u0440\u0456\u0441() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return this.jp\u0440\u04bb;
    }

    public /* synthetic */ boolean cjxco\u0430a() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return this.ip\u043ee\u043e\u0435;
    }

    public /* synthetic */ void oe\u0441oe(\u0430\u0435s \u0430\u0435s2) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        this.jx\u0455\u043ec = \u0430\u0435s2;
    }

    public /* synthetic */ void p\u04bbe\u0441\u0435\u0456(long l2) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        this.o\u0440\u0456hho = l2;
    }

    public /* synthetic */ void \u0458se\u0441x(long l2) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        this.\u0440\u043e\u0458\u0455 = l2;
    }

    public /* synthetic */ void ej\u043eocp(long l2) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        this.\u0455\u0430\u0440\u043e\u0435\u0455a = l2;
    }

    public /* synthetic */ void hch\u0430a\u0456h(double d) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        this.\u0435\u0435oh = d;
    }

    public /* synthetic */ void a\u0456ao\u04bbhi(double d) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        this.h\u0430\u0435 = d;
    }

    public /* synthetic */ void a\u0435i\u0440(double d) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        this.h\u0441x\u0456 = d;
    }

    public /* synthetic */ void \u043e\u0458\u0440i(boolean bl) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        this.jp\u0440\u04bb = bl;
    }

    public /* synthetic */ void ao\u0445\u0440\u043e(boolean bl) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        this.ip\u043ee\u043e\u0435 = bl;
    }

    private static /* synthetic */ CallSite a_bsm0(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm1(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }
}

