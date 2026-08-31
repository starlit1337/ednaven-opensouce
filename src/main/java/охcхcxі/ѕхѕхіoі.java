/*
 * Decompiled with CFR 0.152.
 */
package \u043e\u0445c\u0445cx\u0456;

import ie\u0441\u0430ej.hcce;
import ie\u0441\u0430ej.pjxx;
import ie\u0441\u0430ej.\u0430\u0435\u0455\u043ej;
import ie\u0441\u0430ej.\u0445ic\u0441\u0458\u0456\u0445;
import ie\u0441\u0430ej.\u0456oc;
import io.github.humbleui.skija.Font;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.class_2561;
import net.minecraft.class_332;
import net.minecraft.class_437;
import net.minecraft.class_4587;
import spso.\u0430\u0430p\u043e;
import spso.\u0456\u0445ss;
import xs\u0441\u0445oa\u0430.j\u0441c;
import \u0435xp.h\u04bb\u0455hpa;
import \u0435xp.ih\u0430aa;
import \u0435xp.o\u043ea\u0456c;
import \u0435xp.\u043ea\u0441\u0430p;
import \u0435\u0435oj\u0455\u0435.xe\u0441e;
import \u0440o\u0456\u0445o.\u0445\u0440\u0430\u0435\u0445\u043e;
import \u0445eo.c\u0455pi;
import \u0445eo.\u0458i\u0456x;
import \u0445\u0458jsj\u0430.\u0455\u0435\u0445\u0430op\u0435;

