/*
 * Decompiled with CFR 0.152.
 */
package \u0458x\u0458\u0435ah\u04bb;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import ie\u0441\u0430ej.pjxx;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import \u0445eo.c\u0455pi;

public class \u0455\u0456\u0440e
implements pjxx {
    @Expose
    @SerializedName(value="x")
    private float xi\u0458\u04bb\u0458;
    @Expose
    @SerializedName(value="y")
    private float jjai\u043exc;
    private /* synthetic */ float \u0435\u0440\u04bbc\u0456;
    private /* synthetic */ float j\u04bb\u0440xh\u0458h;
    private /* synthetic */ float \u043eoj\u0441;
    private /* synthetic */ float opa\u04bb\u04bb\u043e;
    private /* synthetic */ int \u043eco\u0456;
    private /* synthetic */ int c\u0456j;
    private /* synthetic */ boolean \u0430a\u0445\u0458\u0458;
    @Expose
    @SerializedName(value="align")
    private int \u0458\u0435p\u0435co;
    @Expose
    @SerializedName(value="name")
    private String \u0435\u0430\u0455;
    private final /* synthetic */ c\u0455pi \u0440\u0430\u0440xo;

    public \u0455\u0456\u0440e(c\u0455pi c\u0455pi2, String string, float f, float f2) {
        if (true | false) {
        }
        this.\u0458\u0435p\u0435co = 5;
        this.\u0440\u0430\u0440xo = c\u0455pi2;
        this.\u0435\u0430\u0455 = string;
        this.xi\u0458\u04bb\u0458 = f;
        this.jjai\u043exc = f2;
        this.e\u043ea\u0435();
    }

    public final /* synthetic */ void e\u043ea\u0435() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        float f = \u0430\u0445j\u0445s\u0456\u04bb.method_22683().method_4486();
        float f2 = \u0430\u0445j\u0445s\u0456\u04bb.method_22683().method_4502();
        if (f <= 0.0f || f2 <= 0.0f) {
            return;
        }
        this.\u0435\u0440\u04bbc\u0456 = this.xi\u0458\u04bb\u0458 * f;
        this.j\u04bb\u0440xh\u0458h = this.jjai\u043exc * f2;
        if ((this.\u0458\u0435p\u0435co & 2) != 0) {
            this.\u0435\u0440\u04bbc\u0456 -= this.\u043eoj\u0441;
        } else if ((this.\u0458\u0435p\u0435co & -635877369 + 635877385) != 0) {
            this.\u0435\u0440\u04bbc\u0456 -= this.\u043eoj\u0441 / 2.0f;
        }
        if ((this.\u0458\u0435p\u0435co & -1737395789 + 1737395797) != 0) {
            this.j\u04bb\u0440xh\u0458h -= this.opa\u04bb\u04bb\u043e;
        } else if ((this.\u0458\u0435p\u0435co & -1848585317 + 1848585349) != 0) {
            this.j\u04bb\u0440xh\u0458h -= this.opa\u04bb\u04bb\u043e / 2.0f;
        }
        if (this.\u0435\u0440\u04bbc\u0456 < 0.0f) {
            this.\u0435\u0440\u04bbc\u0456 = 0.0f;
        }
        if (this.\u0435\u0440\u04bbc\u0456 > f - this.\u043eoj\u0441) {
            this.\u0435\u0440\u04bbc\u0456 = f - this.\u043eoj\u0441;
        }
        if (this.j\u04bb\u0440xh\u0458h < 0.0f) {
            this.j\u04bb\u0440xh\u0458h = 0.0f;
        }
        if (this.j\u04bb\u0440xh\u0458h > f2 - this.opa\u04bb\u04bb\u043e) {
            this.j\u04bb\u0440xh\u0458h = f2 - this.opa\u04bb\u04bb\u043e;
        }
        float f3 = 0.0f;
        float f4 = 1.0f;
        float f5 = 0.0f;
        float f6 = 1.0f;
        if ((this.\u0458\u0435p\u0435co & 2) != 0) {
            f3 += this.\u043eoj\u0441 / f;
            f4 -= 0.0f;
        } else if ((this.\u0458\u0435p\u0435co & -1962231786 + 1962231802) != 0) {
            f3 += this.\u043eoj\u0441 / 2.0f / f;
            f4 -= this.\u043eoj\u0441 / 2.0f / f;
        }
        if ((this.\u0458\u0435p\u0435co & 4) != 0) {
            f6 -= this.opa\u04bb\u04bb\u043e / f2;
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
        } else if ((this.\u0458\u0435p\u0435co & -1513982221 + 1513982253) != 0) {
            f5 += this.opa\u04bb\u04bb\u043e / 2.0f / f2;
            f6 -= this.opa\u04bb\u04bb\u043e / 2.0f / f2;
        } else if ((this.\u0458\u0435p\u0435co & -1007172982 + 1007172990) != 0) {
            f5 += this.opa\u04bb\u04bb\u043e / f2;
        }
        this.xi\u0458\u04bb\u0458 = (float)\u0455\u0456\u0440e.a_bsm1("max", max(float float ), (float)f3, (float)\u0455\u0456\u0440e.a_bsm0("min", min(float float ), (float)this.xi\u0458\u04bb\u0458, (float)f4));
        this.jjai\u043exc = (float)\u0455\u0456\u0440e.a_bsm1("max", max(float float ), (float)f5, (float)\u0455\u0456\u0440e.a_bsm0("min", min(float float ), (float)this.jjai\u043exc, (float)f6));
    }

    public final /* synthetic */ void o\u0441c\u04bb\u0455oa(int n, int n2) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (this.\u0430a\u0445\u0458\u0458) {
            float f = \u0430\u0445j\u0445s\u0456\u04bb.method_22683().method_4486();
            float f2 = \u0430\u0445j\u0445s\u0456\u04bb.method_22683().method_4502();
            float f3 = (float)(n - this.\u043eco\u0456) / f;
            float f4 = (float)(n2 - this.c\u0456j) / f2;
            this.xi\u0458\u04bb\u0458 += f3;
            this.jjai\u043exc += f4;
            this.\u043eco\u0456 = n;
            this.c\u0456j = n2;
        }
        this.e\u043ea\u0435();
    }

    public final /* synthetic */ void cp\u0455\u0455\u0458x\u0445(int n, int n2, int n3) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        if (n3 == 0 && \u0455\u0456\u0440e.a_bsm2("\u0445soej\u0430", \u0445soej\u0430(float float float float int int ), (float)this.\u0435\u0440\u04bbc\u0456, (float)this.j\u04bb\u0440xh\u0458h, (float)this.\u043eoj\u0441, (float)this.opa\u04bb\u04bb\u043e, (int)n, (int)n2) != false) {
            this.\u0430a\u0445\u0458\u0458 = true;
            this.\u043eco\u0456 = n;
            this.c\u0456j = n2;
        }
    }

    public final /* synthetic */ void \u0456i\u0445(int n) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (n == 0) {
            this.\u0430a\u0445\u0458\u0458 = false;
        }
    }

    private /* synthetic */ float \u0445ejo\u0440() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return \u0430\u0445j\u0445s\u0456\u04bb.method_22683().method_4486();
    }

    private /* synthetic */ float x\u043ex\u0435a() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return \u0430\u0445j\u0445s\u0456\u04bb.method_22683().method_4502();
    }

    public /* synthetic */ float a\u0458ea\u0440c\u0441() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return this.xi\u0458\u04bb\u0458;
    }

    public /* synthetic */ void pc\u0440xjh\u04bb(float f) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        this.xi\u0458\u04bb\u0458 = f;
    }

    public /* synthetic */ float i\u0440x\u0435\u0430hj() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return this.jjai\u043exc;
    }

    public /* synthetic */ void oos\u0456\u0456i(float f) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        this.jjai\u043exc = f;
    }

    public /* synthetic */ float \u0456s\u0455\u043e\u0430\u0441() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return this.\u0435\u0440\u04bbc\u0456;
    }

    public /* synthetic */ float o\u0440xj() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return this.j\u04bb\u0440xh\u0458h;
    }

    public /* synthetic */ float p\u0435\u0455() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return this.\u043eoj\u0441;
    }

    public /* synthetic */ float \u0455j\u0430\u0440\u0455() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return this.opa\u04bb\u04bb\u043e;
    }

    public /* synthetic */ void \u0458ae(float f) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        this.\u043eoj\u0441 = f;
    }

    public /* synthetic */ void e\u0440e\u0456\u0456o\u0458(float f) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        this.opa\u04bb\u04bb\u043e = f;
    }

    public /* synthetic */ int \u0440\u04bbxhox\u043e() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return this.\u0458\u0435p\u0435co;
    }

    public /* synthetic */ void \u0456j\u0435(int n) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        this.\u0458\u0435p\u0435co = n;
    }

    public /* synthetic */ String getName() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return this.\u0435\u0430\u0455;
    }

    public /* synthetic */ c\u0455pi \u0435\u0430ces\u04bbs() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return this.\u0440\u0430\u0440xo;
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

