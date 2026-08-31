/*
 * Decompiled with CFR 0.152.
 */
package tech.naven.Y;

import c\u0445is.ex\u0441s\u04bbp\u0435;
import c\u0445is.p\u0435j\u0435\u0430he;
import c\u0445is.\u0440\u0430\u0430;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_2596;
import net.minecraft.class_634;
import net.minecraft.class_636;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import \u0440o\u0456\u0445o.\u0445\u0440\u0430\u0435\u0445\u043e;

@Mixin(value={class_636.class})
public class B {
    @Inject(method={"method_2919"}, at={@At(value="HEAD")}, cancellable=true)
    public void hookInteractItem(class_1657 class_16572, class_1268 class_12682, CallbackInfoReturnable<class_1269> callbackInfoReturnable) {
        p\u0435j\u0435\u0430he p\u0435j\u0435\u0430he2 = new p\u0435j\u0435\u0430he(class_12682, class_16572.method_5998(class_12682));
        \u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0458poi\u0440().\u0435ecjj\u0458(p\u0435j\u0435\u0430he2);
        if (p\u0435j\u0435\u0430he2.isCancelled()) {
            callbackInfoReturnable.setReturnValue((Object)class_1269.field_5811);
        }
    }

    @Redirect(method={"method_2919"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_634;method_52787(Lnet/minecraft/class_2596;)V", ordinal=0))
    public void onSendPacket(class_634 class_6342, class_2596<?> class_25962) {
        \u0440\u0430\u0430 \u0440\u0430\u04302 = new \u0440\u0430\u0430(class_25962);
        \u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0458poi\u0440().\u0435ecjj\u0458(\u0440\u0430\u04302);
        if (!\u0440\u0430\u04302.isCancelled()) {
            class_6342.method_52787(\u0440\u0430\u04302.ciao\u0455\u0455());
        }
    }

    @Inject(method={"method_2918"}, at={@At(value="HEAD")})
    public void hookEventAttack(class_1657 class_16572, class_1297 class_12972, CallbackInfo callbackInfo) {
        \u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0458poi\u0440().\u0435ecjj\u0458(new ex\u0441s\u04bbp\u0435(class_12972, class_16572.method_5624()));
    }
}

