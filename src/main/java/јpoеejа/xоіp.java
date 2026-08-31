/*
 * Decompiled with CFR 0.152.
 */
package \u0458po\u0435ej\u0430;

import asp\u04bb.\u0430phj;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import \u0458po\u0435ej\u0430.c\u04bb\u0455o\u0445po;
import \u0458po\u0435ej\u0430.ec\u0440\u0455;
import \u0458po\u0435ej\u0430.ip\u0456hh\u0445;
import \u0458po\u0435ej\u0430.i\u043ee;
import \u0458po\u0435ej\u0430.j\u0445ep;
import \u0458po\u0435ej\u0430.p\u0455\u0455;
import \u0458po\u0435ej\u0430.xi\u0441joc\u0430;
import \u0458po\u0435ej\u0430.x\u0441cs;
import \u0458po\u0435ej\u0430.\u0435\u0440\u0430;
import \u0458po\u0435ej\u0430.\u043e\u0441xc\u0458\u0430;
import \u0458po\u0435ej\u0430.\u0441o\u0445\u0440hx\u0455;
import \u04bb\u04bb\u0456\u0445.\u0435\u043ea\u0440\u0458;

final class x\u043e\u0456p
extends \u0441o\u0445\u0440hx\u0455 {
    x\u043e\u0456p() {
        if (2 * 2 * 2 >= 0) {
        }
    }

    private static /* synthetic */ double sh\u0455xp(double d, double d2, double d3, boolean bl) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        double d4 = d3;
        CallSite callSite = x\u043e\u0456p.a_bsm0("\u043e\u0455\u043e", \u043e\u0455\u043e(double double double ), (double)d, (double)d2, (double)d4);
        while (((\u0435\u043ea\u0440\u0458)((Object)callSite)).\u04bbeis\u0430() < d2 && !(d3 < 0.0) && !(d3 > 100.0)) {
            CallSite callSite2 = x\u043e\u0456p.a_bsm0("\u043e\u0455\u043e", \u043e\u0455\u043e(double double double ), (double)d, (double)d2, (double)(d3 += bl ? -1.0 : 1.0));
            if (!(((\u0435\u043ea\u0440\u0458)((Object)callSite)).\u04bbeis\u0430() < ((\u0435\u043ea\u0440\u0458)((Object)callSite2)).\u04bbeis\u0430())) continue;
            callSite = callSite2;
            d4 = d3;
        }
        return d4;
    }

    private static /* synthetic */ double \u0430\u0456a(\u0430phj \u0430phj2) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return x\u043e\u0456p.e\u04bb\u0441\u0435\u0435\u04bbp(\u0430phj2, 0.0, 100.0);
    }

    private static /* synthetic */ double e\u04bb\u0441\u0435\u0435\u04bbp(\u0430phj \u0430phj2, double d, double d2) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return x\u043e\u0456p.ha\u043eos(\u0430phj2, d, d2, 1.0);
    }

    private static /* synthetic */ double ha\u043eos(\u0430phj \u0430phj2, double d, double d2, double d3) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        double d4 = x\u043e\u0456p.sh\u0455xp(\u0430phj2.\u0440os\u043eo(), \u0430phj2.\u04bbeis\u0430() * d3, 100.0, true);
        return (double)x\u043e\u0456p.a_bsm1("\u0430\u0456\u0455", \u0430\u0456\u0455(double double double ), (double)d, (double)d2, (double)d4);
    }

    private static /* synthetic */ double s\u0456e(\u0430phj \u0430phj2) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return x\u043e\u0456p.ocoa\u0440e\u0456(\u0430phj2, 0.0, 100.0);
    }

    private static /* synthetic */ double ocoa\u0440e\u0456(\u0430phj \u0430phj2, double d, double d2) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        double d3 = x\u043e\u0456p.sh\u0455xp(\u0430phj2.\u0440os\u043eo(), \u0430phj2.\u04bbeis\u0430(), 0.0, false);
        return (double)x\u043e\u0456p.a_bsm1("\u0430\u0456\u0455", \u0430\u0456\u0455(double double double ), (double)d, (double)d2, (double)d3);
    }

    private static /* synthetic */ i\u043ee hsj\u04bbo\u0441(double d) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (d == 1.5) {
            return new i\u043ee(1.5, 1.5, 3.0, 5.5);
        }
        if (d == 3.0) {
            return new i\u043ee(3.0, 3.0, 4.5, 7.0);
        }
        if (d == 4.5) {
            return new i\u043ee(4.5, 4.5, 7.0, 11.0);
        }
        if (d == 6.0) {
            return new i\u043ee(6.0, 6.0, 7.0, 11.0);
        }
        if (d == 7.0) {
            return new i\u043ee(7.0, 7.0, 11.0, 21.0);
        }
        if (d == 9.0) {
            return new i\u043ee(9.0, 9.0, 11.0, 21.0);
        }
        if (d == 11.0) {
            return new i\u043ee(11.0, 11.0, 21.0, 21.0);
        }
        if (d == 21.0) {
            return new i\u043ee(21.0, 21.0, 21.0, 21.0);
        }
        return new i\u043ee(d, d, 7.0, 21.0);
    }

    @Override
    public /* synthetic */ xi\u0441joc\u0430 surface() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        byte[] byArray = new byte[-1886468275 + 1886468282];
        byArray[0] = -677807776 + 677807880;
        byArray[1] = -155308434 + 155308510;
        byArray[2] = -1623639345 + 1623639316;
        byArray[3] = -1894811597 + 1894811650;
        byArray[4] = -2095522392 + 2095522346;
        byArray[5] = -1317970169 + 1317970137;
        byArray[-938996215 + 938996221] = -1487051585 + 1487051692;
        xi\u0441joc\u0430 xi\u0441joc\u04302 = new ip\u0456hh\u0445().\u0445s\u0456cx\u0441((String)((Object)x\u043e\u0456p.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(1761963675 + 976565407), (int)(-1650873464 + 1668568453)))).x\u0445\u0445a\u0445ch(\u043e\u0441xc\u0458\u04302 -> {
            if ((3 * 3 + 3) % 2 == 0) {
            }
            return \u043e\u0441xc\u0458\u04302.\u04bb\u0440\u0440\u0430eh;
        }).\u0440\u0458\u04bbc(\u043e\u0441xc\u0458\u04302 -> {
            if (true | false) {
            }
            if (\u043e\u0441xc\u0458\u04302.\u043e\u0441\u0456\u0445\u04bb\u043e\u0430 == p\u0455\u0455.\u0440e\u0445e) {
                double d;
                if (\u043e\u0441xc\u0458\u04302.s\u0440\u0458\u0440) {
                    d = 4.0;
                    switch (0) {
                        default: {
                            break;
                        }
                        case 1: {
                            break;
                        }
                        case 2: {
                            break;
                        }
                    }
                } else {
                    d = 98.0;
                }
                return x\u043e\u0456p.a_bsm3("valueOf", valueOf(double ), (double)d);
            }
            return x\u043e\u0456p.a_bsm3("valueOf", valueOf(double ), (double)0.0);
        }).x\u0441cc\u0445(true).\u0458c\u0456\u0440();
        return super.surface().io\u0440().\u0458\u0440\u043ei\u0435(x\u0441cs.xip, xi\u0441joc\u04302).\u0458c\u0456\u0440();
    }

    @Override
    public /* synthetic */ xi\u0441joc\u0430 surfaceDim() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        byte[] byArray = new byte[-2009502827 + 2009502838];
        byArray[0] = -1998197279 + 1998197216;
        byArray[1] = -1517257370 + 1517257355;
        byArray[2] = -1167284872 + 1167284897;
        byArray[3] = -87362001 + 87362091;
        byArray[4] = -1651938189 + 1651938312;
        byArray[5] = 3;
        byArray[-1866342862 + 1866342868] = -1883069407 + 1883069508;
        byArray[-2022590433 + 2022590440] = -1943366826 + 1943366700;
        byArray[-1302616611 + 1302616619] = -1677710332 + 1677710329;
        byArray[-1520042421 + 1520042430] = -976623842 + 976623772;
        byArray[-897355726 + 897355736] = -976124340 + 976124268;
        xi\u0441joc\u0430 xi\u0441joc\u04302 = new ip\u0456hh\u0445().\u0445s\u0456cx\u0441((String)((Object)x\u043e\u0456p.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(444308357 + 1926033858), (int)(-1366841707 + 1839953309)))).x\u0445\u0445a\u0445ch(\u043e\u0441xc\u0458\u04302 -> {
            if ((3 * 3 + 3) % 2 == 0) {
            }
            return \u043e\u0441xc\u0458\u04302.\u04bb\u0440\u0440\u0430eh;
        }).\u0440\u0458\u04bbc(\u043e\u0441xc\u0458\u04302 -> {
            if (2 * 2 * 2 >= 0) {
            }
            if (\u043e\u0441xc\u0458\u04302.\u043e\u0441\u0456\u0445\u04bb\u043e\u0430 == p\u0455\u0455.\u0440e\u0445e) {
                return x\u043e\u0456p.a_bsm3("valueOf", valueOf(double ), (double)(\u043e\u0441xc\u0458\u04302.s\u0440\u0458\u0440 ? 4.0 : 87.0));
            }
            return x\u043e\u0456p.a_bsm3("valueOf", valueOf(double ), (double)0.0);
        }).j\u0430i(\u043e\u0441xc\u0458\u04302 -> {
            if (true | false) {
            }
            if (\u043e\u0441xc\u0458\u04302.\u043e\u0441\u0456\u0445\u04bb\u043e\u0430 == p\u0455\u0455.\u0440e\u0445e) {
                return x\u043e\u0456p.a_bsm3("valueOf", valueOf(double ), (double)(\u043e\u0441xc\u0458\u04302.s\u0440\u0458\u0440 ? 1.0 : 1.7));
            }
            return x\u043e\u0456p.a_bsm3("valueOf", valueOf(double ), (double)0.0);
        }).x\u0441cc\u0445(true).\u0458c\u0456\u0440();
        return super.surfaceDim().io\u0440().\u0458\u0440\u043ei\u0435(x\u0441cs.xip, xi\u0441joc\u04302).\u0458c\u0456\u0440();
    }

    @Override
    public /* synthetic */ xi\u0441joc\u0430 surfaceBright() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        byte[] byArray = new byte[-898651867 + 898651881];
        byArray[0] = -800361133 + 800361056;
        byArray[1] = -1293583376 + 1293583417;
        byArray[2] = -327956249 + 327956363;
        byArray[3] = -1872422851 + 1872422837;
        byArray[4] = -1594486366 + 1594486350;
        byArray[5] = -1675058901 + 1675058951;
        byArray[-1773131212 + 1773131218] = -1127220119 + 1127220182;
        byArray[-2068685117 + 2068685124] = -999819433 + 999819314;
        byArray[-358844096 + 358844104] = 0;
        byArray[-1406306543 + 1406306552] = -114596426 + 114596465;
        byArray[-1792724605 + 1792724615] = -1073889679 + 1073889578;
        byArray[-60530199 + 60530210] = -308354807 + 308354775;
        byArray[-1147913637 + 1147913649] = -1050815355 + 1050815423;
        byArray[-1592178544 + 1592178557] = -1402513000 + 1402513125;
        xi\u0441joc\u0430 xi\u0441joc\u04302 = new ip\u0456hh\u0445().\u0445s\u0456cx\u0441((String)((Object)x\u043e\u0456p.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(280835533 + 165143751), (int)(731292471 + 1160236423)))).x\u0445\u0445a\u0445ch(\u043e\u0441xc\u0458\u04302 -> {
            if (true | false) {
            }
            return \u043e\u0441xc\u0458\u04302.\u04bb\u0440\u0440\u0430eh;
        }).\u0440\u0458\u04bbc(\u043e\u0441xc\u0458\u04302 -> {
            if (true | false) {
            }
            if (\u043e\u0441xc\u0458\u04302.\u043e\u0441\u0456\u0445\u04bb\u043e\u0430 == p\u0455\u0455.\u0440e\u0445e) {
                double d;
                if (\u043e\u0441xc\u0458\u04302.s\u0440\u0458\u0440) {
                    d = 18.0;
                    switch (0) {
                        default: {
                            break;
                        }
                        case 1: {
                            break;
                        }
                        case 2: {
                            break;
                        }
                    }
                } else {
                    d = 98.0;
                }
                return x\u043e\u0456p.a_bsm3("valueOf", valueOf(double ), (double)d);
            }
            return x\u043e\u0456p.a_bsm3("valueOf", valueOf(double ), (double)0.0);
        }).j\u0430i(\u043e\u0441xc\u0458\u04302 -> {
            if (2 * 2 * 2 >= 0) {
            }
            if (\u043e\u0441xc\u0458\u04302.\u043e\u0441\u0456\u0445\u04bb\u043e\u0430 == p\u0455\u0455.\u0440e\u0445e) {
                return x\u043e\u0456p.a_bsm3("valueOf", valueOf(double ), (double)(\u043e\u0441xc\u0458\u04302.s\u0440\u0458\u0440 ? 1.7 : 1.0));
            }
            return x\u043e\u0456p.a_bsm3("valueOf", valueOf(double ), (double)0.0);
        }).x\u0441cc\u0445(true).\u0458c\u0456\u0440();
        return super.surfaceBright().io\u0440().\u0458\u0440\u043ei\u0435(x\u0441cs.xip, xi\u0441joc\u04302).\u0458c\u0456\u0440();
    }

    @Override
    public /* synthetic */ xi\u0441joc\u0430 surfaceContainerLowest() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        byte[] byArray = new byte[-79409458 + 79409482];
        byArray[0] = -1065210600 + 1065210567;
        byArray[1] = -1661842855 + 1661842926;
        byArray[2] = -1586177031 + 1586177009;
        byArray[3] = -928144284 + 928144190;
        byArray[4] = -1157826022 + 1157826054;
        byArray[5] = -543378349 + 543378307;
        byArray[-1982943290 + 1982943296] = -126466651 + 126466688;
        byArray[-1683730966 + 1683730973] = -1493540493 + 1493540514;
        byArray[-343792483 + 343792491] = -1666081199 + 1666081144;
        byArray[-1266454699 + 1266454708] = -1958576619 + 1958576542;
        byArray[-105593282 + 105593292] = -1129093869 + 1129093818;
        byArray[-1706735564 + 1706735575] = -1089740444 + 1089740535;
        byArray[-980527315 + 980527327] = -1964149122 + 1964149197;
        byArray[-77191298 + 77191311] = -1589247317 + 1589247207;
        byArray[-1318117459 + 1318117473] = -13915699 + 13915656;
        byArray[-1999736076 + 1999736091] = -648636323 + 648636443;
        byArray[-980118548 + 980118564] = -607445510 + 607445398;
        byArray[-401019071 + 401019088] = -1696569136 + 1696569215;
        byArray[-1812043872 + 1812043890] = -1474014888 + 1474014872;
        byArray[-276061047 + 276061066] = -1416297308 + 1416297266;
        byArray[-189692679 + 189692699] = -2118694060 + 2118693993;
        byArray[-1888172729 + 1888172750] = -2025998491 + 2025998489;
        byArray[-1407730440 + 1407730462] = -1902184252 + 1902184189;
        byArray[-460497511 + 460497534] = -1514075624 + 1514075535;
        xi\u0441joc\u0430 xi\u0441joc\u04302 = new ip\u0456hh\u0445().\u0445s\u0456cx\u0441((String)((Object)x\u043e\u0456p.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-1728430730 + 1030592752), (int)(-300873367 + 1840992866)))).x\u0445\u0445a\u0445ch(\u043e\u0441xc\u0458\u04302 -> {
            if (true | false) {
            }
            return \u043e\u0441xc\u0458\u04302.\u04bb\u0440\u0440\u0430eh;
        }).\u0440\u0458\u04bbc(\u043e\u0441xc\u0458\u04302 -> {
            if ((3 * 3 + 3) % 2 == 0) {
            }
            if (\u043e\u0441xc\u0458\u04302.\u043e\u0441\u0456\u0445\u04bb\u043e\u0430 == p\u0455\u0455.\u0440e\u0445e) {
                return x\u043e\u0456p.a_bsm3("valueOf", valueOf(double ), (double)(\u043e\u0441xc\u0458\u04302.s\u0440\u0458\u0440 ? 0.0 : 100.0));
            }
            return x\u043e\u0456p.a_bsm3("valueOf", valueOf(double ), (double)0.0);
        }).x\u0441cc\u0445(true).\u0458c\u0456\u0440();
        return super.surfaceContainerLowest().io\u0440().\u0458\u0440\u043ei\u0435(x\u0441cs.xip, xi\u0441joc\u04302).\u0458c\u0456\u0440();
    }

    @Override
    public /* synthetic */ xi\u0441joc\u0430 surfaceContainerLow() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        byte[] byArray = new byte[-1011703090 + 1011703111];
        byArray[0] = -19356982 + 19357000;
        byArray[1] = -631722894 + 631722994;
        byArray[2] = -1175234815 + 1175234851;
        byArray[3] = -1405165075 + 1405165024;
        byArray[4] = -1048296454 + 1048296502;
        byArray[5] = -180385937 + 180385949;
        byArray[-1346991431 + 1346991437] = -1033021884 + 1033022009;
        byArray[-502578043 + 502578050] = -1014348708 + 1014348761;
        byArray[-506644709 + 506644717] = -1979276118 + 1979276107;
        byArray[-2017094081 + 2017094090] = -541660942 + 541660969;
        byArray[-2061409831 + 2061409841] = -373712130 + 373712192;
        byArray[-822207970 + 822207981] = -376654830 + 376654862;
        byArray[-670892224 + 670892236] = -704571011 + 704570962;
        byArray[-282902833 + 282902846] = -1659425395 + 1659425462;
        byArray[-1803393973 + 1803393987] = -502579629 + 502579666;
        byArray[-157944660 + 157944675] = -1071235564 + 1071235539;
        byArray[-736369093 + 736369109] = -1821042890 + 1821043013;
        byArray[-1333133759 + 1333133776] = 5;
        byArray[-89071989 + 89072007] = -2044846822 + 2044846725;
        byArray[-1161418134 + 1161418153] = -942341431 + 942341340;
        byArray[-1811757927 + 1811757947] = -1684692436 + 1684692421;
        xi\u0441joc\u0430 xi\u0441joc\u04302 = new ip\u0456hh\u0445().\u0445s\u0456cx\u0441((String)((Object)x\u043e\u0456p.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-389074772 + 1521685205), (int)(-907911894 + 1741018237)))).x\u0445\u0445a\u0445ch(\u043e\u0441xc\u0458\u04302 -> {
            if ((3 * 3 + 3) % 2 == 0) {
            }
            return \u043e\u0441xc\u0458\u04302.\u04bb\u0440\u0440\u0430eh;
        }).\u0440\u0458\u04bbc(\u043e\u0441xc\u0458\u04302 -> {
            if ((3 * 3 + 3) % 2 == 0) {
            }
            if (\u043e\u0441xc\u0458\u04302.\u043e\u0441\u0456\u0445\u04bb\u043e\u0430 == p\u0455\u0455.\u0440e\u0445e) {
                return x\u043e\u0456p.a_bsm3("valueOf", valueOf(double ), (double)(\u043e\u0441xc\u0458\u04302.s\u0440\u0458\u0440 ? 6.0 : 96.0));
            }
            return x\u043e\u0456p.a_bsm3("valueOf", valueOf(double ), (double)0.0);
        }).j\u0430i(\u043e\u0441xc\u0458\u04302 -> {
            if ((3 * 3 + 3) % 2 == 0) {
            }
            if (\u043e\u0441xc\u0458\u04302.\u043e\u0441\u0456\u0445\u04bb\u043e\u0430 == p\u0455\u0455.\u0440e\u0445e) {
                return x\u043e\u0456p.a_bsm3("valueOf", valueOf(double ), (double)1.25);
            }
            return x\u043e\u0456p.a_bsm3("valueOf", valueOf(double ), (double)0.0);
        }).x\u0441cc\u0445(true).\u0458c\u0456\u0440();
        return super.surfaceContainerLow().io\u0440().\u0458\u0440\u043ei\u0435(x\u0441cs.xip, xi\u0441joc\u04302).\u0458c\u0456\u0440();
    }

    @Override
    public /* synthetic */ xi\u0441joc\u0430 surfaceContainer() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        byte[] byArray = new byte[-680003415 + 680003432];
        byArray[0] = -2004255450 + 2004255365;
        byArray[1] = -336818247 + 336818306;
        byArray[2] = -1957231109 + 1957231123;
        byArray[3] = -1202384422 + 1202384429;
        byArray[4] = -1227043811 + 1227043880;
        byArray[5] = -1284494483 + 1284494578;
        byArray[-727084538 + 727084544] = -1029675275 + 1029675257;
        byArray[-1699753815 + 1699753822] = -926787966 + 926788024;
        byArray[-1282646740 + 1282646748] = -845242585 + 845242571;
        byArray[-1957158843 + 1957158852] = -52377569 + 52377528;
        byArray[-1306308270 + 1306308280] = -494391012 + 494390959;
        byArray[-2135145983 + 2135145994] = -2120409514 + 2120409405;
        byArray[-47750978 + 47750990] = -11197917 + 11198012;
        byArray[-2072341818 + 2072341831] = -338394389 + 338394442;
        byArray[-2014054365 + 2014054379] = -985769554 + 985769527;
        byArray[-1037964263 + 1037964278] = -1356453515 + 1356453390;
        byArray[-997606375 + 997606391] = -991406461 + 991406422;
        xi\u0441joc\u0430 xi\u0441joc\u04302 = new ip\u0456hh\u0445().\u0445s\u0456cx\u0441((String)((Object)x\u043e\u0456p.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(1902364378 + 1611139729), (int)(-1434027901 + 712137845)))).x\u0445\u0445a\u0445ch(\u043e\u0441xc\u0458\u04302 -> {
            if (2 * 2 * 2 >= 0) {
            }
            return \u043e\u0441xc\u0458\u04302.\u04bb\u0440\u0440\u0430eh;
        }).\u0440\u0458\u04bbc(\u043e\u0441xc\u0458\u04302 -> {
            if ((3 * 3 + 3) % 2 == 0) {
            }
            if (\u043e\u0441xc\u0458\u04302.\u043e\u0441\u0456\u0445\u04bb\u043e\u0430 == p\u0455\u0455.\u0440e\u0445e) {
                return x\u043e\u0456p.a_bsm3("valueOf", valueOf(double ), (double)(\u043e\u0441xc\u0458\u04302.s\u0440\u0458\u0440 ? 9.0 : 94.0));
            }
            return x\u043e\u0456p.a_bsm3("valueOf", valueOf(double ), (double)0.0);
        }).j\u0430i(\u043e\u0441xc\u0458\u04302 -> {
            if ((3 * 3 + 3) % 2 == 0) {
            }
            if (\u043e\u0441xc\u0458\u04302.\u043e\u0441\u0456\u0445\u04bb\u043e\u0430 == p\u0455\u0455.\u0440e\u0445e) {
                return x\u043e\u0456p.a_bsm3("valueOf", valueOf(double ), (double)1.4);
            }
            return x\u043e\u0456p.a_bsm3("valueOf", valueOf(double ), (double)0.0);
        }).x\u0441cc\u0445(true).\u0458c\u0456\u0440();
        return super.surfaceContainer().io\u0440().\u0458\u0440\u043ei\u0435(x\u0441cs.xip, xi\u0441joc\u04302).\u0458c\u0456\u0440();
    }

    @Override
    public /* synthetic */ xi\u0441joc\u0430 surfaceContainerHigh() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        byte[] byArray = new byte[-354782868 + 354782890];
        byArray[0] = -1926868942 + 1926869055;
        byArray[1] = -45165045 + 45164924;
        byArray[2] = -2088102310 + 2088102414;
        byArray[3] = -65004394 + 65004446;
        byArray[4] = -806292472 + 806292366;
        byArray[5] = -291655904 + 291655827;
        byArray[-1040956320 + 1040956326] = -1498547909 + 1498547795;
        byArray[-1987708932 + 1987708939] = -1722805549 + 1722805658;
        byArray[-1710427161 + 1710427169] = -2139377871 + 2139377862;
        byArray[-118813851 + 118813860] = -2071433061 + 2071433042;
        byArray[-372854437 + 372854447] = -1350867900 + 1350868008;
        byArray[-1564974639 + 1564974650] = -1272707707 + 1272707613;
        byArray[-1306267340 + 1306267352] = -415763554 + 415763458;
        byArray[-1315133707 + 1315133720] = -940625199 + 940625136;
        byArray[-13080444 + 13080458] = -1105406328 + 1105406322;
        byArray[-2136729601 + 2136729616] = -1538147266 + 1538147175;
        byArray[-192200881 + 192200897] = -1480142970 + 1480142995;
        byArray[-575240995 + 575241012] = -677234432 + 677234418;
        byArray[-1324199359 + 1324199377] = -1412403701 + 1412403707;
        byArray[-126459931 + 126459950] = -1741234574 + 1741234477;
        byArray[-1785980479 + 1785980499] = -1140902436 + 1140902493;
        byArray[-530095656 + 530095677] = -1681998142 + 1681998158;
        xi\u0441joc\u0430 xi\u0441joc\u04302 = new ip\u0456hh\u0445().\u0445s\u0456cx\u0441((String)((Object)x\u043e\u0456p.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(2097146451 + 1090442154), (int)(1473819682 + 781832783)))).x\u0445\u0445a\u0445ch(\u043e\u0441xc\u0458\u04302 -> {
            if (2 * 2 * 2 >= 0) {
            }
            return \u043e\u0441xc\u0458\u04302.\u04bb\u0440\u0440\u0430eh;
        }).\u0440\u0458\u04bbc(\u043e\u0441xc\u0458\u04302 -> {
            if (true | false) {
            }
            if (\u043e\u0441xc\u0458\u04302.\u043e\u0441\u0456\u0445\u04bb\u043e\u0430 == p\u0455\u0455.\u0440e\u0445e) {
                return x\u043e\u0456p.a_bsm3("valueOf", valueOf(double ), (double)(\u043e\u0441xc\u0458\u04302.s\u0440\u0458\u0440 ? 12.0 : 92.0));
            }
            return x\u043e\u0456p.a_bsm3("valueOf", valueOf(double ), (double)0.0);
        }).j\u0430i(\u043e\u0441xc\u0458\u04302 -> {
            if (true | false) {
            }
            if (\u043e\u0441xc\u0458\u04302.\u043e\u0441\u0456\u0445\u04bb\u043e\u0430 == p\u0455\u0455.\u0440e\u0445e) {
                return x\u043e\u0456p.a_bsm3("valueOf", valueOf(double ), (double)1.5);
            }
            return x\u043e\u0456p.a_bsm3("valueOf", valueOf(double ), (double)0.0);
        }).x\u0441cc\u0445(true).\u0458c\u0456\u0440();
        return super.surfaceContainerHigh().io\u0440().\u0458\u0440\u043ei\u0435(x\u0441cs.xip, xi\u0441joc\u04302).\u0458c\u0456\u0440();
    }

    @Override
    public /* synthetic */ xi\u0441joc\u0430 surfaceContainerHighest() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        byte[] byArray = new byte[-595899549 + 595899574];
        byArray[0] = -472225765 + 472225738;
        byArray[1] = -478973054 + 478972939;
        byArray[2] = -1672095727 + 1672095841;
        byArray[3] = -1560837782 + 1560837655;
        byArray[4] = -1715080040 + 1715080094;
        byArray[5] = -2070947630 + 2070947682;
        byArray[-282743176 + 282743182] = -363137724 + 363137813;
        byArray[-52209175 + 52209182] = -1647259771 + 1647259781;
        byArray[-541796617 + 541796625] = -1026520618 + 1026520615;
        byArray[-1982437712 + 1982437721] = -413066271 + 413066350;
        byArray[-438799561 + 438799571] = -1028808453 + 1028808524;
        byArray[-1037877000 + 1037877011] = -2146145907 + 2146145840;
        byArray[-1539259502 + 1539259514] = -1840859185 + 1840859244;
        byArray[-1704983156 + 1704983169] = -1992124129 + 1992124195;
        byArray[-1656631977 + 1656631991] = -1360139856 + 1360139742;
        byArray[-213629841 + 213629856] = -110825644 + 110825529;
        byArray[-347343131 + 347343147] = -892261604 + 892261635;
        byArray[-109452833 + 109452850] = -1212591753 + 1212591727;
        byArray[-794652901 + 794652919] = -1339165459 + 1339165455;
        byArray[-49987139 + 49987158] = -526230575 + 526230624;
        byArray[-1593338314 + 1593338334] = -819064307 + 819064296;
        byArray[-959249581 + 959249602] = -667140873 + 667140851;
        byArray[-2072805891 + 2072805913] = -1029900573 + 1029900582;
        byArray[-1344801929 + 1344801952] = -2054359810 + 2054359861;
        byArray[-1192954016 + 1192954040] = -1570828681 + 1570828603;
        xi\u0441joc\u0430 xi\u0441joc\u04302 = new ip\u0456hh\u0445().\u0445s\u0456cx\u0441((String)((Object)x\u043e\u0456p.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(1886838239 + 845923587), (int)(-1824563638 + 1179417409)))).x\u0445\u0445a\u0445ch(\u043e\u0441xc\u0458\u04302 -> {
            if ((3 * 3 + 3) % 2 == 0) {
            }
            return \u043e\u0441xc\u0458\u04302.\u04bb\u0440\u0440\u0430eh;
        }).\u0440\u0458\u04bbc(\u043e\u0441xc\u0458\u04302 -> {
            if (true | false) {
            }
            if (\u043e\u0441xc\u0458\u04302.\u043e\u0441\u0456\u0445\u04bb\u043e\u0430 == p\u0455\u0455.\u0440e\u0445e) {
                return x\u043e\u0456p.a_bsm3("valueOf", valueOf(double ), (double)(\u043e\u0441xc\u0458\u04302.s\u0440\u0458\u0440 ? 15.0 : 90.0));
            }
            return x\u043e\u0456p.a_bsm3("valueOf", valueOf(double ), (double)0.0);
        }).j\u0430i(\u043e\u0441xc\u0458\u04302 -> {
            if (2 * 2 * 2 >= 0) {
            }
            if (\u043e\u0441xc\u0458\u04302.\u043e\u0441\u0456\u0445\u04bb\u043e\u0430 == p\u0455\u0455.\u0440e\u0445e) {
                return x\u043e\u0456p.a_bsm3("valueOf", valueOf(double ), (double)1.7);
            }
            return x\u043e\u0456p.a_bsm3("valueOf", valueOf(double ), (double)0.0);
        }).x\u0441cc\u0445(true).\u0458c\u0456\u0440();
        return super.surfaceContainerHighest().io\u0440().\u0458\u0440\u043ei\u0435(x\u0441cs.xip, xi\u0441joc\u04302).\u0458c\u0456\u0440();
    }

    @Override
    public /* synthetic */ xi\u0441joc\u0430 onSurface() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        byte[] byArray = new byte[-1232976525 + 1232976535];
        byArray[0] = -1622512549 + 1622512505;
        byArray[1] = -1623174857 + 1623174948;
        byArray[2] = -935187139 + 935187071;
        byArray[3] = -1143061211 + 1143061332;
        byArray[4] = -503472203 + 503472238;
        byArray[5] = -381790904 + 381790898;
        byArray[-869443684 + 869443690] = -814377702 + 814377774;
        byArray[-638621064 + 638621071] = -1210493334 + 1210493418;
        byArray[-460980072 + 460980080] = -621882939 + 621882818;
        byArray[-802765527 + 802765536] = -2146525586 + 2146525482;
        xi\u0441joc\u0430 xi\u0441joc\u04302 = new ip\u0456hh\u0445().\u0445s\u0456cx\u0441((String)((Object)x\u043e\u0456p.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(750784290 + 90055419), (int)(-384585144 + 843081995)))).x\u0445\u0445a\u0445ch(\u043e\u0441xc\u0458\u04302 -> {
            if (2 * 2 * 2 >= 0) {
            }
            return \u043e\u0441xc\u0458\u04302.\u04bb\u0440\u0440\u0430eh;
        }).j\u0430i(\u043e\u0441xc\u0458\u04302 -> {
            if ((3 * 3 + 3) % 2 == 0) {
            }
            if (\u043e\u0441xc\u0458\u04302.\u043e\u0441\u0456\u0445\u04bb\u043e\u0430 == p\u0455\u0455.\u0440e\u0445e) {
                return x\u043e\u0456p.a_bsm3("valueOf", valueOf(double ), (double)1.7);
            }
            return x\u043e\u0456p.a_bsm3("valueOf", valueOf(double ), (double)0.0);
        }).s\u0430paih(\u043e\u0441xc\u0458\u04302 -> {
            if ((3 * 3 + 3) % 2 == 0) {
            }
            return this.highestSurface((\u043e\u0441xc\u0458\u0430)\u043e\u0441xc\u0458\u04302);
        }).iea\u0430p\u0441\u0445(\u043e\u0441xc\u0458\u04302 -> {
            if ((3 * 3 + 3) % 2 == 0) {
            }
            return \u043e\u0441xc\u0458\u04302.s\u0440\u0458\u0440 ? x\u043e\u0456p.hsj\u04bbo\u0441(11.0) : x\u043e\u0456p.hsj\u04bbo\u0441(9.0);
        }).\u0458c\u0456\u0440();
        return super.onSurface().io\u0440().\u0458\u0440\u043ei\u0435(x\u0441cs.xip, xi\u0441joc\u04302).\u0458c\u0456\u0440();
    }

    @Override
    public /* synthetic */ xi\u0441joc\u0430 onSurfaceVariant() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        byte[] byArray = new byte[-1092670985 + 1092671003];
        byArray[0] = -242174255 + 242174130;
        byArray[1] = -89063815 + 89063870;
        byArray[2] = -868712703 + 868712771;
        byArray[3] = -1469326714 + 1469326820;
        byArray[4] = -1338952574 + 1338952517;
        byArray[5] = -1021311821 + 1021311918;
        byArray[-1321105784 + 1321105790] = -381432553 + 381432586;
        byArray[-53957992 + 53957999] = -1180010469 + 1180010416;
        byArray[-1672927256 + 1672927264] = -898962169 + 898962251;
        byArray[-1197055303 + 1197055312] = -1022805759 + 1022805809;
        byArray[-1635929779 + 1635929789] = -1135637059 + 1135637013;
        byArray[-1935082722 + 1935082733] = -2030701794 + 2030701896;
        byArray[-1169945466 + 1169945478] = -1072171225 + 1072171332;
        byArray[-672485561 + 672485574] = -142604800 + 142604873;
        byArray[-1056975461 + 1056975475] = -1147118617 + 1147118601;
        byArray[-585221 + 585236] = -1285783230 + 1285783159;
        byArray[-1264695035 + 1264695051] = -1049701906 + 1049701862;
        byArray[-1403724432 + 1403724449] = -2019693940 + 2019694038;
        xi\u0441joc\u0430 xi\u0441joc\u04302 = new ip\u0456hh\u0445().\u0445s\u0456cx\u0441((String)((Object)x\u043e\u0456p.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-552525121 + 612491475), (int)(-594702149 + 604205013)))).x\u0445\u0445a\u0445ch(\u043e\u0441xc\u0458\u04302 -> {
            if (true | false) {
            }
            return \u043e\u0441xc\u0458\u04302.\u04bb\u0440\u0440\u0430eh;
        }).j\u0430i(\u043e\u0441xc\u0458\u04302 -> {
            if (2 * 2 * 2 >= 0) {
            }
            if (\u043e\u0441xc\u0458\u04302.\u043e\u0441\u0456\u0445\u04bb\u043e\u0430 == p\u0455\u0455.\u0440e\u0445e) {
                return x\u043e\u0456p.a_bsm3("valueOf", valueOf(double ), (double)1.7);
            }
            return x\u043e\u0456p.a_bsm3("valueOf", valueOf(double ), (double)0.0);
        }).s\u0430paih(\u043e\u0441xc\u0458\u04302 -> {
            if (2 * 2 * 2 >= 0) {
            }
            return this.highestSurface((\u043e\u0441xc\u0458\u0430)\u043e\u0441xc\u0458\u04302);
        }).iea\u0430p\u0441\u0445(\u043e\u0441xc\u0458\u04302 -> {
            if ((3 * 3 + 3) % 2 == 0) {
            }
            return \u043e\u0441xc\u0458\u04302.s\u0440\u0458\u0440 ? x\u043e\u0456p.hsj\u04bbo\u0441(6.0) : x\u043e\u0456p.hsj\u04bbo\u0441(4.5);
        }).\u0458c\u0456\u0440();
        return super.onSurfaceVariant().io\u0440().\u0458\u0440\u043ei\u0435(x\u0441cs.xip, xi\u0441joc\u04302).\u0458c\u0456\u0440();
    }

    @Override
    public /* synthetic */ xi\u0441joc\u0430 outline() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        byte[] byArray = new byte[-1848827210 + 1848827217];
        byArray[0] = -1204003107 + 1204003202;
        byArray[1] = -1430185537 + 1430185498;
        byArray[2] = -229700312 + 229700249;
        byArray[3] = -1716458307 + 1716458319;
        byArray[4] = 3;
        byArray[5] = -1390134710 + 1390134606;
        byArray[-2037114325 + 2037114331] = -1089490501 + 1089490386;
        xi\u0441joc\u0430 xi\u0441joc\u04302 = new ip\u0456hh\u0445().\u0445s\u0456cx\u0441((String)((Object)x\u043e\u0456p.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(2115714527 + 644048543), (int)(-529360219 + 739144155)))).x\u0445\u0445a\u0445ch(\u043e\u0441xc\u0458\u04302 -> {
            if (true | false) {
            }
            return \u043e\u0441xc\u0458\u04302.\u04bb\u0440\u0440\u0430eh;
        }).j\u0430i(\u043e\u0441xc\u0458\u04302 -> {
            if (2 * 2 * 2 >= 0) {
            }
            if (\u043e\u0441xc\u0458\u04302.\u043e\u0441\u0456\u0445\u04bb\u043e\u0430 == p\u0455\u0455.\u0440e\u0445e) {
                return x\u043e\u0456p.a_bsm3("valueOf", valueOf(double ), (double)1.7);
            }
            return x\u043e\u0456p.a_bsm3("valueOf", valueOf(double ), (double)0.0);
        }).s\u0430paih(\u043e\u0441xc\u0458\u04302 -> {
            if (2 * 2 * 2 >= 0) {
            }
            return this.highestSurface((\u043e\u0441xc\u0458\u0430)\u043e\u0441xc\u0458\u04302);
        }).iea\u0430p\u0441\u0445(\u043e\u0441xc\u0458\u04302 -> {
            if ((3 * 3 + 3) % 2 == 0) {
            }
            return x\u043e\u0456p.hsj\u04bbo\u0441(3.0);
        }).\u0458c\u0456\u0440();
        return super.outline().io\u0440().\u0458\u0440\u043ei\u0435(x\u0441cs.xip, xi\u0441joc\u04302).\u0458c\u0456\u0440();
    }

    @Override
    public /* synthetic */ xi\u0441joc\u0430 outlineVariant() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        byte[] byArray = new byte[-1179137067 + 1179137082];
        byArray[0] = -95799675 + 95799636;
        byArray[1] = -1279411089 + 1279411105;
        byArray[2] = -1130911248 + 1130911153;
        byArray[3] = -1404371715 + 1404371620;
        byArray[4] = -145567958 + 145567905;
        byArray[5] = -1235165405 + 1235165350;
        byArray[-772206341 + 772206347] = -1498738211 + 1498738187;
        byArray[-1955382839 + 1955382846] = -1712621239 + 1712621287;
        byArray[-1776387897 + 1776387905] = -507783300 + 507783375;
        byArray[-151503777 + 151503786] = -316385120 + 316385191;
        byArray[-1803248956 + 1803248966] = -182668006 + 182668122;
        byArray[-481521001 + 481521012] = -1954804723 + 1954804626;
        byArray[-14218663 + 14218675] = -1033434706 + 1033434789;
        byArray[-2001866885 + 2001866898] = -1333253612 + 1333253643;
        byArray[-300365991 + 300366005] = -592698523 + 592698579;
        xi\u0441joc\u0430 xi\u0441joc\u04302 = new ip\u0456hh\u0445().\u0445s\u0456cx\u0441((String)((Object)x\u043e\u0456p.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(461629035 + 105528162), (int)(1950363397 + 1315476386)))).x\u0445\u0445a\u0445ch(\u043e\u0441xc\u0458\u04302 -> {
            if (true | false) {
            }
            return \u043e\u0441xc\u0458\u04302.\u04bb\u0440\u0440\u0430eh;
        }).j\u0430i(\u043e\u0441xc\u0458\u04302 -> {
            if (2 * 2 * 2 >= 0) {
            }
            if (\u043e\u0441xc\u0458\u04302.\u043e\u0441\u0456\u0445\u04bb\u043e\u0430 == p\u0455\u0455.\u0440e\u0445e) {
                return x\u043e\u0456p.a_bsm3("valueOf", valueOf(double ), (double)1.7);
            }
            return x\u043e\u0456p.a_bsm3("valueOf", valueOf(double ), (double)0.0);
        }).s\u0430paih(\u043e\u0441xc\u0458\u04302 -> {
            if (true | false) {
            }
            return this.highestSurface((\u043e\u0441xc\u0458\u0430)\u043e\u0441xc\u0458\u04302);
        }).iea\u0430p\u0441\u0445(\u043e\u0441xc\u0458\u04302 -> {
            if (true | false) {
            }
            return x\u043e\u0456p.hsj\u04bbo\u0441(1.5);
        }).\u0458c\u0456\u0440();
        return super.outlineVariant().io\u0440().\u0458\u0440\u043ei\u0435(x\u0441cs.xip, xi\u0441joc\u04302).\u0458c\u0456\u0440();
    }

    @Override
    public /* synthetic */ xi\u0441joc\u0430 inverseSurface() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        byte[] byArray = new byte[-39460792 + 39460807];
        byArray[0] = -2054070159 + 2054070172;
        byArray[1] = -623945410 + 623945491;
        byArray[2] = -279722256 + 279722142;
        byArray[3] = -201151673 + 201151633;
        byArray[4] = -34591305 + 34591321;
        byArray[5] = -819191172 + 819191218;
        byArray[-789188708 + 789188714] = -641074585 + 641074671;
        byArray[-748472744 + 748472751] = -1190295066 + 1190294947;
        byArray[-546711300 + 546711308] = -1545422431 + 1545422514;
        byArray[-1872356662 + 1872356671] = -727588618 + 727588614;
        byArray[-788902467 + 788902477] = -907034842 + 907034928;
        byArray[-624409759 + 624409770] = -1674401886 + 1674401896;
        byArray[-1308422353 + 1308422365] = -675362693 + 675362663;
        byArray[-25606655 + 25606668] = -806735987 + 806736061;
        byArray[-1728203350 + 1728203364] = -222110551 + 222110524;
        xi\u0441joc\u0430 xi\u0441joc\u04302 = new ip\u0456hh\u0445().\u0445s\u0456cx\u0441((String)((Object)x\u043e\u0456p.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-1006934510 + 1143972376), (int)(226188045 + 66958955)))).x\u0445\u0445a\u0445ch(\u043e\u0441xc\u0458\u04302 -> {
            if (2 * 2 * 2 >= 0) {
            }
            return \u043e\u0441xc\u0458\u04302.\u04bb\u0440\u0440\u0430eh;
        }).\u0440\u0458\u04bbc(\u043e\u0441xc\u0458\u04302 -> {
            if (true | false) {
            }
            return x\u043e\u0456p.a_bsm3("valueOf", valueOf(double ), (double)(\u043e\u0441xc\u0458\u04302.s\u0440\u0458\u0440 ? 98.0 : 4.0));
        }).j\u0430i(\u043e\u0441xc\u0458\u04302 -> {
            if ((3 * 3 + 3) % 2 == 0) {
            }
            if (\u043e\u0441xc\u0458\u04302.\u043e\u0441\u0456\u0445\u04bb\u043e\u0430 == p\u0455\u0455.\u0440e\u0445e) {
                return x\u043e\u0456p.a_bsm3("valueOf", valueOf(double ), (double)1.7);
            }
            return x\u043e\u0456p.a_bsm3("valueOf", valueOf(double ), (double)0.0);
        }).x\u0441cc\u0445(true).\u0458c\u0456\u0440();
        return super.inverseSurface().io\u0440().\u0458\u0440\u043ei\u0435(x\u0441cs.xip, xi\u0441joc\u04302).\u0458c\u0456\u0440();
    }

    @Override
    public /* synthetic */ xi\u0441joc\u0430 inverseOnSurface() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        byte[] byArray = new byte[-31482512 + 31482530];
        byArray[0] = -407311711 + 407311683;
        byArray[1] = -2084505175 + 2084505071;
        byArray[2] = 5;
        byArray[3] = -1258892271 + 1258892342;
        byArray[4] = 2;
        byArray[5] = -905801107 + 905801232;
        byArray[-1403367387 + 1403367393] = -620813957 + 620814033;
        byArray[-1314971074 + 1314971081] = -34339621 + 34339691;
        byArray[-1274000170 + 1274000178] = -271893621 + 271893722;
        byArray[-2104561725 + 2104561734] = -853990703 + 853990669;
        byArray[-2031267561 + 2031267571] = -1489980374 + 1489980452;
        byArray[-946136811 + 946136822] = -1943182540 + 1943182556;
        byArray[-1507114559 + 1507114571] = -1331219103 + 1331219076;
        byArray[-801559464 + 801559477] = -2133554351 + 2133554414;
        byArray[-748744890 + 748744904] = -1639884218 + 1639884279;
        byArray[-1378969966 + 1378969981] = -1930358864 + 1930358857;
        byArray[-1359415521 + 1359415537] = -636344487 + 636344380;
        byArray[-149327228 + 149327245] = -849319449 + 849319363;
        xi\u0441joc\u0430 xi\u0441joc\u04302 = new ip\u0456hh\u0445().\u0445s\u0456cx\u0441((String)((Object)x\u043e\u0456p.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(78297997 + 23743111), (int)(-2108290853 + 1610668411)))).x\u0445\u0445a\u0445ch(\u043e\u0441xc\u0458\u04302 -> {
            if ((3 * 3 + 3) % 2 == 0) {
            }
            return \u043e\u0441xc\u0458\u04302.\u04bb\u0440\u0440\u0430eh;
        }).s\u0430paih(\u043e\u0441xc\u0458\u04302 -> {
            if (2 * 2 * 2 >= 0) {
            }
            return this.inverseSurface();
        }).iea\u0430p\u0441\u0445(\u043e\u0441xc\u0458\u04302 -> {
            if (2 * 2 * 2 >= 0) {
            }
            return x\u043e\u0456p.hsj\u04bbo\u0441(7.0);
        }).\u0458c\u0456\u0440();
        return super.inverseOnSurface().io\u0440().\u0458\u0440\u043ei\u0435(x\u0441cs.xip, xi\u0441joc\u04302).\u0458c\u0456\u0440();
    }

    @Override
    public /* synthetic */ xi\u0441joc\u0430 primary() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        byte[] byArray = new byte[-1753511346 + 1753511353];
        byArray[0] = -14821054 + 14821149;
        byArray[1] = -235511128 + 235511144;
        byArray[2] = -567601055 + 567601109;
        byArray[3] = -1879431467 + 1879431584;
        byArray[4] = -1000458593 + 1000458712;
        byArray[5] = -882918469 + 882918488;
        byArray[-404816124 + 404816130] = -2076251403 + 2076251411;
        xi\u0441joc\u0430 xi\u0441joc\u04302 = new ip\u0456hh\u0445().\u0445s\u0456cx\u0441((String)((Object)x\u043e\u0456p.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(1180005320 + 890374046), (int)(-2015379749 + 391241813)))).x\u0445\u0445a\u0445ch(\u043e\u0441xc\u0458\u04302 -> {
            if ((3 * 3 + 3) % 2 == 0) {
            }
            return \u043e\u0441xc\u0458\u04302.\u0435ei\u043ei;
        }).\u0440\u0458\u04bbc(\u043e\u0441xc\u0458\u04302 -> {
            if (2 * 2 * 2 >= 0) {
            }
            return x\u043e\u0456p.a_bsm3("valueOf", valueOf(double ), (double)(\u043e\u0441xc\u0458\u04302.ies\u0445\u04bbp\u0430.\u04bbeis\u0430() <= 12.0 ? (\u043e\u0441xc\u0458\u04302.s\u0440\u0458\u0440 ? 80.0 : 40.0) : \u043e\u0441xc\u0458\u04302.ies\u0445\u04bbp\u0430.ex\u0430i\u0440()));
        }).x\u0441cc\u0445(true).s\u0430paih(\u043e\u0441xc\u0458\u04302 -> {
            if (true | false) {
            }
            return this.highestSurface((\u043e\u0441xc\u0458\u0430)\u043e\u0441xc\u0458\u04302);
        }).iea\u0430p\u0441\u0445(\u043e\u0441xc\u0458\u04302 -> {
            if ((3 * 3 + 3) % 2 == 0) {
            }
            return x\u043e\u0456p.hsj\u04bbo\u0441(4.5);
        }).po\u0441ei(\u043e\u0441xc\u0458\u04302 -> {
            if (true | false) {
            }
            return \u043e\u0441xc\u0458\u04302.j\u0456\u0455 == j\u0445ep.\u04bbce\u0430\u0458 ? new \u0435\u0440\u0430(this.primaryContainer(), this.primary(), 5.0, c\u04bb\u0455o\u0445po.iho, ec\u0440\u0455.\u0435ph\u0440a\u0445) : null;
        }).\u0458c\u0456\u0440();
        return super.primary().io\u0440().\u0458\u0440\u043ei\u0435(x\u0441cs.xip, xi\u0441joc\u04302).\u0458c\u0456\u0440();
    }

    @Override
    public /* synthetic */ xi\u0441joc\u0430 primaryDim() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        byte[] byArray = new byte[-1012440608 + 1012440619];
        byArray[0] = -901300094 + 901299969;
        byArray[1] = -2146557351 + 2146557313;
        byArray[2] = -1040181208 + 1040181201;
        byArray[3] = -1370682905 + 1370682977;
        byArray[4] = -34753264 + 34753318;
        byArray[5] = -2012082364 + 2012082456;
        byArray[-541380382 + 541380388] = 0;
        byArray[-259505305 + 259505312] = -1008099235 + 1008099259;
        byArray[-1142508113 + 1142508121] = -1099820569 + 1099820482;
        byArray[-1943495529 + 1943495538] = -1534411690 + 1534411810;
        byArray[-1329401783 + 1329401793] = -208932918 + 208932941;
        xi\u0441joc\u0430 xi\u0441joc\u04302 = this.primary().io\u0440().\u0445s\u0456cx\u0441((String)((Object)x\u043e\u0456p.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(765325858 + 546462733), (int)(-1631985824 + 1200686826)))).\u0458c\u0456\u0440();
        return super.primaryDim().io\u0440().\u0458\u0440\u043ei\u0435(x\u0441cs.xip, xi\u0441joc\u04302).\u0458c\u0456\u0440();
    }

    @Override
    public /* synthetic */ xi\u0441joc\u0430 onPrimary() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        byte[] byArray = new byte[-2051811372 + 2051811382];
        byArray[0] = -1710112312 + 1710112245;
        byArray[1] = -13664525 + 13664401;
        byArray[2] = -49616614 + 49616731;
        byArray[3] = -1523958856 + 1523958895;
        byArray[4] = -638205844 + 638205887;
        byArray[5] = -509014944 + 509014963;
        byArray[-695653092 + 695653098] = -2045501080 + 2045500982;
        byArray[-533182814 + 533182821] = -1941568197 + 1941568127;
        byArray[-1763047825 + 1763047833] = -1707975978 + 1707976009;
        byArray[-795960059 + 795960068] = -1427003865 + 1427003874;
        xi\u0441joc\u0430 xi\u0441joc\u04302 = new ip\u0456hh\u0445().\u0445s\u0456cx\u0441((String)((Object)x\u043e\u0456p.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-1552150457 + 1356260363), (int)(1696714531 + 766231466)))).x\u0445\u0445a\u0445ch(\u043e\u0441xc\u0458\u04302 -> {
            if (true | false) {
            }
            return \u043e\u0441xc\u0458\u04302.\u0435ei\u043ei;
        }).s\u0430paih(\u043e\u0441xc\u0458\u04302 -> {
            if (2 * 2 * 2 >= 0) {
            }
            return this.primary();
        }).iea\u0430p\u0441\u0445(\u043e\u0441xc\u0458\u04302 -> {
            if (2 * 2 * 2 >= 0) {
            }
            return x\u043e\u0456p.hsj\u04bbo\u0441(6.0);
        }).\u0458c\u0456\u0440();
        return super.onPrimary().io\u0440().\u0458\u0440\u043ei\u0435(x\u0441cs.xip, xi\u0441joc\u04302).\u0458c\u0456\u0440();
    }

    @Override
    public /* synthetic */ xi\u0441joc\u0430 primaryContainer() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        byte[] byArray = new byte[-1694133799 + 1694133816];
        byArray[0] = -1097136627 + 1097136523;
        byArray[1] = -154874949 + 154874827;
        byArray[2] = 0;
        byArray[3] = -364856776 + 364856852;
        byArray[4] = -1710640353 + 1710640326;
        byArray[5] = -1305400416 + 1305400384;
        byArray[-1571057193 + 1571057199] = -531833171 + 531833186;
        byArray[-951753921 + 951753928] = -1302259268 + 1302259194;
        byArray[-1462275290 + 1462275298] = -1965662881 + 1965662987;
        byArray[-1740264848 + 1740264857] = -620624882 + 620624958;
        byArray[-1521042751 + 1521042761] = -478673355 + 478673422;
        byArray[-553487138 + 553487149] = -2082081545 + 2082081518;
        byArray[-1352338739 + 1352338751] = -1445711676 + 1445711584;
        byArray[-879618437 + 879618450] = -1418038965 + 1418038951;
        byArray[-670488412 + 670488426] = -1143086663 + 1143086683;
        byArray[-18359946 + 18359961] = -394558252 + 394558139;
        byArray[-960627353 + 960627369] = -1321245093 + 1321244998;
        xi\u0441joc\u0430 xi\u0441joc\u04302 = new ip\u0456hh\u0445().\u0445s\u0456cx\u0441((String)((Object)x\u043e\u0456p.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(2080777727 + 1434954638), (int)(-2010255913 + 846187718)))).x\u0445\u0445a\u0445ch(\u043e\u0441xc\u0458\u04302 -> {
            if (2 * 2 * 2 >= 0) {
            }
            return \u043e\u0441xc\u0458\u04302.\u0435ei\u043ei;
        }).\u0440\u0458\u04bbc(\u043e\u0441xc\u0458\u04302 -> {
            if (true | false) {
            }
            if (!\u043e\u0441xc\u0458\u04302.s\u0440\u0458\u0440 && \u043e\u0441xc\u0458\u04302.ies\u0445\u04bbp\u0430.\u04bbeis\u0430() <= 12.0) {
                return x\u043e\u0456p.a_bsm3("valueOf", valueOf(double ), (double)90.0);
            }
            return x\u043e\u0456p.a_bsm3("valueOf", valueOf(double ), (double)(\u043e\u0441xc\u0458\u04302.ies\u0445\u04bbp\u0430.ex\u0430i\u0440() > 55.0 ? x\u043e\u0456p.a_bsm1("\u0430\u0456\u0455", \u0430\u0456\u0455(double double double ), (double)61.0, (double)90.0, (double)\u043e\u0441xc\u0458\u04302.ies\u0445\u04bbp\u0430.ex\u0430i\u0440()) : x\u043e\u0456p.a_bsm1("\u0430\u0456\u0455", \u0430\u0456\u0455(double double double ), (double)30.0, (double)49.0, (double)\u043e\u0441xc\u0458\u04302.ies\u0445\u04bbp\u0430.ex\u0430i\u0440())));
        }).x\u0441cc\u0445(true).s\u0430paih(\u043e\u0441xc\u0458\u04302 -> {
            if (true | false) {
            }
            return this.highestSurface((\u043e\u0441xc\u0458\u0430)\u043e\u0441xc\u0458\u04302);
        }).iea\u0430p\u0441\u0445(\u043e\u0441xc\u0458\u04302 -> {
            if ((3 * 3 + 3) % 2 == 0) {
            }
            return \u043e\u0441xc\u0458\u04302.i\u0430xp\u0458 > 0.0 ? x\u043e\u0456p.hsj\u04bbo\u0441(1.5) : null;
        }).\u0458c\u0456\u0440();
        return super.primaryContainer().io\u0440().\u0458\u0440\u043ei\u0435(x\u0441cs.xip, xi\u0441joc\u04302).\u0458c\u0456\u0440();
    }

    @Override
    public /* synthetic */ xi\u0441joc\u0430 onPrimaryContainer() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        byte[] byArray = new byte[-1264259908 + 1264259928];
        byArray[0] = 1;
        byArray[1] = -642651396 + 642651327;
        byArray[2] = -1661078591 + 1661078583;
        byArray[3] = -2010389039 + 2010389160;
        byArray[4] = -1218805372 + 1218805471;
        byArray[5] = -486045136 + 486045180;
        byArray[-995081922 + 995081928] = 1;
        byArray[-198111769 + 198111776] = -1168352393 + 1168352342;
        byArray[-545814524 + 545814532] = -525376954 + 525376905;
        byArray[-1335641120 + 1335641129] = -1023556132 + 1023556243;
        byArray[-1759599446 + 1759599456] = -108841890 + 108841841;
        byArray[-882159532 + 882159543] = -839908235 + 839908281;
        byArray[-398830778 + 398830790] = -166510263 + 166510320;
        byArray[-633123079 + 633123092] = -772577704 + 772577755;
        byArray[-77003261 + 77003275] = -67759267 + 67759201;
        byArray[-1010278485 + 1010278500] = -956767113 + 956767160;
        byArray[-959552694 + 959552710] = -69363217 + 69363100;
        byArray[-1293405890 + 1293405907] = -73794527 + 73794468;
        byArray[-892097649 + 892097667] = -243638381 + 243638441;
        byArray[-406522954 + 406522973] = -20431432 + 20431496;
        xi\u0441joc\u0430 xi\u0441joc\u04302 = new ip\u0456hh\u0445().\u0445s\u0456cx\u0441((String)((Object)x\u043e\u0456p.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-1191631460 + 2001013409), (int)(-57952834 + 1891743631)))).x\u0445\u0445a\u0445ch(\u043e\u0441xc\u0458\u04302 -> {
            if (2 * 2 * 2 >= 0) {
            }
            return \u043e\u0441xc\u0458\u04302.\u0435ei\u043ei;
        }).s\u0430paih(\u043e\u0441xc\u0458\u04302 -> {
            if (true | false) {
            }
            return this.primaryContainer();
        }).iea\u0430p\u0441\u0445(\u043e\u0441xc\u0458\u04302 -> {
            if ((3 * 3 + 3) % 2 == 0) {
            }
            return x\u043e\u0456p.hsj\u04bbo\u0441(6.0);
        }).\u0458c\u0456\u0440();
        return super.onPrimaryContainer().io\u0440().\u0458\u0440\u043ei\u0435(x\u0441cs.xip, xi\u0441joc\u04302).\u0458c\u0456\u0440();
    }

    @Override
    public /* synthetic */ xi\u0441joc\u0430 primaryFixed() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        byte[] byArray = new byte[-649654922 + 649654935];
        byArray[0] = -80639919 + 80639993;
        byArray[1] = -874265747 + 874265794;
        byArray[2] = -422677208 + 422677268;
        byArray[3] = -508143266 + 508143381;
        byArray[4] = -2025564824 + 2025564727;
        byArray[5] = -1373103403 + 1373103469;
        byArray[-2021701158 + 2021701164] = -718261033 + 718261106;
        byArray[-347924531 + 347924538] = -1433925560 + 1433925469;
        byArray[-250564075 + 250564083] = -2044164009 + 2044164092;
        byArray[-1271057452 + 1271057461] = -365309718 + 365309653;
        byArray[-2145663879 + 2145663889] = -1000885648 + 1000885586;
        byArray[-981877764 + 981877775] = -957769397 + 957769482;
        byArray[-1720838834 + 1720838846] = -1636954884 + 1636954983;
        xi\u0441joc\u0430 xi\u0441joc\u04302 = new ip\u0456hh\u0445().\u0445s\u0456cx\u0441((String)((Object)x\u043e\u0456p.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(32885440 + 974025028), (int)(-280268360 + 1214039535)))).x\u0445\u0445a\u0445ch(\u043e\u0441xc\u0458\u04302 -> {
            if (true | false) {
            }
            return \u043e\u0441xc\u0458\u04302.\u0435ei\u043ei;
        }).\u0440\u0458\u04bbc(\u043e\u0441xc\u0458\u04302 -> {
            if ((3 * 3 + 3) % 2 == 0) {
            }
            CallSite callSite = x\u043e\u0456p.a_bsm4("\u0435j\u0435", \u0435j\u0435(\u0458po\u0435ej\u0430.\u043e\u0441xc\u0458\u0430 boolean double ), (\u043e\u0441xc\u0458\u0430)\u043e\u0441xc\u0458\u04302, (boolean)false, (double)0.0);
            return x\u043e\u0456p.a_bsm3("valueOf", valueOf(double ), (double)this.primaryContainer().\u0435\u0435\u0445xo\u0430((\u043e\u0441xc\u0458\u0430)((Object)callSite)));
        }).x\u0441cc\u0445(true).s\u0430paih(\u043e\u0441xc\u0458\u04302 -> {
            if (true | false) {
            }
            return this.highestSurface((\u043e\u0441xc\u0458\u0430)\u043e\u0441xc\u0458\u04302);
        }).iea\u0430p\u0441\u0445(\u043e\u0441xc\u0458\u04302 -> {
            i\u043ee i\u043ee2;
            if (2 * 2 * 2 >= 0) {
            }
            if (\u043e\u0441xc\u0458\u04302.i\u0430xp\u0458 > 0.0) {
                i\u043ee2 = x\u043e\u0456p.hsj\u04bbo\u0441(1.5);
                switch (0) {
                    default: {
                        break;
                    }
                    case 1: {
                        break;
                    }
                    case 2: {
                        break;
                    }
                }
            } else {
                i\u043ee2 = null;
            }
            return i\u043ee2;
        }).\u0458c\u0456\u0440();
        return super.primaryFixed().io\u0440().\u0458\u0440\u043ei\u0435(x\u0441cs.xip, xi\u0441joc\u04302).\u0458c\u0456\u0440();
    }

    @Override
    public /* synthetic */ xi\u0441joc\u0430 primaryFixedDim() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        byte[] byArray = new byte[-714961383 + 714961400];
        byArray[0] = -326870468 + 326870551;
        byArray[1] = -1095145820 + 1095145931;
        byArray[2] = -1779273172 + 1779273151;
        byArray[3] = -669438365 + 669438418;
        byArray[4] = -593711195 + 593711230;
        byArray[5] = -467409198 + 467409147;
        byArray[-52332884 + 52332890] = -1881421420 + 1881421334;
        byArray[-1153544505 + 1153544512] = -196713291 + 0xBB99B11;
        byArray[-224064963 + 224064971] = -1761259618 + 1761259554;
        byArray[-2077241735 + 2077241744] = -1930797594 + 1930797715;
        byArray[-1736489960 + 1736489970] = -279039715 + 279039682;
        byArray[-1593303060 + 1593303071] = -1638827551 + 1638827590;
        byArray[-636194157 + 636194169] = -1908248770 + 1908248855;
        byArray[-523036489 + 523036502] = 1;
        byArray[-426501071 + 426501085] = -813082379 + 813082262;
        byArray[-47277444 + 47277459] = -1322839419 + 1322839343;
        byArray[-994003900 + 994003916] = -974955039 + 974955133;
        xi\u0441joc\u0430 xi\u0441joc\u04302 = new ip\u0456hh\u0445().\u0445s\u0456cx\u0441((String)((Object)x\u043e\u0456p.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-243890638 + 1809635104), (int)(-1192901974 + 1618302640)))).x\u0445\u0445a\u0445ch(\u043e\u0441xc\u0458\u04302 -> {
            if ((3 * 3 + 3) % 2 == 0) {
            }
            return \u043e\u0441xc\u0458\u04302.\u0435ei\u043ei;
        }).\u0440\u0458\u04bbc(\u043e\u0441xc\u0458\u04302 -> {
            if ((3 * 3 + 3) % 2 == 0) {
            }
            return x\u043e\u0456p.a_bsm3("valueOf", valueOf(double ), (double)this.primaryFixed().\u0435\u0435\u0445xo\u0430((\u043e\u0441xc\u0458\u0430)\u043e\u0441xc\u0458\u04302));
        }).x\u0441cc\u0445(true).s\u0430paih(\u043e\u0441xc\u0458\u04302 -> {
            if ((3 * 3 + 3) % 2 == 0) {
            }
            return this.highestSurface((\u043e\u0441xc\u0458\u0430)\u043e\u0441xc\u0458\u04302);
        }).po\u0441ei(\u043e\u0441xc\u0458\u04302 -> {
            if (true | false) {
            }
            return new \u0435\u0440\u0430(this.primaryFixedDim(), this.primaryFixed(), 5.0, c\u04bb\u0455o\u0445po.h\u043e\u04bb, ec\u0440\u0455.hie\u0440p);
        }).iea\u0430p\u0441\u0445(\u043e\u0441xc\u0458\u04302 -> {
            if ((3 * 3 + 3) % 2 == 0) {
            }
            return \u043e\u0441xc\u0458\u04302.i\u0430xp\u0458 > 0.0 ? x\u043e\u0456p.hsj\u04bbo\u0441(1.5) : null;
        }).\u0458c\u0456\u0440();
        return super.primaryFixedDim().io\u0440().\u0458\u0440\u043ei\u0435(x\u0441cs.xip, xi\u0441joc\u04302).\u0458c\u0456\u0440();
    }

    @Override
    public /* synthetic */ xi\u0441joc\u0430 onPrimaryFixed() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        byte[] byArray = new byte[-426976136 + 426976152];
        byArray[0] = -457727157 + 457727057;
        byArray[1] = -1314436636 + 1314436757;
        byArray[2] = -1256742741 + 1256742652;
        byArray[3] = -446772567 + 446772650;
        byArray[4] = -443547481 + 443547607;
        byArray[5] = -877805640 + 877805560;
        byArray[-1229571390 + 1229571396] = -999416534 + 999416554;
        byArray[-1720308768 + 1720308775] = -973276292 + 973276299;
        byArray[-1933112748 + 1933112756] = -1721918712 + 1721918786;
        byArray[-1862950413 + 1862950422] = -2012981003 + 2012980931;
        byArray[-1683123985 + 1683123995] = -2010950586 + 2010950709;
        byArray[-1726836171 + 0x66ED6DD6] = -1577536095 + 1577536140;
        byArray[-872306354 + 872306366] = -713320601 + 713320547;
        byArray[-2045956424 + 2045956437] = 0;
        byArray[-1563976075 + 1563976089] = -1410147025 + 1410147143;
        byArray[-521276700 + 521276715] = -1498255862 + 1498255923;
        xi\u0441joc\u0430 xi\u0441joc\u04302 = new ip\u0456hh\u0445().\u0445s\u0456cx\u0441((String)((Object)x\u043e\u0456p.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(805352400 + 783067868), (int)(-1294792374 + 583257164)))).x\u0445\u0445a\u0445ch(\u043e\u0441xc\u0458\u04302 -> {
            if ((3 * 3 + 3) % 2 == 0) {
            }
            return \u043e\u0441xc\u0458\u04302.\u0435ei\u043ei;
        }).s\u0430paih(\u043e\u0441xc\u0458\u04302 -> {
            if (2 * 2 * 2 >= 0) {
            }
            return this.primaryFixed().\u0435\u0435\u0445xo\u0430((\u043e\u0441xc\u0458\u0430)\u043e\u0441xc\u0458\u04302) > 57.0 ? this.primaryFixedDim() : this.primaryFixed();
        }).iea\u0430p\u0441\u0445(\u043e\u0441xc\u0458\u04302 -> {
            if (2 * 2 * 2 >= 0) {
            }
            return x\u043e\u0456p.hsj\u04bbo\u0441(7.0);
        }).\u0458c\u0456\u0440();
        return super.onPrimaryFixed().io\u0440().\u0458\u0440\u043ei\u0435(x\u0441cs.xip, xi\u0441joc\u04302).\u0458c\u0456\u0440();
    }

    @Override
    public /* synthetic */ xi\u0441joc\u0430 onPrimaryFixedVariant() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        byte[] byArray = new byte[-439100747 + 439100771];
        byArray[0] = -300210653 + 300210596;
        byArray[1] = -1811418271 + 1811418318;
        byArray[2] = -1503054433 + 1503054539;
        byArray[3] = -207874645 + 207874764;
        byArray[4] = -2080787373 + 2080787344;
        byArray[5] = -732324976 + 732325055;
        byArray[-769361297 + 769361303] = -536417871 + 536417760;
        byArray[-500073184 + 500073191] = -1688446911 + 1688447027;
        byArray[-138150111 + 138150119] = -481324190 + 481324288;
        byArray[-251907363 + 251907372] = -1406255864 + 1406255857;
        byArray[-602071699 + 602071709] = -528750619 + 528750594;
        byArray[-1333971719 + 1333971730] = -1892819720 + 1892819614;
        byArray[-1669259305 + 1669259317] = -1475956521 + 1475956562;
        byArray[-1332383213 + 1332383226] = -63037391 + 63037364;
        byArray[-977377731 + 977377745] = -1319541669 + 1319541554;
        byArray[-536007419 + 536007434] = -1904362277 + 1904362385;
        byArray[-63757265 + 63757281] = -1928299782 + 1928299809;
        byArray[-1879872981 + 1879872998] = -526540176 + 526540204;
        byArray[-898240860 + 898240878] = -908508604 + 908508506;
        byArray[-393663739 + 393663758] = -1649900052 + 1649900002;
        byArray[-597315824 + 597315844] = -1695929891 + 1695929971;
        byArray[-494207423 + 494207444] = -1237150264 + 1237150191;
        byArray[-667553316 + 667553338] = -108648660 + 108648742;
        byArray[-1399993825 + 1399993848] = -250917928 + 250917880;
        xi\u0441joc\u0430 xi\u0441joc\u04302 = new ip\u0456hh\u0445().\u0445s\u0456cx\u0441((String)((Object)x\u043e\u0456p.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-82234989 + 1348082143), (int)(-1597243884 + 1870008877)))).x\u0445\u0445a\u0445ch(\u043e\u0441xc\u0458\u04302 -> {
            if (2 * 2 * 2 >= 0) {
            }
            return \u043e\u0441xc\u0458\u04302.\u0435ei\u043ei;
        }).s\u0430paih(\u043e\u0441xc\u0458\u04302 -> {
            if (2 * 2 * 2 >= 0) {
            }
            return this.primaryFixed().\u0435\u0435\u0445xo\u0430((\u043e\u0441xc\u0458\u0430)\u043e\u0441xc\u0458\u04302) > 57.0 ? this.primaryFixedDim() : this.primaryFixed();
        }).iea\u0430p\u0441\u0445(\u043e\u0441xc\u0458\u04302 -> {
            if (true | false) {
            }
            return x\u043e\u0456p.hsj\u04bbo\u0441(4.5);
        }).\u0458c\u0456\u0440();
        return super.onPrimaryFixedVariant().io\u0440().\u0458\u0440\u043ei\u0435(x\u0441cs.xip, xi\u0441joc\u04302).\u0458c\u0456\u0440();
    }

    @Override
    public /* synthetic */ xi\u0441joc\u0430 secondary() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        byte[] byArray = new byte[-552054782 + 552054791];
        byArray[0] = -643422634 + 643422741;
        byArray[1] = -151527326 + 151527244;
        byArray[2] = -704398508 + 704398628;
        byArray[3] = -484512827 + 484512864;
        byArray[4] = -1710897227 + 1710897251;
        byArray[5] = -1202111694 + 1202111783;
        byArray[-158172151 + 158172157] = -179314242 + 179314270;
        byArray[-742707797 + 742707804] = -263346444 + 263346525;
        byArray[-241205162 + 241205170] = -2100880965 + 2100880868;
        xi\u0441joc\u0430 xi\u0441joc\u04302 = new ip\u0456hh\u0445().\u0445s\u0456cx\u0441((String)((Object)x\u043e\u0456p.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-1019388470 + 275281371), (int)(166322103 + 534006278)))).x\u0445\u0445a\u0445ch(\u043e\u0441xc\u0458\u04302 -> {
            if (true | false) {
            }
            return \u043e\u0441xc\u0458\u04302.\u0456\u0455c\u0435;
        }).\u0440\u0458\u04bbc(\u043e\u0441xc\u0458\u04302 -> {
            if (2 * 2 * 2 >= 0) {
            }
            return x\u043e\u0456p.a_bsm3("valueOf", valueOf(double ), (double)(\u043e\u0441xc\u0458\u04302.s\u0440\u0458\u0440 ? x\u043e\u0456p.s\u0456e(\u043e\u0441xc\u0458\u04302.\u0456\u0455c\u0435) : x\u043e\u0456p.\u0430\u0456a(\u043e\u0441xc\u0458\u04302.\u0456\u0455c\u0435)));
        }).x\u0441cc\u0445(true).s\u0430paih(\u043e\u0441xc\u0458\u04302 -> {
            if (2 * 2 * 2 >= 0) {
            }
            return this.highestSurface((\u043e\u0441xc\u0458\u0430)\u043e\u0441xc\u0458\u04302);
        }).iea\u0430p\u0441\u0445(\u043e\u0441xc\u0458\u04302 -> {
            if (true | false) {
            }
            return x\u043e\u0456p.hsj\u04bbo\u0441(4.5);
        }).po\u0441ei(\u043e\u0441xc\u0458\u04302 -> {
            if (true | false) {
            }
            return \u043e\u0441xc\u0458\u04302.j\u0456\u0455 == j\u0445ep.\u04bbce\u0430\u0458 ? new \u0435\u0440\u0430(this.secondaryContainer(), this.secondary(), 5.0, c\u04bb\u0455o\u0445po.iho, ec\u0440\u0455.\u0435ph\u0440a\u0445) : null;
        }).\u0458c\u0456\u0440();
        return super.secondary().io\u0440().\u0458\u0440\u043ei\u0435(x\u0441cs.xip, xi\u0441joc\u04302).\u0458c\u0456\u0440();
    }

    @Override
    public /* synthetic */ xi\u0441joc\u0430 secondaryDim() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        byte[] byArray = new byte[-1545245361 + 1545245374];
        byArray[0] = -109729781 + 109729749;
        byArray[1] = -1526766687 + 1526766594;
        byArray[2] = -782979760 + 782979807;
        byArray[3] = -383707088 + 383707163;
        byArray[4] = -602583867 + 602583976;
        byArray[5] = -1905742318 + 1905742246;
        byArray[-2047662178 + 2047662184] = -1723871105 + 1723871055;
        byArray[-1308797900 + 1308797907] = -190310083 + 190309973;
        byArray[-1094274532 + 1094274540] = -1764984333 + 1764984436;
        byArray[-1859428559 + 1859428568] = -842106512 + 842106474;
        byArray[-790175837 + 790175847] = -1431599653 + 1431599774;
        byArray[-1050071740 + 1050071751] = -544767519 + 544767606;
        byArray[-158523724 + 158523736] = -883346735 + 883346709;
        xi\u0441joc\u0430 xi\u0441joc\u04302 = this.secondary().io\u0440().\u0445s\u0456cx\u0441((String)((Object)x\u043e\u0456p.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-1303829956 + 440773202), (int)(-351752559 + 2060760908)))).\u0458c\u0456\u0440();
        return super.secondaryDim().io\u0440().\u0458\u0440\u043ei\u0435(x\u0441cs.xip, xi\u0441joc\u04302).\u0458c\u0456\u0440();
    }

    @Override
    public /* synthetic */ xi\u0441joc\u0430 onSecondary() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        byte[] byArray = new byte[-800919372 + 800919384];
        byArray[0] = -1400585224 + 1400585305;
        byArray[1] = -555908412 + 555908494;
        byArray[2] = -1224186874 + 1224186944;
        byArray[3] = -1632452692 + 1632452752;
        byArray[4] = -736970451 + 736970479;
        byArray[5] = -85875913 + 85875841;
        byArray[-1686139345 + 1686139351] = -1254547108 + 1254547074;
        byArray[-1910965321 + 1910965328] = -1763318977 + 1763318894;
        byArray[-2126618099 + 2126618107] = -2109041927 + 2109042049;
        byArray[-53816838 + 53816847] = -1411322387 + 1411322463;
        byArray[-664326270 + 664326280] = -911341379 + 911341387;
        byArray[-924800974 + 924800985] = -1394891827 + 1394891859;
        xi\u0441joc\u0430 xi\u0441joc\u04302 = new ip\u0456hh\u0445().\u0445s\u0456cx\u0441((String)((Object)x\u043e\u0456p.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(805254891 + 191366268), (int)(-96103296 + 530744679)))).x\u0445\u0445a\u0445ch(\u043e\u0441xc\u0458\u04302 -> {
            if ((3 * 3 + 3) % 2 == 0) {
            }
            return \u043e\u0441xc\u0458\u04302.\u0456\u0455c\u0435;
        }).s\u0430paih(\u043e\u0441xc\u0458\u04302 -> {
            if ((3 * 3 + 3) % 2 == 0) {
            }
            return this.secondary();
        }).iea\u0430p\u0441\u0445(\u043e\u0441xc\u0458\u04302 -> {
            if (2 * 2 * 2 >= 0) {
            }
            return x\u043e\u0456p.hsj\u04bbo\u0441(6.0);
        }).\u0458c\u0456\u0440();
        return super.onSecondary().io\u0440().\u0458\u0440\u043ei\u0435(x\u0441cs.xip, xi\u0441joc\u04302).\u0458c\u0456\u0440();
    }

    @Override
    public /* synthetic */ xi\u0441joc\u0430 secondaryContainer() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        byte[] byArray = new byte[-1243740967 + 1243740986];
        byArray[0] = 1;
        byArray[1] = -759506512 + 759506448;
        byArray[2] = -1673636287 + 1673636365;
        byArray[3] = -1988603111 + 1988603179;
        byArray[4] = -933244016 + 933244006;
        byArray[5] = -1744498823 + 1744498742;
        byArray[-1140267476 + 1140267482] = -1891776917 + 1891776862;
        byArray[-1076554535 + 1076554542] = -1118095217 + 1118095262;
        byArray[-1108020090 + 1108020098] = -2138251653 + 2138251704;
        byArray[-2027070410 + 2027070419] = -1573497470 + 1573497374;
        byArray[-623714331 + 623714341] = -1737269946 + 1737269927;
        byArray[-1446145983 + 1446145994] = 5;
        byArray[-1564505676 + 1564505688] = -1375609240 + 1375609175;
        byArray[-1634213971 + 1634213984] = -1771011903 + 1771011841;
        byArray[-1811482822 + 1811482836] = -2001649938 + 2001649967;
        byArray[-858135157 + 858135172] = -1565954852 + 1565954879;
        byArray[-882626728 + 882626744] = -824772943 + 824772991;
        byArray[-1941008477 + 1941008494] = -219320243 + 219320233;
        byArray[-575387156 + 575387174] = -927746988 + 927747102;
        xi\u0441joc\u0430 xi\u0441joc\u04302 = new ip\u0456hh\u0445().\u0445s\u0456cx\u0441((String)((Object)x\u043e\u0456p.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-1273451773 + 1460035611), (int)(-2052424785 + 879050336)))).x\u0445\u0445a\u0445ch(\u043e\u0441xc\u0458\u04302 -> {
            if ((3 * 3 + 3) % 2 == 0) {
            }
            return \u043e\u0441xc\u0458\u04302.\u0456\u0455c\u0435;
        }).\u0440\u0458\u04bbc(\u043e\u0441xc\u0458\u04302 -> {
            if (true | false) {
            }
            return x\u043e\u0456p.a_bsm3("valueOf", valueOf(double ), (double)(\u043e\u0441xc\u0458\u04302.s\u0440\u0458\u0440 ? x\u043e\u0456p.ocoa\u0440e\u0456(\u043e\u0441xc\u0458\u04302.\u0456\u0455c\u0435, 20.0, 49.0) : x\u043e\u0456p.e\u04bb\u0441\u0435\u0435\u04bbp(\u043e\u0441xc\u0458\u04302.\u0456\u0455c\u0435, 61.0, 90.0)));
        }).x\u0441cc\u0445(true).s\u0430paih(\u043e\u0441xc\u0458\u04302 -> {
            if (2 * 2 * 2 >= 0) {
            }
            return this.highestSurface((\u043e\u0441xc\u0458\u0430)\u043e\u0441xc\u0458\u04302);
        }).iea\u0430p\u0441\u0445(\u043e\u0441xc\u0458\u04302 -> {
            if (true | false) {
            }
            return \u043e\u0441xc\u0458\u04302.i\u0430xp\u0458 > 0.0 ? x\u043e\u0456p.hsj\u04bbo\u0441(1.5) : null;
        }).\u0458c\u0456\u0440();
        return super.secondaryContainer().io\u0440().\u0458\u0440\u043ei\u0435(x\u0441cs.xip, xi\u0441joc\u04302).\u0458c\u0456\u0440();
    }

    @Override
    public /* synthetic */ xi\u0441joc\u0430 onSecondaryContainer() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        byte[] byArray = new byte[-1908710748 + 1908710770];
        byArray[0] = -2126684124 + 2126684081;
        byArray[1] = -454937472 + 454937355;
        byArray[2] = -1186470536 + 1186470408;
        byArray[3] = -1880770125 + 1880770007;
        byArray[4] = -382787005 + 382787029;
        byArray[5] = -563284817 + 563284801;
        byArray[-33448173 + 33448179] = -1971528840 + 1971528888;
        byArray[-1117917787 + 1117917794] = -1133086518 + 1133086597;
        byArray[-1153165180 + 1153165188] = -232395774 + 232395764;
        byArray[-1104961189 + 1104961198] = -1739329077 + 1739329145;
        byArray[-264732706 + 264732716] = -1595081198 + 1595081073;
        byArray[-470825019 + 470825030] = -1564669801 + 1564669785;
        byArray[-1392156558 + 1392156570] = -830518123 + 830518144;
        byArray[-1530204825 + 1530204838] = -121471482 + 121471525;
        byArray[-917782008 + 917782022] = -791621954 + 791621982;
        byArray[-1390717573 + 1390717588] = -2031864124 + 2031864054;
        byArray[-769409803 + 769409819] = -168096335 + 168096214;
        byArray[-632909064 + 632909081] = -1260205226 + 1260205170;
        byArray[-1063356013 + 1063356031] = -639439336 + 639439364;
        byArray[-297931786 + 297931805] = -1881441563 + 1881441627;
        byArray[-1736642284 + 1736642304] = -2070869667 + 2070869558;
        byArray[-1808020105 + 1808020126] = -209822948 + 209823041;
        xi\u0441joc\u0430 xi\u0441joc\u04302 = new ip\u0456hh\u0445().\u0445s\u0456cx\u0441((String)((Object)x\u043e\u0456p.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(1084392347 + 492165724), (int)(1407842426 + 2071713515)))).x\u0445\u0445a\u0445ch(\u043e\u0441xc\u0458\u04302 -> {
            if (2 * 2 * 2 >= 0) {
            }
            return \u043e\u0441xc\u0458\u04302.\u0456\u0455c\u0435;
        }).s\u0430paih(\u043e\u0441xc\u0458\u04302 -> {
            if ((3 * 3 + 3) % 2 == 0) {
            }
            return this.secondaryContainer();
        }).iea\u0430p\u0441\u0445(\u043e\u0441xc\u0458\u04302 -> {
            if ((3 * 3 + 3) % 2 == 0) {
            }
            return x\u043e\u0456p.hsj\u04bbo\u0441(6.0);
        }).\u0458c\u0456\u0440();
        return super.onSecondaryContainer().io\u0440().\u0458\u0440\u043ei\u0435(x\u0441cs.xip, xi\u0441joc\u04302).\u0458c\u0456\u0440();
    }

    @Override
    public /* synthetic */ xi\u0441joc\u0430 secondaryFixed() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        byte[] byArray = new byte[-1403447285 + 1403447300];
        byArray[0] = -559279040 + 559278980;
        byArray[1] = -1538859600 + 1538859623;
        byArray[2] = -129988273 + 129988317;
        byArray[3] = -1395620192 + 1395620223;
        byArray[4] = -3731148 + 3731227;
        byArray[5] = -1985700520 + 1985700490;
        byArray[-1406867900 + 1406867906] = -457463506 + 457463603;
        byArray[-815057337 + 815057344] = -931308286 + 931308192;
        byArray[-209986560 + 209986568] = -1462639253 + 1462639379;
        byArray[-2111297267 + 2111297276] = -988175784 + 988175906;
        byArray[-1054810924 + 1054810934] = -1419503000 + 1419503051;
        byArray[-2011898299 + 2011898310] = -1671059775 + 1671059883;
        byArray[-140053153 + 140053165] = -2011046347 + 2011046361;
        byArray[-450889204 + 450889217] = -1753743445 + 1753743337;
        byArray[-2062365348 + 2062365362] = -437196592 + 437196502;
        xi\u0441joc\u0430 xi\u0441joc\u04302 = new ip\u0456hh\u0445().\u0445s\u0456cx\u0441((String)((Object)x\u043e\u0456p.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(1998495457 + 1465659289), (int)(1251809412 + 697523116)))).x\u0445\u0445a\u0445ch(\u043e\u0441xc\u0458\u04302 -> {
            if (2 * 2 * 2 >= 0) {
            }
            return \u043e\u0441xc\u0458\u04302.\u0456\u0455c\u0435;
        }).\u0440\u0458\u04bbc(\u043e\u0441xc\u0458\u04302 -> {
            if ((3 * 3 + 3) % 2 == 0) {
            }
            CallSite callSite = x\u043e\u0456p.a_bsm4("\u0435j\u0435", \u0435j\u0435(\u0458po\u0435ej\u0430.\u043e\u0441xc\u0458\u0430 boolean double ), (\u043e\u0441xc\u0458\u0430)\u043e\u0441xc\u0458\u04302, (boolean)false, (double)0.0);
            return x\u043e\u0456p.a_bsm3("valueOf", valueOf(double ), (double)this.secondaryContainer().\u0435\u0435\u0445xo\u0430((\u043e\u0441xc\u0458\u0430)((Object)callSite)));
        }).x\u0441cc\u0445(true).s\u0430paih(\u043e\u0441xc\u0458\u04302 -> {
            if (true | false) {
            }
            return this.highestSurface((\u043e\u0441xc\u0458\u0430)\u043e\u0441xc\u0458\u04302);
        }).iea\u0430p\u0441\u0445(\u043e\u0441xc\u0458\u04302 -> {
            if (true | false) {
            }
            return \u043e\u0441xc\u0458\u04302.i\u0430xp\u0458 > 0.0 ? x\u043e\u0456p.hsj\u04bbo\u0441(1.5) : null;
        }).\u0458c\u0456\u0440();
        return super.secondaryFixed().io\u0440().\u0458\u0440\u043ei\u0435(x\u0441cs.xip, xi\u0441joc\u04302).\u0458c\u0456\u0440();
    }

    @Override
    public /* synthetic */ xi\u0441joc\u0430 secondaryFixedDim() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        byte[] byArray = new byte[-1630763992 + 1630764011];
        byArray[0] = -904353926 + 904354040;
        byArray[1] = -1549062090 + 1549062082;
        byArray[2] = -1572118119 + 1572118112;
        byArray[3] = -1706812576 + 1706812677;
        byArray[4] = -136259525 + 136259483;
        byArray[5] = -334857690 + 334857667;
        byArray[-1354274082 + 1354274088] = -447814564 + 447814688;
        byArray[-6903867 + 6903874] = -396314340 + 396314221;
        byArray[-2034925452 + 2034925460] = -1681108047 + 1681108151;
        byArray[-1259330076 + 1259330085] = -467331358 + 467331275;
        byArray[-1660120557 + 1660120567] = -2025130383 + 2025130484;
        byArray[-1197565306 + 1197565317] = -679019327 + 679019203;
        byArray[-1579763148 + 1579763160] = -1081370926 + 1081370958;
        byArray[-1704992411 + 1704992424] = -135391561 + 135391622;
        byArray[-1062035053 + 1062035067] = -1673749941 + 1673749837;
        byArray[-726478435 + 726478450] = -1095239376 + 1095239459;
        byArray[-392436728 + 392436744] = -1565706902 + 1565706857;
        byArray[-1514605196 + 1514605213] = -1426634647 + 1426634551;
        byArray[-1276302153 + 1276302171] = -1982599196 + 1982599184;
        xi\u0441joc\u0430 xi\u0441joc\u04302 = new ip\u0456hh\u0445().\u0445s\u0456cx\u0441((String)((Object)x\u043e\u0456p.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(1264953953 + 647088021), (int)(96151636 + 525925567)))).x\u0445\u0445a\u0445ch(\u043e\u0441xc\u0458\u04302 -> {
            if (2 * 2 * 2 >= 0) {
            }
            return \u043e\u0441xc\u0458\u04302.\u0456\u0455c\u0435;
        }).\u0440\u0458\u04bbc(\u043e\u0441xc\u0458\u04302 -> {
            if (true | false) {
            }
            return x\u043e\u0456p.a_bsm3("valueOf", valueOf(double ), (double)this.secondaryFixed().\u0435\u0435\u0445xo\u0430((\u043e\u0441xc\u0458\u0430)\u043e\u0441xc\u0458\u04302));
        }).x\u0441cc\u0445(true).s\u0430paih(\u043e\u0441xc\u0458\u04302 -> {
            if (2 * 2 * 2 >= 0) {
            }
            return this.highestSurface((\u043e\u0441xc\u0458\u0430)\u043e\u0441xc\u0458\u04302);
        }).po\u0441ei(\u043e\u0441xc\u0458\u04302 -> {
            if (2 * 2 * 2 >= 0) {
            }
            return new \u0435\u0440\u0430(this.secondaryFixedDim(), this.secondaryFixed(), 5.0, c\u04bb\u0455o\u0445po.h\u043e\u04bb, ec\u0440\u0455.hie\u0440p);
        }).iea\u0430p\u0441\u0445(\u043e\u0441xc\u0458\u04302 -> {
            if (2 * 2 * 2 >= 0) {
            }
            return \u043e\u0441xc\u0458\u04302.i\u0430xp\u0458 > 0.0 ? x\u043e\u0456p.hsj\u04bbo\u0441(1.5) : null;
        }).\u0458c\u0456\u0440();
        return super.secondaryFixedDim().io\u0440().\u0458\u0440\u043ei\u0435(x\u0441cs.xip, xi\u0441joc\u04302).\u0458c\u0456\u0440();
    }

    @Override
    public /* synthetic */ xi\u0441joc\u0430 onSecondaryFixed() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        byte[] byArray = new byte[-771760860 + 0x2E0022EE];
        byArray[0] = -1631388620 + 1631388496;
        byArray[1] = -769627093 + 769627068;
        byArray[2] = -515323794 + 515323909;
        byArray[3] = -1078045662 + 1078045596;
        byArray[4] = -677315159 + 677315281;
        byArray[5] = -1390524106 + 1390524141;
        byArray[-1216863095 + 1216863101] = -1562884897 + 1562884888;
        byArray[-1215976862 + 1215976869] = -1875557153 + 1875557117;
        byArray[-2138798383 + 2138798391] = -1027155827 + 1027155699;
        byArray[-1440407732 + 1440407741] = -128755304 + 128755298;
        byArray[-1399993339 + 1399993349] = -1781918090 + 1781918004;
        byArray[-1068426035 + 1068426046] = -2072116448 + 2072116337;
        byArray[-700783945 + 700783957] = -637927254 + 637927284;
        byArray[-1871479786 + 1871479799] = -731813337 + 731813459;
        byArray[-945029162 + 945029176] = -222026370 + 222026281;
        byArray[-2009627761 + 2009627776] = -1481103577 + 1481103640;
        byArray[-1535152894 + 1535152910] = -375340581 + 375340543;
        byArray[-1328421850 + 1328421867] = -821623458 + 821623525;
        xi\u0441joc\u0430 xi\u0441joc\u04302 = new ip\u0456hh\u0445().\u0445s\u0456cx\u0441((String)((Object)x\u043e\u0456p.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-1362499716 + 310565328), (int)(-852537811 + 442603874)))).x\u0445\u0445a\u0445ch(\u043e\u0441xc\u0458\u04302 -> {
            if (2 * 2 * 2 >= 0) {
            }
            return \u043e\u0441xc\u0458\u04302.\u0456\u0455c\u0435;
        }).s\u0430paih(\u043e\u0441xc\u0458\u04302 -> {
            xi\u0441joc\u0430 xi\u0441joc\u04302;
            if (true | false) {
            }
            if (this.secondaryFixed().\u0435\u0435\u0445xo\u0430((\u043e\u0441xc\u0458\u0430)\u043e\u0441xc\u0458\u04302) > 57.0) {
                xi\u0441joc\u04302 = this.secondaryFixedDim();
                switch (0) {
                    default: {
                        break;
                    }
                    case 1: {
                        break;
                    }
                    case 2: {
                        break;
                    }
                }
            } else {
                xi\u0441joc\u04302 = this.secondaryFixed();
            }
            return xi\u0441joc\u04302;
        }).iea\u0430p\u0441\u0445(\u043e\u0441xc\u0458\u04302 -> {
            if (2 * 2 * 2 >= 0) {
            }
            return x\u043e\u0456p.hsj\u04bbo\u0441(7.0);
        }).\u0458c\u0456\u0440();
        return super.onSecondaryFixed().io\u0440().\u0458\u0440\u043ei\u0435(x\u0441cs.xip, xi\u0441joc\u04302).\u0458c\u0456\u0440();
    }

    @Override
    public /* synthetic */ xi\u0441joc\u0430 onSecondaryFixedVariant() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        byte[] byArray = new byte[-1436077248 + 1436077274];
        byArray[0] = -1300291286 + 1300291345;
        byArray[1] = -1426669837 + 1426669867;
        byArray[2] = -725745014 + 725744923;
        byArray[3] = -570049294 + 570049283;
        byArray[4] = -1290764349 + 1290764443;
        byArray[5] = -1680942067 + 1680941956;
        byArray[-1868197572 + 1868197578] = -1611529533 + 1611529514;
        byArray[-256063362 + 256063369] = -379301096 + 379301121;
        byArray[-1017735752 + 1017735760] = -1546082190 + 1546082281;
        byArray[-683938803 + 683938812] = -60328694 + 60328617;
        byArray[-330337744 + 330337754] = -1577406860 + 1577406938;
        byArray[-1070696879 + 1070696890] = -1430057300 + 1430057379;
        byArray[-97117069 + 97117081] = -99153184 + 99153307;
        byArray[-1216569088 + 1216569101] = -2138648189 + 2138648068;
        byArray[-1295932697 + 1295932711] = -1925259646 + 1925259760;
        byArray[-376729388 + 376729403] = -312413357 + 312413385;
        byArray[-986209153 + 986209169] = -1043296696 + 1043296776;
        byArray[-1818024588 + 1818024605] = -1261941586 + 1261941472;
        byArray[-1936879091 + 1936879109] = -610543704 + 610543576;
        byArray[-396418635 + 396418654] = -1327403981 + 1327403873;
        byArray[-5968133 + 5968153] = -478878426 + 478878372;
        byArray[-1356017085 + 1356017106] = -1279285077 + 1279284954;
        byArray[-1164499103 + 1164499125] = -1356975094 + 1356975004;
        byArray[-889014105 + 889014128] = -993502636 + 993502663;
        byArray[-956763783 + 956763807] = -598663925 + 598663843;
        byArray[-2079186773 + 2079186798] = -1148118963 + 1148119073;
        xi\u0441joc\u0430 xi\u0441joc\u04302 = new ip\u0456hh\u0445().\u0445s\u0456cx\u0441((String)((Object)x\u043e\u0456p.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-1865966241 + 2084138913), (int)(-720709067 + 2052420906)))).x\u0445\u0445a\u0445ch(\u043e\u0441xc\u0458\u04302 -> {
            if (true | false) {
            }
            return \u043e\u0441xc\u0458\u04302.\u0456\u0455c\u0435;
        }).s\u0430paih(\u043e\u0441xc\u0458\u04302 -> {
            if ((3 * 3 + 3) % 2 == 0) {
            }
            return this.secondaryFixed().\u0435\u0435\u0445xo\u0430((\u043e\u0441xc\u0458\u0430)\u043e\u0441xc\u0458\u04302) > 57.0 ? this.secondaryFixedDim() : this.secondaryFixed();
        }).iea\u0430p\u0441\u0445(\u043e\u0441xc\u0458\u04302 -> {
            if ((3 * 3 + 3) % 2 == 0) {
            }
            return x\u043e\u0456p.hsj\u04bbo\u0441(4.5);
        }).\u0458c\u0456\u0440();
        return super.onSecondaryFixedVariant().io\u0440().\u0458\u0440\u043ei\u0435(x\u0441cs.xip, xi\u0441joc\u04302).\u0458c\u0456\u0440();
    }

    @Override
    public /* synthetic */ xi\u0441joc\u0430 tertiary() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        byte[] byArray = new byte[-632979987 + 632979995];
        byArray[0] = -1526973935 + 1526973890;
        byArray[1] = -1534751346 + 1534751442;
        byArray[2] = -1969222709 + 1969222803;
        byArray[3] = -2131770277 + 2131770293;
        byArray[4] = -216664532 + 216664464;
        byArray[5] = -1580934288 + 1580934294;
        byArray[-872404989 + 872404995] = -186629067 + 186629017;
        byArray[-862227771 + 862227778] = -1370000635 + 1370000734;
        xi\u0441joc\u0430 xi\u0441joc\u04302 = new ip\u0456hh\u0445().\u0445s\u0456cx\u0441((String)((Object)x\u043e\u0456p.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-2117573567 + 1301244694), (int)(1111320488 + 227600421)))).x\u0445\u0445a\u0445ch(\u043e\u0441xc\u0458\u04302 -> {
            if ((3 * 3 + 3) % 2 == 0) {
            }
            return \u043e\u0441xc\u0458\u04302.\u0455\u0435\u0440;
        }).\u0440\u0458\u04bbc(\u043e\u0441xc\u0458\u04302 -> {
            if ((3 * 3 + 3) % 2 == 0) {
            }
            return x\u043e\u0456p.a_bsm3("valueOf", valueOf(double ), (double)(\u043e\u0441xc\u0458\u04302.\u0458\u043e\u0435xc.size() > 1 ? \u043e\u0441xc\u0458\u04302.\u0458\u043e\u0435xc.get(1).ex\u0430i\u0440() : \u043e\u0441xc\u0458\u04302.ies\u0445\u04bbp\u0430.ex\u0430i\u0440()));
        }).x\u0441cc\u0445(true).s\u0430paih(\u043e\u0441xc\u0458\u04302 -> {
            if (2 * 2 * 2 >= 0) {
            }
            return this.highestSurface((\u043e\u0441xc\u0458\u0430)\u043e\u0441xc\u0458\u04302);
        }).iea\u0430p\u0441\u0445(\u043e\u0441xc\u0458\u04302 -> {
            if ((3 * 3 + 3) % 2 == 0) {
            }
            return x\u043e\u0456p.hsj\u04bbo\u0441(4.5);
        }).po\u0441ei(\u043e\u0441xc\u0458\u04302 -> {
            if (2 * 2 * 2 >= 0) {
            }
            return \u043e\u0441xc\u0458\u04302.j\u0456\u0455 == j\u0445ep.\u04bbce\u0430\u0458 ? new \u0435\u0440\u0430(this.tertiaryContainer(), this.tertiary(), 5.0, c\u04bb\u0455o\u0445po.iho, ec\u0440\u0455.\u0435ph\u0440a\u0445) : null;
        }).\u0458c\u0456\u0440();
        return super.tertiary().io\u0440().\u0458\u0440\u043ei\u0435(x\u0441cs.xip, xi\u0441joc\u04302).\u0458c\u0456\u0440();
    }

    @Override
    public /* synthetic */ xi\u0441joc\u0430 tertiaryDim() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        byte[] byArray = new byte[-842194183 + 842194195];
        byArray[0] = -508696601 + 508696474;
        byArray[1] = -1276356094 + 1276356164;
        byArray[2] = -68971486 + 68971529;
        byArray[3] = -1850179414 + 1850179510;
        byArray[4] = -1698656249 + 1698656231;
        byArray[5] = -442896914 + 0x1A6611A6;
        byArray[-1572336669 + 1572336675] = -600589196 + 600589271;
        byArray[-725749001 + 725749008] = -1376383215 + 1376383144;
        byArray[-1376791466 + 1376791474] = -1294821226 + 1294821178;
        byArray[-1008166632 + 1008166641] = -1271858001 + 1271858015;
        byArray[-1297847542 + 1297847552] = -619720693 + 619720805;
        byArray[-918132931 + 918132942] = -1819096686 + 1819096763;
        xi\u0441joc\u0430 xi\u0441joc\u04302 = this.tertiary().io\u0440().\u0445s\u0456cx\u0441((String)((Object)x\u043e\u0456p.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-521241021 + 1634583576), (int)(-785720249 + 264307876)))).\u0458c\u0456\u0440();
        return super.tertiaryDim().io\u0440().\u0458\u0440\u043ei\u0435(x\u0441cs.xip, xi\u0441joc\u04302).\u0458c\u0456\u0440();
    }

    @Override
    public /* synthetic */ xi\u0441joc\u0430 onTertiary() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        byte[] byArray = new byte[-958850348 + 958850359];
        byArray[0] = -1681526875 + 1681526960;
        byArray[1] = -677385792 + 677385856;
        byArray[2] = -346137994 + 346137908;
        byArray[3] = -1364806038 + 1364806146;
        byArray[4] = -330513907 + 330513815;
        byArray[5] = -1387139660 + 1387139725;
        byArray[-630295182 + 630295188] = -277466869 + 277466867;
        byArray[-1313530534 + 1313530541] = -1706509321 + 1706509207;
        byArray[-203174646 + 203174654] = -1689542268 + 1689542194;
        byArray[-425975794 + 425975803] = -1859191458 + 1859191502;
        byArray[-839748002 + 839748012] = -1449208201 + 1449208130;
        xi\u0441joc\u0430 xi\u0441joc\u04302 = new ip\u0456hh\u0445().\u0445s\u0456cx\u0441((String)((Object)x\u043e\u0456p.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-353219753 + 484818048), (int)(2045138219 + 1655670634)))).x\u0445\u0445a\u0445ch(\u043e\u0441xc\u0458\u04302 -> {
            if (true | false) {
            }
            return \u043e\u0441xc\u0458\u04302.\u0455\u0435\u0440;
        }).s\u0430paih(\u043e\u0441xc\u0458\u04302 -> {
            if ((3 * 3 + 3) % 2 == 0) {
            }
            return this.tertiary();
        }).iea\u0430p\u0441\u0445(\u043e\u0441xc\u0458\u04302 -> {
            if (2 * 2 * 2 >= 0) {
            }
            return x\u043e\u0456p.hsj\u04bbo\u0441(6.0);
        }).\u0458c\u0456\u0440();
        return super.onTertiary().io\u0440().\u0458\u0440\u043ei\u0435(x\u0441cs.xip, xi\u0441joc\u04302).\u0458c\u0456\u0440();
    }

    @Override
    public /* synthetic */ xi\u0441joc\u0430 tertiaryContainer() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        byte[] byArray = new byte[-438851721 + 438851739];
        byArray[0] = -1090438519 + 1090438457;
        byArray[1] = -14216310 + 14216229;
        byArray[2] = -1221424746 + 1221424717;
        byArray[3] = -740774311 + 740774265;
        byArray[4] = -2049657133 + 2049657141;
        byArray[5] = -262545120 + 262545188;
        byArray[-617457485 + 617457491] = -1385076439 + 1385076398;
        byArray[-517942331 + 517942338] = -76584835 + 76584891;
        byArray[-1499470064 + 1499470072] = -1112194949 + 1112195036;
        byArray[-1565181776 + 1565181785] = -1110153724 + 1110153763;
        byArray[-370197936 + 370197946] = 0;
        byArray[-288868759 + 288868770] = -443840512 + 443840396;
        byArray[-1815654195 + 1815654207] = -1920489169 + 1920489175;
        byArray[-164001070 + 164001083] = -1223025129 + 1223025155;
        byArray[-1895313920 + 1895313934] = -95734218 + 95734236;
        byArray[-1431093301 + 1431093316] = -1532968354 + 1532968337;
        byArray[-1503134250 + 1503134266] = -1418896681 + 1418896588;
        byArray[-1797707402 + 1797707419] = -663182232 + 663182322;
        xi\u0441joc\u0430 xi\u0441joc\u04302 = new ip\u0456hh\u0445().\u0445s\u0456cx\u0441((String)((Object)x\u043e\u0456p.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(1666390639 + 1156156877), (int)(-1948519729 + 1776091881)))).x\u0445\u0445a\u0445ch(\u043e\u0441xc\u0458\u04302 -> {
            if (2 * 2 * 2 >= 0) {
            }
            return \u043e\u0441xc\u0458\u04302.\u0455\u0435\u0440;
        }).\u0440\u0458\u04bbc(\u043e\u0441xc\u0458\u04302 -> {
            if (2 * 2 * 2 >= 0) {
            }
            \u0435\u043ea\u0440\u0458 \u0435\u043ea\u0440\u04582 = \u043e\u0441xc\u0458\u04302.\u0458\u043e\u0435xc.size() > 1 ? \u043e\u0441xc\u0458\u04302.\u0458\u043e\u0435xc.get(1) : \u043e\u0441xc\u0458\u04302.ies\u0445\u04bbp\u0430;
            return x\u043e\u0456p.a_bsm3("valueOf", valueOf(double ), (double)(\u0435\u043ea\u0440\u04582.ex\u0430i\u0440() > 55.0 ? x\u043e\u0456p.a_bsm1("\u0430\u0456\u0455", \u0430\u0456\u0455(double double double ), (double)61.0, (double)90.0, (double)\u0435\u043ea\u0440\u04582.ex\u0430i\u0440()) : x\u043e\u0456p.a_bsm1("\u0430\u0456\u0455", \u0430\u0456\u0455(double double double ), (double)20.0, (double)49.0, (double)\u0435\u043ea\u0440\u04582.ex\u0430i\u0440())));
        }).x\u0441cc\u0445(true).s\u0430paih(\u043e\u0441xc\u0458\u04302 -> {
            if (true | false) {
            }
            return this.highestSurface((\u043e\u0441xc\u0458\u0430)\u043e\u0441xc\u0458\u04302);
        }).iea\u0430p\u0441\u0445(\u043e\u0441xc\u0458\u04302 -> {
            i\u043ee i\u043ee2;
            if (true | false) {
            }
            if (\u043e\u0441xc\u0458\u04302.i\u0430xp\u0458 > 0.0) {
                i\u043ee2 = x\u043e\u0456p.hsj\u04bbo\u0441(1.5);
                switch (0) {
                    default: {
                        break;
                    }
                    case 1: {
                        break;
                    }
                    case 2: {
                        break;
                    }
                }
            } else {
                i\u043ee2 = null;
            }
            return i\u043ee2;
        }).\u0458c\u0456\u0440();
        return super.tertiaryContainer().io\u0440().\u0458\u0440\u043ei\u0435(x\u0441cs.xip, xi\u0441joc\u04302).\u0458c\u0456\u0440();
    }

    @Override
    public /* synthetic */ xi\u0441joc\u0430 onTertiaryContainer() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        byte[] byArray = new byte[-1590964990 + 1590965011];
        byArray[0] = -1872219459 + 1872219454;
        byArray[1] = -1572047456 + 1572047519;
        byArray[2] = -761793614 + 761793688;
        byArray[3] = -1130695264 + 1130695356;
        byArray[4] = -1217944834 + 1217944956;
        byArray[5] = -1676373221 + 1676373100;
        byArray[-1142452899 + 1142452905] = -438636706 + 438636599;
        byArray[-1548035055 + 1548035062] = -753146630 + 753146600;
        byArray[-1217675447 + 1217675455] = -1463782000 + 1463781964;
        byArray[-914097970 + 914097979] = -681718007 + 681717961;
        byArray[-1278372080 + 1278372090] = -401724683 + 401724614;
        byArray[-1952663671 + 1952663682] = -867367941 + 867367911;
        byArray[-635279468 + 635279480] = -1656093253 + 1656093299;
        byArray[-314761849 + 314761862] = -996785285 + 996785161;
        byArray[-1815126709 + 1815126723] = -529902866 + 529902920;
        byArray[-1872673772 + 1872673787] = -1247329412 + 1247329496;
        byArray[-1500379594 + 1500379610] = -1402560148 + 1402560161;
        byArray[-19351450 + 19351467] = -1083497590 + 1083497717;
        byArray[-204627145 + 204627163] = -646011245 + 646011303;
        byArray[-1637207071 + 1637207090] = -879309828 + 879309862;
        byArray[-760973110 + 760973130] = -196272626 + 196272587;
        xi\u0441joc\u0430 xi\u0441joc\u04302 = new ip\u0456hh\u0445().\u0445s\u0456cx\u0441((String)((Object)x\u043e\u0456p.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(1570853297 + 560147794), (int)(671470820 + 1468639915)))).x\u0445\u0445a\u0445ch(\u043e\u0441xc\u0458\u04302 -> {
            if (true | false) {
            }
            return \u043e\u0441xc\u0458\u04302.\u0455\u0435\u0440;
        }).s\u0430paih(\u043e\u0441xc\u0458\u04302 -> {
            if ((3 * 3 + 3) % 2 == 0) {
            }
            return this.tertiaryContainer();
        }).iea\u0430p\u0441\u0445(\u043e\u0441xc\u0458\u04302 -> {
            if (true | false) {
            }
            return x\u043e\u0456p.hsj\u04bbo\u0441(6.0);
        }).\u0458c\u0456\u0440();
        return super.onTertiaryContainer().io\u0440().\u0458\u0440\u043ei\u0435(x\u0441cs.xip, xi\u0441joc\u04302).\u0458c\u0456\u0440();
    }

    @Override
    public /* synthetic */ xi\u0441joc\u0430 tertiaryFixed() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        byte[] byArray = new byte[-1748650733 + 1748650747];
        byArray[0] = -1605865969 + 1605865933;
        byArray[1] = -1649752659 + 1649752768;
        byArray[2] = -72570901 + 72570944;
        byArray[3] = -27865541 + 27865488;
        byArray[4] = -383995926 + 383996013;
        byArray[5] = -1441823549 + 1441823655;
        byArray[-1596052975 + 1596052981] = -553819218 + 553819288;
        byArray[-222519803 + 222519810] = -1705579592 + 1705579487;
        byArray[-845649828 + 845649836] = -1329557620 + 1329557590;
        byArray[-159999500 + 159999509] = -1484521400 + 1484521388;
        byArray[-1616382381 + 1616382391] = -1244168062 + 1244167960;
        byArray[-901495817 + 901495828] = -151476048 + 151476104;
        byArray[-344223598 + 344223610] = -1738631695 + 1738631643;
        byArray[-1027650630 + 1027650643] = -818333263 + 818333339;
        xi\u0441joc\u0430 xi\u0441joc\u04302 = new ip\u0456hh\u0445().\u0445s\u0456cx\u0441((String)((Object)x\u043e\u0456p.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(758356826 + 740081142), (int)(1024193748 + 1624615181)))).x\u0445\u0445a\u0445ch(\u043e\u0441xc\u0458\u04302 -> {
            if (true | false) {
            }
            return \u043e\u0441xc\u0458\u04302.\u0455\u0435\u0440;
        }).\u0440\u0458\u04bbc(\u043e\u0441xc\u0458\u04302 -> {
            if (true | false) {
            }
            CallSite callSite = x\u043e\u0456p.a_bsm4("\u0435j\u0435", \u0435j\u0435(\u0458po\u0435ej\u0430.\u043e\u0441xc\u0458\u0430 boolean double ), (\u043e\u0441xc\u0458\u0430)\u043e\u0441xc\u0458\u04302, (boolean)false, (double)0.0);
            return x\u043e\u0456p.a_bsm3("valueOf", valueOf(double ), (double)this.tertiaryContainer().\u0435\u0435\u0445xo\u0430((\u043e\u0441xc\u0458\u0430)((Object)callSite)));
        }).x\u0441cc\u0445(true).s\u0430paih(\u043e\u0441xc\u0458\u04302 -> {
            if ((3 * 3 + 3) % 2 == 0) {
            }
            return this.highestSurface((\u043e\u0441xc\u0458\u0430)\u043e\u0441xc\u0458\u04302);
        }).iea\u0430p\u0441\u0445(\u043e\u0441xc\u0458\u04302 -> {
            i\u043ee i\u043ee2;
            if (2 * 2 * 2 >= 0) {
            }
            if (\u043e\u0441xc\u0458\u04302.i\u0430xp\u0458 > 0.0) {
                i\u043ee2 = x\u043e\u0456p.hsj\u04bbo\u0441(1.5);
                switch (0) {
                    default: {
                        break;
                    }
                    case 1: {
                        break;
                    }
                    case 2: {
                        break;
                    }
                }
            } else {
                i\u043ee2 = null;
            }
            return i\u043ee2;
        }).\u0458c\u0456\u0440();
        return super.tertiaryFixed().io\u0440().\u0458\u0440\u043ei\u0435(x\u0441cs.xip, xi\u0441joc\u04302).\u0458c\u0456\u0440();
    }

    @Override
    public /* synthetic */ xi\u0441joc\u0430 tertiaryFixedDim() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        byte[] byArray = new byte[-642441524 + 642441542];
        byArray[0] = -333761681 + 333761563;
        byArray[1] = -1107415605 + 1107415650;
        byArray[2] = -1713003626 + 1713003746;
        byArray[3] = -439410485 + 439410448;
        byArray[4] = -272458709 + 272458798;
        byArray[5] = -2142360043 + 2142360036;
        byArray[-922248879 + 922248885] = -540638035 + 540638023;
        byArray[-484617391 + 484617398] = -1938893043 + 1938892950;
        byArray[-2128118390 + 2128118398] = -1748871437 + 1748871547;
        byArray[-1988715451 + 1988715460] = -1012140397 + 1012140313;
        byArray[-1329531319 + 1329531329] = -1178807490 + 1178807482;
        byArray[-155532715 + 155532726] = -1974911677 + 1974911705;
        byArray[-1323197457 + 1323197469] = -791649160 + 791649140;
        byArray[-1855363173 + 1855363186] = -953232955 + 953232834;
        byArray[-1945488896 + 1945488910] = -670334725 + 670334846;
        byArray[-634251311 + 634251326] = -1462755146 + 1462755091;
        byArray[-555319884 + 555319900] = -1974875144 + 1974875186;
        byArray[-1132648494 + 1132648511] = -1412602173 + 1412602186;
        xi\u0441joc\u0430 xi\u0441joc\u04302 = new ip\u0456hh\u0445().\u0445s\u0456cx\u0441((String)((Object)x\u043e\u0456p.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(133067231 + 974376995), (int)(252052217 + 950486195)))).x\u0445\u0445a\u0445ch(\u043e\u0441xc\u0458\u04302 -> {
            if (2 * 2 * 2 >= 0) {
            }
            return \u043e\u0441xc\u0458\u04302.\u0455\u0435\u0440;
        }).\u0440\u0458\u04bbc(\u043e\u0441xc\u0458\u04302 -> {
            if ((3 * 3 + 3) % 2 == 0) {
            }
            return x\u043e\u0456p.a_bsm3("valueOf", valueOf(double ), (double)this.tertiaryFixed().\u0435\u0435\u0445xo\u0430((\u043e\u0441xc\u0458\u0430)\u043e\u0441xc\u0458\u04302));
        }).x\u0441cc\u0445(true).s\u0430paih(\u043e\u0441xc\u0458\u04302 -> {
            if (2 * 2 * 2 >= 0) {
            }
            return this.highestSurface((\u043e\u0441xc\u0458\u0430)\u043e\u0441xc\u0458\u04302);
        }).po\u0441ei(\u043e\u0441xc\u0458\u04302 -> {
            if (true | false) {
            }
            return new \u0435\u0440\u0430(this.tertiaryFixedDim(), this.tertiaryFixed(), 5.0, c\u04bb\u0455o\u0445po.h\u043e\u04bb, ec\u0440\u0455.hie\u0440p);
        }).iea\u0430p\u0441\u0445(\u043e\u0441xc\u0458\u04302 -> {
            if (2 * 2 * 2 >= 0) {
            }
            return \u043e\u0441xc\u0458\u04302.i\u0430xp\u0458 > 0.0 ? x\u043e\u0456p.hsj\u04bbo\u0441(1.5) : null;
        }).\u0458c\u0456\u0440();
        return super.tertiaryFixedDim().io\u0440().\u0458\u0440\u043ei\u0435(x\u0441cs.xip, xi\u0441joc\u04302).\u0458c\u0456\u0440();
    }

    @Override
    public /* synthetic */ xi\u0441joc\u0430 onTertiaryFixed() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        byte[] byArray = new byte[-2136370061 + 2136370078];
        byArray[0] = -1091754439 + 1091754508;
        byArray[1] = -1086863490 + 1086863514;
        byArray[2] = -771261896 + 771261790;
        byArray[3] = -1643251440 + 1643251330;
        byArray[4] = -1585763863 + 1585763908;
        byArray[5] = -1617321778 + 1617321665;
        byArray[-1871767899 + 1871767905] = -1365979240 + 1365979328;
        byArray[-345239543 + 345239550] = -1862276805 + 1862276818;
        byArray[-1149491281 + 1149491289] = -1714391041 + 1714391081;
        byArray[-1518555807 + 1518555816] = -739120446 + 739120441;
        byArray[-593110937 + 593110947] = -1035206115 + 1035206135;
        byArray[-1921510622 + 1921510633] = -1159217251 + 1159217284;
        byArray[-1413616710 + 1413616722] = -826962703 + 826962697;
        byArray[-1979139253 + 1979139266] = -741170278 + 741170295;
        byArray[-374162889 + 374162903] = -1218811379 + 1218811467;
        byArray[-261174065 + 261174080] = -57218030 + 57218109;
        byArray[-381948221 + 381948237] = -184092493 + 184092468;
        xi\u0441joc\u0430 xi\u0441joc\u04302 = new ip\u0456hh\u0445().\u0445s\u0456cx\u0441((String)((Object)x\u043e\u0456p.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(716650979 + 1896309211), (int)(-423219641 + 2101032377)))).x\u0445\u0445a\u0445ch(\u043e\u0441xc\u0458\u04302 -> {
            if (2 * 2 * 2 >= 0) {
            }
            return \u043e\u0441xc\u0458\u04302.\u0455\u0435\u0440;
        }).s\u0430paih(\u043e\u0441xc\u0458\u04302 -> {
            xi\u0441joc\u0430 xi\u0441joc\u04302;
            if ((3 * 3 + 3) % 2 == 0) {
            }
            if (this.tertiaryFixed().\u0435\u0435\u0445xo\u0430((\u043e\u0441xc\u0458\u0430)\u043e\u0441xc\u0458\u04302) > 57.0) {
                xi\u0441joc\u04302 = this.tertiaryFixedDim();
                switch (0) {
                    default: {
                        break;
                    }
                    case 1: {
                        break;
                    }
                    case 2: {
                        break;
                    }
                }
            } else {
                xi\u0441joc\u04302 = this.tertiaryFixed();
            }
            return xi\u0441joc\u04302;
        }).iea\u0430p\u0441\u0445(\u043e\u0441xc\u0458\u04302 -> {
            if (true | false) {
            }
            return x\u043e\u0456p.hsj\u04bbo\u0441(7.0);
        }).\u0458c\u0456\u0440();
        return super.onTertiaryFixed().io\u0440().\u0458\u0440\u043ei\u0435(x\u0441cs.xip, xi\u0441joc\u04302).\u0458c\u0456\u0440();
    }

    @Override
    public /* synthetic */ xi\u0441joc\u0430 onTertiaryFixedVariant() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        byte[] byArray = new byte[-2030790578 + 2030790603];
        byArray[0] = -1659114080 + 1659114105;
        byArray[1] = -1609535441 + 1609535406;
        byArray[2] = -1276425570 + 1276425651;
        byArray[3] = -963360926 + 963360877;
        byArray[4] = -211157367 + 211157458;
        byArray[5] = -1420414387 + 1420414300;
        byArray[-1871867012 + 1871867018] = -1178638159 + 1178638267;
        byArray[-1576916063 + 1576916070] = -568708595 + 568708541;
        byArray[-372131240 + 372131248] = -196785217 + 196785287;
        byArray[-424397059 + 424397068] = -611074575 + 611074595;
        byArray[-960767293 + 960767303] = -1396884636 + 1396884656;
        byArray[-718111608 + 718111619] = -1347631292 + 1347631385;
        byArray[-1514894198 + 1514894210] = -445445579 + 445445572;
        byArray[-79596898 + 79596911] = -1327342935 + 1327342807;
        byArray[-1982187302 + 1982187316] = -1015514665 + 1015514559;
        byArray[-2029366499 + 2029366514] = -1280284254 + 1280284369;
        byArray[-1415147235 + 1415147251] = -591062556 + 591062514;
        byArray[-2030226130 + 2030226147] = -679043649 + 679043690;
        byArray[-471016150 + 471016168] = -1366682012 + 1366682111;
        byArray[-2022883995 + 2022884014] = -862779522 + 862779590;
        byArray[-1324665122 + 1324665142] = -1862706471 + 1862706433;
        byArray[-262804915 + 262804936] = 1;
        byArray[-1022619558 + 1022619580] = -871094044 + 871094021;
        byArray[-40416945 + 40416968] = -404561169 + 404561101;
        byArray[-1829881299 + 1829881323] = -1361606784 + 1361606698;
        xi\u0441joc\u0430 xi\u0441joc\u04302 = new ip\u0456hh\u0445().\u0445s\u0456cx\u0441((String)((Object)x\u043e\u0456p.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-2071919974 + 1767631682), (int)(896764023 + 1128001591)))).x\u0445\u0445a\u0445ch(\u043e\u0441xc\u0458\u04302 -> {
            if ((3 * 3 + 3) % 2 == 0) {
            }
            return \u043e\u0441xc\u0458\u04302.\u0455\u0435\u0440;
        }).s\u0430paih(\u043e\u0441xc\u0458\u04302 -> {
            if (true | false) {
            }
            return this.tertiaryFixed().\u0435\u0435\u0445xo\u0430((\u043e\u0441xc\u0458\u0430)\u043e\u0441xc\u0458\u04302) > 57.0 ? this.tertiaryFixedDim() : this.tertiaryFixed();
        }).iea\u0430p\u0441\u0445(\u043e\u0441xc\u0458\u04302 -> {
            if (2 * 2 * 2 >= 0) {
            }
            return x\u043e\u0456p.hsj\u04bbo\u0441(4.5);
        }).\u0458c\u0456\u0440();
        return super.onTertiaryFixedVariant().io\u0440().\u0458\u0440\u043ei\u0435(x\u0441cs.xip, xi\u0441joc\u04302).\u0458c\u0456\u0440();
    }

    @Override
    public /* synthetic */ xi\u0441joc\u0430 error() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        xi\u0441joc\u0430 xi\u0441joc\u04302 = new ip\u0456hh\u0445().\u0445s\u0456cx\u0441((String)((Object)x\u043e\u0456p.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1879246720 + 1879246732, -1957613423 + 1957613465, -1162419171 + 1162419249, -943628814 + 943628881, -1138593214 + 1138593128}, (int)(1375370020 + 291039278), (int)(-203284229 + 1703360621)))).x\u0445\u0445a\u0445ch(\u043e\u0441xc\u0458\u04302 -> {
            if ((3 * 3 + 3) % 2 == 0) {
            }
            return \u043e\u0441xc\u0458\u04302.jshi\u04bb;
        }).\u0440\u0458\u04bbc(\u043e\u0441xc\u0458\u04302 -> {
            if (2 * 2 * 2 >= 0) {
            }
            return x\u043e\u0456p.a_bsm3("valueOf", valueOf(double ), (double)x\u043e\u0456p.\u0430\u0456a(\u043e\u0441xc\u0458\u04302.jshi\u04bb));
        }).x\u0441cc\u0445(true).s\u0430paih(\u043e\u0441xc\u0458\u04302 -> {
            if (2 * 2 * 2 >= 0) {
            }
            return this.highestSurface((\u043e\u0441xc\u0458\u0430)\u043e\u0441xc\u0458\u04302);
        }).iea\u0430p\u0441\u0445(\u043e\u0441xc\u0458\u04302 -> {
            if (true | false) {
            }
            return x\u043e\u0456p.hsj\u04bbo\u0441(4.5);
        }).po\u0441ei(\u043e\u0441xc\u0458\u04302 -> {
            if (true | false) {
            }
            return \u043e\u0441xc\u0458\u04302.j\u0456\u0455 == j\u0445ep.\u04bbce\u0430\u0458 ? new \u0435\u0440\u0430(this.errorContainer(), this.error(), 5.0, c\u04bb\u0455o\u0445po.iho, ec\u0440\u0455.\u0435ph\u0440a\u0445) : null;
        }).\u0458c\u0456\u0440();
        return super.error().io\u0440().\u0458\u0440\u043ei\u0435(x\u0441cs.xip, xi\u0441joc\u04302).\u0458c\u0456\u0440();
    }

    @Override
    public /* synthetic */ xi\u0441joc\u0430 errorDim() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        byte[] byArray = new byte[-1078619865 + 1078619874];
        byArray[0] = -8813244 + 8813300;
        byArray[1] = -1964758875 + 1964758926;
        byArray[2] = -1739722429 + 1739722460;
        byArray[3] = -147507692 + 147507617;
        byArray[4] = -1716009219 + 1716009210;
        byArray[5] = -213294816 + 213294721;
        byArray[-285100102 + 285100108] = -176653364 + 176653404;
        byArray[-289450057 + 289450064] = -1353017331 + 1353017359;
        byArray[-1591029973 + 1591029981] = -1181684298 + 1181684377;
        xi\u0441joc\u0430 xi\u0441joc\u04302 = this.error().io\u0440().\u0445s\u0456cx\u0441((String)((Object)x\u043e\u0456p.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-1284137780 + 1505914987), (int)(-1085237654 + 1811518687)))).\u0458c\u0456\u0440();
        return super.errorDim().io\u0440().\u0458\u0440\u043ei\u0435(x\u0441cs.xip, xi\u0441joc\u04302).\u0458c\u0456\u0440();
    }

    @Override
    public /* synthetic */ xi\u0441joc\u0430 onError() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        byte[] byArray = new byte[-2039659353 + 2039659361];
        byArray[0] = -462685602 + 462685653;
        byArray[1] = -471634205 + 471634215;
        byArray[2] = -171671285 + 171671328;
        byArray[3] = -374009667 + 374009737;
        byArray[4] = 2;
        byArray[5] = -1447969158 + 1447969086;
        byArray[-577003527 + 577003533] = -1314850998 + 1314851117;
        byArray[-1554678379 + 1554678386] = -397399823 + 397399763;
        xi\u0441joc\u0430 xi\u0441joc\u04302 = new ip\u0456hh\u0445().\u0445s\u0456cx\u0441((String)((Object)x\u043e\u0456p.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(143847255 + 50732097), (int)(-1340224662 + 61859939)))).x\u0445\u0445a\u0445ch(\u043e\u0441xc\u0458\u04302 -> {
            if (true | false) {
            }
            return \u043e\u0441xc\u0458\u04302.jshi\u04bb;
        }).s\u0430paih(\u043e\u0441xc\u0458\u04302 -> {
            if (true | false) {
            }
            return this.error();
        }).iea\u0430p\u0441\u0445(\u043e\u0441xc\u0458\u04302 -> {
            if ((3 * 3 + 3) % 2 == 0) {
            }
            return x\u043e\u0456p.hsj\u04bbo\u0441(6.0);
        }).\u0458c\u0456\u0440();
        return super.onError().io\u0440().\u0458\u0440\u043ei\u0435(x\u0441cs.xip, xi\u0441joc\u04302).\u0458c\u0456\u0440();
    }

    @Override
    public /* synthetic */ xi\u0441joc\u0430 errorContainer() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        byte[] byArray = new byte[-169994654 + 169994669];
        byArray[0] = -96172336 + 96172364;
        byArray[1] = -507465046 + 507465083;
        byArray[2] = -615942678 + 615942752;
        byArray[3] = -1637970823 + 1637970791;
        byArray[4] = -2108631275 + 2108631241;
        byArray[5] = -235988368 + 235988354;
        byArray[-2067609577 + 2067609583] = -91846797 + 91846840;
        byArray[-929048924 + 929048931] = -108913049 + 108913157;
        byArray[-419438020 + 419438028] = -1361197086 + 1361196984;
        byArray[-1046711984 + 1046711993] = -1439002034 + 1439001994;
        byArray[-1060784540 + 1060784550] = -2138843205 + 2138843266;
        byArray[-1401063432 + 1401063443] = -1031180875 + 1031180985;
        byArray[-1173794081 + 1173794093] = -605546356 + 605546293;
        byArray[-577687340 + 577687353] = -684935935 + 684935976;
        byArray[-153491820 + 153491834] = -254507996 + 254508052;
        xi\u0441joc\u0430 xi\u0441joc\u04302 = new ip\u0456hh\u0445().\u0445s\u0456cx\u0441((String)((Object)x\u043e\u0456p.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-2077440877 + 727247602), (int)(-849503737 + 905734482)))).x\u0445\u0445a\u0445ch(\u043e\u0441xc\u0458\u04302 -> {
            if (true | false) {
            }
            return \u043e\u0441xc\u0458\u04302.jshi\u04bb;
        }).\u0440\u0458\u04bbc(\u043e\u0441xc\u0458\u04302 -> {
            if ((3 * 3 + 3) % 2 == 0) {
            }
            return x\u043e\u0456p.a_bsm3("valueOf", valueOf(double ), (double)(\u043e\u0441xc\u0458\u04302.s\u0440\u0458\u0440 ? x\u043e\u0456p.s\u0456e(\u043e\u0441xc\u0458\u04302.jshi\u04bb) : x\u043e\u0456p.\u0430\u0456a(\u043e\u0441xc\u0458\u04302.jshi\u04bb)));
        }).x\u0441cc\u0445(true).s\u0430paih(\u043e\u0441xc\u0458\u04302 -> {
            if (2 * 2 * 2 >= 0) {
            }
            return this.highestSurface((\u043e\u0441xc\u0458\u0430)\u043e\u0441xc\u0458\u04302);
        }).iea\u0430p\u0441\u0445(\u043e\u0441xc\u0458\u04302 -> {
            if (true | false) {
            }
            return \u043e\u0441xc\u0458\u04302.i\u0430xp\u0458 > 0.0 ? x\u043e\u0456p.hsj\u04bbo\u0441(1.5) : null;
        }).\u0458c\u0456\u0440();
        return super.errorContainer().io\u0440().\u0458\u0440\u043ei\u0435(x\u0441cs.xip, xi\u0441joc\u04302).\u0458c\u0456\u0440();
    }

    @Override
    public /* synthetic */ xi\u0441joc\u0430 onErrorContainer() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        byte[] byArray = new byte[-986496140 + 986496158];
        byArray[0] = -1337752331 + 1337752213;
        byArray[1] = -34978887 + 34978928;
        byArray[2] = -1157120938 + 1157120833;
        byArray[3] = -854513515 + 854513639;
        byArray[4] = -1769130019 + 1769130134;
        byArray[5] = -1335095047 + 1335095145;
        byArray[-193884193 + 193884199] = -1126041322 + 1126041226;
        byArray[-1874406163 + 1874406170] = -1389762972 + 1389762948;
        byArray[-1028570887 + 1028570895] = -548624772 + 548624764;
        byArray[-1423413003 + 1423413012] = -1096453949 + 1096454052;
        byArray[-52995370 + 52995380] = -1271609306 + 1271609208;
        byArray[-601692847 + 601692858] = -740523307 + 740523356;
        byArray[-354067440 + 354067452] = -14942575 + 14942494;
        byArray[-872061936 + 872061949] = -1089571449 + 1089571555;
        byArray[-140139764 + 140139778] = -656905515 + 656905529;
        byArray[-1400579221 + 1400579236] = -1716891668 + 1716891684;
        byArray[-1998953646 + 1998953662] = -1421449101 + 1421448985;
        byArray[-1319898611 + 1319898628] = -1531701072 + 1531700978;
        xi\u0441joc\u0430 xi\u0441joc\u04302 = new ip\u0456hh\u0445().\u0445s\u0456cx\u0441((String)((Object)x\u043e\u0456p.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-1267293580 + 332473811), (int)(-1792186642 + 1256225055)))).x\u0445\u0445a\u0445ch(\u043e\u0441xc\u0458\u04302 -> {
            if (true | false) {
            }
            return \u043e\u0441xc\u0458\u04302.jshi\u04bb;
        }).s\u0430paih(\u043e\u0441xc\u0458\u04302 -> {
            if (2 * 2 * 2 >= 0) {
            }
            return this.errorContainer();
        }).iea\u0430p\u0441\u0445(\u043e\u0441xc\u0458\u04302 -> {
            if (true | false) {
            }
            return x\u043e\u0456p.hsj\u04bbo\u0441(6.0);
        }).\u0458c\u0456\u0440();
        return super.onErrorContainer().io\u0440().\u0458\u0440\u043ei\u0435(x\u0441cs.xip, xi\u0441joc\u04302).\u0458c\u0456\u0440();
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

