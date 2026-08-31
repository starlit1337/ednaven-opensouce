/*
 * Decompiled with CFR 0.152.
 */
package \u0445\u0458jsj\u0430;

import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import net.minecraft.class_1044;
import net.minecraft.class_3300;
import \u0445\u0458jsj\u0430.ee\u043e;
import \u0445\u0458jsj\u0430.\u043e\u0430\u0456\u0445;

public class c\u0435pxxe
extends class_1044 {
    public c\u0435pxxe(int n, int n2, ByteBuffer byteBuffer, ee\u043e ee\u043e2, \u043e\u0430\u0456\u0445 \u043e\u0430\u0456\u04452, \u043e\u0430\u0456\u0445 \u043e\u0430\u0456\u04453) {
        if (true | false) {
        }
        if (c\u0435pxxe.a_bsm0("isOnRenderThread", isOnRenderThread()) == false) {
            c\u0435pxxe.a_bsm1("recordRenderCall", recordRenderCall(net.minecraft.class_4573 ), () -> {
                if (2 * 2 * 2 >= 0) {
                }
                this.upload(n, n2, byteBuffer, ee\u043e2, \u043e\u0430\u0456\u04452, \u043e\u0430\u0456\u04453);
            });
        } else {
            this.upload(n, n2, byteBuffer, ee\u043e2, \u043e\u0430\u0456\u04452, \u043e\u0430\u0456\u04453);
        }
    }

    private /* synthetic */ void upload(int n, int n2, ByteBuffer byteBuffer, ee\u043e ee\u043e2, \u043e\u0430\u0456\u0445 \u043e\u0430\u0456\u04452, \u043e\u0430\u0456\u0445 \u043e\u0430\u0456\u04453) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        this.method_23207();
        c\u0435pxxe.a_bsm2("glPixelStorei", glPixelStorei(int int ), (int)(-536743055 + 536746367), (int)0);
        c\u0435pxxe.a_bsm2("glPixelStorei", glPixelStorei(int int ), (int)(-29841939 + 29845252), (int)0);
        c\u0435pxxe.a_bsm2("glPixelStorei", glPixelStorei(int int ), (int)(-1382031842 + 1382035156), (int)0);
        c\u0435pxxe.a_bsm2("glPixelStorei", glPixelStorei(int int ), (int)(-1421125133 + 1421158011), (int)0);
        c\u0435pxxe.a_bsm2("glPixelStorei", glPixelStorei(int int ), (int)(-806225509 + 806228824), (int)0);
        c\u0435pxxe.a_bsm2("glPixelStorei", glPixelStorei(int int ), (int)(-1557876806 + 1557880122), (int)0);
        c\u0435pxxe.a_bsm2("glPixelStorei", glPixelStorei(int int ), (int)(-1950723840 + 1950756717), (int)0);
        c\u0435pxxe.a_bsm2("glPixelStorei", glPixelStorei(int int ), (int)(-175427832 + 175431149), (int)4);
        c\u0435pxxe.a_bsm3("glTexParameteri", glTexParameteri(int int int ), (int)(-1486788928 + 1486792481), (int)(-1125431000 + 1125441242), (int)(-864476345 + 864486842));
        c\u0435pxxe.a_bsm3("glTexParameteri", glTexParameteri(int int int ), (int)(-825047514 + 825051067), (int)(-1664676499 + 1664686742), (int)(-1176814214 + 1176824711));
        c\u0435pxxe.a_bsm3("glTexParameteri", glTexParameteri(int int int ), (int)(-1407340759 + 1407344312), (int)(-949824769 + 949835010), (int)\u043e\u0430\u0456\u04452.toOpenGL());
        c\u0435pxxe.a_bsm3("glTexParameteri", glTexParameteri(int int int ), (int)(-511962760 + 511966313), (int)(-1197935727 + 1197945967), (int)\u043e\u0430\u0456\u04453.toOpenGL());
        ((Buffer)byteBuffer).rewind();
        c\u0435pxxe.a_bsm4("glTexImage2D", glTexImage2D(int int int int int int int int java.nio.ByteBuffer ), (int)(-1103127477 + 1103131030), (int)0, (int)ee\u043e2.toOpenGL(), (int)n, (int)n2, (int)0, (int)ee\u043e2.toOpenGL(), (int)(-693250400 + 693255521), (ByteBuffer)byteBuffer);
    }

    public /* synthetic */ void method_4625(class_3300 class_33002) throws IOException {
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
}

