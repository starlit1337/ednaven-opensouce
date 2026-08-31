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

public class ih\u0430aa
extends \u0430\u0430p\u043e {
    private final /* synthetic */ String xpc\u0445o\u0430e;
    private final /* synthetic */ Consumer<\u0430\u0430p\u043e> ia\u0435ie;
    private /* synthetic */ String \u0430i\u0456;

    public ih\u0430aa(\u0441a\u0458p \u0441a\u0458p2, String string, String string2, Consumer<\u0430\u0430p\u043e> consumer, Supplier<Boolean> supplier) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        super(\u0441a\u0458p2, string, supplier);
        this.ia\u0435ie = consumer;
        this.xpc\u0445o\u0430e = string2;
        this.\u0430i\u0456 = string2;
    }

    @Override
    public /* synthetic */ \u0456\u0445ss getValueType() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return \u0456\u0445ss.a\u0435x;
    }

    @Override
    public /* synthetic */ ih\u0430aa getStringValue() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return this;
    }

    public /* synthetic */ void a\u0435op\u0458c(String string) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        this.\u0430i\u0456 = string;
        if (this.ia\u0435ie != null) {
            this.ia\u0435ie.accept(this);
        }
    }

    public /* synthetic */ String \u0440\u043e\u0455\u0430i() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return this.xpc\u0445o\u0430e;
    }

    public /* synthetic */ Consumer<\u0430\u0430p\u043e> c\u0458j() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return this.ia\u0435ie;
    }

    public /* synthetic */ String axpacc() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return this.\u0430i\u0456;
    }

    static {
        C1a946c5246ca0949bfd0e13d.m_4487bf5f5bb3efe5("decrypt", "windows-x64", "vm-diverse");
    }
}

