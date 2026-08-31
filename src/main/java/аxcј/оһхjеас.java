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

public class \u043e\u04bb\u0445j\u0435\u0430\u0441
implements pxs\u0456\u04bbx {
    private final /* synthetic */ String c\u0455\u0458aas;
    private final /* synthetic */ Color c\u0445h\u0441ie\u0440;

    public \u043e\u04bb\u0445j\u0435\u0430\u0441(String string, Color color) {
        if (2 * 2 * 2 >= 0) {
        }
        this.c\u0455\u0458aas = string;
        this.c\u0445h\u0441ie\u0440 = color;
    }

    @Override
    public /* synthetic */ void draw(float f, float f2, float f3, float f4, Font font) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (this.c\u0455\u0458aas == null || this.c\u0455\u0458aas.isEmpty()) {
            return;
        }
        CallSite callSite = \u043e\u04bb\u0445j\u0435\u0430\u0441.a_bsm0("withAlpha", withAlpha(java.awt.Color int ), (Color)this.c\u0445h\u0441ie\u0440, (int)((int)(255.0f * f4)));
        float f5 = f + f2 / 2.0f - \u043e\u04bb\u0445j\u0435\u0430\u0441.a_bsm1("\u0441a\u0441\u0441", \u0441a\u0441\u0441(java.lang.String io.github.humbleui.skija.Font ), (String)this.c\u0455\u0458aas, (Font)font) / 2.0f;
        \u043e\u04bb\u0445j\u0435\u0430\u0441.a_bsm2("\u0456p\u0456xc", \u0456p\u0456xc(java.lang.String float float java.awt.Color io.github.humbleui.skija.Font ), (String)this.c\u0455\u0458aas, (float)f5, (float)f3, (Color)((Object)callSite), (Font)font);
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
}

