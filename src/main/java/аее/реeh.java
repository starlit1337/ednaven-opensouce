/*
 * Decompiled with CFR 0.152.
 */
package \u0430\u0435\u0435;

import ie\u0441\u0430ej.h\u0456ap\u0435oi;
import io.github.humbleui.skija.Image;
import java.io.File;
import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.file.Path;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.class_1291;
import net.minecraft.class_2960;
import net.minecraft.class_5321;
import net.minecraft.class_6880;
import net.minecraft.class_742;

public final class \u0440\u0435eh {
    private static final /* synthetic */ Map<UUID, Image> eos\u0435j\u0458;
    private static final /* synthetic */ Map<class_1291, Image> h\u0440\u0458;

    public \u0440\u0435eh() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
    }

    public static /* synthetic */ Image \u04bb\u043epx(class_6880<class_1291> class_68802) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return h\u0440\u0458.computeIfAbsent((class_1291)class_68802.comp_349(), class_12912 -> {
            if ((3 * 3 + 3) % 2 == 0) {
            }
            return \u0440\u0435eh.\u0440\u0441x(class_68802);
        });
    }

    private static /* synthetic */ Image \u0440\u0441x(class_6880<class_1291> class_68802) {
        CallSite callSite;
        block10: {
            if (true | false) {
            }
            if (0 != 0) {
            }
            class_2960 class_29602 = ((class_5321)class_68802.method_40230().get()).method_29177();
            String string = class_29602.method_12832();
            byte[] byArray = new byte[-2068258916 + 2068258936];
            byArray[0] = -474038162 + 474038189;
            byArray[1] = -1354878700 + 1354878691;
            byArray[2] = -853615311 + 853615407;
            byArray[3] = -1112056294 + 1112056180;
            byArray[4] = -201996009 + 201995919;
            byArray[5] = -911438665 + 911438663;
            byArray[-410283210 + 410283216] = -203793012 + 203793055;
            byArray[-1631754961 + 1631754968] = -1962132383 + 1962132293;
            byArray[-1502278172 + 1502278180] = -1356807380 + 1356807442;
            byArray[-1267873994 + 1267874003] = -2006571202 + 2006571270;
            byArray[-1101804738 + 1101804748] = -627800402 + 627800408;
            byArray[-927809380 + 927809391] = -1389973629 + 1389973533;
            byArray[-1154125753 + 1154125765] = -665560098 + 665560105;
            byArray[-1951703758 + 1951703771] = -1559928162 + 1559928088;
            byArray[-1994763396 + 1994763410] = -1385426164 + 1385426258;
            byArray[-403426987 + 403427002] = 5;
            byArray[-993004585 + 993004601] = -1887887689 + 1887887624;
            byArray[-630903455 + 630903472] = -1136984479 + 1136984579;
            byArray[-1899411757 + 1899411775] = -646537203 + 646537141;
            byArray[-1848441159 + 1848441178] = -662785575 + 662785656;
            class_2960 class_29603 = new class_2960(class_29602.method_12836(), (String)((Object)\u0440\u0435eh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(504203461 + 1561719389), (int)(229861721 + 546620654))) + string + (String)((Object)\u0440\u0435eh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1170880293 + 1170880223, -259446193 + 259446209, -1948555355 + 1948555340, -1968122500 + 1968122484}, (int)(-1857985962 + 2109385893), (int)(-1041533723 + 824147493))));
            InputStream inputStream = \u0440\u0435eh.a_bsm1("method_1551", method_1551()).method_1478().open(class_29603);
            try {
                byte[] byArray2 = inputStream.readAllBytes();
                callSite = \u0440\u0435eh.a_bsm2("makeFromEncoded", makeFromEncoded(byte[] ), (byte[])byArray2);
                if (inputStream == null) break block10;
            }
            catch (Throwable throwable) {
                try {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                    return null;
                }
            }
            inputStream.close();
        }
        return callSite;
    }

    public static /* synthetic */ Image x\u0445\u043e\u0458\u0430\u0455(class_742 class_7422) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return eos\u0435j\u0458.computeIfAbsent(class_7422.method_5667(), uUID -> {
            if (true | false) {
            }
            return \u0440\u0435eh.x\u0458\u0458ch(class_7422);
        });
    }

    private static /* synthetic */ Image x\u0458\u0458ch(class_742 class_7422) {
        CallSite callSite;
        block11: {
            if (2 * 2 * 2 >= 0) {
            }
            if (0 != 0) {
            }
            class_2960 class_29602 = class_7422.method_52814().comp_1626();
            File file = \u0440\u0435eh.p\u043ex\u0458(class_29602);
            if (file != null && file.exists()) {
                CallSite callSite2 = \u0440\u0435eh.a_bsm3("readAllBytes", readAllBytes(java.nio.file.Path ), (Path)file.toPath());
                return \u0440\u0435eh.a_bsm2("makeFromEncoded", makeFromEncoded(byte[] ), (byte[])callSite2);
            }
            InputStream inputStream = \u0440\u0435eh.a_bsm1("method_1551", method_1551()).method_1478().open(class_29602);
            try {
                byte[] byArray = inputStream.readAllBytes();
                callSite = \u0440\u0435eh.a_bsm2("makeFromEncoded", makeFromEncoded(byte[] ), (byte[])byArray);
                if (inputStream == null) break block11;
            }
            catch (Throwable throwable) {
                try {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (Exception exception) {
                    return null;
                }
            }
            inputStream.close();
        }
        return callSite;
    }

    public static /* synthetic */ File p\u043ex\u0458(class_2960 class_29602) {
        try {
            if ((3 * 3 + 3) % 2 == 0) {
            }
            if (0 != 0) {
            }
            byte[] byArray = new byte[-461496763 + 461496769];
            byArray[0] = -338259412 + 338259342;
            byArray[1] = -434958947 + 434958825;
            byArray[2] = -849854868 + 849854922;
            byArray[3] = -569522765 + 569522892;
            byArray[4] = -2133998392 + 2133998409;
            byArray[5] = -53253424 + 53253389;
            if (!class_29602.method_12832().contains((CharSequence)((Object)\u0440\u0435eh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(1685839932 + 1827598638), (int)(993201798 + 167065249))))) {
                return null;
            }
            byte[] byArray2 = new byte[-1511087984 + 1511087990];
            byArray2[0] = -722170990 + 722171100;
            byArray2[1] = -122263173 + 122263109;
            byArray2[2] = -782640307 + 782640313;
            byArray2[3] = -458079467 + 458079530;
            byArray2[4] = -1488230427 + 1488230485;
            byArray2[5] = -560430677 + 560430552;
            String string = class_29602.method_12832().replace((CharSequence)((Object)\u0440\u0435eh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray2, (int)(955494408 + 402366695), (int)(-942339469 + 1108737911))), (CharSequence)((Object)\u0440\u0435eh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[0], (int)(-1248397469 + 860680576), (int)(-2114994354 + 2008365654))));
            if (string.length() < 2) {
                return null;
            }
            String string2 = string.substring(0, 2);
            File file = ((h\u0456ap\u0435oi)((Object)\u0440\u0435eh.a_bsm1("method_1551", method_1551()))).getAssetDir();
            String string3 = string;
            String string4 = string2;
            byte[] byArray3 = new byte[-2089289977 + 2089289983];
            byArray3[0] = -1815755728 + 1815755617;
            byArray3[1] = -54259845 + 54259937;
            byArray3[2] = -752047883 + 752047961;
            byArray3[3] = -1354787596 + 1354787473;
            byArray3[4] = -2077456242 + 2077456250;
            byArray3[5] = -1280089685 + 1280089610;
            return new File(file, (String)((Object)\u0440\u0435eh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray3, (int)(1756484921 + 1750662097), (int)(-482819926 + 675629779))) + string4 + (String)((Object)\u0440\u0435eh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-657314548 + 657314589}, (int)(-384111899 + 1763075915), (int)(-99502488 + 19285199))) + string3);
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static /* synthetic */ void \u0435ie\u0440\u0445\u0430() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        eos\u0435j\u0458.clear();
    }

    static {
        eos\u0435j\u0458 = new ConcurrentHashMap<UUID, Image>();
        h\u0440\u0458 = new ConcurrentHashMap<class_1291, Image>();
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
}

