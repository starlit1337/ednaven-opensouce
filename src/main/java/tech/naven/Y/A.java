/*
 * Decompiled with CFR 0.152.
 */
package tech.naven.Y;

import net.minecraft.class_1297;
import net.minecraft.class_1542;
import net.minecraft.class_1657;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_1542.class})
public abstract class A {
    @Shadow
    private int field_7202;

    @Inject(method={"method_5773"}, at={@At(value="TAIL")})
    private void reduceNearbyPickupDelay(CallbackInfo callbackInfo) {
        class_1542 class_15422 = (class_1542)this;
        class_1657 class_16572 = class_15422.method_37908().method_18460((class_1297)class_15422, 5.0);
        if (class_16572 == null || !class_15422.method_5805() || !class_15422.method_24828()) {
            return;
        }
        if (this.field_7202 <= 2) {
            return;
        }
        this.field_7202 = 2;
    }
}

