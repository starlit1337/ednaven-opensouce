/*
 * Decompiled with CFR 0.152.
 */
package tech.naven.Y;

import c\u0445is.\u0441\u0430ahccx;
import net.minecraft.class_309;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import \u0440o\u0456\u0445o.\u0445\u0440\u0430\u0435\u0445\u043e;

@Mixin(value={class_309.class})
public class J {
    @Inject(at={@At(value="HEAD")}, method={"method_1466"})
    private void onKeyPress(long l2, int n, int n2, int n3, int n4, CallbackInfo callbackInfo) {
        if (n != -1 && \u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c() != null && \u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0458poi\u0440() != null && n3 == 1) {
            \u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0458poi\u0440().\u0435ecjj\u0458(new \u0441\u0430ahccx(n));
        }
    }
}

