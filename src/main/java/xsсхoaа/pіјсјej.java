/*
 * Decompiled with CFR 0.152.
 */
package xs\u0441\u0445oa\u0430;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_4587;
import org.joml.Matrix4fc;
import xs\u0441\u0445oa\u0430.i\u0435a;
import xs\u0441\u0445oa\u0430.\u0445\u0440\u0445s\u0456;
import xs\u0441\u0445oa\u0430.\u0458\u0435\u0455\u0440x\u04bb;

public class p\u0456\u0458\u0441\u0458ej {
    private static final /* synthetic */ class_310 ceo;
    public /* synthetic */ boolean c\u0440os;
    public /* synthetic */ double iscpa;
    private final /* synthetic */ i\u0435a \u0458\u0441\u0455s;
    private final /* synthetic */ int e\u0456\u0458oj\u0435s;
    private final /* synthetic */ int \u0455iapp;
    private final /* synthetic */ int ia\u0456\u0440;
    private final /* synthetic */ int os\u04bb\u043e\u04bbh;
    private /* synthetic */ ByteBuffer \u04bbj\u0455e\u04bb\u0435;
    private /* synthetic */ long op\u0430\u0458;
    private /* synthetic */ int xiaeo;
    private /* synthetic */ ByteBuffer i\u0455\u0440\u0440o;
    private /* synthetic */ long h\u0458\u0445s\u0458;
    private /* synthetic */ int \u0440s\u0456\u0441\u0458;
    private /* synthetic */ int h\u04bb\u04bbea\u04bbx;
    private /* synthetic */ boolean \u0455\u0440a\u0445\u043e\u0440\u0445;
    private /* synthetic */ boolean i\u0440\u0441h\u0441\u043e;
    private /* synthetic */ double a\u0458\u0445\u0441\u0456\u0456\u0430;
    private /* synthetic */ double ja\u0435\u0458\u0455j;
    private /* synthetic */ boolean cij\u0430p\u0456\u043e;

    public p\u0456\u0458\u0441\u0458ej(i\u0435a i\u0435a2, \u0445\u0440\u0445s\u0456 ... \u0445\u0440\u0445s\u0456Array) {
        int n;
        if (true | false) {
        }
        this.c\u0440os = false;
        this.iscpa = 1.0;
        int n2 = 0;
        \u0445\u0440\u0445s\u0456[] \u0445\u0440\u0445s\u0456Array2 = \u0445\u0440\u0445s\u0456Array;
        int n3 = \u0445\u0440\u0445s\u0456Array2.length;
        block4: for (n = 0; n < n3; ++n) {
            \u0445\u0440\u0445s\u0456 \u0445\u0440\u0445s\u04562 = \u0445\u0440\u0445s\u0456Array2[n];
            n2 += \u0445\u0440\u0445s\u04562.\u0435h\u043e\u0430\u04bb * 4;
            switch (0) {
                default: {
                    continue block4;
                }
                case 1: {
                    continue block4;
                }
                case 2: 
            }
        }
        this.\u0458\u0441\u0455s = i\u0435a2;
        this.e\u0456\u0458oj\u0435s = n2 * i\u0435a2.\u0455cjo;
        this.\u04bbj\u0455e\u04bb\u0435 = p\u0456\u0458\u0441\u0458ej.a_bsm0("createByteBuffer", createByteBuffer(int ), (int)(this.e\u0456\u0458oj\u0435s * (-1051741525 + 1051741781) * 4));
        this.op\u0430\u0458 = (long)p\u0456\u0458\u0441\u0458ej.a_bsm1("memAddress0", memAddress0(java.nio.Buffer ), (Buffer)this.\u04bbj\u0455e\u04bb\u0435);
        this.i\u0455\u0440\u0440o = p\u0456\u0458\u0441\u0458ej.a_bsm0("createByteBuffer", createByteBuffer(int ), (int)(i\u0435a2.\u0455cjo * (-846423081 + 846423593) * 4));
        this.h\u0458\u0445s\u0458 = (long)p\u0456\u0458\u0441\u0458ej.a_bsm1("memAddress0", memAddress0(java.nio.Buffer ), (Buffer)this.i\u0455\u0440\u0440o);
        this.\u0455iapp = (int)p\u0456\u0458\u0441\u0458ej.a_bsm2("c\u0455\u0430", c\u0455\u0430());
        p\u0456\u0458\u0441\u0458ej.a_bsm3("hs\u0430\u0430c\u0445\u0430", hs\u0430\u0430c\u0445\u0430(int ), (int)this.\u0455iapp);
        this.ia\u0456\u0440 = (int)p\u0456\u0458\u0441\u0458ej.a_bsm4("aj\u0458\u04bb\u0445o", aj\u0458\u04bb\u0445o());
        p\u0456\u0458\u0441\u0458ej.a_bsm5("\u0445xijxs\u0456", \u0445xijxs\u0456(int ), (int)this.ia\u0456\u0440);
        this.os\u04bb\u043e\u04bbh = (int)p\u0456\u0458\u0441\u0458ej.a_bsm4("aj\u0458\u04bb\u0445o", aj\u0458\u04bb\u0445o());
        p\u0456\u0458\u0441\u0458ej.a_bsm6("eo\u0440ic", eo\u0440ic(int ), (int)this.os\u04bb\u043e\u04bbh);
        int n4 = 0;
        for (n3 = 0; n3 < \u0445\u0440\u0445s\u0456Array.length; ++n3) {
            n = \u0445\u0440\u0445s\u0456Array[n3].\u0435h\u043e\u0430\u04bb;
            p\u0456\u0458\u0441\u0458ej.a_bsm7("\u0456ea\u0435\u0456\u0430s", \u0456ea\u0435\u0456\u0430s(int ), (int)n3);
            p\u0456\u0458\u0441\u0458ej.a_bsm8("i\u0455\u0458\u0430\u0441s\u0458", i\u0455\u0458\u0430\u0441s\u0458(int int int boolean int long ), (int)n3, (int)n, (int)(-1896225845 + 1896230971), (boolean)false, (int)n2, (long)n4);
            n4 += n * 4;
        }
        p\u0456\u0458\u0441\u0458ej.a_bsm3("hs\u0430\u0430c\u0445\u0430", hs\u0430\u0430c\u0445\u0430(int ), (int)0);
        p\u0456\u0458\u0441\u0458ej.a_bsm5("\u0445xijxs\u0456", \u0445xijxs\u0456(int ), (int)0);
        p\u0456\u0458\u0441\u0458ej.a_bsm6("eo\u0440ic", eo\u0440ic(int ), (int)0);
    }

