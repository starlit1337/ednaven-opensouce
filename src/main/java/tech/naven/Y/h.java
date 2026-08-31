/*
 * Decompiled with CFR 0.152.
 */
package tech.naven.Y;

import c\u0445is.xe\u0440\u0445\u0441;
import c\u0445is.\u043eo\u0435;
import i\u0445s\u0458\u0440j.icps\u04bbej;
import net.minecraft.class_1268;
import net.minecraft.class_1799;
import net.minecraft.class_1806;
import net.minecraft.class_310;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_742;
import net.minecraft.class_746;
import net.minecraft.class_759;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import \u0440o\u0456\u0445o.\u0445\u0440\u0430\u0435\u0445\u043e;

@Mixin(value={class_759.class})
public class h {
    @Inject(method={"method_3228"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_759;method_3233(Lnet/minecraft/class_1309;Lnet/minecraft/class_1799;Lnet/minecraft/class_811;ZLnet/minecraft/class_4587;Lnet/minecraft/class_4597;I)V")})
    private void onRenderItem(class_742 class_7422, float f, float f2, class_1268 class_12682, float f3, class_1799 class_17992, float f4, class_4587 class_45872, class_4597 class_45972, int n, CallbackInfo callbackInfo) {
        xe\u0440\u0445\u0441 xe\u0440\u0445\u04412 = new xe\u0440\u0445\u0441(class_12682, class_17992, f4, class_45872);
        \u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0458poi\u0440().\u0435ecjj\u0458(xe\u0440\u0445\u04412);
    }

    @Inject(method={"method_3228"}, at={@At(value="HEAD")}, cancellable=true)
    private void onRenderItemHook(class_742 class_7422, float f, float f2, class_1268 class_12682, float f3, class_1799 class_17992, float f4, class_4587 class_45872, class_4597 class_45972, int n, CallbackInfo callbackInfo) {
        if (icps\u04bbej.aj\u0445\u0458i() && !class_17992.method_7960() && !(class_17992.method_7909() instanceof class_1806)) {
            callbackInfo.cancel();
            icps\u04bbej.hs\u0445s(class_7422, f, class_12682, f3, class_17992, f4, class_45872, class_45972, n);
        }
    }

    @Redirect(method={"method_3220"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_746;method_6047()Lnet/minecraft/class_1799;"))
    public class_1799 hookMainHand(class_746 class_7462) {
        \u043eo\u0435 \u043eo\u04352 = new \u043eo\u0435(class_1268.field_5808, class_7462.method_6047());
        if (class_7462 == class_310.method_1551().field_1724) {
            \u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0458poi\u0440().\u0435ecjj\u0458(\u043eo\u04352);
        }
        return \u043eo\u04352.\u0445oxc\u0445();
    }

    @Redirect(method={"method_3220"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_746;method_6079()Lnet/minecraft/class_1799;"))
    public class_1799 hookOffHand(class_746 class_7462) {
        \u043eo\u0435 \u043eo\u04352 = new \u043eo\u0435(class_1268.field_5810, class_7462.method_6079());
        if (class_7462 == class_310.method_1551().field_1724) {
            \u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0458poi\u0440().\u0435ecjj\u0458(\u043eo\u04352);
        }
        return \u043eo\u04352.\u0445oxc\u0445();
    }
}

