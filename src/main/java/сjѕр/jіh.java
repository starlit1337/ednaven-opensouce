/*
 * Decompiled with CFR 0.152.
 */
package \u0441j\u0455\u0440;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.HashSet;
import java.util.Set;
import net.minecraft.class_1299;
import net.minecraft.class_1477;
import net.minecraft.class_1937;

public class j\u0456h
extends class_1477 {
    public static final /* synthetic */ Set<Integer> \u0445pxcce;

    public j\u0456h(class_1299<? extends class_1477> class_12992, class_1937 class_19372) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        super(class_12992, class_19372);
        \u0445pxcce.add((Integer)((Object)j\u0456h.a_bsm0("valueOf", valueOf(int ), (int)this.method_5628())));
    }

    public /* synthetic */ boolean method_6102() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return false;
    }

    static {
        \u0445pxcce = new HashSet<Integer>();
    }

    private static /* synthetic */ CallSite a_bsm0(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }
}

