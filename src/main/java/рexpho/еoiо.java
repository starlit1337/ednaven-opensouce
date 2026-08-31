/*
 * Decompiled with CFR 0.152.
 */
package \u0440expho;

import c\u0445is.s\u0456a\u0458;
import c\u0445is.\u0430\u0456i\u043ephj;
import c\u0445is.\u04bbj\u0441x\u0440;
import ie\u0441\u0430ej.\u0441\u0455\u043e\u04bb;
import ie\u0441\u0430ej.\u0445ic\u0441\u0458\u0456\u0445;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import net.minecraft.class_1297;
import net.minecraft.class_1541;
import net.minecraft.class_1667;
import net.minecraft.class_1680;
import net.minecraft.class_1681;
import net.minecraft.class_238;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2828;
import net.minecraft.class_4587;
import net.minecraft.class_638;
import net.minecraft.class_742;
import net.minecraft.class_745;
import net.minecraft.class_746;
import o\u0455sio\u0440.\u0445\u0458\u0458h\u0445\u0430a;
import spso.\u0430c\u0440;
import spso.\u0441a\u0458p;
import x\u04bbeo.a\u0441ie\u043e\u0445x;
import x\u04bbeo.e\u0435o\u0445;
import \u0435xp.\u043ea\u0441\u0430p;
import \u043e\u0445\u0440\u0430ose.i\u0456\u0445\u0430\u0441p;
import \u0440expho.h\u0458\u0435;
import \u0441\u0440ixoh.\u0441\u0445jc\u043ejo;
import \u0445eo.c\u0455pi;
import \u0445eo.\u0456p\u0430\u043e\u0458\u043e;
import \u0445eo.\u0458i\u0456x;

