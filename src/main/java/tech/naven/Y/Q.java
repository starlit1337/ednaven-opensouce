/*
 * Decompiled with CFR 0.152.
 */
package tech.naven.Y;

import c\u0445is.cac\u0445;
import net.minecraft.class_1309;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_922;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import \u0440o\u0456\u0445o.\u0445\u0440\u0430\u0435\u0445\u043e;

@Mixin(value={class_922.class})
public class Q<T extends class_1309> {
    @Inject(method={"method_4054"}, at={@At(value="HEAD")})
    private void renderHead(T t2, float f, float f2, class_4587 class_45872, class_4597 class_45972, int n, CallbackInfo callbackInfo) {
        cac\u0445.a\u0440\u0456\u043e\u0445 = t2;
    }

    @Redirect(method={"method_4054"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_3532;method_17821(FFF)F", ordinal=1))
    private float rotAnimationYaw(float f, float f2, float f3) {
        cac\u0445 cac\u04452 = new cac\u0445(f3, f2, 0.0f, 0.0f);
        if (cac\u0445.a\u0440\u0456\u043e\u0445 == class_310.method_1551().field_1724) {
            \u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0458poi\u0440().\u0435ecjj\u0458(cac\u04452);
        }
        return class_3532.method_17821((float)f, (float)cac\u04452.\u0440s\u0445\u043e\u0456p(), (float)cac\u04452.jo\u0456c\u043e\u0440());
    }

    @Redirect(method={"method_4054"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_3532;method_16439(FFF)F", ordinal=0))
    private float rotAnimationPitch(float f, float f2, float f3) {
        cac\u0445 cac\u04452 = new cac\u0445(0.0f, 0.0f, f3, f2);
        if (cac\u0445.a\u0440\u0456\u043e\u0445 == class_310.method_1551().field_1724) {
            \u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0458poi\u0440().\u0435ecjj\u0458(cac\u04452);
        }
        return class_3532.method_16439((float)f, (float)cac\u04452.\u0458o\u0440ecph(), (float)cac\u04452.xpx());
    }
}

