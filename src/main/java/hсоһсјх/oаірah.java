/*
 * Decompiled with CFR 0.152.
 */
package h\u0441\u043e\u04bb\u0441\u0458\u0445;

import c\u0445is.\u0430\u0456i\u043ephj;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_1743;
import net.minecraft.class_1792;
import net.minecraft.class_1829;
import net.minecraft.class_239;
import net.minecraft.class_3675;
import o\u0455sio\u0440.\u0445\u0458\u0458h\u0445\u0430a;
import spso.\u0430c\u0440;
import spso.\u0441a\u0458p;
import \u0435xp.h\u04bb\u0455hpa;
import \u0435xp.\u043ea\u0441\u0430p;
import \u043e\u0445\u0440\u0430ose.i\u0456\u0445\u0430\u0441p;
import \u0445eo.c\u0455pi;
import \u0445eo.\u0456p\u0430\u043e\u0458\u043e;
import \u0445eo.\u0458i\u0456x;

@\u0456p\u0430\u043e\u0458\u043e(sp\u0456p\u0445\u0435="AutoClicker", a\u0456j\u0430\u0455\u04bb="Automatically clicks for you", s\u0455cj=\u0458i\u0456x.COMBAT)
public class o\u0430\u0456\u0440ah
extends c\u0455pi {
    private final /* synthetic */ \u043ea\u0441\u0430p a\u0440\u04bb\u0441cp\u0440;
    private final /* synthetic */ h\u04bb\u0455hpa \u0445ji;
    private /* synthetic */ float x\u043eac\u0430;
    private static /* synthetic */ int __js_dispatch_state = 0;

    public o\u0430\u0456\u0440ah() {
        if (2 * 2 * 2 >= 0) {
        }
        if (o\u0430\u0456\u0440ah.$_h1jsiipq1ngan17l1m((long)o\u0430\u0456\u0440ah.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)o\u0430\u0456\u0440ah.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        this.a\u0440\u04bb\u0441cp\u0440 = ((\u0430c\u0440)((Object)o\u0430\u0456\u0440ah.a_bsm2("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)o\u0430\u0456\u0440ah.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1013508299 + 1013508270, -1392189326 + 1392189386, -218281793 + 218281866}, (int)(-1387840426 + 2140008574), (int)(1409808546 + 913936863)))))).s\u0458\u0458a(10.0f).x\u0455heah\u0445(1.0f).\u043ecxi\u0455(5.0f).a\u0455\u0445\u0435c(20.0f).\u0458c\u0456\u0440().getFloatValue();
        byte[] byArray = new byte[-1898872473 + 1898872483];
        byArray[0] = -607138517 + 607138528;
        byArray[1] = -2024269488 + 2024269381;
        byArray[2] = -1692425119 + 1692425032;
        byArray[3] = -1648146409 + 1648146473;
        byArray[4] = -1364272975 + 1364272947;
        byArray[5] = -1575181913 + 1575182006;
        byArray[-317234406 + 317234412] = -752001477 + 752001378;
        byArray[-1947301961 + 1947301968] = -285983927 + 285983908;
        byArray[-322663026 + 322663034] = -2054626932 + 2054626835;
        byArray[-1405300340 + 1405300349] = -529266306 + 529266413;
        this.\u0445ji = ((\u0430c\u0440)((Object)o\u0430\u0456\u0440ah.a_bsm2("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)o\u0430\u0456\u0440ah.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(1012583588 + 1652544054), (int)(279471179 + 1050405625)))))).\u0455xi\u0440(true).\u0458c\u0456\u0440().getBooleanValue();
        this.x\u043eac\u0430 = 0.0f;
    }

    @\u0445\u0458\u0458h\u0445\u0430a
    public void \u043e\u0456xhhx(\u0430\u0456i\u043ephj \u0430\u0456i\u043ephj2) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (o\u0430\u0456\u0440ah.$_h1jsiipr1ngan17l1n((long)o\u0430\u0456\u0440ah.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)o\u0430\u0456\u0440ah.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        if (0 != 0) {
        }
        if (\u0430\u0456i\u043ephj2.p\u0440\u04bb() == i\u0456\u0445\u0430\u0441p.cc\u0441 && o\u0430\u0456\u0440ah.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 != null) {
            class_1792 class_17922 = o\u0430\u0456\u0440ah.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_6047().method_7909();
            if (o\u0430\u0456\u0440ah.\u0430\u0445j\u0445s\u0456\u04bb.field_1690.field_1886.method_1434() && (class_17922 instanceof class_1829 || class_17922 instanceof class_1743 || !this.\u0445ji.axpacc()) && o\u0430\u0456\u0440ah.\u0430\u0445j\u0445s\u0456\u04bb.field_1765 != null && o\u0430\u0456\u0440ah.\u0430\u0445j\u0445s\u0456\u04bb.field_1765.method_17783() != class_239.class_240.field_1332) {
                this.x\u043eac\u0430 += this.a\u0440\u04bb\u0441cp\u0440.axpacc() / 20.0f;
                if (o\u0430\u0456\u0440ah.$_h1jsiips1ngan17l1o(this.x\u043eac\u0430 == 1.0f / this.a\u0440\u04bb\u0441cp\u0440.axpacc() ? 0 : (this.x\u043eac\u0430 > 1.0f / this.a\u0440\u04bb\u0441cp\u0440.axpacc() ? 1 : -1)) >= 0) {
                    o\u0430\u0456\u0440ah.\u0430\u0445j\u0445s\u0456\u04bb.field_1771 = 0;
                    o\u0430\u0456\u0440ah.a_bsm3("method_1420", method_1420(net.minecraft.class_3675$class_306 ), (class_3675.class_306)o\u0430\u0456\u0440ah.\u0430\u0445j\u0445s\u0456\u04bb.field_1690.field_1886.method_1429());
                    this.x\u043eac\u0430 -= 1.0f;
                }
            } else {
                this.x\u043eac\u0430 = 0.0f;
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
}

