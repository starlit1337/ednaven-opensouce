/*
 * Decompiled with CFR 0.152.
 */
package ie\u0441\u0430ej;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_310;
import r.d3.C1a946c5246ca0949bfd0e13d;
import \u0435\u0435oj\u0455\u0435.xe\u0441e;
import \u0435\u0435oj\u0455\u0435.\u0430j\u0435js;
import \u0440o\u0456\u0445o.\u0445\u0440\u0430\u0435\u0445\u043e;

public interface pjxx {
    public static final class_310 \u0430\u0445j\u0445s\u0456\u04bb;
    public static final List<Runnable> s\u0430\u04bb\u0458;

    default public \u0430j\u0435js \u0456\u0440\u0430jj() {
        return \u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0456p\u0458;
    }

    default public xe\u0441e h\u0445ph() {
        return this.\u0456\u0440\u0430jj().\u0441ih();
    }

    static {
        C1a946c5246ca0949bfd0e13d.m_4487bf5f5bb3efe5("decrypt", "windows-x64", "vm-diverse");
        \u0430\u0445j\u0445s\u0456\u04bb = class_310.method_1551();
        s\u0430\u04bb\u0458 = new ArrayList<Runnable>();
    }
}

