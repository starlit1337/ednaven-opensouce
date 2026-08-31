/*
 * Decompiled with CFR 0.152.
 */
package \u0445\u0430p\u0440;

import com.mojang.blaze3d.platform.GlStateManager;
import c\u0445is.i\u0456o\u0430\u0435o;
import c\u0445is.\u0430j\u0445;
import ie\u0441\u0430ej.hcce;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.ArrayList;
import net.minecraft.class_287;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_2960;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_757;
import o\u0455sio\u0440.\u0445\u0458\u0458h\u0445\u0430a;
import spso.\u0430c\u0440;
import spso.\u0441a\u0458p;
import \u0435xp.h\u04bb\u0455hpa;
import \u0435xp.\u043ea\u0441\u0430p;
import \u0445eo.c\u0455pi;
import \u0445eo.\u0456p\u0430\u043e\u0458\u043e;
import \u0445eo.\u0458i\u0456x;
import \u0445\u0430p\u0440.cexo;
import \u0445\u0430p\u0440.\u043e\u0440x\u0458;

@\u0456p\u0430\u043e\u0458\u043e(sp\u0456p\u0445\u0435="Particles", a\u0456j\u0430\u0455\u04bb="Particles", s\u0455cj=\u0458i\u0456x.RENDER)
public class \u0456app\u0435i
extends c\u0455pi {
    public /* synthetic */ h\u04bb\u0455hpa ch\u0430hc;
    public /* synthetic */ \u043ea\u0441\u0430p s\u0445o;
    public /* synthetic */ \u043ea\u0441\u0430p \u0435\u04bb\u043e\u0440;
    private final /* synthetic */ ArrayList<cexo> pahi\u0445hc;

    public \u0456app\u0435i() {
        if (true | false) {
        }
        byte[] byArray = new byte[-1240834303 + 1240834312];
        byArray[0] = -831444543 + 831444573;
        byArray[1] = -329057717 + 329057726;
        byArray[2] = -1859975020 + 1859974969;
        byArray[3] = -1384077595 + 1384077721;
        byArray[4] = -906139277 + 906139292;
        byArray[5] = -727171057 + 727171064;
        byArray[-438540413 + 438540419] = -507505322 + 507505447;
        byArray[-128017293 + 128017300] = -1937777181 + 1937777078;
        byArray[-1033142186 + 1033142194] = -1499790545 + 1499790557;
        this.ch\u0430hc = ((\u0430c\u0440)((Object)\u0456app\u0435i.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)\u0456app\u0435i.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-2121745099 + 1108739689), (int)(992372428 + 1649948338)))))).\u0455xi\u0440(true).\u0458c\u0456\u0440().getBooleanValue();
        byte[] byArray2 = new byte[-1844008337 + 1844008344];
        byArray2[0] = -1212771589 + 1212771627;
        byArray2[1] = -1420212177 + 1420212261;
        byArray2[2] = -1411533229 + 1411533318;
        byArray2[3] = -1884796361 + 1884796233;
        byArray2[4] = -772263920 + 772263874;
        byArray2[5] = -832738573 + 832738455;
        byArray2[-2128783608 + 2128783614] = -1320274826 + 1320274818;
        this.s\u0445o = ((\u0430c\u0440)((Object)\u0456app\u0435i.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)\u0456app\u0435i.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray2, (int)(1151519286 + 256870843), (int)(-1986359665 + 633151687)))))).s\u0458\u0458a(30.0f).x\u0455heah\u0445(1.0f).\u043ecxi\u0455(20.0f).a\u0455\u0445\u0435c(200.0f).\u0458c\u0456\u0440().getFloatValue();
        byte[] byArray3 = new byte[-597786882 + 597786888];
        byArray3[0] = -1961968298 + 1961968311;
        byArray3[1] = -1540640172 + 1540640215;
        byArray3[2] = -1862369017 + 1862369044;
        byArray3[3] = -1757375248 + 1757375176;
        byArray3[4] = -1824564755 + 1824564664;
        byArray3[5] = -388618928 + 388618977;
        this.\u0435\u04bb\u043e\u0440 = ((\u0430c\u0440)((Object)\u0456app\u0435i.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)\u0456app\u0435i.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray3, (int)(1379849495 + 231115501), (int)(550193865 + 2118538312)))))).s\u0458\u0458a(1.0f).x\u0455heah\u0445(0.1f).\u043ecxi\u0455(0.1f).a\u0455\u0445\u0435c(2.0f).\u0458c\u0456\u0440().getFloatValue();
        this.pahi\u0445hc = new ArrayList();
    }

    @\u0445\u0458\u0458h\u0445\u0430a
    public void \u0441s\u0430jojh(\u0430j\u0445 \u0430j\u04452) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (\u0456app\u0435i.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 == null) {
            return;
        }
        this.pahi\u0445hc.removeIf(cexo::tick);
        int n = this.pahi\u0445hc.size();
        while ((float)n < this.s\u0445o.axpacc()) {
            if (this.ch\u0430hc.axpacc()) {
                this.pahi\u0445hc.add(new \u043e\u0440x\u0458(this, (float)(\u0456app\u0435i.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_23317() + (double)\u0456app\u0435i.a_bsm2("e\u0456\u043ee\u0455", e\u0456\u043ee\u0455(float float ), (float)-25.0f, (float)25.0f)), (float)(\u0456app\u0435i.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_23318() + (double)\u0456app\u0435i.a_bsm2("e\u0456\u043ee\u0455", e\u0456\u043ee\u0455(float float ), (float)2.0f, (float)15.0f)), (float)(\u0456app\u0435i.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_23321() + (double)\u0456app\u0435i.a_bsm2("e\u0456\u043ee\u0455", e\u0456\u043ee\u0455(float float ), (float)-25.0f, (float)25.0f)), (float)\u0456app\u0435i.a_bsm2("e\u0456\u043ee\u0455", e\u0456\u043ee\u0455(float float ), (float)-0.2f, (float)0.2f), (float)\u0456app\u0435i.a_bsm2("e\u0456\u043ee\u0455", e\u0456\u043ee\u0455(float float ), (float)-0.1f, (float)0.1f), (float)\u0456app\u0435i.a_bsm2("e\u0456\u043ee\u0455", e\u0456\u043ee\u0455(float float ), (float)-0.2f, (float)0.2f)));
            }
            ++n;
        }
    }

    @\u0445\u0458\u0458h\u0445\u0430a
    public void c\u0445\u0445c\u0445ec(i\u0456o\u0430\u0435o i\u0456o\u0430\u0435o2) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        class_4587 class_45872 = i\u0456o\u0430\u0435o2.\u0445\u0455i\u0430pi();
        if (this.ch\u0430hc.axpacc()) {
            class_45872.method_22903();
            \u0456app\u0435i.a_bsm3("setShaderTexture", setShaderTexture(int net.minecraft.class_2960 ), (int)0, (class_2960)hcce.\u0456jspc);
            \u0456app\u0435i.a_bsm4("enableBlend", enableBlend());
            \u0456app\u0435i.a_bsm5("blendFunc", blendFunc(com.mojang.blaze3d.platform.GlStateManager$class_4535 com.mojang.blaze3d.platform.GlStateManager$class_4534 ), (GlStateManager.class_4535)GlStateManager.class_4535.SRC_ALPHA, (GlStateManager.class_4534)GlStateManager.class_4534.ONE);
            \u0456app\u0435i.a_bsm6("enableDepthTest", enableDepthTest());
            \u0456app\u0435i.a_bsm7("depthMask", depthMask(boolean ), (boolean)false);
            class_287 class_2872 = \u0456app\u0435i.a_bsm8("method_1348", method_1348()).method_1349();
            \u0456app\u0435i.a_bsm9("setShader", setShader(java.util.function.Supplier ), class_757::method_34543);
            class_2872.method_1328(class_293.class_5596.field_27382, class_290.field_1575);
            this.pahi\u0445hc.forEach(cexo2 -> {
                if ((3 * 3 + 3) % 2 == 0) {
                }
                cexo2.render((class_4588)class_2872, i\u0456o\u0430\u0435o2.\u0430pah\u0456x());
            });
            \u0456app\u0435i.a_bsm10("method_43433", method_43433(net.minecraft.class_287$class_7433 ), (class_287.class_7433)class_2872.method_1326());
            \u0456app\u0435i.a_bsm7("depthMask", depthMask(boolean ), (boolean)true);
            \u0456app\u0435i.a_bsm11("disableDepthTest", disableDepthTest());
            \u0456app\u0435i.a_bsm12("disableBlend", disableBlend());
            class_45872.method_22909();
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
}

