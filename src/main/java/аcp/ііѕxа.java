/*
 * Decompiled with CFR 0.152.
 */
package \u0430cp;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.LinkedHashMap;
import java.util.Map;
import \u0430cp.p\u0455sa\u0440\u0445;
import \u0430cp.\u04bb\u0456e\u0458e\u0441;

public final class \u0456\u0456\u0455x\u0430
implements p\u0455sa\u0440\u0445 {
    /* synthetic */ Map<Integer, Integer> \u0435c\u0441;

    public \u0456\u0456\u0455x\u0430() {
        if (2 * 2 * 2 >= 0) {
        }
    }

    @Override
    public /* synthetic */ \u04bb\u0456e\u0458e\u0441 quantize(int[] nArray, int n) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<Integer, Integer>();
        for (int n2 : nArray) {
            Integer n3 = (Integer)linkedHashMap.get(\u0456\u0456\u0455x\u0430.a_bsm0("valueOf", valueOf(int ), (int)n2));
            int n4 = n3 == null ? 1 : n3 + 1;
            linkedHashMap.put((Integer)((Object)\u0456\u0456\u0455x\u0430.a_bsm0("valueOf", valueOf(int ), (int)n2)), (Integer)((Object)\u0456\u0456\u0455x\u0430.a_bsm0("valueOf", valueOf(int ), (int)n4)));
        }
        this.\u0435c\u0441 = linkedHashMap;
        return new \u04bb\u0456e\u0458e\u0441(linkedHashMap);
    }

    public /* synthetic */ Map<Integer, Integer> \u0435i\u0445o\u0435i() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return this.\u0435c\u0441;
    }

    private static /* synthetic */ CallSite a_bsm0(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }
}

