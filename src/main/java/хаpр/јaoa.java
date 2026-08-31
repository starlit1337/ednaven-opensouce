/*
 * Decompiled with CFR 0.152.
 */
package \u0445\u0430p\u0440;

import c\u0445is.i\u0456o\u0430\u0435o;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import net.minecraft.class_1297;
import net.minecraft.class_1665;
import net.minecraft.class_1676;
import net.minecraft.class_1753;
import net.minecraft.class_1764;
import net.minecraft.class_1771;
import net.minecraft.class_1776;
import net.minecraft.class_1787;
import net.minecraft.class_1792;
import net.minecraft.class_1811;
import net.minecraft.class_1812;
import net.minecraft.class_1823;
import net.minecraft.class_1835;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_287;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_3959;
import net.minecraft.class_4537;
import net.minecraft.class_4587;
import net.minecraft.class_757;
import org.joml.Matrix4f;
import o\u0455sio\u0440.\u0445\u0458\u0458h\u0445\u0430a;
import spso.\u0430c\u0440;
import spso.\u0441a\u0458p;
import \u0435xp.h\u04bb\u0455hpa;
import \u0441\u0445o.\u0458op\u0430\u0441;
import \u0445eo.c\u0455pi;
import \u0445eo.\u0456p\u0430\u043e\u0458\u043e;
import \u0445eo.\u0458i\u0456x;

