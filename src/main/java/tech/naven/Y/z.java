/*
 * Decompiled with CFR 0.152.
 */
package tech.naven.Y;

import c\u0445is.\u043e\u0458o\u0445xp\u0440;
import net.minecraft.class_743;
import net.minecraft.class_744;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import \u0440o\u0456\u0445o.\u0445\u0440\u0430\u0435\u0445\u043e;

@Mixin(value={class_743.class})
public class z
extends class_744 {
    @Inject(at={@At(value="TAIL")}, method={"method_3129"})
    private void onTickTail(boolean bl, float f, CallbackInfo callbackInfo) {
        float f2 = this.field_3910 == this.field_3909 ? 0.0f : (this.field_3905 = this.field_3910 ? 1.0f : -1.0f);
        this.field_3907 = this.field_3908 == this.field_3906 ? 0.0f : (this.field_3908 ? 1.0f : -1.0f);
        \u043e\u0458o\u0445xp\u0440 \u043e\u0458o\u0445xp\u04402 = new \u043e\u0458o\u0445xp\u0440(this.field_3905, this.field_3907, this.field_3904, this.field_3903, 0.3);
        \u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0458poi\u0440().\u0435ecjj\u0458(\u043e\u0458o\u0445xp\u04402);
        double d = \u043e\u0458o\u0445xp\u04402.\u0445\u0435ojh();
        this.field_3905 = \u043e\u0458o\u0445xp\u04402.\u0458\u0430\u0441\u0441\u0458c\u0455();
        this.field_3907 = \u043e\u0458o\u0445xp\u04402.ej\u0435\u0430c();
        this.field_3904 = \u043e\u0458o\u0445xp\u04402.\u0440iha();
        this.field_3903 = \u043e\u0458o\u0445xp\u04402.i\u0455exo();
        if (bl) {
            this.field_3907 = (float)((double)this.field_3907 * d);
            this.field_3905 = (float)((double)this.field_3905 * d);
        }
    }
}

