/*
 * Decompiled with CFR 0.152.
 */
package \u0445\u0430p\u0440;

import c\u0445is.i\u0456o\u0430\u0435o;
import c\u0445is.x\u0458sc;
import ie\u0441\u0430ej.\u0441p\u0435\u0435\u0441x;
import io.github.humbleui.skija.Font;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import o\u0455sio\u0440.\u0445\u0458\u0458h\u0445\u0430a;
import spso.\u0430c\u0440;
import spso.\u0441a\u0458p;
import \u0435xp.h\u04bb\u0455hpa;
import \u0435xp.\u043ea\u0441\u0430p;
import \u0445eo.c\u0455pi;
import \u0445eo.\u0456p\u0430\u043e\u0458\u043e;
import \u0445eo.\u0458i\u0456x;

@\u0456p\u0430\u043e\u0458\u043e(sp\u0456p\u0445\u0435="NameTags", s\u0455cj=\u0458i\u0456x.RENDER, a\u0456j\u0430\u0455\u04bb="Renders name tags")
public class hj\u0440\u0440\u0430h\u0430
extends c\u0455pi {
    public /* synthetic */ \u043ea\u0441\u0430p ssshe;
    public /* synthetic */ h\u04bb\u0455hpa h\u0435\u0458j;
    private final /* synthetic */ Map<class_1297, \u0441p\u0435\u0435\u0441x> x\u0445\u0456\u0430ps\u04bb;

    public hj\u0440\u0440\u0430h\u0430() {
        if (true | false) {
        }
        this.ssshe = ((\u0430c\u0440)((Object)hj\u0440\u0440\u0430h\u0430.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)hj\u0440\u0440\u0430h\u0430.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1632572550 + 1632572463, -402884268 + 402884183, -1049931377 + 1049931425, -635449595 + 635449511, -1334391103 + 1334391225}, (int)(-1779398515 + 375661511), (int)(-1157907950 + 2020440406)))))).s\u0458\u0458a(0.3f).x\u0455heah\u0445(0.01f).\u043ecxi\u0455(0.1f).a\u0455\u0445\u0435c(1.0f).\u0458c\u0456\u0440().getFloatValue();
        this.h\u0435\u0458j = ((\u0430c\u0440)((Object)hj\u0440\u0440\u0430h\u0430.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)hj\u0440\u0440\u0430h\u0430.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1291538466 + 1291538481, -575759277 + 575759219, -1, -1192212273 + 1192212399, -1032224726 + 1032224693}, (int)(126927781 + 296965534), (int)(-1355260551 + 1223924402)))))).\u0455xi\u0440(true).\u0458c\u0456\u0440().getBooleanValue();
        this.x\u0445\u0456\u0430ps\u04bb = new ConcurrentHashMap<class_1297, \u0441p\u0435\u0435\u0441x>();
    }

    @\u0445\u0458\u0458h\u0445\u0430a
    public void \u0456jx\u04bb\u0458\u04bb(i\u0456o\u0430\u0435o i\u0456o\u0430\u0435o2) {
        try {
            if (2 * 2 * 2 >= 0) {
            }
            if (0 != 0) {
            }
            this.\u0430a\u0458\u0440jh\u0435(i\u0456o\u0430\u0435o2.\u0430pah\u0456x());
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    @\u0445\u0458\u0458h\u0445\u0430a
    public void \u0455\u0440\u043e\u0435(x\u0458sc x\u0458sc2) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        for (Map.Entry<class_1297, \u0441p\u0435\u0435\u0441x> entry : this.x\u0445\u0456\u0430ps\u04bb.entrySet()) {
            class_1297 class_12972;
            if (entry.getKey() == hj\u0440\u0440\u0430h\u0430.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 || !((class_12972 = entry.getKey()) instanceof class_1657)) continue;
            class_1657 class_16572 = (class_1657)class_12972;
            if (hj\u0440\u0440\u0430h\u0430.a_bsm2("\u0430c\u0455\u0440", \u0430c\u0455\u0440(net.minecraft.class_1297 ), (class_1297)entry.getKey()) != false) continue;
            float f = class_16572.method_6032();
            if (f > class_16572.method_6063()) {
                f = class_16572.method_6063();
            }
            CallSite callSite = hj\u0440\u0440\u0430h\u0430.a_bsm4("valueOf", valueOf(int ), (int)((int)hj\u0440\u0440\u0430h\u0430.a_bsm3("floor", floor(double ), (double)class_16572.method_5739((class_1297)hj\u0440\u0440\u0430h\u0430.\u0430\u0445j\u0445s\u0456\u04bb.field_1724))));
            \u0441p\u0435\u0435\u0441x \u0441p\u0435\u0435\u0441x2 = entry.getValue();
            float f2 = this.ssshe.axpacc();
            float f3 = 6.0f * f2;
            float f4 = 6.0f * f2;
            float f5 = 4.0f * f2;
            float f6 = 3.0f * f2;
            String string = class_16572.method_5477().getString();
            Object object = hj\u0440\u0440\u0430h\u0430.a_bsm4("valueOf", valueOf(int ), (int)hj\u0440\u0440\u0430h\u0430.a_bsm5("round", round(float ), (float)f));
            if (class_16572.method_6067() > 0.0f) {
                CallSite callSite2 = hj\u0440\u0440\u0430h\u0430.a_bsm5("round", round(float ), (float)class_16572.method_6067());
                CallSite callSite3 = object;
                object = callSite3 + (String)((Object)hj\u0440\u0440\u0430h\u0430.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-872929187 + 872929290}, (int)(312317443 + 1108852401), (int)(-944958955 + 911666158))) + (int)callSite2;
            }
            float f7 = 14.0f * f2;
            CallSite callSite4 = hj\u0440\u0440\u0430h\u0430.a_bsm6("\u0458\u0435a", \u0458\u0435a(float ), (float)f7);
            CallSite callSite5 = hj\u0440\u0440\u0430h\u0430.a_bsm7("o\u043exh", o\u043exh(float ), (float)f7);
            float f8 = callSite5.measureTextWidth((String)((Object)hj\u0440\u0440\u0430h\u0430.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1922570685 + 1922570812, -1379943519 + 1379943525, -2035515162 + 2035515220}, (int)(208154575 + 582418255), (int)(-1076400939 + 770146537))));
            reference var19_20 = hj\u0440\u0440\u0430h\u0430.a_bsm8("\u0441a\u0441\u0441", \u0441a\u0441\u0441(java.lang.String io.github.humbleui.skija.Font ), (String)((Object)callSite), (Font)callSite4) + f8 + f3 * 2.0f + f6;
            reference var20_21 = hj\u0440\u0440\u0430h\u0430.a_bsm8("\u0441a\u0441\u0441", \u0441a\u0441\u0441(java.lang.String io.github.humbleui.skija.Font ), (String)string, (Font)callSite4) + f3 * 2.0f;
            float f9 = callSite5.measureTextWidth((String)((Object)hj\u0440\u0440\u0430h\u0430.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1517003925 + 1517004004, -1617681525 + 1617681595, -997684157 + 997684253}, (int)(573357403 + 1457634227), (int)(-542238473 + 535357087))));
            reference var22_23 = hj\u0440\u0440\u0430h\u0430.a_bsm8("\u0441a\u0441\u0441", \u0441a\u0441\u0441(java.lang.String io.github.humbleui.skija.Font ), (String)object, (Font)callSite4) + f9 + f3 * 2.0f + f6;
            reference var23_24 = var19_20 + f5 + var20_21 + f5 + var22_23;
            float f10 = f7 + f3 * 1.5f;
            float f11 = \u0441p\u0435\u0435\u0441x2.\u04bbh\u0458\u0445\u04bb - var23_24 / 2.0f;
            float f12 = \u0441p\u0435\u0435\u0441x2.\u0455\u0430s\u0458sch - f10 / 2.0f;
            float f13 = f11;
            this.xpaoh(f13, f12, (float)var19_20, f10, f4, f3, f6, (String)((Object)callSite), (Font)callSite4, new Color(-1742992898 + 1737400492, true), new Color(-920681570 + 915089164, true), (String)((Object)hj\u0440\u0440\u0430h\u0430.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1858210162 + 1858210273, -344089135 + 344089230, -566832320 + 566832374}, (int)(-1566178741 + 1769408977), (int)(-1886610117 + 1606767126))), (Font)callSite5);
            this.xpaoh(f13 += var19_20 + f5, f12, (float)var20_21, f10, f4, f3, f6, string, (Font)callSite4, this.h\u0445ph().\u04bb\u0455x\u04bb(), null, null, null);
            this.xpaoh(f13 += var20_21 + f5, f12, (float)var22_23, f10, f4, f3, f6, (String)object, (Font)callSite4, this.h\u0445ph().\u04bb\u0455x\u04bb(), Color.red, (String)((Object)hj\u0440\u0440\u0430h\u0430.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-334169357 + 334169484, -2031898609 + 2031898695, -200777755 + 200777714}, (int)(-1652956396 + 962393026), (int)(-1932132970 + 658421374))), (Font)callSite5);
        }
    }

    private /* synthetic */ void xpaoh(float f, float f2, float f3, float f4, float f5, float f6, float f7, String string, Font font, Color color, Color color2, String string2, Font font2) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if (this.h\u0435\u0458j.axpacc()) {
            hj\u0440\u0440\u0430h\u0430.a_bsm9("ip\u0458h\u0445", ip\u0458h\u0445(float float float float float ), (float)f, (float)f2, (float)f3, (float)f4, (float)f5);
        }
        hj\u0440\u0440\u0430h\u0430.a_bsm10("hc\u0456", hc\u0456(float float float float float ), (float)f, (float)f2, (float)f3, (float)f4, (float)f5);
        hj\u0440\u0440\u0430h\u0430.a_bsm12("\u0445a\u0440c\u0445h", \u0445a\u0440c\u0445h(float float float float float java.awt.Color ), (float)f, (float)f2, (float)f3, (float)f4, (float)f5, (Color)((Object)hj\u0440\u0440\u0430h\u0430.a_bsm11("withAlpha", withAlpha(java.awt.Color int ), (Color)this.h\u0445ph().i\u0458\u0441\u0435e\u0440\u0440(), (int)(-80259910 + 80260130))));
        float f8 = f2 + f4 / 2.0f;
        float f9 = f + f6;
        hj\u0440\u0440\u0430h\u0430.a_bsm13("x\u0458\u0441x", x\u0458\u0441x(java.lang.String float float java.awt.Color io.github.humbleui.skija.Font ), (String)string, (float)f9, (float)f8, (Color)color, (Font)font);
        if (string2 != null && font2 != null) {
            CallSite callSite = hj\u0440\u0440\u0430h\u0430.a_bsm8("\u0441a\u0441\u0441", \u0441a\u0441\u0441(java.lang.String io.github.humbleui.skija.Font ), (String)string, (Font)font);
            hj\u0440\u0440\u0430h\u0430.a_bsm13("x\u0458\u0441x", x\u0458\u0441x(java.lang.String float float java.awt.Color io.github.humbleui.skija.Font ), (String)string2, (float)(f9 + callSite + f7), (float)f8, (Color)color2, (Font)font2);
        }
    }

    private /* synthetic */ void \u0430a\u0458\u0440jh\u0435(float f) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        this.x\u0445\u0456\u0430ps\u04bb.clear();
        for (class_1297 class_12972 : hj\u0440\u0440\u0430h\u0430.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.method_18112()) {
            if (!(class_12972 instanceof class_1657) || class_12972.method_5477().getString().startsWith((String)((Object)hj\u0440\u0440\u0430h\u0430.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-664685413 + 664685443, 0, -296697792 + 296697880, -1629676191 + 1629676236}, (int)(-365108580 + 528951079), (int)(1026955119 + 1547665926))))) continue;
            CallSite callSite = hj\u0440\u0440\u0430h\u0430.a_bsm14("xpoca\u0430", xpoca\u0430(float double double ), (float)f, (double)class_12972.field_6014, (double)class_12972.method_23317());
            reference var6_5 = hj\u0440\u0440\u0430h\u0430.a_bsm14("xpoca\u0430", xpoca\u0430(float double double ), (float)f, (double)class_12972.field_6036, (double)class_12972.method_23318()) + (double)class_12972.method_17682() + 0.5;
            CallSite callSite2 = hj\u0440\u0440\u0430h\u0430.a_bsm14("xpoca\u0430", xpoca\u0430(float double double ), (float)f, (double)class_12972.field_5969, (double)class_12972.method_23321());
            CallSite callSite3 = hj\u0440\u0440\u0430h\u0430.a_bsm15("cpopss\u043e", cpopss\u043e(double double double float ), (double)callSite, (double)var6_5, (double)callSite2, (float)f);
            ((\u0441p\u0435\u0435\u0441x)((Object)callSite3)).oos\u0456\u0456i(((\u0441p\u0435\u0435\u0441x)((Object)callSite3)).i\u0440x\u0435\u0430hj() - 2.0f);
            this.x\u0445\u0456\u0430ps\u04bb.put(class_12972, (\u0441p\u0435\u0435\u0441x)((Object)callSite3));
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
}

