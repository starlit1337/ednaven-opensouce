/*
 * Decompiled with CFR 0.152.
 */
package tech.naven.Y;

import net.minecraft.class_317;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import \u0440o\u0456\u0445o.\u0445\u0440\u0430\u0435\u0445\u043e;

@Mixin(value={class_317.class})
public class v {
    @Shadow
    public float field_1970;
    @Shadow
    private long field_1971;
    @Final
    @Shadow
    private float field_1968;
    @Shadow
    public float field_1969;

    @Inject(method={"method_1658"}, at={@At(value="HEAD")}, cancellable=true)
    private void beginRenderTickHook(long l2, CallbackInfoReturnable<Integer> callbackInfoReturnable) {
        if (\u0445\u0440\u0430\u0435\u0445\u043e.oxsj\u0456\u0445a != 1.0f) {
            this.field_1969 = (float)(l2 - this.field_1971) / this.field_1968 * \u0445\u0440\u0430\u0435\u0445\u043e.oxsj\u0456\u0445a;
            this.field_1971 = l2;
            this.field_1970 += this.field_1969;
            int n = (int)this.field_1970;
            this.field_1970 -= (float)n;
            callbackInfoReturnable.setReturnValue((Object)n);
        }
    }
}

