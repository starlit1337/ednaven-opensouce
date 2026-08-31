/*
 * Decompiled with CFR 0.152.
 */
package a\u0440\u04bbc\u0430\u04bb;

import ie\u0441\u0430ej.pjxx;
import io.github.humbleui.skija.Font;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import r.d8.Cade0e18b60fd9f037d8b2fc8;
import x\u0445so\u0456.i\u0430\u0455\u0455pi\u0430;
import x\u0445so\u0456.\u0430\u0435s;
import \u0441\u0430e\u043e.pxs\u0456\u04bbx;

public class \u04bbaio
implements pjxx {
    public static final /* synthetic */ DateTimeFormatter ixej;
    public static final /* synthetic */ String o\u0445\u0440ca;
    public static final /* synthetic */ String oeps\u0456;
    public static final /* synthetic */ String xo\u0456\u0430\u0435;
    public static final /* synthetic */ String o\u0455\u0445;
    public static final /* synthetic */ long p\u0435\u0445ssa = 3000L;
    public static final /* synthetic */ long a\u0445\u0430\u0445\u0440\u0456 = 2000L;
    public final /* synthetic */ i\u0430\u0455\u0455pi\u0430 he\u0455a\u0441\u0456;
    public final /* synthetic */ i\u0430\u0455\u0455pi\u0430 \u0455\u0440\u04bb;
    public final /* synthetic */ i\u0430\u0455\u0455pi\u0430 cx\u0440\u0458\u0458\u0456;
    public final /* synthetic */ i\u0430\u0455\u0455pi\u0430 a\u0435\u0455ci;
    public /* synthetic */ String ii\u043ecx\u04bbo;
    public /* synthetic */ String \u04bb\u0430\u0430;
    public /* synthetic */ long a\u0455xaioo;
    public /* synthetic */ long \u043ep\u0455\u0455\u0455;
    public /* synthetic */ long \u0445\u0456s\u0445;
    public /* synthetic */ boolean \u0455p\u0441c;
    public /* synthetic */ Color \u04bbai\u0430\u0455;
    public /* synthetic */ Color \u04bb\u043e\u0440\u0440;
    public /* synthetic */ Color xp\u0440\u0458\u043ec;
    public /* synthetic */ Color \u0458pij\u04bbo;
    public /* synthetic */ Color \u043e\u0441\u0456\u0455;
    public /* synthetic */ Color c\u0435\u0440eo\u0456\u0455;
    public /* synthetic */ Color p\u0435oa;
    public /* synthetic */ Color \u0440c\u0440\u0456\u0458p;
    public /* synthetic */ float e\u0435p\u0445ci\u0441;
    public /* synthetic */ float a\u0458c;
    public static final /* synthetic */ float \u0435\u0445sh\u0440 = 3.0f;
    public /* synthetic */ pxs\u0456\u04bbx i\u0430\u0430;
    public /* synthetic */ pxs\u0456\u04bbx \u0458x\u0456\u0456x;
    public /* synthetic */ Font s\u0440j\u0435p\u0440;

    public \u04bbaio() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        this.he\u0455a\u0441\u0456 = new i\u0430\u0455\u0455pi\u0430(\u0430\u0435s.s\u0458cs\u043e, 400L);
        this.\u0455\u0440\u04bb = new i\u0430\u0455\u0455pi\u0430(\u0430\u0435s.s\u0458cs\u043e, 300L);
        this.cx\u0440\u0458\u0458\u0456 = new i\u0430\u0455\u0455pi\u0430(\u0430\u0435s.s\u0458cs\u043e, 400L);
        this.a\u0435\u0455ci = new i\u0430\u0455\u0455pi\u0430(\u0430\u0435s.s\u0458cs\u043e, 300L);
        this.ii\u043ecx\u04bbo = \u04bbaio.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1545997952 + 1545997990, -590073711 + 590073661}, (int)(1487004393 + 1816060407), (int)(-1421822454 + 2127066110));
        this.\u04bb\u0430\u0430 = \u04bbaio.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[0], (int)(1080868830 + 1068154936), (int)(107326505 + 1618197168));
        this.a\u0455xaioo = 0L;
        this.\u043ep\u0455\u0455\u0455 = 0L;
        this.\u0445\u0456s\u0445 = (long)\u04bbaio.a_bsm1("currentTimeMillis", currentTimeMillis());
        this.\u0455p\u0441c = false;
        this.a\u0458c = 0.0f;
        this.s\u0440j\u0435p\u0440 = \u04bbaio.a_bsm2("\u0458haa\u0455\u0445", \u0458haa\u0455\u0445(float ), (float)10.0f);
    }

    public /* synthetic */ void cac\u0441(String string, String string2, long l2, Color color, Color color2, float f) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        boolean bl = string2 != null && !string2.isEmpty();
        this.\u04bb\u0430\u0430 = string.length() > (string2 == null ? 0 : string2.length()) ? string : string2;
        this.s\u0440j\u0435p\u0440 = bl ? \u04bbaio.a_bsm3("\u0458\u0435a", \u0458\u0435a(float ), (float)8.0f) : \u04bbaio.a_bsm3("\u0458\u0435a", \u0458\u0435a(float ), (float)10.0f);
        this.os\u0441h(string, l2, color, color2, f);
    }

    public /* synthetic */ void \u0455j\u0456\u043e\u0441(String string, long l2, Color color, Color color2) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        this.\u04bb\u0430\u0430 = string;
        this.s\u0440j\u0435p\u0440 = \u04bbaio.a_bsm2("\u0458haa\u0455\u0445", \u0458haa\u0455\u0445(float ), (float)10.0f);
        this.os\u0441h(string, l2, color, color2, 15.0f);
    }

    public /* synthetic */ void \u0430ja\u0440\u0445\u0430p(String string, boolean bl) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        CallSite callSite = bl ? \u04bbaio.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-812291873 + 812291808, -1056866650 + 1056866546, -2023078309 + 2023078358, -1391951060 + 1391950973}, (int)(-1511823007 + 4799690), (int)(-891367013 + 312806376)) : \u04bbaio.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-523215963 + 523215835, -1249179481 + 1249179584, -216488409 + 216488534, -296855580 + 296855568, -1926562022 + 1926562078}, (int)(-1787924339 + 1725139892), (int)(1055036607 + 1667501446));
        String string2 = string;
        String string3 = string2 + callSite;
        Color color = bl ? new Color(-1682166216 + 1682166292, -1733950040 + 1733950215, -264357871 + 264357951) : new Color(-112534962 + 112535206, -1229929426 + 1229929493, -975481757 + 975481811);
        Color color2 = bl ? new Color(-346735223 + 346735299, -75534332 + 75534507, -21842708 + 21842788, -170705457 + 170705607) : new Color(-1277946488 + 1277946732, -69246322 + 69246389, -1403418532 + 1403418586, -1148975339 + 1148975489);
        this.\u04bb\u0430\u0430 = string3;
        this.s\u0440j\u0435p\u0440 = \u04bbaio.a_bsm2("\u0458haa\u0455\u0445", \u0458haa\u0455\u0445(float ), (float)10.0f);
        this.os\u0441h(string3, 800L, color, color2, 15.0f);
    }

    private /* synthetic */ void os\u0441h(String string, long l2, Color color, Color color2, float f) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        this.p\u0435\u0458\u0455(string, l2);
        this.e\u0435p\u0445ci\u0441 = f;
        this.\u0458pij\u04bbo = this.p\u0435oa != null ? this.p\u0435oa : this.h\u0445ph().aj\u0445\u043e();
        this.xp\u0440\u0458\u043ec = this.\u0440c\u0440\u0456\u0458p != null ? this.\u0440c\u0440\u0456\u0458p : this.h\u0445ph().i\u0458\u0441\u0435e\u0440\u0440();
        this.\u04bb\u043e\u0440\u0440 = color;
        this.\u04bbai\u0430\u0455 = color2 != null && !color2.equals(color) ? color2 : this.h\u0445ph().\u04bbha();
        this.c\u0435\u0440eo\u0456\u0455 = this.h\u0445ph().aj\u0445\u043e();
        this.a\u0458c = 0.0f;
    }

    public /* synthetic */ void p\u0456\u0456\u0445oh\u043e(pxs\u0456\u04bbx pxs\u0456\u04bbx2) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        this.\u0458x\u0456\u0456x = null;
        this.i\u0430\u0430 = pxs\u0456\u04bbx2;
    }

    public /* synthetic */ void \u0456\u0430\u0440(pxs\u0456\u04bbx pxs\u0456\u04bbx2) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        if (this.i\u0430\u0430 != null) {
            boolean bl;
            double d = this.a\u0435\u0455ci.xax\u04bb();
            boolean bl2 = bl = d > 0.001 && d < 0.999;
            if (bl) {
                this.\u0458x\u0456\u0456x = null;
                this.a\u0435\u0455ci.a\u0435i\u0440(1.0);
                this.a\u0435\u0455ci.a\u0456ao\u04bbhi(1.0);
            } else {
                this.\u0458x\u0456\u0456x = this.i\u0430\u0430;
                this.a\u0435\u0455ci.a\u0435i\u0440(0.002);
                this.a\u0435\u0455ci.a\u0456ao\u04bbhi(0.002);
            }
        } else {
            this.\u0458x\u0456\u0456x = null;
        }
        this.i\u0430\u0430 = pxs\u0456\u04bbx2;
    }

    public /* synthetic */ void p\u0435\u0458\u0455(String string, long l2) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (string != null && !string.isEmpty()) {
            this.ii\u043ecx\u04bbo = string;
            this.a\u0455xaioo = (long)\u04bbaio.a_bsm1("currentTimeMillis", currentTimeMillis());
            this.\u043ep\u0455\u0455\u0455 = l2;
        }
    }

    /*
     * Unable to fully structure code
     */
    public /* synthetic */ void hi\u0458\u04bbcip() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        var1_1 = \u04bbaio.a_bsm1("currentTimeMillis", currentTimeMillis());
        if (this.ii\u043ecx\u04bbo.equals(\u04bbaio.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-620198719 + 620198793, -1818633343 + 1818633327}, (int)(-1387250983 + 949660433), (int)(447527532 + 1844825654)))) ** GOTO lbl-1000
        v0 = new byte[-1641057130 + 1641057137];
        v0[0] = -989691715 + 989691658;
        v0[1] = -264097985 + 264097857;
        v0[2] = -2125078590 + 2125078621;
        v0[3] = -376278374 + 376278401;
        v0[4] = -294521786 + 294521675;
        v0[5] = -3483397 + 3483523;
        v0[-91009862 + 91009868] = -1377762007 + 1377762097;
        if (!this.ii\u043ecx\u04bbo.equals(\u04bbaio.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])v0, (int)(-1490593623 + 1768208354), (int)(40591220 + 1257893360)))) {
            if (var1_1 - this.a\u0455xaioo > this.\u043ep\u0455\u0455\u0455) {
                this.\u0458x\u0456\u0456x = null;
                if (this.\u0455p\u0441c) {
                    v1 = new byte[-482868227 + 482868234];
                    v1[0] = -977835567 + 977835694;
                    v1[1] = -217942433 + 217942472;
                    v1[2] = -1385255147 + 1385255059;
                    v1[3] = -189892888 + 189892835;
                    v1[4] = -465505207 + 465505311;
                    v1[5] = -10129736 + 10129758;
                    v1[-1132471415 + 1132471421] = -1088916643 + 1088916752;
                    v2 = \u04bbaio.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])v1, (int)(1146377599 + 909059331), (int)(1518252819 + 800511778));
                } else {
                    v2 = \u04bbaio.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-912313737 + 912313845, -97729899 + 97729797}, (int)(-90253366 + 1826721718), (int)(293614828 + 1031346700));
                }
                this.ii\u043ecx\u04bbo = v2;
                this.s\u0440j\u0435p\u0440 = \u04bbaio.a_bsm2("\u0458haa\u0455\u0445", \u0458haa\u0455\u0445(float ), (float)10.0f);
                this.\u0458pij\u04bbo = this.p\u0435oa;
                this.xp\u0440\u0458\u043ec = this.\u0440c\u0440\u0456\u0458p;
                this.\u04bb\u043e\u0440\u0440 = null;
                this.\u04bbai\u0430\u0455 = null;
                this.a\u0458c = 0.0f;
                this.\u0445\u0456s\u0445 = (long)var1_1;
            }
        } else lbl-1000:
        // 2 sources

        {
            v3 = var3_2 = this.\u0455p\u0441c != false ? 2000L : 3000L;
            if (var1_1 - this.\u0445\u0456s\u0445 > var3_2) {
                v4 = this.\u0455p\u0441c = this.\u0455p\u0441c == false;
                if (this.\u0455p\u0441c) {
                    v5 = new byte[-247146693 + 247146700];
                    v5[0] = -520643960 + 520643927;
                    v5[1] = -1662803130 + 1662803218;
                    v5[2] = 0;
                    v5[3] = -2121128424 + 2121128331;
                    v5[4] = -1923703650 + 1923703757;
                    v5[5] = -93800049 + 93800009;
                    v5[-1913878060 + 1913878066] = -76400003 + 76399895;
                    v6 = \u04bbaio.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])v5, (int)(-1616323033 + 533848403), (int)(122085568 + 929848818));
                } else {
                    v6 = \u04bbaio.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-619408358 + 619408466, -328026955 + 328026995}, (int)(-250027121 + 1097682678), (int)(-30697367 + 88763148));
                }
                this.ii\u043ecx\u04bbo = v6;
                this.\u0445\u0456s\u0445 = (long)var1_1;
            }
        }
        this.a\u0435\u0455ci.\u0440\u0458jj\u0435hp(1.0);
        if (this.a\u0435\u0455ci.xax\u04bb() >= 1.0) {
            this.\u0458x\u0456\u0456x = null;
        }
    }

    public /* synthetic */ void \u0445\u04bb\u0458a() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        this.\u043e\u0441\u0456\u0455 = this.h\u0445ph().iejp\u04bb();
        this.c\u0435\u0440eo\u0456\u0455 = this.h\u0445ph().iejp\u04bb();
    }

    public /* synthetic */ void \u0456aee\u04bbee() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        if (this.\u043e\u0441\u0456\u0455 == null || this.c\u0435\u0440eo\u0456\u0455 == null) {
            this.\u043e\u0441\u0456\u0455 = this.h\u0445ph().iejp\u04bb();
            this.c\u0435\u0440eo\u0456\u0455 = this.h\u0445ph().iejp\u04bb();
        }
        if (this.\u04bbai\u0430\u0455 != null || this.\u04bb\u043e\u0440\u0440 != null || this.a\u0458c < 1.0f) {
            this.a\u0458c = (float)\u04bbaio.a_bsm4("jh\u0455a", jh\u0455a(float float float ), (float)this.a\u0458c, (float)1.0f, (float)3.0f);
            if (this.a\u0458c >= 0.999f) {
                this.a\u0458c = 1.0f;
            }
        }
    }

    static {
        o\u0445\u0440ca = \u04bbaio.a_fd("qy5LGus+PZfcwL3PjAY0kL2SDQ2m1FW1SL5gBFaD57Q=", "je8v7v3b/YMdKfKfuOVZrw==");
        oeps\u0456 = \u04bbaio.a_fd("0P1Bj0IubriMkX/baDs8XKzi0CtFOy1OkCAM8XvNZN4=", "je8v7v3b/YMdKfKfuOVZrw==");
        xo\u0456\u0430\u0435 = \u04bbaio.a_fd("KPnEbJAn3KzcY2dCXcFnfXMc8kpVLPr4miP9SRtqtz8=", "je8v7v3b/YMdKfKfuOVZrw==");
        o\u0455\u0445 = \u04bbaio.a_fd("Wd/rfuL/DQ4M8PODuFh/R0tM4IxIeadoYtTLpvU0dH4=", "je8v7v3b/YMdKfKfuOVZrw==");
        ixej = DateTimeFormatter.ofPattern(Cade0e18b60fd9f037d8b2fc8.cachedDecodeString(new byte[]{-1679353941 + 1679353827, -656851490 + 656851527, -371613380 + 371613366, -579952475 + 579952367, -702624505 + 702624484}, -689297754 + 1101197798, -1942766410 + 312009238));
    }

    private static /* synthetic */ String a_fd(String string, String string2) {
        if (2 * 2 * 2 >= 0) {
        }
        if (string == null) {
            return null;
        }
        try {
            byte[] byArray = ((Base64.Decoder)((Object)\u04bbaio.a_bsm5("getDecoder", getDecoder()))).decode(string);
            byte[] byArray2 = new byte[-495485632 + 495485648];
            \u04bbaio.a_bsm6("arraycopy", arraycopy(java.lang.Object int java.lang.Object int int ), (Object)byArray, (int)0, (Object)byArray2, (int)0, (int)(-303082371 + 303082387));
            byte[] byArray3 = new byte[byArray.length - (-917974404 + 917974420)];
            \u04bbaio.a_bsm6("arraycopy", arraycopy(java.lang.Object int java.lang.Object int int ), (Object)byArray, (int)(-77502900 + 77502916), (Object)byArray3, (int)0, (int)byArray3.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(((Base64.Decoder)((Object)\u04bbaio.a_bsm5("getDecoder", getDecoder()))).decode(string2), "AES");
            CallSite callSite = \u04bbaio.a_bsm7("getInstance", getInstance(java.lang.String ), (String)"AES/CBC/PKCS5Padding");
            ((Cipher)((Object)callSite)).init(2, secretKeySpec, new IvParameterSpec(byArray2));
            return new String(((Cipher)((Object)callSite)).doFinal(byArray3), "UTF-8");
        }
        catch (Exception exception) {
            throw new IllegalStateException("Encrypted field string decode failed");
        }
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
}

