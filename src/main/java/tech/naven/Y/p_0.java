/*
 * Decompiled with CFR 0.152.
 */
package tech.naven.y;

import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_2561;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_897;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import \u0440o\u0456\u0445o.\u0445\u0440\u0430\u0435\u0445\u043e;
import \u0445\u0430p\u0440.hj\u0440\u0440\u0430h\u0430;

/*
 * Renamed from tech.naven.Y.p
 */
@Mixin(value={class_897.class})
public class p_0<T extends class_1297> {
    @Inject(method={"method_3926"}, at={@At(value="HEAD")}, cancellable=true)
    private void renderNameTag(T t2, class_2561 class_25612, class_4587 class_45872, class_4597 class_45972, int n, float f, CallbackInfo callbackInfo) {
        if (t2 instanceof class_1657 && \u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0430o\u0441\u0456p\u0455().\u0441c\u0458\u043e\u0430(hj\u0440\u0440\u0430h\u0430.class).\u0440\u0435\u0455x\u0435xe()) {
            callbackInfo.cancel();
        }
    }
}

