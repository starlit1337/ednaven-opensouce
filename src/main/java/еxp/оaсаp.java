/*
 * Decompiled with CFR 0.152.
 */
package \u0435xp;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.function.Consumer;
import java.util.function.Supplier;
import spso.\u0430\u0430p\u043e;
import spso.\u0441a\u0458p;
import spso.\u0456\u0445ss;

public class \u043ea\u0441\u0430p
extends \u0430\u0430p\u043e {
    private final /* synthetic */ float \u0435\u0441ee\u0455;
    private final /* synthetic */ float ph\u04bbei;
    private final /* synthetic */ float \u0458s\u0455\u0430\u0430;
    private final /* synthetic */ float \u0435\u0458\u04bb\u0458ao;
    private final /* synthetic */ Consumer<\u0430\u0430p\u043e> \u04bb\u0455\u0441\u0456;
    private /* synthetic */ float \u0455\u0455j;

    public \u043ea\u0441\u0430p(\u0441a\u0458p \u0441a\u0458p2, String string, float f, float f2, float f3, float f4, Consumer<\u0430\u0430p\u043e> consumer, Supplier<Boolean> supplier) {
        if (2 * 2 * 2 >= 0) {
        }
        super(\u0441a\u0458p2, string, supplier);
        this.\u04bb\u0455\u0441\u0456 = consumer;
        this.\u0455\u0455j = this.\u0435\u0441ee\u0455 = f;
        this.ph\u04bbei = f2;
        this.\u0458s\u0455\u0430\u0430 = f3;
        this.\u0435\u0458\u04bb\u0458ao = f4;
    }

    @Override
    public /* synthetic */ \u0456\u0445ss getValueType() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return \u0456\u0445ss.\u0455\u0440\u0440;
    }

    @Override
    public /* synthetic */ \u043ea\u0441\u0430p getFloatValue() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return this;
    }

    public /* synthetic */ void hh\u0455j\u0456\u0430(float f) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        this.\u0455\u0455j = (float)\u043ea\u0441\u0430p.a_bsm0("\u0435\u0430\u0440\u04bbae", \u0435\u0430\u0440\u04bbae(float float float ), (float)f, (float)this.ph\u04bbei, (float)this.\u0458s\u0455\u0430\u0430);
        if (this.\u04bb\u0455\u0441\u0456 != null) {
            this.\u04bb\u0455\u0441\u0456.accept(this);
        }
    }

    public /* synthetic */ float \u0440\u043e\u0455\u0430i() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return this.\u0435\u0441ee\u0455;
    }

    public /* synthetic */ float \u0440o\u0458\u0440() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return this.ph\u04bbei;
    }

    public /* synthetic */ float e\u0440hj() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return this.\u0458s\u0455\u0430\u0430;
    }

    public /* synthetic */ float \u043e\u0430\u0440aj() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return this.\u0435\u0458\u04bb\u0458ao;
    }

    public /* synthetic */ Consumer<\u0430\u0430p\u043e> c\u0458j() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return this.\u04bb\u0455\u0441\u0456;
    }

    public /* synthetic */ float axpacc() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return this.\u0455\u0455j;
    }

    private static /* synthetic */ CallSite a_bsm0(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }
}

