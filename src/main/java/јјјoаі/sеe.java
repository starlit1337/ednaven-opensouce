/*
 * Decompiled with CFR 0.152.
 */
package \u0458\u0458\u0458o\u0430\u0456;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_1297;
import net.minecraft.class_1922;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_2382;
import net.minecraft.class_243;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_3726;
import net.minecraft.class_3965;
import \u0458\u0458\u0458o\u0430\u0456.e\u0445\u0440\u0440a;
import \u0458\u0458\u0458o\u0430\u0456.xx\u0458;

public final class s\u0435e {
    private static final /* synthetic */ class_310 cah\u0456ci;
    private static final /* synthetic */ double c\u0440\u0445 = 4.5;
    private static final /* synthetic */ double[] c\u0430ceoo\u0455;

    public static /* synthetic */ float \u04bb\u0440\u0458\u0441\u0455o\u0458(float f, float f2) {
        Object object;
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if ((object = s\u0435e.a_bsm0("abs", abs(float ), (float)(f - f2)) % 360.0f) > 180.0f) {
            object = 0.0f;
        }
        return (float)object;
    }

    private static /* synthetic */ e\u0445\u0440\u0440a aje(class_243 class_2432, class_243 class_2433) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        class_243 class_2434 = class_2433.method_1020(class_2432);
        CallSite callSite = s\u0435e.a_bsm1("hypot", hypot(double double ), (double)class_2434.field_1352, (double)class_2434.field_1350);
        float f = (float)(s\u0435e.a_bsm3("toDegrees", toDegrees(double ), (double)s\u0435e.a_bsm2("atan2", atan2(double double ), (double)class_2434.field_1350, (double)class_2434.field_1352)) - 90.0);
        float f2 = (float)(-s\u0435e.a_bsm3("toDegrees", toDegrees(double ), (double)s\u0435e.a_bsm2("atan2", atan2(double double ), (double)class_2434.field_1351, (double)callSite)));
        if (s\u0435e.cah\u0456ci.field_1724 != null) {
            float f3 = s\u0435e.cah\u0456ci.field_1724.method_36454();
            f = f3 + s\u0435e.a_bsm4("method_15393", method_15393(float ), (float)(f - f3));
        } else {
            f = (float)s\u0435e.a_bsm4("method_15393", method_15393(float ), (float)f);
        }
        return new e\u0445\u0440\u0440a(f, (float)s\u0435e.a_bsm5("method_15363", method_15363(float float float ), (float)f2, (float)-90.0f, (float)90.0f));
    }

    public static /* synthetic */ e\u0445\u0440\u0440a oeo(class_243 class_2432, class_243 class_2433) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return s\u0435e.aje(class_2432, class_2433);
    }

    public static /* synthetic */ e\u0445\u0440\u0440a \u0435ea\u0435\u0440(class_243 class_2432) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (s\u0435e.cah\u0456ci.field_1724 == null) {
            return null;
        }
        return s\u0435e.aje(s\u0435e.cah\u0456ci.field_1724.method_33571(), class_2432);
    }

    public static /* synthetic */ e\u0445\u0440\u0440a x\u0445p(class_1297 class_12972) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if (s\u0435e.cah\u0456ci.field_1724 == null) {
            return null;
        }
        CallSite callSite = s\u0435e.a_bsm6("clamp", clamp(double double double ), (double)(s\u0435e.cah\u0456ci.field_1724.method_23318() - class_12972.method_23318() + (double)s\u0435e.cah\u0456ci.field_1724.method_5751()), (double)0.0, (double)((class_12972.method_5829().field_1325 - class_12972.method_5829().field_1322) * 0.85));
        return s\u0435e.aje(s\u0435e.cah\u0456ci.field_1724.method_33571(), class_12972.method_19538().method_1031(0.0, (double)callSite, 0.0));
    }

    public static /* synthetic */ class_243 \u0455x\u04bbe(class_2338 class_23382, class_2350 class_23502) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if (s\u0435e.cah\u0456ci.field_1687 == null) {
            return s\u0435e.a_bsm7("method_24953", method_24953(net.minecraft.class_2382 ), (class_2382)class_23382);
        }
        class_2680 class_26802 = s\u0435e.cah\u0456ci.field_1687.method_8320(class_23382);
        class_265 class_2652 = class_26802.method_26220((class_1922)s\u0435e.cah\u0456ci.field_1687, class_23382);
        if (class_2652.method_1110()) {
            return class_23502 == null ? s\u0435e.a_bsm7("method_24953", method_24953(net.minecraft.class_2382 ), (class_2382)class_23382) : s\u0435e.a_bsm7("method_24953", method_24953(net.minecraft.class_2382 ), (class_2382)class_23382).method_1019(s\u0435e.a_bsm8("method_24954", method_24954(net.minecraft.class_2382 ), (class_2382)class_23502.method_10163()).method_1021(0.5));
        }
        class_238 class_2383 = class_2652.method_1107().method_996(class_23382);
        double d = class_2383.field_1323 + (class_2383.field_1320 - class_2383.field_1323) / 2.0;
        double d2 = class_2383.field_1322 + (class_2383.field_1325 - class_2383.field_1322) / 2.0;
        double d3 = class_2383.field_1321 + (class_2383.field_1324 - class_2383.field_1321) / 2.0;
        if (class_23502 != null) {
            block0 : switch (xx\u0458.\u0435p\u0458\u0445p[class_23502.ordinal()]) {
                case 1: {
                    d2 = class_2383.field_1325;
                    break;
                }
                case 2: {
                    d2 = class_2383.field_1322;
                    break;
                }
                case 3: {
                    d3 = class_2383.field_1321;
                    switch (0) {
                        default: {
                            break block0;
                        }
                        case 1: {
                            break block0;
                        }
                        case 2: 
                    }
                    break;
                }
                case 4: {
                    d3 = class_2383.field_1324;
                    break;
                }
                case 5: {
                    d = class_2383.field_1323;
                    break;
                }
                case 6: {
                    d = class_2383.field_1320;
                }
            }
        }
        return new class_243(d, d2, d3);
    }

    public static /* synthetic */ e\u0445\u0440\u0440a \u0458h\u0456xxh(class_2338 class_23382) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (s\u0435e.cah\u0456ci.field_1724 == null) {
            return null;
        }
        return s\u0435e.aje(s\u0435e.cah\u0456ci.field_1724.method_33571(), s\u0435e.\u0455x\u04bbe(class_23382, null));
    }

    public static /* synthetic */ e\u0445\u0440\u0440a \u0456\u0456\u04bb(class_2338 class_23382, class_2350 class_23502) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        if (s\u0435e.cah\u0456ci.field_1724 == null) {
            return null;
        }
        return s\u0435e.aje(s\u0435e.cah\u0456ci.field_1724.method_33571(), s\u0435e.\u0455x\u04bbe(class_23382, class_23502));
    }

    public static /* synthetic */ class_243 \u0456p\u0458h(class_243 class_2432, class_238 class_2383) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return new class_243((double)s\u0435e.a_bsm9("method_15350", method_15350(double double double ), (double)class_2432.field_1352, (double)class_2383.field_1323, (double)class_2383.field_1320), (double)s\u0435e.a_bsm9("method_15350", method_15350(double double double ), (double)class_2432.field_1351, (double)class_2383.field_1322, (double)class_2383.field_1325), (double)s\u0435e.a_bsm9("method_15350", method_15350(double double double ), (double)class_2432.field_1350, (double)class_2383.field_1321, (double)class_2383.field_1324));
    }

    public static /* synthetic */ class_243 \u043e\u0456xj\u0441a(e\u0445\u0440\u0440a e\u0445\u0440\u0440a2) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        float f = e\u0445\u0440\u0440a2.jo\u0456c\u043e\u0440();
        float f2 = e\u0445\u0440\u0440a2.xpx();
        CallSite callSite = s\u0435e.a_bsm10("method_15362", method_15362(float ), (float)(-f * ((float)Math.PI / 180) - (float)Math.PI));
        CallSite callSite2 = s\u0435e.a_bsm11("method_15374", method_15374(float ), (float)(-f * ((float)Math.PI / 180) - (float)Math.PI));
        CallSite callSite3 = -s\u0435e.a_bsm10("method_15362", method_15362(float ), (float)(-f2 * ((float)Math.PI / 180)));
        CallSite callSite4 = s\u0435e.a_bsm11("method_15374", method_15374(float ), (float)(-f2 * ((float)Math.PI / 180)));
        return new class_243((double)(callSite2 * callSite3), (double)callSite4, (double)(callSite * callSite3));
    }

    public static /* synthetic */ e\u0445\u0440\u0440a j\u04bb\u0456\u0435\u043ea(e\u0445\u0440\u0440a e\u0445\u0440\u0440a2, e\u0445\u0440\u0440a e\u0445\u0440\u0440a3, double d) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        if (e\u0445\u0440\u0440a2 == null || e\u0445\u0440\u0440a3 == null) {
            return e\u0445\u0440\u0440a3;
        }
        if (d <= 0.0) {
            return e\u0445\u0440\u0440a2;
        }
        CallSite callSite = s\u0435e.a_bsm4("method_15393", method_15393(float ), (float)(e\u0445\u0440\u0440a3.jo\u0456c\u043e\u0440() - e\u0445\u0440\u0440a2.jo\u0456c\u043e\u0440()));
        float f = e\u0445\u0440\u0440a3.xpx() - e\u0445\u0440\u0440a2.xpx();
        CallSite callSite2 = s\u0435e.a_bsm5("method_15363", method_15363(float float float ), (float)callSite, (float)((float)(-d)), (float)((float)d));
        CallSite callSite3 = s\u0435e.a_bsm5("method_15363", method_15363(float float float ), (float)f, (float)((float)(-d)), (float)((float)d));
        return new e\u0445\u0440\u0440a(e\u0445\u0440\u0440a2.jo\u0456c\u043e\u0440() + callSite2, (float)s\u0435e.a_bsm5("method_15363", method_15363(float float float ), (float)(e\u0445\u0440\u0440a2.xpx() + callSite3), (float)-90.0f, (float)90.0f));
    }

    public static /* synthetic */ e\u0445\u0440\u0440a \u0440sh\u0445\u04bb(e\u0445\u0440\u0440a e\u0445\u0440\u0440a2, e\u0445\u0440\u0440a e\u0445\u0440\u0440a3, double d) {
        float f;
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (e\u0445\u0440\u0440a2 == null || e\u0445\u0440\u0440a3 == null) {
            return e\u0445\u0440\u0440a3;
        }
        CallSite callSite = s\u0435e.a_bsm4("method_15393", method_15393(float ), (float)(e\u0445\u0440\u0440a3.jo\u0456c\u043e\u0440() - e\u0445\u0440\u0440a2.jo\u0456c\u043e\u0440()));
        CallSite callSite2 = s\u0435e.a_bsm1("hypot", hypot(double double ), (double)((double)callSite), (double)(f = e\u0445\u0440\u0440a3.xpx() - e\u0445\u0440\u0440a2.xpx()));
        if (callSite2 < 0.05) {
            return e\u0445\u0440\u0440a3;
        }
        return s\u0435e.x\u0435a(s\u0435e.j\u04bb\u0456\u0435\u043ea(e\u0445\u0440\u0440a2, e\u0445\u0440\u0440a3, d), e\u0445\u0440\u0440a2);
    }

    public static /* synthetic */ e\u0445\u0440\u0440a x\u0435a(e\u0445\u0440\u0440a e\u0445\u0440\u0440a2, e\u0445\u0440\u0440a e\u0445\u0440\u0440a3) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        float f = ((Double)s\u0435e.cah\u0456ci.field_1690.method_42495().method_41753()).floatValue();
        float f2 = f * 0.6f + 0.2f;
        float f3 = f2 * f2 * f2 * 8.0f;
        double d = (double)f3 * (double)0.15f;
        float f4 = e\u0445\u0440\u0440a3.jo\u0456c\u043e\u0440() + (float)s\u0435e.a_bsm12("round", round(double ), (double)((double)(e\u0445\u0440\u0440a2.jo\u0456c\u043e\u0440() - e\u0445\u0440\u0440a3.jo\u0456c\u043e\u0440()) / d)) * (float)d;
        float f5 = e\u0445\u0440\u0440a3.xpx() + (float)s\u0435e.a_bsm12("round", round(double ), (double)((double)(e\u0445\u0440\u0440a2.xpx() - e\u0445\u0440\u0440a3.xpx()) / d)) * (float)d;
        return new e\u0445\u0440\u0440a(f4, (float)s\u0435e.a_bsm5("method_15363", method_15363(float float float ), (float)f5, (float)-90.0f, (float)90.0f));
    }

    public static /* synthetic */ e\u0445\u0440\u0440a \u0456hhpo(class_2338 class_23382, class_2350 class_23502, e\u0445\u0440\u0440a e\u0445\u0440\u0440a2) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if (s\u0435e.cah\u0456ci.field_1724 == null || s\u0435e.cah\u0456ci.field_1687 == null || class_23382 == null || class_23502 == null || e\u0445\u0440\u0440a2 == null) {
            return null;
        }
        class_2680 class_26802 = s\u0435e.cah\u0456ci.field_1687.method_8320(class_23382);
        class_265 class_2652 = class_26802.method_26194((class_1922)s\u0435e.cah\u0456ci.field_1687, class_23382, (class_3726)s\u0435e.a_bsm13("method_16195", method_16195(net.minecraft.class_1297 ), (class_1297)s\u0435e.cah\u0456ci.field_1724));
        if (class_2652.method_1110()) {
            return null;
        }
        class_243 class_2432 = s\u0435e.cah\u0456ci.field_1724.method_5836(1.0f);
        e\u0445\u0440\u0440a e\u0445\u0440\u0440a3 = null;
        double d = Double.MAX_VALUE;
        for (class_238 class_2383 : class_2652.method_1090()) {
            class_238 class_2384 = class_2383.method_996(class_23382);
            for (double d2 : c\u0430ceoo\u0455) {
                for (double d3 : c\u0430ceoo\u0455) {
                    double d4;
                    double d5;
                    double d6;
                    e\u0445\u0440\u0440a e\u0445\u0440\u0440a4;
                    class_243 class_2433 = s\u0435e.poc(class_2384, class_23502, d2, d3);
                    if (class_2432.method_1025(class_2433) > 20.25 || s\u0435e.a_bsm15("\u0458ojo\u043ejo", \u0458ojo\u043ejo(net.minecraft.class_3965 net.minecraft.class_2338 net.minecraft.class_2350 ), (class_3965)s\u0435e.a_bsm14("\u0445a\u0455e\u0445j\u0458", \u0445a\u0455e\u0445j\u0458(\u0458\u0458\u0458o\u0430\u0456.e\u0445\u0440\u0440a double ), (e\u0445\u0440\u0440a)(e\u0445\u0440\u0440a4 = s\u0435e.oeo(class_2432, class_2433)), (double)4.5), (class_2338)class_23382, (class_2350)class_23502) == false || !((d6 = (d5 = (double)s\u0435e.a_bsm4("method_15393", method_15393(float ), (float)(e\u0445\u0440\u0440a4.jo\u0456c\u043e\u0440() - e\u0445\u0440\u0440a2.jo\u0456c\u043e\u0440()))) * d5 + (d4 = (double)(e\u0445\u0440\u0440a4.xpx() - e\u0445\u0440\u0440a2.xpx())) * d4) < d)) continue;
                    d = d6;
                    e\u0445\u0440\u0440a3 = e\u0445\u0440\u0440a4;
                }
            }
        }
        return e\u0445\u0440\u0440a3;
    }

    private static /* synthetic */ class_243 poc(class_238 class_2383, class_2350 class_23502, double d, double d2) {
        class_243 class_2432;
        if (true | false) {
        }
        if (0 != 0) {
        }
        block0 : switch (xx\u0458.\u0435p\u0458\u0445p[class_23502.ordinal()]) {
            default: {
                throw new MatchException(null, null);
            }
            case 2: {
                class_2432 = new class_243((double)s\u0435e.a_bsm16("method_16436", method_16436(double double double ), (double)d, (double)class_2383.field_1323, (double)class_2383.field_1320), class_2383.field_1322, (double)s\u0435e.a_bsm16("method_16436", method_16436(double double double ), (double)d2, (double)class_2383.field_1321, (double)class_2383.field_1324));
                break;
            }
            case 1: {
                class_2432 = new class_243((double)s\u0435e.a_bsm16("method_16436", method_16436(double double double ), (double)d, (double)class_2383.field_1323, (double)class_2383.field_1320), class_2383.field_1325, (double)s\u0435e.a_bsm16("method_16436", method_16436(double double double ), (double)d2, (double)class_2383.field_1321, (double)class_2383.field_1324));
                switch (0) {
                    default: {
                        break block0;
                    }
                    case 1: {
                        break block0;
                    }
                    case 2: 
                }
                break;
            }
            case 3: {
                class_2432 = new class_243((double)s\u0435e.a_bsm16("method_16436", method_16436(double double double ), (double)d, (double)class_2383.field_1323, (double)class_2383.field_1320), (double)s\u0435e.a_bsm16("method_16436", method_16436(double double double ), (double)d2, (double)class_2383.field_1322, (double)class_2383.field_1325), class_2383.field_1321);
                break;
            }
            case 4: {
                class_2432 = new class_243((double)s\u0435e.a_bsm16("method_16436", method_16436(double double double ), (double)d, (double)class_2383.field_1323, (double)class_2383.field_1320), (double)s\u0435e.a_bsm16("method_16436", method_16436(double double double ), (double)d2, (double)class_2383.field_1322, (double)class_2383.field_1325), class_2383.field_1324);
                switch (0) {
                    default: {
                        break block0;
                    }
                    case 1: {
                        break block0;
                    }
                    case 2: 
                }
                break;
            }
            case 5: {
                class_2432 = new class_243(class_2383.field_1323, (double)s\u0435e.a_bsm16("method_16436", method_16436(double double double ), (double)d, (double)class_2383.field_1322, (double)class_2383.field_1325), (double)s\u0435e.a_bsm16("method_16436", method_16436(double double double ), (double)d2, (double)class_2383.field_1321, (double)class_2383.field_1324));
                break;
            }
            case 6: {
                class_2432 = new class_243(class_2383.field_1320, (double)s\u0435e.a_bsm16("method_16436", method_16436(double double double ), (double)d, (double)class_2383.field_1322, (double)class_2383.field_1325), (double)s\u0435e.a_bsm16("method_16436", method_16436(double double double ), (double)d2, (double)class_2383.field_1321, (double)class_2383.field_1324));
            }
        }
        return class_2432;
    }

    private s\u0435e() {
        if (true | false) {
        }
        byte[] byArray = new byte[-280887261 + 280887311];
        byArray[0] = -886147491 + 886147442;
        byArray[1] = -1126468514 + 1126468597;
        byArray[2] = -815778740 + 815778642;
        byArray[3] = -1485571910 + 1485571956;
        byArray[4] = -330291110 + 330291122;
        byArray[5] = -1701832600 + 1701832497;
        byArray[-1306027849 + 1306027855] = -1296719512 + 1296719385;
        byArray[-1363428495 + 1363428502] = -1423263420 + 1423263338;
        byArray[-283121067 + 283121075] = -1907497076 + 1907497182;
        byArray[-1939653555 + 1939653564] = -613665298 + 613665406;
        byArray[-804892164 + 804892174] = -1373842939 + 1373842910;
        byArray[-1533745757 + 1533745768] = -863315318 + 863315345;
        byArray[-124091666 + 124091678] = -1944837042 + 1944837068;
        byArray[-518385711 + 518385724] = -1243665866 + 1243665985;
        byArray[-941122828 + 941122842] = -1660675505 + 1660675448;
        byArray[-1843917190 + 1843917205] = -1815257988 + 1815258096;
        byArray[-429422731 + 429422747] = -423150572 + 423150449;
        byArray[-54033779 + 54033796] = -250826387 + 250826304;
        byArray[-223877654 + 223877672] = -454561279 + 454561221;
        byArray[-1072101716 + 1072101735] = -1783595333 + 1783595421;
        byArray[-1781484104 + 1781484124] = -821526513 + 821526500;
        byArray[-1423541263 + 1423541284] = -1696088726 + 1696088819;
        byArray[-413363872 + 413363894] = -1551767826 + 1551767715;
        byArray[-1036083946 + 1036083969] = -1842947256 + 1842947201;
        byArray[-656964325 + 656964349] = -491255937 + 491255900;
        byArray[-724771338 + 0x2B332223] = -281261619 + 281261509;
        byArray[-889915188 + 889915214] = -1133952829 + 1133952818;
        byArray[-1296433799 + 1296433826] = -108314696 + 108314775;
        byArray[-1507949736 + 1507949764] = -1113214335 + 1113214322;
        byArray[-1954410536 + 1954410565] = -1036977589 + 1036977490;
        byArray[-920330916 + 920330946] = -124994 + 124949;
        byArray[-1165809856 + 1165809887] = -1173374960 + 1173375020;
        byArray[-564557503 + 564557535] = -88335120 + 88335202;
        byArray[-1353441060 + 1353441093] = -796959122 + 796959143;
        byArray[-1519704397 + 1519704431] = -1384781323 + 1384781232;
        byArray[-1733985223 + 1733985258] = -1130963984 + 1130964000;
        byArray[-800602246 + 800602282] = -840135626 + 840135753;
        byArray[-1666809077 + 1666809114] = -1065224209 + 1065224325;
        byArray[-1167590486 + 1167590524] = -708795428 + 708795499;
        byArray[-2121832616 + 2121832655] = -1895412693 + 1895412772;
        byArray[-1583699136 + 1583699176] = -2130520717 + 2130520680;
        byArray[-2793994 + 0x2AA233] = -1005128130 + 1005128094;
        byArray[-1324010735 + 1324010777] = -2065883293 + 2065883373;
        byArray[-1049093256 + 1049093299] = -855545511 + 855545594;
        byArray[-1936942299 + 1936942343] = -1687667208 + 1687667295;
        byArray[-1016563343 + 1016563388] = -1405702798 + 1405702870;
        byArray[-1194058644 + 1194058690] = -1827397138 + 1827397217;
        byArray[-1943115238 + 1943115285] = -421837434 + 421837496;
        byArray[-146109487 + 146109535] = -692303091 + 692303218;
        byArray[-1842298792 + 1842298841] = -604194010 + 604193922;
        throw new UnsupportedOperationException((String)((Object)s\u0435e.a_bsm17("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-2014669878 + 1801215868), (int)(-1088163074 + 1754215604))));
    }

    static {
        cah\u0456ci = class_310.method_1551();
        c\u0430ceoo\u0455 = new double[]{0.15, 0.5, 0.85};
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
}

