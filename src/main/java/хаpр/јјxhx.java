/*
 * Decompiled with CFR 0.152.
 */
package \u0445\u0430p\u0440;

import c\u0445is.x\u0458sc;
import io.github.humbleui.skija.Paint;
import io.github.humbleui.skija.PaintMode;
import io.github.humbleui.skija.PaintStrokeCap;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Calendar;
import o\u0455sio\u0440.\u0445\u0458\u0458h\u0445\u0430a;
import x\u0455\u0435\u043e\u0441\u0458\u043e.sxps;
import \u0440o\u0456\u0445o.\u0445\u0440\u0430\u0435\u0445\u043e;
import \u0445eo.c\u0455pi;
import \u0445eo.\u0456p\u0430\u043e\u0458\u043e;
import \u0445eo.\u0458i\u0456x;
import \u0458x\u0458\u0435ah\u04bb.\u0455\u0456\u0440e;

@\u0456p\u0430\u043e\u0458\u043e(sp\u0456p\u0445\u0435="AnalogClock", a\u0456j\u0430\u0455\u04bb="Pixel styles", s\u0455cj=\u0458i\u0456x.RENDER)
public class \u0458\u0458xhx
extends c\u0455pi {
    private final /* synthetic */ \u0455\u0456\u0440e j\u0435j\u043ec\u04bb;

    public \u0458\u0458xhx() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        byte[] byArray = new byte[-324065307 + 324065318];
        byArray[0] = -1595324962 + 1595324879;
        byArray[1] = -877141080 + 877141143;
        byArray[2] = -434305810 + 434305899;
        byArray[3] = -997406588 + 997406704;
        byArray[4] = -1768640774 + 1768640897;
        byArray[5] = -2083870000 + 2083870101;
        byArray[-811207834 + 811207840] = -931412655 + 931412603;
        byArray[-969373230 + 969373237] = -1148907268 + 1148907266;
        byArray[-1193618636 + 1193618644] = -412226813 + 412226831;
        byArray[-1865953611 + 1865953620] = -607535070 + 607535095;
        byArray[-1508969627 + 1508969637] = -1043279791 + 1043279857;
        this.j\u0435j\u043ec\u04bb = ((\u0445\u0440\u0430\u0435\u0445\u043e)((Object)\u0458\u0458xhx.a_bsm0("jaa\u0435\u0445c", jaa\u0435\u0445c()))).\u043e\u0435s\u043ee(this, (String)((Object)\u0458\u0458xhx.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-2126135820 + 482598933), (int)(437966216 + 1195871193))), (float)\u0430\u0445j\u0445s\u0456\u04bb.method_22683().method_4486() / 2.0f + 50.0f, (float)\u0430\u0445j\u0445s\u0456\u04bb.method_22683().method_4502() / 2.0f + 50.0f);
    }

    @\u0445\u0458\u0458h\u0445\u0430a
    public void \u0440\u0440\u0458\u0456(x\u0458sc x\u0458sc2) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        float f = this.j\u0435j\u043ec\u04bb.\u0456s\u0455\u043e\u0430\u0441();
        float f2 = this.j\u0435j\u043ec\u04bb.o\u0440xj();
        float f3 = 100.0f;
        float f4 = 100.0f;
        sxps.p\u0430j\u0440e.\u0456a\u0458\u0441\u0430(f, f2, f3, f4, this.h\u0445ph().\u04bbha());
        CallSite callSite = \u0458\u0458xhx.a_bsm2("getInstance", getInstance());
        int n = ((Calendar)((Object)callSite)).get(-751240731 + 751240741);
        int n2 = ((Calendar)((Object)callSite)).get(-632810656 + 632810668);
        int n3 = ((Calendar)((Object)callSite)).get(-1327805731 + 1327805744);
        float f5 = f + f3 / 2.0f;
        float f6 = f2 + f4 / 2.0f;
        CallSite callSite2 = \u0458\u0458xhx.a_bsm3("x\u0441\u0441", x\u0441\u0441());
        Color color = this.h\u0445ph().\u04bb\u0455x\u04bb();
        Color color2 = this.h\u0445ph().aj\u0445\u043e();
        float f7 = this.a\u043e\u043e\u04bbx((float)n2 * 6.0f);
        float f8 = f3 * 0.32f - 6.0f;
        Paint paint = new Paint();
        paint.setColor(color.getRGB());
        paint.setMode(PaintMode.STROKE);
        paint.setStrokeWidth(8.0f);
        paint.setStrokeCap(PaintStrokeCap.ROUND);
        callSite2.drawLine(f5, f6, f5 + (float)\u0458\u0458xhx.a_bsm4("cos", cos(double ), (double)f7) * f8, f6 + (float)\u0458\u0458xhx.a_bsm5("sin", sin(double ), (double)f7) * f8, paint);
        paint.close();
        float f9 = this.a\u043e\u043e\u04bbx((float)n * 30.0f + (float)n2 * 0.5f);
        float f10 = f3 * 0.2f;
        Paint paint2 = new Paint();
        int n4 = -990743953 + 990744144;
        Color color3 = new Color(color.getRed(), color.getGreen(), color.getBlue(), n4);
        paint2.setColor(color3.getRGB());
        paint2.setMode(PaintMode.STROKE);
        paint2.setStrokeWidth(8.0f);
        paint2.setStrokeCap(PaintStrokeCap.ROUND);
        callSite2.drawLine(f5, f6, f5 + (float)\u0458\u0458xhx.a_bsm4("cos", cos(double ), (double)f9) * f10, f6 + (float)\u0458\u0458xhx.a_bsm5("sin", sin(double ), (double)f9) * f10, paint2);
        paint2.close();
        float f11 = this.a\u043e\u043e\u04bbx((float)n3 * 6.0f);
        float f12 = f4 * 0.36f;
        Paint paint3 = new Paint();
        paint3.setColor(color2.getRGB());
        paint3.setMode(PaintMode.FILL);
        callSite2.drawCircle(f5 + (float)\u0458\u0458xhx.a_bsm4("cos", cos(double ), (double)f11) * f12, f6 + (float)\u0458\u0458xhx.a_bsm5("sin", sin(double ), (double)f11) * f12, 5.0f, paint3);
        paint3.close();
        this.j\u0435j\u043ec\u04bb.\u0458ae(f3);
        this.j\u0435j\u043ec\u04bb.e\u0440e\u0456\u0456o\u0458(f4);
    }

    private /* synthetic */ float a\u043e\u043e\u04bbx(float f) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return (float)((double)(f - 90.0f) * (Math.PI / 180));
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

