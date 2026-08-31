/*
 * Decompiled with CFR 0.152.
 */
package \u0440expho;

import c\u0445is.hoi\u0435h\u0440;
import c\u0445is.s\u0456a\u0458;
import c\u0445is.\u0430\u0456i\u043ephj;
import c\u0445is.\u04bbj\u0441x\u0440;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2547;
import net.minecraft.class_2596;
import net.minecraft.class_2708;
import net.minecraft.class_2743;
import o\u0455sio\u0440.\u0445\u0458\u0458h\u0445\u0430a;
import \u043e\u0445\u0440\u0430ose.i\u0456\u0445\u0430\u0441p;
import \u0441\u0445o.jax\u0458\u0435\u0458;
import \u0445eo.c\u0455pi;
import \u0445eo.\u0456p\u0430\u043e\u0458\u043e;
import \u0445eo.\u0458i\u0456x;
import \u0458\u0458\u0458o\u0430\u0456.e\u0445\u0440\u0440a;

@\u0456p\u0430\u043e\u0458\u043e(sp\u0456p\u0445\u0435="LongJump", s\u0455cj=\u0458i\u0456x.MOVEMENT, a\u0456j\u0430\u0455\u04bb="Allows you to use fireball longjump")
public class a\u0430\u0455se
extends c\u0455pi {
    public static /* synthetic */ e\u0445\u0440\u0440a \u043ei\u0456s\u0440xe;
    private /* synthetic */ boolean i\u0458xx\u0456\u0458i;
    private /* synthetic */ boolean \u0458\u0430p;
    private /* synthetic */ boolean NcfSumNuCg;
    private /* synthetic */ boolean \u0440\u0445ee\u0430\u0455;
    private /* synthetic */ boolean c\u0435a\u0440x\u0456;
    private /* synthetic */ boolean o\u0455h\u0440;
    private /* synthetic */ boolean \u0455\u0456e\u0440;
    private /* synthetic */ int \u0456i\u0430\u04bb;
    private /* synthetic */ int a\u0445iep\u0445p;
    private /* synthetic */ long \u0435\u0458\u043eo;
    private /* synthetic */ int \u0455a\u0456sep\u0455;
    private /* synthetic */ int \u0456\u0456\u0458\u0455j;
    private /* synthetic */ int ae\u0441;
    private /* synthetic */ int ccs;
    private final /* synthetic */ List<Integer> e\u0440\u0441;
    private final /* synthetic */ LinkedBlockingQueue<class_2596<?>> \u0456h\u0430cs\u0458\u0458;
    private static /* synthetic */ int __js_dispatch_state = 0;

    public a\u0430\u0455se() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (a\u0430\u0455se.$_h1j957hj1ngan17lhd((long)a\u0430\u0455se.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)a\u0430\u0455se.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        this.a\u0445iep\u0445p = -1;
        this.e\u0440\u0441 = new ArrayList<Integer>();
        this.\u0456h\u0430cs\u0458\u0458 = new LinkedBlockingQueue();
    }

    private /* synthetic */ void \u0458\u0455\u0441(class_2596<?> class_25962) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (a\u0430\u0455se.$_h1j957hk1ngan17lhe((long)a\u0430\u0455se.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)a\u0430\u0455se.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        try {
            if (0 != 0) {
            }
            if (\u0430\u0445j\u0445s\u0456\u04bb.method_1562() != null) {
                class_25962.method_11054((class_2547)\u0430\u0445j\u0445s\u0456\u04bb.method_1562());
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private /* synthetic */ void is\u0445\u0441() {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (2 * 2 * 2 >= 0) {
        }
        if (a\u0430\u0455se.$_h1j957hl1ngan17lhf((long)a\u0430\u0455se.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)a\u0430\u0455se.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        while (true) {
            class_2596<?> class_25962;
            if (0 != 0) {
            }
            if ((class_25962 = this.\u0456h\u0430cs\u0458\u0458.poll()) == null) break;
            this.\u0458\u0455\u0441(class_25962);
        }
    }

    private /* synthetic */ void acc(int n) {
        int n2;
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (2 * 2 * 2 >= 0) {
        }
        if (a\u0430\u0455se.$_h1j957hm1ngan17lhg((long)a\u0430\u0455se.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)a\u0430\u0455se.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        if (0 != 0) {
        }
        if (n >= this.e\u0440\u0441.size()) {
            return;
        }
        int n3 = this.e\u0440\u0441.get(n);
        for (n2 = 0; !this.\u0456h\u0430cs\u0458\u0458.isEmpty() && n2 <= n3; ++n2) {
            class_2596<?> class_25962 = this.\u0456h\u0430cs\u0458\u0458.poll();
            if (class_25962 == null) continue;
            this.\u0458\u0455\u0441(class_25962);
        }
        for (n2 = n + 1; n2 < this.e\u0440\u0441.size(); ++n2) {
            this.e\u0440\u0441.set(n2, (Integer)((Object)a\u0430\u0455se.a_bsm1("valueOf", valueOf(int ), (int)(this.e\u0440\u0441.get(n2) - (n3 + 1)))));
        }
    }

    private /* synthetic */ int oa\u0458jxx\u0430() {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (true | false) {
        }
        if (a\u0430\u0455se.$_h1j957hn1ngan17lhh((long)a\u0430\u0455se.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)a\u0430\u0455se.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        if (0 != 0) {
        }
        for (int i = 0; i < -257007169 + 257007178; ++i) {
            if (a\u0430\u0455se.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().method_5438(i).method_7909() != class_1802.field_8814) continue;
            return i;
        }
        return -1;
    }

    private /* synthetic */ int \u0430\u0441a\u0458x() {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (2 * 2 * 2 >= 0) {
        }
        if (a\u0430\u0455se.$_h84s4ml1ngan17lhi((long)a\u0430\u0455se.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)a\u0430\u0455se.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        if (0 != 0) {
        }
        int n = 0;
        for (int i = 0; i < -519916254 + 519916263; ++i) {
            class_1799 class_17992 = a\u0430\u0455se.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().method_5438(i);
            if (class_17992.method_7909() != class_1802.field_8814) continue;
            n += class_17992.method_7947();
        }
        return n;
    }

    private /* synthetic */ int ih\u043eh() {
        int n;
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (2 * 2 * 2 >= 0) {
        }
        if (a\u0430\u0455se.$_h84s4mm1ngan17lhj((long)a\u0430\u0455se.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)a\u0430\u0455se.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        if (0 != 0) {
        }
        if ((n = this.oa\u0458jxx\u0430()) == -1) {
            byte[] byArray = new byte[-710324411 + 710324426];
            byArray[0] = -1233364870 + 1233364789;
            byArray[1] = 3;
            byArray[2] = -199372940 + 199372917;
            byArray[3] = -889278371 + 889278401;
            byArray[4] = -1360713964 + 1360713944;
            byArray[5] = -176764144 + 176764022;
            byArray[-5832521 + 5832527] = -1979879396 + 1979879415;
            byArray[-655597275 + 655597282] = -645916987 + 645916938;
            byArray[-1729971519 + 1729971527] = -900796387 + 900796480;
            byArray[-2117145041 + 2117145050] = -381867248 + 381867146;
            byArray[-79381873 + 79381883] = -1414784707 + 1414784768;
            byArray[-854110245 + 854110256] = -1969351025 + 1969351093;
            byArray[-1948325022 + 1948325034] = -949936746 + 949936673;
            byArray[-1613441487 + 1613441500] = -2129356146 + 2129356109;
            byArray[-952057845 + 952057859] = -1125268038 + 1125268084;
            a\u0430\u0455se.a_bsm3("e\u04bb\u0445\u0435\u0441\u0445", e\u04bb\u0445\u0435\u0441\u0445(java.lang.String ), (String)((Object)a\u0430\u0455se.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(1016629290 + 1275920507), (int)(-135274289 + 1903069326))));
            this.setEnabled(false);
        }
        return n;
    }

    private /* synthetic */ boolean \u043e\u0435x\u0440(int n) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
            if (bl) {
                __js_dispatch_state = 0;
            }
        }
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (a\u0430\u0455se.$_h84s4mn1ngan17lhk((long)a\u0430\u0455se.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)a\u0430\u0455se.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        if (0 != 0) {
        }
        return (a\u0430\u0455se.a_bsm4("glfwGetMouseButton", glfwGetMouseButton(long int ), (long)a\u0430\u0455se.\u0430\u0445j\u0445s\u0456\u04bb.method_22683().method_4490(), (int)n) == true ? 1 : 0) != 0;
    }

    private /* synthetic */ void ae\u04bb\u0445() {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (a\u0430\u0455se.$_h84s4mo1ngan17lhl((long)a\u0430\u0455se.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)a\u0430\u0455se.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        if (0 != 0) {
        }
        this.is\u0445\u0441();
        \u043ei\u0456s\u0440xe = null;
        this.\u0456i\u0430\u04bb = 0;
        this.c\u0435a\u0440x\u0456 = true;
        this.\u0440\u0445ee\u0430\u0455 = false;
        this.NcfSumNuCg = false;
        this.\u0458\u0430p = false;
        this.\u0455\u0456e\u0440 = false;
        this.o\u0455h\u0440 = false;
        this.ccs = 0;
        this.ae\u0441 = 0;
        this.\u0456\u0456\u0458\u0455j = 0;
        this.\u0455a\u0456sep\u0455 = 0;
        this.\u0435\u0458\u043eo = 0;
        this.e\u0440\u0441.clear();
        a\u0430\u0455se.\u0430\u0445j\u0445s\u0456\u04bb.field_1690.field_1904.method_23481(false);
        a\u0430\u0455se.\u0430\u0445j\u0445s\u0456\u04bb.field_1690.field_1903.method_23481(false);
    }

    @Override
    public /* synthetic */ void onEnable() {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
            if (bl) {
                __js_dispatch_state = 0;
            }
        }
        if (true | false) {
        }
        if (a\u0430\u0455se.$_h84s4mp1ngan17lhm((long)a\u0430\u0455se.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)a\u0430\u0455se.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        if (0 != 0) {
        }
        this.ae\u04bb\u0445();
        this.a\u0445iep\u0445p = -1;
        this.i\u0458xx\u0456\u0458i = a\u0430\u0455se.a_bsm5("\u0455pia\u0456\u0441", \u0455pia\u0456\u0441()) == false;
        byte[] byArray = new byte[-210803774 + 210803864];
        byArray[0] = -2128994467 + 2128994420;
        byArray[1] = -1060250485 + 0x3F322323;
        byArray[2] = -1220571490 + 1220571594;
        byArray[3] = -2019994334 + 2019994397;
        byArray[4] = -385489119 + 385489021;
        byArray[5] = -69506040 + 69505944;
        byArray[-1935388699 + 1935388705] = -127992176 + 127992272;
        byArray[-352002947 + 352002954] = -458668911 + 458669027;
        byArray[-270266892 + 270266900] = -91177136 + 91177066;
        byArray[-1836090968 + 1836090977] = -1283923606 + 1283923502;
        byArray[-540033355 + 540033365] = -563163581 + 563163517;
        byArray[-971367341 + 971367352] = -1594764336 + 1594764213;
        byArray[-1635721582 + 1635721594] = -2129423793 + 2129423791;
        byArray[-472304442 + 472304455] = -241094454 + 241094365;
        byArray[-1241875864 + 1241875878] = 2;
        byArray[-1885974803 + 1885974818] = -898244775 + 898244744;
        byArray[-316949581 + 316949597] = -898053951 + 898053846;
        byArray[-1630463203 + 1630463220] = -738915065 + 738915086;
        byArray[-518985096 + 518985114] = -1592988975 + 1592988874;
        byArray[-1515781839 + 1515781858] = -1051738834 + 1051738751;
        byArray[-1064183293 + 1064183313] = -307903434 + 307903373;
        byArray[-472447218 + 472447239] = -119719997 + 119719984;
        byArray[-1104012760 + 1104012782] = -1325381496 + 1325381539;
        byArray[-1028211628 + 1028211651] = -652705944 + 652705883;
        byArray[-1520884641 + 1520884665] = -1534530131 + 1534530255;
        byArray[-612709277 + 612709302] = -220679538 + 220679423;
        byArray[-1694881558 + 1694881584] = -178430948 + 178430846;
        byArray[-102895057 + 102895084] = -30911473 + 30911573;
        byArray[-992689939 + 992689967] = -474425640 + 474425555;
        byArray[-639726582 + 639726611] = -303963353 + 303963370;
        byArray[-2093223086 + 2093223116] = -1702419865 + 1702419792;
        byArray[-774836936 + 774836967] = -1871145296 + 1871145310;
        byArray[-1660298591 + 1660298623] = -889113238 + 889113118;
        byArray[-485987469 + 485987502] = -1103476268 + 1103476151;
        byArray[-692250204 + 692250238] = 3;
        byArray[-277595350 + 277595385] = -189069830 + 189069791;
        byArray[-1018939454 + 1018939490] = -643683054 + 643683112;
        byArray[-1442390677 + 1442390714] = 2;
        byArray[-1369217464 + 1369217502] = -139045026 + 139045064;
        byArray[-381843568 + 381843607] = -237357253 + 237357186;
        byArray[-2036149690 + 2036149730] = -1815498212 + 1815498121;
        byArray[-724809775 + 724809816] = -777839950 + 777840000;
        byArray[-1386178510 + 1386178552] = -1515434991 + 1515435096;
        byArray[-1350552588 + 1350552631] = -1674723201 + 1674723168;
        byArray[-578926580 + 578926624] = -1865833731 + 1865833843;
        byArray[-1996977414 + 1996977459] = -527866772 + 527866705;
        byArray[-70254951 + 70254997] = -70173993 + 70173885;
        byArray[-213641057 + 213641104] = -1707437571 + 1707437488;
        byArray[-201466363 + 201466411] = -1531122329 + 1531122297;
        byArray[-1118709211 + 1118709260] = -651532787 + 651532886;
        byArray[-1134054814 + 1134054864] = -156294441 + 156294565;
        byArray[-1224973814 + 1224973865] = -1099542513 + 1099542395;
        byArray[-369778688 + 369778740] = -1189247522 + 1189247473;
        byArray[-206501748 + 206501801] = -98084085 + 98084165;
        byArray[-1680827983 + 1680828037] = -323021593 + 323021659;
        byArray[-1661544673 + 1661544728] = -1819200546 + 1819200497;
        byArray[-1154794267 + 1154794323] = -646134105 + 646134120;
        byArray[-1750467402 + 1750467459] = -1979134624 + 1979134620;
        byArray[-2005954137 + 2005954195] = -2020440971 + 2020441088;
        byArray[-864061195 + 864061254] = -1289253156 + 1289253039;
        byArray[-2026894211 + 2026894271] = -108895156 + 108895207;
        byArray[-1557033926 + 1557033987] = -1974754154 + 1974754277;
        byArray[-1660809180 + 1660809242] = -19488958 + 19488980;
        byArray[-227517808 + 227517871] = -1546179856 + 1546179835;
        byArray[-758248146 + 758248210] = -1454442204 + 1454442288;
        byArray[-566554757 + 566554822] = -1791522163 + 1791522035;
        byArray[-939180668 + 939180734] = -1117992768 + 1117992812;
        byArray[-1719881564 + 1719881631] = -430212308 + 430212356;
        byArray[-1787897410 + 1787897478] = -669178116 + 669178111;
        byArray[-1953714837 + 1953714906] = -2058242803 + 2058242849;
        byArray[-507607451 + 507607521] = 3;
        byArray[-760011444 + 760011515] = -1318708887 + 1318708981;
        byArray[-1967936732 + 1967936804] = -1430022491 + 1430022457;
        byArray[-983804930 + 983805003] = -1108779276 + 1108779262;
        byArray[-325127245 + 325127319] = -1499683622 + 1499683564;
        byArray[-1170718016 + 1170718091] = -1289020433 + 1289020515;
        byArray[-1548385491 + 1548385567] = -489367154 + 489367148;
        byArray[-320865847 + 320865924] = -1248875506 + 1248875493;
        byArray[-716691256 + 716691334] = -343399410 + 343399302;
        byArray[-1829447923 + 1829448002] = -484581183 + 484581291;
        byArray[-1194318611 + 1194318691] = -394165166 + 394165184;
        byArray[-1826712707 + 1826712788] = -2031346386 + 2031346291;
        byArray[-996929814 + 996929896] = 3;
        byArray[-577087368 + 577087451] = -504981966 + 504981920;
        byArray[-1062068111 + 1062068195] = -350118076 + 350117960;
        byArray[-1873568546 + 1873568631] = -1696915739 + 1696915808;
        byArray[-398562727 + 398562813] = -2071373267 + 2071373379;
        byArray[-1231958143 + 1231958230] = -490265777 + 490265789;
        byArray[-1095676761 + 1095676849] = -463315220 + 463315279;
        byArray[-680388191 + 680388280] = -34326740 + 34326662;
        a\u0430\u0455se.a_bsm3("e\u04bb\u0445\u0435\u0441\u0445", e\u04bb\u0445\u0435\u0441\u0445(java.lang.String ), (String)((Object)a\u0430\u0455se.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(99713683 + 590325389), (int)(1234348480 + 806604773))));
    }

    @Override
    public /* synthetic */ void onDisable() {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (a\u0430\u0455se.$_h84s4mq1ngan17lhn((long)a\u0430\u0455se.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)a\u0430\u0455se.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        if (0 != 0) {
        }
        this.ae\u04bb\u0445();
        if (this.a\u0445iep\u0445p != -1 && a\u0430\u0455se.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 != null) {
            a\u0430\u0455se.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7545 = this.a\u0445iep\u0445p;
            this.a\u0445iep\u0445p = -1;
        }
        super.onDisable();
    }

    @\u0445\u0458\u0458h\u0445\u0430a
    public void \u04bbo\u0435(hoi\u0435h\u0440 hoi\u0435h\u04402) {
        int n;
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (a\u0430\u0455se.$_h84s4mr1ngan17lho((long)a\u0430\u0455se.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)a\u0430\u0455se.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        if (0 != 0) {
        }
        boolean bl2 = this.c\u0435a\u0440x\u0456 = \u043ei\u0456s\u0440xe == null || a\u0430\u0455se.a_bsm6("\u0440\u0430hj", \u0440\u0430hj(\u0458\u0458\u0458o\u0430\u0456.e\u0445\u0440\u0440a double \u0441\u0445o.jax\u0458\u0435\u0458 ), (e\u0445\u0440\u0440a)\u043ei\u0456s\u0440xe, (double)180.0, (jax\u0458\u0435\u0458)jax\u0458\u0435\u0458.hp\u043e\u0445p) != false;
        if (!this.c\u0435a\u0440x\u0456) {
            return;
        }
        if (!this.\u0440\u0435\u0455x\u0435xe()) {
            return;
        }
        if (this.\u0440\u0445ee\u0430\u0455) {
            this.setEnabled(false);
            return;
        }
        boolean bl3 = this.\u043e\u0435x\u0440(3);
        if (bl3 && !this.o\u0455h\u0440) {
            this.o\u0455h\u0440 = true;
            if (!this.NcfSumNuCg && this.\u0456i\u0430\u04bb == 0 && (n = this.ih\u043eh()) != -1) {
                this.a\u0445iep\u0445p = a\u0430\u0455se.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7545;
                a\u0430\u0455se.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7545 = n;
                this.\u0456i\u0430\u04bb = 1;
                int n2 = this.\u0455a\u0456sep\u0455 + 1;
                byte[] byArray = new byte[-958712319 + 958712347];
                byArray[0] = -444372248 + 444372328;
                byArray[1] = -139778147 + 139778045;
                byArray[2] = -1876920793 + 1876920844;
                byArray[3] = -1192557665 + 1192557673;
                byArray[4] = -1127342429 + 1127342421;
                byArray[5] = -1694937846 + 1694937861;
                byArray[-1980905124 + 1980905130] = -901227401 + 901227277;
                byArray[-1927041554 + 1927041561] = -1408233630 + 1408233559;
                byArray[-1050393155 + 1050393163] = -805938871 + 805938798;
                byArray[-1563610139 + 1563610148] = -1371054743 + 1371054866;
                byArray[-1110832358 + 1110832368] = -1495324584 + 1495324568;
                byArray[-1651639129 + 1651639140] = -589481792 + 589481912;
                byArray[-829666437 + 829666449] = -561881227 + 561881216;
                byArray[-5755727 + 5755740] = -86909738 + 86909761;
                byArray[-1862851509 + 1862851523] = -993539574 + 993539685;
                byArray[-1392361166 + 1392361181] = -1683603812 + 1683603788;
                byArray[-539363571 + 539363587] = -1300975736 + 1300975699;
                byArray[-582578514 + 582578531] = -1147790073 + 1147790192;
                byArray[-1817913488 + 1817913506] = -656180040 + 656180162;
                byArray[-830323707 + 830323726] = -1484018658 + 1484018609;
                byArray[-704707384 + 704707404] = -688032009 + 688032091;
                byArray[-220473381 + 220473402] = -1474440284 + 1474440206;
                byArray[-1071659808 + 1071659830] = -889965430 + 889965530;
                byArray[-472832423 + 472832446] = -2008368428 + 2008368439;
                byArray[-290302412 + 290302436] = -1280033468 + 1280033550;
                byArray[-1100225189 + 1100225214] = -13672145 + 13672029;
                byArray[-1507651706 + 1507651732] = -496745763 + 496745726;
                byArray[-631278354 + 631278381] = -526790745 + 526790689;
                a\u0430\u0455se.a_bsm3("e\u04bb\u0445\u0435\u0441\u0445", e\u04bb\u0445\u0435\u0441\u0445(java.lang.String ), (String)((String)((Object)a\u0430\u0455se.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(899929626 + 2109791562), (int)(-1102901824 + 648271654))) + n2));
            }
        } else if (!bl3) {
            this.o\u0455h\u0440 = false;
        }
        if ((n = this.\u043e\u0435x\u0440(4)) != 0 && !this.\u0455\u0456e\u0440) {
            this.\u0455\u0456e\u0440 = true;
            if (this.\u0458\u0430p && this.ccs < this.\u0456\u0456\u0458\u0455j) {
                int n3 = this.\u0456\u0456\u0458\u0455j;
                int n4 = this.ccs + 1;
                byte[] byArray = new byte[-1536331222 + 1536331235];
                byArray[0] = -706854006 + 706854062;
                byArray[1] = -982394468 + 982394489;
                byArray[2] = -1061882337 + 1061882335;
                byArray[3] = -1692478719 + 1692478807;
                byArray[4] = -1615810207 + 1615810274;
                byArray[5] = -1375633208 + 1375633227;
                byArray[-1933133782 + 1933133788] = -2110411310 + 2110411257;
                byArray[-1848982176 + 1848982183] = -673474285 + 673474189;
                byArray[-361026504 + 361026512] = -644334747 + 644334639;
                byArray[-1229230168 + 1229230177] = -1423751719 + 1423751738;
                byArray[-1741950499 + 1741950509] = -365433820 + 365433833;
                byArray[-532682101 + 532682112] = -1943124381 + 1943124387;
                byArray[-1246698748 + 1246698760] = -16785417 + 16785379;
                a\u0430\u0455se.a_bsm3("e\u04bb\u0445\u0435\u0441\u0445", e\u04bb\u0445\u0435\u0441\u0445(java.lang.String ), (String)((String)((Object)a\u0430\u0455se.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(1984287290 + 1344861236), (int)(838199666 + 2008268855))) + n4 + (String)((Object)a\u0430\u0455se.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-13692845 + 13692953}, (int)(-1683288658 + 142317175), (int)(-918982087 + 490828864))) + n3));
                this.acc(this.ccs++);
                if (this.ccs >= this.\u0456\u0456\u0458\u0455j) {
                    byte[] byArray2 = new byte[-1057399506 + 1057399541];
                    byArray2[0] = -436028007 + 436028126;
                    byArray2[1] = -1436445094 + 1436445212;
                    byArray2[2] = -115945259 + 115945192;
                    byArray2[3] = -2141665818 + 2141665899;
                    byArray2[4] = -509173475 + 509173470;
                    byArray2[5] = -934204219 + 934204287;
                    byArray2[-1402687486 + 1402687492] = -1486570274 + 1486570345;
                    byArray2[-1918861316 + 1918861323] = -1486822321 + 1486822204;
                    byArray2[-420386351 + 420386359] = -1215717451 + 1215717448;
                    byArray2[-1524686136 + 1524686145] = -1112016138 + 1112016185;
                    byArray2[-1971315759 + 1971315769] = -608281921 + 608281808;
                    byArray2[-218658528 + 218658539] = -781735798 + 781735839;
                    byArray2[-564876611 + 564876623] = 1;
                    byArray2[-1006614205 + 1006614218] = -454094231 + 454094276;
                    byArray2[-1724618600 + 1724618614] = -310699694 + 310699741;
                    byArray2[-222178580 + 222178595] = -1046594447 + 1046594491;
                    byArray2[-1719776460 + 1719776476] = -1082190127 + 1082190098;
                    byArray2[-1917155241 + 1917155258] = -1399621827 + 1399621872;
                    byArray2[-154337488 + 154337506] = -1640859750 + 1640859841;
                    byArray2[-1208170932 + 1208170951] = -1365808971 + 1365808860;
                    byArray2[-781674224 + 781674244] = -1885463561 + 1885463632;
                    byArray2[-979345618 + 979345639] = -1611930458 + 1611930509;
                    byArray2[-181240876 + 181240898] = -1096564229 + 1096564169;
                    byArray2[-485286577 + 485286600] = -168515230 + 168515342;
                    byArray2[-150853063 + 150853087] = -2146434011 + 2146434062;
                    byArray2[-224963412 + 224963437] = -255003828 + 255003877;
                    byArray2[-1686100379 + 1686100405] = -473779571 + 473779497;
                    byArray2[-553248259 + 553248286] = -1312902026 + 1312902069;
                    byArray2[-13277719 + 13277747] = -821517156 + 821517249;
                    byArray2[-554822355 + 554822384] = -650103953 + 650104068;
                    byArray2[-1230487511 + 1230487541] = -517679560 + 517679529;
                    byArray2[-536787661 + 536787692] = 4;
                    byArray2[-1396471 + 1396503] = -1874322234 + 1874322174;
                    byArray2[-1774731634 + 1774731667] = -2016187591 + 2016187615;
                    byArray2[-978807512 + 978807546] = -17331539 + 17331605;
                    a\u0430\u0455se.a_bsm3("e\u04bb\u0445\u0435\u0441\u0445", e\u04bb\u0445\u0435\u0441\u0445(java.lang.String ), (String)((Object)a\u0430\u0455se.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray2, (int)(-736584669 + 1508741602), (int)(-1664229762 + 242207934))));
                    this.\u0458\u0430p = false;
                    this.setEnabled(false);
                }
            } else if (!this.\u0458\u0430p) {
                byte[] byArray = new byte[-1090291843 + 1090291868];
                byArray[0] = -1214726816 + 1214726841;
                byArray[1] = -252699190 + 252699293;
                byArray[2] = -1813278702 + 1813278643;
                byArray[3] = -371045038 + 371045142;
                byArray[4] = -663034366 + 663034433;
                byArray[5] = -831813791 + 831813759;
                byArray[-528473794 + 528473800] = -686960410 + 686960396;
                byArray[-280552590 + 280552597] = -198285053 + 198285099;
                byArray[-982067751 + 982067759] = -1470813376 + 1470813484;
                byArray[-277739514 + 277739523] = -927970398 + 927970428;
                byArray[-384800545 + 384800555] = -1911640798 + 1911640788;
                byArray[-1130113460 + 1130113471] = -1078021805 + 1078021883;
                byArray[-673405587 + 673405599] = -103781021 + 103781072;
                byArray[-866497645 + 866497658] = -1386510807 + 1386510698;
                byArray[-478884387 + 478884401] = -847622220 + 847622209;
                byArray[-794734222 + 794734237] = -123751741 + 123751805;
                byArray[-1077028363 + 1077028379] = -387511738 + 387511705;
                byArray[-1048799761 + 1048799778] = -1700894560 + 1700894632;
                byArray[-972250492 + 972250510] = -5016106 + 5016002;
                byArray[-538884092 + 538884111] = -1046293919 + 1046294035;
                byArray[-661557166 + 661557186] = -1285328196 + 1285328222;
                byArray[-968272251 + 968272272] = -1704166690 + 1704166571;
                byArray[-1106131849 + 1106131871] = -895388279 + 895388201;
                byArray[-530974874 + 530974897] = -936915092 + 936915026;
                byArray[-1469149161 + 1469149185] = -1068906138 + 1068906107;
                a\u0430\u0455se.a_bsm3("e\u04bb\u0445\u0435\u0441\u0445", e\u04bb\u0445\u0435\u0441\u0445(java.lang.String ), (String)((Object)a\u0430\u0455se.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-2123748474 + 215114421), (int)(1654550465 + 945367862))));
                this.setEnabled(false);
            } else {
                byte[] byArray = new byte[-723357333 + 723357356];
                byArray[0] = -431730459 + 431730410;
                byArray[1] = -17964610 + 17964565;
                byArray[2] = -1212992454 + 1212992575;
                byArray[3] = -1853428593 + 1853428684;
                byArray[4] = -792749978 + 792750093;
                byArray[5] = -622048866 + 622048792;
                byArray[-1844085660 + 1844085666] = -1721175188 + 1721175078;
                byArray[-1542601300 + 1542601307] = -273601957 + 273602059;
                byArray[-536972939 + 536972947] = -69960587 + 69960673;
                byArray[-1508903464 + 1508903473] = -186232285 + 186232350;
                byArray[-1480717325 + 1480717335] = -1836832779 + 1836832747;
                byArray[-307867111 + 307867122] = -1208515427 + 1208515547;
                byArray[-1912552683 + 1912552695] = -933393529 + 933393418;
                byArray[-958190651 + 958190664] = -1373823007 + 1373823043;
                byArray[-1392081090 + 1392081104] = -659302255 + 659302271;
                byArray[-1884998778 + 1884998793] = -1180319005 + 1180319111;
                byArray[-1991262776 + 1991262792] = -1391319665 + 1391319640;
                byArray[-1717515045 + 1717515062] = -2061891194 + 2061891168;
                byArray[-1946981449 + 1946981467] = -1700007168 + 1700007251;
                byArray[-1901962378 + 1901962397] = -1683884303 + 1683884299;
                byArray[-736715455 + 736715475] = -198848217 + 198848106;
                byArray[-1311553417 + 1311553438] = -817504253 + 817504229;
                byArray[-1112541120 + 1112541142] = -2116971451 + 2116971520;
                a\u0430\u0455se.a_bsm3("e\u04bb\u0445\u0435\u0441\u0445", e\u04bb\u0445\u0435\u0441\u0445(java.lang.String ), (String)((Object)a\u0430\u0455se.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(296870974 + 1964417674), (int)(1483594546 + 1415762334))));
            }
        } else if (n == 0) {
            this.\u0455\u0456e\u0440 = false;
        }
    }

    @\u0445\u0458\u0458h\u0445\u0430a
    public void aj\u043e\u0441\u0455\u0445(s\u0456a\u0458 s\u0456a\u04582) {
        Object object;
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (true | false) {
        }
        if (a\u0430\u0455se.$_h84s4ms1ngan17lhp((long)a\u0430\u0455se.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)a\u0430\u0455se.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        if (0 != 0) {
        }
        if (!this.\u0440\u0435\u0455x\u0435xe()) {
            return;
        }
        if (this.\u0458\u0430p) {
            byte[] byArray = new byte[-1292363409 + 1292363473];
            byArray[0] = -177361764 + 177361710;
            byArray[1] = -725741893 + 725741992;
            byArray[2] = -87496584 + 87496560;
            byArray[3] = -491731484 + 491731589;
            byArray[4] = -1771235282 + 1771235202;
            byArray[5] = -1796559983 + 1796559946;
            byArray[-1471482300 + 1471482306] = -662293624 + 662293750;
            byArray[-2050427616 + 2050427623] = 1;
            byArray[-1386748080 + 1386748088] = -1192406777 + 1192406800;
            byArray[-477864936 + 477864945] = -1531061326 + 1531061216;
            byArray[-1156803707 + 1156803717] = -1171255218 + 1171255176;
            byArray[-1661398231 + 1661398242] = -713820239 + 713820163;
            byArray[-658958931 + 658958943] = -637601375 + 637601447;
            byArray[-875537545 + 875537558] = -574600603 + 574600597;
            byArray[-1437990035 + 1437990049] = -1829283595 + 1829283679;
            byArray[-1088600332 + 1088600347] = -1297992843 + 1297992896;
            byArray[-1158125302 + 1158125318] = -865597597 + 865597668;
            byArray[-1161439155 + 1161439172] = -995828395 + 995828339;
            byArray[-1646434663 + 1646434681] = -1563776454 + 1563776532;
            byArray[-512604470 + 512604489] = -1503618742 + 1503618774;
            byArray[-990137844 + 990137864] = -1970231693 + 1970231681;
            byArray[-473439734 + 473439755] = -934115674 + 934115689;
            byArray[-1400083424 + 1400083446] = -158359703 + 158359580;
            byArray[-193088605 + 193088628] = -259957989 + 259957944;
            byArray[-117074391 + 117074415] = -1400851554 + 1400851583;
            byArray[-555950948 + 555950973] = 0;
            byArray[-1756601251 + 1756601277] = -593013041 + 593013078;
            byArray[-1572664507 + 1572664534] = -878670608 + 878670665;
            byArray[-2119283382 + 2119283410] = -230548565 + 230548667;
            byArray[-1186612558 + 1186612587] = 5;
            byArray[-1496755665 + 1496755695] = -963669482 + 963669585;
            byArray[-1858435913 + 1858435944] = -469353034 + 469352910;
            byArray[-1112187445 + 1112187477] = -1461919982 + 1461919946;
            byArray[-1687098361 + 1687098394] = -615493251 + 615493277;
            byArray[-1819591445 + 1819591479] = -1185674005 + 1185673952;
            byArray[-1082052778 + 1082052813] = -1019137482 + 1019137525;
            byArray[-190946339 + 190946375] = -172052150 + 172052160;
            byArray[-2052304267 + 2052304304] = -1369716793 + 1369716853;
            byArray[-1613969225 + 1613969263] = -369379735 + 369379647;
            byArray[-1903664401 + 1903664440] = -660831552 + 660831468;
            byArray[-1396003850 + 1396003890] = -903234165 + 903234191;
            byArray[-785650472 + 785650513] = -53268545 + 53268639;
            byArray[-473592582 + 473592624] = -757438709 + 757438622;
            byArray[-1311691139 + 1311691182] = -1594473138 + 1594473016;
            byArray[-1617352604 + 1617352648] = -1194124505 + 1194124556;
            byArray[-691922708 + 691922753] = -301547763 + 301547853;
            byArray[-404668842 + 404668888] = -1075699958 + 1075699910;
            byArray[-90109080 + 90109127] = -1093356574 + 1093356684;
            byArray[-1453277551 + 1453277599] = -1609082707 + 1609082692;
            byArray[-1179445322 + 1179445371] = -572225726 + 572225665;
            byArray[-983377810 + 983377860] = -929149673 + 929149787;
            byArray[-1030783671 + 1030783722] = -616976553 + 616976644;
            byArray[-305902396 + 305902448] = -336891728 + 336891839;
            byArray[-1100682929 + 1100682982] = -632846217 + 632846146;
            byArray[-82100320 + 82100374] = -1807144220 + 1807144217;
            byArray[-188749405 + 188749460] = -266722896 + 266722918;
            byArray[-891705370 + 891705426] = -1838067661 + 1838067649;
            byArray[-1287200616 + 1287200673] = -1857022226 + 1857022179;
            byArray[-399877429 + 399877487] = -668583792 + 668583705;
            byArray[-1709791318 + 1709791377] = -1407438849 + 1407438944;
            byArray[-712339143 + 712339203] = -1291124758 + 1291124869;
            byArray[-433066235 + 433066296] = -677863931 + 677864001;
            byArray[-2036226807 + 2036226869] = -1163081701 + 1163081738;
            byArray[-409450498 + 409450561] = -794868305 + 794868431;
            object = a\u0430\u0455se.a_bsm9("format", format(java.lang.String java.lang.Object[] ), (String)((Object)a\u0430\u0455se.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(922155872 + 545872927), (int)(-1765134817 + 1071163522))), (Object[])new Object[]{a\u0430\u0455se.a_bsm1("valueOf", valueOf(int ), (int)this.\u0456h\u0430cs\u0458\u0458.size()), a\u0430\u0455se.a_bsm8("valueOf", valueOf(float ), (float)((float)(a\u0430\u0455se.a_bsm7("currentTimeMillis", currentTimeMillis()) - this.\u0435\u0458\u043eo) / 1000.0f)), a\u0430\u0455se.a_bsm1("valueOf", valueOf(int ), (int)this.ccs), a\u0430\u0455se.a_bsm1("valueOf", valueOf(int ), (int)this.\u0456\u0456\u0458\u0455j)});
        } else if (this.NcfSumNuCg) {
            int n = this.\u0455a\u0456sep\u0455;
            byte[] byArray = new byte[-1991071704 + 1991071723];
            byArray[0] = -730220741 + 730220803;
            byArray[1] = -1010878750 + 1010878670;
            byArray[2] = -328359417 + 328359289;
            byArray[3] = -452848708 + 452848596;
            byArray[4] = -395248932 + 395248884;
            byArray[5] = -1468187813 + 1468187750;
            byArray[-933013666 + 933013672] = -1882849827 + 1882849774;
            byArray[-705651411 + 705651418] = -1286059408 + 1286059363;
            byArray[-637613316 + 637613324] = -729102381 + 729102478;
            byArray[-17706165 + 17706174] = -604614410 + 604614394;
            byArray[-872739223 + 872739233] = -360598392 + 360598435;
            byArray[-853871797 + 853871808] = -672517773 + 672517789;
            byArray[-661106100 + 661106112] = -1818591984 + 1818592003;
            byArray[-1798517239 + 1798517252] = -746499936 + 746499998;
            byArray[-1880809732 + 1880809746] = -1416786986 + 1416786913;
            byArray[-6625836 + 6625851] = -794244764 + 794244843;
            byArray[-1720891680 + 1720891696] = -1222059776 + 1222059867;
            byArray[-255535544 + 255535561] = -818878838 + 818878711;
            byArray[-1873553095 + 1873553113] = -301848751 + 301848624;
            object = (String)((Object)a\u0430\u0455se.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(221585158 + 1852398744), (int)(-616805184 + 222206906))) + n;
        } else {
            byte[] byArray = new byte[-2043954315 + 2043954383];
            byArray[0] = -1387239794 + 1387239823;
            byArray[1] = -1736767906 + 1736767865;
            byArray[2] = -457520929 + 457520846;
            byArray[3] = -1867059726 + 1867059790;
            byArray[4] = -161831087 + 161831178;
            byArray[5] = 1;
            byArray[-1352258092 + 1352258098] = -1561777176 + 1561777082;
            byArray[-345053987 + 345053994] = -1333382491 + 1333382569;
            byArray[-1234123296 + 1234123304] = -718115011 + 718114892;
            byArray[-809977723 + 809977732] = -814351860 + 814351899;
            byArray[-849182112 + 849182122] = -1339163999 + 1339163935;
            byArray[-2075241757 + 2075241768] = -674981881 + 674981896;
            byArray[-135742411 + 135742423] = -1028272575 + 1028272701;
            byArray[-1710087289 + 1710087302] = -1249448510 + 1249448578;
            byArray[-1347872032 + 1347872046] = -119493507 + 119493597;
            byArray[-1802158908 + 1802158923] = -1982313795 + 1982313881;
            byArray[-22438048 + 22438064] = -447545694 + 447545677;
            byArray[-680517259 + 680517276] = -384700785 + 384700685;
            byArray[-1291401634 + 1291401652] = -967841646 + 967841771;
            byArray[-980621020 + 980621039] = -1864461274 + 1864461342;
            byArray[-536487987 + 536488007] = -531764326 + 531764301;
            byArray[-1190805361 + 1190805382] = -1997043816 + 0x77087880;
            byArray[-1550001703 + 1550001725] = -1947573031 + 1947573121;
            byArray[-341496689 + 341496712] = -35402232 + 35402347;
            byArray[-739574465 + 739574489] = -1228084738 + 1228084846;
            byArray[-372910756 + 372910781] = -747991003 + 747990990;
            byArray[-852248314 + 852248340] = -1841324493 + 1841324377;
            byArray[-1180303306 + 1180303333] = -76476583 + 76476579;
            byArray[-1407439985 + 1407440013] = -1730982399 + 1730982276;
            byArray[-2069938841 + 2069938870] = -1433330286 + 1433330270;
            byArray[-594692336 + 594692366] = -1909060235 + 1909060336;
            byArray[-1334497106 + 1334497137] = -1732765817 + 1732765823;
            byArray[-317051031 + 317051063] = -682557487 + 682557508;
            byArray[-1518945791 + 1518945824] = -227597358 + 227597383;
            byArray[-1603449000 + 1603449034] = -1196570318 + 1196570310;
            byArray[-790944587 + 790944622] = -34837984 + 34837895;
            byArray[-274953454 + 274953490] = -1074923613 + 1074923653;
            byArray[-1510382845 + 1510382882] = -761671390 + 761671315;
            byArray[-1134447050 + 1134447088] = -1431916208 + 1431916185;
            byArray[-1223574547 + 1223574586] = -583488941 + 583488854;
            byArray[-891399387 + 891399427] = -283590089 + 283590019;
            byArray[-4017783 + 4017824] = -1760385957 + 1760385919;
            byArray[-288570953 + 288570995] = -1914633729 + 1914633646;
            byArray[-699906656 + 699906699] = -761321310 + 761321433;
            byArray[-312351919 + 312351963] = -792791694 + 792791575;
            byArray[-508484936 + 508484981] = -662096542 + 662096569;
            byArray[-1493882275 + 1493882321] = -1714460353 + 1714460424;
            byArray[-2069393541 + 2069393588] = -1074485249 + 1074485136;
            byArray[-1154585827 + 1154585875] = -1913217918 + 1913217791;
            byArray[-962301319 + 962301368] = -1121797437 + 1121797536;
            byArray[-816307229 + 816307279] = -661550040 + 661549998;
            byArray[-289338285 + 289338336] = -1996200365 + 1996200396;
            byArray[-974499162 + 974499214] = -2017484963 + 2017485084;
            byArray[-935301572 + 935301625] = -2017049582 + 2017049480;
            byArray[-473084425 + 473084479] = -812773541 + 812773609;
            byArray[-608955676 + 608955731] = -422819625 + 422819567;
            byArray[-1131055268 + 1131055324] = -1125901105 + 1125901230;
            byArray[-2135990345 + 2135990402] = -1;
            byArray[-859000249 + 859000307] = -1435501248 + 1435501371;
            byArray[-484243016 + 484243075] = -374065974 + 374066094;
            byArray[-677358194 + 677358254] = -2046410726 + 2046410611;
            byArray[-1830894173 + 1830894234] = -1832972552 + 1832972439;
            byArray[-2925722 + 2925784] = -1314858353 + 1314858345;
            byArray[-1530660041 + 1530660104] = -1795445785 + 1795445802;
            byArray[-52145170 + 52145234] = -1699967704 + 1699967734;
            byArray[-275896419 + 275896484] = -535601199 + 535601080;
            byArray[-1487899292 + 1487899358] = -1932337234 + 1932337334;
            byArray[-1363397573 + 1363397640] = -241900570 + 241900505;
            object = a\u0430\u0455se.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(852223470 + 34950898), (int)(2008239813 + 1619167600));
        }
        String string = object;
        int n = \u0430\u0445j\u0445s\u0456\u04bb.method_22683().method_4486();
        int n2 = \u0430\u0445j\u0445s\u0456\u04bb.method_22683().method_4502();
        s\u0456a\u04582.i\u0458\u0456s().method_25303(a\u0430\u0455se.\u0430\u0445j\u0445s\u0456\u04bb.field_1772, string, (int)((float)n / 2.0f - (float)a\u0430\u0455se.\u0430\u0445j\u0445s\u0456\u04bb.field_1772.method_1727(string) / 2.0f), (int)((float)n2 / 2.0f + 20.0f), -1);
    }

    @\u0445\u0458\u0458h\u0445\u0430a
    public void o\u043eec\u04bb\u0445h(\u04bbj\u0441x\u0440 \u04bbj\u0441x\u04402) {
        class_2743 class_27432;
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (a\u0430\u0455se.$_h84s4mt1ngan17lhq((long)a\u0430\u0455se.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)a\u0430\u0455se.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        if (0 != 0) {
        }
        if (!this.\u0440\u0435\u0455x\u0435xe() || a\u0430\u0455se.\u0430\u0445j\u0445s\u0456\u04bb.field_1687 == null) {
            if (this.\u0458\u0430p) {
                \u0430\u0445j\u0445s\u0456\u04bb.execute(() -> {
                    boolean bl = false;
                    if (bl) {
                        __js_dispatch_state = 0;
                    }
                    if ((3 * 3 + 3) % 2 == 0) {
                    }
                    if (((long)a\u0430\u0455se.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)a\u0430\u0455se.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
                        throw null;
                    }
                    this.is\u0445\u0441();
                    this.\u0458\u0430p = false;
                });
            }
            return;
        }
        if (\u04bbj\u0441x\u04402.p\u0440\u04bb() != i\u0456\u0445\u0430\u0441p.h\u0430\u043e) {
            return;
        }
        class_2596<?> class_25962 = \u04bbj\u0441x\u04402.ciao\u0455\u0455();
        if (this.\u0458\u0430p) {
            if (class_25962 instanceof class_2708) {
                this.\u0440\u0445ee\u0430\u0455 = true;
            } else {
                class_2743 class_27433;
                if (class_25962 instanceof class_2743 && (class_27433 = (class_2743)class_25962).method_11818() == a\u0430\u0455se.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_5628()) {
                    this.e\u0440\u0441.add((Integer)((Object)a\u0430\u0455se.a_bsm1("valueOf", valueOf(int ), (int)this.\u0456h\u0430cs\u0458\u0458.size())));
                    int n = ++this.\u0456\u0456\u0458\u0455j;
                    \u0430\u0445j\u0445s\u0456\u04bb.execute(() -> {
                        boolean bl = false;
                        if (bl) {
                            __js_dispatch_state = 0;
                        }
                        if (2 * 2 * 2 >= 0) {
                        }
                        if (((long)a\u0430\u0455se.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)a\u0430\u0455se.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
                            throw null;
                        }
                        int n2 = n;
                        byte[] byArray = new byte[-1408007473 + 1408007482];
                        byArray[0] = -348850181 + 348850087;
                        byArray[1] = -1253593043 + 1253592996;
                        byArray[2] = -955613471 + 955613430;
                        byArray[3] = -1144867673 + 1144867589;
                        byArray[4] = -2115357525 + 2115357507;
                        byArray[5] = -264563728 + 264563620;
                        byArray[-355186991 + 355186997] = -1234110195 + 1234110294;
                        byArray[-614887185 + 614887192] = -600274709 + 600274695;
                        byArray[-1408028729 + 1408028737] = 3;
                        a\u0430\u0455se.a_bsm3("e\u04bb\u0445\u0435\u0441\u0445", e\u04bb\u0445\u0435\u0441\u0445(java.lang.String ), (String)((String)((Object)a\u0430\u0455se.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1193931399 + 1193931285, -466717408 + 466717343, -1063960305 + 1063960279}, (int)(-827964613 + 140481482), (int)(-962567143 + 527729147))) + n2 + (String)((Object)a\u0430\u0455se.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(1703200881 + 1830685233), (int)(1933099405 + 1654002753)))));
                    });
                }
                this.\u0456h\u0430cs\u0458\u0458.add(class_25962);
            }
            \u04bbj\u0441x\u04402.setCancelled(true);
        } else if (class_25962 instanceof class_2743 && (class_27432 = (class_2743)class_25962).method_11818() == a\u0430\u0455se.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_5628() && this.\u0455a\u0456sep\u0455 > 0) {
            this.e\u0440\u0441.add((Integer)((Object)a\u0430\u0455se.a_bsm1("valueOf", valueOf(int ), (int)this.\u0456h\u0430cs\u0458\u0458.size())));
            int n = ++this.\u0456\u0456\u0458\u0455j;
            \u0430\u0445j\u0445s\u0456\u04bb.execute(() -> {
                boolean bl = false;
                if (bl) {
                    __js_dispatch_state = 0;
                }
                if (true | false) {
                }
                if (((long)a\u0430\u0455se.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)a\u0430\u0455se.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
                    throw null;
                }
                int n2 = n;
                byte[] byArray = new byte[-1626654977 + 1626654990];
                byArray[0] = -707850148 + 707850110;
                byArray[1] = -1777754989 + 1777754957;
                byArray[2] = -78005839 + 78005793;
                byArray[3] = -2042834298 + 2042834376;
                byArray[4] = -993595342 + 993595383;
                byArray[5] = -1063925983 + 1063926037;
                byArray[-1637966904 + 1637966910] = -736541813 + 736541762;
                byArray[-1860655146 + 1860655153] = -1447622313 + 1447622348;
                byArray[-989312050 + 989312058] = -2078075683 + 2078075679;
                byArray[-170687939 + 170687948] = -2073259585 + 2073259467;
                byArray[-873840007 + 873840017] = -1008717950 + 1008717826;
                byArray[-258390355 + 258390366] = -619287363 + 619287268;
                byArray[-1363952098 + 1363952110] = -8248766 + 0x7DDD4D;
                byte[] byArray2 = new byte[-1437986611 + 1437986641];
                byArray2[0] = 2;
                byArray2[1] = -565213646 + 565213701;
                byArray2[2] = -1924337882 + 1924337843;
                byArray2[3] = -1585944125 + 1585944238;
                byArray2[4] = 0;
                byArray2[5] = -1640876691 + 1640876763;
                byArray2[-93386187 + 93386193] = -242645165 + 242645228;
                byArray2[-1698997033 + 1698997040] = -231030320 + 231030329;
                byArray2[-1870756633 + 1870756641] = -1220601146 + 1220601178;
                byArray2[-1043891754 + 1043891763] = -745361846 + 745361835;
                byArray2[-890749282 + 890749292] = -2094857709 + 2094857688;
                byArray2[-1776739064 + 1776739075] = -1760902334 + 1760902320;
                byArray2[-1727095173 + 1727095185] = -847986056 + 847985971;
                byArray2[-338228899 + 338228912] = -1534662374 + 1534662480;
                byArray2[-1626721873 + 1626721887] = -590712065 + 590711937;
                byArray2[-1806801237 + 1806801252] = -956175865 + 956175877;
                byArray2[-2118652704 + 2118652720] = -1115355668 + 1115355676;
                byArray2[-1181139650 + 1181139667] = -799431293 + 799431239;
                byArray2[-1407883934 + 1407883952] = -1364567502 + 1364567610;
                byArray2[-85042108 + 85042127] = -1044185510 + 1044185523;
                byArray2[-867786663 + 867786683] = -1994694327 + 1994694442;
                byArray2[-1319470822 + 1319470843] = -526106020 + 526106071;
                byArray2[-738396750 + 738396772] = -512034638 + 512034605;
                byArray2[-703515265 + 703515288] = 5;
                byArray2[-1458953860 + 1458953884] = -1020238707 + 1020238611;
                byArray2[-1677819350 + 1677819375] = -788424131 + 788424059;
                byArray2[-1101617463 + 1101617489] = -1391158616 + 1391158726;
                byArray2[-836003718 + 836003745] = -222005613 + 222005535;
                byArray2[-108328500 + 108328528] = -1681342385 + 1681342328;
                byArray2[-711543703 + 711543732] = -919343770 + 919343831;
                a\u0430\u0455se.a_bsm3("e\u04bb\u0445\u0435\u0441\u0445", e\u04bb\u0445\u0435\u0441\u0445(java.lang.String ), (String)((String)((Object)a\u0430\u0455se.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(131892197 + 1511120392), (int)(1954925371 + 1035003643))) + n2 + (String)((Object)a\u0430\u0455se.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray2, (int)(-1268554993 + 503017295), (int)(172922715 + 1823137694)))));
            });
            this.\u0456h\u0430cs\u0458\u0458.add(class_25962);
            this.\u0458\u0430p = true;
            this.\u0435\u0458\u043eo = (long)a\u0430\u0455se.a_bsm7("currentTimeMillis", currentTimeMillis());
            \u0430\u0445j\u0445s\u0456\u04bb.execute(() -> {
                boolean bl = false;
                if (bl) {
                    __js_dispatch_state = 0;
                }
                if (true | false) {
                }
                if (((long)a\u0430\u0455se.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)a\u0430\u0455se.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
                    throw null;
                }
                byte[] byArray = new byte[-2093451096 + 2093451156];
                byArray[0] = -1811338639 + 1811338573;
                byArray[1] = 0;
                byArray[2] = -2055052910 + 2055052866;
                byArray[3] = -411385814 + 411385888;
                byArray[4] = -449070762 + 449070836;
                byArray[5] = -1641636427 + 1641636306;
                byArray[-821674649 + 821674655] = -1064873067 + 1064873173;
                byArray[-1111540069 + 1111540076] = -1405787732 + 1405787797;
                byArray[-1342596332 + 1342596340] = -806137705 + 806137772;
                byArray[-64834762 + 64834771] = -746060656 + 746060774;
                byArray[-693228409 + 693228419] = 0;
                byArray[-1206465860 + 1206465871] = -772097864 + 772097879;
                byArray[-173535529 + 173535541] = -1433423495 + 1433423555;
                byArray[-1691177620 + 1691177633] = -907448080 + 907448070;
                byArray[-1655614300 + 1655614314] = -410460516 + 410460597;
                byArray[-436882328 + 436882343] = -1370599257 + 1370599273;
                byArray[-1594427089 + 1594427105] = -1785179469 + 1785179477;
                byArray[-1534582529 + 1534582546] = -198444947 + 198444875;
                byArray[-1646456563 + 1646456581] = -891451772 + 891451692;
                byArray[-560824410 + 560824429] = -183453935 + 183453847;
                byArray[-1562762612 + 1562762632] = -1539930892 + 1539930882;
                byArray[-1310509770 + 1310509791] = -2043008133 + 2043008095;
                byArray[-2113786662 + 2113786684] = -1098508169 + 1098508209;
                byArray[-434378375 + 434378398] = -42570929 + 42571001;
                byArray[-1724826745 + 1724826769] = -842596239 + 842596117;
                byArray[-1584708312 + 1584708337] = 0;
                byArray[-984815658 + 984815684] = -1257902930 + 1257903020;
                byArray[-1173644549 + 1173644576] = -1184310984 + 1184311007;
                byArray[-1348520940 + 1348520968] = -2000900742 + 2000900640;
                byArray[-1101904365 + 1101904394] = -42965740 + 42965625;
                byArray[-1407868510 + 1407868540] = -1109205996 + 1109206091;
                byArray[-527582086 + 527582117] = -1648945896 + 1648945857;
                byArray[-1339188417 + 1339188449] = -1922744381 + 1922744400;
                byArray[-901421485 + 901421518] = -1662474768 + 1662474806;
                byArray[-2122353193 + 2122353227] = -1032856275 + 1032856236;
                byArray[-2002479068 + 2002479103] = -1169961076 + 1169960957;
                byArray[-709929051 + 709929087] = -682799711 + 682799735;
                byArray[-762279389 + 762279426] = -1525897043 + 1525897133;
                byArray[-2108116178 + 2108116216] = 0;
                byArray[-1823321874 + 1823321913] = -1706314253 + 1706314176;
                byArray[-64942991 + 64943031] = -1006783556 + 1006783492;
                byArray[-1152999998 + 1153000039] = -349557868 + 349557816;
                byArray[-347696199 + 347696241] = -1250173930 + 1250173963;
                byArray[-167358030 + 167358073] = -708492175 + 708492171;
                byArray[-838149521 + 838149565] = -946016939 + 946017008;
                byArray[-1247294844 + 1247294889] = -1227486317 + 1227486259;
                byArray[-49915180 + 49915226] = -1108402109 + 1108402064;
                byArray[-1599599130 + 1599599177] = -448494343 + 448494420;
                byArray[-1017156503 + 1017156551] = -1526626541 + 1526626664;
                byArray[-2099493520 + 2099493569] = -940647443 + 940647467;
                byArray[-621912477 + 621912527] = -699314367 + 699314259;
                byArray[-2054605553 + 2054605604] = -435259990 + 435260067;
                byArray[-155384962 + 155385014] = -2055038548 + 2055038576;
                byArray[-513150522 + 513150575] = -288251242 + 288251142;
                byArray[-852794056 + 852794110] = -1798618754 + 1798618658;
                byArray[-1560445222 + 1560445277] = -593514248 + 593514193;
                byArray[-903302046 + 903302102] = -39839334 + 39839281;
                byArray[-1383639217 + 1383639274] = -1284908607 + 1284908704;
                byArray[-1710559974 + 1710560032] = -1499678286 + 1499678222;
                byArray[-1909896743 + 1909896802] = -901347540 + 901347656;
                a\u0430\u0455se.a_bsm3("e\u04bb\u0445\u0435\u0441\u0445", e\u04bb\u0445\u0435\u0441\u0445(java.lang.String ), (String)((Object)a\u0430\u0455se.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-570428959 + 268368925), (int)(-293327828 + 702278707))));
            });
            \u04bbj\u0441x\u04402.setCancelled(true);
        }
    }

    @\u0445\u0458\u0458h\u0445\u0430a
    public void \u043e\u0456xhhx(\u0430\u0456i\u043ephj \u0430\u0456i\u043ephj2) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (2 * 2 * 2 >= 0) {
        }
        if (a\u0430\u0455se.$_h84s4mu1ngan17lhr((long)a\u0430\u0455se.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)a\u0430\u0455se.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        if (0 != 0) {
        }
        if (!this.\u0440\u0435\u0455x\u0435xe()) {
            return;
        }
        if (\u0430\u0456i\u043ephj2.p\u0440\u04bb() == i\u0456\u0445\u0430\u0441p.cc\u0441) {
            if (\u043ei\u0456s\u0440xe != null && !this.c\u0435a\u0440x\u0456) {
                return;
            }
            if (this.\u0456i\u0430\u04bb == 0) {
                return;
            }
            if (this.\u0456i\u0430\u04bb == 1) {
                ++this.\u0455a\u0456sep\u0455;
                int n = this.\u0455a\u0456sep\u0455;
                byte[] byArray = new byte[-1649914566 + 1649914591];
                byArray[0] = -1141675102 + 1141675000;
                byArray[1] = -2034342496 + 2034342525;
                byArray[2] = -954776469 + 954776483;
                byArray[3] = -626608494 + 626608544;
                byArray[4] = -502528989 + 502528949;
                byArray[5] = -891504624 + 891504591;
                byArray[-879110234 + 879110240] = -173205318 + 173205294;
                byArray[-1133404798 + 1133404805] = -980910829 + 980910943;
                byArray[-1725614955 + 1725614963] = -2018377480 + 2018377478;
                byArray[-1086107556 + 1086107565] = -1519542279 + 1519542209;
                byArray[-781184506 + 781184516] = -616472219 + 616472210;
                byArray[-1453403093 + 1453403104] = -282080750 + 282080715;
                byArray[-1439312950 + 1439312962] = 2;
                byArray[-845704602 + 845704615] = -359498785 + 359498908;
                byArray[-961015267 + 961015281] = -1042962691 + 1042962768;
                byArray[-1042019609 + 1042019624] = -1875339989 + 1875340068;
                byArray[-334449823 + 334449839] = -686323560 + 686323661;
                byArray[-1716940214 + 1716940231] = -1684924716 + 1684924693;
                byArray[-335172621 + 335172639] = -1118924932 + 1118925054;
                byArray[-1374714072 + 1374714091] = -1024533625 + 1024533672;
                byArray[-763227286 + 763227306] = -898684143 + 898684058;
                byArray[-1294747033 + 1294747054] = -2087710262 + 2087710339;
                byArray[-376383173 + 376383195] = -1;
                byArray[-1952090907 + 1952090930] = -1102693358 + 1102693373;
                byArray[-1567232804 + 1567232828] = -1058769100 + 1058768975;
                a\u0430\u0455se.a_bsm3("e\u04bb\u0445\u0435\u0441\u0445", e\u04bb\u0445\u0435\u0441\u0445(java.lang.String ), (String)((String)((Object)a\u0430\u0455se.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-330674902 + 1713177916), (int)(-885556957 + 1439672291))) + n));
                a\u0430\u0455se.\u0430\u0445j\u0445s\u0456\u04bb.field_1690.field_1903.method_23481(true);
                \u043ei\u0456s\u0440xe = new e\u0445\u0440\u0440a(this.i\u0458xx\u0456\u0458i ? a\u0430\u0455se.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_36454() : a\u0430\u0455se.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_36454() - 180.0f, this.i\u0458xx\u0456\u0458i ? 90.0f : 88.0f);
            }
            if (this.\u0456i\u0430\u04bb >= 2) {
                this.\u0456i\u0430\u04bb = 0;
                int n = this.ih\u043eh();
                if (n != -1) {
                    a\u0430\u0455se.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7545 = n;
                    this.ae\u0441 = this.\u0430\u0441a\u0458x();
                    a\u0430\u0455se.\u0430\u0445j\u0445s\u0456\u04bb.field_1690.field_1904.method_23481(true);
                    this.NcfSumNuCg = true;
                    int n2 = this.ae\u0441;
                    int n3 = this.\u0455a\u0456sep\u0455;
                    byte[] byArray = new byte[-1181485662 + 1181485675];
                    byArray[0] = -776730062 + 776730057;
                    byArray[1] = -1675825384 + 1675825339;
                    byArray[2] = -39984904 + 39984863;
                    byArray[3] = 4;
                    byArray[4] = -403193183 + 403193194;
                    byArray[5] = -764079211 + 764079202;
                    byArray[-1075126150 + 1075126156] = -351025456 + 351025521;
                    byArray[-1683734437 + 1683734444] = 3;
                    byArray[-1537203157 + 1537203165] = -1471965330 + 1471965262;
                    byArray[-474950315 + 474950324] = -44036758 + 44036791;
                    byArray[-1365021710 + 1365021720] = -258403377 + 258403311;
                    byArray[-974823450 + 974823461] = -1286090750 + 1286090687;
                    byArray[-477550483 + 477550495] = -1444022668 + 1444022736;
                    byte[] byArray2 = new byte[-880231746 + 880231771];
                    byArray2[0] = -1626467604 + 1626467476;
                    byArray2[1] = -990058756 + 990058701;
                    byArray2[2] = -1038193679 + 1038193656;
                    byArray2[3] = -1340599261 + 1340599144;
                    byArray2[4] = -1036433687 + 1036433802;
                    byArray2[5] = -23906877 + 23906927;
                    byArray2[-2037018906 + 2037018912] = -788526303 + 788526340;
                    byArray2[-324340909 + 324340916] = -1432655150 + 1432655226;
                    byArray2[-1676975805 + 1676975813] = -707724725 + 707724707;
                    byArray2[-388361067 + 388361076] = -655738964 + 655738887;
                    byArray2[-1658903900 + 1658903910] = -1698820787 + 1698820895;
                    byArray2[-1435170759 + 1435170770] = -1560896494 + 1560896446;
                    byArray2[-431146208 + 431146220] = -344174854 + 344174860;
                    byArray2[-1067863647 + 1067863660] = -1587009266 + 1587009140;
                    byArray2[-968224147 + 968224161] = -1532518216 + 1532518186;
                    byArray2[-1870797036 + 1870797051] = -47340376 + 47340270;
                    byArray2[-1461874366 + 1461874382] = -410881391 + 410881267;
                    byArray2[-1119518572 + 1119518589] = -1480745996 + 1480745924;
                    byArray2[-1945922788 + 1945922806] = -1249502372 + 1249502293;
                    byArray2[-696074738 + 696074757] = -1579258343 + 1579258465;
                    byArray2[-380375444 + 380375464] = -1073188140 + 1073188218;
                    byArray2[-340583686 + 340583707] = -2014502050 + 2014501927;
                    byArray2[-512157423 + 512157445] = -518503889 + 518503874;
                    byArray2[-329906874 + 329906897] = -34447313 + 34447279;
                    byArray2[-1222193335 + 1222193359] = -528679822 + 528679890;
                    a\u0430\u0455se.a_bsm3("e\u04bb\u0445\u0435\u0441\u0445", e\u04bb\u0445\u0435\u0441\u0445(java.lang.String ), (String)((String)((Object)a\u0430\u0455se.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-1334361799 + 608408449), (int)(540934655 + 312619232))) + n3 + (String)((Object)a\u0430\u0455se.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray2, (int)(1708272530 + 2015605347), (int)(-312174997 + 892701742))) + n2));
                }
                return;
            }
            ++this.\u0456i\u0430\u04bb;
        } else if (this.NcfSumNuCg) {
            boolean bl2;
            boolean bl3;
            int n = this.\u0430\u0441a\u0458x();
            if (n < this.ae\u0441) {
                v3 = true;
                if (bl) {
                    __js_dispatch_state = 0;
                }
            } else {
                v3 = bl3 = false;
            }
            if (this.oa\u0458jxx\u0430() == -1) {
                v4 = true;
                if (bl) {
                    __js_dispatch_state = 0;
                }
            } else {
                v4 = bl2 = false;
            }
            if (bl3 || bl2) {
                Object object;
                a\u0430\u0455se.\u0430\u0445j\u0445s\u0456\u04bb.field_1690.field_1904.method_23481(false);
                a\u0430\u0455se.\u0430\u0445j\u0445s\u0456\u04bb.field_1690.field_1903.method_23481(false);
                \u043ei\u0456s\u0440xe = null;
                this.NcfSumNuCg = false;
                if (bl3) {
                    int n4 = n;
                    int n5 = this.ae\u0441;
                    int n6 = this.\u0455a\u0456sep\u0455;
                    byte[] byArray = new byte[-1695382812 + 1695382825];
                    byArray[0] = -77660774 + 77660870;
                    byArray[1] = -1341749417 + 1341749386;
                    byArray[2] = -1273388355 + 1273388275;
                    byArray[3] = -1341802124 + 1341802225;
                    byArray[4] = -312176245 + 312176258;
                    byArray[5] = -738857612 + 738857565;
                    byArray[-1768459014 + 1768459020] = -817964080 + 817963958;
                    byArray[-739982111 + 739982118] = -1424571669 + 1424571620;
                    byArray[-1622423297 + 1622423305] = -1923651489 + 1923651416;
                    byArray[-99357078 + 99357087] = -1765505863 + 1765505851;
                    byArray[-393850062 + 393850072] = -647055076 + 647055163;
                    byArray[-2002860879 + 2002860890] = -1753767254 + 1753767264;
                    byArray[-2071659459 + 2071659471] = -1035528090 + 1035527975;
                    byte[] byArray3 = new byte[-2117631163 + 2117631177];
                    byArray3[0] = -1376311870 + 1376311744;
                    byArray3[1] = -186206416 + 186206414;
                    byArray3[2] = -1336308322 + 1336308357;
                    byArray3[3] = -1042898943 + 1042899047;
                    byArray3[4] = -1809063661 + 1809063580;
                    byArray3[5] = 4;
                    byArray3[-513275606 + 513275612] = -1484374962 + 1484374973;
                    byArray3[-1062551409 + 1062551416] = -558352420 + 558352390;
                    byArray3[-1309902355 + 1309902363] = -1572417231 + 1572417318;
                    byArray3[-725456746 + 725456755] = -445305411 + 445305423;
                    byArray3[-290973496 + 290973506] = -1228350702 + 1228350678;
                    byArray3[-2009464086 + 2009464097] = -37607072 + 37607115;
                    byArray3[-891397958 + 891397970] = -916823855 + 916823968;
                    byArray3[-1179193163 + 1179193176] = -1515762751 + 1515762799;
                    byte[] byArray4 = new byte[-912647204 + 912647228];
                    byArray4[0] = -2114423913 + 2114423993;
                    byArray4[1] = -1942540853 + 1942540793;
                    byArray4[2] = -437299133 + 437299236;
                    byArray4[3] = -1744793253 + 1744793194;
                    byArray4[4] = -767926409 + 767926468;
                    byArray4[5] = -1602040664 + 1602040710;
                    byArray4[-279732284 + 279732290] = -1350006564 + 1350006595;
                    byArray4[-1643423661 + 1643423668] = -2077857738 + 2077857801;
                    byArray4[-1564844874 + 1564844882] = -495294908 + 495294947;
                    byArray4[-1088058129 + 1088058138] = -25593672 + 25593763;
                    byArray4[-285396367 + 285396377] = -1472446496 + 1472446546;
                    byArray4[-2124898430 + 2124898441] = -1224737558 + 1224737621;
                    byArray4[-1966195368 + 1966195380] = -1510806689 + 1510806768;
                    byArray4[-1860670228 + 1860670241] = -682950785 + 682950847;
                    byArray4[-985131802 + 985131816] = -2013092185 + 2013092111;
                    byArray4[-991558569 + 991558584] = -1466146838 + 1466146819;
                    byArray4[-1544958359 + 1544958375] = -211669615 + 211669659;
                    byArray4[-2079816085 + 2079816102] = -2098175388 + 2098175432;
                    byArray4[-379410896 + 379410914] = -950936414 + 950936308;
                    byArray4[-1427045914 + 1427045933] = 2;
                    byArray4[-1309057863 + 1309057883] = -647670643 + 647670533;
                    byArray4[-390756551 + 390756572] = -394280109 + 394280067;
                    byArray4[-62797529 + 62797551] = -1552582568 + 1552582612;
                    byArray4[-2098573173 + 2098573196] = -1064112151 + 1064112254;
                    object = (String)((Object)a\u0430\u0455se.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-194862490 + 85481236), (int)(-483476029 + 70134169))) + n6 + (String)((Object)a\u0430\u0455se.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray3, (int)(539830262 + 485561639), (int)(-1218980881 + 1825984574))) + n5 + (String)((Object)a\u0430\u0455se.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1634374695 + 1634374625, -1894508567 + 1894508549, -1343811023 + 1343811121, -742003030 + 742002970}, (int)(-837246152 + 362496123), (int)(-398198042 + 11333129))) + n4 + (String)((Object)a\u0430\u0455se.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray4, (int)(-1824743864 + 957427205), (int)(-766727606 + 106835552)));
                    if (bl) {
                        __js_dispatch_state = 0;
                    }
                } else {
                    byte[] byArray = new byte[-10816706 + 10816737];
                    byArray[0] = -148006372 + 148006363;
                    byArray[1] = -245277728 + 245277671;
                    byArray[2] = -960199128 + 960199013;
                    byArray[3] = -1943302356 + 1943302324;
                    byArray[4] = -1987840647 + 1987840555;
                    byArray[5] = -518690343 + 518690382;
                    byArray[-1903238461 + 1903238467] = -1879369491 + 1879369543;
                    byArray[-492008276 + 492008283] = -142633613 + 142633507;
                    byArray[-88570511 + 88570519] = -137670757 + 137670874;
                    byArray[-637543637 + 637543646] = -1759099372 + 1759099490;
                    byArray[-192790636 + 192790646] = -847179945 + 847179870;
                    byArray[-1464925550 + 1464925561] = -1229976438 + 1229976347;
                    byArray[-1900329018 + 1900329030] = -1879200661 + 1879200577;
                    byArray[-533747614 + 533747627] = -369449579 + 369449619;
                    byArray[-1627665706 + 1627665720] = -26289264 + 26289256;
                    byArray[-148473511 + 148473526] = -1570392643 + 1570392711;
                    byArray[-953008469 + 953008485] = -2114083957 + 2114083899;
                    byArray[-2015681085 + 2015681102] = -1372421116 + 1372421008;
                    byArray[-1286521458 + 1286521476] = -60973030 + 60973017;
                    byArray[-648540874 + 648540893] = -1358062813 + 1358062754;
                    byArray[-264106034 + 264106054] = -1916485889 + 1916485996;
                    byArray[-662360156 + 662360177] = -1284952120 + 1284952238;
                    byArray[-2053346872 + 2053346894] = 3;
                    byArray[-26702721 + 26702744] = -869180960 + 869180995;
                    byArray[-316730448 + 316730472] = -848935928 + 848935888;
                    byArray[-375325172 + 375325197] = -1351228692 + 1351228645;
                    byArray[-541142537 + 541142563] = -1800989359 + 1800989381;
                    byArray[-333349154 + 333349181] = -795823356 + 795823367;
                    byArray[-2049415611 + 2049415639] = -1287123229 + 1287123144;
                    byArray[-231212810 + 231212839] = -996826415 + 996826341;
                    byArray[-396493607 + 396493637] = -571511781 + 571511696;
                    object = a\u0430\u0455se.a_bsm2("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(1629345343 + 342990672), (int)(-2145935310 + 1785481809));
                }
                a\u0430\u0455se.a_bsm3("e\u04bb\u0445\u0435\u0441\u0445", e\u04bb\u0445\u0435\u0441\u0445(java.lang.String ), (String)object);
            }
        }
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
}

