/*
 * Decompiled with CFR 0.152.
 */
package \u0440expho;

import c\u0445is.hoi\u0435h\u0440;
import h\u0441\u043e\u04bb\u0441\u0458\u0445.c\u0455i\u0430\u0440\u0445;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_1268;
import net.minecraft.class_1657;
import net.minecraft.class_1750;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2382;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_2482;
import net.minecraft.class_2680;
import net.minecraft.class_2741;
import net.minecraft.class_2769;
import net.minecraft.class_2771;
import net.minecraft.class_3481;
import net.minecraft.class_3486;
import net.minecraft.class_3610;
import net.minecraft.class_3965;
import net.minecraft.class_746;
import o\u0455sio\u0440.\u0445\u0458\u0458h\u0445\u0430a;
import spso.\u0430c\u0440;
import spso.\u0441a\u0458p;
import \u0435xp.h\u04bb\u0455hpa;
import \u0435xp.\u043ea\u0441\u0430p;
import \u0440expho.p\u043eo;
import \u0440expho.\u04bb\u0456ac\u0435\u0440\u0458;
import \u0440o\u0456\u0445o.\u0445\u0440\u0430\u0435\u0445\u043e;
import \u0441j\u0455\u0440.o\u0440\u0455\u0441\u0456;
import \u0441j\u0455\u0440.o\u0445pj;
import \u0441j\u0455\u0440.s\u043ehc;
import \u0441\u0445o.\u0458op\u0430\u0441;
import \u0445eo.c\u0455pi;
import \u0445eo.\u0456p\u0430\u043e\u0458\u043e;
import \u0445eo.\u0458i\u0456x;
import \u0458\u0458\u0458o\u0430\u0456.e\u0445\u0440\u0440a;
import \u04bb\u043eh\u0456.csa;
import \u04bb\u043eh\u0456.h\u0456o\u04bbhe;
import \u04bb\u043eh\u0456.\u0445j\u0458\u0430a\u0435\u0458;
import \u04bb\u043eh\u0456.\u04bb\u0430\u0441\u0456\u0455\u04bb;

