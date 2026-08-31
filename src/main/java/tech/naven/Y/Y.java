/*
 * Decompiled with CFR 0.152.
 */
package tech.naven.Y;

import ie\u0441\u0430ej.\u0430\u0435ec;
import net.minecraft.class_1922;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(value={class_1922.class})
public interface Y {
    @Overwrite
    default public class_3965 method_17742(class_3959 class_39592) {
        return \u0430\u0435ec.\u0430i\u0456\u043e\u0435((class_1922)this, class_39592);
    }
}

