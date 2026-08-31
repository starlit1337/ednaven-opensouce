/*
 * Decompiled with CFR 0.152.
 */
package \u0435xp;

import java.util.function.Consumer;
import java.util.function.Supplier;
import r.d3.C1a946c5246ca0949bfd0e13d;
import spso.\u0430\u0430p\u043e;
import spso.\u0441a\u0458p;
import spso.\u0456\u0445ss;

public class o\u043ea\u0456c
extends \u0430\u0430p\u043e {
    private final /* synthetic */ String[] ex\u0455\u0456\u0455\u0430;
    private final /* synthetic */ Consumer<\u0430\u0430p\u043e> aooips;
    private /* synthetic */ int ip\u0440;

    public o\u043ea\u0456c(\u0441a\u0458p \u0441a\u0458p2, String string, String[] stringArray, int n, Consumer<\u0430\u0430p\u043e> consumer, Supplier<Boolean> supplier) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        super(\u0441a\u0458p2, string, supplier);
        this.aooips = consumer;
        this.ex\u0455\u0456\u0455\u0430 = stringArray;
        this.ip\u0440 = n;
    }

    public /* synthetic */ boolean cip(String string) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return this.cc\u0445\u0458\u0458().equalsIgnoreCase(string);
    }

    @Override
    public /* synthetic */ \u0456\u0445ss getValueType() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return \u0456\u0445ss.\u043e\u04bb\u0440\u0430i\u0435;
    }

    @Override
    public /* synthetic */ o\u043ea\u0456c getModeValue() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return this;
    }

    public /* synthetic */ String cc\u0445\u0458\u0458() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return this.ex\u0455\u0456\u0455\u0430[this.ip\u0440];
    }

    public /* synthetic */ void \u0430e\u04bbo\u0435\u0430i(int n) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        this.ip\u0440 = n;
        if (this.aooips != null) {
            this.aooips.accept(this);
        }
    }

    public /* synthetic */ String[] \u0440h\u0440\u0441() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return this.ex\u0455\u0456\u0455\u0430;
    }

    public /* synthetic */ Consumer<\u0430\u0430p\u043e> c\u0458j() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return this.aooips;
    }

    public /* synthetic */ int axpacc() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return this.ip\u0440;
    }

    static {
        C1a946c5246ca0949bfd0e13d.m_4487bf5f5bb3efe5("decrypt", "windows-x64", "vm-diverse");
    }
}

