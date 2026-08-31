/*
 * Decompiled with CFR 0.152.
 */
package x\u0430s\u0456p\u0441\u0435;

import ie\u0441\u0430ej.\u0456oc;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.ByteBuffer;
import net.minecraft.class_4587;
import org.bytedeco.ffmpeg.global.avutil;
import org.bytedeco.javacv.FFmpegFrameGrabber;
import org.bytedeco.javacv.Frame;
import org.bytedeco.javacv.FrameGrabber;
import org.bytedeco.javacv.Java2DFrameConverter;

public class \u0456icsp\u0430 {
    private final /* synthetic */ \u0456oc \u043e\u0440o\u0430\u043ej;
    public /* synthetic */ BufferedImage x\u0445\u04bb\u0455\u04bb\u0458\u043e;
    private /* synthetic */ int \u0456\u0430\u0440o;
    private /* synthetic */ int epi;
    private /* synthetic */ int j\u043eij\u0445;
    private /* synthetic */ int \u043ec\u04bbji\u0435\u0440;
    private /* synthetic */ int \u0456\u0456o\u0458c;
    private /* synthetic */ boolean j\u0445\u0440jo\u0456\u0456;
    private /* synthetic */ boolean eh\u043eo;
    private /* synthetic */ FFmpegFrameGrabber e\u0456\u0440\u0455\u0430;
    private /* synthetic */ Frame \u0455\u0458\u0441\u0445;

    public \u0456icsp\u0430() {
        if (2 * 2 * 2 >= 0) {
        }
        this.\u043e\u0440o\u0430\u043ej = new \u0456oc();
        this.\u0456\u0430\u0440o = -497880473 + 497880533;
        this.j\u043eij\u0445 = -1;
        this.\u043ec\u04bbji\u0435\u0440 = -1;
        this.\u0456\u0456o\u0458c = -1;
        this.eh\u043eo = true;
    }

    public /* synthetic */ void \u0430ai(File file, boolean bl) {
        try {
            Java2DFrameConverter java2DFrameConverter;
            BufferedImage bufferedImage;
            Frame frame;
            if (true | false) {
            }
            if (0 != 0) {
            }
            this.\u0435o\u0455\u0458\u0445ox();
            this.eh\u043eo = false;
            this.e\u0456\u0440\u0455\u0430 = new FFmpegFrameGrabber(file);
            this.e\u0456\u0440\u0455\u0430.start();
            double d = this.e\u0456\u0440\u0455\u0430.getFrameRate();
            if (d > 0.0) {
                v0 = (int)d;
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
                v0 = this.\u0456\u0430\u0440o = -1704746000 + 1704746060;
            }
            if (bl && (frame = this.e\u0456\u0440\u0455\u0430.grabImage()) != null && (bufferedImage = (java2DFrameConverter = new Java2DFrameConverter()).convert(frame)) != null) {
                this.x\u0445\u04bb\u0455\u04bb\u0458\u043e = this.\u0458coo\u04bb\u0430(bufferedImage, -678109575 + 678109639, -464524789 + 464524837);
            }
        }
        catch (FFmpegFrameGrabber.Exception exception) {
            exception.printStackTrace();
        }
    }

