/*
 * Decompiled with CFR 0.152.
 */
package \u04bb\u04bb\u0456\u0445;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import \u04bb\u04bb\u0456\u0445.xoh;
import \u04bb\u04bb\u0456\u0445.\u04bb\u0441\u0456\u0440o;

public class \u0456\u0441ec\u0456\u0458 {
    static final /* synthetic */ double[][] \u0430h\u04bb;
    static final /* synthetic */ double[][] \u04bbcjox\u04bb;
    static final /* synthetic */ double[] \u0455\u04bbcj\u0445s;
    static final /* synthetic */ double[] i\u0440s;

    private \u0456\u0441ec\u0456\u0458() {
        if (true | false) {
        }
    }

    static /* synthetic */ double spjh\u0435(double d) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return (d + Math.PI * 8) % (Math.PI * 2);
    }

    static /* synthetic */ double s\u04bb\u043es\u04bba(double d) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        double d2 = d / 100.0;
        double d3 = 0.0;
        d3 = d2 <= 0.0031308 ? d2 * 12.92 : 1.055 * \u0456\u0441ec\u0456\u0458.a_bsm0("pow", pow(double double ), (double)d2, (double)0.4166666666666667) - 0.055;
        return d3 * 255.0;
    }

    static /* synthetic */ double ep\u0430(double d) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        CallSite callSite = \u0456\u0441ec\u0456\u0458.a_bsm0("pow", pow(double double ), (double)\u0456\u0441ec\u0456\u0458.a_bsm1("abs", abs(double ), (double)d), (double)0.42);
        return (double)\u0456\u0441ec\u0456\u0458.a_bsm2("\u0458is\u0440cai", \u0458is\u0440cai(double ), (double)d) * 400.0 * callSite / (callSite + 27.13);
    }

    static /* synthetic */ double c\u0440\u0440(double[] dArray) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        CallSite callSite = \u0456\u0441ec\u0456\u0458.a_bsm3("\u0435\u0440h", \u0435\u0440h(double[] double[][] ), (double[])dArray, (double[][])\u0430h\u04bb);
        double d = \u0456\u0441ec\u0456\u0458.ep\u0430((double)callSite[0]);
        double d2 = \u0456\u0441ec\u0456\u0458.ep\u0430((double)callSite[1]);
        double d3 = \u0456\u0441ec\u0456\u0458.ep\u0430((double)callSite[2]);
        double d4 = (11.0 * d + -12.0 * d2 + d3) / 11.0;
        double d5 = (d + d2 - 2.0 * d3) / 9.0;
        return (double)\u0456\u0441ec\u0456\u0458.a_bsm4("atan2", atan2(double double ), (double)d5, (double)d4);
    }

    static /* synthetic */ boolean \u043e\u0435s\u0441op\u0445(double d, double d2, double d3) {
        double d4;
        double d5;
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return (d5 = \u0456\u0441ec\u0456\u0458.spjh\u0435(d2 - d)) < (d4 = \u0456\u0441ec\u0456\u0458.spjh\u0435(d3 - d));
    }

    static /* synthetic */ double h\u0440\u0430\u0445pi(double d, double d2, double d3) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return (d2 - d) / (d3 - d);
    }

    static /* synthetic */ double[] \u0458\u0435\u0458a\u043ec(double[] dArray, double d, double[] dArray2) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return new double[]{dArray[0] + (dArray2[0] - dArray[0]) * d, dArray[1] + (dArray2[1] - dArray[1]) * d, dArray[2] + (dArray2[2] - dArray[2]) * d};
    }

    static /* synthetic */ double[] \u0430\u043ejj\u0458\u043e(double[] dArray, double d, double[] dArray2, int n) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        double d2 = \u0456\u0441ec\u0456\u0458.h\u0440\u0430\u0445pi(dArray[n], d, dArray2[n]);
        return \u0456\u0441ec\u0456\u0458.\u0458\u0435\u0458a\u043ec(dArray, d2, dArray2);
    }

    static /* synthetic */ boolean hxi(double d) {
        boolean bl;
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (0.0 <= d && d <= 100.0) {
            bl = true;
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
            bl = false;
        }
        return bl;
    }

    static /* synthetic */ double[] s\u0441\u04bb\u0440(double d, int n) {
        double d2;
        double d3;
        if (true | false) {
        }
        if (0 != 0) {
        }
        double d4 = \u0455\u04bbcj\u0445s[0];
        double d5 = \u0455\u04bbcj\u0445s[1];
        double d6 = \u0455\u04bbcj\u0445s[2];
        if (n % 4 <= 1) {
            d3 = 0.0;
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
            d3 = 100.0;
        }
        double d7 = d3;
        double d8 = d2 = n % 2 == 0 ? 0.0 : 100.0;
        if (n < 4) {
            double d9 = d7;
            double d10 = d2;
            double d11 = (d - d9 * d5 - d10 * d6) / d4;
            if (\u0456\u0441ec\u0456\u0458.hxi(d11)) {
                return new double[]{d11, d9, d10};
            }
            return new double[]{-1.0, -1.0, -1.0};
        }
        if (n < -1058402531 + 1058402539) {
            double d12 = d2;
            double d13 = d7;
            double d14 = (d - d12 * d4 - d13 * d6) / d5;
            if (\u0456\u0441ec\u0456\u0458.hxi(d14)) {
                return new double[]{d12, d14, d13};
            }
            return new double[]{-1.0, -1.0, -1.0};
        }
        double d15 = d7;
        double d16 = d2;
        double d17 = (d - d15 * d4 - d16 * d5) / d6;
        if (\u0456\u0441ec\u0456\u0458.hxi(d17)) {
            return new double[]{d15, d16, d17};
        }
        return new double[]{-1.0, -1.0, -1.0};
    }

    static /* synthetic */ double[][] \u0430is\u0441\u043eh(double d, double d2) {
        double[] dArray;
        if (true | false) {
        }
        if (0 != 0) {
        }
        double[] dArray2 = dArray = new double[]{-1.0, -1.0, -1.0};
        double d3 = 0.0;
        double d4 = 0.0;
        boolean bl = false;
        boolean bl2 = true;
        for (int i = 0; i < -1990493735 + 1990493747; ++i) {
            double[] dArray3 = \u0456\u0441ec\u0456\u0458.s\u0441\u04bb\u0440(d, i);
            if (dArray3[0] < 0.0) continue;
            double d5 = \u0456\u0441ec\u0456\u0458.c\u0440\u0440(dArray3);
            if (!bl) {
                dArray = dArray3;
                dArray2 = dArray3;
                d3 = d5;
                d4 = d5;
                bl = true;
                continue;
            }
            if (!bl2 && !\u0456\u0441ec\u0456\u0458.\u043e\u0435s\u0441op\u0445(d3, d5, d4)) continue;
            bl2 = false;
            if (\u0456\u0441ec\u0456\u0458.\u043e\u0435s\u0441op\u0445(d3, d2, d5)) {
                dArray2 = dArray3;
                d4 = d5;
                continue;
            }
            dArray = dArray3;
            d3 = d5;
        }
        return new double[][]{dArray, dArray2};
    }

    static /* synthetic */ double[] j\u0456o\u0455(double[] dArray, double[] dArray2) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return new double[]{(dArray[0] + dArray2[0]) / 2.0, (dArray[1] + dArray2[1]) / 2.0, (dArray[2] + dArray2[2]) / 2.0};
    }

    static /* synthetic */ int \u0445\u0435eo\u0458(double d) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return (int)\u0456\u0441ec\u0456\u0458.a_bsm5("floor", floor(double ), (double)(d - 0.5));
    }

    static /* synthetic */ int ao\u0455\u043eci(double d) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return (int)\u0456\u0441ec\u0456\u0458.a_bsm6("ceil", ceil(double ), (double)(d - 0.5));
    }

    static /* synthetic */ double[] c\u0456p\u0441a\u0430\u0440(double d, double d2) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        double[][] dArray = \u0456\u0441ec\u0456\u0458.\u0430is\u0441\u043eh(d, d2);
        double[] dArray2 = dArray[0];
        double d3 = \u0456\u0441ec\u0456\u0458.c\u0440\u0440(dArray2);
        double[] dArray3 = dArray[1];
        block4: for (int i = 0; i < 3; ++i) {
            if (dArray2[i] != dArray3[i]) {
                int n = -1;
                int n2 = -254451431 + 254451686;
                if (dArray2[i] < dArray3[i]) {
                    n = \u0456\u0441ec\u0456\u0458.\u0445\u0435eo\u0458(\u0456\u0441ec\u0456\u0458.s\u04bb\u043es\u04bba(dArray2[i]));
                    n2 = \u0456\u0441ec\u0456\u0458.ao\u0455\u043eci(\u0456\u0441ec\u0456\u0458.s\u04bb\u043es\u04bba(dArray3[i]));
                } else {
                    n = \u0456\u0441ec\u0456\u0458.ao\u0455\u043eci(\u0456\u0441ec\u0456\u0458.s\u04bb\u043es\u04bba(dArray2[i]));
                    n2 = \u0456\u0441ec\u0456\u0458.\u0445\u0435eo\u0458(\u0456\u0441ec\u0456\u0458.s\u04bb\u043es\u04bba(dArray3[i]));
                }
                for (int j = 0; j < -1273923615 + 1273923623 && \u0456\u0441ec\u0456\u0458.a_bsm7("abs", abs(int ), (int)(n2 - n)) > true; ++j) {
                    int n3 = (int)\u0456\u0441ec\u0456\u0458.a_bsm5("floor", floor(double ), (double)((double)(n + n2) / 2.0));
                    double d4 = i\u0440s[n3];
                    double[] dArray4 = \u0456\u0441ec\u0456\u0458.\u0430\u043ejj\u0458\u043e(dArray2, d4, dArray3, i);
                    double d5 = \u0456\u0441ec\u0456\u0458.c\u0440\u0440(dArray4);
                    if (\u0456\u0441ec\u0456\u0458.\u043e\u0435s\u0441op\u0445(d3, d2, d5)) {
                        dArray3 = dArray4;
                        n2 = n3;
                        continue;
                    }
                    dArray2 = dArray4;
                    d3 = d5;
                    n = n3;
                }
            }
            switch (0) {
                default: {
                    continue block4;
                }
                case 1: {
                    continue block4;
                }
                case 2: 
            }
        }
        return \u0456\u0441ec\u0456\u0458.j\u0456o\u0455(dArray2, dArray3);
    }

    static /* synthetic */ double \u0455i\u0455(double d) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        CallSite callSite = \u0456\u0441ec\u0456\u0458.a_bsm1("abs", abs(double ), (double)d);
        CallSite callSite2 = \u0456\u0441ec\u0456\u0458.a_bsm8("max", max(double double ), (double)0.0, (double)(27.13 * callSite / (400.0 - callSite)));
        return (double)\u0456\u0441ec\u0456\u0458.a_bsm2("\u0458is\u0440cai", \u0458is\u0440cai(double ), (double)d) * \u0456\u0441ec\u0456\u0458.a_bsm0("pow", pow(double double ), (double)callSite2, (double)2.380952380952381);
    }

    static /* synthetic */ int \u0455ixe(double d, double d2, double d3) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        reference var6_3 = \u0456\u0441ec\u0456\u0458.a_bsm9("sqrt", sqrt(double ), (double)d3) * 11.0;
        xoh xoh2 = xoh.\u04bbc\u043epsh;
        double d4 = 1.0 / \u0456\u0441ec\u0456\u0458.a_bsm0("pow", pow(double double ), (double)(1.64 - \u0456\u0441ec\u0456\u0458.a_bsm0("pow", pow(double double ), (double)0.29, (double)xoh2.s\u04bb\u0430())), (double)0.73);
        double d5 = 0.25 * (\u0456\u0441ec\u0456\u0458.a_bsm10("cos", cos(double ), (double)(d + 2.0)) + 3.8);
        double d6 = d5 * 3846.153846153846 * xoh2.\u0430p\u043eci() * xoh2.\u0455x\u04bb\u0455\u0441\u0458();
        CallSite callSite = \u0456\u0441ec\u0456\u0458.a_bsm11("sin", sin(double ), (double)d);
        CallSite callSite2 = \u0456\u0441ec\u0456\u0458.a_bsm10("cos", cos(double ), (double)d);
        for (int i = 0; i < 5; ++i) {
            double d7;
            double d8;
            reference var20_11 = var6_3 / 100.0;
            double d9 = d2 == 0.0 || var6_3 == 0.0 ? 0.0 : d2 / \u0456\u0441ec\u0456\u0458.a_bsm9("sqrt", sqrt(double ), (double)var20_11);
            CallSite callSite3 = \u0456\u0441ec\u0456\u0458.a_bsm0("pow", pow(double double ), (double)(d9 * d4), (double)1.1111111111111112);
            double d10 = xoh2.hpo\u0445() * \u0456\u0441ec\u0456\u0458.a_bsm0("pow", pow(double double ), (double)var20_11, (double)(1.0 / xoh2.\u0445\u0441\u0456() / xoh2.\u0440\u0456\u0441\u0445\u043e\u04bbo()));
            double d11 = d10 / xoh2.\u0455j\u0441\u0430\u0445();
            double d12 = 23.0 * (d11 + 0.305) * callSite3 / (23.0 * d6 + 11.0 * callSite3 * callSite2 + 108.0 * callSite3 * callSite);
            double d13 = d12 * callSite2;
            double d14 = d12 * callSite;
            double d15 = (460.0 * d11 + 451.0 * d13 + 288.0 * d14) / 1403.0;
            double d16 = (460.0 * d11 - 891.0 * d13 - 261.0 * d14) / 1403.0;
            double d17 = (460.0 * d11 - 220.0 * d13 - 6300.0 * d14) / 1403.0;
            double d18 = \u0456\u0441ec\u0456\u0458.\u0455i\u0455(d15);
            CallSite callSite4 = \u0456\u0441ec\u0456\u0458.a_bsm3("\u0435\u0440h", \u0435\u0440h(double[] double[][] ), (double[])new double[]{d18, d8 = \u0456\u0441ec\u0456\u0458.\u0455i\u0455(d16), d7 = \u0456\u0441ec\u0456\u0458.\u0455i\u0455(d17)}, (double[][])\u04bbcjox\u04bb);
            if (callSite4[0] < 0.0 || callSite4[1] < 0.0 || callSite4[2] < 0.0) {
                return 0;
            }
            double d19 = \u0455\u04bbcj\u0445s[0];
            double d20 = \u0455\u04bbcj\u0445s[1];
            double d21 = \u0455\u04bbcj\u0445s[2];
            double d22 = d19 * callSite4[0] + d20 * callSite4[1] + d21 * callSite4[2];
            if (d22 <= 0.0) {
                return 0;
            }
            if (i == 4 || \u0456\u0441ec\u0456\u0458.a_bsm1("abs", abs(double ), (double)(d22 - d3)) < 0.002) {
                if (callSite4[0] > 100.01 || callSite4[1] > 100.01 || callSite4[2] > 100.01) {
                    return 0;
                }
                return (int)\u0456\u0441ec\u0456\u0458.a_bsm12("s\u0445h\u0440", s\u0445h\u0440(double[] ), (double[])callSite4);
            }
            var6_3 -= (d22 - d3) * var6_3 / (2.0 * d22);
        }
        return 0;
    }

    public static /* synthetic */ int i\u0445e(double object, double d, double d2) {
        CallSite callSite;
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (d < 1.0E-4 || d2 < 1.0E-4 || d2 > 99.9999) {
            return (int)\u0456\u0441ec\u0456\u0458.a_bsm13("p\u04bb\u04bb\u0455\u04bb", p\u04bb\u04bb\u0455\u04bb(double ), (double)d2);
        }
        double d3 = (object = (Object)\u0456\u0441ec\u0456\u0458.a_bsm14("a\u04bbj\u043e\u043ec", a\u04bbj\u043e\u043ec(double ), (double)object)) / 180.0 * Math.PI;
        int n = \u0456\u0441ec\u0456\u0458.\u0455ixe(d3, d, (double)(callSite = \u0456\u0441ec\u0456\u0458.a_bsm15("ox\u0435oo\u0455", ox\u0435oo\u0455(double ), (double)d2)));
        if (n != 0) {
            return n;
        }
        double[] dArray = \u0456\u0441ec\u0456\u0458.c\u0456p\u0441a\u0430\u0440((double)callSite, d3);
        return (int)\u0456\u0441ec\u0456\u0458.a_bsm12("s\u0445h\u0440", s\u0445h\u0440(double[] ), (double[])dArray);
    }

    public static /* synthetic */ \u04bb\u0441\u0456\u0440o \u0440\u0456oi\u0456(double d, double d2, double d3) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return \u0456\u0441ec\u0456\u0458.a_bsm16("h\u043ec\u0430\u043eo", h\u043ec\u0430\u043eo(int ), (int)\u0456\u0441ec\u0456\u0458.i\u0445e(d, d2, d3));
    }

    static {
        \u0430h\u04bb = new double[][]{{0.001200833568784504, 0.002389694492170889, 2.795742885861124E-4}, {5.891086651375999E-4, 0.0029785502573438758, 3.270666104008398E-4}, {1.0146692491640572E-4, 5.364214359186694E-4, 0.0032979401770712076}};
        \u04bbcjox\u04bb = new double[][]{{1373.2198709594231, -1100.4251190754821, -7.278681089101213}, {-271.815969077903, 559.6580465940733, -32.46047482791194}, {1.9622899599665666, -57.173814538844006, 308.7233197812385}};
        \u0455\u04bbcj\u0445s = new double[]{0.2126, 0.7152, 0.0722};
        double[] dArray = new double[-947464043 + 947464298];
        dArray[0] = 0.015176349177441876;
        dArray[1] = 0.045529047532325624;
        dArray[2] = 0.07588174588720938;
        dArray[3] = 0.10623444424209313;
        dArray[4] = 0.13658714259697685;
        dArray[5] = 0.16693984095186062;
        dArray[-1916189750 + 1916189756] = 0.19729253930674434;
        dArray[-134682924 + 134682931] = 0.2276452376616281;
        dArray[-1291171590 + 1291171598] = 0.2579979360165119;
        dArray[-526969094 + 526969103] = 0.28835063437139563;
        dArray[-1774751836 + 1774751846] = 0.3188300904430532;
        dArray[-1012806348 + 1012806359] = 0.350925934958123;
        dArray[-357304605 + 357304617] = 0.3848314933096426;
        dArray[-283107742 + 283107755] = 0.42057480301049466;
        dArray[-381602480 + 381602494] = 0.458183274052838;
        dArray[-103313857 + 103313872] = 0.4976837250274023;
        dArray[-572172223 + 572172239] = 0.5391024159806381;
        dArray[-483194687 + 483194704] = 0.5824650784040898;
        dArray[-1804455953 + 1804455971] = 0.6277969426914107;
        dArray[-1461797484 + 1461797503] = 0.6751227633498623;
        dArray[-1404923891 + 1404923911] = 0.7244668422128921;
        dArray[-1506151040 + 1506151061] = 0.775853049866786;
        dArray[-1195987297 + 1195987319] = 0.829304845476233;
        dArray[-425747354 + 425747377] = 0.8848452951698498;
        dArray[-1979349931 + 1979349955] = 0.942497089126609;
        dArray[-1281570718 + 1281570743] = 1.0022825574869039;
        dArray[-242558460 + 242558486] = 1.0642236851973577;
        dArray[-419989631 + 419989658] = 1.1283421258858297;
        dArray[-1274315213 + 1274315241] = 1.1946592148522128;
        dArray[-1962063548 + 1962063577] = 1.2631959812511864;
        dArray[-351212502 + 351212532] = 1.3339731595349034;
        dArray[-714139586 + 714139617] = 1.407011200216447;
        dArray[-1956572382 + 1956572414] = 1.4823302800086415;
        dArray[-838549067 + 838549100] = 1.5599503113873272;
        dArray[-1647230768 + 1647230802] = 1.6398909516233677;
        dArray[-1993828786 + 1993828821] = 1.7221716113234105;
        dArray[-370438733 + 370438769] = 1.8068114625156377;
        dArray[-608102788 + 608102825] = 1.8938294463134073;
        dArray[-494050295 + 494050333] = 1.9832442801866852;
        dArray[-1980909462 + 1980909501] = 2.075074464868551;
        dArray[-1194562650 + 1194562690] = 2.1693382909216234;
        dArray[-1926153490 + 1926153531] = 2.2660538449872063;
        dArray[-1002724025 + 1002724067] = 2.36523901573795;
        dArray[-1142099489 + 1142099532] = 2.4669114995532007;
        dArray[-1097930913 + 1097930957] = 2.5710888059345764;
        dArray[-190792654 + 190792699] = 2.6777882626779785;
        dArray[-598534980 + 598535026] = 2.7870270208169257;
        dArray[-3806468 + 3806515] = 2.898822059350997;
        dArray[-1334254919 + 1334254967] = 3.0131901897720907;
        dArray[-2123365794 + 2123365843] = 3.1301480604002863;
        dArray[-1637338845 + 1637338895] = 3.2497121605402226;
        dArray[-1897438622 + 1897438673] = 3.3718988244681087;
        dArray[-1227364032 + 1227364084] = 3.4967242352587946;
        dArray[-492649102 + 492649155] = 3.624204428461639;
        dArray[-367465498 + 367465552] = 3.754355295633311;
        dArray[-271641295 + 271641350] = 3.887192587735158;
        dArray[-986161210 + 986161266] = 4.022731918402185;
        dArray[-1654123465 + 1654123522] = 4.160988767090289;
        dArray[-1312093789 + 1312093847] = 4.301978482107941;
        dArray[-1353106410 + 1353106469] = 4.445716283538092;
        dArray[-662677673 + 662677733] = 4.592217266055746;
        dArray[-422106367 + 422106428] = 4.741496401646282;
        dArray[-1809169133 + 1809169195] = 4.893568542229298;
        dArray[-1361573064 + 1361573127] = 5.048448422192488;
        dArray[-1488397936 + 1488398000] = 5.20615066083972;
        dArray[-405653433 + 405653498] = 5.3666897647573375;
        dArray[-972817842 + 972817908] = 5.5300801301023865;
        dArray[-1425767674 + 1425767741] = 5.696336044816294;
        dArray[-1813519273 + 1813519341] = 5.865471690767354;
        dArray[-1556869851 + 1556869920] = 6.037501145825082;
        dArray[-1737195405 + 1737195475] = 6.212438385869475;
        dArray[-1260339222 + 1260339293] = 6.390297286737924;
        dArray[-792024337 + 792024409] = 6.571091626112461;
        dArray[-1694525510 + 1694525583] = 6.7548350853498045;
        dArray[-927549522 + 927549596] = 6.941541251256611;
        dArray[-935799090 + 935799165] = 7.131223617812143;
        dArray[-1302130067 + 1302130143] = 7.323895587840543;
        dArray[-1592269470 + 1592269547] = 7.5195704746346665;
        dArray[-2052542051 + 2052542129] = 7.7182615035334345;
        dArray[-2039337839 + 2039337918] = 7.919981813454504;
        dArray[-10174575 + 10174655] = 8.124744458384042;
        dArray[-1326101797 + 1326101878] = 8.332562408825165;
        dArray[-476005866 + 476005948] = 8.543448553206703;
        dArray[-1196812717 + 1196812800] = 8.757415699253682;
        dArray[-943887367 + 943887451] = 8.974476575321063;
        dArray[-172478406 + 172478491] = 9.194643831691977;
        dArray[-1478728114 + 1478728200] = 9.417930041841839;
        dArray[-1599901532 + 1599901619] = 9.644347703669503;
        dArray[-1845913414 + 1845913502] = 9.873909240696694;
        dArray[-859578670 + 859578759] = 10.106627003236781;
        dArray[-972574627 + 972574717] = 10.342513269534024;
        dArray[-510674034 + 510674125] = 10.58158024687427;
        dArray[-1459481517 + 1459481609] = 10.8238400726681;
        dArray[-124547349 + 124547442] = 11.069304815507364;
        dArray[-562789080 + 562789174] = 11.317986476196008;
        dArray[-348444281 + 348444376] = 11.569896988756009;
        dArray[-89118203 + 89118299] = 11.825048221409341;
        dArray[-1079913627 + 1079913724] = 12.083451977536606;
        dArray[-1963226462 + 1963226560] = 12.345119996613247;
        dArray[-1536430272 + 1536430371] = 12.610063955123938;
        dArray[-100814713 + 100814813] = 12.878295467455942;
        dArray[-874618573 + 874618674] = 13.149826086772048;
        dArray[-2121972620 + 2121972722] = 13.42466730586372;
        dArray[-1824783793 + 1824783896] = 13.702830557985108;
        dArray[-1695314399 + 1695314503] = 13.984327217668513;
        dArray[-1842343750 + 1842343855] = 14.269168601521828;
        dArray[-1169744634 + 1169744740] = 14.55736596900856;
        dArray[-2135337795 + 2135337902] = 14.848930523210871;
        dArray[-28530662 + 28530770] = 15.143873411576273;
        dArray[-557787378 + 557787487] = 15.44220572664832;
        dArray[-147703583 + 147703693] = 15.743938506781891;
        dArray[-1962181766 + 1962181877] = 16.04908273684337;
        dArray[-798190699 + 798190811] = 16.35764934889634;
        dArray[-2144381678 + 2144381791] = 16.66964922287304;
        dArray[-1572185483 + 1572185597] = 16.985093187232053;
        dArray[-1885434459 + 1885434574] = 17.30399201960269;
        dArray[-2111259197 + 2111259313] = 17.62635644741625;
        dArray[-1793230219 + 1793230336] = 17.95219714852476;
        dArray[-426941 + 427059] = 18.281524751807332;
        dArray[-1002313030 + 1002313149] = 18.614349837764564;
        dArray[-1218961027 + 1218961147] = 18.95068293910138;
        dArray[-1228039538 + 1228039659] = 19.290534541298456;
        dArray[-1252448418 + 1252448540] = 19.633915083172692;
        dArray[-1079609948 + 1079610071] = 19.98083495742689;
        dArray[-494337997 + 494338121] = 20.331304511189067;
        dArray[-529059553 + 529059678] = 20.685334046541502;
        dArray[-1825248171 + 1825248297] = 21.042933821039977;
        dArray[-1978486102 + 1978486229] = 21.404114048223256;
        dArray[-1342344117 + 1342344245] = 21.76888489811322;
        dArray[-476941076 + 476941205] = 22.137256497705877;
        dArray[-1382431625 + 1382431755] = 22.50923893145328;
        dArray[-681830856 + 681830987] = 22.884842241736916;
        dArray[-75033905 + 75034037] = 23.264076429332462;
        dArray[-781339070 + 781339203] = 23.6469514538663;
        dArray[-478379656 + 478379790] = 24.033477234264016;
        dArray[-1306807659 + 1306807794] = 24.42366364919083;
        dArray[-1972948345 + 1972948481] = 24.817520537484558;
        dArray[-1143904438 + 1143904575] = 25.21505769858089;
        dArray[-21114501 + 21114639] = 25.61628489293138;
        dArray[-1568058774 + 1568058913] = 26.021211842414342;
        dArray[-1889743247 + 1889743387] = 26.429848230738664;
        dArray[-2128114607 + 2128114748] = 26.842203703840827;
        dArray[-856375949 + 856376091] = 27.258287870275353;
        dArray[-1538593228 + 1538593371] = 27.678110301598522;
        dArray[-589145712 + 589145856] = 28.10168053274597;
        dArray[-1704381984 + 1704382129] = 28.529008062403893;
        dArray[-1924077588 + 1924077734] = 28.96010235337422;
        dArray[-961066350 + 961066497] = 29.39497283293396;
        dArray[-1884472789 + 1884472937] = 29.83362889318845;
        dArray[-1512020290 + 1512020439] = 30.276079891419332;
        dArray[-2047593935 + 2047594085] = 30.722335150426627;
        dArray[-2123797137 + 2123797288] = 31.172403958865512;
        dArray[-148503974 + 148504126] = 31.62629557157785;
        dArray[-1552476216 + 1552476369] = 32.08401920991837;
        dArray[-1078473262 + 1078473416] = 32.54558406207592;
        dArray[-1871742954 + 1871743109] = 33.010999283389665;
        dArray[-1775510524 + 1775510680] = 33.4802739966603;
        dArray[-1246557256 + 1246557413] = 33.953417292456834;
        dArray[-322232186 + 322232344] = 34.430438229418264;
        dArray[-222669798 + 222669957] = 34.911345834551085;
        dArray[-1654194641 + 1654194801] = 35.39614910352207;
        dArray[-1954210631 + 1954210792] = 35.88485700094671;
        dArray[-983875462 + 983875624] = 36.37747846067349;
        dArray[-1684242135 + 1684242298] = 36.87402238606382;
        dArray[-921345607 + 921345771] = 37.37449765026789;
        dArray[-1500140052 + 1500140217] = 37.87891309649659;
        dArray[-1143460117 + 1143460283] = 38.38727753828926;
        dArray[-335728200 + 335728367] = 38.89959975977785;
        dArray[-1141224593 + 1141224761] = 39.41588851594697;
        dArray[-1449510202 + 1449510371] = 39.93615253289054;
        dArray[-455518408 + 455518578] = 40.460400508064545;
        dArray[-2041985905 + 2041986076] = 40.98864111053629;
        dArray[-481517186 + 481517358] = 41.520882981230194;
        dArray[-1570783673 + 1570783846] = 42.05713473317016;
        dArray[-948619202 + 948619376] = 42.597404951718396;
        dArray[-469595846 + 469596021] = 43.141702194811224;
        dArray[-1786158512 + 1786158688] = 43.6900349931913;
        dArray[-512520158 + 512520335] = 44.24241185063697;
        dArray[-1032290778 + 1032290956] = 44.798841244188324;
        dArray[-438264490 + 438264669] = 45.35933162437017;
        dArray[-1622216004 + 1622216184] = 45.92389141541209;
        dArray[-376425039 + 376425220] = 46.49252901546552;
        dArray[-1347997052 + 1347997234] = 47.065252796817916;
        dArray[-1092513601 + 1092513784] = 47.64207110610409;
        dArray[-1959044706 + 1959044890] = 48.22299226451468;
        dArray[-1257405219 + 1257405404] = 48.808024568002054;
        dArray[-596178717 + 596178903] = 49.3971762874833;
        dArray[-69050722 + 69050909] = 49.9904556690408;
        dArray[-678240559 + 678240747] = 50.587870934119984;
        dArray[-1620355374 + 1620355563] = 51.189430279724725;
        dArray[-1579405912 + 1579406102] = 51.79514187861014;
        dArray[-675403435 + 675403626] = 52.40501387947288;
        dArray[-2020220035 + 2020220227] = 53.0190544071392;
        dArray[-360453978 + 360454171] = 53.637271562750364;
        dArray[-214803114 + 214803308] = 54.259673423945976;
        dArray[-1476524208 + 1476524403] = 54.88626804504493;
        dArray[-834393645 + 834393841] = 55.517063457223934;
        dArray[-706287664 + 706287861] = 56.15206766869424;
        dArray[-446535110 + 446535308] = 56.79128866487574;
        dArray[-957477195 + 957477394] = 57.43473440856916;
        dArray[-902225373 + 902225573] = 58.08241284012621;
        dArray[-1389361014 + 1389361215] = 58.734331877617365;
        dArray[-1216301462 + 1216301664] = 59.39049941699807;
        dArray[-767513111 + 767513314] = 60.05092333227251;
        dArray[-1179634866 + 1179635070] = 60.715611475655585;
        dArray[-407116787 + 407116992] = 61.38457167773311;
        dArray[-140277712 + 140277918] = 62.057811747619894;
        dArray[-1406386424 + 1406386631] = 62.7353394731159;
        dArray[-738634593 + 738634801] = 63.417162620860914;
        dArray[-422855502 + 422855711] = 64.10328893648692;
        dArray[-369590576 + 369590786] = 64.79372614476921;
        dArray[-2130729937 + 2130730148] = 65.48848194977529;
        dArray[-367677694 + 367677906] = 66.18756403501224;
        dArray[-2099993109 + 2099993322] = 66.89098006357258;
        dArray[-208745047 + 208745261] = 67.59873767827808;
        dArray[-345400665 + 345400880] = 68.31084450182222;
        dArray[-2143724650 + 2143724866] = 69.02730813691093;
        dArray[-1086296537 + 1086296754] = 69.74813616640164;
        dArray[-1841282112 + 1841282330] = 70.47333615344107;
        dArray[-2097458440 + 2097458659] = 71.20291564160104;
        dArray[-1595230810 + 1595231030] = 71.93688215501312;
        dArray[-1255241590 + 1255241811] = 72.67524319850172;
        dArray[-503478875 + 503479097] = 73.41800625771542;
        dArray[-307643435 + 307643658] = 74.16517879925733;
        dArray[-238479871 + 238480095] = 74.9167682708136;
        dArray[-1079438192 + 1079438417] = 75.67278210128072;
        dArray[-1646116936 + 1646117162] = 76.43322770089146;
        dArray[-2028352023 + 2028352250] = 77.1981124613393;
        dArray[-2129908311 + 2129908539] = 77.96744375590167;
        dArray[-635043448 + 635043677] = 78.74122893956174;
        dArray[-549685553 + 549685783] = 79.51947534912904;
        dArray[-1774516602 + 1774516833] = 80.30219030335869;
        dArray[-555051536 + 555051768] = 81.08938110306934;
        dArray[-17945615 + 17945848] = 81.88105503125999;
        dArray[-1971421892 + 1971422126] = 82.67721935322541;
        dArray[-1476911308 + 1476911543] = 83.4778813166706;
        dArray[-626422804 + 626423040] = 84.28304815182372;
        dArray[-301714754 + 301714991] = 85.09272707154808;
        dArray[-1136299468 + 1136299706] = 85.90692527145302;
        dArray[-1216810981 + 1216811220] = 86.72564993000343;
        dArray[-108974774 + 108975014] = 87.54890820862819;
        dArray[-2076007827 + 2076008068] = 88.3767072518277;
        dArray[-1080651371 + 1080651613] = 89.2090541872801;
        dArray[-630109353 + 630109596] = 90.04595612594655;
        dArray[-48239479 + 48239723] = 90.88742016217518;
        dArray[-1853557752 + 1853557997] = 91.73345337380438;
        dArray[-392955382 + 392955628] = 92.58406282226491;
        dArray[-383287518 + 383287765] = 93.43925555268066;
        dArray[-1379052916 + 1379053164] = 94.29903859396902;
        dArray[-1381450236 + 1381450485] = 95.16341895893969;
        dArray[-393351277 + 393351527] = 96.03240364439274;
        dArray[-753267486 + 753267737] = 96.9059996312159;
        dArray[-1403550832 + 1403551084] = 97.78421388448044;
        dArray[-420719364 + 420719617] = 98.6670533535366;
        dArray[-2082471829 + 2082472083] = 99.55452497210776;
        i\u0440s = dArray;
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

