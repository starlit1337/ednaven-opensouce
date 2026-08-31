/*
 * Decompiled with CFR 0.152.
 */
package \u0445eo;

import ie\u0441\u0430ej.pjxx;
import ie\u0441\u0430ej.\u0445ic\u0441\u0458\u0456\u0445;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_3417;
import spso.\u0441a\u0458p;
import \u043e\u0441\u0441c\u04bb.e\u043ep\u04bb;
import \u043e\u0441\u0441c\u04bb.\u0445hca\u0456\u0440\u043e;
import \u0440o\u0456\u0445o.\u0445\u0440\u0430\u0435\u0445\u043e;
import \u0440\u0440\u0440.s\u0430\u0441\u0430\u0458\u0445s;
import \u0440\u0440\u0440.\u0456\u0435coi;
import \u0445eo.\u0456p\u0430\u043e\u0458\u043e;
import \u0445eo.\u0458i\u0456x;
import \u0445\u0430p\u0440.\u043e\u0458\u0455sc\u0458;
import \u0455ch.ceh\u043e;

public class c\u0455pi
extends \u0441a\u0458p
implements pjxx {
    public static /* synthetic */ boolean x\u0445\u0430;
    private final /* synthetic */ \u0445ic\u0441\u0458\u0456\u0445 ho\u0456\u0441\u0441\u0435\u0455;
    private /* synthetic */ String o\u0445s\u0458\u0458j;
    private /* synthetic */ String \u0445\u0441\u0435a\u0456\u0435o;
    private /* synthetic */ String \u0458c\u0440i\u0458;
    private /* synthetic */ String cxc\u0456s\u0435p;
    private /* synthetic */ \u0458i\u0456x c\u0456j\u0441;
    private /* synthetic */ boolean \u04bbc\u043e\u0458\u0458;
    private /* synthetic */ int \u04bb\u0441c;
    private /* synthetic */ int p\u0445p\u0440;
    private final /* synthetic */ s\u0430\u0441\u0430\u0458\u0445s \u043e\u0458i\u0441\u0456;

    public c\u0455pi(String string, String string2, \u0458i\u0456x \u0458i\u0456x2) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        this.ho\u0456\u0441\u0441\u0435\u0455 = new \u0445ic\u0441\u0458\u0456\u0445(100.0f);
        this.cxc\u0456s\u0435p = c\u0455pi.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[0], (int)(691979220 + 1022796384), (int)(-1446678139 + 718234382));
        this.\u04bb\u0441c = 0;
        this.\u043e\u0458i\u0441\u0456 = new ceh\u043e(-1756673071 + 1756673321, 1.0).hs\u0430h\u0441(\u0456\u0435coi.\u0445\u0435\u0441\u0456\u0456o);
        this.o\u0445s\u0458\u0458j = string;
        this.\u0458c\u0440i\u0458 = string2;
        this.c\u0456j\u0441 = \u0458i\u0456x2;
        super.\u0445s\u0456cx\u0441(string);
        this.\u0445o\u0455();
    }

    public /* synthetic */ void \u0455\u04bb\u0458\u0435\u0435xs(String string) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        if (string == null) {
            this.cxc\u0456s\u0435p = null;
            x\u0445\u0430 = true;
        } else if (!string.equals(this.cxc\u0456s\u0435p)) {
            this.cxc\u0456s\u0435p = string;
            x\u0445\u0430 = true;
        }
    }

    private /* synthetic */ void \u0445o\u0455() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        StringBuilder stringBuilder = new StringBuilder();
        char[] cArray = this.o\u0445s\u0458\u0458j.toCharArray();
        for (int i = 0; i < cArray.length - 1; ++i) {
            if (c\u0455pi.a_bsm1("isLowerCase", isLowerCase(char ), (char)cArray[i]) != false && c\u0455pi.a_bsm2("isUpperCase", isUpperCase(char ), (char)cArray[i + 1]) != false) {
                stringBuilder.append(cArray[i]).append((String)((Object)c\u0455pi.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-17236982 + 17237074}, (int)(-1957226046 + 983673909), (int)(-114404905 + 1031005386))));
                continue;
            }
            stringBuilder.append(cArray[i]);
        }
        stringBuilder.append(cArray[cArray.length - 1]);
        this.\u0445\u0441\u0435a\u0456\u0435o = stringBuilder.toString();
    }

    protected /* synthetic */ void initModule() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (this.getClass().isAnnotationPresent(\u0456p\u0430\u043e\u0458\u043e.class)) {
            \u0456p\u0430\u043e\u0458\u043e \u0456p\u0430\u043e\u0458\u043e2 = this.getClass().getAnnotation(\u0456p\u0430\u043e\u0458\u043e.class);
            this.o\u0445s\u0458\u0458j = \u0456p\u0430\u043e\u0458\u043e2.sp\u0456p\u0445\u0435();
            this.\u0458c\u0440i\u0458 = \u0456p\u0430\u043e\u0458\u043e2.a\u0456j\u0430\u0455\u04bb();
            this.c\u0456j\u0441 = \u0456p\u0430\u043e\u0458\u043e2.s\u0455cj();
            super.\u0445s\u0456cx\u0441(this.o\u0445s\u0458\u0458j);
            this.\u0445o\u0455();
            ((\u0445\u0440\u0430\u0435\u0445\u043e)((Object)c\u0455pi.a_bsm3("jaa\u0435\u0445c", jaa\u0435\u0445c()))).\u0440\u0435c\u0456\u0441\u0441().a\u0435\u04bb\u0455(this);
        }
    }

    public /* synthetic */ void onEnable() {
    }

    public /* synthetic */ void onDisable() {
    }

    public /* synthetic */ void setEnabled(boolean bl) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        this.\u04bbi\u0445(bl, true);
    }

    public /* synthetic */ void \u04bbi\u0445(boolean bl, boolean bl2) {
        try {
            if (true | false) {
            }
            if (0 != 0) {
            }
            CallSite callSite = c\u0455pi.a_bsm3("jaa\u0435\u0445c", jaa\u0435\u0445c());
            if (bl) {
                this.\u04bbc\u043e\u0458\u0458 = true;
                ((\u0445\u0440\u0430\u0435\u0445\u043e)((Object)callSite)).\u0458poi\u0440().\u0441\u0430\u0456(this);
                this.onEnable();
                if (!(this instanceof \u043e\u0458\u0455sc\u0458)) {
                    c\u0455pi.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_5783(class_3417.field_14699, 0.5f, 1.3f);
                    if (bl2) {
                        byte[] byArray = new byte[-508387860 + 508387869];
                        byArray[0] = -1485638682 + 1485638680;
                        byArray[1] = -1900463910 + 1900463945;
                        byArray[2] = -52366152 + 52366035;
                        byArray[3] = -993724119 + 993724202;
                        byArray[4] = -364621474 + 364621490;
                        byArray[5] = -1358903325 + 1358903272;
                        byArray[-590007615 + 590007621] = -872314937 + 872315038;
                        byArray[-2069408397 + 2069408404] = -1581242326 + 1581242205;
                        byArray[-597516885 + 597516893] = -2119937935 + 2119937950;
                        \u0445hca\u0456\u0440\u043e \u0445hca\u0456\u0440\u043e2 = new \u0445hca\u0456\u0440\u043e(e\u043ep\u04bb.\u0456\u0430\u043ei\u04bbe, this.o\u0445s\u0458\u0458j, (String)((Object)c\u0455pi.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-987713575 + 815351264), (int)(-1277246615 + 219020674))), 3000L);
                        ((\u0445\u0440\u0430\u0435\u0445\u043e)((Object)callSite)).\u0441j\u0430\u0445io\u0455().is\u04bbj(\u0445hca\u0456\u0440\u043e2);
                    }
                }
            } else {
                this.\u04bbc\u043e\u0458\u0458 = false;
                ((\u0445\u0440\u0430\u0435\u0445\u043e)((Object)callSite)).\u0458poi\u0440().\u0455j\u043e\u0440o(this);
                this.onDisable();
                if (!(this instanceof \u043e\u0458\u0455sc\u0458)) {
                    c\u0455pi.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_5783(class_3417.field_15105, 0.5f, 0.8f);
                    if (bl2) {
                        byte[] byArray = new byte[-1403491854 + 1403491864];
                        byArray[0] = -183036915 + 183037004;
                        byArray[1] = 2;
                        byArray[2] = -101241263 + 101241258;
                        byArray[3] = -910167494 + 910167466;
                        byArray[4] = -990787125 + 990787234;
                        byArray[5] = -790164355 + 790164361;
                        byArray[-2050572687 + 2050572693] = -215637775 + 215637815;
                        byArray[-239355506 + 239355513] = -1210853111 + 1210853083;
                        byArray[-909599489 + 909599497] = -983621035 + 983620937;
                        byArray[-1107158839 + 1107158848] = -770177227 + 770177130;
                        \u0445hca\u0456\u0440\u043e \u0445hca\u0456\u0440\u043e3 = new \u0445hca\u0456\u0440\u043e(e\u043ep\u04bb.\u0458\u0456\u0430, this.o\u0445s\u0458\u0458j, (String)((Object)c\u0455pi.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(1877591952 + 1706626578), (int)(-2062428643 + 10334097))), 3000L);
                        ((\u0445\u0440\u0430\u0435\u0445\u043e)((Object)callSite)).\u0441j\u0430\u0445io\u0455().is\u04bbj(\u0445hca\u0456\u0440\u043e3);
                    }
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public /* synthetic */ void \u043e\u0440\u0440s\u0435() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        this.setEnabled(!this.\u04bbc\u043e\u0458\u0458);
        c\u0455pi.a_bsm4("\u0440\u043eae\u0430", \u0440\u043eae\u0430(java.lang.String boolean ), (String)this.getName(), (boolean)this.\u04bbc\u043e\u0458\u0458);
    }

    public /* synthetic */ \u0445ic\u0441\u0458\u0456\u0445 ei\u0445o\u0430eo() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return this.ho\u0456\u0441\u0441\u0435\u0455;
    }

    @Override
    public /* synthetic */ String getName() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return this.o\u0445s\u0458\u0458j;
    }

    public /* synthetic */ String \u0455a\u0440\u0430\u0455e() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return this.\u0445\u0441\u0435a\u0456\u0435o;
    }

    public /* synthetic */ String i\u04bb\u0435o\u0441\u0458a() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return this.\u0458c\u0440i\u0458;
    }

    public /* synthetic */ String \u0458s\u04bboca() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return this.cxc\u0456s\u0435p;
    }

    public /* synthetic */ \u0458i\u0456x cpho() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return this.c\u0456j\u0441;
    }

    public /* synthetic */ boolean \u0440\u0435\u0455x\u0435xe() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return this.\u04bbc\u043e\u0458\u0458;
    }

    public /* synthetic */ int jc\u0445\u04bbo\u0456e() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return this.\u04bb\u0441c;
    }

    public /* synthetic */ int x\u04bb\u043e\u04bb\u0456x() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return this.p\u0445p\u0440;
    }

    public c\u0455pi() {
        if (2 * 2 * 2 >= 0) {
        }
        this.ho\u0456\u0441\u0441\u0435\u0455 = new \u0445ic\u0441\u0458\u0456\u0445(100.0f);
        this.cxc\u0456s\u0435p = c\u0455pi.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[0], (int)(-738403434 + 1910204993), (int)(383355594 + 889897242));
        this.\u04bb\u0441c = 0;
        this.\u043e\u0458i\u0441\u0456 = new ceh\u043e(-1910099361 + 1910099611, 1.0).hs\u0430h\u0441(\u0456\u0435coi.\u0445\u0435\u0441\u0456\u0456o);
    }

    public /* synthetic */ void j\u0435\u0440(int n) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        this.\u04bb\u0441c = n;
    }

    public /* synthetic */ void \u04bb\u0441\u0440x(int n) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        this.p\u0445p\u0440 = n;
    }

    public /* synthetic */ s\u0430\u0441\u0430\u0458\u0445s oa\u0440() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return this.\u043e\u0458i\u0441\u0456;
    }

    static {
        x\u0445\u0430 = true;
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
}

