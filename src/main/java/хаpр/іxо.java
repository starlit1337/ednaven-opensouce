/*
 * Decompiled with CFR 0.152.
 */
package \u0445\u0430p\u0440;

import c\u0445is.x\u0458sc;
import io.github.humbleui.skija.ClipMode;
import io.github.humbleui.skija.Font;
import io.github.humbleui.skija.Path;
import io.github.humbleui.types.RRect;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.class_1291;
import net.minecraft.class_1293;
import net.minecraft.class_6880;
import o\u0455sio\u0440.\u0445\u0458\u0458h\u0445\u0430a;
import \u0440o\u0456\u0445o.\u0445\u0440\u0430\u0435\u0445\u043e;
import \u0445eo.c\u0455pi;
import \u0445eo.\u0456p\u0430\u043e\u0458\u043e;
import \u0445eo.\u0458i\u0456x;
import \u0445\u0430p\u0440.ci\u0430p\u0430;
import \u0458x\u0458\u0435ah\u04bb.\u0455\u0456\u0440e;

@\u0456p\u0430\u043e\u0458\u043e(sp\u0456p\u0445\u0435="EffectHUD", a\u0456j\u0430\u0455\u04bb="Displays potion effects on the HUD", s\u0455cj=\u0458i\u0456x.RENDER)
public class \u0456x\u043e
extends c\u0455pi {
    private final /* synthetic */ Map<class_6880<class_1291>, ci\u0430p\u0430> pc\u043e;
    private final /* synthetic */ \u0455\u0456\u0440e c\u0455x;

    public \u0456x\u043e() {
        if (2 * 2 * 2 >= 0) {
        }
        this.pc\u043e = new ConcurrentHashMap<class_6880<class_1291>, ci\u0430p\u0430>();
        byte[] byArray = new byte[-97121121 + 97121134];
        byArray[0] = -1048239739 + 1048239663;
        byArray[1] = -283001776 + 283001792;
        byArray[2] = -999571536 + 999571602;
        byArray[3] = -1541341346 + 1541341247;
        byArray[4] = -249026255 + 249026319;
        byArray[5] = -478723235 + 478723216;
        byArray[-735119510 + 735119516] = -399469236 + 399469333;
        byArray[-856312435 + 856312442] = -387252730 + 387252811;
        byArray[-1337954812 + 1337954820] = -393673191 + 393673318;
        byArray[-643248958 + 643248967] = -1369233529 + 1369233593;
        byArray[-1869411406 + 1869411416] = -1630505608 + 1630505640;
        byArray[-1834256145 + 1834256156] = -2086210325 + 2086210287;
        byArray[-1887776176 + 1887776188] = -750910066 + 750910004;
        this.c\u0455x = ((\u0445\u0440\u0430\u0435\u0445\u043e)((Object)\u0456x\u043e.a_bsm0("jaa\u0435\u0445c", jaa\u0435\u0445c()))).\u043e\u0435s\u043ee(this, (String)((Object)\u0456x\u043e.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(802998007 + 1220719016), (int)(1112169137 + 392756993))), (float)\u0430\u0445j\u0445s\u0456\u04bb.method_22683().method_4486() / 2.0f + 10.0f, (float)\u0430\u0445j\u0445s\u0456\u04bb.method_22683().method_4502() / 2.0f + 10.0f);
    }

    @\u0445\u0458\u0458h\u0445\u0430a
    public void \u0455\u0440\u043e\u0435(x\u0458sc x\u0458sc2) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if (\u0456x\u043e.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 == null) {
            return;
        }
        for (class_1293 class_12932 : \u0456x\u043e.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_6026()) {
            class_6880 class_68803 = class_12932.method_5579();
            ci\u0430p\u0430 object = this.pc\u043e.computeIfAbsent((class_6880<class_1291>)class_68803, class_68802 -> {
                if (true | false) {
                }
                return new ci\u0430p\u0430();
            });
            object.\u0458x\u0458pc = (int)\u0456x\u043e.a_bsm2("max", max(int int ), (int)object.\u0458x\u0458pc, (int)class_12932.method_5584());
            object.eo\u0456\u0435\u0458 = class_12932.method_5584();
            object.\u0430\u0430\u0456c\u0440s\u0458 = class_12932.method_5578();
            object.\u0440\u0445axe\u0435a = false;
        }
        int n = (int)this.c\u0455x.o\u0440xj();
        float f = this.c\u0455x.\u0456s\u0455\u043e\u0430\u0441();
        block9: for (Map.Entry entry : this.pc\u043e.entrySet()) {
            float f2;
            ci\u0430p\u0430 ci\u0430p\u04302 = (ci\u0430p\u0430)entry.getValue();
            class_6880 class_68803 = (class_6880)entry.getKey();
            String string = this.hap\u043eepi((class_6880<class_1291>)class_68803, ci\u0430p\u04302);
            CallSite callSite = \u0456x\u043e.a_bsm3("method_15439", method_15439(int float ), (int)ci\u0430p\u04302.eo\u0456\u0435\u0458, (float)20.0f);
            CallSite callSite2 = \u0456x\u043e.a_bsm5("\u0441a\u0441\u0441", \u0441a\u0441\u0441(java.lang.String io.github.humbleui.skija.Font ), (String)string, (Font)\u0456x\u043e.a_bsm4("\u0458\u0435a", \u0458\u0435a(float ), (float)10.0f));
            CallSite callSite3 = \u0456x\u043e.a_bsm5("\u0441a\u0441\u0441", \u0441a\u0441\u0441(java.lang.String io.github.humbleui.skija.Font ), (String)((Object)callSite), (Font)\u0456x\u043e.a_bsm4("\u0458\u0435a", \u0458\u0435a(float ), (float)8.0f));
            reference var12_16 = callSite2 + callSite3 + 12.0f;
            float f3 = 25.0f + var12_16;
            if (\u0456x\u043e.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_6112(class_68803) == null) {
                v0 = true;
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
            } else {
                v0 = ci\u0430p\u04302.\u0440\u0445axe\u0435a = false;
            }
            if (ci\u0430p\u04302.\u0440\u0445axe\u0435a) {
                ci\u0430p\u04302.\u0458\u043ex\u0458xoa.osj = -f3 - 20.0f;
                if (ci\u0430p\u04302.\u0458\u043ex\u0458xoa.\u0430jxc <= -f3 - 10.0f) {
                    this.pc\u043e.remove(class_68803);
                    switch (0) {
                        default: {
                            continue block9;
                        }
                        case 1: {
                            continue block9;
                        }
                        case 2: 
                    }
                    continue;
                }
            } else {
                ci\u0430p\u04302.\u0458\u043ex\u0458xoa.osj = f;
                ci\u0430p\u04302.jo\u0435\u0445\u0458\u0456\u0440.osj = n;
                ci\u0430p\u04302.ees.osj = f2 = (float)ci\u0430p\u04302.eo\u0456\u0435\u0458 / (float)\u0456x\u043e.a_bsm2("max", max(int int ), (int)1, (int)ci\u0430p\u04302.\u0458x\u0458pc) * f3;
                if (ci\u0430p\u04302.ees.\u0430jxc == -1.0f) {
                    ci\u0430p\u04302.ees.\u0430jxc = f2;
                }
            }
            ci\u0430p\u04302.\u0458\u043ex\u0458xoa.oxjc\u0456(true);
            ci\u0430p\u04302.jo\u0435\u0445\u0458\u0456\u0440.oxjc\u0456(true);
            ci\u0430p\u04302.ees.oxjc\u0456(true);
            f2 = ci\u0430p\u04302.\u0458\u043ex\u0458xoa.\u0430jxc;
            float f4 = ci\u0430p\u04302.jo\u0435\u0445\u0458\u0456\u0440.\u0430jxc;
            \u0456x\u043e.a_bsm6("ip\u0458h\u0445", ip\u0458h\u0445(float float float float float ), (float)f2, (float)f4, (float)20.0f, (float)20.0f, (float)5.0f);
            \u0456x\u043e.a_bsm7("hc\u0456", hc\u0456(float float float float float ), (float)f2, (float)f4, (float)20.0f, (float)20.0f, (float)5.0f);
            \u0456x\u043e.a_bsm6("ip\u0458h\u0445", ip\u0458h\u0445(float float float float float ), (float)(f2 + 25.0f), (float)f4, (float)var12_16, (float)20.0f, (float)5.0f);
            \u0456x\u043e.a_bsm7("hc\u0456", hc\u0456(float float float float float ), (float)(f2 + 25.0f), (float)f4, (float)var12_16, (float)20.0f, (float)5.0f);
            \u0456x\u043e.a_bsm8("\u0441sp", \u0441sp());
            Path path = new Path();
            path.addRRect((RRect)\u0456x\u043e.a_bsm9("makeXYWH", makeXYWH(float float float float float ), (float)f2, (float)f4, (float)20.0f, (float)20.0f, (float)5.0f));
            path.addRRect((RRect)\u0456x\u043e.a_bsm9("makeXYWH", makeXYWH(float float float float float ), (float)(f2 + 25.0f), (float)f4, (float)var12_16, (float)20.0f, (float)5.0f));
            \u0456x\u043e.a_bsm10("x\u0441\u0441", x\u0441\u0441()).clipPath(path, ClipMode.INTERSECT, true);
            \u0456x\u043e.a_bsm12("ja\u0445\u0458", ja\u0445\u0458(float float float float java.awt.Color ), (float)f2, (float)f4, (float)f3, (float)20.0f, (Color)((Object)\u0456x\u043e.a_bsm11("withAlpha", withAlpha(java.awt.Color int ), (Color)this.h\u0445ph().\u0458ces\u0435\u043ep(), (int)(-766706386 + 766706606))));
            \u0456x\u043e.a_bsm12("ja\u0445\u0458", ja\u0445\u0458(float float float float java.awt.Color ), (float)f2, (float)f4, (float)ci\u0430p\u04302.ees.\u0430jxc, (float)20.0f, (Color)((Object)\u0456x\u043e.a_bsm11("withAlpha", withAlpha(java.awt.Color int ), (Color)this.h\u0445ph().aj\u0445\u043e(), (int)(-1006961947 + 1006962067))));
            \u0456x\u043e.a_bsm13("jj\u0430c\u04bb\u0455\u0455", jj\u0430c\u04bb\u0455\u0455());
            \u0456x\u043e.a_bsm14("\u0456p\u0456xc", \u0456p\u0456xc(java.lang.String float float java.awt.Color io.github.humbleui.skija.Font ), (String)string, (float)(f2 + 30.0f), (float)(f4 + 5.0f), (Color)Color.WHITE, (Font)\u0456x\u043e.a_bsm4("\u0458\u0435a", \u0458\u0435a(float ), (float)10.0f));
            \u0456x\u043e.a_bsm14("\u0456p\u0456xc", \u0456p\u0456xc(java.lang.String float float java.awt.Color io.github.humbleui.skija.Font ), (String)((Object)callSite), (float)(f2 + 32.0f + callSite2), (float)(f4 + 8.0f), (Color)new Color(-26247687 + 26247887, -1355660506 + 1355660706, -1956347671 + 1956347871), (Font)\u0456x\u043e.a_bsm4("\u0458\u0435a", \u0458\u0435a(float ), (float)8.0f));
            \u0456x\u043e.a_bsm8("\u0441sp", \u0441sp());
            \u0456x\u043e.a_bsm15("\u0455\u04bbx", \u0455\u04bbx(net.minecraft.class_6880<net.minecraft.class_1291> float float float float ), (class_6880)class_68803, (float)(f2 + 2.0f), (float)(f4 + 2.0f), (float)16.0f, (float)16.0f);
            \u0456x\u043e.a_bsm13("jj\u0430c\u04bb\u0455\u0455", jj\u0430c\u04bb\u0455\u0455());
            this.c\u0455x.\u0458ae((float)\u0456x\u043e.a_bsm16("max", max(float float ), (float)f3, (float)this.c\u0455x.p\u0435\u0455()));
            this.c\u0455x.e\u0440e\u0456\u0456o\u0458((float)(n += 28) - this.c\u0455x.o\u0440xj());
        }
    }

    public /* synthetic */ String hap\u043eepi(class_6880<class_1291> class_68802, ci\u0430p\u0430 ci\u0430p\u04302) {
        CallSite callSite;
        Object object;
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        String string = ((class_1291)class_68802.comp_349()).method_5560().getString();
        if (ci\u0430p\u04302.\u0430\u0430\u0456c\u0440s\u0458 == 0) {
            object = \u0456x\u043e.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[0], (int)(271465370 + 1845838488), (int)(1809368668 + 1591542873));
        } else {
            int n = ci\u0430p\u04302.\u0430\u0430\u0456c\u0440s\u0458 + 1;
            byte[] byArray = new byte[-1138116686 + 1138116704];
            byArray[0] = -513547683 + 513547735;
            byArray[1] = 0;
            byArray[2] = -669383660 + 669383588;
            byArray[3] = -1811212655 + 1811212679;
            byArray[4] = -370482372 + 370482392;
            byArray[5] = -728438814 + 728438929;
            byArray[-38743461 + 38743467] = -1435666309 + 1435666329;
            byArray[-383905316 + 383905323] = -404845602 + 404845533;
            byArray[-1290868360 + 1290868368] = -965837112 + 965837001;
            byArray[-529379530 + 529379539] = -174634421 + 174634362;
            byArray[-1381465382 + 1381465392] = -1317457771 + 1317457769;
            byArray[-635068905 + 635068916] = -394036612 + 394036711;
            byArray[-464343292 + 464343304] = -617564735 + 617564641;
            byArray[-1882444990 + 1882445003] = -1241945501 + 1241945583;
            byArray[-1187996133 + 1187996147] = -1081617576 + 1081617476;
            byArray[-1867162932 + 1867162947] = -966726435 + 966726358;
            byArray[-1930662400 + 1930662416] = -1496867201 + 1496867215;
            byArray[-1081770389 + 1081770406] = -1118303026 + 1118303006;
            CallSite callSite2 = \u0456x\u043e.a_bsm17("method_4662", method_4662(java.lang.String java.lang.Object[] ), (String)((String)((Object)\u0456x\u043e.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-1877044422 + 115213250), (int)(-1267993071 + 673375869))) + n), (Object[])new Object[0]);
            object = (String)((Object)\u0456x\u043e.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-881204598 + 881204593}, (int)(-1317674605 + 907281910), (int)(-883628425 + 15984081))) + callSite2;
        }
        CallSite callSite3 = callSite = object;
        String string2 = string;
        return string2 + callSite3;
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
}

