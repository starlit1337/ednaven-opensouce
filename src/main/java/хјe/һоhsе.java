/*
 * Decompiled with CFR 0.152.
 */
package \u0445\u0458e;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import r.d8.Cade0e18b60fd9f037d8b2fc8;

public class \u04bb\u043ehs\u0435 {
    private final /* synthetic */ TreeMap<Long, String> a\u0445e\u0430;
    private final /* synthetic */ TreeMap<Long, String> cjo\u043e\u043e;
    private /* synthetic */ boolean i\u0430i\u0456\u043e;
    private static final /* synthetic */ Pattern \u04bba\u043e\u0441\u0430\u0445;

    public \u04bb\u043ehs\u0435() {
        if (true | false) {
        }
        this.a\u0445e\u0430 = new TreeMap();
        this.cjo\u043e\u043e = new TreeMap();
        this.i\u0430i\u0456\u043e = false;
    }

    public /* synthetic */ boolean hpoa\u0458c() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return this.a\u0445e\u0430 != null && !this.a\u0445e\u0430.isEmpty();
    }

    public /* synthetic */ void j\u0455h\u0458ie\u0455(String string, boolean bl) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (string == null || string.isEmpty()) {
            return;
        }
        TreeMap<Long, String> treeMap = bl ? this.cjo\u043e\u043e : this.a\u0445e\u0430;
        for (String string2 : string.split((String)((Object)\u04bb\u043ehs\u0435.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1535020062 + 1535019978}, (int)(-1497277215 + 684552877), (int)(761889488 + 2018190051))))) {
            Matcher matcher = \u04bba\u043e\u0441\u0430\u0445.matcher(string2.trim());
            if (!matcher.find()) continue;
            CallSite callSite = \u04bb\u043ehs\u0435.a_bsm1("parseLong", parseLong(java.lang.String ), (String)matcher.group(1));
            CallSite callSite2 = \u04bb\u043ehs\u0435.a_bsm1("parseLong", parseLong(java.lang.String ), (String)matcher.group(2));
            String string3 = matcher.group(3);
            reference var14_12 = \u04bb\u043ehs\u0435.a_bsm1("parseLong", parseLong(java.lang.String ), (String)string3);
            if (string3.length() == 2) {
                var14_12 *= 10L;
            }
            reference var16_13 = (callSite * 60L + callSite2) * 1000L + var14_12;
            String string4 = matcher.group(4).trim();
            if (string4.isEmpty()) continue;
            treeMap.put((Long)((Object)\u04bb\u043ehs\u0435.a_bsm2("valueOf", valueOf(long ), (long)var16_13)), string4);
        }
    }

    public /* synthetic */ String \u0456\u0456\u0458(long l2) {
        Object object;
        long l3;
        Map.Entry<Long, String> entry;
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        if ((entry = this.a\u0445e\u0430.floorEntry((Long)((Object)\u04bb\u043ehs\u0435.a_bsm2("valueOf", valueOf(long ), (long)(l3 = l2 + 500L))))) != null) {
            object = entry.getValue();
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
            object = \u04bb\u043ehs\u0435.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[0], (int)(-1893022447 + 1877883399), (int)(293002513 + 1816174757));
        }
        return object;
    }

    public /* synthetic */ String \u0440h\u0430(long l2) {
        long l3;
        Map.Entry<Long, String> entry;
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return (entry = this.cjo\u043e\u043e.floorEntry((Long)((Object)\u04bb\u043ehs\u0435.a_bsm2("valueOf", valueOf(long ), (long)(l3 = l2 + 500L))))) != null ? entry.getValue() : \u04bb\u043ehs\u0435.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[0], (int)(1702871723 + 131967666), (int)(-2038516454 + 1629172351));
    }

    public /* synthetic */ long i\u0456i(long l2) {
        long l3;
        Long l4;
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return (l4 = this.a\u0445e\u0430.floorKey((Long)((Object)\u04bb\u043ehs\u0435.a_bsm2("valueOf", valueOf(long ), (long)(l3 = l2 + 500L))))) != null ? l4 : -1L;
    }

    public /* synthetic */ long ihi\u043e\u0435(long l2) {
        Long l3;
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        if ((l3 = this.a\u0445e\u0430.higherKey((Long)((Object)\u04bb\u043ehs\u0435.a_bsm2("valueOf", valueOf(long ), (long)l2)))) == null) {
            return 2000L;
        }
        return l3 - l2 + 200L;
    }

    public /* synthetic */ long s\u04bbh\u0440\u0455\u0458\u0455(long l2) {
        long l3;
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if ((l3 = this.i\u0456i(l2)) < 0L) {
            return 800L;
        }
        return this.ihi\u043e\u0435(l3);
    }

    public /* synthetic */ boolean ac\u043ecx\u0458() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return this.i\u0430i\u0456\u043e;
    }

    public /* synthetic */ void xc\u0435(boolean bl) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        this.i\u0430i\u0456\u043e = bl;
    }

    public /* synthetic */ void x\u0430a\u0435xs() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        this.a\u0445e\u0430.clear();
        this.cjo\u043e\u043e.clear();
        this.i\u0430i\u0456\u043e = false;
    }

    static {
        byte[] byArray = new byte[-1400140244 + 1400140279];
        byArray[0] = -1898949800 + 1898949834;
        byArray[1] = -1759337934 + 1759338008;
        byArray[2] = -885094756 + 885094808;
        byArray[3] = -577248819 + 577248877;
        byArray[4] = -1981658845 + 1981658779;
        byArray[5] = -1202230837 + 1202230948;
        byArray[-1308482624 + 1308482630] = -546798746 + 546798625;
        byArray[-1002104018 + 1002104025] = -1964064710 + 1964064656;
        byArray[-1635110218 + 1635110226] = -1485952074 + 1485952183;
        byArray[-1161026991 + 1161027000] = -1497737871 + 1497737931;
        byArray[-61947514 + 61947524] = -1847648831 + 1847648704;
        byArray[-594305156 + 594305167] = -1704419485 + 1704419375;
        byArray[-170448246 + 170448258] = -793160152 + 793160061;
        byArray[-71602279 + 71602292] = -670711155 + 670711062;
        byArray[-1163626728 + 1163626742] = -157099387 + 157099457;
        byArray[-1431965283 + 1431965298] = -239385302 + 239385350;
        byArray[-1791534670 + 1791534686] = -1274427237 + 1274427124;
        byArray[-864959832 + 864959849] = -474525449 + 474525576;
        byArray[-1265117789 + 1265117807] = -1732281743 + 1732281651;
        byArray[-630630768 + 630630787] = -1220474638 + 1220474646;
        byArray[-313521683 + 313521703] = -1970545 + 1970581;
        byArray[-351415610 + 351415631] = -2096471372 + 2096471346;
        byArray[-676530776 + 676530798] = -1256413676 + 1256413577;
        byArray[-1164775012 + 1164775035] = -1901540308 + 1901540243;
        byArray[-1817220176 + 1817220200] = -587337182 + 587337307;
        byArray[-830991385 + 830991410] = -1180379854 + 1180379770;
        byArray[-1278948416 + 1278948442] = -1875936014 + 1875935957;
        byArray[-758708469 + 758708496] = -693771288 + 693771300;
        byArray[-377325850 + 377325878] = -2102333656 + 2102333698;
        byArray[-373070497 + 373070526] = -71179535 + 71179608;
        byArray[-325560999 + 325561029] = -1298061750 + 1298061838;
        byArray[-2032281872 + 2032281903] = -1295402371 + 1295402272;
        byArray[-883022927 + 883022959] = -1450271244 + 1450271305;
        byArray[-370354005 + 370354038] = -26590738 + 26590612;
        byArray[-1826316936 + 1826316970] = -376351457 + 376351562;
        \u04bba\u043e\u0441\u0430\u0445 = Pattern.compile(Cade0e18b60fd9f037d8b2fc8.cachedDecodeString(byArray, 1633004723 + 1000271937, -539482112 + 402247633));
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
}

