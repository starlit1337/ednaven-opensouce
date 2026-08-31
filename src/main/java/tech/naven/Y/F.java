/*
 * Decompiled with CFR 0.152.
 */
package tech.naven.Y;

import c\u0445is.\u0456\u0435\u0440;
import net.minecraft.class_742;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import \u0440o\u0456\u0445o.\u0445\u0440\u0430\u0435\u0445\u043e;

@Mixin(value={class_742.class})
public abstract class F {
    @Inject(method={"method_3118"}, at={@At(value="RETURN")}, cancellable=true)
    private void hookFoV(CallbackInfoReturnable<Float> callbackInfoReturnable) {
        float f = ((Float)callbackInfoReturnable.getReturnValue()).floatValue();
        \u0456\u0435\u0440 \u0456\u0435\u04402 = new \u0456\u0435\u0440(f);
        \u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0458poi\u0440().\u0435ecjj\u0458(\u0456\u0435\u04402);
        callbackInfoReturnable.setReturnValue((Object)Float.valueOf(\u0456\u0435\u04402.c\u0440\u04bb\u0435\u0456()));
    }
}

