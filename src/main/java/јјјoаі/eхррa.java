/*
 * Decompiled with CFR 0.152.
 */
package \u0458\u0458\u0458o\u0430\u0456;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class e\u0445\u0440\u0440a {
    public /* synthetic */ float ip\u0441\u0430\u0441\u0455;
    public /* synthetic */ float \u0440\u0441\u0455\u0455;
    public /* synthetic */ double \u0455e\u0456px;
    public /* synthetic */ Runnable x\u0435sp\u0456j\u0440;
    public /* synthetic */ Runnable j\u0456\u0440;

    public e\u0445\u0440\u0440a(float f, float f2) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        this.ip\u0441\u0430\u0441\u0455 = f;
        this.\u0440\u0441\u0455\u0455 = f2;
    }

    public /* synthetic */ boolean equals(Object object) {
        Runnable runnable;
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (object == this) {
            return true;
        }
        if (!(object instanceof e\u0445\u0440\u0440a)) {
            return false;
        }
        e\u0445\u0440\u0440a e\u0445\u0440\u0440a2 = (e\u0445\u0440\u0440a)object;
        if (!e\u0445\u0440\u0440a2.h\u0458c\u0440h(this)) {
            return false;
        }
        if (e\u0445\u0440\u0440a.a_bsm0("compare", compare(float float ), (float)this.jo\u0456c\u043e\u0440(), (float)e\u0445\u0440\u0440a2.jo\u0456c\u043e\u0440()) != false) {
            return false;
        }
        if (e\u0445\u0440\u0440a.a_bsm0("compare", compare(float float ), (float)this.xpx(), (float)e\u0445\u0440\u0440a2.xpx()) != false) {
            return false;
        }
        if (e\u0445\u0440\u0440a.a_bsm1("compare", compare(double double ), (double)this.p\u0456\u0456\u0456i(), (double)e\u0445\u0440\u0440a2.p\u0456\u0456\u0456i()) != false) {
            return false;
        }
        Runnable runnable2 = this.\u0458\u0456\u0445();
        if (e\u0445\u0440\u0440a.a_bsm2("equals", equals(java.lang.Object java.lang.Object ), (Object)runnable2, (Object)(runnable = e\u0445\u0440\u0440a2.\u0458\u0456\u0445())) != false) {
            Runnable runnable3 = this.i\u0455j\u0440o\u0430();
            Runnable runnable4 = e\u0445\u0440\u0440a2.i\u0455j\u0440o\u0430();
            return (boolean)e\u0445\u0440\u0440a.a_bsm2("equals", equals(java.lang.Object java.lang.Object ), (Object)runnable3, (Object)runnable4);
        }
        return false;
    }

    protected /* synthetic */ boolean h\u0458c\u0440h(Object object) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return object instanceof e\u0445\u0440\u0440a;
    }

    public /* synthetic */ int hashCode() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        int n = 1;
        n = n * (-1666502532 + 1666502591) + e\u0445\u0440\u0440a.a_bsm3("floatToIntBits", floatToIntBits(float ), (float)this.jo\u0456c\u043e\u0440());
        n = n * (-1275957028 + 1275957087) + e\u0445\u0440\u0440a.a_bsm3("floatToIntBits", floatToIntBits(float ), (float)this.xpx());
        n = n * (-1882745216 + 1882745275) + e\u0445\u0440\u0440a.a_bsm4("hashCode", hashCode(double ), (double)this.p\u0456\u0456\u0456i());
        Runnable runnable = this.\u0458\u0456\u0445();
        n = n * (-1391947956 + 1391948015) + (runnable == null ? -920744852 + 920744895 : runnable.hashCode());
        Runnable runnable2 = this.i\u0455j\u0440o\u0430();
        return n * (-257149194 + 257149253) + (runnable2 == null ? -782583215 + 782583258 : runnable2.hashCode());
    }

    public /* synthetic */ String toString() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        CallSite callSite = e\u0445\u0440\u0440a.a_bsm5("valueOf", valueOf(java.lang.Object ), (Object)this.i\u0455j\u0440o\u0430());
        CallSite callSite2 = e\u0445\u0440\u0440a.a_bsm5("valueOf", valueOf(java.lang.Object ), (Object)this.\u0458\u0456\u0445());
        double d = this.p\u0456\u0456\u0456i();
        float f = this.xpx();
        float f2 = this.jo\u0456c\u043e\u0440();
        byte[] byArray = new byte[-220914739 + 220914752];
        byArray[0] = -253421903 + 253421936;
        byArray[1] = -804650155 + 804650239;
        byArray[2] = -117708373 + 117708478;
        byArray[3] = -1486883695 + 1486883602;
        byArray[4] = -518869172 + 518869199;
        byArray[5] = -851898108 + 851898070;
        byArray[-497829119 + 497829125] = -1715691758 + 1715691790;
        byArray[-1127972524 + 1127972531] = -1834054330 + 1834054314;
        byArray[-2030939576 + 2030939584] = -987294983 + 987295105;
        byArray[-890121472 + 890121481] = -524432042 + 524432135;
        byArray[-1327342048 + 1327342058] = -1812385442 + 1812385344;
        byArray[-1793135648 + 1793135659] = -1156485966 + 1156485936;
        byArray[-872934402 + 872934414] = -2009735162 + 2009735249;
        byte[] byArray2 = new byte[-575099597 + 575099605];
        byArray2[0] = -1063686269 + 1063686314;
        byArray2[1] = -104812937 + 104812988;
        byArray2[2] = -1823868770 + 1823868768;
        byArray2[3] = -846166623 + 846166576;
        byArray2[4] = -660534940 + 660535057;
        byArray2[5] = -615634797 + 615634901;
        byArray2[-947546920 + 947546926] = -1935371667 + 1935371550;
        byArray2[-625573147 + 625573154] = -1703173189 + 1703173152;
        byte[] byArray3 = new byte[-129495906 + 129495919];
        byArray3[0] = -2028788730 + 2028788780;
        byArray3[1] = -399652994 + 399652982;
        byArray3[2] = -1087089630 + 1087089701;
        byArray3[3] = -1679103631 + 1679103681;
        byArray3[4] = -758503039 + 758502956;
        byArray3[5] = -1343663633 + 1343663699;
        byArray3[-964676197 + 964676203] = -341944246 + 341944189;
        byArray3[-1704675757 + 1704675764] = -341339736 + 341339712;
        byArray3[-818964621 + 818964629] = -1330140540 + 1330140450;
        byArray3[-406112775 + 406112784] = -215823201 + 215823311;
        byArray3[-138654112 + 138654122] = -237871208 + 237871087;
        byArray3[-80223286 + 80223297] = -2014627378 + 2014627282;
        byArray3[-396310422 + 396310434] = -1322316330 + 1322316450;
        byte[] byArray4 = new byte[-656126338 + 656126345];
        byArray4[0] = -1390827163 + 1390827098;
        byArray4[1] = -1202075564 + 1202075617;
        byArray4[2] = -1697182920 + 1697183013;
        byArray4[3] = -1973301843 + 1973301837;
        byArray4[4] = -1541685908 + 1541685918;
        byArray4[5] = -811080691 + 811080798;
        byArray4[-178276089 + 178276095] = -781304237 + 781304356;
        byte[] byArray5 = new byte[-280810264 + 280810275];
        byArray5[0] = -562095338 + 562095260;
        byArray5[1] = -2101645115 + 2101645239;
        byArray5[2] = -1456437119 + 1456437033;
        byArray5[3] = -377788740 + 377788822;
        byArray5[4] = -465384760 + 465384768;
        byArray5[5] = 1;
        byArray5[-1598122327 + 1598122333] = -1468537573 + 1468537656;
        byArray5[-53658592 + 53658599] = -47965429 + 47965412;
        byArray5[-1090257416 + 1090257424] = -887254722 + 887254797;
        byArray5[-386720368 + 386720377] = -942702982 + 942702990;
        byArray5[-880233919 + 880233929] = -580891612 + 580891501;
        return (String)((Object)e\u0445\u0440\u0440a.a_bsm6("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(449504953 + 1338213332), (int)(146655047 + 740191636))) + f2 + (String)((Object)e\u0445\u0440\u0440a.a_bsm6("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray2, (int)(618529117 + 1499167963), (int)(91712124 + 522107418))) + f + (String)((Object)e\u0445\u0440\u0440a.a_bsm6("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray3, (int)(1027219714 + 1583184533), (int)(2011876979 + 1903041253))) + d + (String)((Object)e\u0445\u0440\u0440a.a_bsm6("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray4, (int)(-1671650531 + 842476406), (int)(-352407541 + 992704030))) + callSite2 + (String)((Object)e\u0445\u0440\u0440a.a_bsm6("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray5, (int)(-1479569867 + 1399155967), (int)(-2070882325 + 1717310209))) + callSite + (String)((Object)e\u0445\u0440\u0440a.a_bsm6("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-162925874 + 162925966}, (int)(1161626310 + 860190140), (int)(1302796200 + 1644730375)));
    }

    public /* synthetic */ void s\u0430sss\u0435\u043e(float f) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        this.ip\u0441\u0430\u0441\u0455 = f;
    }

    public /* synthetic */ void \u0435s\u0430(float f) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        this.\u0440\u0441\u0455\u0455 = f;
    }

    public /* synthetic */ void a\u0455\u0440i\u0455\u04bb(double d) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        this.\u0455e\u0456px = d;
    }

    public /* synthetic */ void \u0445\u0430oi(Runnable runnable) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        this.x\u0435sp\u0456j\u0440 = runnable;
    }

    public /* synthetic */ void x\u04bbc\u0440(Runnable runnable) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        this.j\u0456\u0440 = runnable;
    }

    public /* synthetic */ float jo\u0456c\u043e\u0440() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return this.ip\u0441\u0430\u0441\u0455;
    }

    public /* synthetic */ float xpx() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return this.\u0440\u0441\u0455\u0455;
    }

    public /* synthetic */ double p\u0456\u0456\u0456i() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return this.\u0455e\u0456px;
    }

    public /* synthetic */ Runnable \u0458\u0456\u0445() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return this.x\u0435sp\u0456j\u0440;
    }

    public /* synthetic */ Runnable i\u0455j\u0440o\u0430() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return this.j\u0456\u0440;
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
}

