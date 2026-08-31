/*
 * Decompiled with CFR 0.152.
 */
package \u0440\u0440e;

import c\u0445is.i\u0456o\u0430\u0435o;
import c\u0445is.\u0430j\u0445;
import h\u0441\u043e\u04bb\u0441\u0458\u0445.c\u0455i\u0430\u0440\u0445;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1829;
import net.minecraft.class_1922;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_2382;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_3610;
import net.minecraft.class_3611;
import net.minecraft.class_3612;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_4538;
import net.minecraft.class_4587;
import net.minecraft.class_742;
import net.minecraft.class_757;
import o\u0455sio\u0440.\u0445\u0458\u0458h\u0445\u0430a;
import spso.\u0430c\u0440;
import spso.\u0441a\u0458p;
import \u0435xp.h\u04bb\u0455hpa;
import \u0435xp.\u043ea\u0441\u0430p;
import \u043e\u0445\u0440\u0430ose.i\u0456\u0445\u0430\u0441p;
import \u0440expho.hc\u0445o;
import \u0440expho.h\u0455\u0445a\u0456s;
import \u0440expho.\u0441\u043e\u0456;
import \u0440o\u0456\u0445o.\u0445\u0440\u0430\u0435\u0445\u043e;
import \u0440\u0440e.c\u0435so\u0430;
import \u0440\u0440e.eh\u043e\u043ehi;
import \u0440\u0440e.i\u0456\u0441\u043e\u043ei;
import \u0440\u0440e.jx\u0456p\u043e;
import \u0440\u0440e.pcx\u0435\u04bb\u0456\u0445;
import \u0440\u0440e.p\u0445\u0445o\u043e;
import \u0440\u0440e.xc\u0455;
import \u0440\u0440e.\u0430es\u0441c\u0441i;
import \u0441\u0445o.jax\u0458\u0435\u0458;
import \u0445eo.c\u0455pi;
import \u0445eo.\u0456p\u0430\u043e\u0458\u043e;
import \u0445eo.\u0458i\u0456x;
import \u0458\u0458\u0458o\u0430\u0456.e\u0445\u0440\u0440a;

