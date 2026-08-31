/*
 * Decompiled with CFR 0.152.
 */
package \u0445\u0458jsj\u0430;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.HashMap;
import net.minecraft.class_1044;
import org.lwjgl.stb.STBTTFontinfo;
import org.lwjgl.stb.STBTTPackContext;
import org.lwjgl.stb.STBTTPackedchar;
import xs\u0441\u0445oa\u0430.p\u0456\u0458\u0441\u0458ej;
import \u0445\u0458jsj\u0430.c\u0435pxxe;
import \u0445\u0458jsj\u0430.ee\u043e;
import \u0445\u0458jsj\u0430.h\u0430\u0445\u04bb\u0430h;
import \u0445\u0458jsj\u0430.\u043e\u0430\u0456\u0445;

public class j\u0430a\u0445i\u0455 {
    public /* synthetic */ class_1044 h\u0455\u0430;
    private final /* synthetic */ int \u0455\u0430\u0441x\u04bb;
    private final /* synthetic */ float \u0458es;
    private final /* synthetic */ float ce\u043e\u0441sx;
    private final /* synthetic */ h\u0430\u0445\u04bb\u0430h[] eshe\u04bbs\u0435;
    private final /* synthetic */ int ecih;
    private final /* synthetic */ HashMap<String, Double> caae\u04bb\u0456\u0440;

    public j\u0430a\u0445i\u0455(ByteBuffer byteBuffer, int n, int n2, int n3, int n4) {
        if (2 * 2 * 2 >= 0) {
        }
        this.caae\u04bb\u0456\u0440 = new HashMap();
        this.\u0455\u0430\u0441x\u04bb = n;
        this.ecih = n2;
        CallSite callSite = j\u0430a\u0445i\u0455.a_bsm0("create", create());
        j\u0430a\u0445i\u0455.a_bsm1("stbtt_InitFont", stbtt_InitFont(org.lwjgl.stb.STBTTFontinfo java.nio.ByteBuffer ), (STBTTFontinfo)callSite, (ByteBuffer)byteBuffer);
        this.eshe\u04bbs\u0435 = new h\u0430\u0445\u04bb\u0430h[n3 + 1 - n2];
        CallSite callSite2 = j\u0430a\u0445i\u0455.a_bsm2("create", create(int ), (int)this.eshe\u04bbs\u0435.length);
        CallSite callSite3 = j\u0430a\u0445i\u0455.a_bsm3("createByteBuffer", createByteBuffer(int ), (int)(n4 * n4));
        CallSite callSite4 = j\u0430a\u0445i\u0455.a_bsm4("create", create());
        j\u0430a\u0445i\u0455.a_bsm5("stbtt_PackBegin", stbtt_PackBegin(org.lwjgl.stb.STBTTPackContext java.nio.ByteBuffer int int int int ), (STBTTPackContext)callSite4, (ByteBuffer)((Object)callSite3), (int)n4, (int)n4, (int)0, (int)1);
        j\u0430a\u0445i\u0455.a_bsm6("stbtt_PackSetOversampling", stbtt_PackSetOversampling(org.lwjgl.stb.STBTTPackContext int int ), (STBTTPackContext)callSite4, (int)2, (int)2);
        j\u0430a\u0445i\u0455.a_bsm7("stbtt_PackFontRange", stbtt_PackFontRange(org.lwjgl.stb.STBTTPackContext java.nio.ByteBuffer int float int org.lwjgl.stb.STBTTPackedchar$Buffer ), (STBTTPackContext)callSite4, (ByteBuffer)byteBuffer, (int)0, (float)n, (int)this.ecih, (STBTTPackedchar.Buffer)callSite2);
        j\u0430a\u0445i\u0455.a_bsm8("stbtt_PackEnd", stbtt_PackEnd(org.lwjgl.stb.STBTTPackContext ), (STBTTPackContext)callSite4);
        this.h\u0455\u0430 = new c\u0435pxxe(n4, n4, (ByteBuffer)((Object)callSite3), ee\u043e.\u0445\u0458\u0440\u0435h\u043e, \u043e\u0430\u0456\u0445.xipj\u04bb, \u043e\u0430\u0456\u0445.xipj\u04bb);
        this.\u0458es = (float)j\u0430a\u0445i\u0455.a_bsm9("stbtt_ScaleForPixelHeight", stbtt_ScaleForPixelHeight(org.lwjgl.stb.STBTTFontinfo float ), (STBTTFontinfo)callSite, (float)n);
        try (CallSite callSite5 = j\u0430a\u0445i\u0455.a_bsm10("stackPush", stackPush());){
            IntBuffer intBuffer = callSite5.mallocInt(1);
            j\u0430a\u0445i\u0455.a_bsm11("stbtt_GetFontVMetrics", stbtt_GetFontVMetrics(org.lwjgl.stb.STBTTFontinfo java.nio.IntBuffer java.nio.IntBuffer java.nio.IntBuffer ), (STBTTFontinfo)callSite, (IntBuffer)intBuffer, null, null);
            this.ce\u043e\u0441sx = intBuffer.get(0);
        }
        for (int i = 0; i < this.eshe\u04bbs\u0435.length; ++i) {
            STBTTPackedchar sTBTTPackedchar = (STBTTPackedchar)callSite2.get(i);
            float f = 1.0f / (float)n4;
            float f2 = 1.0f / (float)n4;
            this.eshe\u04bbs\u0435[i] = new h\u0430\u0445\u04bb\u0430h(sTBTTPackedchar.xoff(), sTBTTPackedchar.yoff(), sTBTTPackedchar.xoff2(), sTBTTPackedchar.yoff2(), (float)sTBTTPackedchar.x0() * f, (float)sTBTTPackedchar.y0() * f2, (float)sTBTTPackedchar.x1() * f, (float)sTBTTPackedchar.y1() * f2, sTBTTPackedchar.xadvance());
        }
    }

