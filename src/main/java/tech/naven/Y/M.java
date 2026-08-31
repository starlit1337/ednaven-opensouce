/*
 * Decompiled with CFR 0.152.
 */
package tech.naven.Y;

import ao\u0430\u0441sxi.pxx\u0445\u0458;
import c\u0445is.h\u0430p\u043ee\u0440;
import c\u0445is.si\u0458\u04bbo\u0440;
import c\u0445is.\u0430j\u0445;
import ie\u0441\u0430ej.h\u0456ap\u0435oi;
import ie\u0441\u0430ej.jhas;
import java.io.File;
import net.minecraft.class_1041;
import net.minecraft.class_1297;
import net.minecraft.class_310;
import net.minecraft.class_315;
import net.minecraft.class_32;
import net.minecraft.class_3283;
import net.minecraft.class_434;
import net.minecraft.class_437;
import net.minecraft.class_442;
import net.minecraft.class_542;
import net.minecraft.class_638;
import net.minecraft.class_6904;
import net.minecraft.class_8032;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import xs\u0441\u0445oa\u0430.exax\u04bb;
import \u0430\u0435\u0435.\u0440\u0435eh;
import \u043e\u0445\u0440\u0430ose.i\u0456\u0445\u0430\u0441p;
import \u0440o\u0456\u0445o.\u0445\u0440\u0430\u0435\u0445\u043e;
import \u0440\u0440\u0440.\u0441\u0445s;
import \u0445\u0430p\u0440.\u043ex\u0458\u043exxj;
import \u0455hs.\u0440ox\u043e\u0456;

