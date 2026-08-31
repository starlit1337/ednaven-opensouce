/*
 * Decompiled with CFR 0.152.
 */
package ie\u0441\u0430ej;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class \u0456oc {
    public /* synthetic */ long \u0455\u0440hi;
    public /* synthetic */ long \u04bb\u0445e\u043eh;
    public /* synthetic */ long xh\u0440;
    private /* synthetic */ long ac\u0458i;

    public /* synthetic */ boolean iai\u0440a\u0455c(double d) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return this.\u0430x\u0456\u0441s((long)(\u0456oc.a_bsm0("nanoTime", nanoTime()) - this.ac\u0458i)) >= (long)(d * 1000.0);
    }

    public /* synthetic */ boolean \u0455\u0441p\u0440e(long l2) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return this.\u0430x\u0456\u0441s((long)(\u0456oc.a_bsm0("nanoTime", nanoTime()) - this.ac\u0458i)) >= l2;
    }

    public /* synthetic */ boolean oc\u0455\u0445(long l2) {
        boolean bl;
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        boolean bl2 = bl = this.\u0430x\u0456\u0441s((long)(\u0456oc.a_bsm0("nanoTime", nanoTime()) - this.ac\u0458i)) >= l2;
        if (bl) {
            this.\u0441\u0458e();
        }
        return bl;
    }

    public /* synthetic */ void ich\u0440(long l2) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        this.ac\u0458i = (long)(\u0456oc.a_bsm0("nanoTime", nanoTime()) - l2 * 1000000L);
    }

    public /* synthetic */ long j\u0441\u0458s\u0458() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return this.\u0430x\u0456\u0441s((long)(\u0456oc.a_bsm0("nanoTime", nanoTime()) - this.ac\u0458i));
    }

    public /* synthetic */ long \u0430x\u0456\u0441s(long l2) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return l2 / 1000000L;
    }

    public /* synthetic */ long j\u0430jx\u043ec() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return this.\u0430x\u0456\u0441s((long)(\u0456oc.a_bsm0("nanoTime", nanoTime()) - this.ac\u0458i));
    }

    public /* synthetic */ boolean \u0430\u0456shhpx(long l2, boolean bl) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (\u0456oc.a_bsm1("currentTimeMillis", currentTimeMillis()) - this.\u04bb\u0445e\u043eh > l2) {
            if (bl) {
                this.\u0441\u0458e();
            }
            return true;
        }
        return false;
    }

    public \u0456oc() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        this.\u04bb\u0445e\u043eh = (long)\u0456oc.a_bsm1("currentTimeMillis", currentTimeMillis());
        this.\u0441\u0458e();
    }

    public /* synthetic */ long \u0458\u0430h\u04bb\u0456\u0456\u0440() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return (long)(\u0456oc.a_bsm1("currentTimeMillis", currentTimeMillis()) - this.\u04bb\u0445e\u043eh);
    }

    public /* synthetic */ boolean \u0445\u0430a\u0458\u0435\u0455a(long l2) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return \u0456oc.a_bsm1("currentTimeMillis", currentTimeMillis()) - l2 >= this.\u0455\u0440hi;
    }

    public /* synthetic */ boolean VICUMBquqE(long l2) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return \u0456oc.a_bsm2("max", max(long long ), (long)0L, (long)(\u0456oc.a_bsm1("currentTimeMillis", currentTimeMillis()) - this.\u04bb\u0445e\u043eh)) >= l2;
    }

    public /* synthetic */ boolean aie\u04bb\u043ea(float f) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return (float)(\u0456oc.a_bsm1("currentTimeMillis", currentTimeMillis()) - this.\u04bb\u0445e\u043eh) >= f;
    }

    public /* synthetic */ void \u0441\u0458e() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        this.xh\u0440 = this.\u0441\u0441p();
        this.\u04bb\u0445e\u043eh = (long)\u0456oc.a_bsm1("currentTimeMillis", currentTimeMillis());
        this.\u0455\u0440hi = (long)\u0456oc.a_bsm1("currentTimeMillis", currentTimeMillis());
        this.ac\u0458i = (long)\u0456oc.a_bsm0("nanoTime", nanoTime());
    }

    public /* synthetic */ boolean \u0455\u0441\u04bb(long l2) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return \u0456oc.a_bsm1("currentTimeMillis", currentTimeMillis()) - this.\u04bb\u0445e\u043eh > l2;
    }

    public /* synthetic */ boolean c\u0455a\u0445(double d) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return (double)(\u0456oc.a_bsm1("currentTimeMillis", currentTimeMillis()) - this.\u04bb\u0445e\u043eh) >= d;
    }

    public /* synthetic */ void \u0458jccjs(long l2) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        this.\u04bb\u0445e\u043eh = l2;
    }

    public /* synthetic */ long hh\u043e\u0441() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return (long)(\u0456oc.a_bsm1("currentTimeMillis", currentTimeMillis()) - this.\u0455\u0440hi);
    }

    public /* synthetic */ boolean \u04bb\u0455\u0458(double d) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return (double)(this.\u0441\u0441p() - this.xh\u0440) >= d;
    }

    public /* synthetic */ long \u0441\u0441p() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return (long)(\u0456oc.a_bsm0("nanoTime", nanoTime()) / 1000000L);
    }

    public /* synthetic */ void \u0458se\u0441x(long l2) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        this.\u0455\u0440hi = l2;
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

