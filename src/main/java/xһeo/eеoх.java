/*
 * Decompiled with CFR 0.152.
 */
package x\u04bbeo;

import java.awt.Color;
import java.util.Set;
import net.minecraft.class_1297;
import r.d3.C1a946c5246ca0949bfd0e13d;
import \u0441\u0440ixoh.\u0441\u0445jc\u043ejo;

public class e\u0435o\u0445
implements \u0441\u0445jc\u043ejo {
    private final /* synthetic */ Color \u0458\u0458\u043e\u0435\u0435\u043e;
    private final /* synthetic */ Set<Class<?>> o\u04bb\u0445;

    public e\u0435o\u0445(Set<Class<?>> set) {
        if (true | false) {
        }
        this(set, new Color(-1020011161 + 1020011416, -1609779472 + 1609779727, -470534591 + 470534846));
    }

    public e\u0435o\u0445(Set<Class<?>> set, Color color) {
        if (2 * 2 * 2 >= 0) {
        }
        this.o\u04bb\u0445 = set;
        this.\u0458\u0458\u043e\u0435\u0435\u043e = color;
    }

    @Override
    public /* synthetic */ Color getColor(Object object) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return this.\u0458\u0458\u043e\u0435\u0435\u043e;
    }

    @Override
    public /* synthetic */ boolean isTargetEntity(class_1297 class_12972) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        for (Class<?> clazz : this.o\u04bb\u0445) {
            if (!clazz.isInstance(class_12972)) continue;
            return true;
        }
        return false;
    }

    static {
        C1a946c5246ca0949bfd0e13d.m_4487bf5f5bb3efe5("decrypt", "windows-x64", "vm-diverse");
    }
}

