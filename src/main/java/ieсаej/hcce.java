/*
 * Decompiled with CFR 0.152.
 */
package ie\u0441\u0430ej;

import com.mojang.blaze3d.platform.GlStateManager;
import ie\u0441\u0430ej.i\u0445a\u0456x\u0435\u0430;
import ie\u0441\u0430ej.pjxx;
import ie\u0441\u0430ej.\u0430p\u0455\u043ejp\u043e;
import ie\u0441\u0430ej.\u0441shi\u0435x\u0455;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.OutputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.ByteBuffer;
import java.util.HashMap;
import net.minecraft.class_1011;
import net.minecraft.class_1043;
import net.minecraft.class_1044;
import net.minecraft.class_1309;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_287;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_757;
import net.minecraft.class_7833;
import org.apache.commons.io.output.ByteArrayOutputStream;
import org.joml.Matrix4f;
import r.d8.Cade0e18b60fd9f037d8b2fc8;
import xs\u0441\u0445oa\u0430.sc\u04bb\u0455;
import \u0440o\u0456\u0445o.\u0445\u0440\u0430\u0435\u0445\u043e;

public final class hcce
implements pjxx {
    private static final /* synthetic */ class_238 x\u0441\u0430pxp\u0456;
    public static /* synthetic */ sc\u04bb\u0455 ixoie\u0456\u04bb;
    public static final /* synthetic */ class_2960 \u0456jspc;
    public static final /* synthetic */ class_2960 o\u0441c;
    private static final /* synthetic */ class_2960 i\u0458\u0440;
    public static /* synthetic */ HashMap<Integer, \u0430p\u0455\u043ejp\u043e> p\u0430\u0455;
    public static final /* synthetic */ Matrix4f \u0440xh\u04bbi;
    public static final /* synthetic */ Matrix4f poe\u04bb\u043e\u0455\u043e;
    public static final /* synthetic */ Matrix4f \u0441ij\u0458\u0455\u0456\u0456;

    public static /* synthetic */ double p\u0435\u0455() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return (double)hcce.a_bsm0("method_1551", method_1551()).method_22683().method_4486() / 2.0;
    }

    public static /* synthetic */ void j\u0455\u0435(class_4587 class_45872, double d, double d2, double d3, float f, float f2, int n) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        class_243 class_2432 = hcce.cpx\u0445s\u043ei();
        float f3 = (float)(n >> -1919669482 + 1919669506 & -645666635 + 645666890) / 255.0f;
        float f4 = (float)(n >> -466756378 + 466756394 & -928457737 + 928457992) / 255.0f;
        float f5 = (float)(n >> -2038789926 + 2038789934 & -1447878662 + 1447878917) / 255.0f;
        float f6 = (float)(n & -1032967235 + 1032967490) / 255.0f;
        class_45872.method_22903();
        class_45872.method_22904(d - class_2432.field_1352, d2 - class_2432.field_1351, d3 - class_2432.field_1350);
        class_238 class_2383 = new class_238((double)(-f) / 2.0, 0.0, (double)(-f) / 2.0, (double)f / 2.0, (double)f2, (double)f / 2.0);
        hcce.a_bsm1("enableBlend", enableBlend());
        hcce.a_bsm2("defaultBlendFunc", defaultBlendFunc());
        hcce.a_bsm3("disableDepthTest", disableDepthTest());
        hcce.a_bsm4("depthMask", depthMask(boolean ), (boolean)false);
        hcce.a_bsm5("setShader", setShader(java.util.function.Supplier ), class_757::method_34539);
        hcce.a_bsm6("setShaderColor", setShaderColor(float float float float ), (float)f4, (float)f5, (float)f6, (float)f3);
        hcce.\u0458\u0458\u04bb(class_2383, class_45872);
        hcce.a_bsm6("setShaderColor", setShaderColor(float float float float ), (float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        hcce.a_bsm7("enableDepthTest", enableDepthTest());
        hcce.a_bsm4("depthMask", depthMask(boolean ), (boolean)true);
        hcce.a_bsm8("disableBlend", disableBlend());
        class_45872.method_22909();
    }

    public static /* synthetic */ class_243 \u0435\u0445pe(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        CallSite callSite = hcce.a_bsm0("method_1551", method_1551());
        class_4184 class_41842 = ((class_310)callSite).field_1773.method_19418();
        double d = f + (f4 - f) * f7;
        double d2 = f2 + (f5 - f2) * f7;
        double d3 = f3 + (f6 - f3) * f7;
        class_243 class_2432 = class_41842.method_19326();
        return new class_243(d - class_2432.field_1352, d2 - class_2432.field_1351, d3 - class_2432.field_1350);
    }

    public static /* synthetic */ int \u0455ea\u0440(BufferedImage bufferedImage, boolean bl, boolean bl2) {
        int n;
        if (true | false) {
        }
        if (0 != 0) {
        }
        class_1011 class_10112 = new class_1011(bufferedImage.getWidth(), bufferedImage.getHeight(), !bl);
        for (int i = 0; i < bufferedImage.getWidth(); ++i) {
            for (n = 0; n < bufferedImage.getHeight(); ++n) {
                class_10112.method_4305(i, n, bufferedImage.getRGB(i, n));
            }
        }
        class_1043 class_10432 = new class_1043(class_10112);
        n = class_10432.method_4624();
        if (bl2) {
            hcce.a_bsm9("bindTexture", bindTexture(int ), (int)n);
            hcce.a_bsm10("texParameter", texParameter(int int int ), (int)(-1936857083 + 1936860636), (int)(-1590503423 + 1590513664), (int)(-2000065940 + 2000075669));
            hcce.a_bsm10("texParameter", texParameter(int int int ), (int)(-1062508297 + 1062511850), (int)(-951242503 + 951252743), (int)(-8103034 + 8112763));
        }
        return n;
    }

    public static /* synthetic */ Color \u0445\u043e\u043ehs\u0458(int n, int n2, float f, float f2, float f3) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        int n3 = (int)((hcce.a_bsm11("currentTimeMillis", currentTimeMillis()) / (long)n + (long)n2) % 360L);
        float f4 = (float)n3 / 360.0f;
        Color color = new Color((int)hcce.a_bsm12("HSBtoRGB", HSBtoRGB(float float float ), (float)f4, (float)f, (float)f2));
        return new Color(color.getRed(), color.getGreen(), color.getBlue(), (int)hcce.a_bsm14("max", max(int int ), (int)0, (int)hcce.a_bsm13("min", min(int int ), (int)(-694177902 + 694178157), (int)((int)(f3 * 255.0f)))));
    }

    public static /* synthetic */ void hjjh\u0455e\u0456(class_4587 class_45872, float f, float f2, float f3, float f4, Color color, Color color2, Color color3, Color color4) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        class_287 class_2872 = hcce.a_bsm15("method_1348", method_1348()).method_1349();
        hcce.\u0445\u0445\u0456\u0441();
        hcce.a_bsm5("setShader", setShader(java.util.function.Supplier ), class_757::method_34540);
        class_2872.method_1328(class_293.class_5596.field_27382, class_290.field_1576);
        class_2872.method_22918(matrix4f, f, f4, 0.0f).method_39415(color.getRGB()).method_1344();
        class_2872.method_22918(matrix4f, f3, f4, 0.0f).method_39415(color2.getRGB()).method_1344();
        class_2872.method_22918(matrix4f, f3, f2, 0.0f).method_39415(color3.getRGB()).method_1344();
        class_2872.method_22918(matrix4f, f, f2, 0.0f).method_39415(color4.getRGB()).method_1344();
        hcce.a_bsm16("method_43433", method_43433(net.minecraft.class_287$class_7433 ), (class_287.class_7433)class_2872.method_1326());
        hcce.oieo\u0456();
    }

    public static /* synthetic */ void \u043ea\u0435ejh(\u0441shi\u0435x\u0455 \u0441shi\u0435x\u04552, byte[] byArray) {
        try {
            if (true | false) {
            }
            if (0 != 0) {
            }
            ByteBuffer byteBuffer = ((ByteBuffer)((Object)hcce.a_bsm17("createByteBuffer", createByteBuffer(int ), (int)byArray.length))).put(byArray);
            byteBuffer.flip();
            class_1043 class_10432 = new class_1043((class_1011)hcce.a_bsm18("method_4324", method_4324(java.nio.ByteBuffer ), (ByteBuffer)byteBuffer));
            \u0430\u0445j\u0445s\u0456\u04bb.execute(() -> {
                if (true | false) {
                }
                \u0430\u0445j\u0445s\u0456\u04bb.method_1531().method_4616(\u0441shi\u0435x\u04552.\u0458i\u04bbi\u0440i\u0430(), (class_1044)class_10432);
            });
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static /* synthetic */ void \u0445o\u0435\u043e(class_4587 class_45872, float f, float f2, float f3, float f4, int n, Color color) {
        int n2;
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        f -= (float)n;
        f2 -= (float)n;
        if (!p\u0430\u0455.containsKey(hcce.a_bsm19("valueOf", valueOf(int ), (int)(n2 = (int)((f3 += (float)(n * 2)) * (f4 += (float)(n * 2)) + f3 * (float)n))))) {
            BufferedImage bufferedImage = new BufferedImage((int)f3, (int)f4, 2);
            Graphics graphics = bufferedImage.getGraphics();
            graphics.setColor(new Color(-1));
            graphics.fillRect(n, n, (int)(f3 - (float)(n * 2)), (int)(f4 - (float)(n * 2)));
            graphics.dispose();
            i\u0445a\u0456x\u0435\u0430 i\u0445a\u0456x\u0435\u04302 = new i\u0445a\u0456x\u0435\u0430(n);
            BufferedImage bufferedImage2 = i\u0445a\u0456x\u0435\u04302.\u043eos\u043e\u0445(bufferedImage, null);
            p\u0430\u0455.put((Integer)((Object)hcce.a_bsm19("valueOf", valueOf(int ), (int)n2)), new \u0430p\u0455\u043ejp\u043e(bufferedImage2));
            return;
        }
        p\u0430\u0455.get(hcce.a_bsm19("valueOf", valueOf(int ), (int)n2)).\u0430esi\u0456();
        hcce.a_bsm2("defaultBlendFunc", defaultBlendFunc());
        hcce.a_bsm6("setShaderColor", setShaderColor(float float float float ), (float)((float)color.getRed() / 255.0f), (float)((float)color.getGreen() / 255.0f), (float)((float)color.getBlue() / 255.0f), (float)((float)color.getAlpha() / 255.0f));
        hcce.a_bsm1("enableBlend", enableBlend());
        hcce.\u0441\u0441sx(class_45872, f, f2, f3, f4, 0.0f, 0.0f, f3, f4, f3, f4);
        hcce.a_bsm8("disableBlend", disableBlend());
        hcce.a_bsm6("setShaderColor", setShaderColor(float float float float ), (float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    public static /* synthetic */ void \u0456ji(float f, float f2, float f3, float f4) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        CallSite callSite = hcce.a_bsm0("method_1551", method_1551());
        double d = callSite.method_22683().method_4495();
        int n = callSite.method_22683().method_4506();
        int n2 = (int)((double)f * d);
        int n3 = (int)((double)n - (double)(f2 + f4) * d);
        int n4 = (int)((double)f3 * d);
        int n5 = (int)((double)f4 * d);
        hcce.a_bsm20("enableScissor", enableScissor(int int int int ), (int)n2, (int)n3, (int)n4, (int)n5);
    }

    public static /* synthetic */ void \u0440jc() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        hcce.a_bsm21("disableScissor", disableScissor());
    }

    public static /* synthetic */ void \u0441\u0441sx(class_4587 class_45872, double d, double d2, double d3, double d4, float f, float f2, double d5, double d6, double d7, double d8) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        double d9 = d + d3;
        double d10 = d2 + d4;
        double d11 = 0.0;
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        hcce.a_bsm5("setShader", setShader(java.util.function.Supplier ), class_757::method_34542);
        class_287 class_2872 = hcce.a_bsm15("method_1348", method_1348()).method_1349();
        class_2872.method_1328(class_293.class_5596.field_27382, class_290.field_1585);
        class_2872.method_22918(matrix4f, (float)d, (float)d10, (float)d11).method_22913((f + 0.0f) / (float)d7, (f2 + (float)d6) / (float)d8).method_1344();
        class_2872.method_22918(matrix4f, (float)d9, (float)d10, (float)d11).method_22913((f + (float)d5) / (float)d7, (f2 + (float)d6) / (float)d8).method_1344();
        class_2872.method_22918(matrix4f, (float)d9, (float)d2, (float)d11).method_22913((f + (float)d5) / (float)d7, (f2 + 0.0f) / (float)d8).method_1344();
        class_2872.method_22918(matrix4f, (float)d, (float)d2, (float)d11).method_22913((f + 0.0f) / (float)d7, (f2 + 0.0f) / (float)d8).method_1344();
        hcce.a_bsm16("method_43433", method_43433(net.minecraft.class_287$class_7433 ), (class_287.class_7433)class_2872.method_1326());
    }

    public static /* synthetic */ void e\u0430\u0456a(\u0441shi\u0435x\u0455 \u0441shi\u0435x\u04552, BufferedImage bufferedImage) {
        try {
            if (2 * 2 * 2 >= 0) {
            }
            if (0 != 0) {
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            hcce.a_bsm23("write", write(java.awt.image.RenderedImage java.lang.String java.io.OutputStream ), (RenderedImage)bufferedImage, (String)((Object)hcce.a_bsm22("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-675169762 + 675169843, -1328297602 + 1328297704, -346602590 + 346602586}, (int)(-271407966 + 1976353020), (int)(2043375905 + 31066755))), (OutputStream)byteArrayOutputStream);
            byte[] byArray = byteArrayOutputStream.toByteArray();
            hcce.\u043ea\u0435ejh(\u0441shi\u0435x\u04552, byArray);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static /* synthetic */ void \u0456aaxs\u043e(class_4587 class_45872, int n, int n2, float f, float f2, int n3, int n4, float f3, float f4, Color color, Color color2, Color color3, Color color4) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        float f5 = 1.0f / f3;
        float f6 = 1.0f / f4;
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        class_287 class_2872 = hcce.a_bsm15("method_1348", method_1348()).method_1349();
        class_2872.method_1328(class_293.class_5596.field_27382, class_290.field_1575);
        class_2872.method_22918(matrix4f, (float)n, (float)(n2 + n4), 0.0f).method_22913(f * f5, (f2 + (float)n4) * f6).method_1336(color4.getRed(), color4.getGreen(), color4.getBlue(), color4.getAlpha()).method_1344();
        class_2872.method_22918(matrix4f, (float)(n + n3), (float)(n2 + n4), 0.0f).method_22913((f + (float)n3) * f5, (f2 + (float)n4) * f6).method_1336(color3.getRed(), color3.getGreen(), color3.getBlue(), color3.getAlpha()).method_1344();
        class_2872.method_22918(matrix4f, (float)(n + n3), (float)n2, 0.0f).method_22913((f + (float)n3) * f5, f2 * f6).method_1336(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha()).method_1344();
        class_2872.method_22918(matrix4f, (float)n, (float)n2, 0.0f).method_22913(f * f5, f2 * f6).method_1336(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).method_1344();
        hcce.a_bsm16("method_43433", method_43433(net.minecraft.class_287$class_7433 ), (class_287.class_7433)class_2872.method_1326());
    }

    public static /* synthetic */ class_243 cpx\u0445s\u043ei() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        class_4184 class_41842 = hcce.\u0430\u0445j\u0445s\u0456\u04bb.method_31975().field_4344;
        return class_41842.method_19326();
    }

    public static /* synthetic */ void \u0440\u0455h\u0441\u0445(class_4587 class_45872, float f, float f2, float f3, float f4, int n) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        hcce.x\u0458o\u0435\u0440(class_45872.method_23760().method_23761(), f, f2, f3, f4, n);
    }

    private static /* synthetic */ void x\u0458o\u0435\u0440(Matrix4f matrix4f, float f, float f2, float f3, float f4, int n) {
        float f5;
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        if (f < f3) {
            f5 = f;
            f = f3;
            f3 = f5;
        }
        if (f2 < f4) {
            f5 = f2;
            f2 = f4;
            f4 = f5;
        }
        f5 = (float)(n >> -353912975 + 353912999 & -1473137287 + 1473137542) / 255.0f;
        float f6 = (float)(n >> -1838426440 + 1838426456 & -860453715 + 860453970) / 255.0f;
        float f7 = (float)(n >> -624766158 + 624766166 & -1967912975 + 1967913230) / 255.0f;
        float f8 = (float)(n & -856276225 + 856276480) / 255.0f;
        class_287 class_2872 = hcce.a_bsm15("method_1348", method_1348()).method_1349();
        hcce.a_bsm1("enableBlend", enableBlend());
        hcce.a_bsm2("defaultBlendFunc", defaultBlendFunc());
        hcce.a_bsm6("setShaderColor", setShaderColor(float float float float ), (float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        hcce.a_bsm5("setShader", setShader(java.util.function.Supplier ), class_757::method_34540);
        class_2872.method_1328(class_293.class_5596.field_27382, class_290.field_1576);
        class_2872.method_22918(matrix4f, f, f4, 0.0f).method_22915(f6, f7, f8, f5).method_1344();
        class_2872.method_22918(matrix4f, f3, f4, 0.0f).method_22915(f6, f7, f8, f5).method_1344();
        class_2872.method_22918(matrix4f, f3, f2, 0.0f).method_22915(f6, f7, f8, f5).method_1344();
        class_2872.method_22918(matrix4f, f, f2, 0.0f).method_22915(f6, f7, f8, f5).method_1344();
        hcce.a_bsm15("method_1348", method_1348()).method_1350();
        hcce.a_bsm8("disableBlend", disableBlend());
        hcce.a_bsm6("setShaderColor", setShaderColor(float float float float ), (float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    public static /* synthetic */ void \u0441aa\u043e(class_4587 class_45872, float f, float f2, float f3, float f4, int n) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        CallSite callSite = hcce.a_bsm15("method_1348", method_1348());
        class_287 class_2872 = callSite.method_1349();
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        float f5 = (float)(n >> -1961934986 + 1961935010 & -1224466719 + 1224466974) / 255.0f;
        float f6 = (float)(n >> -995706203 + 995706219 & -545761859 + 545762114) / 255.0f;
        float f7 = (float)(n >> -661880726 + 661880734 & -387821771 + 387822026) / 255.0f;
        float f8 = (float)(n & -983583813 + 983584068) / 255.0f;
        class_2872.method_1328(class_293.class_5596.field_27382, class_290.field_1576);
        class_2872.method_22918(matrix4f, f, f2 + f4, 0.0f).method_22915(f6, f7, f8, f5).method_1344();
        class_2872.method_22918(matrix4f, f + f3, f2 + f4, 0.0f).method_22915(f6, f7, f8, f5).method_1344();
        class_2872.method_22918(matrix4f, f + f3, f2, 0.0f).method_22915(f6, f7, f8, f5).method_1344();
        class_2872.method_22918(matrix4f, f, f2, 0.0f).method_22915(f6, f7, f8, f5).method_1344();
        callSite.method_1350();
    }

    private static /* synthetic */ void j\u0435e\u0458(class_287 class_2872, Matrix4f matrix4f, float f, float f2, int n) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        float f3 = (float)(n >> -358850802 + 358850826 & -2089284606 + 2089284861) / 255.0f;
        float f4 = (float)(n >> -1055322248 + 1055322264 & -883184112 + 883184367) / 255.0f;
        float f5 = (float)(n >> -1309179723 + 1309179731 & -371228946 + 371229201) / 255.0f;
        float f6 = (float)(n & -515076748 + 515077003) / 255.0f;
        class_2872.method_22918(matrix4f, f, f2, 0.0f).method_22915(f4, f5, f6, f3).method_1344();
    }

    public static /* synthetic */ void \u0445\u0445\u0456\u0441() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        hcce.a_bsm1("enableBlend", enableBlend());
        hcce.a_bsm2("defaultBlendFunc", defaultBlendFunc());
        hcce.a_bsm6("setShaderColor", setShaderColor(float float float float ), (float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    public static /* synthetic */ void oieo\u0456() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        hcce.a_bsm8("disableBlend", disableBlend());
        hcce.a_bsm6("setShaderColor", setShaderColor(float float float float ), (float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    public static /* synthetic */ void x\u0456s\u0440j\u0458\u0445(class_4587 class_45872, float f, float f2, float f3, float f4, float f5, int object) {
        double d;
        int n;
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if (object == -1772970312 + 1789747527) {
            object = hcce.a_bsm24("method_27764", method_27764(int int int int ), (int)(-1619716540 + 1619716795), (int)(-1785828262 + 1785828517), (int)(-1570725198 + 1570725453), (int)(-2026858433 + 2026858688));
        }
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        if (f5 > f3 / 2.0f) {
            f5 = f3 / 2.0f;
        }
        if (f5 > f4 / 2.0f) {
            f5 = f4 / 2.0f;
        }
        hcce.a_bsm25("lineWidth", lineWidth(float ), (float)1.0f);
        hcce.\u0441aa\u043e(class_45872, f + f5, f2 + f5, f3 - f5 * 2.0f, f4 - f5 * 2.0f, object);
        hcce.\u0441aa\u043e(class_45872, f + f5, f2, f3 - f5 * 2.0f, f5, object);
        hcce.\u0441aa\u043e(class_45872, f + f5, f2 + f4 - f5, f3 - f5 * 2.0f, f5, object);
        hcce.\u0441aa\u043e(class_45872, f, f2 + f5, f5, f4 - f5 * 2.0f, object);
        hcce.\u0441aa\u043e(class_45872, f + f3 - f5, f2 + f5, f5, f4 - f5 * 2.0f, object);
        CallSite callSite = hcce.a_bsm15("method_1348", method_1348());
        class_287 class_2872 = callSite.method_1349();
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        class_2872.method_1328(class_293.class_5596.field_27381, class_290.field_1576);
        float f6 = f + f5;
        float f7 = f2 + f5;
        int n2 = (int)hcce.a_bsm27("min", min(float float ), (float)hcce.a_bsm26("max", max(float float ), (float)f5, (float)10.0f), (float)90.0f);
        hcce.j\u0435e\u0458(class_2872, matrix4f, f6, f7, object);
        for (n = 0; n <= n2; ++n) {
            d = Math.PI * 2 * (double)(n + (-662150004 + 662150184)) / (double)(n2 * 4);
            hcce.j\u0435e\u0458(class_2872, matrix4f, (float)((double)f6 + hcce.a_bsm28("sin", sin(double ), (double)d) * (double)f5), (float)((double)f7 + hcce.a_bsm29("cos", cos(double ), (double)d) * (double)f5), object);
        }
        callSite.method_1350();
        class_2872.method_1328(class_293.class_5596.field_27381, class_290.field_1576);
        f6 = f + f3 - f5;
        f7 = f2 + f5;
        hcce.j\u0435e\u0458(class_2872, matrix4f, f6, f7, object);
        for (n = 0; n <= n2; ++n) {
            d = Math.PI * 2 * (double)(n + (-1938342314 + 1938342404)) / (double)(n2 * 4);
            hcce.j\u0435e\u0458(class_2872, matrix4f, (float)((double)f6 + hcce.a_bsm28("sin", sin(double ), (double)d) * (double)f5), (float)((double)f7 + hcce.a_bsm29("cos", cos(double ), (double)d) * (double)f5), object);
        }
        callSite.method_1350();
        class_2872.method_1328(class_293.class_5596.field_27381, class_290.field_1576);
        f6 = f + f5;
        f7 = f2 + f4 - f5;
        hcce.j\u0435e\u0458(class_2872, matrix4f, f6, f7, object);
        for (n = 0; n <= n2; ++n) {
            d = Math.PI * 2 * (double)(n + (-1021104177 + 1021104447)) / (double)(n2 * 4);
            hcce.j\u0435e\u0458(class_2872, matrix4f, (float)((double)f6 + hcce.a_bsm28("sin", sin(double ), (double)d) * (double)f5), (float)((double)f7 + hcce.a_bsm29("cos", cos(double ), (double)d) * (double)f5), object);
        }
        callSite.method_1350();
        class_2872.method_1328(class_293.class_5596.field_27381, class_290.field_1576);
        f6 = f + f3 - f5;
        f7 = f2 + f4 - f5;
        hcce.j\u0435e\u0458(class_2872, matrix4f, f6, f7, object);
        block7: for (n = 0; n <= n2; ++n) {
            d = Math.PI * 2 * (double)n / (double)(n2 * 4);
            hcce.j\u0435e\u0458(class_2872, matrix4f, (float)((double)f6 + hcce.a_bsm28("sin", sin(double ), (double)d) * (double)f5), (float)((double)f7 + hcce.a_bsm29("cos", cos(double ), (double)d) * (double)f5), object);
            switch (0) {
                default: {
                    continue block7;
                }
                case 1: {
                    continue block7;
                }
                case 2: 
            }
        }
        callSite.method_1350();
    }

    public static /* synthetic */ void \u0458\u0458\u04bb(class_238 class_2383, class_4587 class_45872) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        CallSite callSite = hcce.a_bsm30("renderThreadTesselator", renderThreadTesselator());
        class_287 class_2872 = callSite.method_1349();
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        class_2872.method_1328(class_293.class_5596.field_27382, class_290.field_1592);
        class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1322, (float)class_2383.field_1321).method_1344();
        class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1322, (float)class_2383.field_1321).method_1344();
        class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1322, (float)class_2383.field_1324).method_1344();
        class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1322, (float)class_2383.field_1324).method_1344();
        class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1325, (float)class_2383.field_1321).method_1344();
        class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1325, (float)class_2383.field_1324).method_1344();
        class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1325, (float)class_2383.field_1324).method_1344();
        class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1325, (float)class_2383.field_1321).method_1344();
        class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1322, (float)class_2383.field_1321).method_1344();
        class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1325, (float)class_2383.field_1321).method_1344();
        class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1325, (float)class_2383.field_1321).method_1344();
        class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1322, (float)class_2383.field_1321).method_1344();
        class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1322, (float)class_2383.field_1321).method_1344();
        class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1325, (float)class_2383.field_1321).method_1344();
        class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1325, (float)class_2383.field_1324).method_1344();
        class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1322, (float)class_2383.field_1324).method_1344();
        class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1322, (float)class_2383.field_1324).method_1344();
        class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1322, (float)class_2383.field_1324).method_1344();
        class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1325, (float)class_2383.field_1324).method_1344();
        class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1325, (float)class_2383.field_1324).method_1344();
        class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1322, (float)class_2383.field_1321).method_1344();
        class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1322, (float)class_2383.field_1324).method_1344();
        class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1325, (float)class_2383.field_1324).method_1344();
        class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1325, (float)class_2383.field_1321).method_1344();
        hcce.a_bsm16("method_43433", method_43433(net.minecraft.class_287$class_7433 ), (class_287.class_7433)class_2872.method_1326());
    }

    public static /* synthetic */ void si\u0440\u0455o(class_238 class_2383, class_4587 class_45872) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        class_287 class_2872 = hcce.a_bsm15("method_1348", method_1348()).method_1349();
        hcce.a_bsm5("setShader", setShader(java.util.function.Supplier ), class_757::method_34539);
        class_2872.method_1328(class_293.class_5596.field_29344, class_290.field_1592);
        class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1322, (float)class_2383.field_1321).method_1344();
        class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1322, (float)class_2383.field_1321).method_1344();
        class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1322, (float)class_2383.field_1321).method_1344();
        class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1322, (float)class_2383.field_1324).method_1344();
        class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1322, (float)class_2383.field_1324).method_1344();
        class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1322, (float)class_2383.field_1324).method_1344();
        class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1322, (float)class_2383.field_1324).method_1344();
        class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1322, (float)class_2383.field_1321).method_1344();
        class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1322, (float)class_2383.field_1321).method_1344();
        class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1325, (float)class_2383.field_1321).method_1344();
        class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1322, (float)class_2383.field_1321).method_1344();
        class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1325, (float)class_2383.field_1321).method_1344();
        class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1322, (float)class_2383.field_1324).method_1344();
        class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1325, (float)class_2383.field_1324).method_1344();
        class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1322, (float)class_2383.field_1324).method_1344();
        class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1325, (float)class_2383.field_1324).method_1344();
        class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1325, (float)class_2383.field_1321).method_1344();
        class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1325, (float)class_2383.field_1321).method_1344();
        class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1325, (float)class_2383.field_1321).method_1344();
        class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1325, (float)class_2383.field_1324).method_1344();
        class_2872.method_22918(matrix4f, (float)class_2383.field_1320, (float)class_2383.field_1325, (float)class_2383.field_1324).method_1344();
        class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1325, (float)class_2383.field_1324).method_1344();
        class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1325, (float)class_2383.field_1324).method_1344();
        class_2872.method_22918(matrix4f, (float)class_2383.field_1323, (float)class_2383.field_1325, (float)class_2383.field_1321).method_1344();
        hcce.a_bsm16("method_43433", method_43433(net.minecraft.class_287$class_7433 ), (class_287.class_7433)class_2872.method_1326());
    }

    public static /* synthetic */ boolean xip\u0458s\u0430(int n, int n2, float f, float f2, float f3, float f4) {
        boolean bl;
        if (true | false) {
        }
        if (0 != 0) {
        }
        if ((float)n > f && (float)n < f3 && (float)n2 > f2 && (float)n2 < f4) {
            bl = true;
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
            bl = false;
        }
        return bl;
    }

    public static /* synthetic */ boolean i\u0430\u0440(int n, int n2, float f, float f2, float f3, float f4) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return (float)n > f && (float)n < f + f3 && (float)n2 > f2 && (float)n2 < f2 + f4;
    }

    public static /* synthetic */ boolean \u0441\u0435a\u043ex(double d, double d2, double d3, double d4, int n, int n2) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return (double)n >= d && (double)n < d + d3 && (double)n2 >= d2 && (double)n2 < d2 + d4;
    }

    public static /* synthetic */ void p\u0430j\u0430\u043ec(class_287 class_2872, Matrix4f matrix4f, class_238 class_2383) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        float f = (float)(class_2383.field_1323 - hcce.\u0430\u0445j\u0445s\u0456\u04bb.method_1561().field_4686.method_19326().method_10216());
        float f2 = (float)(class_2383.field_1322 - hcce.\u0430\u0445j\u0445s\u0456\u04bb.method_1561().field_4686.method_19326().method_10214());
        float f3 = (float)(class_2383.field_1321 - hcce.\u0430\u0445j\u0445s\u0456\u04bb.method_1561().field_4686.method_19326().method_10215());
        float f4 = (float)(class_2383.field_1320 - hcce.\u0430\u0445j\u0445s\u0456\u04bb.method_1561().field_4686.method_19326().method_10216());
        float f5 = (float)(class_2383.field_1325 - hcce.\u0430\u0445j\u0445s\u0456\u04bb.method_1561().field_4686.method_19326().method_10214());
        float f6 = (float)(class_2383.field_1324 - hcce.\u0430\u0445j\u0445s\u0456\u04bb.method_1561().field_4686.method_19326().method_10215());
        class_2872.method_1328(class_293.class_5596.field_27382, class_290.field_1592);
        class_2872.method_22918(matrix4f, f, f2, f3).method_1344();
        class_2872.method_22918(matrix4f, f4, f2, f3).method_1344();
        class_2872.method_22918(matrix4f, f4, f2, f6).method_1344();
        class_2872.method_22918(matrix4f, f, f2, f6).method_1344();
        class_2872.method_22918(matrix4f, f, f5, f3).method_1344();
        class_2872.method_22918(matrix4f, f, f5, f6).method_1344();
        class_2872.method_22918(matrix4f, f4, f5, f6).method_1344();
        class_2872.method_22918(matrix4f, f4, f5, f3).method_1344();
        class_2872.method_22918(matrix4f, f, f2, f3).method_1344();
        class_2872.method_22918(matrix4f, f, f5, f3).method_1344();
        class_2872.method_22918(matrix4f, f4, f5, f3).method_1344();
        class_2872.method_22918(matrix4f, f4, f2, f3).method_1344();
        class_2872.method_22918(matrix4f, f4, f2, f3).method_1344();
        class_2872.method_22918(matrix4f, f4, f5, f3).method_1344();
        class_2872.method_22918(matrix4f, f4, f5, f6).method_1344();
        class_2872.method_22918(matrix4f, f4, f2, f6).method_1344();
        class_2872.method_22918(matrix4f, f, f2, f6).method_1344();
        class_2872.method_22918(matrix4f, f4, f2, f6).method_1344();
        class_2872.method_22918(matrix4f, f4, f5, f6).method_1344();
        class_2872.method_22918(matrix4f, f, f5, f6).method_1344();
        class_2872.method_22918(matrix4f, f, f2, f3).method_1344();
        class_2872.method_22918(matrix4f, f, f2, f6).method_1344();
        class_2872.method_22918(matrix4f, f, f5, f6).method_1344();
        class_2872.method_22918(matrix4f, f, f5, f3).method_1344();
        hcce.a_bsm16("method_43433", method_43433(net.minecraft.class_287$class_7433 ), (class_287.class_7433)class_2872.method_1326());
    }

    private static /* synthetic */ float ioi\u0440(float f) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        float f2 = 1.0f - f;
        return 1.0f - f2 * f2 * f2;
    }

    public static /* synthetic */ void \u0430ho\u04bb\u0441x\u0430(class_4587 class_45872, class_4184 class_41842, class_1309 class_13092, boolean bl, float f, float f2) {
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        int n;
        class_287 class_2872;
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        if (class_13092 == null || hcce.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 == null || f <= 0.001f) {
            return;
        }
        float f12 = hcce.ioi\u0440(f);
        float f13 = ((float)hcce.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.field_6012 + f2) * 6.0f;
        class_243 class_2432 = class_41842.method_19326();
        CallSite callSite = hcce.a_bsm31("method_16436", method_16436(double double double ), (double)f2, (double)class_13092.field_6038, (double)class_13092.method_23317());
        CallSite callSite2 = hcce.a_bsm31("method_16436", method_16436(double double double ), (double)f2, (double)class_13092.field_5971, (double)class_13092.method_23318());
        CallSite callSite3 = hcce.a_bsm31("method_16436", method_16436(double double double ), (double)f2, (double)class_13092.field_5989, (double)class_13092.method_23321());
        float f14 = class_41842.method_19330();
        float f15 = class_41842.method_19329();
        float f16 = class_13092.method_17682();
        float f17 = class_13092.method_17681() * 0.5f;
        Color color = ((\u0445\u0440\u0430\u0435\u0445\u043e)((Object)hcce.a_bsm32("jaa\u0435\u0445c", jaa\u0435\u0445c()))).\u0456p\u0458.\u0441ih().aj\u0445\u043e();
        CallSite callSite4 = hcce.a_bsm27("min", min(float float ), (float)1.0f, (float)((float)color.getRed() / 255.0f));
        CallSite callSite5 = hcce.a_bsm27("min", min(float float ), (float)1.0f, (float)((float)color.getGreen() / 255.0f));
        CallSite callSite6 = hcce.a_bsm27("min", min(float float ), (float)1.0f, (float)((float)color.getBlue() / 255.0f));
        class_45872.method_22903();
        class_45872.method_22904((double)(callSite - class_2432.field_1352), (double)(callSite2 - class_2432.field_1351), (double)(callSite3 - class_2432.field_1350));
        int n2 = -146620561 + 146620579;
        float f18 = f16 * 0.35f;
        float f19 = f16 * 0.55f;
        float f20 = f16 * 0.74f;
        hcce.a_bsm6("setShaderColor", setShaderColor(float float float float ), (float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        hcce.a_bsm1("enableBlend", enableBlend());
        hcce.a_bsm33("disableCull", disableCull());
        hcce.a_bsm3("disableDepthTest", disableDepthTest());
        hcce.a_bsm4("depthMask", depthMask(boolean ), (boolean)false);
        hcce.a_bsm34("blendFunc", blendFunc(com.mojang.blaze3d.platform.GlStateManager$class_4535 com.mojang.blaze3d.platform.GlStateManager$class_4534 ), (GlStateManager.class_4535)GlStateManager.class_4535.SRC_ALPHA, (GlStateManager.class_4534)GlStateManager.class_4534.ONE_MINUS_SRC_ALPHA);
        CallSite callSite7 = hcce.a_bsm15("method_1348", method_1348());
        if (f > 0.01f) {
            hcce.a_bsm5("setShader", setShader(java.util.function.Supplier ), class_757::method_34540);
            class_2872 = callSite7.method_1349();
            class_2872.method_1328(class_293.class_5596.field_27379, class_290.field_1576);
            for (n = 0; n < n2; ++n) {
                f11 = (float)hcce.a_bsm28("sin", sin(double ), (double)((float)n * 1.7f + 0.3f)) * 0.5f + 0.5f;
                f10 = (float)hcce.a_bsm29("cos", cos(double ), (double)((float)n * 2.3f + 0.7f)) * 0.5f + 0.5f;
                f9 = (float)hcce.a_bsm28("sin", sin(double ), (double)((float)n * 3.1f + 1.1f)) * 0.5f + 0.5f;
                f8 = f13 + (float)n * (360.0f / (float)n2) + f11 * 12.0f;
                f7 = f17 + 0.25f + f9 * 0.15f;
                f6 = f7 * (float)hcce.a_bsm29("cos", cos(double ), (double)hcce.a_bsm35("toRadians", toRadians(double ), (double)f8));
                f5 = f7 * (float)hcce.a_bsm28("sin", sin(double ), (double)hcce.a_bsm35("toRadians", toRadians(double ), (double)f8));
                f4 = f10 * f16;
                f3 = 0.18f * f12;
                if (f3 < 0.001f) continue;
                float f21 = hcce.\u0455pcsp(f4, f16, f18, f19, f20);
                float f22 = -f6;
                float f23 = f21 - f4;
                float f24 = -f5;
                float f25 = (float)hcce.a_bsm37("toDegrees", toDegrees(double ), (double)hcce.a_bsm36("atan2", atan2(double double ), (double)f24, (double)f22));
                float f26 = (float)hcce.a_bsm37("toDegrees", toDegrees(double ), (double)hcce.a_bsm36("atan2", atan2(double double ), (double)f23, (double)((float)hcce.a_bsm38("sqrt", sqrt(double ), (double)(f22 * f22 + f24 * f24)))));
                hcce.\u0445px\u0455\u0440\u043e(class_2872, class_45872, f6, f4, f5, f3, f25, f26, (int)(callSite4 * 255.0f), (int)(callSite5 * 255.0f), (int)(callSite6 * 255.0f), (int)(200.0f * f), bl);
            }
            hcce.a_bsm16("method_43433", method_43433(net.minecraft.class_287$class_7433 ), (class_287.class_7433)class_2872.method_1326());
        }
        if (f * 0.15f > 0.001f) {
            hcce.a_bsm5("setShader", setShader(java.util.function.Supplier ), class_757::method_34543);
            hcce.a_bsm39("setShaderTexture", setShaderTexture(int net.minecraft.class_2960 ), (int)0, (class_2960)i\u0458\u0440);
            hcce.a_bsm34("blendFunc", blendFunc(com.mojang.blaze3d.platform.GlStateManager$class_4535 com.mojang.blaze3d.platform.GlStateManager$class_4534 ), (GlStateManager.class_4535)GlStateManager.class_4535.SRC_ALPHA, (GlStateManager.class_4534)GlStateManager.class_4534.ONE);
            class_2872 = callSite7.method_1349();
            class_2872.method_1328(class_293.class_5596.field_27382, class_290.field_1575);
            for (n = 0; n < n2; ++n) {
                f11 = (float)hcce.a_bsm28("sin", sin(double ), (double)((float)n * 1.7f + 0.3f)) * 0.5f + 0.5f;
                f10 = (float)hcce.a_bsm29("cos", cos(double ), (double)((float)n * 2.3f + 0.7f)) * 0.5f + 0.5f;
                f9 = (float)hcce.a_bsm28("sin", sin(double ), (double)((float)n * 3.1f + 1.1f)) * 0.5f + 0.5f;
                f8 = f13 + (float)n * (360.0f / (float)n2) + f11 * 12.0f;
                f7 = f17 + 0.25f + f9 * 0.15f;
                f6 = f7 * (float)hcce.a_bsm29("cos", cos(double ), (double)hcce.a_bsm35("toRadians", toRadians(double ), (double)f8));
                f5 = f7 * (float)hcce.a_bsm28("sin", sin(double ), (double)hcce.a_bsm35("toRadians", toRadians(double ), (double)f8));
                f4 = f10 * f16;
                f3 = 0.18f * f12;
                if (!(f3 > 1.0E-4f)) continue;
                hcce.h\u0430\u0455(class_2872, class_45872, f6, f4, f5, f3 * 5.5f, (float)callSite4, (float)callSite5, (float)callSite6, f * 0.15f, f14, f15);
                hcce.h\u0430\u0455(class_2872, class_45872, f6, f4, f5, f3 * 3.5f, (float)callSite4, (float)callSite5, (float)callSite6, f * 0.25f, f14, f15);
            }
            hcce.a_bsm16("method_43433", method_43433(net.minecraft.class_287$class_7433 ), (class_287.class_7433)class_2872.method_1326());
        }
        class_45872.method_22909();
        hcce.a_bsm4("depthMask", depthMask(boolean ), (boolean)true);
        hcce.a_bsm40("enableCull", enableCull());
        hcce.a_bsm7("enableDepthTest", enableDepthTest());
        hcce.a_bsm2("defaultBlendFunc", defaultBlendFunc());
        hcce.a_bsm8("disableBlend", disableBlend());
    }

    private static /* synthetic */ float \u0455pcsp(float f, float f2, float f3, float f4, float f5) {
        float f6;
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        if ((f6 = f / f2) < 0.33f) {
            return f3;
        }
        if (f6 < 0.6f) {
            return f4;
        }
        return f5;
    }

    private static /* synthetic */ void h\u0430\u0455(class_287 class_2872, class_4587 class_45872, double d, double d2, double d3, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if (f5 <= 0.001f || f <= 1.0E-4f) {
            return;
        }
        class_45872.method_22903();
        class_45872.method_22904(d, d2, d3);
        class_45872.method_22907(class_7833.field_40716.rotationDegrees(-f6));
        class_45872.method_22907(class_7833.field_40714.rotationDegrees(f7));
        class_45872.method_22905(f, f, f);
        int n = (int)(f2 * 255.0f);
        int n2 = (int)(f3 * 255.0f);
        int n3 = (int)(f4 * 255.0f);
        int n4 = (int)(f5 * 255.0f);
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        class_2872.method_22918(matrix4f, -0.5f, 0.5f, 0.0f).method_22913(0.0f, 1.0f).method_1336(n, n2, n3, n4).method_1344();
        class_2872.method_22918(matrix4f, 0.5f, 0.5f, 0.0f).method_22913(1.0f, 1.0f).method_1336(n, n2, n3, n4).method_1344();
        class_2872.method_22918(matrix4f, 0.5f, -0.5f, 0.0f).method_22913(1.0f, 0.0f).method_1336(n, n2, n3, n4).method_1344();
        class_2872.method_22918(matrix4f, -0.5f, -0.5f, 0.0f).method_22913(0.0f, 0.0f).method_1336(n, n2, n3, n4).method_1344();
        class_45872.method_22909();
    }

    private static /* synthetic */ void \u0445px\u0455\u0440\u043e(class_287 class_2872, class_4587 class_45872, float f, float f2, float f3, float f4, float f5, float f6, int n, int n2, int n3, int n4, boolean bl) {
        float f7;
        float f8;
        if (true | false) {
        }
        if (0 != 0) {
        }
        class_45872.method_22903();
        class_45872.method_46416(f, f2, f3);
        class_45872.method_22907(class_7833.field_40716.rotationDegrees(-f5));
        class_45872.method_22907(class_7833.field_40718.rotationDegrees(f6));
        class_45872.method_22905(f4, f4, f4);
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        float f9 = f8 = bl ? 0.35f : 0.7f;
        if (bl) {
            f7 = 1.2f;
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
            f7 = 1.0f;
        }
        float f10 = f7;
        hcce.h\u0456\u04bb\u0458ish(class_2872, matrix4f, f10, 0.0f, 0.0f, 0.0f, f8, 0.0f, 0.0f, 0.0f, f8, n, n2, n3, n4);
        hcce.h\u0456\u04bb\u0458ish(class_2872, matrix4f, f10, 0.0f, 0.0f, 0.0f, 0.0f, f8, 0.0f, -f8, 0.0f, n, n2, n3, n4);
        hcce.h\u0456\u04bb\u0458ish(class_2872, matrix4f, f10, 0.0f, 0.0f, 0.0f, -f8, 0.0f, 0.0f, 0.0f, -f8, n, n2, n3, n4);
        hcce.h\u0456\u04bb\u0458ish(class_2872, matrix4f, f10, 0.0f, 0.0f, 0.0f, 0.0f, -f8, 0.0f, f8, 0.0f, n, n2, n3, n4);
        hcce.h\u0456\u04bb\u0458ish(class_2872, matrix4f, -f10, 0.0f, 0.0f, 0.0f, f8, 0.0f, 0.0f, 0.0f, f8, n, n2, n3, n4);
        hcce.h\u0456\u04bb\u0458ish(class_2872, matrix4f, -f10, 0.0f, 0.0f, 0.0f, 0.0f, f8, 0.0f, -f8, 0.0f, n, n2, n3, n4);
        hcce.h\u0456\u04bb\u0458ish(class_2872, matrix4f, -f10, 0.0f, 0.0f, 0.0f, -f8, 0.0f, 0.0f, 0.0f, -f8, n, n2, n3, n4);
        hcce.h\u0456\u04bb\u0458ish(class_2872, matrix4f, -f10, 0.0f, 0.0f, 0.0f, 0.0f, -f8, 0.0f, f8, 0.0f, n, n2, n3, n4);
        class_45872.method_22909();
    }

    private static /* synthetic */ void h\u0456\u04bb\u0458ish(class_287 class_2872, Matrix4f matrix4f, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int n, int n2, int n3, int n4) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        class_2872.method_22918(matrix4f, f, f2, f3).method_1336(n, n2, n3, n4).method_1344();
        class_2872.method_22918(matrix4f, f4, f5, f6).method_1336(n, n2, n3, n4).method_1344();
        class_2872.method_22918(matrix4f, f7, f8, f9).method_1336(n, n2, n3, n4).method_1344();
    }

    private hcce() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        byte[] byArray = new byte[-798325372 + 798325422];
        byArray[0] = -284802550 + 284802631;
        byArray[1] = -2091785043 + 2091785023;
        byArray[2] = -700098345 + 700098316;
        byArray[3] = -80889476 + 80889581;
        byArray[4] = -1216376111 + 1216376179;
        byArray[5] = -442536103 + 442536061;
        byArray[-265910432 + 265910438] = -916211210 + 916211319;
        byArray[-212984037 + 212984044] = -429406243 + 429406127;
        byArray[-547893002 + 547893010] = -557612416 + 557612511;
        byArray[-205528459 + 205528468] = -2051969863 + 2051969958;
        byArray[-2133153848 + 2133153858] = -344747458 + 344747365;
        byArray[-643731133 + 643731144] = -1952471898 + 1952471955;
        byArray[-473915152 + 473915164] = -72216830 + 72216875;
        byArray[-1820315244 + 1820315257] = -991627917 + 991627805;
        byArray[-691839511 + 691839525] = -328311636 + 328311714;
        byArray[-665425117 + 665425132] = -1993542567 + 1993542549;
        byArray[-1011223228 + 1011223244] = -1272824785 + 1272824836;
        byArray[-49654265 + 49654282] = -1100569795 + 1100569921;
        byArray[-309825343 + 309825361] = -1118159583 + 1118159610;
        byArray[-153768529 + 153768548] = -1434619971 + 1434619861;
        byArray[-761702716 + 761702736] = -1833088906 + 1833088861;
        byArray[-2101498291 + 2101498312] = -1658732379 + 1658732288;
        byArray[-885353176 + 885353198] = -656350424 + 656350489;
        byArray[-1021590881 + 1021590904] = -1247621124 + 1247621153;
        byArray[-541686919 + 541686943] = -860643351 + 860643374;
        byArray[-701134836 + 701134861] = -596994600 + 596994586;
        byArray[-1021898103 + 1021898129] = -677303791 + 677303760;
        byArray[-1603850445 + 1603850472] = -1723250729 + 1723250749;
        byArray[-796090524 + 796090552] = -1532290533 + 1532290479;
        byArray[-741499187 + 741499216] = -766978767 + 766978660;
        byArray[-1546436697 + 1546436727] = -110642479 + 110642513;
        byArray[-15851790 + 15851821] = -1827030009 + 1827030045;
        byArray[-402080456 + 402080488] = -418662235 + 418662298;
        byArray[-1691372863 + 1691372896] = -768519513 + 768519425;
        byArray[-644688038 + 644688072] = -1942643340 + 1942643309;
        byArray[-1311332762 + 1311332797] = -616125606 + 616125478;
        byArray[-1034371294 + 1034371330] = -1342057541 + 1342057581;
        byArray[-1275775105 + 1275775142] = -1579292922 + 1579292842;
        byArray[-854842032 + 854842070] = -1344550121 + 1344550109;
        byArray[-1517511198 + 1517511237] = -1696409995 + 1696409968;
        byArray[-2081583230 + 2081583270] = -1083389830 + 1083389861;
        byArray[-1278731580 + 1278731621] = -523070878 + 523070951;
        byArray[-692254003 + 692254045] = -422399889 + 422399862;
        byArray[-68152259 + 68152302] = -411003459 + 411003398;
        byArray[-1111248464 + 1111248508] = -825157695 + 825157636;
        byArray[-36854990 + 36855035] = -436285298 + 436285268;
        byArray[-160179349 + 160179395] = -1294684825 + 1294684786;
        byArray[-210282091 + 210282138] = -1351027971 + 1351028003;
        byArray[-1738200392 + 1738200440] = -1455095331 + 1455095244;
        byArray[-1048156398 + 1048156447] = -171299270 + 171299293;
        throw new UnsupportedOperationException((String)((Object)hcce.a_bsm22("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(373457692 + 1529933398), (int)(857872337 + 1516074413))));
    }

    static {
        x\u0441\u0430pxp\u0456 = new class_238(0.0, 0.0, 0.0, 1.0, 1.0, 1.0);
        ixoie\u0456\u04bb = new sc\u04bb\u0455();
        byte[] byArray = new byte[-177894968 + 177894977];
        byArray[0] = -1987192685 + 1987192723;
        byArray[1] = -1628165232 + 1628165159;
        byArray[2] = -669804880 + 669804794;
        byArray[3] = -2103681620 + 2103681579;
        byArray[4] = -1350188104 + 1350188029;
        byArray[5] = -17339972 + 17340077;
        byArray[-780582694 + 780582700] = -1950820544 + 1950820510;
        byArray[-1528543307 + 1528543314] = -1505384396 + 1505384354;
        byArray[-1498121506 + 1498121514] = -1422185930 + 1422185878;
        byte[] byArray2 = new byte[-511600052 + 511600072];
        byArray2[0] = -1536222311 + 1536222395;
        byArray2[1] = 2;
        byArray2[2] = -1164849208 + 1164849322;
        byArray2[3] = -564431274 + 564431337;
        byArray2[4] = -844040368 + 844040460;
        byArray2[5] = -432102410 + 432102406;
        byArray2[-235679278 + 235679284] = -348104571 + 348104529;
        byArray2[-1705128114 + 1705128121] = -2068524712 + 2068524669;
        byArray2[-1703727684 + 1703727692] = -1202221355 + 1202221403;
        byArray2[-549180272 + 549180281] = -1284475274 + 1284475162;
        byArray2[-1117432100 + 1117432110] = -1349048449 + 1349048355;
        byArray2[-1507295386 + 1507295397] = -1293798472 + 1293798346;
        byArray2[-1965082040 + 1965082052] = -319241073 + 319241000;
        byArray2[-252114599 + 252114612] = -609538143 + 609538193;
        byArray2[-1144428314 + 1144428328] = -2033445471 + 2033445435;
        byArray2[-402880048 + 402880063] = -22430428 + 22430410;
        byArray2[-1442405287 + 1442405303] = -792757231 + 792757139;
        byArray2[-782039964 + 782039981] = -887679060 + 887679116;
        byArray2[-623602620 + 623602638] = -93184177 + 93184254;
        byArray2[-867903853 + 867903872] = 3;
        \u0456jspc = new class_2960(Cade0e18b60fd9f037d8b2fc8.cachedDecodeString(byArray, 531267457 + 1646395979, -2000994714 + 406872725), Cade0e18b60fd9f037d8b2fc8.cachedDecodeString(byArray2, 1756337689 + 227729449, -1571772505 + 997930532));
        byte[] byArray3 = new byte[-913729065 + 913729074];
        byArray3[0] = -1175866584 + 1175866682;
        byArray3[1] = -847443019 + 847442896;
        byArray3[2] = -492267454 + 492267460;
        byArray3[3] = -302358979 + 302359106;
        byArray3[4] = -193693935 + 193693933;
        byArray3[5] = -1894794584 + 1894794578;
        byArray3[-1121147295 + 1121147301] = -1202410940 + 1202411052;
        byArray3[-349555543 + 349555550] = -327791593 + 327791617;
        byArray3[-1341554143 + 1341554151] = -967250514 + 967250575;
        byte[] byArray4 = new byte[-126035609 + 126035628];
        byArray4[0] = -1330298417 + 1330298489;
        byArray4[1] = -808355500 + 808355460;
        byArray4[2] = -1054852113 + 1054852072;
        byArray4[3] = -829202652 + 829202577;
        byArray4[4] = -1703246220 + 1703246175;
        byArray4[5] = -425593516 + 425593490;
        byArray4[-2130878971 + 2130878977] = -2138716890 + 2138716872;
        byArray4[-630024735 + 630024742] = -1154327299 + 1154327234;
        byArray4[-119855526 + 119855534] = -915699538 + 915699412;
        byArray4[-1058418005 + 1058418014] = -1820804048 + 1820804037;
        byArray4[-918156384 + 918156394] = -999504383 + 999504351;
        byArray4[-661304451 + 661304462] = -1640325791 + 1640325912;
        byArray4[-1770328338 + 1770328350] = -1119320553 + 1119320507;
        byArray4[-1679591581 + 1679591594] = -1818013043 + 1818013083;
        byArray4[-80976086 + 80976100] = -250118026 + 250118003;
        byArray4[-1944551826 + 1944551841] = -1630952532 + 1630952624;
        byArray4[-1624194518 + 1624194534] = -1760852390 + 1760852366;
        byArray4[-839394562 + 839394579] = -792884171 + 792884236;
        byArray4[-291358291 + 291358309] = -420853855 + 420853728;
        o\u0441c = new class_2960(Cade0e18b60fd9f037d8b2fc8.cachedDecodeString(byArray3, 1649004442 + 1311105237, -1978915879 + 411205301), Cade0e18b60fd9f037d8b2fc8.cachedDecodeString(byArray4, -109315057 + 11796000, 1830141996 + 624153117));
        byte[] byArray5 = new byte[-464209357 + 464209366];
        byArray5[0] = -158960472 + 158960396;
        byArray5[1] = -2043043914 + 2043043931;
        byArray5[2] = -1967955170 + 1967955224;
        byArray5[3] = -1868793400 + 1868793382;
        byArray5[4] = -1025204659 + 1025204633;
        byArray5[5] = 4;
        byArray5[-1177102296 + 1177102302] = -908080759 + 908080798;
        byArray5[-115966743 + 115966750] = -446061824 + 446061744;
        byArray5[-740829295 + 740829303] = -1343783017 + 1343782922;
        byte[] byArray6 = new byte[-1406606830 + 1406606848];
        byArray6[0] = -1516165551 + 1516165466;
        byArray6[1] = -1661218410 + 1661218452;
        byArray6[2] = -155972695 + 155972590;
        byArray6[3] = -303894402 + 303894477;
        byArray6[4] = -1394992321 + 1394992311;
        byArray6[5] = -1621895766 + 1621895702;
        byArray6[-28605638 + 28605644] = -871708870 + 871708990;
        byArray6[-2111289499 + 2111289506] = -101437977 + 101437932;
        byArray6[-211735148 + 211735156] = -1797564832 + 1797564787;
        byArray6[-1845283508 + 1845283517] = -2127060108 + 2127060031;
        byArray6[-1176453352 + 1176453362] = -488958891 + 488959007;
        byArray6[-845839657 + 845839668] = -2035794468 + 2035794429;
        byArray6[-177242975 + 177242987] = -1467428228 + 1467428214;
        byArray6[-235722937 + 235722950] = -1061286094 + 1061286174;
        byArray6[-1851094576 + 1851094590] = -253258448 + 253258560;
        byArray6[-957193573 + 957193588] = -1416863898 + 1416864002;
        byArray6[-1162186918 + 1162186934] = -1116103945 + 1116103951;
        byArray6[-382956467 + 382956484] = -1466354407 + 1466354422;
        i\u0458\u0440 = new class_2960(Cade0e18b60fd9f037d8b2fc8.cachedDecodeString(byArray5, 698324068 + 1688730082, 1944677810 + 809055855), Cade0e18b60fd9f037d8b2fc8.cachedDecodeString(byArray6, 926448340 + 1141178473, 1360481111 + 399383949));
        p\u0430\u0455 = new HashMap();
        \u0440xh\u04bbi = new Matrix4f();
        poe\u04bb\u043e\u0455\u043e = new Matrix4f();
        \u0441ij\u0458\u0455\u0456\u0456 = new Matrix4f();
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

    private static /* synthetic */ CallSite a_bsm25(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm26(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm27(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm28(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm29(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm30(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm31(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm32(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm33(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm34(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm35(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm36(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm37(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm38(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm39(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm40(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }
}

