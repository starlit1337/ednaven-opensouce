/*
 * Decompiled with CFR 0.152.
 */
package tech.naven.Y;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.class_1291;
import net.minecraft.class_1294;
import net.minecraft.class_1309;
import net.minecraft.class_4184;
import net.minecraft.class_6880;
import net.minecraft.class_758;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import \u0440o\u0456\u0445o.\u0445\u0440\u0430\u0435\u0445\u043e;
import \u0445\u0430p\u0440.pi\u0458p;

@Mixin(value={class_758.class})
public class P {
    @Inject(method={"method_3211"}, at={@At(value="TAIL")})
    private static void onSetupFogTail(class_4184 class_41842, class_758.class_4596 class_45962, float f, boolean bl, float f2, CallbackInfo callbackInfo) {
        class_1309 class_13092 = (class_1309)class_41842.method_19331();
        if (\u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0430o\u0441\u0456p\u0455().\u0441c\u0458\u043e\u0430(pi\u0458p.class).\u0440\u0435\u0455x\u0435xe() && class_13092.method_6059(class_1294.field_5919)) {
            RenderSystem.setShaderFogStart((float)(f * 0.75f));
            RenderSystem.setShaderFogEnd((float)f);
        }
    }

    @Redirect(method={"method_3210"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_1309;method_6059(Lnet/minecraft/class_6880;)Z", ordinal=0))
    private static boolean onSetupColor(class_1309 class_13092, class_6880<class_1291> class_68802) {
        if (class_68802.method_55838(class_1294.field_5919) && \u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0430o\u0441\u0456p\u0455().\u0441c\u0458\u043e\u0430(pi\u0458p.class).\u0440\u0435\u0455x\u0435xe()) {
            return false;
        }
        return class_13092.method_6059(class_68802);
    }
}

