/*
 * Decompiled with CFR 0.152.
 */
package \u0445\u0430p\u0440;

import c\u0445is.s\u0456a\u0458;
import ie\u0441\u0430ej.\u0456oc;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_1657;
import net.minecraft.class_1759;
import net.minecraft.class_1799;
import net.minecraft.class_332;
import o\u0455sio\u0440.\u0445\u0458\u0458h\u0445\u0430a;
import \u0440o\u0456\u0445o.\u0445\u0440\u0430\u0435\u0445\u043e;
import \u0445eo.c\u0455pi;
import \u0445eo.\u0456p\u0430\u043e\u0458\u043e;
import \u0445eo.\u0458i\u0456x;
import \u0445\u0430p\u0440.\u0435i\u0445cs\u043ei;

@\u0456p\u0430\u043e\u0458\u043e(sp\u0456p\u0445\u0435="HotBar", a\u0456j\u0430\u0455\u04bb="Custom HotBar HUD", s\u0455cj=\u0458i\u0456x.RENDER)
public class \u0441ij
extends c\u0455pi {
    private /* synthetic */ float ehi\u0455x;
    /* synthetic */ \u0456oc \u043ej\u0458\u0440;

    public \u0441ij() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        this.ehi\u0455x = 0.0f;
        this.\u043ej\u0458\u0440 = new \u0456oc();
    }

    public /* synthetic */ void \u04bbc\u0455\u0435oaj() {
        int n;
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        if (!this.\u0440\u0435\u0455x\u0435xe() || \u0441ij.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 == null) {
            return;
        }
        int n2 = \u0430\u0445j\u0445s\u0456\u04bb.method_22683().method_4486();
        int n3 = \u0430\u0445j\u0445s\u0456\u04bb.method_22683().method_4502();
        float f = (float)n2 / 2.0f - 91.0f;
        float f2 = (float)n3 - 28.0f;
        float f3 = 182.0f;
        float f4 = 22.0f;
        int n4 = n = !((\u0435i\u0445cs\u043ei)((\u0445\u0440\u0430\u0435\u0445\u043e)((Object)\u0441ij.a_bsm0("jaa\u0435\u0445c", jaa\u0435\u0445c()))).\u0430o\u0441\u0456p\u0455().\u0441c\u0458\u043e\u0430(\u0435i\u0445cs\u043ei.class)).\u0458\u0435\u0456\u0430.axpacc() ? -1064231441 + 1064231696 : -750503866 + 750504086;
        if (((\u0435i\u0445cs\u043ei)((\u0445\u0440\u0430\u0435\u0445\u043e)((Object)\u0441ij.a_bsm0("jaa\u0435\u0445c", jaa\u0435\u0445c()))).\u0430o\u0441\u0456p\u0455().\u0441c\u0458\u043e\u0430(\u0435i\u0445cs\u043ei.class)).\u0458\u0435\u0456\u0430.axpacc()) {
            \u0441ij.a_bsm1("hc\u0456", hc\u0456(float float float float float ), (float)f, (float)f2, (float)f3, (float)f4, (float)6.0f);
        }
        \u0441ij.a_bsm2("ip\u0458h\u0445", ip\u0458h\u0445(float float float float float ), (float)f, (float)f2, (float)f3, (float)f4, (float)6.0f);
        \u0441ij.a_bsm4("\u0445a\u0440c\u0445h", \u0445a\u0440c\u0445h(float float float float float java.awt.Color ), (float)f, (float)f2, (float)f3, (float)f4, (float)6.0f, (Color)((Object)\u0441ij.a_bsm3("withAlpha", withAlpha(java.awt.Color int ), (Color)this.h\u0445ph().\u0458ces\u0435\u043ep(), (int)n)));
        int n5 = 0;
        while ((long)n5 < this.\u043ej\u0458\u0440.\u0458\u0430h\u04bb\u0456\u0456\u0440()) {
            this.ehi\u0455x = (float)\u0441ij.a_bsm5("c\u0430\u0435a\u0455\u0455s", c\u0430\u0435a\u0455\u0455s(float float float ), (float)this.ehi\u0455x, (float)(f - 1.0f + (float)(\u0441ij.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7545 * (-837012433 + 837012453))), (float)0.055f);
            ++n5;
        }
        this.\u043ej\u0458\u0440.\u0441\u0458e();
        \u0441ij.a_bsm4("\u0445a\u0440c\u0445h", \u0445a\u0440c\u0445h(float float float float float java.awt.Color ), (float)(this.ehi\u0455x + 1.0f), (float)f2, (float)22.0f, (float)22.0f, (float)6.0f, (Color)((Object)\u0441ij.a_bsm3("withAlpha", withAlpha(java.awt.Color int ), (Color)this.h\u0445ph().i\u0458\u0441\u0435e\u0440\u0440(), (int)(-962372774 + 962373029))));
        class_1799 class_17992 = \u0441ij.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_6079();
        if (!class_17992.method_7960()) {
            float f5 = f - 28.0f;
            float f6 = f2;
            \u0441ij.a_bsm1("hc\u0456", hc\u0456(float float float float float ), (float)f5, (float)f6, (float)22.0f, (float)22.0f, (float)6.0f);
            \u0441ij.a_bsm2("ip\u0458h\u0445", ip\u0458h\u0445(float float float float float ), (float)f5, (float)f6, (float)22.0f, (float)22.0f, (float)6.0f);
            \u0441ij.a_bsm4("\u0445a\u0440c\u0445h", \u0445a\u0440c\u0445h(float float float float float java.awt.Color ), (float)f5, (float)f6, (float)22.0f, (float)22.0f, (float)6.0f, (Color)((Object)\u0441ij.a_bsm3("withAlpha", withAlpha(java.awt.Color int ), (Color)this.h\u0445ph().\u0458ces\u0435\u043ep(), (int)n)));
        }
        class_1799 class_17993 = class_1799.field_8037;
        for (int i = 0; i < \u0441ij.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().method_5439(); ++i) {
            class_1799 class_17994 = \u0441ij.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().method_5438(i);
            if (!(class_17994.method_7909() instanceof class_1759)) continue;
            class_17993 = class_17994;
            break;
        }
        if (!class_17993.method_7960()) {
            float f7 = f + 182.0f + 6.0f;
            float f8 = f2;
            \u0441ij.a_bsm1("hc\u0456", hc\u0456(float float float float float ), (float)f7, (float)f8, (float)22.0f, (float)22.0f, (float)6.0f);
            \u0441ij.a_bsm2("ip\u0458h\u0445", ip\u0458h\u0445(float float float float float ), (float)f7, (float)f8, (float)22.0f, (float)22.0f, (float)6.0f);
            \u0441ij.a_bsm4("\u0445a\u0440c\u0445h", \u0445a\u0440c\u0445h(float float float float float java.awt.Color ), (float)f7, (float)f8, (float)22.0f, (float)22.0f, (float)6.0f, (Color)((Object)\u0441ij.a_bsm3("withAlpha", withAlpha(java.awt.Color int ), (Color)this.h\u0445ph().\u0458ces\u0435\u043ep(), (int)n)));
        }
    }

    @\u0445\u0458\u0458h\u0445\u0430a(\u0435o\u0435x\u0445s=0)
    public void aj\u043e\u0441\u0455\u0445(s\u0456a\u0458 s\u0456a\u04582) {
        float f;
        float f2;
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (!this.\u0440\u0435\u0455x\u0435xe() || \u0441ij.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 == null) {
            return;
        }
        class_332 class_3322 = s\u0456a\u04582.i\u0458\u0456s();
        int n = \u0430\u0445j\u0445s\u0456\u04bb.method_22683().method_4486();
        int n2 = \u0430\u0445j\u0445s\u0456\u04bb.method_22683().method_4502();
        float f3 = (float)n / 2.0f - 91.0f;
        float f4 = (float)n2 - 28.0f;
        int n3 = 0;
        while ((long)n3 < this.\u043ej\u0458\u0440.\u0458\u0430h\u04bb\u0456\u0456\u0440()) {
            this.ehi\u0455x = (float)\u0441ij.a_bsm5("c\u0430\u0435a\u0455\u0455s", c\u0430\u0435a\u0455\u0455s(float float float ), (float)this.ehi\u0455x, (float)(f3 - 1.0f + (float)(\u0441ij.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7545 * (-1492652121 + 1492652141))), (float)0.055f);
            ++n3;
        }
        this.\u043ej\u0458\u0440.\u0441\u0458e();
        for (n3 = 0; n3 < -2063972563 + 2063972572; ++n3) {
            f2 = f3 + 3.0f + (float)(n3 * (-738916192 + 738916212));
            f = f4 + 3.0f;
            this.\u0435\u0435sp\u0445\u0458\u0455(class_3322, (class_1657)\u0441ij.\u0430\u0445j\u0445s\u0456\u04bb.field_1724, n3, f2, f);
        }
        class_1799 class_17992 = \u0441ij.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_6079();
        if (!class_17992.method_7960()) {
            f2 = f3 - 28.0f;
            f = f4;
            class_3322.method_51427(class_17992, (int)f2 + 3, (int)f + 3);
            class_3322.method_51431(\u0441ij.\u0430\u0445j\u0445s\u0456\u04bb.field_1772, class_17992, (int)f2 + 3, (int)f + 3);
        }
        class_1799 class_17993 = class_1799.field_8037;
        for (int i = 0; i < \u0441ij.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().method_5439(); ++i) {
            class_1799 class_17994 = \u0441ij.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().method_5438(i);
            if (!(class_17994.method_7909() instanceof class_1759)) continue;
            class_17993 = class_17994;
            break;
        }
        if (!class_17993.method_7960()) {
            float f5 = f3 + 182.0f + 6.0f;
            float f6 = f4;
            class_3322.method_51427(class_17993, (int)f5 + 3, (int)f6 + 3);
            class_3322.method_51431(\u0441ij.\u0430\u0445j\u0445s\u0456\u04bb.field_1772, class_17993, (int)f5 + 3, (int)f6 + 3);
        }
    }

    private /* synthetic */ void \u0435\u0435sp\u0445\u0458\u0455(class_332 class_3322, class_1657 class_16572, int n, float f, float f2) {
        class_1799 class_17992;
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if (!(class_17992 = class_16572.method_31548().method_5438(n)).method_7960()) {
            class_3322.method_51427(class_17992, (int)f, (int)f2);
            class_3322.method_51431(\u0441ij.\u0430\u0445j\u0445s\u0456\u04bb.field_1772, class_17992, (int)f, (int)f2);
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
}

