/*
 * Decompiled with CFR 0.152.
 */
package tech.naven.y;

import c\u0445is.\u043eo\u0435;
import net.minecraft.class_1268;
import net.minecraft.class_1309;
import net.minecraft.class_1799;
import net.minecraft.class_310;
import net.minecraft.class_989;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import \u0440o\u0456\u0445o.\u0445\u0440\u0430\u0435\u0445\u043e;

/*
 * Renamed from tech.naven.Y.u
 */
@Mixin(value={class_989.class})
public class u_0 {
    @Redirect(method={"method_17162"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_1309;method_6047()Lnet/minecraft/class_1799;"))
    private class_1799 hookMainHand(class_1309 class_13092) {
        \u043eo\u0435 \u043eo\u04352 = new \u043eo\u0435(class_1268.field_5808, class_13092.method_6047());
        if (class_13092 == class_310.method_1551().field_1724) {
            \u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0458poi\u0440().\u0435ecjj\u0458(\u043eo\u04352);
        }
        return \u043eo\u04352.\u0445oxc\u0445();
    }

    @Redirect(method={"method_17162"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_1309;method_6079()Lnet/minecraft/class_1799;"))
    private class_1799 hookOffHand(class_1309 class_13092) {
        \u043eo\u0435 \u043eo\u04352 = new \u043eo\u0435(class_1268.field_5810, class_13092.method_6079());
        if (class_13092 == class_310.method_1551().field_1724) {
            \u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0458poi\u0440().\u0435ecjj\u0458(\u043eo\u04352);
        }
        return \u043eo\u04352.\u0445oxc\u0445();
    }
}

