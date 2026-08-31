/*
 * Decompiled with CFR 0.152.
 */
package \u0458o\u0440;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.HashMap;
import \u0458x\u0458\u0435ah\u04bb.\u0455\u0456\u0440e;
import \u04bbejhxj.ia\u0440a\u0440;

public class \u0458\u0441\u0458\u0430ej
extends ia\u0440a\u0440 {
    private static final /* synthetic */ Gson j\u0441\u0456\u0441\u0456;
    public static /* synthetic */ HashMap<String, \u0455\u0456\u0440e> p\u04bb\u0435esse;

    public \u0458\u0441\u0458\u0430ej() {
        if (2 * 2 * 2 >= 0) {
        }
        byte[] byArray = new byte[-1491986022 + 1491986034];
        byArray[0] = -453679648 + 453679525;
        byArray[1] = -463289682 + 463289728;
        byArray[2] = -1414909930 + 1414909942;
        byArray[3] = -770988893 + 770988956;
        byArray[4] = -49393982 + 49393996;
        byArray[5] = -1657818660 + 1657818563;
        byArray[-1327872493 + 1327872499] = -1654183305 + 1654183413;
        byArray[-88143706 + 88143713] = -1770300309 + 1770300325;
        byArray[-1193434750 + 1193434758] = -458700050 + 458700140;
        byArray[-871979116 + 871979125] = -1146170889 + 1146170943;
        byArray[-1126441769 + 0x43242333] = -696607351 + 696607391;
        byArray[-1040409585 + 1040409596] = -559757735 + 559757659;
        super((String)((Object)\u0458\u0441\u0458\u0430ej.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(2058398931 + 1396580635), (int)(-1159670721 + 284817307))));
    }

    @Override
    public /* synthetic */ void read(BufferedReader bufferedReader) throws IOException {
        \u0455\u0456\u0440e[] \u0455\u0456\u0440eArray;
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (!this.jp\u0456scjx().exists()) {
            return;
        }
        try {
            \u0455\u0456\u0440eArray = (\u0455\u0456\u0440e[])j\u0441\u0456\u0441\u0456.fromJson(new String((byte[])\u0458\u0441\u0458\u0430ej.a_bsm1("readAllBytes", readAllBytes(java.nio.file.Path ), (Path)this.jp\u0456scjx().toPath()), StandardCharsets.UTF_8), \u0455\u0456\u0440e[].class);
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            byte[] byArray = new byte[-627333718 + 627333743];
            byArray[0] = -1812945638 + 1812945737;
            byArray[1] = -1798607350 + 1798607249;
            byArray[2] = -196998533 + 196998441;
            byArray[3] = -1659983134 + 1659983101;
            byArray[4] = -316445998 + 316445886;
            byArray[5] = -1167759580 + 1167759635;
            byArray[-34161811 + 34161817] = -805946654 + 805946678;
            byArray[-762128024 + 762128031] = -1811373495 + 1811373393;
            byArray[-795404177 + 795404185] = -658154750 + 658154655;
            byArray[-302637035 + 302637044] = -1211968045 + 1211968136;
            byArray[-427942880 + 427942890] = -1192120543 + 1192120463;
            byArray[-788748532 + 788748543] = -1518236606 + 1518236514;
            byArray[-6484815 + 6484827] = -1860911493 + 1860911411;
            byArray[-1070181125 + 1070181138] = -741143793 + 741143756;
            byArray[-1278046249 + 1278046263] = -840953503 + 840953516;
            byArray[-271682555 + 271682570] = -732824739 + 732824805;
            byArray[-1832934974 + 1832934990] = -1972151995 + 1972151891;
            byArray[-137717595 + 137717612] = -1511497495 + 1511497489;
            byArray[-1797700237 + 1797700255] = -1130770879 + 1130770972;
            byArray[-43036423 + 43036442] = -1834016566 + 1834016558;
            byArray[-154327947 + 154327967] = -1779979305 + 1779979288;
            byArray[-100482460 + 100482481] = -210353715 + 210353631;
            byArray[-1346587666 + 1346587688] = -1031616487 + 1031616532;
            byArray[-389956716 + 389956739] = -1059651525 + 1059651587;
            byArray[-675949289 + 675949313] = -1418665437 + 1418665311;
            System.out.println((String)((Object)\u0458\u0441\u0458\u0430ej.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-910212684 + 1461837612), (int)(-1424917549 + 1007446858))));
            return;
        }
        for (\u0455\u0456\u0440e \u0455\u0456\u0440e2 : \u0455\u0456\u0440eArray) {
            if (!p\u04bb\u0435esse.containsKey(\u0455\u0456\u0440e2.getName())) continue;
            \u0455\u0456\u0440e \u0455\u0456\u0440e3 = p\u04bb\u0435esse.get(\u0455\u0456\u0440e2.getName());
            \u0455\u0456\u0440e3.pc\u0440xjh\u04bb(\u0455\u0456\u0440e2.a\u0458ea\u0440c\u0441());
            \u0455\u0456\u0440e3.oos\u0456\u0456i(\u0455\u0456\u0440e2.i\u0440x\u0435\u0430hj());
            p\u04bb\u0435esse.put(\u0455\u0456\u0440e2.getName(), \u0455\u0456\u0440e3);
        }
    }

    @Override
    public /* synthetic */ void save(BufferedWriter bufferedWriter) throws IOException {
        try {
            if (2 * 2 * 2 >= 0) {
            }
            if (0 != 0) {
            }
            this.jp\u0456scjx().createNewFile();
            \u0458\u0441\u0458\u0430ej.a_bsm2("write", write(java.nio.file.Path byte[] java.nio.file.OpenOption[] ), (Path)this.jp\u0456scjx().toPath(), (byte[])j\u0441\u0456\u0441\u0456.toJson(p\u04bb\u0435esse.values()).getBytes(StandardCharsets.UTF_8), (OpenOption[])new OpenOption[0]);
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            byte[] byArray = new byte[-524738632 + 524738657];
            byArray[0] = -1088376320 + 1088376225;
            byArray[1] = -1;
            byArray[2] = -641111978 + 641111996;
            byArray[3] = -396159752 + 396159841;
            byArray[4] = -1227501046 + 1227500931;
            byArray[5] = -824170856 + 824170931;
            byArray[-1266173254 + 1266173260] = -807485655 + 807485737;
            byArray[-379600792 + 379600799] = -1280671047 + 1280670932;
            byArray[-107564278 + 107564286] = -766736616 + 766736733;
            byArray[-1940739617 + 1940739626] = -1520922009 + 1520921917;
            byArray[-1302530678 + 1302530688] = -1815661717 + 1815661676;
            byArray[-536576864 + 536576875] = -1857416646 + 1857416542;
            byArray[-776636129 + 776636141] = -1058185690 + 1058185687;
            byArray[-997282674 + 997282687] = -1302541226 + 1302541242;
            byArray[-1629555858 + 1629555872] = -798239810 + 798239896;
            byArray[-646226280 + 646226295] = -1428993527 + 1428993630;
            byArray[-1569777178 + 1569777194] = -1880433613 + 1880433711;
            byArray[-346709130 + 346709147] = -1431532645 + 1431532543;
            byArray[-670685772 + 670685790] = -1720894498 + 1720894538;
            byArray[-1431183295 + 1431183314] = -505509099 + 505509039;
            byArray[-401086325 + 401086345] = -393796818 + 393796879;
            byArray[-541629700 + 541629721] = -1250188475 + 1250188348;
            byArray[-228155305 + 228155327] = -213868131 + 213868042;
            byArray[-66715418 + 66715441] = -1385728009 + 1385728037;
            byArray[-660564024 + 660564048] = 2;
            System.out.println((String)((Object)\u0458\u0441\u0458\u0430ej.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(1746882070 + 1269130670), (int)(-1946673729 + 354255702))));
            return;
        }
    }

    static {
        j\u0441\u0456\u0441\u0456 = new GsonBuilder().setPrettyPrinting().excludeFieldsWithoutExposeAnnotation().create();
        p\u04bb\u0435esse = new HashMap();
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

