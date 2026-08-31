/*
 * Decompiled with CFR 0.152.
 */
package tech.naven.Y;

import net.minecraft.class_5223;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import \u0440\u0440e.ca\u0458s\u0440;
import \u0445\u0430p\u0440.\u0430\u04bbh\u0435\u043e\u04bba;

@Mixin(value={class_5223.class}, priority=2000)
public class g {
    @ModifyVariable(method={"method_27473"}, at=@At(value="HEAD"), ordinal=0, argsOnly=true)
    private static String injectReplace(String string) {
        if (string == null || string.isEmpty()) {
            return string;
        }
        String string2 = string;
        if (\u0430\u04bbh\u0435\u043e\u04bba.\u0440ec\u0455c != null && \u0430\u04bbh\u0435\u043e\u04bba.\u0440ec\u0455c.\u0440\u0435\u0455x\u0435xe()) {
            string2 = \u0430\u04bbh\u0435\u043e\u04bba.\u0430\u0435j\u0435x\u0430(string2);
        }
        if (ca\u0458s\u0440.\u0455x\u0455x != null && ca\u0458s\u0440.\u0455x\u0455x.\u0440\u0435\u0455x\u0435xe() && ca\u0458s\u0440.\u0455x\u0455x.s\u0455ha\u0445.axpacc()) {
            string2 = ca\u0458s\u0440.h\u0445ae\u0430\u0441(string2);
        }
        return string2;
    }
}

