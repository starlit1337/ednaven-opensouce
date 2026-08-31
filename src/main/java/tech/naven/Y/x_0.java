/*
 * Decompiled with CFR 0.152.
 */
package tech.naven.y;

import com.mojang.authlib.properties.Property;
import com.mojang.authlib.yggdrasil.YggdrasilServicesKeyInfo;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

/*
 * Renamed from tech.naven.Y.x
 */
@Mixin(value={YggdrasilServicesKeyInfo.class}, remap=false)
public class x_0 {
    @Overwrite
    public boolean validateProperty(Property property) {
        return true;
    }
}

