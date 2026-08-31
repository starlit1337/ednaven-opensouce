/*
 * Decompiled with CFR 0.152.
 */
package tech.naven.Y;

import ie\u0441\u0430ej.\u0441\u0455\u043e\u04bb;
import java.util.List;
import java.util.function.Predicate;
import net.minecraft.class_1297;
import net.minecraft.class_1675;
import net.minecraft.class_1937;
import net.minecraft.class_238;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value={class_1675.class})
public class E {
    @Redirect(method={"method_18075"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_1937;method_8333(Lnet/minecraft/class_1297;Lnet/minecraft/class_238;Ljava/util/function/Predicate;)Ljava/util/List;"))
    private static List<class_1297> hook(class_1937 class_19372, class_1297 class_12973, class_238 class_2382, Predicate<? super class_1297> predicate) {
        List list = class_19372.method_8333(class_12973, class_2382, predicate);
        list.removeIf(class_12972 -> class_12972 instanceof \u0441\u0455\u043e\u04bb);
        return list;
    }
}

