/*
 * Decompiled with CFR 0.152.
 */
package h\u0441\u043e\u04bb\u0441\u0458\u0445;

import c\u0445is.hoi\u0435h\u0440;
import c\u0445is.si\u0458\u04bbo\u0440;
import h\u0441\u043e\u04bb\u0441\u0458\u0445.c\u0455i\u0430\u0440\u0445;
import h\u0441\u043e\u04bb\u0441\u0458\u0445.jx\u0430poi;
import h\u0441\u043e\u04bb\u0441\u0458\u0445.\u0441c\u0456o;
import h\u0441\u043e\u04bb\u0441\u0458\u0445.\u04bb\u04bb\u04bbi\u0440\u0440h;
import i\u0455pe\u0441s.s\u0445\u0456x\u0440\u0440;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Comparator;
import java.util.stream.Stream;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1511;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2338;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2879;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_742;
import net.minecraft.class_746;
import o\u0455sio\u0440.\u0445\u0458\u0458h\u0445\u0430a;
import spso.\u0430c\u0440;
import spso.\u0441a\u0458p;
import \u0435xp.h\u04bb\u0455hpa;
import \u0435xp.o\u043ea\u0456c;
import \u0435xp.\u043ea\u0441\u0430p;
import \u0440expho.\u0435oi\u043e;
import \u0440expho.\u0441\u043e\u0456;
import \u0440o\u0456\u0445o.\u0445\u0440\u0430\u0435\u0445\u043e;
import \u0441\u0445o.jax\u0458\u0435\u0458;
import \u0445eo.c\u0455pi;
import \u0445eo.\u0456p\u0430\u043e\u0458\u043e;
import \u0445eo.\u0458i\u0456x;
import \u0458\u0458\u0458o\u0430\u0456.e\u0445\u0440\u0440a;

