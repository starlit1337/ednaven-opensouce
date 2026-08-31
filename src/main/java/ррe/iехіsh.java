/*
 * Decompiled with CFR 0.152.
 */
package \u0440\u0440e;

import c\u0445is.hoi\u0435h\u0440;
import c\u0445is.s\u0456a\u0458;
import c\u0445is.\u0455\u0456\u0440;
import c\u0445is.\u04bbj\u0441x\u0440;
import h\u0441\u043e\u04bb\u0441\u0458\u0445.c\u0455i\u0430\u0440\u0445;
import ie\u0441\u0430ej.hca\u0455c;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import net.minecraft.class_1304;
import net.minecraft.class_1657;
import net.minecraft.class_1713;
import net.minecraft.class_1738;
import net.minecraft.class_1743;
import net.minecraft.class_1744;
import net.minecraft.class_1747;
import net.minecraft.class_1753;
import net.minecraft.class_1764;
import net.minecraft.class_1787;
import net.minecraft.class_1792;
import net.minecraft.class_1798;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1810;
import net.minecraft.class_1821;
import net.minecraft.class_1829;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2596;
import net.minecraft.class_2815;
import net.minecraft.class_2885;
import net.minecraft.class_437;
import net.minecraft.class_465;
import net.minecraft.class_490;
import org.apache.commons.lang3.tuple.Pair;
import o\u0455sio\u0440.\u0445\u0458\u0458h\u0445\u0430a;
import spso.\u0430c\u0440;
import spso.\u0441a\u0458p;
import \u0435xp.h\u04bb\u0455hpa;
import \u0435xp.o\u043ea\u0456c;
import \u0435xp.\u043ea\u0441\u0430p;
import \u043e\u0441\u0441c\u04bb.e\u043ep\u04bb;
import \u043e\u0441\u0441c\u04bb.\u0445hca\u0456\u0440\u043e;
import \u043e\u0445c\u0445cx\u0456.\u0455\u0445\u0455\u0445\u0456o\u0456;
import \u043e\u0445\u0440\u0430ose.i\u0456\u0445\u0430\u0441p;
import \u0440expho.hc\u0445o;
import \u0440expho.\u0441\u043e\u0456;
import \u0440o\u0456\u0445o.\u0445\u0440\u0430\u0435\u0445\u043e;
import \u0445eo.c\u0455pi;
import \u0445eo.\u0456p\u0430\u043e\u0458\u043e;
import \u0445eo.\u0458i\u0456x;

