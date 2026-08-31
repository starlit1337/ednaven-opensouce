/*
 * Decompiled with CFR 0.152.
 */
package \u0445\u0430p\u0440;

import c\u0445is.i\u0456o\u0430\u0435o;
import c\u0445is.s\u0456a\u0458;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import net.minecraft.class_1297;
import net.minecraft.class_1308;
import net.minecraft.class_1429;
import net.minecraft.class_1542;
import net.minecraft.class_1657;
import net.minecraft.class_1667;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_4587;
import net.minecraft.class_757;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector4d;
import org.joml.Vector4f;
import o\u0455sio\u0440.\u0445\u0458\u0458h\u0445\u0430a;
import spso.\u0430c\u0440;
import spso.\u0441a\u0458p;
import \u0435xp.h\u04bb\u0455hpa;
import \u0435xp.o\u043ea\u0456c;
import \u0445eo.c\u0455pi;
import \u0445eo.\u0456p\u0430\u043e\u0458\u043e;
import \u0445eo.\u0458i\u0456x;

@\u0456p\u0430\u043e\u0458\u043e(sp\u0456p\u0445\u0435="ESP", a\u0456j\u0430\u0455\u04bb="Perspective Target", s\u0455cj=\u0458i\u0456x.RENDER)
public class \u043ex\u0458\u043exxj
extends c\u0455pi {
    private static final /* synthetic */ float[] px\u0441eoo\u0430;
    private final /* synthetic */ Map<class_1297, Vector4d> \u0435\u04bbc\u0445\u0458;
    public /* synthetic */ o\u043ea\u0456c ao\u0455x;
    public /* synthetic */ o\u043ea\u0456c cj\u0445i\u0445;
    private final /* synthetic */ h\u04bb\u0455hpa o\u0455\u0456;
    private final /* synthetic */ h\u04bb\u0455hpa h\u0445s\u0435jsi;
    private final /* synthetic */ h\u04bb\u0455hpa x\u0458\u043e\u0455;
    private final /* synthetic */ h\u04bb\u0455hpa a\u0441\u0440e;
    private final /* synthetic */ h\u04bb\u0455hpa \u0441is\u0430e\u0456;
    public static /* synthetic */ \u043ex\u0458\u043exxj \u0445xp\u0430;

    public \u043ex\u0458\u043exxj() {
        if (true | false) {
        }
        this.\u0435\u04bbc\u0445\u0458 = new WeakHashMap<class_1297, Vector4d>();
        this.ao\u0455x = ((\u0430c\u0440)((Object)\u043ex\u0458\u043exxj.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)\u043ex\u0458\u043exxj.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-420047451 + 420047408, -1093454497 + 1093454454, -301345069 + 301345045, -1604491136 + 1604491192}, (int)(-1365933456 + 1632275823), (int)(1689125473 + 1321054474)))))).\u0455iaip\u0458e(new String[]{\u043ex\u0458\u043exxj.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1970496622 + 1970496637, -6063530 + 0x5C858C}, (int)(883240251 + 936984387), (int)(1643270500 + 1666348000)), \u043ex\u0458\u043exxj.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1735499 + 1735415, -1752300665 + 1752300788, -299559804 + 299559771}, (int)(-349971083 + 1439523707), (int)(1745389804 + 1291201554)), \u043ex\u0458\u043exxj.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-326687261 + 326687133, -1558083228 + 1558083121, -74326971 + 74327045, -1276624028 + 1276623957}, (int)(-1357049149 + 1269753864), (int)(1250193424 + 792529329))}).\u0458c\u0456\u0440().getModeValue();
        byte[] byArray = new byte[-121264710 + 121264720];
        byArray[0] = -118044635 + 118044596;
        byArray[1] = -325753805 + 325753874;
        byArray[2] = -1682950655 + 1682950641;
        byArray[3] = -1377431232 + 1377431143;
        byArray[4] = -2091133132 + 2091133214;
        byArray[5] = -2131519045 + 2131519006;
        byArray[-694998041 + 694998047] = -2112265708 + 2112265680;
        byArray[-1401616684 + 1401616691] = -1708650840 + 1708650720;
        byArray[-438438257 + 438438265] = -28325787 + 28325730;
        byArray[-1123304970 + 1123304979] = -1124544999 + 1124544969;
        String[] stringArray = new String[2];
        byte[] byArray2 = new byte[-869967435 + 869967442];
        byArray2[0] = -1398658540 + 1398658570;
        byArray2[1] = -1652675981 + 1652676096;
        byArray2[2] = -1343174085 + 1343173993;
        byArray2[3] = -773351584 + 773351687;
        byArray2[4] = -622999067 + 622999111;
        byArray2[5] = -1707661569 + 1707661539;
        byArray2[-950982536 + 950982542] = -1151206534 + 1151206660;
        stringArray[0] = \u043ex\u0458\u043exxj.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray2, (int)(1733049787 + 1900649178), (int)(761696786 + 1307502914));
        byte[] byArray3 = new byte[-1431525959 + 1431525965];
        byArray3[0] = -1391134959 + 1391135007;
        byArray3[1] = -393755375 + 393755329;
        byArray3[2] = -1657853455 + 1657853503;
        byArray3[3] = -1477243248 + 1477243323;
        byArray3[4] = -1599897448 + 1599897519;
        byArray3[5] = -1876033226 + 1876033317;
        stringArray[1] = \u043ex\u0458\u043exxj.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray3, (int)(-620494870 + 144827323), (int)(848993183 + 226337912));
        this.cj\u0445i\u0445 = ((\u0430c\u0440)((Object)\u043ex\u0458\u043exxj.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)\u043ex\u0458\u043exxj.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-1862628272 + 1137330292), (int)(1151351764 + 1911716541)))))).\u0455iaip\u0458e(stringArray).p\u0441\u0445(() -> {
            if (true | false) {
            }
            return \u043ex\u0458\u043exxj.a_bsm18("valueOf", valueOf(boolean ), (boolean)this.ao\u0455x.cip((String)((Object)\u043ex\u0458\u043exxj.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-542237013 + 542237068, -1622536375 + 1622536481}, (int)(-1805998079 + 522849155), (int)(1425003963 + 1854664128)))));
        }).\u0458c\u0456\u0440().getModeValue();
        byte[] byArray4 = new byte[-1323357965 + 1323357971];
        byArray4[0] = -1948235022 + 1948235144;
        byArray4[1] = -1519116844 + 1519116860;
        byArray4[2] = -147882640 + 147882735;
        byArray4[3] = -1850769712 + 1850769772;
        byArray4[4] = -1847392840 + 1847392906;
        byArray4[5] = -17146726 + 17146602;
        this.o\u0455\u0456 = ((\u0430c\u0440)((Object)\u043ex\u0458\u043exxj.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)\u043ex\u0458\u043exxj.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray4, (int)(-433893743 + 1083889708), (int)(178688615 + 623615338)))))).\u0455xi\u0440(true).\u0458c\u0456\u0440().getBooleanValue();
        this.h\u0445s\u0435jsi = ((\u0430c\u0440)((Object)\u043ex\u0458\u043exxj.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)\u043ex\u0458\u043exxj.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1, -897435470 + 897435479, -1626696241 + 1626696116, -1181306564 + 1181306452, -1475353162 + 1475353156}, (int)(1703128018 + 1912548272), (int)(-797040102 + 1898782608)))))).\u0455xi\u0440(false).\u0458c\u0456\u0440().getBooleanValue();
        this.x\u0458\u043e\u0455 = ((\u0430c\u0440)((Object)\u043ex\u0458\u043exxj.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)\u043ex\u0458\u043exxj.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1386258603 + 1386258630, -314632510 + 314632385, -1397055211 + 1397055125, -1336419992 + 1336420063}, (int)(-1340097205 + 586749389), (int)(-90683919 + 919464820)))))).\u0455xi\u0440(false).\u0458c\u0456\u0440().getBooleanValue();
        byte[] byArray5 = new byte[-302116742 + 302116749];
        byArray5[0] = -726586339 + 726586350;
        byArray5[1] = -1960155676 + 1960155646;
        byArray5[2] = -385185918 + 385185797;
        byArray5[3] = -243237647 + 243237521;
        byArray5[4] = -2013375340 + 2013375385;
        byArray5[5] = -27981516 + 27981621;
        byArray5[-630414243 + 630414249] = -1155342402 + 1155342491;
        this.a\u0441\u0440e = ((\u0430c\u0440)((Object)\u043ex\u0458\u043exxj.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)\u043ex\u0458\u043exxj.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray5, (int)(-1669721122 + 560900618), (int)(-1108364030 + 943276326)))))).\u0455xi\u0440(false).\u0458c\u0456\u0440().getBooleanValue();
        byte[] byArray6 = new byte[-327054509 + 327054515];
        byArray6[0] = -93964094 + 93963974;
        byArray6[1] = -1742009312 + 1742009247;
        byArray6[2] = -421605704 + 421605794;
        byArray6[3] = -1039471536 + 1039471428;
        byArray6[4] = -573668847 + 573668898;
        byArray6[5] = -478114349 + 478114282;
        this.\u0441is\u0430e\u0456 = ((\u0430c\u0440)((Object)\u043ex\u0458\u043exxj.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)\u043ex\u0458\u043exxj.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray6, (int)(197613406 + 436260457), (int)(-130575134 + 264860446)))))).\u0455xi\u0440(false).\u0458c\u0456\u0440().getBooleanValue();
        \u0445xp\u0430 = this;
    }

    @\u0445\u0458\u0458h\u0445\u0430a
    public void aj\u043e\u0441\u0455\u0445(s\u0456a\u0458 s\u0456a\u04582) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (!this.ao\u0455x.cip((String)((Object)\u043ex\u0458\u043exxj.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1140153418 + 1140153308, -46213434 + 46213418}, (int)(303847372 + 1949970058), (int)(1120993463 + 351557390))))) {
            return;
        }
        for (Map.Entry<class_1297, Vector4d> entry : this.\u0435\u04bbc\u0445\u0458.entrySet()) {
            Vector4d vector4d = entry.getValue();
            float f = (float)vector4d.x;
            float f2 = (float)vector4d.y;
            float f3 = (float)(vector4d.z - vector4d.x);
            float f4 = (float)(vector4d.w - vector4d.y);
            \u043ex\u0458\u043exxj.a_bsm2("hjjh\u0455e\u0456", hjjh\u0455e\u0456(net.minecraft.class_4587 float float float float java.awt.Color java.awt.Color java.awt.Color java.awt.Color ), (class_4587)s\u0456a\u04582.a\u0430c(), (float)(f - 1.0f), (float)(f2 - 1.0f), (float)(f + f3 + 1.0f), (float)f2, (Color)Color.BLACK, (Color)Color.BLACK, (Color)Color.BLACK, (Color)Color.BLACK);
            \u043ex\u0458\u043exxj.a_bsm2("hjjh\u0455e\u0456", hjjh\u0455e\u0456(net.minecraft.class_4587 float float float float java.awt.Color java.awt.Color java.awt.Color java.awt.Color ), (class_4587)s\u0456a\u04582.a\u0430c(), (float)(f - 1.0f), (float)(f2 + f4), (float)(f + f3 + 1.0f), (float)(f2 + f4 + 1.0f), (Color)Color.BLACK, (Color)Color.BLACK, (Color)Color.BLACK, (Color)Color.BLACK);
            \u043ex\u0458\u043exxj.a_bsm2("hjjh\u0455e\u0456", hjjh\u0455e\u0456(net.minecraft.class_4587 float float float float java.awt.Color java.awt.Color java.awt.Color java.awt.Color ), (class_4587)s\u0456a\u04582.a\u0430c(), (float)(f - 1.0f), (float)f2, (float)f, (float)(f2 + f4), (Color)Color.BLACK, (Color)Color.BLACK, (Color)Color.BLACK, (Color)Color.BLACK);
            \u043ex\u0458\u043exxj.a_bsm2("hjjh\u0455e\u0456", hjjh\u0455e\u0456(net.minecraft.class_4587 float float float float java.awt.Color java.awt.Color java.awt.Color java.awt.Color ), (class_4587)s\u0456a\u04582.a\u0430c(), (float)(f + f3), (float)f2, (float)(f + f3 + 1.0f), (float)(f2 + f4), (Color)Color.BLACK, (Color)Color.BLACK, (Color)Color.BLACK, (Color)Color.BLACK);
            \u043ex\u0458\u043exxj.a_bsm2("hjjh\u0455e\u0456", hjjh\u0455e\u0456(net.minecraft.class_4587 float float float float java.awt.Color java.awt.Color java.awt.Color java.awt.Color ), (class_4587)s\u0456a\u04582.a\u0430c(), (float)f, (float)f2, (float)(f + f3), (float)(f2 + 0.5f), (Color)this.eje\u043e(0), (Color)this.eje\u043e(-1221031911 + 1221032001), (Color)this.eje\u043e(-151785373 + 151785463), (Color)this.eje\u043e(0));
            \u043ex\u0458\u043exxj.a_bsm2("hjjh\u0455e\u0456", hjjh\u0455e\u0456(net.minecraft.class_4587 float float float float java.awt.Color java.awt.Color java.awt.Color java.awt.Color ), (class_4587)s\u0456a\u04582.a\u0430c(), (float)f, (float)(f2 + f4 - 0.5f), (float)(f + f3), (float)(f2 + f4), (Color)this.eje\u043e(-576847108 + 576847288), (Color)this.eje\u043e(-323727275 + 323727545), (Color)this.eje\u043e(-1150288935 + 1150289205), (Color)this.eje\u043e(-309438050 + 309438230));
            \u043ex\u0458\u043exxj.a_bsm2("hjjh\u0455e\u0456", hjjh\u0455e\u0456(net.minecraft.class_4587 float float float float java.awt.Color java.awt.Color java.awt.Color java.awt.Color ), (class_4587)s\u0456a\u04582.a\u0430c(), (float)f, (float)f2, (float)(f + 0.5f), (float)(f2 + f4), (Color)this.eje\u043e(0), (Color)this.eje\u043e(-569794625 + 569794805), (Color)this.eje\u043e(-2116117501 + 2116117681), (Color)this.eje\u043e(0));
            \u043ex\u0458\u043exxj.a_bsm2("hjjh\u0455e\u0456", hjjh\u0455e\u0456(net.minecraft.class_4587 float float float float java.awt.Color java.awt.Color java.awt.Color java.awt.Color ), (class_4587)s\u0456a\u04582.a\u0430c(), (float)(f + f3 - 0.5f), (float)f2, (float)(f + f3), (float)(f2 + f4), (Color)this.eje\u043e(-808947057 + 808947147), (Color)this.eje\u043e(-2081127709 + 2081127979), (Color)this.eje\u043e(-682085851 + 682086121), (Color)this.eje\u043e(-952078422 + 952078512));
        }
    }

    @\u0445\u0458\u0458h\u0445\u0430a
    public void c\u0445\u0445c\u0445ec(i\u0456o\u0430\u0435o i\u0456o\u0430\u0435o2) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        if (\u043ex\u0458\u043exxj.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 == null || \u043ex\u0458\u043exxj.\u0430\u0445j\u0445s\u0456\u04bb.field_1687 == null) {
            return;
        }
        this.\u0435\u04bbc\u0445\u0458.clear();
        if (this.ao\u0455x.cip((String)((Object)\u043ex\u0458\u043exxj.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-420513833 + 420513865, -1728949843 + 1728949893}, (int)(-558309358 + 1477465782), (int)(-650113591 + 2083014559))))) {
            float f = i\u0456o\u0430\u0435o2.\u0430pah\u0456x();
            Matrix4f matrix4f = i\u0456o\u0430\u0435o2.\u0445\u0455i\u0430pi().method_23760().method_23761();
            CallSite callSite = \u043ex\u0458\u043exxj.a_bsm3("getProjectionMatrix", getProjectionMatrix());
            Matrix4f matrix4f2 = new Matrix4f((Matrix4fc)callSite).mul((Matrix4fc)matrix4f);
            class_243 class_2432 = \u043ex\u0458\u043exxj.\u0430\u0445j\u0445s\u0456\u04bb.field_1773.method_19418().method_19326();
            int n = \u0430\u0445j\u0445s\u0456\u04bb.method_22683().method_4489();
            int n2 = \u0430\u0445j\u0445s\u0456\u04bb.method_22683().method_4506();
            double d = \u0430\u0445j\u0445s\u0456\u04bb.method_22683().method_4495();
            for (class_1297 class_12972 : \u043ex\u0458\u043exxj.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.method_18112()) {
                if (!\u043ex\u0458\u043exxj.xa\u0445\u04bbc(class_12972) || class_12972 == \u043ex\u0458\u043exxj.\u0430\u0445j\u0445s\u0456\u04bb.field_1724) continue;
                double d2 = class_12972.field_6014 + (class_12972.method_23317() - class_12972.field_6014) * (double)f;
                double d3 = class_12972.field_6036 + (class_12972.method_23318() - class_12972.field_6036) * (double)f;
                double d4 = class_12972.field_5969 + (class_12972.method_23321() - class_12972.field_5969) * (double)f;
                float f2 = class_12972.method_17681() / 2.0f;
                float f3 = class_12972.method_17682();
                class_238 class_2383 = new class_238(d2 - (double)f2, d3, d4 - (double)f2, d2 + (double)f2, d3 + (double)f3, d4 + (double)f2).method_1014(0.05);
                Vector4d vector4d = null;
                Iterator iterator = \u043ex\u0458\u043exxj.a_bsm4("\u0440as", \u0440as(net.minecraft.class_238 ), (class_238)class_2383).iterator();
                while (iterator.hasNext()) {
                    class_243 class_2433 = (class_243)iterator.next();
                    Vector4f vector4f = new Vector4f((float)(class_2433.field_1352 - class_2432.field_1352), (float)(class_2433.field_1351 - class_2432.field_1351), (float)(class_2433.field_1350 - class_2432.field_1350), 1.0f);
                    matrix4f2.transform(vector4f);
                    if (vector4f.w <= 0.0f) continue;
                    vector4f.div(vector4f.w);
                    float f4 = (vector4f.x + 1.0f) * 0.5f * (float)n / (float)d;
                    float f5 = (1.0f - vector4f.y) * 0.5f * (float)n2 / (float)d;
                    if (vector4d == null) {
                        vector4d = new Vector4d((double)f4, (double)f5, (double)f4, (double)f5);
                        switch (0) {
                            default: {
                                break;
                            }
                            case 1: {
                                break;
                            }
                            case 2: {
                                break;
                            }
                        }
                        continue;
                    }
                    vector4d.x = (double)\u043ex\u0458\u043exxj.a_bsm5("min", min(double double ), (double)f4, (double)vector4d.x);
                    vector4d.y = (double)\u043ex\u0458\u043exxj.a_bsm5("min", min(double double ), (double)f5, (double)vector4d.y);
                    vector4d.z = (double)\u043ex\u0458\u043exxj.a_bsm6("max", max(double double ), (double)f4, (double)vector4d.z);
                    vector4d.w = (double)\u043ex\u0458\u043exxj.a_bsm6("max", max(double double ), (double)f5, (double)vector4d.w);
                }
                if (vector4d == null) continue;
                this.\u0435\u04bbc\u0445\u0458.put(class_12972, vector4d);
            }
        } else if (this.ao\u0455x.cip((String)((Object)\u043ex\u0458\u043exxj.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1330422749 + 1330422624, -1328658053 + 1328657989, -908223270 + 908223355}, (int)(-1658468993 + 1363749103), (int)(-271017113 + 1430956475))))) {
            class_4587 class_45872 = i\u0456o\u0430\u0435o2.\u0445\u0455i\u0430pi();
            float f = i\u0456o\u0430\u0435o2.\u0430pah\u0456x();
            \u043ex\u0458\u043exxj.a_bsm7("enableBlend", enableBlend());
            \u043ex\u0458\u043exxj.a_bsm8("defaultBlendFunc", defaultBlendFunc());
            \u043ex\u0458\u043exxj.a_bsm9("disableDepthTest", disableDepthTest());
            \u043ex\u0458\u043exxj.a_bsm10("depthMask", depthMask(boolean ), (boolean)false);
            \u043ex\u0458\u043exxj.a_bsm11("setShader", setShader(java.util.function.Supplier ), class_757::method_34539);
            for (class_1297 class_12973 : \u043ex\u0458\u043exxj.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.method_18112()) {
                if (!\u043ex\u0458\u043exxj.xa\u0445\u04bbc(class_12973) || class_12973 == \u043ex\u0458\u043exxj.\u0430\u0445j\u0445s\u0456\u04bb.field_1724) continue;
                class_45872.method_22903();
                \u043ex\u0458\u043exxj.a_bsm12("setShaderColor", setShaderColor(float float float float ), (float)px\u0441eoo\u0430[0], (float)px\u0441eoo\u0430[1], (float)px\u0441eoo\u0430[2], (float)px\u0441eoo\u0430[3]);
                class_243 class_2434 = \u043ex\u0458\u043exxj.\u0430\u0445j\u0445s\u0456\u04bb.field_1773.method_19418().method_19326();
                double d = class_12973.field_6014 + (class_12973.method_23317() - class_12973.field_6014) * (double)f - class_2434.field_1352;
                double d5 = class_12973.field_6036 + (class_12973.method_23318() - class_12973.field_6036) * (double)f - class_2434.field_1351;
                double d6 = class_12973.field_5969 + (class_12973.method_23321() - class_12973.field_5969) * (double)f - class_2434.field_1350;
                float f6 = class_12973.method_17681() / 2.0f;
                float f7 = class_12973.method_17682();
                class_238 class_2384 = new class_238(d - (double)f6, d5, d6 - (double)f6, d + (double)f6, d5 + (double)f7, d6 + (double)f6);
                \u043ex\u0458\u043exxj.a_bsm13("\u0458\u0458\u04bb", \u0458\u0458\u04bb(net.minecraft.class_238 net.minecraft.class_4587 ), (class_238)class_2384, (class_4587)class_45872);
                class_45872.method_22909();
            }
            \u043ex\u0458\u043exxj.a_bsm12("setShaderColor", setShaderColor(float float float float ), (float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            \u043ex\u0458\u043exxj.a_bsm14("enableDepthTest", enableDepthTest());
            \u043ex\u0458\u043exxj.a_bsm10("depthMask", depthMask(boolean ), (boolean)true);
            \u043ex\u0458\u043exxj.a_bsm15("disableBlend", disableBlend());
        }
    }

    @Override
    public /* synthetic */ void onDisable() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        this.\u0435\u04bbc\u0445\u0458.clear();
        super.onDisable();
    }

    public /* synthetic */ Color eje\u043e(int n) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        byte[] byArray = new byte[-1024036701 + 1024036707];
        byArray[0] = -219932505 + 219932442;
        byArray[1] = -103157993 + 103158090;
        byArray[2] = -497083620 + 497083542;
        byArray[3] = -1534289656 + 1534289783;
        byArray[4] = -2078653356 + 2078653441;
        byArray[5] = -1997989406 + 1997989369;
        if (this.cj\u0445i\u0445.cip((String)((Object)\u043ex\u0458\u043exxj.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(341842146 + 301665656), (int)(-1076867171 + 620467502))))) {
            return this.h\u0445ph().aj\u0445\u043e();
        }
        return \u043ex\u0458\u043exxj.a_bsm16("\u0445\u043e\u043ehs\u0458", \u0445\u043e\u043ehs\u0458(int int float float float ), (int)(-236403725 + 236403743), (int)n, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    public static /* synthetic */ boolean xa\u0445\u04bbc(class_1297 class_12972) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if (\u0445xp\u0430 == null || !\u0445xp\u0430.\u0440\u0435\u0455x\u0435xe()) {
            return false;
        }
        if (class_12972 instanceof class_1657 && \u043ex\u0458\u043exxj.a_bsm17("\u0430c\u0455\u0440", \u0430c\u0455\u0440(net.minecraft.class_1297 ), (class_1297)class_12972) == false) {
            return \u043ex\u0458\u043exxj.\u0445xp\u0430.o\u0455\u0456.axpacc();
        }
        if (class_12972 instanceof class_1542) {
            return \u043ex\u0458\u043exxj.\u0445xp\u0430.h\u0445s\u0435jsi.axpacc();
        }
        if (class_12972 instanceof class_1308) {
            return \u043ex\u0458\u043exxj.\u0445xp\u0430.x\u0458\u043e\u0455.axpacc();
        }
        if (class_12972 instanceof class_1429) {
            return \u043ex\u0458\u043exxj.\u0445xp\u0430.a\u0441\u0440e.axpacc();
        }
        return class_12972 instanceof class_1667 && \u043ex\u0458\u043exxj.\u0445xp\u0430.\u0441is\u0430e\u0456.axpacc();
    }

    static {
        px\u0441eoo\u0430 = new float[]{0.78431374f, 0.0f, 0.0f, 0.43529412f};
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
}