    private /* synthetic */ BufferedImage \u0458coo\u04bb\u0430(BufferedImage bufferedImage, int n, int n2) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        BufferedImage bufferedImage2 = new BufferedImage(n, n2, 1);
        Graphics2D graphics2D = bufferedImage2.createGraphics();
        graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        graphics2D.drawImage(bufferedImage, 0, 0, n, n2, null);
        graphics2D.dispose();
        return bufferedImage2;
    }

    public /* synthetic */ void \u0441p\u0445s\u0435\u0456() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        boolean bl = this.j\u0445\u0440jo\u0456\u0456 = !this.j\u0445\u0440jo\u0456\u0456;
        if (!this.j\u0445\u0440jo\u0456\u0456) {
            this.\u043e\u0440o\u0430\u043ej.\u0441\u0458e();
        }
    }

    public /* synthetic */ void oeee(boolean bl) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        this.j\u0445\u0440jo\u0456\u0456 = bl;
        if (!bl) {
            this.\u043e\u0440o\u0430\u043ej.\u0441\u0458e();
        }
    }

    public /* synthetic */ void x\u043e\u0445\u0430(int n, int n2) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if (this.eh\u043eo || this.e\u0456\u0440\u0455\u0430 == null) {
            return;
        }
        class_4587 class_45872 = new class_4587();
        if (this.j\u043eij\u0445 != -1) {
            \u0456icsp\u0430.a_bsm0("setShaderTexture", setShaderTexture(int int ), (int)0, (int)this.j\u043eij\u0445);
            \u0456icsp\u0430.a_bsm1("\u0441\u0441sx", \u0441\u0441sx(net.minecraft.class_4587 double double double double float float double double double double ), (class_4587)class_45872, (double)0.0, (double)0.0, (double)n, (double)n2, (float)0.0f, (float)0.0f, (double)n, (double)n2, (double)n, (double)n2);
        }
        if (!this.j\u0445\u0440jo\u0456\u0456 && this.\u043e\u0440o\u0430\u043ej.\u0430\u0456shhpx((-399604488 + 399605488) / this.\u0456\u0430\u0440o, true)) {
            this.pe\u0430();
        }
    }

    private /* synthetic */ void pe\u0430() {
        try {
            if (true | false) {
            }
            if (0 != 0) {
            }
            if (this.epi >= \u0456icsp\u0430.a_bsm2("max", max(int int ), (int)0, (int)(this.e\u0456\u0440\u0455\u0430.getLengthInVideoFrames() - 1))) {
                this.epi = 0;
                this.e\u0456\u0440\u0455\u0430.restart();
            }
            this.\u0455\u0458\u0441\u0445 = this.e\u0456\u0440\u0455\u0430.grabImage();
            if (this.\u0455\u0458\u0441\u0445 != null && this.\u0455\u0458\u0441\u0445.image != null) {
                ByteBuffer byteBuffer = (ByteBuffer)this.\u0455\u0458\u0441\u0445.image[0];
                int n = this.\u0455\u0458\u0441\u0445.imageWidth;
                int n2 = this.\u0455\u0458\u0441\u0445.imageHeight;
                if (this.j\u043eij\u0445 == -1 || n != this.\u043ec\u04bbji\u0435\u0440 || n2 != this.\u0456\u0456o\u0458c) {
                    if (this.j\u043eij\u0445 != -1) {
                        \u0456icsp\u0430.a_bsm3("glDeleteTextures", glDeleteTextures(int ), (int)this.j\u043eij\u0445);
                    }
                    this.j\u043eij\u0445 = (int)\u0456icsp\u0430.a_bsm4("glGenTextures", glGenTextures());
                    \u0456icsp\u0430.a_bsm5("glBindTexture", glBindTexture(int int ), (int)(-936974042 + 936977595), (int)this.j\u043eij\u0445);
                    \u0456icsp\u0430.a_bsm6("glTexImage2D", glTexImage2D(int int int int int int int int java.nio.ByteBuffer ), (int)(-119862865 + 119866418), (int)0, (int)(-1401809681 + 1401816088), (int)n, (int)n2, (int)0, (int)(-1106770560 + 1106803552), (int)(-543270253 + 543275374), (ByteBuffer)byteBuffer);
                    \u0456icsp\u0430.a_bsm7("glTexParameteri", glTexParameteri(int int int ), (int)(-1491354815 + 1491358368), (int)(-317858905 + 317869146), (int)(-1853796751 + 1853806480));
                    \u0456icsp\u0430.a_bsm7("glTexParameteri", glTexParameteri(int int int ), (int)(-1655601162 + 1655604715), (int)(-66448564 + 66458804), (int)(-368806559 + 368816288));
                    this.\u043ec\u04bbji\u0435\u0440 = n;
                    this.\u0456\u0456o\u0458c = n2;
                } else {
                    \u0456icsp\u0430.a_bsm5("glBindTexture", glBindTexture(int int ), (int)(-1494181153 + 1494184706), (int)this.j\u043eij\u0445);
                    \u0456icsp\u0430.a_bsm8("glTexSubImage2D", glTexSubImage2D(int int int int int int int int java.nio.ByteBuffer ), (int)(-943663444 + 943666997), (int)0, (int)0, (int)0, (int)n, (int)n2, (int)(-256222717 + 256255709), (int)(-516088223 + 516093344), (ByteBuffer)byteBuffer);
                }
                ++this.epi;
            }
        }
        catch (FrameGrabber.Exception exception) {
            exception.printStackTrace();
        }
    }

    public /* synthetic */ void \u0435o\u0455\u0458\u0445ox() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (this.j\u043eij\u0445 != -1) {
            \u0456icsp\u0430.a_bsm3("glDeleteTextures", glDeleteTextures(int ), (int)this.j\u043eij\u0445);
            this.j\u043eij\u0445 = -1;
        }
        this.\u043ec\u04bbji\u0435\u0440 = -1;
        this.\u0456\u0456o\u0458c = -1;
    }

    public /* synthetic */ void close() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        this.eh\u043eo = true;
        this.\u0435o\u0455\u0458\u0445ox();
        try {
            if (this.e\u0456\u0440\u0455\u0430 != null) {
                this.e\u0456\u0440\u0455\u0430.stop();
                this.e\u0456\u0440\u0455\u0430.release();
                this.e\u0456\u0440\u0455\u0430.close();
            }
        }
        catch (FrameGrabber.Exception exception) {
            // empty catch block
        }
    }

    public /* synthetic */ boolean i\u0440\u0435p() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return this.j\u0445\u0440jo\u0456\u0456;
    }

    public /* synthetic */ boolean h\u0440h\u0440\u0445() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return this.eh\u043eo;
    }

    static {
        avutil.av_log_set_level((int)(-1097865051 + 1097865067));
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