@\u0456p\u0430\u043e\u0458\u043e(sp\u0456p\u0445\u0435="Blink", s\u0455cj=\u0458i\u0456x.MOVEMENT, a\u0456j\u0430\u0455\u04bb="Suspends all movement packets for teleporting!")
public class \u0435oi\u043e
extends c\u0455pi {
    private final /* synthetic */ a\u0441ie\u043e\u0445x \u043eposso;
    private final /* synthetic */ e\u0435o\u0445 i\u0455\u0441s\u0441;
    private final /* synthetic */ e\u0435o\u0445 ce\u0435;
    public static final /* synthetic */ Set<Class<?>> j\u0440p\u0435\u0440;
    private final /* synthetic */ Queue<class_2596<?>> \u0440\u0440\u0435h\u0440\u0440\u0441;
    private final /* synthetic */ \u0445ic\u0441\u0458\u0456\u0445 ipace\u0455;
    public /* synthetic */ \u043ea\u0441\u0430p x\u0430cc\u04bb;
    public /* synthetic */ \u043ea\u0441\u0430p x\u0430\u0456;
    public /* synthetic */ \u043ea\u0441\u0430p e\u0441\u0430\u0455;
    public /* synthetic */ \u043ea\u0441\u0430p \u043esp;
    public /* synthetic */ \u043ea\u0441\u0430p \u0458\u0456\u0445\u0458;
    public /* synthetic */ \u043ea\u0441\u0430p p\u04bb\u0455o;
    private /* synthetic */ boolean s\u0441xe\u0456c;
    public /* synthetic */ class_745 po\u0435\u0455e;
    private /* synthetic */ int \u043exj\u0458;
    private /* synthetic */ int \u0430jpj;
    private static /* synthetic */ int __js_dispatch_state = 0;

    public \u0435oi\u043e() {
        if (2 * 2 * 2 >= 0) {
        }
        this.\u043eposso = new a\u0441ie\u043e\u0445x();
        this.i\u0455\u0441s\u0441 = new e\u0435o\u0445((Set<Class<?>>)((Object)\u0435oi\u043e.a_bsm0("singleton", singleton(T ), class_1681.class)), new Color(-1253398471 + 1253398726, -1986073241 + 1986073479, -1059515835 + 1059515989));
        this.ce\u0435 = new e\u0435o\u0445((Set<Class<?>>)((Object)\u0435oi\u043e.a_bsm0("singleton", singleton(T ), class_1680.class)), new Color(-139353602 + 139353857, -1904273062 + 1904273317, -79793310 + 79793565));
        this.\u0440\u0440\u0435h\u0440\u0440\u0441 = new ConcurrentLinkedQueue();
        this.ipace\u0455 = new \u0445ic\u0441\u0458\u0456\u0445(0.0f, 0.2f);
        byte[] byArray = new byte[-547420590 + 547420613];
        byArray[0] = -1197812481 + 1197812432;
        byArray[1] = -1424876352 + 1424876339;
        byArray[2] = -1919724114 + 1919724087;
        byArray[3] = -622229506 + 622229395;
        byArray[4] = -1656349589 + 1656349478;
        byArray[5] = -1204837699 + 1204837818;
        byArray[-1265014945 + 1265014951] = -605983307 + 605983407;
        byArray[-1220734667 + 1220734674] = -153688041 + 153688141;
        byArray[-469712944 + 469712952] = -1409546091 + 1409546079;
        byArray[-751878292 + 751878301] = -219296441 + 219296552;
        byArray[-979985878 + 979985888] = -2122121001 + 2122121071;
        byArray[-189109393 + 189109404] = -147014175 + 147014198;
        byArray[-851194775 + 851194787] = -803548963 + 803549062;
        byArray[-255817736 + 255817749] = -919267167 + 919267245;
        byArray[-499096438 + 499096452] = -1470625597 + 1470625684;
        byArray[-235578877 + 235578892] = -555497110 + 555497173;
        byArray[-1982967831 + 1982967847] = -509200593 + 509200488;
        byArray[-935912024 + 935912041] = -720388374 + 720388326;
        byArray[-1320856822 + 1320856840] = -2138812635 + 2138812510;
        byArray[-513482164 + 513482183] = -820006364 + 820006414;
        byArray[-1445398590 + 1445398610] = -1127665960 + 1127665973;
        byArray[-820333510 + 820333531] = -539190539 + 539190417;
        byArray[-324700231 + 324700253] = -44048666 + 44048639;
        this.x\u0430cc\u04bb = ((\u0430c\u0440)((Object)\u0435oi\u043e.a_bsm2("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)\u0435oi\u043e.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-138140194 + 614004351), (int)(-2139881719 + 1587666955)))))).\u043ecxi\u0455(0.0f).a\u0455\u0445\u0435c(50.0f).s\u0458\u0458a(20.0f).x\u0455heah\u0445(1.0f).\u0458c\u0456\u0440().getFloatValue();
        byte[] byArray2 = new byte[-2086991539 + 2086991559];
        byArray2[0] = -1013581896 + 1013581873;
        byArray2[1] = -795981689 + 795981658;
        byArray2[2] = -649853573 + 649853649;
        byArray2[3] = -198224670 + 198224686;
        byArray2[4] = -661687946 + 661688026;
        byArray2[5] = -592929230 + 592929326;
        byArray2[-2001488752 + 2001488758] = -508348356 + 508348295;
        byArray2[-895871722 + 895871729] = -1766607311 + 1766607294;
        byArray2[-1891457121 + 1891457129] = -215523389 + 215523358;
        byArray2[-1563451838 + 1563451847] = -889891261 + 889891162;
        byArray2[-857310130 + 857310140] = -439576995 + 439576874;
        byArray2[-526880400 + 526880411] = -1;
        byArray2[-643489021 + 643489033] = -955167071 + 955166975;
        byArray2[-355132415 + 355132428] = -1324236808 + 1324236876;
        byArray2[-735883843 + 735883857] = -1809000353 + 1809000267;
        byArray2[-236283413 + 236283428] = -1426538516 + 1426538537;
        byArray2[-270056341 + 270056357] = -393171194 + 393171290;
        byArray2[-804205375 + 804205392] = -915829739 + 915829732;
        byArray2[-1641230426 + 1641230444] = -2135432752 + 2135432659;
        byArray2[-1389938159 + 1389938178] = -1822747853 + 1822747814;
        this.x\u0430\u0456 = ((\u0430c\u0440)((Object)\u0435oi\u043e.a_bsm2("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)\u0435oi\u043e.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray2, (int)(633400446 + 1248363434), (int)(-1433408214 + 608166309)))))).\u043ecxi\u0455(3.0f).a\u0455\u0445\u0435c(20.0f).s\u0458\u0458a(10.0f).x\u0455heah\u0445(1.0f).\u0458c\u0456\u0440().getFloatValue();
        byte[] byArray3 = new byte[-229850868 + 229850877];
        byArray3[0] = -1003853242 + 1003853116;
        byArray3[1] = -286554878 + 286554957;
        byArray3[2] = -754958055 + 754957961;
        byArray3[3] = -418502412 + 418502316;
        byArray3[4] = -2120307177 + 2120307054;
        byArray3[5] = -453456361 + 453456406;
        byArray3[-2119806883 + 2119806889] = -1762314790 + 1762314783;
        byArray3[-495747177 + 495747184] = -1387793869 + 1387793954;
        byArray3[-911441495 + 911441503] = -1222630813 + 1222630819;
        this.e\u0441\u0430\u0455 = ((\u0430c\u0440)((Object)\u0435oi\u043e.a_bsm2("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)\u0435oi\u043e.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray3, (int)(-960759362 + 661976178), (int)(1073036669 + 1402820117)))))).\u043ecxi\u0455(10.0f).a\u0455\u0445\u0435c(500.0f).s\u0458\u0458a(200.0f).x\u0455heah\u0445(1.0f).\u0458c\u0456\u0440().getFloatValue();
        byte[] byArray4 = new byte[-671940871 + 671940886];
        byArray4[0] = -1805528717 + 1805528828;
        byArray4[1] = -464949605 + 464949586;
        byArray4[2] = -451915370 + 451915490;
        byArray4[3] = -1681401382 + 1681401421;
        byArray4[4] = -1133949288 + 1133949249;
        byArray4[5] = -500556810 + 500556914;
        byArray4[-1426811954 + 1426811960] = -662662543 + 662662586;
        byArray4[-1007438926 + 1007438933] = -314779572 + 314779555;
        byArray4[-905330052 + 905330060] = -1444909498 + 1444909451;
        byArray4[-747256308 + 747256317] = -876429760 + 876429632;
        byArray4[-1496211893 + 1496211903] = -2084782629 + 2084782535;
        byArray4[-614783640 + 614783651] = -2021880767 + 2021880664;
        byArray4[-1775315809 + 1775315821] = -561771492 + 561771475;
        byArray4[-145808281 + 145808294] = -1069386875 + 1069386755;
        byArray4[-989413315 + 989413329] = -1092675583 + 1092675601;
        this.\u043esp = ((\u0430c\u0440)((Object)\u0435oi\u043e.a_bsm2("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)\u0435oi\u043e.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray4, (int)(-1228936189 + 1587554652), (int)(-362295424 + 1844283605)))))).\u043ecxi\u0455(3.0f).a\u0455\u0445\u0435c(10.0f).s\u0458\u0458a(4.0f).x\u0455heah\u0445(0.1f).\u0458c\u0456\u0440().getFloatValue();
        byte[] byArray5 = new byte[-1972476492 + 1972476504];
        byArray5[0] = -1368237930 + 1368237987;
        byArray5[1] = -863094468 + 863094437;
        byArray5[2] = -1698348793 + 1698348913;
        byArray5[3] = -861994743 + 861994689;
        byArray5[4] = -994794617 + 994794573;
        byArray5[5] = -2098807735 + 2098807853;
        byArray5[-1612037423 + 1612037429] = -794960763 + 794960877;
        byArray5[-1128563826 + 1128563833] = -1947480486 + 1947480381;
        byArray5[-1848979467 + 1848979475] = -1949794525 + 1949794632;
        byArray5[-643343690 + 643343699] = -917471253 + 917471294;
        byArray5[-1038043765 + 1038043775] = -2135836963 + 2135836884;
        byArray5[-689814793 + 689814804] = -1541699876 + 1541699788;
        this.\u0458\u0456\u0445\u0458 = ((\u0430c\u0440)((Object)\u0435oi\u043e.a_bsm2("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)\u0435oi\u043e.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray5, (int)(2124000141 + 1635267716), (int)(1685249366 + 817018831)))))).\u043ecxi\u0455(3.0f).a\u0455\u0445\u0435c(10.0f).s\u0458\u0458a(5.0f).x\u0455heah\u0445(0.1f).\u0458c\u0456\u0440().getFloatValue();
        byte[] byArray6 = new byte[-1048008521 + 1048008541];
        byArray6[0] = -1683255588 + 1683255667;
        byArray6[1] = -386218902 + 386218994;
        byArray6[2] = -1699776579 + 1699776513;
        byArray6[3] = -923223609 + 923223481;
        byArray6[4] = -115616448 + 115616521;
        byArray6[5] = -1029543386 + 1029543346;
        byArray6[-2113727390 + 2113727396] = -1618615808 + 1618615877;
        byArray6[-2003519393 + 2003519400] = -205300357 + 205300282;
        byArray6[-500440551 + 500440559] = -242336283 + 242336364;
        byArray6[-1585051452 + 1585051461] = -1450624726 + 1450624795;
        byArray6[-80425527 + 80425537] = -292704232 + 292704202;
        byArray6[-1761514471 + 1761514482] = -1330712596 + 1330712503;
        byArray6[-1350003675 + 1350003687] = -2128215236 + 2128215346;
        byArray6[-389449631 + 389449644] = -109897519 + 109897489;
        byArray6[-1066862716 + 1066862730] = -1571980697 + 1571980747;
        byArray6[-930182611 + 930182626] = -222059702 + 222059709;
        byArray6[-24905512 + 24905528] = -254993565 + 254993493;
        byArray6[-1348682354 + 1348682371] = -84445010 + 84444918;
        byArray6[-2008552955 + 2008552973] = -1093812488 + 1093812361;
        byArray6[-1873883311 + 1873883330] = -2069541754 + 2069541838;
        this.p\u04bb\u0455o = ((\u0430c\u0440)((Object)\u0435oi\u043e.a_bsm2("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)\u0435oi\u043e.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray6, (int)(-1314684905 + 1056010365), (int)(1362053449 + 146346143)))))).\u043ecxi\u0455(0.0f).a\u0455\u0445\u0435c(3.0f).s\u0458\u0458a(0.2f).x\u0455heah\u0445(0.01f).\u0458c\u0456\u0440().getFloatValue();
        this.s\u0441xe\u0456c = false;
        this.\u043exj\u0458 = 0;
        this.\u0430jpj = 0;
    }

    public /* synthetic */ long ah\u04bb\u0456o() {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (true | false) {
        }
        if (0 != 0) {
        }
        return this.\u0440\u0440\u0435h\u0440\u0440\u0441.stream().filter(class_25962 -> {
            boolean bl = false;
            if (bl) {
                \u0435oi\u043e.__js_dispatch_state = 0;
            }
            if ((3 * 3 + 3) % 2 == 0) {
            }
            return class_25962 instanceof class_2828 != 0;
        }).count();
    }

    private /* synthetic */ void \u0455\u0440a(class_2828 class_28282) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if (this.po\u0435\u0455e == null) {
            return;
        }
        this.po\u0435\u0455e.method_5759(class_28282.method_12269(this.po\u0435\u0455e.method_23317()), class_28282.method_12268(this.po\u0435\u0455e.method_23318()), class_28282.method_12274(this.po\u0435\u0455e.method_23321()), class_28282.method_12271(this.po\u0435\u0455e.method_36454()), class_28282.method_12270(this.po\u0435\u0455e.method_36455()), 3);
        if (class_28282.method_36172()) {
            this.po\u0435\u0455e.method_36456(class_28282.method_12271(this.po\u0435\u0455e.method_36454()));
            this.po\u0435\u0455e.method_5847(class_28282.method_12271(this.po\u0435\u0455e.method_36454()));
            this.po\u0435\u0455e.method_36457(class_28282.method_12270(this.po\u0435\u0455e.method_36455()));
        }
    }

    private /* synthetic */ void cx\u04bb() {
        block5: {
            boolean bl;
            class_2596<?> class_25962;
            do {
                if (bl = false) {
                    __js_dispatch_state = 0;
                }
                if (2 * 2 * 2 >= 0) {
                }
                if (0 != 0) {
                }
                if (this.\u0440\u0440\u0435h\u0440\u0440\u0441.isEmpty()) break block5;
                class_25962 = this.\u0440\u0440\u0435h\u0440\u0440\u0441.poll();
                \u0435oi\u043e.a_bsm3("\u04bb\u0456\u0458\u043ec", \u04bb\u0456\u0458\u043ec(net.minecraft.class_2596<?> ), class_25962);
            } while (!(class_25962 instanceof class_2828));
            ++this.\u0430jpj;
            this.\u0455\u0440a((class_2828)class_25962);
            if (bl) {
                __js_dispatch_state = 0;
            }
        }
    }

    @Override
    public /* synthetic */ void onEnable() {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (\u0435oi\u043e.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 != null && \u0430\u0445j\u0445s\u0456\u04bb.method_1542()) {
            super.setEnabled(false);
            return;
        }
        this.\u0440\u0440\u0435h\u0440\u0440\u0441.clear();
        this.\u043exj\u0458 = 0;
        this.s\u0441xe\u0456c = false;
        if (\u0435oi\u043e.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 != null) {
            this.po\u0435\u0455e = new \u0441\u0455\u043e\u04bb((class_742)\u0435oi\u043e.\u0430\u0445j\u0445s\u0456\u04bb.field_1724);
            this.po\u0435\u0455e.method_5838(-980658290 + 980657145);
            this.po\u0435\u0455e.method_5728(\u0435oi\u043e.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_5624());
            this.po\u0435\u0455e.method_33574(\u0435oi\u043e.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_19538());
            this.po\u0435\u0455e.method_36457(\u0435oi\u043e.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_36455());
            this.po\u0435\u0455e.method_36456(\u0435oi\u043e.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_36454());
            this.po\u0435\u0455e.method_5847(\u0435oi\u043e.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_5791());
            \u0435oi\u043e.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.method_53875((class_1297)this.po\u0435\u0455e);
        }
    }

    @Override
    public /* synthetic */ void onDisable() {
        while (true) {
            boolean bl;
            if (bl = false) {
                __js_dispatch_state = 0;
            }
            if (2 * 2 * 2 >= 0) {
            }
            if (0 != 0) {
            }
            if (this.\u0440\u0440\u0435h\u0440\u0440\u0441.isEmpty()) break;
            class_2596<?> class_25962 = this.\u0440\u0440\u0435h\u0440\u0440\u0441.poll();
            \u0435oi\u043e.a_bsm3("\u04bb\u0456\u0458\u043ec", \u04bb\u0456\u0458\u043ec(net.minecraft.class_2596<?> ), class_25962);
            if (!(class_25962 instanceof class_2828)) continue;
            this.\u0455\u0440a((class_2828)class_25962);
        }
        if (this.po\u0435\u0455e != null) {
            \u0435oi\u043e.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.method_2945(this.po\u0435\u0455e.method_5628(), class_1297.class_5529.field_26999);
            this.po\u0435\u0455e = null;
        }
    }

    @\u0445\u0458\u0458h\u0445\u0430a
    public void ox\u0445(s\u0456a\u0458 s\u0456a\u04582) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        int n = \u0430\u0445j\u0445s\u0456\u04bb.method_22683().method_4486() / 2 - (-195238412 + 195238462);
        int n2 = \u0430\u0445j\u0445s\u0456\u04bb.method_22683().method_4502() / 2 + (-809935110 + 809935125);
        this.ipace\u0455.oxjc\u0456(true);
        Color color = this.h\u0445ph().aj\u0445\u043e();
        \u0435oi\u043e.a_bsm4("x\u0456s\u0440j\u0458\u0445", x\u0456s\u0440j\u0458\u0445(net.minecraft.class_4587 float float float float float int ), (class_4587)s\u0456a\u04582.a\u0430c(), (float)n, (float)n2, (float)100.0f, (float)5.0f, (float)2.0f, (int)(1271127718 + 876355930));
        \u0435oi\u043e.a_bsm4("x\u0456s\u0440j\u0458\u0445", x\u0456s\u0440j\u0458\u0445(net.minecraft.class_4587 float float float float float int ), (class_4587)s\u0456a\u04582.a\u0430c(), (float)n, (float)n2, (float)this.ipace\u0455.\u0430jxc, (float)5.0f, (float)2.0f, (int)color.getRGB());
    }

    private /* synthetic */ boolean \u0458\u0430\u04bbj(double d) {
        int n;
        long l2;
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (\u0435oi\u043e.$_h1fkpbl21ngan17los((l2 = \u0435oi\u043e.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.method_18456().stream().filter(class_7422 -> {
            CallSite callSite;
            boolean bl = false;
            if (bl) {
                \u0435oi\u043e.__js_dispatch_state = 0;
                if (bl) {
                    \u0435oi\u043e.__js_dispatch_state = 0;
                }
            }
            if (2 * 2 * 2 >= 0) {
            }
            if (class_7422 == \u0435oi\u043e.\u0430\u0445j\u0445s\u0456\u04bb.field_1724) {
                return 0 != 0;
            }
            if (class_7422 instanceof \u0441\u0455\u043e\u04bb) {
                return 0 != 0;
            }
            if (\u0435oi\u043e.a_bsm8("\u0455xxe", \u0455xxe(net.minecraft.class_1297 ), (class_1297)class_7422) != false) {
                return 0 != 0;
            }
            if (\u0435oi\u043e.a_bsm9("i\u0440\u04bbeco", i\u0440\u04bbeco(net.minecraft.class_1297 ), (class_1297)class_7422) != false) {
                return 0 != 0;
            }
            if (\u0435oi\u043e.a_bsm10("\u0430c\u0455\u0440", \u0430c\u0455\u0440(net.minecraft.class_1297 ), (class_1297)class_7422) != false) {
                return 0 != 0;
            }
            class_243 class_2432 = class_7422.method_33571();
            return ((class_2432.method_1022((class_243)(callSite = \u0435oi\u043e.a_bsm11("\u0456p\u0458h", \u0456p\u0458h(net.minecraft.class_243 net.minecraft.class_238 ), (class_243)class_2432, (class_238)this.po\u0435\u0455e.method_5829()))) == d ? 0 : (class_2432.method_1022((class_243)(callSite = \u0435oi\u043e.a_bsm11("\u0456p\u0458h", \u0456p\u0458h(net.minecraft.class_243 net.minecraft.class_238 ), (class_243)class_2432, (class_238)this.po\u0435\u0455e.method_5829()))) < d ? -1 : 1)) < 0 ? 1 : 0) != 0;
        }).count()) == 0L ? 0 : ((l2 = \u0435oi\u043e.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.method_18456().stream().filter(class_7422 -> {
            CallSite callSite;
            boolean bl = false;
            if (bl) {
                \u0435oi\u043e.__js_dispatch_state = 0;
                if (bl) {
                    \u0435oi\u043e.__js_dispatch_state = 0;
                }
            }
            if (2 * 2 * 2 >= 0) {
            }
            if (class_7422 == \u0435oi\u043e.\u0430\u0445j\u0445s\u0456\u04bb.field_1724) {
                return 0 != 0;
            }
            if (class_7422 instanceof \u0441\u0455\u043e\u04bb) {
                return 0 != 0;
            }
            if (\u0435oi\u043e.a_bsm8("\u0455xxe", \u0455xxe(net.minecraft.class_1297 ), (class_1297)class_7422) != false) {
                return 0 != 0;
            }
            if (\u0435oi\u043e.a_bsm9("i\u0440\u04bbeco", i\u0440\u04bbeco(net.minecraft.class_1297 ), (class_1297)class_7422) != false) {
                return 0 != 0;
            }
            if (\u0435oi\u043e.a_bsm10("\u0430c\u0455\u0440", \u0430c\u0455\u0440(net.minecraft.class_1297 ), (class_1297)class_7422) != false) {
                return 0 != 0;
            }
            class_243 class_2432 = class_7422.method_33571();
            return ((class_2432.method_1022((class_243)(callSite = \u0435oi\u043e.a_bsm11("\u0456p\u0458h", \u0456p\u0458h(net.minecraft.class_243 net.minecraft.class_238 ), (class_243)class_2432, (class_238)this.po\u0435\u0455e.method_5829()))) == d ? 0 : (class_2432.method_1022((class_243)(callSite = \u0435oi\u043e.a_bsm11("\u0456p\u0458h", \u0456p\u0458h(net.minecraft.class_243 net.minecraft.class_238 ), (class_243)class_2432, (class_238)this.po\u0435\u0455e.method_5829()))) < d ? -1 : 1)) < 0 ? 1 : 0) != 0;
        }).count()) < 0L ? -1 : 1)) > 0) {
            n = 1;
            if (0 != 0 && 0 != 1 && 0 != 2) {
                // empty if block
            }
        } else {
            n = 0;
        }
        return n != 0;
    }

    private /* synthetic */ boolean \u0440\u04bbaai\u0430\u0455(double d) {
        CallSite callSite;
        long l2;
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return (\u0435oi\u043e.$_h1fkpbl31ngan17lot((l2 = (callSite = \u0435oi\u043e.a_bsm5("stream", stream(java.util.Spliterator<T> boolean ), \u0435oi\u043e.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.method_18112().spliterator(), (boolean)true)).filter(class_12972 -> {
            boolean bl = false;
            if (bl) {
                \u0435oi\u043e.__js_dispatch_state = 0;
                if (bl) {
                    \u0435oi\u043e.__js_dispatch_state = 0;
                }
            }
            if (true | false) {
            }
            return (class_12972 instanceof class_1541 && (this.po\u0435\u0455e.method_5739(class_12972) == d ? 0 : (this.po\u0435\u0455e.method_5739(class_12972) < d ? -1 : 1)) <= 0 ? 1 : 0) != 0;
        }).count()) == 0L ? 0 : ((l2 = (callSite = \u0435oi\u043e.a_bsm5("stream", stream(java.util.Spliterator<T> boolean ), \u0435oi\u043e.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.method_18112().spliterator(), (boolean)true)).filter(class_12972 -> {
            boolean bl = false;
            if (bl) {
                \u0435oi\u043e.__js_dispatch_state = 0;
                if (bl) {
                    \u0435oi\u043e.__js_dispatch_state = 0;
                }
            }
            if (true | false) {
            }
            return (class_12972 instanceof class_1541 && (this.po\u0435\u0455e.method_5739(class_12972) == d ? 0 : (this.po\u0435\u0455e.method_5739(class_12972) < d ? -1 : 1)) <= 0 ? 1 : 0) != 0;
        }).count()) < 0L ? -1 : 1)) > 0 ? 1 : 0) != 0;
    }

    private /* synthetic */ boolean \u0458\u0435xcs\u0440(double d) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        for (class_1297 class_12972 : \u0435oi\u043e.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.method_18112()) {
            e\u0435o\u0445 e\u0435o\u04452;
            if (class_12972 instanceof class_1667) {
                e\u0435o\u04452 = this.\u043eposso;
            } else if (class_12972 instanceof class_1681) {
                e\u0435o\u04452 = this.i\u0455\u0441s\u0441;
                if (0 != 0) {
                    if (0 != 1) {
                        if (0 != 2) {
                            // empty if block
                        }
                    } else if (bl) {
                        __js_dispatch_state = 0;
                    }
                }
            } else {
                if (!(class_12972 instanceof class_1680)) continue;
                e\u0435o\u04452 = this.ce\u0435;
            }
            if (e\u0435o\u04452 != null && this.o\u0440\u0445a\u0456\u04bb(class_12972, e\u0435o\u04452, d)) {
                return 1 != 0;
            }
            if (!bl) continue;
            __js_dispatch_state = 0;
        }
        return 0 != 0;
    }

    private /* synthetic */ boolean o\u0440\u0445a\u0456\u04bb(class_1297 class_12972, \u0441\u0445jc\u043ejo \u0441\u0445jc\u043ejo2, double d) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        class_746 class_7462 = \u0435oi\u043e.\u0430\u0445j\u0445s\u0456\u04bb.field_1724;
        class_638 class_6382 = \u0435oi\u043e.\u0430\u0445j\u0445s\u0456\u04bb.field_1687;
        double d2 = class_12972.method_23317();
        double d3 = class_12972.method_23318();
        double d4 = class_12972.method_23321();
        double d5 = class_12972.method_18798().field_1352;
        double d6 = class_12972.method_18798().field_1351;
        double d7 = class_12972.method_18798().field_1350;
        while (true) {
            float f = \u0441\u0445jc\u043ejo2.getData1();
            float f2 = \u0441\u0445jc\u043ejo2.getData2();
            class_238 class_2383 = new class_238(d2 - (double)f, d3, d4 - (double)f, d2 + (double)f, d3 + (double)f2, d4 + (double)f);
            class_243 class_2432 = new class_243(d2, d3, d4);
            class_243 class_2433 = new class_243(d2 + d5, d3 + d6, d4 + d7);
            CallSite callSite = \u0435oi\u043e.a_bsm6("po\u0441\u04bb\u0455o", po\u0441\u04bb\u0455o(net.minecraft.class_243 net.minecraft.class_243 boolean boolean boolean net.minecraft.class_1297 ), (class_243)class_2432, (class_243)class_2433, (boolean)false, (boolean)(class_12972 instanceof class_1667), (boolean)false, (class_1297)class_12972);
            List list = class_6382.method_8335((class_1297)class_7462, class_2383.method_1002(d5, d6, d7).method_1012(1.0, 1.0, 1.0).method_1009(d, d, d));
            if (list.contains(this.po\u0435\u0455e)) {
                return 1 != 0;
            }
            d2 += d5;
            d4 += d7;
            if (!callSite.method_17783().equals((Object)class_239.class_240.field_1333) || \u0435oi\u043e.$_h1fkpbl41ngan17lou((d3 += d6) == -128.0 ? 0 : ((d3 += d6) < -128.0 ? -1 : 1)) < 0) {
                return 0 != 0;
            }
            d5 *= class_12972.method_5799() ? 0.8 : 0.99;
            double d8 = d6 * (class_12972.method_5799() ? 0.8 : 0.99);
            d7 *= class_12972.method_5799() ? 0.8 : 0.99;
            d6 = d8 - (double)\u0441\u0445jc\u043ejo2.getGravity();
            if (!bl) continue;
            __js_dispatch_state = 0;
        }
    }

    private /* synthetic */ boolean pxecje\u0458() {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (true | false) {
        }
        if (0 != 0) {
        }
        return (this.\u0440\u04bbaai\u0430\u0455(this.\u0458\u0456\u0445\u0458.axpacc()) || this.\u0458\u0430\u04bbj(this.\u043esp.axpacc()) || this.\u0458\u0435xcs\u0440(this.p\u04bb\u0455o.axpacc()) ? 1 : 0) != 0;
    }

    @Override
    public /* synthetic */ void setEnabled(boolean bl) {
        boolean bl2 = false;
        if (bl2) {
            __js_dispatch_state = 0;
        }
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (bl && \u0435oi\u043e.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 != null && \u0430\u0445j\u0445s\u0456\u04bb.method_1542()) {
            super.setEnabled(false);
            return;
        }
        if (\u0435oi\u043e.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 != null) {
            if (bl) {
                super.setEnabled(true);
            } else if (!this.s\u0441xe\u0456c) {
                this.s\u0441xe\u0456c = true;
            } else if (this.\u0440\u0440\u0435h\u0440\u0440\u0441.isEmpty()) {
                super.setEnabled(false);
            }
        }
    }

    @\u0445\u0458\u0458h\u0445\u0430a
    public void \u043e\u0456xhhx(\u0430\u0456i\u043ephj \u0430\u0456i\u043ephj2) {
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
        if (\u0430\u0456i\u043ephj2.p\u0440\u04bb() == i\u0456\u0445\u0430\u0441p.cc\u0441 && \u0435oi\u043e.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 != null) {
            long l2 = this.ah\u04bb\u0456o();
            byte[] byArray = new byte[-1830068755 + 1830068768];
            byArray[0] = -1782069705 + 1782069689;
            byArray[1] = -166663242 + 166663226;
            byArray[2] = -1178987765 + 1178987790;
            byArray[3] = -1308963685 + 1308963706;
            byArray[4] = -593910444 + 593910335;
            byArray[5] = -1492598392 + 1492598401;
            byArray[-973940421 + 973940427] = -108703429 + 108703541;
            byArray[-846741372 + 846741379] = -1104391104 + 1104391178;
            byArray[-1784666396 + 1784666404] = -2064611 + 2064550;
            byArray[-388135639 + 388135648] = -2052351197 + 2052351273;
            byArray[-254077348 + 254077358] = -383851841 + 383851926;
            byArray[-1739633328 + 1739633339] = -788355673 + 788355558;
            byArray[-468276211 + 468276223] = -858784745 + 858784647;
            this.\u0455\u04bb\u0458\u0435\u0435xs(l2 + (String)((Object)\u0435oi\u043e.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(451250155 + 816169887), (int)(-1502021547 + 669636109))));
            this.ipace\u0455.osj = (float)\u0435oi\u043e.a_bsm7("method_15363", method_15363(float float float ), (float)((float)this.ah\u04bb\u0456o() / this.e\u0441\u0430\u0455.axpacc() * 100.0f), (float)0.0f, (float)100.0f);
            this.\u0430jpj = 0;
            if (\u0435oi\u043e.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.field_6235 == -1805173076 + 1805173086) {
                this.\u043exj\u0458 += (int)this.x\u0430cc\u04bb.axpacc();
            }
            while (\u0435oi\u043e.$_h1fkpbl51ngan17lov(this.\u0430jpj == this.x\u0430\u0456.axpacc() ? 0 : (this.\u0430jpj < this.x\u0430\u0456.axpacc() ? -1 : 1)) < 0 && this.\u043exj\u0458 > 0 && !this.\u0440\u0440\u0435h\u0440\u0440\u0441.isEmpty()) {
                this.cx\u04bb();
                --this.\u043exj\u0458;
            }
            while (\u0435oi\u043e.$_h1fkpblr1ngan17low(this.\u0430jpj == this.x\u0430\u0456.axpacc() ? 0 : (this.\u0430jpj < this.x\u0430\u0456.axpacc() ? -1 : 1)) < 0 && this.pxecje\u0458() && !this.\u0440\u0440\u0435h\u0440\u0440\u0441.isEmpty()) {
                this.cx\u04bb();
            }
            while (\u0435oi\u043e.$_h1fkpbls1ngan17lox(this.\u0430jpj == this.x\u0430\u0456.axpacc() ? 0 : (this.\u0430jpj < this.x\u0430\u0456.axpacc() ? -1 : 1)) < 0 && \u0435oi\u043e.$_h1fkpblt1ngan17loy(this.ah\u04bb\u0456o() == this.e\u0441\u0430\u0455.axpacc() ? 0 : (this.ah\u04bb\u0456o() > this.e\u0441\u0430\u0455.axpacc() ? 1 : -1)) >= 0 && !this.\u0440\u0440\u0435h\u0440\u0440\u0441.isEmpty()) {
                this.cx\u04bb();
            }
            if (this.s\u0441xe\u0456c) {
                while (\u0435oi\u043e.$_h1fkpblu1ngan17loz(this.\u0430jpj == this.x\u0430\u0456.axpacc() ? 0 : (this.\u0430jpj < this.x\u0430\u0456.axpacc() ? -1 : 1)) < 0 && !this.\u0440\u0440\u0435h\u0440\u0440\u0441.isEmpty()) {
                    this.cx\u04bb();
                }
                if (this.\u0440\u0440\u0435h\u0440\u0440\u0441.isEmpty()) {
                    this.setEnabled(false);
                }
            }
        }
    }

    @\u0445\u0458\u0458h\u0445\u0430a(\u0435o\u0435x\u0445s=4)
    public void o\u043eec\u04bb\u0445h(\u04bbj\u0441x\u0440 \u04bbj\u0441x\u04402) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        if (\u04bbj\u0441x\u04402.p\u0440\u04bb() == i\u0456\u0445\u0430\u0441p.ospc\u0456 && \u0435oi\u043e.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 != null && !\u04bbj\u0441x\u04402.isCancelled()) {
            if (j\u0440p\u0435\u0440.contains(\u04bbj\u0441x\u04402.ciao\u0455\u0455().getClass())) {
                return;
            }
            \u04bbj\u0441x\u04402.setCancelled(true);
            this.\u0440\u0440\u0435h\u0440\u0440\u0441.offer(\u04bbj\u0441x\u04402.ciao\u0455\u0455());
        }
    }

    static {
        j\u0440p\u0435\u0440 = new h\u0458\u0435();
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
}

