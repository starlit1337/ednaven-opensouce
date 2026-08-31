/*
 * Decompiled with CFR 0.152.
 */
package ie\u0441\u0430ej;

import ie\u0441\u0430ej.\u0441p\u0435\u0435\u0441x;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.List;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_310;
import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.joml.Vector4d;
import org.joml.Vector4f;

public class p\u0435a\u0435 {
    private static final /* synthetic */ class_310 \u0430cpch;

    public p\u0435a\u0435() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
    }

    public static /* synthetic */ \u0441p\u0435\u0435\u0441x cpopss\u043e(double d, double d2, double d3, float f) {
        class_1297 class_12972;
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        class_243 class_2432 = p\u0435a\u0435.\u0430cpch.method_1561().field_4686.method_19326();
        Quaternionf quaternionf = new Quaternionf((Quaternionfc)\u0430cpch.method_1561().method_24197());
        quaternionf.conjugate();
        Vector3f vector3f = new Vector3f((float)(class_2432.field_1352 - d), (float)(class_2432.field_1351 - d2), (float)(class_2432.field_1350 - d3));
        vector3f.rotate((Quaternionfc)quaternionf);
        if (((Boolean)p\u0435a\u0435.\u0430cpch.field_1690.method_42448().method_41753()).booleanValue() && (class_12972 = \u0430cpch.method_1560()) instanceof class_1657) {
            class_1657 class_16572 = (class_1657)class_12972;
            p\u0435a\u0435.hae(class_16572, vector3f, f);
        }
        double d4 = p\u0435a\u0435.\u0430cpch.field_1773.method_3196(p\u0435a\u0435.\u0430cpch.method_1561().field_4686, f, true);
        return p\u0435a\u0435.p\u0456\u043e(vector3f, d4);
    }

    public static /* synthetic */ List<class_243> \u0440as(class_238 class_2383) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        Object[] objectArray = new class_243[-1558609892 + 1558609900];
        objectArray[0] = new class_243(class_2383.field_1323, class_2383.field_1322, class_2383.field_1321);
        objectArray[1] = new class_243(class_2383.field_1323, class_2383.field_1325, class_2383.field_1321);
        objectArray[2] = new class_243(class_2383.field_1320, class_2383.field_1322, class_2383.field_1321);
        objectArray[3] = new class_243(class_2383.field_1320, class_2383.field_1325, class_2383.field_1321);
        objectArray[4] = new class_243(class_2383.field_1323, class_2383.field_1322, class_2383.field_1324);
        objectArray[5] = new class_243(class_2383.field_1323, class_2383.field_1325, class_2383.field_1324);
        objectArray[-1218486116 + 1218486122] = new class_243(class_2383.field_1320, class_2383.field_1322, class_2383.field_1324);
        objectArray[-1001547549 + 1001547556] = new class_243(class_2383.field_1320, class_2383.field_1325, class_2383.field_1324);
        return p\u0435a\u0435.a_bsm0("asList", asList(T[] ), (Object[])objectArray);
    }

    public static /* synthetic */ Vector4d \u0456\u0435sjjej(int[] nArray, Matrix4f matrix4f, class_238 class_2383) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        List<class_243> list = p\u0435a\u0435.\u0440as(class_2383);
        Vector4d vector4d = null;
        for (class_243 class_2432 : list) {
            Vector4f vector4f = new Vector4f((float)class_2432.field_1352, (float)class_2432.field_1351, (float)class_2432.field_1350, 1.0f);
            matrix4f.transform(vector4f);
            if (vector4f.w <= 0.0f) continue;
            vector4f.div(vector4f.w);
            float f = (vector4f.x + 1.0f) * 0.5f * (float)nArray[2] + (float)nArray[0];
            float f2 = (1.0f - vector4f.y) * 0.5f * (float)nArray[3] + (float)nArray[1];
            if (vector4d == null) {
                vector4d = new Vector4d((double)f, (double)f2, (double)f, (double)f2);
                continue;
            }
            vector4d.x = (double)p\u0435a\u0435.a_bsm1("min", min(double double ), (double)f, (double)vector4d.x);
            vector4d.y = (double)p\u0435a\u0435.a_bsm1("min", min(double double ), (double)f2, (double)vector4d.y);
            vector4d.z = (double)p\u0435a\u0435.a_bsm2("max", max(double double ), (double)f, (double)vector4d.z);
            vector4d.w = (double)p\u0435a\u0435.a_bsm2("max", max(double double ), (double)f2, (double)vector4d.w);
        }
        return vector4d;
    }

    private static /* synthetic */ void hae(class_1657 class_16572, Vector3f vector3f, float f) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        float f2 = class_16572.field_5973;
        float f3 = f2 - class_16572.field_6039;
        float f4 = -(f2 + f3 * f);
        CallSite callSite = p\u0435a\u0435.a_bsm3("method_16439", method_16439(float float float ), (float)f, (float)class_16572.field_7505, (float)class_16572.field_7483);
        Quaternionf quaternionf = new Quaternionf().rotationX((float)(p\u0435a\u0435.a_bsm5("abs", abs(float ), (float)(p\u0435a\u0435.a_bsm4("method_15362", method_15362(float ), (float)(f4 * (float)Math.PI - 0.2f)) * callSite)) * 5.0f * ((float)Math.PI / 180)));
        quaternionf.conjugate();
        vector3f.rotate((Quaternionfc)quaternionf);
        Quaternionf quaternionf2 = new Quaternionf().rotationZ((float)(p\u0435a\u0435.a_bsm6("method_15374", method_15374(float ), (float)(f4 * (float)Math.PI)) * callSite * 3.0f * ((float)Math.PI / 180)));
        quaternionf2.conjugate();
        vector3f.rotate((Quaternionfc)quaternionf2);
        Vector3f vector3f2 = new Vector3f((float)(p\u0435a\u0435.a_bsm6("method_15374", method_15374(float ), (float)(f4 * (float)Math.PI)) * callSite * 0.5f), (float)(-p\u0435a\u0435.a_bsm5("abs", abs(float ), (float)(p\u0435a\u0435.a_bsm4("method_15362", method_15362(float ), (float)(f4 * (float)Math.PI)) * callSite))), 0.0f);
        vector3f2.y = -vector3f2.y;
        vector3f.add((Vector3fc)vector3f2);
    }

    private static /* synthetic */ \u0441p\u0435\u0435\u0441x p\u0456\u043e(Vector3f vector3f, double d) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        float f = (float)\u0430cpch.method_22683().method_4502() / 2.0f;
        float f2 = f / (vector3f.z() * (float)p\u0435a\u0435.a_bsm8("tan", tan(double ), (double)p\u0435a\u0435.a_bsm7("toRadians", toRadians(double ), (double)(d / 2.0))));
        return vector3f.z() < 0.0f ? new \u0441p\u0435\u0435\u0441x(-vector3f.x() * f2 + (float)\u0430cpch.method_22683().method_4486() / 2.0f, (float)\u0430cpch.method_22683().method_4502() / 2.0f - vector3f.y() * f2) : new \u0441p\u0435\u0435\u0441x(Float.MAX_VALUE, Float.MAX_VALUE);
    }

    static {
        \u0430cpch = class_310.method_1551();
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

