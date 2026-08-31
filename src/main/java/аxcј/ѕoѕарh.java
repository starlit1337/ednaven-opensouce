/*
 * Decompiled with CFR 0.152.
 */
package \u0430xc\u0458;

import io.github.humbleui.skija.Font;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import \u0441\u0430e\u043e.pxs\u0456\u04bbx;

public class \u0455o\u0455\u0430\u0440h
implements pxs\u0456\u04bbx {
    private final /* synthetic */ String x\u0441hahoo;
    private final /* synthetic */ String xh\u04bbp\u0440\u0430;
    private final /* synthetic */ Color s\u0441a\u0456jj\u0440;

    public \u0455o\u0455\u0430\u0440h(String string, String string2, Color color) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        this.x\u0441hahoo = string;
        this.xh\u04bbp\u0440\u0430 = string2;
        this.s\u0441a\u0456jj\u0440 = color;
    }

    @Override
    public /* synthetic */ void draw(float f, float f2, float f3, float f4, Font font) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        if (this.x\u0441hahoo == null || this.x\u0441hahoo.isEmpty() || this.xh\u04bbp\u0440\u0430 == null || this.xh\u04bbp\u0440\u0430.isEmpty()) {
            return;
        }
        CallSite callSite = \u0455o\u0455\u0430\u0440h.a_bsm0("\u0458haa\u0455\u0445", \u0458haa\u0455\u0445(float ), (float)8.0f);
        CallSite callSite2 = \u0455o\u0455\u0430\u0440h.a_bsm1("h\u0441eh", h\u0441eh(float ), (float)6.0f);
        CallSite callSite3 = \u0455o\u0455\u0430\u0440h.a_bsm2("withAlpha", withAlpha(java.awt.Color int ), (Color)this.s\u0441a\u0456jj\u0440, (int)((int)(255.0f * f4)));
        float f5 = f + f2 / 2.0f - \u0455o\u0455\u0430\u0440h.a_bsm3("\u0441a\u0441\u0441", \u0441a\u0441\u0441(java.lang.String io.github.humbleui.skija.Font ), (String)this.x\u0441hahoo, (Font)callSite) / 2.0f;
        float f6 = f + f2 / 2.0f - \u0455o\u0455\u0430\u0440h.a_bsm3("\u0441a\u0441\u0441", \u0441a\u0441\u0441(java.lang.String io.github.humbleui.skija.Font ), (String)this.xh\u04bbp\u0440\u0430, (Font)callSite2) / 2.0f;
        \u0455o\u0455\u0430\u0440h.a_bsm4("\u0456p\u0456xc", \u0456p\u0456xc(java.lang.String float float java.awt.Color io.github.humbleui.skija.Font ), (String)this.x\u0441hahoo, (float)f5, (float)(f3 - 3.0f), (Color)((Object)callSite3), (Font)callSite);
        \u0455o\u0455\u0430\u0440h.a_bsm4("\u0456p\u0456xc", \u0456p\u0456xc(java.lang.String float float java.awt.Color io.github.humbleui.skija.Font ), (String)this.xh\u04bbp\u0440\u0430, (float)f6, (float)(f3 + 6.0f), (Color)((Object)callSite3), (Font)callSite2);
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

