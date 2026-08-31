/*
 * Decompiled with CFR 0.152.
 */
package \u0445\u0458jsj\u0430;

import java.awt.Color;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import net.minecraft.class_4587;
import org.apache.commons.io.output.ByteArrayOutputStream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.BufferUtils;
import r.d3.C1a946c5246ca0949bfd0e13d;
import r.d8.Cade0e18b60fd9f037d8b2fc8;
import xs\u0441\u0445oa\u0430.i\u0435a;
import xs\u0441\u0445oa\u0430.p\u0456\u0458\u0441\u0458ej;
import xs\u0441\u0445oa\u0430.\u0430o\u043e;
import xs\u0441\u0445oa\u0430.\u0441i\u0458\u0458xj;
import xs\u0441\u0445oa\u0430.\u0445\u0440\u0445s\u0456;
import xs\u0441\u0445oa\u0430.\u0458c\u0456\u0456\u0441\u0441\u0440;
import \u0445\u0458jsj\u0430.j\u0430a\u0445i\u0455;

public class \u0455\u0435\u0445\u0430op\u0435 {
    private static final /* synthetic */ Logger \u0458\u0456a\u0441;
    private static final /* synthetic */ Color c\u0458pi\u0456;
    private final /* synthetic */ p\u0456\u0458\u0441\u0458ej jhx;
    private final /* synthetic */ j\u0430a\u0445i\u0455 \u0455\u043ep\u0440c\u0440;

