/*
 * Decompiled with CFR 0.152.
 */
package \u043e\u0441\u0441c\u04bb;

import ie\u0441\u0430ej.\u0445ic\u0441\u0458\u0456\u0445;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import net.minecraft.class_1041;
import \u043e\u0441\u0441c\u04bb.\u0445hca\u0456\u0440\u043e;

public class exape {
    private final /* synthetic */ List<\u0445hca\u0456\u0440\u043e> \u0441\u0456\u0441\u0440\u0455\u0456;

    public exape() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        this.\u0441\u0456\u0441\u0440\u0455\u0456 = new CopyOnWriteArrayList<\u0445hca\u0456\u0440\u043e>();
    }

    public /* synthetic */ void is\u04bbj(\u0445hca\u0456\u0440\u043e \u0445hca\u0456\u0440\u043e2) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (!this.\u0441\u0456\u0441\u0440\u0455\u0456.contains(\u0445hca\u0456\u0440\u043e2)) {
            this.\u0441\u0456\u0441\u0440\u0455\u0456.add(\u0445hca\u0456\u0440\u043e2);
        }
    }

    public /* synthetic */ void \u0435\u0458\u0456s() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        float f = 5.0f;
        for (\u0445hca\u0456\u0440\u043e \u0445hca\u0456\u0440\u043e2 : this.\u0441\u0456\u0441\u0440\u0455\u0456) {
            float f2 = \u0445hca\u0456\u0440\u043e2.p\u0435\u0455();
            f += \u0445hca\u0456\u0440\u043e2.\u0455j\u0430\u0440\u0455();
            \u0445ic\u0441\u0458\u0456\u0445 \u0445ic\u0441\u0458\u0456\u04452 = \u0445hca\u0456\u0440\u043e2.s\u0440o();
            \u0445ic\u0441\u0458\u0456\u0445 \u0445ic\u0441\u0458\u0456\u04453 = \u0445hca\u0456\u0440\u043e2.\u043ee\u0435a\u0440\u0440o();
            float f3 = (float)(exape.a_bsm0("currentTimeMillis", currentTimeMillis()) - \u0445hca\u0456\u0440\u043e2.e\u0445j\u0430\u043e\u0455());
            if (f3 > (float)\u0445hca\u0456\u0440\u043e2.\u0441x\u0455()) {
                \u0445ic\u0441\u0458\u0456\u04452.osj = 0.0f;
                \u0445ic\u0441\u0458\u0456\u04453.osj = 0.0f;
                if (\u0445ic\u0441\u0458\u0456\u04452.\u0441cc\u0430(true)) {
                    this.\u0441\u0456\u0441\u0440\u0455\u0456.remove(\u0445hca\u0456\u0440\u043e2);
                }
            } else {
                \u0445ic\u0441\u0458\u0456\u04452.osj = f2;
                \u0445ic\u0441\u0458\u0456\u04453.osj = f;
            }
            \u0445ic\u0441\u0458\u0456\u04452.oxjc\u0456(true);
            \u0445ic\u0441\u0458\u0456\u04453.oxjc\u0456(true);
            class_1041 class_10412 = exape.a_bsm1("method_1551", method_1551()).method_22683();
            \u0445hca\u0456\u0440\u043e2.ocjo\u0435x((float)class_10412.method_4486() - \u0445ic\u0441\u0458\u0456\u04452.\u0430jxc + 2.0f, (float)class_10412.method_4502() - \u0445ic\u0441\u0458\u0456\u04453.\u0430jxc);
        }
    }

    private static /* synthetic */ CallSite a_bsm0(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm1(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }
}