@\u0456p\u0430\u043e\u0458\u043e(sp\u0456p\u0445\u0435="AutoWeb", a\u0456j\u0430\u0455\u04bb="Automatically traps nearby players", s\u0455cj=\u0458i\u0456x.MISC)
public class \u0458ac
extends c\u0455pi {
    private final /* synthetic */ \u043ea\u0441\u0430p \u0445\u0441s;
    private final /* synthetic */ \u043ea\u0441\u0430p ai\u0435\u04bb\u0440;
    private final /* synthetic */ h\u04bb\u0455hpa \u0435h\u043ecoo\u0441;
    private final /* synthetic */ h\u04bb\u0455hpa hc\u0458c\u0440a;
    private final /* synthetic */ h\u04bb\u0455hpa xi\u0440;
    private final /* synthetic */ h\u04bb\u0455hpa jcjs\u0441\u043e;
    private /* synthetic */ p\u0445\u0445o\u043e \u0445ec\u0458jpa;
    private /* synthetic */ xc\u0455 \u0455\u0441\u0455\u0458\u043e;
    private /* synthetic */ i\u0456\u0441\u043e\u043ei a\u043e\u0455\u0440s;
    private /* synthetic */ class_1297 \u0456\u0455\u0430\u04bbij;
    private /* synthetic */ class_2338 \u043e\u0440\u0441xp;
    private /* synthetic */ int \u0430x\u0456\u0435p;
    private /* synthetic */ int ca\u0456ac;
    private /* synthetic */ int h\u0440i\u04bb\u0458a\u0435;
    private /* synthetic */ int x\u0445\u0441;
    private /* synthetic */ int ej\u0435e;
    private /* synthetic */ int s\u043exh\u0430;
    private /* synthetic */ boolean x\u0458\u043ej;
    private /* synthetic */ boolean \u0445\u0445\u04bbo;
    private /* synthetic */ c\u0435so\u0430 \u04bbc\u043es\u0440a;
    private /* synthetic */ \u0430es\u0441c\u0441i \u043ehssa;
    private /* synthetic */ class_2338 \u04bbe\u0441e\u0458jp;
    private /* synthetic */ int \u0458\u04bbo;
    private /* synthetic */ boolean \u0440\u0458\u0440;
    private /* synthetic */ int \u0435ah;
    private static /* synthetic */ int __js_dispatch_state = 0;

    public \u0458ac() {
        if (true | false) {
        }
        this.\u0445\u0441s = ((\u0430c\u0440)((Object)\u0458ac.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)\u0458ac.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1504820473 + 1504820471, -729598919 + 729599038, -787892567 + 787892633, -239516073 + 239516178, -274398476 + 274398603}, (int)(1731716663 + 873248013), (int)(-1506107256 + 949370440)))))).s\u0458\u0458a(4.0f).x\u0455heah\u0445(0.1f).\u043ecxi\u0455(3.0f).a\u0455\u0445\u0435c(5.0f).\u0458c\u0456\u0440().getFloatValue();
        this.ai\u0435\u04bb\u0440 = ((\u0430c\u0440)((Object)\u0458ac.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)\u0458ac.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-402219960 + 402219913, -233407486 + 233407410, -355860993 + 355861056, -687701719 + 687701828, -2111647391 + 2111647518}, (int)(-1287147229 + 1227115336), (int)(-1420297440 + 1162999176)))))).s\u0458\u0458a(4.0f).x\u0455heah\u0445(1.0f).\u043ecxi\u0455(1.0f).a\u0455\u0445\u0435c(20.0f).\u0458c\u0456\u0440().getFloatValue();
        byte[] byArray = new byte[-745848207 + 745848213];
        byArray[0] = -1546965521 + 1546965554;
        byArray[1] = -1200158075 + 1200158106;
        byArray[2] = -1983807102 + 1983807000;
        byArray[3] = -2066802213 + 2066802302;
        byArray[4] = -1259410247 + 1259410157;
        byArray[5] = -1044397084 + 1044397129;
        this.\u0435h\u043ecoo\u0441 = ((\u0430c\u0440)((Object)\u0458ac.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)\u0458ac.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-870662587 + 553791191), (int)(2039532079 + 1725109812)))))).\u0455xi\u0440(true).\u0458c\u0456\u0440().getBooleanValue();
        byte[] byArray2 = new byte[-703531517 + 703531527];
        byArray2[0] = -1171484658 + 1171484744;
        byArray2[1] = -1812405913 + 1812405825;
        byArray2[2] = -797950816 + 797950890;
        byArray2[3] = -341604165 + 341604146;
        byArray2[4] = -1706272585 + 1706272512;
        byArray2[5] = -495823220 + 495823323;
        byArray2[-1529059201 + 1529059207] = -1684845103 + 1684845095;
        byArray2[-298538891 + 298538898] = -449689498 + 449689425;
        byArray2[-1181843505 + 1181843513] = -1437033160 + 1437033036;
        byArray2[-1071467059 + 1071467068] = -1993125261 + 1993125165;
        this.hc\u0458c\u0440a = ((\u0430c\u0440)((Object)\u0458ac.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)\u0458ac.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray2, (int)(-391086311 + 1267512611), (int)(-1595679193 + 71485183)))))).\u0455xi\u0440(false).\u0458c\u0456\u0440().getBooleanValue();
        this.xi\u0440 = ((\u0430c\u0440)((Object)\u0458ac.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)\u0458ac.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1082121165 + 1082121173, -198704565 + 198704438, -1244298006 + 1244297970, -1401813650 + 1401813634}, (int)(-2108737266 + 1848751986), (int)(644984710 + 1131919971)))))).\u0455xi\u0440(true).\u0458c\u0456\u0440().getBooleanValue();
        byte[] byArray3 = new byte[-1260559102 + 1260559117];
        byArray3[0] = -1879849303 + 1879849347;
        byArray3[1] = -880101342 + 880101419;
        byArray3[2] = -1613386779 + 1613386874;
        byArray3[3] = -232956049 + 232955947;
        byArray3[4] = -76077431 + 76077382;
        byArray3[5] = -1932674187 + 1932674296;
        byArray3[-1643262788 + 1643262794] = -2007435660 + 2007435774;
        byArray3[-2113681002 + 2113681009] = -1676728411 + 1676728500;
        byArray3[-1682934649 + 1682934657] = -1359923677 + 1359923725;
        byArray3[-1930724971 + 1930724980] = -351799307 + 351799364;
        byArray3[-2102159137 + 2102159147] = -709917696 + 709917599;
        byArray3[-238687624 + 238687635] = -974198957 + 974198993;
        byArray3[-795245500 + 795245512] = -1579018497 + 1579018451;
        byArray3[-2056592260 + 2056592273] = -1305204876 + 1305204784;
        byArray3[-587335674 + 587335688] = -1849265746 + 1849265869;
        this.jcjs\u0441\u043e = ((\u0430c\u0440)((Object)\u0458ac.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)\u0458ac.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray3, (int)(257522931 + 1586753786), (int)(-1979851434 + 482068835)))))).\u0455xi\u0440(true).\u0458c\u0456\u0440().getBooleanValue();
        this.\u0445ec\u0458jpa = p\u0445\u0445o\u043e.\u0445x\u0456;
        this.\u043ehssa = \u0430es\u0441c\u0441i.\u043e\u0435ic\u0455;
        this.\u0435ah = -1;
    }

    @Override
    public /* synthetic */ void onEnable() {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
            if (bl) {
                __js_dispatch_state = 0;
            }
        }
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        this.e\u0455s(false);
        this.\u0430x\u0456\u0435p = 0;
    }

    @Override
    public /* synthetic */ void onDisable() {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (true | false) {
        }
        if (0 != 0) {
        }
        this.e\u0455s(false);
    }

    @\u0445\u0458\u0458h\u0445\u0430a
    public void x\u0435\u0445xe\u0445(\u0430j\u0445 \u0430j\u04452) {
        block14: {
            block13: {
                block12: {
                    block11: {
                        block10: {
                            block9: {
                                block8: {
                                    boolean bl = false;
                                    if (bl) {
                                        __js_dispatch_state = 0;
                                    }
                                    if (2 * 2 * 2 >= 0) {
                                    }
                                    if (0 != 0) {
                                    }
                                    if (\u0430j\u04452.p\u0440\u04bb() != i\u0456\u0445\u0430\u0441p.cc\u0441 || \u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 == null || \u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1687 == null) break block8;
                                    if (\u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1761 != null) break block9;
                                }
                                return;
                            }
                            if (this.\u0458\u0455j\u0435j\u0440()) {
                                return;
                            }
                            int n = this.\u0445ec\u0458jpa.ordinal();
                            if (n == 0) break block10;
                            if (n == 1) break block11;
                            if (n == 2) break block12;
                            if (n == 3) break block13;
                            break block14;
                        }
                        this.p\u0440\u0456();
                        break block14;
                    }
                    this.x\u0441ch\u0435\u0445();
                    break block14;
                }
                this.\u0435\u043e\u0440\u0445s();
                break block14;
            }
            this.\u0458\u0440hi\u0430ij();
        }
    }

    private /* synthetic */ void p\u0440\u0456() {
        block9: {
            block10: {
                boolean bl = false;
                if (bl) {
                    __js_dispatch_state = 0;
                }
                if ((3 * 3 + 3) % 2 == 0) {
                }
                if (0 != 0) {
                }
                if (this.\u0430s\u0445() != -1) break block9;
                if (!this.xi\u0440.axpacc()) break block10;
                if (this.c\u0458a\u0455\u04bb() != -1) break block9;
            }
            return;
        }
        if (++this.\u0430x\u0456\u0435p < \u0458ac.a_bsm2("round", round(float ), (float)this.ai\u0435\u04bb\u0440.axpacc())) {
            return;
        }
        Optional<jx\u0456p\u043e> optional = this.\u0435\u0441e();
        if (optional.isEmpty()) {
            return;
        }
        jx\u0456p\u043e jx\u0456p\u043e2 = optional.get();
        this.\u0456\u0455\u0430\u04bbij = jx\u0456p\u043e2.hp\u0445ci\u04bb;
        this.\u0455\u0441\u0455\u0458\u043e = jx\u0456p\u043e2.\u0456\u0430p\u04bb\u0430jp;
        this.a\u043e\u0455\u0440s = jx\u0456p\u043e2.\u0458oa\u0430s;
        this.\u043e\u0440\u0441xp = this.\u0455\u0441\u0455\u0458\u043e.o\u0441\u0456p;
        this.s\u043exh\u0430 = 0;
        if (jx\u0456p\u043e2.\u0441\u0445e\u0435a != null) {
            this.\u0456c\u0440(jx\u0456p\u043e2.\u0441\u0445e\u0435a);
        }
        this.\u043e\u0430e(this.\u0455\u0441\u0455\u0458\u043e.e\u043eeopai, 3);
        this.\u0445ec\u0458jpa = p\u0445\u0445o\u043e.\u0435e\u0458pe\u0440;
    }

    private /* synthetic */ void x\u0441ch\u0435\u0445() {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        if (!this.a\u0440\u04bbe\u0441() || !this.\u0445scxj\u043ej()) {
            this.e\u0455s(false);
            return;
        }
        if (this.a\u043e\u0455\u0440s == i\u0456\u0441\u043e\u043ei.\u04bb\u04bb\u04bba) {
            this.ejp\u04bb\u0458();
            return;
        }
        if (this.a\u043e\u0455\u0440s == i\u0456\u0441\u043e\u043ei.i\u043e\u0456) {
            this.e\u0455s(true);
            return;
        }
        if (this.a\u043e\u0455\u0440s == i\u0456\u0441\u043e\u043ei.\u0458oa\u0445) {
            if (!this.jcjs\u0441\u043e.axpacc()) {
                this.e\u0455s(true);
                return;
            }
            this.ca\u0456ac = 1;
            this.ej\u0435e = 0;
            this.x\u0445\u0441 = 0;
            this.h\u0440i\u04bb\u0458a\u0435 = 0;
            this.\u0445\u0445\u04bbo = false;
            this.x\u0458\u043ej = false;
            this.\u0445ec\u0458jpa = p\u0445\u0445o\u043e.sc\u0441;
            return;
        }
        if (!this.scxi()) {
            this.e\u0455s(true);
        }
    }

    private /* synthetic */ Optional<jx\u0456p\u043e> \u0435\u0441e() {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        c\u0455i\u0430\u0440\u0445 c\u0455i\u0430\u0440\u04452 = (c\u0455i\u0430\u0440\u0445)((\u0445\u0440\u0430\u0435\u0445\u043e)((Object)\u0458ac.a_bsm3("jaa\u0435\u0445c", jaa\u0435\u0445c()))).\u0430o\u0441\u0456p\u0455().\u0441c\u0458\u043e\u0430(c\u0455i\u0430\u0440\u0445.class);
        List<class_742> list = \u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.method_18456().stream().filter(class_7422 -> {
            boolean bl = false;
            if (bl) {
                __js_dispatch_state = 0;
            }
            if (2 * 2 * 2 >= 0) {
            }
            return (class_7422 != \u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 && (class_7422.method_5739((class_1297)\u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1724) == this.\u0445\u0441s.axpacc() ? 0 : (class_7422.method_5739((class_1297)\u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1724) < this.\u0445\u0441s.axpacc() ? -1 : 1)) <= 0 ? 1 : 0) != 0;
        }).filter(class_7422 -> {
            boolean bl = false;
            if (bl) {
                __js_dispatch_state = 0;
                if (bl) {
                    __js_dispatch_state = 0;
                }
            }
            if (true | false) {
            }
            return (c\u0455i\u0430\u0440\u04452.ce\u0435oos((class_1297)class_7422) && \u0458ac.a_bsm32("h\u0441h", h\u0441h(net.minecraft.class_1297 ), (class_1297)class_7422) != false ? 1 : 0) != 0;
        }).sorted((Comparator<class_742>)((Object)\u0458ac.a_bsm4("comparingDouble", comparingDouble(java.util.function.ToDoubleFunction<? super T> ), class_7422 -> {
            boolean bl = false;
            if (bl) {
                __js_dispatch_state = 0;
            }
            if ((3 * 3 + 3) % 2 == 0) {
            }
            return class_7422.method_5858((class_1297)\u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1724);
        }))).toList();
        int n = this.\u0430s\u0445();
        int n2 = this.xi\u0440.axpacc() ? this.c\u0458a\u0455\u04bb() : -1;
        for (class_1657 class_16572 : list) {
            Object object;
            Optional<c\u0435so\u0430> optional;
            boolean bl2 = this.\u0445\u0430\u0445((class_1297)class_16572);
            if (bl2 && (optional = this.\u0435c\u0435((class_1297)class_16572, n)).isPresent()) {
                return optional;
            }
            if (!bl2 && this.hc\u0458c\u0440a.axpacc() && n != -1 && (optional = this.osi\u0455\u04bb((class_1297)class_16572)).isPresent()) {
                object = optional.get();
                return \u0458ac.a_bsm5("of", of(T ), (Object)new jx\u0456p\u043e((class_1297)class_16572, ((c\u0435so\u0430)object).i\u0445\u043ei, i\u0456\u0441\u043e\u043ei.\u04bb\u04bb\u04bba, (c\u0435so\u0430)object));
            }
            Optional<c\u0435so\u0430> optional2 = optional = !bl2 && n != -1 ? this.pjj\u0456((class_1297)class_16572) : \u0458ac.a_bsm6("empty", empty());
            if (optional.isPresent()) {
                return \u0458ac.a_bsm5("of", of(T ), (Object)new jx\u0456p\u043e((class_1297)class_16572, (xc\u0455)((Object)optional.get()), i\u0456\u0441\u043e\u043ei.\u0441\u0455i\u0435\u0435\u0456\u04bb, null));
            }
            if (n2 == -1 || !this.\u0440pi\u0455\u0441o((class_1297)class_16572, bl2) || !((Optional)(object = this.jp\u0441c((class_1297)class_16572))).isPresent()) continue;
            return \u0458ac.a_bsm5("of", of(T ), (Object)new jx\u0456p\u043e((class_1297)class_16572, (xc\u0455)((Optional)object).get(), i\u0456\u0441\u043e\u043ei.\u0458oa\u0445, null));
        }
        return \u0458ac.a_bsm6("empty", empty());
    }

    private /* synthetic */ Optional<jx\u0456p\u043e> \u0435c\u0435(class_1297 class_12972, int n) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        if (n == -1) {
            return \u0458ac.a_bsm6("empty", empty());
        }
        class_243 class_2432 = this.\u0430\u0455\u0441(class_12972);
        if (\u0458ac.$_h58oejq1ngan17l5b(class_2432.field_1352 * class_2432.field_1352 + class_2432.field_1350 * class_2432.field_1350 == 4.0E-4 ? 0 : (class_2432.field_1352 * class_2432.field_1352 + class_2432.field_1350 * class_2432.field_1350 < 4.0E-4 ? -1 : 1)) < 0) {
            return \u0458ac.a_bsm6("empty", empty());
        }
        for (int i = 2; i <= 3; ++i) {
            class_238 class_2383 = class_12972.method_5829().method_989(class_2432.field_1352 * (double)i, 0.0, class_2432.field_1350 * (double)i);
            if (this.\u0458h\u0445a\u0456(class_2383)) continue;
            for (pcx\u0435\u04bb\u0456\u0445 pcx\u0435\u04bb\u0456\u04452 : this.o\u0441j(class_2383, i)) {
                Optional<Record> optional;
                if (!\u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.method_8320(pcx\u0435\u04bb\u0456\u04452.ai\u0445\u0435\u0445sp).method_27852(class_2246.field_10343) && (optional = this.a\u0440pesi(pcx\u0435\u04bb\u0456\u04452.ai\u0445\u0435\u0445sp)).isPresent()) {
                    return \u0458ac.a_bsm5("of", of(T ), (Object)new jx\u0456p\u043e(class_12972, (xc\u0455)optional.get(), i\u0456\u0441\u043e\u043ei.i\u043e\u0456, null));
                }
                optional = this.c\u04bbxh\u0440e(class_12972, pcx\u0435\u04bb\u0456\u04452.s\u0440x\u0441s, pcx\u0435\u04bb\u0456\u04452.ai\u0445\u0435\u0445sp);
                if (!optional.isPresent()) continue;
                c\u0435so\u0430 c\u0435so\u04302 = (c\u0435so\u0430)optional.get();
                return \u0458ac.a_bsm5("of", of(T ), (Object)new jx\u0456p\u043e(class_12972, c\u0435so\u04302.i\u0445\u043ei, i\u0456\u0441\u043e\u043ei.\u04bb\u04bb\u04bba, c\u0435so\u04302));
            }
        }
        return \u0458ac.a_bsm6("empty", empty());
    }

    private /* synthetic */ List<pcx\u0435\u04bb\u0456\u0445> o\u0441j(class_238 class_2383, int n) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        ArrayList<pcx\u0435\u04bb\u0456\u0445> arrayList = new ArrayList<pcx\u0435\u04bb\u0456\u0445>();
        int n2 = (int)\u0458ac.a_bsm7("floor", floor(double ), (double)(class_2383.field_1322 + 0.001));
        CallSite callSite = \u0458ac.a_bsm8("method_49637", method_49637(double double double ), (double)((class_2383.field_1323 + class_2383.field_1320) * 0.5), (double)class_2383.field_1322, (double)((class_2383.field_1321 + class_2383.field_1324) * 0.5));
        this.\u0455\u0458s\u0445j(arrayList, n, (class_2338)callSite);
        for (int i = (int)\u0458ac.a_bsm7("floor", floor(double ), (double)class_2383.field_1323); i <= (int)\u0458ac.a_bsm7("floor", floor(double ), (double)class_2383.field_1320); ++i) {
            for (int j = (int)\u0458ac.a_bsm7("floor", floor(double ), (double)class_2383.field_1322); j <= (int)\u0458ac.a_bsm7("floor", floor(double ), (double)class_2383.field_1325); ++j) {
                for (int k = (int)\u0458ac.a_bsm7("floor", floor(double ), (double)class_2383.field_1321); k <= (int)\u0458ac.a_bsm7("floor", floor(double ), (double)class_2383.field_1324); ++k) {
                    class_2338 class_23382 = new class_2338(i, j, k);
                    if (!class_2383.method_994(new class_238(class_23382)) || \u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.method_8320(class_23382).method_27852(class_2246.field_10343)) continue;
                    this.\u0455\u0458s\u0445j(arrayList, n, new class_2338(i, j <= n2 ? n2 : j - 1, k));
                }
                if (!bl) continue;
                __js_dispatch_state = 0;
            }
        }
        arrayList.sort((Comparator<pcx\u0435\u04bb\u0456\u0445>)((Object)\u0458ac.a_bsm4("comparingDouble", comparingDouble(java.util.function.ToDoubleFunction<? super T> ), arg_0 -> \u0458ac.\u0441\u0440h\u0445((class_2338)callSite, arg_0))));
        return arrayList;
    }

    private /* synthetic */ void \u0455\u0458s\u0445j(List<pcx\u0435\u04bb\u0456\u0445> list, int n, class_2338 class_23382) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        pcx\u0435\u04bb\u0456\u0445 pcx\u0435\u04bb\u0456\u04452 = new pcx\u0435\u04bb\u0456\u0445(n, class_23382, class_23382.method_10084());
        if (!(\u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.method_8320(class_23382).method_27852(class_2246.field_10343) && \u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.method_8320(class_23382.method_10084()).method_27852(class_2246.field_10343) || list.contains(pcx\u0435\u04bb\u0456\u04452))) {
            list.add(pcx\u0435\u04bb\u0456\u04452);
        }
    }

    private /* synthetic */ Optional<xc\u0455> pjj\u0456(class_1297 class_12972) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (true | false) {
        }
        if (0 != 0) {
        }
        for (class_2338 class_23382 : this.o\u04bb\u04bb\u0435oj\u0441(class_12972)) {
            Optional<xc\u0455> optional = this.a\u0440pesi(class_23382);
            if (!optional.isPresent()) continue;
            return optional;
        }
        return \u0458ac.a_bsm6("empty", empty());
    }

    private /* synthetic */ Optional<xc\u0455> a\u0440pesi(class_2338 class_23382) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
            if (bl) {
                __js_dispatch_state = 0;
            }
        }
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        if (!\u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.method_8320(class_23382).method_45474() || this.hc\u0445\u04bb\u0456i\u04bb(class_23382)) {
            return \u0458ac.a_bsm6("empty", empty());
        }
        class_243 class_2432 = \u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_33571();
        CallSite callSite = \u0458ac.a_bsm9("method_24953", method_24953(net.minecraft.class_2382 ), (class_2382)class_23382);
        CallSite callSite2 = \u0458ac.a_bsm10("method_10147", method_10147(float float float ), (float)((float)(((class_243)callSite).field_1352 - class_2432.field_1352)), (float)0.0f, (float)((float)(((class_243)callSite).field_1350 - class_2432.field_1350)));
        ArrayList<CallSite> arrayList = new ArrayList<CallSite>();
        arrayList.add(callSite2);
        for (class_2350 class_23502 : class_2350.class_2353.field_11062) {
            if (class_23502 == callSite2) continue;
            arrayList.add((CallSite)class_23502);
        }
        arrayList.add((CallSite)class_2350.field_11033);
        arrayList.add((CallSite)class_2350.field_11036);
        for (class_2350 class_23502 : arrayList) {
            class_2350 class_23503;
            class_2338 class_23383 = class_23382.method_10093(class_23502);
            Optional<class_243> optional = this.x\u0441\u0445\u0430\u0435\u04bb\u0456(class_23383, class_23503 = class_23502.method_10153());
            if (!optional.isPresent()) continue;
            return \u0458ac.a_bsm5("of", of(T ), (Object)new xc\u0455(class_23383, class_23503, optional.get(), class_23382));
        }
        return \u0458ac.a_bsm6("empty", empty());
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ List<class_2338> o\u04bb\u04bb\u0435oj\u0441(class_1297 class_12972) {
        void var6_8;
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (true | false) {
        }
        if (0 != 0) {
        }
        ArrayList<class_2338> arrayList = new ArrayList<class_2338>();
        this.ix\u043e\u0430\u0456(arrayList, (class_2338)\u0458ac.a_bsm8("method_49637", method_49637(double double double ), (double)class_12972.method_23317(), (double)(class_12972.method_23318() + 1.0), (double)class_12972.method_23321()));
        class_238 class_2383 = class_12972.method_5829();
        int n = (int)\u0458ac.a_bsm7("floor", floor(double ), (double)(class_12972.method_23318() + 1.0));
        int n2 = (int)\u0458ac.a_bsm7("floor", floor(double ), (double)(class_2383.field_1325 - 0.05));
        CallSite callSite = \u0458ac.a_bsm11("min", min(int int ), (int)n, (int)n2);
        while (var6_8 <= \u0458ac.a_bsm12("max", max(int int ), (int)n, (int)n2)) {
            for (int i = (int)\u0458ac.a_bsm7("floor", floor(double ), (double)(class_2383.field_1323 - 0.45)); i <= (int)\u0458ac.a_bsm7("floor", floor(double ), (double)(class_2383.field_1320 + 0.45)); ++i) {
                for (int j = (int)\u0458ac.a_bsm7("floor", floor(double ), (double)(class_2383.field_1321 - 0.45)); j <= (int)\u0458ac.a_bsm7("floor", floor(double ), (double)(class_2383.field_1324 + 0.45)); ++j) {
                    this.ix\u043e\u0430\u0456(arrayList, new class_2338(i, (int)var6_8, j));
                }
            }
            ++var6_8;
        }
        return arrayList;
    }

    private /* synthetic */ void ix\u043e\u0430\u0456(List<class_2338> list, class_2338 class_23382) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if (!list.contains(class_23382)) {
            list.add(class_23382);
        }
    }

    private /* synthetic */ Optional<c\u0435so\u0430> osi\u0455\u04bb(class_1297 class_12972) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (!this.p\u0458s\u043eso(class_12972) || this.x\u0435\u0430\u0441\u04bb(class_12972) || this.\u0445ph\u043e() == -1) {
            return \u0458ac.a_bsm6("empty", empty());
        }
        CallSite callSite = \u0458ac.a_bsm8("method_49637", method_49637(double double double ), (double)class_12972.method_23317(), (double)class_12972.method_23318(), (double)class_12972.method_23321());
        return this.c\u04bbxh\u0440e(class_12972, (class_2338)callSite, callSite.method_10084());
    }

    private /* synthetic */ Optional<c\u0435so\u0430> c\u04bbxh\u0440e(class_1297 class_12972, class_2338 class_23382, class_2338 class_23383) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        if (!this.piepsp(class_23382) || !this.piepsp(class_23383)) {
            return \u0458ac.a_bsm6("empty", empty());
        }
        Optional<xc\u0455> optional = this.\u0430p\u0440\u0455(class_23382.method_10074(), class_23382, class_12972.method_23317(), class_12972.method_23321());
        if (optional.isEmpty()) {
            return \u0458ac.a_bsm6("empty", empty());
        }
        return \u0458ac.a_bsm5("of", of(T ), (Object)new c\u0435so\u0430(class_23382, class_23383, optional.get(), new xc\u0455(class_23382, class_2350.field_11036, new class_243((double)class_23382.method_10263() + 0.5, (double)(class_23382.method_10264() + 1), (double)class_23382.method_10260() + 0.5), class_23383)));
    }

    private /* synthetic */ Optional<xc\u0455> jp\u0441c(class_1297 class_12972) {
        class_243 class_2432;
        class_243 class_2433;
        class_3965 class_39652;
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (true | false) {
        }
        if (0 != 0) {
        }
        if ((class_39652 = \u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.method_17742(new class_3959(class_2433 = new class_243(class_12972.method_23317(), class_12972.method_23318() + 0.2, class_12972.method_23321()), class_2432 = new class_243(class_12972.method_23317(), class_12972.method_23318() - 2.2, class_12972.method_23321()), class_3959.class_3960.field_17559, class_3959.class_242.field_1348, (class_1297)\u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1724))).method_17783() != class_239.class_240.field_1332 || class_39652.method_17780() != class_2350.field_11036) {
            return \u0458ac.a_bsm6("empty", empty());
        }
        class_243 class_2434 = new class_243(this.s\u0458\u0440(class_12972.method_23317(), (double)class_39652.method_17777().method_10263() + 0.1, (double)class_39652.method_17777().method_10263() + 0.9), (double)class_39652.method_17777().method_10264() + 0.99, this.s\u0458\u0440(class_12972.method_23321(), (double)class_39652.method_17777().method_10260() + 0.1, (double)class_39652.method_17777().method_10260() + 0.9));
        return this.\u0445speoe(class_2434, class_39652.method_17777());
    }

    private /* synthetic */ Optional<xc\u0455> \u0430p\u0440\u0455(class_2338 class_23382, class_2338 class_23383, double d, double d2) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        if (!this.s\u0456\u0455he(class_23382)) {
            return \u0458ac.a_bsm6("empty", empty());
        }
        for (class_243 class_2432 : this.sh\u043eo\u0441\u0455h(class_23382, d, d2)) {
            if (\u0458ac.$_h58oejr1ngan17l5c(\u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_33571().method_1025(class_2432) == 25.0 ? 0 : (\u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_33571().method_1025(class_2432) > 25.0 ? 1 : -1)) > 0) {
                if (0 == 0 || 0 == 1 || 0 == 2) continue;
                continue;
            }
            class_243 class_2433 = this.\u0435\u0435\u0455\u0445\u0440(class_2432, class_2350.field_11036);
            class_3965 class_39652 = \u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.method_17742(new class_3959(\u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_33571(), class_2433, class_3959.class_3960.field_17559, class_3959.class_242.field_1348, (class_1297)\u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1724));
            if (class_39652.method_17783() == class_239.class_240.field_1332 && class_39652.method_17777().equals((Object)class_23382) && class_39652.method_17780() == class_2350.field_11036) {
                return \u0458ac.a_bsm5("of", of(T ), (Object)new xc\u0455(class_23382, class_2350.field_11036, class_39652.method_17784(), class_23383));
            }
            if (!bl) continue;
            __js_dispatch_state = 0;
        }
        return \u0458ac.a_bsm6("empty", empty());
    }

    private /* synthetic */ List<class_243> sh\u043eo\u0441\u0455h(class_2338 class_23382, double d, double d2) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        double d3 = class_23382.method_10264() + 1;
        return \u0458ac.a_bsm13("of", of(E E E E E E ), (Object)new class_243((double)class_23382.method_10263() + 0.5, d3, (double)class_23382.method_10260() + 0.5), (Object)new class_243(this.s\u0458\u0440(d, (double)class_23382.method_10263() + 0.25, (double)class_23382.method_10263() + 0.75), d3, this.s\u0458\u0440(d2, (double)class_23382.method_10260() + 0.25, (double)class_23382.method_10260() + 0.75)), (Object)new class_243((double)class_23382.method_10263() + 0.35, d3, (double)class_23382.method_10260() + 0.35), (Object)new class_243((double)class_23382.method_10263() + 0.65, d3, (double)class_23382.method_10260() + 0.35), (Object)new class_243((double)class_23382.method_10263() + 0.35, d3, (double)class_23382.method_10260() + 0.65), (Object)new class_243((double)class_23382.method_10263() + 0.65, d3, (double)class_23382.method_10260() + 0.65));
    }

    private /* synthetic */ Optional<xc\u0455> \u0445speoe(class_243 class_2432, class_2338 class_23382) {
        class_3965 class_39652;
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (true | false) {
        }
        if (0 != 0) {
        }
        if ((class_39652 = \u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.method_17742(new class_3959(\u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_33571(), class_2432, class_3959.class_3960.field_17559, class_3959.class_242.field_1348, (class_1297)\u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1724))).method_17783() != class_239.class_240.field_1332 || class_39652.method_17780() != class_2350.field_11036 || !class_39652.method_17777().equals((Object)class_23382)) {
            return \u0458ac.a_bsm6("empty", empty());
        }
        class_2338 class_23383 = class_39652.method_17777().method_10084();
        if (this.\u04bbj\u0435\u0445\u0458hp(class_23383) || !this.piepsp(class_23383) || !this.s\u0456\u0455he(class_39652.method_17777()) || \u0458ac.$_h58oejs1ngan17l5d(\u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_33571().method_1025(class_2432) == 25.0 ? 0 : (\u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_33571().method_1025(class_2432) > 25.0 ? 1 : -1)) > 0) {
            return \u0458ac.a_bsm6("empty", empty());
        }
        return \u0458ac.a_bsm5("of", of(T ), (Object)new xc\u0455(class_39652.method_17777(), class_2350.field_11036, class_2432, class_23383));
    }

    private /* synthetic */ Optional<class_243> x\u0441\u0445\u0430\u0435\u04bb\u0456(class_2338 class_23382, class_2350 class_23502) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        for (class_243 class_2432 : this.h\u0435\u0430e\u0440\u043e(class_23382, class_23502)) {
            class_3965 class_39652;
            if (\u0458ac.$_h58oejt1ngan17l5e(\u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_33571().method_1025(class_2432) == 25.0 ? 0 : (\u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_33571().method_1025(class_2432) > 25.0 ? 1 : -1)) > 0 || (class_39652 = \u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.method_17742(new class_3959(\u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_33571(), this.\u0435\u0435\u0455\u0445\u0440(class_2432, class_23502), class_3959.class_3960.field_17559, class_3959.class_242.field_1348, (class_1297)\u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1724))).method_17783() != class_239.class_240.field_1332 || !class_39652.method_17777().equals((Object)class_23382) || class_39652.method_17780() != class_23502) continue;
            return \u0458ac.a_bsm5("of", of(T ), (Object)class_39652.method_17784());
        }
        return \u0458ac.a_bsm6("empty", empty());
    }

    private /* synthetic */ List<class_243> h\u0435\u0430e\u0440\u043e(class_2338 class_23382, class_2350 class_23502) {
        class_265 class_2652;
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if ((class_2652 = this.x\u0430\u043e(class_23382)).method_1110()) {
            return \u0458ac.a_bsm14("of", of());
        }
        class_238 class_2383 = null;
        double d = this.\u04bbh\u043ephc\u043e(class_23502) ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY;
        for (class_238 object : class_2652.method_1090()) {
            double d2 = this.\u043e\u0445e(object, class_23502);
            if ((!this.\u04bbh\u043ephc\u043e(class_23502) || \u0458ac.$_h58oeju1ngan17l5f(d2 == d ? 0 : (d2 > d ? 1 : -1)) <= 0) && (this.\u04bbh\u043ephc\u043e(class_23502) || \u0458ac.$_h58oejv1ngan17l5g(d2 == d ? 0 : (d2 < d ? -1 : 1)) >= 0)) continue;
            d = d2;
            class_2383 = object;
        }
        if (class_2383 == null) {
            return \u0458ac.a_bsm14("of", of());
        }
        ArrayList arrayList = new ArrayList();
        for (double d3 : new double[]{0.5, 0.25, 0.75}) {
            for (double d4 : new double[]{0.5, 0.25, 0.75}) {
                class_243 class_2432;
                block15: {
                    class_243 class_2434;
                    block14: {
                        block13: {
                            block12: {
                                block11: {
                                    block10: {
                                        block9: {
                                            int n = eh\u043e\u043ehi.p\u0441ax[class_23502.ordinal()];
                                            if (n == 1) break block9;
                                            if (n == 2) break block10;
                                            if (n == 3) break block11;
                                            if (n == 4) break block12;
                                            if (n == 5) break block13;
                                            if (n != 6) {
                                                throw new MatchException(null, null);
                                            }
                                            break block14;
                                        }
                                        class_2434 = new class_243((double)class_23382.method_10263() + this.ia\u0458oop(class_2383.field_1323, class_2383.field_1320, d3), (double)class_23382.method_10264() + class_2383.field_1325, (double)class_23382.method_10260() + this.ia\u0458oop(class_2383.field_1321, class_2383.field_1324, d4));
                                        break block15;
                                    }
                                    class_2434 = new class_243((double)class_23382.method_10263() + this.ia\u0458oop(class_2383.field_1323, class_2383.field_1320, d3), (double)class_23382.method_10264() + class_2383.field_1322, (double)class_23382.method_10260() + this.ia\u0458oop(class_2383.field_1321, class_2383.field_1324, d4));
                                    break block15;
                                }
                                class_2434 = new class_243((double)class_23382.method_10263() + class_2383.field_1320, (double)class_23382.method_10264() + this.ia\u0458oop(class_2383.field_1322, class_2383.field_1325, d3), (double)class_23382.method_10260() + this.ia\u0458oop(class_2383.field_1321, class_2383.field_1324, d4));
                                break block15;
                            }
                            class_2434 = new class_243((double)class_23382.method_10263() + class_2383.field_1323, (double)class_23382.method_10264() + this.ia\u0458oop(class_2383.field_1322, class_2383.field_1325, d3), (double)class_23382.method_10260() + this.ia\u0458oop(class_2383.field_1321, class_2383.field_1324, d4));
                            break block15;
                        }
                        class_2434 = new class_243((double)class_23382.method_10263() + this.ia\u0458oop(class_2383.field_1323, class_2383.field_1320, d3), (double)class_23382.method_10264() + this.ia\u0458oop(class_2383.field_1322, class_2383.field_1325, d4), (double)class_23382.method_10260() + class_2383.field_1324);
                        break block15;
                    }
                    class_2434 = class_2432 = new class_243((double)class_23382.method_10263() + this.ia\u0458oop(class_2383.field_1323, class_2383.field_1320, d3), (double)class_23382.method_10264() + this.ia\u0458oop(class_2383.field_1322, class_2383.field_1325, d4), (double)class_23382.method_10260() + class_2383.field_1321);
                }
                if (!arrayList.stream().noneMatch(class_2433 -> {
                    boolean bl = false;
                    if (bl) {
                        __js_dispatch_state = 0;
                    }
                    if (true | false) {
                    }
                    return ((class_2433.method_1025(class_2432) == 1.0E-6 ? 0 : (class_2433.method_1025(class_2432) < 1.0E-6 ? -1 : 1)) < 0 ? 1 : 0) != 0;
                })) continue;
                arrayList.add(class_2432);
            }
            if (!bl) continue;
            __js_dispatch_state = 0;
        }
        return arrayList;
    }

    private /* synthetic */ double \u043e\u0445e(class_238 class_2383, class_2350 class_23502) {
        double d;
        block10: {
            block9: {
                block8: {
                    block7: {
                        block6: {
                            block5: {
                                block4: {
                                    boolean bl = false;
                                    if (bl) {
                                        __js_dispatch_state = 0;
                                    }
                                    if (2 * 2 * 2 >= 0) {
                                    }
                                    if (0 != 0) {
                                    }
                                    int n = eh\u043e\u043ehi.p\u0441ax[class_23502.ordinal()];
                                    if (n == 1) break block4;
                                    if (n == 2) break block5;
                                    if (n == 3) break block6;
                                    if (n == 4) break block7;
                                    if (n == 5) break block8;
                                    if (n != 6) {
                                        throw new MatchException(null, null);
                                    }
                                    break block9;
                                }
                                d = class_2383.field_1325;
                                break block10;
                            }
                            d = class_2383.field_1322;
                            break block10;
                        }
                        d = class_2383.field_1320;
                        break block10;
                    }
                    d = class_2383.field_1323;
                    break block10;
                }
                d = class_2383.field_1324;
                break block10;
            }
            d = class_2383.field_1321;
        }
        return d;
    }

    private /* synthetic */ boolean \u04bbh\u043ephc\u043e(class_2350 class_23502) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return (class_23502 == class_2350.field_11036 || class_23502 == class_2350.field_11034 || class_23502 == class_2350.field_11035 ? 1 : 0) != 0;
    }

    private /* synthetic */ class_243 \u0435\u0435\u0455\u0445\u0440(class_243 class_2432, class_2350 class_23502) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (true | false) {
        }
        if (0 != 0) {
        }
        return class_2432.method_1031((double)(-class_23502.method_10148()) * 0.01, (double)(-class_23502.method_10164()) * 0.01, (double)(-class_23502.method_10165()) * 0.01);
    }

    private /* synthetic */ boolean \u0445scxj\u043ej() {
        int n;
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        int n2 = n = this.a\u043e\u0455\u0440s == i\u0456\u0441\u043e\u043ei.\u0458oa\u0445 ? this.c\u0458a\u0455\u04bb() : this.\u0430s\u0445();
        if (n == -1) {
            return 0 != 0;
        }
        int n3 = \u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7545;
        this.\u0430\u04bbj\u0455(n);
        this.\u043e\u0430e(this.\u0455\u0441\u0455\u0458\u043e.e\u043eeopai, 3);
        if (this.a\u043e\u0455\u0440s == i\u0456\u0441\u043e\u043ei.\u0458oa\u0445) {
            class_1269 class_12692 = \u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1761.method_2919((class_1657)\u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1724, class_1268.field_5808);
            if (class_12692.method_23665()) {
                \u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_6104(class_1268.field_5808);
            }
        } else {
            class_3965 class_39652 = new class_3965(this.\u0455\u0441\u0455\u0458\u043e.e\u043eeopai, this.\u0455\u0441\u0455\u0458\u043e.\u043epp, this.\u0455\u0441\u0455\u0458\u043e.\u0435\u043eo\u0455s, false);
            \u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1761.method_2896(\u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1724, class_1268.field_5808, class_39652);
            \u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_6104(class_1268.field_5808);
        }
        this.\u0430\u04bbj\u0455(n3);
        return 1 != 0;
    }

    private /* synthetic */ void \u0456c\u0440(c\u0435so\u0430 c\u0435so\u04302) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (true | false) {
        }
        if (0 != 0) {
        }
        this.\u04bbc\u043es\u0440a = c\u0435so\u04302;
        this.\u043ehssa = \u0430es\u0441c\u0441i.\u0430xi\u0445;
        this.\u04bbe\u0441e\u0458jp = c\u0435so\u04302.e\u0455aaxs;
        this.\u0458\u04bbo = 0;
        this.\u0440\u0458\u0440 = false;
    }

    private /* synthetic */ void ejp\u04bb\u0458() {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (this.\u04bbc\u043es\u0440a == null) {
            this.e\u0455s(false);
        } else if (this.\u043ehssa == \u0430es\u0441c\u0441i.\u0430xi\u0445) {
            this.\u043ehssa = \u0430es\u0441c\u0441i.c\u0455\u043epx\u04bb\u0440;
            this.a\u0435\u04bb(this.\u04bbc\u043es\u0440a.x\u0440\u0435, i\u0456\u0441\u043e\u043ei.\u04bb\u04bb\u04bba);
        } else if (this.\u043ehssa == \u0430es\u0441c\u0441i.c\u0455\u043epx\u04bb\u0440) {
            this.\u0441\u0430\u04bb\u0430\u0441();
            if (0 != 0 && 0 != 1) {
                if (0 != 2) {
                } else if (bl) {
                    __js_dispatch_state = 0;
                }
            }
        } else {
            this.e\u0455s(false);
        }
    }

    private /* synthetic */ void \u0441\u0430\u04bb\u0430\u0441() {
        int n;
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        if ((n = this.\u0445ph\u043e()) == -1) {
            this.e\u0455s(false);
            return;
        }
        this.\u0455\u0441\u0455\u0458\u043e = null;
        this.a\u043e\u0455\u0440s = null;
        this.\u043e\u0440\u0441xp = this.\u04bbe\u0441e\u0458jp;
        this.\u0435ah = \u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7545;
        this.\u0430\u04bbj\u0455(n);
        this.\u043e\u0430e((class_243)\u0458ac.a_bsm9("method_24953", method_24953(net.minecraft.class_2382 ), (class_2382)this.\u04bbe\u0441e\u0458jp), -909304324 + 909304354);
        this.\u0445ec\u0458jpa = p\u0445\u0445o\u043e.o\u0441\u0440;
    }

    private /* synthetic */ void \u0458\u0440hi\u0430ij() {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
            if (bl) {
                __js_dispatch_state = 0;
            }
        }
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        if (this.\u04bbe\u0441e\u0458jp == null || !\u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.method_8320(this.\u04bbe\u0441e\u0458jp).method_27852(class_2246.field_10343)) {
            this.\u0440\u0456\u0435();
            if (!this.jxeph\u0455\u0455()) {
                this.e\u0455s(true);
            }
            return;
        }
        int n = this.\u0445ph\u043e();
        if (n == -1 || ++this.\u0458\u04bbo >= -168793098 + 168793122) {
            this.e\u0455s(false);
            return;
        }
        this.\u0430\u04bbj\u0455(n);
        this.\u043e\u0430e((class_243)\u0458ac.a_bsm9("method_24953", method_24953(net.minecraft.class_2382 ), (class_2382)this.\u04bbe\u0441e\u0458jp), 3);
        if (!this.\u0440\u0458\u0440) {
            \u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1761.method_2910(this.\u04bbe\u0441e\u0458jp, class_2350.field_11036);
            this.\u0440\u0458\u0440 = true;
            if (0 != 0 && 0 != 1 && 0 != 2) {
                // empty if block
            }
            if (bl) {
                __js_dispatch_state = 0;
            }
        } else {
            \u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1761.method_2902(this.\u04bbe\u0441e\u0458jp, class_2350.field_11036);
        }
        \u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_6104(class_1268.field_5808);
    }

    private /* synthetic */ boolean jxeph\u0455\u0455() {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        if (this.\u0456\u0455\u0430\u04bbij == null || !this.xi\u0440.axpacc() || this.c\u0458a\u0455\u04bb() == -1 || !this.\u0440pi\u0455\u0441o(this.\u0456\u0455\u0430\u04bbij, true)) {
            return 0 != 0;
        }
        Optional<xc\u0455> optional = this.jp\u0441c(this.\u0456\u0455\u0430\u04bbij);
        if (optional.isEmpty()) {
            return 0 != 0;
        }
        this.\u0441\u0456hi\u04bb(optional.get());
        this.\u0435jjp();
        this.\u0445ec\u0458jpa = p\u0445\u0445o\u043e.\u0435e\u0458pe\u0440;
        return 1 != 0;
    }

    private /* synthetic */ boolean scxi() {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if (this.\u0456\u0455\u0430\u04bbij == null || !this.xi\u0440.axpacc() || this.c\u0458a\u0455\u04bb() == -1 || !this.\u0440pi\u0455\u0441o(this.\u0456\u0455\u0430\u04bbij, false)) {
            return 0 != 0;
        }
        Optional<xc\u0455> optional = this.jp\u0441c(this.\u0456\u0455\u0430\u04bbij);
        if (optional.isEmpty()) {
            return 0 != 0;
        }
        this.\u0441\u0456hi\u04bb(optional.get());
        this.\u0445ec\u0458jpa = p\u0445\u0445o\u043e.\u0435e\u0458pe\u0440;
        return 1 != 0;
    }

    private /* synthetic */ void \u0441\u0456hi\u04bb(xc\u0455 xc\u04552) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        this.s\u043exh\u0430 = 0;
        this.a\u0435\u04bb(xc\u04552, i\u0456\u0441\u043e\u043ei.\u0458oa\u0445);
    }

    private /* synthetic */ void a\u0435\u04bb(xc\u0455 xc\u04552, i\u0456\u0441\u043e\u043ei i\u0456\u0441\u043e\u043ei2) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (true | false) {
        }
        if (0 != 0) {
        }
        this.\u0455\u0441\u0455\u0458\u043e = xc\u04552;
        this.a\u043e\u0455\u0440s = i\u0456\u0441\u043e\u043ei2;
        this.\u043e\u0440\u0441xp = xc\u04552.o\u0441\u0456p;
        this.\u043e\u0430e(xc\u04552.e\u043eeopai, 3);
    }

    private /* synthetic */ void \u0435\u043e\u0440\u0445s() {
        boolean bl;
        class_2338 class_23382;
        boolean bl2 = false;
        if (bl2) {
            __js_dispatch_state = 0;
            if (bl2) {
                __js_dispatch_state = 0;
            }
        }
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if (this.\u0455\u0441\u0455\u0458\u043e == null) {
            this.e\u0455s(false);
            return;
        }
        ++this.h\u0440i\u04bb\u0458a\u0435;
        class_2338 class_23383 = this.\u0455\u0441\u0455\u0458\u043e.o\u0441\u0456p;
        class_2338 class_23384 = this.\u0456pp\u0441p\u0435\u04bb(class_23383);
        if (class_23384 == null) {
            class_23382 = class_23383;
            if (bl2) {
                __js_dispatch_state = 0;
            }
        } else {
            class_23382 = class_23384;
        }
        class_2338 class_23385 = class_23382;
        boolean bl3 = this.\u0445she(class_23385);
        boolean bl4 = this.\u0456\u0455\u0441j\u0455(this.\u0456\u0455\u0430\u04bbij);
        boolean bl5 = this.h\u0440i\u04bb\u0458a\u0435 >= this.\u0456s\u0455jxsp();
        boolean bl6 = bl = bl4 || bl3 || bl5;
        if (this.ca\u0456ac > 0 && !bl) {
            --this.ca\u0456ac;
            return;
        }
        if (class_23384 != null) {
            this.x\u0458\u043ej = true;
            this.ej\u0435e = 0;
            this.\u043e\u0440\u0441xp = class_23384;
            this.\u043e\u0430e((class_243)\u0458ac.a_bsm9("method_24953", method_24953(net.minecraft.class_2382 ), (class_2382)class_23384), 3);
            if (!bl) {
                this.ca\u0456ac = 1;
                return;
            }
            int n = this.s\u0445ii\u0445\u0430a();
            if (n == -1) {
                if (++this.x\u0445\u0441 >= -791393660 + 791393668) {
                    this.e\u0455s(false);
                } else {
                    this.ca\u0456ac = 1;
                }
                return;
            }
            int n2 = \u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7545;
            this.\u0430\u04bbj\u0455(n);
            class_1269 class_12692 = \u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1761.method_2919((class_1657)\u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1724, class_1268.field_5808);
            if (class_12692.method_23665()) {
                \u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_6104(class_1268.field_5808);
            }
            this.\u0430\u04bbj\u0455(n2);
            if (++this.x\u0445\u0441 >= -861809085 + 861809093) {
                this.e\u0455s(false);
            } else {
                this.ca\u0456ac = 2;
            }
            return;
        }
        if (this.x\u0458\u043ej) {
            if (!this.h\u0430\u0456\u04bb()) {
                this.e\u0455s(true);
            }
            return;
        }
        if (++this.ej\u0435e >= -441953641 + 441953649) {
            this.e\u0455s(false);
            return;
        }
        if (!this.\u0445\u0445\u04bbo && this.ej\u0435e >= 2 && this.c\u0458a\u0455\u04bb() != -1 && this.a\u0440\u04bbe\u0441()) {
            this.\u0445\u0445\u04bbo = true;
            this.\u0445scxj\u043ej();
        }
        this.ca\u0456ac = 1;
    }

    private /* synthetic */ boolean h\u0430\u0456\u04bb() {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
            if (bl) {
                __js_dispatch_state = 0;
            }
        }
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if (this.\u0456\u0455\u0430\u04bbij == null || !this.\u0456\u0455\u0430\u04bbij.method_5805() || this.\u0456\u0455\u0430\u04bbij.method_31481() || this.\u0456\u0455\u0430\u04bbij.method_5809() || this.s\u043exh\u0430 >= 1 || this.c\u0458a\u0455\u04bb() == -1 || !this.\u0440pi\u0455\u0441o(this.\u0456\u0455\u0430\u04bbij, true)) {
            return 0 != 0;
        }
        Optional<xc\u0455> optional = this.jp\u0441c(this.\u0456\u0455\u0430\u04bbij);
        if (optional.isEmpty()) {
            return 0 != 0;
        }
        ++this.s\u043exh\u0430;
        this.a\u0435\u04bb(optional.get(), i\u0456\u0441\u043e\u043ei.\u0458oa\u0445);
        this.\u0445ec\u0458jpa = p\u0445\u0445o\u043e.\u0435e\u0458pe\u0440;
        return 1 != 0;
    }

    private /* synthetic */ boolean a\u0440\u04bbe\u0441() {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
            if (bl) {
                __js_dispatch_state = 0;
            }
        }
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (this.\u0456\u0455\u0430\u04bbij == null || !this.\u0456\u0455\u0430\u04bbij.method_5805() || this.\u0456\u0455\u0430\u04bbij.method_31481() || this.\u0455\u0441\u0455\u0458\u043e == null) {
            return 0 != 0;
        }
        if (this.a\u043e\u0455\u0440s == i\u0456\u0441\u043e\u043ei.\u0458oa\u0445) {
            return (this.\u0440pi\u0455\u0441o(this.\u0456\u0455\u0430\u04bbij, this.\u0445\u0430\u0445(this.\u0456\u0455\u0430\u04bbij)) && !this.\u04bbj\u0435\u0445\u0458hp(this.\u0455\u0441\u0455\u0458\u043e.o\u0441\u0456p) && this.piepsp(this.\u0455\u0441\u0455\u0458\u043e.o\u0441\u0456p) && this.s\u0456\u0455he(this.\u0455\u0441\u0455\u0458\u043e.\u0435\u043eo\u0455s) ? 1 : 0) != 0;
        }
        if (this.a\u043e\u0455\u0440s != i\u0456\u0441\u043e\u043ei.\u04bb\u04bb\u04bba && this.a\u043e\u0455\u0440s != i\u0456\u0441\u043e\u043ei.i\u043e\u0456 && this.\u0445\u0430\u0445(this.\u0456\u0455\u0430\u04bbij)) {
            return 0 != 0;
        }
        return (this.piepsp(this.\u0455\u0441\u0455\u0458\u043e.o\u0441\u0456p) && this.s\u0456\u0455he(this.\u0455\u0441\u0455\u0458\u043e.\u0435\u043eo\u0455s) ? 1 : 0) != 0;
    }

    private /* synthetic */ boolean \u0440pi\u0455\u0441o(class_1297 class_12972, boolean bl) {
        boolean bl2;
        boolean bl3 = false;
        if (bl3) {
            __js_dispatch_state = 0;
            if (bl3) {
                __js_dispatch_state = 0;
            }
        }
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if (!this.xi\u0440.axpacc() || class_12972.method_5809()) {
            return 0 != 0;
        }
        if (bl && this.\u0445\u0430\u0445(class_12972)) {
            bl2 = true;
            if (bl3) {
                __js_dispatch_state = 0;
            }
        } else {
            bl2 = false;
        }
        boolean bl4 = bl2;
        return (bl4 || this.p\u0458s\u043eso(class_12972) && !this.x\u0435\u0430\u0441\u04bb(class_12972) ? 1 : 0) != 0;
    }

    private /* synthetic */ boolean p\u0458s\u043eso(class_1297 class_12972) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        double d = class_12972.method_23318() - \u0458ac.a_bsm7("floor", floor(double ), (double)class_12972.method_23318());
        return (class_12972.method_24828() || \u0458ac.$_h58oejw1ngan17l5h((double)\u0458ac.a_bsm15("min", min(double double ), (double)d, (double)(1.0 - d)) == 0.08 ? 0 : ((double)\u0458ac.a_bsm15("min", min(double double ), (double)d, (double)(1.0 - d)) < 0.08 ? -1 : 1)) < 0 && \u0458ac.$_h58oejx1ngan17l5i((double)\u0458ac.a_bsm16("abs", abs(double ), (double)class_12972.method_18798().field_1351) == 0.12 ? 0 : ((double)\u0458ac.a_bsm16("abs", abs(double ), (double)class_12972.method_18798().field_1351) < 0.12 ? -1 : 1)) < 0 ? 1 : 0) != 0;
    }

    private /* synthetic */ boolean x\u0435\u0430\u0441\u04bb(class_1297 class_12972) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        class_243 class_2432 = this.\u0430\u0455\u0441(class_12972);
        return (\u0458ac.$_h58oejy1ngan17l5j(class_2432.field_1352 * class_2432.field_1352 + class_2432.field_1350 * class_2432.field_1350 == 0.01 ? 0 : (class_2432.field_1352 * class_2432.field_1352 + class_2432.field_1350 * class_2432.field_1350 > 0.01 ? 1 : -1)) >= 0 ? 1 : 0) != 0;
    }

    private /* synthetic */ class_243 \u0430\u0455\u0441(class_1297 class_12972) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return new class_243(class_12972.method_23317() - class_12972.field_6014, 0.0, class_12972.method_23321() - class_12972.field_5969);
    }

    private /* synthetic */ boolean piepsp(class_2338 class_23382) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
            if (bl) {
                __js_dispatch_state = 0;
            }
        }
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return (\u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.method_8320(class_23382).method_45474() && \u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.method_8316(class_23382).method_15769() && !this.hc\u0445\u04bb\u0456i\u04bb(class_23382) ? 1 : 0) != 0;
    }

    private /* synthetic */ boolean s\u0456\u0455he(class_2338 class_23382) {
        int n;
        class_2680 class_26802;
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if (!(class_26802 = \u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.method_8320(class_23382)).method_45474() && !this.x\u0430\u043e(class_23382).method_1110()) {
            n = 1;
            if (bl) {
                __js_dispatch_state = 0;
            }
        } else {
            n = 0;
        }
        return n != 0;
    }

    private /* synthetic */ class_265 x\u0430\u043e(class_2338 class_23382) {
        class_2680 class_26802;
        class_265 class_2652;
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
            if (bl) {
                __js_dispatch_state = 0;
            }
        }
        if (true | false) {
        }
        if (0 != 0) {
        }
        return (class_2652 = (class_26802 = \u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.method_8320(class_23382)).method_26218((class_1922)\u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1687, class_23382)).method_1110() ? class_26802.method_26220((class_1922)\u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1687, class_23382) : class_2652;
    }

    private /* synthetic */ boolean hc\u0445\u04bb\u0456i\u04bb(class_2338 class_23382) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (true | false) {
        }
        if (0 != 0) {
        }
        return (\u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_5829().method_994(new class_238(class_23382)) ? 1 : 0) != 0;
    }

    private /* synthetic */ boolean \u0445\u0430\u0445(class_1297 class_12972) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return (class_12972 != null && this.\u0445i\u0455\u0430o(class_12972.method_5829(), false) ? 1 : 0) != 0;
    }

    private /* synthetic */ boolean \u0458h\u0445a\u0456(class_238 class_2383) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return (this.\u0445i\u0455\u0430o(class_2383, true) ? 1 : 0) != 0;
    }

    private /* synthetic */ boolean \u0445i\u0455\u0430o(class_238 class_2383, boolean bl) {
        boolean bl2 = false;
        if (bl2) {
            __js_dispatch_state = 0;
        }
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        int n = 0;
        for (int i = (int)\u0458ac.a_bsm7("floor", floor(double ), (double)class_2383.field_1323); i <= (int)\u0458ac.a_bsm7("floor", floor(double ), (double)class_2383.field_1320); ++i) {
            for (int j = (int)\u0458ac.a_bsm7("floor", floor(double ), (double)class_2383.field_1322); j <= (int)\u0458ac.a_bsm7("floor", floor(double ), (double)class_2383.field_1325); ++j) {
                for (int k = (int)\u0458ac.a_bsm7("floor", floor(double ), (double)class_2383.field_1321); k <= (int)\u0458ac.a_bsm7("floor", floor(double ), (double)class_2383.field_1324); ++k) {
                    class_2338 class_23382 = new class_2338(i, j, k);
                    if (!class_2383.method_994(new class_238(class_23382))) continue;
                    boolean bl3 = \u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.method_8320(class_23382).method_27852(class_2246.field_10343);
                    if (bl && !bl3) {
                        return 0 != 0;
                    }
                    if (!bl3) continue;
                    n = 1;
                    if (0 == 0 || 0 == 1) continue;
                    if (0 == 2) continue;
                }
                if (!bl2) continue;
                __js_dispatch_state = 0;
            }
        }
        return n != 0;
    }

    private /* synthetic */ class_2338 \u0456pp\u0441p\u0435\u04bb(class_2338 class_23382) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        class_2338 class_23383 = null;
        double d = Double.POSITIVE_INFINITY;
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                for (int k = -1; k <= 1; ++k) {
                    double d2;
                    class_2338 class_23384 = class_23382.method_10069(i, j, k);
                    if (!this.ha\u0440j(class_23384) || \u0458ac.$_h58oejz1ngan17l5k((d2 = \u0458ac.a_bsm9("method_24953", method_24953(net.minecraft.class_2382 ), (class_2382)class_23382).method_1025((class_243)\u0458ac.a_bsm9("method_24953", method_24953(net.minecraft.class_2382 ), (class_2382)class_23384))) == d ? 0 : ((d2 = \u0458ac.a_bsm9("method_24953", method_24953(net.minecraft.class_2382 ), (class_2382)class_23382).method_1025((class_243)\u0458ac.a_bsm9("method_24953", method_24953(net.minecraft.class_2382 ), (class_2382)class_23384))) < d ? -1 : 1)) >= 0) continue;
                    class_23383 = class_23384;
                    d = d2;
                }
            }
            if (!bl) continue;
            __js_dispatch_state = 0;
        }
        return class_23383;
    }

    private /* synthetic */ boolean ha\u0440j(class_2338 class_23382) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (true | false) {
        }
        if (0 != 0) {
        }
        return (\u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.method_8320(class_23382).method_27852(class_2246.field_10164) && \u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.method_8316(class_23382).method_15771() ? 1 : 0) != 0;
    }

    private /* synthetic */ boolean \u0445she(class_2338 class_23382) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (true | false) {
        }
        if (0 != 0) {
        }
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                for (int k = -1; k <= 1; ++k) {
                    class_3610 class_36102 = \u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.method_8316(class_23382.method_10069(i, j, k));
                    class_3611 class_36112 = class_36102.method_15772();
                    if (class_36112 != class_3612.field_15908 && class_36112 != class_3612.field_15907 || class_36102.method_15771()) continue;
                    return 1 != 0;
                }
            }
        }
        return 0 != 0;
    }

    private /* synthetic */ boolean \u04bbj\u0435\u0445\u0458hp(class_2338 class_23382) {
        int n;
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        class_3611 class_36112 = \u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.method_8316(class_23382).method_15772();
        if (\u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.method_8320(class_23382).method_27852(class_2246.field_10382) || class_36112 == class_3612.field_15910 || class_36112 == class_3612.field_15909) {
            n = 1;
            if (bl) {
                __js_dispatch_state = 0;
            }
        } else {
            n = 0;
        }
        return n != 0;
    }

    private /* synthetic */ int \u0456s\u0455jxsp() {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return (int)\u0458ac.a_bsm12("max", max(int int ), (int)1, (int)(class_3612.field_15908.method_15789((class_4538)\u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1687) - 1));
    }

    private /* synthetic */ boolean \u0456\u0455\u0441j\u0455(class_1297 class_12972) {
        class_1657 class_16572;
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (true | false) {
        }
        if (0 != 0) {
        }
        return (class_12972 instanceof class_1657 && ((class_16572 = (class_1657)class_12972).method_6047().method_31574(class_1802.field_8705) || class_16572.method_6079().method_31574(class_1802.field_8705)) ? 1 : 0) != 0;
    }

    private /* synthetic */ void \u043e\u0430e(class_243 class_2432, int n) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        CallSite callSite = \u0458ac.a_bsm17("oeo", oeo(net.minecraft.class_243 net.minecraft.class_243 ), (class_243)\u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_33571(), (class_243)class_2432);
        \u0458ac.a_bsm18("j\u0458o\u0455x", j\u0458o\u0455x(\u0458\u0458\u0458o\u0430\u0456.e\u0445\u0440\u0440a double int \u0441\u0445o.jax\u0458\u0435\u0458 ), (e\u0445\u0440\u0440a)((Object)callSite), (double)180.0, (int)n, (jax\u0458\u0435\u0458)jax\u0458\u0435\u0458.pp\u0435c);
    }

    private /* synthetic */ void \u0430\u04bbj\u0455(int n) {
        block7: {
            block6: {
                boolean bl = false;
                if (bl) {
                    __js_dispatch_state = 0;
                }
                if (true | false) {
                }
                if (0 != 0) {
                }
                if (n < 0) break block6;
                if (\u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7545 != n) break block7;
            }
            return;
        }
        \u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7545 = n;
        \u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1761.method_2911();
    }

    private /* synthetic */ void \u0440\u0456\u0435() {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if (this.\u0435ah != -1 && \u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 != null && \u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1761 != null) {
            this.\u0430\u04bbj\u0455(this.\u0435ah);
        }
        this.\u0435ah = -1;
    }

    private /* synthetic */ int \u0430s\u0445() {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
            if (bl) {
                __js_dispatch_state = 0;
            }
        }
        if (true | false) {
        }
        if (0 != 0) {
        }
        return this.j\u0455x(class_1802.field_8786, false);
    }

    private /* synthetic */ int c\u0458a\u0455\u04bb() {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (true | false) {
        }
        if (0 != 0) {
        }
        return this.j\u0455x(class_1802.field_8187, false);
    }

    private /* synthetic */ int s\u0445ii\u0445\u0430a() {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
            if (bl) {
                __js_dispatch_state = 0;
            }
        }
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return this.j\u0455x(class_1802.field_8550, false);
    }

    private /* synthetic */ int \u0445ph\u043e() {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return this.j\u0455x(null, true);
    }

    private /* synthetic */ int j\u0455x(class_1792 class_17922, boolean bl) {
        boolean bl2 = false;
        if (bl2) {
            __js_dispatch_state = 0;
        }
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (\u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 == null) {
            return -1;
        }
        for (int i = 0; i < -1338978985 + 1338978994; ++i) {
            class_1799 class_17992 = \u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().method_5438(i);
            if (class_17992.method_7960() || !(bl ? class_17992.method_7909() instanceof class_1829 : class_17992.method_31574(class_17922))) continue;
            return i;
        }
        return -1;
    }

    private /* synthetic */ boolean \u0458\u0455j\u0435j\u0440() {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
            if (bl) {
                __js_dispatch_state = 0;
            }
        }
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        if (\u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_6115() || \u0458ac.a_bsm19("c\u0458\u0440\u0456c\u0440s", c\u0458\u0440\u0456c\u0440s()) != false) {
            return 1 != 0;
        }
        \u0441\u043e\u0456 \u0441\u043e\u04562 = (\u0441\u043e\u0456)((\u0445\u0440\u0430\u0435\u0445\u043e)((Object)\u0458ac.a_bsm3("jaa\u0435\u0445c", jaa\u0435\u0445c()))).\u0430o\u0441\u0456p\u0455().\u0441c\u0458\u043e\u0430(\u0441\u043e\u0456.class);
        hc\u0445o hc\u0445o2 = (hc\u0445o)((\u0445\u0440\u0430\u0435\u0445\u043e)((Object)\u0458ac.a_bsm3("jaa\u0435\u0445c", jaa\u0435\u0445c()))).\u0430o\u0441\u0456p\u0455().\u0441c\u0458\u043e\u0430(hc\u0445o.class);
        h\u0455\u0445a\u0456s h\u0455\u0445a\u0456s2 = (h\u0455\u0445a\u0456s)((\u0445\u0440\u0430\u0435\u0445\u043e)((Object)\u0458ac.a_bsm3("jaa\u0435\u0445c", jaa\u0435\u0445c()))).\u0430o\u0441\u0456p\u0455().\u0441c\u0458\u043e\u0430(h\u0455\u0445a\u0456s.class);
        return (\u0441\u043e\u04562.\u0440\u0435\u0455x\u0435xe() || hc\u0445o2.\u0440\u0435\u0455x\u0435xe() && (hc\u0445o.j\u0456j\u0456s\u0445 != null || hc\u0445o.\u0430\u0435ca) || h\u0455\u0445a\u0456s2.\u0440\u0435\u0455x\u0435xe() && \u0458ac.a_bsm20("cj\u0455i\u0455\u0430s", cj\u0455i\u0455\u0430s()) != false ? 1 : 0) != 0;
    }

    private /* synthetic */ void e\u0455s(boolean bl) {
        boolean bl2 = false;
        if (bl2) {
            __js_dispatch_state = 0;
            if (bl2) {
                __js_dispatch_state = 0;
            }
        }
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        this.\u0440\u0456\u0435();
        this.\u0445ec\u0458jpa = p\u0445\u0445o\u043e.\u0445x\u0456;
        this.\u0455\u0441\u0455\u0458\u043e = null;
        this.a\u043e\u0455\u0440s = null;
        this.\u0456\u0455\u0430\u04bbij = null;
        this.\u043e\u0440\u0441xp = null;
        this.s\u043exh\u0430 = 0;
        this.ej\u0435e = 0;
        this.x\u0445\u0441 = 0;
        this.h\u0440i\u04bb\u0458a\u0435 = 0;
        this.ca\u0456ac = 0;
        this.\u0445\u0445\u04bbo = false;
        this.x\u0458\u043ej = false;
        this.\u0435jjp();
        if (bl) {
            this.\u0430x\u0456\u0435p = 0;
        }
    }

    private /* synthetic */ void \u0435jjp() {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        this.\u04bbc\u043es\u0440a = null;
        this.\u043ehssa = \u0430es\u0441c\u0441i.\u043e\u0435ic\u0455;
        this.\u04bbe\u0441e\u0458jp = null;
        this.\u0458\u04bbo = 0;
        this.\u0440\u0458\u0440 = false;
    }

    @\u0445\u0458\u0458h\u0445\u0430a
    public void o\u04bbjp(i\u0456o\u0430\u0435o i\u0456o\u0430\u0435o2) {
        Color color;
        block9: {
            block8: {
                boolean bl = false;
                if (bl) {
                    __js_dispatch_state = 0;
                }
                if ((3 * 3 + 3) % 2 == 0) {
                }
                if (0 != 0) {
                }
                if (!this.\u0435h\u043ecoo\u0441.axpacc() || \u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1773 == null) break block8;
                if (this.\u043e\u0440\u0441xp != null) break block9;
            }
            return;
        }
        class_4587 class_45872 = i\u0456o\u0430\u0435o2.\u0445\u0455i\u0430pi();
        class_243 class_2432 = \u0458ac.\u0430\u0445j\u0445s\u0456\u04bb.field_1773.method_19418().method_19326();
        class_45872.method_22903();
        class_45872.method_22904(-class_2432.field_1352, -class_2432.field_1351, -class_2432.field_1350);
        \u0458ac.a_bsm21("enableBlend", enableBlend());
        \u0458ac.a_bsm22("defaultBlendFunc", defaultBlendFunc());
        \u0458ac.a_bsm23("disableDepthTest", disableDepthTest());
        \u0458ac.a_bsm24("depthMask", depthMask(boolean ), (boolean)false);
        \u0458ac.a_bsm25("setShader", setShader(java.util.function.Supplier ), class_757::method_34539);
        Color color2 = color = this.a\u043e\u0455\u0440s == i\u0456\u0441\u043e\u043ei.\u0458oa\u0445 ? new Color(-1910454759 + 1910455014, -2137034899 + 2137034999, 0) : Color.WHITE;
        if (this.\u043e\u0440\u0441xp != null) {
            this.\u043ec\u0441c\u0445(class_45872, new class_238(this.\u043e\u0440\u0441xp), color, 0.25f, 0.75f);
        }
        if (this.\u0455\u0441\u0455\u0458\u043e != null) {
            this.\u043ec\u0441c\u0445(class_45872, this.sc\u0441\u0430s\u0441\u0430(this.\u0455\u0441\u0455\u0458\u043e.\u0435\u043eo\u0455s, this.\u0455\u0441\u0455\u0458\u043e.\u043epp), new Color(-379606708 + 379606963, -1309044661 + 1309044891, 0), 0.45f, 0.95f);
            this.i\u0441hoo\u0455(class_45872, this.\u0455\u0441\u0455\u0458\u043e.e\u043eeopai, new Color(-1296518324 + 1296518579, -1261656952 + 1261657182, 0));
        }
        \u0458ac.a_bsm26("setShaderColor", setShaderColor(float float float float ), (float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        \u0458ac.a_bsm24("depthMask", depthMask(boolean ), (boolean)true);
        \u0458ac.a_bsm27("enableDepthTest", enableDepthTest());
        \u0458ac.a_bsm28("disableBlend", disableBlend());
        class_45872.method_22909();
    }

    private /* synthetic */ void \u043ec\u0441c\u0445(class_4587 class_45872, class_238 class_2383, Color color, float f, float f2) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (true | false) {
        }
        if (0 != 0) {
        }
        \u0458ac.a_bsm26("setShaderColor", setShaderColor(float float float float ), (float)((float)color.getRed() / 255.0f), (float)((float)color.getGreen() / 255.0f), (float)((float)color.getBlue() / 255.0f), (float)f);
        \u0458ac.a_bsm29("\u0458\u0458\u04bb", \u0458\u0458\u04bb(net.minecraft.class_238 net.minecraft.class_4587 ), (class_238)class_2383, (class_4587)class_45872);
        \u0458ac.a_bsm26("setShaderColor", setShaderColor(float float float float ), (float)((float)color.getRed() / 255.0f), (float)((float)color.getGreen() / 255.0f), (float)((float)color.getBlue() / 255.0f), (float)f2);
        \u0458ac.a_bsm30("si\u0440\u0455o", si\u0440\u0455o(net.minecraft.class_238 net.minecraft.class_4587 ), (class_238)class_2383, (class_4587)class_45872);
    }

    private /* synthetic */ void i\u0441hoo\u0455(class_4587 class_45872, class_243 class_2432, Color color) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (true | false) {
        }
        if (0 != 0) {
        }
        double d = 0.04;
        \u0458ac.a_bsm26("setShaderColor", setShaderColor(float float float float ), (float)((float)color.getRed() / 255.0f), (float)((float)color.getGreen() / 255.0f), (float)((float)color.getBlue() / 255.0f), (float)0.85f);
        \u0458ac.a_bsm29("\u0458\u0458\u04bb", \u0458\u0458\u04bb(net.minecraft.class_238 net.minecraft.class_4587 ), (class_238)new class_238(class_2432.field_1352 - d, class_2432.field_1351 - d, class_2432.field_1350 - d, class_2432.field_1352 + d, class_2432.field_1351 + d, class_2432.field_1350 + d), (class_4587)class_45872);
    }

    private /* synthetic */ class_238 sc\u0441\u0430s\u0441\u0430(class_2338 class_23382, class_2350 class_23502) {
        class_238 class_2383;
        block13: {
            double d;
            double d2;
            double d3;
            double d4;
            block12: {
                block11: {
                    block10: {
                        boolean bl;
                        block9: {
                            block8: {
                                block7: {
                                    bl = false;
                                    if (bl) {
                                        __js_dispatch_state = 0;
                                    }
                                    if (true | false) {
                                    }
                                    if (0 != 0) {
                                    }
                                    d4 = class_23382.method_10263();
                                    d3 = class_23382.method_10264();
                                    d2 = class_23382.method_10260();
                                    d = 0.002;
                                    int n = eh\u043e\u043ehi.p\u0441ax[class_23502.ordinal()];
                                    if (n == 1) break block7;
                                    if (n == 2) break block8;
                                    if (n == 3) break block9;
                                    if (n == 4) break block10;
                                    if (n == 5) break block11;
                                    if (n != 6) {
                                        throw new MatchException(null, null);
                                    }
                                    break block12;
                                }
                                class_2383 = new class_238(d4, d3 + 1.0 - d, d2, d4 + 1.0, d3 + 1.0 + d, d2 + 1.0);
                                break block13;
                            }
                            class_2383 = new class_238(d4, d3 - d, d2, d4 + 1.0, d3 + d, d2 + 1.0);
                            if (0 != 0 && 0 != 1 && 0 != 2) {
                                // empty if block
                            }
                            break block13;
                        }
                        class_2383 = new class_238(d4 + 1.0 - d, d3, d2, d4 + 1.0 + d, d3 + 1.0, d2 + 1.0);
                        if (bl) {
                            __js_dispatch_state = 0;
                        }
                        break block13;
                    }
                    class_2383 = new class_238(d4 - d, d3, d2, d4 + d, d3 + 1.0, d2 + 1.0);
                    if (0 != 0 && 0 != 1 && 0 != 2) {
                        // empty if block
                    }
                    break block13;
                }
                class_2383 = new class_238(d4, d3, d2 + 1.0 - d, d4 + 1.0, d3 + 1.0, d2 + 1.0 + d);
                break block13;
            }
            class_2383 = new class_238(d4, d3, d2 - d, d4 + 1.0, d3 + 1.0, d2 + d);
        }
        return class_2383;
    }

    private /* synthetic */ double s\u0458\u0440(double d, double d2, double d3) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return (double)\u0458ac.a_bsm31("max", max(double double ), (double)d2, (double)\u0458ac.a_bsm15("min", min(double double ), (double)d3, (double)d));
    }

    private /* synthetic */ double ia\u0458oop(double d, double d2, double d3) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (true | false) {
        }
        if (0 != 0) {
        }
        return d + (d2 - d) * d3;
    }

    private static /* synthetic */ double \u0441\u0440h\u0445(class_2338 class_23382, pcx\u0435\u04bb\u0456\u0445 pcx\u0435\u04bb\u0456\u04452) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if ((3 * 3 + 3) % 2 == 0) {
        }
        return \u0458ac.a_bsm9("method_24953", method_24953(net.minecraft.class_2382 ), (class_2382)pcx\u0435\u04bb\u0456\u04452.s\u0440x\u0441s).method_1025((class_243)\u0458ac.a_bsm9("method_24953", method_24953(net.minecraft.class_2382 ), (class_2382)class_23382));
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

    private static /* synthetic */ CallSite a_bsm24(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm25(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm26(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm27(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm28(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm29(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm30(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm31(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm32(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }
}

