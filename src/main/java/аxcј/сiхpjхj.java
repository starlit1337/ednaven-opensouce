/*
 * Decompiled with CFR 0.152.
 */
package \u0430xc\u0458;

import io.github.humbleui.skija.ClipMode;
import io.github.humbleui.skija.Font;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import \u0441\u0430e\u043e.pxs\u0456\u04bbx;

public class \u0441i\u0445pj\u0445j
implements pxs\u0456\u04bbx {
    private final /* synthetic */ float \u0458\u0455\u04bb;
    private final /* synthetic */ Color h\u04bbx\u043e;

    public \u0441i\u0445pj\u0445j(float f, Color color) {
        if (2 * 2 * 2 >= 0) {
        }
        this.\u0458\u0455\u04bb = f;
        this.h\u04bbx\u043e = color;
    }

    @Override
    public /* synthetic */ void draw(float f, float f2, float f3, float f4, Font font) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        CallSite callSite = \u0441i\u0445pj\u0445j.a_bsm0("withAlpha", withAlpha(java.awt.Color int ), (Color)this.h\u04bbx\u043e, (int)((int)(255.0f * f4)));
        CallSite callSite2 = \u0441i\u0445pj\u0445j.a_bsm2("\u0441a\u0441\u0441", \u0441a\u0441\u0441(java.lang.String io.github.humbleui.skija.Font ), (String)((Object)\u0441i\u0445pj\u0445j.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-268133793 + 268133841, -37624589 + 37624667}, (int)(-2008683492 + 798018490), (int)(-1740122625 + 238342268))), (Font)font);
        CallSite callSite3 = \u0441i\u0445pj\u0445j.a_bsm2("\u0441a\u0441\u0441", \u0441a\u0441\u0441(java.lang.String io.github.humbleui.skija.Font ), (String)((Object)\u0441i\u0445pj\u0445j.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1422010924 + 1422010889, -1062516039 + 1062515952, -2119103023 + 2119103085, -181155802 + 181155740, -1948953909 + 1948953925}, (int)(-499668869 + 864120125), (int)(1649872760 + 1442687196))), (Font)font);
        reference var9_9 = callSite2 + callSite3 * this.\u0458\u0455\u04bb;
        float f5 = f + f2 / 2.0f - var9_9 / 2.0f;
        \u0441i\u0445pj\u0445j.a_bsm3("\u0456p\u0456xc", \u0456p\u0456xc(java.lang.String float float java.awt.Color io.github.humbleui.skija.Font ), (String)((Object)\u0441i\u0445pj\u0445j.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1197314139 + 1197314125, -330526193 + 330526090}, (int)(-546519236 + 1436118473), (int)(822669269 + 1276087618))), (float)f5, (float)f3, (Color)((Object)callSite), (Font)font);
        if (this.\u0458\u0455\u04bb > 0.001f) {
            \u0441i\u0445pj\u0445j.a_bsm4("\u0441sp", \u0441sp());
            \u0441i\u0445pj\u0445j.a_bsm5("o\u043e\u0441", o\u043e\u0441(float float float float float io.github.humbleui.skija.ClipMode ), (float)(f5 + callSite2), (float)(f3 - 20.0f), (float)(callSite3 * this.\u0458\u0455\u04bb), (float)40.0f, (float)0.0f, (ClipMode)ClipMode.INTERSECT);
            float f6 = f5 + callSite2 + (this.\u0458\u0455\u04bb * callSite3 - callSite3);
            \u0441i\u0445pj\u0445j.a_bsm3("\u0456p\u0456xc", \u0456p\u0456xc(java.lang.String float float java.awt.Color io.github.humbleui.skija.Font ), (String)((Object)\u0441i\u0445pj\u0445j.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-647746655 + 647746528, -664820021 + 664820037, -356370782 + 356370733, -1491233358 + 1491233230, -714304917 + 714304960}, (int)(-729868384 + 1020131756), (int)(1554110972 + 271618773))), (float)f6, (float)f3, (Color)((Object)callSite), (Font)font);
            \u0441i\u0445pj\u0445j.a_bsm6("jj\u0430c\u04bb\u0455\u0455", jj\u0430c\u04bb\u0455\u0455());
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
}

