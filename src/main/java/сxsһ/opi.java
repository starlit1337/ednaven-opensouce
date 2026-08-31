/*
 * Decompiled with CFR 0.152.
 */
package \u0441xs\u04bb;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import \u04bb\u04bb\u0456\u0445.\u0435\u043ea\u0440\u0458;

public final class opi {
    private opi() {
        if (2 * 2 * 2 >= 0) {
        }
        throw new UnsupportedOperationException();
    }

    public static /* synthetic */ boolean \u043e\u0441si(\u0435\u043ea\u0440\u0458 \u0435\u043ea\u0440\u04582) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        boolean bl = (double)opi.a_bsm0("round", round(double ), (double)\u0435\u043ea\u0440\u04582.\u0440os\u043eo()) >= 90.0 && (double)opi.a_bsm0("round", round(double ), (double)\u0435\u043ea\u0440\u04582.\u0440os\u043eo()) <= 111.0;
        boolean bl2 = (double)opi.a_bsm0("round", round(double ), (double)\u0435\u043ea\u0440\u04582.\u04bbeis\u0430()) > 16.0;
        boolean bl3 = (double)opi.a_bsm0("round", round(double ), (double)\u0435\u043ea\u0440\u04582.ex\u0430i\u0440()) < 65.0;
        return bl && bl2 && bl3;
    }

    public static /* synthetic */ \u0435\u043ea\u0440\u0458 \u0456h\u0458a\u0430x(\u0435\u043ea\u0440\u0458 \u0435\u043ea\u0440\u04582) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if (opi.\u043e\u0441si(\u0435\u043ea\u0440\u04582)) {
            return opi.a_bsm1("\u043e\u0455\u043e", \u043e\u0455\u043e(double double double ), (double)\u0435\u043ea\u0440\u04582.\u0440os\u043eo(), (double)\u0435\u043ea\u0440\u04582.\u04bbeis\u0430(), (double)70.0);
        }
        return \u0435\u043ea\u0440\u04582;
    }

    private static /* synthetic */ CallSite a_bsm0(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm1(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }
}

