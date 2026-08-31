/*
 * Decompiled with CFR 0.152.
 */
package ie\u0441\u0430ej;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_2378;
import net.minecraft.class_2960;
import net.minecraft.class_3414;
import net.minecraft.class_7923;

public class \u0441\u0455\u0440\u0435 {
    public static final /* synthetic */ String \u0440\u043ee;
    public static /* synthetic */ class_3414 \u0456\u0455\u0455epeh;

    public \u0441\u0455\u0440\u0435() {
        if (2 * 2 * 2 >= 0) {
        }
    }

    public static /* synthetic */ void c\u0445\u04bbx() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        \u0456\u0455\u0455epeh = \u0441\u0455\u0440\u0435.s\u0441\u0430je();
    }

    private static /* synthetic */ class_3414 s\u0441\u0430je() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        class_2960 class_29602 = new class_2960((String)((Object)\u0441\u0455\u0440\u0435.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1517783136 + 1517783031, -437029640 + 437029570, -217143690 + 217143625, -1993218311 + 1993218327, -1169705023 + 1169704926}, (int)(-1403241937 + 795910557), (int)(518946093 + 441302030))), (String)((Object)\u0441\u0455\u0440\u0435.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1393413447 + 1393413417, -531002788 + 531002805, -1225796766 + 1225796787, -748285159 + 748285204}, (int)(-370632899 + 2063388072), (int)(-41015258 + 728236239))));
        return (class_3414)\u0441\u0455\u0440\u0435.a_bsm2("method_10230", method_10230(net.minecraft.class_2378 net.minecraft.class_2960 java.lang.Object ), (class_2378)class_7923.field_41172, (class_2960)class_29602, (Object)\u0441\u0455\u0440\u0435.a_bsm1("method_47908", method_47908(net.minecraft.class_2960 ), (class_2960)class_29602));
    }

    private static /* synthetic */ String a_fd(String string, String string2) {
        if (2 * 2 * 2 >= 0) {
        }
        if (string == null) {
            return null;
        }
        try {
            byte[] byArray = ((Base64.Decoder)((Object)\u0441\u0455\u0440\u0435.a_bsm3("getDecoder", getDecoder()))).decode(string);
            byte[] byArray2 = new byte[-1384956480 + 1384956496];
            \u0441\u0455\u0440\u0435.a_bsm4("arraycopy", arraycopy(java.lang.Object int java.lang.Object int int ), (Object)byArray, (int)0, (Object)byArray2, (int)0, (int)(-506604167 + 506604183));
            byte[] byArray3 = new byte[byArray.length - (-1351764026 + 1351764042)];
            \u0441\u0455\u0440\u0435.a_bsm4("arraycopy", arraycopy(java.lang.Object int java.lang.Object int int ), (Object)byArray, (int)(-1875656378 + 1875656394), (Object)byArray3, (int)0, (int)byArray3.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(((Base64.Decoder)((Object)\u0441\u0455\u0440\u0435.a_bsm3("getDecoder", getDecoder()))).decode(string2), "AES");
            CallSite callSite = \u0441\u0455\u0440\u0435.a_bsm5("getInstance", getInstance(java.lang.String ), (String)"AES/CBC/PKCS5Padding");
            ((Cipher)((Object)callSite)).init(2, secretKeySpec, new IvParameterSpec(byArray2));
            return new String(((Cipher)((Object)callSite)).doFinal(byArray3), "UTF-8");
        }
        catch (Exception exception) {
            throw new IllegalStateException("Encrypted field string decode failed");
        }
    }

    static {
        \u0440\u043ee = \u0441\u0455\u0440\u0435.a_fd("rwzZFsUYvpMd96KpGSWCVkBQ4N1bOAg9RccdxbLTQ9w=", "O8CVVYVnW9lCcDUEF8EJew==");
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
}

