/*
 * Decompiled with CFR 0.152.
 */
package tech.naven.Y;

import java.awt.Color;
import net.minecraft.class_2583;
import net.minecraft.class_5251;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import \u0445\u0430p\u0440.\u0430opc\u043e\u0440;
import \u0445\u0430p\u0440.\u0440\u0441\u0456h\u0441;

@Mixin(value={class_2583.class})
public class D {
    @Inject(method={"method_10973"}, at={@At(value="RETURN")}, cancellable=true)
    private void onGetColor(CallbackInfoReturnable<class_5251> callbackInfoReturnable) {
        int n;
        class_5251 class_52512 = (class_5251)callbackInfoReturnable.getReturnValue();
        if (class_52512 != null && (n = class_52512.method_27716()) >= 1 && n <= 10) {
            Color color = \u0430opc\u043e\u0440.\u043eco\u04bb(n - 1, \u0440\u0441\u0456h\u0441.jae);
            callbackInfoReturnable.setReturnValue((Object)class_5251.method_27717((int)color.getRGB()));
        }
    }
}

