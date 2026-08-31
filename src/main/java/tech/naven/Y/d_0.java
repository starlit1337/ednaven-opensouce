/*
 * Decompiled with CFR 0.152.
 */
package tech.naven.y;

import net.minecraft.class_1041;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import \u0455hs.\u0440ox\u043e\u0456;

/*
 * Renamed from tech.naven.Y.d
 */
@Mixin(value={class_1041.class})
public class d_0 {
    @Inject(method={"method_4504"}, at={@At(value="RETURN")})
    private void onFramebufferSizeChanged(long l2, int n, int n2, CallbackInfo callbackInfo) {
        \u0440ox\u043e\u0456.ixx\u0445(n, n2);
    }
}

