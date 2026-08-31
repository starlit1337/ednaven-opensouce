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

public class e\u043e\u0456\u0458\u043e\u0430\u04bb
implements pxs\u0456\u04bbx {
    private final /* synthetic */ String \u043e\u0430oh\u0430\u04bb;
    private final /* synthetic */ String jhh\u04bb;
    private final /* synthetic */ Color h\u04bb\u0458\u0445;

    public e\u043e\u0456\u0458\u043e\u0430\u04bb(String string, String string2, Color color) {
        if (2 * 2 * 2 >= 0) {
        }
        this.\u043e\u0430oh\u0430\u04bb = string;
        this.jhh\u04bb = string2;
        this.h\u04bb\u0458\u0445 = color;
    }

    @Override
    public /* synthetic */ void draw(float f, float f2, float f3, float f4, Font font) {
        boolean bl;
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (this.\u043e\u0430oh\u0430\u04bb == null || this.\u043e\u0430oh\u0430\u04bb.isEmpty()) {
            return;
        }
        CallSite callSite = e\u043e\u0456\u0458\u043e\u0430\u04bb.a_bsm0("withAlpha", withAlpha(java.awt.Color int ), (Color)this.h\u04bb\u0458\u0445, (int)((int)(255.0f * f4)));
        float f5 = f + f2 / 2.0f;
        boolean bl2 = bl = this.jhh\u04bb != null && !this.jhh\u04bb.isEmpty();
        if (bl) {
            CallSite callSite2 = e\u043e\u0456\u0458\u043e\u0430\u04bb.a_bsm1("\u0458\u0435a", \u0458\u0435a(float ), (float)8.0f);
            CallSite callSite3 = e\u043e\u0456\u0458\u043e\u0430\u04bb.a_bsm1("\u0458\u0435a", \u0458\u0435a(float ), (float)6.0f);
            float f6 = f5 - e\u043e\u0456\u0458\u043e\u0430\u04bb.a_bsm2("\u0441a\u0441\u0441", \u0441a\u0441\u0441(java.lang.String io.github.humbleui.skija.Font ), (String)this.\u043e\u0430oh\u0430\u04bb, (Font)callSite2) / 2.0f;
            float f7 = f5 - e\u043e\u0456\u0458\u043e\u0430\u04bb.a_bsm2("\u0441a\u0441\u0441", \u0441a\u0441\u0441(java.lang.String io.github.humbleui.skija.Font ), (String)this.jhh\u04bb, (Font)callSite3) / 2.0f;
            e\u043e\u0456\u0458\u043e\u0430\u04bb.a_bsm3("\u0456p\u0456xc", \u0456p\u0456xc(java.lang.String float float java.awt.Color io.github.humbleui.skija.Font ), (String)this.\u043e\u0430oh\u0430\u04bb, (float)f6, (float)(f3 - 3.0f), (Color)((Object)callSite), (Font)callSite2);
            e\u043e\u0456\u0458\u043e\u0430\u04bb.a_bsm3("\u0456p\u0456xc", \u0456p\u0456xc(java.lang.String float float java.awt.Color io.github.humbleui.skija.Font ), (String)this.jhh\u04bb, (float)f7, (float)(f3 + 6.0f), (Color)((Object)callSite), (Font)callSite3);
        } else {
            CallSite callSite4 = e\u043e\u0456\u0458\u043e\u0430\u04bb.a_bsm1("\u0458\u0435a", \u0458\u0435a(float ), (float)10.0f);
            float f8 = f + f2 / 2.0f - e\u043e\u0456\u0458\u043e\u0430\u04bb.a_bsm2("\u0441a\u0441\u0441", \u0441a\u0441\u0441(java.lang.String io.github.humbleui.skija.Font ), (String)this.\u043e\u0430oh\u0430\u04bb, (Font)callSite4) / 2.0f;
            e\u043e\u0456\u0458\u043e\u0430\u04bb.a_bsm3("\u0456p\u0456xc", \u0456p\u0456xc(java.lang.String float float java.awt.Color io.github.humbleui.skija.Font ), (String)this.\u043e\u0430oh\u0430\u04bb, (float)f8, (float)(f3 - 1.0f), (Color)((Object)callSite), (Font)callSite4);
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
}

