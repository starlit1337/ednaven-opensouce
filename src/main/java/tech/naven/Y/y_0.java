/*
 * Decompiled with CFR 0.152.
 */
package tech.naven.y;

import c\u0445is.\u043e\u0435\u04bb\u0456c;
import c\u0445is.\u0458a\u0458\u0456\u0458;
import net.minecraft.class_2535;
import net.minecraft.class_2596;
import net.minecraft.class_634;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import \u0440o\u0456\u0445o.\u0445\u0440\u0430\u0435\u0445\u043e;

/*
 * Renamed from tech.naven.Y.y
 */
@Mixin(value={class_634.class})
public class y_0 {
    @Inject(method={"method_45729"}, at={@At(value="HEAD")}, cancellable=true)
    public void onChat(String string, CallbackInfo callbackInfo) {
        \u0458a\u0458\u0456\u0458 \u0458a\u0458\u0456\u04582 = new \u0458a\u0458\u0456\u0458(string);
        \u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0458poi\u0440().\u0435ecjj\u0458(\u0458a\u0458\u0456\u04582);
        if (\u0458a\u0458\u0456\u04582.isCancelled()) {
            callbackInfo.cancel();
        }
    }

    @Redirect(method={"method_11157"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_2535;method_10743(Lnet/minecraft/class_2596;)V", ordinal=1))
    public void onSendPacket(class_2535 class_25352, class_2596<?> class_25962) {
        \u043e\u0435\u04bb\u0456c \u043e\u0435\u04bb\u0456c2 = new \u043e\u0435\u04bb\u0456c(class_25962);
        \u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0458poi\u0440().\u0435ecjj\u0458(\u043e\u0435\u04bb\u0456c2);
        class_25352.method_10743(\u043e\u0435\u04bb\u0456c2.ciao\u0455\u0455());
    }
}

