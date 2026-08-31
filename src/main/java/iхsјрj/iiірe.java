/*
 * Decompiled with CFR 0.152.
 */
package i\u0445s\u0458\u0440j;

import c\u0445is.i\u0456o\u0430\u0435o;
import h\u0440x\u0455io\u0441.xcs\u0440ixh;
import h\u0441\u043e\u04bb\u0441\u0458\u0445.c\u0455i\u0430\u0440\u0445;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_2960;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import o\u0455sio\u0440.\u0445\u0458\u0458h\u0445\u0430a;
import x\u0445so\u0456.i\u0430\u0455\u0455pi\u0430;
import x\u0445so\u0456.\u0430\u0435s;
import \u0440o\u0456\u0445o.\u0445\u0440\u0430\u0435\u0445\u043e;

public class ii\u0456\u0440e
extends xcs\u0440ixh {
    private final /* synthetic */ Map<class_1309, i\u0430\u0455\u0455pi\u0430> pphs\u0430;

    public ii\u0456\u0440e() {
        if (2 * 2 * 2 >= 0) {
        }
        this.pphs\u0430 = new ConcurrentHashMap<class_1309, i\u0430\u0455\u0455pi\u0430>();
    }

    @\u0445\u0458\u0458h\u0445\u0430a
    public void o\u04bbjp(i\u0456o\u0430\u0435o i\u0456o\u0430\u0435o2) {
        class_1309 class_13092;
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (ii\u0456\u0440e.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 == null) {
            return;
        }
        class_1309 class_13093 = class_13092 = c\u0455i\u0430\u0440\u0445.ejih instanceof class_1309 ? (class_1309)c\u0455i\u0430\u0440\u0445.ejih : null;
        if (class_13092 == null && this.pphs\u0430.isEmpty()) {
            return;
        }
        c\u0455i\u0430\u0440\u0445 c\u0455i\u0430\u0440\u04452 = (c\u0455i\u0430\u0440\u0445)((\u0445\u0440\u0430\u0435\u0445\u043e)((Object)ii\u0456\u0440e.a_bsm0("jaa\u0435\u0445c", jaa\u0435\u0445c()))).\u0430o\u0441\u0456p\u0455().\u0441c\u0458\u043e\u0430(c\u0455i\u0430\u0440\u0445.class);
        String string = c\u0455i\u0430\u0440\u04452.\u0445c\u0445\u04bb\u04bbi.cc\u0445\u0458\u0458();
        if (class_13092 != null && !this.pphs\u0430.containsKey(class_13092)) {
            this.pphs\u0430.put(class_13092, new i\u0430\u0455\u0455pi\u0430(\u0430\u0435s.i\u04bbxh\u043e\u0445s, 350L));
        }
        this.pphs\u0430.entrySet().removeIf(entry -> {
            if (2 * 2 * 2 >= 0) {
            }
            class_1309 class_13093 = (class_1309)entry.getKey();
            i\u0430\u0455\u0455pi\u0430 i\u0430\u0455\u0455pi\u04302 = (i\u0430\u0455\u0455pi\u0430)entry.getValue();
            boolean bl = class_13093 == class_13092;
            i\u0430\u0455\u0455pi\u04302.\u0440\u0458jj\u0435hp(bl ? 1.0 : 0.0);
            float f = (float)i\u0430\u0455\u0455pi\u04302.xax\u04bb();
            if (f < 0.001f && !bl) {
                return true;
            }
            this.\u0440\u0435a\u0441sh(i\u0456o\u0430\u0435o2, class_13093, f, string);
            return false;
        });
    }

    private /* synthetic */ void \u0440\u0435a\u0441sh(i\u0456o\u0430\u0435o i\u0456o\u0430\u0435o2, class_1309 class_13092, float f, String string) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        if (f <= 0.001f) {
            return;
        }
        class_4587 class_45872 = i\u0456o\u0430\u0435o2.\u0445\u0455i\u0430pi();
        Color color = this.h\u0445ph().aj\u0445\u043e();
        String string2 = string;
        int n = -1;
        switch (string2.hashCode()) {
            case -1820702691: {
                byte[] byArray = new byte[-1318234527 + 1318234535];
                byArray[0] = -1601188959 + 1601189033;
                byArray[1] = -1823625467 + 1823625528;
                byArray[2] = -1278229358 + 1278229336;
                byArray[3] = -1070569896 + 1070569880;
                byArray[4] = -391965423 + 391965347;
                byArray[5] = -459602084 + 459602188;
                byArray[-916829068 + 916829074] = -1874821187 + 1874821232;
                byArray[-1838868208 + 1838868215] = -6582696 + 6582726;
                if (!string2.equals(ii\u0456\u0440e.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(1335523132 + 1400122321), (int)(-580266492 + 1850439088)))) break;
                n = 0;
                break;
            }
            case 66987: {
                if (!string2.equals(ii\u0456\u0440e.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-707599217 + 707599211, -1429421165 + 1429421288, 0}, (int)(-1024161108 + 341855400), (int)(440060037 + 557085417)))) break;
                n = 1;
                break;
            }
            case 2018617584: {
                byte[] byArray = new byte[-503717291 + 503717297];
                byArray[0] = -1119882194 + 1119882285;
                byArray[1] = -771496346 + 771496379;
                byArray[2] = -459895780 + 459895896;
                byArray[3] = -1163761876 + 1163761754;
                byArray[4] = -901740421 + 901740542;
                byArray[5] = -685509790 + 685509707;
                if (!string2.equals(ii\u0456\u0440e.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-467243984 + 1236517289), (int)(-402211890 + 1698795897)))) break;
                n = 2;
                break;
            }
            case 2792514: {
                byte[] byArray = new byte[-485321460 + 485321469];
                byArray[0] = -1890520131 + 1890520160;
                byArray[1] = -142590045 + 142590172;
                byArray[2] = -602358095 + 602357973;
                byArray[3] = -761820370 + 761820349;
                byArray[4] = -327455308 + 327455378;
                byArray[5] = -1766643125 + 1766643013;
                byArray[-1837158340 + 1837158346] = -1158305177 + 1158305173;
                byArray[-817290348 + 817290355] = -355789963 + 355789997;
                byArray[-1209597108 + 1209597116] = -1950627152 + 1950627210;
                if (!string2.equals(ii\u0456\u0440e.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-82229856 + 136560028), (int)(132038763 + 891583639)))) break;
                n = 3;
            }
        }
        block6 : switch (n) {
            case 0: {
                ii\u0456\u0440e.a_bsm2("\u0430ho\u04bb\u0441x\u0430", \u0430ho\u04bb\u0441x\u0430(net.minecraft.class_4587 net.minecraft.class_4184 net.minecraft.class_1309 boolean float float ), (class_4587)class_45872, (class_4184)ii\u0456\u0440e.\u0430\u0445j\u0445s\u0456\u04bb.field_1773.method_19418(), (class_1309)class_13092, (boolean)true, (float)f, (float)i\u0456o\u0430\u0435o2.\u0430pah\u0456x());
                break;
            }
            case 1: {
                int n2 = ((Color)((Object)ii\u0456\u0440e.a_bsm3("withAlpha", withAlpha(java.awt.Color int ), (Color)color, (int)((int)(150.0f * f))))).getRGB();
                ii\u0456\u0440e.a_bsm4("j\u0455\u0435", j\u0455\u0435(net.minecraft.class_4587 double double double float float int ), (class_4587)class_45872, (double)class_13092.method_23317(), (double)class_13092.method_23318(), (double)class_13092.method_23321(), (float)class_13092.method_17681(), (float)class_13092.method_17682(), (int)n2);
                break;
            }
            case 2: {
                ii\u0456\u0440e.a_bsm5("x\u0441c\u043e\u0458", x\u0441c\u043e\u0458(net.minecraft.class_4587 net.minecraft.class_1309 float float ), (class_4587)class_45872, (class_1309)class_13092, (float)i\u0456o\u0430\u0435o2.\u0430pah\u0456x(), (float)f);
                switch (0) {
                    default: {
                        break block6;
                    }
                    case 1: {
                        break block6;
                    }
                    case 2: 
                }
                break;
            }
            case 3: {
                class_45872.method_22903();
                Color color2 = new Color((int)ii\u0456\u0440e.a_bsm7("HSBtoRGB", HSBtoRGB(float float float ), (float)((float)((double)ii\u0456\u0440e.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.field_6012 / 50.0 + ii\u0456\u0440e.a_bsm6("sin", sin(double ), (double)0.032)) % 1.0f), (float)0.5f, (float)1.0f));
                Color color3 = new Color((int)ii\u0456\u0440e.a_bsm7("HSBtoRGB", HSBtoRGB(float float float ), (float)((float)((double)ii\u0456\u0440e.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.field_6012 / 50.0 + ii\u0456\u0440e.a_bsm6("sin", sin(double ), (double)0.256)) % 1.0f), (float)0.5f, (float)1.0f));
                ii\u0456\u0440e.a_bsm8("\u0445\u0455\u0445e\u0440", \u0445\u0455\u0445e\u0440(net.minecraft.class_4587 int int int int float float net.minecraft.class_1297 net.minecraft.class_2960 boolean java.awt.Color java.awt.Color java.awt.Color java.awt.Color ), (class_4587)class_45872, (int)(-902511697 + 902511673), (int)(-1304041601 + 1304041577), (int)(-641546019 + 641546067), (int)(-1508233581 + 1508233629), (float)48.0f, (float)48.0f, (class_1297)class_13092, (class_2960)((\u0445\u0440\u0430\u0435\u0445\u043e)((Object)ii\u0456\u0440e.a_bsm0("jaa\u0435\u0445c", jaa\u0435\u0445c()))).\u0430\u0430\u0458p\u0458p\u0441(), (boolean)true, (Color)((Object)ii\u0456\u0440e.a_bsm3("withAlpha", withAlpha(java.awt.Color int ), (Color)color2, (int)((int)(255.0f * f)))), (Color)((Object)ii\u0456\u0440e.a_bsm3("withAlpha", withAlpha(java.awt.Color int ), (Color)color2, (int)((int)(255.0f * f)))), (Color)((Object)ii\u0456\u0440e.a_bsm3("withAlpha", withAlpha(java.awt.Color int ), (Color)color3, (int)((int)(255.0f * f)))), (Color)((Object)ii\u0456\u0440e.a_bsm3("withAlpha", withAlpha(java.awt.Color int ), (Color)color3, (int)((int)(255.0f * f)))));
                class_45872.method_22909();
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
}

