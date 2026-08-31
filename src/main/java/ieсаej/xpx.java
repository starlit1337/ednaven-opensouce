/*
 * Decompiled with CFR 0.152.
 */
package ie\u0441\u0430ej;

import ie\u0441\u0430ej.pjxx;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Map;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_287;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_2960;
import net.minecraft.class_4587;
import net.minecraft.class_757;
import net.minecraft.class_898;
import org.joml.Quaternionf;

public class xpx
implements pjxx {
    public xpx() {
        if (true | false) {
        }
    }

    public static /* synthetic */ void \u0445\u0455\u0445e\u0440(class_4587 class_45872, int n, int n2, int n3, int n4, float f, float f2, class_1297 class_12972, class_2960 class_29602, boolean bl, Color color, Color color2, Color color3, Color color4) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        class_898 class_8982 = \u0430\u0445j\u0445s\u0456\u04bb.method_1561();
        Quaternionf quaternionf = class_8982.field_4686.method_23767();
        double d = class_12972.field_6038 + (class_12972.method_23317() - class_12972.field_6038) * (double)\u0430\u0445j\u0445s\u0456\u04bb.method_1488() - class_8982.field_4686.method_19326().method_10216();
        double d2 = class_12972.field_5971 + 1.0 + (class_12972.method_23318() + 1.0 - (class_12972.field_5971 + 1.0)) * (double)\u0430\u0445j\u0445s\u0456\u04bb.method_1488() - class_8982.field_4686.method_19326().method_10214();
        double d3 = class_12972.field_5989 + (class_12972.method_23321() - class_12972.field_5989) * (double)\u0430\u0445j\u0445s\u0456\u04bb.method_1488() - class_8982.field_4686.method_19326().method_10215();
        class_45872.method_22903();
        class_45872.method_22904(d, d2, d3);
        class_45872.method_22907(quaternionf);
        if (bl) {
            float f3 = (float)(xpx.a_bsm1("sin", sin(double ), (double)((double)xpx.a_bsm0("currentTimeMillis", currentTimeMillis()) / 800.0)) * 360.0);
            class_45872.method_22907(new Quaternionf().rotationAxis((float)xpx.a_bsm2("toRadians", toRadians(double ), (double)f3), 0.0f, 0.0f, 1.0f));
        }
        class_45872.method_22905(0.03f, 0.03f, 0.03f);
        xpx.a_bsm3("enableBlend", enableBlend());
        xpx.a_bsm4("disableDepthTest", disableDepthTest());
        xpx.a_bsm5("defaultBlendFunc", defaultBlendFunc());
        xpx.a_bsm6("setShader", setShader(java.util.function.Supplier ), class_757::method_34543);
        xpx.a_bsm7("setShaderColor", setShaderColor(float float float float ), (float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        xpx.a_bsm8("setShaderTexture", setShaderTexture(int net.minecraft.class_2960 ), (int)0, (class_2960)class_29602);
        xpx.a_bsm9("texParameter", texParameter(int int int ), (int)(-855841228 + 855844781), (int)(-1650872161 + 0x62667762), (int)(-1678635537 + 1678645266));
        xpx.a_bsm9("texParameter", texParameter(int int int ), (int)(-1906404069 + 1906407622), (int)(-1205911889 + 1205922129), (int)(-1406266645 + 1406276374));
        xpx.a_bsm10("\u0456aaxs\u043e", \u0456aaxs\u043e(net.minecraft.class_4587 int int float float int int float float java.awt.Color java.awt.Color java.awt.Color java.awt.Color ), (class_4587)class_45872, (int)n, (int)n2, (float)0.0f, (float)0.0f, (int)n3, (int)n4, (float)f, (float)f2, (Color)color, (Color)color2, (Color)color3, (Color)color4);
        xpx.a_bsm11("disableBlend", disableBlend());
        xpx.a_bsm12("enableDepthTest", enableDepthTest());
        xpx.a_bsm7("setShaderColor", setShaderColor(float float float float ), (float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        class_45872.method_22909();
    }

    public static /* synthetic */ void x\u0441c\u043e\u0458(class_4587 class_45872, class_1309 class_13092, float f, float f2) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        if (class_13092 == null || f2 <= 0.001f) {
            return;
        }
        reference var4_4 = xpx.a_bsm13("method_16436", method_16436(double double double ), (double)f, (double)class_13092.field_6014, (double)class_13092.method_23317()) - xpx.\u0430\u0445j\u0445s\u0456\u04bb.method_1561().field_4686.method_19326().field_1352;
        reference var6_5 = xpx.a_bsm13("method_16436", method_16436(double double double ), (double)f, (double)class_13092.field_6036, (double)class_13092.method_23318()) + xpx.a_bsm1("sin", sin(double ), (double)((double)xpx.a_bsm0("currentTimeMillis", currentTimeMillis()) / 200.0)) + 1.0 - xpx.\u0430\u0445j\u0445s\u0456\u04bb.method_1561().field_4686.method_19326().field_1351;
        reference var8_6 = xpx.a_bsm13("method_16436", method_16436(double double double ), (double)f, (double)class_13092.field_5969, (double)class_13092.method_23321()) - xpx.\u0430\u0445j\u0445s\u0456\u04bb.method_1561().field_4686.method_19326().field_1350;
        CallSite callSite = xpx.a_bsm14("\u0440\u0456\u0435a", \u0440\u0456\u0435a(int ), (int)0);
        float f3 = (float)((xpx.a_bsm1("sin", sin(double ), (double)((double)xpx.a_bsm0("currentTimeMillis", currentTimeMillis()) / 500.0)) + 1.0) / 2.0);
        float f4 = 0.6f + 0.4f * f3;
        int n = (int)((float)((Color)((Object)callSite)).getRed() * f4);
        int n2 = (int)((float)((Color)((Object)callSite)).getGreen() * f4);
        int n3 = (int)((float)((Color)((Object)callSite)).getBlue() * f4);
        int n4 = (int)(153.0f * f2);
        class_45872.method_22903();
        class_45872.method_22904((double)var4_4, (double)var6_5, (double)var8_6);
        xpx.a_bsm3("enableBlend", enableBlend());
        xpx.a_bsm5("defaultBlendFunc", defaultBlendFunc());
        xpx.a_bsm15("disableCull", disableCull());
        xpx.a_bsm16("depthMask", depthMask(boolean ), (boolean)false);
        xpx.a_bsm4("disableDepthTest", disableDepthTest());
        xpx.a_bsm6("setShader", setShader(java.util.function.Supplier ), class_757::method_34540);
        float f5 = 0.19634955f;
        float f6 = (float)(-xpx.a_bsm17("cos", cos(double ), (double)((double)xpx.a_bsm0("currentTimeMillis", currentTimeMillis()) / 200.0)) / 2.0);
        CallSite callSite2 = xpx.a_bsm18("method_1348", method_1348());
        class_287 class_2872 = callSite2.method_1349();
        class_2872.method_1328(class_293.class_5596.field_27380, class_290.field_1576);
        float f7 = 0.0f;
        while ((double)f7 <= Math.PI * 2 + (double)f5) {
            class_2872.method_22918(class_45872.method_23760().method_23761(), (float)(0.67 * xpx.a_bsm17("cos", cos(double ), (double)f7)), 0.0f, (float)(0.67 * xpx.a_bsm1("sin", sin(double ), (double)f7))).method_1336(n, n2, n3, n4).method_1344();
            f7 += f5;
        }
        f7 = 0.0f;
        while ((double)f7 <= Math.PI * 2 + (double)f5) {
            class_2872.method_22918(class_45872.method_23760().method_23761(), (float)(0.67 * xpx.a_bsm17("cos", cos(double ), (double)f7)), 0.0f, (float)(0.67 * xpx.a_bsm1("sin", sin(double ), (double)f7))).method_1336(n, n2, n3, n4).method_1344();
            class_2872.method_22918(class_45872.method_23760().method_23761(), (float)(0.67 * xpx.a_bsm17("cos", cos(double ), (double)f7)), f6, (float)(0.67 * xpx.a_bsm1("sin", sin(double ), (double)f7))).method_1336(n, n2, n3, 0).method_1344();
            f7 += f5;
        }
        xpx.a_bsm19("method_43433", method_43433(net.minecraft.class_287$class_7433 ), (class_287.class_7433)class_2872.method_1326());
        xpx.a_bsm16("depthMask", depthMask(boolean ), (boolean)true);
        xpx.a_bsm12("enableDepthTest", enableDepthTest());
        xpx.a_bsm20("enableCull", enableCull());
        xpx.a_bsm11("disableBlend", disableBlend());
        class_45872.method_22909();
    }

    public static /* synthetic */ void a\u0435\u0458(class_4587 class_45872, Map<class_1297, class_243> map, class_1297 class_12972) {
        class_243 class_2432;
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if ((class_2432 = map.get(class_12972)) == null) {
            return;
        }
        class_243 class_2433 = xpx.\u0430\u0445j\u0445s\u0456\u04bb.field_1773.method_19418().method_19326();
        class_238 class_2383 = new class_238(class_2432.field_1352 - 0.4 - class_2433.field_1352, class_2432.field_1351 - class_2433.field_1351, class_2432.field_1350 - 0.4 - class_2433.field_1350, class_2432.field_1352 + 0.4 - class_2433.field_1352, class_2432.field_1351 + 1.9 - class_2433.field_1351, class_2432.field_1350 + 0.4 - class_2433.field_1350);
        class_45872.method_22903();
        xpx.a_bsm3("enableBlend", enableBlend());
        xpx.a_bsm5("defaultBlendFunc", defaultBlendFunc());
        xpx.a_bsm4("disableDepthTest", disableDepthTest());
        xpx.a_bsm6("setShader", setShader(java.util.function.Supplier ), class_757::method_34539);
        xpx.a_bsm7("setShaderColor", setShaderColor(float float float float ), (float)0.2f, (float)0.5f, (float)1.0f, (float)0.3f);
        xpx.a_bsm21("\u0458\u0458\u04bb", \u0458\u0458\u04bb(net.minecraft.class_238 net.minecraft.class_4587 ), (class_238)class_2383, (class_4587)class_45872);
        xpx.a_bsm12("enableDepthTest", enableDepthTest());
        xpx.a_bsm7("setShaderColor", setShaderColor(float float float float ), (float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        class_45872.method_22909();
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
}

