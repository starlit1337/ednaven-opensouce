/*
 * Decompiled with CFR 0.152.
 */
package ie\u0441\u0430ej;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_276;
import net.minecraft.class_310;

public class \u04bb\u0430o\u043e {
    private static final /* synthetic */ class_310 aji\u0455;

    public \u04bb\u0430o\u043e() {
        if (2 * 2 * 2 >= 0) {
        }
    }

    public static /* synthetic */ void \u043eja\u0435p(boolean bl) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        \u04bb\u0430o\u043e.\u0445s\u0435\u04bb();
        \u04bb\u0430o\u043e.a_bsm0("glClear", glClear(int ), (int)(-1889516566 + 1889517590));
        \u04bb\u0430o\u043e.a_bsm1("glEnable", glEnable(int ), (int)(-1081341304 + 1081344264));
        \u04bb\u0430o\u043e.a_bsm2("glStencilFunc", glStencilFunc(int int int ), (int)(-1924232016 + 1924232535), (int)1, (int)(-1652840175 + 1652905710));
        \u04bb\u0430o\u043e.a_bsm3("glStencilOp", glStencilOp(int int int ), (int)(-1563923481 + 1563931161), (int)(-1967434579 + 1967442259), (int)(-588019703 + 588027384));
        if (!bl) {
            \u04bb\u0430o\u043e.a_bsm4("colorMask", colorMask(boolean boolean boolean boolean ), (boolean)false, (boolean)false, (boolean)false, (boolean)false);
        }
    }

    public static /* synthetic */ void \u0458ah\u0440(boolean bl) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        \u04bb\u0430o\u043e.a_bsm4("colorMask", colorMask(boolean boolean boolean boolean ), (boolean)true, (boolean)true, (boolean)true, (boolean)true);
        \u04bb\u0430o\u043e.a_bsm2("glStencilFunc", glStencilFunc(int int int ), (int)(bl ? -104780487 + 104781001 : -1174963819 + 1174964336), (int)1, (int)(-492704757 + 492770292));
        \u04bb\u0430o\u043e.a_bsm3("glStencilOp", glStencilOp(int int int ), (int)(-784874895 + 784882575), (int)(-203336487 + 203344167), (int)(-865019490 + 865027171));
    }

    public static /* synthetic */ void ece() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        \u04bb\u0430o\u043e.a_bsm5("glDisable", glDisable(int ), (int)(-682972945 + 682975905));
    }

    public static /* synthetic */ void \u0445s\u0435\u04bb() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if (aji\u0455.method_1522().method_30278() > -1) {
            \u04bb\u0430o\u043e.ao\u0435he\u0456(aji\u0455.method_1522());
            \u04bb\u0430o\u043e.aji\u0455.method_1522().field_1474 = -1;
        }
    }

    public static /* synthetic */ void ao\u0435he\u0456(class_276 class_2762) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        \u04bb\u0430o\u043e.a_bsm6("glDeleteRenderbuffersEXT", glDeleteRenderbuffersEXT(int ), (int)class_2762.method_30278());
        CallSite callSite = \u04bb\u0430o\u043e.a_bsm7("glGenRenderbuffersEXT", glGenRenderbuffersEXT());
        \u04bb\u0430o\u043e.a_bsm8("glBindRenderbufferEXT", glBindRenderbufferEXT(int int ), (int)(-2094049115 + 2094085276), (int)callSite);
        \u04bb\u0430o\u043e.a_bsm9("glRenderbufferStorageEXT", glRenderbufferStorageEXT(int int int int ), (int)(-235864479 + 235900640), (int)(-132865407 + 132899448), (int)aji\u0455.method_22683().method_4489(), (int)aji\u0455.method_22683().method_4506());
        \u04bb\u0430o\u043e.a_bsm10("glFramebufferRenderbufferEXT", glFramebufferRenderbufferEXT(int int int int ), (int)(-59119972 + 59156132), (int)(-1298424500 + 1298460628), (int)(-309754180 + 309790341), (int)callSite);
        \u04bb\u0430o\u043e.a_bsm10("glFramebufferRenderbufferEXT", glFramebufferRenderbufferEXT(int int int int ), (int)(-395660880 + 395697040), (int)(-1501765695 + 1501801791), (int)(-244968385 + 245004546), (int)callSite);
    }

    static {
        aji\u0455 = class_310.method_1551();
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
}

