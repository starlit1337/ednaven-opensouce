/*
 * Decompiled with CFR 0.152.
 */
package tech.naven.y;

import net.minecraft.class_1297;
import net.minecraft.class_1922;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_4184;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import \u0440o\u0456\u0445o.\u0445\u0440\u0430\u0435\u0445\u043e;
import \u0445eo.c\u0455pi;
import \u0445\u0430p\u0440.x\u0445ih;
import \u0445\u0430p\u0440.\u0430\u04bb\u0441oe\u0430\u04bb;

/*
 * Renamed from tech.naven.Y.o
 */
@Mixin(value={class_4184.class})
public class o_0 {
    @Shadow
    private float field_18717;
    @Shadow
    private float field_18718;
    @Shadow
    private class_243 field_18712;

    @Inject(at={@At(value="HEAD")}, method={"method_19318"}, cancellable=true)
    private void getMaxZoom(double d, CallbackInfoReturnable<Double> callbackInfoReturnable) {
        x\u0445ih x\u0445ih2;
        if (\u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c() != null && \u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0430o\u0441\u0456p\u0455() != null && (x\u0445ih2 = (x\u0445ih)\u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0430o\u0441\u0456p\u0455().\u0441c\u0458\u043e\u0430(x\u0445ih.class)).\u0440\u0435\u0455x\u0435xe()) {
            callbackInfoReturnable.setReturnValue((Object)(d * (double)x\u0445ih2.\u0456\u04bbhsj.axpacc() * (double)x\u0445ih2.\u0456e\u0455\u0458.\u0430jxc / 100.0));
            callbackInfoReturnable.cancel();
        }
    }

    @Inject(method={"method_19326"}, at={@At(value="HEAD")}, cancellable=true)
    private void modifyGetPosition(CallbackInfoReturnable<class_243> callbackInfoReturnable) {
        c\u0455pi c\u0455pi2 = \u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0430o\u0441\u0456p\u0455().\u0441c\u0458\u043e\u0430(\u0430\u04bb\u0441oe\u0430\u04bb.class);
        if (c\u0455pi2 != null && this.shouldApplyMotionCamera()) {
            callbackInfoReturnable.setReturnValue((Object)\u0430\u04bb\u0441oe\u0430\u04bb.o\u0455\u0441c\u043e());
        }
    }

    @Unique
    private boolean shouldApplyMotionCamera() {
        \u0430\u04bb\u0441oe\u0430\u04bb \u0430\u04bb\u0441oe\u0430\u04bb2 = (\u0430\u04bb\u0441oe\u0430\u04bb)\u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0430o\u0441\u0456p\u0455().\u0441c\u0458\u043e\u0430(\u0430\u04bb\u0441oe\u0430\u04bb.class);
        return \u0430\u04bb\u0441oe\u0430\u04bb2.\u0440\u0435\u0455x\u0435xe() && \u0430\u04bb\u0441oe\u0430\u04bb2.\u0455sc\u0445.axpacc() && !class_310.method_1551().field_1690.method_31044().method_31034() && !class_310.method_1551().field_1690.method_31044().method_31035() && class_310.method_1551().field_1724 != null && class_310.method_1551().field_1687 != null;
    }

    @Inject(method={"method_19329"}, at={@At(value="HEAD")}, cancellable=true)
    private void modifyGetXRot(CallbackInfoReturnable<Float> callbackInfoReturnable) {
        c\u0455pi c\u0455pi2 = \u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0430o\u0441\u0456p\u0455().\u0441c\u0458\u043e\u0430(\u0430\u04bb\u0441oe\u0430\u04bb.class);
        if (c\u0455pi2 != null && this.shouldApplyMotionCamera()) {
            callbackInfoReturnable.setReturnValue((Object)Float.valueOf(\u0430\u04bb\u0441oe\u0430\u04bb.\u0456jp\u0456()));
        }
    }

    @Inject(method={"method_19330"}, at={@At(value="HEAD")}, cancellable=true)
    private void modifyGetYRot(CallbackInfoReturnable<Float> callbackInfoReturnable) {
        c\u0455pi c\u0455pi2 = \u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0430o\u0441\u0456p\u0455().\u0441c\u0458\u043e\u0430(\u0430\u04bb\u0441oe\u0430\u04bb.class);
        if (c\u0455pi2 != null && this.shouldApplyMotionCamera()) {
            callbackInfoReturnable.setReturnValue((Object)Float.valueOf(\u0430\u04bb\u0441oe\u0430\u04bb.j\u0456\u0440\u0441s()));
        }
    }

    @Inject(method={"method_19321"}, at={@At(value="TAIL")})
    private void onUpdate(class_1922 class_19222, class_1297 class_12972, boolean bl, boolean bl2, float f, CallbackInfo callbackInfo) {
        \u0430\u04bb\u0441oe\u0430\u04bb.\u0455\u04bbae(this.field_18717, this.field_18718, this.field_18712);
    }
}