@Mixin(value={class_310.class})
public abstract class M
implements h\u0456ap\u0435oi {
    @Unique
    private int skipTicks;
    @Unique
    private long naven_Modern$lastFrame = System.nanoTime();
    @Shadow
    @Final
    private class_1041 field_1704;
    @Shadow
    @Final
    public class_315 field_1690;
    @Unique
    private File assetDir;

    @Shadow
    public abstract void method_1507(class_437 var1);

    @Override
    public File getAssetDir() {
        return this.assetDir;
    }

    @Inject(method={"<init>"}, at={@At(value="TAIL")})
    public void onInit(class_542 class_5422, CallbackInfo callbackInfo) {
        this.assetDir = class_5422.field_3277.field_3289;
    }

    @Inject(method={"method_29610"}, at={@At(value="HEAD")})
    public void doWorldLoad(class_32.class_5143 class_51432, class_3283 class_32832, class_6904 class_69042, boolean bl, CallbackInfo callbackInfo) {
        \u0440\u0435eh.\u0435ie\u0440\u0445\u0430();
        if (!\u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().ph\u0445().h\u0440h\u0440\u0445()) {
            \u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().ph\u0445().close();
        }
    }

    @ModifyVariable(method={"method_1507"}, at=@At(value="HEAD"), argsOnly=true)
    private class_437 redirectGlobalSetScreen(class_437 class_4372) {
        if (class_4372 instanceof class_442) {
            return new pxx\u0445\u0458();
        }
        return class_4372;
    }

    @Inject(method={"method_49294"}, at={@At(value="RETURN")})
    private void redirectTitleScreenToMainMenu(CallbackInfo callbackInfo) {
        class_310.method_1551().method_1507((class_437)new pxx\u0445\u0458());
    }

    @Inject(method={"method_53527"}, at={@At(value="HEAD")}, cancellable=true)
    private void hookBuild(class_310.class_8764 class_87642, CallbackInfoReturnable<Runnable> callbackInfoReturnable) {
        callbackInfoReturnable.setReturnValue(() -> {
            if (this.field_1690.field_41785) {
                this.method_1507((class_437)new class_8032(this.field_1690, () -> this.method_1507(new pxx\u0445\u0458())));
            } else {
                this.method_1507(new pxx\u0445\u0458());
            }
        });
    }

    @Inject(method={"<init>"}, at={@At(value="TAIL")})
    private void onInit(CallbackInfo callbackInfo) {
        \u0440ox\u043e\u0456.ixx\u0445(this.field_1704.method_4489(), this.field_1704.method_4506());
        \u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().c\u0445\u04bbx();
    }

    @Inject(method={"method_1481"}, at={@At(value="HEAD")})
    private void hookWorldChangeEvent(class_638 class_6382, class_434.class_9678 class_96782, CallbackInfo callbackInfo) {
        \u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0458poi\u0440().\u0435ecjj\u0458(new h\u0430p\u043ee\u0440(class_6382));
    }

    @Inject(method={"close"}, at={@At(value="HEAD")}, remap=false)
    private void shutdown(CallbackInfo callbackInfo) {
        if (\u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c() != null && \u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0458poi\u0440() != null) {
            \u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0440\u0455x\u0456().\u0441sp();
        }
    }

    @Inject(method={"method_1574"}, at={@At(value="HEAD")})
    private void tickPre(CallbackInfo callbackInfo) {
        if (\u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c() != null && \u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0458poi\u0440() != null) {
            \u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0458poi\u0440().\u0435ecjj\u0458(new \u0430j\u0445(i\u0456\u0445\u0430\u0441p.cc\u0441));
        }
    }

    @Inject(method={"method_1574"}, at={@At(value="TAIL")})
    private void tickPost(CallbackInfo callbackInfo) {
        if (\u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c() != null && \u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0458poi\u0440() != null) {
            \u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0458poi\u0440().\u0435ecjj\u0458(new \u0430j\u0445(i\u0456\u0445\u0430\u0441p.\u0456\u0458ep\u0430c\u0440));
        }
    }

    @Inject(method={"method_27022"}, at={@At(value="RETURN")}, cancellable=true)
    private void shouldEntityAppearGlowing(class_1297 class_12972, CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        if (\u043ex\u0458\u043exxj.\u0445xp\u0430.ao\u0455x.cip("Glow") && \u043ex\u0458\u043exxj.xa\u0445\u04bbc(class_12972)) {
            callbackInfoReturnable.setReturnValue((Object)true);
        }
    }

    @Inject(method={"method_1523"}, at={@At(value="HEAD")})
    private void runTick(CallbackInfo callbackInfo) {
        long l2 = System.nanoTime();
        float f = Math.min((float)(l2 - this.naven_Modern$lastFrame) / 1000000.0f, 100.0f);
        this.naven_Modern$lastFrame = l2;
        jhas.\u04bbixii = f;
        \u0441\u0445s.\u04bb\u0440\u0440j\u0440i();
    }

    @ModifyArg(method={"method_1523"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_757;method_3192(FJZ)V"))
    private float fixSkipTicks(float f) {
        if (this.skipTicks > 0) {
            f = 0.0f;
        }
        return f;
    }

    @Inject(method={"method_1508"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_746;method_6115()Z", ordinal=0)}, cancellable=true)
    private void clickEvent(CallbackInfo callbackInfo) {
        if (\u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c() != null && \u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0458poi\u0440() != null) {
            si\u0458\u04bbo\u0440 si\u0458\u04bbo\u04402 = new si\u0458\u04bbo\u0440();
            \u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0458poi\u0440().\u0435ecjj\u0458(si\u0458\u04bbo\u04402);
            if (si\u0458\u04bbo\u04402.isCancelled()) {
                callbackInfo.cancel();
            }
        }
    }

    @Inject(method={"method_15993"}, at={@At(value="TAIL")})
    public void onResolutionChanged(CallbackInfo callbackInfo) {
        exax\u04bb.e\u0441\u04bbpi\u043eh.\u043e\u0456aj\u0435\u0441();
        exax\u04bb.\u043e\u0455p\u0445ee\u043e.\u043e\u0456aj\u0435\u0441();
    }

    public void setSkipTicks(int n) {
        this.skipTicks = n;
    }
}

