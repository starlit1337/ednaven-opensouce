/*
 * Decompiled with CFR 0.152.
 */
package \u04bbejhxj;

import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_310;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import r.d8.Cade0e18b60fd9f037d8b2fc8;
import \u0440o\u0456\u0445o.\u0445\u0440\u0430\u0435\u0445\u043e;
import \u0458o\u0440.hic\u0458\u0456\u0455;
import \u0458o\u0440.sephcee;
import \u0458o\u0440.\u0435\u0440c\u0441\u0441p\u0430;
import \u0458o\u0440.\u043e\u0458h\u0456p;
import \u0458o\u0440.\u0440\u0455jo\u043e;
import \u0458o\u0440.\u0445c\u0458;
import \u0458o\u0440.\u0458\u0441\u0458\u0430ej;
import \u04bbejhxj.ia\u0440a\u0440;

public class \u0440\u0455o\u0435 {
    public static final /* synthetic */ Logger \u0455c\u0430jo\u043eh;
    public static final /* synthetic */ File \u04bbx\u0458c\u0456xj;
    public static final /* synthetic */ File x\u0445ps\u0458;
    private final /* synthetic */ List<ia\u0440a\u0440> x\u043eh;

    public \u0440\u0455o\u0435() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        this.x\u043eh = new ArrayList<ia\u0440a\u0440>();
        if (!\u04bbx\u0458c\u0456xj.exists()) {
            \u04bbx\u0458c\u0456xj.mkdir();
        }
        if (!x\u0445ps\u0458.exists()) {
            x\u0445ps\u0458.mkdirs();
        }
        this.x\u043eh.add(new \u0435\u0440c\u0441\u0441p\u0430());
        this.x\u043eh.add(new \u0440\u0455jo\u043e());
        this.x\u043eh.add(new hic\u0458\u0456\u0455());
        this.x\u043eh.add(new \u043e\u0458h\u0456p());
        this.x\u043eh.add(new \u0445c\u0458());
        this.x\u043eh.add(new \u0458\u0441\u0458\u0430ej());
        this.x\u043eh.add(new sephcee());
    }

    public /* synthetic */ void \u0430pp\u0430\u0456\u0435(String string) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        String string2 = string;
        File file = new File(x\u0445ps\u0458, string2 + (String)((Object)\u0440\u0455o\u0435.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1546993078 + 1546992959, -902103780 + 902103743, -1784050565 + 1784050454, -1530538992 + 1530538987, -443488887 + 443488762}, (int)(-1921533624 + 654834487), (int)(116960150 + 368013649))));
        if (!file.exists()) {
            String string3 = string;
            byte[] byArray = new byte[-410689314 + 410689322];
            byArray[0] = -1614013021 + 1614013082;
            byArray[1] = -1688045929 + 1688045874;
            byArray[2] = -1287384277 + 1287384344;
            byArray[3] = -427647531 + 427647627;
            byArray[4] = -1236488547 + 1236488538;
            byArray[5] = -461144103 + 461144175;
            byArray[-375807612 + 375807618] = -1797682954 + 1797682902;
            byArray[-1269319978 + 1269319985] = -1170785443 + 1170785449;
            byte[] byArray2 = new byte[-1158017861 + 1158017873];
            byArray2[0] = -702785064 + 702785017;
            byArray2[1] = -1975128225 + 1975128287;
            byArray2[2] = -526563000 + 526562990;
            byArray2[3] = -1774318187 + 1774318281;
            byArray2[4] = -306145403 + 306145479;
            byArray2[5] = -2130128392 + 2130128474;
            byArray2[-1276795017 + 1276795023] = -289599685 + 289599562;
            byArray2[-383325031 + 383325038] = -1199202880 + 1199202958;
            byArray2[-324082092 + 324082100] = -619503596 + 619503622;
            byArray2[-504576867 + 504576876] = -815369847 + 815369721;
            byArray2[-1811613884 + 1811613894] = -372802420 + 372802484;
            byArray2[-1499343927 + 1499343938] = -877004277 + 877004170;
            \u0440\u0455o\u0435.a_bsm1("e\u04bb\u0445\u0435\u0441\u0445", e\u04bb\u0445\u0435\u0441\u0445(java.lang.String ), (String)((String)((Object)\u0440\u0455o\u0435.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(1447001746 + 1603286845), (int)(-1596360513 + 1087465707))) + string3 + (String)((Object)\u0440\u0455o\u0435.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray2, (int)(-162853159 + 65268565), (int)(-1685322060 + 903465648)))));
            return;
        }
        ((\u0445\u0440\u0430\u0435\u0445\u043e)((Object)\u0440\u0455o\u0435.a_bsm2("jaa\u0435\u0445c", jaa\u0435\u0445c()))).\u0430o\u0441\u0456p\u0455().h\u0445ca().forEach(c\u0455pi2 -> {
            if (true | false) {
            }
            c\u0455pi2.setEnabled(false);
        });
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((InputStream)((Object)\u0440\u0455o\u0435.a_bsm3("newInputStream", newInputStream(java.nio.file.Path java.nio.file.OpenOption[] ), (Path)file.toPath(), (OpenOption[])new OpenOption[0])), StandardCharsets.UTF_8));){
            JsonObject jsonObject = \u0440\u0455o\u0435.a_bsm4("parseReader", parseReader(java.io.Reader ), (Reader)bufferedReader).getAsJsonObject();
            for (ia\u0440a\u0440 ia\u0440a\u04402 : this.x\u043eh) {
                if (!jsonObject.has(ia\u0440a\u04402.o\u04bb\u0458\u043e\u0458())) continue;
                String string4 = jsonObject.get(ia\u0440a\u04402.o\u04bb\u0458\u043e\u0458()).getAsString();
                ia\u0440a\u04402.read(new BufferedReader(new StringReader(string4)));
            }
            String string5 = string;
            byte[] byArray = new byte[-1984258514 + 1984258542];
            byArray[0] = -407590003 + 407590035;
            byArray[1] = -448740909 + 448740841;
            byArray[2] = -248566410 + 248566336;
            byArray[3] = -599781573 + 599781635;
            byArray[4] = -1930095546 + 1930095580;
            byArray[5] = -636742350 + 636742310;
            byArray[-2063296492 + 2063296498] = -1033967286 + 1033967202;
            byArray[-386035660 + 386035667] = -891584624 + 891584666;
            byArray[-1996034073 + 1996034081] = -509593674 + 509593751;
            byArray[-1012103128 + 1012103137] = -309810685 + 309810599;
            byArray[-1594995340 + 1594995350] = -1841284312 + 1841284306;
            byArray[-585019598 + 585019609] = -1177459877 + 1177459976;
            byArray[-242167614 + 242167626] = -114569673 + 114569600;
            byArray[-1366389885 + 1366389898] = -1238834397 + 1238834305;
            byArray[-259800380 + 259800394] = -1090228237 + 1090228357;
            byArray[-505677925 + 505677940] = -1825884608 + 1825884711;
            byArray[-1673467299 + 1673467315] = -1601592160 + 1601592088;
            byArray[-980931974 + 980931991] = -889142387 + 889142473;
            byArray[-1093438667 + 1093438685] = -2109030601 + 2109030716;
            byArray[-1848118099 + 1848118118] = -1861515539 + 1861515514;
            byArray[-450386816 + 450386836] = -1762764431 + 1762764503;
            byArray[-1796489158 + 1796489179] = -1634157683 + 1634157756;
            byArray[-1697741419 + 1697741441] = -586324096 + 586324080;
            byArray[-1381219981 + 1381220004] = -764857315 + 764857291;
            byArray[-1187352976 + 1187353000] = -1107956169 + 1107956106;
            byArray[-259610978 + 259611003] = -1072692928 + 1072692867;
            byArray[-1945411057 + 1945411083] = -301600323 + 301600407;
            byArray[-2121968504 + 2121968531] = -1127593426 + 1127593326;
            \u0440\u0455o\u0435.a_bsm1("e\u04bb\u0445\u0435\u0441\u0445", e\u04bb\u0445\u0435\u0441\u0445(java.lang.String ), (String)((String)((Object)\u0440\u0455o\u0435.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-69983594 + 908988267), (int)(-1487970654 + 1005487259))) + string5));
        }
        catch (Exception exception) {
            String string6 = string;
            byte[] byArray = new byte[-1470816791 + 1470816814];
            byArray[0] = -1829978999 + 1829978990;
            byArray[1] = -1617084584 + 1617084462;
            byArray[2] = -1076951074 + 1076951135;
            byArray[3] = -1122515976 + 1122516044;
            byArray[4] = -491634696 + 491634820;
            byArray[5] = -2120960268 + 2120960348;
            byArray[-1108086599 + 1108086605] = -815567786 + 815567741;
            byArray[-2072180531 + 2072180538] = -1381520593 + 1381520579;
            byArray[-1075909607 + 1075909615] = -396648385 + 396648408;
            byArray[-1596554922 + 1596554931] = -1629138734 + 1629138747;
            byArray[-154601461 + 154601471] = -2008336600 + 2008336644;
            byArray[-1626614594 + 1626614605] = -2043346258 + 2043346180;
            byArray[-137002526 + 137002538] = -797996602 + 797996659;
            byArray[-1282645987 + 1282646000] = -1546982071 + 1546981963;
            byArray[-849286488 + 849286502] = -1449390347 + 1449390255;
            byArray[-2138270183 + 2138270198] = -575214083 + 575214028;
            byArray[-1225199580 + 1225199596] = -1260226084 + 1260225996;
            byArray[-1589424550 + 1589424567] = -1288999945 + 1288999825;
            byArray[-287514562 + 287514580] = -413254403 + 413254397;
            byArray[-1413425564 + 1413425583] = -680015324 + 680015320;
            byArray[-1709450041 + 1709450061] = -1501345066 + 1501345091;
            byArray[-29460025 + 29460046] = -150084196 + 150084114;
            byArray[-1513761375 + 1513761397] = -2051097305 + 2051097408;
            \u0455c\u0430jo\u043eh.error((String)((Object)\u0440\u0455o\u0435.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(1695945853 + 398813277), (int)(-1055071504 + 299626504))) + string6, (Throwable)exception);
            String string7 = string;
            byte[] byArray3 = new byte[-863486148 + 863486171];
            byArray3[0] = -306909638 + 306909738;
            byArray3[1] = -1054819285 + 1054819336;
            byArray3[2] = -881021324 + 881021208;
            byArray3[3] = -958796835 + 958796942;
            byArray3[4] = -338462570 + 338462683;
            byArray3[5] = -285306393 + 285306508;
            byArray3[-1200442776 + 1200442782] = -186004738 + 186004706;
            byArray3[-282696701 + 282696708] = -1623333903 + 1623334014;
            byArray3[-1518480998 + 1518481006] = -2093302384 + 2093302463;
            byArray3[-1136216697 + 1136216706] = -152484446 + 152484533;
            byArray3[-1579977843 + 1579977853] = -2053967072 + 2053967013;
            byArray3[-491952318 + 491952329] = -1291561984 + 1291561941;
            byArray3[-2055667859 + 2055667871] = -1844981887 + 1844981824;
            byArray3[-459751536 + 459751549] = -715527387 + 715527289;
            byArray3[-1528155484 + 1528155498] = -1747483654 + 1747483555;
            byArray3[-924659984 + 924659999] = -2043543465 + 2043543548;
            byArray3[-1203635498 + 1203635514] = -1177544717 + 1177544740;
            byArray3[-628701907 + 628701924] = -721012824 + 721012708;
            byArray3[-411160125 + 411160143] = -1768433984 + 1768433877;
            byArray3[-520115343 + 520115362] = -51923023 + 51922924;
            byArray3[-1176602364 + 1176602384] = -995780254 + 995780250;
            byArray3[-2113539790 + 2113539811] = -1640368331 + 1640368301;
            byArray3[-983280732 + 983280754] = -998794142 + 998794220;
            \u0440\u0455o\u0435.a_bsm1("e\u04bb\u0445\u0435\u0441\u0445", e\u04bb\u0445\u0435\u0441\u0445(java.lang.String ), (String)((String)((Object)\u0440\u0455o\u0435.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray3, (int)(516900697 + 245753372), (int)(633957586 + 1911696104))) + string7));
        }
    }

    public /* synthetic */ void e\u043e\u0430\u0441\u0455x\u0455(String string) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        String string2 = string;
        File file = new File(x\u0445ps\u0458, string2 + (String)((Object)\u0440\u0455o\u0435.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-804806399 + 804806477, -1014842770 + 1014842760, -34303989 + 34304101, -795956261 + 795956248, -1097922770 + 1097922726}, (int)(-1348636144 + 1399165170), (int)(1465608474 + 1218328287))));
        JsonObject jsonObject = new JsonObject();
        try {
            for (ia\u0440a\u0440 ia\u0440a\u04402 : this.x\u043eh) {
                StringWriter stringWriter = new StringWriter();
                BufferedWriter bufferedWriter = new BufferedWriter(stringWriter);
                ia\u0440a\u04402.save(bufferedWriter);
                bufferedWriter.flush();
                jsonObject.addProperty(ia\u0440a\u04402.o\u04bb\u0458\u043e\u0458(), stringWriter.toString());
            }
            try (BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter((OutputStream)((Object)\u0440\u0455o\u0435.a_bsm5("newOutputStream", newOutputStream(java.nio.file.Path java.nio.file.OpenOption[] ), (Path)file.toPath(), (OpenOption[])new OpenOption[0])), StandardCharsets.UTF_8));){
                bufferedWriter.write(jsonObject.toString());
                bufferedWriter.flush();
            }
            String string3 = string;
            byte[] byArray = new byte[-1377815097 + 1377815124];
            byArray[0] = -1238103186 + 1238103217;
            byArray[1] = -95592438 + 95592384;
            byArray[2] = -1680864212 + 1680864122;
            byArray[3] = -366798204 + 366798222;
            byArray[4] = -1811522881 + 1811522953;
            byArray[5] = -1453539373 + 1453539347;
            byArray[-202649515 + 202649521] = -115753576 + 115753694;
            byArray[-1826021226 + 1826021233] = -623091228 + 623091246;
            byArray[-1388396290 + 1388396298] = -39742296 + 39742313;
            byArray[-525730532 + 525730541] = -1807294594 + 1807294706;
            byArray[-1372240650 + 1372240660] = -442959414 + 442959464;
            byArray[-1507018498 + 1507018509] = -552948695 + 552948722;
            byArray[-1427803235 + 1427803247] = -875028903 + 875028946;
            byArray[-2039752124 + 2039752137] = -376379615 + 376379698;
            byArray[-1362113271 + 1362113285] = -632658970 + 632658854;
            byArray[-374205561 + 374205576] = -1119550546 + 1119550593;
            byArray[-1605836615 + 1605836631] = -1240290664 + 1240290775;
            byArray[-571314858 + 571314875] = -2068783660 + 2068783728;
            byArray[-1220546272 + 1220546290] = -201817788 + 201817811;
            byArray[-1109072019 + 1109072038] = -726461635 + 726461678;
            byArray[-1249279468 + 1249279488] = -1115314375 + 1115314354;
            byArray[-227856426 + 227856447] = -728895454 + 728895361;
            byArray[-342515684 + 342515706] = -157649036 + 157649144;
            byArray[-1789071896 + 1789071919] = -2140433723 + 2140433699;
            byArray[-1335325027 + 1335325051] = -1254791858 + 1254791942;
            byArray[-2037055708 + 2037055733] = -1520941532 + 1520941495;
            byArray[-207000854 + 207000880] = -1928003376 + 1928003364;
            \u0440\u0455o\u0435.a_bsm1("e\u04bb\u0445\u0435\u0441\u0445", e\u04bb\u0445\u0435\u0441\u0445(java.lang.String ), (String)((String)((Object)\u0440\u0455o\u0435.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(407967893 + 477043754), (int)(1087453356 + 1895921958))) + string3));
        }
        catch (Exception exception) {
            String string4 = string;
            byte[] byArray = new byte[-410701269 + 410701292];
            byArray[0] = -1206038580 + 1206038563;
            byArray[1] = -1526105457 + 1526105567;
            byArray[2] = -419403307 + 419403291;
            byArray[3] = 3;
            byArray[4] = -1361217504 + 1361217496;
            byArray[5] = -496978250 + 496978354;
            byArray[-931134492 + 931134498] = -637495962 + 637495895;
            byArray[-241107648 + 241107655] = -893778336 + 893778240;
            byArray[-1750313112 + 1750313120] = -1683403323 + 1683403441;
            byArray[-1306447775 + 1306447784] = -362238793 + 362238856;
            byArray[-857147482 + 857147492] = -1549633787 + 1549633710;
            byArray[-1516598026 + 1516598037] = -1334229136 + 1334229182;
            byArray[-1744326065 + 1744326077] = -1982864277 + 1982864313;
            byArray[-522804987 + 522805000] = -2007732502 + 2007732564;
            byArray[-163233328 + 163233342] = -155222913 + 155223039;
            byArray[-961713566 + 961713581] = -353193446 + 353193321;
            byArray[-600026831 + 600026847] = -364685585 + 364685545;
            byArray[-971466561 + 971466578] = -1555018044 + 1555017935;
            byArray[-1985994799 + 1985994817] = -936498369 + 936498487;
            byArray[-77192551 + 77192570] = -1842582897 + 1842582967;
            byArray[-770907387 + 770907407] = -1838625411 + 1838625462;
            byArray[-457147644 + 457147665] = -1438183409 + 1438183419;
            byArray[-2143296618 + 2143296640] = -2038564809 + 2038564765;
            \u0455c\u0430jo\u043eh.error((String)((Object)\u0440\u0455o\u0435.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(124629272 + 325478843), (int)(824441741 + 1165064968))) + string4, (Throwable)exception);
            String string5 = string;
            byte[] byArray2 = new byte[-479513313 + 479513336];
            byArray2[0] = -1884958560 + 1884958602;
            byArray2[1] = -2123707588 + 2123707462;
            byArray2[2] = -2107644935 + 2107645030;
            byArray2[3] = -117914394 + 117914318;
            byArray2[4] = -1616046664 + 1616046612;
            byArray2[5] = -1534164483 + 1534164541;
            byArray2[-293053664 + 293053670] = -2050072316 + 2050072361;
            byArray2[-919845125 + 919845132] = -224824492 + 224824478;
            byArray2[-478952031 + 478952039] = -723506001 + 723505923;
            byArray2[-893298764 + 893298773] = -43500425 + 43500451;
            byArray2[-548754490 + 548754500] = -1753681534 + 1753681488;
            byArray2[-1983707474 + 1983707485] = -940394019 + 940393916;
            byArray2[-1190319186 + 1190319198] = -1376291542 + 1376291639;
            byArray2[-1785777194 + 1785777207] = -1597919081 + 1597919134;
            byArray2[-648439475 + 648439489] = -1414135173 + 1414135167;
            byArray2[-880410696 + 880410711] = -1703150535 + 1703150453;
            byArray2[-1109062117 + 1109062133] = -230350303 + 230350341;
            byArray2[-715531992 + 715532009] = -918058174 + 918058293;
            byArray2[-1088848338 + 1088848356] = -520858605 + 520858729;
            byArray2[-1007091899 + 1007091918] = -1802562124 + 1802562062;
            byArray2[-1288681294 + 1288681314] = -1514957083 + 1514957001;
            byArray2[-1554555423 + 1554555444] = -1577016577 + 1577016574;
            byArray2[-858154568 + 858154590] = 2;
            \u0440\u0455o\u0435.a_bsm1("e\u04bb\u0445\u0435\u0441\u0445", e\u04bb\u0445\u0435\u0441\u0445(java.lang.String ), (String)((String)((Object)\u0440\u0455o\u0435.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray2, (int)(-1200398521 + 1316595621), (int)(1702391935 + 14153168))) + string5));
        }
    }

    public /* synthetic */ void i\u04bb\u04bbs\u0435() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        block11: for (ia\u0440a\u0440 ia\u0440a\u04402 : this.x\u043eh) {
            block15: {
                File file = new File(\u04bbx\u0458c\u0456xj, ia\u0440a\u04402.o\u04bb\u0458\u043e\u0458());
                try {
                    if (file.exists()) {
                        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((InputStream)((Object)\u0440\u0455o\u0435.a_bsm3("newInputStream", newInputStream(java.nio.file.Path java.nio.file.OpenOption[] ), (Path)file.toPath(), (OpenOption[])new OpenOption[0])), StandardCharsets.UTF_8));){
                            ia\u0440a\u04402.read(bufferedReader);
                            break block15;
                        }
                    }
                    this.\u04bbsa\u0430\u0435(ia\u0440a\u04402);
                }
                catch (IOException iOException) {
                    this.\u04bbsa\u0430\u0435(ia\u0440a\u04402);
                }
            }
            switch (0) {
                default: {
                    continue block11;
                }
                case 1: {
                    continue block11;
                }
                case 2: 
            }
        }
    }

    public /* synthetic */ void \u0441sp() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        for (ia\u0440a\u0440 ia\u0440a\u04402 : this.x\u043eh) {
            this.\u04bbsa\u0430\u0435(ia\u0440a\u04402);
        }
    }

    public /* synthetic */ void \u04bbsa\u0430\u0435(ia\u0440a\u0440 ia\u0440a\u04402) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        File file = new File(\u04bbx\u0458c\u0456xj, ia\u0440a\u04402.o\u04bb\u0458\u043e\u0458());
        try {
            if (!file.exists() && file.createNewFile()) {
                String string = file.getName();
                byte[] byArray = new byte[-704524821 + 704524834];
                byArray[0] = -8230485 + 8230542;
                byArray[1] = -708888607 + 708888645;
                byArray[2] = -94672752 + 94672868;
                byArray[3] = -1653892379 + 1653892343;
                byArray[4] = -710977382 + 710977496;
                byArray[5] = -1651680457 + 1651680489;
                byArray[-1619240417 + 1619240423] = -936815821 + 936815697;
                byArray[-1938335368 + 1938335375] = -919348049 + 919347998;
                byArray[-856256281 + 856256289] = -1398587660 + 1398587692;
                byArray[-412752637 + 412752646] = -1050068386 + 1050068489;
                byArray[-1528488075 + 1528488085] = -1915728898 + 1915728886;
                byArray[-1764230404 + 1764230415] = -412045156 + 412045070;
                byArray[-1857212926 + 1857212938] = -829915048 + 829914990;
                \u0455c\u0430jo\u043eh.info((String)((Object)\u0440\u0455o\u0435.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-638342228 + 1139438129), (int)(-1671958936 + 580112514))) + string + (String)((Object)\u0440\u0455o\u0435.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1843652673 + 1843652567}, (int)(24360487 + 1549510568), (int)(597198374 + 1612053895))));
            }
            try (BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter((OutputStream)((Object)\u0440\u0455o\u0435.a_bsm5("newOutputStream", newOutputStream(java.nio.file.Path java.nio.file.OpenOption[] ), (Path)file.toPath(), (OpenOption[])new OpenOption[0])), StandardCharsets.UTF_8));){
                ia\u0440a\u04402.save(bufferedWriter);
                bufferedWriter.flush();
            }
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }

    static {
        \u0455c\u0430jo\u043eh = LogManager.getLogger(\u0440\u0455o\u0435.class);
        byte[] byArray = new byte[-292112214 + 292112221];
        byArray[0] = -1979087165 + 1979087257;
        byArray[1] = -76800045 + 76800112;
        byArray[2] = -1821775326 + 1821775409;
        byArray[3] = -1220581510 + 1220581432;
        byArray[4] = -1752060975 + 1752060873;
        byArray[5] = -2133038698 + 2133038785;
        byArray[-2091029706 + 2091029712] = -614381711 + 614381704;
        \u04bbx\u0458c\u0456xj = new File(class_310.method_1551().field_1697, Cade0e18b60fd9f037d8b2fc8.cachedDecodeString(byArray, -903759770 + 340010494, 132081113 + 1532231001));
        byte[] byArray2 = new byte[-1876301142 + 1876301149];
        byArray2[0] = -720884956 + 720885013;
        byArray2[1] = -1377606386 + 1377606448;
        byArray2[2] = -825231517 + 825231575;
        byArray2[3] = -2106470815 + 2106470846;
        byArray2[4] = -158020466 + 158020431;
        byArray2[5] = -1;
        byArray2[-1029335720 + 1029335726] = -41049037 + 41049101;
        x\u0445ps\u0458 = new File(\u04bbx\u0458c\u0456xj, Cade0e18b60fd9f037d8b2fc8.cachedDecodeString(byArray2, -1165210227 + 2117266225, 1310916688 + 1373675443));
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