    public /* synthetic */ void xhh() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (this.\u0455\u0440a\u0445\u043e\u0440\u0445) {
            byte[] byArray = new byte[-1111586725 + 1111586766];
            byArray[0] = -583649870 + 583649970;
            byArray[1] = -1617426987 + 1617426887;
            byArray[2] = -336810150 + 336810087;
            byArray[3] = -649535448 + 649535434;
            byArray[4] = -1510479919 + 1510479792;
            byArray[5] = -916244504 + 916244520;
            byArray[-1766048037 + 1766048043] = -311379942 + 311380024;
            byArray[-1738080868 + 1738080875] = -908640082 + 908639988;
            byArray[-264854523 + 264854531] = -2080645597 + 2080645589;
            byArray[-1691448921 + 1691448930] = -1510345098 + 1510345083;
            byArray[-581008732 + 581008742] = -1300582394 + 1300582368;
            byArray[-881114202 + 881114213] = -1679805271 + 1679805147;
            byArray[-1658769107 + 1658769119] = -460462970 + 460463097;
            byArray[-2118229435 + 2118229448] = -158874109 + 158874031;
            byArray[-618462671 + 618462685] = -1200604773 + 1200604709;
            byArray[-292307252 + 292307267] = -93291873 + 93291750;
            byArray[-305976583 + 305976599] = -1911395093 + 1911395054;
            byArray[-1583528792 + 1583528809] = -87749447 + 87749550;
            byArray[-1028145800 + 1028145818] = -1428183443 + 1428183463;
            byArray[-511700144 + 511700163] = -258003590 + 258003598;
            byArray[-948728924 + 948728944] = -559510787 + 559510734;
            byArray[-1328539508 + 1328539529] = -1401216975 + 1401216915;
            byArray[-1274074585 + 1274074607] = 3;
            byArray[-1794709107 + 1794709130] = -1644345030 + 1644345084;
            byArray[-1406797706 + 1406797730] = -1911838639 + 1911838619;
            byArray[-1140466490 + 1140466515] = -2136867338 + 2136867427;
            byArray[-1841915603 + 1841915629] = -145165251 + 145165241;
            byArray[-1410716821 + 1410716848] = -414950898 + 414950815;
            byArray[-363568741 + 363568769] = -1091355084 + 1091354993;
            byArray[-1407157759 + 1407157788] = -703265098 + 703265133;
            byArray[-670085341 + 670085371] = -1299572955 + 1299572894;
            byArray[-1333603811 + 1333603842] = -673981772 + 673981752;
            byArray[-1145288762 + 1145288794] = -2124851191 + 2124851254;
            byArray[-1143416007 + 1143416040] = -1842902217 + 1842902169;
            byArray[-2038097614 + 2038097648] = -1425584404 + 1425584465;
            byArray[-140639365 + 140639400] = -1061177987 + 1061177964;
            byArray[-1752786255 + 1752786291] = -480442471 + 480442584;
            byArray[-1544505779 + 1544505816] = -1494674262 + 1494674320;
            byArray[-1873788938 + 1873788976] = -1536893508 + 1536893387;
            byArray[-1595826468 + 1595826507] = -869137201 + 869137210;
            byArray[-968930615 + 968930655] = -1857487308 + 1857487406;
            throw new IllegalStateException((String)((Object)p\u0456\u0458\u0441\u0458ej.a_bsm9("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-1541373341 + 166996913), (int)(-168232889 + 625353463))));
        }
        this.xiaeo = 0;
        this.\u0440s\u0456\u0441\u0458 = 0;
        this.h\u04bb\u04bbea\u04bbx = 0;
        this.\u0455\u0440a\u0445\u043e\u0440\u0445 = true;
        this.a\u0458\u0445\u0441\u0456\u0456\u0430 = 0.0;
        this.ja\u0435\u0458\u0455j = 0.0;
    }

    public /* synthetic */ p\u0456\u0458\u0441\u0458ej \u0430p\u043eixjj(double d, double d2, double d3) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        long l2 = this.op\u0430\u0458 + (long)this.xiaeo * 4L;
        p\u0456\u0458\u0441\u0458ej.a_bsm10("memPutFloat", memPutFloat(long float ), (long)l2, (float)((float)(d - this.a\u0458\u0445\u0441\u0456\u0456\u0430)));
        p\u0456\u0458\u0441\u0458ej.a_bsm10("memPutFloat", memPutFloat(long float ), (long)(l2 + 4L), (float)((float)d2));
        p\u0456\u0458\u0441\u0458ej.a_bsm10("memPutFloat", memPutFloat(long float ), (long)(l2 + 8L), (float)((float)(d3 - this.ja\u0435\u0458\u0455j)));
        this.xiaeo += 3;
        return this;
    }

    public /* synthetic */ p\u0456\u0458\u0441\u0458ej jji(double d, double d2) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        long l2 = this.op\u0430\u0458 + (long)this.xiaeo * 4L;
        p\u0456\u0458\u0441\u0458ej.a_bsm10("memPutFloat", memPutFloat(long float ), (long)l2, (float)((float)d));
        p\u0456\u0458\u0441\u0458ej.a_bsm10("memPutFloat", memPutFloat(long float ), (long)(l2 + 4L), (float)((float)d2));
        this.xiaeo += 2;
        return this;
    }

