/*
 * Decompiled with CFR 0.152.
 */
package ie\u0441\u0430ej;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;

public class i\u0435\u0445\u0440 {
    public i\u0435\u0445\u0440() {
        if (true | false) {
        }
        i\u0435\u0445\u0440.a_bsm0("setFollowRedirects", setFollowRedirects(boolean ), (boolean)true);
    }

    public static /* synthetic */ HttpURLConnection i\u0430\u0435i\u043e(String string, String string2, String string3) throws IOException {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection)new URL(string).openConnection();
        httpURLConnection.setRequestMethod(string2);
        httpURLConnection.setConnectTimeout(-1380587974 + 1380592974);
        httpURLConnection.setReadTimeout(-1575879991 + 1575889991);
        byte[] byArray = new byte[-1187545331 + 1187545341];
        byArray[0] = -47887317 + 47887267;
        byArray[1] = 4;
        byArray[2] = -1182983505 + 1182983397;
        byArray[3] = -1290217077 + 1290217099;
        byArray[4] = -1173279705 + 1173279825;
        byArray[5] = -858093881 + 858093891;
        byArray[-585124095 + 585124101] = -290952769 + 290952744;
        byArray[-209097022 + 209097029] = -881994367 + 881994326;
        byArray[-1495953807 + 1495953815] = -125229288 + 125229342;
        byArray[-589914231 + 589914240] = -1367091272 + 1367091235;
        httpURLConnection.setRequestProperty((String)((Object)i\u0435\u0445\u0440.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-1729999212 + 2055521490), (int)(1431338329 + 2105300339))), string3);
        httpURLConnection.setInstanceFollowRedirects(true);
        httpURLConnection.setDoOutput(true);
        return httpURLConnection;
    }

    public static /* synthetic */ String o\u0456\u0445(String string, String string2, String string3) {
        try {
            String string4;
            if ((3 * 3 + 3) % 2 == 0) {
            }
            if (0 != 0) {
            }
            HttpURLConnection httpURLConnection = i\u0435\u0445\u0440.i\u0430\u0435i\u043e(string, string2, string3);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            StringBuilder stringBuilder = new StringBuilder();
            while ((string4 = bufferedReader.readLine()) != null) {
                stringBuilder.append(string4).append((String)((Object)i\u0435\u0445\u0440.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1673077018 + 1673077036}, (int)(-1498927800 + 1423232564), (int)(-257750787 + 141291537))));
            }
            bufferedReader.close();
            return stringBuilder.toString();
        }
        catch (SocketTimeoutException socketTimeoutException) {
            byte[] byArray = new byte[-1292507301 + 1292507315];
            byArray[0] = -885914648 + 885914617;
            byArray[1] = -2017334776 + 2017334679;
            byArray[2] = -112329191 + 112329226;
            byArray[3] = -215182099 + 215181972;
            byArray[4] = -493489198 + 493489245;
            byArray[5] = -613989670 + 613989545;
            byArray[-398784840 + 398784846] = -1869018296 + 1869018396;
            byArray[-465699964 + 465699971] = -512990997 + 512990914;
            byArray[-648831811 + 648831819] = -1128517486 + 1128517511;
            byArray[-2027418095 + 2027418104] = 2;
            byArray[-1019435995 + 1019436005] = -751307030 + 751307036;
            byArray[-2104591484 + 2104591495] = -1839144910 + 1839144842;
            byArray[-758288883 + 758288895] = -1897556353 + 1897556284;
            byArray[-564383491 + 564383504] = -1275655051 + 1275654987;
            System.err.println((String)((Object)i\u0435\u0445\u0440.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(892037785 + 1697263547), (int)(-1244273796 + 133945941))));
            return null;
        }
        catch (IOException iOException) {
            byte[] byArray = new byte[-1214323109 + 1214323135];
            byArray[0] = -362441316 + 362441397;
            byArray[1] = -2008406801 + 2008406788;
            byArray[2] = -1644415258 + 1644415286;
            byArray[3] = -2098285239 + 2098285288;
            byArray[4] = -406976152 + 406976231;
            byArray[5] = -1231947121 + 1231947032;
            byArray[-2065343454 + 2065343460] = -845743808 + 845743931;
            byArray[-1050647303 + 1050647310] = -147908052 + 147908166;
            byArray[-1711154111 + 1711154119] = -1182676178 + 1182676241;
            byArray[-1861045974 + 1861045983] = -1804417853 + 1804417860;
            byArray[-640338171 + 640338181] = 4;
            byArray[-1536502350 + 1536502361] = -1901315951 + 1901315904;
            byArray[-1580547619 + 1580547631] = -1;
            byArray[-490240223 + 490240236] = -201494392 + 201494298;
            byArray[-2077746936 + 2077746950] = 3;
            byArray[-444462352 + 444462367] = -1717916122 + 1717916041;
            byArray[-1156882068 + 1156882084] = -693057953 + 693058009;
            byArray[-941002837 + 941002854] = -711517389 + 711517270;
            byArray[-909578565 + 909578583] = -1175321352 + 1175321396;
            byArray[-1592078931 + 1592078950] = -1742416494 + 1742416399;
            byArray[-112171259 + 112171279] = -510086058 + 510086025;
            byArray[-1521621751 + 1521621772] = -2090705368 + 2090705317;
            byArray[-721779221 + 721779243] = -952128821 + 952128897;
            byArray[-497012950 + 497012973] = -401222848 + 401222732;
            byArray[-1279617825 + 1279617849] = -1627473279 + 1627473249;
            byArray[-668893666 + 668893691] = -34756868 + 34756783;
            System.err.println((String)((Object)i\u0435\u0445\u0440.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(1567635500 + 1610319167), (int)(1137809667 + 1773868168))));
            return null;
        }
    }

    public static /* synthetic */ String \u0430\u0455c\u04bb\u0445\u0441(String string) throws IOException {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        byte[] byArray = new byte[-1742781646 + 1742781718];
        byArray[0] = -232482105 + 232482134;
        byArray[1] = -1069476363 + 1069476470;
        byArray[2] = -564507800 + 564507852;
        byArray[3] = -1615369583 + 1615369484;
        byArray[4] = -4660337 + 4660346;
        byArray[5] = -1768548616 + 1768548702;
        byArray[-117088412 + 117088418] = -1852798838 + 1852798947;
        byArray[-1964432317 + 1964432324] = -871890824 + 871890734;
        byArray[-532680719 + 532680727] = -1195114816 + 1195114755;
        byArray[-782126555 + 782126564] = -224574075 + 224574107;
        byArray[-1061198753 + 1061198763] = -2040831079 + 2040830971;
        byArray[-1580718108 + 1580718119] = -1570608893 + 1570608861;
        byArray[-1677696602 + 1677696614] = -1751965 + 1751900;
        byArray[-2133512513 + 2133512526] = -896794276 + 896794390;
        byArray[-889841127 + 889841141] = -1971086250 + 1971086132;
        byArray[-1483019114 + 1483019129] = -717479464 + 717479516;
        byArray[-1501954780 + 1501954796] = -1048158387 + 1048158502;
        byArray[-177109809 + 177109826] = -462218858 + 462218853;
        byArray[-1349131032 + 1349131050] = -727395483 + 727395363;
        byArray[-1888749012 + 1888749031] = -2019907246 + 2019907278;
        byArray[-1937326150 + 1937326170] = -1433470528 + 1433470407;
        byArray[-397500554 + 397500575] = -854044461 + 854044424;
        byArray[-2038983808 + 2038983830] = -1925420856 + 1925420882;
        byArray[-73063158 + 73063181] = 3;
        byArray[-574182599 + 574182623] = -1;
        byArray[-1890281229 + 1890281254] = -1334797424 + 1334797377;
        byArray[-1079430840 + 1079430866] = -1837160970 + 1837160872;
        byArray[-57406282 + 57406309] = -255528102 + 255528072;
        byArray[-1660202529 + 1660202557] = -1789077567 + 1789077511;
        byArray[-682740647 + 682740676] = -528021639 + 528021615;
        byArray[-1338051584 + 1338051614] = -1636402308 + 1636402266;
        byArray[-2057833161 + 2057833192] = -1002547083 + 1002547206;
        byArray[-628690584 + 628690616] = -1445390742 + 1445390790;
        byArray[-2111096014 + 2111096047] = -1793671204 + 1793671238;
        byArray[-863297458 + 863297492] = -336719353 + 336719324;
        byArray[-551662253 + 551662288] = -736268195 + 736268230;
        byArray[-1718078414 + 1718078450] = -913372443 + 913372391;
        byArray[-861991355 + 861991392] = -325805419 + 325805334;
        byArray[-1733157493 + 1733157531] = -952705335 + 952705236;
        byArray[-608631114 + 608631153] = -1711386937 + 1711386812;
        byArray[-63572394 + 63572434] = -899482924 + 899482814;
        byArray[-1879246956 + 1879246997] = -1438551253 + 1438551241;
        byArray[-1530173054 + 1530173096] = -1968097022 + 1968097046;
        byArray[-204565973 + 204566016] = -1244390300 + 1244390422;
        byArray[-1581882563 + 1581882607] = -990510115 + 990510188;
        byArray[-536292318 + 536292363] = -578491144 + 578491168;
        byArray[-1776764888 + 1776764934] = -691283284 + 691283164;
        byArray[-1649187494 + 1649187541] = -1548647670 + 1548647550;
        byArray[-314551971 + 314552019] = -2141673065 + 2141672983;
        byArray[-989121107 + 989121156] = -808299229 + 808299259;
        byArray[-359052446 + 359052496] = -1651063911 + 1651063821;
        byArray[-1371113334 + 1371113385] = -5979016 + 5978964;
        byArray[-2061216264 + 2061216316] = -407452149 + 407452212;
        byArray[-635437965 + 635438018] = -951936885 + 951936911;
        byArray[-1589083451 + 1589083505] = -7542745 + 7542648;
        byArray[-1271415714 + 1271415769] = -1115532737 + 1115532789;
        byArray[-1419996957 + 1419997013] = -556809972 + 556809919;
        byArray[-6919952 + 6920009] = -1502719442 + 1502719407;
        byArray[-868834480 + 868834538] = -392707708 + 392707608;
        byArray[-1006663781 + 1006663840] = -86438623 + 86438649;
        byArray[-1202573253 + 1202573313] = -244436627 + 244436607;
        byArray[-719739491 + 719739552] = -663555342 + 663555333;
        byArray[-393554126 + 393554188] = -1716538999 + 1716538959;
        byArray[-1934754593 + 1934754656] = -39118809 + 39118702;
        byArray[-437801936 + 437802000] = -1921923164 + 1921923141;
        byArray[-818362191 + 818362256] = -898761174 + 898761047;
        byArray[-1419942519 + 1419942585] = -723763503 + 723763500;
        byArray[-879138711 + 879138778] = -1964620791 + 1964620832;
        byArray[-1180255555 + 1180255623] = -1235314306 + 1235314219;
        byArray[-138064414 + 138064483] = -233216912 + 233216964;
        byArray[-1053220321 + 1053220391] = 4;
        byArray[-1229509984 + 1229510055] = -825059902 + 825059952;
        return i\u0435\u0445\u0440.o\u0456\u0445(string, (String)((Object)i\u0435\u0445\u0440.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1897013858 + 1897013912, -1137985478 + 1137985413, -1414690868 + 1414690966}, (int)(-1470775891 + 1959550836), (int)(-1046178940 + 1987224723))), (String)((Object)i\u0435\u0445\u0440.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-1734729264 + 2080961234), (int)(783904779 + 1177486556))));
    }

    private static /* synthetic */ CallSite a_bsm0(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm1(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }
}

