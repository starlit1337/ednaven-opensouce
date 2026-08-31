/*
 * Decompiled with CFR 0.152.
 */
package tech.naven.y;

import c\u0445is.\u0455\u0456\u0440;
import net.minecraft.class_312;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import \u0440o\u0456\u0445o.\u0445\u0440\u0430\u0435\u0445\u043e;

/*
 * Renamed from tech.naven.Y.i
 */
@Mixin(value={class_312.class})
public class i_0 {
    @Inject(at={@At(value="INVOKE", target="Lnet/minecraft/class_304;method_1416(Lnet/minecraft/class_3675$class_306;Z)V")}, method={"method_1601"})
    private void onPress(long l2, int n, int n2, int n3, CallbackInfo callbackInfo) {
        \u0455\u0456\u0440 \u0455\u0456\u04402 = new \u0455\u0456\u0440(n, n2 == 0);
        \u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0458poi\u0440().\u0435ecjj\u0458(\u0455\u0456\u04402);
    }
}

