/*
 * Decompiled with CFR 0.152.
 */
package tech.naven.y;

import c\u0445is.cac\u0445;
import c\u0445is.j\u0435ooc;
import c\u0445is.j\u0441cj;
import net.minecraft.class_1291;
import net.minecraft.class_1294;
import net.minecraft.class_1297;
import net.minecraft.class_1299;
import net.minecraft.class_1309;
import net.minecraft.class_1937;
import net.minecraft.class_310;
import net.minecraft.class_6880;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import \u0440o\u0456\u0445o.\u0445\u0440\u0430\u0435\u0445\u043e;
import \u0445\u0430p\u0440.\u0455\u0455pe;
import \u0445\u0430p\u0440.\u04bbc\u0456pxoe;

/*
 * Renamed from tech.naven.Y.a
 */
@Mixin(value={class_1309.class})
public abstract class a_0
extends class_1297 {
    public a_0(class_1299<?> class_12992, class_1937 class_19372) {
        super(class_12992, class_19372);
    }

    @Redirect(at=@At(value="INVOKE", target="Lnet/minecraft/class_1309;method_36454()F", ordinal=0), method={"method_6043"})
    private float modifyJumpYaw(class_1309 class_13092) {
        j\u0441cj j\u0441cj2 = new j\u0441cj(class_13092.method_36454());
        \u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0458poi\u0440().\u0435ecjj\u0458(j\u0441cj2);
        return j\u0441cj2.jo\u0456c\u043e\u0440();
    }

    @Redirect(method={"method_6091"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_1309;method_36455()F"))
    private float hookModifyFallFlyingPitch(class_1309 class_13092) {
        j\u0435ooc j\u0435ooc2 = new j\u0435ooc(class_13092.method_36455());
        \u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0458poi\u0440().\u0435ecjj\u0458(j\u0435ooc2);
        return j\u0435ooc2.xpx();
    }

    @Inject(method={"method_6059"}, at={@At(value="HEAD")}, cancellable=true)
    private void hasEffect(class_6880<class_1291> class_68802, CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        class_1309 class_13092 = (class_1309)this;
        if (class_13092 == class_310.method_1551().field_1724) {
            \u04bbc\u0456pxoe \u04bbc\u0456pxoe2 = (\u04bbc\u0456pxoe)\u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0430o\u0441\u0456p\u0455().\u0441c\u0458\u043e\u0430(\u04bbc\u0456pxoe.class);
            if (class_68802.method_55838(class_1294.field_5925) && \u04bbc\u0456pxoe2.\u0440\u0435\u0455x\u0435xe()) {
                callbackInfoReturnable.setReturnValue((Object)true);
                callbackInfoReturnable.cancel();
            }
            \u0455\u0455pe \u0455\u0455pe2 = (\u0455\u0455pe)\u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0430o\u0441\u0456p\u0455().\u0441c\u0458\u043e\u0430(\u0455\u0455pe.class);
            if (class_68802.method_55838(class_1294.field_5916) && \u0455\u0455pe2.\u0440\u0435\u0455x\u0435xe()) {
                callbackInfoReturnable.setReturnValue((Object)false);
                callbackInfoReturnable.cancel();
            }
        }
    }

    @Redirect(at=@At(value="INVOKE", target="Lnet/minecraft/class_1309;method_36454()F"), method={"method_6031"})
    private float modifyHeadYaw(class_1309 class_13092) {
        if (class_13092 == class_310.method_1551().field_1724) {
            cac\u0445 cac\u04452 = new cac\u0445(class_13092.method_36454(), 0.0f, 0.0f, 0.0f);
            \u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0458poi\u0440().\u0435ecjj\u0458(cac\u04452);
            return cac\u04452.jo\u0456c\u043e\u0440();
        }
        return class_13092.method_36454();
    }
}

