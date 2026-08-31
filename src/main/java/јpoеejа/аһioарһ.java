/*
 * Decompiled with CFR 0.152.
 */
package \u0458po\u0435ej\u0430;

import asp\u04bb.\u0430phj;
import java.util.Optional;
import org.jetbrains.annotations.Nullable;
import \u0458po\u0435ej\u0430.j\u0445ep;
import \u0458po\u0435ej\u0430.p\u0455\u0455;
import \u0458po\u0435ej\u0430.xi\u0441joc\u0430;
import \u0458po\u0435ej\u0430.\u043e\u0441xc\u0458\u0430;
import \u04bb\u04bb\u0456\u0445.\u0435\u043ea\u0440\u0458;

public interface \u0430\u04bbio\u0430\u0440\u04bb {
    public xi\u0441joc\u0430 primaryPaletteKeyColor();

    public xi\u0441joc\u0430 secondaryPaletteKeyColor();

    public xi\u0441joc\u0430 tertiaryPaletteKeyColor();

    public xi\u0441joc\u0430 neutralPaletteKeyColor();

    public xi\u0441joc\u0430 neutralVariantPaletteKeyColor();

    public xi\u0441joc\u0430 errorPaletteKeyColor();

    public xi\u0441joc\u0430 background();

    public xi\u0441joc\u0430 onBackground();

    public xi\u0441joc\u0430 surface();

    public xi\u0441joc\u0430 surfaceDim();

    public xi\u0441joc\u0430 surfaceBright();

    public xi\u0441joc\u0430 surfaceContainerLowest();

    public xi\u0441joc\u0430 surfaceContainerLow();

    public xi\u0441joc\u0430 surfaceContainer();

    public xi\u0441joc\u0430 surfaceContainerHigh();

    public xi\u0441joc\u0430 surfaceContainerHighest();

    public xi\u0441joc\u0430 onSurface();

    public xi\u0441joc\u0430 surfaceVariant();

    public xi\u0441joc\u0430 onSurfaceVariant();

    public xi\u0441joc\u0430 inverseSurface();

    public xi\u0441joc\u0430 inverseOnSurface();

    public xi\u0441joc\u0430 outline();

    public xi\u0441joc\u0430 outlineVariant();

    public xi\u0441joc\u0430 shadow();

    public xi\u0441joc\u0430 scrim();

    public xi\u0441joc\u0430 surfaceTint();

    public xi\u0441joc\u0430 primary();

    @Nullable
    public xi\u0441joc\u0430 primaryDim();

    public xi\u0441joc\u0430 onPrimary();

    public xi\u0441joc\u0430 primaryContainer();

    public xi\u0441joc\u0430 onPrimaryContainer();

    public xi\u0441joc\u0430 inversePrimary();

    public xi\u0441joc\u0430 secondary();

    @Nullable
    public xi\u0441joc\u0430 secondaryDim();

    public xi\u0441joc\u0430 onSecondary();

    public xi\u0441joc\u0430 secondaryContainer();

    public xi\u0441joc\u0430 onSecondaryContainer();

    public xi\u0441joc\u0430 tertiary();

    @Nullable
    public xi\u0441joc\u0430 tertiaryDim();

    public xi\u0441joc\u0430 onTertiary();

    public xi\u0441joc\u0430 tertiaryContainer();

    public xi\u0441joc\u0430 onTertiaryContainer();

    public xi\u0441joc\u0430 error();

    @Nullable
    public xi\u0441joc\u0430 errorDim();

    public xi\u0441joc\u0430 onError();

    public xi\u0441joc\u0430 errorContainer();

    public xi\u0441joc\u0430 onErrorContainer();

    public xi\u0441joc\u0430 primaryFixed();

    public xi\u0441joc\u0430 primaryFixedDim();

    public xi\u0441joc\u0430 onPrimaryFixed();

    public xi\u0441joc\u0430 onPrimaryFixedVariant();

    public xi\u0441joc\u0430 secondaryFixed();

    public xi\u0441joc\u0430 secondaryFixedDim();

    public xi\u0441joc\u0430 onSecondaryFixed();

    public xi\u0441joc\u0430 onSecondaryFixedVariant();

    public xi\u0441joc\u0430 tertiaryFixed();

    public xi\u0441joc\u0430 tertiaryFixedDim();

    public xi\u0441joc\u0430 onTertiaryFixed();

    public xi\u0441joc\u0430 onTertiaryFixedVariant();

    public xi\u0441joc\u0430 controlActivated();

    public xi\u0441joc\u0430 controlNormal();

    public xi\u0441joc\u0430 controlHighlight();

    public xi\u0441joc\u0430 textPrimaryInverse();

    public xi\u0441joc\u0430 textSecondaryAndTertiaryInverse();

    public xi\u0441joc\u0430 textPrimaryInverseDisableOnly();

    public xi\u0441joc\u0430 textSecondaryAndTertiaryInverseDisabled();

    public xi\u0441joc\u0430 textHintInverse();

    public xi\u0441joc\u0430 highestSurface(\u043e\u0441xc\u0458\u0430 var1);

    public \u0435\u043ea\u0440\u0458 getHct(\u043e\u0441xc\u0458\u0430 var1, xi\u0441joc\u0430 var2);

    public double getTone(\u043e\u0441xc\u0458\u0430 var1, xi\u0441joc\u0430 var2);

    public \u0430phj getPrimaryPalette(p\u0455\u0455 var1, \u0435\u043ea\u0440\u0458 var2, boolean var3, j\u0445ep var4, double var5);

    public \u0430phj getSecondaryPalette(p\u0455\u0455 var1, \u0435\u043ea\u0440\u0458 var2, boolean var3, j\u0445ep var4, double var5);

    public \u0430phj getTertiaryPalette(p\u0455\u0455 var1, \u0435\u043ea\u0440\u0458 var2, boolean var3, j\u0445ep var4, double var5);

    public \u0430phj getNeutralPalette(p\u0455\u0455 var1, \u0435\u043ea\u0440\u0458 var2, boolean var3, j\u0445ep var4, double var5);

    public \u0430phj getNeutralVariantPalette(p\u0455\u0455 var1, \u0435\u043ea\u0440\u0458 var2, boolean var3, j\u0445ep var4, double var5);

    public Optional<\u0430phj> getErrorPalette(p\u0455\u0455 var1, \u0435\u043ea\u0440\u0458 var2, boolean var3, j\u0445ep var4, double var5);
}

