/*
 * Decompiled with CFR 0.152.
 */
package tech.naven.y;

import java.util.List;
import net.minecraft.class_2945;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

/*
 * Renamed from tech.naven.Y.q
 */
@Mixin(value={class_2945.class})
public abstract class q_0 {
    @Shadow
    @Final
    private class_2945.class_2946<?>[] field_13331;

    @ModifyVariable(method={"method_12779"}, at=@At(value="HEAD"), argsOnly=true)
    private List<class_2945.class_7834<?>> filterInvalidValues(List<class_2945.class_7834<?>> list) {
        int n = this.field_13331.length;
        for (class_2945.class_7834<?> class_78343 : list) {
            if (class_78343.comp_1115() >= 0 && class_78343.comp_1115() < n) continue;
            return list.stream().filter(class_78342 -> class_78342.comp_1115() >= 0 && class_78342.comp_1115() < n).toList();
        }
        return list;
    }
}

