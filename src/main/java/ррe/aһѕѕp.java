/*
 * Decompiled with CFR 0.152.
 */
package \u0440\u0440e;

import c\u0445is.\u0430\u0456i\u043ephj;
import ie\u0441\u0430ej.\u0456oc;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_1268;
import net.minecraft.class_1294;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2596;
import net.minecraft.class_2846;
import net.minecraft.class_2868;
import net.minecraft.class_2886;
import o\u0455sio\u0440.\u0445\u0458\u0458h\u0445\u0430a;
import spso.\u0430c\u0440;
import spso.\u0441a\u0458p;
import \u0435xp.h\u04bb\u0455hpa;
import \u0435xp.o\u043ea\u0456c;
import \u0435xp.\u043ea\u0441\u0430p;
import \u043e\u0445\u0440\u0430ose.i\u0456\u0445\u0430\u0441p;
import \u0445eo.c\u0455pi;
import \u0445eo.\u0456p\u0430\u043e\u0458\u043e;
import \u0445eo.\u0458i\u0456x;

@\u0456p\u0430\u043e\u0458\u043e(sp\u0456p\u0445\u0435="AutoHeal", a\u0456j\u0430\u0455\u04bb="Automatically heals you when you're low on health.", s\u0455cj=\u0458i\u0456x.MISC)
public class a\u04bb\u0455\u0455p
extends c\u0455pi {
    private final /* synthetic */ \u0456oc is\u0440;
    private final /* synthetic */ h\u04bb\u0455hpa \u0430h\u0435s\u0456\u0435;
    private final /* synthetic */ h\u04bb\u0455hpa o\u0445\u043ex\u0455;
    private final /* synthetic */ \u043ea\u0441\u0430p eh\u0430\u04bb;
    private final /* synthetic */ \u043ea\u0441\u0430p xa\u0456;
    private final /* synthetic */ o\u043ea\u0456c ca\u0445so;
    private /* synthetic */ boolean \u0441apj\u0455;
    private /* synthetic */ boolean \u043es\u0441;
    private /* synthetic */ boolean \u0441\u0456\u0430\u0441h;
    private static /* synthetic */ int __js_dispatch_state = 0;

    public a\u04bb\u0455\u0455p() {
        if (true | false) {
        }
        if (a\u04bb\u0455\u0455p.$_h10v8t0h1ngan17l7f((long)a\u04bb\u0455\u0455p.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)a\u04bb\u0455\u0455p.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        this.is\u0440 = new \u0456oc();
        byte[] byArray = new byte[-1392937387 + 1392937398];
        byArray[0] = -809879038 + 809879139;
        byArray[1] = -1905776922 + 1905776848;
        byArray[2] = -409836377 + 409836395;
        byArray[3] = -686173755 + 686173810;
        byArray[4] = -2071051823 + 2071051883;
        byArray[5] = -1722492118 + 1722492202;
        byArray[-2037469687 + 2037469693] = -1263284054 + 1263283973;
        byArray[-279820898 + 279820905] = -2028851820 + 2028851721;
        byArray[-617588709 + 617588717] = -1648504202 + 1648504287;
        byArray[-806713188 + 806713197] = -733254877 + 733254923;
        byArray[-1183156020 + 1183156030] = -79003040 + 79003165;
        this.\u0430h\u0435s\u0456\u0435 = ((\u0430c\u0440)((Object)a\u04bb\u0455\u0455p.a_bsm2("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)a\u04bb\u0455\u0455p.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(1044955797 + 1639505260), (int)(1654918297 + 308963445)))))).\u0455xi\u0440(true).\u0458c\u0456\u0440().getBooleanValue();
        byte[] byArray2 = new byte[-960386439 + 960386450];
        byArray2[0] = -1410354333 + 1410354251;
        byArray2[1] = -524854820 + 524854742;
        byArray2[2] = -1320802079 + 1320801996;
        byArray2[3] = -510020827 + 510020946;
        byArray2[4] = -1457344880 + 1457344841;
        byArray2[5] = -1658360243 + 1658360276;
        byArray2[-527314301 + 527314307] = -531693431 + 531693428;
        byArray2[-165712196 + 165712203] = -2078050876 + 2078050848;
        byArray2[-1674569926 + 1674569934] = -1743382398 + 1743382508;
        byArray2[-1945487601 + 1945487610] = -1916904027 + 1916904064;
        byArray2[-1189268107 + 1189268117] = -1478073950 + 1478074033;
        this.o\u0445\u043ex\u0455 = ((\u0430c\u0440)((Object)a\u04bb\u0455\u0455p.a_bsm2("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)a\u04bb\u0455\u0455p.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray2, (int)(1138363214 + 304958136), (int)(1418587142 + 844733152)))))).\u0455xi\u0440(true).\u0458c\u0456\u0440().getBooleanValue();
        this.eh\u0430\u04bb = ((\u0430c\u0440)((Object)a\u04bb\u0455\u0455p.a_bsm2("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)a\u04bb\u0455\u0455p.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-413216272 + 413216388, -1877528437 + 1877528426, -1898589702 + 1898589697, -585046115 + 585046027, -272059796 + 272059711}, (int)(-1711348324 + 223527349), (int)(1222211773 + 47239916)))))).s\u0458\u0458a(500.0f).x\u0455heah\u0445(1.0f).\u043ecxi\u0455(300.0f).a\u0455\u0445\u0435c(1000.0f).\u0458c\u0456\u0440().getFloatValue();
        byte[] byArray3 = new byte[-1648520696 + 1648520710];
        byArray3[0] = -2054832301 + 2054832307;
        byArray3[1] = -986438577 + 986438676;
        byArray3[2] = -436394903 + 436394961;
        byArray3[3] = -1968338344 + 1968338441;
        byArray3[4] = -1451342767 + 1451342728;
        byArray3[5] = -1889348595 + 1889348469;
        byArray3[-429252351 + 429252357] = -80906903 + 80906779;
        byArray3[-1284015531 + 1284015538] = -1425840450 + 1425840477;
        byArray3[-1510224569 + 1510224577] = -1900437478 + 1900437577;
        byArray3[-673640478 + 673640487] = -1325013694 + 1325013680;
        byArray3[-514544919 + 514544929] = -1842225092 + 1842225026;
        byArray3[-1203474848 + 1203474859] = -1028964707 + 1028964639;
        byArray3[-1440846396 + 1440846408] = -1610131412 + 1610131474;
        byArray3[-1921629881 + 1921629894] = -1884240148 + 1884240174;
        this.xa\u0456 = ((\u0430c\u0440)((Object)a\u04bb\u0455\u0455p.a_bsm2("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)a\u04bb\u0455\u0455p.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray3, (int)(1941702656 + 1055173280), (int)(-892563029 + 1888987577)))))).s\u0458\u0458a(0.5f).x\u0455heah\u0445(0.05f).\u043ecxi\u0455(0.0f).a\u0455\u0445\u0435c(1.0f).\u0458c\u0456\u0440().getFloatValue();
        this.ca\u0445so = ((\u0430c\u0440)((Object)a\u04bb\u0455\u0455p.a_bsm2("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)a\u04bb\u0455\u0455p.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1, -2061127477 + 2061127383, -1800003303 + 1800003297, -1069374164 + 1069374271}, (int)(2058287559 + 1082179943), (int)(-455414534 + 1751277635)))))).\u0455iaip\u0458e(new String[]{a\u04bb\u0455\u0455p.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-14758697 + 14758658, -131058296 + 131058277, -627079240 + 627079319, -1652354556 + 1652354502}, (int)(-1189827788 + 221387538), (int)(887702229 + 135199266)), a\u04bb\u0455\u0455p.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-972529814 + 972529733, -1686054662 + 1686054633, -1783756333 + 1783756234, -130646881 + 130646805}, (int)(-1909883772 + 266936717), (int)(-872520666 + 901553556))}).a\u04bbs(0).\u0458c\u0456\u0440().getModeValue();
        this.\u0441apj\u0455 = false;
        this.\u043es\u0441 = false;
        this.\u0441\u0456\u0430\u0441h = false;
    }

    @\u0445\u0458\u0458h\u0445\u0430a
    public void \u043e\u0456xhhx(\u0430\u0456i\u043ephj \u0430\u0456i\u043ephj2) {
        block16: {
            boolean bl = false;
            if (bl) {
                __js_dispatch_state = 0;
            }
            if ((3 * 3 + 3) % 2 == 0) {
            }
            if (a\u04bb\u0455\u0455p.$_h10v8t0i1ngan17l7g((long)a\u04bb\u0455\u0455p.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)a\u04bb\u0455\u0455p.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
                throw null;
            }
            if (0 != 0) {
            }
            if (\u0430\u0456i\u043ephj2.p\u0440\u04bb() != i\u0456\u0445\u0430\u0441p.cc\u0441) break block16;
            if (this.\u043es\u0441) {
                a\u04bb\u0455\u0455p.a_bsm3("\u0435\u0458o", \u0435\u0458o(net.minecraft.class_7204 ), n -> {
                    boolean bl = false;
                    if (bl) {
                        __js_dispatch_state = 0;
                        if (bl) {
                            __js_dispatch_state = 0;
                        }
                    }
                    if (true | false) {
                    }
                    if (((long)a\u04bb\u0455\u0455p.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)a\u04bb\u0455\u0455p.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
                        throw null;
                    }
                    return new class_2886(class_1268.field_5808, n);
                });
                this.\u043es\u0441 = false;
                return;
            }
            if (this.\u0441\u0456\u0430\u0441h) {
                \u0430\u0445j\u0445s\u0456\u04bb.method_1562().method_52787((class_2596)new class_2846(class_2846.class_2847.field_12975, class_2338.field_10980, class_2350.field_11033));
                this.\u0441\u0456\u0430\u0441h = false;
                return;
            }
            if (this.\u0441apj\u0455) {
                \u0430\u0445j\u0445s\u0456\u04bb.method_1562().method_52787((class_2596)new class_2868(a\u04bb\u0455\u0455p.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7545));
                this.\u0441apj\u0455 = false;
                return;
            }
            if (!this.is\u0440.aie\u04bb\u043ea(this.eh\u0430\u04bb.axpacc())) {
                return;
            }
            if (a\u04bb\u0455\u0455p.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_6059(class_1294.field_5904) && this.\u0430h\u0435s\u0456\u0435.axpacc()) {
                return;
            }
            if (a\u04bb\u0455\u0455p.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_6059(class_1294.field_5924) && this.o\u0445\u043ex\u0455.axpacc()) {
                return;
            }
            if (a\u04bb\u0455\u0455p.$_h10v8t0j1ngan17l7h(a\u04bb\u0455\u0455p.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_6032() / a\u04bb\u0455\u0455p.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_6063() == this.xa\u0456.axpacc() ? 0 : (a\u04bb\u0455\u0455p.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_6032() / a\u04bb\u0455\u0455p.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_6063() < this.xa\u0456.axpacc() ? -1 : 1)) < 0) {
                if (this.ca\u0445so.cip((String)((Object)a\u04bb\u0455\u0455p.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1862202300 + 1862202194, -485544478 + 485544491, -1311131788 + 1311131840, -1778018768 + 1778018863}, (int)(-1159095639 + 1845661250), (int)(-440095330 + 1213235319))))) {
                    for (int i = 0; i < -1695584578 + 1695584587; ++i) {
                        class_1799 class_17992 = (class_1799)a\u04bb\u0455\u0455p.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7547.get(i);
                        if (class_17992.method_7909() != class_1802.field_8208) continue;
                        this.shiep\u0458j(i, true);
                        this.\u0441apj\u0455 = true;
                        this.is\u0440.\u0441\u0458e();
                        break;
                    }
                } else if (this.ca\u0445so.cip((String)((Object)a\u04bb\u0455\u0455p.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-430188622 + 430188633, -750625560 + 750625582, -1633214908 + 1633214990, -1863614395 + 1863614448}, (int)(-668931056 + 1352875187), (int)(1525407924 + 268077617))))) {
                    for (int i = 0; i < -581154363 + 581154372; ++i) {
                        class_1799 class_17993 = (class_1799)a\u04bb\u0455\u0455p.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7547.get(i);
                        if (a\u04bb\u0455\u0455p.a_bsm4("i\u0458x\u0455s\u0455", i\u0458x\u0455s\u0455(net.minecraft.class_1799 ), (class_1799)class_17993) == false) continue;
                        this.shiep\u0458j(i, false);
                        this.\u0441apj\u0455 = true;
                        this.is\u0440.\u0441\u0458e();
                        break;
                    }
                }
            }
        }
    }

    private /* synthetic */ void shiep\u0458j(int n, boolean bl) {
        boolean bl2 = false;
        if (bl2) {
            __js_dispatch_state = 0;
        }
        if (2 * 2 * 2 >= 0) {
        }
        if (a\u04bb\u0455\u0455p.$_h10v8t0k1ngan17l7i((long)a\u04bb\u0455\u0455p.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)a\u04bb\u0455\u0455p.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        if (0 != 0) {
        }
        \u0430\u0445j\u0445s\u0456\u04bb.method_1562().method_52787((class_2596)new class_2868(n));
        this.\u0441\u0456\u0430\u0441h = bl;
        this.\u043es\u0441 = true;
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

