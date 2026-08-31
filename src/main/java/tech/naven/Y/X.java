/*
 * Decompiled with CFR 0.152.
 */
package tech.naven.Y;

import com.mojang.authlib.GameProfile;
import c\u0445is.hoi\u0435h\u0440;
import c\u0445is.\u0430\u0456i\u043ephj;
import c\u0445is.\u0440\u0458hh;
import net.minecraft.class_1297;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2828;
import net.minecraft.class_2848;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_634;
import net.minecraft.class_638;
import net.minecraft.class_742;
import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import \u043e\u0445\u0440\u0430ose.i\u0456\u0445\u0430\u0441p;
import \u0440o\u0456\u0445o.\u0445\u0440\u0430\u0435\u0445\u043e;

@Mixin(value={class_746.class})
public abstract class X
extends class_742 {
    @Shadow
    @Final
    public class_634 field_3944;
    @Shadow
    private boolean field_3936;
    @Shadow
    private double field_3926;
    @Shadow
    private double field_3940;
    @Shadow
    private double field_3924;
    @Shadow
    private float field_3941;
    @Shadow
    private float field_3925;
    @Shadow
    private int field_3923;
    @Shadow
    private boolean field_3920;
    @Shadow
    private boolean field_3927;
    @Shadow
    @Final
    protected class_310 field_3937;

    @Shadow
    protected abstract boolean method_3134();

    @Shadow
    protected abstract void method_46742();

    public X(class_638 class_6382, GameProfile gameProfile) {
        super(class_6382, gameProfile);
    }

    @Inject(method={"method_5773"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_742;method_5773()V")}, cancellable=true)
    public void injectUpdateEvent(CallbackInfo callbackInfo) {
        hoi\u0435h\u0440 hoi\u0435h\u04402 = new hoi\u0435h\u0440();
        \u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0458poi\u0440().\u0435ecjj\u0458(hoi\u0435h\u04402);
        if (hoi\u0435h\u04402.isCancelled()) {
            callbackInfo.cancel();
        }
    }

    @Overwrite
    private void method_3136() {
        \u0430\u0456i\u043ephj \u0430\u0456i\u043ephj2 = new \u0430\u0456i\u043ephj(i\u0456\u0445\u0430\u0441p.cc\u0441, this.method_23317(), this.method_23318(), this.method_23321(), this.method_36454(), this.method_36455(), this.method_24828());
        \u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0458poi\u0440().\u0435ecjj\u0458(\u0430\u0456i\u043ephj2);
        if (\u0430\u0456i\u043ephj2.isCancelled()) {
            \u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0458poi\u0440().\u0435ecjj\u0458(new \u0430\u0456i\u043ephj(i\u0456\u0445\u0430\u0441p.\u0456\u0458ep\u0430c\u0440, \u0430\u0456i\u043ephj2.jo\u0456c\u043e\u0440(), \u0430\u0456i\u043ephj2.xpx()));
        } else {
            this.method_46742();
            boolean bl = this.method_5715();
            if (bl != this.field_3936) {
                class_2848.class_2849 class_28492 = bl ? class_2848.class_2849.field_12979 : class_2848.class_2849.field_12984;
                this.field_3944.method_52787((class_2596)new class_2848((class_1297)this, class_28492));
                this.field_3936 = bl;
            }
            if (this.method_3134()) {
                boolean bl2;
                double d = \u0430\u0456i\u043ephj2.a\u0458ea\u0440c\u0441() - this.field_3926;
                double d2 = \u0430\u0456i\u043ephj2.i\u0440x\u0435\u0430hj() - this.field_3940;
                double d3 = \u0430\u0456i\u043ephj2.\u0440\u0456\u0441\u0445\u043e\u04bbo() - this.field_3924;
                double d4 = \u0430\u0456i\u043ephj2.jo\u0456c\u043e\u0440() - this.field_3941;
                double d5 = \u0430\u0456i\u043ephj2.xpx() - this.field_3925;
                ++this.field_3923;
                boolean bl3 = class_3532.method_41190((double)d, (double)d2, (double)d3) > class_3532.method_33723((double)2.0E-4) || this.field_3923 >= 20;
                boolean bl4 = bl2 = d4 != 0.0 || d5 != 0.0;
                if (this.method_5765()) {
                    class_243 class_2432 = this.method_18798();
                    this.field_3944.method_52787((class_2596)new class_2828.class_2830(class_2432.field_1352, -999.0, class_2432.field_1350, \u0430\u0456i\u043ephj2.jo\u0456c\u043e\u0440(), \u0430\u0456i\u043ephj2.xpx(), \u0430\u0456i\u043ephj2.aech\u0445sp()));
                    bl3 = false;
                } else if (bl3 && bl2) {
                    this.field_3944.method_52787((class_2596)new class_2828.class_2830(\u0430\u0456i\u043ephj2.a\u0458ea\u0440c\u0441(), \u0430\u0456i\u043ephj2.i\u0440x\u0435\u0430hj(), \u0430\u0456i\u043ephj2.\u0440\u0456\u0441\u0445\u043e\u04bbo(), \u0430\u0456i\u043ephj2.jo\u0456c\u043e\u0440(), \u0430\u0456i\u043ephj2.xpx(), \u0430\u0456i\u043ephj2.aech\u0445sp()));
                } else if (bl3) {
                    this.field_3944.method_52787((class_2596)new class_2828.class_2829(\u0430\u0456i\u043ephj2.a\u0458ea\u0440c\u0441(), \u0430\u0456i\u043ephj2.i\u0440x\u0435\u0430hj(), \u0430\u0456i\u043ephj2.\u0440\u0456\u0441\u0445\u043e\u04bbo(), \u0430\u0456i\u043ephj2.aech\u0445sp()));
                } else if (bl2) {
                    this.field_3944.method_52787((class_2596)new class_2828.class_2831(\u0430\u0456i\u043ephj2.jo\u0456c\u043e\u0440(), \u0430\u0456i\u043ephj2.xpx(), \u0430\u0456i\u043ephj2.aech\u0445sp()));
                } else if (this.field_3920 != \u0430\u0456i\u043ephj2.aech\u0445sp()) {
                    this.field_3944.method_52787((class_2596)new class_2828.class_5911(\u0430\u0456i\u043ephj2.aech\u0445sp()));
                }
                if (bl3) {
                    this.field_3926 = \u0430\u0456i\u043ephj2.a\u0458ea\u0440c\u0441();
                    this.field_3940 = \u0430\u0456i\u043ephj2.i\u0440x\u0435\u0430hj();
                    this.field_3924 = \u0430\u0456i\u043ephj2.\u0440\u0456\u0441\u0445\u043e\u04bbo();
                    this.field_3923 = 0;
                }
                if (bl2) {
                    this.field_3941 = \u0430\u0456i\u043ephj2.jo\u0456c\u043e\u0440();
                    this.field_3925 = \u0430\u0456i\u043ephj2.xpx();
                }
                this.field_3920 = \u0430\u0456i\u043ephj2.aech\u0445sp();
                this.field_3927 = (Boolean)this.field_3937.field_1690.method_42423().method_41753();
            }
            \u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0458poi\u0440().\u0435ecjj\u0458(new \u0430\u0456i\u043ephj(i\u0456\u0445\u0430\u0441p.\u0456\u0458ep\u0430c\u0440, \u0430\u0456i\u043ephj2.jo\u0456c\u043e\u0440(), \u0430\u0456i\u043ephj2.xpx()));
        }
    }

    @Redirect(method={"method_6007"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_746;method_6115()Z", ordinal=0))
    public boolean onSlowdown(class_746 class_7462) {
        \u0440\u0458hh \u0440\u0458hh2 = new \u0440\u0458hh(class_7462.method_6115());
        \u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0458poi\u0440().\u0435ecjj\u0458(\u0440\u0458hh2);
        return \u0440\u0458hh2.o\u0435\u0440\u0435\u0445();
    }
}

