/*
 * Decompiled with CFR 0.152.
 */
package \u0445\u0430p\u0440;

import com.mojang.blaze3d.platform.GlStateManager;
import c\u0445is.hoi\u0435h\u0440;
import c\u0445is.i\u0456o\u0430\u0435o;
import ie\u0441\u0430ej.hcce;
import ie\u0441\u0430ej.\u0456oc;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import net.minecraft.class_1657;
import net.minecraft.class_243;
import net.minecraft.class_287;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_2960;
import net.minecraft.class_4587;
import net.minecraft.class_757;
import net.minecraft.class_7833;
import org.joml.Matrix4f;
import o\u0455sio\u0440.\u0445\u0458\u0458h\u0445\u0430a;
import spso.\u0430c\u0440;
import spso.\u0441a\u0458p;
import \u0435xp.\u043ea\u0441\u0430p;
import \u0445eo.c\u0455pi;
import \u0445eo.\u0456p\u0430\u043e\u0458\u043e;
import \u0445eo.\u0458i\u0456x;
import \u0445\u0430p\u0440.\u0441ha\u0456;

@\u0456p\u0430\u043e\u0458\u043e(sp\u0456p\u0445\u0435="JumpCircle", a\u0456j\u0430\u0455\u04bb="JumpCircle", s\u0455cj=\u0458i\u0456x.RENDER)
public class x\u0435\u0430xepo
extends c\u0455pi {
    private final /* synthetic */ List<\u0441ha\u0456> s\u0430\u0430;
    private final /* synthetic */ List<class_1657> \u0455oo;
    public /* synthetic */ \u043ea\u0441\u0430p \u0445\u0445\u0440;

    public x\u0435\u0430xepo() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        this.s\u0430\u0430 = new ArrayList<\u0441ha\u0456>();
        this.\u0455oo = new CopyOnWriteArrayList<class_1657>();
        byte[] byArray = new byte[-37457978 + 37457987];
        byArray[0] = -1277691749 + 1277691875;
        byArray[1] = -953673930 + 953673948;
        byArray[2] = -32008435 + 32008399;
        byArray[3] = -692891213 + 692891264;
        byArray[4] = -1208323818 + 1208323813;
        byArray[5] = -379848316 + 379848326;
        byArray[-1030864659 + 1030864665] = -550378004 + 550378100;
        byArray[-498919169 + 498919176] = -1174763128 + 1174763009;
        byArray[-1991345273 + 1991345281] = -1639150554 + 1639150561;
        this.\u0445\u0445\u0440 = ((\u0430c\u0440)((Object)x\u0435\u0430xepo.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)x\u0435\u0430xepo.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-778086702 + 1303431293), (int)(1560244060 + 522128577)))))).s\u0458\u0458a(1000.0f).x\u0455heah\u0445(100.0f).\u043ecxi\u0455(0.0f).a\u0455\u0445\u0435c(5000.0f).\u0458c\u0456\u0440().getFloatValue();
    }

    @\u0445\u0458\u0458h\u0445\u0430a
    public void \u04bbo\u0435(hoi\u0435h\u0440 hoi\u0435h\u04402) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        for (class_1657 class_16573 : x\u0435\u0430xepo.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.method_18456()) {
            if (this.\u0455oo.contains(class_16573) || class_16573.method_24828() || x\u0435\u0430xepo.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 != class_16573) continue;
            this.\u0455oo.add(class_16573);
        }
        this.\u0455oo.forEach(class_16572 -> {
            if ((3 * 3 + 3) % 2 == 0) {
            }
            if (class_16572 != null && class_16572.method_24828()) {
                this.s\u0430\u0430.add(new \u0441ha\u0456(new class_243(class_16572.method_23317(), class_16572.method_23318() + (double)0.005f, class_16572.method_23321()), new \u0456oc()));
                this.\u0455oo.remove(class_16572);
            }
        });
        float f = this.\u0445\u0445\u0440.axpacc();
        this.s\u0430\u0430.removeIf(\u0441ha\u04562 -> {
            if (2 * 2 * 2 >= 0) {
            }
            return \u0441ha\u04562.ii\u043eo\u0456j.\u0455\u0441p\u0440e((long)(1500.0f + f));
        });
    }

    @\u0445\u0458\u0458h\u0445\u0430a
    public void o\u04bbjp(i\u0456o\u0430\u0435o i\u0456o\u0430\u0435o2) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        if (this.s\u0430\u0430.isEmpty()) {
            return;
        }
        class_4587 class_45872 = i\u0456o\u0430\u0435o2.\u0445\u0455i\u0430pi();
        x\u0435\u0430xepo.a_bsm2("reverse", reverse(java.util.List<?> ), this.s\u0430\u0430);
        x\u0435\u0430xepo.a_bsm3("disableDepthTest", disableDepthTest());
        x\u0435\u0430xepo.a_bsm4("enableBlend", enableBlend());
        x\u0435\u0430xepo.a_bsm5("blendFunc", blendFunc(com.mojang.blaze3d.platform.GlStateManager$class_4535 com.mojang.blaze3d.platform.GlStateManager$class_4534 ), (GlStateManager.class_4535)GlStateManager.class_4535.SRC_ALPHA, (GlStateManager.class_4534)GlStateManager.class_4534.ONE);
        x\u0435\u0430xepo.a_bsm6("setShaderTexture", setShaderTexture(int net.minecraft.class_2960 ), (int)0, (class_2960)hcce.o\u0441c);
        x\u0435\u0430xepo.a_bsm7("setShader", setShader(java.util.function.Supplier ), class_757::method_34543);
        CallSite callSite = x\u0435\u0430xepo.a_bsm8("renderThreadTesselator", renderThreadTesselator());
        class_287 class_2872 = callSite.method_1349();
        class_2872.method_1328(class_293.class_5596.field_27382, class_290.field_1575);
        float f = 1000.0f;
        float f2 = 500.0f;
        float f3 = this.\u0445\u0445\u0440.axpacc();
        for (\u0441ha\u0456 \u0441ha\u04562 : this.s\u0430\u0430) {
            float f4;
            float f5 = \u0441ha\u04562.ii\u043eo\u0456j.j\u0441\u0458s\u0458();
            float f6 = 1.0f;
            if (f5 <= f) {
                f4 = 1.0f - (float)x\u0435\u0430xepo.a_bsm9("pow", pow(double double ), (double)(1.0f - f5 / f), (double)4.0);
            } else if (f5 <= f + f3) {
                f4 = 1.0f;
            } else {
                CallSite callSite2 = x\u0435\u0430xepo.a_bsm10("min", min(float float ), (float)1.0f, (float)((f5 - f - f3) / f2));
                f4 = 1.0f - (float)x\u0435\u0430xepo.a_bsm9("pow", pow(double double ), (double)((double)callSite2), (double)2.0);
                f6 = 1.0f - callSite2;
            }
            int n = this.h\u0445ph().aj\u0445\u043e().getRGB();
            int n2 = n >> -220397917 + 220397933 & -1908786555 + 1908786810;
            int n3 = n >> -1706254729 + 1706254737 & -492236931 + 492237186;
            int n4 = n & -2022514808 + 2022515063;
            int n5 = (int)(f6 * 255.0f);
            class_45872.method_22903();
            class_45872.method_22904(\u0441ha\u04562.\u0455x\u0441().field_1352 - x\u0435\u0430xepo.\u0430\u0445j\u0445s\u0456\u04bb.method_1561().field_4686.method_19326().method_10216(), \u0441ha\u04562.\u0455x\u0441().field_1351 - x\u0435\u0430xepo.\u0430\u0445j\u0445s\u0456\u04bb.method_1561().field_4686.method_19326().method_10214(), \u0441ha\u04562.\u0455x\u0441().field_1350 - x\u0435\u0430xepo.\u0430\u0445j\u0445s\u0456\u04bb.method_1561().field_4686.method_19326().method_10215());
            class_45872.method_22907(class_7833.field_40714.rotationDegrees(90.0f));
            class_45872.method_22907(class_7833.field_40718.rotationDegrees(f4 * 1000.0f));
            float f7 = f4 * 2.0f;
            Matrix4f matrix4f = class_45872.method_23760().method_23761();
            class_2872.method_22918(matrix4f, -f4, -f4 + f7, 0.0f).method_22913(0.0f, 1.0f).method_1336(n2, n3, n4, n5).method_1344();
            class_2872.method_22918(matrix4f, -f4 + f7, -f4 + f7, 0.0f).method_22913(1.0f, 1.0f).method_1336(n2, n3, n4, n5).method_1344();
            class_2872.method_22918(matrix4f, -f4 + f7, -f4, 0.0f).method_22913(1.0f, 0.0f).method_1336(n2, n3, n4, n5).method_1344();
            class_2872.method_22918(matrix4f, -f4, -f4, 0.0f).method_22913(0.0f, 0.0f).method_1336(n2, n3, n4, n5).method_1344();
            class_45872.method_22909();
        }
        x\u0435\u0430xepo.a_bsm11("method_43433", method_43433(net.minecraft.class_287$class_7433 ), (class_287.class_7433)class_2872.method_1326());
        x\u0435\u0430xepo.a_bsm12("disableBlend", disableBlend());
        x\u0435\u0430xepo.a_bsm13("setShaderColor", setShaderColor(float float float float ), (float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        x\u0435\u0430xepo.a_bsm14("enableDepthTest", enableDepthTest());
        x\u0435\u0430xepo.a_bsm2("reverse", reverse(java.util.List<?> ), this.s\u0430\u0430);
    }

    @Override
    public /* synthetic */ void onDisable() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        this.s\u0430\u0430.clear();
        this.\u0455oo.clear();
        super.onDisable();
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
}

