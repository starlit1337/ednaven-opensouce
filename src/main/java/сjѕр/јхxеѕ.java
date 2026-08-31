/*
 * Decompiled with CFR 0.152.
 */
package \u0441j\u0455\u0440;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_238;
import net.minecraft.class_243;

public class \u0458\u0445x\u0435\u0455 {
    private final /* synthetic */ class_243 \u0445\u0430\u04bb;
    private final /* synthetic */ class_243 \u0435\u0445\u0445c;

    public \u0458\u0445x\u0435\u0455(class_243 class_2432, class_243 class_2433) {
        if (true | false) {
        }
        this.\u0445\u0430\u04bb = new class_243((double)\u0458\u0445x\u0435\u0455.a_bsm0("min", min(double double ), (double)class_2432.field_1352, (double)class_2433.field_1352), (double)\u0458\u0445x\u0435\u0455.a_bsm0("min", min(double double ), (double)class_2432.field_1351, (double)class_2433.field_1351), (double)\u0458\u0445x\u0435\u0455.a_bsm0("min", min(double double ), (double)class_2432.field_1350, (double)class_2433.field_1350));
        this.\u0435\u0445\u0445c = new class_243((double)\u0458\u0445x\u0435\u0455.a_bsm1("max", max(double double ), (double)class_2432.field_1352, (double)class_2433.field_1352), (double)\u0458\u0445x\u0435\u0455.a_bsm1("max", max(double double ), (double)class_2432.field_1351, (double)class_2433.field_1351), (double)\u0458\u0445x\u0435\u0455.a_bsm1("max", max(double double ), (double)class_2432.field_1350, (double)class_2433.field_1350));
    }