    public /* synthetic */ p\u0456\u0458\u0441\u0458ej \u0430h\u04bb(Color color) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        long l2 = this.op\u0430\u0458 + (long)this.xiaeo * 4L;
        p\u0456\u0458\u0441\u0458ej.a_bsm10("memPutFloat", memPutFloat(long float ), (long)l2, (float)((float)color.getRed() / 255.0f));
        p\u0456\u0458\u0441\u0458ej.a_bsm10("memPutFloat", memPutFloat(long float ), (long)(l2 + 4L), (float)((float)color.getGreen() / 255.0f));
        p\u0456\u0458\u0441\u0458ej.a_bsm10("memPutFloat", memPutFloat(long float ), (long)(l2 + 8L), (float)((float)color.getBlue() / 255.0f));
        p\u0456\u0458\u0441\u0458ej.a_bsm10("memPutFloat", memPutFloat(long float ), (long)(l2 + 12L), (float)((float)color.getAlpha() / 255.0f * (float)this.iscpa));
        this.xiaeo += 4;
        return this;
    }

    public /* synthetic */ int \u0441\u0455ci() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return this.\u0440s\u0456\u0441\u0458++;
    }

    public /* synthetic */ void \u0440\u043e\u04bba\u0445a(int n, int n2) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        long l2 = this.h\u0458\u0445s\u0458 + (long)this.h\u04bb\u04bbea\u04bbx * 4L;
        p\u0456\u0458\u0441\u0458ej.a_bsm11("memPutInt", memPutInt(long int ), (long)l2, (int)n);
        p\u0456\u0458\u0441\u0458ej.a_bsm11("memPutInt", memPutInt(long int ), (long)(l2 + 4L), (int)n2);
        this.h\u04bb\u04bbea\u04bbx += 2;
        this.\u0455\u0445px();
    }

    public /* synthetic */ void \u0430\u0441\u0441p\u0435s(int n, int n2, int n3, int n4) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        long l2 = this.h\u0458\u0445s\u0458 + (long)this.h\u04bb\u04bbea\u04bbx * 4L;
        p\u0456\u0458\u0441\u0458ej.a_bsm11("memPutInt", memPutInt(long int ), (long)l2, (int)n);
        p\u0456\u0458\u0441\u0458ej.a_bsm11("memPutInt", memPutInt(long int ), (long)(l2 + 4L), (int)n2);
        p\u0456\u0458\u0441\u0458ej.a_bsm11("memPutInt", memPutInt(long int ), (long)(l2 + 8L), (int)n3);
        p\u0456\u0458\u0441\u0458ej.a_bsm11("memPutInt", memPutInt(long int ), (long)(l2 + 12L), (int)n3);
        p\u0456\u0458\u0441\u0458ej.a_bsm11("memPutInt", memPutInt(long int ), (long)(l2 + 16L), (int)n4);
        p\u0456\u0458\u0441\u0458ej.a_bsm11("memPutInt", memPutInt(long int ), (long)(l2 + 20L), (int)n);
        this.h\u04bb\u04bbea\u04bbx += -922610914 + 922610920;
        this.\u0455\u0445px();
    }

    public /* synthetic */ void \u0455\u0445px() {
        CallSite callSite;
        int n;
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if ((this.\u0440s\u0456\u0441\u0458 + 1) * this.e\u0456\u0458oj\u0435s >= this.\u04bbj\u0455e\u04bb\u0435.capacity()) {
            n = this.\u04bbj\u0455e\u04bb\u0435.capacity() * 2;
            if (n % this.e\u0456\u0458oj\u0435s != 0) {
                n += n % this.e\u0456\u0458oj\u0435s;
            }
            callSite = p\u0456\u0458\u0441\u0458ej.a_bsm0("createByteBuffer", createByteBuffer(int ), (int)n);
            p\u0456\u0458\u0441\u0458ej.a_bsm12("memCopy", memCopy(long long long ), (long)p\u0456\u0458\u0441\u0458ej.a_bsm1("memAddress0", memAddress0(java.nio.Buffer ), (Buffer)this.\u04bbj\u0455e\u04bb\u0435), (long)p\u0456\u0458\u0441\u0458ej.a_bsm1("memAddress0", memAddress0(java.nio.Buffer ), (Buffer)((Object)callSite)), (long)((long)this.xiaeo * 4L));
            this.\u04bbj\u0455e\u04bb\u0435 = callSite;
            this.op\u0430\u0458 = (long)p\u0456\u0458\u0441\u0458ej.a_bsm1("memAddress0", memAddress0(java.nio.Buffer ), (Buffer)this.\u04bbj\u0455e\u04bb\u0435);
        }
        if (this.h\u04bb\u04bbea\u04bbx * 4 >= this.i\u0455\u0440\u0440o.capacity()) {
            n = this.i\u0455\u0440\u0440o.capacity() * 2;
            if (n % this.\u0458\u0441\u0455s.\u0455cjo != 0) {
                n += n % (this.\u0458\u0441\u0455s.\u0455cjo * 4);
            }
            callSite = p\u0456\u0458\u0441\u0458ej.a_bsm0("createByteBuffer", createByteBuffer(int ), (int)n);
            p\u0456\u0458\u0441\u0458ej.a_bsm12("memCopy", memCopy(long long long ), (long)p\u0456\u0458\u0441\u0458ej.a_bsm1("memAddress0", memAddress0(java.nio.Buffer ), (Buffer)this.i\u0455\u0440\u0440o), (long)p\u0456\u0458\u0441\u0458ej.a_bsm1("memAddress0", memAddress0(java.nio.Buffer ), (Buffer)((Object)callSite)), (long)((long)this.h\u04bb\u04bbea\u04bbx * 4L));
            this.i\u0455\u0440\u0440o = callSite;
            this.h\u0458\u0445s\u0458 = (long)p\u0456\u0458\u0441\u0458ej.a_bsm1("memAddress0", memAddress0(java.nio.Buffer ), (Buffer)this.i\u0455\u0440\u0440o);
        }
    }

    public /* synthetic */ void ieh() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if (!this.\u0455\u0440a\u0445\u043e\u0440\u0445) {
            byte[] byArray = new byte[-1295855538 + 1295855575];
            byArray[0] = -520124901 + 520124953;
            byArray[1] = -630665022 + 630665052;
            byArray[2] = -1944746068 + 1944746111;
            byArray[3] = -1336517132 + 1336517222;
            byArray[4] = -1028226124 + 1028226116;
            byArray[5] = -135826366 + 135826247;
            byArray[-1373221790 + 1373221796] = -1158612422 + 1158612466;
            byArray[-529004887 + 529004894] = -1978051794 + 1978051875;
            byArray[-993710606 + 993710614] = -1345446960 + 1345446994;
            byArray[-1375611121 + 1375611130] = -1207259222 + 1207259113;
            byArray[-1645746082 + 1645746092] = -238711200 + 238711169;
            byArray[-1502875405 + 1502875416] = -1363818121 + 1363818239;
            byArray[-739567978 + 739567990] = -1165400522 + 1165400439;
            byArray[-1028157779 + 1028157792] = -1038070848 + 1038070765;
            byArray[-957785716 + 957785730] = -1950075539 + 1950075443;
            byArray[-766092780 + 766092795] = -669291896 + 669291817;
            byArray[-631636794 + 631636810] = -1043602280 + 1043602394;
            byArray[-1544959486 + 1544959503] = -1689448412 + 1689448462;
            byArray[-277508523 + 277508541] = -70949164 + 70949113;
            byArray[-1699409346 + 1699409365] = -1773950888 + 1773950955;
            byArray[-762298324 + 762298344] = -1378126115 + 1378126055;
            byArray[-2000917571 + 2000917592] = -2109813836 + 2109813816;
            byArray[-1123989291 + 1123989313] = -848412291 + 848412230;
            byArray[-1129129140 + 1129129163] = -353503149 + 353503204;
            byArray[-1951671928 + 1951671952] = -2033978175 + 2033978280;
            byArray[-100402031 + 100402056] = -192191346 + 192191434;
            byArray[-1221484641 + 1221484667] = -140386467 + 140386381;
            byArray[-1025919110 + 1025919137] = -1353981478 + 1353981505;
            byArray[-1482676368 + 1482676396] = -936128301 + 936128266;
            byArray[-128571912 + 128571941] = -620915037 + 620915154;
            byArray[-1855334787 + 1855334817] = -274522406 + 274522438;
            byArray[-2101850066 + 2101850097] = -423740651 + 423740677;
            byArray[-1575972079 + 1575972111] = -1650931688 + 1650931743;
            byArray[-1641626382 + 1641626415] = -137465280 + 137465172;
            byArray[-747401426 + 747401460] = -2055347586 + 2055347626;
            byArray[-1547340621 + 1547340656] = -359489302 + 359489345;
            byArray[-1902965524 + 1902965560] = -1585219708 + 1585219671;
            throw new IllegalStateException((String)((Object)p\u0456\u0458\u0441\u0458ej.a_bsm9("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(1541695125 + 1980984162), (int)(950261878 + 223702403))));
        }
        if (this.h\u04bb\u04bbea\u04bbx > 0) {
            p\u0456\u0458\u0441\u0458ej.a_bsm5("\u0445xijxs\u0456", \u0445xijxs\u0456(int ), (int)this.ia\u0456\u0440);
            p\u0456\u0458\u0441\u0458ej.a_bsm13("\u043e\u0440\u0440\u0445ha\u0430", \u043e\u0440\u0440\u0445ha\u0430(int java.nio.ByteBuffer int ), (int)(-650847597 + 650882559), (ByteBuffer)this.\u04bbj\u0455e\u04bb\u0435.limit(this.xiaeo * 4), (int)(-298887562 + 298922610));
            p\u0456\u0458\u0441\u0458ej.a_bsm5("\u0445xijxs\u0456", \u0445xijxs\u0456(int ), (int)0);
            p\u0456\u0458\u0441\u0458ej.a_bsm6("eo\u0440ic", eo\u0440ic(int ), (int)this.os\u04bb\u043e\u04bbh);
            p\u0456\u0458\u0441\u0458ej.a_bsm13("\u043e\u0440\u0440\u0445ha\u0430", \u043e\u0440\u0440\u0445ha\u0430(int java.nio.ByteBuffer int ), (int)(-533907099 + 533942062), (ByteBuffer)this.i\u0455\u0440\u0440o.limit(this.h\u04bb\u04bbea\u04bbx * 4), (int)(-913264755 + 913299803));
            p\u0456\u0458\u0441\u0458ej.a_bsm6("eo\u0440ic", eo\u0440ic(int ), (int)0);
        }
        this.\u0455\u0440a\u0445\u043e\u0440\u0445 = false;
    }

    public /* synthetic */ void x\u04bb\u0456(class_4587 class_45872) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (this.c\u0440os) {
            p\u0456\u0458\u0441\u0458ej.a_bsm14("c\u0440\u043e", c\u0440\u043e());
        } else {
            p\u0456\u0458\u0441\u0458ej.a_bsm15("\u04bbxs", \u04bbxs());
        }
        p\u0456\u0458\u0441\u0458ej.a_bsm16("ecjs\u04bba\u0441", ecjs\u04bba\u0441());
        p\u0456\u0458\u0441\u0458ej.a_bsm17("h\u0456\u0441js\u0456", h\u0456\u0441js\u0456());
        p\u0456\u0458\u0441\u0458ej.a_bsm18("oajs\u0445", oajs\u0445());
        if (this.i\u0440\u0441h\u0441\u043e) {
            CallSite callSite = p\u0456\u0458\u0441\u0458ej.a_bsm19("getModelViewStack", getModelViewStack());
            callSite.pushMatrix();
            if (class_45872 != null) {
                callSite.mul((Matrix4fc)class_45872.method_23760().method_23761());
            }
            class_243 class_2432 = p\u0456\u0458\u0441\u0458ej.ceo.field_1773.method_19418().method_19326();
            callSite.translate(0.0f, (float)(-class_2432.field_1351), 0.0f);
            p\u0456\u0458\u0441\u0458ej.a_bsm20("applyModelViewMatrix", applyModelViewMatrix());
        }
        this.cij\u0430p\u0456\u043e = true;
    }

    public /* synthetic */ void io\u0445iaee(class_4587 class_45872) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if (this.\u0455\u0440a\u0445\u043e\u0440\u0445) {
            this.ieh();
        }
        if (this.h\u04bb\u04bbea\u04bbx > 0) {
            boolean bl = this.cij\u0430p\u0456\u043e;
            if (!bl) {
                this.x\u04bb\u0456(class_45872);
            }
            this.beforeRender();
            \u0458\u0435\u0455\u0440x\u04bb.\u0455\u0458a.h\u0455j\u0430();
            p\u0456\u0458\u0441\u0458ej.a_bsm3("hs\u0430\u0430c\u0445\u0430", hs\u0430\u0430c\u0445\u0430(int ), (int)this.\u0455iapp);
            p\u0456\u0458\u0441\u0458ej.a_bsm21("\u0435\u0445ia\u0445", \u0435\u0445ia\u0445(int int int ), (int)this.\u0458\u0441\u0455s.getGL(), (int)this.h\u04bb\u04bbea\u04bbx, (int)(-986503152 + 986508277));
            p\u0456\u0458\u0441\u0458ej.a_bsm3("hs\u0430\u0430c\u0445\u0430", hs\u0430\u0430c\u0445\u0430(int ), (int)0);
            if (!bl) {
                this.oieo\u0456();
            }
        }
    }

    public /* synthetic */ void oieo\u0456() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (this.i\u0440\u0441h\u0441\u043e) {
            p\u0456\u0458\u0441\u0458ej.a_bsm19("getModelViewStack", getModelViewStack()).popMatrix();
        }
        if (this.c\u0440os) {
            p\u0456\u0458\u0441\u0458ej.a_bsm22("sesoi\u04bb", sesoi\u04bb());
        } else {
            p\u0456\u0458\u0441\u0458ej.a_bsm16("ecjs\u04bba\u0441", ecjs\u04bba\u0441());
        }
        p\u0456\u0458\u0441\u0458ej.a_bsm22("sesoi\u04bb", sesoi\u04bb());
        p\u0456\u0458\u0441\u0458ej.a_bsm23("\u0440\u0441hii\u04bb", \u0440\u0441hii\u04bb());
        p\u0456\u0458\u0441\u0458ej.a_bsm24("c\u04bbs\u0455", c\u04bbs\u0455());
        this.cij\u0430p\u0456\u043e = false;
    }

    protected /* synthetic */ void beforeRender() {
    }

    static {
        ceo = class_310.method_1551();
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
}