@\u0456p\u0430\u043e\u0458\u043e(sp\u0456p\u0445\u0435="AutoMLG", a\u0456j\u0430\u0455\u04bb="Automatically places water when falling", s\u0455cj=\u0458i\u0456x.MOVEMENT)
public class hc\u0445o
extends c\u0455pi {
    private final /* synthetic */ \u043ea\u0441\u0430p eoe;
    private final /* synthetic */ h\u04bb\u0455hpa jix;
    public static /* synthetic */ \u04bb\u0430\u0441\u0456\u0455\u04bb j\u0456j\u0456s\u0445;
    public static /* synthetic */ boolean \u0430\u0435ca;
    private /* synthetic */ int \u04bb\u0440a;
    private /* synthetic */ int cc\u0441x\u0440\u0445h;
    private static /* synthetic */ int __js_dispatch_state = 0;

    public hc\u0445o() {
        if (true | false) {
        }
        if (hc\u0445o.$_h10q7pfr1ngan17lmg((long)hc\u0445o.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)hc\u0445o.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        byte[] byArray = new byte[-2031662354 + 2031662367];
        byArray[0] = -1704442351 + 1704442380;
        byArray[1] = -1426418851 + 1426418814;
        byArray[2] = -1830501948 + 1830501852;
        byArray[3] = -1384515442 + 1384515432;
        byArray[4] = -1669781837 + 1669781953;
        byArray[5] = -393205312 + 393205340;
        byArray[-176009081 + 176009087] = -763838715 + 763838741;
        byArray[-1565158813 + 1565158820] = -1322408385 + 1322408295;
        byArray[-803863134 + 803863142] = -1111603255 + 1111603186;
        byArray[-537819386 + 537819395] = -1682959938 + 1682959869;
        byArray[-1752708186 + 1752708196] = -1120385552 + 1120385509;
        byArray[-1307443531 + 1307443542] = -465185517 + 465185487;
        byArray[-1748634472 + 1748634484] = 3;
        this.eoe = ((\u0430c\u0440)((Object)hc\u0445o.a_bsm2("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)hc\u0445o.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(301106286 + 916833321), (int)(-2026501268 + 1703993689)))))).s\u0458\u0458a(3.0f).x\u0455heah\u0445(0.1f).\u043ecxi\u0455(3.0f).a\u0455\u0445\u0435c(15.0f).\u0458c\u0456\u0440().getFloatValue();
        byte[] byArray2 = new byte[-1164280547 + 1164280564];
        byArray2[0] = -1207263170 + 1207263070;
        byArray2[1] = -605858970 + 605858995;
        byArray2[2] = -863335489 + 863335371;
        byArray2[3] = -1499599625 + 1499599641;
        byArray2[4] = -717654990 + 717655042;
        byArray2[5] = -221364167 + 221364149;
        byArray2[-2082992059 + 2082992065] = -1560203275 + 1560203223;
        byArray2[-573623869 + 573623876] = -957084360 + 957084480;
        byArray2[-179105951 + 179105959] = -1657276231 + 1657276189;
        byArray2[-115330443 + 115330452] = -1462072138 + 1462072068;
        byArray2[-1124221898 + 1124221908] = -974079636 + 974079692;
        byArray2[-2034496525 + 2034496536] = -1808459295 + 1808459315;
        byArray2[-359708093 + 359708105] = -77191886 + 77191778;
        byArray2[-501473132 + 501473145] = -1347809547 + 1347809668;
        byArray2[-1041971449 + 1041971463] = -1081356813 + 1081356749;
        byArray2[-542626872 + 542626887] = -866555716 + 866555732;
        byArray2[-543383674 + 543383690] = -742105991 + 742105953;
        this.jix = ((\u0430c\u0440)((Object)hc\u0445o.a_bsm2("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)hc\u0445o.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray2, (int)(-1593363195 + 1376304650), (int)(-607542118 + 12007398)))))).\u0455xi\u0440(true).\u0458c\u0456\u0440().getBooleanValue();
        this.\u04bb\u0440a = -1;
        this.cc\u0441x\u0440\u0445h = -1;
    }

    @\u0445\u0458\u0458h\u0445\u0430a
    public void \u04bbo\u0435(hoi\u0435h\u0440 hoi\u0435h\u04402) {
        o\u0445pj o\u0445pj2;
        Integer n;
        boolean bl;
        block30: {
            block29: {
                block28: {
                    block27: {
                        bl = false;
                        if (bl) {
                            __js_dispatch_state = 0;
                        }
                        if ((3 * 3 + 3) % 2 == 0) {
                        }
                        if (hc\u0445o.$_h10q7pfs1ngan17lmh((long)hc\u0445o.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)hc\u0445o.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
                            throw null;
                        }
                        if (0 != 0) {
                        }
                        if (hc\u0445o.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 == null || hc\u0445o.\u0430\u0445j\u0445s\u0456\u04bb.field_1687 == null) break block27;
                        if (!hc\u0445o.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_6115()) break block28;
                    }
                    return;
                }
                if (\u0430\u0435ca) {
                    if (!((\u0445\u0440\u0430\u0435\u0445\u043e)((Object)hc\u0445o.a_bsm3("jaa\u0435\u0445c", jaa\u0435\u0445c()))).\u0430o\u0441\u0456p\u0455().\u0441c\u0458\u043e\u0430(p\u043eo.class).\u0440\u0435\u0455x\u0435xe()) {
                        this.\u0441\u0458j\u0440s\u0441();
                    }
                    return;
                }
                if (hc\u0445o.$_h10q7pft1ngan17lmi(hc\u0445o.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.field_6017 == this.eoe.axpacc() ? 0 : (hc\u0445o.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.field_6017 < this.eoe.axpacc() ? -1 : 1)) <= 0 || c\u0455i\u0430\u0440\u0445.ejih != null && this.jix.axpacc()) {
                    j\u0456j\u0456s\u0445 = null;
                    return;
                }
                n = this.ps\u0441o\u0458\u043e(new class_1792[]{class_1802.field_8705, class_1802.field_8786, class_1802.field_27876, class_1802.field_17528, class_1802.field_8828});
                if (n == null) {
                    return;
                }
                o\u0445pj2 = ((o\u0440\u0455\u0441\u0456)((Object)hc\u0445o.a_bsm4("xi\u0458i\u0435es", xi\u0458i\u0435es(net.minecraft.class_746 ), (class_746)hc\u0445o.\u0430\u0445j\u0445s\u0456\u04bb.field_1724))).\u043e\u0456\u0430(3);
                if (o\u0445pj2 == null) break block29;
                if (o\u0445pj2.\u0455x\u0441() != null) break block30;
            }
            return;
        }
        class_2338 class_23382 = o\u0445pj2.\u0455x\u0441();
        class_2680 class_26802 = hc\u0445o.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.method_8320(class_23382);
        class_2248 class_22482 = class_26802.method_26204();
        if (this.\u0455p\u0445\u0435j\u0458(class_22482)) {
            j\u0456j\u0456s\u0445 = null;
            return;
        }
        csa csa2 = new csa((List<class_2382>)((Object)hc\u0445o.a_bsm5("singletonList", singletonList(T ), (Object)new class_2382(0, 0, 0))), hc\u0445o.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().method_5438(n.intValue()), h\u0456o\u04bbhe.\u0440\u0455p, csa.\u0445\u0435pp\u0441p\u04bb);
        j\u0456j\u0456s\u0445 = hc\u0445o.ha\u0430o\u043ej(class_23382.method_10084(), csa2);
        if (j\u0456j\u0456s\u0445 != null) {
            class_3965 class_39652;
            class_3965 class_39653;
            hc\u0445o.a_bsm6("\u0440\u043ej\u0441x", \u0440\u043ej\u0441x(\u0458\u0458\u0458o\u0430\u0456.e\u0445\u0440\u0440a double ), (e\u0445\u0440\u0440a)j\u0456j\u0456s\u0445.\u0458\u0458\u0435(), (double)180.0);
            e\u0445\u0440\u0440a e\u0445\u0440\u0440a2 = \u0458op\u0430\u0441.\u0441ii\u04bbo\u0445;
            CallSite callSite = hc\u0445o.a_bsm7("xea\u0435i\u043e\u0445", xea\u0435i\u043e\u0445(\u0458\u0458\u0458o\u0430\u0456.e\u0445\u0440\u0440a double ), (e\u0445\u0440\u0440a)e\u0445\u0440\u0440a2, (double)4.5);
            e\u0445\u0440\u0440a e\u0445\u0440\u0440a3 = \u0458op\u0430\u0441.ia\u04bb != null ? \u0458op\u0430\u0441.ia\u04bb : e\u0445\u0440\u0440a2;
            CallSite callSite2 = hc\u0445o.a_bsm7("xea\u0435i\u043e\u0445", xea\u0435i\u043e\u0445(\u0458\u0458\u0458o\u0430\u0456.e\u0445\u0440\u0440a double ), (e\u0445\u0440\u0440a)e\u0445\u0440\u0440a3, (double)4.5);
            if (callSite instanceof class_3965 && (class_39653 = (class_3965)callSite).method_17783() == class_239.class_240.field_1332 && class_39653.method_17777().equals((Object)j\u0456j\u0456s\u0445.exi()) && callSite2 instanceof class_3965 && (class_39652 = (class_3965)callSite2).method_17783() == class_239.class_240.field_1332 && class_39652.method_17777().equals((Object)j\u0456j\u0456s\u0445.exi())) {
                boolean bl2;
                class_2680 class_26803 = hc\u0445o.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.method_8320(class_39653.method_17777());
                if (class_26803.method_26164(class_3481.field_15503)) {
                    return;
                }
                class_1799 class_17992 = hc\u0445o.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().method_5438(n.intValue());
                if (class_26803.method_26204() instanceof class_2482 && class_26803.method_11654((class_2769)class_2482.field_11501) == class_2771.field_12681) {
                    v0 = true;
                    if (bl) {
                        __js_dispatch_state = 0;
                    }
                } else {
                    v0 = bl2 = false;
                }
                if (class_17992.method_31574(class_1802.field_8705) && class_26803.method_28498((class_2769)class_2741.field_12508) && !bl2) {
                    return;
                }
                this.\u04bb\u0440a = hc\u0445o.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7545;
                hc\u0445o.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7545 = n;
                this.x\u0441ch\u0435\u0445();
                if (class_17992.method_31574(class_1802.field_8705)) {
                    \u0430\u0435ca = true;
                    this.cc\u0441x\u0440\u0445h = -1688279669 + 1688279675;
                } else {
                    j\u0456j\u0456s\u0445 = null;
                }
            } else {
                this.japp\u0440\u04bb();
            }
        }
    }

    private /* synthetic */ void \u0441\u0458j\u0440s\u0441() {
        block15: {
            block14: {
                boolean bl = false;
                if (bl) {
                    __js_dispatch_state = 0;
                }
                if (true | false) {
                }
                if (hc\u0445o.$_h10q7pfu1ngan17lmj((long)hc\u0445o.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)hc\u0445o.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
                    throw null;
                }
                if (0 != 0) {
                }
                if (hc\u0445o.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 == null) break block14;
                if (hc\u0445o.\u0430\u0445j\u0445s\u0456\u04bb.field_1687 != null) break block15;
            }
            return;
        }
        if (j\u0456j\u0456s\u0445 != null) {
            hc\u0445o.a_bsm6("\u0440\u043ej\u0441x", \u0440\u043ej\u0441x(\u0458\u0458\u0458o\u0430\u0456.e\u0445\u0440\u0440a double ), (e\u0445\u0440\u0440a)((Object)hc\u0445o.a_bsm8("\u0458h\u0456xxh", \u0458h\u0456xxh(net.minecraft.class_2338 ), (class_2338)j\u0456j\u0456s\u0445.\u0441\u0441\u0445\u0435jh())), (double)180.0);
        }
        if (this.cc\u0441x\u0440\u0445h <= 5) {
            e\u0445\u0440\u0440a e\u0445\u0440\u0440a2 = \u0458op\u0430\u0441.\u0441ii\u04bbo\u0445;
            CallSite callSite = hc\u0445o.a_bsm7("xea\u0435i\u043e\u0445", xea\u0435i\u043e\u0445(\u0458\u0458\u0458o\u0430\u0456.e\u0445\u0440\u0440a double ), (e\u0445\u0440\u0440a)e\u0445\u0440\u0440a2, (double)4.5);
            e\u0445\u0440\u0440a e\u0445\u0440\u0440a3 = \u0458op\u0430\u0441.ia\u04bb != null ? \u0458op\u0430\u0441.ia\u04bb : e\u0445\u0440\u0440a2;
            CallSite callSite2 = hc\u0445o.a_bsm7("xea\u0435i\u043e\u0445", xea\u0435i\u043e\u0445(\u0458\u0458\u0458o\u0430\u0456.e\u0445\u0440\u0440a double ), (e\u0445\u0440\u0440a)e\u0445\u0440\u0440a3, (double)4.5);
            Integer n = this.ps\u0441o\u0458\u043e(new class_1792[]{class_1802.field_8550});
            if (n == null) {
                this.japp\u0440\u04bb();
                return;
            }
            hc\u0445o.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7545 = n;
            if (hc\u0445o.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_6047().method_31574(class_1802.field_8550) && callSite instanceof class_3965) {
                class_3965 class_39652;
                class_3965 class_39653 = (class_3965)callSite;
                if (callSite2 instanceof class_3965 && (class_39652 = (class_3965)callSite2).method_17777().equals((Object)class_39653.method_17777())) {
                    class_2680 class_26802 = hc\u0445o.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.method_8320(class_39653.method_17777());
                    class_2680 class_26803 = hc\u0445o.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.method_8320(class_39653.method_17777().method_10084());
                    class_3610 class_36102 = hc\u0445o.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.method_8316(class_39653.method_17777());
                    if (class_39653.method_17783() == class_239.class_240.field_1332 && (class_26802.method_26204() == class_2246.field_10382 || class_26803.method_26204() == class_2246.field_10382 || class_36102.method_15767(class_3486.field_15517))) {
                        this.x\u0441ch\u0435\u0445();
                        byte[] byArray = new byte[-2061918500 + 2061918507];
                        byArray[0] = -182254052 + 182254131;
                        byArray[1] = -1509772154 + 1509772274;
                        byArray[2] = -903280460 + 903280579;
                        byArray[3] = -1286916824 + 1286916818;
                        byArray[4] = -1263865374 + 1263865330;
                        byArray[5] = -1939590291 + 1939590197;
                        byArray[-839180696 + 839180702] = -1619704213 + 1619704285;
                        byte[] byArray2 = new byte[-22082013 + 22082030];
                        byArray2[0] = 1;
                        byArray2[1] = -999090357 + 999090373;
                        byArray2[2] = -364654719 + 364654834;
                        byArray2[3] = -1864566390 + 1864566468;
                        byArray2[4] = -1214137350 + 1214137318;
                        byArray2[5] = -606175915 + 606175866;
                        byArray2[-1636239231 + 1636239237] = -149387801 + 149387724;
                        byArray2[-2006399372 + 0x77973993] = -2023881585 + 2023881709;
                        byArray2[-1694880751 + 1694880759] = -1202198560 + 1202198453;
                        byArray2[-981978300 + 981978309] = -1094304599 + 1094304679;
                        byArray2[-951314035 + 951314045] = -1945858312 + 1945858381;
                        byArray2[-253478028 + 253478039] = -11864365 + 11864470;
                        byArray2[-1503183343 + 1503183355] = -75573628 + 75573520;
                        byArray2[-1079409040 + 1079409053] = -1370816625 + 1370816745;
                        byArray2[-1141978415 + 1141978429] = -1067699381 + 1067699415;
                        byArray2[-2072670875 + 2072670890] = -477306439 + 477306384;
                        byArray2[-662605248 + 662605264] = -299456678 + 299456685;
                        hc\u0445o.a_bsm9("h\u0445\u0456xs", h\u0445\u0456xs(java.lang.String java.lang.String ), (String)((Object)hc\u0445o.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(1450358964 + 995809561), (int)(914477063 + 1450163434))), (String)((Object)hc\u0445o.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray2, (int)(1958602100 + 888259643), (int)(1807199204 + 856879846))));
                        this.japp\u0440\u04bb();
                        return;
                    }
                }
            }
            if (this.cc\u0441x\u0440\u0445h <= 0) {
                byte[] byArray = new byte[-1816125047 + 1816125054];
                byArray[0] = -1385157806 + 1385157826;
                byArray[1] = -225229999 + 225229956;
                byArray[2] = -932866673 + 932866795;
                byArray[3] = -1834939325 + 1834939237;
                byArray[4] = -1243127935 + 1243127929;
                byArray[5] = -230360633 + 230360596;
                byArray[-153242020 + 153242026] = -102378964 + 102378931;
                byte[] byArray3 = new byte[-1238166824 + 1238166841];
                byArray3[0] = -1519263995 + 1519264001;
                byArray3[1] = -113805078 + 113804975;
                byArray3[2] = -2097545996 + 2097546120;
                byArray3[3] = -850360155 + 850360031;
                byArray3[4] = -2111138931 + 2111138888;
                byArray3[5] = -1820980968 + 1820981090;
                byArray3[-1206892315 + 1206892321] = -1983487004 + 1983486928;
                byArray3[-1285744765 + 1285744772] = -281450028 + 281450016;
                byArray3[-1788845849 + 1788845857] = -1592426464 + 1592426515;
                byArray3[-1094837978 + 1094837987] = -1824076688 + 1824076740;
                byArray3[-1949544382 + 1949544392] = -593829196 + 593829252;
                byArray3[-1185536159 + 1185536170] = -280337901 + 280338027;
                byArray3[-1321186502 + 1321186514] = -811391184 + 811391222;
                byArray3[-932076184 + 932076197] = -147136622 + 147136612;
                byArray3[-320129647 + 320129661] = -1283131359 + 1283131248;
                byArray3[-1906982458 + 1906982473] = -1841216539 + 1841216580;
                byArray3[-312679721 + 312679737] = -1;
                hc\u0445o.a_bsm9("h\u0445\u0456xs", h\u0445\u0456xs(java.lang.String java.lang.String ), (String)((Object)hc\u0445o.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-1668174799 + 742136988), (int)(1244234589 + 1146882855))), (String)((Object)hc\u0445o.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray3, (int)(-1192185920 + 1013466520), (int)(917801183 + 479447656))));
                this.japp\u0440\u04bb();
                return;
            }
        }
        --this.cc\u0441x\u0440\u0445h;
    }

    private /* synthetic */ void japp\u0440\u04bb() {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
            if (bl) {
                __js_dispatch_state = 0;
            }
        }
        if (2 * 2 * 2 >= 0) {
        }
        if (hc\u0445o.$_h10q7pfv1ngan17lmk((long)hc\u0445o.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)hc\u0445o.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        if (0 != 0) {
        }
        \u0430\u0435ca = false;
        this.cc\u0441x\u0440\u0445h = -1;
        j\u0456j\u0456s\u0445 = null;
        if (this.\u04bb\u0440a != -1 && hc\u0445o.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 != null) {
            hc\u0445o.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7545 = this.\u04bb\u0440a;
            this.\u04bb\u0440a = -1;
        }
    }

    public static /* synthetic */ \u04bb\u0430\u0441\u0456\u0455\u04bb ha\u0430o\u043ej(class_2338 class_23382, csa csa2) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (true | false) {
        }
        if (hc\u0445o.$_h10q7pfw1ngan17lml((long)hc\u0445o.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)hc\u0445o.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        if (0 != 0) {
        }
        if (hc\u0445o.\u0430\u0445j\u0445s\u0456\u04bb.field_1687 == null || hc\u0445o.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 == null) {
            return null;
        }
        class_2680 class_26802 = hc\u0445o.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.method_8320(class_23382);
        if (!class_26802.method_26215()) {
            return null;
        }
        List list = csa2.j\u0435\u0458\u0458h\u0435().stream().sorted((class_23822, class_23823) -> {
            boolean bl = false;
            if (bl) {
                __js_dispatch_state = 0;
            }
            if ((3 * 3 + 3) % 2 == 0) {
            }
            if (((long)hc\u0445o.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)hc\u0445o.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
                throw null;
            }
            return (int)hc\u0445o.a_bsm18("compare", compare(double double ), (double)csa2.\u0435j\u043ep().applyAsDouble((class_2382)class_23382.method_10081(class_23823)), (double)csa2.\u0435j\u043ep().applyAsDouble((class_2382)class_23382.method_10081(class_23822)));
        }).toList();
        for (class_2382 class_23824 : list) {
            \u0445j\u0458\u0430a\u0435\u0458 \u0445j\u0458\u0430a\u0435\u04582;
            \u04bb\u0456ac\u0435\u0440\u0458 \u04bb\u0456ac\u0435\u0440\u04582;
            class_2338 class_23383 = class_23382.method_10081(class_23824);
            class_2680 class_26803 = hc\u0445o.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.method_8320(class_23383);
            if (class_26803.method_26204() != class_2246.field_10343 && class_26803.method_26204() != class_2246.field_10108 && !class_26803.method_26215()) continue;
            \u04bb\u0456ac\u0435\u0440\u0458 \u04bb\u0456ac\u0435\u0440\u04583 = \u04bb\u0456ac\u0435\u0440\u04582 = class_26803.method_26215() ? \u04bb\u0456ac\u0435\u0440\u0458.aj\u0441 : \u04bb\u0456ac\u0435\u0440\u0458.\u0445c\u0435;
            if (\u04bb\u0456ac\u0435\u0440\u04582 == \u04bb\u0456ac\u0435\u0440\u0458.\u0445c\u0435 && !class_26803.method_26166((class_1750)(\u0445j\u0458\u0430a\u0435\u04582 = new class_1750((class_1657)hc\u0445o.\u0430\u0445j\u0445s\u0456\u04bb.field_1724, class_1268.field_5808, csa2.e\u0455ih(), new class_3965((class_243)hc\u0445o.a_bsm10("method_24953", method_24953(net.minecraft.class_2382 ), (class_2382)class_23383), class_2350.field_11036, class_23383, false))))) continue;
            \u0445j\u0458\u0430a\u0435\u04582 = hc\u0445o.x\u0456\u0445hc\u0430\u043e(class_23383, \u04bb\u0456ac\u0435\u0440\u04582);
            if (\u0445j\u0458\u0430a\u0435\u04582 == null) {
                if (!bl) continue;
                __js_dispatch_state = 0;
                continue;
            }
            class_2338 class_23384 = \u0445j\u0458\u0430a\u0435\u04582.xic\u0458();
            CallSite callSite = hc\u0445o.a_bsm11("j\u0458\u0458e\u0445\u0445", j\u0458\u0458e\u0445\u0445(net.minecraft.class_2680 net.minecraft.class_2338 \u04bb\u043eh\u0456.\u0445j\u0458\u0430a\u0435\u0458 \u04bb\u043eh\u0456.csa ), (class_2680)hc\u0445o.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.method_8320(class_23384), (class_2338)class_23384, (\u0445j\u0458\u0430a\u0435\u0458)\u0445j\u0458\u0430a\u0435\u04582, (csa)csa2);
            if (callSite == null) continue;
            class_243 class_2432 = ((s\u043ehc)((Object)callSite)).ch\u04bb\u0435().method_1019((class_243)hc\u0445o.a_bsm12("method_24954", method_24954(net.minecraft.class_2382 ), (class_2382)class_23384));
            CallSite callSite2 = hc\u0445o.a_bsm13("oeo", oeo(net.minecraft.class_243 net.minecraft.class_243 ), (class_243)hc\u0445o.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_33571(), (class_243)class_2432);
            return new \u04bb\u0430\u0441\u0456\u0455\u04bb(class_23384, class_23383, \u0445j\u0458\u0430a\u0435\u04582.\u0440\u0441\u0430\u0458\u0441\u0440(), ((s\u043ehc)((Object)callSite)).\u043eh\u0456().\u0435e\u0441\u0430exx().field_1351 + (double)class_23384.method_10264(), (e\u0445\u0440\u0440a)((Object)callSite2));
        }
        return null;
    }

    public static /* synthetic */ \u0445j\u0458\u0430a\u0435\u0458 \u0430cjcis(class_2338 class_23382, class_2350 class_23502, \u04bb\u0456ac\u0435\u0440\u0458 \u04bb\u0456ac\u0435\u0440\u04582) {
        block8: {
            block7: {
                block6: {
                    boolean bl = false;
                    if (bl) {
                        __js_dispatch_state = 0;
                    }
                    if (2 * 2 * 2 >= 0) {
                    }
                    if (hc\u0445o.$_h10q7pfx1ngan17lmm((long)hc\u0445o.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)hc\u0445o.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
                        throw null;
                    }
                    if (0 != 0) {
                    }
                    if (hc\u0445o.\u0430\u0445j\u0445s\u0456\u04bb.field_1687 == null) {
                        return null;
                    }
                    int n = \u04bb\u0456ac\u0435\u0440\u04582.ordinal();
                    if (n == 0) break block6;
                    if (n == 1) break block7;
                    break block8;
                }
                class_2338 class_23383 = class_23382.method_10093(class_23502.method_10153());
                class_2680 class_26802 = hc\u0445o.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.method_8320(class_23383);
                if (class_26802.method_26215() || class_26802.method_45474()) {
                    return null;
                }
                return new \u0445j\u0458\u0430a\u0435\u0458(class_23383, class_23502);
            }
            return new \u0445j\u0458\u0430a\u0435\u0458(class_23382, class_23502);
        }
        return null;
    }

    public static /* synthetic */ \u0445j\u0458\u0430a\u0435\u0458 x\u0456\u0445hc\u0430\u043e(class_2338 class_23382, \u04bb\u0456ac\u0435\u0440\u0458 \u04bb\u0456ac\u0435\u0440\u04582) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
            if (bl) {
                __js_dispatch_state = 0;
            }
        }
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (hc\u0445o.$_h10q7pfy1ngan17lmn((long)hc\u0445o.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)hc\u0445o.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        if (0 != 0) {
        }
        CallSite callSite = hc\u0445o.a_bsm14("values", values());
        ArrayList<\u0445j\u0458\u0430a\u0435\u0458> arrayList = new ArrayList<\u0445j\u0458\u0430a\u0435\u0458>();
        for (CallSite callSite2 : callSite) {
            \u0445j\u0458\u0430a\u0435\u0458 \u0445j\u0458\u0430a\u0435\u04582 = hc\u0445o.\u0430cjcis(class_23382, (class_2350)callSite2, \u04bb\u0456ac\u0435\u0440\u04582);
            if (\u0445j\u0458\u0430a\u0435\u04582 == null) {
                if (!bl) continue;
                __js_dispatch_state = 0;
                continue;
            }
            if (hc\u0445o.$_h22u0yy1ngan17lmo(\u0445j\u0458\u0430a\u0435\u04582.hiha\u0458\u0445\u0435() == 0.0 ? 0 : (\u0445j\u0458\u0430a\u0435\u04582.hiha\u0458\u0445\u0435() < 0.0 ? -1 : 1)) < 0) continue;
            arrayList.add(\u0445j\u0458\u0430a\u0435\u04582);
        }
        return arrayList.stream().max(hc\u0445o.a_bsm15("comparingDouble", comparingDouble(java.util.function.ToDoubleFunction<? super T> ), \u0445j\u0458\u0430a\u0435\u0458::hiha\u0458\u0445\u0435)).orElse(null);
    }

    private /* synthetic */ void x\u0441ch\u0435\u0445() {
        block8: {
            block7: {
                boolean bl = false;
                if (bl) {
                    __js_dispatch_state = 0;
                }
                if (2 * 2 * 2 >= 0) {
                }
                if (hc\u0445o.$_h22u0yz1ngan17lmp((long)hc\u0445o.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)hc\u0445o.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
                    throw null;
                }
                if (0 != 0) {
                }
                if (hc\u0445o.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 == null) break block7;
                if (hc\u0445o.\u0430\u0445j\u0445s\u0456\u04bb.field_1761 != null) break block8;
            }
            return;
        }
        hc\u0445o.\u0430\u0445j\u0445s\u0456\u04bb.field_1761.method_2919((class_1657)hc\u0445o.\u0430\u0445j\u0445s\u0456\u04bb.field_1724, class_1268.field_5808);
        hc\u0445o.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_6104(class_1268.field_5808);
    }

    private /* synthetic */ Integer ps\u0441o\u0458\u043e(class_1792[] class_1792Array) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (true | false) {
        }
        if (hc\u0445o.$_h22u0z01ngan17lmq((long)hc\u0445o.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)hc\u0445o.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        if (0 != 0) {
        }
        if (hc\u0445o.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 == null) {
            return hc\u0445o.a_bsm16("valueOf", valueOf(int ), (int)-1);
        }
        int n = -1;
        Object object = -561311293 + 561311303;
        for (int i = 0; i < -854651532 + 854651541; ++i) {
            class_1799 class_17992 = hc\u0445o.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().method_5438(i);
            for (class_1792 class_17922 : class_1792Array) {
                CallSite callSite;
                if (!class_17992.method_31574(class_17922) || (callSite = hc\u0445o.a_bsm17("abs", abs(int ), (int)(hc\u0445o.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7545 - i))) >= object) continue;
                object = callSite;
                n = i;
            }
        }
        return n == -1 ? null : hc\u0445o.a_bsm16("valueOf", valueOf(int ), (int)n);
    }

    private /* synthetic */ boolean \u0455p\u0445\u0435j\u0458(class_2248 class_22482) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
            if (bl) {
                __js_dispatch_state = 0;
            }
        }
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (hc\u0445o.$_h22u0z11ngan17lmr((long)hc\u0445o.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)hc\u0445o.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        if (0 != 0) {
        }
        return (class_22482 == class_2246.field_10382 || class_22482 == class_2246.field_27879 || class_22482 == class_2246.field_10030 ? 1 : 0) != 0;
    }

    static {
        if (System.nanoTime() == Long.MIN_VALUE) {
            throw null;
        }
        j\u0456j\u0456s\u0445 = null;
        \u0430\u0435ca = false;
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
}

