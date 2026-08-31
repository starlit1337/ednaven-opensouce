/*
 * Decompiled with CFR 0.152.
 */
package tech.naven.Y;

import c\u0445is.\u0435\u0441\u0441c\u043e\u043e;
import io.netty.channel.SimpleChannelInboundHandler;
import net.minecraft.class_2535;
import net.minecraft.class_2547;
import net.minecraft.class_2596;
import net.minecraft.class_2598;
import net.minecraft.class_7648;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import \u0430\u04bb\u0430.hi\u0440\u04bbas\u0435;
import \u043e\u0445\u0440\u0430ose.i\u0456\u0445\u0430\u0441p;
import \u0440o\u0456\u0445o.\u0445\u0440\u0430\u0435\u0445\u043e;

@Mixin(value={class_2535.class})
public abstract class O
extends SimpleChannelInboundHandler<class_2596<?>> {
    @Shadow
    @Final
    private class_2598 field_11643;

    @Shadow
    private static <T extends class_2547> void method_10759(class_2596<T> class_25962, class_2547 class_25472) {
    }

    @Shadow
    protected abstract void method_10764(class_2596<?> var1, class_7648 var2, boolean var3);

    @Redirect(method={"method_10770"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_2535;method_10759(Lnet/minecraft/class_2596;Lnet/minecraft/class_2547;)V"))
    private void onGenericsFtw(class_2596<?> class_25962, class_2547 class_25472) {
        \u0435\u0441\u0441c\u043e\u043e \u0435\u0441\u0441c\u043e\u043e2 = new \u0435\u0441\u0441c\u043e\u043e(i\u0456\u0445\u0430\u0441p.h\u0430\u043e, class_25962, this.field_11643);
        \u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0458poi\u0440().\u0435ecjj\u0458(\u0435\u0441\u0441c\u043e\u043e2);
        if (!\u0435\u0441\u0441c\u043e\u043e2.isCancelled()) {
            O.method_10759(\u0435\u0441\u0441c\u043e\u043e2.ciao\u0455\u0455(), class_25472);
        }
    }

    @Redirect(method={"method_52906"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_2535;method_10764(Lnet/minecraft/class_2596;Lnet/minecraft/class_7648;Z)V"))
    private void onSend(class_2535 class_25352, class_2596<?> class_25962, class_7648 class_76482, boolean bl) {
        if (hi\u0440\u04bbas\u0435.\u0441x\u0455i\u0435.contains(class_25962)) {
            hi\u0440\u04bbas\u0435.\u0441x\u0455i\u0435.remove(class_25962);
            this.method_10764(class_25962, class_76482, bl);
        } else {
            \u0435\u0441\u0441c\u043e\u043e \u0435\u0441\u0441c\u043e\u043e2 = new \u0435\u0441\u0441c\u043e\u043e(i\u0456\u0445\u0430\u0441p.ospc\u0456, class_25962, this.field_11643);
            \u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0458poi\u0440().\u0435ecjj\u0458(\u0435\u0441\u0441c\u043e\u043e2);
            if (!\u0435\u0441\u0441c\u043e\u043e2.isCancelled()) {
                this.method_10764(\u0435\u0441\u0441c\u043e\u043e2.ciao\u0455\u0455(), class_76482, bl);
            }
        }
    }
}

