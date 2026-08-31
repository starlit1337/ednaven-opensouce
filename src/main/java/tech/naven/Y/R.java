/*
 * Decompiled with CFR 0.152.
 */
package tech.naven.Y;

import c\u0445is.css\u0456co;
import c\u0445is.\u0445\u04bba\u0430\u0458\u043ex;
import c\u0445is.\u0456\u0440sp\u0445\u0456\u0455;
import ie\u0441\u0430ej.\u0441\u0455\u043e\u04bb;
import net.minecraft.class_1297;
import net.minecraft.class_1308;
import net.minecraft.class_1542;
import net.minecraft.class_1657;
import net.minecraft.class_1676;
import net.minecraft.class_1688;
import net.minecraft.class_1690;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import \u0440o\u0456\u0445o.\u0445\u0440\u0430\u0435\u0445\u043e;
import \u0440\u0440e.j\u04bbe\u0430\u0445\u0458\u0458;
import \u0441\u0445o.\u0458op\u0430\u0441;

@Mixin(value={class_1297.class})
public abstract class R {
    @Shadow
    protected class_243 field_17046;

    @Shadow
    public abstract float method_5695(float var1);

    @Shadow
    public abstract float method_5705(float var1);

    @Shadow
    protected abstract class_243 method_5631(float var1, float var2);

    @Overwrite
    public final class_243 method_5828(float f) {
        float f2 = this.method_5695(f);
        float f3 = this.method_5705(f);
        class_1297 class_12972 = (class_1297)this;
        if (class_12972 == class_310.method_1551().field_1724 && \u0458op\u0430\u0441.cjxco\u0430a()) {
            css\u0456co css\u0456co2 = new css\u0456co(class_12972, f3, f2);
            \u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0458poi\u0440().\u0435ecjj\u0458(css\u0456co2);
            f3 = css\u0456co2.\u04bb\u0440x\u04bb\u0440\u0430c;
            f2 = css\u0456co2.\u04bb\u0458s\u0455;
        }
        return this.method_5631(f2, f3);
    }

    @ModifyArg(method={"method_5724"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_1297;method_18795(Lnet/minecraft/class_243;FF)Lnet/minecraft/class_243;", ordinal=0), index=2)
    private float modifyYaw(float f) {
        class_1297 class_12972 = (class_1297)this;
        if (class_12972 != class_310.method_1551().field_1724) {
            return f;
        }
        \u0445\u04bba\u0430\u0458\u043ex \u0445\u04bba\u0430\u0458\u043ex2 = new \u0445\u04bba\u0430\u0458\u043ex(f);
        \u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0458poi\u0440().\u0435ecjj\u0458(\u0445\u04bba\u0430\u0458\u043ex2);
        return \u0445\u04bba\u0430\u0458\u043ex2.jo\u0456c\u043e\u0440();
    }

    @Inject(method={"method_5844"}, at={@At(value="RETURN")})
    private void makeStuckInBlock(class_2680 class_26802, class_243 class_2432, CallbackInfo callbackInfo) {
        class_1297 class_12972 = (class_1297)this;
        if (class_310.method_1551().field_1724 == class_12972) {
            \u0456\u0440sp\u0445\u0456\u0455 \u0456\u0440sp\u0445\u0456\u04552 = new \u0456\u0440sp\u0445\u0456\u0455(class_26802);
            \u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0458poi\u0440().\u0435ecjj\u0458(\u0456\u0440sp\u0445\u0456\u04552);
            if (\u0456\u0440sp\u0445\u0456\u04552.isCancelled()) {
                this.field_17046 = class_243.field_1353;
            }
        }
    }

    @Inject(method={"method_5697"}, at={@At(value="HEAD")}, cancellable=true)
    public void push(class_1297 class_12972, CallbackInfo callbackInfo) {
        if (class_12972 instanceof \u0441\u0455\u043e\u04bb) {
            callbackInfo.cancel();
            return;
        }
        class_1297 class_12973 = (class_1297)this;
        if (class_12973 != class_310.method_1551().field_1724) {
            return;
        }
        j\u04bbe\u0430\u0445\u0458\u0458 j\u04bbe\u0430\u0445\u0458\u04582 = (j\u04bbe\u0430\u0445\u0458\u0458)\u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0430o\u0441\u0456p\u0455().\u0441c\u0458\u043e\u0430(j\u04bbe\u0430\u0445\u0458\u0458.class);
        if (j\u04bbe\u0430\u0445\u0458\u04582.\u0440\u0435\u0455x\u0435xe() && this.shouldCancelPush(class_12972)) {
            callbackInfo.cancel();
        }
    }

    @Unique
    private boolean shouldCancelPush(class_1297 class_12972) {
        return class_12972 instanceof class_1657 || class_12972 instanceof class_1308 || class_12972 instanceof class_1542 || class_12972 instanceof class_1688 || class_12972 instanceof class_1690 || class_12972 instanceof class_1676;
    }
}