    public /* synthetic */ double x\u0430hx\u0458(String string) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (this.caae\u04bb\u0456\u0440.containsKey(string)) {
            return this.caae\u04bb\u0456\u0440.get(string);
        }
        double d = 0.0;
        block4: for (int i = 0; i < string.length(); ++i) {
            int n = string.charAt(i) - this.ecih;
            if (n == -628206765 + 628206932 && i + 1 < string.length()) {
                ++i;
            } else {
                if (n >= this.eshe\u04bbs\u0435.length) {
                    n = 0;
                }
                h\u0430\u0445\u04bb\u0430h h\u0430\u0445\u04bb\u0430h2 = this.eshe\u04bbs\u0435[n];
                d += (double)h\u0430\u0445\u04bb\u0430h2.\u0435jpe\u0440();
            }
            switch (0) {
                default: {
                    continue block4;
                }
                case 1: {
                    continue block4;
                }
                case 2: 
            }
        }
        this.caae\u04bb\u0456\u0440.put(string, (Double)((Object)j\u0430a\u0445i\u0455.a_bsm12("valueOf", valueOf(double ), (double)d)));
        return d;
    }

    public /* synthetic */ double \u0455j\u0430\u0440\u0455() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return this.\u0455\u0430\u0441x\u04bb;
    }

    public /* synthetic */ double ep\u0456hac(p\u0456\u0458\u0441\u0458ej p\u0456\u0458\u0441\u0458ej2, String string, double d, double d2, Color color, double d3, boolean bl) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        Color color2 = color;
        d2 += (double)(this.ce\u043e\u0441sx * this.\u0458es) * d3;
        for (int i = 0; i < string.length(); ++i) {
            int n = string.charAt(i) - this.ecih;
            if (n == -852779786 + 852779953 && i + 1 < string.length()) {
                char c = string.charAt(i + 1);
                CallSite callSite = j\u0430a\u0445i\u0455.a_bsm13("method_544", method_544(char ), (char)c);
                if (callSite != null && callSite.method_532() != null && callSite.method_543() && !bl) {
                    color2 = new Color(callSite.method_532());
                }
                ++i;
                continue;
            }
            if (n >= this.eshe\u04bbs\u0435.length) {
                n = 0;
            }
            h\u0430\u0445\u04bb\u0430h h\u0430\u0445\u04bb\u0430h2 = this.eshe\u04bbs\u0435[n];
            p\u0456\u0458\u0441\u0458ej2.\u0430\u0441\u0441p\u0435s(p\u0456\u0458\u0441\u0458ej2.jji(d + (double)h\u0430\u0445\u04bb\u0430h2.\u0456j\u0430\u0445ai() * d3, d2 + (double)h\u0430\u0445\u04bb\u0430h2.\u043e\u0435cp\u0455() * d3).jji(h\u0430\u0445\u04bb\u0430h2.\u043e\u0458c(), h\u0430\u0445\u04bb\u0430h2.\u0458xos\u0455j()).\u0430h\u04bb(color2).\u0441\u0455ci(), p\u0456\u0458\u0441\u0458ej2.jji(d + (double)h\u0430\u0445\u04bb\u0430h2.\u0456j\u0430\u0445ai() * d3, d2 + (double)h\u0430\u0445\u04bb\u0430h2.iih\u0440\u0435\u0430() * d3).jji(h\u0430\u0445\u04bb\u0430h2.\u043e\u0458c(), h\u0430\u0445\u04bb\u0430h2.\u0458j\u0445\u0455hp()).\u0430h\u04bb(color2).\u0441\u0455ci(), p\u0456\u0458\u0441\u0458ej2.jji(d + (double)h\u0430\u0445\u04bb\u0430h2.\u0440\u0430\u0456() * d3, d2 + (double)h\u0430\u0445\u04bb\u0430h2.iih\u0440\u0435\u0430() * d3).jji(h\u0430\u0445\u04bb\u0430h2.hs\u04bb\u0456\u0456\u0458a(), h\u0430\u0445\u04bb\u0430h2.\u0458j\u0445\u0455hp()).\u0430h\u04bb(color2).\u0441\u0455ci(), p\u0456\u0458\u0441\u0458ej2.jji(d + (double)h\u0430\u0445\u04bb\u0430h2.\u0440\u0430\u0456() * d3, d2 + (double)h\u0430\u0445\u04bb\u0430h2.\u043e\u0435cp\u0455() * d3).jji(h\u0430\u0445\u04bb\u0430h2.hs\u04bb\u0456\u0456\u0458a(), h\u0430\u0445\u04bb\u0430h2.\u0458xos\u0455j()).\u0430h\u04bb(color2).\u0441\u0455ci());
            d += (double)h\u0430\u0445\u04bb\u0430h2.\u0435jpe\u0440() * d3;
        }
        return d;
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
}

