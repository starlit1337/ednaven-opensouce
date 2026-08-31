/*
 * Decompiled with CFR 0.152.
 */
package \u0455hs;

import io.github.humbleui.skija.BackendRenderTarget;
import io.github.humbleui.skija.Canvas;
import io.github.humbleui.skija.ColorSpace;
import io.github.humbleui.skija.DirectContext;
import io.github.humbleui.skija.Surface;
import io.github.humbleui.skija.SurfaceColorFormat;
import io.github.humbleui.skija.SurfaceOrigin;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.function.Consumer;

public class \u0440ox\u043e\u0456 {
    private static /* synthetic */ DirectContext ZokbYQn;
    private static /* synthetic */ Surface joj;
    private static /* synthetic */ BackendRenderTarget \u0440pe;

    public \u0440ox\u043e\u0456() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
    }

    public static /* synthetic */ Canvas x\u0441\u0441() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return joj.getCanvas();
    }

    public static /* synthetic */ void ixx\u0445(int n, int n2) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if (ZokbYQn == null) {
            ZokbYQn = \u0440ox\u043e\u0456.a_bsm0("makeGL", makeGL());
        }
        if (joj != null) {
            joj.close();
            joj = null;
        }
        if (\u0440pe != null) {
            \u0440pe.close();
            \u0440pe = null;
        }
        \u0440pe = \u0440ox\u043e\u0456.a_bsm2("makeGL", makeGL(int int int int int int ), (int)n, (int)n2, (int)0, (int)(-608532159 + 608532167), (int)\u0440ox\u043e\u0456.a_bsm1("method_1551", method_1551()).method_1522().field_1476, (int)(-705314561 + 705347417));
        joj = \u0440ox\u043e\u0456.a_bsm4("wrapBackendRenderTarget", wrapBackendRenderTarget(io.github.humbleui.skija.DirectContext io.github.humbleui.skija.BackendRenderTarget io.github.humbleui.skija.SurfaceOrigin io.github.humbleui.skija.SurfaceColorFormat io.github.humbleui.skija.ColorSpace ), (DirectContext)ZokbYQn, (BackendRenderTarget)\u0440pe, (SurfaceOrigin)SurfaceOrigin.BOTTOM_LEFT, (SurfaceColorFormat)SurfaceColorFormat.RGBA_8888, (ColorSpace)\u0440ox\u043e\u0456.a_bsm3("getSRGB", getSRGB()));
    }

    public static /* synthetic */ void \u0456\u0440\u0430\u0455i\u0455(Consumer<Canvas> consumer) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        \u0440ox\u043e\u0456.a_bsm5("\u0441sp", \u0441sp());
        \u0440ox\u043e\u0456.ia\u04bb();
        ZokbYQn.resetGLAll();
        Canvas canvas = \u0440ox\u043e\u0456.x\u0441\u0441();
        consumer.accept(canvas);
        \u0440ox\u043e\u0456.a_bsm6("enableBlend", enableBlend());
        ZokbYQn.flush();
        \u0440ox\u043e\u0456.a_bsm7("jj\u0430c\u04bb\u0455\u0455", jj\u0430c\u04bb\u0455\u0455());
        \u0440ox\u043e\u0456.a_bsm8("disableBlend", disableBlend());
    }

    private static /* synthetic */ void ia\u04bb() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        \u0440ox\u043e\u0456.a_bsm9("glBindBuffer", glBindBuffer(int int ), (int)(-632972495 + 633007547), (int)0);
        \u0440ox\u043e\u0456.a_bsm10("glPixelStorei", glPixelStorei(int int ), (int)(-695687988 + 695691300), (int)0);
        \u0440ox\u043e\u0456.a_bsm10("glPixelStorei", glPixelStorei(int int ), (int)(-1576190436 + 1576193749), (int)0);
        \u0440ox\u043e\u0456.a_bsm10("glPixelStorei", glPixelStorei(int int ), (int)(-1091997446 + 1092000760), (int)0);
        \u0440ox\u043e\u0456.a_bsm10("glPixelStorei", glPixelStorei(int int ), (int)(-1430552407 + 1430555722), (int)0);
        \u0440ox\u043e\u0456.a_bsm10("glPixelStorei", glPixelStorei(int int ), (int)(-1702963345 + 1702966661), (int)0);
        \u0440ox\u043e\u0456.a_bsm10("glPixelStorei", glPixelStorei(int int ), (int)(-1039381799 + 1039385116), (int)4);
    }

    public static /* synthetic */ DirectContext \u0430\u0458\u0458e\u0430\u0430j() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return ZokbYQn;
    }

    static {
        ZokbYQn = null;
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

