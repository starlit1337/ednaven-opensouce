/*
 * Decompiled with CFR 0.152.
 */
package h\u0441\u043e\u04bb\u0441\u0458\u0445;

import c\u0445is.\u0430\u0456i\u043ephj;
import c\u0445is.\u043eo\u0435;
import ie\u0441\u0430ej.\u0456oc;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_1268;
import net.minecraft.class_1293;
import net.minecraft.class_1294;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1844;
import net.minecraft.class_4537;
import net.minecraft.class_9334;
import o\u0455sio\u0440.\u0445\u0458\u0458h\u0445\u0430a;
import spso.\u0430c\u0440;
import spso.\u0441a\u0458p;
import \u0435xp.\u043ea\u0441\u0430p;
import \u043e\u0445\u0440\u0430ose.i\u0456\u0445\u0430\u0441p;
import \u0441\u0445o.jax\u0458\u0435\u0458;
import \u0441\u0445o.\u0458op\u0430\u0441;
import \u0445eo.c\u0455pi;
import \u0445eo.\u0456p\u0430\u043e\u0458\u043e;
import \u0445eo.\u0458i\u0456x;
import \u0458\u0458\u0458o\u0430\u0456.e\u0445\u0440\u0440a;

@\u0456p\u0430\u043e\u0458\u043e(sp\u0456p\u0445\u0435="AutoPots", a\u0456j\u0430\u0455\u04bb="Automatically throws beneficial potions", s\u0455cj=\u0458i\u0456x.COMBAT)
public class \u0441\u0458\u0435xpp
extends c\u0455pi {
    private final /* synthetic */ \u043ea\u0441\u0430p exh\u0458\u0440;
    private final /* synthetic */ \u043ea\u0441\u0430p \u0455x\u0456cje\u0430;
    private final /* synthetic */ \u0456oc o\u0441\u0455\u0440\u0440\u0458\u0441;
    private /* synthetic */ int eax;
    private static /* synthetic */ int __js_dispatch_state = 0;

    public \u0441\u0458\u0435xpp() {
        if (2 * 2 * 2 >= 0) {
        }
        if (\u0441\u0458\u0435xpp.$_hzv4b6x1ngan17l1b((long)\u0441\u0458\u0435xpp.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)\u0441\u0458\u0435xpp.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        this.exh\u0458\u0440 = ((\u0430c\u0440)((Object)\u0441\u0458\u0435xpp.a_bsm2("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)\u0441\u0458\u0435xpp.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-2083544043 + 2083544014, -998110432 + 998110537, -1761021573 + 1761021517, -2072961728 + 2072961677, -1241367722 + 1241367702}, (int)(1582671945 + 220316462), (int)(608962563 + 2030015816)))))).s\u0458\u0458a(500.0f).\u043ecxi\u0455(0.0f).a\u0455\u0445\u0435c(2000.0f).x\u0455heah\u0445(50.0f).\u0458c\u0456\u0440().getFloatValue();
        byte[] byArray = new byte[-329131643 + 329131657];
        byArray[0] = -1251989648 + 1251989639;
        byArray[1] = -285537898 + 285537875;
        byArray[2] = -50916688 + 50916726;
        byArray[3] = -2050656580 + 2050656501;
        byArray[4] = -1873782753 + 1873782786;
        byArray[5] = -2004188639 + 2004188738;
        byArray[-1482910106 + 1482910112] = -1453094816 + 1453094806;
        byArray[-1907211179 + 1907211186] = -631098797 + 631098877;
        byArray[-999195483 + 999195491] = -472703878 + 472703917;
        byArray[-929160420 + 929160429] = -2108504479 + 2108504498;
        byArray[-286646106 + 286646116] = -612169462 + 612169545;
        byArray[-1030472233 + 1030472244] = -910570982 + 910571037;
        byArray[-426058390 + 426058402] = -1672975739 + 1672975653;
        byArray[-993706440 + 993706453] = -1271591776 + 1271591803;
        this.\u0455x\u0456cje\u0430 = ((\u0430c\u0440)((Object)\u0441\u0458\u0435xpp.a_bsm2("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)\u0441\u0458\u0435xpp.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-1151968116 + 739936996), (int)(-1790825251 + 1155181886)))))).s\u0458\u0458a(180.0f).\u043ecxi\u0455(1.0f).a\u0455\u0445\u0435c(180.0f).x\u0455heah\u0445(1.0f).\u0458c\u0456\u0440().getFloatValue();
        this.o\u0441\u0455\u0440\u0440\u0458\u0441 = new \u0456oc();
        this.eax = -1;
    }

    @\u0445\u0458\u0458h\u0445\u0430a
    public void h\u0458\u0456\u0441(\u043eo\u0435 \u043eo\u04352) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (\u0441\u0458\u0435xpp.$_hzv4b6y1ngan17l1c((long)\u0441\u0458\u0435xpp.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)\u0441\u0458\u0435xpp.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        if (0 != 0) {
        }
        if (\u043eo\u04352.\u0456\u0455\u0455xpa\u0455() == class_1268.field_5808 && this.eax != -1) {
            \u043eo\u04352.\u0435oo\u0458\u0445(\u0441\u0458\u0435xpp.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().method_5438(this.eax));
        }
    }

    @\u0445\u0458\u0458h\u0445\u0430a
    public void \u043e\u0456xhhx(\u0430\u0456i\u043ephj \u0430\u0456i\u043ephj2) {
        block16: {
            block15: {
                boolean bl = false;
                if (bl) {
                    __js_dispatch_state = 0;
                    if (bl) {
                        __js_dispatch_state = 0;
                    }
                }
                if (2 * 2 * 2 >= 0) {
                }
                if (\u0441\u0458\u0435xpp.$_hzv4b6z1ngan17l1d((long)\u0441\u0458\u0435xpp.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)\u0441\u0458\u0435xpp.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
                    throw null;
                }
                if (0 != 0) {
                }
                if (\u0441\u0458\u0435xpp.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 == null) break block15;
                if (\u0441\u0458\u0435xpp.\u0430\u0445j\u0445s\u0456\u04bb.field_1761 != null) break block16;
            }
            return;
        }
        if (\u0430\u0456i\u043ephj2.p\u0440\u04bb() == i\u0456\u0445\u0430\u0441p.cc\u0441) {
            int n = this.\u0430ehe\u0441\u0435();
            if (n != -1 && this.o\u0441\u0455\u0440\u0440\u0458\u0441.\u0430\u0456shhpx((long)this.exh\u0458\u0440.axpacc(), false)) {
                if (\u0441\u0458\u0435xpp.a_bsm3("\u0440\u0430hj", \u0440\u0430hj(\u0458\u0458\u0458o\u0430\u0456.e\u0445\u0440\u0440a double \u0441\u0445o.jax\u0458\u0435\u0458 ), (e\u0445\u0440\u0440a)new e\u0445\u0440\u0440a(\u0441\u0458\u0435xpp.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_36454(), 90.0f), (double)this.\u0455x\u0456cje\u0430.axpacc(), (jax\u0458\u0435\u0458)jax\u0458\u0435\u0458.hp\u043e\u0445p) == false) {
                    return;
                }
                if (\u0458op\u0430\u0441.ia\u04bb != null && \u0441\u0458\u0435xpp.$_hzv4b701ngan17l1e(\u0458op\u0430\u0441.ia\u04bb.xpx() == 89.0f ? 0 : (\u0458op\u0430\u0441.ia\u04bb.xpx() > 89.0f ? 1 : -1)) >= 0) {
                    this.eax = \u0441\u0458\u0435xpp.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7545;
                    \u0441\u0458\u0435xpp.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7545 = n;
                    \u0441\u0458\u0435xpp.\u0430\u0445j\u0445s\u0456\u04bb.field_1761.method_2919((class_1657)\u0441\u0458\u0435xpp.\u0430\u0445j\u0445s\u0456\u04bb.field_1724, class_1268.field_5808);
                    this.o\u0441\u0455\u0440\u0440\u0458\u0441.\u0441\u0458e();
                }
            }
        } else if (\u0430\u0456i\u043ephj2.p\u0440\u04bb() == i\u0456\u0445\u0430\u0441p.\u0456\u0458ep\u0430c\u0440 && this.eax != -1) {
            \u0441\u0458\u0435xpp.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7545 = this.eax;
            this.eax = -1;
        }
    }

    private /* synthetic */ int \u0430ehe\u0441\u0435() {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (true | false) {
        }
        if (\u0441\u0458\u0435xpp.$_hzv4b711ngan17l1f((long)\u0441\u0458\u0435xpp.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)\u0441\u0458\u0435xpp.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        if (0 != 0) {
        }
        for (int i = 0; i < -1338334380 + 1338334389; ++i) {
            class_1844 class_18442;
            class_1799 class_17992 = \u0441\u0458\u0435xpp.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().method_5438(i);
            if (class_17992.method_7960() || !(class_17992.method_7909() instanceof class_4537) || (class_18442 = (class_1844)class_17992.method_57824(class_9334.field_49651)) == null) continue;
            for (class_1293 class_12932 : class_18442.method_57397()) {
                if (this.\u0435x\u0455(class_12932)) {
                    return i;
                }
                if (0 != 0 && (0 == 1 || 0 == 2) || !bl) continue;
                __js_dispatch_state = 0;
            }
        }
        return -1;
    }

    private /* synthetic */ boolean \u0435x\u0455(class_1293 class_12932) {
        int n;
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (true | false) {
        }
        if (\u0441\u0458\u0435xpp.$_hzv4b721ngan17l1g((long)\u0441\u0458\u0435xpp.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)\u0441\u0458\u0435xpp.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        if (0 != 0) {
        }
        if (class_12932.method_5579().comp_349() == class_1294.field_5915.comp_349() || class_12932.method_5579().comp_349() == class_1294.field_5924.comp_349() || class_12932.method_5579().comp_349() == class_1294.field_5898.comp_349() || class_12932.method_5579().comp_349() == class_1294.field_5907.comp_349() || class_12932.method_5579().comp_349() == class_1294.field_5918.comp_349()) {
            n = 1;
            if (0 != 0 && 0 != 1 && 0 != 2) {
                // empty if block
            }
        } else {
            n = 0;
        }
        return n != 0;
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

