/*
 * Decompiled with CFR 0.152.
 */
package tech.naven.y;

import com.mojang.blaze3d.systems.RenderSystem;
import c\u0445is.i\u0456o\u0430\u0435o;
import c\u0445is.s\u0456a\u0458;
import c\u0445is.\u043eps\u0435\u0440o\u0430;
import ie\u0441\u0430ej.hcce;
import net.minecraft.class_1309;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_4599;
import net.minecraft.class_757;
import net.minecraft.class_7833;
import org.joml.Matrix4fc;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import \u0440o\u0456\u0445o.\u0445\u0440\u0430\u0435\u0445\u043e;
import \u0445\u0430p\u0440.hh\u0458\u043e\u0445;
import \u0445\u0430p\u0440.\u04bbc\u0456pxoe;
import \u0445\u0430p\u0440.\u04bb\u0455j\u0458\u0458;

/*
 * Renamed from tech.naven.Y.m
 */
@Mixin(value={class_757.class})
public abstract class m_0 {
    @Shadow
    @Final
    class_310 field_4015;
    @Shadow
    @Final
    private class_4599 field_20948;

    @Inject(method={"method_3188"}, at={@At(value="FIELD", target="Lnet/minecraft/class_757;field_3992:Z", opcode=180, ordinal=0)})
    private void renderLevel(float f, long l2, CallbackInfo callbackInfo) {
        class_4587 class_45872 = new class_4587();
        class_4184 class_41842 = this.field_4015.field_1773.method_19418();
        class_45872.method_22907(class_7833.field_40714.rotationDegrees(class_41842.method_19329()));
        class_45872.method_22907(class_7833.field_40716.rotationDegrees(class_41842.method_19330() + 180.0f));
        i\u0456o\u0430\u0435o i\u0456o\u0430\u0435o2 = new i\u0456o\u0430\u0435o(f, class_45872);
        \u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0458poi\u0440().\u0435ecjj\u0458(i\u0456o\u0430\u0435o2);
    }

    @Inject(method={"method_3192"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_329;method_1753(Lnet/minecraft/class_332;F)V")})
    public void render1(float f, long l2, boolean bl, CallbackInfo callbackInfo) {
        if (\u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0458poi\u0440().i\u0456\u0456\u0430j(\u043eps\u0435\u0440o\u0430.class)) {
            \u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0458poi\u0440().\u0435ecjj\u0458(new \u043eps\u0435\u0440o\u0430(f));
        }
    }

    @Inject(at={@At(value="FIELD", target="Lnet/minecraft/class_757;field_3992:Z", opcode=180, ordinal=0)}, method={"method_3188"})
    void render3dHook(float f, long l2, CallbackInfo callbackInfo) {
        hcce.\u0440xh\u04bbi.set((Matrix4fc)RenderSystem.getProjectionMatrix());
        hcce.poe\u04bb\u043e\u0455\u043e.set((Matrix4fc)RenderSystem.getModelViewMatrix());
        hcce.\u0441ij\u0458\u0455\u0456\u0456.set((Matrix4fc)RenderSystem.getModelViewMatrix());
    }

    @Inject(method={"method_3174"}, at={@At(value="HEAD")}, cancellable=true)
    private static void getNightVisionScale(class_1309 class_13092, float f, CallbackInfoReturnable<Float> callbackInfoReturnable) {
        \u04bbc\u0456pxoe \u04bbc\u0456pxoe2 = (\u04bbc\u0456pxoe)\u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0430o\u0441\u0456p\u0455().\u0441c\u0458\u043e\u0430(\u04bbc\u0456pxoe.class);
        if (\u04bbc\u0456pxoe2.\u0440\u0435\u0455x\u0435xe()) {
            callbackInfoReturnable.setReturnValue((Object)Float.valueOf(\u04bbc\u0456pxoe2.ic\u0440a\u0441\u0455a.axpacc()));
            callbackInfoReturnable.cancel();
        }
    }

    @Inject(method={"method_3192"}, at={@At(value="TAIL")})
    public void render(float f, long l2, boolean bl, CallbackInfo callbackInfo) {
        hh\u0458\u043e\u0445 hh\u0458\u043e\u04452 = hh\u0458\u043e\u0445.\u043e\u0445\u0458;
        if (hh\u0458\u043e\u04452.\u0440\u0435\u0455x\u0435xe() && this.field_4015.field_1724 != null && hh\u0458\u043e\u04452.x\u0456\u0430\u043ee\u0435\u0435 != null) {
            hh\u0458\u043e\u04452.x\u0456\u0430\u043ee\u0435\u0435.method_1258(f);
        }
    }

    @Inject(method={"method_3192"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_329;method_1753(Lnet/minecraft/class_332;F)V")})
    public void injectRender2DEvent(float f, long l2, boolean bl, CallbackInfo callbackInfo) {
        if (!\u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0458poi\u0440().i\u0456\u0456\u0430j(s\u0456a\u0458.class)) {
            return;
        }
        class_332 class_3322 = new class_332(this.field_4015, this.field_20948.method_23000());
        s\u0456a\u0458 s\u0456a\u04582 = new s\u0456a\u0458(class_3322.method_51448(), class_3322);
        \u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0458poi\u0440().\u0435ecjj\u0458(s\u0456a\u04582);
    }

    @Inject(method={"method_3198"}, at={@At(value="HEAD")}, cancellable=true)
    private void bobHurt(class_4587 class_45872, float f, CallbackInfo callbackInfo) {
        \u04bb\u0455j\u0458\u0458 \u04bb\u0455j\u0458\u04582 = (\u04bb\u0455j\u0458\u0458)\u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0430o\u0441\u0456p\u0455().\u0441c\u0458\u043e\u0430(\u04bb\u0455j\u0458\u0458.class);
        if (\u04bb\u0455j\u0458\u04582.\u0440\u0435\u0455x\u0435xe()) {
            callbackInfo.cancel();
        }
    }
}

