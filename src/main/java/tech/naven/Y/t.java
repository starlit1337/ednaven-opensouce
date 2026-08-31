/*
 * Decompiled with CFR 0.152.
 */
package tech.naven.Y;

import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.ByteBuffer;
import net.minecraft.class_287;
import net.minecraft.class_291;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import xs\u0441\u0445oa\u0430.\u0458c\u0456\u0456\u0441\u0441\u0440;

@Mixin(value={class_291.class})
public abstract class t {
    @Shadow
    private int field_27366;

    @Inject(method={"method_43443"}, at={@At(value="RETURN")})
    private void onConfigureIndexBuffer(class_287.class_4574 class_45742, ByteBuffer byteBuffer, CallbackInfoReturnable<RenderSystem.class_5590> callbackInfoReturnable) {
        \u0458c\u0456\u0456\u0441\u0441\u0440.xeap = callbackInfoReturnable.getReturnValue() == null ? this.field_27366 : ((RenderSystem.class_5590)callbackInfoReturnable.getReturnValue()).field_27335;
    }
}