@\u0456p\u0430\u043e\u0458\u043e(sp\u0456p\u0445\u0435="Manager", a\u0456j\u0430\u0455\u04bb="Automatically manage your inventory", s\u0455cj=\u0458i\u0456x.MISC)
public class i\u0435\u0445\u0456sh
extends c\u0455pi {
    private final /* synthetic */ h\u04bb\u0455hpa \u0441\u0456\u0456jps;
    private final /* synthetic */ \u043ea\u0441\u0430p h\u0430\u0430soe\u0455;
    private final /* synthetic */ h\u04bb\u0455hpa ipx\u0456ji\u0435;
    private final /* synthetic */ h\u04bb\u0455hpa chs\u0456\u0440\u04bb;
    private final /* synthetic */ h\u04bb\u0455hpa shxx;
    private final /* synthetic */ \u043ea\u0441\u0430p \u0456ie;
    private final /* synthetic */ o\u043ea\u0456c xsie\u0456;
    private final /* synthetic */ h\u04bb\u0455hpa \u0458\u0456\u0458\u0458ae;
    private final /* synthetic */ \u043ea\u0441\u0430p o\u04bb\u0440;
    private final /* synthetic */ h\u04bb\u0455hpa ijao;
    private final /* synthetic */ \u043ea\u0441\u0430p \u0440s\u0430cc\u0456h;
    private final /* synthetic */ \u043ea\u0441\u0430p jx\u0440h\u04bb\u0455;
    private final /* synthetic */ h\u04bb\u0455hpa a\u0441\u0430\u043e\u0440;
    private final /* synthetic */ \u043ea\u0441\u0430p \u0456\u04bbj;
    private final /* synthetic */ h\u04bb\u0455hpa \u0440cep;
    private final /* synthetic */ \u043ea\u0441\u0430p a\u0441chp;
    private final /* synthetic */ h\u04bb\u0455hpa pish;
    private final /* synthetic */ \u043ea\u0441\u0430p \u0445x\u0445p\u0435;
    private final /* synthetic */ o\u043ea\u0456c \u0440\u043eo\u043eip\u0456;
    private final /* synthetic */ \u043ea\u0441\u0430p \u0440\u0456p\u0441ap;
    private final /* synthetic */ h\u04bb\u0455hpa \u0455je\u0441ixc;
    private final /* synthetic */ \u043ea\u0441\u0430p e\u0455j\u0435p\u0435;
    private final /* synthetic */ h\u04bb\u0455hpa \u043ee\u0430;
    private final /* synthetic */ \u043ea\u0441\u0430p \u0430j\u0456x\u04bb;
    private final /* synthetic */ h\u04bb\u0455hpa eep;
    private final /* synthetic */ \u043ea\u0441\u0430p ix\u0455\u0455\u043ec;
    private final /* synthetic */ h\u04bb\u0455hpa x\u043es;
    private final /* synthetic */ \u043ea\u0441\u0430p \u0441\u0445j\u0458\u0440\u043e\u04bb;
    private final /* synthetic */ \u043ea\u0441\u0430p o\u0430\u0430jx;
    private final /* synthetic */ \u043ea\u0441\u0430p \u043e\u043ep\u04bb\u0458h\u0430;
    private final /* synthetic */ h\u04bb\u0455hpa ox\u0440ip\u0456\u0435;
    private final /* synthetic */ \u043ea\u0441\u0430p o\u0445\u0441a\u0456sp;
    private final /* synthetic */ \u043ea\u0441\u0430p \u04bb\u0445\u0430s;
    private final /* synthetic */ h\u04bb\u0455hpa \u0456\u0445\u043e\u0455\u04bb;
    private final /* synthetic */ \u043ea\u0441\u0430p \u0456sxax;
    private /* synthetic */ long ic\u0430c\u0456;
    private /* synthetic */ long h\u0455\u0435pa\u04bb\u0458;
    private /* synthetic */ long \u043e\u0445\u0441\u0435\u0430\u043e;
    private /* synthetic */ int \u04bba\u0455\u0440\u043e;
    private /* synthetic */ int h\u0445\u0441e;
    private /* synthetic */ int s\u0445ass\u0430\u0441;
    private /* synthetic */ class_1713 hiaoj\u0435;
    private /* synthetic */ long sih\u0435e;
    private /* synthetic */ boolean c\u0458h;
    private /* synthetic */ boolean o\u0458s\u04bbie\u043e;
    private /* synthetic */ class_437 hj\u0435;
    private /* synthetic */ long \u043e\u0435\u0456;
    private /* synthetic */ boolean s\u0430h;
    private static /* synthetic */ int __js_dispatch_state = 0;

    public i\u0435\u0445\u0456sh() {
        if (2 * 2 * 2 >= 0) {
        }
        byte[] byArray = new byte[-1857131219 + 1857131232];
        byArray[0] = -1055181722 + 1055181760;
        byArray[1] = -1407532725 + 0x53E53E55;
        byArray[2] = -390802197 + 390802269;
        byArray[3] = -1802956230 + 1802956252;
        byArray[4] = -1573464395 + 1573464351;
        byArray[5] = -2085103583 + 2085103628;
        byArray[-1515438235 + 1515438241] = -649230884 + 649230930;
        byArray[-2122862085 + 2122862092] = -1170697144 + 1170697110;
        byArray[-1921193834 + 1921193842] = -1620265087 + 1620265034;
        byArray[-11605939 + 11605948] = -1052355571 + 1052355663;
        byArray[-53459704 + 53459714] = -595245328 + 595245322;
        byArray[-1967278989 + 1967279000] = -17910996 + 17911120;
        byArray[-897873890 + 897873902] = -1255481444 + 1255481560;
        this.\u0441\u0456\u0456jps = ((\u0430c\u0440)((Object)i\u0435\u0445\u0456sh.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(448027890 + 85181141), (int)(-1359128250 + 138960382)))))).\u0455xi\u0440(false).\u0458c\u0456\u0440().getBooleanValue();
        byte[] byArray2 = new byte[-1998013027 + 1998013037];
        byArray2[0] = -1457226467 + 1457226461;
        byArray2[1] = -1501066774 + 1501066673;
        byArray2[2] = -2045607477 + 2045607357;
        byArray2[3] = -915412296 + 915412241;
        byArray2[4] = -973203831 + 973203748;
        byArray2[5] = -354664647 + 354664523;
        byArray2[-538314941 + 538314947] = -136491551 + 136491581;
        byArray2[-2118908603 + 2118908610] = -459791097 + 459791135;
        byArray2[-1001193471 + 1001193479] = -1151521415 + 1151521316;
        byArray2[-1064931847 + 1064931856] = -1695097244 + 1695097118;
        this.h\u0430\u0430soe\u0455 = ((\u0430c\u0440)((Object)i\u0435\u0445\u0456sh.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray2, (int)(920721380 + 526073431), (int)(-2141798522 + 648603513)))))).s\u0458\u0458a(50.0f).x\u0455heah\u0445(1.0f).\u043ecxi\u0455(80.0f).a\u0455\u0445\u0435c(300.0f).p\u0441\u0445(() -> {
            boolean bl = false;
            if (bl) {
                __js_dispatch_state = 0;
            }
            if (true | false) {
            }
            return i\u0435\u0445\u0456sh.a_bsm51("valueOf", valueOf(boolean ), (!this.\u0441\u0456\u0456jps.axpacc() ? 1 : 0) != 0);
        }).\u0458c\u0456\u0440().getFloatValue();
        byte[] byArray3 = new byte[-1427584266 + 1427584276];
        byArray3[0] = -734092740 + 734092646;
        byArray3[1] = -566013011 + 566013065;
        byArray3[2] = -842417394 + 842417337;
        byArray3[3] = -2031776366 + 2031776254;
        byArray3[4] = -1506278033 + 1506278051;
        byArray3[5] = -668944177 + 668944073;
        byArray3[-1328155659 + 1328155665] = -854606403 + 854606286;
        byArray3[-1961332218 + 1961332225] = -46392573 + 46392594;
        byArray3[-1917121508 + 1917121516] = -199471774 + 199471890;
        byArray3[-1383520196 + 1383520205] = -1625675833 + 1625675960;
        this.ipx\u0456ji\u0435 = ((\u0430c\u0440)((Object)i\u0435\u0445\u0456sh.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray3, (int)(487046394 + 705727005), (int)(-1909229045 + 715472589)))))).\u0455xi\u0440(true).\u0458c\u0456\u0440().getBooleanValue();
        byte[] byArray4 = new byte[-580055961 + 580055975];
        byArray4[0] = 5;
        byArray4[1] = -516788402 + 516788513;
        byArray4[2] = -1566523417 + 1566523302;
        byArray4[3] = -77547835 + 77547892;
        byArray4[4] = 2;
        byArray4[5] = -114954772 + 114954854;
        byArray4[-411277710 + 411277716] = -1659184895 + 1659184931;
        byArray4[-449475083 + 449475090] = -658618308 + 658618248;
        byArray4[-2088526369 + 2088526377] = -1094578055 + 1094578134;
        byArray4[-888959362 + 888959371] = -1545147596 + 1545147476;
        byArray4[-1416259030 + 1416259040] = -1932740413 + 1932740432;
        byArray4[-609643506 + 609643517] = -376945411 + 376945295;
        byArray4[-7036866 + 7036878] = -1574923211 + 1574923192;
        byArray4[-665040437 + 665040450] = -300056911 + 300056791;
        this.chs\u0456\u0440\u04bb = ((\u0430c\u0440)((Object)i\u0435\u0445\u0456sh.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray4, (int)(2126261160 + 241066354), (int)(-1600565289 + 133847227)))))).\u0455xi\u0440(true).\u0458c\u0456\u0440().getBooleanValue();
        byte[] byArray5 = new byte[-558379399 + 558379410];
        byArray5[0] = -1718882984 + 1718882975;
        byArray5[1] = -1828437111 + 1828437030;
        byArray5[2] = -1742510408 + 1742510352;
        byArray5[3] = 1;
        byArray5[4] = -770539234 + 770539334;
        byArray5[5] = -1072973236 + 1072973255;
        byArray5[-1302646699 + 1302646705] = -1193895646 + 1193895590;
        byArray5[-2140171952 + 2140171959] = -2074144698 + 2074144726;
        byArray5[-535883761 + 535883769] = -272786369 + 272786285;
        byArray5[-1443112764 + 1443112773] = -1167889611 + 1167889623;
        byArray5[-1205711820 + 1205711830] = -222418187 + 222418110;
        this.shxx = ((\u0430c\u0440)((Object)i\u0435\u0445\u0456sh.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray5, (int)(1073406493 + 1385607283), (int)(1773372294 + 61008335)))))).\u0455xi\u0440(true).\u0458c\u0456\u0440().getBooleanValue();
        byte[] byArray6 = new byte[-1314660081 + 1314660097];
        byArray6[0] = -1859971908 + 1859971944;
        byArray6[1] = -1213897226 + 1213897264;
        byArray6[2] = -174638247 + 174638295;
        byArray6[3] = -819542356 + 819542315;
        byArray6[4] = -1105084891 + 1105085016;
        byArray6[5] = -2144577408 + 2144577329;
        byArray6[-495760595 + 495760601] = -779600966 + 779600938;
        byArray6[-2088852957 + 2088852964] = -528513795 + 528513913;
        byArray6[-1087838947 + 1087838955] = -1645863766 + 1645863758;
        byArray6[-477795755 + 477795764] = -555315352 + 555315450;
        byArray6[-408698681 + 408698691] = -1916053039 + 1916052946;
        byArray6[-260272962 + 260272973] = -1165808749 + 1165808725;
        byArray6[-1098939338 + 1098939350] = -131368446 + 131368558;
        byArray6[-561655599 + 561655612] = -289598296 + 289598398;
        byArray6[-814102148 + 814102162] = -744034924 + 744034826;
        byArray6[-86218444 + 86218459] = -1039682097 + 1039682043;
        \u0430c\u0440 \u0430c\u04402 = ((\u0430c\u0440)((Object)i\u0435\u0445\u0456sh.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray6, (int)(-889334632 + 248448308), (int)(1387353476 + 174000012)))))).s\u0458\u0458a(50.0f);
        h\u04bb\u0455hpa h\u04bb\u0455hpa2 = this.shxx;
        i\u0435\u0445\u0456sh.a_bsm2("requireNonNull", requireNonNull(T ), (Object)h\u04bb\u0455hpa2);
        this.\u0456ie = \u0430c\u04402.p\u0441\u0445(h\u04bb\u0455hpa2::axpacc).x\u0455heah\u0445(1.0f).\u043ecxi\u0455(60.0f).a\u0455\u0445\u0435c(300.0f).\u0458c\u0456\u0440().getFloatValue();
        byte[] byArray7 = new byte[-1107903670 + 1107903683];
        byArray7[0] = -371396568 + 371396491;
        byArray7[1] = -687141967 + 687142086;
        byArray7[2] = -892559965 + 892560082;
        byArray7[3] = -1868739963 + 1868740046;
        byArray7[4] = -77585396 + 77585379;
        byArray7[5] = -519474879 + 519474873;
        byArray7[-2015290549 + 2015290555] = -1612080264 + 1612080327;
        byArray7[-1017991372 + 1017991379] = -1669322131 + 1669322139;
        byArray7[-1660996184 + 1660996192] = -1061729949 + 1061729969;
        byArray7[-1263086079 + 1263086088] = -730076134 + 730076020;
        byArray7[-1160283479 + 1160283489] = -37822907 + 37822896;
        byArray7[-1114639008 + 1114639019] = -947909454 + 947909571;
        byArray7[-1833527117 + 1833527129] = -2018154599 + 2018154648;
        String[] stringArray = new String[3];
        stringArray[0] = i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1256215111 + 1256215155, -1111155979 + 1111155985, -1369043254 + 1369043206, -1019694563 + 1019694638}, (int)(-466789207 + 429039894), (int)(831453512 + 35469923));
        byte[] byArray8 = new byte[-1263467247 + 1263467259];
        byArray8[0] = -1720154915 + 1720154895;
        byArray8[1] = -185505484 + 185505468;
        byArray8[2] = -1924590356 + 1924590308;
        byArray8[3] = -1659079381 + 1659079421;
        byArray8[4] = -1759466887 + 1759466819;
        byArray8[5] = -1525205888 + 1525205985;
        byArray8[-719440373 + 719440379] = -1158793465 + 1158793353;
        byArray8[-765749256 + 765749263] = -1459037985 + 1459037974;
        byArray8[-547775688 + 547775696] = -1255519372 + 1255519497;
        byArray8[-739500061 + 739500070] = -1558255014 + 1558254900;
        byArray8[-1547230088 + 1547230098] = -1451633801 + 1451633746;
        byArray8[-918851324 + 918851335] = -472240694 + 472240814;
        stringArray[1] = i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray8, (int)(1481900301 + 1847444836), (int)(-715065313 + 1309027143));
        stringArray[2] = i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{3, -1634699791 + 1634699762, -97826694 + 97826816, -1785276548 + 1785276645, -1930993193 + 1930993306}, (int)(-1349750723 + 1060732552), (int)(-142697989 + 1036032836));
        this.xsie\u0456 = ((\u0430c\u0440)((Object)i\u0435\u0445\u0456sh.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray7, (int)(-1122966165 + 1803633446), (int)(-210736168 + 2071528208)))))).\u0455iaip\u0458e(stringArray).\u0458c\u0456\u0440().getModeValue();
        byte[] byArray9 = new byte[-1407202126 + 1407202138];
        byArray9[0] = -302193551 + 302193587;
        byArray9[1] = -1550743329 + 1550743294;
        byArray9[2] = -1396078882 + 1396078819;
        byArray9[3] = -1030158524 + 1030158459;
        byArray9[4] = -1372587312 + 1372587433;
        byArray9[5] = -834889833 + 834889725;
        byArray9[-173061474 + 173061480] = -422454372 + 422454487;
        byArray9[-1590083686 + 1590083693] = -1456243251 + 1456243226;
        byArray9[-235104872 + 235104880] = -1613311161 + 1613311204;
        byArray9[-1865987069 + 1865987078] = -2064441631 + 2064441581;
        byArray9[-185815220 + 185815230] = -1209279240 + 1209279143;
        byArray9[-1722548715 + 1722548726] = -1886638467 + 1886638544;
        this.\u0458\u0456\u0458\u0458ae = ((\u0430c\u0440)((Object)i\u0435\u0445\u0456sh.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray9, (int)(-432398018 + 879753579), (int)(-509531907 + 1129905148)))))).\u0455xi\u0440(true).\u0458c\u0456\u0440().getBooleanValue();
        byte[] byArray10 = new byte[-1071181490 + 1071181500];
        byArray10[0] = -2028309630 + 2028309558;
        byArray10[1] = -453191761 + 453191738;
        byArray10[2] = -253145963 + 253145987;
        byArray10[3] = -821895626 + 821895539;
        byArray10[4] = -774952365 + 774952357;
        byArray10[5] = -420626646 + 420626698;
        byArray10[-889802273 + 889802279] = -936901493 + 936901528;
        byArray10[-1982901066 + 1982901073] = -1760287359 + 1760287332;
        byArray10[-1605922628 + 1605922636] = 3;
        byArray10[-1297443552 + 1297443561] = -1936763682 + 1936763735;
        \u0430c\u0440 \u0430c\u04403 = ((\u0430c\u0440)((Object)i\u0435\u0445\u0456sh.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray10, (int)(2085811209 + 518694708), (int)(-1309006808 + 935511444)))))).s\u0458\u0458a(1.0f).x\u0455heah\u0445(1.0f).\u043ecxi\u0455(1.0f).a\u0455\u0445\u0435c(9.0f);
        h\u04bb\u0455hpa h\u04bb\u0455hpa3 = this.\u0458\u0456\u0458\u0458ae;
        i\u0435\u0445\u0456sh.a_bsm2("requireNonNull", requireNonNull(T ), (Object)h\u04bb\u0455hpa3);
        this.o\u04bb\u0440 = \u0430c\u04403.p\u0441\u0445(h\u04bb\u0455hpa3::axpacc).\u0458c\u0456\u0440().getFloatValue();
        byte[] byArray11 = new byte[-1486927708 + 1486927720];
        byArray11[0] = -253531945 + 253532051;
        byArray11[1] = -1089997165 + 1089997205;
        byArray11[2] = -737622680 + 737622606;
        byArray11[3] = -607055771 + 607055742;
        byArray11[4] = -1458498598 + 1458498590;
        byArray11[5] = -617332820 + 617332933;
        byArray11[-2144431479 + 2144431485] = -1701360796 + 1701360701;
        byArray11[-1457005408 + 1457005415] = -927679667 + 927679544;
        byArray11[-1803397240 + 1803397248] = -185943932 + 185943998;
        byArray11[-1775755747 + 1775755756] = -566394287 + 566394312;
        byArray11[-1851855193 + 1851855203] = -866443268 + 866443177;
        byArray11[-698016651 + 698016662] = 0;
        this.ijao = ((\u0430c\u0440)((Object)i\u0435\u0445\u0456sh.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray11, (int)(1019385361 + 240694537), (int)(-1566956098 + 199592129)))))).p\u0441\u0445(() -> {
            boolean bl = false;
            if (bl) {
                __js_dispatch_state = 0;
            }
            if ((3 * 3 + 3) % 2 == 0) {
            }
            return i\u0435\u0445\u0456sh.a_bsm51("valueOf", valueOf(boolean ), (!this.xsie\u0456.cip((String)((Object)i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1341229063 + 1341229157, -1455440976 + 1455441065, -1705203582 + 1705203565, -1956203123 + 1956203028, 2}, (int)(-614114697 + 772386552), (int)(-10268095 + 410043794)))) ? 1 : 0) != 0);
        }).\u0455xi\u0440(true).\u0458c\u0456\u0440().getBooleanValue();
        byte[] byArray12 = new byte[-957767113 + 957767123];
        byArray12[0] = -344204444 + 344204463;
        byArray12[1] = -658480557 + 658480571;
        byArray12[2] = -1721056420 + 1721056339;
        byArray12[3] = -1150595387 + 1150595330;
        byArray12[4] = -997548260 + 997548161;
        byArray12[5] = -2026347241 + 2026347353;
        byArray12[-503879700 + 503879706] = -1378500605 + 1378500556;
        byArray12[-194158469 + 194158476] = -1961061427 + 1961061326;
        byArray12[-1365893149 + 1365893157] = -1898766261 + 1898766237;
        byArray12[-771632986 + 771632995] = -534154033 + 534154055;
        this.\u0440s\u0430cc\u0456h = ((\u0430c\u0440)((Object)i\u0435\u0445\u0456sh.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray12, (int)(-1952210016 + 1962695935), (int)(1826943353 + 2120939990)))))).s\u0458\u0458a(2.0f).x\u0455heah\u0445(1.0f).\u043ecxi\u0455(1.0f).a\u0455\u0445\u0435c(9.0f).p\u0441\u0445(() -> {
            boolean bl;
            boolean bl2 = false;
            if (bl2) {
                __js_dispatch_state = 0;
            }
            if (2 * 2 * 2 >= 0) {
            }
            if (this.ijao.axpacc() && !this.xsie\u0456.cip((String)((Object)i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-868367354 + 868367345, -212085491 + 212085618, -2042883546 + 2042883631, -1642973974 + 1642973990, -437660297 + 437660306}, (int)(229959099 + 1315796582), (int)(-1883954570 + 619549227))))) {
                bl = true;
                if (bl2) {
                    __js_dispatch_state = 0;
                }
            } else {
                bl = false;
            }
            return i\u0435\u0445\u0456sh.a_bsm51("valueOf", valueOf(boolean ), (boolean)bl);
        }).\u0458c\u0456\u0440().getFloatValue();
        byte[] byArray13 = new byte[-331742741 + 331742755];
        byArray13[0] = -82625406 + 82625315;
        byArray13[1] = -298427480 + 298427577;
        byArray13[2] = -1909104869 + 1909104915;
        byArray13[3] = -1150350260 + 1150350225;
        byArray13[4] = -609121675 + 609121799;
        byArray13[5] = -32909897 + 32909967;
        byArray13[-1679128703 + 1679128709] = -1386906156 + 1386906063;
        byArray13[-2003589896 + 2003589903] = -182902625 + 182902586;
        byArray13[-1865969526 + 1865969534] = -812926985 + 812926907;
        byArray13[-557218326 + 557218335] = -49564691 + 49564626;
        byArray13[-1634497282 + 1634497292] = -1168719618 + 1168719589;
        byArray13[-92101452 + 92101463] = -797192651 + 797192541;
        byArray13[-313350064 + 313350076] = -1675333298 + 1675333418;
        byArray13[-211385240 + 211385253] = -413751132 + 413751032;
        \u0430c\u0440 \u0430c\u04404 = ((\u0430c\u0440)((Object)i\u0435\u0445\u0456sh.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray13, (int)(-2086194211 + 230055296), (int)(-2025525727 + 684573169)))))).s\u0458\u0458a(256.0f).x\u0455heah\u0445(64.0f).\u043ecxi\u0455(64.0f).a\u0455\u0445\u0435c(512.0f);
        h\u04bb\u0455hpa h\u04bb\u0455hpa4 = this.ijao;
        i\u0435\u0445\u0456sh.a_bsm2("requireNonNull", requireNonNull(T ), (Object)h\u04bb\u0455hpa4);
        this.jx\u0440h\u04bb\u0455 = \u0430c\u04404.p\u0441\u0445(h\u04bb\u0455hpa4::axpacc).\u0458c\u0456\u0440().getFloatValue();
        byte[] byArray14 = new byte[-753154150 + 753154164];
        byArray14[0] = -1501155425 + 1501155488;
        byArray14[1] = -915394479 + 915394475;
        byArray14[2] = -1683599172 + 1683599106;
        byArray14[3] = -734954529 + 734954626;
        byArray14[4] = -180791577 + 180791454;
        byArray14[5] = -1454334750 + 1454334744;
        byArray14[-438508792 + 438508798] = -261412805 + 261412815;
        byArray14[-1701082502 + 1701082509] = -1776620702 + 1776620651;
        byArray14[-855224183 + 855224191] = -768928924 + 768928945;
        byArray14[-1751320320 + 1751320329] = -32008274 + 32008303;
        byArray14[-506289346 + 506289356] = -297860134 + 297860101;
        byArray14[-1057682155 + 1057682166] = -1819676945 + 1819676831;
        byArray14[-298992941 + 298992953] = -1601522383 + 1601522303;
        byArray14[-1289383261 + 1289383274] = -1873548630 + 1873548736;
        this.a\u0441\u0430\u043e\u0440 = ((\u0430c\u0440)((Object)i\u0435\u0445\u0456sh.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray14, (int)(-960514486 + 1436837401), (int)(-1952602455 + 338688291)))))).\u0455xi\u0440(true).\u0458c\u0456\u0440().getBooleanValue();
        byte[] byArray15 = new byte[-799503660 + 799503672];
        byArray15[0] = -567462602 + 567462571;
        byArray15[1] = -881410773 + 881410657;
        byArray15[2] = -1375218372 + 1375218381;
        byArray15[3] = -1612971916 + 1612971802;
        byArray15[4] = -925034674 + 925034793;
        byArray15[5] = -875903734 + 875903707;
        byArray15[-1069592804 + 1069592810] = -1474390479 + 1474390394;
        byArray15[-897407727 + 897407734] = -1121710143 + 1121710083;
        byArray15[-912494913 + 912494921] = -742073138 + 742073053;
        byArray15[-294605023 + 294605032] = -1538172914 + 1538172802;
        byArray15[-840357634 + 840357644] = 2;
        byArray15[-1273302241 + 1273302252] = -1252354723 + 1252354601;
        \u0430c\u0440 \u0430c\u04405 = ((\u0430c\u0440)((Object)i\u0435\u0445\u0456sh.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray15, (int)(-2110049064 + 31543108), (int)(-1789497107 + 475021496)))))).s\u0458\u0458a(3.0f).x\u0455heah\u0445(1.0f).\u043ecxi\u0455(1.0f).a\u0455\u0445\u0435c(9.0f);
        h\u04bb\u0455hpa h\u04bb\u0455hpa5 = this.a\u0441\u0430\u043e\u0440;
        i\u0435\u0445\u0456sh.a_bsm2("requireNonNull", requireNonNull(T ), (Object)h\u04bb\u0455hpa5);
        this.\u0456\u04bbj = \u0430c\u04405.p\u0441\u0445(h\u04bb\u0455hpa5::axpacc).\u0458c\u0456\u0440().getFloatValue();
        byte[] byArray16 = new byte[-400082455 + 400082465];
        byArray16[0] = -211471787 + 211471776;
        byArray16[1] = -1721653227 + 1721653304;
        byArray16[2] = -2056551831 + 2056551788;
        byArray16[3] = -1218814917 + 1218814986;
        byArray16[4] = -368916294 + 368916335;
        byArray16[5] = -2052801112 + 2052801188;
        byArray16[-881314601 + 881314607] = -1096402923 + 1096403005;
        byArray16[-567090318 + 567090325] = -1761826383 + 1761826338;
        byArray16[-971040858 + 971040866] = -1844926940 + 1844926937;
        byArray16[-676406953 + 676406962] = 3;
        this.\u0440cep = ((\u0430c\u0440)((Object)i\u0435\u0445\u0456sh.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray16, (int)(-1467543209 + 134979386), (int)(1956919052 + 750545492)))))).\u0455xi\u0440(true).\u0458c\u0456\u0440().getBooleanValue();
        byte[] byArray17 = new byte[-323980716 + 323980724];
        byArray17[0] = -459696659 + 459696619;
        byArray17[1] = -1029368937 + 1029368989;
        byArray17[2] = -1566419630 + 1566419700;
        byArray17[3] = -1372440253 + 1372440358;
        byArray17[4] = -2091570844 + 2091570916;
        byArray17[5] = -1738679796 + 1738679804;
        byArray17[-852205467 + 852205473] = -1054325689 + 1054325617;
        byArray17[-485853923 + 485853930] = -1475147343 + 1475147395;
        \u0430c\u0440 \u0430c\u04406 = ((\u0430c\u0440)((Object)i\u0435\u0445\u0456sh.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray17, (int)(1945551843 + 1527450398), (int)(1217872983 + 495722956)))))).s\u0458\u0458a(4.0f).x\u0455heah\u0445(1.0f).\u043ecxi\u0455(1.0f).a\u0455\u0445\u0435c(9.0f);
        h\u04bb\u0455hpa h\u04bb\u0455hpa6 = this.\u0440cep;
        i\u0435\u0445\u0456sh.a_bsm2("requireNonNull", requireNonNull(T ), (Object)h\u04bb\u0455hpa6);
        this.a\u0441chp = \u0430c\u04406.p\u0441\u0445(h\u04bb\u0455hpa6::axpacc).\u0458c\u0456\u0440().getFloatValue();
        byte[] byArray18 = new byte[-216580125 + 216580147];
        byArray18[0] = -376988964 + 376988918;
        byArray18[1] = -723295351 + 723295393;
        byArray18[2] = -1316493728 + 1316493834;
        byArray18[3] = -941834402 + 941834300;
        byArray18[4] = -1373410183 + 1373410150;
        byArray18[5] = -24948112 + 24948234;
        byArray18[-921965542 + 921965548] = -1137924775 + 1137924690;
        byArray18[-686850184 + 686850191] = -650867423 + 650867505;
        byArray18[-1054580984 + 1054580992] = -743145607 + 743145517;
        byArray18[-690111688 + 690111697] = -1654623303 + 1654623320;
        byArray18[-987773737 + 987773747] = -467192446 + 467192502;
        byArray18[-569107647 + 569107658] = -728895002 + 728894912;
        byArray18[-2037230062 + 2037230074] = -1235077432 + 1235077354;
        byArray18[-1379169151 + 1379169164] = -389164576 + 389164631;
        byArray18[-1217875979 + 1217875993] = -364387068 + 364387030;
        byArray18[-1332665969 + 1332665984] = -1736437723 + 1736437646;
        byArray18[-795888639 + 795888655] = -1855814431 + 1855814338;
        byArray18[-734223557 + 734223574] = -334508150 + 334508105;
        byArray18[-1227158796 + 1227158814] = -1921316447 + 1921316458;
        byArray18[-1042685077 + 1042685096] = -2066857155 + 2066857200;
        byArray18[-1791680230 + 1791680250] = -955988681 + 955988583;
        byArray18[-747464597 + 747464618] = -143789611 + 143789731;
        this.pish = ((\u0430c\u0440)((Object)i\u0435\u0445\u0456sh.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray18, (int)(-1385824740 + 2126851598), (int)(-363251400 + 1082978733)))))).\u0455xi\u0440(true).\u0458c\u0456\u0440().getBooleanValue();
        byte[] byArray19 = new byte[-1998789000 + 1998789008];
        byArray19[0] = -257526559 + 257526666;
        byArray19[1] = -879601237 + 879601253;
        byArray19[2] = -1222663080 + 1222662957;
        byArray19[3] = -1055973853 + 1055973885;
        byArray19[4] = -1138899494 + 1138899529;
        byArray19[5] = -1024425735 + 1024425787;
        byArray19[-1388795797 + 1388795803] = -1891920856 + 1891920930;
        byArray19[-139000460 + 139000467] = -1858577794 + 1858577697;
        \u0430c\u0440 \u0430c\u04407 = ((\u0430c\u0440)((Object)i\u0435\u0445\u0456sh.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray19, (int)(1953596172 + 1608864074), (int)(976699835 + 763373051)))))).s\u0458\u0458a(5.0f).x\u0455heah\u0445(1.0f).\u043ecxi\u0455(1.0f).a\u0455\u0445\u0435c(9.0f);
        h\u04bb\u0455hpa h\u04bb\u0455hpa7 = this.pish;
        i\u0435\u0445\u0456sh.a_bsm2("requireNonNull", requireNonNull(T ), (Object)h\u04bb\u0455hpa7);
        this.\u0445x\u0445p\u0435 = \u0430c\u04407.p\u0441\u0445(h\u04bb\u0455hpa7::axpacc).\u0458c\u0456\u0440().getFloatValue();
        byte[] byArray20 = new byte[-1598584010 + 1598584022];
        byArray20[0] = -858698921 + 858698951;
        byArray20[1] = -647528490 + 647528499;
        byArray20[2] = -1700725086 + 1700725026;
        byArray20[3] = -1011749562 + 1011749652;
        byArray20[4] = -1969985726 + 1969985641;
        byArray20[5] = -856435705 + 856435732;
        byArray20[-1199384393 + 1199384399] = -2135717160 + 2135717074;
        byArray20[-772952530 + 772952537] = -198291189 + 198291125;
        byArray20[-534592613 + 534592621] = -844361730 + 844361768;
        byArray20[-966859548 + 966859557] = -2033719308 + 2033719365;
        byArray20[-2076272719 + 2076272729] = -1169215922 + 1169215993;
        byArray20[-690399193 + 690399204] = -385251198 + 385251300;
        String[] stringArray2 = new String[3];
        byte[] byArray21 = new byte[-1849618714 + 1849618722];
        byArray21[0] = -364571167 + 364571194;
        byArray21[1] = -339171284 + 339171191;
        byArray21[2] = -619133370 + 619133306;
        byArray21[3] = 1;
        byArray21[4] = -1757451702 + 1757451749;
        byArray21[5] = -2112925873 + 2112925764;
        byArray21[-2127931475 + 2127931481] = -1988503681 + 1988503634;
        byArray21[-1674279509 + 1674279516] = -951169006 + 951169071;
        stringArray2[0] = i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray21, (int)(-2081756331 + 2074743871), (int)(7680510 + 465496629));
        byte[] byArray22 = new byte[-839511962 + 839511971];
        byArray22[0] = -2071716378 + 2071716444;
        byArray22[1] = -287231755 + 287231864;
        byArray22[2] = -1692987009 + 1692986934;
        byArray22[3] = -2021674539 + 2021674549;
        byArray22[4] = -1829325838 + 1829325956;
        byArray22[5] = -189832408 + 189832384;
        byArray22[-2068740342 + 2068740348] = -14388341 + 14388463;
        byArray22[-900812014 + 900812021] = -2079401036 + 2079401050;
        byArray22[-113579719 + 113579727] = -1986920141 + 1986920125;
        stringArray2[1] = i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray22, (int)(1176534088 + 1310988283), (int)(-386675898 + 1159291590));
        byte[] byArray23 = new byte[-943316169 + 943316178];
        byArray23[0] = -1553072285 + 1553072355;
        byArray23[1] = -1748855010 + 1748855130;
        byArray23[2] = -1716652348 + 1716652320;
        byArray23[3] = -2076920775 + 2076920656;
        byArray23[4] = -1688011802 + 1688011754;
        byArray23[5] = -87657587 + 87657462;
        byArray23[-458967311 + 458967317] = -1804976922 + 1804976942;
        byArray23[-562690334 + 562690341] = -988281118 + 988281238;
        byArray23[-1360733818 + 1360733826] = -2088017974 + 2088018048;
        stringArray2[2] = i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray23, (int)(289960209 + 782814943), (int)(-1171849710 + 950596797));
        \u0430c\u0440 \u0430c\u04408 = ((\u0430c\u0440)((Object)i\u0435\u0445\u0456sh.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray20, (int)(-2145141230 + 1076429369), (int)(505543996 + 240660285)))))).\u0455iaip\u0458e(stringArray2);
        h\u04bb\u0455hpa h\u04bb\u0455hpa8 = this.pish;
        i\u0435\u0445\u0456sh.a_bsm2("requireNonNull", requireNonNull(T ), (Object)h\u04bb\u0455hpa8);
        this.\u0440\u043eo\u043eip\u0456 = \u0430c\u04408.p\u0441\u0445(h\u04bb\u0455hpa8::axpacc).\u0458c\u0456\u0440().getModeValue();
        byte[] byArray24 = new byte[-1982924957 + 1982924971];
        byArray24[0] = -248065134 + 248065080;
        byArray24[1] = -1032930524 + 1032930594;
        byArray24[2] = -959946531 + 959946424;
        byArray24[3] = -60745016 + 60744980;
        byArray24[4] = -670676788 + 670676730;
        byArray24[5] = -418514121 + 418514214;
        byArray24[-1167600560 + 1167600566] = -174325352 + 174325248;
        byArray24[-686706436 + 686706443] = -2050590085 + 2050590037;
        byArray24[-1343878921 + 1343878929] = -2053820119 + 2053820035;
        byArray24[-2004198238 + 2004198247] = -1042604986 + 1042605047;
        byArray24[-1851218337 + 1851218347] = -1298882036 + 1298882118;
        byArray24[-324257254 + 324257265] = -10060526 + 10060415;
        byArray24[-177816679 + 177816691] = -922539824 + 922539735;
        byArray24[-350592696 + 350592709] = -1299237854 + 1299237745;
        \u0430c\u0440 \u0430c\u04409 = ((\u0430c\u0440)((Object)i\u0435\u0445\u0456sh.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray24, (int)(1691271657 + 505594119), (int)(-2065297953 + 1571083434)))))).s\u0458\u0458a(256.0f).x\u0455heah\u0445(64.0f).\u043ecxi\u0455(64.0f).a\u0455\u0445\u0435c(512.0f);
        h\u04bb\u0455hpa h\u04bb\u0455hpa9 = this.pish;
        i\u0435\u0445\u0456sh.a_bsm2("requireNonNull", requireNonNull(T ), (Object)h\u04bb\u0455hpa9);
        this.\u0440\u0456p\u0441ap = \u0430c\u04409.p\u0441\u0445(h\u04bb\u0455hpa9::axpacc).\u0458c\u0456\u0440().getFloatValue();
        byte[] byArray25 = new byte[-769589911 + 769589930];
        byArray25[0] = -1185557816 + 1185557742;
        byArray25[1] = -2127075986 + 2127075956;
        byArray25[2] = -1960873412 + 1960873393;
        byArray25[3] = -433487557 + 433487523;
        byArray25[4] = -1869476408 + 1869476318;
        byArray25[5] = -2096861108 + 2096861208;
        byArray25[-361465741 + 361465747] = -1395722900 + 1395722916;
        byArray25[-252462001 + 252462008] = -2016384191 + 2016384169;
        byArray25[-38352772 + 38352780] = -45151642 + 45151586;
        byArray25[-441335528 + 441335537] = -1282456435 + 1282456398;
        byArray25[-877823446 + 877823456] = -395213693 + 395213635;
        byArray25[-279159795 + 279159806] = -1830720655 + 1830720747;
        byArray25[-1205718769 + 1205718781] = -1890949872 + 1890949749;
        byArray25[-882265851 + 882265864] = -1750130516 + 1750130554;
        byArray25[-233282590 + 233282604] = -1554765399 + 1554765338;
        byArray25[-1008025629 + 1008025644] = -812943819 + 812943764;
        byArray25[-1829498339 + 1829498355] = -635026135 + 635026081;
        byArray25[-809213530 + 809213547] = -1281240137 + 1281240080;
        byArray25[-268669433 + 268669451] = -127866050 + 127866160;
        this.\u0455je\u0441ixc = ((\u0430c\u0440)((Object)i\u0435\u0445\u0456sh.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray25, (int)(495568937 + 1775550261), (int)(-622610272 + 427768770)))))).\u0455xi\u0440(true).\u0458c\u0456\u0440().getBooleanValue();
        byte[] byArray26 = new byte[-2077662952 + 2077662969];
        byArray26[0] = -2060841069 + 2060841021;
        byArray26[1] = -1185209502 + 1185209485;
        byArray26[2] = -708662589 + 708662629;
        byArray26[3] = -428658478 + 428658508;
        byArray26[4] = -760710883 + 760710972;
        byArray26[5] = -68076540 + 68076505;
        byArray26[-129967501 + 129967507] = -1890981611 + 1890981490;
        byArray26[-1758954348 + 1758954355] = -816408439 + 816408392;
        byArray26[-1761119976 + 1761119984] = -623995216 + 623995190;
        byArray26[-1427960800 + 1427960809] = -2086460294 + 2086460384;
        byArray26[-947376221 + 947376231] = -1086149605 + 1086149594;
        byArray26[-493195890 + 493195901] = -474803754 + 474803747;
        byArray26[-1502580096 + 1502580108] = 4;
        byArray26[-532518848 + 532518861] = -2142701696 + 2142701586;
        byArray26[-231741263 + 231741277] = -1477819208 + 1477819169;
        byArray26[-299543290 + 299543305] = -1881866823 + 1881866728;
        byArray26[-1016348029 + 1016348045] = -36540839 + 36540852;
        \u0430c\u0440 \u0430c\u044010 = ((\u0430c\u0440)((Object)i\u0435\u0445\u0456sh.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray26, (int)(-804082853 + 1850970891), (int)(1864358423 + 1962805766)))))).s\u0458\u0458a(6.0f).x\u0455heah\u0445(1.0f).\u043ecxi\u0455(1.0f).a\u0455\u0445\u0435c(9.0f);
        h\u04bb\u0455hpa h\u04bb\u0455hpa10 = this.\u0455je\u0441ixc;
        i\u0435\u0445\u0456sh.a_bsm2("requireNonNull", requireNonNull(T ), (Object)h\u04bb\u0455hpa10);
        this.e\u0455j\u0435p\u0435 = \u0430c\u044010.p\u0441\u0445(h\u04bb\u0455hpa10::axpacc).\u0458c\u0456\u0440().getFloatValue();
        byte[] byArray27 = new byte[-1887389659 + 1887389677];
        byArray27[0] = -294832353 + 294832229;
        byArray27[1] = -648557910 + 648557936;
        byArray27[2] = -2004235598 + 2004235475;
        byArray27[3] = -510669258 + 510669344;
        byArray27[4] = -465467799 + 465467846;
        byArray27[5] = -675928013 + 675928105;
        byArray27[-1890964927 + 1890964933] = -1013311509 + 1013311480;
        byArray27[-438449364 + 438449371] = -1491151766 + 1491151707;
        byArray27[-1633652008 + 1633652016] = -1885066168 + 1885066208;
        byArray27[-1002167351 + 1002167360] = -1544869591 + 1544869589;
        byArray27[-582230326 + 582230336] = -1174448681 + 1174448620;
        byArray27[-1468863839 + 1468863850] = -1798382914 + 1798382895;
        byArray27[-614970358 + 614970370] = -552245517 + 552245628;
        byArray27[-640363001 + 640363014] = -1581319929 + 1581319803;
        byArray27[-359860366 + 359860380] = -1068806049 + 1068806023;
        byArray27[-1137204590 + 1137204605] = -2092057871 + 2092057771;
        byArray27[-226404749 + 226404765] = -589550507 + 589550473;
        byArray27[-1776670856 + 1776670873] = -488792972 + 488792959;
        this.\u043ee\u0430 = ((\u0430c\u0440)((Object)i\u0435\u0445\u0456sh.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray27, (int)(1406657209 + 1901126255), (int)(1228029909 + 1605265675)))))).\u0455xi\u0440(true).\u0458c\u0456\u0440().getBooleanValue();
        byte[] byArray28 = new byte[-409824561 + 409824577];
        byArray28[0] = -2114930302 + 2114930216;
        byArray28[1] = -528784749 + 528784873;
        byArray28[2] = -1177042938 + 1177042892;
        byArray28[3] = -862229478 + 862229600;
        byArray28[4] = -1132352707 + 1132352638;
        byArray28[5] = -970873767 + 970873857;
        byArray28[-847584387 + 847584393] = -417212288 + 417212388;
        byArray28[-836663764 + 836663771] = -1064669377 + 1064669343;
        byArray28[-1614726246 + 1614726254] = -812022433 + 812022499;
        byArray28[-404027273 + 404027282] = -230415766 + 230415756;
        byArray28[-529536271 + 529536281] = -33395140 + 33395159;
        byArray28[-2137695492 + 2137695503] = -336640492 + 336640393;
        byArray28[-335893307 + 335893319] = -1894604057 + 1894604042;
        byArray28[-2140067712 + 2140067725] = -547829313 + 547829372;
        byArray28[-1954183695 + 1954183709] = -981858085 + 981858061;
        byArray28[-817810271 + 817810286] = -250394784 + 250394822;
        \u0430c\u0440 \u0430c\u044011 = ((\u0430c\u0440)((Object)i\u0435\u0445\u0456sh.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray28, (int)(-53790503 + 824374549), (int)(91972672 + 1747454306)))))).s\u0458\u0458a(7.0f).x\u0455heah\u0445(1.0f).\u043ecxi\u0455(1.0f).a\u0455\u0445\u0435c(9.0f);
        h\u04bb\u0455hpa h\u04bb\u0455hpa11 = this.\u043ee\u0430;
        i\u0435\u0445\u0456sh.a_bsm2("requireNonNull", requireNonNull(T ), (Object)h\u04bb\u0455hpa11);
        this.\u0430j\u0456x\u04bb = \u0430c\u044011.p\u0441\u0445(h\u04bb\u0455hpa11::axpacc).\u0458c\u0456\u0440().getFloatValue();
        byte[] byArray29 = new byte[-1374947627 + 1374947642];
        byArray29[0] = -444240393 + 444240304;
        byArray29[1] = -306368175 + 306368131;
        byArray29[2] = -1462081839 + 1462081849;
        byArray29[3] = -443146332 + 443146295;
        byArray29[4] = -319393605 + 319393539;
        byArray29[5] = -544734414 + 544734403;
        byArray29[-168009297 + 168009303] = -1416737004 + 1416736928;
        byArray29[-1023259055 + 1023259062] = -242423713 + 242423810;
        byArray29[-1638589963 + 1638589971] = -621764433 + 621764486;
        byArray29[-940662201 + 940662210] = -1852400225 + 1852400293;
        byArray29[-3990641 + 3990651] = -466808260 + 466808384;
        byArray29[-764048647 + 764048658] = -1207873007 + 1207873113;
        byArray29[-313079175 + 313079187] = -1048170457 + 1048170384;
        byArray29[-911798153 + 911798166] = -1552172972 + 1552172984;
        byArray29[-334147759 + 334147773] = 5;
        this.eep = ((\u0430c\u0440)((Object)i\u0435\u0445\u0456sh.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray29, (int)(-442166014 + 1672623188), (int)(734922748 + 2124784247)))))).\u0455xi\u0440(true).\u0458c\u0456\u0440().getBooleanValue();
        byte[] byArray30 = new byte[-265466503 + 265466516];
        byArray30[0] = -1360990145 + 1360990260;
        byArray30[1] = -1501833779 + 1501833702;
        byArray30[2] = -416352362 + 416352357;
        byArray30[3] = -1851171073 + 1851171044;
        byArray30[4] = -781864686 + 781864626;
        byArray30[5] = -34079843 + 34079760;
        byArray30[-416087301 + 416087307] = -432418348 + 432418377;
        byArray30[-1405549867 + 1405549874] = -1506749720 + 1506749615;
        byArray30[-1731820956 + 1731820964] = -603589130 + 603589179;
        byArray30[-1077342919 + 1077342928] = -240915255 + 240915171;
        byArray30[-1759223965 + 1759223975] = -1932974762 + 1932974805;
        byArray30[-735828161 + 735828172] = -299340722 + 299340784;
        byArray30[-336008850 + 336008862] = -124633568 + 124633657;
        \u0430c\u0440 \u0430c\u044012 = ((\u0430c\u0440)((Object)i\u0435\u0445\u0456sh.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray30, (int)(-17879210 + 1695888557), (int)(1471715202 + 394123188)))))).s\u0458\u0458a(8.0f).x\u0455heah\u0445(1.0f).\u043ecxi\u0455(1.0f).a\u0455\u0445\u0435c(9.0f);
        h\u04bb\u0455hpa h\u04bb\u0455hpa12 = this.eep;
        i\u0435\u0445\u0456sh.a_bsm2("requireNonNull", requireNonNull(T ), (Object)h\u04bb\u0455hpa12);
        this.ix\u0455\u0455\u043ec = \u0430c\u044012.p\u0441\u0445(h\u04bb\u0455hpa12::axpacc).\u0458c\u0456\u0440().getFloatValue();
        byte[] byArray31 = new byte[-1166386690 + 1166386709];
        byArray31[0] = -960467230 + 960467105;
        byArray31[1] = -1362735775 + 1362735746;
        byArray31[2] = -1470249723 + 1470249669;
        byArray31[3] = -378352825 + 378352813;
        byArray31[4] = -1484573903 + 1484573955;
        byArray31[5] = -1503367381 + 1503367492;
        byArray31[-1514766368 + 1514766374] = -1284247411 + 1284247376;
        byArray31[-957701721 + 957701728] = -2078552864 + 2078552919;
        byArray31[-634594462 + 634594470] = -991708058 + 991708031;
        byArray31[-2106408865 + 2106408874] = -522253571 + 522253615;
        byArray31[-1469992396 + 1469992406] = -191495046 + 191495110;
        byArray31[-163072069 + 163072080] = -790334562 + 790334479;
        byArray31[-1151626905 + 1151626917] = 0;
        byArray31[-1474687300 + 1474687313] = -1851110202 + 1851110247;
        byArray31[-800739039 + 800739053] = -1732991865 + 1732991898;
        byArray31[-509355146 + 509355161] = -113553301 + 113553270;
        byArray31[-1447619426 + 1447619442] = -265431223 + 265431212;
        byArray31[-1050160934 + 1050160951] = -269869321 + 269869278;
        byArray31[-1020274955 + 1020274973] = 5;
        this.x\u043es = ((\u0430c\u0440)((Object)i\u0435\u0445\u0456sh.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray31, (int)(1609502341 + 2035796673), (int)(1395506711 + 197370073)))))).p\u0441\u0445(() -> {
            boolean bl = false;
            if (bl) {
                __js_dispatch_state = 0;
            }
            if (2 * 2 * 2 >= 0) {
            }
            byte[] byArray = new byte[-410878924 + 410878936];
            byArray[0] = -1480482343 + 1480482226;
            byArray[1] = -711163161 + 711163037;
            byArray[2] = -1904003449 + 1904003482;
            byArray[3] = -1049599158 + 1049599079;
            byArray[4] = -1557821935 + 1557821879;
            byArray[5] = -1450498599 + 1450498631;
            byArray[-1748452546 + 1748452552] = -1833870570 + 1833870629;
            byArray[-1815199520 + 1815199527] = -1097390084 + 1097390188;
            byArray[-702953429 + 702953437] = -1379894186 + 1379894204;
            byArray[-1847394396 + 1847394405] = -185799316 + 0xB131311;
            byArray[-804889575 + 804889585] = -1445730064 + 1445729981;
            byArray[-576146057 + 576146068] = -2031499667 + 2031499739;
            return i\u0435\u0445\u0456sh.a_bsm51("valueOf", valueOf(boolean ), (!this.xsie\u0456.cip((String)((Object)i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-1243936417 + 1221784910), (int)(1695729008 + 171813344)))) ? 1 : 0) != 0);
        }).\u0455xi\u0440(true).\u0458c\u0456\u0440().getBooleanValue();
        byte[] byArray32 = new byte[-1624400083 + 1624400100];
        byArray32[0] = -875265035 + 875265159;
        byArray32[1] = -472913630 + 472913601;
        byArray32[2] = -1874852098 + 1874852178;
        byArray32[3] = -1905222456 + 1905222493;
        byArray32[4] = -913656927 + 913657025;
        byArray32[5] = -514545830 + 514545751;
        byArray32[-17101253 + 17101259] = -946752742 + 946752757;
        byArray32[-684649682 + 684649689] = -1094605473 + 1094605380;
        byArray32[-1176823567 + 1176823575] = -2140906622 + 2140906523;
        byArray32[-1066888051 + 1066888060] = -767318681 + 767318623;
        byArray32[-958682907 + 958682917] = -1834739371 + 1834739341;
        byArray32[-2062842538 + 2062842549] = -1622278842 + 1622278957;
        byArray32[-91128706 + 91128718] = -702278908 + 702279035;
        byArray32[-1027789255 + 1027789268] = -1736975685 + 1736975641;
        byArray32[-1015049025 + 1015049039] = -1953180225 + 1953180250;
        byArray32[-1572309850 + 1572309865] = -797346086 + 797346128;
        byArray32[-1887726976 + 1887726992] = -27305506 + 27305544;
        this.\u0441\u0445j\u0458\u0440\u043e\u04bb = ((\u0430c\u0440)((Object)i\u0435\u0445\u0456sh.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray32, (int)(1527682800 + 1565663600), (int)(202348686 + 1689966651)))))).s\u0458\u0458a(9.0f).x\u0455heah\u0445(1.0f).\u043ecxi\u0455(1.0f).a\u0455\u0445\u0435c(9.0f).p\u0441\u0445(() -> {
            boolean bl = false;
            if (bl) {
                __js_dispatch_state = 0;
            }
            if (2 * 2 * 2 >= 0) {
            }
            byte[] byArray = new byte[-2016086448 + 2016086460];
            byArray[0] = -1478568532 + 1478568658;
            byArray[1] = -804834667 + 804834591;
            byArray[2] = -955844951 + 955844872;
            byArray[3] = -838178159 + 838178101;
            byArray[4] = -872692576 + 872692545;
            byArray[5] = -688380829 + 688380720;
            byArray[-1046163211 + 1046163217] = -501330049 + 501330094;
            byArray[-623095050 + 623095057] = -456898099 + 456898020;
            byArray[-330162167 + 330162175] = -1106230595 + 1106230611;
            byArray[-249120822 + 249120831] = -944293878 + 944293831;
            byArray[-1680199685 + 1680199695] = -1926738303 + 1926738357;
            byArray[-924129349 + 924129360] = -709989747 + 709989862;
            return i\u0435\u0445\u0456sh.a_bsm51("valueOf", valueOf(boolean ), (!this.xsie\u0456.cip((String)((Object)i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(268088883 + 1486402143), (int)(-987269874 + 162486728)))) && this.x\u043es.axpacc() ? 1 : 0) != 0);
        }).\u0458c\u0456\u0440().getFloatValue();
        byte[] byArray33 = new byte[-1412171664 + 1412171682];
        byArray33[0] = -584076701 + 584076823;
        byArray33[1] = -1532414315 + 1532414343;
        byArray33[2] = -1103965547 + 1103965594;
        byArray33[3] = -1228554224 + 1228554248;
        byArray33[4] = -600093968 + 600093945;
        byArray33[5] = -1124275021 + 1124275033;
        byArray33[-1250661428 + 1250661434] = -2055761991 + 2055762092;
        byArray33[-1854543807 + 1854543814] = -573229971 + 573229855;
        byArray33[-739197771 + 739197779] = -1542996654 + 1542996531;
        byArray33[-953813731 + 953813740] = -2114536003 + 2114535997;
        byArray33[-1383208822 + 1383208832] = -1172359766 + 1172359786;
        byArray33[-671341800 + 671341811] = -1760772016 + 1760772104;
        byArray33[-850944335 + 850944347] = -2133975123 + 2133975007;
        byArray33[-94656414 + 94656427] = -181926981 + 181927079;
        byArray33[-259703718 + 259703732] = -1088934931 + 1088935053;
        byArray33[-700459494 + 700459509] = -1002678289 + 1002678295;
        byArray33[-966622046 + 966622062] = -932899217 + 932899247;
        byArray33[-1753146395 + 1753146412] = -1492918100 + 1492918088;
        \u0430c\u0440 \u0430c\u044013 = ((\u0430c\u0440)((Object)i\u0435\u0445\u0456sh.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray33, (int)(546645307 + 262015735), (int)(7041487 + 1612246709)))))).s\u0458\u0458a(1.0f).x\u0455heah\u0445(1.0f).\u043ecxi\u0455(0.0f).a\u0455\u0445\u0435c(5.0f);
        h\u04bb\u0455hpa h\u04bb\u0455hpa13 = this.shxx;
        i\u0435\u0445\u0456sh.a_bsm2("requireNonNull", requireNonNull(T ), (Object)h\u04bb\u0455hpa13);
        this.o\u0430\u0430jx = \u0430c\u044013.p\u0441\u0445(h\u04bb\u0455hpa13::axpacc).\u0458c\u0456\u0440().getFloatValue();
        byte[] byArray34 = new byte[-1735987485 + 1735987502];
        byArray34[0] = -49844614 + 49844581;
        byArray34[1] = -1935008618 + 1935008610;
        byArray34[2] = -2133630286 + 2133630292;
        byArray34[3] = -921343503 + 921343498;
        byArray34[4] = -914290406 + 914290481;
        byArray34[5] = -2132821169 + 2132821283;
        byArray34[-1109222578 + 1109222584] = -650322581 + 650322504;
        byArray34[-2042519173 + 2042519180] = -834351646 + 834351718;
        byArray34[-2116777421 + 2116777429] = -958470762 + 958470863;
        byArray34[-90909709 + 90909718] = -1335815458 + 1335815436;
        byArray34[-745997009 + 745997019] = -2145388929 + 2145388919;
        byArray34[-299013343 + 299013354] = -780474901 + 780474947;
        byArray34[-1518257084 + 1518257096] = -2767583 + 2767660;
        byArray34[-1252831870 + 1252831883] = -336610668 + 336610752;
        byArray34[-1020326409 + 1020326423] = -235787909 + 235787963;
        byArray34[-1850258126 + 1850258141] = -748035722 + 748035740;
        byArray34[-449514886 + 449514902] = -93345463 + 93345340;
        \u0430c\u0440 \u0430c\u044014 = ((\u0430c\u0440)((Object)i\u0435\u0445\u0456sh.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray34, (int)(469092688 + 1940178506), (int)(-559104642 + 1184524232)))))).s\u0458\u0458a(1.0f).x\u0455heah\u0445(1.0f).\u043ecxi\u0455(0.0f).a\u0455\u0445\u0435c(5.0f);
        h\u04bb\u0455hpa h\u04bb\u0455hpa14 = this.shxx;
        i\u0435\u0445\u0456sh.a_bsm2("requireNonNull", requireNonNull(T ), (Object)h\u04bb\u0455hpa14);
        this.\u043e\u043ep\u04bb\u0458h\u0430 = \u0430c\u044014.p\u0441\u0445(h\u04bb\u0455hpa14::axpacc).\u0458c\u0456\u0440().getFloatValue();
        byte[] byArray35 = new byte[-309845054 + 309845077];
        byArray35[0] = -1933569265 + 1933569308;
        byArray35[1] = -792432025 + 792432133;
        byArray35[2] = -1882076629 + 1882076719;
        byArray35[3] = -2011183150 + 2011183034;
        byArray35[4] = -1785791808 + 1785791686;
        byArray35[5] = -569044201 + 569044075;
        byArray35[-80131681 + 80131687] = -1117411616 + 1117411506;
        byArray35[-63871463 + 63871470] = -1014249780 + 1014249861;
        byArray35[-1037587466 + 1037587474] = 0;
        byArray35[-1479308537 + 1479308546] = -1179051252 + 1179051130;
        byArray35[-1658060192 + 1658060202] = -2050407727 + 2050407639;
        byArray35[-1024630704 + 1024630715] = -323638175 + 323638285;
        byArray35[-355431478 + 355431490] = -1;
        byArray35[-1434966252 + 1434966265] = -369426158 + 369426124;
        byArray35[-1147767587 + 1147767601] = -1920481492 + 1920481445;
        byArray35[-832533378 + 832533393] = -1587185460 + 1587185585;
        byArray35[-1950327567 + 1950327583] = -1732943656 + 1732943649;
        byArray35[-955968603 + 955968620] = -448107863 + 448107850;
        byArray35[-1373676060 + 1373676078] = -135355480 + 135355419;
        byArray35[-1466953072 + 1466953091] = -1214957785 + 1214957766;
        byArray35[-1230548675 + 1230548695] = -1346452203 + 1346452301;
        byArray35[-2048310782 + 2048310803] = -1164429181 + 1164429246;
        byArray35[-1405561163 + 1405561185] = -732547381 + 732547373;
        this.ox\u0440ip\u0456\u0435 = ((\u0430c\u0440)((Object)i\u0435\u0445\u0456sh.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray35, (int)(85833964 + 556297561), (int)(-1247584085 + 879135070)))))).\u0455xi\u0440(false).\u0458c\u0456\u0440().getBooleanValue();
        byte[] byArray36 = new byte[-1189705240 + 1189705261];
        byArray36[0] = -780398746 + 780398702;
        byArray36[1] = -1335013086 + 1335013100;
        byArray36[2] = -101909709 + 101909694;
        byArray36[3] = -1226564160 + 1226564256;
        byArray36[4] = -993373576 + 993373599;
        byArray36[5] = -134669017 + 134668982;
        byArray36[-1611936329 + 1611936335] = -2022944513 + 2022944424;
        byArray36[-1372723947 + 1372723954] = -1139237645 + 1139237520;
        byArray36[-164000360 + 164000368] = -1501291836 + 1501291757;
        byArray36[-256849423 + 256849432] = -1431162758 + 1431162745;
        byArray36[-1338280726 + 1338280736] = 4;
        byArray36[-122637195 + 122637206] = -626975288 + 626975303;
        byArray36[-2081863783 + 2081863795] = -1321045734 + 1321045710;
        byArray36[-618944424 + 618944437] = -502188144 + 502188125;
        byArray36[-571118829 + 571118843] = -375987770 + 375987789;
        byArray36[-1489284417 + 1489284432] = -514512592 + 514512670;
        byArray36[-1367452947 + 1367452963] = -1943050235 + 1943050211;
        byArray36[-792221180 + 792221197] = -194528594 + 194528665;
        byArray36[-1675635003 + 1675635021] = -2109400502 + 2109400449;
        byArray36[-830830694 + 830830713] = -1343953251 + 1343953322;
        byArray36[-1268851570 + 1268851590] = -401718227 + 401718284;
        \u0430c\u0440 \u0430c\u044015 = ((\u0430c\u0440)((Object)i\u0435\u0445\u0456sh.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray36, (int)(-1246807903 + 2095577589), (int)(-716910014 + 1368806552)))))).s\u0458\u0458a(9.0f).x\u0455heah\u0445(1.0f).\u043ecxi\u0455(1.0f).a\u0455\u0445\u0435c(9.0f);
        h\u04bb\u0455hpa h\u04bb\u0455hpa15 = this.ox\u0440ip\u0456\u0435;
        i\u0435\u0445\u0456sh.a_bsm2("requireNonNull", requireNonNull(T ), (Object)h\u04bb\u0455hpa15);
        this.o\u0445\u0441a\u0456sp = \u0430c\u044015.p\u0441\u0445(h\u04bb\u0455hpa15::axpacc).\u0458c\u0456\u0440().getFloatValue();
        byte[] byArray37 = new byte[-1811625059 + 1811625084];
        byArray37[0] = -1567768138 + 1567768025;
        byArray37[1] = -1213273289 + 1213273405;
        byArray37[2] = -1987512378 + 1987512286;
        byArray37[3] = -1813419433 + 1813419550;
        byArray37[4] = -596120167 + 596120120;
        byArray37[5] = -1689620467 + 1689620374;
        byArray37[-2046604289 + 2046604295] = -1559533019 + 1559533007;
        byArray37[-661726240 + 661726247] = -1899091507 + 1899091604;
        byArray37[-882209706 + 882209714] = -959033355 + 959033414;
        byArray37[-1587108383 + 1587108392] = -1026945113 + 1026945157;
        byArray37[-1883935916 + 1883935926] = -268915041 + 268914949;
        byArray37[-702593314 + 702593325] = -1;
        byArray37[-870304114 + 870304126] = -1889689944 + 1889689950;
        byArray37[-6803302 + 6803315] = -1137935495 + 1137935535;
        byArray37[-1665730289 + 1665730303] = -128318508 + 128318421;
        byArray37[-698278793 + 698278808] = -1197673823 + 1197673949;
        byArray37[-1098263605 + 1098263621] = -1787186495 + 1787186589;
        byArray37[-1824156772 + 1824156789] = -296158086 + 296158194;
        byArray37[-560429339 + 560429357] = -499723560 + 499723577;
        byArray37[-954401259 + 954401278] = -1754937312 + 1754937247;
        byArray37[-1378389420 + 1378389440] = -722992174 + 722992107;
        byArray37[-1089039520 + 1089039541] = -801301396 + 801301416;
        byArray37[-1044544585 + 1044544607] = -735780285 + 735780248;
        byArray37[-763739341 + 763739364] = -828746919 + 828746891;
        byArray37[-2084869236 + 2084869260] = -1474415784 + 1474415815;
        \u0430c\u0440 \u0430c\u044016 = ((\u0430c\u0440)((Object)i\u0435\u0445\u0456sh.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray37, (int)(-1688039159 + 1360943991), (int)(-751156669 + 409184602)))))).s\u0458\u0458a(64.0f).x\u0455heah\u0445(16.0f).\u043ecxi\u0455(16.0f).a\u0455\u0445\u0435c(256.0f);
        h\u04bb\u0455hpa h\u04bb\u0455hpa16 = this.ox\u0440ip\u0456\u0435;
        i\u0435\u0445\u0456sh.a_bsm2("requireNonNull", requireNonNull(T ), (Object)h\u04bb\u0455hpa16);
        this.\u04bb\u0445\u0430s = \u0430c\u044016.p\u0441\u0445(h\u04bb\u0455hpa16::axpacc).\u0458c\u0456\u0440().getFloatValue();
        byte[] byArray38 = new byte[-1808977992 + 1808978002];
        byArray38[0] = -613149861 + 613149896;
        byArray38[1] = -850988698 + 850988659;
        byArray38[2] = -257353741 + 257353642;
        byArray38[3] = -309161644 + 309161555;
        byArray38[4] = -1197710293 + 1197710321;
        byArray38[5] = -865962799 + 865962775;
        byArray38[-302382238 + 302382244] = -1989403359 + 1989403244;
        byArray38[-820930557 + 820930564] = -366006092 + 366006158;
        byArray38[-100554032 + 100554040] = -127788790 + 127788806;
        byArray38[-1708795555 + 1708795564] = -311041598 + 311041613;
        this.\u0456\u0445\u043e\u0455\u04bb = ((\u0430c\u0440)((Object)i\u0435\u0445\u0456sh.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray38, (int)(-2094492956 + 657332082), (int)(1812972123 + 1866995964)))))).\u0455xi\u0440(false).\u0458c\u0456\u0440().getBooleanValue();
        byte[] byArray39 = new byte[-866620446 + 866620454];
        byArray39[0] = -1253446891 + 1253446927;
        byArray39[1] = -819037864 + 819037925;
        byArray39[2] = -1008609289 + 1008609316;
        byArray39[3] = -313850465 + 313850365;
        byArray39[4] = -237631774 + 237631851;
        byArray39[5] = 1;
        byArray39[-1863646781 + 1863646787] = -407062091 + 407062140;
        byArray39[-1949122534 + 1949122541] = -1609626782 + 1609626894;
        \u0430c\u0440 \u0430c\u044017 = ((\u0430c\u0440)((Object)i\u0435\u0445\u0456sh.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray39, (int)(-1688980272 + 1233891343), (int)(2113326397 + 1866080243)))))).s\u0458\u0458a(9.0f).x\u0455heah\u0445(1.0f).\u043ecxi\u0455(1.0f).a\u0455\u0445\u0435c(9.0f);
        h\u04bb\u0455hpa h\u04bb\u0455hpa17 = this.\u0456\u0445\u043e\u0455\u04bb;
        i\u0435\u0445\u0456sh.a_bsm2("requireNonNull", requireNonNull(T ), (Object)h\u04bb\u0455hpa17);
        this.\u0456sxax = \u0430c\u044017.p\u0441\u0445(h\u04bb\u0455hpa17::axpacc).\u0458c\u0456\u0440().getFloatValue();
        this.ic\u0430c\u0456 = 0L;
        this.h\u0455\u0435pa\u04bb\u0458 = 0L;
        this.\u043e\u0445\u0441\u0435\u0430\u043e = 0L;
        this.\u04bba\u0455\u0440\u043e = -1;
        this.h\u0445\u0441e = 1694242583 + 453241065;
        this.s\u0445ass\u0430\u0441 = -1;
    }

    @Override
    public /* synthetic */ void onEnable() {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        this.hj\u0435 = i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1755;
        this.hjxa\u0430\u04bb\u0430();
    }

    @Override
    public /* synthetic */ void onDisable() {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (true | false) {
        }
        if (0 != 0) {
        }
        this.hjxa\u0430\u04bb\u0430();
    }

    private /* synthetic */ void hjxa\u0430\u04bb\u0430() {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        reference var1_2 = i\u0435\u0445\u0456sh.a_bsm3("nanoTime", nanoTime()) / 1000000L;
        this.ic\u0430c\u0456 = (long)var1_2;
        this.h\u0455\u0435pa\u04bb\u0458 = (long)var1_2;
        this.\u043e\u0445\u0441\u0435\u0430\u043e = (long)var1_2;
        this.\u04bba\u0455\u0440\u043e = -1;
        this.c\u0458h = false;
        this.o\u0458s\u04bbie\u043e = false;
        this.\u043e\u0435\u0456 = 0L;
        this.s\u0430h = false;
        this.\u0440\u0455\u0455();
    }

    private /* synthetic */ void \u0440\u0455\u0455() {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (true | false) {
        }
        if (0 != 0) {
        }
        this.h\u0445\u0441e = 1824819783 + 322663865;
        this.s\u0445ass\u0430\u0441 = -1;
        this.hiaoj\u0435 = null;
        this.sih\u0435e = 0L;
    }

    @\u0445\u0458\u0458h\u0445\u0430a
    public void aj\u043e\u0441\u0455\u0445(s\u0456a\u0458 s\u0456a\u04582) {
        block9: {
            block8: {
                boolean bl = false;
                if (bl) {
                    __js_dispatch_state = 0;
                    if (bl) {
                        __js_dispatch_state = 0;
                    }
                }
                if (2 * 2 * 2 >= 0) {
                }
                if (0 != 0) {
                }
                if (i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1755 != this.hj\u0435) {
                    this.hj\u0435 = i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1755;
                    this.hjxa\u0430\u04bb\u0430();
                }
                if (i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 == null || i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1687 == null) break block8;
                if (\u0430\u0445j\u0445s\u0456\u04bb.method_1562() != null) break block9;
            }
            return;
        }
        this.\u0435\u0441s();
    }

    @\u0445\u0458\u0458h\u0445\u0430a
    public void o\u0441\u0458\u0455ip(\u0455\u0456\u0440 \u0455\u0456\u04402) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        if (i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1755 instanceof class_490 && !\u0455\u0456\u04402.\u0440\u0430\u0440\u043e()) {
            this.hjxa\u0430\u04bb\u0430();
        }
    }

    @\u0445\u0458\u0458h\u0445\u0430a
    public void o\u043eec\u04bb\u0445h(\u04bbj\u0441x\u0440 \u04bbj\u0441x\u04402) {
        class_2885 class_28852;
        block8: {
            block7: {
                boolean bl = false;
                if (bl) {
                    __js_dispatch_state = 0;
                }
                if (true | false) {
                }
                if (0 != 0) {
                }
                if (\u04bbj\u0441x\u04402.p\u0440\u04bb() != i\u0456\u0445\u0430\u0441p.ospc\u0456) break block7;
                if (i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1687 != null) break block8;
            }
            return;
        }
        class_2338 class_23382 = \u04bbj\u0441x\u04402.ciao\u0455\u0455();
        if (class_23382 instanceof class_2885 && i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.method_8320(class_23382 = (class_28852 = (class_2885)class_23382).method_12543().method_17777()).method_26196((class_1937)i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1687, class_23382) != null) {
            this.\u043e\u0435\u0456 = (long)(i\u0435\u0445\u0456sh.a_bsm3("nanoTime", nanoTime()) / 1000000L + 500L);
        }
    }

    @\u0445\u0458\u0458h\u0445\u0430a
    public void \u04bbo\u0435(hoi\u0435h\u0440 hoi\u0435h\u04402) {
        block9: {
            block8: {
                boolean bl = false;
                if (bl) {
                    __js_dispatch_state = 0;
                }
                if (2 * 2 * 2 >= 0) {
                }
                if (0 != 0) {
                }
                if (!this.o\u0458s\u04bbie\u043e) {
                    return;
                }
                this.o\u0458s\u04bbie\u043e = false;
                if (i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 == null) break block8;
                if (!this.chs\u0456\u0440\u04bb.axpacc()) break block9;
            }
            return;
        }
        if (i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_24828() && i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1690.field_1903.method_1434() && i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1690.field_1894.method_1434()) {
            return;
        }
        i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1690.field_1867.method_23481(false);
        i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_5728(false);
    }

    private /* synthetic */ boolean o\u043e\u0456i() {
        CallSite callSite;
        int n;
        class_1799 class_17992;
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if (i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 == null) {
            return 0 != 0;
        }
        if (i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_5624()) {
            return 0 != 0;
        }
        if (this.ijao.axpacc() && !this.xsie\u0456.cip((String)((Object)i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-514966426 + 514966432, -1139132456 + 1139132523, -114864646 + 114864735, -16127115 + 16127059, -1765709917 + 1765710035}, (int)(416582659 + 456042495), (int)(-1839183494 + 358243904)))) && (class_17992 = (class_1799)i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7547.get(n = (int)(this.\u0440s\u0430cc\u0456h.axpacc() - 1.0f))).method_7947() <= -1828692851 + 1828692861 && (callSite = i\u0435\u0445\u0456sh.a_bsm4("\u043e\u04bbp", \u043e\u04bbp())) != null && i\u0435\u0445\u0456sh.a_bsm5("e\u0440\u04bbp\u0430", e\u0440\u04bbp\u0430(net.minecraft.class_1799 ), (class_1799)callSite) != n) {
            return (this.co\u0430\u0440\u04bb(n, (class_1799)callSite, true) ? 1 : 0) != 0;
        }
        return 0 != 0;
    }

    private /* synthetic */ void \u0435\u0441s() {
        int n;
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (true | false) {
        }
        if (0 != 0) {
        }
        reference var1_2 = i\u0435\u0445\u0456sh.a_bsm3("nanoTime", nanoTime()) / 1000000L;
        long l2 = this.\u0441\u0456\u0456jps.axpacc() ? 0L : (long)i\u0435\u0445\u0456sh.a_bsm6("max", max(long long ), (long)0L, (long)((long)this.h\u0430\u0430soe\u0455.axpacc()));
        CallSite callSite = i\u0435\u0445\u0456sh.a_bsm6("max", max(long long ), (long)0L, (long)((long)this.\u0456ie.axpacc()));
        boolean bl2 = i\u0435\u0445\u0456sh.$_hqsguog1ngan17lci((long)(var1_2 - this.ic\u0430c\u0456) == l2 ? 0 : ((long)(var1_2 - this.ic\u0430c\u0456) < l2 ? -1 : 1)) >= 0;
        boolean bl3 = i\u0435\u0445\u0456sh.$_hqsguoh1ngan17lcj((long)(var1_2 - this.h\u0455\u0435pa\u04bb\u0458) == (long)callSite ? 0 : ((long)(var1_2 - this.h\u0455\u0435pa\u04bb\u0458) < (long)callSite ? -1 : 1)) >= 0;
        boolean bl4 = ((\u0445\u0440\u0430\u0435\u0445\u043e)((Object)i\u0435\u0445\u0456sh.a_bsm7("jaa\u0435\u0445c", jaa\u0435\u0445c()))).\u0430o\u0441\u0456p\u0455().\u0441c\u0458\u043e\u0430(\u0441\u043e\u0456.class).\u0440\u0435\u0455x\u0435xe();
        if (!bl4 && this.ipx\u0456ji\u0435.axpacc()) {
            int n2;
            int n3;
            n = this.\u0445\u0456\u0455(true);
            if (n != -1) {
                n3 = n;
                if (0 != 0 && 0 != 1 && 0 != 2) {
                    // empty if block
                }
            } else {
                n3 = this.\u0445\u0456\u0455(false);
            }
            if ((n2 = n3) != -1) {
                boolean bl5;
                this.c\u0458h = false;
                if (n != -1) {
                    if (bl2 && this.a\u04bbe\u0455\u0456(n)) {
                        v1 = true;
                        if (0 != 0 && 0 != 1 && 0 != 2) {
                            // empty if block
                        }
                    } else {
                        v1 = false;
                    }
                } else if (bl3 && this.jca()) {
                    v1 = true;
                    if (bl) {
                        __js_dispatch_state = 0;
                    }
                } else {
                    v1 = bl5 = false;
                }
                if (bl5) {
                    this.ic\u0430c\u0456 = (long)var1_2;
                    this.h\u0455\u0435pa\u04bb\u0458 = (long)var1_2;
                }
                return;
            }
        }
        if (bl2) {
            this.c\u0458h = false;
            if (bl4) {
                n = this.o\u043e\u0456i() ? 1 : 0;
            } else {
                int n4;
                if (!this.xsie\u0456.cip((String)((Object)i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1899454819 + 1899454847, -912934624 + 912934644, -669256177 + 669256149, -2098560886 + 2098560914}, (int)(1634183792 + 214483903), (int)(101460933 + 1236804606)))) && this.o\u0441\u0435()) {
                    n4 = 1;
                    if (0 != 0 && 0 != 1 && 0 != 2) {
                        // empty if block
                    }
                } else {
                    n4 = 0;
                }
                if ((n = n4) == 0 && !this.c\u0458h) {
                    n = this.aa\u0441i\u0445() ? 1 : 0;
                }
            }
            if (n != 0) {
                this.ic\u0430c\u0456 = (long)var1_2;
                this.h\u0455\u0435pa\u04bb\u0458 = (long)var1_2;
                return;
            }
        }
        if (this.shxx.axpacc() && bl3 && this.ai\u043e\u0455\u0430a()) {
            this.ic\u0430c\u0456 = (long)var1_2;
            this.h\u0455\u0435pa\u04bb\u0458 = (long)var1_2;
        }
    }

    private /* synthetic */ boolean jca() {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if (i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 == null) {
            return 0 != 0;
        }
        for (int i = 0; i < i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7548.size(); ++i) {
            class_1738 class_17382;
            class_1799 class_17992 = (class_1799)i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7548.get(i);
            class_1792 class_17922 = class_17992.method_7909();
            if (!(class_17922 instanceof class_1738) || i\u0435\u0445\u0456sh.$_hqsguoi1ngan17lck((float)i\u0435\u0445\u0456sh.a_bsm8("\u0445\u0455opsp", \u0445\u0455opsp(net.minecraft.class_1304 ), (class_1304)(class_17382 = (class_1738)class_17922).method_7685()) == (float)i\u0435\u0445\u0456sh.a_bsm9("co\u04bbs", co\u04bbs(net.minecraft.class_1799 ), (class_1799)class_17992) ? 0 : ((float)i\u0435\u0445\u0456sh.a_bsm8("\u0445\u0455opsp", \u0445\u0455opsp(net.minecraft.class_1304 ), (class_1304)(class_17382 = (class_1738)class_17922).method_7685()) > (float)i\u0435\u0445\u0456sh.a_bsm9("co\u04bbs", co\u04bbs(net.minecraft.class_1799 ), (class_1799)class_17992) ? 1 : -1)) <= 0) continue;
            return (this.\u043e\u0440ixai(-32827626 + 32827634 - i, 1, class_1713.field_7795, false) ? 1 : 0) != 0;
        }
        return 0 != 0;
    }

    private /* synthetic */ int \u0445\u0456\u0455(boolean bl) {
        boolean bl2 = false;
        if (bl2) {
            __js_dispatch_state = 0;
            if (bl2) {
                __js_dispatch_state = 0;
            }
        }
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 == null) {
            return -1;
        }
        for (int i = 0; i < i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7547.size(); ++i) {
            boolean bl3;
            boolean bl4;
            class_1792 class_17922;
            class_1799 class_17992 = (class_1799)i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7547.get(i);
            if (class_17992.method_7960() || !((class_17922 = class_17992.method_7909()) instanceof class_1738)) continue;
            class_1738 class_17382 = (class_1738)class_17922;
            CallSite callSite = i\u0435\u0445\u0456sh.a_bsm9("co\u04bbs", co\u04bbs(net.minecraft.class_1799 ), (class_1799)class_17992);
            if (i\u0435\u0445\u0456sh.$_hqsguoj1ngan17lcl((float)i\u0435\u0445\u0456sh.a_bsm8("\u0445\u0455opsp", \u0445\u0455opsp(net.minecraft.class_1304 ), (class_1304)class_17382.method_7685()) == (float)callSite ? 0 : ((float)i\u0435\u0445\u0456sh.a_bsm8("\u0445\u0455opsp", \u0445\u0455opsp(net.minecraft.class_1304 ), (class_1304)class_17382.method_7685()) > (float)callSite ? 1 : -1)) == 0) {
                bl4 = true;
                if (bl2) {
                    __js_dispatch_state = 0;
                }
            } else {
                bl4 = false;
            }
            boolean bl5 = bl4;
            boolean bl6 = bl3 = i\u0435\u0445\u0456sh.$_hqsguok1ngan17lcm((float)i\u0435\u0445\u0456sh.a_bsm10("\u0441phha\u04bb\u0458", \u0441phha\u04bb\u0458(net.minecraft.class_1304 ), (class_1304)class_17382.method_7685()) == (float)callSite ? 0 : ((float)i\u0435\u0445\u0456sh.a_bsm10("\u0441phha\u04bb\u0458", \u0441phha\u04bb\u0458(net.minecraft.class_1304 ), (class_1304)class_17382.method_7685()) < (float)callSite ? -1 : 1)) < 0;
            if (!bl5 || !bl3 || bl && !i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_6118(class_17382.method_7685()).method_7960()) continue;
            return i;
        }
        return -1;
    }

    private /* synthetic */ boolean a\u04bbe\u0455\u0456(int n) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
            if (bl) {
                __js_dispatch_state = 0;
            }
        }
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return (this.\u043e\u0440ixai(n < -981499896 + 981499905 ? n + (-542156641 + 542156677) : n, 0, class_1713.field_7794, false) ? 1 : 0) != 0;
    }

    private /* synthetic */ boolean ai\u043e\u0455\u0430a() {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 == null) {
            return 0 != 0;
        }
        int n = this.\u0430\u0440xi\u0441ha();
        if (n != -1) {
            return (this.\u043e\u0440ixai(n < -1359756375 + 1359756384 ? n + (-802854900 + 802854936) : n, 1, class_1713.field_7795, false) ? 1 : 0) != 0;
        }
        return 0 != 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ boolean \u0440e\u0440(int n, class_1799 class_17992) {
        int n2;
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (n < 0) return 0 != 0;
        if (n >= -1599316020 + 1599316029) return 0 != 0;
        if (class_17992.method_7960()) {
            return 0 != 0;
        }
        if (this.\u0458\u0456\u0458\u0458ae.axpacc() && n == (int)(this.o\u04bb\u0440.axpacc() - 1.0f)) {
            int n3;
            if (!(class_17992.method_7909() instanceof class_1829) && i\u0435\u0445\u0456sh.a_bsm11("p\u04bb\u0455piea", p\u04bb\u0455piea(net.minecraft.class_1799 ), (class_1799)class_17992) == false) {
                n3 = 0;
                return n3 != 0;
            }
            n3 = 1;
            return n3 != 0;
        }
        if (this.a\u0441\u0430\u043e\u0440.axpacc() && n == (int)(this.\u0456\u04bbj.axpacc() - 1.0f)) {
            return class_17992.method_7909() instanceof class_1810 != 0;
        }
        if (this.\u0440cep.axpacc() && n == (int)(this.a\u0441chp.axpacc() - 1.0f)) {
            int n4;
            if (class_17992.method_7909() instanceof class_1743 && i\u0435\u0445\u0456sh.a_bsm11("p\u04bb\u0455piea", p\u04bb\u0455piea(net.minecraft.class_1799 ), (class_1799)class_17992) == false) {
                n4 = 1;
                return n4 != 0;
            }
            n4 = 0;
            return n4 != 0;
        }
        if (this.pish.axpacc() && n == (int)(this.\u0445x\u0445p\u0435.axpacc() - 1.0f)) {
            int n5;
            if (!(class_17992.method_7909() instanceof class_1753) && !(class_17992.method_7909() instanceof class_1764)) {
                n5 = 0;
                return n5 != 0;
            }
            n5 = 1;
            return n5 != 0;
        }
        if (this.\u0455je\u0441ixc.axpacc() && n == (int)(this.e\u0455j\u0435p\u0435.axpacc() - 1.0f)) {
            return (class_17992.method_31574(class_1802.field_8705) ? 1 : 0) != 0;
        }
        if (this.\u043ee\u0430.axpacc() && n == (int)(this.\u0430j\u0456x\u04bb.axpacc() - 1.0f)) {
            return (class_17992.method_31574(class_1802.field_8634) ? 1 : 0) != 0;
        }
        if (this.eep.axpacc() && n == (int)(this.ix\u0455\u0455\u043ec.axpacc() - 1.0f)) {
            return (class_17992.method_31574(class_1802.field_8814) ? 1 : 0) != 0;
        }
        if (this.x\u043es.axpacc()) {
            byte[] byArray = new byte[-1053402832 + 1053402844];
            byArray[0] = -1261564494 + 1261564593;
            byArray[1] = -1162193586 + 0x4545AAA4;
            byArray[2] = -1709933930 + 1709934027;
            byArray[3] = -739307434 + 739307561;
            byArray[4] = -1913814070 + 1913814193;
            byArray[5] = -1480860061 + 1480859943;
            byArray[-1987592298 + 1987592304] = -663634227 + 663634342;
            byArray[-1810208526 + 1810208533] = -659171808 + 659171873;
            byArray[-462503576 + 462503584] = -101256677 + 101256742;
            byArray[-1183901464 + 1183901473] = -1636559444 + 1636559408;
            byArray[-753060190 + 753060200] = -2092055435 + 2092055338;
            byArray[-81630950 + 81630961] = -215237250 + 215237269;
            if (!this.xsie\u0456.cip((String)((Object)i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(1840095816 + 407298987), (int)(-2004012355 + 640187384)))) && n == (int)(this.\u0441\u0445j\u0458\u0440\u043e\u04bb.axpacc() - 1.0f)) {
                return (class_17992.method_31574(class_1802.field_8463) ? 1 : 0) != 0;
            }
        }
        if (this.ijao.axpacc() && !this.xsie\u0456.cip((String)((Object)i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-858028840 + 858028930, -832385688 + 832385761, -77437852 + 77437831, -873006080 + 873006165, -301287890 + 301287914}, (int)(-188437075 + 606366523), (int)(725274264 + 1932906455)))) && n == (int)(this.\u0440s\u0430cc\u0456h.axpacc() - 1.0f)) {
            int n6;
            class_1792 class_17922 = class_17992.method_7909();
            if (class_17922 instanceof class_1747) {
                class_1747 class_17472 = (class_1747)class_17922;
                if (i\u0435\u0445\u0456sh.a_bsm12("\u04bboop\u0440o\u0430", \u04bboop\u0440o\u0430(net.minecraft.class_1799 ), (class_1799)class_17992) != false && i\u0435\u0445\u0456sh.a_bsm13("\u0440\u0441cs\u04bb\u043e\u0441", \u0440\u0441cs\u04bb\u043e\u0441(net.minecraft.class_2248 ), (class_2248)class_17472.method_7711()) == false) {
                    n6 = 1;
                    return n6 != 0;
                }
            }
            n6 = 0;
            return n6 != 0;
        }
        if (this.ox\u0440ip\u0456\u0435.axpacc() && n == (int)(this.o\u0445\u0441a\u0456sp.axpacc() - 1.0f)) {
            int n7;
            if (!class_17992.method_31574(class_1802.field_8803) && !class_17992.method_31574(class_1802.field_8543)) {
                n7 = 0;
                return n7 != 0;
            }
            n7 = 1;
            return n7 != 0;
        }
        if (this.\u0456\u0445\u043e\u0455\u04bb.axpacc() && n == (int)(this.\u0456sxax.axpacc() - 1.0f) && class_17992.method_7909() instanceof class_1787) {
            n2 = 1;
            if (!bl) {
                return n2 != 0;
            }
            __js_dispatch_state = 0;
            return n2 != 0;
        }
        n2 = 0;
        return n2 != 0;
    }

    private /* synthetic */ int \u0430\u0440xi\u0441ha() {
        int n;
        Object object;
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
            if (bl) {
                __js_dispatch_state = 0;
            }
        }
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 == null) {
            return -1;
        }
        int n2 = this.co\u0441\u0458\u0435\u0440x();
        if (n2 != -1) {
            return n2;
        }
        if (this.pish.axpacc() && i\u0435\u0445\u0456sh.$_hqsguol1ngan17lcn((float)i\u0435\u0445\u0456sh.a_bsm14("\u0440\u0430op", \u0440\u0430op(net.minecraft.class_1792 ), (class_1792)class_1802.field_8107) == this.\u0440\u0456p\u0441ap.axpacc() ? 0 : ((float)i\u0435\u0445\u0456sh.a_bsm14("\u0440\u0430op", \u0440\u0430op(net.minecraft.class_1792 ), (class_1792)class_1802.field_8107) > this.\u0440\u0456p\u0441ap.axpacc() ? 1 : -1)) > 0 && (object = i\u0435\u0445\u0456sh.a_bsm15("j\u0435\u0445ea", j\u0435\u0445ea())) != null) {
            n = this.jxcepo\u0458((class_1799)object);
            if (n == -1) {
                n = this.as\u043eh(class_17992 -> {
                    int n;
                    boolean bl = false;
                    if (bl) {
                        __js_dispatch_state = 0;
                    }
                    if (true | false) {
                    }
                    if (class_17992.method_7909() instanceof class_1744 && i\u0435\u0445\u0456sh.a_bsm12("\u04bboop\u0440o\u0430", \u04bboop\u0440o\u0430(net.minecraft.class_1799 ), (class_1799)class_17992) != false) {
                        n = 1;
                        if ((0 == 0 || 0 != 1 && 0 != 2) && bl) {
                            __js_dispatch_state = 0;
                        }
                    } else {
                        n = 0;
                    }
                    return n != 0;
                });
            }
            if (n != -1) {
                return n;
            }
        }
        if (this.ijao.axpacc() && !this.xsie\u0456.cip((String)((Object)i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-56893689 + 56893695, -558077410 + 558077351, -1923567655 + 1923567578, -1747648328 + 1747648370, -1489298032 + 1489297969}, (int)(207613549 + 1867615556), (int)(-1109510792 + 1775497785)))) && i\u0435\u0445\u0456sh.$_hqsguom1ngan17lco((float)i\u0435\u0445\u0456sh.a_bsm16("ipe\u0441\u043e\u0458\u0440", ipe\u0441\u043e\u0458\u0440()) == this.jx\u0440h\u04bb\u0455.axpacc() ? 0 : ((float)i\u0435\u0445\u0456sh.a_bsm16("ipe\u0441\u043e\u0458\u0440", ipe\u0441\u043e\u0458\u0440()) > this.jx\u0440h\u04bb\u0455.axpacc() ? 1 : -1)) > 0 && (object = i\u0435\u0445\u0456sh.a_bsm17("jej", jej())) != null) {
            n = this.jxcepo\u0458((class_1799)object);
            if (n == -1) {
                n = this.as\u043eh(class_17992 -> {
                    boolean bl = false;
                    if (bl) {
                        __js_dispatch_state = 0;
                    }
                    if (2 * 2 * 2 >= 0) {
                    }
                    return (class_17992.method_7909() instanceof class_1747 && i\u0435\u0445\u0456sh.a_bsm25("\u04bbhx\u043eox", \u04bbhx\u043eox(net.minecraft.class_1799 ), (class_1799)class_17992) != false && i\u0435\u0445\u0456sh.a_bsm12("\u04bboop\u0440o\u0430", \u04bboop\u0440o\u0430(net.minecraft.class_1799 ), (class_1799)class_17992) != false ? 1 : 0) != 0;
                });
            }
            if (n != -1) {
                return n;
            }
        }
        if (this.ox\u0440ip\u0456\u0435.axpacc() && i\u0435\u0445\u0456sh.$_hqsguon1ngan17lcp((float)(i\u0435\u0445\u0456sh.a_bsm14("\u0440\u0430op", \u0440\u0430op(net.minecraft.class_1792 ), (class_1792)class_1802.field_8803) + i\u0435\u0445\u0456sh.a_bsm14("\u0440\u0430op", \u0440\u0430op(net.minecraft.class_1792 ), (class_1792)class_1802.field_8543)) == this.\u04bb\u0445\u0430s.axpacc() ? 0 : ((float)(i\u0435\u0445\u0456sh.a_bsm14("\u0440\u0430op", \u0440\u0430op(net.minecraft.class_1792 ), (class_1792)class_1802.field_8803) + i\u0435\u0445\u0456sh.a_bsm14("\u0440\u0430op", \u0440\u0430op(net.minecraft.class_1792 ), (class_1792)class_1802.field_8543)) > this.\u04bb\u0445\u0430s.axpacc() ? 1 : -1)) > 0 && (object = i\u0435\u0445\u0456sh.a_bsm18("x\u043esei", x\u043esei())) != null) {
            n = this.jxcepo\u0458((class_1799)object);
            if (n == -1) {
                n = this.as\u043eh(class_17992 -> {
                    boolean bl = false;
                    if (bl) {
                        __js_dispatch_state = 0;
                    }
                    if (true | false) {
                    }
                    return (class_17992.method_7909() == class_1802.field_8803 || class_17992.method_7909() == class_1802.field_8543 ? 1 : 0) != 0;
                });
            }
            if (n != -1) {
                return n;
            }
        }
        object = (List)i\u0435\u0445\u0456sh.a_bsm19("range", range(int int ), (int)0, (int)i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7547.size()).boxed().collect(i\u0435\u0445\u0456sh.a_bsm20("toList", toList()));
        i\u0435\u0445\u0456sh.a_bsm21("shuffle", shuffle(java.util.List<?> ), (List)object);
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            int n3 = (Integer)iterator.next();
            class_1799 class_17993 = (class_1799)i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7547.get(n3);
            if (class_17993.method_7960()) continue;
            if (this.\u0455x\u04bb\u0456ap(class_17993)) {
                if (!bl) continue;
                __js_dispatch_state = 0;
                continue;
            }
            if (n3 < -480982902 + 480982911 && this.\u0440e\u0440(n3, class_17993)) continue;
            return n3;
        }
        return -1;
    }

    private /* synthetic */ int co\u0441\u0458\u0435\u0440x() {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 == null) {
            return -1;
        }
        CallSite callSite = i\u0435\u0445\u0456sh.a_bsm22("\u0435\u043ea\u0456\u0435", \u0435\u043ea\u0456\u0435());
        int n = this.\u0458\u0456\u0458\u0458ae.axpacc() ? (int)(this.o\u04bb\u0440.axpacc() - 1.0f) : -1;
        for (int i = 0; i < i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7547.size(); ++i) {
            class_1799 class_17992 = (class_1799)i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7547.get(i);
            if (!(class_17992.method_7909() instanceof class_1829) || class_17992 == callSite || i == n) continue;
            return i;
        }
        return -1;
    }

    private /* synthetic */ int jxcepo\u0458(class_1799 class_17992) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if (i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 == null || class_17992 == null || class_17992.method_7960()) {
            return -1;
        }
        for (int i = 0; i < i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7547.size(); ++i) {
            class_1799 class_17993 = (class_1799)i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7547.get(i);
            if (i\u0435\u0445\u0456sh.a_bsm23("method_7973", method_7973(net.minecraft.class_1799 net.minecraft.class_1799 ), (class_1799)class_17993, (class_1799)class_17992) == false && class_17993.method_7909() != class_17992.method_7909() || this.\u0440e\u0440(i, class_17993)) continue;
            return i;
        }
        return -1;
    }

    private /* synthetic */ int as\u043eh(Predicate<class_1799> predicate) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 == null) {
            return -1;
        }
        int n = -1;
        int n2 = 367186316 + 1780297331;
        int n3 = 0;
        while (n3 < i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7547.size()) {
            class_1799 class_17992 = (class_1799)i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7547.get(n3);
            if (!class_17992.method_7960() && !this.\u0440e\u0440(n3, class_17992) && predicate.test(class_17992) && class_17992.method_7947() < n2) {
                n = n3;
                n2 = class_17992.method_7947();
            }
            ++n3;
            if (0 != 0 && 0 != 1 && 0 != 2) {
                // empty if block
            }
            if (!bl) continue;
            __js_dispatch_state = 0;
        }
        return n;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private /* synthetic */ boolean o\u0441\u0435() {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 == null) {
            return 0 != 0;
        }
        byte[] byArray = new byte[-1924333676 + 1924333688];
        byArray[0] = -96846313 + 96846319;
        byArray[1] = -1888031319 + 1888031193;
        byArray[2] = -880945775 + 880945803;
        byArray[3] = -1188112321 + 1188112374;
        byArray[4] = -1289297281 + 1289297358;
        byArray[5] = -1658075645 + 1658075664;
        byArray[-738859858 + 738859864] = -1067072309 + 1067072219;
        byArray[-2004042165 + 2004042172] = -1129282598 + 1129282559;
        byArray[-408240329 + 408240337] = -837516149 + 837516194;
        byArray[-608087619 + 608087628] = -1954590281 + 1954590230;
        byArray[-1088808751 + 1088808761] = -434435438 + 434435546;
        byArray[-474682970 + 474682981] = -490268895 + 490268997;
        if (this.xsie\u0456.cip((String)((Object)i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(1642478376 + 131280528), (int)(1566144538 + 571082569))))) {
            class_1799 class_17992 = (class_1799)i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7544.getFirst();
            if (this.s\u0430h) {
                if (!this.\u043e\u0440ixai(-2121551500 + 2121551545, 0, class_1713.field_7790, false)) return 0 != 0;
                this.s\u0430h = false;
                return 1 != 0;
            }
            reference var2_4 = i\u0435\u0445\u0456sh.a_bsm24("\u043e\u0458\u0445hi\u04bb\u0456", \u043e\u0458\u0445hi\u04bb\u0456(net.minecraft.class_1792 ), (class_1792)class_1802.field_8463);
            if (var2_4 == -1) return 0 != 0;
            if (!class_17992.method_31574(class_1802.field_8463)) return (this.ci\u043eh((int)var2_4) ? 1 : 0) != 0;
            class_1799 class_17993 = (class_1799)i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7547.get((int)var2_4);
            if (class_17992.method_7947() + class_17993.method_7947() > class_17992.method_7914() || !this.\u043e\u0440ixai((int)(var2_4 < -789060582 + 789060591 ? var2_4 + (-1377568629 + 1377568665) : var2_4), 0, class_1713.field_7790, false)) return 0 != 0;
            this.s\u0430h = true;
            return 1 != 0;
        }
        if (!this.xsie\u0456.cip((String)((Object)i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-254154988 + 254155053, -856586892 + 856586976, -1997117892 + 1997117949, -1690875749 + 1690875783, -1351904188 + 1351904158}, (int)(970382671 + 1435087376), (int)(1982619684 + 1174952975))))) return 0 != 0;
        class_1799 class_17994 = (class_1799)i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7544.getFirst();
        CallSite callSite = i\u0435\u0445\u0456sh.a_bsm4("\u043e\u04bbp", \u043e\u04bbp());
        if (callSite == null) return 0 != 0;
        CallSite callSite2 = i\u0435\u0445\u0456sh.a_bsm5("e\u0440\u04bbp\u0430", e\u0440\u04bbp\u0430(net.minecraft.class_1799 ), (class_1799)callSite);
        if (i\u0435\u0445\u0456sh.a_bsm25("\u04bbhx\u043eox", \u04bbhx\u043eox(net.minecraft.class_1799 ), (class_1799)class_17994) != false && class_17994.method_7947() >= callSite.method_7947() || callSite2 == -1) return 0 != 0;
        return (this.ci\u043eh((int)callSite2) ? 1 : 0) != 0;
    }

    private /* synthetic */ boolean aa\u0441i\u0445() {
        CallSite callSite;
        Object object;
        int n;
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
            if (bl) {
                __js_dispatch_state = 0;
            }
        }
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 == null) {
            return 0 != 0;
        }
        if (this.\u0458\u0456\u0458\u0458ae.axpacc()) {
            n = (int)(this.o\u04bb\u0440.axpacc() - 1.0f);
            object = (class_1799)i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7547.get(n);
            callSite = i\u0435\u0445\u0456sh.a_bsm22("\u0435\u043ea\u0456\u0435", \u0435\u043ea\u0456\u0435());
            CallSite callSite2 = i\u0435\u0445\u0456sh.a_bsm26("p\u0441c", p\u0441c());
            if (i\u0435\u0445\u0456sh.$_hqsguoo1ngan17lcq((float)i\u0435\u0445\u0456sh.a_bsm27("\u0440\u0456x\u0458", \u0440\u0456x\u0458(net.minecraft.class_1799 ), (class_1799)callSite2) == (float)i\u0435\u0445\u0456sh.a_bsm28("\u0458\u0458o\u0456\u0430", \u0458\u0458o\u0456\u0430(net.minecraft.class_1799 ), (class_1799)callSite) ? 0 : ((float)i\u0435\u0445\u0456sh.a_bsm27("\u0440\u0456x\u0458", \u0440\u0456x\u0458(net.minecraft.class_1799 ), (class_1799)callSite2) > (float)i\u0435\u0445\u0456sh.a_bsm28("\u0458\u0458o\u0456\u0430", \u0458\u0458o\u0456\u0430(net.minecraft.class_1799 ), (class_1799)callSite) ? 1 : -1)) > 0) {
                callSite = callSite2;
            }
            if (callSite != null) {
                CallSite callSite3;
                CallSite callSite4;
                CallSite callSite5 = callSite4 = object.method_7909() instanceof class_1829 ? i\u0435\u0445\u0456sh.a_bsm28("\u0458\u0458o\u0456\u0430", \u0458\u0458o\u0456\u0430(net.minecraft.class_1799 ), (class_1799)object) : i\u0435\u0445\u0456sh.a_bsm27("\u0440\u0456x\u0458", \u0440\u0456x\u0458(net.minecraft.class_1799 ), (class_1799)object);
                if (callSite.method_7909() instanceof class_1829) {
                    v1 = i\u0435\u0445\u0456sh.a_bsm28("\u0458\u0458o\u0456\u0430", \u0458\u0458o\u0456\u0430(net.minecraft.class_1799 ), (class_1799)callSite);
                    if (0 != 0 && 0 != 1 && 0 != 2) {
                        // empty if block
                    }
                    if (bl) {
                        __js_dispatch_state = 0;
                    }
                } else {
                    v1 = callSite3 = i\u0435\u0445\u0456sh.a_bsm27("\u0440\u0456x\u0458", \u0440\u0456x\u0458(net.minecraft.class_1799 ), (class_1799)callSite);
                }
                if (i\u0435\u0445\u0456sh.$_hqsguop1ngan17lcr((float)callSite3 == (float)callSite4 ? 0 : ((float)callSite3 > (float)callSite4 ? 1 : -1)) > 0) {
                    return (this.co\u0430\u0440\u04bb(n, (class_1799)callSite, false) ? 1 : 0) != 0;
                }
            }
        }
        if (this.a\u0441\u0430\u043e\u0440.axpacc()) {
            n = (int)(this.\u0456\u04bbj.axpacc() - 1.0f);
            object = (class_1799)i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7547.get(n);
            callSite = i\u0435\u0445\u0456sh.a_bsm29("a\u0456\u0430\u0456\u0435\u0445\u0458", a\u0456\u0430\u0456\u0435\u0445\u0458());
            if (callSite != null && callSite.method_7909() instanceof class_1810 && (i\u0435\u0445\u0456sh.$_hqsgupb1ngan17lcs((float)i\u0435\u0445\u0456sh.a_bsm30("oih", oih(net.minecraft.class_1799 ), (class_1799)callSite) == (float)i\u0435\u0445\u0456sh.a_bsm30("oih", oih(net.minecraft.class_1799 ), (class_1799)object) ? 0 : ((float)i\u0435\u0445\u0456sh.a_bsm30("oih", oih(net.minecraft.class_1799 ), (class_1799)callSite) > (float)i\u0435\u0445\u0456sh.a_bsm30("oih", oih(net.minecraft.class_1799 ), (class_1799)object) ? 1 : -1)) > 0 || !(object.method_7909() instanceof class_1810))) {
                return (this.co\u0430\u0440\u04bb(n, (class_1799)callSite, false) ? 1 : 0) != 0;
            }
        }
        if (this.\u0440cep.axpacc()) {
            n = (int)(this.a\u0441chp.axpacc() - 1.0f);
            object = (class_1799)i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7547.get(n);
            callSite = i\u0435\u0445\u0456sh.a_bsm31("i\u0455\u0440xj", i\u0455\u0440xj());
            if (callSite != null && callSite.method_7909() instanceof class_1743 && (i\u0435\u0445\u0456sh.$_hqsgupc1ngan17lct((float)i\u0435\u0445\u0456sh.a_bsm30("oih", oih(net.minecraft.class_1799 ), (class_1799)callSite) == (float)i\u0435\u0445\u0456sh.a_bsm30("oih", oih(net.minecraft.class_1799 ), (class_1799)object) ? 0 : ((float)i\u0435\u0445\u0456sh.a_bsm30("oih", oih(net.minecraft.class_1799 ), (class_1799)callSite) > (float)i\u0435\u0445\u0456sh.a_bsm30("oih", oih(net.minecraft.class_1799 ), (class_1799)object) ? 1 : -1)) > 0 || !(object.method_7909() instanceof class_1743))) {
                return (this.co\u0430\u0440\u04bb(n, (class_1799)callSite, false) ? 1 : 0) != 0;
            }
        }
        if (this.\u0456\u0445\u043e\u0455\u04bb.axpacc()) {
            byte[] byArray = new byte[-1361504245 + 1361504256];
            byArray[0] = -442078178 + 442078092;
            byArray[1] = -2146387838 + 2146387957;
            byArray[2] = 4;
            byArray[3] = -1294551630 + 1294551538;
            byArray[4] = -513724174 + 513724138;
            byArray[5] = -1565879374 + 1565879259;
            byArray[-1658464716 + 1658464722] = -1891239847 + 1891239759;
            byArray[-1455738073 + 1455738080] = -1467791018 + 1467791132;
            byArray[-1833897178 + 1833897186] = -687044742 + 687044785;
            byArray[-1554657489 + 1554657498] = -713199151 + 713199272;
            byArray[-1521594722 + 1521594732] = -1044265001 + 1044264999;
            if (!this.xsie\u0456.cip((String)((Object)i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(179045820 + 1658742733), (int)(-1864292901 + 60714660))))) {
                n = (int)(this.\u0456sxax.axpacc() - 1.0f);
                object = i\u0435\u0445\u0456sh.a_bsm32("h\u0445ie\u0435\u0440\u0455", h\u0445ie\u0435\u0440\u0455());
                callSite = (class_1799)i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7547.get(n);
                if (object != null && !(callSite.method_7909() instanceof class_1787)) {
                    return (this.co\u0430\u0440\u04bb(n, (class_1799)object, false) ? 1 : 0) != 0;
                }
            }
        }
        if (this.pish.axpacc()) {
            n = (int)(this.\u0445x\u0445p\u0435.axpacc() - 1.0f);
            object = (class_1799)i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7547.get(n);
            byte[] byArray = new byte[-1155016446 + 1155016454];
            byArray[0] = -2143776469 + 2143776341;
            byArray[1] = -1196976254 + 1196976273;
            byArray[2] = -1697919199 + 1697919294;
            byArray[3] = 3;
            byArray[4] = -1371463834 + 1371463749;
            byArray[5] = -116859293 + 116859202;
            byArray[-1708637149 + 1708637155] = -86918040 + 86918021;
            byArray[-811929477 + 811929484] = -171992393 + 171992508;
            if (this.\u0440\u043eo\u043eip\u0456.cip((String)((Object)i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-634161070 + 1621541511), (int)(237663828 + 1980763621))))) {
                callSite = i\u0435\u0445\u0456sh.a_bsm33("sa\u0458chce", sa\u0458chce());
            } else {
                byte[] byArray2 = new byte[-1006157564 + 1006157573];
                byArray2[0] = -1669529004 + 1669528936;
                byArray2[1] = -1767897979 + 1767897990;
                byArray2[2] = -1626090058 + 1626090046;
                byArray2[3] = -1245656374 + 1245656494;
                byArray2[4] = -98863909 + 98863978;
                byArray2[5] = -208809139 + 208809109;
                byArray2[-524919195 + 524919201] = -1528650570 + 1528650635;
                byArray2[-2130717094 + 2130717101] = -1052470837 + 1052470934;
                byArray2[-389876638 + 389876646] = -1416425313 + 1416425210;
                callSite = this.\u0440\u043eo\u043eip\u0456.cip((String)((Object)i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray2, (int)(-887602058 + 1110296783), (int)(-433321787 + 1657880631)))) ? i\u0435\u0445\u0456sh.a_bsm34("i\u0445\u0456ih\u0445", i\u0445\u0456ih\u0445()) : i\u0435\u0445\u0456sh.a_bsm35("h\u0455so", h\u0455so());
            }
            if (callSite == null) {
                callSite = i\u0435\u0445\u0456sh.a_bsm33("sa\u0458chce", sa\u0458chce());
            }
            if (callSite == null) {
                callSite = i\u0435\u0445\u0456sh.a_bsm34("i\u0445\u0456ih\u0445", i\u0445\u0456ih\u0445());
            }
            if (callSite == null) {
                callSite = i\u0435\u0445\u0456sh.a_bsm35("h\u0455so", h\u0455so());
            }
            if (this.\u0458ex\u0441((class_1799)object, (class_1799)callSite)) {
                return (this.co\u0430\u0440\u04bb(n, (class_1799)callSite, false) ? 1 : 0) != 0;
            }
        }
        return (this.\u0456x\u043e() ? 1 : 0) != 0;
    }

    private /* synthetic */ boolean \u0456x\u043e() {
        Object object;
        class_1799 class_17992;
        int n;
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if (i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 == null) {
            return 0 != 0;
        }
        if (this.ijao.axpacc() && !this.xsie\u0456.cip((String)((Object)i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1334060816 + 1334060762, -1663426124 + 1663426087, -374818330 + 374818300, -327586345 + 327586459, -492312295 + 492312376}, (int)(965500800 + 1090657037), (int)(276386200 + 293064792))))) {
            n = (int)(this.\u0440s\u0430cc\u0456h.axpacc() - 1.0f);
            class_17992 = (class_1799)i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7547.get(n);
            object = i\u0435\u0445\u0456sh.a_bsm4("\u043e\u04bbp", \u043e\u04bbp());
            if (!(object == null || i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_5624() || object.method_7947() <= class_17992.method_7947() && i\u0435\u0445\u0456sh.a_bsm25("\u04bbhx\u043eox", \u04bbhx\u043eox(net.minecraft.class_1799 ), (class_1799)class_17992) != false)) {
                return (this.co\u0430\u0440\u04bb(n, (class_1799)object, false) ? 1 : 0) != 0;
            }
        }
        if (this.\u043ee\u0430.axpacc() && this.\u0430s\u0435asoe(this.\u0430j\u0456x\u04bb, class_1802.field_8634)) {
            return 1 != 0;
        }
        if (this.\u0455je\u0441ixc.axpacc() && !i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_6047().method_31574(class_1802.field_8705) && !i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_6047().method_31574(class_1802.field_8550) && !i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_6079().method_31574(class_1802.field_8705) && !i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_6079().method_31574(class_1802.field_8550) && this.\u0430s\u0435asoe(this.e\u0455j\u0435p\u0435, class_1802.field_8705)) {
            return 1 != 0;
        }
        if (this.eep.axpacc() && this.\u0430s\u0435asoe(this.ix\u0455\u0455\u043ec, class_1802.field_8814)) {
            return 1 != 0;
        }
        if (this.x\u043es.axpacc()) {
            byte[] byArray = new byte[-1081391463 + 1081391475];
            byArray[0] = -941517128 + 941517092;
            byArray[1] = -940094376 + 940094322;
            byArray[2] = -1866595806 + 1866595820;
            byArray[3] = -282227154 + 282227107;
            byArray[4] = -1279640973 + 1279641043;
            byArray[5] = -2062016739 + 2062016787;
            byArray[-388628071 + 388628077] = -1905040115 + 1905040144;
            byArray[-1689623123 + 1689623130] = -68297046 + 68296925;
            byArray[-1918835127 + 1918835135] = -793471901 + 793471893;
            byArray[-1550844292 + 1550844301] = -136828021 + 136827940;
            byArray[-1998025114 + 1998025124] = -1104270204 + 1104270286;
            byArray[-1089808894 + 1089808905] = -1841789811 + 1841789820;
            if (!this.xsie\u0456.cip((String)((Object)i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(122824915 + 235990159), (int)(-1522930900 + 1819420287)))) && this.\u0430s\u0435asoe(this.\u0441\u0445j\u0458\u0440\u043e\u04bb, class_1802.field_8463)) {
                return 1 != 0;
            }
        }
        if (this.ox\u0440ip\u0456\u0435.axpacc()) {
            CallSite callSite;
            n = (int)(this.o\u0445\u0441a\u0456sp.axpacc() - 1.0f);
            class_17992 = (class_1799)i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7547.get(n);
            Object object2 = i\u0435\u0445\u0456sh.a_bsm14("\u0440\u0430op", \u0440\u0430op(net.minecraft.class_1792 ), (class_1792)class_1802.field_8803) > 0 ? class_1802.field_8803 : (object = i\u0435\u0445\u0456sh.a_bsm14("\u0440\u0430op", \u0440\u0430op(net.minecraft.class_1792 ), (class_1792)class_1802.field_8543) > 0 ? class_1802.field_8543 : null);
            if (!(object == null || class_17992.method_7909() == object && class_17992.method_7947() >= i\u0435\u0445\u0456sh.a_bsm14("\u0440\u0430op", \u0440\u0430op(net.minecraft.class_1792 ), (class_1792)object) || (callSite = i\u0435\u0445\u0456sh.a_bsm24("\u043e\u0458\u0445hi\u04bb\u0456", \u043e\u0458\u0445hi\u04bb\u0456(net.minecraft.class_1792 ), (class_1792)object)) == -1 || class_17992.method_7909() == object && class_17992.method_7947() >= ((class_1799)i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7547.get((int)callSite)).method_7947())) {
                return (this.i\u04bb\u0440jpa\u0445(n, (class_1792)object) ? 1 : 0) != 0;
            }
        }
        return 0 != 0;
    }

    private /* synthetic */ boolean \u0430s\u0435asoe(\u043ea\u0441\u0430p \u043ea\u0441\u0430p2, class_1792 class_17922) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 == null) {
            return 0 != 0;
        }
        int n = (int)(\u043ea\u0441\u0430p2.axpacc() - 1.0f);
        class_1799 class_17992 = (class_1799)i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7547.get(n);
        int n2 = -1;
        int n3 = -1;
        for (int i = 0; i < i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7547.size(); ++i) {
            class_1799 class_17993 = (class_1799)i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7547.get(i);
            if (i == n || !class_17993.method_31574(class_17922) || class_17993.method_7947() <= n3) continue;
            n2 = i;
            n3 = class_17993.method_7947();
            if (0 != 0 && (0 == 1 || 0 == 2) || !bl) continue;
            __js_dispatch_state = 0;
        }
        if (n2 != -1) {
            class_1799 class_17994 = (class_1799)i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7547.get(n2);
            if (class_17992.method_7909() != class_17922 || class_17992.method_7947() < class_17994.method_7947()) {
                return (this.co\u0430\u0440\u04bb(n, class_17994, false) ? 1 : 0) != 0;
            }
        }
        return 0 != 0;
    }

    private /* synthetic */ double oa\u0445(int n) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
            if (bl) {
                __js_dispatch_state = 0;
            }
        }
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (n >= -178454495 + 178454504 && n <= -29841225 + 29841269) {
            return (n - (-1603959203 + 1603959212)) % (-295464894 + 295464903);
        }
        if (n >= 5 && n <= -891723444 + 891723452) {
            return 0.0;
        }
        if (n == -844681654 + 844681699) {
            return 3.6;
        }
        return 0.0;
    }

    private /* synthetic */ double \u04bb\u0456\u0435\u043e\u0445(int n) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        if (n >= -725041225 + 725041234 && n <= -1286447339 + 1286447374) {
            return (double)((n - (-676087034 + 676087043)) / (-1583685208 + 1583685217)) + 3.5;
        }
        if (n >= -1617692129 + 1617692165 && n <= -1639964689 + 1639964733) {
            return 6.75;
        }
        if (n >= 5 && n <= -601305083 + 601305091) {
            return n - 5;
        }
        if (n == -1502867909 + 1502867954) {
            return 3.0;
        }
        return 0.0;
    }

    private /* synthetic */ double \u0441xh\u0435\u0455oo(int n, int n2) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (true | false) {
        }
        if (0 != 0) {
        }
        double d = this.oa\u0445(n) - this.oa\u0445(n2);
        double d2 = this.\u04bb\u0456\u0435\u043e\u0445(n) - this.\u04bb\u0456\u0435\u043e\u0445(n2);
        return (double)i\u0435\u0445\u0456sh.a_bsm36("sqrt", sqrt(double ), (double)(d * d + d2 * d2));
    }

    private /* synthetic */ long jje\u0456(int n, class_1713 class_17132) {
        long l2;
        boolean bl;
        boolean bl2 = false;
        if (bl2) {
            __js_dispatch_state = 0;
            if (bl2) {
                __js_dispatch_state = 0;
            }
        }
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        if (class_17132 != class_1713.field_7794 && class_17132 != class_1713.field_7791) {
            return 0L;
        }
        boolean bl3 = bl = this.\u04bba\u0455\u0440\u043e == -1 || i\u0435\u0445\u0456sh.$_hqsgupd1ngan17lcu(this.\u0441xh\u0435\u0455oo(this.\u04bba\u0455\u0440\u043e, n) == 4.0 ? 0 : (this.\u0441xh\u0435\u0455oo(this.\u04bba\u0455\u0440\u043e, n) > 4.0 ? 1 : -1)) >= 0;
        if (class_17132 == class_1713.field_7794 && bl) {
            v1 = 150L;
            if (0 != 0 && 0 != 1) {
                if (0 != 2) {
                } else if (bl2) {
                    __js_dispatch_state = 0;
                }
            }
        } else {
            v1 = l2 = 100L;
        }
        if (!this.\u0441\u0456\u0456jps.axpacc()) {
            return (long)i\u0435\u0445\u0456sh.a_bsm6("max", max(long long ), (long)l2, (long)((long)this.h\u0430\u0430soe\u0455.axpacc()));
        }
        if (this.h\u0445\u0441e != this.\u04bba\u0455\u0440\u043e || this.s\u0445ass\u0430\u0441 != n || this.hiaoj\u0435 != class_17132) {
            this.h\u0445\u0441e = this.\u04bba\u0455\u0440\u043e;
            this.s\u0445ass\u0430\u0441 = n;
            this.hiaoj\u0435 = class_17132;
            this.sih\u0435e = l2 + (long)(i\u0435\u0445\u0456sh.a_bsm37("random", random()) * 25.0);
        }
        return this.sih\u0435e;
    }

    private /* synthetic */ boolean \u043e\u0440ixai(int n, int n2, class_1713 class_17132, boolean bl) {
        boolean bl2;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        boolean bl6 = false;
        if (bl6) {
            __js_dispatch_state = 0;
        }
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        if (i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1761 == null || i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1687 == null || i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 == null || \u0430\u0445j\u0445s\u0456\u04bb.method_1562() == null) {
            return 0 != 0;
        }
        if (i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1755 == null && i\u0435\u0445\u0456sh.$_hqsgupe1ngan17lcv((long)(i\u0435\u0445\u0456sh.a_bsm3("nanoTime", nanoTime()) / 1000000L) == this.\u043e\u0435\u0456 ? 0 : ((long)(i\u0435\u0445\u0456sh.a_bsm3("nanoTime", nanoTime()) / 1000000L) < this.\u043e\u0435\u0456 ? -1 : 1)) < 0) {
            return 0 != 0;
        }
        if (!(i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1755 instanceof \u0455\u0445\u0455\u0445\u0456o\u0456) && !this.\u0430\u043e\u0456xx\u04bb()) {
            byte[] byArray = new byte[-1276050283 + 1276050290];
            byArray[0] = -1582044868 + 1582044962;
            byArray[1] = -754743844 + 754743875;
            byArray[2] = -656168211 + 656168232;
            byArray[3] = -249924515 + 249924591;
            byArray[4] = -1315982572 + 1315982547;
            byArray[5] = -1462556510 + 1462556451;
            byArray[-491536059 + 491536065] = -890994067 + 890993951;
            byte[] byArray2 = new byte[-1560949756 + 1560949825];
            byArray2[0] = -180104412 + 180104383;
            byArray2[1] = -665672227 + 665672125;
            byArray2[2] = -1284617300 + 1284617225;
            byArray2[3] = -1834231901 + 1834231943;
            byArray2[4] = -1017799847 + 1017799973;
            byArray2[5] = -742215663 + 742215749;
            byArray2[-46852892 + 46852898] = -1045995975 + 1045995862;
            byArray2[-1964676833 + 1964676840] = -1742695489 + 1742695530;
            byArray2[-121755543 + 121755551] = -978681471 + 978681562;
            byArray2[-1357630101 + 1357630110] = -151137741 + 151137648;
            byArray2[-109551019 + 109551029] = -36139445 + 36139481;
            byArray2[-1738452149 + 1738452160] = -2052686596 + 2052686504;
            byArray2[-1026322062 + 1026322074] = -81947376 + 81947255;
            byArray2[-419313053 + 419313066] = -410525798 + 410525758;
            byArray2[-1362920772 + 1362920786] = -314960303 + 314960293;
            byArray2[-436441008 + 436441023] = -317917093 + 317917119;
            byArray2[-930537110 + 930537126] = -233094898 + 233094952;
            byArray2[-1043791257 + 1043791274] = -979033758 + 979033644;
            byArray2[-1439317538 + 1439317556] = -881221065 + 881221186;
            byArray2[-233415340 + 233415359] = -389433652 + 389433779;
            byArray2[-1872507531 + 1872507551] = -1128305342 + 1128305407;
            byArray2[-809512810 + 809512831] = -1801597136 + 1801597200;
            byArray2[-665250512 + 665250534] = -1370161680 + 1370161693;
            byArray2[-4494371 + 4494394] = -980440826 + 980440704;
            byArray2[-972410554 + 972410578] = -1492811190 + 1492811160;
            byArray2[-104135606 + 104135631] = -1282041911 + 1282041949;
            byArray2[-1138093167 + 1138093193] = -1986582499 + 1986582482;
            byArray2[-472412276 + 472412303] = -812073226 + 812073307;
            byArray2[-1989045541 + 1989045569] = -749633344 + 749633372;
            byArray2[-1527098659 + 1527098688] = -1262596632 + 1262596701;
            byArray2[-897999600 + 897999630] = -178113767 + 178113892;
            byArray2[-1221508126 + 1221508157] = -773574658 + 773574645;
            byArray2[-473981371 + 473981403] = -499421393 + 499421371;
            byArray2[-596387482 + 596387515] = -365911536 + 365911415;
            byArray2[-157906261 + 157906295] = -225902357 + 225902465;
            byArray2[-1858901507 + 1858901542] = -396070808 + 396070840;
            byArray2[-289416867 + 289416903] = -91216221 + 91216238;
            byArray2[-14281092 + 14281129] = -32112930 + 32113000;
            byArray2[-1945199092 + 1945199130] = -31728790 + 31728832;
            byArray2[-915595686 + 915595725] = -898126618 + 898126601;
            byArray2[-659828850 + 659828890] = -1847955373 + 1847955389;
            byArray2[-2036900880 + 2036900921] = -701599986 + 701599883;
            byArray2[-63592115 + 63592157] = -1498751155 + 1498751204;
            byArray2[-208763245 + 208763288] = -479860417 + 479860358;
            byArray2[-958073455 + 958073499] = -316178341 + 316178356;
            byArray2[-1341540203 + 1341540248] = -652366051 + 652366099;
            byArray2[-855511372 + 855511418] = -2094972888 + 2094972952;
            byArray2[-611739871 + 611739918] = -352341656 + 352341576;
            byArray2[-1356905174 + 1356905222] = -182860444 + 182860397;
            byArray2[-1593157125 + 1593157174] = -297123439 + 297123406;
            byArray2[-642992010 + 642992060] = -461609432 + 461609522;
            byArray2[-1252142821 + 1252142872] = -1193777958 + 1193777951;
            byArray2[-1889824529 + 1889824581] = -1480781008 + 1480781131;
            byArray2[-1939642834 + 1939642887] = -1082544545 + 1082544609;
            byArray2[-1805244298 + 1805244352] = -519970238 + 519970290;
            byArray2[-34211853 + 34211908] = -1057548327 + 1057548250;
            byArray2[-101675008 + 101675064] = -1376838074 + 1376837946;
            byArray2[-465089158 + 465089215] = -575354202 + 575354128;
            byArray2[-213172219 + 213172277] = -386450485 + 386450497;
            byArray2[-1335967938 + 1335967997] = -1992748778 + 1992748670;
            byArray2[-1279155762 + 1279155822] = -510697985 + 510697970;
            byArray2[-898853848 + 898853909] = -245422541 + 245422580;
            byArray2[-1448271966 + 1448272028] = -230779819 + 230779764;
            byArray2[-193105813 + 193105876] = -218047937 + 218047884;
            byArray2[-1482536489 + 1482536553] = -452382041 + 452382003;
            byArray2[-1364126655 + 1364126720] = -1882422367 + 1882422468;
            byArray2[-1046970693 + 1046970759] = -241490663 + 241490569;
            byArray2[-900888439 + 900888506] = -315823311 + 315823421;
            byArray2[-1295686810 + 1295686878] = -869566963 + 869566984;
            \u0445hca\u0456\u0440\u043e \u0445hca\u0456\u0440\u043e2 = new \u0445hca\u0456\u0440\u043e(e\u043ep\u04bb.\u0458\u0456\u0430, (String)((Object)i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-620455044 + 517037657), (int)(-853318098 + 7956334))), (String)((Object)i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray2, (int)(1951351446 + 390351100), (int)(1817653319 + 1358990607))), 8000L);
            ((\u0445\u0440\u0430\u0435\u0445\u043e)((Object)i\u0435\u0445\u0456sh.a_bsm7("jaa\u0435\u0445c", jaa\u0435\u0445c()))).\u0441j\u0430\u0445io\u0455().is\u04bbj(\u0445hca\u0456\u0440\u043e2);
            this.\u043e\u0440\u0440s\u0435();
            return 0 != 0;
        }
        if (i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1755 instanceof class_465 && !(i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1755 instanceof class_490) || i\u0435\u0445\u0456sh.a_bsm38("ai\u0458\u0440", ai\u0458\u0440()) != false) {
            return 0 != 0;
        }
        if (!this.chs\u0456\u0440\u04bb.axpacc()) {
            v2 = true;
            if (bl6) {
                __js_dispatch_state = 0;
            }
        } else {
            v2 = bl5 = false;
        }
        if ((((\u0445\u0440\u0430\u0435\u0445\u043e)((Object)i\u0435\u0445\u0456sh.a_bsm7("jaa\u0435\u0445c", jaa\u0435\u0445c()))).\u0430o\u0441\u0456p\u0455().\u0441c\u0458\u043e\u0430(\u0441\u043e\u0456.class).\u0440\u0435\u0455x\u0435xe() && !bl || bl5 && c\u0455i\u0430\u0440\u0445.ejih != null) && !(i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1755 instanceof class_490) || !bl5 && !(i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1755 instanceof class_490) || i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_6115() || hc\u0445o.\u0430\u0435ca || i\u0435\u0445\u0456sh.a_bsm39("cj\u0455i\u0455\u0430s", cj\u0455i\u0455\u0430s()) != false || i\u0435\u0445\u0456sh.a_bsm40("c\u0458\u0440\u0456c\u0440s", c\u0458\u0440\u0456c\u0440s()) != false) {
            bl4 = true;
            if (0 != 0 && 0 != 1 && 0 != 2) {
                // empty if block
            }
        } else {
            bl4 = false;
        }
        if (bl3 = bl4) {
            return 0 != 0;
        }
        if (!this.chs\u0456\u0440\u04bb.axpacc() && !bl) {
            if (i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_24828() && i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1690.field_1903.method_1434() && i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1690.field_1894.method_1434()) {
                return 0 != 0;
            }
            if (i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_5624() || i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.field_3919) {
                this.o\u0458s\u04bbie\u043e = true;
                return 0 != 0;
            }
        }
        boolean bl7 = bl2 = this.s\u0430h && n == -1737729200 + 1737729245 && class_17132 == class_1713.field_7790;
        if (i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.field_7512 != i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.field_7498 || !i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.field_7498.method_34255().method_7960() && !bl2) {
            return 0 != 0;
        }
        if (n < 0 || n >= i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.field_7498.field_7761.size()) {
            return 0 != 0;
        }
        reference var8_10 = i\u0435\u0445\u0456sh.a_bsm3("nanoTime", nanoTime()) / 1000000L;
        if (i\u0435\u0445\u0456sh.$_hqsgupf1ngan17lcw((long)(var8_10 - this.\u043e\u0445\u0441\u0435\u0430\u043e) == this.jje\u0456(n, class_17132) ? 0 : ((long)(var8_10 - this.\u043e\u0445\u0441\u0435\u0430\u043e) < this.jje\u0456(n, class_17132) ? -1 : 1)) < 0) {
            this.c\u0458h = true;
            return 0 != 0;
        }
        i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1761.method_2906(i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.field_7498.field_7763, n, n2, class_17132, (class_1657)i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724);
        this.\u043e\u0445\u0441\u0435\u0430\u043e = (long)var8_10;
        this.\u04bba\u0455\u0440\u043e = n;
        this.\u0440\u0455\u0455();
        if (i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1755 == null) {
            \u0430\u0445j\u0445s\u0456\u04bb.method_1562().method_52787((class_2596)new class_2815(i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.field_7498.field_7763));
        }
        return 1 != 0;
    }

    private /* synthetic */ boolean ci\u043eh(int n) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return (this.\u043e\u0440ixai(n < -1417975862 + 1417975871 ? n + (-700831637 + 700831673) : n, -1320292609 + 1320292649, class_1713.field_7791, false) ? 1 : 0) != 0;
    }

    private /* synthetic */ boolean co\u0430\u0440\u04bb(int n, class_1799 class_17992, boolean bl) {
        reference var4_5;
        boolean bl2 = false;
        if (bl2) {
            __js_dispatch_state = 0;
        }
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return ((var4_5 = i\u0435\u0445\u0456sh.a_bsm5("e\u0440\u04bbp\u0430", e\u0440\u04bbp\u0430(net.minecraft.class_1799 ), (class_1799)class_17992)) != -1 && this.\u043e\u0440ixai((int)(var4_5 < -958416063 + 958416072 ? var4_5 + (-647112353 + 647112389) : var4_5), n, class_1713.field_7791, bl) ? 1 : 0) != 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ boolean i\u04bb\u0440jpa\u0445(int n, class_1792 class_17922) {
        int n2;
        reference var3_4;
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (true | false) {
        }
        if ((var3_4 = i\u0435\u0445\u0456sh.a_bsm24("\u043e\u0458\u0445hi\u04bb\u0456", \u043e\u0458\u0445hi\u04bb\u0456(net.minecraft.class_1792 ), (class_1792)class_17922)) != -1) {
            reference v0;
            if (var3_4 < -1264437594 + 1264437603) {
                v0 = var3_4 + (-1880071665 + 1880071701);
                if (bl) {
                    __js_dispatch_state = 0;
                }
            } else {
                v0 = var3_4;
            }
            if (this.\u043e\u0440ixai((int)v0, n, class_1713.field_7791, false)) {
                n2 = 1;
                return n2 != 0;
            }
        }
        n2 = 0;
        return n2 != 0;
    }

    private /* synthetic */ boolean \u0458ex\u0441(class_1799 class_17992, class_1799 class_17993) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if (class_17993 == null) {
            return 0 != 0;
        }
        if (class_17993.method_7909() instanceof class_1764) {
            return (!(class_17992.method_7909() instanceof class_1764) || i\u0435\u0445\u0456sh.$_hqsgupg1ngan17lcx((float)i\u0435\u0445\u0456sh.a_bsm41("a\u0456j\u0455\u0440", a\u0456j\u0455\u0440(net.minecraft.class_1799 ), (class_1799)class_17993) == (float)i\u0435\u0445\u0456sh.a_bsm41("a\u0456j\u0455\u0440", a\u0456j\u0455\u0440(net.minecraft.class_1799 ), (class_1799)class_17992) ? 0 : ((float)i\u0435\u0445\u0456sh.a_bsm41("a\u0456j\u0455\u0440", a\u0456j\u0455\u0440(net.minecraft.class_1799 ), (class_1799)class_17993) > (float)i\u0435\u0445\u0456sh.a_bsm41("a\u0456j\u0455\u0440", a\u0456j\u0455\u0440(net.minecraft.class_1799 ), (class_1799)class_17992) ? 1 : -1)) > 0 ? 1 : 0) != 0;
        }
        if (!(class_17992.method_7909() instanceof class_1753)) {
            return 1 != 0;
        }
        byte[] byArray = new byte[-750558608 + 750558617];
        byArray[0] = -536736805 + 536736874;
        byArray[1] = -761165082 + 761164981;
        byArray[2] = -1975453954 + 1975453851;
        byArray[3] = -1400511236 + 1400511202;
        byArray[4] = -495995787 + 495995898;
        byArray[5] = -972504038 + 972503974;
        byArray[-130024209 + 130024215] = -563435781 + 563435895;
        byArray[-131950308 + 131950315] = -2139443266 + 2139443259;
        byArray[-1840119113 + 1840119121] = 2;
        if (this.\u0440\u043eo\u043eip\u0456.cip((String)((Object)i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(1472786861 + 1592182018), (int)(-1599099760 + 1528385336))))) {
            return (i\u0435\u0445\u0456sh.$_hqsguph1ngan17lcy((float)i\u0435\u0445\u0456sh.a_bsm42("pxax", pxax(net.minecraft.class_1799 ), (class_1799)class_17993) == (float)i\u0435\u0445\u0456sh.a_bsm42("pxax", pxax(net.minecraft.class_1799 ), (class_1799)class_17992) ? 0 : ((float)i\u0435\u0445\u0456sh.a_bsm42("pxax", pxax(net.minecraft.class_1799 ), (class_1799)class_17993) > (float)i\u0435\u0445\u0456sh.a_bsm42("pxax", pxax(net.minecraft.class_1799 ), (class_1799)class_17992) ? 1 : -1)) > 0 ? 1 : 0) != 0;
        }
        return (i\u0435\u0445\u0456sh.$_hqsgupi1ngan17lcz((float)i\u0435\u0445\u0456sh.a_bsm43("\u0458\u0458\u043epa", \u0458\u0458\u043epa(net.minecraft.class_1799 ), (class_1799)class_17993) == (float)i\u0435\u0445\u0456sh.a_bsm43("\u0458\u0458\u043epa", \u0458\u0458\u043epa(net.minecraft.class_1799 ), (class_1799)class_17992) ? 0 : ((float)i\u0435\u0445\u0456sh.a_bsm43("\u0458\u0458\u043epa", \u0458\u0458\u043epa(net.minecraft.class_1799 ), (class_1799)class_17993) > (float)i\u0435\u0445\u0456sh.a_bsm43("\u0458\u0458\u043epa", \u0458\u0458\u043epa(net.minecraft.class_1799 ), (class_1799)class_17992) ? 1 : -1)) > 0 ? 1 : 0) != 0;
    }

    public /* synthetic */ boolean \u0455x\u04bb\u0456ap(class_1799 class_17992) {
        block19: {
            boolean bl;
            block21: {
                block20: {
                    bl = false;
                    if (bl) {
                        __js_dispatch_state = 0;
                    }
                    if (2 * 2 * 2 >= 0) {
                    }
                    if (0 != 0) {
                    }
                    if (i\u0435\u0445\u0456sh.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 == null || class_17992.method_7960()) {
                        return 0 != 0;
                    }
                    if (i\u0435\u0445\u0456sh.a_bsm44("s\u0441\u043e", s\u0441\u043e(net.minecraft.class_1799 ), (class_1799)class_17992) != false) break block20;
                    byte[] byArray = new byte[-414815615 + 414815627];
                    byArray[0] = -2104883833 + 2104883807;
                    byArray[1] = -951267593 + 951267718;
                    byArray[2] = -1595506469 + 1595506449;
                    byArray[3] = -1876090093 + 1876090195;
                    byArray[4] = -1354612507 + 1354612441;
                    byArray[5] = -651567388 + 651567459;
                    byArray[-1024171194 + 1024171200] = -1486608195 + 1486608232;
                    byArray[-1718794930 + 1718794937] = 2;
                    byArray[-1593999669 + 1593999677] = -2067123270 + 2067123176;
                    byArray[-562879699 + 562879708] = -2074432503 + 2074432429;
                    byArray[-1852330680 + 1852330690] = -227821088 + 227821094;
                    byArray[-1766723102 + 1766723113] = -1623791297 + 1623791261;
                    if (!class_17992.method_7954().getString().contains((CharSequence)((Object)i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(1570584644 + 946232766), (int)(-1644082332 + 1580380366))))) break block21;
                }
                return 1 != 0;
            }
            class_1792 class_17922 = class_17992.method_7909();
            i\u0435\u0445\u0456sh.a_bsm2("requireNonNull", requireNonNull(T ), (Object)class_17922);
            class_1792 class_17923 = class_17922;
            int n = 0;
            while (true) {
                block31: {
                    block30: {
                        block29: {
                            block28: {
                                block27: {
                                    block26: {
                                        block25: {
                                            block24: {
                                                block23: {
                                                    block22: {
                                                        CallSite callSite = SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class_1738.class, class_1829.class, class_1810.class, class_1743.class, class_1821.class, class_1764.class, class_1753.class, class_1753.class, class_1753.class, class_1747.class}, (Object)class_17923, n);
                                                        if (callSite == false) break block22;
                                                        if (callSite == true) break block23;
                                                        if (callSite == 2) break block24;
                                                        if (callSite == 3) break block25;
                                                        if (callSite == 4) break block26;
                                                        if (callSite == 5) break block27;
                                                        if (callSite == 6) break block28;
                                                        if (callSite == 7) break block29;
                                                        if (callSite == 8) break block30;
                                                        if (callSite != 9) {
                                                            break block19;
                                                        }
                                                        break block31;
                                                    }
                                                    class_1738 class_17382 = (class_1738)class_17923;
                                                    CallSite callSite = i\u0435\u0445\u0456sh.a_bsm9("co\u04bbs", co\u04bbs(net.minecraft.class_1799 ), (class_1799)class_17992);
                                                    return (i\u0435\u0445\u0456sh.$_hqsgupj1ngan17ld0((float)i\u0435\u0445\u0456sh.a_bsm10("\u0441phha\u04bb\u0458", \u0441phha\u04bb\u0458(net.minecraft.class_1304 ), (class_1304)class_17382.method_7685()) == (float)callSite ? 0 : ((float)i\u0435\u0445\u0456sh.a_bsm10("\u0441phha\u04bb\u0458", \u0441phha\u04bb\u0458(net.minecraft.class_1304 ), (class_1304)class_17382.method_7685()) < (float)callSite ? -1 : 1)) < 0 && i\u0435\u0445\u0456sh.$_hqsgupk1ngan17ld1((float)callSite == (float)i\u0435\u0445\u0456sh.a_bsm8("\u0445\u0455opsp", \u0445\u0455opsp(net.minecraft.class_1304 ), (class_1304)class_17382.method_7685()) ? 0 : ((float)callSite > (float)i\u0435\u0445\u0456sh.a_bsm8("\u0445\u0455opsp", \u0445\u0455opsp(net.minecraft.class_1304 ), (class_1304)class_17382.method_7685()) ? 1 : -1)) >= 0 ? 1 : 0) != 0;
                                                }
                                                class_1829 class_18292 = (class_1829)class_17923;
                                                return (i\u0435\u0445\u0456sh.a_bsm22("\u0435\u043ea\u0456\u0435", \u0435\u043ea\u0456\u0435()) == class_17992 ? 1 : 0) != 0;
                                            }
                                            class_1810 class_18102 = (class_1810)class_17923;
                                            return (i\u0435\u0445\u0456sh.a_bsm29("a\u0456\u0430\u0456\u0435\u0445\u0458", a\u0456\u0430\u0456\u0435\u0445\u0458()) == class_17992 ? 1 : 0) != 0;
                                        }
                                        class_1743 class_17432 = (class_1743)class_17923;
                                        if (i\u0435\u0445\u0456sh.a_bsm11("p\u04bb\u0455piea", p\u04bb\u0455piea(net.minecraft.class_1799 ), (class_1799)class_17992) != false) {
                                            n = 4;
                                            continue;
                                        }
                                        return (i\u0435\u0445\u0456sh.a_bsm31("i\u0455\u0440xj", i\u0455\u0440xj()) == class_17992 ? 1 : 0) != 0;
                                    }
                                    class_1821 class_18212 = (class_1821)class_17923;
                                    return (i\u0435\u0445\u0456sh.a_bsm45("\u0440aeiia", \u0440aeiia()) == class_17992 ? 1 : 0) != 0;
                                }
                                class_1764 class_17642 = (class_1764)class_17923;
                                return (i\u0435\u0445\u0456sh.a_bsm33("sa\u0458chce", sa\u0458chce()) == class_17992 ? 1 : 0) != 0;
                            }
                            class_1753 class_17532 = (class_1753)class_17923;
                            if (i\u0435\u0445\u0456sh.a_bsm46("\u0440\u043e\u0441", \u0440\u043e\u0441(net.minecraft.class_1799 ), (class_1799)class_17992) == false) {
                                n = -2065706855 + 2065706862;
                                continue;
                            }
                            return (i\u0435\u0445\u0456sh.a_bsm35("h\u0455so", h\u0455so()) == class_17992 ? 1 : 0) != 0;
                        }
                        class_1753 class_17533 = (class_1753)class_17923;
                        if (i\u0435\u0445\u0456sh.a_bsm47("\u0456ph", \u0456ph(net.minecraft.class_1799 ), (class_1799)class_17992) == false) {
                            n = -1360382912 + 1360382920;
                            continue;
                        }
                        return (i\u0435\u0445\u0456sh.a_bsm34("i\u0445\u0456ih\u0445", i\u0445\u0456ih\u0445()) == class_17992 ? 1 : 0) != 0;
                    }
                    class_1753 class_17534 = (class_1753)class_17923;
                    if (i\u0435\u0445\u0456sh.a_bsm14("\u0440\u0430op", \u0440\u0430op(net.minecraft.class_1792 ), (class_1792)class_1802.field_8102) <= true) {
                        n = -1994857261 + 1994857270;
                        continue;
                    }
                    return 0 != 0;
                }
                class_1747 class_17472 = (class_1747)class_17923;
                if (i\u0435\u0445\u0456sh.a_bsm13("\u0440\u0441cs\u04bb\u043e\u0441", \u0440\u0441cs\u04bb\u043e\u0441(net.minecraft.class_2248 ), (class_2248)class_17472.method_7711()) != false && class_17472.method_7711() != class_2246.field_10343 && class_17472.method_7711() != class_2246.field_10375) break;
                n = -1082548102 + 1082548112;
                if (!bl) continue;
                __js_dispatch_state = 0;
            }
            return 0 != 0;
        }
        if (class_17992.method_7909() == class_1802.field_8705 && i\u0435\u0445\u0456sh.$_hqsguq61ngan17ld2((float)i\u0435\u0445\u0456sh.a_bsm14("\u0440\u0430op", \u0440\u0430op(net.minecraft.class_1792 ), (class_1792)class_1802.field_8705) == this.o\u0430\u0430jx.axpacc() ? 0 : ((float)i\u0435\u0445\u0456sh.a_bsm14("\u0440\u0430op", \u0440\u0430op(net.minecraft.class_1792 ), (class_1792)class_1802.field_8705) > this.o\u0430\u0430jx.axpacc() ? 1 : -1)) > 0) {
            return 0 != 0;
        }
        if (class_17992.method_7909() == class_1802.field_8187 && i\u0435\u0445\u0456sh.$_hqsguq71ngan17ld3((float)i\u0435\u0445\u0456sh.a_bsm14("\u0440\u0430op", \u0440\u0430op(net.minecraft.class_1792 ), (class_1792)class_1802.field_8187) == this.\u043e\u043ep\u04bb\u0458h\u0430.axpacc() ? 0 : ((float)i\u0435\u0445\u0456sh.a_bsm14("\u0440\u0430op", \u0440\u0430op(net.minecraft.class_1792 ), (class_1792)class_1802.field_8187) > this.\u043e\u043ep\u04bb\u0458h\u0430.axpacc() ? 1 : -1)) > 0) {
            return 0 != 0;
        }
        if (class_17992.method_7909() instanceof class_1787 && i\u0435\u0445\u0456sh.a_bsm14("\u0440\u0430op", \u0440\u0430op(net.minecraft.class_1792 ), (class_1792)class_1802.field_8378) > true) {
            return 0 != 0;
        }
        if (hca\u0455c.\u0456oc\u0440.contains(class_17992.method_7909())) {
            return 0 != 0;
        }
        return (!(class_17992.method_7909() instanceof class_1798) && i\u0435\u0445\u0456sh.a_bsm48("h\u0435a\u0440\u0445\u04bb", h\u0435a\u0440\u0445\u04bb(net.minecraft.class_1799 ), (class_1799)class_17992) != false ? 1 : 0) != 0;
    }

    private /* synthetic */ boolean \u0430\u043e\u0456xx\u04bb() {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (true | false) {
        }
        if (0 != 0) {
        }
        ArrayList<CallSite> arrayList = new ArrayList<CallSite>();
        arrayList.add(i\u0435\u0445\u0456sh.a_bsm49("of", of(java.lang.Object java.lang.Object ), (Object)this.\u0458\u0456\u0458\u0458ae, (Object)this.o\u04bb\u0440));
        arrayList.add(i\u0435\u0445\u0456sh.a_bsm49("of", of(java.lang.Object java.lang.Object ), (Object)this.a\u0441\u0430\u043e\u0440, (Object)this.\u0456\u04bbj));
        arrayList.add(i\u0435\u0445\u0456sh.a_bsm49("of", of(java.lang.Object java.lang.Object ), (Object)this.\u0440cep, (Object)this.a\u0441chp));
        arrayList.add(i\u0435\u0445\u0456sh.a_bsm49("of", of(java.lang.Object java.lang.Object ), (Object)this.pish, (Object)this.\u0445x\u0445p\u0435));
        arrayList.add(i\u0435\u0445\u0456sh.a_bsm49("of", of(java.lang.Object java.lang.Object ), (Object)this.\u0455je\u0441ixc, (Object)this.e\u0455j\u0435p\u0435));
        arrayList.add(i\u0435\u0445\u0456sh.a_bsm49("of", of(java.lang.Object java.lang.Object ), (Object)this.\u043ee\u0430, (Object)this.\u0430j\u0456x\u04bb));
        arrayList.add(i\u0435\u0445\u0456sh.a_bsm49("of", of(java.lang.Object java.lang.Object ), (Object)this.eep, (Object)this.ix\u0455\u0455\u043ec));
        arrayList.add(i\u0435\u0445\u0456sh.a_bsm49("of", of(java.lang.Object java.lang.Object ), (Object)this.ox\u0440ip\u0456\u0435, (Object)this.o\u0445\u0441a\u0456sp));
        arrayList.add(i\u0435\u0445\u0456sh.a_bsm49("of", of(java.lang.Object java.lang.Object ), (Object)this.\u0456\u0445\u043e\u0455\u04bb, (Object)this.\u0456sxax));
        byte[] byArray = new byte[-1603396430 + 1603396442];
        byArray[0] = -1837743516 + 1837743637;
        byArray[1] = -1;
        byArray[2] = -476419487 + 476419551;
        byArray[3] = -92677701 + 92677651;
        byArray[4] = -1669801021 + 1669800990;
        byArray[5] = -1660417283 + 1660417374;
        byArray[-1185097701 + 1185097707] = 5;
        byArray[-287680247 + 287680254] = -143657419 + 143657398;
        byArray[-73898419 + 73898427] = -498117098 + 498117135;
        byArray[-1172820129 + 1172820138] = -687426865 + 687426899;
        byArray[-555971793 + 555971803] = -1120322078 + 1120322044;
        byArray[-1247799082 + 1247799093] = -1500151282 + 1500151392;
        if (!this.xsie\u0456.cip((String)((Object)i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(1277500969 + 1159164690), (int)(-1837986538 + 508175269))))) {
            arrayList.add(i\u0435\u0445\u0456sh.a_bsm49("of", of(java.lang.Object java.lang.Object ), (Object)this.x\u043es, (Object)this.\u0441\u0445j\u0458\u0440\u043e\u04bb));
        }
        if (!this.xsie\u0456.cip((String)((Object)i\u0435\u0445\u0456sh.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1630461119 + 1630461167, -211270037 + 211270113, -546685957 + 546685969, -563715161 + 563715191, -971309652 + 971309725}, (int)(-32292845 + 2012493300), (int)(-1727417012 + 696978760))))) {
            arrayList.add(i\u0435\u0445\u0456sh.a_bsm49("of", of(java.lang.Object java.lang.Object ), (Object)this.ijao, (Object)this.\u0440s\u0430cc\u0456h));
        }
        HashSet<CallSite> hashSet = new HashSet<CallSite>();
        for (Pair pair : arrayList) {
            int n;
            if (!((h\u04bb\u0455hpa)pair.getKey()).axpacc() || hashSet.add(i\u0435\u0445\u0456sh.a_bsm50("valueOf", valueOf(int ), (int)(n = (int)(((\u043ea\u0441\u0430p)pair.getValue()).axpacc() - 1.0f))))) continue;
            return 0 != 0;
        }
        return 1 != 0;
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

    private static /* synthetic */ CallSite a_bsm31(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm32(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm33(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm34(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm35(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm36(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm37(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm38(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm39(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm40(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm41(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm42(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm43(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm44(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm45(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm46(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm47(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm48(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm49(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm50(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm51(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }
}

