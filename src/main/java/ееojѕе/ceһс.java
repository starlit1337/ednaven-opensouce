/*
 * Decompiled with CFR 0.152.
 */
package \u0435\u0435oj\u0455\u0435;

import ie\u0441\u0430ej.xx\u0458\u0440\u0440\u0456;
import java.awt.Color;

public interface ce\u04bb\u0441 {
    public static Color withAlpha(Color color, int n) {
        return new Color(color.getRed(), color.getGreen(), color.getBlue(), n);
    }

    public static Color ci\u0458\u0458\u0440(Color color, Color color2, double d) {
        double d2 = 1.0 - d;
        int n = (int)((double)color.getRed() * d + (double)color2.getRed() * d2);
        int n2 = (int)((double)color.getGreen() * d + (double)color2.getGreen() * d2);
        int n3 = (int)((double)color.getBlue() * d + (double)color2.getBlue() * d2);
        int n4 = (int)((double)color.getAlpha() * d + (double)color2.getAlpha() * d2);
        return new Color(n, n2, n3, n4);
    }

    public static Color \u0435ie(Color color, int n) {
        int n2 = color.getRed();
        int n3 = color.getGreen();
        int n4 = color.getBlue();
        return new Color(n2, n3, n4, xx\u0458\u0440\u0440\u0456.ci\u0435\u0430e(n, 0, -1642009997 + 541792460 + (-490760339 + 1590978131)));
    }

    public static Color \u0456\u0455aj(int n, int n2, Color color, float f) {
        float[] fArray = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);
        int n3 = (int)((System.currentTimeMillis() / (long)n + (long)n2) % 360L);
        n3 = (n3 > 654384831 + -1671484082 + (1291802102 + -274702671) ? 241392399 + -2035468356 + (-555798116 + -1945092863) - n3 : n3) + (1818186317 + 1777129725 + (681190754 + 18460680));
        Color color2 = new Color(Color.HSBtoRGB(fArray[0], fArray[1], (float)n3 / 360.0f));
        return new Color(color2.getRed(), color2.getGreen(), color2.getBlue(), Math.max(0, Math.min(-455553577 + -1132917400 + (-1848334344 + -858161720), (int)(f * 255.0f))));
    }

    public static Color s\u0440\u043e(int n, int n2, Color color, float f) {
        float[] fArray = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);
        long l2 = System.currentTimeMillis();
        double d = (double)l2 / ((double)n * 10.0) + (double)n2 / 1000.0;
        float f2 = (float)(Math.sin(d) * 0.25 + 0.75);
        float f3 = (float)((double)fArray[1] * (1.05 - (double)f2 * 0.05));
        Color color2 = Color.getHSBColor(fArray[0], Math.min(1.0f, f3), f2);
        return new Color(color2.getRed(), color2.getGreen(), color2.getBlue(), (int)(f * 255.0f));
    }

    public static int aoc(int n) {
        return n >> -275742258 + -432057502 + (1075432341 + -367632565) & -439231377 + -799251199 + (819204591 + 419278240);
    }

    public static int \u0445\u0440\u04bbi\u0445(int n) {
        return n >> -1310846219 + -54973755 + (1762427950 + -396607968) & -657711227 + -878764573 + (781568277 + 754907778);
    }

    public static int s\u043e\u0430\u0430oj(int n) {
        return n & -1520961837 + 944066041 + (1769795290 + -1192899239);
    }

    public static int j\u0458i\u0435h\u0445\u0430(int n, float f) {
        Color color = new Color(n);
        return ce\u04bb\u0441.\u0455\u0455sa\u0458oc(color, f).getRGB();
    }

    public static Color \u0455\u0455sa\u0458oc(Color color, float f) {
        f = Math.min(1.0f, Math.max(0.0f, f));
        return new Color(color.getRed(), color.getGreen(), color.getBlue(), (int)((float)color.getAlpha() * f));
    }

    public static int ai\u0430x(int n, float f) {
        f = Math.min(1.0f, Math.max(0.0f, f));
        return (int)((float)n * f);
    }

    public static int \u043e\u0445\u0455(int n) {
        return n >> -92123753 + -196385946 + (-88289853 + 376799576) & -1928535435 + 1535691941 + (37801953 + 355041796);
    }
}