    public \u0455\u0435\u0445\u0430op\u0435(String string, int n, int n2, int n3, int n4) {
        byte[] byArray;
        Object object;
        if (true | false) {
        }
        this.jhx = new \u0430o\u043e(\u0441i\u0458\u0458xj.\u0430sjx\u0458, i\u0435a.a\u0441e\u0430\u0456, \u0445\u0440\u0445s\u0456.i\u0430xo\u0430, \u0445\u0440\u0445s\u0456.i\u0430xo\u0430, \u0445\u0440\u0445s\u0456.\u0440\u043esh\u0441\u0458);
        String string2 = string;
        byte[] byArray2 = new byte[-1310840786 + 1310840806];
        byArray2[0] = -626696738 + 626696679;
        byArray2[1] = -810160017 + 810160051;
        byArray2[2] = -991158979 + 991158962;
        byArray2[3] = -2016125630 + 2016125722;
        byArray2[4] = -101278789 + 101278753;
        byArray2[5] = -649721376 + 649721259;
        byArray2[-798631787 + 798631793] = -2126246731 + 2126246799;
        byArray2[-187701759 + 187701766] = -1862946617 + 1862946553;
        byArray2[-1179867467 + 1179867475] = -1896553319 + 1896553357;
        byArray2[-1571693273 + 1571693282] = -531922887 + 531922956;
        byArray2[-1802527784 + 1802527794] = -436625706 + 436625598;
        byArray2[-1067093455 + 1067093466] = -1337420777 + 1337420846;
        byArray2[-1270060522 + 1270060534] = -1459396512 + 1459396585;
        byArray2[-1102978928 + 1102978941] = -848049210 + 848049174;
        byArray2[-1769270961 + 1769270975] = 0;
        byArray2[-1026697930 + 1026697945] = -624547663 + 624547586;
        byArray2[-1698106250 + 1698106266] = -1759709642 + 1759709611;
        byArray2[-685859403 + 685859420] = -2130595036 + 2130595108;
        byArray2[-1145731183 + 1145731201] = -527271917 + 527272004;
        byArray2[-1539550804 + 1539550823] = -40101577 + 40101527;
        InputStream inputStream = this.getClass().getResourceAsStream(Cade0e18b60fd9f037d8b2fc8.cachedDecodeString(byArray2, -151598330 + 1082551415, -671702697 + 1407879817) + string2 + Cade0e18b60fd9f037d8b2fc8.cachedDecodeString(new byte[]{-1276548766 + 1276548695, -1392080011 + 1392079909, -2074201057 + 2074201113, -811032025 + 811031959}, 973635585 + 558553938, -1249544647 + 991853162));
        if (inputStream == null) {
            String string3 = string;
            byte[] byArray3 = new byte[-266605856 + 266605872];
            byArray3[0] = -1538075373 + 1538075380;
            byArray3[1] = -222795487 + 222795468;
            byArray3[2] = -1456995133 + 1456995112;
            byArray3[3] = -614331967 + 614331899;
            byArray3[4] = -616895143 + 616895097;
            byArray3[5] = -1317633905 + 1317633830;
            byArray3[-1411529282 + 1411529288] = -711640941 + 711640997;
            byArray3[-995342546 + 995342553] = -143037590 + 143037552;
            byArray3[-560961638 + 560961646] = -831651356 + 831651286;
            byArray3[-2017129673 + 2017129682] = -2126550777 + 2126550863;
            byArray3[-1068252461 + 1068252471] = -1509866857 + 1509866854;
            byArray3[-1131472099 + 1131472110] = -1475660906 + 1475660794;
            byArray3[-1218439942 + 1218439954] = -1211427777 + 1211427883;
            byArray3[-1042700265 + 1042700278] = -1073589167 + 1073589086;
            byArray3[-1753413290 + 1753413304] = -814623802 + 814623731;
            byArray3[-139137509 + 139137524] = -677594093 + 677594210;
            throw new RuntimeException(Cade0e18b60fd9f037d8b2fc8.cachedDecodeString(byArray3, 431527199 + 2008087625, -696919322 + 1459507853) + string3);
        }
        try {
            int n5;
            object = new ByteArrayOutputStream();
            byte[] byArray4 = new byte[-2007831524 + 2007832548];
            while ((n5 = inputStream.read(byArray4)) != -1) {
                object.write(byArray4, 0, n5);
            }
            byArray = object.toByteArray();
        }
        catch (IOException iOException) {
            String string4 = string;
            byte[] byArray5 = new byte[-190918448 + 190918469];
            byArray5[0] = -926125139 + 926125061;
            byArray5[1] = -1959137618 + 1959137538;
            byArray5[2] = -1700318146 + 1700318199;
            byArray5[3] = -2004161884 + 2004161826;
            byArray5[4] = -1913170025 + 1913170083;
            byArray5[5] = -1072929825 + 1072929762;
            byArray5[-1043481725 + 1043481731] = -1886842318 + 1886842261;
            byArray5[-1764528458 + 1764528465] = -897337061 + 897337016;
            byArray5[-983361410 + 983361418] = -1189885035 + 1189885048;
            byArray5[-254538048 + 254538057] = -993469477 + 993469599;
            byArray5[-621606106 + 621606116] = -819558904 + 819558855;
            byArray5[-16461569 + 16461580] = -1513087015 + 1513086958;
            byArray5[-1362053376 + 1362053388] = -2095697287 + 2095697314;
            byArray5[-111228210 + 111228223] = -751442814 + 751442702;
            byArray5[-663634551 + 663634565] = -393849359 + 393849456;
            byArray5[-1519365903 + 1519365918] = -304139461 + 304139373;
            byArray5[-1356813271 + 1356813287] = 5;
            byArray5[-2030771982 + 2030771999] = -1072190017 + 1072190113;
            byArray5[-1175594873 + 1175594891] = -521366705 + 521366666;
            byArray5[-151198583 + 151198602] = -101609903 + 101610026;
            byArray5[-1386202398 + 1386202418] = -561840482 + 561840589;
            throw new RuntimeException(Cade0e18b60fd9f037d8b2fc8.cachedDecodeString(byArray5, 48053332 + 443277556, -1512488369 + 1281208295) + string4, iOException);
        }
        object = BufferUtils.createByteBuffer((int)byArray.length).put(byArray);
        ((Buffer)object).flip();
        long l2 = System.currentTimeMillis();
        this.\u0455\u043ep\u0440c\u0440 = new j\u0430a\u0445i\u0455((ByteBuffer)object, n, n2, n3, n4);
        byte[] byArray6 = new byte[-1825823916 + 1825823938];
        byArray6[0] = -394338955 + 394339076;
        byArray6[1] = -553040028 + 553040049;
        byArray6[2] = -2001882416 + 2001882314;
        byArray6[3] = -676823299 + 676823210;
        byArray6[4] = -1995809235 + 1995809276;
        byArray6[5] = -179778178 + 179778276;
        byArray6[-914173212 + 914173218] = -108195772 + 108195827;
        byArray6[-1730476580 + 1730476587] = -691293969 + 691294051;
        byArray6[-1474645198 + 1474645206] = -1987063536 + 1987063542;
        byArray6[-538001520 + 538001529] = -512758531 + 512758455;
        byArray6[-1805253940 + 1805253950] = -1869166885 + 1869166894;
        byArray6[-832177562 + 832177573] = -1472997649 + 1472997695;
        byArray6[-1557456530 + 1557456542] = -1502494290 + 1502494248;
        byArray6[-2084418889 + 2084418902] = -2075810454 + 2075810419;
        byArray6[-851470130 + 851470144] = -335903718 + 335903639;
        byArray6[-1944951728 + 1944951743] = -17935893 + 17935942;
        byArray6[-1768327709 + 1768327725] = -1137534664 + 1137534596;
        byArray6[-1031035868 + 1031035885] = -2039301818 + 2039301797;
        byArray6[-1695969142 + 1695969160] = -1352856915 + 1352856994;
        byArray6[-1658929309 + 1658929328] = -1376259856 + 1376259869;
        byArray6[-55681138 + 55681158] = -167312960 + 167313087;
        byArray6[-1340568078 + 1340568099] = -1482196234 + 1482196121;
        \u0458\u0456a\u0441.info(Cade0e18b60fd9f037d8b2fc8.cachedDecodeString(byArray6, -287508609 + 1907386637, 1833314457 + 1957345623), (Object)string, (Object)(System.currentTimeMillis() - l2));
    }

