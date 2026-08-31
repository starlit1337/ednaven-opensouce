/*
 * Decompiled with CFR 0.152.
 */
package \u0440\u0440e;

import c\u0445is.ex\u0441s\u04bbp\u0435;
import c\u0445is.hoi\u0435h\u0440;
import c\u0445is.h\u0430p\u043ee\u0440;
import c\u0445is.\u04bbj\u0441x\u0440;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.ArrayDeque;
import java.util.Deque;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1937;
import net.minecraft.class_2596;
import net.minecraft.class_2663;
import net.minecraft.class_2749;
import net.minecraft.class_5892;
import net.minecraft.class_7439;
import o\u0455sio\u0440.\u0445\u0458\u0458h\u0445\u0430a;
import spso.\u0430c\u0440;
import spso.\u0441a\u0458p;
import \u0435xp.o\u043ea\u0456c;
import \u043e\u0445\u0440\u0430ose.i\u0456\u0445\u0430\u0441p;
import \u0440\u0440e.\u0435oax;
import \u0445eo.c\u0455pi;
import \u0445eo.\u0456p\u0430\u043e\u0458\u043e;
import \u0445eo.\u0458i\u0456x;

@\u0456p\u0430\u043e\u0458\u043e(sp\u0456p\u0445\u0435="KillSay", a\u0456j\u0430\u0455\u04bb="Automatically sends a message after killing a player", s\u0455cj=\u0458i\u0456x.MISC)
public class \u0441\u0430ci
extends c\u0455pi {
    private static final /* synthetic */ long eaeaj = 5000L;
    private static final /* synthetic */ long \u0435h\u0456\u0441\u0430sj = 15000L;
    private final /* synthetic */ o\u043ea\u0456c \u0441\u0458a;
    private final /* synthetic */ Deque<\u0435oax> s\u0458\u0441\u0430\u0445;
    private /* synthetic */ class_1657 p\u043ecs\u0458j;
    private /* synthetic */ long a\u0445\u0445;
    private /* synthetic */ boolean jsjshep;
    private static /* synthetic */ int __js_dispatch_state = 0;

    public \u0441\u0430ci() {
        if (true | false) {
        }
        String[] stringArray = new String[3];
        byte[] byArray = new byte[-243974369 + 243974376];
        byArray[0] = -1518996262 + 1518996156;
        byArray[1] = -606313433 + 606313464;
        byArray[2] = -1541356345 + 1541356254;
        byArray[3] = -1768600790 + 1768600779;
        byArray[4] = -1906744441 + 1906744369;
        byArray[5] = -746747885 + 746748001;
        byArray[-1158761980 + 1158761986] = -808077691 + 808077807;
        stringArray[0] = \u0441\u0430ci.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(2057504752 + 237142228), (int)(-925527150 + 919301134));
        byte[] byArray2 = new byte[-1407602200 + 1407602206];
        byArray2[0] = -616455920 + 616455943;
        byArray2[1] = -1910743632 + 1910743519;
        byArray2[2] = -595299947 + 595299955;
        byArray2[3] = -1407899247 + 1407899180;
        byArray2[4] = -1627602 + 1627528;
        byArray2[5] = 5;
        stringArray[1] = \u0441\u0430ci.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray2, (int)(1908266759 + 2093815683), (int)(-426534666 + 1440588666));
        stringArray[2] = \u0441\u0430ci.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-399872165 + 399872051, -1695541316 + 1695541400, -1953798650 + 1953798648, -554842395 + 554842307, -1696396804 + 1696396893}, (int)(-552441723 + 1251393828), (int)(-782612467 + 802797862));
        this.\u0441\u0458a = ((\u0430c\u0440)((Object)\u0441\u0430ci.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)\u0441\u0430ci.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-627820784 + 627820742, -977799611 + 977799570, -631301667 + 631301761, -101137939 + 101137871}, (int)(1679563986 + 2003418803), (int)(-544213612 + 1531856201)))))).\u0455iaip\u0458e(stringArray).a\u04bbs(0).\u0458c\u0456\u0440().getModeValue();
        this.s\u0458\u0441\u0430\u0445 = new ArrayDeque<\u0435oax>();
    }

    @Override
    public /* synthetic */ void onDisable() {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        this.\u0441\u0458e();
    }

    @\u0445\u0458\u0458h\u0445\u0430a
    public void \u0440xsx(ex\u0441s\u04bbp\u0435 ex\u0441s\u04bbp\u04352) {
        class_1657 class_16572;
        class_1297 class_12972;
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (true | false) {
        }
        if (0 != 0) {
        }
        if ((class_12972 = ex\u0441s\u04bbp\u04352.\u0458s\u0430()) instanceof class_1657 && (class_16572 = (class_1657)class_12972) != \u0441\u0430ci.\u0430\u0445j\u0445s\u0456\u04bb.field_1724) {
            this.p\u043ecs\u0458j = class_16572;
            this.a\u0445\u0445 = (long)\u0441\u0430ci.a_bsm2("currentTimeMillis", currentTimeMillis());
            this.jsjshep = false;
        }
    }

    @\u0445\u0458\u0458h\u0445\u0430a
    public void o\u043eec\u04bb\u0445h(\u04bbj\u0441x\u0440 \u04bbj\u0441x\u04402) {
        class_2749 class_27492;
        block14: {
            block13: {
                boolean bl = false;
                if (bl) {
                    __js_dispatch_state = 0;
                }
                if ((3 * 3 + 3) % 2 == 0) {
                }
                if (0 != 0) {
                }
                if (\u04bbj\u0441x\u04402.p\u0440\u04bb() != i\u0456\u0445\u0430\u0441p.h\u0430\u043e) break block13;
                if (\u0441\u0430ci.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 != null) break block14;
            }
            return;
        }
        class_2596<?> class_25962 = \u04bbj\u0441x\u04402.ciao\u0455\u0455();
        if (class_25962 instanceof class_2749 && \u0441\u0430ci.$_h1f2zahi1ngan17l87((class_27492 = (class_2749)class_25962).method_11833() == 0.0f ? 0 : ((class_27492 = (class_2749)class_25962).method_11833() < 0.0f ? -1 : 1)) <= 0) {
            this.\u0441\u0430hpes();
            return;
        }
        class_25962 = \u04bbj\u0441x\u04402.ciao\u0455\u0455();
        if (class_25962 instanceof class_5892 && (class_27492 = (class_5892)class_25962).comp_2275() == \u0441\u0430ci.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_5628()) {
            this.\u0441\u0430hpes();
            return;
        }
        class_25962 = \u04bbj\u0441x\u04402.ciao\u0455\u0455();
        if (class_25962 instanceof class_2663) {
            class_27492 = (class_2663)class_25962;
            if (\u0441\u0430ci.\u0430\u0445j\u0445s\u0456\u04bb.field_1687 != null && class_27492.method_11470() == 3) {
                class_25962 = class_27492.method_11469((class_1937)\u0441\u0430ci.\u0430\u0445j\u0445s\u0456\u04bb.field_1687);
                if (class_25962 == \u0441\u0430ci.\u0430\u0445j\u0445s\u0456\u04bb.field_1724) {
                    this.\u0441\u0430hpes();
                    return;
                }
                if (class_25962 == this.p\u043ecs\u0458j && \u0441\u0430ci.$_h1f2zahj1ngan17l88((long)(\u0441\u0430ci.a_bsm2("currentTimeMillis", currentTimeMillis()) - this.a\u0445\u0445) == 5000L ? 0 : ((long)(\u0441\u0430ci.a_bsm2("currentTimeMillis", currentTimeMillis()) - this.a\u0445\u0445) < 5000L ? -1 : 1)) <= 0) {
                    this.\u0445aj\u0430\u04bbo();
                    return;
                }
            }
        }
        if ((class_25962 = \u04bbj\u0441x\u04402.ciao\u0455\u0455()) instanceof class_7439 && this.\u0445oe\u0440\u0440((class_27492 = (class_7439)class_25962).comp_763().getString())) {
            this.\u0445aj\u0430\u04bbo();
        }
    }

    @\u0445\u0458\u0458h\u0445\u0430a
    public void \u04bbo\u0435(hoi\u0435h\u0440 hoi\u0435h\u04402) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (\u0441\u0430ci.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 == null || \u0441\u0430ci.\u0430\u0445j\u0445s\u0456\u04bb.field_1687 == null || \u0430\u0445j\u0445s\u0456\u04bb.method_1562() == null) {
            this.\u0441\u0458e();
            return;
        }
        CallSite callSite = \u0441\u0430ci.a_bsm2("currentTimeMillis", currentTimeMillis());
        while (!this.s\u0458\u0441\u0430\u0445.isEmpty() && \u0441\u0430ci.$_h1f2zahk1ngan17l89(this.s\u0458\u0441\u0430\u0445.peekFirst().\u04bbjea\u0430() == (long)callSite ? 0 : (this.s\u0458\u0441\u0430\u0445.peekFirst().\u04bbjea\u0430() < (long)callSite ? -1 : 1)) <= 0) {
            \u0430\u0445j\u0445s\u0456\u04bb.method_1562().method_45729(this.s\u0458\u0441\u0430\u0445.removeFirst().aes());
        }
        if (this.p\u043ecs\u0458j == null) {
            return;
        }
        if (\u0441\u0430ci.$_h1f2zahl1ngan17l8a((long)(callSite - this.a\u0445\u0445) == 15000L ? 0 : ((long)(callSite - this.a\u0445\u0445) < 15000L ? -1 : 1)) > 0) {
            this.p\u043ecs\u0458j = null;
        }
    }

    @\u0445\u0458\u0458h\u0445\u0430a
    public void \u0458\u0435p\u043e\u0435aa(h\u0430p\u043ee\u0440 h\u0430p\u043ee\u04402) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        this.\u0441\u0458e();
    }

    private /* synthetic */ void \u0445aj\u0430\u04bbo() {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (this.jsjshep || \u0430\u0445j\u0445s\u0456\u04bb.method_1562() == null) {
            this.p\u043ecs\u0458j = null;
            return;
        }
        CallSite callSite = \u0441\u0430ci.a_bsm2("currentTimeMillis", currentTimeMillis());
        CallSite callSite2 = \u0441\u0430ci.a_bsm3("s\u0456j\u04bbi", s\u0456j\u04bbi(\u0435xp.o\u043ea\u0456c ), (o\u043ea\u0456c)this.\u0441\u0458a);
        \u0430\u0445j\u0445s\u0456\u04bb.method_1562().method_45729((String)((Object)callSite2));
        this.s\u0458\u0441\u0430\u0445.addLast(new \u0435oax((String)((Object)callSite2), (long)(callSite + 1000L)));
        this.p\u043ecs\u0458j = null;
    }

    /*
     * Unable to fully structure code
     */
    private /* synthetic */ boolean \u0445oe\u0440\u0440(String var1_1) {
        var111_2 = false;
        if (var111_2) {
            \u0441\u0430ci.__js_dispatch_state = 0;
        }
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if (this.p\u043ecs\u0458j == null || \u0441\u0430ci.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 == null) {
            return (boolean)\u0441\u0430ci.$_h1f2zahg1ngan17l85(0);
        }
        var2_3 = var1_1.replace((CharSequence)\u0441\u0430ci.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-2019330343 + 2019330270}, (int)(-1122384872 + 434967278), (int)(2087372614 + 554161708)), (CharSequence)\u0441\u0430ci.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[0], (int)(-60530241 + 1301407799), (int)(1094528062 + 553203191)));
        var3_4 = this.p\u043ecs\u0458j.method_7334().getName().replace((CharSequence)\u0441\u0430ci.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{1}, (int)(597419928 + 2103359842), (int)(290562208 + 1656542062)), (CharSequence)\u0441\u0430ci.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[0], (int)(-420608182 + 1668891420), (int)(1303857442 + 370285222)));
        var4_5 = this.p\u043ecs\u0458j.method_5476().getString().replace((CharSequence)\u0441\u0430ci.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-800146627 + 800146718}, (int)(1782346141 + 205784291), (int)(-910288309 + 1590562368)), (CharSequence)\u0441\u0430ci.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[0], (int)(2065670089 + 25746654), (int)(787547277 + 913006799)));
        var5_6 = \u0441\u0430ci.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_7334().getName().replace((CharSequence)\u0441\u0430ci.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-936557756 + 936557876}, (int)(-1915404778 + 2047134147), (int)(600669942 + 106015528)), (CharSequence)\u0441\u0430ci.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[0], (int)(-279985320 + 1190818545), (int)(-1354247720 + 1067064585)));
        var6_7 = \u0441\u0430ci.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_5476().getString().replace((CharSequence)\u0441\u0430ci.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1806118569 + 1806118649}, (int)(-1720663471 + 1721777599), (int)(1617181003 + 2117641553)), (CharSequence)\u0441\u0430ci.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[0], (int)(778423664 + 2097667581), (int)(1914563318 + 2119697791)));
        var7_8 = var2_3.contains(var3_4) != false || var2_3.contains(var4_5) != false;
        var9_9 = var5_6;
        v0 = new byte[-890271900 + 890271906];
        v0[0] = -438781531 + 438781434;
        v0[1] = -2018927380 + 2018927323;
        v0[2] = -1934122578 + 1934122683;
        v0[3] = -734649341 + 734649261;
        v0[4] = -1850385156 + 1850385212;
        v0[5] = -811005595 + 811005530;
        if (var2_3.contains((String)\u0441\u0430ci.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1076398163 + 1076398043, -1276226177 + 1276226076, -1727765087 + 1727765168}, (int)(1903020904 + 1490747103), (int)(-1398414044 + 864680715)) + var9_9 + (String)\u0441\u0430ci.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])v0, (int)(442945332 + 312696277), (int)(1270307194 + 1497058168)))) ** GOTO lbl-1000
        var10_10 = var6_7;
        v1 = new byte[-414262518 + 414262524];
        v1[0] = -546949239 + 546949140;
        v1[1] = -2010067657 + 2010067649;
        v1[2] = -1401349784 + 1401349855;
        v1[3] = -1975793307 + 1975793297;
        v1[4] = -20706126 + 20706038;
        v1[5] = -166670928 + 166670979;
        if (var2_3.contains((String)\u0441\u0430ci.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1021620620 + 1021620691, -335226563 + 335226604, -1699613902 + 1699613828}, (int)(2133564624 + 1257450830), (int)(-2108701668 + 1601379750)) + var10_10 + (String)\u0441\u0430ci.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])v1, (int)(1249645244 + 1526108854), (int)(-1755940411 + 254815424)))) lbl-1000:
        // 2 sources

        {
            v2 = true;
            if (0 != 0 && 0 != 1 && 0 != 2) {
                // empty if block
            }
        } else {
            v2 = var8_11 = false;
        }
        if (var7_8 && var8_11) {
            v3 = 1;
            if (var111_2) {
                \u0441\u0430ci.__js_dispatch_state = 0;
            }
        } else {
            v3 = 0;
        }
        return (boolean)\u0441\u0430ci.$_h1f2zahh1ngan17l86(v3);
    }

    private /* synthetic */ void \u0441\u0430hpes() {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        this.jsjshep = true;
        this.p\u043ecs\u0458j = null;
        this.s\u0458\u0441\u0430\u0445.clear();
    }

    private /* synthetic */ void \u0441\u0458e() {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        this.p\u043ecs\u0458j = null;
        this.a\u0445\u0445 = 0L;
        this.jsjshep = false;
        this.s\u0458\u0441\u0430\u0445.clear();
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

    private static /* synthetic */ int $_h1f2zahg1ngan17l85(int n) {
        return n;
    }

    private static /* synthetic */ int $_h1f2zahh1ngan17l86(int n) {
        return n;
    }
}

