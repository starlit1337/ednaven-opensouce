/*
 * Decompiled with CFR 0.152.
 */
package \u0440\u0440e;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Set;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import \u0445eo.c\u0455pi;
import \u0445eo.\u0456p\u0430\u043e\u0458\u043e;
import \u0445eo.\u0458i\u0456x;

@\u0456p\u0430\u043e\u0458\u043e(sp\u0456p\u0445\u0435="GhostHand", a\u0456j\u0430\u0455\u04bb="Interact with containers through blocks", s\u0455cj=\u0458i\u0456x.MISC)
public class po\u0440j
extends c\u0455pi {
    public static final /* synthetic */ Set<class_2248> \u0458sac\u0455;
    private static /* synthetic */ int __js_dispatch_state = 0;

    public po\u0440j() {
        if (2 * 2 * 2 >= 0) {
        }
        if (po\u0440j.$_h10n82a11ngan17lfb((long)po\u0440j.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)po\u0440j.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
    }

    public static /* synthetic */ boolean x\u0455\u0445\u0445\u0441\u0441\u0456(class_2248 class_22482) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (true | false) {
        }
        if (po\u0440j.$_h10n82a21ngan17lfc((long)po\u0440j.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)po\u0440j.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        if (0 != 0) {
        }
        return (po\u0440j.\u0458sac\u0455.contains(class_22482) ? 1 : 0) != 0;
    }

    static {
        if (System.nanoTime() == Long.MIN_VALUE) {
            throw null;
        }
        \u0458sac\u0455 = Set.of(class_2246.field_10034, class_2246.field_10181);
    }

    private static /* synthetic */ CallSite a_bsm0(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }
}

