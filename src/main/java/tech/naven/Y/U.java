/*
 * Decompiled with CFR 0.152.
 */
package tech.naven.Y;

import net.minecraft.class_2561;
import net.minecraft.class_332;
import net.minecraft.class_408;
import net.minecraft.class_437;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import \u0458o\u0440.\u0458\u0441\u0458\u0430ej;

@Mixin(value={class_408.class})
public class U
extends class_437 {
    protected U(class_2561 class_25612) {
        super(class_25612);
    }

    @Inject(method={"method_25394"}, at={@At(value="HEAD")})
    public void render(class_332 class_3322, int n, int n2, float f, CallbackInfo callbackInfo) {
        \u0458\u0441\u0458\u0430ej.p\u04bb\u0435esse.values().forEach(\u0455\u0456\u0440e2 -> {
            if (\u0455\u0456\u0440e2.\u0435\u0430ces\u04bbs().\u0440\u0435\u0455x\u0435xe()) {
                \u0455\u0456\u0440e2.o\u0441c\u04bb\u0455oa(n, n2);
            }
        });
    }

    @Inject(method={"method_25402"}, at={@At(value="HEAD")})
    public void mouseClicked(double d, double d2, int n, CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        \u0458\u0441\u0458\u0430ej.p\u04bb\u0435esse.values().forEach(\u0455\u0456\u0440e2 -> {
            if (\u0455\u0456\u0440e2.\u0435\u0430ces\u04bbs().\u0440\u0435\u0455x\u0435xe()) {
                \u0455\u0456\u0440e2.cp\u0455\u0455\u0458x\u0445((int)d, (int)d2, n);
            }
        });
    }

    public boolean method_25406(double d, double d2, int n) {
        \u0458\u0441\u0458\u0430ej.p\u04bb\u0435esse.values().forEach(\u0455\u0456\u0440e2 -> {
            if (\u0455\u0456\u0440e2.\u0435\u0430ces\u04bbs().\u0440\u0435\u0455x\u0435xe()) {
                \u0455\u0456\u0440e2.\u0456i\u0445(n);
            }
        });
        return super.method_25406(d, d2, n);
    }
}