@\u0456p\u0430\u043e\u0458\u043e(sp\u0456p\u0445\u0435="Projectiles", a\u0456j\u0430\u0455\u04bb="Projectiles", s\u0455cj=\u0458i\u0456x.RENDER)
public class \u0458aoa
extends c\u0455pi {
    public /* synthetic */ h\u04bb\u0455hpa caa\u043e;
    public /* synthetic */ h\u04bb\u0455hpa \u0435se\u0441c;
    private final /* synthetic */ Map<Integer, List<class_243>> as\u0458;

    public \u0458aoa() {
        if (true | false) {
        }
        byte[] byArray = new byte[-106132167 + 106132177];
        byArray[0] = -1426486670 + 1426486570;
        byArray[1] = -797138814 + 797138884;
        byArray[2] = -1483696204 + 1483696152;
        byArray[3] = -2020610679 + 2020610639;
        byArray[4] = -998832018 + 998831985;
        byArray[5] = -549638115 + 549638191;
        byArray[-556359688 + 556359694] = -522428775 + 522428671;
        byArray[-1615438234 + 1615438241] = -1918852646 + 1918852749;
        byArray[-1226237386 + 1226237394] = -781577152 + 781577173;
        byArray[-460518136 + 460518145] = -2146590570 + 2146590497;
        this.caa\u043e = ((\u0430c\u0440)((Object)\u0458aoa.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)\u0458aoa.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(1312016875 + 962903468), (int)(-1548491201 + 312987676)))))).\u0455xi\u0440(true).\u0458c\u0456\u0440().getBooleanValue();
        byte[] byArray2 = new byte[-1621626126 + 1621626143];
        byArray2[0] = -1378634715 + 1378634641;
        byArray2[1] = -615314220 + 615314101;
        byArray2[2] = -1033532660 + 1033532635;
        byArray2[3] = -1545481887 + 1545481865;
        byArray2[4] = -1449730201 + 1449730074;
        byArray2[5] = -1123381555 + 1123381534;
        byArray2[-1515026509 + 1515026515] = -1674633097 + 1674632996;
        byArray2[-1622677980 + 1622677987] = -865188613 + 865188633;
        byArray2[-1973105566 + 1973105574] = 3;
        byArray2[-1306937379 + 1306937388] = -35113044 + 35113072;
        byArray2[-494584413 + 494584423] = -1751799501 + 1751799442;
        byArray2[-1056362941 + 1056362952] = -176456822 + 176456749;
        byArray2[-2023133299 + 2023133311] = -1593720156 + 1593720154;
        byArray2[-482525244 + 482525257] = -1225161672 + 1225161770;
        byArray2[-1880753994 + 1880754008] = -1979941581 + 1979941573;
        byArray2[-227683056 + 227683071] = -474852574 + 474852582;
        byArray2[-977904835 + 977904851] = -1491890151 + 1491890239;
        this.\u0435se\u0441c = ((\u0430c\u0440)((Object)\u0458aoa.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)\u0458aoa.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray2, (int)(-822946335 + 1302808248), (int)(56707290 + 2008887876)))))).\u0455xi\u0440(true).\u0458c\u0456\u0440().getBooleanValue();
        this.as\u0458 = new ConcurrentHashMap<Integer, List<class_243>>();
    }

    /*
     * Unable to fully structure code
     */
    @\u0445\u0458\u0458h\u0445\u0430a
    public void c\u0445\u0445c\u0445ec(i\u0456o\u0430\u0435o var1_1) {
        block21: {
            if (true | false) {
            }
            if (0 != 0) {
            }
            if (\u0458aoa.\u0430\u0445j\u0445s\u0456\u04bb.field_1687 == null || \u0458aoa.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 == null) {
                return;
            }
            var2_2 = var1_1.\u0445\u0455i\u0430pi();
            var3_3 = \u0458aoa.\u0430\u0445j\u0445s\u0456\u04bb.field_1773.method_19418().method_19326();
            var4_4 = var1_1.\u0430pah\u0456x();
            if (this.caa\u043e.axpacc()) {
                var5_5 = \u0458aoa.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_6047();
                var6_6 = var5_5.method_7909();
                if (!var5_5.method_7960() && (var6_6 instanceof class_1811 || var6_6 instanceof class_1823 || var6_6 instanceof class_1771 || var6_6 instanceof class_1776 || var6_6 instanceof class_4537 || var6_6 instanceof class_1787 || var6_6 instanceof class_1835)) {
                    var7_7 = new ArrayList<class_243>();
                    var8_9 = var3_3.field_1352;
                    var10_12 = var3_3.field_1351;
                    var12_13 = var3_3.field_1350;
                    v0 = var14_14 = \u0458aoa.a_bsm2("cjxco\u0430a", cjxco\u0430a()) != false ? \u0458op\u0430\u0441.h\u0455\u043ea.jo\u0456c\u043e\u0440() : \u0458aoa.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_36454();
                    if (\u0458aoa.a_bsm2("cjxco\u0430a", cjxco\u0430a()) != false) {
                        v1 = \u0458op\u0430\u0441.h\u0455\u043ea.xpx();
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
                        v1 = \u0458aoa.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_36455();
                    }
                    var15_15 = v1;
                    var16_16 = 1.5;
                    if (var6_6 instanceof class_1753) {
                        var18_17 = (float)(var5_5.method_7935() - \u0458aoa.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_6014()) / 20.0f;
                        var16_16 = (double)(\u0458aoa.a_bsm3("min", min(float float ), (float)((var18_17 * var18_17 + var18_17 * 2.0f) / 3.0f), (float)1.0f) * 3.0f);
                    }
                    var18_18 = (double)(-\u0458aoa.a_bsm4("method_15374", method_15374(float ), (float)(var14_14 * 0.017453292f)) * \u0458aoa.a_bsm5("method_15362", method_15362(float ), (float)(var15_15 * 0.017453292f))) * var16_16;
                    var20_19 = (double)(-\u0458aoa.a_bsm4("method_15374", method_15374(float ), (float)(var15_15 * 0.017453292f))) * var16_16;
                    var22_20 = (double)(\u0458aoa.a_bsm5("method_15362", method_15362(float ), (float)(var14_14 * 0.017453292f)) * \u0458aoa.a_bsm5("method_15362", method_15362(float ), (float)(var15_15 * 0.017453292f))) * var16_16;
                    var24_21 = var6_6 instanceof class_1753 != false || var6_6 instanceof class_1764 != false ? 0.05 : (var6_6 instanceof class_1812 != false ? 0.4 : 0.03);
                    var26_22 = null;
                    for (var27_23 = 0; var27_23 < -1315806564 + 1315806664; ++var27_23) {
                        var28_24 = new class_243(var8_9, var10_12, var12_13);
                        var29_25 = new class_243(var8_9 + var18_18, var10_12 + var20_19, var12_13 + var22_20);
                        var7_7.add(var28_24);
                        var26_22 = \u0458aoa.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.method_17742(new class_3959(var28_24, var29_25, class_3959.class_3960.field_17558, class_3959.class_242.field_1348, (class_1297)\u0458aoa.\u0430\u0445j\u0445s\u0456\u04bb.field_1724));
                        if (var26_22.method_17783() != class_239.class_240.field_1333) break;
                        var8_9 += var18_18;
                        var10_12 += var20_19;
                        var12_13 += var22_20;
                        var18_18 *= 0.99;
                        var20_19 *= 0.99;
                        var22_20 *= 0.99;
                        var20_19 -= var24_21;
                    }
                    if (var7_7.size() >= 2) {
                        \u0458aoa.a_bsm6("enableBlend", enableBlend());
                        \u0458aoa.a_bsm7("defaultBlendFunc", defaultBlendFunc());
                        \u0458aoa.a_bsm8("disableCull", disableCull());
                        \u0458aoa.a_bsm9("disableDepthTest", disableDepthTest());
                        \u0458aoa.a_bsm10("depthMask", depthMask(boolean ), (boolean)false);
                        this.eoe\u0455\u0445\u04bb(var2_2, var7_7, var3_3, true);
                        if (var26_22 != null && var26_22.method_17783() != class_239.class_240.field_1333) {
                            this.isx\u0441\u0430\u0430i(var2_2, (class_243)var7_7.get(var7_7.size() - 1), var3_3);
                        }
                        \u0458aoa.a_bsm11("enableDepthTest", enableDepthTest());
                        \u0458aoa.a_bsm10("depthMask", depthMask(boolean ), (boolean)true);
                        \u0458aoa.a_bsm12("enableCull", enableCull());
                        \u0458aoa.a_bsm13("disableBlend", disableBlend());
                    }
                }
            }
            if (!this.\u0435se\u0441c.axpacc()) break block21;
            \u0458aoa.a_bsm6("enableBlend", enableBlend());
            \u0458aoa.a_bsm7("defaultBlendFunc", defaultBlendFunc());
            \u0458aoa.a_bsm8("disableCull", disableCull());
            \u0458aoa.a_bsm9("disableDepthTest", disableDepthTest());
            \u0458aoa.a_bsm10("depthMask", depthMask(boolean ), (boolean)false);
            for (class_1792 var6_6 : \u0458aoa.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.method_18112()) {
                if (!(var6_6 instanceof class_1676)) continue;
                if (var6_6.method_24828() || var6_6.method_31481()) ** GOTO lbl-1000
                if (var6_6 instanceof class_1665) {
                    var8_10 = (class_1665)var6_6;
                    ** if (var8_10.field_7576 <= 0 && var8_10.field_7574 <= 0) goto lbl-1000
                }
                ** GOTO lbl-1000
lbl-1000:
                // 2 sources

                {
                    v2 = true;
                    ** GOTO lbl84
                }
lbl-1000:
                // 2 sources

                {
                    v2 = var7_8 = false;
                }
lbl84:
                // 2 sources

                if (var7_8) continue;
                var8_11 = this.as\u0458.computeIfAbsent((Integer)\u0458aoa.a_bsm14("valueOf", valueOf(int ), (int)var6_6.method_5628()), (Function<Integer, List>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, \u0445\u0458\u0441(java.lang.Integer ), (Ljava/lang/Integer;)Ljava/util/List;)());
                var9_26 = new class_243((double)\u0458aoa.a_bsm15("method_16436", method_16436(double double double ), (double)var4_4, (double)var6_6.field_6014, (double)var6_6.method_23317()), (double)\u0458aoa.a_bsm15("method_16436", method_16436(double double double ), (double)var4_4, (double)var6_6.field_6036, (double)var6_6.method_23318()), (double)\u0458aoa.a_bsm15("method_16436", method_16436(double double double ), (double)var4_4, (double)var6_6.field_5969, (double)var6_6.method_23321()));
                if (var8_11.isEmpty() || ((class_243)var8_11.get(var8_11.size() - 1)).method_1022(var9_26) > 0.02) {
                    var8_11.add(var9_26);
                }
                if (var8_11.size() > -1776373290 + 1776373320) {
                    var8_11.remove(0);
                }
                if (var8_11.size() <= 1) continue;
                this.eoe\u0455\u0445\u04bb(var2_2, var8_11, var3_3, false);
            }
            this.as\u0458.keySet().removeIf((Predicate<Integer>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, cea\u0455\u0458(java.lang.Integer ), (Ljava/lang/Integer;)Z)());
            \u0458aoa.a_bsm11("enableDepthTest", enableDepthTest());
            \u0458aoa.a_bsm10("depthMask", depthMask(boolean ), (boolean)true);
            \u0458aoa.a_bsm12("enableCull", enableCull());
            \u0458aoa.a_bsm13("disableBlend", disableBlend());
        }
    }

    private /* synthetic */ void eoe\u0455\u0445\u04bb(class_4587 class_45872, List<class_243> list, class_243 class_2432, boolean bl) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        class_287 class_2872 = \u0458aoa.a_bsm16("method_1348", method_1348()).method_1349();
        \u0458aoa.a_bsm17("setShader", setShader(java.util.function.Supplier ), class_757::method_34540);
        class_2872.method_1328(class_293.class_5596.field_27380, class_290.field_1576);
        for (int i = 0; i < list.size(); ++i) {
            float f;
            class_243 class_2433 = list.get(i);
            CallSite callSite = \u0458aoa.a_bsm18("\u0440\u0456\u0435a", \u0440\u0456\u0435a(int ), (int)i);
            float f2 = f = bl ? (float)i / (float)list.size() * 0.4f : 0.5f;
            class_243 class_2434 = i < list.size() - 1 ? list.get(i + 1) : (i > 0 ? list.get(i - 1) : class_2433);
            class_243 class_2435 = class_2434.method_1020(class_2433).method_1029().method_1036(new class_243(0.0, 1.0, 0.0)).method_1029().method_1021(0.06 + (double)((float)i / (float)list.size()) * 0.04);
            class_2872.method_22918(matrix4f, (float)(class_2433.field_1352 + class_2435.field_1352 - class_2432.field_1352), (float)(class_2433.field_1351 + class_2435.field_1351 - class_2432.field_1351), (float)(class_2433.field_1350 + class_2435.field_1350 - class_2432.field_1350)).method_22915((float)((Color)((Object)callSite)).getRed() / 255.0f, (float)((Color)((Object)callSite)).getGreen() / 255.0f, (float)((Color)((Object)callSite)).getBlue() / 255.0f, f).method_1344();
            class_2872.method_22918(matrix4f, (float)(class_2433.field_1352 - class_2435.field_1352 - class_2432.field_1352), (float)(class_2433.field_1351 - class_2435.field_1351 - class_2432.field_1351), (float)(class_2433.field_1350 - class_2435.field_1350 - class_2432.field_1350)).method_22915((float)((Color)((Object)callSite)).getRed() / 255.0f, (float)((Color)((Object)callSite)).getGreen() / 255.0f, (float)((Color)((Object)callSite)).getBlue() / 255.0f, f).method_1344();
        }
        \u0458aoa.a_bsm19("method_43433", method_43433(net.minecraft.class_287$class_7433 ), (class_287.class_7433)class_2872.method_1326());
    }

    private /* synthetic */ void isx\u0441\u0430\u0430i(class_4587 class_45872, class_243 class_2432, class_243 class_2433) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        class_45872.method_22903();
        class_45872.method_22904(class_2432.field_1352 - class_2433.field_1352, class_2432.field_1351 - class_2433.field_1351, class_2432.field_1350 - class_2433.field_1350);
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        class_287 class_2872 = \u0458aoa.a_bsm16("method_1348", method_1348()).method_1349();
        \u0458aoa.a_bsm17("setShader", setShader(java.util.function.Supplier ), class_757::method_34540);
        CallSite callSite = \u0458aoa.a_bsm18("\u0440\u0456\u0435a", \u0440\u0456\u0435a(int ), (int)0);
        class_2872.method_1328(class_293.class_5596.field_27381, class_290.field_1576);
        class_2872.method_22918(matrix4f, 0.0f, 0.01f, 0.0f).method_22915((float)((Color)((Object)callSite)).getRed() / 255.0f, (float)((Color)((Object)callSite)).getGreen() / 255.0f, (float)((Color)((Object)callSite)).getBlue() / 255.0f, 0.3f).method_1344();
        for (int i = 0; i <= -766194255 + 766194615; i += 30) {
            float f = (float)\u0458aoa.a_bsm20("toRadians", toRadians(double ), (double)i);
            class_2872.method_22918(matrix4f, (float)\u0458aoa.a_bsm21("cos", cos(double ), (double)f) * 0.4f, 0.01f, (float)\u0458aoa.a_bsm22("sin", sin(double ), (double)f) * 0.4f).method_22915((float)((Color)((Object)callSite)).getRed() / 255.0f, (float)((Color)((Object)callSite)).getGreen() / 255.0f, (float)((Color)((Object)callSite)).getBlue() / 255.0f, 0.0f).method_1344();
        }
        \u0458aoa.a_bsm19("method_43433", method_43433(net.minecraft.class_287$class_7433 ), (class_287.class_7433)class_2872.method_1326());
        class_45872.method_22909();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static /* synthetic */ boolean cea\u0455\u0458(Integer n) {
        class_1297 class_12972;
        if (2 * 2 * 2 >= 0) {
        }
        if ((class_12972 = \u0458aoa.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.method_8469(n.intValue())) == null) return true;
        if (class_12972.method_31481()) return true;
        if (class_12972.method_24828()) return true;
        if (!(class_12972 instanceof class_1665)) return false;
        class_1665 class_16652 = (class_1665)class_12972;
        if (class_16652.field_7576 > 0) return true;
        if (class_16652.field_7574 <= 0) return false;
        return true;
    }

    private static /* synthetic */ List \u0445\u0458\u0441(Integer n) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        return new ArrayList();
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
}