public class \u0455\u0445\u0455\u0445\u0456o\u0456
extends class_437
implements pjxx {
    public static /* synthetic */ float \u0435\u0456\u0458pi;
    public static /* synthetic */ float x\u0458e;
    public static /* synthetic */ float \u043ej\u043ep;
    public static /* synthetic */ float \u0441\u0445j;
    private /* synthetic */ \u0458i\u0456x \u0458i\u0435i;
    private /* synthetic */ c\u0455pi \u0430ih;
    private final /* synthetic */ int[] eoa\u0456;
    private /* synthetic */ boolean x\u0440p\u043ej\u0435i;
    private /* synthetic */ boolean \u0441ixh;
    private /* synthetic */ boolean x\u043ei;
    private /* synthetic */ boolean ps\u0445c\u043e;
    private /* synthetic */ boolean \u0456ep\u0430e\u0441e;
    private final /* synthetic */ \u0445ic\u0441\u0458\u0456\u0445 pi\u0435;
    private final /* synthetic */ \u0445ic\u0441\u0458\u0456\u0445 ep\u0441;
    private final /* synthetic */ \u0445ic\u0441\u0458\u0456\u0445 e\u0458eo\u0458ih;
    private final /* synthetic */ \u0445ic\u0441\u0458\u0456\u0445 i\u0435x;
    private final /* synthetic */ \u0445ic\u0441\u0458\u0456\u0445 \u0440o\u0430;
    private final /* synthetic */ \u0445ic\u0441\u0458\u0456\u0445 \u0458\u0435hai;
    private final /* synthetic */ \u0445ic\u0441\u0458\u0456\u0445 e\u043e\u04bbxx;
    private final /* synthetic */ \u0445ic\u0441\u0458\u0456\u0445 \u0445\u043e\u0441\u043e;
    private final /* synthetic */ \u0445ic\u0441\u0458\u0456\u0445 p\u043ee\u0441;
    private final /* synthetic */ \u0445ic\u0441\u0458\u0456\u0445 xsox\u04bbhe;
    private final /* synthetic */ Map<\u0458i\u0456x, \u0445ic\u0441\u0458\u0456\u0445> \u0455j\u0455\u0458;
    private final /* synthetic */ Map<\u0458i\u0456x, \u0445ic\u0441\u0458\u0456\u0445> hh\u0458\u0445e;
    private final /* synthetic */ Map<\u0458i\u0456x, List<c\u0455pi>> a\u0456x\u043epj;
    private final /* synthetic */ Map<c\u0455pi, \u0445ic\u0441\u0458\u0456\u0445> \u0441\u0445hc;
    private final /* synthetic */ Map<c\u0455pi, \u0445ic\u0441\u0458\u0456\u0445> pio\u0441\u0458pa;
    private final /* synthetic */ Map<\u0430\u0430p\u043e, \u0445ic\u0441\u0458\u0456\u0445> s\u0455e\u043e\u0458;
    private /* synthetic */ String hhp\u0458;
    private /* synthetic */ String h\u043eo\u0430xj\u0440;
    private /* synthetic */ float \u043ehx\u0441\u0456;
    private /* synthetic */ float j\u0456a\u0458j\u0455a;
    private /* synthetic */ float \u0440ih\u0440;
    private /* synthetic */ float sj\u0455\u0458\u0435;
    private /* synthetic */ \u0458i\u0456x \u0430\u0440a\u043e;
    private /* synthetic */ c\u0455pi aos;
    private /* synthetic */ c\u0455pi j\u0458\u0458pxp\u0455;
    private /* synthetic */ List<c\u0455pi> \u0455xa\u04bb;
    private /* synthetic */ List<\u0430\u0430p\u043e> \u0435c\u0435;
    private /* synthetic */ h\u04bb\u0455hpa ac\u0456\u0440ap;
    private /* synthetic */ \u043ea\u0441\u0430p \u0435o\u0445\u0445;
    private /* synthetic */ \u043ea\u0441\u0430p \u0435cosh\u0435\u0435;
    private /* synthetic */ o\u043ea\u0456c hpc\u0430xe;
    private /* synthetic */ ih\u0430aa j\u0445ese;
    private /* synthetic */ ih\u0430aa opih\u0445s;
    private /* synthetic */ int \u0435i\u0445\u04bb\u0430;
    private final /* synthetic */ \u0456oc x\u0456\u0455\u0440;
    private final /* synthetic */ \u0456oc \u0441x\u0441\u0435;
    private final /* synthetic */ Font \u0435o\u0455;

    public \u0455\u0445\u0455\u0445\u0456o\u0456() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        super((class_2561)\u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm1("method_30163", method_30163(java.lang.String ), (String)((Object)\u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1081660105 + 1081660163, -1432052609 + 1432052688, -1260860915 + 1260860933, -1218258206 + 1218258308, -154675695 + 154675599}, (int)(479030611 + 1672352488), (int)(1077422204 + 689783000)))));
        this.eoa\u0456 = new int[]{-1, -1};
        this.pi\u0435 = new \u0445ic\u0441\u0458\u0456\u0445(100.0f);
        this.ep\u0441 = new \u0445ic\u0441\u0458\u0456\u0445(140.0f);
        this.e\u0458eo\u0458ih = new \u0445ic\u0441\u0458\u0456\u0445(100.0f);
        this.i\u0435x = new \u0445ic\u0441\u0458\u0456\u0445(0.0f);
        this.\u0440o\u0430 = new \u0445ic\u0441\u0458\u0456\u0445(0.0f);
        this.\u0458\u0435hai = new \u0445ic\u0441\u0458\u0456\u0445(0.0f);
        this.e\u043e\u04bbxx = new \u0445ic\u0441\u0458\u0456\u0445(0.0f);
        this.\u0445\u043e\u0441\u043e = new \u0445ic\u0441\u0458\u0456\u0445(0.0f);
        this.p\u043ee\u0441 = new \u0445ic\u0441\u0458\u0456\u0445(0.0f);
        this.xsox\u04bbhe = new \u0445ic\u0441\u0458\u0456\u0445(0.0f);
        this.\u0455j\u0455\u0458 = new HashMap<\u0458i\u0456x, \u0445ic\u0441\u0458\u0456\u0445>();
        this.hh\u0458\u0445e = new HashMap<\u0458i\u0456x, \u0445ic\u0441\u0458\u0456\u0445>();
        this.a\u0456x\u043epj = new HashMap<\u0458i\u0456x, List<c\u0455pi>>();
        this.\u0441\u0445hc = new HashMap<c\u0455pi, \u0445ic\u0441\u0458\u0456\u0445>();
        this.pio\u0441\u0458pa = new HashMap<c\u0455pi, \u0445ic\u0441\u0458\u0456\u0445>();
        this.s\u0455e\u043e\u0458 = new HashMap<\u0430\u0430p\u043e, \u0445ic\u0441\u0458\u0456\u0445>();
        this.hhp\u0458 = \u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[0], (int)(285294636 + 666302603), (int)(-388125255 + 1161461854));
        this.x\u0456\u0455\u0440 = new \u0456oc();
        this.\u0441x\u0441\u0435 = new \u0456oc();
        this.\u0435o\u0455 = \u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm2("\u0458\u0435a", \u0458\u0435a(float ), (float)11.0f);
        for (CallSite callSite : \u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm3("values", values())) {
            this.\u0455j\u0455\u0458.put((\u0458i\u0456x)((Object)callSite), new \u0445ic\u0441\u0458\u0456\u0445(0.0f));
            this.hh\u0458\u0445e.put((\u0458i\u0456x)((Object)callSite), new \u0445ic\u0441\u0458\u0456\u0445(0.0f));
            this.a\u0456x\u043epj.put((\u0458i\u0456x)((Object)callSite), ((\u0445\u0440\u0430\u0435\u0445\u043e)((Object)\u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm4("jaa\u0435\u0445c", jaa\u0435\u0445c()))).\u0430o\u0441\u0456p\u0455().\u0456\u0456a((\u0458i\u0456x)((Object)callSite)));
        }
        for (c\u0455pi c\u0455pi2 : ((\u0445\u0440\u0430\u0435\u0445\u043e)((Object)\u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm4("jaa\u0435\u0445c", jaa\u0435\u0445c()))).\u0430o\u0441\u0456p\u0455().h\u0445ca()) {
            this.\u0441\u0445hc.put(c\u0455pi2, new \u0445ic\u0441\u0458\u0456\u0445(0.0f, 255.0f));
            this.pio\u0441\u0458pa.put(c\u0455pi2, new \u0445ic\u0441\u0458\u0456\u0445(0.0f));
        }
        block6: for (\u0430\u0430p\u043e \u0430\u0430p\u043e2 : ((\u0445\u0440\u0430\u0435\u0445\u043e)((Object)\u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm4("jaa\u0435\u0445c", jaa\u0435\u0445c()))).\u0445sxe().\u0440h\u0440\u0441()) {
            this.s\u0455e\u043e\u0458.put(\u0430\u0430p\u043e2, new \u0445ic\u0441\u0458\u0456\u0445(0.0f));
            switch (0) {
                default: {
                    continue block6;
                }
                case 1: {
                    continue block6;
                }
                case 2: 
            }
        }
    }

    public /* synthetic */ void method_25419() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        ((\u0445\u0440\u0430\u0435\u0445\u043e)((Object)\u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm4("jaa\u0435\u0445c", jaa\u0435\u0445c()))).\u0440\u0455x\u0456().\u0441sp();
        ((\u0445\u0440\u0430\u0435\u0445\u043e)((Object)\u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm4("jaa\u0435\u0445c", jaa\u0435\u0445c()))).\u0458poi\u0440().\u0455j\u043e\u0440o(this);
        super.method_25419();
    }

    public /* synthetic */ boolean method_25421() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return false;
    }

    public /* synthetic */ boolean method_25402(double d, double d2, int n) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (n == 0) {
            this.\u0441ixh = true;
        }
        if (this.j\u0458\u0458pxp\u0455 != null) {
            if (n > 2) {
                this.j\u0458\u0458pxp\u0455.\u04bb\u0441\u0440x(-n);
                this.j\u0458\u0458pxp\u0455 = null;
            }
            return true;
        }
        if (this.aos != null) {
            if (n == 0) {
                this.aos.\u043e\u0440\u0440s\u0435();
            } else if (n == 1) {
                this.\u0430ih = this.aos;
                this.\u0435c\u0435 = ((\u0445\u0440\u0430\u0435\u0445\u043e)((Object)\u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm4("jaa\u0435\u0445c", jaa\u0435\u0445c()))).\u0445sxe().iop\u0441c(this.aos);
                this.\u0458\u0435hai.\u0430jxc = 0.0f;
                this.\u0458\u0435hai.osj = 0.0f;
            } else if (n == 2) {
                this.j\u0458\u0458pxp\u0455 = this.aos;
            }
        }
        if (n == 0) {
            CallSite callSite;
            if (this.j\u0445ese != null) {
                this.opih\u0445s = this.j\u0445ese;
                return true;
            }
            this.opih\u0445s = null;
            if (this.x\u0440p\u043ej\u0435i && !this.ps\u0445c\u043e && !this.\u0456ep\u0430e\u0441e) {
                this.\u0458i\u0435i = null;
                this.\u0430ih = null;
                this.\u0435c\u0435 = null;
            }
            if (this.x\u043ei && this.\u0430\u0440a\u043e != null) {
                this.\u0458i\u0435i = this.\u0430\u0440a\u043e;
                this.\u0440o\u0430.osj = 0.0f;
                this.\u0440o\u0430.\u0430jxc = 0.0f;
                this.e\u043e\u04bbxx.\u0430jxc = 5.0f;
                this.e\u043e\u04bbxx.osj = 255.0f;
            }
            if (this.\u0458i\u0435i != null) {
                v0 = \u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm5("xip\u0458s\u0430", xip\u0458s\u0430(int int float float float float ), (int)((int)d), (int)((int)d2), (float)\u0435\u0456\u0458pi, (float)x\u0458e, (float)(\u0435\u0456\u0458pi + \u043ej\u043ep), (float)(x\u0458e + 25.0f));
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
                v0 = callSite = \u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm5("xip\u0458s\u0430", xip\u0458s\u0430(int int float float float float ), (int)((int)d), (int)((int)d2), (float)\u0435\u0456\u0458pi, (float)x\u0458e, (float)(\u0435\u0456\u0458pi + 100.0f), (float)(x\u0458e + 40.0f));
            }
            if (!(this.\u0458i\u0435i != null && this.x\u0440p\u043ej\u0435i || callSite == false && \u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm5("xip\u0458s\u0430", xip\u0458s\u0430(int int float float float float ), (int)((int)d), (int)((int)d2), (float)\u0435\u0456\u0458pi, (float)(x\u0458e + \u0441\u0445j - 15.0f), (float)(\u0435\u0456\u0458pi + \u043ej\u043ep - 15.0f), (float)(x\u0458e + \u0441\u0445j)) == false)) {
                this.SetDragPosition(d, d2);
                this.\u0456ep\u0430e\u0441e = true;
            }
            if (\u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm5("xip\u0458s\u0430", xip\u0458s\u0430(int int float float float float ), (int)((int)d), (int)((int)d2), (float)(\u0435\u0456\u0458pi + \u043ej\u043ep - 10.0f), (float)(x\u0458e + \u0441\u0445j - 10.0f), (float)(\u0435\u0456\u0458pi + \u043ej\u043ep), (float)(x\u0458e + \u0441\u0445j)) != false) {
                this.SetDragPosition(d, d2);
                this.ps\u0445c\u043e = true;
            }
            if (this.ac\u0456\u0440ap != null) {
                this.ac\u0456\u0440ap.ipi(!this.ac\u0456\u0440ap.axpacc());
            }
            if (this.\u0435o\u0445\u0445 != null) {
                this.\u0435cosh\u0435\u0435 = this.\u0435o\u0445\u0445;
            }
            if (this.hpc\u0430xe != null) {
                this.hpc\u0430xe.\u0430e\u04bbo\u0435\u0430i(this.\u0435i\u0445\u04bb\u0430);
                \u0445ic\u0441\u0458\u0456\u0445 \u0445ic\u0441\u0458\u0456\u04452 = this.s\u0455e\u043e\u0458.get(this.hpc\u0430xe);
                \u0445ic\u0441\u0458\u0456\u04452.\u0430jxc = 0.0f;
                \u0445ic\u0441\u0458\u0456\u04452.osj = 255.0f;
            }
        }
        return true;
    }

    public /* synthetic */ boolean method_25406(double d, double d2, int n) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if (n == 0) {
            this.\u0441ixh = false;
        }
        this.ps\u0445c\u043e = false;
        this.\u0456ep\u0430e\u0441e = false;
        this.\u0435cosh\u0435\u0435 = null;
        this.SetDragPosition(-1, -1);
        return true;
    }

    public /* synthetic */ boolean method_25404(int n, int n2, int n3) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (this.j\u0458\u0458pxp\u0455 != null) {
            this.j\u0458\u0458pxp\u0455.\u04bb\u0441\u0440x(n == -184618604 + 184618860 ? 0 : n);
            this.j\u0458\u0458pxp\u0455 = null;
            return true;
        }
        if (this.opih\u0445s != null) {
            if (n == -1146861776 + 1146862032 || n == -2080620060 + 2080620317 || n == -532720972 + 532721307) {
                this.opih\u0445s = null;
                return true;
            }
            if (n == -1397350714 + 1397350973) {
                String string = this.opih\u0445s.axpacc();
                if (string != null && !string.isEmpty()) {
                    this.opih\u0445s.a\u0435op\u0458c(string.substring(0, string.offsetByCodePoints(string.length(), -1)));
                }
                return true;
            }
        }
        return super.method_25404(n, n2, n3);
    }

    public /* synthetic */ boolean method_25400(char c, int n) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (this.opih\u0445s != null && \u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm6("isISOControl", isISOControl(char ), (char)c) == false) {
            Object object = this.opih\u0445s.axpacc();
            if (object == null) {
                object = \u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[0], (int)(-276920958 + 1343076874), (int)(609400081 + 1114354092));
            }
            if (((String)object).codePointCount(0, ((String)object).length()) < -643523852 + 643523900) {
                char c2 = c;
                Object object2 = object;
                this.opih\u0445s.a\u0435op\u0458c("" + object2 + c2);
            }
            return true;
        }
        return super.method_25400(c, n);
    }

    protected /* synthetic */ void method_25426() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        ((\u0445\u0440\u0430\u0435\u0445\u043e)((Object)\u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm4("jaa\u0435\u0445c", jaa\u0435\u0445c()))).\u0458poi\u0440().\u0441\u0430\u0456(this);
        this.s\u0455e\u043e\u0458.forEach((\u0430\u0430p\u043e2, \u0445ic\u0441\u0458\u0456\u04452) -> {
            if (2 * 2 * 2 >= 0) {
            }
            if (\u0430\u0430p\u043e2.getValueType() == \u0456\u0445ss.\u043e\u04bb\u0440\u0430i\u0435) {
                \u0445ic\u0441\u0458\u0456\u04452.\u0430jxc = 0.0f;
                \u0445ic\u0441\u0458\u0456\u04452.osj = 255.0f;
            }
        });
    }

    public /* synthetic */ boolean method_25401(double d, double d2, double d3, double d4) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        float f = (float)(d4 * 15.0);
        if (this.j\u0458\u0458pxp\u0455 == null) {
            if (\u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm5("xip\u0458s\u0430", xip\u0458s\u0430(int int float float float float ), (int)((int)d), (int)((int)d2), (float)(\u0435\u0456\u0458pi + 5.0f), (float)(x\u0458e + 20.0f), (float)(\u0435\u0456\u0458pi + 105.0f), (float)(x\u0458e + \u0441\u0445j - 5.0f)) != false) {
                this.\u0440o\u0430.osj += f;
                this.x\u0456\u0455\u0440.\u0441\u0458e();
                return true;
            }
            if (this.\u0435c\u0435 != null && \u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm5("xip\u0458s\u0430", xip\u0458s\u0430(int int float float float float ), (int)((int)d), (int)((int)d2), (float)(\u0435\u0456\u0458pi + 140.0f), (float)(x\u0458e + 20.0f), (float)(\u0435\u0456\u0458pi + \u043ej\u043ep - 10.0f), (float)(x\u0458e + \u0441\u0445j - 25.0f)) != false) {
                this.\u0458\u0435hai.osj += f;
                this.\u0441x\u0441\u0435.\u0441\u0458e();
                return true;
            }
        }
        return super.method_25401(d, d2, d3, d4);
    }

    public /* synthetic */ void method_25394(class_332 class_3322, int n, int n2, float f) {
        Color color;
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        xe\u0441e xe\u0441e2 = this.h\u0445ph();
        class_4587 class_45872 = class_3322.method_51448();
        this.aos = null;
        this.x\u043ei = false;
        \u0455\u0435\u0445\u0430op\u0435 \u0455\u0435\u0445\u0430op\u04352 = j\u0441c.occ\u0456c\u0458h;
        this.pi\u0435.osj = this.\u0458i\u0435i == null ? 100.0f : \u043ej\u043ep;
        this.ep\u0441.osj = this.\u0458i\u0435i == null ? 140.0f : \u0441\u0445j;
        this.pi\u0435.oxjc\u0456(true);
        this.ep\u0441.oxjc\u0456(true);
        hcce.ixoie\u0456\u04bb.xx\u0445x\u0456\u0458p(class_45872, \u0435\u0456\u0458pi, x\u0458e, this.pi\u0435.\u0430jxc, this.ep\u0441.\u0430jxc, 8.0, xe\u0441e2.\u04bbha());
        for (CallSite object2 : \u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm3("values", values())) {
            \u0445ic\u0441\u0458\u0456\u0445 \u0445ic\u0441\u0458\u0456\u04452 = this.\u0455j\u0455\u0458.get(object2);
            \u0445ic\u0441\u0458\u0456\u0445 \u0445ic\u0441\u0458\u0456\u04453 = this.hh\u0458\u0445e.get(object2);
            \u0445ic\u0441\u0458\u0456\u04453.osj = this.\u0458i\u0435i == null ? 255.0f : 0.0f;
            \u0445ic\u0441\u0458\u0456\u04452.oxjc\u0456(true);
            \u0445ic\u0441\u0458\u0456\u04453.oxjc\u0456(true);
            float f2 = (float)(((Enum)((Object)object2)).ordinal() * (-1539308699 + 1539308724)) * (\u0445ic\u0441\u0458\u0456\u04453.\u0430jxc / 255.0f);
            CallSite callSite = \u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm5("xip\u0458s\u0430", xip\u0458s\u0430(int int float float float float ), (int)n, (int)n2, (float)\u0435\u0456\u0458pi, (float)(x\u0458e + 40.0f + f2), (float)(\u0435\u0456\u0458pi + 100.0f), (float)(x\u0458e + 40.0f + f2 + 20.0f));
            float f3 = \u0445ic\u0441\u0458\u0456\u04452.osj = callSite != false ? 5.0f : 0.0f;
            if (\u0445ic\u0441\u0458\u0456\u04453.osj >= 4.0f) {
                \u0455\u0435\u0445\u0430op\u04352.\u0440hc\u0458(\u0445ic\u0441\u0458\u0456\u04453.\u0430jxc / 255.0f);
                color = callSite != false ? xe\u0441e2.\u04bb\u0455x\u04bb() : xe\u0441e2.\u04bb\u0455x\u04bb();
                j\u0441c.eo\u043e.c\u043ehos\u0445(class_45872, ((\u0458i\u0456x)((Object)object2)).getIcon(), \u0435\u0456\u0458pi + 8.0f + \u0445ic\u0441\u0458\u0456\u04452.\u0430jxc, x\u0458e + 41.0f + f2, color, true, 0.4);
                \u0455\u0435\u0445\u0430op\u04352.c\u043ehos\u0445(class_45872, ((\u0458i\u0456x)((Object)object2)).getDisplayName(), \u0435\u0456\u0458pi + 25.0f + \u0445ic\u0441\u0458\u0456\u04452.\u0430jxc, x\u0458e + 40.0f + f2, color, true, 0.4);
                \u0455\u0435\u0445\u0430op\u04352.\u0440hc\u0458(1.0f);
            }
            if (callSite == false || !(\u0445ic\u0441\u0458\u0456\u04453.\u0430jxc >= 250.0f)) continue;
            this.\u0430\u0440a\u043e = object2;
            this.x\u043ei = true;
        }
        this.e\u0458eo\u0458ih.oxjc\u0456(true);
        this.i\u0435x.oxjc\u0456(true);
        if (this.e\u0458eo\u0458ih.\u0430jxc > 5.0f) {
            \u0455\u0435\u0445\u0430op\u04352.\u0440hc\u0458(this.e\u0458eo\u0458ih.\u0430jxc / 255.0f);
            \u0455\u0435\u0445\u0430op\u04352.c\u043ehos\u0445(class_45872, this.hhp\u0458, \u0435\u0456\u0458pi + 6.0f + this.i\u0435x.\u0430jxc, x\u0458e + 3.0f, xe\u0441e2.\u04bb\u0455x\u04bb(), true, 0.4);
        }
        \u0455\u0435\u0445\u0430op\u04352.\u0440hc\u0458((255.0f - this.e\u0458eo\u0458ih.\u0430jxc) / 255.0f);
        \u0455\u0435\u0445\u0430op\u04352.c\u043ehos\u0445(class_45872, (String)((Object)\u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1061455430 + 1061455544, -1594844643 + 1594844575, -417707008 + 417706880, -311633235 + 311633108, -64156391 + 64156514}, (int)(1714923665 + 1081867809), (int)(1704986296 + 534871752))), \u0435\u0456\u0458pi + 50.0f - \u0455\u0435\u0445\u0430op\u04352.se\u0440\u0458i((String)((Object)\u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1415625712 + 1415625800, -1391244809 + 1391244758, -928471364 + 928471351, -1150631467 + 1150631582, -816226544 + 816226470}, (int)(2063743078 + 1216908068), (int)(1776329845 + 762966756))), 0.75) / 2.0f, x\u0458e + 5.0f, xe\u0441e2.\u04bb\u0455x\u04bb(), true, 0.75);
        \u0455\u0435\u0445\u0430op\u04352.\u0440hc\u0458(1.0f);
        if (this.\u0458i\u0435i != null) {
            Object object;
            this.e\u0458eo\u0458ih.osj = 255.0f;
            String string = this.\u0458i\u0435i.getDisplayName();
            if (this.\u0430ih != null) {
                String string2 = this.\u0430ih.i\u04bb\u0435o\u0441\u0458a();
                String string3 = this.\u0430ih.getName();
                object = (String)((Object)\u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1085856438 + 1085856363, -753300460 + 753300446, -1836467174 + 1836467067}, (int)(371514118 + 440358238), (int)(820787520 + 1445481940))) + string3 + (String)((Object)\u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-253547364 + 253547453, -1876439287 + 1876439173, -1851191635 + 1851191653}, (int)(-476195646 + 1623289756), (int)(1178207306 + 94193548))) + string2;
            } else {
                object = \u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[0], (int)(18571869 + 1084153693), (int)(2141626096 + 151054775));
            }
            CallSite callSite = object;
            String string4 = string;
            this.hhp\u0458 = (String)((Object)\u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1227291860 + 1227291959, -263464531 + 263464405}, (int)(-436548216 + 532428846), (int)(1195076046 + 103736220))) + string4 + callSite;
            this.x\u0440p\u043ej\u0435i = \u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm5("xip\u0458s\u0430", xip\u0458s\u0430(int int float float float float ), (int)n, (int)n2, (float)(\u0435\u0456\u0458pi + 8.0f), (float)(x\u0458e + 5.0f), (float)(\u0435\u0456\u0458pi + 5.0f + \u0455\u0435\u0445\u0430op\u04352.se\u0440\u0458i(this.hhp\u0458, 0.4)), (float)((float)((double)(x\u0458e + 5.0f) + \u0455\u0435\u0445\u0430op\u04352.he\u04bb(true, 0.4f))));
            this.i\u0435x.osj = this.x\u0440p\u043ej\u0435i && !this.ps\u0445c\u043e && !this.\u0456ep\u0430e\u0441e ? -2.0f : 0.0f;
            this.\u0440o\u0430.osj = (float)\u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm7("s\u0458\u0440", s\u0458\u0440(double double double ), (double)this.\u0440o\u0430.osj, (double)(-this.\u043ehx\u0441\u0456), (double)0.0);
            this.\u0440o\u0430.oxjc\u0456(true);
        } else {
            this.e\u0458eo\u0458ih.osj = 4.0f;
        }
        \u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm8("\u0456ji", \u0456ji(float float float float ), (float)\u0435\u0456\u0458pi, (float)(x\u0458e + 20.0f), (float)this.pi\u0435.\u0430jxc, (float)(this.ep\u0441.\u0430jxc - 25.0f));
        List<c\u0455pi> list = this.a\u0456x\u043epj.get((Object)this.\u0458i\u0435i);
        this.e\u043e\u04bbxx.osj = list != null ? 255.0f : 5.0f;
        this.e\u043e\u04bbxx.oxjc\u0456(true);
        if (list != null) {
            this.\u0455xa\u04bb = list;
        } else if (this.e\u043e\u04bbxx.\u0430jxc < 8.0f) {
            this.\u0455xa\u04bb = null;
        }
        if (this.\u0455xa\u04bb != null) {
            float f4 = 0.0f;
            this.\u0440ih\u0440 = \u0441\u0445j - 25.0f;
            for (c\u0455pi c\u0455pi2 : this.\u0455xa\u04bb) {
                Color color2;
                boolean bl = \u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm9("i\u0430\u0440", i\u0430\u0440(int int float float float float ), (int)n, (int)n2, (float)(\u0435\u0456\u0458pi + 5.0f), (float)(x\u0458e + 20.0f), (float)120.0f, (float)(\u0441\u0445j - 25.0f)) != false && \u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm9("i\u0430\u0440", i\u0430\u0440(int int float float float float ), (int)n, (int)n2, (float)(\u0435\u0456\u0458pi + 5.0f), (float)(x\u0458e + 20.0f + f4 + this.\u0440o\u0430.\u0430jxc), (float)120.0f, (float)25.0f) != false && this.e\u043e\u04bbxx.\u0430jxc > 250.0f && this.j\u0458\u0458pxp\u0455 == null;
                \u0445ic\u0441\u0458\u0456\u0445 \u0445ic\u0441\u0458\u0456\u04454 = this.pio\u0441\u0458pa.get(c\u0455pi2);
                \u0445ic\u0441\u0458\u0456\u04454.osj = c\u0455pi2.\u0440\u0435\u0455x\u0435xe() ? this.e\u043e\u04bbxx.\u0430jxc : 0.0f;
                \u0445ic\u0441\u0458\u0456\u04454.oxjc\u0456(true);
                CallSite callSite = \u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm10("withAlpha", withAlpha(java.awt.Color int ), (Color)xe\u0441e2.s\u0456xx\u0458(), (int)((int)this.e\u043e\u04bbxx.\u0430jxc));
                CallSite callSite2 = \u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm10("withAlpha", withAlpha(java.awt.Color int ), (Color)xe\u0441e2.aj\u0445\u043e(), (int)((int)\u0445ic\u0441\u0458\u0456\u04454.\u0430jxc));
                if (c\u0455pi2.\u0440\u0435\u0455x\u0435xe()) {
                    color2 = xe\u0441e2.\u0430\u0458\u0441\u0455oc();
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
                    color2 = xe\u0441e2.\u04bb\u0455x\u04bb();
                }
                color = color2;
                hcce.ixoie\u0456\u04bb.xx\u0445x\u0456\u0458p(class_45872, \u0435\u0456\u0458pi + 5.0f, x\u0458e + 20.0f + f4 + this.\u0440o\u0430.\u0430jxc, 120.0, 25.0, 6.0, (Color)((Object)callSite));
                if (c\u0455pi2.\u0440\u0435\u0455x\u0435xe()) {
                    hcce.ixoie\u0456\u04bb.xx\u0445x\u0456\u0458p(class_45872, \u0435\u0456\u0458pi + 5.0f, x\u0458e + 20.0f + f4 + this.\u0440o\u0430.\u0430jxc, 120.0, 25.0, 6.0, (Color)((Object)callSite2));
                }
                \u0445ic\u0441\u0458\u0456\u0445 \u0445ic\u0441\u0458\u0456\u04455 = this.\u0441\u0445hc.get(c\u0455pi2);
                \u0445ic\u0441\u0458\u0456\u04455.osj = bl ? 40.0f : 0.0f;
                \u0445ic\u0441\u0458\u0456\u04455.oxjc\u0456(true);
                if (bl) {
                    this.aos = c\u0455pi2;
                }
                if (\u0445ic\u0441\u0458\u0456\u04455.\u0430jxc > 0.5f) {
                    CallSite callSite3 = \u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm10("withAlpha", withAlpha(java.awt.Color int ), (Color)(c\u0455pi2.\u0440\u0435\u0455x\u0435xe() ? xe\u0441e2.\u0430\u0458\u0441\u0455oc() : xe\u0441e2.\u04bb\u0455x\u04bb()), (int)((int)\u0445ic\u0441\u0458\u0456\u04455.\u0430jxc));
                    hcce.ixoie\u0456\u04bb.xx\u0445x\u0456\u0458p(class_45872, \u0435\u0456\u0458pi + 5.0f, x\u0458e + 20.0f + f4 + this.\u0440o\u0430.\u0430jxc, 120.0, 25.0, 6.0, (Color)((Object)callSite3));
                }
                \u0455\u0435\u0445\u0430op\u04352.\u0440hc\u0458(this.e\u043e\u04bbxx.\u0430jxc / 255.0f);
                \u0455\u0435\u0445\u0430op\u04352.c\u043ehos\u0445(class_45872, c\u0455pi2.getName(), \u0435\u0456\u0458pi + 13.0f, x\u0458e + 25.0f + f4 + this.\u0440o\u0430.\u0430jxc, color, true, 0.4);
                \u0455\u0435\u0445\u0430op\u04352.\u0440hc\u0458(1.0f);
                f4 += 30.0f;
            }
            this.\u043ehx\u0441\u0456 = (float)\u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm11("max", max(float float ), (float)0.0f, (float)(f4 - (\u0441\u0445j - 45.0f)));
            this.\u0440ih\u0440 -= f4 - 5.0f;
            this.renderScrollBar(class_45872, \u0435\u0456\u0458pi + 127.0f, this.\u0440o\u0430.\u0430jxc, this.\u0440ih\u0440, this.\u043ehx\u0441\u0456 + \u0441\u0445j, this.p\u043ee\u0441, this.x\u0456\u0455\u0440, xe\u0441e2.aj\u0445\u043e());
        }
        if (this.\u0435c\u0435 != null) {
            Object object4 = \u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm9("i\u0430\u0440", i\u0430\u0440(int int float float float float ), (int)n, (int)n2, (float)(\u0435\u0456\u0458pi + 140.0f), (float)(x\u0458e + 20.0f), (float)(\u043ej\u043ep - 155.0f), (float)(\u0441\u0445j - 25.0f));
            this.\u0458\u0435hai.osj = (float)\u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm7("s\u0458\u0440", s\u0458\u0440(double double double ), (double)this.\u0458\u0435hai.osj, (double)(-this.j\u0456a\u0458j\u0455a), (double)0.0);
            this.\u0458\u0435hai.oxjc\u0456(true);
            float f5 = 0.0f;
            float f4 = 0.0f;
            this.sj\u0455\u0458\u0435 = \u0441\u0445j - 25.0f;
            this.ac\u0456\u0440ap = null;
            this.j\u0445ese = null;
            for (\u0430\u0430p\u043e \u0430\u0430p\u043e2 : this.\u0435c\u0435) {
                if (!\u0430\u0430p\u043e2.s\u0440\u0445x\u0440i\u0445() || \u0430\u0430p\u043e2.getValueType() != \u0456\u0445ss.xx\u0456\u0456) continue;
                h\u04bb\u0455hpa h\u04bb\u0455hpa2 = \u0430\u0430p\u043e2.getBooleanValue();
                \u0445ic\u0441\u0458\u0456\u0445 \u0445ic\u0441\u0458\u0456\u04456 = this.s\u0455e\u043e\u0458.get(h\u04bb\u0455hpa2);
                \u0445ic\u0441\u0458\u0456\u04456.osj = h\u04bb\u0455hpa2.axpacc() ? 255.0f : 0.0f;
                \u0445ic\u0441\u0458\u0456\u04456.oxjc\u0456(true);
                float f6 = \u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm12("s\u0440x\u043e", s\u0440x\u043e(java.lang.String ), (String)\u0430\u0430p\u043e2.getName()) != false ? 0.325f : 0.4f;
                float f7 = \u0455\u0435\u0445\u0430op\u04352.se\u0440\u0458i(\u0430\u0430p\u043e2.getName(), f6) + 23.0f;
                if (f5 + f7 + 20.0f > \u043ej\u043ep - 155.0f) {
                    f5 = 0.0f;
                    f4 += 20.0f;
                }
                if (object4 != 0 && \u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm9("i\u0430\u0440", i\u0430\u0440(int int float float float float ), (int)n, (int)n2, (float)(\u0435\u0456\u0458pi + 130.0f + f5), (float)(x\u0458e + f4 + this.\u0458\u0435hai.\u0430jxc + 20.0f), (float)f7, (float)13.0f) != false) {
                    this.ac\u0456\u0440ap = h\u04bb\u0455hpa2;
                }
                hcce.ixoie\u0456\u04bb.xx\u0445x\u0456\u0458p(class_45872, \u0435\u0456\u0458pi + 140.0f + f5, x\u0458e + f4 + this.\u0458\u0435hai.\u0430jxc + 20.0f, 12.0, 12.0, 3.0, xe\u0441e2.ex\u04bb\u0445());
                if (\u0445ic\u0441\u0458\u0456\u04456.\u0430jxc > 0.0f) {
                    hcce.ixoie\u0456\u04bb.xx\u0445x\u0456\u0458p(class_45872, \u0435\u0456\u0458pi + 140.0f + f5, x\u0458e + f4 + this.\u0458\u0435hai.\u0430jxc + 20.0f, 12.0, 12.0, 3.0, (Color)((Object)\u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm10("withAlpha", withAlpha(java.awt.Color int ), (Color)xe\u0441e2.aj\u0445\u043e(), (int)((int)\u0445ic\u0441\u0458\u0456\u04456.\u0430jxc))));
                }
                \u0455\u0435\u0445\u0430op\u04352.c\u043ehos\u0445(class_45872, \u0430\u0430p\u043e2.getName(), \u0435\u0456\u0458pi + 155.0f + f5, x\u0458e + f4 + this.\u0458\u0435hai.\u0430jxc + 19.0f + (float)(f6 < 0.4f ? 2 : 0), xe\u0441e2.\u04bb\u0455x\u04bb(), true, f6);
                f5 += f7;
            }
            f4 += 10.0f;
            this.\u0435o\u0445\u0445 = null;
            for (\u0430\u0430p\u043e \u0430\u0430p\u043e3 : this.\u0435c\u0435) {
                if (!\u0430\u0430p\u043e3.s\u0440\u0445x\u0440i\u0445() || \u0430\u0430p\u043e3.getValueType() != \u0456\u0445ss.\u0455\u0440\u0440) continue;
                \u043ea\u0441\u0430p \u043ea\u0441\u0430p2 = \u0430\u0430p\u043e3.getFloatValue();
                \u0445ic\u0441\u0458\u0456\u0445 \u0445ic\u0441\u0458\u0456\u04457 = this.s\u0455e\u043e\u0458.get(\u043ea\u0441\u0430p2);
                if (object4 != 0 && \u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm9("i\u0430\u0440", i\u0430\u0440(int int float float float float ), (int)n, (int)n2, (float)(\u0435\u0456\u0458pi + 140.0f), (float)(x\u0458e + f4 + this.\u0458\u0435hai.\u0430jxc + 39.5f), (float)(\u043ej\u043ep - 155.0f), (float)10.0f) != false) {
                    this.\u0435o\u0445\u0445 = \u043ea\u0441\u0430p2;
                }
                \u0455\u0435\u0445\u0430op\u04352.c\u043ehos\u0445(class_45872, \u0430\u0430p\u043e3.getName(), \u0435\u0456\u0458pi + 140.0f, x\u0458e + f4 + this.\u0458\u0435hai.\u0430jxc + 25.0f, xe\u0441e2.\u04bb\u0455x\u04bb(), true, 0.4);
                float f8 = \u043ea\u0441\u0430p2.e\u0440hj();
                float f9 = (float)\u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm13("round", round(float ), (float)(\u043ea\u0441\u0430p2.axpacc() * 100.0f)) / 100.0f;
                String string = f9 + (String)((Object)\u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-649368746 + 649368812, -805426309 + 805426245, -1757068653 + 1757068649}, (int)(273372382 + 1395658396), (int)(40774024 + 264235173))) + f8;
                \u0455\u0435\u0445\u0430op\u04352.c\u043ehos\u0445(class_45872, string, \u0435\u0456\u0458pi + \u043ej\u043ep - \u0455\u0435\u0445\u0430op\u04352.se\u0440\u0458i(string, 0.4) - 15.0f, x\u0458e + f4 + this.\u0458\u0435hai.\u0430jxc + 25.0f, xe\u0441e2.h\u0441\u0455\u0458(), true, 0.4);
                float f10 = (\u043ea\u0441\u0430p2.axpacc() - \u043ea\u0441\u0430p2.\u0440o\u0458\u0440()) / (\u043ea\u0441\u0430p2.e\u0440hj() - \u043ea\u0441\u0430p2.\u0440o\u0458\u0440());
                hcce.ixoie\u0456\u04bb.xx\u0445x\u0456\u0458p(class_45872, \u0435\u0456\u0458pi + 140.0f, x\u0458e + f4 + this.\u0458\u0435hai.\u0430jxc + 42.0f, \u043ej\u043ep - 155.0f, 4.0, 2.0, xe\u0441e2.ex\u04bb\u0445());
                \u0445ic\u0441\u0458\u0456\u04457.osj = (\u043ej\u043ep - 155.0f) * f10;
                \u0445ic\u0441\u0458\u0456\u04457.oxjc\u0456(true);
                hcce.ixoie\u0456\u04bb.xx\u0445x\u0456\u0458p(class_45872, \u0435\u0456\u0458pi + 140.0f, x\u0458e + f4 + this.\u0458\u0435hai.\u0430jxc + 42.0f, \u0445ic\u0441\u0458\u0456\u04457.\u0430jxc, 4.0, 2.0, xe\u0441e2.aj\u0445\u043e());
                hcce.ixoie\u0456\u04bb.xx\u0445x\u0456\u0458p(class_45872, \u0435\u0456\u0458pi + 136.0f + \u0445ic\u0441\u0458\u0456\u04457.\u0430jxc, x\u0458e + f4 + this.\u0458\u0435hai.\u0430jxc + 39.0f, 10.0, 10.0, 5.0, xe\u0441e2.aj\u0445\u043e());
                f4 += 25.0f;
            }
            this.hpc\u0430xe = null;
            for (\u0430\u0430p\u043e \u0430\u0430p\u043e4 : this.\u0435c\u0435) {
                if (!\u0430\u0430p\u043e4.s\u0440\u0445x\u0440i\u0445() || \u0430\u0430p\u043e4.getValueType() != \u0456\u0445ss.\u043e\u04bb\u0440\u0430i\u0435) continue;
                o\u043ea\u0456c o\u043ea\u0456c2 = \u0430\u0430p\u043e4.getModeValue();
                \u0445ic\u0441\u0458\u0456\u0445 \u0445ic\u0441\u0458\u0456\u04458 = this.s\u0455e\u043e\u0458.get(o\u043ea\u0456c2);
                \u0445ic\u0441\u0458\u0456\u04458.oxjc\u0456(true);
                \u0455\u0435\u0445\u0430op\u04352.c\u043ehos\u0445(class_45872, \u0430\u0430p\u043e4.getName(), \u0435\u0456\u0458pi + 140.0f, x\u0458e + f4 + this.\u0458\u0435hai.\u0430jxc + 25.0f, xe\u0441e2.\u04bb\u0455x\u04bb(), true, 0.4);
                f5 = 0.0f;
                f4 += 15.0f;
                for (int i = 0; i < o\u043ea\u0456c2.\u0440h\u0440\u0441().length; ++i) {
                    String string = o\u043ea\u0456c2.\u0440h\u0440\u0441()[i];
                    float f11 = \u0455\u0435\u0445\u0430op\u04352.se\u0440\u0458i(string, 0.4) + 20.0f;
                    if (f5 + f11 + 20.0f > \u043ej\u043ep - 155.0f) {
                        f5 = 0.0f;
                        f4 += 20.0f;
                    }
                    if (object4 != 0 && \u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm9("i\u0430\u0440", i\u0430\u0440(int int float float float float ), (int)n, (int)n2, (float)(\u0435\u0456\u0458pi + 140.0f + f5), (float)(x\u0458e + f4 + this.\u0458\u0435hai.\u0430jxc + 25.0f), (float)f11, (float)13.0f) != false) {
                        this.hpc\u0430xe = o\u043ea\u0456c2;
                        this.\u0435i\u0445\u04bb\u0430 = i;
                    }
                    hcce.ixoie\u0456\u04bb.xx\u0445x\u0456\u0458p(class_45872, \u0435\u0456\u0458pi + 140.0f + f5, x\u0458e + f4 + this.\u0458\u0435hai.\u0430jxc + 27.0f, 10.0, 10.0, 5.0, xe\u0441e2.ex\u04bb\u0445());
                    if (o\u043ea\u0456c2.cip(string)) {
                        hcce.ixoie\u0456\u04bb.xx\u0445x\u0456\u0458p(class_45872, \u0435\u0456\u0458pi + 141.0f + f5, x\u0458e + f4 + this.\u0458\u0435hai.\u0430jxc + 28.0f, 8.0, 8.0, 4.0, (Color)((Object)\u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm10("withAlpha", withAlpha(java.awt.Color int ), (Color)xe\u0441e2.aj\u0445\u043e(), (int)((int)\u0445ic\u0441\u0458\u0456\u04458.\u0430jxc))));
                    }
                    \u0455\u0435\u0445\u0430op\u04352.c\u043ehos\u0445(class_45872, string, \u0435\u0456\u0458pi + 152.0f + f5, x\u0458e + f4 + this.\u0458\u0435hai.\u0430jxc + 25.0f, o\u043ea\u0456c2.cip(string) ? xe\u0441e2.aj\u0445\u043e() : xe\u0441e2.h\u0441\u0455\u0458(), true, 0.4);
                    f5 += f11;
                }
                f4 += 20.0f;
            }
            for (\u0430\u0430p\u043e \u0430\u0430p\u043e5 : this.\u0435c\u0435) {
                Object object;
                boolean bl;
                if (!\u0430\u0430p\u043e5.s\u0440\u0445x\u0440i\u0445() || \u0430\u0430p\u043e5.getValueType() != \u0456\u0445ss.a\u0435x) continue;
                ih\u0430aa ih\u0430aa2 = \u0430\u0430p\u043e5.getStringValue();
                float f12 = \u0435\u0456\u0458pi + 140.0f;
                float f13 = x\u0458e + f4 + this.\u0458\u0435hai.\u0430jxc + 30.0f;
                float f14 = \u043ej\u043ep - 155.0f;
                boolean bl2 = this.opih\u0445s == ih\u0430aa2;
                boolean bl3 = bl = object4 != 0 && \u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm9("i\u0430\u0440", i\u0430\u0440(int int float float float float ), (int)n, (int)n2, (float)f12, (float)f13, (float)f14, (float)18.0f) != false;
                if (bl) {
                    this.j\u0445ese = ih\u0430aa2;
                }
                \u0455\u0435\u0445\u0430op\u04352.c\u043ehos\u0445(class_45872, \u0430\u0430p\u043e5.getName(), f12, f13 - 12.0f, xe\u0441e2.\u04bb\u0455x\u04bb(), true, 0.4);
                hcce.ixoie\u0456\u04bb.xx\u0445x\u0456\u0458p(class_45872, f12, f13, f14, 18.0, 4.0, bl2 ? xe\u0441e2.s\u0456xx\u0458() : xe\u0441e2.ae\u0435pi\u0430p());
                hcce.ixoie\u0456\u04bb.xx\u0445x\u0456\u0458p(class_45872, f12 + 6.0f, f13 + 16.0f, f14 - 12.0f, bl2 ? 1.5 : 1.0, 0.5, bl2 ? xe\u0441e2.aj\u0445\u043e() : xe\u0441e2.hsx());
                if (bl && !bl2) {
                    hcce.ixoie\u0456\u04bb.xx\u0445x\u0456\u0458p(class_45872, f12, f13, f14, 18.0, 4.0, (Color)((Object)\u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm10("withAlpha", withAlpha(java.awt.Color int ), (Color)xe\u0441e2.\u04bb\u0455x\u04bb(), (int)(-706143137 + 706143149))));
                }
                if ((object = ih\u0430aa2.axpacc()) == null) {
                    object = \u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[0], (int)(-1080190926 + 490161314), (int)(-1940435818 + 1972417873));
                }
                class_3322.method_51452();
                this.drawInputText((String)object, f12 + 7.0f, f13 + 9.0f, f14 - 14.0f, bl2, xe\u0441e2.\u04bb\u0455x\u04bb(), xe\u0441e2.aj\u0445\u043e());
                f4 += 35.0f;
            }
            this.j\u0456a\u0458j\u0455a = (float)\u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm11("max", max(float float ), (float)0.0f, (float)(f4 - (\u0441\u0445j - 45.0f)));
            this.sj\u0455\u0458\u0435 -= f4;
            this.renderScrollBar(class_45872, \u0435\u0456\u0458pi + \u043ej\u043ep - 8.0f, this.\u0458\u0435hai.\u0430jxc, this.sj\u0455\u0458\u0435, this.j\u0456a\u0458j\u0455a + \u0441\u0445j, this.xsox\u04bbhe, this.\u0441x\u0441\u0435, xe\u0441e2.aj\u0445\u043e());
        }
        if (this.\u0435cosh\u0435\u0435 != null) {
            float f16 = (float)((double)this.\u0435cosh\u0435\u0435.\u0440o\u0458\u0440() + (double)(this.\u0435cosh\u0435\u0435.e\u0440hj() - this.\u0435cosh\u0435\u0435.\u0440o\u0458\u0440()) * \u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm7("s\u0458\u0440", s\u0458\u0440(double double double ), (double)(((float)n - \u0435\u0456\u0458pi - 140.0f) / (\u043ej\u043ep - 160.0f)), (double)0.0, (double)1.0));
            this.\u0435cosh\u0435\u0435.hh\u0455j\u0456\u0430((float)\u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm13("round", round(float ), (float)(f16 / this.\u0435cosh\u0435\u0435.\u043e\u0430\u0440aj())) * this.\u0435cosh\u0435\u0435.\u043e\u0430\u0440aj());
        }
        if (this.\u0441ixh) {
            if (this.\u0456ep\u0430e\u0441e) {
                \u0435\u0456\u0458pi += (float)n - (float)this.eoa\u0456[0];
                x\u0458e += (float)n2 - (float)this.eoa\u0456[1];
                this.SetDragPosition(n, n2);
            }
            if (this.ps\u0445c\u043e && this.\u0455xa\u04bb != null && !this.x\u0440p\u043ej\u0435i) {
                \u043ej\u043ep = (float)\u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm11("max", max(float float ), (float)200.0f, (float)(\u043ej\u043ep + (float)n - (float)this.eoa\u0456[0]));
                \u0441\u0445j = (float)\u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm11("max", max(float float ), (float)150.0f, (float)(\u0441\u0445j + (float)n2 - (float)this.eoa\u0456[1]));
                this.SetDragPosition(n, n2);
            }
        }
        if (this.j\u0458\u0458pxp\u0455 != null) {
            this.\u0445\u043e\u0441\u043e.osj = 250.0f;
            this.h\u043eo\u0430xj\u0440 = this.j\u0458\u0458pxp\u0455.getName();
        } else {
            this.\u0445\u043e\u0441\u043e.osj = 5.0f;
        }
        this.\u0445\u043e\u0441\u043e.oxjc\u0456(true);
        if (this.\u0445\u043e\u0441\u043e.\u0430jxc > 6.0f) {
            \u0455\u0435\u0445\u0430op\u04352.\u0440hc\u0458(this.\u0445\u043e\u0441\u043e.\u0430jxc / 255.0f);
            String string = this.h\u043eo\u0430xj\u0440;
            byte[] byArray = new byte[-1082004290 + 1082004310];
            byArray[0] = -1183754794 + 1183754786;
            byArray[1] = -1577525905 + 1577526024;
            byArray[2] = -952682833 + 952682839;
            byArray[3] = -1059625726 + 1059625736;
            byArray[4] = -64888205 + 64888133;
            byArray[5] = -1;
            byArray[-2084202361 + 2084202367] = -140115028 + 140115039;
            byArray[-2112637306 + 2112637313] = -1214697188 + 1214697117;
            byArray[-4807764 + 4807772] = -1144330459 + 1144330339;
            byArray[-23373193 + 23373202] = -809110562 + 809110560;
            byArray[-1228286642 + 1228286652] = -1573349531 + 1573349620;
            byArray[-2139715314 + 2139715325] = -611731057 + 611731153;
            byArray[-48175477 + 48175489] = -2014062608 + 2014062511;
            byArray[-60841715 + 60841728] = -57213401 + 57213315;
            byArray[-264995292 + 264995306] = -562757166 + 562757070;
            byArray[-1453010803 + 1453010818] = -432122293 + 432122299;
            byArray[-1057305534 + 1057305550] = -1131138154 + 1131138266;
            byArray[-1894533832 + 1894533849] = -1648745571 + 1648745651;
            byArray[-1001497443 + 1001497461] = -366546983 + 366547070;
            byArray[-904197667 + 904197686] = -1891482346 + 1891482235;
            String string5 = (String)((Object)\u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(1940037193 + 96066323), (int)(-925644727 + 1257065335))) + string;
            byte[] byArray2 = new byte[-1439049865 + 1439049902];
            byArray2[0] = -1448544698 + 1448544570;
            byArray2[1] = -2122697175 + 2122697186;
            byArray2[2] = -998052346 + 998052264;
            byArray2[3] = -1231749398 + 1231749349;
            byArray2[4] = -1403521805 + 1403521683;
            byArray2[5] = -1916742449 + 1916742363;
            byArray2[-1935040837 + 1935040843] = -159165338 + 159165273;
            byArray2[-1927742748 + 1927742755] = -651812105 + 651812112;
            byArray2[-371662137 + 371662145] = -1980900229 + 1980900168;
            byArray2[-1912185885 + 1912185894] = -2044929910 + 2044929961;
            byArray2[-1044880000 + 1044880010] = -1864030231 + 1864030272;
            byArray2[-1070559022 + 1070559033] = -712442770 + 712442745;
            byArray2[-1078153923 + 1078153935] = -546955792 + 546955841;
            byArray2[-623688749 + 623688762] = -89269351 + 89269308;
            byArray2[-1883827726 + 1883827740] = -136842839 + 136842896;
            byArray2[-1790942524 + 1790942539] = -258546512 + 258546543;
            byArray2[-986445212 + 986445228] = -772648858 + 772648731;
            byArray2[-2066640101 + 2066640118] = -1129877242 + 1129877196;
            byArray2[-582328779 + 582328797] = -1881781899 + 1881781892;
            byArray2[-1877457496 + 1877457515] = -1560812587 + 1560812641;
            byArray2[-581391663 + 581391683] = -912935546 + 912935628;
            byArray2[-1559590863 + 1559590884] = -479798970 + 479798860;
            byArray2[-1395160770 + 1395160792] = -1752406263 + 1752406173;
            byArray2[-1058106642 + 1058106665] = -1339318336 + 1339318293;
            byArray2[-910327097 + 910327121] = -1557418170 + 1557418291;
            byArray2[-2111246358 + 2111246383] = -995923806 + 995923880;
            byArray2[-891886962 + 891886988] = -544463985 + 544464104;
            byArray2[-441386433 + 441386460] = -815453137 + 815453165;
            byArray2[-1530506761 + 1530506789] = -1868360898 + 1868360796;
            byArray2[-1515367625 + 1515367654] = -2050982691 + 2050982662;
            byArray2[-33288713 + 33288743] = -1598534092 + 1598534206;
            byArray2[-126497978 + 126498009] = -1760957086 + 1760956964;
            byArray2[-486513855 + 486513887] = -1391570808 + 1391570873;
            byArray2[-1261298454 + 1261298487] = -1076095241 + 1076095238;
            byArray2[-1033175211 + 1033175245] = -537238840 + 537238909;
            byArray2[-777734294 + 777734329] = -1021403963 + 1021403920;
            byArray2[-1788115856 + 1788115892] = -1454676932 + 1454676840;
            CallSite callSite = \u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray2, (int)(1390157312 + 333007028), (int)(-1408236682 + 1466630148));
            \u0455\u0435\u0445\u0430op\u04352.c\u043ehos\u0445(class_45872, string5, \u0435\u0456\u0458pi + this.pi\u0435.\u0430jxc / 2.0f - \u0455\u0435\u0445\u0430op\u04352.se\u0440\u0458i(string5, 0.6) / 2.0f, (double)x\u0458e + ((double)this.ep\u0441.\u0430jxc - \u0455\u0435\u0445\u0430op\u04352.he\u04bb(true, 0.6f)) / 2.0 - 10.0, xe\u0441e2.\u04bb\u0455x\u04bb(), true, 0.6);
            \u0455\u0435\u0445\u0430op\u04352.c\u043ehos\u0445(class_45872, (String)((Object)callSite), \u0435\u0456\u0458pi + this.pi\u0435.\u0430jxc / 2.0f - \u0455\u0435\u0445\u0430op\u04352.se\u0440\u0458i((String)((Object)callSite), 0.4) / 2.0f, (double)x\u0458e + ((double)this.ep\u0441.\u0430jxc - \u0455\u0435\u0445\u0430op\u04352.he\u04bb(true, 0.4f)) / 2.0 + 15.0, xe\u0441e2.h\u0441\u0455\u0458(), true, 0.4);
            \u0455\u0435\u0445\u0430op\u04352.\u0440hc\u0458(1.0f);
        }
        if (this.\u0458i\u0435i != null) {
            j\u0441c.eo\u043e.\u0440hc\u0458(0.5f);
            j\u0441c.eo\u043e.c\u043ehos\u0445(class_45872, \u0430\u0435\u0455\u043ej.j\u0441p\u0440\u0456, \u0435\u0456\u0458pi + this.pi\u0435.\u0430jxc - 10.0f, x\u0458e + this.ep\u0441.\u0430jxc - 10.0f, xe\u0441e2.h\u0441\u0455\u0458(), false, 0.3);
            j\u0441c.eo\u043e.\u0440hc\u0458(1.0f);
        }
        \u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm14("\u0440jc", \u0440jc());
    }

    private /* synthetic */ void renderScrollBar(class_4587 class_45872, float f, float f2, float f3, float f4, \u0445ic\u0441\u0458\u0456\u0445 \u0445ic\u0441\u0458\u0456\u04452, \u0456oc \u0456oc2, Color color) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (f4 <= \u0441\u0445j - 25.0f) {
            return;
        }
        \u0445ic\u0441\u0458\u0456\u04452.osj = \u0456oc2.\u0455\u0441p\u0440e(1000L) ? 0.0f : 255.0f;
        \u0445ic\u0441\u0458\u0456\u04452.oxjc\u0456(true);
        float f5 = \u0441\u0445j - 25.0f;
        float f6 = (float)\u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm7("s\u0458\u0440", s\u0458\u0440(double double double ), (double)(-f2 / -f3), (double)0.0, (double)1.0);
        CallSite callSite = \u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm11("max", max(float float ), (float)(f5 / f4 * f5), (float)20.0f);
        hcce.ixoie\u0456\u04bb.xx\u0445x\u0456\u0458p(class_45872, f, x\u0458e + 20.0f + f6 * (f5 - callSite), 3.0, (double)callSite, 1.5, (Color)((Object)\u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm10("withAlpha", withAlpha(java.awt.Color int ), (Color)color, (int)((int)\u0445ic\u0441\u0458\u0456\u04452.\u0430jxc))));
    }

    private /* synthetic */ void drawInputText(String string, float f, float f2, float f3, boolean bl, Color color, Color color2) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        String string2 = this.getVisibleInputText(string, f3);
        \u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm15("\u0456\u0440\u0430\u0455i\u0455", \u0456\u0440\u0430\u0455i\u0455(java.util.function.Consumer<io.github.humbleui.skija.Canvas> ), canvas -> {
            if ((3 * 3 + 3) % 2 == 0) {
            }
            \u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm17("\u0441sp", \u0441sp());
            \u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm19("a\u04bbp\u0445", a\u04bbp\u0445(float ), (float)((float)\u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm18("method_1551", method_1551()).method_22683().method_4495()));
            \u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm20("x\u0458\u0441x", x\u0458\u0441x(java.lang.String float float java.awt.Color io.github.humbleui.skija.Font ), (String)string2, (float)f, (float)f2, (Color)color, (Font)this.\u0435o\u0455);
            if (bl && \u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm21("currentTimeMillis", currentTimeMillis()) % 1000L < 540L) {
                float f3 = f + \u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm16("\u0441a\u0441\u0441", \u0441a\u0441\u0441(java.lang.String io.github.humbleui.skija.Font ), (String)string2, (Font)this.\u0435o\u0455) + 1.5f;
                \u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm22("ja\u0445\u0458", ja\u0445\u0458(float float float float java.awt.Color ), (float)f3, (float)(f2 - 5.0f), (float)1.0f, (float)10.0f, (Color)color2);
            }
            \u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm23("jj\u0430c\u04bb\u0455\u0455", jj\u0430c\u04bb\u0455\u0455());
        });
    }

    private /* synthetic */ String getVisibleInputText(String string, float f) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if (\u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm16("\u0441a\u0441\u0441", \u0441a\u0441\u0441(java.lang.String io.github.humbleui.skija.Font ), (String)string, (Font)this.\u0435o\u0455) <= f) {
            return string;
        }
        int n = 0;
        while (n < string.length()) {
            String string2 = string.substring(n);
            byte[] byArray = new byte[]{-502836650 + 502836614, -38174479 + 38174551, -1369206242 + 1369206251};
            String string3 = (String)((Object)\u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-2094756911 + 1367820506), (int)(1734224566 + 2129050510))) + string2;
            if (\u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm16("\u0441a\u0441\u0441", \u0441a\u0441\u0441(java.lang.String io.github.humbleui.skija.Font ), (String)string3, (Font)this.\u0435o\u0455) <= f) {
                return string3;
            }
            n = string.offsetByCodePoints(n, 1);
        }
        return \u0455\u0445\u0455\u0445\u0456o\u0456.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-511598313 + 511598201, -1794897786 + 1794897837, -24494637 + 24494737}, (int)(432864696 + 1540454373), (int)(1515861178 + 2074452292));
    }

    public /* synthetic */ void SetDragPosition(double d, double d2) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        this.SetDragPosition((int)d, (int)d2);
    }

    public /* synthetic */ void SetDragPosition(int n, int n2) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        this.eoa\u0456[0] = n;
        this.eoa\u0456[1] = n2;
    }

    static {
        \u0435\u0456\u0458pi = 100.0f;
        x\u0458e = 100.0f;
        \u043ej\u043ep = 400.0f;
        \u0441\u0445j = 250.0f;
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

    private static /* synthetic */ CallSite a_bsm4(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm5(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm6(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm7(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm8(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm9(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm10(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm11(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm12(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm13(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm14(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm15(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm16(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm17(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm18(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm19(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm20(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm21(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm22(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm23(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }
}

