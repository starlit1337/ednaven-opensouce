/*
 * Decompiled with CFR 0.152.
 */
package tech.naven.Y;

import c\u0445is.\u0458ppa;
import net.minecraft.class_2561;
import net.minecraft.class_268;
import net.minecraft.class_270;
import net.minecraft.class_5250;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import \u0440o\u0456\u0445o.\u0445\u0440\u0430\u0435\u0445\u043e;

@Mixin(value={class_268.class})
public class l {
    @Inject(method={"method_1142"}, at={@At(value="RETURN")}, cancellable=true)
    private static void onFormatName(class_270 class_2702, class_2561 class_25612, CallbackInfoReturnable<class_5250> callbackInfoReturnable) {
        \u0458ppa \u0458ppa2 = new \u0458ppa((class_2561)callbackInfoReturnable.getReturnValue());
        \u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0458poi\u0440().\u0435ecjj\u0458(\u0458ppa2);
        callbackInfoReturnable.setReturnValue((Object)((class_5250)\u0458ppa2.\u0441\u04bb\u0456c\u0455()));
    }
}

