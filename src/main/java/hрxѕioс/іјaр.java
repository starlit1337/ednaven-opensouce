/*
 * Decompiled with CFR 0.152.
 */
package h\u0440x\u0455io\u0441;

import h\u0440x\u0455io\u0441.xcs\u0440ixh;
import i\u0445s\u0458\u0440j.aix\u0445;
import i\u0445s\u0458\u0440j.a\u0458s;
import i\u0445s\u0458\u0440j.icps\u04bbej;
import i\u0445s\u0458\u0440j.ii\u0456\u0440e;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.HashMap;
import java.util.Map;
import \u0430\u04bb\u0430.hi\u0440\u04bbas\u0435;
import \u0430\u04bb\u0430.\u0435\u0440oc\u0455;
import \u0440o\u0456\u0445o.\u0445\u0440\u0430\u0435\u0445\u043e;
import \u0441\u0445o.\u0458op\u0430\u0441;

public class \u0456\u0458a\u0440 {
    private final /* synthetic */ Map<Class<xcs\u0440ixh>, xcs\u0440ixh> ai\u0441ss;

    public \u0456\u0458a\u0440() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        this.ai\u0441ss = new HashMap<Class<xcs\u0440ixh>, xcs\u0440ixh>();
    }

    public /* synthetic */ void c\u0445\u04bbx() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        this.e\u0435\u043ee(new aix\u0445());
        this.e\u0435\u043ee(new \u0458op\u0430\u0441());
        this.e\u0435\u043ee(new icps\u04bbej());
        this.e\u0435\u043ee(new hi\u0440\u04bbas\u0435());
        this.e\u0435\u043ee(new \u0435\u0440oc\u0455());
        this.e\u0435\u043ee(new ii\u0456\u0440e());
        this.e\u0435\u043ee(new a\u0458s());
        this.ai\u0441ss.forEach((clazz, xcs\u0440ixh2) -> {
            if (2 * 2 * 2 >= 0) {
            }
            ((\u0445\u0440\u0430\u0435\u0445\u043e)((Object)\u0456\u0458a\u0440.a_bsm0("jaa\u0435\u0445c", jaa\u0435\u0445c()))).\u0458poi\u0440().\u0441\u0430\u0456(xcs\u0440ixh2);
        });
        this.ai\u0441ss.forEach((clazz, xcs\u0440ixh2) -> {
            if (2 * 2 * 2 >= 0) {
            }
            xcs\u0440ixh2.hocii\u0435h();
        });
    }

    public /* synthetic */ void e\u0435\u043ee(xcs\u0440ixh xcs\u0440ixh2) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        this.ai\u0441ss.put(xcs\u0440ixh2.getClass(), xcs\u0440ixh2);
    }

    public /* synthetic */ <T extends xcs\u0440ixh> T \u04bb\u0441c\u0435(Class<T> clazz) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return (T)this.ai\u0441ss.get(clazz);
    }

    private static /* synthetic */ CallSite a_bsm0(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }
}