    public /* synthetic */ double ph\u0441\u0458\u04bbse() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        class_243 class_2432 = this.x\u04bb\u0441();
        return (class_2432.field_1352 * class_2432.field_1351 + class_2432.field_1351 * class_2432.field_1350 + class_2432.field_1352 * class_2432.field_1350) * 2.0;
    }

    public /* synthetic */ class_243 pc\u0430i\u0458a\u0440() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return new class_243((this.\u0435\u0445\u0445c.field_1352 + this.\u0445\u0430\u04bb.field_1352) * 0.5, (this.\u0435\u0445\u0445c.field_1351 + this.\u0445\u0430\u04bb.field_1351) * 0.5, (this.\u0435\u0445\u0445c.field_1350 + this.\u0445\u0430\u04bb.field_1350) * 0.5);
    }

    public /* synthetic */ class_243 x\u04bb\u0441() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return new class_243(this.\u0435\u0445\u0445c.field_1352 - this.\u0445\u0430\u04bb.field_1352, this.\u0435\u0445\u0445c.field_1351 - this.\u0445\u0430\u04bb.field_1351, this.\u0435\u0445\u0445c.field_1350 - this.\u0445\u0430\u04bb.field_1350);
    }

    public /* synthetic */ \u0458\u0445x\u0435\u0455 xoa\u0435() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if (\u0458\u0445x\u0435\u0455.a_bsm2("abs", abs(double ), (double)this.ph\u0441\u0458\u04bbse()) < 1.0E-4) {
            return null;
        }
        return this;
    }

    public /* synthetic */ \u0458\u0445x\u0435\u0455 ph\u0458(double d) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return new \u0458\u0445x\u0435\u0455(new class_243(this.\u0445\u0430\u04bb.field_1352, (double)\u0458\u0445x\u0435\u0455.a_bsm1("max", max(double double ), (double)this.\u0445\u0430\u04bb.field_1351, (double)d), this.\u0445\u0430\u04bb.field_1350), new class_243(this.\u0435\u0445\u0445c.field_1352, (double)\u0458\u0445x\u0435\u0455.a_bsm1("max", max(double double ), (double)this.\u0435\u0445\u0445c.field_1351, (double)d), this.\u0435\u0445\u0445c.field_1350));
    }

    public /* synthetic */ \u0458\u0445x\u0435\u0455 \u0430ce\u04bb\u0440\u0440(class_238 class_2382) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        class_243 class_2432 = new class_243((double)\u0458\u0445x\u0435\u0455.a_bsm3("method_15350", method_15350(double double double ), (double)this.\u0445\u0430\u04bb.field_1352, (double)class_2382.field_1323, (double)class_2382.field_1320), (double)\u0458\u0445x\u0435\u0455.a_bsm3("method_15350", method_15350(double double double ), (double)this.\u0445\u0430\u04bb.field_1351, (double)class_2382.field_1322, (double)class_2382.field_1325), (double)\u0458\u0445x\u0435\u0455.a_bsm3("method_15350", method_15350(double double double ), (double)this.\u0445\u0430\u04bb.field_1350, (double)class_2382.field_1321, (double)class_2382.field_1324));
        class_243 class_2433 = new class_243((double)\u0458\u0445x\u0435\u0455.a_bsm3("method_15350", method_15350(double double double ), (double)this.\u0435\u0445\u0445c.field_1352, (double)class_2382.field_1323, (double)class_2382.field_1320), (double)\u0458\u0445x\u0435\u0455.a_bsm3("method_15350", method_15350(double double double ), (double)this.\u0435\u0445\u0445c.field_1351, (double)class_2382.field_1322, (double)class_2382.field_1325), (double)\u0458\u0445x\u0435\u0455.a_bsm3("method_15350", method_15350(double double double ), (double)this.\u0435\u0445\u0445c.field_1350, (double)class_2382.field_1321, (double)class_2382.field_1324));
        return new \u0458\u0445x\u0435\u0455(class_2432, class_2433);
    }

    public /* synthetic */ \u0458\u0445x\u0435\u0455 \u0441\u0430c\u0455(class_243 class_2432) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return new \u0458\u0445x\u0435\u0455(this.\u0445\u0430\u04bb.method_1019(class_2432), this.\u0435\u0445\u0445c.method_1019(class_2432));
    }

    public /* synthetic */ class_243 \u0435\u0441i\u0458() {
        double d;
        if (true | false) {
        }
        if (0 != 0) {
        }
        CallSite callSite = \u0458\u0445x\u0435\u0455.a_bsm4("current", current());
        if (this.\u0445\u0430\u04bb.field_1352 == this.\u0435\u0445\u0445c.field_1352) {
            d = this.\u0445\u0430\u04bb.field_1352;
            switch (0) {
                default: {
                    break;
                }
                case 1: {
                    break;
                }
                case 2: {
                    break;
                }
            }
        } else {
            d = ((ThreadLocalRandom)((Object)callSite)).nextDouble(this.\u0445\u0430\u04bb.field_1352, this.\u0435\u0445\u0445c.field_1352);
        }
        return new class_243(d, this.\u0445\u0430\u04bb.field_1351 == this.\u0435\u0445\u0445c.field_1351 ? this.\u0445\u0430\u04bb.field_1351 : ((ThreadLocalRandom)((Object)callSite)).nextDouble(this.\u0445\u0430\u04bb.field_1351, this.\u0435\u0445\u0445c.field_1351), this.\u0445\u0430\u04bb.field_1350 == this.\u0435\u0445\u0445c.field_1350 ? this.\u0445\u0430\u04bb.field_1350 : ((ThreadLocalRandom)((Object)callSite)).nextDouble(this.\u0445\u0430\u04bb.field_1350, this.\u0435\u0445\u0445c.field_1350));
    }

    public /* synthetic */ class_243 \u0435e\u0441\u0430exx() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return this.\u0445\u0430\u04bb;
    }

    public /* synthetic */ class_243 p\u0435\u0445() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return this.\u0435\u0445\u0445c;
    }

    private static /* synthetic */ CallSite a_bsm0(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm1(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm2(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm3(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm4(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }
}

