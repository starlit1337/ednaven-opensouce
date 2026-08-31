/*
 * Decompiled with CFR 0.152.
 */
package \u0441j\u0455\u0440;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_2382;
import net.minecraft.class_243;
import \u0441j\u0455\u0440.\u0435p\u0441;
import \u0441j\u0455\u0440.\u0458\u0445x\u0435\u0455;

public abstract class j\u0435\u0456 {
    public j\u0435\u0456() {
        if (2 * 2 * 2 >= 0) {
        }
    }

    public abstract /* synthetic */ class_243 producePositionOnFace(\u0458\u0445x\u0435\u0455 var1, class_2338 var2);

    protected /* synthetic */ \u0458\u0445x\u0435\u0455 e\u0455j\u0441(\u0458\u0445x\u0435\u0455 \u0458\u0445x\u0435\u04552, class_2338 class_23382) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return \u0458\u0445x\u0435\u04552.\u0441\u0430c\u0455(j\u0435\u0456.a_bsm0("method_24954", method_24954(net.minecraft.class_2382 ), (class_2382)class_23382).method_22882());
    }

    protected /* synthetic */ \u0458\u0445x\u0435\u0455 \u0441\u0456\u0458(\u0458\u0445x\u0435\u0455 \u0458\u0445x\u0435\u04552, \u0435p\u0441 \u0435p\u04412) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        class_238 class_2383 = new class_238(\u0435p\u04412.j\u0430\u0445i().\u043ec\u0430cph(), \u0435p\u04412.ea\u0435j().\u043ec\u0430cph(), \u0435p\u04412.p\u04bbjp\u0458().\u043ec\u0430cph(), \u0435p\u04412.j\u0430\u0445i().ip\u043ep(), \u0435p\u04412.ea\u0435j().ip\u043ep(), \u0435p\u04412.p\u04bbjp\u0458().ip\u043ep()).method_989(-0.5, -0.5, -0.5).method_997(\u0458\u0445x\u0435\u04552.pc\u0430i\u0458a\u0440());
        return \u0458\u0445x\u0435\u04552.\u0430ce\u04bb\u0440\u0440(class_2383);
    }

    protected /* synthetic */ List<class_243> \u0445s\u0430se\u0445\u0440(\u0458\u0445x\u0435\u0455 \u0458\u0445x\u0435\u04552, double d) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        ArrayList<class_243> arrayList = new ArrayList<class_243>();
        class_243 class_2432 = \u0458\u0445x\u0435\u04552.\u0435e\u0441\u0430exx();
        class_243 class_2433 = \u0458\u0445x\u0435\u04552.p\u0435\u0445();
        block8: for (double d2 = class_2432.field_1352; d2 <= class_2433.field_1352; d2 += d) {
            for (double d3 = class_2432.field_1351; d3 <= class_2433.field_1351; d3 += d) {
                block10: for (double d4 = class_2432.field_1350; d4 <= class_2433.field_1350; d4 += d) {
                    arrayList.add(new class_243(d2, d3, d4));
                    switch (0) {
                        default: {
                            continue block10;
                        }
                        case 1: {
                            continue block10;
                        }
                        case 2: 
                    }
                }
            }
            switch (0) {
                default: {
                    continue block8;
                }
                case 1: {
                    continue block8;
                }
                case 2: 
            }
        }
        return arrayList;
    }

    private static /* synthetic */ CallSite a_bsm0(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }
}

