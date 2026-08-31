/*
 * Decompiled with CFR 0.152.
 */
package ie\u0441\u0430ej;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class \u0445ic\u0441\u0458\u0456\u0445 {
    public /* synthetic */ float osj;
    public /* synthetic */ float \u0445\u0430\u0430c\u043eo;
    public /* synthetic */ float \u0430jxc;

    public \u0445ic\u0441\u0458\u0456\u0445(float f) {
        if (true | false) {
        }
        this.\u0445\u0430\u0430c\u043eo = 0.4f;
        this.osj = f;
        this.\u0430jxc = f;
    }

    public \u0445ic\u0441\u0458\u0456\u0445(float f, float f2) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        this.\u0445\u0430\u0430c\u043eo = 0.4f;
        this.osj = f;
        this.\u0430jxc = f2;
    }

    public /* synthetic */ void oxjc\u0456(boolean bl) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        this.\u0430jxc = (float)\u0445ic\u0441\u0458\u0456\u0445.a_bsm2("jh\u0455a", jh\u0455a(float float float ), (float)this.\u0430jxc, (float)(bl ? this.osj : 0.0f), (float)(\u0445ic\u0441\u0458\u0456\u0445.a_bsm1("max", max(float float ), (float)10.0f, (float)(\u0445ic\u0441\u0458\u0456\u0445.a_bsm0("abs", abs(float ), (float)(this.\u0430jxc - (bl ? this.osj : 0.0f))) * 40.0f)) * this.\u0445\u0430\u0430c\u043eo));
    }

    public /* synthetic */ boolean \u0441cc\u0430(boolean bl) {
        boolean bl2;
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if (bl) {
            bl2 = this.\u0430jxc == this.osj;
        } else if (this.\u0430jxc == 0.0f) {
            bl2 = true;
            switch (0) {
                default: {
                    break;
                }
                case 1: {
                    break;
                }
                case 2: {
                    break;
                }
            }
        } else {
            bl2 = false;
        }
        return bl2;
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

