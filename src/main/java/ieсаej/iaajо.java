/*
 * Decompiled with CFR 0.152.
 */
package ie\u0441\u0430ej;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class iaaj\u043e {
    public /* synthetic */ String e\u0458\u0430\u0458\u0435pc;
    public /* synthetic */ double \u0458\u0458\u0458;
    public /* synthetic */ double \u0445\u04bbp\u0440\u0440s;
    public /* synthetic */ double \u0456\u0430j\u0458\u0456os;
    public /* synthetic */ double \u0456h\u0440s;
    public /* synthetic */ double \u0435xja\u0445\u0441s;
    public /* synthetic */ double p\u0440\u0458\u0430s;
    public /* synthetic */ double[] cee;
    public /* synthetic */ String[] sh\u0430\u0445i;
    public /* synthetic */ long \u0458\u0440x\u0456p;

    public iaaj\u043e() {
        if (2 * 2 * 2 >= 0) {
        }
    }

    public /* synthetic */ boolean equals(Object object) {
        String string;
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        if (object == this) {
            return true;
        }
        if (!(object instanceof iaaj\u043e)) {
            return false;
        }
        iaaj\u043e iaaj\u043e2 = (iaaj\u043e)object;
        if (!iaaj\u043e2.h\u0458c\u0440h(this)) {
            return false;
        }
        if (iaaj\u043e.a_bsm0("compare", compare(double double ), (double)this.\u04bb\u0445c\u0445(), (double)iaaj\u043e2.\u04bb\u0445c\u0445()) != false) {
            return false;
        }
        if (iaaj\u043e.a_bsm0("compare", compare(double double ), (double)this.p\u043eix\u0445e(), (double)iaaj\u043e2.p\u043eix\u0445e()) != false) {
            return false;
        }
        if (iaaj\u043e.a_bsm0("compare", compare(double double ), (double)this.\u04bb\u0435\u0455(), (double)iaaj\u043e2.\u04bb\u0435\u0455()) != false) {
            return false;
        }
        if (iaaj\u043e.a_bsm0("compare", compare(double double ), (double)this.\u0456\u0458\u0456\u043e\u0441c(), (double)iaaj\u043e2.\u0456\u0458\u0456\u043e\u0441c()) != false) {
            return false;
        }
        if (iaaj\u043e.a_bsm0("compare", compare(double double ), (double)this.ah\u0441sa\u0455(), (double)iaaj\u043e2.ah\u0441sa\u0455()) != false) {
            return false;
        }
        if (iaaj\u043e.a_bsm0("compare", compare(double double ), (double)this.s\u0455c\u0435h(), (double)iaaj\u043e2.s\u0455c\u0435h()) != false) {
            return false;
        }
        if (this.op\u0456\u0445\u0455c\u043e() != iaaj\u043e2.op\u0456\u0445\u0455c\u043e()) {
            return false;
        }
        String string2 = this.\u0430h\u04bb\u0430\u0430j();
        if (iaaj\u043e.a_bsm1("equals", equals(java.lang.Object java.lang.Object ), (Object)string2, (Object)(string = iaaj\u043e2.\u0430h\u04bb\u0430\u0430j())) != false) {
            return iaaj\u043e.a_bsm2("equals", equals(double[] double[] ), (double[])this.isha\u04bb\u0440\u0440(), (double[])iaaj\u043e2.isha\u04bb\u0440\u0440()) != false && iaaj\u043e.a_bsm3("deepEquals", deepEquals(java.lang.Object[] java.lang.Object[] ), (Object[])this.\u0435\u0435ea(), (Object[])iaaj\u043e2.\u0435\u0435ea()) != false;
        }
        return false;
    }

    protected /* synthetic */ boolean h\u0458c\u0440h(Object object) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return object instanceof iaaj\u043e;
    }

    public /* synthetic */ int hashCode() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        int n = 1;
        n = n * (-258954338 + 258954397) + iaaj\u043e.a_bsm4("hashCode", hashCode(double ), (double)this.\u04bb\u0445c\u0445());
        n = n * (-1763004261 + 1763004320) + iaaj\u043e.a_bsm4("hashCode", hashCode(double ), (double)this.p\u043eix\u0445e());
        n = n * (-1072172712 + 1072172771) + iaaj\u043e.a_bsm4("hashCode", hashCode(double ), (double)this.\u04bb\u0435\u0455());
        n = n * (-876050037 + 876050096) + iaaj\u043e.a_bsm4("hashCode", hashCode(double ), (double)this.\u0456\u0458\u0456\u043e\u0441c());
        n = n * (-1128295659 + 1128295718) + iaaj\u043e.a_bsm4("hashCode", hashCode(double ), (double)this.ah\u0441sa\u0455());
        n = n * (-350282460 + 350282519) + iaaj\u043e.a_bsm4("hashCode", hashCode(double ), (double)this.s\u0455c\u0435h());
        long l2 = this.op\u0456\u0445\u0455c\u043e();
        n = n * (-573121861 + 573121920) + iaaj\u043e.a_bsm5("hashCode", hashCode(long ), (long)l2);
        String string = this.\u0430h\u04bb\u0430\u0430j();
        n = n * (-1001143448 + 1001143507) + (string == null ? -1464853753 + 1464853796 : string.hashCode());
        n = n * (-1338178233 + 1338178292) + iaaj\u043e.a_bsm6("hashCode", hashCode(double[] ), (double[])this.isha\u04bb\u0440\u0440());
        return n * (-476542333 + 476542392) + iaaj\u043e.a_bsm7("deepHashCode", deepHashCode(java.lang.Object[] ), (Object[])this.\u0435\u0435ea());
    }

    public /* synthetic */ String toString() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        long l2 = this.op\u0456\u0445\u0455c\u043e();
        CallSite callSite = iaaj\u043e.a_bsm9("deepToString", deepToString(java.lang.Object[] ), (Object[])this.\u0435\u0435ea());
        CallSite callSite2 = iaaj\u043e.a_bsm8("toString", toString(double[] ), (double[])this.isha\u04bb\u0440\u0440());
        double d = this.s\u0455c\u0435h();
        double d2 = this.ah\u0441sa\u0455();
        double d3 = this.\u0456\u0458\u0456\u043e\u0441c();
        double d4 = this.\u04bb\u0435\u0455();
        double d5 = this.p\u043eix\u0445e();
        double d6 = this.\u04bb\u0445c\u0445();
        String string = this.\u0430h\u04bb\u0430\u0430j();
        byte[] byArray = new byte[-763467237 + 763467263];
        byArray[0] = -391250917 + 391250911;
        byArray[1] = -2042036701 + 2042036629;
        byArray[2] = -1191864476 + 1191864413;
        byArray[3] = -382167490 + 382167400;
        byArray[4] = -358352881 + 358352902;
        byArray[5] = -79525701 + 79525815;
        byArray[-986970355 + 986970361] = -1409804318 + 1409804343;
        byArray[-561561191 + 561561198] = -1576012080 + 1576012061;
        byArray[-1372788587 + 1372788595] = -990702399 + 990702341;
        byArray[-726962170 + 726962179] = -1155479996 + 1155479962;
        byArray[-1840884630 + 1840884640] = -1088519420 + 1088519395;
        byArray[-353213537 + 353213548] = -589170246 + 589170263;
        byArray[-375197216 + 375197228] = -1904071791 + 1904071903;
        byArray[-1768931936 + 1768931949] = -1380601815 + 1380601895;
        byArray[-2053699961 + 2053699975] = -69346605 + 69346726;
        byArray[-42111950 + 42111965] = 0;
        byArray[-1177049321 + 1177049337] = -283139841 + 283139948;
        byArray[-1715701042 + 1715701059] = -1803046673 + 1803046718;
        byArray[-429614677 + 429614695] = -2074201400 + 2074201358;
        byArray[-1654673139 + 1654673158] = -212113674 + 212113662;
        byArray[-2123676503 + 2123676523] = -1888856134 + 1888856034;
        byArray[-717586795 + 717586816] = -1905479222 + 1905479241;
        byArray[-70466331 + 70466353] = -923217125 + 923217156;
        byArray[-220510867 + 220510890] = -2084793300 + 2084793225;
        byArray[-375465711 + 375465735] = -764263650 + 764263751;
        byArray[-1492292620 + 1492292645] = -2056233040 + 2056233083;
        byte[] byArray2 = new byte[-226443669 + 226443676];
        byArray2[0] = -1804454931 + 1804454895;
        byArray2[1] = -1327366330 + 1327366233;
        byArray2[2] = -1670907230 + 1670907293;
        byArray2[3] = -683111205 + 683111237;
        byArray2[4] = -1137195283 + 1137195292;
        byArray2[5] = -2106767435 + 2106767459;
        byArray2[-1506326257 + 1506326263] = -236559979 + 236560007;
        byte[] byArray3 = new byte[-1986295403 + 1986295410];
        byArray3[0] = -751562529 + 751562422;
        byArray3[1] = -655249239 + 655249164;
        byArray3[2] = -1346130778 + 1346130903;
        byArray3[3] = -1537458621 + 1537458655;
        byArray3[4] = -985743391 + 985743353;
        byArray3[5] = -731599706 + 731599674;
        byArray3[-403548099 + 403548105] = -2075016312 + 2075016221;
        byte[] byArray4 = new byte[-446450792 + 446450799];
        byArray4[0] = -1334421768 + 1334421895;
        byArray4[1] = -931209951 + 931209890;
        byArray4[2] = -1777765910 + 1777765860;
        byArray4[3] = -228644281 + 228644153;
        byArray4[4] = -1423706280 + 1423706365;
        byArray4[5] = -1833912384 + 1833912355;
        byArray4[-1431543774 + 1431543780] = -1278803965 + 1278803933;
        byte[] byArray5 = new byte[-1692713071 + 1692713080];
        byArray5[0] = -2108391177 + 2108391300;
        byArray5[1] = -1109593209 + 1109593279;
        byArray5[2] = -497768209 + 497768147;
        byArray5[3] = -1894974814 + 1894974927;
        byArray5[4] = -2070415567 + 2070415653;
        byArray5[5] = -499183025 + 499182970;
        byArray5[-1813822074 + 1813822080] = -1017054673 + 1017054665;
        byArray5[-1471320808 + 1471320815] = -232362820 + 232362902;
        byArray5[-1702459313 + 1702459321] = -1845229920 + 1845229972;
        byte[] byArray6 = new byte[-1646218226 + 1646218238];
        byArray6[0] = -1317748852 + 1317748966;
        byArray6[1] = -883447885 + 883447923;
        byArray6[2] = -927354325 + 927354242;
        byArray6[3] = -1060718816 + 1060718899;
        byArray6[4] = -1830461221 + 1830461141;
        byArray6[5] = -951063867 + 951063926;
        byArray6[-2137205298 + 2137205304] = -1241236409 + 1241236420;
        byArray6[-563292751 + 563292758] = -1692703233 + 1692703225;
        byArray6[-1087978884 + 1087978892] = -1473626232 + 1473626340;
        byArray6[-602704967 + 602704976] = -2104738665 + 2104738658;
        byArray6[-1079485664 + 1079485674] = -1526450023 + 1526449902;
        byArray6[-416793937 + 416793948] = -1491406568 + 1491406494;
        byte[] byArray7 = new byte[-980309263 + 980309276];
        byArray7[0] = -1660958024 + 1660958066;
        byArray7[1] = -542092799 + 542092741;
        byArray7[2] = -810175990 + 810176053;
        byArray7[3] = -619068670 + 619068725;
        byArray7[4] = -177672029 + 177671920;
        byArray7[5] = -608280167 + 608280268;
        byArray7[-2104564522 + 2104564528] = -1956182380 + 1956182506;
        byArray7[-131056893 + 131056900] = -1;
        byArray7[-691108508 + 691108516] = -1819916260 + 1819916343;
        byArray7[-724773453 + 724773462] = -604737763 + 604737838;
        byArray7[-1374768765 + 1374768775] = -949902624 + 949902744;
        byArray7[-2000962106 + 2000962117] = -1289179807 + 1289179722;
        byArray7[-768038077 + 768038089] = -1986126697 + 1986126773;
        byte[] byArray8 = new byte[-492906453 + 492906470];
        byArray8[0] = -1211071015 + 1211071051;
        byArray8[1] = -1694694835 + 1694694868;
        byArray8[2] = -686656576 + 686656646;
        byArray8[3] = -849533884 + 849533988;
        byArray8[4] = -1330598438 + 1330598351;
        byArray8[5] = -1886937124 + 1886937070;
        byArray8[-477751908 + 477751914] = -1462094279 + 1462094308;
        byArray8[-567884013 + 567884020] = -290336060 + 290336149;
        byArray8[-1077609030 + 1077609038] = -309162714 + 309162635;
        byArray8[-681332801 + 681332810] = 0;
        byArray8[-726801065 + 726801075] = -1985974547 + 1985974435;
        byArray8[-1922402812 + 1922402823] = -84088267 + 84088320;
        byArray8[-502535445 + 502535457] = -486799738 + 486799816;
        byArray8[-1596116724 + 1596116737] = -686631861 + 686631882;
        byArray8[-2082509265 + 2082509279] = -1962887004 + 1962887101;
        byArray8[-1179712399 + 1179712414] = -1298946319 + 1298946269;
        byArray8[-6304733 + 6304749] = -1614614815 + 1614614767;
        byte[] byArray9 = new byte[-89441985 + 89441992];
        byArray9[0] = -745912847 + 745912881;
        byArray9[1] = -1981620035 + 1981619967;
        byArray9[2] = -444969464 + 444969532;
        byArray9[3] = -703669927 + 703669892;
        byArray9[4] = -1031513632 + 1031513548;
        byArray9[5] = -891743167 + 891743088;
        byArray9[-1969491030 + 1969491036] = -1925795657 + 1925795715;
        byte[] byArray10 = new byte[-713581123 + 713581136];
        byArray10[0] = -1613852663 + 1613852623;
        byArray10[1] = -385025799 + 385025725;
        byArray10[2] = -730472469 + 730472576;
        byArray10[3] = -1696651737 + 1696651619;
        byArray10[4] = -1060533260 + 1060533274;
        byArray10[5] = -1263180536 + 1263180622;
        byArray10[-672289078 + 672289084] = -1081337669 + 1081337613;
        byArray10[-929573448 + 929573455] = -323971829 + 323971760;
        byArray10[-745358401 + 745358409] = -1447866431 + 1447866329;
        byArray10[-1083487179 + 1083487188] = -1743627142 + 1743627236;
        byArray10[-33708849 + 33708859] = -1211839131 + 1211839081;
        byArray10[-462856532 + 462856543] = -274706730 + 274706792;
        byArray10[-130535508 + 130535520] = -2133123341 + 2133123216;
        return (String)((Object)iaaj\u043e.a_bsm10("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(773703952 + 610437488), (int)(1945390482 + 2038079452))) + string + (String)((Object)iaaj\u043e.a_bsm10("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray2, (int)(-792540052 + 340203677), (int)(1630021330 + 1359579999))) + d6 + (String)((Object)iaaj\u043e.a_bsm10("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray3, (int)(-42836156 + 136291917), (int)(1849950444 + 145782280))) + d5 + (String)((Object)iaaj\u043e.a_bsm10("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray4, (int)(-1284431180 + 1657926542), (int)(-1488977871 + 210023315))) + d4 + (String)((Object)iaaj\u043e.a_bsm10("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray5, (int)(76901595 + 1092999392), (int)(1818917000 + 0xC1CFFFF))) + d3 + (String)((Object)iaaj\u043e.a_bsm10("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray6, (int)(1844548422 + 1985696005), (int)(1182160469 + 567022060))) + d2 + (String)((Object)iaaj\u043e.a_bsm10("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray7, (int)(1414546401 + 792805296), (int)(-24834929 + 2073456011))) + d + (String)((Object)iaaj\u043e.a_bsm10("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray8, (int)(1895173207 + 1414707440), (int)(711786430 + 1063807511))) + callSite2 + (String)((Object)iaaj\u043e.a_bsm10("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray9, (int)(119700319 + 1978335661), (int)(-17041976 + 798767312))) + callSite + (String)((Object)iaaj\u043e.a_bsm10("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray10, (int)(-396449346 + 1943188082), (int)(-1004366039 + 792222769))) + l2 + (String)((Object)iaaj\u043e.a_bsm10("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1846608870 + 1846608845}, (int)(-1084521656 + 747268253), (int)(-829137481 + 1637339764)));
    }

    public /* synthetic */ void \u0441\u0441\u043e\u0440\u04bb(String string) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        this.e\u0458\u0430\u0458\u0435pc = string;
    }

    public /* synthetic */ void pj\u043e\u0456\u0430i\u0440(double d) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        this.\u0458\u0458\u0458 = d;
    }

    public /* synthetic */ void c\u0456\u0456h\u0435\u0458\u0435(double d) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        this.\u0445\u04bbp\u0440\u0440s = d;
    }

    public /* synthetic */ void \u0458s\u0430e\u0458(double d) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        this.\u0456\u0430j\u0458\u0456os = d;
    }

    public /* synthetic */ void eo\u043ec\u0455a(double d) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        this.\u0456h\u0440s = d;
    }

    public /* synthetic */ void \u0456\u0440\u0430\u0430phe(double d) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        this.\u0435xja\u0445\u0441s = d;
    }

    public /* synthetic */ void \u0445jox(double d) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        this.p\u0440\u0458\u0430s = d;
    }

    public /* synthetic */ void \u0435\u0455\u0456(double[] dArray) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        this.cee = dArray;
    }

    public /* synthetic */ void \u0455cp\u0430\u043ej(String[] stringArray) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        this.sh\u0430\u0445i = stringArray;
    }

    public /* synthetic */ void j\u0441i\u0456\u0430(long l2) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        this.\u0458\u0440x\u0456p = l2;
    }

    public /* synthetic */ String \u0430h\u04bb\u0430\u0430j() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return this.e\u0458\u0430\u0458\u0435pc;
    }

    public /* synthetic */ double \u04bb\u0445c\u0445() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return this.\u0458\u0458\u0458;
    }

    public /* synthetic */ double p\u043eix\u0445e() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return this.\u0445\u04bbp\u0440\u0440s;
    }

    public /* synthetic */ double \u04bb\u0435\u0455() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return this.\u0456\u0430j\u0458\u0456os;
    }

    public /* synthetic */ double \u0456\u0458\u0456\u043e\u0441c() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return this.\u0456h\u0440s;
    }

    public /* synthetic */ double ah\u0441sa\u0455() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return this.\u0435xja\u0445\u0441s;
    }

    public /* synthetic */ double s\u0455c\u0435h() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return this.p\u0440\u0458\u0430s;
    }

    public /* synthetic */ double[] isha\u04bb\u0440\u0440() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return this.cee;
    }

    public /* synthetic */ String[] \u0435\u0435ea() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return this.sh\u0430\u0445i;
    }

    public /* synthetic */ long op\u0456\u0445\u0455c\u043e() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return this.\u0458\u0440x\u0456p;
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
}

