/*
 * Decompiled with CFR 0.152.
 */
package \u0458\u0458\u0458o\u0430\u0456;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.List;
import java.util.Optional;
import net.minecraft.class_1297;
import net.minecraft.class_1301;
import net.minecraft.class_238;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_3966;
import \u0458\u0458\u0458o\u0430\u0456.e\u0445\u0440\u0440a;

public final class x\u0455j\u0430o\u0445 {
    public static /* synthetic */ class_243 \u0435hs(float f, float f2) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        float f3 = f * ((float)Math.PI / 180);
        float f4 = -f2 * ((float)Math.PI / 180);
        CallSite callSite = x\u0455j\u0430o\u0445.a_bsm0("method_15362", method_15362(float ), (float)f4);
        CallSite callSite2 = x\u0455j\u0430o\u0445.a_bsm1("method_15374", method_15374(float ), (float)f4);
        CallSite callSite3 = x\u0455j\u0430o\u0445.a_bsm0("method_15362", method_15362(float ), (float)f3);
        CallSite callSite4 = x\u0455j\u0430o\u0445.a_bsm1("method_15374", method_15374(float ), (float)f3);
        return new class_243((double)(callSite2 * callSite3), (double)(-callSite4), (double)(callSite * callSite3));
    }

    public static /* synthetic */ class_239 aa\u0435\u0455oe(double d, boolean bl, e\u0445\u0440\u0440a e\u0445\u0440\u0440a2) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        class_239 class_2392 = null;
        class_1297 class_12972 = x\u0455j\u0430o\u0445.a_bsm2("method_1551", method_1551()).method_1560();
        if (class_12972 != null && ((class_310)x\u0455j\u0430o\u0445.a_bsm2("method_1551", method_1551())).field_1687 != null) {
            class_2392 = x\u0455j\u0430o\u0445.\u0455\u043e\u0440\u0445o(d, bl, e\u0445\u0440\u0440a2.jo\u0456c\u043e\u0440(), e\u0445\u0440\u0440a2.xpx());
        }
        return class_2392;
    }

    public static /* synthetic */ class_239 \u0455\u043e\u0440\u0445o(double d, boolean bl, float f, float f2) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if (((class_310)x\u0455j\u0430o\u0445.a_bsm2("method_1551", method_1551())).field_1724 == null) {
            return null;
        }
        class_243 class_2432 = new class_243(((class_310)x\u0455j\u0430o\u0445.a_bsm2("method_1551", method_1551())).field_1724.method_23317(), ((class_310)x\u0455j\u0430o\u0445.a_bsm2("method_1551", method_1551())).field_1724.method_23318() + 1.62, ((class_310)x\u0455j\u0430o\u0445.a_bsm2("method_1551", method_1551())).field_1724.method_23321());
        class_243 class_2433 = x\u0455j\u0430o\u0445.\u0435hs(f2, f);
        class_243 class_2434 = class_2432.method_1031(class_2433.field_1352 * d, class_2433.field_1351 * d, class_2433.field_1350 * d);
        return ((class_310)x\u0455j\u0430o\u0445.a_bsm2("method_1551", method_1551())).field_1724.method_37908().method_17742(new class_3959(class_2432, class_2434, class_3959.class_3960.field_17559, bl ? class_3959.class_242.field_1347 : class_3959.class_242.field_1348, (class_1297)((class_310)x\u0455j\u0430o\u0445.a_bsm2("method_1551", method_1551())).field_1724));
    }

    public static /* synthetic */ class_239 po\u0441\u04bb\u0455o(class_243 class_2432, class_243 class_2433, boolean bl, boolean bl2, boolean bl3, class_1297 class_12972) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if (((class_310)x\u0455j\u0430o\u0445.a_bsm2("method_1551", method_1551())).field_1687 == null) {
            return null;
        }
        class_3959.class_3960 class_39602 = bl2 ? class_3959.class_3960.field_17558 : (bl3 ? class_3959.class_3960.field_23142 : class_3959.class_3960.field_17559);
        class_3959.class_242 class_2422 = bl ? class_3959.class_242.field_1347 : class_3959.class_242.field_1348;
        class_3959 class_39592 = new class_3959(class_2432, class_2433, class_39602, class_2422, class_12972);
        return ((class_310)x\u0455j\u0430o\u0445.a_bsm2("method_1551", method_1551())).field_1687.method_17742(class_39592);
    }

    public static /* synthetic */ class_3966 o\u0430\u0435\u0435\u0435(class_238 class_2383, class_243 class_2433, class_243 class_2434) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        Optional optional = class_2383.method_992(class_2433, class_2434);
        return optional.map(class_2432 -> {
            if (true | false) {
            }
            return new class_3966(null, class_2432);
        }).orElse(null);
    }

    public static /* synthetic */ class_239 i\u04bbah\u0458(e\u0445\u0440\u0440a e\u0445\u0440\u0440a2, double d, float f, class_1297 class_12972, class_1297 class_12973, boolean bl) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        if (class_12972 != null && ((class_310)x\u0455j\u0430o\u0445.a_bsm2("method_1551", method_1551())).field_1687 != null) {
            float f2 = x\u0455j\u0430o\u0445.a_bsm2("method_1551", method_1551()).method_1488();
            class_243 class_2432 = class_12972.method_5836(f2);
            CallSite callSite = x\u0455j\u0430o\u0445.a_bsm3("\u043e\u0456xj\u0441a", \u043e\u0456xj\u0441a(\u0458\u0458\u0458o\u0430\u0456.e\u0445\u0440\u0440a ), (e\u0445\u0440\u0440a)e\u0445\u0440\u0440a2);
            class_243 class_2433 = class_2432.method_1031(((class_243)callSite).field_1352 * d, ((class_243)callSite).field_1351 * d, ((class_243)callSite).field_1350 * d);
            class_3965 class_39652 = null;
            double d2 = d;
            if (!bl) {
                class_39652 = ((class_310)x\u0455j\u0430o\u0445.a_bsm2("method_1551", method_1551())).field_1687.method_17742(new class_3959(class_2432, class_2433, class_3959.class_3960.field_17559, class_3959.class_242.field_1348, class_12972));
                d2 = class_39652.method_17783() == class_239.class_240.field_1332 ? class_2432.method_1022(class_39652.method_17784()) : d;
            }
            reference var14_12 = x\u0455j\u0430o\u0445.a_bsm4("min", min(double double ), (double)d, (double)d2) + (double)f;
            class_238 class_2383 = new class_238(class_2432.field_1352 - var14_12, class_2432.field_1351 - var14_12, class_2432.field_1350 - var14_12, class_2432.field_1352 + var14_12, class_2432.field_1351 + var14_12, class_2432.field_1350 + var14_12);
            List list = ((class_310)x\u0455j\u0430o\u0445.a_bsm2("method_1551", method_1551())).field_1687.method_8390(class_1297.class, class_2383, class_12974 -> {
                if (true | false) {
                }
                return class_12974 != class_12972 && (class_12973 == null || class_12974 == class_12973) && class_1301.field_6155.test(class_12974) && class_12974.method_5863();
            });
            class_1297 class_12975 = null;
            class_243 class_2434 = null;
            Object object = x\u0455j\u0430o\u0445.a_bsm4("min", min(double double ), (double)d, (double)d2);
            object *= object;
            for (class_1297 class_12976 : list) {
                class_243 class_2435;
                class_3965 class_39653;
                class_243 class_2436;
                double d3;
                class_238 class_2384 = class_12976.method_5829().method_1014((double)f);
                Optional optional = class_2384.method_992(class_2432, class_2433);
                if (!optional.isPresent() || !((d3 = class_2432.method_1025(class_2436 = (class_243)optional.get())) < object)) continue;
                boolean bl2 = true;
                if (!bl && (class_39653 = ((class_310)x\u0455j\u0430o\u0445.a_bsm2("method_1551", method_1551())).field_1687.method_17742(new class_3959(class_2432, class_2435 = class_2384.method_1005(), class_3959.class_3960.field_17559, class_3959.class_242.field_1348, class_12972))).method_17783() == class_239.class_240.field_1332 && class_2432.method_1025(class_39653.method_17784()) <= d3) {
                    bl2 = false;
                }
                if (!bl2) continue;
                object = d3;
                class_12975 = class_12976;
                class_2434 = class_2436;
            }
            if (class_12975 != null) {
                return new class_3966(class_12975, class_2434);
            }
            return !bl ? class_39652 : ((class_310)x\u0455j\u0430o\u0445.a_bsm2("method_1551", method_1551())).field_1687.method_17742(new class_3959(class_2432, class_2433, class_3959.class_3960.field_17559, class_3959.class_242.field_1348, class_12972));
        }
        return null;
    }

    private x\u0455j\u0430o\u0445() {
        if (true | false) {
        }
        byte[] byArray = new byte[-162717869 + 162717919];
        byArray[0] = -1159208534 + 1159208610;
        byArray[1] = -419776884 + 419776794;
        byArray[2] = -1407908679 + 1407908698;
        byArray[3] = -1107208594 + 1107208522;
        byArray[4] = -952824842 + 952824931;
        byArray[5] = -1547395780 + 1547395732;
        byArray[-574972458 + 574972464] = -2094869376 + 2094869289;
        byArray[-2098536936 + 2098536943] = -1194908426 + 1194908423;
        byArray[-940673874 + 940673882] = -292357183 + 292357128;
        byArray[-855735725 + 855735734] = -1863620166 + 1863620087;
        byArray[-1070831156 + 1070831166] = -2032364924 + 2032364999;
        byArray[-1583527382 + 1583527393] = -1037224505 + 1037224407;
        byArray[-936397001 + 936397013] = -70647166 + 70647194;
        byArray[-172847133 + 172847146] = -469396447 + 469396443;
        byArray[-1730323460 + 1730323474] = -1423577287 + 1423577386;
        byArray[-1451117896 + 1451117911] = -1285310144 + 1285310187;
        byArray[-1853232348 + 1853232364] = -668117931 + 668117977;
        byArray[-90335811 + 90335828] = -451366962 + 451366835;
        byArray[-273574904 + 273574922] = -5219860 + 5219875;
        byArray[-1493735641 + 1493735660] = -1028450231 + 1028450263;
        byArray[-1240425975 + 1240425995] = -388837739 + 388837663;
        byArray[-2032871951 + 2032871972] = -712041130 + 712041028;
        byArray[-956837465 + 956837487] = -1481691249 + 1481691173;
        byArray[-2036712477 + 2036712500] = -718027553 + 718027426;
        byArray[-1206118157 + 1206118181] = -1817250422 + 1817250442;
        byArray[-975724041 + 975724066] = -1814466966 + 1814467046;
        byArray[-279371415 + 279371441] = -1390884767 + 1390884743;
        byArray[-1487936226 + 1487936253] = -687448675 + 687448579;
        byArray[-11583197 + 11583225] = -2013193834 + 2013193784;
        byArray[-467689111 + 467689140] = -1318255337 + 1318255296;
        byArray[-305569423 + 305569453] = -531399504 + 531399616;
        byArray[-685905522 + 685905553] = -477854123 + 477854117;
        byArray[-271351601 + 271351633] = -1963786605 + 1963786633;
        byArray[-1217711924 + 1217711957] = -997265212 + 997265167;
        byArray[-239362503 + 239362537] = -1193958737 + 1193958825;
        byArray[-1572655821 + 1572655856] = -825655975 + 825655907;
        byArray[-482458652 + 482458688] = -1637683052 + 1637683040;
        byArray[-1829971896 + 1829971933] = -566626044 + 566626143;
        byArray[-1086503086 + 1086503124] = -1793096184 + 1793096126;
        byArray[-1334832113 + 1334832152] = -825136848 + 825136780;
        byArray[-1645038393 + 1645038433] = -5285537 + 5285474;
        byArray[-2048206228 + 2048206269] = -1488001707 + 1488001744;
        byArray[-1577370590 + 1577370632] = -27896453 + 27896412;
        byArray[-329761555 + 329761598] = -347186657 + 347186720;
        byArray[-1020078832 + 1020078876] = -1069889353 + 1069889332;
        byArray[-373695764 + 373695809] = -1088552816 + 1088552786;
        byArray[-74207068 + 74207114] = -1247345225 + 1247345156;
        byArray[-566701029 + 566701076] = -2144205595 + 2144205584;
        byArray[-1116541362 + 1116541410] = -1723894512 + 1723894464;
        byArray[-1235378845 + 1235378894] = -2009543230 + 2009543144;
        throw new UnsupportedOperationException((String)((Object)x\u0455j\u0430o\u0445.a_bsm5("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(1545305373 + 923276806), (int)(-800378052 + 814206358))));
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
}

