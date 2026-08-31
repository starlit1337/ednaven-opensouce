/*
 * Decompiled with CFR 0.152.
 */
package \u0440expho;

import c\u0445is.hoi\u0435h\u0440;
import c\u0445is.si\u0458\u04bbo\u0440;
import c\u0445is.\u0430\u0456i\u043ephj;
import c\u0445is.\u043e\u0458o\u0445xp\u0440;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Iterator;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1747;
import net.minecraft.class_1750;
import net.minecraft.class_1798;
import net.minecraft.class_1799;
import net.minecraft.class_1922;
import net.minecraft.class_1937;
import net.minecraft.class_2244;
import net.minecraft.class_2248;
import net.minecraft.class_2272;
import net.minecraft.class_2323;
import net.minecraft.class_2338;
import net.minecraft.class_2349;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_2382;
import net.minecraft.class_2387;
import net.minecraft.class_2428;
import net.minecraft.class_243;
import net.minecraft.class_2533;
import net.minecraft.class_2553;
import net.minecraft.class_2596;
import net.minecraft.class_2680;
import net.minecraft.class_2879;
import net.minecraft.class_3726;
import net.minecraft.class_3965;
import net.minecraft.class_4969;
import net.minecraft.class_746;
import net.minecraft.class_8168;
import o\u0455sio\u0440.\u0445\u0458\u0458h\u0445\u0430a;
import spso.\u0430c\u0440;
import spso.\u0441a\u0458p;
import \u0435xp.h\u04bb\u0455hpa;
import \u0435xp.o\u043ea\u0456c;
import \u0435xp.\u043ea\u0441\u0430p;
import \u043e\u0445\u0440\u0430ose.i\u0456\u0445\u0430\u0441p;
import \u0440expho.hc\u0445o;
import \u0440expho.p\u043eo;
import \u0440expho.\u0458\u0430h;
import \u0440o\u0456\u0445o.\u0445\u0440\u0430\u0435\u0445\u043e;
import \u0440\u0440e.ca\u0458s\u0440;
import \u0441j\u0455\u0440.o\u0440\u0455\u0441\u0456;
import \u0441\u0445o.jax\u0458\u0435\u0458;
import \u0441\u0445o.\u0458op\u0430\u0441;
import \u0445eo.c\u0455pi;
import \u0445eo.\u0456p\u0430\u043e\u0458\u043e;
import \u0445eo.\u0458i\u0456x;
import \u0458\u0458\u0458o\u0430\u0456.e\u0445\u0440\u0440a;

