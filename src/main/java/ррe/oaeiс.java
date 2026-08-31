/*
 * Decompiled with CFR 0.152.
 */
package \u0440\u0440e;

import c\u0445is.hoi\u0435h\u0440;
import c\u0445is.x\u0458sc;
import h\u0441\u043e\u04bb\u0441\u0458\u0445.c\u0455i\u0430\u0440\u0445;
import io.github.humbleui.skija.Font;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import o\u0455sio\u0440.\u0445\u0458\u0458h\u0445\u0430a;
import spso.\u0430c\u0440;
import spso.\u0441a\u0458p;
import \u0435xp.o\u043ea\u0456c;
import \u0435xp.\u043ea\u0441\u0430p;
import \u0440expho.a\u0430\u0455se;
import \u0440o\u0456\u0445o.\u0445\u0440\u0430\u0435\u0445\u043e;
import \u0445eo.c\u0455pi;
import \u0445eo.\u0456p\u0430\u043e\u0458\u043e;
import \u0445eo.\u0458i\u0456x;
import \u0458x\u0458\u0435ah\u04bb.\u0455\u0456\u0440e;

@\u0456p\u0430\u043e\u0458\u043e(sp\u0456p\u0445\u0435="Timer", a\u0456j\u0430\u0455\u04bb="Timer", s\u0455cj=\u0458i\u0456x.MOVEMENT)
public class oaei\u0441
extends c\u0455pi {
    private final /* synthetic */ o\u043ea\u0456c aaach;
    private final /* synthetic */ o\u043ea\u0456c po\u0456i\u0435c;
    private final /* synthetic */ \u043ea\u0441\u0430p \u0435ac\u0441xx;
    private final /* synthetic */ \u043ea\u0441\u0430p \u0435exh;
    private final /* synthetic */ \u043ea\u0441\u0430p i\u0435\u0430;
    private final /* synthetic */ \u0455\u0456\u0440e \u0456\u0441ipj\u0458;
    private /* synthetic */ float \u0456x\u0441;
    private /* synthetic */ float \u0456c\u0445ji\u04bb;
    private /* synthetic */ float ex\u04bb\u0456;
    private static final /* synthetic */ Color acx\u0445;
    private static final /* synthetic */ Color \u0445i\u0456a\u0445\u04bb;
    private static final /* synthetic */ Color iai\u0445\u0445ps;
    private static final /* synthetic */ Color \u0435os\u0456\u043e;
    private static final /* synthetic */ float \u0455\u0430s\u0445\u0430is = 140.0f;
    private static final /* synthetic */ float \u0458h\u0456cco = 32.0f;
    private static final /* synthetic */ float j\u0458\u0430exo = 12.0f;
    private static final /* synthetic */ float \u04bbho\u0441 = 12.0f;
    private static final /* synthetic */ float \u0458aaj = 4.0f;
    private static /* synthetic */ int __js_dispatch_state = 0;

    public oaei\u0441() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (oaei\u0441.$_h304wev1ngan17ld8((long)oaei\u0441.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)oaei\u0441.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        String[] stringArray = new String[2];
        byte[] byArray = new byte[-403671063 + 403671070];
        byArray[0] = -1317516239 + 1317516308;
        byArray[1] = -1454736827 + 1454736910;
        byArray[2] = -284295599 + 284295506;
        byArray[3] = -1218260865 + 1218260992;
        byArray[4] = -1538630199 + 1538630262;
        byArray[5] = -1652148658 + 1652148747;
        byArray[-1793193988 + 1793193994] = -790817756 + 790817697;
        stringArray[0] = oaei\u0441.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(430700863 + 1296330161), (int)(445052293 + 1793757164));
        byte[] byArray2 = new byte[-1187481557 + 1187481564];
        byArray2[0] = -1537975575 + 1537975622;
        byArray2[1] = -1103027842 + 1103027854;
        byArray2[2] = -95117174 + 95117165;
        byArray2[3] = -353538316 + 353538254;
        byArray2[4] = -1647843643 + 1647843666;
        byArray2[5] = -1991892634 + 1991892731;
        byArray2[-1205080437 + 1205080443] = -2107772479 + 2107772415;
        stringArray[1] = oaei\u0441.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray2, (int)(-1225471501 + 1509312247), (int)(1198319712 + 46621140));
        this.aaach = ((\u0430c\u0440)((Object)oaei\u0441.a_bsm2("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)oaei\u0441.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1283973002 + 1283973027, -1352649992 + 1352649932, -1219310223 + 1219310147, -1058380698 + 1058380739}, (int)(-927207702 + 1924811915), (int)(973936150 + 244593290)))))).\u0455iaip\u0458e(stringArray).a\u04bbs(1).\u0458c\u0456\u0440().getModeValue();
        byte[] byArray3 = new byte[-148176169 + 148176183];
        byArray3[0] = -355666707 + 355666816;
        byArray3[1] = -2136603031 + 2136603141;
        byArray3[2] = -257146179 + 257146196;
        byArray3[3] = -715764613 + 715764505;
        byArray3[4] = -779280404 + 779280332;
        byArray3[5] = -1627054094 + 1627054051;
        byArray3[-622723601 + 622723607] = -813762710 + 813762609;
        byArray3[-377570015 + 377570022] = -1538373935 + 1538374043;
        byArray3[-70940867 + 70940875] = -963335013 + 963335049;
        byArray3[-1855880453 + 1855880462] = -657808702 + 657808654;
        byArray3[-135729257 + 135729267] = -1770774486 + 1770774439;
        byArray3[-1108051732 + 1108051743] = -1653692301 + 1653692233;
        byArray3[-1265379147 + 1265379159] = -802730441 + 802730543;
        byArray3[-191207035 + 191207048] = -1918575130 + 1918575088;
        String[] stringArray2 = new String[3];
        byte[] byArray4 = new byte[-1302605535 + 1302605541];
        byArray4[0] = -782761414 + 782761431;
        byArray4[1] = -21993393 + 21993499;
        byArray4[2] = -1499210104 + 1499210063;
        byArray4[3] = -569930439 + 569930553;
        byArray4[4] = -462726246 + 462726320;
        byArray4[5] = -1946945604 + 1946945489;
        stringArray2[0] = oaei\u0441.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray4, (int)(572069253 + 648360760), (int)(-586532099 + 1857949898));
        byte[] byArray5 = new byte[-1305551832 + 1305551838];
        byArray5[0] = -434015919 + 434015907;
        byArray5[1] = -272711721 + 272711761;
        byArray5[2] = -672775648 + 672775577;
        byArray5[3] = -943084251 + 943084136;
        byArray5[4] = -890739980 + 890739899;
        byArray5[5] = -337214100 + 337214131;
        stringArray2[1] = oaei\u0441.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray5, (int)(1698553639 + 1583801469), (int)(58432641 + 219116553));
        byte[] byArray6 = new byte[-1109665309 + 1109665315];
        byArray6[0] = -1286651499 + 1286651391;
        byArray6[1] = -282442051 + 282441947;
        byArray6[2] = -1822014365 + 1822014308;
        byArray6[3] = -887684508 + 887684621;
        byArray6[4] = -2034624950 + 2034624999;
        byArray6[5] = -758418543 + 758418436;
        stringArray2[2] = oaei\u0441.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray6, (int)(482675413 + 1801747796), (int)(-153574520 + 158096572));
        this.po\u0456i\u0435c = ((\u0430c\u0440)((Object)oaei\u0441.a_bsm2("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)oaei\u0441.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray3, (int)(938718055 + 872462476), (int)(-567073965 + 818146212)))))).\u0455iaip\u0458e(stringArray2).a\u04bbs(0).p\u0441\u0445(() -> {
            boolean bl = false;
            if (bl) {
                __js_dispatch_state = 0;
            }
            if ((3 * 3 + 3) % 2 == 0) {
            }
            if (((long)oaei\u0441.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)oaei\u0441.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
                throw null;
            }
            byte[] byArray = new byte[-1444385876 + 1444385883];
            byArray[0] = -1779122660 + 1779122693;
            byArray[1] = -1547397444 + 1547397364;
            byArray[2] = -1961191231 + 1961191191;
            byArray[3] = -1163303007 + 1163303092;
            byArray[4] = -1248248951 + 1248248945;
            byArray[5] = -1284218317 + 1284218230;
            byArray[-1042817844 + 1042817850] = -1473670246 + 1473670241;
            return oaei\u0441.a_bsm18("valueOf", valueOf(boolean ), (boolean)this.aaach.cip((String)((Object)oaei\u0441.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-71510802 + 1621329777), (int)(-1311350289 + 513830535)))));
        }).\u0458c\u0456\u0440().getModeValue();
        byte[] byArray7 = new byte[-1141514939 + 1141514949];
        byArray7[0] = -1148378615 + 1148378667;
        byArray7[1] = -567805900 + 567805794;
        byArray7[2] = -302094980 + 302094867;
        byArray7[3] = -2005875383 + 2005875305;
        byArray7[4] = -1268401380 + 1268401409;
        byArray7[5] = -391523140 + 391523152;
        byArray7[-404866738 + 404866744] = -861184656 + 861184752;
        byArray7[-39903720 + 39903727] = -1313255990 + 1313255890;
        byArray7[-1155296733 + 1155296741] = -69037497 + 69037519;
        byArray7[-1689960934 + 1689960943] = -605226539 + 605226588;
        this.\u0435ac\u0441xx = ((\u0430c\u0440)((Object)oaei\u0441.a_bsm2("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)oaei\u0441.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray7, (int)(-1320524683 + 485910987), (int)(-461498066 + 765458671)))))).s\u0458\u0458a(2.0f).\u043ecxi\u0455(0.1f).a\u0455\u0445\u0435c(10.0f).x\u0455heah\u0445(0.05f).p\u0441\u0445(() -> {
            boolean bl = false;
            if (bl) {
                __js_dispatch_state = 0;
            }
            if (true | false) {
            }
            if (((long)oaei\u0441.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)oaei\u0441.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
                throw null;
            }
            byte[] byArray = new byte[-58448612 + 58448619];
            byArray[0] = -1228679002 + 1228678909;
            byArray[1] = -1193048160 + 1193048116;
            byArray[2] = -1036507458 + 1036507434;
            byArray[3] = -8665278 + 8665404;
            byArray[4] = -1292884677 + 1292884655;
            byArray[5] = -334025717 + 334025636;
            byArray[-2067039953 + 2067039959] = -212601450 + 212601420;
            return oaei\u0441.a_bsm18("valueOf", valueOf(boolean ), (boolean)this.aaach.cip((String)((Object)oaei\u0441.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(216829733 + 905098169), (int)(-1649768391 + 776094643)))));
        }).\u0458c\u0456\u0440().getFloatValue();
        byte[] byArray8 = new byte[-2005606653 + 2005606664];
        byArray8[0] = -1001885122 + 1001885206;
        byArray8[1] = -2013353194 + 2013353123;
        byArray8[2] = 0;
        byArray8[3] = -1346898857 + 1346898931;
        byArray8[4] = -2003577732 + 2003577700;
        byArray8[5] = -1883650952 + 1883651053;
        byArray8[-798277708 + 798277714] = -692996066 + 692995989;
        byArray8[-1528002056 + 1528002063] = -899486785 + 899486659;
        byArray8[-351993519 + 351993527] = -963897720 + 963897646;
        byArray8[-2059602245 + 2059602254] = -164392567 + 164392646;
        byArray8[-850781323 + 850781333] = -224396415 + 224396372;
        this.\u0435exh = ((\u0430c\u0440)((Object)oaei\u0441.a_bsm2("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)oaei\u0441.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray8, (int)(-2069279447 + 1058698906), (int)(-1970478078 + 1280570078)))))).s\u0458\u0458a(1.6f).\u043ecxi\u0455(1.05f).a\u0455\u0445\u0435c(3.0f).x\u0455heah\u0445(0.05f).p\u0441\u0445(() -> {
            boolean bl = false;
            if (bl) {
                __js_dispatch_state = 0;
            }
            if ((3 * 3 + 3) % 2 == 0) {
            }
            if (((long)oaei\u0441.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)oaei\u0441.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
                throw null;
            }
            byte[] byArray = new byte[-1515040209 + 1515040216];
            byArray[0] = -1791408545 + 1791408605;
            byArray[1] = -1094075801 + 1094075870;
            byArray[2] = -2029064010 + 2029064111;
            byArray[3] = -1894263096 + 1894263054;
            byArray[4] = -1343845906 + 1343846000;
            byArray[5] = -36800407 + 36800477;
            byArray[-1607991086 + 1607991092] = 2;
            return oaei\u0441.a_bsm18("valueOf", valueOf(boolean ), (boolean)this.aaach.cip((String)((Object)oaei\u0441.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-1180803260 + 1494528879), (int)(-1646789235 + 1872695273)))));
        }).\u0458c\u0456\u0440().getFloatValue();
        byte[] byArray9 = new byte[-819761421 + 819761432];
        byArray9[0] = -1510700306 + 1510700189;
        byArray9[1] = -1360598042 + 1360598072;
        byArray9[2] = -781864646 + 781864768;
        byArray9[3] = -1041884172 + 1041884166;
        byArray9[4] = -704309531 + 704309634;
        byArray9[5] = -1926895757 + 1926895734;
        byArray9[-1643311130 + 1643311136] = -1269034166 + 1269034115;
        byArray9[-22711896 + 22711903] = -1445260899 + 1445260932;
        byArray9[-1682307963 + 1682307971] = -1266629178 + 1266629248;
        byArray9[-1434775694 + 1434775703] = -1459076792 + 1459076844;
        byArray9[-2230568 + 2230578] = -308649235 + 308649154;
        this.i\u0435\u0430 = ((\u0430c\u0440)((Object)oaei\u0441.a_bsm2("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)oaei\u0441.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray9, (int)(-1408356753 + 1748428245), (int)(1413742827 + 1918354863)))))).s\u0458\u0458a(9.0f).\u043ecxi\u0455(1.0f).a\u0455\u0445\u0435c(12.0f).x\u0455heah\u0445(1.0f).p\u0441\u0445(() -> {
            boolean bl = false;
            if (bl) {
                __js_dispatch_state = 0;
                if (bl) {
                    __js_dispatch_state = 0;
                }
            }
            if (true | false) {
            }
            if (((long)oaei\u0441.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)oaei\u0441.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
                throw null;
            }
            byte[] byArray = new byte[-1623430387 + 1623430394];
            byArray[0] = -1594507079 + 1594507096;
            byArray[1] = -1882093495 + 1882093431;
            byArray[2] = -1029163321 + 1029163336;
            byArray[3] = -458781442 + 458781517;
            byArray[4] = -200854101 + 200854128;
            byArray[5] = -1651370218 + 1651370126;
            byArray[-698213319 + 698213325] = -579856915 + 579856941;
            return oaei\u0441.a_bsm18("valueOf", valueOf(boolean ), (boolean)this.aaach.cip((String)((Object)oaei\u0441.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(1745953201 + 1341691479), (int)(-2035650436 + 1412328028)))));
        }).\u0458c\u0456\u0440().getFloatValue();
        byte[] byArray10 = new byte[-2093230014 + 2093230026];
        byArray10[0] = -1213625752 + 1213625739;
        byArray10[1] = -1506563157 + 1506563181;
        byArray10[2] = -1553117271 + 1553117182;
        byArray10[3] = -93970653 + 93970673;
        byArray10[4] = -80703507 + 80703463;
        byArray10[5] = -1820188551 + 1820188640;
        byArray10[-1331026828 + 1331026834] = -1074400981 + 1074400931;
        byArray10[-1217331085 + 1217331092] = -1926601473 + 1926601598;
        byArray10[-322171296 + 322171304] = -218919803 + 218919850;
        byArray10[-53392773 + 53392782] = -1972438402 + 1972438310;
        byArray10[-251590546 + 251590556] = -1466247423 + 1466247468;
        byArray10[-1702499116 + 1702499127] = -1527294539 + 1527294505;
        this.\u0456\u0441ipj\u0458 = ((\u0445\u0440\u0430\u0435\u0445\u043e)((Object)oaei\u0441.a_bsm3("jaa\u0435\u0445c", jaa\u0435\u0445c()))).\u043e\u0435s\u043ee(this, (String)((Object)oaei\u0441.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray10, (int)(232433693 + 694456097), (int)(-2063173633 + 106435422))), (float)\u0430\u0445j\u0445s\u0456\u04bb.method_22683().method_4486() / 2.0f - 70.0f, (float)\u0430\u0445j\u0445s\u0456\u04bb.method_22683().method_4502() / 2.0f + 120.0f);
    }

    @\u0445\u0458\u0458h\u0445\u0430a
    public void \u04bbo\u0435(hoi\u0435h\u0440 hoi\u0435h\u04402) {
        float f;
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (oaei\u0441.$_h304wew1ngan17ld9((long)oaei\u0441.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)oaei\u0441.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        if (0 != 0) {
        }
        if (oaei\u0441.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 == null) {
            return;
        }
        if (this.\u0440\u0435\u0455x\u0435xe()) {
            f = 1.0f;
            if ((0 == 0 || 0 != 1 && 0 != 2) && bl) {
                __js_dispatch_state = 0;
            }
        } else {
            f = 0.0f;
        }
        this.ex\u04bb\u0456 += (f - this.ex\u04bb\u0456) * 0.12f;
        if (((\u0445\u0440\u0430\u0435\u0445\u043e)((Object)oaei\u0441.a_bsm3("jaa\u0435\u0445c", jaa\u0435\u0445c()))).\u0430o\u0441\u0456p\u0455().\u0441c\u0458\u043e\u0430(a\u0430\u0455se.class).\u0440\u0435\u0455x\u0435xe()) {
            \u0445\u0440\u0430\u0435\u0445\u043e.oxsj\u0456\u0445a = 1.0f;
            return;
        }
        byte[] byArray = new byte[-1177780409 + 1177780416];
        byArray[0] = -581675674 + 581675669;
        byArray[1] = -1989657006 + 1989657070;
        byArray[2] = -40164249 + 40164288;
        byArray[3] = 3;
        byArray[4] = -987562652 + 987562768;
        byArray[5] = -1941940630 + 1941940511;
        byArray[-243178464 + 243178470] = -2041826946 + 2041826918;
        if (this.aaach.cip((String)((Object)oaei\u0441.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(452924417 + 119541277), (int)(-890678159 + 1974594601))))) {
            \u0445\u0440\u0430\u0435\u0445\u043e.oxsj\u0456\u0445a = this.\u0435ac\u0441xx.axpacc();
            return;
        }
        float f2 = this.i\u0435\u0430.axpacc();
        boolean bl2 = this.oc\u0435\u0458x\u0441p();
        if (bl2 && oaei\u0441.$_h304wex1ngan17lda(this.\u0456x\u0441 == 0.1f ? 0 : (this.\u0456x\u0441 > 0.1f ? 1 : -1)) > 0) {
            float f3 = this.\u0435exh.axpacc();
            if (oaei\u0441.$_h304wey1ngan17ldb(this.\u0456x\u0441 == f3 - 1.0f ? 0 : (this.\u0456x\u0441 > f3 - 1.0f ? 1 : -1)) >= 0) {
                \u0445\u0440\u0430\u0435\u0445\u043e.oxsj\u0456\u0445a = f3;
                this.\u0456x\u0441 -= f3 - 1.0f;
            } else {
                \u0445\u0440\u0430\u0435\u0445\u043e.oxsj\u0456\u0445a = 1.0f;
            }
        } else if (c\u0455i\u0430\u0440\u0445.ejih == null && oaei\u0441.$_h304wez1ngan17ldc(this.\u0456x\u0441 == f2 ? 0 : (this.\u0456x\u0441 < f2 ? -1 : 1)) < 0) {
            float f4;
            boolean bl3 = oaei\u0441.\u0430\u0445j\u0445s\u0456\u04bb.field_1690.field_1894.method_1434() || oaei\u0441.\u0430\u0445j\u0445s\u0456\u04bb.field_1690.field_1881.method_1434() || oaei\u0441.\u0430\u0445j\u0445s\u0456\u04bb.field_1690.field_1913.method_1434() || oaei\u0441.\u0430\u0445j\u0445s\u0456\u04bb.field_1690.field_1849.method_1434();
            \u0445\u0440\u0430\u0435\u0445\u043e.oxsj\u0456\u0445a = f4 = bl3 ? 0.92f : 0.8f;
            this.\u0456x\u0441 += 1.0f - f4;
            if (0 != 0 && 0 != 1 && 0 != 2) {
                // empty if block
            }
        } else {
            \u0445\u0440\u0430\u0435\u0445\u043e.oxsj\u0456\u0445a = 1.0f;
        }
        this.\u0456x\u0441 = (float)oaei\u0441.a_bsm5("max", max(float float ), (float)0.0f, (float)oaei\u0441.a_bsm4("min", min(float float ), (float)this.\u0456x\u0441, (float)f2));
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ boolean oc\u0435\u0458x\u0441p() {
        int n;
        int n2;
        int n3;
        block5: {
            block7: {
                block6: {
                    int n4;
                    String string;
                    block4: {
                        boolean bl = false;
                        if (bl) {
                            __js_dispatch_state = 0;
                        }
                        if (true | false) {
                        }
                        if (oaei\u0441.$_h304wf01ngan17ldd((long)oaei\u0441.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)oaei\u0441.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
                            throw null;
                        }
                        string = this.po\u0456i\u0435c.cc\u0445\u0458\u0458();
                        n3 = -1;
                        n4 = string.hashCode();
                        if (n4 != -1818700856) break block4;
                        byte[] byArray = new byte[-2072872813 + 2072872819];
                        byArray[0] = -261147575 + 261147464;
                        byArray[1] = -1871357125 + 1871357117;
                        byArray[2] = -1675294684 + 1675294760;
                        byArray[3] = -214385514 + 214385569;
                        byArray[4] = -1529128854 + 1529128961;
                        byArray[5] = -1548902956 + 1548903050;
                        if (!string.equals(oaei\u0441.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-842561527 + 1831121635), (int)(-1519066587 + 916388333)))) break block5;
                        break block6;
                    }
                    if (n4 != -1818700855) break block5;
                    byte[] byArray = new byte[-1652127362 + 1652127368];
                    byArray[0] = -640071533 + 640071431;
                    byArray[1] = -939624644 + 939624565;
                    byArray[2] = -1765935130 + 1765935171;
                    byArray[3] = -501741094 + 501741087;
                    byArray[4] = -499061425 + 499061522;
                    byArray[5] = -2094149805 + 2094149731;
                    if (!string.equals(oaei\u0441.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(1499562046 + 1209344311), (int)(-1932558184 + 1056852789)))) break block5;
                    break block7;
                }
                n3 = 0;
                break block5;
            }
            n3 = 1;
        }
        int n5 = n3;
        int n6 = n5 == 0 ? 3 : (n2 = n5 == 1 ? 4 : 2);
        if (oaei\u0441.a_bsm6("glfwGetMouseButton", glfwGetMouseButton(long int ), (long)\u0430\u0445j\u0445s\u0456\u04bb.method_22683().method_4490(), (int)n2) == true) {
            n = 1;
            return n != 0;
        }
        n = 0;
        return n != 0;
    }

    @\u0445\u0458\u0458h\u0445\u0430a
    public void \u043e\u0458\u0445\u0458\u0430\u043e(x\u0458sc x\u0458sc2) {
        block10: {
            block9: {
                boolean bl = false;
                if (bl) {
                    __js_dispatch_state = 0;
                }
                if (2 * 2 * 2 >= 0) {
                }
                if (oaei\u0441.$_h304wf11ngan17lde((long)oaei\u0441.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)oaei\u0441.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
                    throw null;
                }
                if (0 != 0) {
                }
                byte[] byArray = new byte[-235401556 + 235401563];
                byArray[0] = -1300336617 + 1300336730;
                byArray[1] = -1149755937 + 1149756003;
                byArray[2] = -2002845477 + 2002845409;
                byArray[3] = -269391118 + 269391017;
                byArray[4] = -906241649 + 906241671;
                byArray[5] = -373771589 + 373771540;
                byArray[-1207052743 + 1207052749] = -1574262422 + 1574262531;
                if (!this.aaach.cip((String)((Object)oaei\u0441.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(856777922 + 183818563), (int)(-125998233 + 2042365650))))) break block9;
                if (oaei\u0441.$_h304wf21ngan17ldf(this.ex\u04bb\u0456 == 0.01f ? 0 : (this.ex\u04bb\u0456 < 0.01f ? -1 : 1)) >= 0 || this.\u0440\u0435\u0455x\u0435xe()) break block10;
            }
            return;
        }
        float f = this.\u0456\u0441ipj\u0458.\u0456s\u0455\u043e\u0430\u0441();
        float f2 = this.\u0456\u0441ipj\u0458.o\u0440xj();
        this.\u0456\u0441ipj\u0458.\u0458ae(140.0f);
        this.\u0456\u0441ipj\u0458.e\u0440e\u0456\u0456o\u0458(32.0f);
        float f3 = this.\u0456x\u0441 / this.i\u0435\u0430.axpacc();
        this.\u0456c\u0445ji\u04bb += (f3 - this.\u0456c\u0445ji\u04bb) * 0.15f;
        float f4 = 0.85f + this.ex\u04bb\u0456 * 0.15f;
        oaei\u0441.a_bsm7("\u0441sp", \u0441sp());
        oaei\u0441.a_bsm8("jj\u0455joa\u0441", jj\u0455joa\u0441(float float ), (float)(f + 70.0f), (float)(f2 + 16.0f));
        oaei\u0441.a_bsm9("a\u04bbp\u0445", a\u04bbp\u0445(float ), (float)f4);
        oaei\u0441.a_bsm8("jj\u0455joa\u0441", jj\u0455joa\u0441(float float ), (float)(-(f + 70.0f)), (float)(-(f2 + 16.0f)));
        oaei\u0441.a_bsm11("\u0440\u0445i", \u0440\u0445i(float float float float float java.awt.Color ), (float)f, (float)f2, (float)140.0f, (float)32.0f, (float)12.0f, (Color)((Object)oaei\u0441.a_bsm10("\u0455\u0455sa\u0458oc", \u0455\u0455sa\u0458oc(java.awt.Color float ), (Color)Color.BLACK, (float)(0.4f * this.ex\u04bb\u0456))));
        oaei\u0441.a_bsm12("\u0445a\u0440c\u0445h", \u0445a\u0440c\u0445h(float float float float float java.awt.Color ), (float)f, (float)f2, (float)140.0f, (float)32.0f, (float)12.0f, (Color)((Object)oaei\u0441.a_bsm10("\u0455\u0455sa\u0458oc", \u0455\u0455sa\u0458oc(java.awt.Color float ), (Color)acx\u0445, (float)this.ex\u04bb\u0456)));
        float f5 = f + 12.0f;
        float f6 = f2 + 20.0f;
        float f7 = 116.0f;
        oaei\u0441.a_bsm12("\u0445a\u0440c\u0445h", \u0445a\u0440c\u0445h(float float float float float java.awt.Color ), (float)f5, (float)f6, (float)f7, (float)4.0f, (float)2.0f, (Color)((Object)oaei\u0441.a_bsm10("\u0455\u0455sa\u0458oc", \u0455\u0455sa\u0458oc(java.awt.Color float ), (Color)\u0445i\u0456a\u0445\u04bb, (float)this.ex\u04bb\u0456)));
        Color color = this.h\u0445ph().aj\u0445\u043e();
        if (oaei\u0441.$_h304wf31ngan17ldg(this.\u0456c\u0445ji\u04bb == 0.001f ? 0 : (this.\u0456c\u0445ji\u04bb > 0.001f ? 1 : -1)) > 0) {
            oaei\u0441.a_bsm12("\u0445a\u0440c\u0445h", \u0445a\u0440c\u0445h(float float float float float java.awt.Color ), (float)f5, (float)f6, (float)(f7 * this.\u0456c\u0445ji\u04bb), (float)4.0f, (float)2.0f, (Color)((Object)oaei\u0441.a_bsm10("\u0455\u0455sa\u0458oc", \u0455\u0455sa\u0458oc(java.awt.Color float ), (Color)color, (float)this.ex\u04bb\u0456)));
            if (oaei\u0441.$_hm33uux1ngan17ldh(f3 == 0.98f ? 0 : (f3 > 0.98f ? 1 : -1)) > 0) {
                oaei\u0441.a_bsm11("\u0440\u0445i", \u0440\u0445i(float float float float float java.awt.Color ), (float)f5, (float)f6, (float)(f7 * this.\u0456c\u0445ji\u04bb), (float)4.0f, (float)5.0f, (Color)((Object)oaei\u0441.a_bsm10("\u0455\u0455sa\u0458oc", \u0455\u0455sa\u0458oc(java.awt.Color float ), (Color)color, (float)(0.8f * this.ex\u04bb\u0456))));
            }
        }
        CallSite callSite = oaei\u0441.a_bsm13("h\u0441eh", h\u0441eh(float ), (float)8.0f);
        CallSite callSite2 = oaei\u0441.a_bsm14("round", round(float ), (float)(f3 * 100.0f));
        String string = (int)callSite2 + (String)((Object)oaei\u0441.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1466023653 + 1466023780}, (int)(1076212442 + 1871641818), (int)(1303775140 + 912030829)));
        byte[] byArray = new byte[-1157216378 + 1157216391];
        byArray[0] = -1751845897 + 1751845954;
        byArray[1] = -963094204 + 963094317;
        byArray[2] = -1698122215 + 1698122237;
        byArray[3] = -1904518036 + 1904518009;
        byArray[4] = -1429694223 + 1429694312;
        byArray[5] = -1008310367 + 1008310382;
        byArray[-1007141443 + 1007141449] = -1975989749 + 1975989758;
        byArray[-975072770 + 975072777] = -951461330 + 951461248;
        byArray[-1438979531 + 1438979539] = -614922653 + 614922570;
        byArray[-1330770408 + 1330770417] = -214267000 + 214267106;
        byArray[-846205634 + 846205644] = -1220627119 + 1220627049;
        byArray[-1794778248 + 1794778259] = -1076350356 + 1076350437;
        byArray[-1510944798 + 1510944810] = -1135439851 + 1135439944;
        oaei\u0441.a_bsm15("\u0456p\u0456xc", \u0456p\u0456xc(java.lang.String float float java.awt.Color io.github.humbleui.skija.Font ), (String)((Object)oaei\u0441.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(1887333525 + 616900781), (int)(419371443 + 1523407385))), (float)f5, (float)(f2 + 13.0f), (Color)((Object)oaei\u0441.a_bsm10("\u0455\u0455sa\u0458oc", \u0455\u0455sa\u0458oc(java.awt.Color float ), (Color)iai\u0445\u0445ps, (float)this.ex\u04bb\u0456)), (Font)callSite);
        oaei\u0441.a_bsm15("\u0456p\u0456xc", \u0456p\u0456xc(java.lang.String float float java.awt.Color io.github.humbleui.skija.Font ), (String)string, (float)(f + 140.0f - 12.0f - oaei\u0441.a_bsm16("\u0441a\u0441\u0441", \u0441a\u0441\u0441(java.lang.String io.github.humbleui.skija.Font ), (String)string, (Font)callSite)), (float)(f2 + 13.0f), (Color)((Object)oaei\u0441.a_bsm10("\u0455\u0455sa\u0458oc", \u0455\u0455sa\u0458oc(java.awt.Color float ), (Color)(oaei\u0441.$_hm33uuy1ngan17ldi(f3 == 0.9f ? 0 : (f3 > 0.9f ? 1 : -1)) > 0 ? color : \u0435os\u0456\u043e), (float)this.ex\u04bb\u0456)), (Font)callSite);
        oaei\u0441.a_bsm17("jj\u0430c\u04bb\u0455\u0455", jj\u0430c\u04bb\u0455\u0455());
    }

    @Override
    public /* synthetic */ void onDisable() {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (2 * 2 * 2 >= 0) {
        }
        if (oaei\u0441.$_hm33uuz1ngan17ldj((long)oaei\u0441.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)oaei\u0441.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        if (0 != 0) {
        }
        \u0445\u0440\u0430\u0435\u0445\u043e.oxsj\u0456\u0445a = 1.0f;
        super.onDisable();
    }

    static {
        if (System.nanoTime() == Long.MIN_VALUE) {
            throw null;
        }
        acx\u0445 = new Color(-1424378667 + 1424378695, -1125641728 + 1125641755, -1211676578 + 1211676609, -54592858 + 54593078);
        \u0445i\u0456a\u0445\u04bb = new Color(-1208868643 + 1208868716, -854687562 + 854687631, -1574716627 + 1574716706, -1901363377 + 1901363477);
        iai\u0445\u0445ps = new Color(-1108510545 + 1108510775, -623073744 + 623073969, -349211506 + 349211735);
        \u0435os\u0456\u043e = new Color(-190960523 + 190960725, -699751839 + 699752035, -786891299 + 786891507);
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

