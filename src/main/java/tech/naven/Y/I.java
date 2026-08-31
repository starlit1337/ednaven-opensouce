/*
 * Decompiled with CFR 0.152.
 */
package tech.naven.Y;

import c\u0445is.\u0445\u0456\u0455\u0456\u0430;
import net.minecraft.class_1299;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1937;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import \u0440o\u0456\u0445o.\u0445\u0440\u0430\u0435\u0445\u043e;

@Mixin(value={class_1657.class})
public abstract class I
extends class_1309 {
    protected I(class_1299<? extends class_1309> class_12992, class_1937 class_19372) {
        super(class_12992, class_19372);
    }

    @Redirect(method={"method_7324"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_1657;method_36454()F"))
    private float hookFixRotation(class_1657 class_16572) {
        \u0445\u0456\u0455\u0456\u0430 \u0445\u0456\u0455\u0456\u04302 = new \u0445\u0456\u0455\u0456\u0430(class_16572.method_36454());
        \u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0458poi\u0440().\u0435ecjj\u0458(\u0445\u0456\u0455\u0456\u04302);
        return \u0445\u0456\u0455\u0456\u04302.jo\u0456c\u043e\u0440();
    }
}

