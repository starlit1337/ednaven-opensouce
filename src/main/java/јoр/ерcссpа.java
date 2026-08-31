/*
 * Decompiled with CFR 0.152.
 */
package \u0458o\u0440;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.ArrayList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import \u0430\u0456j\u0435x.xi\u0440o\u0440jj;
import \u0440o\u0456\u0445o.\u0445\u0440\u0430\u0435\u0445\u043e;
import \u0445eo.c\u0455pi;
import \u0445eo.xc\u0435x\u04bb\u0435;
import \u04bbejhxj.ia\u0440a\u0440;

public class \u0435\u0440c\u0441\u0441p\u0430
extends ia\u0440a\u0440 {
    private static final /* synthetic */ Logger icc;

    public \u0435\u0440c\u0441\u0441p\u0430() {
        if (true | false) {
        }
        byte[] byArray = new byte[-1183772465 + 1183772476];
        byArray[0] = -583394807 + 583394724;
        byArray[1] = -2134977016 + 2134976975;
        byArray[2] = -584434796 + 584434679;
        byArray[3] = -1101953111 + 1101953106;
        byArray[4] = -2056238818 + 2056238797;
        byArray[5] = -2144775805 + 2144775831;
        byArray[-211416645 + 211416651] = -2086722165 + 2086722039;
        byArray[-1125549676 + 1125549683] = -321823333 + 321823318;
        byArray[-1800044407 + 1800044415] = -940003115 + 940003241;
        byArray[-1894005305 + 1894005314] = -1242702703 + 1242702725;
        byArray[-1229265526 + 1229265536] = -1775424161 + 1775424120;
        super((String)((Object)\u0435\u0440c\u0441\u0441p\u0430.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(1315433542 + 149121797), (int)(2073970966 + 2138223098))));
    }

    @Override
    public /* synthetic */ void read(BufferedReader bufferedReader) throws IOException {
        String string;
        if (true | false) {
        }
        if (0 != 0) {
        }
        xc\u0435x\u04bb\u0435 xc\u0435x\u04bb\u04352 = ((\u0445\u0440\u0430\u0435\u0445\u043e)((Object)\u0435\u0440c\u0441\u0441p\u0430.a_bsm1("jaa\u0435\u0445c", jaa\u0435\u0445c()))).\u0430o\u0441\u0456p\u0455();
        while ((string = bufferedReader.readLine()) != null) {
            String[] stringArray = string.split((String)((Object)\u0435\u0440c\u0441\u0441p\u0430.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1242455448 + 1242455497}, (int)(1499602526 + 150356985), (int)(-400924335 + 470917850))), 3);
            if (stringArray.length != 3) {
                byte[] byArray = new byte[-113991694 + 113991717];
                byArray[0] = -1023718781 + 1023718656;
                byArray[1] = -2050184161 + 2050184178;
                byArray[2] = -169174720 + 169174637;
                byArray[3] = -1971312427 + 1971312539;
                byArray[4] = -936402487 + 936402496;
                byArray[5] = -546952300 + 546952189;
                byArray[-5341393 + 5341399] = 4;
                byArray[-664623945 + 664623952] = -213923001 + 213922917;
                byArray[-402624287 + 402624295] = -624100453 + 624100352;
                byArray[-461138331 + 461138340] = -937057820 + 937057721;
                byArray[-374333204 + 374333214] = -471023350 + 471023418;
                byArray[-1673225803 + 1673225814] = -119300175 + 119300276;
                byArray[-5426885 + 5426897] = -957339228 + 957339350;
                byArray[-906350491 + 906350504] = -1304986283 + 1304986337;
                byArray[-959810709 + 959810723] = -238781193 + 238781138;
                byArray[-2084658207 + 2084658222] = -1603728359 + 1603728354;
                byArray[-620070459 + 620070475] = -1731643105 + 1731643056;
                byArray[-995289896 + 995289913] = -1346856571 + 1346856586;
                byArray[-810231865 + 810231883] = -1621300350 + 1621300322;
                byArray[-329372103 + 329372122] = -1408752050 + 1408752168;
                byArray[-323410678 + 323410698] = -811068474 + 811068513;
                byArray[-1730064000 + 1730064021] = -519009720 + 519009763;
                byArray[-371357562 + 371357584] = 2;
                icc.error((String)((Object)\u0435\u0440c\u0441\u0441p\u0430.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(773884460 + 149466332), (int)(-1536465342 + 1333497252))), (Object)string);
                continue;
            }
            String string2 = stringArray[0];
            CallSite callSite = \u0435\u0440c\u0441\u0441p\u0430.a_bsm2("parseInt", parseInt(java.lang.String ), (String)stringArray[1]);
            CallSite callSite2 = \u0435\u0440c\u0441\u0441p\u0430.a_bsm3("parseBoolean", parseBoolean(java.lang.String ), (String)stringArray[2]);
            try {
                c\u0455pi c\u0455pi2 = xc\u0435x\u04bb\u04352.s\u0445\u043e\u0458i(string2);
                c\u0455pi2.\u04bb\u0441\u0440x((int)callSite);
                c\u0455pi2.setEnabled((boolean)callSite2);
            }
            catch (xi\u0440o\u0440jj xi\u0440o\u0440jj2) {
                byte[] byArray = new byte[-1280866344 + 1280866369];
                byArray[0] = -1668484539 + 1668484574;
                byArray[1] = -939713155 + 939713037;
                byArray[2] = -1880475682 + 1880475620;
                byArray[3] = -1221745986 + 1221745858;
                byArray[4] = -1670018687 + 1670018792;
                byArray[5] = -379062736 + 379062696;
                byArray[-1181656666 + 1181656672] = -1744140808 + 1744140713;
                byArray[-1343605801 + 1343605808] = -281205534 + 281205614;
                byArray[-144077937 + 144077945] = -1962112898 + 1962112986;
                byArray[-1954381559 + 1954381568] = -419907892 + 419907806;
                byArray[-1262373541 + 1262373551] = -43263757 + 43263710;
                byArray[-282945849 + 282945860] = -1074628052 + 1074628106;
                byArray[-1675590658 + 1675590670] = -1812221574 + 1812221700;
                byArray[-909562356 + 909562369] = -1382780350 + 1382780295;
                byArray[-590098473 + 590098487] = -241451958 + 241451939;
                byArray[-1885601639 + 1885601654] = -1184215300 + 1184215422;
                byArray[-527127546 + 527127562] = -1423841149 + 1423841146;
                byArray[-620007613 + 620007630] = -482733069 + 482733023;
                byArray[-639281883 + 639281901] = -1382511835 + 1382511928;
                byArray[-118716779 + 118716798] = -447922176 + 447922102;
                byArray[-1255434920 + 1255434940] = -189873698 + 189873687;
                byArray[-730535980 + 730536001] = -2020187618 + 2020187542;
                byArray[-732064823 + 732064845] = -898052194 + 898052258;
                byArray[-176784279 + 176784302] = -665705682 + 665705777;
                byArray[-1463786118 + 1463786142] = 1;
                icc.error((String)((Object)\u0435\u0440c\u0441\u0441p\u0430.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-1357633409 + 1929640344), (int)(-818856115 + 915326578))), (Object)string2);
            }
        }
    }

    @Override
    public /* synthetic */ void save(BufferedWriter bufferedWriter) throws IOException {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        xc\u0435x\u04bb\u0435 xc\u0435x\u04bb\u04352 = ((\u0445\u0440\u0430\u0435\u0445\u043e)((Object)\u0435\u0440c\u0441\u0441p\u0430.a_bsm1("jaa\u0435\u0445c", jaa\u0435\u0445c()))).\u0430o\u0441\u0456p\u0455();
        for (c\u0455pi c\u0455pi2 : new ArrayList<c\u0455pi>(xc\u0435x\u04bb\u04352.h\u0445ca())) {
            byte[] byArray = new byte[-1599260033 + 1599260042];
            byArray[0] = -328860877 + 328860795;
            byArray[1] = -433493566 + 433493675;
            byArray[2] = -749647325 + 749647355;
            byArray[3] = -1787140825 + 1787140896;
            byArray[4] = -287799231 + 287799248;
            byArray[5] = -1391704874 + 1391704932;
            byArray[-891792912 + 891792918] = -472423433 + 472423474;
            byArray[-600281371 + 600281378] = -891244722 + 891244746;
            byArray[-1195799685 + 1195799693] = -384515540 + 384515614;
            bufferedWriter.write((String)((Object)\u0435\u0440c\u0441\u0441p\u0430.a_bsm6("format", format(java.lang.String java.lang.Object[] ), (String)((Object)\u0435\u0440c\u0441\u0441p\u0430.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-1266039250 + 1009134209), (int)(-1103220034 + 1832319159))), (Object[])new Object[]{c\u0455pi2.getName(), \u0435\u0440c\u0441\u0441p\u0430.a_bsm4("valueOf", valueOf(int ), (int)c\u0455pi2.x\u04bb\u043e\u04bb\u0456x()), \u0435\u0440c\u0441\u0441p\u0430.a_bsm5("valueOf", valueOf(boolean ), (boolean)c\u0455pi2.\u0440\u0435\u0455x\u0435xe())})));
        }
    }

    static {
        icc = LogManager.getLogger(\u0435\u0440c\u0441\u0441p\u0430.class);
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
}

