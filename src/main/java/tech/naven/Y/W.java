/*
 * Decompiled with CFR 0.152.
 */
package tech.naven.Y;

import com.mojang.blaze3d.systems.RenderSystem;
import c\u0445is.\u0458ppa;
import net.minecraft.class_1657;
import net.minecraft.class_1759;
import net.minecraft.class_1799;
import net.minecraft.class_2561;
import net.minecraft.class_266;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_329;
import net.minecraft.class_332;
import net.minecraft.class_746;
import net.minecraft.class_9020;
import net.minecraft.class_9022;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import \u0440o\u0456\u0445o.\u0445\u0440\u0430\u0435\u0445\u043e;
import \u0445\u0430p\u0440.ac\u0456\u0455;
import \u0445\u0430p\u0440.e\u043ec\u0441;
import \u0445\u0430p\u0440.\u0441ij;

@Mixin(value={class_329.class}, priority=100)
public abstract class W {
    @Final
    @Shadow
    private static class_2960 field_45313;

    @Shadow
    protected abstract void method_1762(class_332 var1, int var2, int var3, float var4, class_1657 var5, class_1799 var6, int var7);

    @Inject(method={"method_1757"}, at={@At(value="HEAD")})
    public void hookScoreboardHead(class_332 class_3322, class_266 class_2662, CallbackInfo callbackInfo) {
        e\u043ec\u0441 e\u043ec\u04412 = (e\u043ec\u0441)\u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0430o\u0441\u0456p\u0455().\u0441c\u0458\u043e\u0430(e\u043ec\u0441.class);
        if (e\u043ec\u04412.\u0440\u0435\u0455x\u0435xe()) {
            class_3322.method_51448().method_22903();
            float f = e\u043ec\u04412.i\u0441\u0456\u0435e.axpacc();
            class_3322.method_51448().method_22905(f, f, 1.0f);
            float f2 = e\u043ec\u04412.\u04bb\u0458\u0435\u0430\u0435.axpacc() / f;
            float f3 = e\u043ec\u04412.s\u0455p\u0456.axpacc() / f;
            class_3322.method_51448().method_46416(f2, f3, 0.0f);
        }
    }

    @Inject(method={"method_1757"}, at={@At(value="RETURN")})
    public void hookScoreboardReturn(class_332 class_3322, class_266 class_2662, CallbackInfo callbackInfo) {
        e\u043ec\u0441 e\u043ec\u04412 = (e\u043ec\u0441)\u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0430o\u0441\u0456p\u0455().\u0441c\u0458\u043e\u0430(e\u043ec\u0441.class);
        if (e\u043ec\u04412.\u0440\u0435\u0455x\u0435xe()) {
            class_3322.method_51448().method_22909();
        }
    }

    @ModifyVariable(method={"method_1757"}, at=@At(value="STORE"), ordinal=0)
    private class_9022 hookHideScore(class_9022 class_90222) {
        e\u043ec\u0441 e\u043ec\u04412 = (e\u043ec\u0441)\u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0430o\u0441\u0456p\u0455().\u0441c\u0458\u043e\u0430(e\u043ec\u0441.class);
        if (e\u043ec\u04412.\u0440\u0435\u0455x\u0435xe() && e\u043ec\u04412.e\u0430p\u0441.axpacc()) {
            return class_9020.field_47557;
        }
        return class_90222;
    }

    @Redirect(method={"method_1757"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_266;method_1114()Lnet/minecraft/class_2561;"))
    public class_2561 hookScoreboardTitle(class_266 class_2662) {
        class_2561 class_25612 = class_2662.method_1114();
        \u0458ppa \u0458ppa2 = new \u0458ppa(class_25612);
        \u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0458poi\u0440().\u0435ecjj\u0458(\u0458ppa2);
        return \u0458ppa2.\u0441\u04bb\u0456c\u0455();
    }

    @Inject(method={"method_1765"}, at={@At(value="HEAD")}, cancellable=true)
    public void hookRenderEffects(class_332 class_3322, float f, CallbackInfo callbackInfo) {
        ac\u0456\u0455 ac\u0456\u04552 = (ac\u0456\u0455)\u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0430o\u0441\u0456p\u0455().\u0441c\u0458\u043e\u0430(ac\u0456\u0455.class);
        if (ac\u0456\u04552.\u0440\u0435\u0455x\u0435xe() && ac\u0456\u04552.jhh\u0455.axpacc()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"method_1759"}, at={@At(value="HEAD")}, cancellable=true)
    private void onRenderHotbar(class_332 class_3322, float f, CallbackInfo callbackInfo) {
        \u0441ij \u0441ij2 = (\u0441ij)\u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0430o\u0441\u0456p\u0455().\u0441c\u0458\u043e\u0430(\u0441ij.class);
        if (class_310.method_1551().field_1724 != null && \u0441ij2.\u0440\u0435\u0455x\u0435xe()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"method_1759"}, at={@At(value="TAIL")})
    private void onCompass(class_332 class_3322, float f, CallbackInfo callbackInfo) {
        int n;
        \u0441ij \u0441ij2 = (\u0441ij)\u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0430o\u0441\u0456p\u0455().\u0441c\u0458\u043e\u0430(\u0441ij.class);
        if (class_310.method_1551().field_1724 != null && \u0441ij2.\u0440\u0435\u0455x\u0435xe()) {
            return;
        }
        class_746 class_7462 = class_310.method_1551().field_1724;
        if (class_7462 == null) {
            return;
        }
        class_1799 class_17992 = class_1799.field_8037;
        for (n = 0; n < class_7462.method_31548().method_5439(); ++n) {
            class_1799 class_17993 = class_7462.method_31548().method_5438(n);
            if (!(class_17993.method_7909() instanceof class_1759)) continue;
            class_17992 = class_17993;
            break;
        }
        if (class_17992.method_7960()) {
            return;
        }
        n = class_3322.method_51421() / 2;
        int n2 = class_3322.method_51443() - 16 - 3;
        RenderSystem.enableBlend();
        class_3322.method_51448().method_22903();
        class_3322.method_51448().method_46416(0.0f, 0.0f, -90.0f);
        class_3322.method_52706(field_45313, n + 91, class_3322.method_51443() - 23, 29, 24);
        class_3322.method_51448().method_22909();
        RenderSystem.disableBlend();
        this.method_1762(class_3322, n + 91 + 10, n2, f, (class_1657)class_7462, class_17992, 0);
    }

    @Redirect(method={"method_1754"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_332;method_52706(Lnet/minecraft/class_2960;IIII)V"))
    private void blockExpBarRender(class_332 class_3322, class_2960 class_29602, int n, int n2, int n3, int n4) {
        \u0441ij \u0441ij2 = (\u0441ij)\u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0430o\u0441\u0456p\u0455().\u0441c\u0458\u043e\u0430(\u0441ij.class);
        if (!\u0441ij2.\u0440\u0435\u0455x\u0435xe()) {
            class_3322.method_52706(class_29602, n, n2, n3, n4);
        }
    }

    @Redirect(method={"method_1754"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_332;method_52708(Lnet/minecraft/class_2960;IIIIIIII)V"))
    private void blockExpBarRender2(class_332 class_3322, class_2960 class_29602, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        \u0441ij \u0441ij2 = (\u0441ij)\u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0430o\u0441\u0456p\u0455().\u0441c\u0458\u043e\u0430(\u0441ij.class);
        if (!\u0441ij2.\u0440\u0435\u0455x\u0435xe()) {
            class_3322.method_52708(class_29602, n, n2, n3, n4, n5, n6, n7, n8);
        }
    }
}