@\u0456p\u0430\u043e\u0458\u043e(sp\u0456p\u0445\u0435="Scaffold", a\u0456j\u0430\u0455\u04bb="Automatically places blocks under you", s\u0455cj=\u0458i\u0456x.MOVEMENT)
public class \u0441\u043e\u0456
extends c\u0455pi {
    private static final /* synthetic */ double \u0458e\u043e\u0455\u0456\u043e = 4.5;
    private static final /* synthetic */ int c\u0456\u0440\u0430oc = 8;
    private final /* synthetic */ o\u043ea\u0456c ic\u0441\u0456\u043ep\u0440;
    private final /* synthetic */ \u043ea\u0441\u0430p \u043e\u0435jc\u0445x;
    private final /* synthetic */ h\u04bb\u0455hpa \u0441\u0456\u0445\u0435;
    private final /* synthetic */ h\u04bb\u0455hpa i\u0430ohs\u0435;
    private final /* synthetic */ h\u04bb\u0455hpa ex\u0430\u0458xi\u0458;
    private final /* synthetic */ \u043ea\u0441\u0430p \u0441\u043e\u0435\u0441\u04bb\u0430;
    private final /* synthetic */ \u043ea\u0441\u0430p aea;
    private final /* synthetic */ \u043ea\u0441\u0430p a\u0430\u0430\u0430\u0456\u0455c;
    private /* synthetic */ int css;
    private /* synthetic */ int s\u0456\u04bb\u0441;
    private /* synthetic */ int \u0440\u0435\u0445\u0441\u0458;
    public /* synthetic */ int \u0430h\u0458x;
    private /* synthetic */ long h\u0455j\u04bb\u0441\u0445c;
    private /* synthetic */ e\u0445\u0440\u0440a io\u0458;
    private static final /* synthetic */ int i\u0458\u0441 = 1;
    private static final /* synthetic */ int a\u0455j\u0440e = 4;
    private /* synthetic */ class_2350 e\u0440e\u043ees\u0456;
    private /* synthetic */ boolean \u0455x\u04bbxih\u0435;
    private /* synthetic */ int \u0440\u0430\u0456\u043e\u04bb\u0430;
    private /* synthetic */ int aaa\u043e\u0458os;
    private /* synthetic */ boolean e\u0440p\u0441\u0456;
    public /* synthetic */ class_2338 \u0456\u0440i;
    private /* synthetic */ boolean \u0458o\u0430h\u0441;
    private /* synthetic */ boolean h\u0440\u0441a;
    private static /* synthetic */ int __js_dispatch_state = 0;

    public \u0441\u043e\u0456() {
        if (true | false) {
        }
        if (\u0441\u043e\u0456.$_h18lwz0z1ngan17lkk((long)\u0441\u043e\u0456.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)\u0441\u043e\u0456.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        String[] stringArray = new String[2];
        byte[] byArray = new byte[-1601253312 + 1601253318];
        byArray[0] = -1895136634 + 1895136673;
        byArray[1] = -1389159147 + 1389159270;
        byArray[2] = -62863612 + 62863676;
        byArray[3] = -965529403 + 965529281;
        byArray[4] = -1781811445 + 1781811550;
        byArray[5] = -1027630867 + 1027630851;
        stringArray[0] = \u0441\u043e\u0456.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-1039059679 + 2113211108), (int)(945477258 + 1293790958));
        stringArray[1] = \u0441\u043e\u0456.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-2017401979 + 2017401992, -1844532033 + 1844532050, -2048552753 + 2048552845, 0, -1974796546 + 1974796569}, (int)(1961471284 + 430039383), (int)(175635027 + 1069764584));
        this.ic\u0441\u0456\u043ep\u0440 = ((\u0430c\u0440)((Object)\u0441\u043e\u0456.a_bsm2("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)\u0441\u043e\u0456.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-477800867 + 477800838, -1996843465 + 1996843536, -1925212649 + 1925212626, -355525847 + 355525827}, (int)(-986815533 + 725453976), (int)(-390540511 + 1609528710)))))).\u0455iaip\u0458e(stringArray).\u0458c\u0456\u0440().getModeValue();
        byte[] byArray2 = new byte[-643846102 + 643846110];
        byArray2[0] = -2823962 + 2824026;
        byArray2[1] = -1657816918 + 1657816943;
        byArray2[2] = -1799341406 + 1799341327;
        byArray2[3] = -1970927153 + 1970927086;
        byArray2[4] = -99047242 + 99047147;
        byArray2[5] = -144860748 + 144860754;
        byArray2[-491405025 + 491405031] = -970182356 + 970182339;
        byArray2[-1568421140 + 1568421147] = -51960836 + 51960933;
        this.\u043e\u0435jc\u0445x = ((\u0430c\u0440)((Object)\u0441\u043e\u0456.a_bsm2("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)\u0441\u043e\u0456.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray2, (int)(-1690944438 + 1102880936), (int)(-771521129 + 1023052134)))))).p\u0441\u0445(() -> {
            boolean bl = false;
            if (bl) {
                __js_dispatch_state = 0;
            }
            if (true | false) {
            }
            if (((long)\u0441\u043e\u0456.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)\u0441\u043e\u0456.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
                throw null;
            }
            return \u0441\u043e\u0456.a_bsm30("valueOf", valueOf(boolean ), (boolean)this.ic\u0441\u0456\u043ep\u0440.cip((String)((Object)\u0441\u043e\u0456.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1390719583 + 1390719475, -301292210 + 301292301, -1146255165 + 1146255116, -1906745646 + 1906745688, -27069135 + 27069153}, (int)(474749226 + 1415206780), (int)(381552634 + 1166627916)))));
        }).s\u0458\u0458a(1.0f).x\u0455heah\u0445(1.0f).\u043ecxi\u0455(1.0f).a\u0455\u0445\u0435c(20.0f).\u0458c\u0456\u0440().getFloatValue();
        this.\u0441\u0456\u0445\u0435 = ((\u0430c\u0440)((Object)\u0441\u043e\u0456.a_bsm2("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)\u0441\u043e\u0456.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1870188977 + 1870188891, -530551986 + 530551965, -1814301135 + 1814301186, -7785803 + 7785887, -2040061621 + 2040061558}, (int)(57181360 + 2114911430), (int)(-343155927 + 1615032485)))))).\u0455xi\u0440(true).\u0458c\u0456\u0440().getBooleanValue();
        this.i\u0430ohs\u0435 = ((\u0430c\u0440)((Object)\u0441\u043e\u0456.a_bsm2("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)\u0441\u043e\u0456.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1932223508 + 1932223571, -521448613 + 521448670, -194909895 + 194909808, -1779372068 + 1779371996, -856116130 + 856116086}, (int)(1251874907 + 366888993), (int)(-518151141 + 796159094)))))).\u0455xi\u0440(true).\u0458c\u0456\u0440().getBooleanValue();
        byte[] byArray3 = new byte[-27521090 + 27521108];
        byArray3[0] = -607833914 + 607834030;
        byArray3[1] = -1664465183 + 1664465275;
        byArray3[2] = -1144100563 + 1144100652;
        byArray3[3] = -225503777 + 225503739;
        byArray3[4] = -750151030 + 750151046;
        byArray3[5] = -894279960 + 894280068;
        byArray3[-825268510 + 825268516] = -1601872488 + 1601872388;
        byArray3[-103521348 + 103521355] = -349862612 + 349862666;
        byArray3[-1881669269 + 1881669277] = -1484400397 + 1484400391;
        byArray3[-498345086 + 498345095] = -1937373495 + 1937373433;
        byArray3[-78399871 + 78399881] = -1018031510 + 1018031428;
        byArray3[-1011385356 + 1011385367] = -537203097 + 537203063;
        byArray3[-162059310 + 162059322] = -1823411415 + 1823411464;
        byArray3[-1307554270 + 1307554283] = -926312558 + 926312461;
        byArray3[-1841034394 + 1841034408] = -345556307 + 345556264;
        byArray3[-11170635 + 11170650] = -1589111022 + 1589111039;
        byArray3[-489015889 + 489015905] = -1399743414 + 1399743402;
        byArray3[-187757839 + 187757856] = -231049100 + 231049148;
        this.ex\u0430\u0458xi\u0458 = ((\u0430c\u0440)((Object)\u0441\u043e\u0456.a_bsm2("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)\u0441\u043e\u0456.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray3, (int)(-141538873 + 323338510), (int)(-1941952057 + 1946932868)))))).\u0455xi\u0440(true).\u0458c\u0456\u0440().getBooleanValue();
        byte[] byArray4 = new byte[-1011268071 + 1011268085];
        byArray4[0] = -2118136398 + 2118136432;
        byArray4[1] = -756642266 + 756642205;
        byArray4[2] = -170870416 + 170870396;
        byArray4[3] = -1028692062 + 1028692170;
        byArray4[4] = -1919626548 + 1919626423;
        byArray4[5] = -1919954058 + 1919953936;
        byArray4[-493764136 + 493764142] = -1335502047 + 1335501987;
        byArray4[-1874797414 + 1874797421] = -657527862 + 657527778;
        byArray4[-525270820 + 525270828] = -1324578787 + 1324578827;
        byArray4[-23161752 + 23161761] = -499538225 + 499538193;
        byArray4[-426166069 + 426166079] = -463863382 + 463863353;
        byArray4[-839057053 + 839057064] = -1847506864 + 1847506893;
        byArray4[-241690560 + 241690572] = -550401039 + 550400958;
        byArray4[-340911424 + 340911437] = -576653421 + 576653499;
        this.\u0441\u043e\u0435\u0441\u04bb\u0430 = ((\u0430c\u0440)((Object)\u0441\u043e\u0456.a_bsm2("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)\u0441\u043e\u0456.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray4, (int)(-940814288 + 966177106), (int)(-711911107 + 1016330471)))))).s\u0458\u0458a(180.0f).x\u0455heah\u0445(1.0f).\u043ecxi\u0455(1.0f).a\u0455\u0445\u0435c(180.0f).\u0458c\u0456\u0440().getFloatValue();
        byte[] byArray5 = new byte[-333505555 + 333505574];
        byArray5[0] = -1173375940 + 1173375974;
        byArray5[1] = -290084046 + 290084112;
        byArray5[2] = -420982617 + 420982709;
        byArray5[3] = -160717586 + 160717570;
        byArray5[4] = -1102264267 + 1102264387;
        byArray5[5] = -1527709321 + 1527709380;
        byArray5[-1559625584 + 1559625590] = -1667262924 + 1667262846;
        byArray5[-1869150680 + 1869150687] = -1154517051 + 1154517133;
        byArray5[-275396599 + 275396607] = -2123598595 + 2123598519;
        byArray5[-2003921054 + 2003921063] = -1648970550 + 1648970482;
        byArray5[-305589887 + 305589897] = 5;
        byArray5[-1462368782 + 1462368793] = -1903796652 + 1903796691;
        byArray5[-1323739887 + 1323739899] = -1627459192 + 1627459110;
        byArray5[-282678089 + 282678102] = -2134543770 + 2134543857;
        byArray5[-2056071279 + 2056071293] = -1349596657 + 1349596638;
        byArray5[-1556676452 + 1556676467] = -1989508421 + 1989508490;
        byArray5[-624938596 + 624938612] = -885956084 + 885956202;
        byArray5[-1214456043 + 1214456060] = -1054189122 + 1054189170;
        byArray5[-382404470 + 382404488] = -897605958 + 897606028;
        this.aea = ((\u0430c\u0440)((Object)\u0441\u043e\u0456.a_bsm2("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)\u0441\u043e\u0456.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray5, (int)(2126316759 + 1467142488), (int)(-1012918738 + 1044376497)))))).p\u0441\u0445(() -> {
            boolean bl = false;
            if (bl) {
                __js_dispatch_state = 0;
            }
            if (true | false) {
            }
            if (((long)\u0441\u043e\u0456.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)\u0441\u043e\u0456.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
                throw null;
            }
            return \u0441\u043e\u0456.a_bsm30("valueOf", valueOf(boolean ), (boolean)this.ic\u0441\u0456\u043ep\u0440.cip((String)((Object)\u0441\u043e\u0456.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-117440230 + 117440158, -652263460 + 652263406, -538741297 + 538741378, -1829271628 + 1829271546, -2004911136 + 2004911252}, (int)(-776181482 + 1919933205), (int)(-1684800371 + 1142678305)))));
        }).s\u0458\u0458a(180.0f).x\u0455heah\u0445(1.0f).\u043ecxi\u0455(1.0f).a\u0455\u0445\u0435c(180.0f).\u0458c\u0456\u0440().getFloatValue();
        byte[] byArray6 = new byte[-709949607 + 709949618];
        byArray6[0] = -1519754382 + 1519754505;
        byArray6[1] = -553623882 + 553623863;
        byArray6[2] = -503773651 + 503773705;
        byArray6[3] = -169190314 + 169190392;
        byArray6[4] = -818056026 + 818056004;
        byArray6[5] = -1076063748 + 1076063783;
        byArray6[-1909482270 + 1909482276] = -273364416 + 273364308;
        byArray6[-1774734194 + 1774734201] = -1066843881 + 1066843974;
        byArray6[-1842872660 + 1842872668] = -1241709364 + 1241709491;
        byArray6[-1721676681 + 1721676690] = 2;
        byArray6[-16841480 + 16841490] = -772378245 + 772378150;
        this.a\u0430\u0430\u0430\u0456\u0455c = ((\u0430c\u0440)((Object)\u0441\u043e\u0456.a_bsm2("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)\u0441\u043e\u0456.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray6, (int)(835572130 + 1340977177), (int)(1980735736 + 1351820713)))))).p\u0441\u0445(() -> {
            boolean bl = false;
            if (bl) {
                __js_dispatch_state = 0;
            }
            if (2 * 2 * 2 >= 0) {
            }
            if (((long)\u0441\u043e\u0456.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)\u0441\u043e\u0456.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
                throw null;
            }
            return \u0441\u043e\u0456.a_bsm30("valueOf", valueOf(boolean ), (boolean)this.ic\u0441\u0456\u043ep\u0440.cip((String)((Object)\u0441\u043e\u0456.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1250515496 + 1250515507, -551713132 + 551713009, -1822279398 + 1822279453, -2130813546 + 2130813430, -175969998 + 175970091}, (int)(-1063896487 + 1829761868), (int)(1218267728 + 1197688240)))));
        }).s\u0458\u0458a(1.0f).x\u0455heah\u0445(1.0f).\u043ecxi\u0455(0.0f).a\u0455\u0445\u0435c(5.0f).\u0458c\u0456\u0440().getFloatValue();
        this.\u0440\u0435\u0445\u0441\u0458 = -1;
        this.h\u0455j\u04bb\u0441\u0445c = 0L;
        this.\u0458o\u0430h\u0441 = false;
        this.h\u0440\u0441a = false;
    }

    public static /* synthetic */ boolean \u04bbhx\u043eox(class_1799 class_17992) {
        block11: {
            block10: {
                boolean bl = false;
                if (bl) {
                    __js_dispatch_state = 0;
                }
                if (2 * 2 * 2 >= 0) {
                }
                if (\u0441\u043e\u0456.$_h18lwz101ngan17lkl((long)\u0441\u043e\u0456.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)\u0441\u043e\u0456.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
                    throw null;
                }
                if (0 != 0) {
                }
                if (class_17992 == null || !(class_17992.method_7909() instanceof class_1747) || class_17992.method_7960()) {
                    return 0 != 0;
                }
                if (\u0441\u043e\u0456.a_bsm3("\u04bboop\u0440o\u0430", \u04bboop\u0440o\u0430(net.minecraft.class_1799 ), (class_1799)class_17992) == false) {
                    return 0 != 0;
                }
                String string = class_17992.method_7954().getString();
                if (string.contains((CharSequence)((Object)\u0441\u043e\u0456.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-210525207 + 210525251, -1321863823 + 1321863759, -82203349 + 82203264, -1420346344 + 1420346286, -1108260382 + 1108260362}, (int)(68760797 + 1871789772), (int)(479743223 + 1723545179))))) break block10;
                byte[] byArray = new byte[-1905370191 + 1905370197];
                byArray[0] = -527959620 + 527959617;
                byArray[1] = -1104044015 + 1104044025;
                byArray[2] = -699356427 + 699356547;
                byArray[3] = -2025674800 + 2025674733;
                byArray[4] = -1179150186 + 1179150110;
                byArray[5] = -290496893 + 290496883;
                if (!string.contains((CharSequence)((Object)\u0441\u043e\u0456.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(1473455379 + 558126084), (int)(-152543135 + 1361962932))))) break block11;
            }
            return 0 != 0;
        }
        if (class_17992.method_7909() instanceof class_1798) {
            return 0 != 0;
        }
        return (\u0441\u043e\u0456.a_bsm4("\u0440\u0441cs\u04bb\u043e\u0441", \u0440\u0441cs\u04bb\u043e\u0441(net.minecraft.class_2248 ), (class_2248)((class_1747)class_17992.method_7909()).method_7711()) == false ? 1 : 0) != 0;
    }

    public /* synthetic */ void \u0441e\u0441co() {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (true | false) {
        }
        if (\u0441\u043e\u0456.$_h18lwz111ngan17lkm((long)\u0441\u043e\u0456.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)\u0441\u043e\u0456.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        if (0 != 0) {
        }
        p\u043eo p\u043eo2 = (p\u043eo)((\u0445\u0440\u0430\u0435\u0445\u043e)((Object)\u0441\u043e\u0456.a_bsm5("jaa\u0435\u0445c", jaa\u0435\u0445c()))).\u0430o\u0441\u0456p\u0455().\u0441c\u0458\u043e\u0430(p\u043eo.class);
        if (this.\u0458o\u0430h\u0441) {
            if (!this.h\u0440\u0441a && p\u043eo2.\u0440\u0435\u0455x\u0435xe()) {
                p\u043eo2.\u04bbi\u0445(false, false);
            }
            this.\u0458o\u0430h\u0441 = false;
        }
        this.aaa\u043e\u0458os = 0;
        this.e\u0440p\u0441\u0456 = false;
    }

    public /* synthetic */ void o\u04bbj\u0455\u0435e() {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (2 * 2 * 2 >= 0) {
        }
        if (\u0441\u043e\u0456.$_h18lwz1n1ngan17lkn((long)\u0441\u043e\u0456.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)\u0441\u043e\u0456.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        if (0 != 0) {
        }
        p\u043eo p\u043eo2 = (p\u043eo)((\u0445\u0440\u0430\u0435\u0445\u043e)((Object)\u0441\u043e\u0456.a_bsm5("jaa\u0435\u0445c", jaa\u0435\u0445c()))).\u0430o\u0441\u0456p\u0455().\u0441c\u0458\u043e\u0430(p\u043eo.class);
        if (!this.\u0458o\u0430h\u0441) {
            this.\u0458o\u0430h\u0441 = true;
            this.h\u0440\u0441a = p\u043eo2.\u0440\u0435\u0455x\u0435xe();
            if (!this.h\u0440\u0441a) {
                p\u043eo2.\u04bbi\u0445(true, false);
            }
        }
    }

    private /* synthetic */ void \u043es\u0441x() {
        boolean bl;
        Object object;
        \u0458\u0430h \u0458\u0430h2;
        ca\u0458s\u0440 ca\u0458s\u04402;
        boolean bl2;
        block18: {
            block17: {
                bl2 = false;
                if (bl2) {
                    __js_dispatch_state = 0;
                }
                if ((3 * 3 + 3) % 2 == 0) {
                }
                if (\u0441\u043e\u0456.$_h18lwz1o1ngan17lko((long)\u0441\u043e\u0456.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)\u0441\u043e\u0456.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
                    throw null;
                }
                if (0 != 0) {
                }
                ca\u0458s\u04402 = (ca\u0458s\u0440)((\u0445\u0440\u0430\u0435\u0445\u043e)((Object)\u0441\u043e\u0456.a_bsm5("jaa\u0435\u0445c", jaa\u0435\u0445c()))).\u0430o\u0441\u0456p\u0455().\u0441c\u0458\u043e\u0430(ca\u0458s\u0440.class);
                if (\u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1687 == null) break block17;
                if (\u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 != null) break block18;
            }
            return;
        }
        if (!ca\u0458s\u04402.p\u0430\u0441\u0458.axpacc()) {
            this.\u0441e\u0441co();
            return;
        }
        CallSite callSite = \u0441\u043e\u0456.a_bsm6("xi\u0458i\u0435es", xi\u0458i\u0435es(net.minecraft.class_746 ), (class_746)\u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724);
        class_243 class_2432 = ((o\u0440\u0455\u0441\u0456)((Object)callSite)).hhs(1).method_1031(0.0, (double)\u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_5751(), 0.0);
        class_243 class_2433 = ((o\u0440\u0455\u0441\u0456)((Object)callSite)).hhs(2);
        boolean bl3 = false;
        if (!\u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_24828() && \u0441\u043e\u0456.$_h18lwz1p1ngan17lkp(this.s\u0456\u04bb\u0441 == class_2433.field_1351 ? 0 : (this.s\u0456\u04bb\u0441 > class_2433.field_1351 ? 1 : -1)) > 0 && ((o\u0440\u0455\u0441\u0456)((Object)callSite)).\u043e\u0456\u0430(4) == null && (\u0458\u0430h2 = this.op\u0455\u043ei((class_2338)(object = new class_2338((int)\u0441\u043e\u0456.a_bsm7("method_15357", method_15357(double ), (double)\u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_23317()), \u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31478() - 1, (int)\u0441\u043e\u0456.a_bsm7("method_15357", method_15357(double ), (double)\u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_23321()))))) != null) {
            this.ie\u0455sp\u04bb(\u0458\u0430h2, true);
            bl3 = true;
        }
        if (!(bl3 || \u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_24828() || this.\u0456\u0440i != null && \u0441\u043e\u0456.$_h18lwz1q1ngan17lkq(class_2432.method_1022(this.\u0456\u0440i.method_46558()) == 4.5 ? 0 : (class_2432.method_1022(this.\u0456\u0440i.method_46558()) > 4.5 ? 1 : -1)) < 0 || (object = this.phce()) == null)) {
            this.ie\u0455sp\u04bb((\u0458\u0430h)object, true);
            bl3 = true;
        }
        object = \u0458op\u0430\u0441.ia\u04bb != null ? \u0458op\u0430\u0441.ia\u04bb : new e\u0445\u0440\u0440a(\u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_36454(), \u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_36455());
        boolean bl4 = bl = \u0441\u043e\u0456.a_bsm8("\u0456hhpo", \u0456hhpo(net.minecraft.class_2338 net.minecraft.class_2350 \u0458\u0458\u0458o\u0430\u0456.e\u0445\u0440\u0440a ), (class_2338)this.\u0456\u0440i, (class_2350)this.e\u0440e\u043ees\u0456, (e\u0445\u0440\u0440a)object) != null;
        if (bl3) {
            this.e\u0440p\u0441\u0456 = true;
            if (this.aaa\u043e\u0458os < -1222319518 + 1222319526) {
                ++this.aaa\u043e\u0458os;
                this.o\u04bbj\u0455\u0435e();
            } else {
                this.aaa\u043e\u0458os = 0;
                if ((0 == 0 || 0 != 1 && 0 != 2) && bl2) {
                    __js_dispatch_state = 0;
                }
            }
        } else {
            this.aaa\u043e\u0458os = 0;
            this.e\u0440p\u0441\u0456 = this.\u0458o\u0430h\u0441;
        }
        if (!bl) {
            this.\u0441e\u0441co();
        }
    }

    @\u0445\u0458\u0458h\u0445\u0430a
    public void \u0441eoj(si\u0458\u04bbo\u0440 si\u0458\u04bbo\u04402) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (2 * 2 * 2 >= 0) {
        }
        if (\u0441\u043e\u0456.$_h18lwz1r1ngan17lkr((long)\u0441\u043e\u0456.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)\u0441\u043e\u0456.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        if (0 != 0) {
        }
        si\u0458\u04bbo\u04402.setCancelled(true);
    }

    @\u0445\u0458\u0458h\u0445\u0430a
    public void \u04bbo\u0435(hoi\u0435h\u0440 hoi\u0435h\u04402) {
        block35: {
            e\u0445\u0440\u0440a e\u0445\u0440\u0440a2;
            block30: {
                \u043ea\u0441\u0430p \u043ea\u0441\u0430p2;
                boolean bl;
                e\u0445\u0440\u0440a e\u0445\u0440\u0440a3;
                block34: {
                    block31: {
                        boolean bl2;
                        block33: {
                            block32: {
                                boolean bl3;
                                block29: {
                                    block28: {
                                        bl2 = false;
                                        if (bl2) {
                                            __js_dispatch_state = 0;
                                        }
                                        if (true | false) {
                                        }
                                        if (\u0441\u043e\u0456.$_h18lwz1s1ngan17lks((long)\u0441\u043e\u0456.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)\u0441\u043e\u0456.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
                                            throw null;
                                        }
                                        if (0 != 0) {
                                        }
                                        if (\u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 == null) break block28;
                                        if (\u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1687 != null) break block29;
                                    }
                                    return;
                                }
                                int n = -1;
                                for (int i = 0; i < -1955034211 + 1955034220; ++i) {
                                    class_1799 class_17992 = \u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().method_5438(i);
                                    if (!\u0441\u043e\u0456.\u04bbhx\u043eox(class_17992)) continue;
                                    n = i;
                                    this.\u0430h\u0458x = class_17992.method_7947();
                                    if (!bl2) break;
                                    __js_dispatch_state = 0;
                                    break;
                                }
                                if (n == -1) {
                                    byte[] byArray = new byte[-1413538599 + 1413538607];
                                    byArray[0] = -290574464 + 290574433;
                                    byArray[1] = -213475160 + 213475141;
                                    byArray[2] = -690884166 + 690884139;
                                    byArray[3] = -2071221770 + 2071221657;
                                    byArray[4] = -2012226045 + 2012226026;
                                    byArray[5] = -1624381156 + 1624381102;
                                    byArray[-1321162397 + 1321162403] = -399009528 + 399009588;
                                    byArray[-874211500 + 874211507] = -1969826309 + 1969826217;
                                    byte[] byArray2 = new byte[-565130290 + 565130304];
                                    byArray2[0] = -1603308094 + 1603308023;
                                    byArray2[1] = -1975234251 + 1975234274;
                                    byArray2[2] = -1236356066 + 1236356056;
                                    byArray2[3] = -206888096 + 206888189;
                                    byArray2[4] = -769081546 + 769081615;
                                    byArray2[5] = -1324010063 + 1324010154;
                                    byArray2[-1899023187 + 1899023193] = -747737660 + 747737594;
                                    byArray2[-1135292641 + 1135292648] = -652842207 + 652842261;
                                    byArray2[-1438373639 + 1438373647] = -1164070845 + 1164070838;
                                    byArray2[-974772058 + 974772067] = -1321162552 + 1321162639;
                                    byArray2[-302359486 + 302359496] = -105329164 + 105329172;
                                    byArray2[-827956813 + 827956824] = -807475945 + 807475822;
                                    byArray2[-1174256602 + 1174256614] = -1426371552 + 1426371435;
                                    byArray2[-391373359 + 391373372] = -1760245615 + 1760245584;
                                    \u0441\u043e\u0456.a_bsm9("h\u0445\u0456xs", h\u0445\u0456xs(java.lang.String java.lang.String ), (String)((Object)\u0441\u043e\u0456.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-1213044442 + 1483384566), (int)(-746913326 + 1871987004))), (String)((Object)\u0441\u043e\u0456.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray2, (int)(-797318452 + 1903124252), (int)(-388399848 + 519604921))));
                                    this.\u0430h\u0458x = 0;
                                    this.\u0456\u0440i = null;
                                    this.e\u0440e\u043ees\u0456 = null;
                                    this.io\u0458 = null;
                                    this.\u0441e\u0441co();
                                    return;
                                }
                                if (\u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7545 != n) {
                                    \u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7545 = n;
                                }
                                if (\u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_24828()) {
                                    this.s\u0456\u04bb\u0441 = (int)\u0441\u043e\u0456.a_bsm10("floor", floor(double ), (double)\u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_23318()) - 1;
                                    this.css = 0;
                                } else {
                                    ++this.css;
                                }
                                this.o\u0455\u0430ci\u0435();
                                this.\u043es\u0441x();
                                if (hc\u0445o.j\u0456j\u0456s\u0445 != null) {
                                    return;
                                }
                                if (!this.ic\u0441\u0456\u043ep\u0440.cip((String)((Object)\u0441\u043e\u0456.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-981498113 + 981498220, -1918791485 + 1918791584, -118809562 + 118809541, -751369059 + 751368951, -677782954 + 677783064}, (int)(-376343494 + 870361399), (int)(-2079104084 + 1937347552))))) break block30;
                                e\u0445\u0440\u0440a3 = this.\u0458\u0458\u0435();
                                if (e\u0445\u0440\u0440a3 == null) {
                                    return;
                                }
                                if (!this.e\u0440p\u0441\u0456 && \u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_24828() && \u0441\u043e\u0456.a_bsm11("\u0455pia\u0456\u0441", \u0455pia\u0456\u0441()) != false) {
                                    \u0441\u043e\u0456.a_bsm12("\u0440\u0430hj", \u0440\u0430hj(\u0458\u0458\u0458o\u0430\u0456.e\u0445\u0440\u0440a double \u0441\u0445o.jax\u0458\u0435\u0458 ), (e\u0445\u0440\u0440a)new e\u0445\u0440\u0440a(\u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_36454(), 75.5f), (double)this.aea.axpacc(), (jax\u0458\u0435\u0458)jax\u0458\u0435\u0458.hp\u043e\u0445p);
                                    return;
                                }
                                if (\u0441\u043e\u0456.$_h18lwz1t1ngan17lkt(this.css == this.a\u0430\u0430\u0430\u0456\u0455c.axpacc() ? 0 : (this.css > this.a\u0430\u0430\u0430\u0456\u0455c.axpacc() ? 1 : -1)) >= 0 || ((\u0445\u0440\u0430\u0435\u0445\u043e)((Object)\u0441\u043e\u0456.a_bsm5("jaa\u0435\u0445c", jaa\u0435\u0445c()))).\u0430o\u0441\u0456p\u0455().\u0441c\u0458\u043e\u0430(p\u043eo.class).\u0440\u0435\u0455x\u0435xe()) {
                                    bl3 = true;
                                    if (0 != 0 && 0 != 1 && 0 != 2) {
                                        // empty if block
                                    }
                                } else {
                                    bl3 = false;
                                }
                                if (!(bl = bl3)) break block31;
                                \u043ea\u0441\u0430p2 = this.\u0441\u043e\u0435\u0441\u04bb\u0430;
                                if (0 == 0) break block32;
                                if (0 == 1) break block33;
                                if (0 == 2) break block34;
                            }
                            if (bl2) {
                                __js_dispatch_state = 0;
                            }
                            break block34;
                        }
                        if (bl2) {
                            __js_dispatch_state = 0;
                        }
                        break block34;
                    }
                    \u043ea\u0441\u0430p2 = this.aea;
                }
                if (\u0441\u043e\u0456.a_bsm12("\u0440\u0430hj", \u0440\u0430hj(\u0458\u0458\u0458o\u0430\u0456.e\u0445\u0440\u0440a double \u0441\u0445o.jax\u0458\u0435\u0458 ), (e\u0445\u0440\u0440a)e\u0445\u0440\u0440a3, (double)\u043ea\u0441\u0430p2.axpacc(), (jax\u0458\u0435\u0458)jax\u0458\u0435\u0458.hp\u043e\u0445p) == false) {
                    return;
                }
                if (bl) {
                    this.x\u0441ch\u0435\u0445();
                }
                break block35;
            }
            if (this.\u0456\u0440i == null ? \u0441\u043e\u0456.a_bsm12("\u0440\u0430hj", \u0440\u0430hj(\u0458\u0458\u0458o\u0430\u0456.e\u0445\u0440\u0440a double \u0441\u0445o.jax\u0458\u0435\u0458 ), (e\u0445\u0440\u0440a)new e\u0445\u0440\u0440a((float)\u0441\u043e\u0456.a_bsm13("method_15393", method_15393(float ), (float)(\u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_36454() - 180.0f)), 89.64f), (double)this.\u0441\u043e\u0435\u0441\u04bb\u0430.axpacc(), (jax\u0458\u0435\u0458)jax\u0458\u0435\u0458.hp\u043e\u0445p) == false : (e\u0445\u0440\u0440a2 = this.\u0458\u0458\u0435()) != null && \u0441\u043e\u0456.a_bsm12("\u0440\u0430hj", \u0440\u0430hj(\u0458\u0458\u0458o\u0430\u0456.e\u0445\u0440\u0440a double \u0441\u0445o.jax\u0458\u0435\u0458 ), (e\u0445\u0440\u0440a)e\u0445\u0440\u0440a2, (double)this.\u0441\u043e\u0435\u0441\u04bb\u0430.axpacc(), (jax\u0458\u0435\u0458)jax\u0458\u0435\u0458.hp\u043e\u0445p) == false) {
                return;
            }
            this.x\u0441ch\u0435\u0445();
        }
        this.\u0455\u04bb\u0458\u0435\u0435xs(this.ic\u0441\u0456\u043ep\u0440.cc\u0445\u0458\u0458());
    }

    private /* synthetic */ e\u0445\u0440\u0440a \u0458\u0458\u0435() {
        CallSite callSite;
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (2 * 2 * 2 >= 0) {
        }
        if (\u0441\u043e\u0456.$_h18lwz1u1ngan17lku((long)\u0441\u043e\u0456.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)\u0441\u043e\u0456.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        if (0 != 0) {
        }
        if (\u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 == null) {
            return null;
        }
        e\u0445\u0440\u0440a e\u0445\u0440\u0440a2 = \u0458op\u0430\u0441.ia\u04bb != null ? \u0458op\u0430\u0441.ia\u04bb : new e\u0445\u0440\u0440a(\u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_36454(), \u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_36455());
        CallSite callSite2 = \u0441\u043e\u0456.a_bsm8("\u0456hhpo", \u0456hhpo(net.minecraft.class_2338 net.minecraft.class_2350 \u0458\u0458\u0458o\u0430\u0456.e\u0445\u0440\u0440a ), (class_2338)this.\u0456\u0440i, (class_2350)this.e\u0440e\u043ees\u0456, (e\u0445\u0440\u0440a)e\u0445\u0440\u0440a2);
        if (this.ic\u0441\u0456\u043ep\u0440.cip((String)((Object)\u0441\u043e\u0456.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-430541835 + 430541901, -2053786929 + 2053786981, -1267274011 + 1267274049, -230458998 + 230459006, -715797302 + 715797209}, (int)(-1142432966 + 2038127144), (int)(1492386591 + 1163041575))))) {
            CallSite callSite3;
            Object object = callSite2;
            if (object == null) {
                CallSite callSite4;
                float f = \u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_36454() + 100.0f;
                float f2 = \u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_36454() - 100.0f;
                callSite3 = \u0441\u043e\u0456.a_bsm14("abs", abs(float ), (float)\u0441\u043e\u0456.a_bsm13("method_15393", method_15393(float ), (float)(f - e\u0445\u0440\u0440a2.jo\u0456c\u043e\u0440())));
                object = \u0441\u043e\u0456.$_h18lwz1v1ngan17lkv((float)callSite3 == (float)(callSite4 = \u0441\u043e\u0456.a_bsm14("abs", abs(float ), (float)\u0441\u043e\u0456.a_bsm13("method_15393", method_15393(float ), (float)(f2 - e\u0445\u0440\u0440a2.jo\u0456c\u043e\u0440())))) ? 0 : ((float)callSite3 < (float)(callSite4 = \u0441\u043e\u0456.a_bsm14("abs", abs(float ), (float)\u0441\u043e\u0456.a_bsm13("method_15393", method_15393(float ), (float)(f2 - e\u0445\u0440\u0440a2.jo\u0456c\u043e\u0440())))) ? -1 : 1)) < 0 ? new e\u0445\u0440\u0440a(f, e\u0445\u0440\u0440a2.xpx()) : new e\u0445\u0440\u0440a(f2, e\u0445\u0440\u0440a2.xpx());
            }
            if (this.e\u0440p\u0441\u0456 && callSite2 != null) {
                this.io\u0458 = callSite2;
                return this.io\u0458;
            }
            double d = (double)\u0441\u043e\u0456.a_bsm13("method_15393", method_15393(float ), (float)(((e\u0445\u0440\u0440a)object).jo\u0456c\u043e\u0440() - e\u0445\u0440\u0440a2.jo\u0456c\u043e\u0440()));
            if (\u0441\u043e\u0456.$_h18lwz1w1ngan17lkw(this.css == this.\u043e\u0435jc\u0445x.axpacc() ? 0 : (this.css < this.\u043e\u0435jc\u0445x.axpacc() ? -1 : 1)) < 0) {
                callSite3 = this.css == 1 ? (CallSite)80.0f : (CallSite)50.0f;
                CallSite callSite5 = \u0441\u043e\u0456.a_bsm16("\u0440sh\u0445\u04bb", \u0440sh\u0445\u04bb(\u0458\u0458\u0458o\u0430\u0456.e\u0445\u0440\u0440a \u0458\u0458\u0458o\u0430\u0456.e\u0445\u0440\u0440a double ), (e\u0445\u0440\u0440a)e\u0445\u0440\u0440a2, (e\u0445\u0440\u0440a)new e\u0445\u0440\u0440a(e\u0445\u0440\u0440a2.jo\u0456c\u043e\u0440() + (float)d, e\u0445\u0440\u0440a2.xpx()), (double)((double)(callSite3 -= (float)\u0441\u043e\u0456.a_bsm15("chi", chi(double double ), (double)0.001, (double)0.005))));
                object = new e\u0445\u0440\u0440a(((e\u0445\u0440\u0440a)((Object)callSite5)).jo\u0456c\u043e\u0440(), ((e\u0445\u0440\u0440a)object).xpx());
            }
            if (this.io\u0458 != null && this.\u0435i\u043e((class_3965)\u0441\u043e\u0456.a_bsm17("\u0445a\u0455e\u0445j\u0458", \u0445a\u0455e\u0445j\u0458(\u0458\u0458\u0458o\u0430\u0456.e\u0445\u0440\u0440a double ), (e\u0445\u0440\u0440a)this.io\u0458, (double)4.5))) {
                return this.io\u0458;
            }
            if (this.\u0456\u0440i != null && this.e\u0440e\u043ees\u0456 != null && \u0441\u043e\u0456.$_h18lwz2i1ngan17lkx(this.css == this.\u043e\u0435jc\u0445x.axpacc() ? 0 : (this.css > this.\u043e\u0435jc\u0445x.axpacc() ? 1 : -1)) >= 0 && !this.\u0435i\u043e((class_3965)\u0441\u043e\u0456.a_bsm17("\u0445a\u0455e\u0445j\u0458", \u0445a\u0455e\u0445j\u0458(\u0458\u0458\u0458o\u0430\u0456.e\u0445\u0440\u0440a double ), (e\u0445\u0440\u0440a)object, (double)4.5)) && this.io\u0458 != null) {
                this.io\u0458 = new e\u0445\u0440\u0440a(this.io\u0458.jo\u0456c\u043e\u0440() + (float)\u0441\u043e\u0456.a_bsm18("random", random()), this.io\u0458.xpx());
                return this.io\u0458;
            }
            this.io\u0458 = object;
            return object;
        }
        if (this.\u0456\u0440i == null || this.e\u0440e\u043ees\u0456 == null) {
            return null;
        }
        if (callSite2 == null) {
            return null;
        }
        CallSite callSite6 = \u0441\u043e\u0456.a_bsm13("method_15393", method_15393(float ), (float)(\u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_36454() - 180.0f));
        e\u0445\u0440\u0440a e\u0445\u0440\u0440a3 = new e\u0445\u0440\u0440a((float)callSite6, ((e\u0445\u0440\u0440a)((Object)callSite2)).xpx());
        boolean bl2 = this.\u0435i\u043e((class_3965)\u0441\u043e\u0456.a_bsm17("\u0445a\u0455e\u0445j\u0458", \u0445a\u0455e\u0445j\u0458(\u0458\u0458\u0458o\u0430\u0456.e\u0445\u0440\u0440a double ), (e\u0445\u0440\u0440a)((Object)callSite2), (double)4.5));
        boolean bl3 = this.\u0435i\u043e((class_3965)\u0441\u043e\u0456.a_bsm17("\u0445a\u0455e\u0445j\u0458", \u0445a\u0455e\u0445j\u0458(\u0458\u0458\u0458o\u0430\u0456.e\u0445\u0440\u0440a double ), (e\u0445\u0440\u0440a)e\u0445\u0440\u0440a3, (double)4.5));
        if (\u0441\u043e\u0456.a_bsm11("\u0455pia\u0456\u0441", \u0455pia\u0456\u0441()) != false && bl3) {
            return e\u0445\u0440\u0440a3;
        }
        if (bl2) {
            return callSite2;
        }
        CallSite callSite7 = \u0441\u043e\u0456.a_bsm14("abs", abs(float ), (float)\u0441\u043e\u0456.a_bsm13("method_15393", method_15393(float ), (float)(((e\u0445\u0440\u0440a)((Object)callSite2)).jo\u0456c\u043e\u0440() - e\u0445\u0440\u0440a2.jo\u0456c\u043e\u0440())));
        return \u0441\u043e\u0456.$_h18lwz2j1ngan17lky((float)callSite7 == (float)(callSite = \u0441\u043e\u0456.a_bsm14("abs", abs(float ), (float)\u0441\u043e\u0456.a_bsm13("method_15393", method_15393(float ), (float)(e\u0445\u0440\u0440a3.jo\u0456c\u043e\u0440() - e\u0445\u0440\u0440a2.jo\u0456c\u043e\u0440())))) ? 0 : ((float)callSite7 < (float)(callSite = \u0441\u043e\u0456.a_bsm14("abs", abs(float ), (float)\u0441\u043e\u0456.a_bsm13("method_15393", method_15393(float ), (float)(e\u0445\u0440\u0440a3.jo\u0456c\u043e\u0440() - e\u0445\u0440\u0440a2.jo\u0456c\u043e\u0440())))) ? -1 : 1)) <= 0 ? callSite2 : e\u0445\u0440\u0440a3;
    }

    private /* synthetic */ boolean \u0435i\u043e(class_3965 class_39652) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (true | false) {
        }
        if (\u0441\u043e\u0456.$_h18lwz2k1ngan17lkz((long)\u0441\u043e\u0456.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)\u0441\u043e\u0456.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        if (0 != 0) {
        }
        return (int)\u0441\u043e\u0456.a_bsm19("\u0458ojo\u043ejo", \u0458ojo\u043ejo(net.minecraft.class_3965 net.minecraft.class_2338 net.minecraft.class_2350 ), (class_3965)class_39652, (class_2338)this.\u0456\u0440i, (class_2350)this.e\u0440e\u043ees\u0456) != 0;
    }

    public /* synthetic */ void x\u0441ch\u0435\u0445() {
        class_1269 class_12692;
        block12: {
            block11: {
                boolean bl = false;
                if (bl) {
                    __js_dispatch_state = 0;
                }
                if (true | false) {
                }
                if (\u0441\u043e\u0456.$_h18lwz2l1ngan17ll0((long)\u0441\u043e\u0456.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)\u0441\u043e\u0456.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
                    throw null;
                }
                if (0 != 0) {
                }
                if (this.e\u0440e\u043ees\u0456 == null || \u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 == null || \u0430\u0445j\u0445s\u0456\u04bb.method_1562() == null) break block11;
                if (\u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1761 != null) break block12;
            }
            return;
        }
        if (\u0441\u043e\u0456.$_h18lwz2m1ngan17ll1((long)(\u0441\u043e\u0456.a_bsm20("currentTimeMillis", currentTimeMillis()) - this.h\u0455j\u04bb\u0441\u0445c) == 20L ? 0 : ((long)(\u0441\u043e\u0456.a_bsm20("currentTimeMillis", currentTimeMillis()) - this.h\u0455j\u04bb\u0441\u0445c) < 20L ? -1 : 1)) < 0) {
            return;
        }
        CallSite callSite = \u0441\u043e\u0456.a_bsm17("\u0445a\u0455e\u0445j\u0458", \u0445a\u0455e\u0445j\u0458(\u0458\u0458\u0458o\u0430\u0456.e\u0445\u0440\u0440a double ), (e\u0445\u0440\u0440a)\u0458op\u0430\u0441.ia\u04bb, (double)4.5);
        if (this.\u0435i\u043e((class_3965)callSite) && (class_12692 = \u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1761.method_2896(\u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724, class_1268.field_5808, (class_3965)callSite)) == class_1269.field_5812) {
            if (this.i\u0430ohs\u0435.axpacc()) {
                \u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_6104(class_1268.field_5808);
            } else {
                \u0430\u0445j\u0445s\u0456\u04bb.method_1562().method_52787((class_2596)new class_2879(class_1268.field_5808));
            }
            this.h\u0455j\u04bb\u0441\u0445c = (long)\u0441\u043e\u0456.a_bsm20("currentTimeMillis", currentTimeMillis());
        }
    }

    @\u0445\u0458\u0458h\u0445\u0430a
    public void so\u0456h\u0440(\u043e\u0458o\u0445xp\u0440 \u043e\u0458o\u0445xp\u04402) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (\u0441\u043e\u0456.$_h18lwz2n1ngan17ll2((long)\u0441\u043e\u0456.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)\u0441\u043e\u0456.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        if (0 != 0) {
        }
        if (\u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 == null) {
            return;
        }
        if (this.ic\u0441\u0456\u043ep\u0440.cip((String)((Object)\u0441\u043e\u0456.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-981120042 + 981119991, -1944470164 + 1944470222, -633782547 + 633782435, -1287918032 + 1287918068, -330603480 + 330603360}, (int)(-371684311 + 1656209511), (int)(159282953 + 945867477)))) && \u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_24828() && !\u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1690.field_1903.method_1434() && \u0441\u043e\u0456.a_bsm11("\u0455pia\u0456\u0441", \u0455pia\u0456\u0441()) != false) {
            \u043e\u0458o\u0445xp\u04402.ep\u0441c(true);
            if (this.\u0441\u0456\u0445\u0435.axpacc() && !this.\u0455x\u04bbxih\u0435) {
                this.\u0455x\u04bbxih\u0435 = true;
                this.\u0440\u0430\u0456\u043e\u04bb\u0430 = 0;
            }
        }
        if (this.ex\u0430\u0458xi\u0458.axpacc() && \u0441\u043e\u0456.a_bsm11("\u0455pia\u0456\u0441", \u0455pia\u0456\u0441()) != false && this.\u0456\u0440i != null) {
            boolean bl2;
            double d;
            if ((\u043e\u0458o\u0445xp\u04402.\u0440iha() || \u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1690.field_1903.method_1434()) && \u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_24828()) {
                return;
            }
            class_2350 class_23502 = \u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_5735();
            boolean bl3 = class_23502.method_10166() == class_2350.class_2351.field_11051;
            double d2 = bl3 ? (double)this.\u0456\u0440i.method_10263() + 0.5 : \u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_23317();
            double d3 = bl3 ? \u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_23321() : (double)this.\u0456\u0440i.method_10260() + 0.5;
            double d4 = d2 - \u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_23317();
            double d5 = d3 - \u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_23321();
            double d6 = \u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_18798().field_1352;
            double d7 = \u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_18798().field_1350;
            boolean bl4 = \u0441\u043e\u0456.$_h18lwz2o1ngan17ll3(d4 * d6 + d5 * d7 == 0.0 ? 0 : (d4 * d6 + d5 * d7 > 0.0 ? 1 : -1)) > 0;
            double d8 = d = bl4 ? 0.075 : 0.2;
            if (\u0441\u043e\u0456.$_h18lwz2p1ngan17ll4(d4 * d4 + d5 * d5 == d * d ? 0 : (d4 * d4 + d5 * d5 < d * d ? -1 : 1)) < 0) {
                return;
            }
            float f = (float)\u0441\u043e\u0456.a_bsm22("toDegrees", toDegrees(double ), (double)\u0441\u043e\u0456.a_bsm21("atan2", atan2(double double ), (double)(-d4), (double)d5));
            CallSite callSite = \u0441\u043e\u0456.a_bsm13("method_15393", method_15393(float ), (float)(f - \u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_36454()));
            float f2 = 0.0f;
            if (\u0441\u043e\u0456.$_h18lwz2q1ngan17ll5((float)\u0441\u043e\u0456.a_bsm14("abs", abs(float ), (float)callSite) == 90.0f ? 0 : ((float)\u0441\u043e\u0456.a_bsm14("abs", abs(float ), (float)callSite) < 90.0f ? -1 : 1)) < 0) {
                f2 = 1.0f;
            } else if (\u0441\u043e\u0456.$_h18lwz2r1ngan17ll6((float)\u0441\u043e\u0456.a_bsm14("abs", abs(float ), (float)callSite) == 90.0f ? 0 : ((float)\u0441\u043e\u0456.a_bsm14("abs", abs(float ), (float)callSite) > 90.0f ? 1 : -1)) > 0) {
                f2 = -1.0f;
            }
            float f3 = 0.0f;
            if (\u0441\u043e\u0456.$_h18lwz3d1ngan17ll7((float)callSite == 0.0f ? 0 : ((float)callSite > 0.0f ? 1 : -1)) > 0 && \u0441\u043e\u0456.$_h18lwz3e1ngan17ll8((float)callSite == 180.0f ? 0 : ((float)callSite < 180.0f ? -1 : 1)) < 0) {
                f3 = -1.0f;
            } else if (\u0441\u043e\u0456.$_h18lwz3f1ngan17ll9((float)callSite == 0.0f ? 0 : ((float)callSite < 0.0f ? -1 : 1)) < 0 && \u0441\u043e\u0456.$_h18lwz3g1ngan17lla((float)callSite == -180.0f ? 0 : ((float)callSite > -180.0f ? 1 : -1)) > 0) {
                f3 = 1.0f;
            }
            if (\u0441\u043e\u0456.$_h18lwz3h1ngan17llb(\u043e\u0458o\u0445xp\u04402.\u0458\u0430\u0441\u0441\u0458c\u0455() == 0.0f ? 0 : (\u043e\u0458o\u0445xp\u04402.\u0458\u0430\u0441\u0441\u0458c\u0455() > 0.0f ? 1 : -1)) != 0) {
                bl2 = true;
                if (bl) {
                    __js_dispatch_state = 0;
                }
            } else {
                bl2 = false;
            }
            boolean bl5 = bl2;
            boolean bl6 = \u0441\u043e\u0456.$_h18lwz3i1ngan17llc(\u043e\u0458o\u0445xp\u04402.ej\u0435\u0430c() == 0.0f ? 0 : (\u043e\u0458o\u0445xp\u04402.ej\u0435\u0430c() > 0.0f ? 1 : -1)) != 0;
            \u043e\u0458o\u0445xp\u04402.xoj(bl5 ? \u043e\u0458o\u0445xp\u04402.\u0458\u0430\u0441\u0441\u0458c\u0455() : f2);
            \u043e\u0458o\u0445xp\u04402.pca\u043e(bl6 ? \u043e\u0458o\u0445xp\u04402.ej\u0435\u0430c() : f3);
        }
    }

    public /* synthetic */ int xh\u0435\u0455\u0430() {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (\u0441\u043e\u0456.$_h18lwz3j1ngan17lld((long)\u0441\u043e\u0456.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)\u0441\u043e\u0456.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        if (0 != 0) {
        }
        if (\u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 == null) {
            return -1;
        }
        if (!\u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1690.field_1903.method_1434() && \u0441\u043e\u0456.$_h18lwz3k1ngan17lle(\u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.field_6017 == 0.25 ? 0 : (\u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.field_6017 < 0.25 ? -1 : 1)) <= 0 && this.ic\u0441\u0456\u043ep\u0440.cip((String)((Object)\u0441\u043e\u0456.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1109779402 + 1109779369, -1302987354 + 1302987413, -458162589 + 458162502, -791950829 + 791950840, -1780308147 + 1780308092}, (int)(929337059 + 324910046), (int)(-1117273056 + 372445050)))) && !((\u0445\u0440\u0430\u0435\u0445\u043e)((Object)\u0441\u043e\u0456.a_bsm5("jaa\u0435\u0445c", jaa\u0435\u0445c()))).\u0430o\u0441\u0456p\u0455().\u0441c\u0458\u043e\u0430(p\u043eo.class).\u0440\u0435\u0455x\u0435xe()) {
            return this.s\u0456\u04bb\u0441;
        }
        return (int)\u0441\u043e\u0456.a_bsm10("floor", floor(double ), (double)\u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_23318()) - 1;
    }

    public /* synthetic */ void o\u0455\u0430ci\u0435() {
        block10: {
            block9: {
                boolean bl = false;
                if (bl) {
                    __js_dispatch_state = 0;
                    if (bl) {
                        __js_dispatch_state = 0;
                    }
                }
                if (2 * 2 * 2 >= 0) {
                }
                if (\u0441\u043e\u0456.$_h18lwz3l1ngan17llf((long)\u0441\u043e\u0456.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)\u0441\u043e\u0456.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
                    throw null;
                }
                if (0 != 0) {
                }
                if (\u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 == null) break block9;
                if (\u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1687 != null) break block10;
            }
            return;
        }
        this.e\u0440p\u0441\u0456 = false;
        class_2338 class_23382 = new class_2338((int)\u0441\u043e\u0456.a_bsm7("method_15357", method_15357(double ), (double)\u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_23317()), this.xh\u0435\u0455\u0430(), (int)\u0441\u043e\u0456.a_bsm7("method_15357", method_15357(double ), (double)\u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_23321()));
        \u0458\u0430h \u0458\u0430h2 = this.op\u0455\u043ei(class_23382);
        if (\u0458\u0430h2 != null) {
            this.ie\u0455sp\u04bb(\u0458\u0430h2, false);
        }
    }

    public /* synthetic */ boolean i\u0430s(class_2680 class_26802, class_1937 class_19372, class_2338 class_23382) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (2 * 2 * 2 >= 0) {
        }
        if (\u0441\u043e\u0456.$_h18lwz3m1ngan17llg((long)\u0441\u043e\u0456.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)\u0441\u043e\u0456.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        if (0 != 0) {
        }
        boolean bl2 = !class_26802.method_26220((class_1922)class_19372, class_23382).method_1110();
        boolean bl3 = class_26802.method_26196(class_19372, class_23382) == null;
        class_2248 class_22482 = class_26802.method_26204();
        boolean bl4 = class_22482 instanceof class_2323 || class_22482 instanceof class_2533 || class_22482 instanceof class_2349 || class_22482 instanceof class_2428 || class_22482 instanceof class_2387 || class_22482 instanceof class_4969 || class_22482 instanceof class_2244 || class_22482 instanceof class_2272 || class_22482 instanceof class_8168;
        return (bl2 && bl3 && !bl4 ? 1 : 0) != 0;
    }

    private /* synthetic */ \u0458\u0430h phce() {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (true | false) {
        }
        if (\u0441\u043e\u0456.$_h18lwz481ngan17llh((long)\u0441\u043e\u0456.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)\u0441\u043e\u0456.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        if (0 != 0) {
        }
        if (\u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 == null || \u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1687 == null) {
            return null;
        }
        class_243 class_2432 = \u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_5836(1.0f);
        class_2338 class_23382 = \u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_24515();
        \u0458\u0430h \u0458\u0430h2 = null;
        int n = 2063797502 + 83686146;
        double d = Double.MAX_VALUE;
        Iterator iterator = \u0441\u043e\u0456.a_bsm23("method_10094", method_10094(int int int int int int ), (int)(class_23382.method_10263() - 4), (int)(class_23382.method_10264() - 5), (int)(class_23382.method_10260() - 4), (int)(class_23382.method_10263() + 4), (int)class_23382.method_10264(), (int)(class_23382.method_10260() + 4)).iterator();
        while (iterator.hasNext()) {
            double d2;
            class_2338 class_23383 = (class_2338)iterator.next();
            if (!this.s\u0456\u0455he(class_23383) || \u0441\u043e\u0456.$_h18lwz491ngan17lli((d2 = class_2432.method_1025(class_23383.method_46558())) == 20.25 ? 0 : ((d2 = class_2432.method_1025(class_23383.method_46558())) > 20.25 ? 1 : -1)) > 0) continue;
            for (CallSite callSite : \u0441\u043e\u0456.a_bsm24("values", values())) {
                class_2338 class_23384 = class_23383.method_10093((class_2350)callSite);
                if (class_23384.method_10264() >= class_23382.method_10264() || !this.o\u0430cp(class_23384) || class_23384.method_10264() <= n && (class_23384.method_10264() != n || \u0441\u043e\u0456.$_h18lwz4a1ngan17llj(d2 == d ? 0 : (d2 < d ? -1 : 1)) >= 0)) continue;
                n = class_23384.method_10264();
                d = d2;
                \u0458\u0430h2 = new \u0458\u0430h(class_23383.method_10062(), (class_2350)callSite);
            }
            if (!bl) continue;
            __js_dispatch_state = 0;
        }
        return \u0458\u0430h2;
    }

    private /* synthetic */ \u0458\u0430h op\u0455\u043ei(class_2338 class_23382) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (\u0441\u043e\u0456.$_h18lwz4b1ngan17llk((long)\u0441\u043e\u0456.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)\u0441\u043e\u0456.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        if (0 != 0) {
        }
        if (\u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 == null || \u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1687 == null || !this.o\u0430cp(class_23382)) {
            return null;
        }
        \u0458\u0430h \u0458\u0430h2 = this.\u0435p\u0435(class_23382);
        if (\u0458\u0430h2 != null) {
            return \u0458\u0430h2;
        }
        class_2338 class_23383 = \u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_24515();
        \u0458\u0430h \u0458\u0430h3 = null;
        double d = Double.MAX_VALUE;
        double d2 = Double.MAX_VALUE;
        Iterator iterator = \u0441\u043e\u0456.a_bsm23("method_10094", method_10094(int int int int int int ), (int)(class_23383.method_10263() - 5), (int)(class_23383.method_10264() - 5), (int)(class_23383.method_10260() - 5), (int)(class_23383.method_10263() + 5), (int)(class_23383.method_10264() + 4), (int)(class_23383.method_10260() + 5)).iterator();
        while (iterator.hasNext()) {
            class_2338 class_23384 = (class_2338)iterator.next();
            if (class_23384.method_10264() >= class_23383.method_10264()) continue;
            if (!this.s\u0456\u0455he(class_23384)) {
                if (0 != 0 && 0 != 1 && 0 != 2) {
                    // empty if block
                }
                if (!bl) continue;
                __js_dispatch_state = 0;
                continue;
            }
            for (class_2350 class_23502 : new class_2350[]{class_2350.field_11034, class_2350.field_11043, class_2350.field_11035, class_2350.field_11039}) {
                class_2338 class_23385 = class_23384.method_10093(class_23502);
                if (class_23385.equals((Object)class_23383)) continue;
                if (!this.o\u0430cp(class_23385)) {
                    if (!bl) continue;
                    __js_dispatch_state = 0;
                    continue;
                }
                double d3 = class_23384.method_10262((class_2382)class_23383);
                double d4 = class_23385.method_10262((class_2382)class_23383);
                if (\u0441\u043e\u0456.$_h18lwz4c1ngan17lll(d3 == d ? 0 : (d3 < d ? -1 : 1)) >= 0 && (\u0441\u043e\u0456.$_h18lwz4d1ngan17llm(d3 == d ? 0 : (d3 > d ? 1 : -1)) != 0 || \u0441\u043e\u0456.$_h18lwz4e1ngan17lln(d4 == d2 ? 0 : (d4 < d2 ? -1 : 1)) >= 0)) continue;
                d = d3;
                d2 = d4;
                \u0458\u0430h3 = new \u0458\u0430h(class_23384.method_10062(), class_23502);
                if (0 == 0 || 0 == 1 || 0 == 2) continue;
            }
            if (!bl) continue;
            __js_dispatch_state = 0;
        }
        return \u0458\u0430h3;
    }

    private /* synthetic */ \u0458\u0430h \u0435p\u0435(class_2338 class_23382) {
        \u0458\u0430h[] \u0458\u0430hArray;
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
            if (bl) {
                __js_dispatch_state = 0;
            }
        }
        if (true | false) {
        }
        if (\u0441\u043e\u0456.$_h18lwz4f1ngan17llo((long)\u0441\u043e\u0456.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)\u0441\u043e\u0456.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        if (0 != 0) {
        }
        for (\u0458\u0430h \u0458\u0430h2 : \u0458\u0430hArray = new \u0458\u0430h[]{new \u0458\u0430h(class_23382.method_10067(), class_2350.field_11034), new \u0458\u0430h(class_23382.method_10078(), class_2350.field_11039), new \u0458\u0430h(class_23382.method_10072(), class_2350.field_11043), new \u0458\u0430h(class_23382.method_10095(), class_2350.field_11035), new \u0458\u0430h(class_23382.method_10074(), class_2350.field_11036)}) {
            if (!this.s\u0456\u0455he(\u0458\u0430h2.\u0455x\u0441()) || !this.o\u0430cp(\u0458\u0430h2.\u0445\u0445\u0435h())) continue;
            return \u0458\u0430h2;
        }
        return null;
    }

    private /* synthetic */ boolean s\u0456\u0455he(class_2338 class_23382) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (2 * 2 * 2 >= 0) {
        }
        if (\u0441\u043e\u0456.$_h18lwz4g1ngan17llp((long)\u0441\u043e\u0456.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)\u0441\u043e\u0456.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        if (0 != 0) {
        }
        if (\u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1687 == null || \u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 == null) {
            return 0 != 0;
        }
        class_2680 class_26802 = \u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.method_8320(class_23382);
        if (!this.i\u0430s(class_26802, (class_1937)\u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1687, class_23382) || class_26802.method_45474()) {
            return 0 != 0;
        }
        class_238 class_2383 = class_26802.method_26194((class_1922)\u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1687, class_23382, (class_3726)\u0441\u043e\u0456.a_bsm25("method_16195", method_16195(net.minecraft.class_1297 ), (class_1297)\u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724)).method_1107();
        return (\u0441\u043e\u0456.$_h18lwz4h1ngan17llq(class_2383.field_1323 == -1.0E-6 ? 0 : (class_2383.field_1323 > -1.0E-6 ? 1 : -1)) >= 0 && \u0441\u043e\u0456.$_h18lwz531ngan17llr(class_2383.field_1322 == -1.0E-6 ? 0 : (class_2383.field_1322 > -1.0E-6 ? 1 : -1)) >= 0 && \u0441\u043e\u0456.$_h18lwz541ngan17lls(class_2383.field_1321 == -1.0E-6 ? 0 : (class_2383.field_1321 > -1.0E-6 ? 1 : -1)) >= 0 && \u0441\u043e\u0456.$_h18lwz551ngan17llt(class_2383.field_1320 == 1.000001 ? 0 : (class_2383.field_1320 < 1.000001 ? -1 : 1)) <= 0 && \u0441\u043e\u0456.$_h18lwz561ngan17llu(class_2383.field_1325 == 1.000001 ? 0 : (class_2383.field_1325 < 1.000001 ? -1 : 1)) <= 0 && \u0441\u043e\u0456.$_h18lwz571ngan17llv(class_2383.field_1324 == 1.000001 ? 0 : (class_2383.field_1324 < 1.000001 ? -1 : 1)) <= 0 ? 1 : 0) != 0;
    }

    private /* synthetic */ boolean o\u0430cp(class_2338 class_23382) {
        int n;
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (true | false) {
        }
        if (\u0441\u043e\u0456.$_h18lwz581ngan17llw((long)\u0441\u043e\u0456.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)\u0441\u043e\u0456.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        if (0 != 0) {
        }
        if (\u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1687 == null) {
            return 0 != 0;
        }
        class_2680 class_26802 = \u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.method_8320(class_23382);
        if (class_26802.method_26215() || class_26802.method_26204() instanceof class_2553 || this.\u04bb\u0430\u0458\u0440\u043ee(class_26802, class_23382)) {
            n = 1;
            if (0 != 0 && 0 != 1 && 0 != 2) {
                // empty if block
            }
        } else {
            n = 0;
        }
        return n != 0;
    }

    private /* synthetic */ void ie\u0455sp\u04bb(\u0458\u0430h \u0458\u0430h2, boolean bl) {
        boolean bl2 = false;
        if (bl2) {
            __js_dispatch_state = 0;
        }
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (\u0441\u043e\u0456.$_h18lwz591ngan17llx((long)\u0441\u043e\u0456.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)\u0441\u043e\u0456.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        if (0 != 0) {
        }
        this.\u0456\u0440i = \u0458\u0430h2.\u0455x\u0441().method_10062();
        this.e\u0440e\u043ees\u0456 = \u0458\u0430h2.\u0430\u0430a\u0456\u0430\u0458i();
        this.e\u0440p\u0441\u0456 = bl;
    }

    private /* synthetic */ boolean \u04bb\u0430\u0458\u0440\u043ee(class_2680 class_26802, class_2338 class_23382) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (\u0441\u043e\u0456.$_h18lwz5a1ngan17lly((long)\u0441\u043e\u0456.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)\u0441\u043e\u0456.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        if (0 != 0) {
        }
        if (\u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 == null) {
            return 0 != 0;
        }
        class_1750 class_17502 = new class_1750((class_1657)\u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724, class_1268.field_5808, \u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_6047(), new class_3965((class_243)\u0441\u043e\u0456.a_bsm26("method_24953", method_24953(net.minecraft.class_2382 ), (class_2382)class_23382), class_2350.field_11036, class_23382, false));
        return (class_26802.method_26166(class_17502) ? 1 : 0) != 0;
    }

    @\u0445\u0458\u0458h\u0445\u0430a
    public void \u043e\u0456xhhx(\u0430\u0456i\u043ephj \u0430\u0456i\u043ephj2) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (true | false) {
        }
        if (\u0441\u043e\u0456.$_h18lwz5b1ngan17llz((long)\u0441\u043e\u0456.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)\u0441\u043e\u0456.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        if (0 != 0) {
        }
        if (\u0430\u0456i\u043ephj2.p\u0440\u04bb() == i\u0456\u0445\u0430\u0441p.cc\u0441 && \u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 != null && this.\u0441\u0456\u0445\u0435.axpacc()) {
            if (this.ic\u0441\u0456\u043ep\u0440.cip((String)((Object)\u0441\u043e\u0456.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-650702705 + 650702756, -453186692 + 453186682, -623607005 + 623607086, -832288437 + 832288531, -1283089865 + 1283089984}, (int)(513515353 + 1969812650), (int)(9782286 + 474273995)))) && this.\u0455x\u04bbxih\u0435) {
                ++this.\u0440\u0430\u0456\u043e\u04bb\u0430;
                if (this.\u0440\u0430\u0456\u043e\u04bb\u0430 == 1 && !\u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1690.field_1832.method_1434()) {
                    \u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1690.field_1832.method_23481(true);
                }
                if (this.\u0440\u0430\u0456\u043e\u04bb\u0430 == 5) {
                    \u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1690.field_1832.method_23481(false);
                    this.\u0455x\u04bbxih\u0435 = false;
                    this.\u0440\u0430\u0456\u043e\u04bb\u0430 = 0;
                    if (bl) {
                        __js_dispatch_state = 0;
                    }
                }
            } else {
                byte[] byArray = new byte[-1669366517 + 1669366523];
                byArray[0] = -1559464914 + 1559464820;
                byArray[1] = -126701917 + 126701928;
                byArray[2] = -647500792 + 647500798;
                byArray[3] = -1186545361 + 1186545274;
                byArray[4] = -1592094794 + 1592094822;
                byArray[5] = -806719171 + 806719295;
                if (this.ic\u0441\u0456\u043ep\u0440.cip((String)((Object)\u0441\u043e\u0456.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-1730195315 + 549021962), (int)(-651182991 + 1434677825))))) {
                    \u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1690.field_1832.method_23481(\u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_24828() && \u0441\u043e\u0456.a_bsm27("x\u0435ho", x\u0435ho(float ), (float)0.3f) != false);
                }
            }
        }
    }

    @Override
    public /* synthetic */ void onEnable() {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (2 * 2 * 2 >= 0) {
        }
        if (\u0441\u043e\u0456.$_h18lwz5c1ngan17lm0((long)\u0441\u043e\u0456.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)\u0441\u043e\u0456.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        if (0 != 0) {
        }
        this.\u0440\u0435\u0445\u0441\u0458 = -1;
        if (\u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 != null) {
            this.\u0440\u0435\u0445\u0441\u0458 = \u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7545;
            this.s\u0456\u04bb\u0441 = (int)(\u0441\u043e\u0456.a_bsm7("method_15357", method_15357(double ), (double)\u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_23318()) - true);
            this.io\u0458 = new e\u0445\u0440\u0440a(\u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_36454(), \u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_36455());
        } else {
            this.io\u0458 = null;
        }
        this.css = 0;
        this.\u0430h\u0458x = 0;
        this.h\u0455j\u04bb\u0441\u0445c = 0L;
        this.\u0456\u0440i = null;
        this.e\u0440e\u043ees\u0456 = null;
        this.aaa\u043e\u0458os = 0;
        this.e\u0440p\u0441\u0456 = false;
        this.h\u0440\u0441a = false;
        this.\u0458o\u0430h\u0441 = false;
        this.\u0455x\u04bbxih\u0435 = false;
        this.\u0440\u0430\u0456\u043e\u04bb\u0430 = 0;
        \u0441\u043e\u0456.a_bsm28("ao\u0445\u0440\u043e", ao\u0445\u0440\u043e(boolean ), (boolean)false);
    }

    @Override
    public /* synthetic */ void onDisable() {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (2 * 2 * 2 >= 0) {
        }
        if (\u0441\u043e\u0456.$_h18lwz5y1ngan17lm1((long)\u0441\u043e\u0456.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)\u0441\u043e\u0456.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        if (0 != 0) {
        }
        CallSite callSite = \u0441\u043e\u0456.a_bsm29("method_15987", method_15987(long int ), (long)\u0430\u0445j\u0445s\u0456\u04bb.method_22683().method_4490(), (int)\u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1690.field_1832.method_1429().method_1444());
        \u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1690.field_1832.method_23481((boolean)callSite);
        if (\u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 != null && this.\u0440\u0435\u0445\u0441\u0458 != -1) {
            \u0441\u043e\u0456.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7545 = this.\u0440\u0435\u0445\u0441\u0458;
        }
        this.\u0441e\u0441co();
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

    private static /* synthetic */ CallSite a_bsm18(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm19(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm20(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm21(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm22(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm23(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm24(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm25(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm26(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm27(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm28(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm29(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm30(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }
}

