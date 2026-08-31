/*
 * Decompiled with CFR 0.152.
 */
package \u0430cp;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Map;
import java.util.Set;
import \u0430cp.\u0455o\u0455si\u0441p;
import \u0430cp.\u04bb\u0456e\u0458e\u0441;

public final class c\u0456h\u0455a\u0440h {
    private c\u0456h\u0455a\u0440h() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
    }

    public static /* synthetic */ Map<Integer, Integer> xej\u0458\u0440(int[] nArray, int n) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        \u0455o\u0455si\u0441p \u0455o\u0455si\u0441p2 = new \u0455o\u0455si\u0441p();
        \u04bb\u0456e\u0458e\u0441 \u04bb\u0456e\u0458e\u04412 = \u0455o\u0455si\u0441p2.quantize(nArray, n);
        Set<Integer> set = \u04bb\u0456e\u0458e\u04412.pip\u043e\u04bb.keySet();
        int n2 = 0;
        int[] nArray2 = new int[set.size()];
        for (Integer n3 : set) {
            nArray2[n2++] = n3;
        }
        return c\u0456h\u0455a\u0440h.a_bsm0("h\u04bbe\u0440h", h\u04bbe\u0440h(int[] int[] int ), (int[])nArray, (int[])nArray2, (int)n);
    }

    private static /* synthetic */ CallSite a_bsm0(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }
}