@\u0456p\u0430\u043e\u0458\u043e(sp\u0456p\u0445\u0435="ProjectileAura", a\u0456j\u0430\u0455\u04bb="ProjectileAura", s\u0455cj=\u0458i\u0456x.COMBAT)
public class aih\u0441s
extends c\u0455pi {
    private final /* synthetic */ o\u043ea\u0456c \u0440\u0440e\u043e;
    private final /* synthetic */ \u043ea\u0441\u0430p \u0458j\u0456\u04bbx;
    private final /* synthetic */ \u043ea\u0441\u0430p johsc\u0456;
    private final /* synthetic */ \u043ea\u0441\u0430p e\u0456\u0456i\u0456;
    private final /* synthetic */ \u043ea\u0441\u0430p \u0435c\u0445\u0445s;
    private final /* synthetic */ h\u04bb\u0455hpa j\u043e\u0456po\u0445;
    private /* synthetic */ long i\u0458\u0456;
    private /* synthetic */ boolean \u0456hc\u0458see;
    private /* synthetic */ long hp\u0435\u0441\u0430;
    private /* synthetic */ long \u0458\u0458e\u04bbsj;
    private /* synthetic */ int c\u0430\u0440oa;
    private static final /* synthetic */ double cc\u0441h = 1.45;
    private static final /* synthetic */ double hhh\u0441 = 0.03;
    private static final /* synthetic */ double \u0435\u0430os\u04bb = 0.99;
    private static /* synthetic */ int __js_dispatch_state = 0;

    public aih\u0441s() {
        if (2 * 2 * 2 >= 0) {
        }
        if (aih\u0441s.$_h1jibbo61ngan17kzk((long)aih\u0441s.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)aih\u0441s.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        String[] stringArray = new String[3];
        byte[] byArray = new byte[-1432404822 + 1432404836];
        byArray[0] = -2108147502 + 2108147559;
        byArray[1] = -1295100171 + 1295100098;
        byArray[2] = -369475601 + 369475705;
        byArray[3] = -2118152567 + 2118152595;
        byArray[4] = -600496954 + 600496903;
        byArray[5] = -711824139 + 711824021;
        byArray[-2017945794 + 2017945800] = -458256144 + 458256242;
        byArray[-315642805 + 315642812] = -395796695 + 395796755;
        byArray[-1529252227 + 1529252235] = -480222252 + 480222194;
        byArray[-1355928458 + 1355928467] = -1638383007 + 1638382886;
        byArray[-1841419516 + 1841419526] = -258223130 + 258223250;
        byArray[-585222080 + 585222091] = -1962361635 + 1962361662;
        byArray[-283071653 + 283071665] = -820930136 + 820930165;
        byArray[-1621726428 + 1621726441] = -1338471245 + 1338471160;
        stringArray[0] = aih\u0441s.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-1399915725 + 2135240865), (int)(2116032752 + 703565599));
        stringArray[1] = aih\u0441s.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-626864532 + 626864616, -629321694 + 629321581, -1081363319 + 1081363205}, (int)(1410895049 + 662499020), (int)(196765763 + 1628963982));
        stringArray[2] = aih\u0441s.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1758444106 + 1758444053, -790221182 + 790221259, -1603952196 + 1603952237, -1910632713 + 1910632666}, (int)(-647545151 + 397521495), (int)(-82881494 + 1635584098));
        this.\u0440\u0440e\u043e = ((\u0430c\u0440)((Object)aih\u0441s.a_bsm2("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)aih\u0441s.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1745941793 + 1745941729, -1563238671 + 1563238660, 1, -1973605223 + 1973605137}, (int)(911891999 + 1827620137), (int)(930294506 + 869023828)))))).\u0455iaip\u0458e(stringArray).\u0458c\u0456\u0440().getModeValue();
        byte[] byArray2 = new byte[-1712683831 + 1712683840];
        byArray2[0] = -1398320663 + 1398320538;
        byArray2[1] = -993281035 + 993280942;
        byArray2[2] = -838904621 + 838904731;
        byArray2[3] = -464665109 + 464665098;
        byArray2[4] = -107515883 + 107515928;
        byArray2[5] = -1010060519 + 1010060409;
        byArray2[-212038051 + 212038057] = -1589326914 + 1589326836;
        byArray2[-1220616429 + 1220616436] = -189785957 + 189785951;
        byArray2[-845236287 + 845236295] = -1553180444 + 1553180416;
        this.\u0458j\u0456\u04bbx = ((\u0430c\u0440)((Object)aih\u0441s.a_bsm2("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)aih\u0441s.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray2, (int)(776829733 + 954526733), (int)(-507330573 + 1066230108)))))).s\u0458\u0458a(3.0f).x\u0455heah\u0445(0.1f).\u043ecxi\u0455(0.0f).a\u0455\u0445\u0435c(4.0f).\u0458c\u0456\u0440().getFloatValue();
        byte[] byArray3 = new byte[-1150227183 + 1150227192];
        byArray3[0] = -1972290585 + 1972290598;
        byArray3[1] = -1425612145 + 1425612185;
        byArray3[2] = -74925710 + 74925677;
        byArray3[3] = -1927596998 + 1927596906;
        byArray3[4] = -1185907894 + 1185907983;
        byArray3[5] = -1324391899 + 1324392021;
        byArray3[-98848462 + 98848468] = -1795556947 + 1795556852;
        byArray3[-833479526 + 833479533] = -964133023 + 964133078;
        byArray3[-2013566721 + 2013566729] = -504822837 + 504822846;
        this.johsc\u0456 = ((\u0430c\u0440)((Object)aih\u0441s.a_bsm2("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)aih\u0441s.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray3, (int)(-470210987 + 777120757), (int)(-370573013 + 1228845565)))))).s\u0458\u0458a(12.0f).x\u0455heah\u0445(0.1f).\u043ecxi\u0455(4.0f).a\u0455\u0445\u0435c(30.0f).\u0458c\u0456\u0440().getFloatValue();
        byte[] byArray4 = new byte[-1782197298 + 1782197309];
        byArray4[0] = -1349279728 + 1349279744;
        byArray4[1] = -1988282072 + 1988282106;
        byArray4[2] = 5;
        byArray4[3] = -320143098 + 320142984;
        byArray4[4] = -1901696886 + 1901696907;
        byArray4[5] = -1254512507 + 1254512611;
        byArray4[-401567905 + 401567911] = -1203347459 + 1203347398;
        byArray4[-1523560887 + 1523560894] = -132851776 + 132851843;
        byArray4[-1553496785 + 1553496793] = -1000710454 + 1000710499;
        byArray4[-1752476080 + 1752476089] = -452733767 + 452733846;
        byArray4[-39703181 + 39703191] = -1179423207 + 1179423329;
        this.e\u0456\u0456i\u0456 = ((\u0430c\u0440)((Object)aih\u0441s.a_bsm2("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)aih\u0441s.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray4, (int)(1626739351 + 2032715655), (int)(-667202628 + 1252513574)))))).p\u0441\u0445(() -> {
            boolean bl = false;
            if (bl) {
                __js_dispatch_state = 0;
            }
            if (2 * 2 * 2 >= 0) {
            }
            if (((long)aih\u0441s.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)aih\u0441s.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
                throw null;
            }
            return aih\u0441s.a_bsm16("valueOf", valueOf(boolean ), (!this.\u0440\u0440e\u043e.cip((String)((Object)aih\u0441s.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1087087332 + 1087087346, -1442535588 + 1442535569, -405588477 + 405588552}, (int)(1291836134 + 168066078), (int)(-1080747019 + 1980242343)))) ? 1 : 0) != 0);
        }).s\u0458\u0458a(500.0f).x\u0455heah\u0445(50.0f).\u043ecxi\u0455(50.0f).a\u0455\u0445\u0435c(1000.0f).\u0458c\u0456\u0440().getFloatValue();
        byte[] byArray5 = new byte[-782836515 + 782836526];
        byArray5[0] = -2125075136 + 2125075239;
        byArray5[1] = -324408921 + 324408832;
        byArray5[2] = -1569044272 + 1569044218;
        byArray5[3] = -1979519338 + 1979519213;
        byArray5[4] = -293139085 + 293139123;
        byArray5[5] = -1689959746 + 1689959700;
        byArray5[-949312013 + 949312019] = -289088835 + 289088890;
        byArray5[-826911973 + 826911980] = -1091729084 + 1091729079;
        byArray5[-1076319818 + 1076319826] = -1333127209 + 1333127120;
        byArray5[-888749066 + 888749075] = -1274161291 + 1274161257;
        byArray5[-763864109 + 763864119] = -1891776962 + 1891776982;
        this.\u0435c\u0445\u0445s = ((\u0430c\u0440)((Object)aih\u0441s.a_bsm2("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)aih\u0441s.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray5, (int)(401472380 + 853954391), (int)(-1617519548 + 1208961889)))))).p\u0441\u0445(() -> {
            boolean bl = false;
            if (bl) {
                __js_dispatch_state = 0;
            }
            if ((3 * 3 + 3) % 2 == 0) {
            }
            if (((long)aih\u0441s.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)aih\u0441s.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
                throw null;
            }
            return aih\u0441s.a_bsm16("valueOf", valueOf(boolean ), (this.\u0440\u0440e\u043e.cip((String)((Object)aih\u0441s.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-65653790 + 65653841, -1911127604 + 1911127554, -12846475 + 12846434}, (int)(206092839 + 431451096), (int)(430561130 + 0x20226262)))) || this.\u0440\u0440e\u043e.cip((String)((Object)aih\u0441s.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-2052553297 + 2052553247, -1979055122 + 1979055203, -1549698282 + 1549698255, -1137984390 + 1137984325}, (int)(1719984858 + 559981835), (int)(87034989 + 609688857)))) ? 1 : 0) != 0);
        }).s\u0458\u0458a(300.0f).x\u0455heah\u0445(10.0f).\u043ecxi\u0455(100.0f).a\u0455\u0445\u0435c(1000.0f).\u0458c\u0456\u0440().getFloatValue();
        byte[] byArray6 = new byte[-1790096563 + 1790096580];
        byArray6[0] = -206747026 + 206747036;
        byArray6[1] = -1305614549 + 1305614471;
        byArray6[2] = -1205693760 + 1205693781;
        byArray6[3] = -760398709 + 760398719;
        byArray6[4] = -2077844440 + 2077844532;
        byArray6[5] = -1421542006 + 1421542114;
        byArray6[-1669772258 + 1669772264] = -1230571231 + 1230571159;
        byArray6[-56084516 + 56084523] = -340968631 + 340968714;
        byArray6[-1667820713 + 1667820721] = -434011911 + 434011934;
        byArray6[-751490458 + 751490467] = -605446192 + 605446167;
        byArray6[-1661948890 + 1661948900] = -1588743049 + 1588743029;
        byArray6[-1780486659 + 1780486670] = -564510236 + 564510152;
        byArray6[-2142886804 + 2142886816] = -2050456963 + 2050457029;
        byArray6[-926594428 + 926594441] = -333561797 + 333561813;
        byArray6[-1233477062 + 1233477076] = -739416341 + 739416233;
        byArray6[-1428375492 + 1428375507] = -1739764402 + 1739764320;
        byArray6[-198492862 + 198492878] = -298251350 + 298251242;
        this.j\u043e\u0456po\u0445 = ((\u0430c\u0440)((Object)aih\u0441s.a_bsm2("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)aih\u0441s.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray6, (int)(-1132331517 + 342479592), (int)(489681132 + 122041225)))))).\u0455xi\u0440(true).\u0458c\u0456\u0440().getBooleanValue();
        this.i\u0458\u0456 = 0L;
        this.\u0456hc\u0458see = false;
        this.hp\u0435\u0441\u0430 = 0L;
        this.\u0458\u0458e\u04bbsj = 0L;
        this.c\u0430\u0440oa = -1;
    }

    private /* synthetic */ void \u0455h\u0441() {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (aih\u0441s.$_h1jibbo71ngan17kzl((long)aih\u0441s.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)aih\u0441s.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        if (0 != 0) {
        }
        if (this.\u0456hc\u0458see) {
            this.\u0456hc\u0458see = false;
            if (aih\u0441s.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 != null && this.h\u0445a\u043es(aih\u0441s.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().method_5438(aih\u0441s.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7545)) && this.c\u0430\u0440oa != -1) {
                aih\u0441s.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7545 = this.c\u0430\u0440oa;
            }
            this.c\u0430\u0440oa = -1;
        }
    }

    @\u0445\u0458\u0458h\u0445\u0430a(\u0435o\u0435x\u0445s=0)
    public void \u0441eoj(si\u0458\u04bbo\u0440 si\u0458\u04bbo\u04402) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (2 * 2 * 2 >= 0) {
        }
        if (aih\u0441s.$_h1jibbo81ngan17kzm((long)aih\u0441s.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)aih\u0441s.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        if (0 != 0) {
        }
        if (aih\u0441s.a_bsm3("\u0458\u0435\u0456x", \u0458\u0435\u0456x()) != false) {
            this.\u0455h\u0441();
        }
    }

    @\u0445\u0458\u0458h\u0445\u0430a(\u0435o\u0435x\u0445s=4)
    public void \u04bbo\u0435(hoi\u0435h\u0440 hoi\u0435h\u04402) {
        class_1297 class_12972;
        block20: {
            block19: {
                boolean bl = false;
                if (bl) {
                    __js_dispatch_state = 0;
                }
                if (2 * 2 * 2 >= 0) {
                }
                if (aih\u0441s.$_h1jibbo91ngan17kzn((long)aih\u0441s.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)aih\u0441s.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
                    throw null;
                }
                if (0 != 0) {
                }
                if (aih\u0441s.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 == null || \u0430\u0445j\u0445s\u0456\u04bb.method_1562() == null || aih\u0441s.\u0430\u0445j\u0445s\u0456\u04bb.field_1761 == null || aih\u0441s.\u0430\u0445j\u0445s\u0456\u04bb.field_1687 == null || aih\u0441s.a_bsm3("\u0458\u0435\u0456x", \u0458\u0435\u0456x()) != false || this.p\u0441\u0445\u043e\u043e()) {
                    if (this.\u0456hc\u0458see && this.p\u0441\u0445\u043e\u043e()) {
                        this.\u0455h\u0441();
                    }
                    return;
                }
                if (this.\u0456hc\u0458see) {
                    CallSite callSite = aih\u0441s.a_bsm4("currentTimeMillis", currentTimeMillis());
                    if (aih\u0441s.$_hg11qbj1ngan17kzo((long)callSite == this.hp\u0435\u0441\u0430 ? 0 : ((long)callSite < this.hp\u0435\u0441\u0430 ? -1 : 1)) > 0 || aih\u0441s.$_hg11qbk1ngan17kzp((long)callSite == this.\u0458\u0458e\u04bbsj ? 0 : ((long)callSite < this.\u0458\u0458e\u04bbsj ? -1 : 1)) >= 0) {
                        this.\u0455h\u0441();
                    }
                    return;
                }
                class_12972 = this.p\u0430i\u0445hp\u043e();
                if (class_12972 == null) break block19;
                if (class_12972 instanceof class_1511 || !this.j\u043e\u0456po\u0445.axpacc() || ((\u0445\u0440\u0430\u0435\u0445\u043e)((Object)aih\u0441s.a_bsm5("jaa\u0435\u0445c", jaa\u0435\u0445c()))).\u0430o\u0441\u0456p\u0455().\u0441c\u0458\u043e\u0430(c\u0455i\u0430\u0440\u0445.class).\u0440\u0435\u0455x\u0435xe()) break block20;
            }
            return;
        }
        class_243 class_2432 = aih\u0441s.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_33571();
        double d = class_12972.method_5858((class_1297)aih\u0441s.\u0430\u0445j\u0445s\u0456\u04bb.field_1724);
        float f = this.\u0458j\u0456\u04bbx.axpacc();
        float f2 = this.johsc\u0456.axpacc();
        if (aih\u0441s.$_hg11qbl1ngan17kzq(d == f * f ? 0 : (d < f * f ? -1 : 1)) < 0 || aih\u0441s.$_hg11qbm1ngan17kzr(d == f2 * f2 ? 0 : (d > f2 * f2 ? 1 : -1)) > 0) {
            if (this.\u0456hc\u0458see) {
                this.\u0455h\u0441();
            }
            return;
        }
        jx\u0430poi jx\u0430poi2 = this.\u043e\u0440\u0440h\u04bba();
        if (jx\u0430poi2 == null) {
            return;
        }
        class_243 class_2433 = this.jh\u043e(class_12972, class_2432);
        \u0441c\u0456o \u0441c\u0456o2 = this.\u0441o\u0440x\u0445o(class_2432, class_2433, class_12972);
        if (\u0441c\u0456o2 != null && (aih\u0441s.$_hg11qbn1ngan17kzs((float)(aih\u0441s.a_bsm4("currentTimeMillis", currentTimeMillis()) - this.i\u0458\u0456) == this.e\u0456\u0456i\u0456.axpacc() ? 0 : ((float)(aih\u0441s.a_bsm4("currentTimeMillis", currentTimeMillis()) - this.i\u0458\u0456) > this.e\u0456\u0456i\u0456.axpacc() ? 1 : -1)) >= 0 || jx\u0430poi2.i\u0458\u0430())) {
            if (aih\u0441s.a_bsm6("j\u0458o\u0455x", j\u0458o\u0455x(\u0458\u0458\u0458o\u0430\u0456.e\u0445\u0440\u0440a double int \u0441\u0445o.jax\u0458\u0435\u0458 ), (e\u0445\u0440\u0440a)\u0441c\u0456o2.jo\u0440\u0456\u0455\u0456(), (double)180.0, (int)2, (jax\u0458\u0435\u0458)jax\u0458\u0435\u0458.hp\u043e\u0445p) == false) {
                return;
            }
            int n = aih\u0441s.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7545;
            if (jx\u0430poi2.\u0435ce() != -1) {
                aih\u0441s.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7545 = jx\u0430poi2.\u0435ce();
            }
            aih\u0441s.\u0430\u0445j\u0445s\u0456\u04bb.field_1761.method_2919((class_1657)aih\u0441s.\u0430\u0445j\u0445s\u0456\u04bb.field_1724, jx\u0430poi2.\u0441ai\u0458\u0435());
            \u0430\u0445j\u0445s\u0456\u04bb.method_1562().method_52787((class_2596)new class_2879(jx\u0430poi2.\u0441ai\u0458\u0435()));
            if (jx\u0430poi2.i\u0458\u0430()) {
                this.\u0456hc\u0458see = true;
                this.c\u0430\u0440oa = n;
                this.hp\u0435\u0441\u0430 = (long)(aih\u0441s.a_bsm4("currentTimeMillis", currentTimeMillis()) + (long)this.\u0435c\u0445\u0445s.axpacc());
                this.\u0458\u0458e\u04bbsj = (long)(aih\u0441s.a_bsm4("currentTimeMillis", currentTimeMillis()) + (long)\u0441c\u0456o2.\u043e\u04bb\u0440ce\u0430x() * 50L + 300L);
            } else {
                aih\u0441s.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7545 = n;
            }
            this.i\u0458\u0456 = (long)aih\u0441s.a_bsm4("currentTimeMillis", currentTimeMillis());
        }
    }

    private /* synthetic */ \u0441c\u0456o \u0441o\u0440x\u0445o(class_243 class_2432, class_243 class_2433, class_1297 class_12972) {
        \u0441c\u0456o \u0441c\u0456o2;
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (true | false) {
        }
        if (aih\u0441s.$_hg11qbo1ngan17kzt((long)aih\u0441s.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)aih\u0441s.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        if (0 != 0) {
        }
        float f = ((e\u0445\u0440\u0440a)((Object)aih\u0441s.a_bsm7("oeo", oeo(net.minecraft.class_243 net.minecraft.class_243 ), (class_243)class_2432, (class_243)class_2433))).jo\u0456c\u043e\u0440();
        float f2 = 0.0f;
        double d = Double.MAX_VALUE;
        int n = 0;
        float f3 = -90.0f;
        while (aih\u0441s.$_hg11qbp1ngan17kzu(f3 == 90.0f ? 0 : (f3 < 90.0f ? -1 : 1)) <= 0) {
            \u04bb\u04bb\u04bbi\u0440\u0440h \u04bb\u04bb\u04bbi\u0440\u0440h2 = this.c\u0430\u0441\u0458\u0440\u043e\u0430(class_2432, f, f3, class_12972, class_2433);
            if (\u04bb\u04bb\u04bbi\u0440\u0440h2 != null && aih\u0441s.$_hg11qbq1ngan17kzv(\u04bb\u04bb\u04bbi\u0440\u0440h2.x\u0430hj\u04bbh\u0445 == d ? 0 : (\u04bb\u04bb\u04bbi\u0440\u0440h2.x\u0430hj\u04bbh\u0445 < d ? -1 : 1)) < 0) {
                d = \u04bb\u04bb\u04bbi\u0440\u0440h2.x\u0430hj\u04bbh\u0445;
                f2 = f3;
                n = \u04bb\u04bb\u04bbi\u0440\u0440h2.oc\u0455;
            }
            if (aih\u0441s.$_hg11qbr1ngan17kzw(d == 0.1 ? 0 : (d < 0.1 ? -1 : 1)) < 0) break;
            f3 += 0.5f;
        }
        if (aih\u0441s.$_hg11qbs1ngan17kzx(d == 1.4 ? 0 : (d < 1.4 ? -1 : 1)) < 0) {
            \u0441c\u0456o2 = new \u0441c\u0456o(new e\u0445\u0440\u0440a(f, f2), n);
            if (bl) {
                __js_dispatch_state = 0;
            }
        } else {
            \u0441c\u0456o2 = null;
        }
        return \u0441c\u0456o2;
    }

    private /* synthetic */ \u04bb\u04bb\u04bbi\u0440\u0440h c\u0430\u0441\u0458\u0440\u043e\u0430(class_243 class_2432, float f, float f2, class_1297 class_12972, class_243 class_2433) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (true | false) {
        }
        if (aih\u0441s.$_hg11qce1ngan17kzy((long)aih\u0441s.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)aih\u0441s.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        if (0 != 0) {
        }
        if (aih\u0441s.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 == null || aih\u0441s.\u0430\u0445j\u0445s\u0456\u04bb.field_1687 == null) {
            return null;
        }
        reference var6_7 = -aih\u0441s.a_bsm9("sin", sin(double ), (double)aih\u0441s.a_bsm8("toRadians", toRadians(double ), (double)f)) * aih\u0441s.a_bsm10("cos", cos(double ), (double)aih\u0441s.a_bsm8("toRadians", toRadians(double ), (double)f2)) * 1.45;
        reference var8_8 = -aih\u0441s.a_bsm9("sin", sin(double ), (double)aih\u0441s.a_bsm8("toRadians", toRadians(double ), (double)f2)) * 1.45;
        reference var10_9 = aih\u0441s.a_bsm10("cos", cos(double ), (double)aih\u0441s.a_bsm8("toRadians", toRadians(double ), (double)f)) * aih\u0441s.a_bsm10("cos", cos(double ), (double)aih\u0441s.a_bsm8("toRadians", toRadians(double ), (double)f2)) * 1.45;
        class_243 class_2434 = class_2432;
        class_243 class_2435 = new class_243((double)var6_7, (double)var8_8, (double)var10_9);
        double d = Double.MAX_VALUE;
        int n = 0;
        for (int i = 0; i < -1487146854 + 1487146914; ++i) {
            class_3965 class_39652;
            class_243 class_2436 = class_2434.method_1019(class_2435);
            double d2 = class_2436.method_1022(class_2433);
            if (aih\u0441s.$_hg11qcf1ngan17kzz(d2 == d ? 0 : (d2 < d ? -1 : 1)) < 0) {
                d = d2;
                n = i;
            }
            if ((class_39652 = aih\u0441s.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.method_17742(new class_3959(class_2434, class_2436, class_3959.class_3960.field_17558, class_3959.class_242.field_1348, (class_1297)aih\u0441s.\u0430\u0445j\u0445s\u0456\u04bb.field_1724))).method_17783() == class_239.class_240.field_1332) break;
            class_2434 = class_2436;
            class_2435 = class_2435.method_1021(0.99).method_1023(0.0, 0.03, 0.0);
            if (aih\u0441s.$_hg11qcg1ngan17l00(class_2434.field_1351 == class_12972.method_23318() - 3.0 ? 0 : (class_2434.field_1351 < class_12972.method_23318() - 3.0 ? -1 : 1)) >= 0) continue;
            if (0 == 0 || 0 == 1 || 0 == 2) break;
            break;
        }
        return new \u04bb\u04bb\u04bbi\u0440\u0440h(d, n);
    }

    private /* synthetic */ class_243 jh\u043e(class_1297 class_12972, class_243 class_2432) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (2 * 2 * 2 >= 0) {
        }
        if (aih\u0441s.$_hg11qch1ngan17l01((long)aih\u0441s.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)aih\u0441s.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        if (0 != 0) {
        }
        if (aih\u0441s.\u0430\u0445j\u0445s\u0456\u04bb.field_1687 == null) {
            return class_12972.method_19538();
        }
        double d = class_12972.method_23317() - class_12972.field_6014;
        double d2 = class_12972.method_23318() - class_12972.field_6036;
        double d3 = class_12972.method_23321() - class_12972.field_5969;
        double d4 = class_12972.method_23317();
        Object object = class_12972.method_23318();
        double d5 = class_12972.method_23321();
        CallSite callSite = aih\u0441s.a_bsm11("pow", pow(double double ), (double)class_12972.method_19538().method_1022(class_2432), (double)1.25);
        int n = 0;
        while (aih\u0441s.$_hg11qci1ngan17l02(n == (double)(callSite / 1.45) ? 0 : (n < (double)(callSite / 1.45) ? -1 : 1)) < 0) {
            class_2338 class_23382;
            d2 -= 0.08;
            if (aih\u0441s.$_hg11qcj1ngan17l03((d2 *= 0.98) == 0.0 ? 0 : ((d2 *= 0.98) < 0.0 ? -1 : 1)) < 0 && !aih\u0441s.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.method_22347(class_23382 = new class_2338((int)aih\u0441s.a_bsm12("floor", floor(double ), (double)(d4 += d)), (int)aih\u0441s.a_bsm12("floor", floor(double ), (double)((object += d2) - 0.1)), (int)aih\u0441s.a_bsm12("floor", floor(double ), (double)(d5 += d3))))) {
                d2 = 0.0;
                object = aih\u0441s.a_bsm12("floor", floor(double ), (double)object) + 1.0;
            }
            ++n;
        }
        return new class_243(d4, object + (double)class_12972.method_17682() * 0.5, d5);
    }

    private /* synthetic */ class_1297 p\u0430i\u0445hp\u043e() {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (true | false) {
        }
        if (aih\u0441s.$_hg11qck1ngan17l04((long)aih\u0441s.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)aih\u0441s.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        if (0 != 0) {
        }
        if (aih\u0441s.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 == null || aih\u0441s.\u0430\u0445j\u0445s\u0456\u04bb.field_1687 == null) {
            return null;
        }
        class_1297 class_12972 = aih\u0441s.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.method_8390(class_1511.class, aih\u0441s.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_5829().method_1014(8.0), class_15112 -> {
            boolean bl = false;
            if (bl) {
                __js_dispatch_state = 0;
            }
            if (true | false) {
            }
            if (((long)aih\u0441s.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)aih\u0441s.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
                throw null;
            }
            return (aih\u0441s.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_6057((class_1297)class_15112) ? 1 : 0) != 0;
        }).stream().min(aih\u0441s.a_bsm13("comparingDouble", comparingDouble(java.util.function.ToDoubleFunction<? super T> ), class_15112 -> {
            boolean bl = false;
            if (bl) {
                __js_dispatch_state = 0;
            }
            if (true | false) {
            }
            if (((long)aih\u0441s.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)aih\u0441s.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
                throw null;
            }
            return aih\u0441s.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_5739((class_1297)class_15112);
        })).orElse(null);
        if (class_12972 != null) {
            return class_12972;
        }
        class_1297 class_12973 = c\u0455i\u0430\u0440\u0445.ejih;
        if (class_12973 != null && aih\u0441s.a_bsm14("h\u0441h", h\u0441h(net.minecraft.class_1297 ), (class_1297)class_12973) != false && aih\u0441s.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_6057(class_12973)) {
            return class_12973;
        }
        Stream<class_742> stream = aih\u0441s.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.method_18456().stream().filter(s\u0445\u0456x\u0440\u0440::h\u0441h);
        class_746 class_7462 = aih\u0441s.\u0430\u0445j\u0445s\u0456\u04bb.field_1724;
        aih\u0441s.a_bsm15("requireNonNull", requireNonNull(T ), (Object)class_7462);
        return stream.filter(arg_0 -> ((class_746)class_7462).method_6057(arg_0)).min((Comparator<class_742>)((Object)aih\u0441s.a_bsm13("comparingDouble", comparingDouble(java.util.function.ToDoubleFunction<? super T> ), class_7422 -> {
            boolean bl = false;
            if (bl) {
                __js_dispatch_state = 0;
            }
            if (2 * 2 * 2 >= 0) {
            }
            if (((long)aih\u0441s.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)aih\u0441s.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
                throw null;
            }
            return aih\u0441s.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_5739((class_1297)class_7422);
        }))).orElse(null);
    }

    private /* synthetic */ jx\u0430poi \u043e\u0440\u0440h\u04bba() {
        int n;
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (true | false) {
        }
        if (aih\u0441s.$_hg11qcl1ngan17l05((long)aih\u0441s.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)aih\u0441s.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        if (0 != 0) {
        }
        if (aih\u0441s.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 == null) {
            return null;
        }
        byte[] byArray = new byte[-852973816 + 852973830];
        byArray[0] = -361154179 + 361154288;
        byArray[1] = -588157906 + 588158033;
        byArray[2] = -1684327884 + 1684327768;
        byArray[3] = -1798792284 + 1798792187;
        byArray[4] = -1618132822 + 1618132945;
        byArray[5] = -712751687 + 712751701;
        byArray[-697501843 + 697501849] = -1340287068 + 1340287027;
        byArray[-1522679451 + 1522679458] = -697894016 + 697894114;
        byArray[-1566976167 + 1566976175] = -1928375025 + 1928374935;
        byArray[-1693117838 + 1693117847] = -1037848735 + 1037848656;
        byArray[-1965344577 + 1965344587] = -1119716001 + 1119715963;
        byArray[-1456894882 + 1456894893] = -416989390 + 416989330;
        byArray[-2091126018 + 2091126030] = -724803666 + 724803651;
        byArray[-234394521 + 234394534] = -973114703 + 973114787;
        if (this.\u0440\u0440e\u043e.cip((String)((Object)aih\u0441s.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-399122835 + 542124568), (int)(521520604 + 1122540578)))) || this.\u0440\u0440e\u043e.cip((String)((Object)aih\u0441s.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-457048344 + 457048225, -440132994 + 440132894, -1513065767 + 1513065775, -532934316 + 532934398}, (int)(-1202706624 + 289776213), (int)(848707275 + 522392301))))) {
            if (this.\u04bbs\u0456sa\u04bbc(aih\u0441s.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_6079())) {
                return new jx\u0430poi(class_1268.field_5810, -1, false);
            }
            if (this.\u04bbs\u0456sa\u04bbc(aih\u0441s.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_6047())) {
                return new jx\u0430poi(class_1268.field_5808, aih\u0441s.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7545, false);
            }
            for (n = 0; n < -566895488 + 566895497; ++n) {
                if (!this.\u04bbs\u0456sa\u04bbc(aih\u0441s.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().method_5438(n))) continue;
                return new jx\u0430poi(class_1268.field_5808, n, false);
            }
        }
        if (this.\u0440\u0440e\u043e.cip((String)((Object)aih\u0441s.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-2046596893 + 2046596976, -645374620 + 645374698, -640631479 + 640631578}, (int)(-123947699 + 1206422327), (int)(-99772758 + 1770310887)))) || this.\u0440\u0440e\u043e.cip((String)((Object)aih\u0441s.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1042890938 + 1042890868, -2141736663 + 2141736641, -1915994616 + 1915994670, -159548084 + 159548140}, (int)(2016444886 + 95550476), (int)(-681442770 + 1358112294))))) {
            if (this.h\u0445a\u043es(aih\u0441s.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_6079())) {
                return new jx\u0430poi(class_1268.field_5810, -1, true);
            }
            if (this.h\u0445a\u043es(aih\u0441s.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_6047())) {
                return new jx\u0430poi(class_1268.field_5808, aih\u0441s.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7545, true);
            }
            for (n = 0; n < -1316781033 + 1316781042; ++n) {
                if (!this.h\u0445a\u043es(aih\u0441s.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().method_5438(n))) continue;
                return new jx\u0430poi(class_1268.field_5808, n, true);
            }
        }
        return null;
    }

    private /* synthetic */ boolean \u04bbs\u0456sa\u04bbc(class_1799 class_17992) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (true | false) {
        }
        if (aih\u0441s.$_hg11qcm1ngan17l06((long)aih\u0441s.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)aih\u0441s.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        if (0 != 0) {
        }
        return (!class_17992.method_7960() && (class_17992.method_7909() == class_1802.field_8543 || class_17992.method_7909() == class_1802.field_8803) ? 1 : 0) != 0;
    }

    private /* synthetic */ boolean h\u0445a\u043es(class_1799 class_17992) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (2 * 2 * 2 >= 0) {
        }
        if (aih\u0441s.$_hg11qcn1ngan17l07((long)aih\u0441s.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)aih\u0441s.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        if (0 != 0) {
        }
        return (!class_17992.method_7960() && class_17992.method_7909() == class_1802.field_8378 ? 1 : 0) != 0;
    }

    private /* synthetic */ boolean p\u0441\u0445\u043e\u043e() {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (2 * 2 * 2 >= 0) {
        }
        if (aih\u0441s.$_hg11qd91ngan17l08((long)aih\u0441s.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)aih\u0441s.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        if (0 != 0) {
        }
        return (aih\u0441s.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 != null && (((\u0445\u0440\u0430\u0435\u0445\u043e)((Object)aih\u0441s.a_bsm5("jaa\u0435\u0445c", jaa\u0435\u0445c()))).\u0430o\u0441\u0456p\u0455().\u0441c\u0458\u043e\u0430(\u0441\u043e\u0456.class).\u0440\u0435\u0455x\u0435xe() || ((\u0445\u0440\u0430\u0435\u0445\u043e)((Object)aih\u0441s.a_bsm5("jaa\u0435\u0445c", jaa\u0435\u0445c()))).\u0430o\u0441\u0456p\u0455().\u0441c\u0458\u043e\u0430(\u0435oi\u043e.class).\u0440\u0435\u0455x\u0435xe() || aih\u0441s.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_6115()) ? 1 : 0) != 0;
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
}