    public /* synthetic */ void \u0440hc\u0458(float f) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        this.jhx.iscpa = f;
    }

    public /* synthetic */ float se\u0440\u0458i(String string, double d) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return (float)this.i\u0455iias(string, false, d);
    }

    public /* synthetic */ double i\u0455iias(String string, boolean bl, double d) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return (this.\u0455\u043ep\u0440c\u0440.x\u0430hx\u0458(string) + (double)(bl ? 0.5f : 0.0f)) * d;
    }

    public /* synthetic */ double he\u04bb(boolean bl, double d) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return (this.\u0455\u043ep\u0440c\u0440.\u0455j\u0430\u0440\u0455() + (double)(bl ? 0.5f : 0.0f)) * d;
    }

    public /* synthetic */ double c\u043ehos\u0445(class_4587 class_45872, String string, double d, double d2, Color color, boolean bl, double d3) {
        double d4;
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        this.jhx.xhh();
        if (bl) {
            d4 = this.\u0455\u043ep\u0440c\u0440.ep\u0456hac(this.jhx, string, d + 0.5, d2 + 0.5, c\u0458pi\u0456, d3, true);
            this.\u0455\u043ep\u0440c\u0440.ep\u0456hac(this.jhx, string, d, d2, color, d3, false);
        } else {
            d4 = this.\u0455\u043ep\u0440c\u0440.ep\u0456hac(this.jhx, string, d, d2, color, d3, false);
        }
        this.jhx.ieh();
        \u0458c\u0456\u0456\u0441\u0441\u0440.\u04bb\u0430\u04bbae(this.\u0455\u043ep\u0440c\u0440.h\u0455\u0430.method_4624());
        this.jhx.io\u0445iaee(class_45872);
        return d4;
    }

    static {
        C1a946c5246ca0949bfd0e13d.m_4487bf5f5bb3efe5("decrypt", "windows-x64", "vm-diverse");
        \u0458\u0456a\u0441 = LogManager.getLogger(\u0455\u0435\u0445\u0430op\u0435.class);
        c\u0458pi\u0456 = new Color(-23758400 + 23758460, -1307080804 + 1307080864, -2069146178 + 2069146238, -2038461092 + 2038461272);
    }
}

