/*
 * Decompiled with CFR 0.152.
 */
package \u0440\u0440\u0440;

import ie\u0441\u0430ej.\u0456oc;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import \u0440\u0440\u0440.\u0456\u0435coi;

public abstract class s\u0430\u0441\u0430\u0458\u0445s {
    public /* synthetic */ \u0456oc i\u04bb\u04bbx\u0441\u0441;
    protected /* synthetic */ int \u0440\u0458h;
    protected /* synthetic */ double \u0441s\u0458eca\u0440;
    protected /* synthetic */ \u0456\u0435coi \u0456\u04bbe;

    public s\u0430\u0441\u0430\u0458\u0445s(int n, double d) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        this(n, d, \u0456\u0435coi.\u043e\u0440hij\u0430\u04bb);
    }

    public s\u0430\u0441\u0430\u0458\u0445s(int n, double d, \u0456\u0435coi \u0456\u0435coi2) {
        if (true | false) {
        }
        this.i\u04bb\u04bbx\u0441\u0441 = new \u0456oc();
        this.\u0440\u0458h = n;
        this.\u0441s\u0458eca\u0440 = d;
        this.\u0456\u04bbe = \u0456\u0435coi2;
    }

    public /* synthetic */ void \u0435oj\u0456p(boolean bl) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (bl) {
            this.hs\u0430h\u0441(\u0456\u0435coi.\u043e\u0440hij\u0430\u04bb);
        } else {
            this.hs\u0430h\u0441(\u0456\u0435coi.\u0445\u0435\u0441\u0456\u0456o);
        }
    }

    public /* synthetic */ boolean \u0440\u0430\u0440\u043e() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return this.\u0456\u04bbe.forwards();
    }

    public /* synthetic */ boolean x\u0430i(\u0456\u0435coi \u0456\u0435coi2) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return this.\u0430he() && this.\u0456\u04bbe.equals((Object)\u0456\u0435coi2);
    }

    public /* synthetic */ void \u0441\u0458e() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        this.i\u04bb\u04bbx\u0441\u0441.\u0441\u0458e();
    }

    public /* synthetic */ boolean \u0430he() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return this.i\u04bb\u04bbx\u0441\u0441.\u0455\u0441\u04bb(this.\u0440\u0458h);
    }

    public /* synthetic */ s\u0430\u0441\u0430\u0458\u0445s hs\u0430h\u0441(\u0456\u0435coi \u0456\u0435coi2) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if (this.\u0456\u04bbe != \u0456\u0435coi2) {
            this.\u0456\u04bbe = \u0456\u0435coi2;
            this.i\u04bb\u04bbx\u0441\u0441.\u0458jccjs((long)(s\u0430\u0441\u0430\u0458\u0445s.a_bsm0("currentTimeMillis", currentTimeMillis()) - ((long)this.\u0440\u0458h - s\u0430\u0441\u0430\u0458\u0445s.a_bsm1("min", min(long long ), (long)this.\u0440\u0458h, (long)this.i\u04bb\u04bbx\u0441\u0441.\u0458\u0430h\u04bb\u0456\u0456\u0440()))));
        }
        return this;
    }

    protected /* synthetic */ boolean \u0430\u0458\u0445() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return false;
    }

    public /* synthetic */ double \u0455ap\u0435p() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        if (this.\u0456\u04bbe.forwards()) {
            if (this.\u0430he()) {
                return this.\u0441s\u0458eca\u0440;
            }
            return this.getEquation((double)this.i\u04bb\u04bbx\u0441\u0441.\u0458\u0430h\u04bb\u0456\u0456\u0440() / (double)this.\u0440\u0458h) * this.\u0441s\u0458eca\u0440;
        }
        if (this.\u0430he()) {
            return 0.0;
        }
        if (this.\u0430\u0458\u0445()) {
            double d = (double)s\u0430\u0441\u0430\u0458\u0445s.a_bsm1("min", min(long long ), (long)this.\u0440\u0458h, (long)s\u0430\u0441\u0430\u0458\u0445s.a_bsm2("max", max(long long ), (long)0L, (long)((long)this.\u0440\u0458h - this.i\u04bb\u04bbx\u0441\u0441.\u0458\u0430h\u04bb\u0456\u0456\u0440())));
            return this.getEquation(d / (double)this.\u0440\u0458h) * this.\u0441s\u0458eca\u0440;
        }
        return (1.0 - this.getEquation((double)this.i\u04bb\u04bbx\u0441\u0441.\u0458\u0430h\u04bb\u0456\u0456\u0440() / (double)this.\u0440\u0458h)) * this.\u0441s\u0458eca\u0440;
    }

    protected abstract /* synthetic */ double getEquation(double var1);

    public /* synthetic */ void h\u04bbp\u0458(int n) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        this.\u0440\u0458h = n;
    }

    public /* synthetic */ \u0456\u0435coi sph\u0440\u0456\u0455() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return this.\u0456\u04bbe;
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

