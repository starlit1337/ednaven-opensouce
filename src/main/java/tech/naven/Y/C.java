/*
 * Decompiled with CFR 0.152.
 */
package tech.naven.Y;

import c\u0445is.\u04bb\u043eoxc;
import net.minecraft.class_1657;
import net.minecraft.class_1792;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import \u0440o\u0456\u0445o.\u0445\u0440\u0430\u0435\u0445\u043e;

@Mixin(value={class_1792.class})
public class C {
    @Redirect(method={"method_7872"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_1657;method_36454()F"))
    private static float hookRayTraceYRot(class_1657 class_16572) {
        \u04bb\u043eoxc \u04bb\u043eoxc2 = new \u04bb\u043eoxc(class_16572.method_36454(), class_16572.method_36455());
        \u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0458poi\u0440().\u0435ecjj\u0458(\u04bb\u043eoxc2);
        return \u04bb\u043eoxc2.jo\u0456c\u043e\u0440();
    }

    @Redirect(method={"method_7872"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_1657;method_36455()F"))
    private static float hookRayTraceXRot(class_1657 class_16572) {
        \u04bb\u043eoxc \u04bb\u043eoxc2 = new \u04bb\u043eoxc(class_16572.method_36454(), class_16572.method_36455());
        \u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0458poi\u0440().\u0435ecjj\u0458(\u04bb\u043eoxc2);
        return \u04bb\u043eoxc2.xpx();
    }
}

