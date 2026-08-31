/*
 * Decompiled with CFR 0.152.
 */
package spso;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.function.Supplier;
import spso.\u0441a\u0458p;
import spso.\u0456\u0445ss;
import \u0430\u0456j\u0435x.sx\u0445\u043e;
import \u0435xp.h\u04bb\u0455hpa;
import \u0435xp.ih\u0430aa;
import \u0435xp.o\u043ea\u0456c;
import \u0435xp.\u043ea\u0441\u0430p;
import \u0440o\u0456\u0445o.\u0445\u0440\u0430\u0435\u0445\u043e;

public abstract class \u0430\u0430p\u043e {
    private final /* synthetic */ \u0441a\u0458p a\u0440\u0440\u0430;
    private final /* synthetic */ String \u0456\u0458\u0456\u0455\u0440j;
    private final /* synthetic */ Supplier<Boolean> e\u0441\u0456\u0456ox\u0458;

    protected \u0430\u0430p\u043e(\u0441a\u0458p \u0441a\u0458p2, String string, Supplier<Boolean> supplier) {
        if (true | false) {
        }
        this.a\u0440\u0440\u0430 = \u0441a\u0458p2;
        this.\u0456\u0458\u0456\u0455\u0440j = string;
        this.e\u0441\u0456\u0456ox\u0458 = supplier;
        ((\u0445\u0440\u0430\u0435\u0445\u043e)((Object)\u0430\u0430p\u043e.a_bsm0("jaa\u0435\u0445c", jaa\u0435\u0445c()))).\u0445sxe().c\u0455ecxh(this);
    }

    public abstract /* synthetic */ \u0456\u0445ss getValueType();

    public /* synthetic */ h\u04bb\u0455hpa getBooleanValue() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        throw new sx\u0445\u043e();
    }

    public /* synthetic */ \u043ea\u0441\u0430p getFloatValue() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        throw new sx\u0445\u043e();
    }

    public /* synthetic */ ih\u0430aa getStringValue() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        throw new sx\u0445\u043e();
    }

    public /* synthetic */ o\u043ea\u0456c getModeValue() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        throw new sx\u0445\u043e();
    }

    public /* synthetic */ boolean s\u0440\u0445x\u0440i\u0445() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return this.e\u0441\u0456\u0456ox\u0458 == null || this.e\u0441\u0456\u0456ox\u0458.get() != false;
    }

    public /* synthetic */ \u0441a\u0458p x\u04bb\u043e\u04bb\u0456x() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return this.a\u0440\u0440\u0430;
    }

    public /* synthetic */ String getName() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return this.\u0456\u0458\u0456\u0455\u0440j;
    }

    public /* synthetic */ Supplier<Boolean> hxej\u0458xa() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return this.e\u0441\u0456\u0456ox\u0458;
    }

    private static /* synthetic */ CallSite a_bsm0(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }
}

