/*
 * Decompiled with CFR 0.152.
 */
package \u0430\u0435\u0435;

import ie\u0441\u0430ej.pjxx;
import io.github.humbleui.skija.BlendMode;
import io.github.humbleui.skija.Canvas;
import io.github.humbleui.skija.ClipMode;
import io.github.humbleui.skija.Data;
import io.github.humbleui.skija.FilterBlurMode;
import io.github.humbleui.skija.Font;
import io.github.humbleui.skija.FontMetrics;
import io.github.humbleui.skija.Image;
import io.github.humbleui.skija.ImageFilter;
import io.github.humbleui.skija.MaskFilter;
import io.github.humbleui.skija.Paint;
import io.github.humbleui.skija.PaintMode;
import io.github.humbleui.skija.PaintStrokeCap;
import io.github.humbleui.skija.Path;
import io.github.humbleui.skija.SurfaceOrigin;
import io.github.humbleui.types.RRect;
import io.github.humbleui.types.Rect;
import java.awt.Color;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jh\u0441\u0458.\u0440\u0430\u0458\u0430x;
import net.minecraft.class_1041;
import net.minecraft.class_1291;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_3300;
import net.minecraft.class_6880;
import net.minecraft.class_742;
import r.d8.Cade0e18b60fd9f037d8b2fc8;
import xs\u0441\u0445oa\u0430.exax\u04bb;
import \u0430\u0435\u0435.oxia;
import \u0430\u0435\u0435.\u0440\u0435eh;
import \u0440o\u0456\u0445o.\u0445\u0440\u0430\u0435\u0445\u043e;
import \u0445\u0430p\u0440.\u0435i\u0445cs\u043ei;
import \u0455hs.\u0440ox\u043e\u0456;
import \u0458ooc\u0441\u0435.jx\u0455\u043esep;

public class p\u0430x\u0435
implements pjxx {
    private static final /* synthetic */ jx\u0455\u043esep cai\u0458\u0430;
    private static final /* synthetic */ MaskFilter \u0430\u0445\u0441c;
    private static final /* synthetic */ List<oxia> ps\u043exs\u0435p;
    private static final /* synthetic */ int[] \u043e\u0445six;
    private static final /* synthetic */ int[] \u0445\u0441sa\u0455\u0440;
    private static final /* synthetic */ Map<Integer, ImageFilter> jo\u0456j;

    public p\u0430x\u0435() {
        if (true | false) {
        }
    }

    public static /* synthetic */ void \u0455e\u0445(float f, float f2, float f3, float f4, float f5, float f6, Color color) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        Paint paint = p\u0430x\u0435.he\u0435\u0456\u0440\u0430(color);
        paint.setMode(PaintMode.STROKE);
        paint.setStrokeWidth(f6);
        p\u0430x\u0435.x\u0441\u0441().drawRRect(RRect.makeXYWH((float)f, (float)f2, (float)f3, (float)f4, (float)f5), paint);
        paint.close();
    }

    public static /* synthetic */ String issha(String string) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        char[] cArray = string.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < cArray.length; ++i) {
            if (cArray[i] == -910917501 + 910917668 && i + 1 < cArray.length) {
                ++i;
                continue;
            }
            stringBuilder.append(cArray[i]);
        }
        return stringBuilder.toString();
    }

    public static /* synthetic */ void \u043e\u0456\u0441\u0456p\u0430\u0445() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if (ps\u043exs\u0435p.isEmpty()) {
            return;
        }
        Paint paint = new Paint();
        for (oxia oxia2 : ps\u043exs\u0435p) {
            paint.setColor(oxia2.jx\u0455.getRGB());
            paint.setMaskFilter(\u0430\u0445\u0441c);
            if (oxia2.\u0430e\u0430\u0430) {
                p\u0430x\u0435.xhcs\u04bb\u0456(p\u0430x\u0435.x\u0441\u0441(), oxia2.\u0430\u04bbss\u0430, oxia2.\u0430\u043eicxj\u0440, oxia2.hi\u04bb\u0441\u0458\u0440, oxia2.\u043ej\u0440\u0458, paint);
                switch (0) {
                    default: {
                        break;
                    }
                    case 1: {
                        break;
                    }
                    case 2: {
                        break;
                    }
                }
                continue;
            }
            p\u0430x\u0435.x\u0441\u0441().drawString(oxia2.\u0430\u04bbss\u0430, oxia2.\u0430\u043eicxj\u0440, oxia2.hi\u04bb\u0441\u0458\u0440, oxia2.\u043ej\u0440\u0458, paint);
        }
        paint.close();
        ps\u043exs\u0435p.clear();
    }

    public static /* synthetic */ void \u043ep\u0440\u0441\u0456\u0430(String string, float f, float f2, Color color, Font font, boolean bl) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        Rect rect = font.measureText(p\u0430x\u0435.issha(string));
        float f3 = f - rect.getLeft();
        float f4 = f2 - rect.getTop();
        if (bl) {
            ps\u043exs\u0435p.add(new oxia(string, f3, f4, color, font, 1.0f, true));
        }
        Paint paint = p\u0430x\u0435.he\u0435\u0456\u0440\u0430(color);
        p\u0430x\u0435.xhcs\u04bb\u0456(p\u0430x\u0435.x\u0441\u0441(), string, f3, f4, font, paint);
        paint.close();
    }

    private static /* synthetic */ int \u04bb\u04bb\u0440(char c) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if (c >= -1502751632 + 1502751680 && c <= -1972730386 + 1972730443) {
            return c - (-1081509844 + 1081509892);
        }
        if (c >= -287658964 + 287659061 && c <= -1016701639 + 1016701741) {
            return c - (-11498863 + 11498960) + (-590031041 + 590031051);
        }
        if (c >= -1774326927 + 1774326992 && c <= -1587160735 + 1587160805) {
            return c - (-455919370 + 455919435) + (-814371795 + 814371805);
        }
        return -1;
    }

    private static /* synthetic */ void xhcs\u04bb\u0456(Canvas canvas, String string, float f, float f2, Font font, Paint paint) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        float f3 = f;
        int n = paint.getColor();
        for (int i = 0; i < string.length(); ++i) {
            char c;
            int n2;
            char c2 = string.charAt(i);
            if (c2 == -495301698 + 495301865 && i + 1 < string.length()) {
                n2 = string.charAt(i + 1);
                int n3 = p\u0430x\u0435.\u04bb\u04bb\u0440((char)n2);
                if (n3 != -1) {
                    paint.setColor(\u043e\u0445six[n3]);
                } else if (n2 == -2081027219 + 2081027333) {
                    paint.setColor(n);
                }
                ++i;
                continue;
            }
            StringBuilder stringBuilder = new StringBuilder();
            for (n2 = i; n2 < string.length() && ((c = string.charAt(n2)) != -12168581 + 12168748 || n2 + '\u0001' >= string.length()); ++n2) {
                stringBuilder.append(c);
            }
            String string2 = stringBuilder.toString();
            canvas.drawString(string2, f3, f2, font, paint);
            f3 += font.measureTextWidth(string2);
            i = n2 - 1;
        }
        paint.setColor(n);
    }

    public static /* synthetic */ void \u0456pho\u0456pi(int n, float f, float f2, float f3, float f4) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        p\u0430x\u0435.osx\u0430\u04bb(n, f, f2, f3, f4, SurfaceOrigin.TOP_LEFT);
    }

    public static /* synthetic */ void \u0441s\u0458\u0435(String string, float f, float f2, float f3, float f4, float f5, float f6) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if (string == null || string.isEmpty()) {
            return;
        }
        Image image = \u0440\u0430\u0458\u0430x.s\u04bb\u0455\u043e(string);
        if (image == null) {
            return;
        }
        Canvas canvas = p\u0430x\u0435.x\u0441\u0441();
        canvas.save();
        Paint paint = new Paint();
        paint.setAlpha((int)(f6 * 255.0f));
        RRect rRect = RRect.makeXYWH((float)f, (float)f2, (float)f3, (float)f4, (float)f5);
        canvas.clipRRect(rRect, ClipMode.INTERSECT, true);
        canvas.drawImageRect(image, Rect.makeXYWH((float)0.0f, (float)0.0f, (float)image.getWidth(), (float)image.getHeight()), Rect.makeXYWH((float)f, (float)f2, (float)f3, (float)f4), paint);
        canvas.restore();
        paint.close();
    }

    public static /* synthetic */ void \u0456\u043e\u0441\u0441\u0435s(String string, float f, float f2, float f3, float f4) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if (string == null || string.isEmpty()) {
            return;
        }
        Image image = \u0440\u0430\u0458\u0430x.s\u04bb\u0455\u043e(string);
        if (image == null) {
            return;
        }
        p\u0430x\u0435.x\u0441\u0441().drawImageRect(image, Rect.makeXYWH((float)f, (float)f2, (float)f3, (float)f4));
    }

    public static /* synthetic */ void xa\u0458\u0456oix(Image image, float f, float f2, float f3, float f4) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        p\u0430x\u0435.x\u0441\u0441().drawImageRect(image, Rect.makeXYWH((float)f, (float)f2, (float)f3, (float)f4));
    }

    public static /* synthetic */ void \u0441\u04bb\u043ep\u0430h\u0435(class_2960 class_29602, float f, float f2, float f3, float f4, SurfaceOrigin surfaceOrigin) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        if (cai\u0458\u0430.hoe\u04bbox(class_29602)) {
            p\u0430x\u0435.x\u0441\u0441().drawImageRect(cai\u0458\u0430.\u0430\u0455c\u04bb\u0445\u0441(class_29602.method_12832()), Rect.makeXYWH((float)f, (float)f2, (float)f3, (float)f4));
        }
    }

    public static /* synthetic */ void osx\u0430\u04bb(int n, float f, float f2, float f3, float f4, SurfaceOrigin surfaceOrigin) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (cai\u0458\u0430.\u0441s\u0441c\u0456(n, f3, f4, surfaceOrigin)) {
            p\u0430x\u0435.x\u0441\u0441().drawImageRect(cai\u0458\u0430.xeopp(n), Rect.makeXYWH((float)f, (float)f2, (float)f3, (float)f4));
        }
    }

    public static /* synthetic */ void \u0455\u04bbx(class_6880<class_1291> class_68802, float f, float f2, float f3, float f4) {
        Image image;
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if ((image = \u0440\u0435eh.\u04bb\u043epx(class_68802)) != null) {
            Paint paint = new Paint();
            paint.setBlendMode(BlendMode.SRC_OVER);
            p\u0430x\u0435.x\u0441\u0441().drawImageRect(image, Rect.makeXYWH((float)f, (float)f2, (float)f3, (float)f4), paint);
            paint.close();
        }
    }

    public static /* synthetic */ float \u0441a\u0441\u0441(String string, Font font) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        if (string == null || string.isEmpty()) {
            return 0.0f;
        }
        float f = 0.0f;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); ++i) {
            char c = string.charAt(i);
            if (c == -1190483312 + 1190483479 && i + 1 < string.length()) {
                ++i;
                switch (0) {
                    default: {
                        break;
                    }
                    case 1: {
                        break;
                    }
                    case 2: {
                        break;
                    }
                }
                continue;
            }
            stringBuilder.append(c);
        }
        return font.measureTextWidth(stringBuilder.toString());
    }

    public static /* synthetic */ void \u0440\u0458pa(class_742 class_7422, float f, float f2, float f3, float f4, Color color, int n) {
        Image image;
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if ((image = \u0440\u0435eh.x\u0445\u043e\u0458\u0430\u0455(class_7422)) == null) {
            return;
        }
        Canvas canvas = \u0440ox\u043e\u0456.x\u0441\u0441();
        Rect rect = Rect.makeXYWH((float)f, (float)f2, (float)f3, (float)f3);
        try (Path path = new Path();){
            path.addRRect(RRect.makeXYWH((float)f, (float)f2, (float)f3, (float)f3, (float)f4));
            canvas.save();
            canvas.clipPath(path, ClipMode.INTERSECT, true);
            Rect rect2 = Rect.makeXYWH((float)8.0f, (float)8.0f, (float)8.0f, (float)8.0f);
            Rect rect3 = Rect.makeXYWH((float)40.0f, (float)8.0f, (float)8.0f, (float)8.0f);
            Paint paint = new Paint();
            paint.setAlpha(n);
            canvas.drawImageRect(image, rect2, rect, paint, false);
            canvas.drawImageRect(image, rect3, rect, paint, false);
            paint.close();
            canvas.restore();
        }
        path = p\u0430x\u0435.he\u0435\u0456\u0440\u0430(color);
        canvas.drawRRect(RRect.makeXYWH((float)f, (float)f2, (float)f3, (float)f3, (float)f4), (Paint)path);
        path.close();
    }

    private static /* synthetic */ Paint he\u0435\u0456\u0440\u0430(Color color) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        Paint paint = new Paint();
        paint.setARGB(color.getAlpha(), color.getRed(), color.getGreen(), color.getBlue());
        return paint;
    }

    public static /* synthetic */ void \u0441sp() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        p\u0430x\u0435.x\u0441\u0441().save();
    }

    public static /* synthetic */ void jj\u0430c\u04bb\u0455\u0455() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        p\u0430x\u0435.x\u0441\u0441().restore();
    }

    public static /* synthetic */ void a\u04bbp\u0445(float f) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        p\u0430x\u0435.x\u0441\u0441().scale(f, f);
    }

    public static /* synthetic */ void \u0441\u0440\u0455p(float f, float f2, float f3) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        p\u0430x\u0435.x\u0441\u0441().translate(f, f2);
        p\u0430x\u0435.x\u0441\u0441().scale(f3, f3);
        p\u0430x\u0435.x\u0441\u0441().translate(-f, -f2);
    }

    public static /* synthetic */ void \u0430\u04bb\u0456\u0441i(float f, float f2, float f3, float f4, float f5) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        float f6 = f + f3 / 2.0f;
        float f7 = f2 + f4 / 2.0f;
        p\u0430x\u0435.x\u0441\u0441().translate(f6, f7);
        p\u0430x\u0435.x\u0441\u0441().scale(f5, f5);
        p\u0430x\u0435.x\u0441\u0441().translate(-f6, -f7);
    }

    public static /* synthetic */ void jj\u0455joa\u0441(float f, float f2) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        p\u0430x\u0435.x\u0441\u0441().translate(f, f2);
    }

    public static /* synthetic */ void \u043e\u0430\u0430cxe(float f, float f2, float f3, float f4, float f5) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        float f6 = f + f3 / 2.0f;
        float f7 = f2 + f4 / 2.0f;
        p\u0430x\u0435.x\u0441\u0441().translate(f6, f7);
        p\u0430x\u0435.x\u0441\u0441().rotate(f5);
        p\u0430x\u0435.x\u0441\u0441().translate(-f6, -f7);
    }

    public static /* synthetic */ void \u0458ep\u0430\u043eso(int n) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        Paint paint = new Paint();
        paint.setAlpha(n);
        p\u0430x\u0435.x\u0441\u0441().saveLayer(null, paint);
        paint.close();
    }

    public static /* synthetic */ Canvas x\u0441\u0441() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return \u0440ox\u043e\u0456.x\u0441\u0441();
    }

    public static /* synthetic */ Optional<byte[]> xe\u0430\u043e\u0440(String string) {
        Optional<byte[]> optional;
        block10: {
            if ((3 * 3 + 3) % 2 == 0) {
            }
            if (0 != 0) {
            }
            InputStream inputStream = p\u0430x\u0435.\u0430a\u0455o(string);
            try {
                optional = Optional.of(inputStream.readAllBytes());
                if (inputStream == null) break block10;
            }
            catch (Throwable throwable) {
                try {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (IOException iOException) {
                    return Optional.empty();
                }
            }
            inputStream.close();
        }
        return optional;
    }

    public static /* synthetic */ Optional<Data> jj\u0430\u0441s(String string) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return p\u0430x\u0435.xe\u0430\u043e\u0440(string).map(Data::makeFromBytes);
    }

    public static /* synthetic */ InputStream \u0430a\u0455o(String string) {
        InputStream inputStream;
        if (true | false) {
        }
        if (0 != 0) {
        }
        if ((inputStream = p\u0430x\u0435.class.getResourceAsStream(string)) == null) {
            String string2 = string;
            byte[] byArray = new byte[-359819893 + 359819913];
            byArray[0] = -699009236 + 699009265;
            byArray[1] = -2128727429 + 2128727450;
            byArray[2] = -1906550102 + 1906549998;
            byArray[3] = -1944434796 + 1944434745;
            byArray[4] = -1379614830 + 1379614702;
            byArray[5] = -1915939763 + 1915939654;
            byArray[-1938688454 + 1938688460] = -1423846441 + 1423846368;
            byArray[-351592104 + 351592111] = -668813695 + 668813618;
            byArray[-1855114951 + 1855114959] = -68836995 + 68836952;
            byArray[-1013897571 + 1013897580] = -982178111 + 982178037;
            byArray[-848624084 + 848624094] = -1773212079 + 1773211953;
            byArray[-786261876 + 786261887] = -305230171 + 305230058;
            byArray[-533369732 + 533369744] = -2100661897 + 2100661784;
            byArray[-211266583 + 211266596] = -913817324 + 913817447;
            byArray[-2085560166 + 2085560180] = -1566530036 + 1566530133;
            byArray[-631107778 + 631107793] = -1212219019 + 1212219144;
            byArray[-272174826 + 272174842] = -1713528954 + 1713528942;
            byArray[-1956834075 + 1956834092] = -133586475 + 133586468;
            byArray[-2128820463 + 2128820481] = -362074675 + 362074601;
            byArray[-2023303322 + 2023303341] = -1130507098 + 1130507106;
            throw new IllegalArgumentException(Cade0e18b60fd9f037d8b2fc8.cachedDecodeString(byArray, -728367494 + 702676989, 1208364584 + 156377903) + string2);
        }
        return inputStream;
    }

    public static /* synthetic */ jx\u0455\u043esep \u0435a\u0430p\u0435() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return cai\u0458\u0430;
    }

    public static /* synthetic */ void \u0458o\u0435(int n, float f, float f2, float f3, float f4, float f5, SurfaceOrigin surfaceOrigin) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        if (cai\u0458\u0430.\u0441s\u0441c\u0456(n, f3, f4, surfaceOrigin)) {
            Paint paint = new Paint();
            paint.setAlpha((int)(255.0f * f5));
            p\u0430x\u0435.x\u0441\u0441().drawImageRect(cai\u0458\u0430.xeopp(n), Rect.makeXYWH((float)f, (float)f2, (float)f3, (float)f4), paint);
            paint.close();
        }
    }

    public static /* synthetic */ void oa\u0440\u043e\u0445(float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        class_1041 class_10412 = class_310.method_1551().method_22683();
        int n = exax\u04bb.e\u0441\u04bbpi\u043eh.c\u0435jj\u043es\u0455();
        if (!cai\u0458\u0430.\u0441s\u0441c\u0456(n, f6 = (float)class_10412.method_4486(), f5 = (float)class_10412.method_4502(), SurfaceOrigin.BOTTOM_LEFT)) {
            return;
        }
        Image image = cai\u0458\u0430.xeopp(n);
        float f7 = (float)image.getWidth() / f6;
        float f8 = (float)image.getHeight() / f5;
        Rect rect = Rect.makeXYWH((float)(f * f7), (float)(f2 * f8), (float)(f3 * f7), (float)(f4 * f8));
        Rect rect2 = Rect.makeXYWH((float)f, (float)f2, (float)f3, (float)f4);
        p\u0430x\u0435.x\u0441\u0441().drawImageRect(image, rect, rect2, null, true);
    }

    public static /* synthetic */ void h\u0456os(float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        class_1041 class_10412 = class_310.method_1551().method_22683();
        int n = exax\u04bb.\u043e\u0455p\u0445ee\u043e.c\u0435jj\u043es\u0455();
        if (!cai\u0458\u0430.\u0441s\u0441c\u0456(n, f6 = (float)class_10412.method_4486(), f5 = (float)class_10412.method_4502(), SurfaceOrigin.BOTTOM_LEFT)) {
            return;
        }
        Image image = cai\u0458\u0430.xeopp(n);
        float f7 = (float)image.getWidth() / f6;
        float f8 = (float)image.getHeight() / f5;
        Rect rect = Rect.makeXYWH((float)(f * f7), (float)(f2 * f8), (float)(f3 * f7), (float)(f4 * f8));
        Rect rect2 = Rect.makeXYWH((float)f, (float)f2, (float)f3, (float)f4);
        p\u0430x\u0435.x\u0441\u0441().drawImageRect(image, rect, rect2, null, true);
    }

    public static /* synthetic */ void ja\u0445\u0458(float f, float f2, float f3, float f4, Color color) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        Paint paint = p\u0430x\u0435.he\u0435\u0456\u0440\u0430(color);
        p\u0430x\u0435.x\u0441\u0441().drawRect(Rect.makeXYWH((float)f, (float)f2, (float)f3, (float)f4), paint);
        paint.close();
    }

    public static /* synthetic */ void o\u04bbi(float f, float f2, float f3, Color color) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        Paint paint = p\u0430x\u0435.he\u0435\u0456\u0440\u0430(color);
        p\u0430x\u0435.x\u0441\u0441().drawCircle(f, f2, f3, paint);
        paint.close();
    }

    public static /* synthetic */ void \u04bb\u0455\u0440(float f, float f2, float f3, float f4, Color color) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        Paint paint = p\u0430x\u0435.he\u0435\u0456\u0440\u0430(color);
        paint.setMode(PaintMode.STROKE);
        paint.setStrokeWidth(f4);
        p\u0430x\u0435.x\u0441\u0441().drawCircle(f, f2, f3, paint);
        paint.close();
    }

    public static /* synthetic */ void \u0445a\u0440c\u0445h(float f, float f2, float f3, float f4, float f5, Color color) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        Paint paint = p\u0430x\u0435.he\u0435\u0456\u0440\u0430(color);
        p\u0430x\u0435.x\u0441\u0441().drawRRect(RRect.makeXYWH((float)f, (float)f2, (float)f3, (float)f4, (float)f5), paint);
        paint.close();
    }

    public static /* synthetic */ void \u0456\u0445\u0435(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, Color color) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        float[] fArray = new float[-1499125183 + 1499125191];
        fArray[0] = f5;
        fArray[1] = f5;
        fArray[2] = f6;
        fArray[3] = f6;
        fArray[4] = f7;
        fArray[5] = f7;
        fArray[-1861737108 + 1861737114] = f8;
        fArray[-1173216683 + 1173216690] = f8;
        RRect rRect = RRect.makeComplexXYWH((float)f, (float)f2, (float)f3, (float)f4, (float[])fArray);
        Paint paint = p\u0430x\u0435.he\u0435\u0456\u0440\u0430(color);
        p\u0430x\u0435.x\u0441\u0441().drawRRect(rRect, paint);
        paint.close();
    }

    public static /* synthetic */ void \u0456\u0445oe\u0430(float f, float f2, float f3, float f4, float f5, float f6) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        \u0435i\u0445cs\u043ei \u0435i\u0445cs\u043ei2 = (\u0435i\u0445cs\u043ei)\u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0430o\u0441\u0456p\u0455().\u0441c\u0458\u043e\u0430(\u0435i\u0445cs\u043ei.class);
        if (\u0435i\u0445cs\u043ei2.i\u0440\u043e.axpacc() && \u0435i\u0445cs\u043ei2.\u0440\u0435\u0455x\u0435xe()) {
            class_1041 class_10412 = class_310.method_1551().method_22683();
            Path path = new Path();
            path.addRRect(RRect.makeXYWH((float)f, (float)f2, (float)f3, (float)f4, (float)f5));
            p\u0430x\u0435.\u0441sp();
            p\u0430x\u0435.x\u0441\u0441().clipPath(path, ClipMode.INTERSECT, true);
            int n = exax\u04bb.\u043e\u0455p\u0445ee\u043e.c\u0435jj\u043es\u0455();
            float f7 = class_10412.method_4486();
            float f8 = class_10412.method_4502();
            if (cai\u0458\u0430.\u0441s\u0441c\u0456(n, f7, f8, SurfaceOrigin.BOTTOM_LEFT)) {
                Paint paint = new Paint();
                paint.setAlpha((int)(255.0f * f6));
                p\u0430x\u0435.x\u0441\u0441().drawImageRect(cai\u0458\u0430.xeopp(n), Rect.makeXYWH((float)0.0f, (float)0.0f, (float)f7, (float)f8), paint);
                paint.close();
            }
            p\u0430x\u0435.jj\u0430c\u04bb\u0455\u0455();
            path.close();
        }
    }

    public static /* synthetic */ void hc\u0456(float f, float f2, float f3, float f4, float f5) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        \u0435i\u0445cs\u043ei \u0435i\u0445cs\u043ei2 = (\u0435i\u0445cs\u043ei)\u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0430o\u0441\u0456p\u0455().\u0441c\u0458\u043e\u0430(\u0435i\u0445cs\u043ei.class);
        if (\u0435i\u0445cs\u043ei2.i\u0440\u043e.axpacc() && \u0435i\u0445cs\u043ei2.\u0440\u0435\u0455x\u0435xe()) {
            class_1041 class_10412 = class_310.method_1551().method_22683();
            Path path = new Path();
            path.addRRect(RRect.makeXYWH((float)f, (float)f2, (float)f3, (float)f4, (float)f5));
            p\u0430x\u0435.\u0441sp();
            p\u0430x\u0435.x\u0441\u0441().clipPath(path, ClipMode.INTERSECT, true);
            p\u0430x\u0435.\u0458o\u0435(exax\u04bb.\u043e\u0455p\u0445ee\u043e.c\u0435jj\u043es\u0455(), 0.0f, 0.0f, class_10412.method_4486(), class_10412.method_4502(), 1.0f, SurfaceOrigin.BOTTOM_LEFT);
            p\u0430x\u0435.jj\u0430c\u04bb\u0455\u0455();
            path.close();
        }
    }

    public static /* synthetic */ Image p\u0441\u0440(class_2960 class_29602) {
        Image image;
        block10: {
            if (true | false) {
            }
            if (0 != 0) {
            }
            class_3300 class_33002 = class_310.method_1551().method_1478();
            InputStream inputStream = class_33002.open(class_29602);
            try {
                byte[] byArray = inputStream.readAllBytes();
                image = Image.makeFromEncoded((byte[])byArray);
                if (inputStream == null) break block10;
            }
            catch (Throwable throwable) {
                try {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (IOException iOException) {
                    return null;
                }
            }
            inputStream.close();
        }
        return image;
    }

    public static /* synthetic */ float \u0440\u0435\u0440\u0458(float f, Font font) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        FontMetrics fontMetrics = font.getMetrics();
        float f2 = fontMetrics.getDescent() - fontMetrics.getAscent();
        return (f - f2) / 2.0f;
    }

    public static /* synthetic */ void \u0456p\u0456xc(String string, float f, float f2, Color color, Font font) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        Rect rect = font.measureText(string);
        Paint paint = p\u0430x\u0435.he\u0435\u0456\u0440\u0430(color);
        p\u0430x\u0435.x\u0441\u0441().drawString(string, f - rect.getLeft(), f2 - rect.getTop(), font, paint);
        paint.close();
    }

    public static /* synthetic */ void j\u0455\u0445(String string, float f, float f2, Color color, Font font) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        Rect rect = font.measureText(string);
        Paint paint = p\u0430x\u0435.he\u0435\u0456\u0440\u0430(color);
        p\u0430x\u0435.x\u0441\u0441().drawString(string, f - rect.getLeft() - rect.getWidth() / 2.0f, f2 - rect.getTop(), font, paint);
        paint.close();
    }

    public static /* synthetic */ void x\u0458\u0441x(String string, float f, float f2, Color color, Font font) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        FontMetrics fontMetrics = font.getMetrics();
        Rect rect = font.measureText(string);
        float f3 = f2 + (fontMetrics.getAscent() - fontMetrics.getDescent()) / 2.0f - fontMetrics.getAscent();
        Paint paint = p\u0430x\u0435.he\u0435\u0456\u0440\u0430(color);
        p\u0430x\u0435.x\u0441\u0441().drawString(string, f - rect.getLeft(), f3, font, paint);
        paint.close();
    }

    public static /* synthetic */ void \u0455\u0435ee\u0441\u0430(String string, float f, float f2, Color color, Font font) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        Rect rect = font.measureText(string);
        FontMetrics fontMetrics = font.getMetrics();
        float f3 = f - rect.getLeft() - rect.getWidth() / 2.0f;
        float f4 = f2 + (fontMetrics.getAscent() - fontMetrics.getDescent()) / 2.0f - fontMetrics.getAscent();
        Paint paint = p\u0430x\u0435.he\u0435\u0456\u0440\u0430(color);
        p\u0430x\u0435.x\u0441\u0441().drawString(string, f3, f4, font, paint);
        paint.close();
    }

    public static /* synthetic */ Rect \u0445caj\u0445\u043e\u0441(String string, Font font) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return font.measureText(string);
    }

    public static /* synthetic */ String \u0440x\u0430\u0435(String string, Font font, float f) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        boolean bl = false;
        boolean bl2 = false;
        while (!bl) {
            byte[] byArray = new byte[]{-1974253781 + 1974253718, -1064646584 + 1064646684, -712381249 + 712381197};
            if (p\u0430x\u0435.\u0445caj\u0445\u043e\u0441(string, font).getWidth() > f - p\u0430x\u0435.\u0445caj\u0445\u043e\u0441(Cade0e18b60fd9f037d8b2fc8.cachedDecodeString(byArray, 736529757 + 946001643, 992644776 + 883613996), font).getWidth()) {
                string = string.substring(0, string.length() - 1);
                bl2 = true;
                continue;
            }
            bl = true;
        }
        String string2 = bl2 ? Cade0e18b60fd9f037d8b2fc8.cachedDecodeString(new byte[]{-1810372656 + 1810372699, -599981438 + 599981518, -658380395 + 658380351}, 1241965374 + 1627834319, -363256785 + 1966488416) : Cade0e18b60fd9f037d8b2fc8.cachedDecodeString(new byte[0], 1882134320 + 449934288, 364766159 + 1537904025);
        String string3 = string;
        return string3 + string2;
    }

    public static /* synthetic */ void \u04bbhpsx\u043e(float f, float f2, float f3, float f4, float f5) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        p\u0430x\u0435.o\u043e\u0441(f, f2, f3, f4, f5, ClipMode.INTERSECT);
    }

    public static /* synthetic */ void i\u0445a(Path path, Color color) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        Paint paint = p\u0430x\u0435.he\u0435\u0456\u0440\u0430(color);
        p\u0430x\u0435.x\u0441\u0441().drawPath(path, paint);
        paint.close();
    }

    public static /* synthetic */ void j\u0456x(Path path, ClipMode clipMode, boolean bl) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        p\u0430x\u0435.x\u0441\u0441().clipPath(path, clipMode, bl);
        path.close();
    }

    public static /* synthetic */ void \u04bbxc(Path path) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        p\u0430x\u0435.x\u0441\u0441().clipPath(path, ClipMode.INTERSECT, true);
        path.close();
    }

    public static /* synthetic */ void o\u043e\u0441(float f, float f2, float f3, float f4, float f5, ClipMode clipMode) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        Path path = new Path();
        path.addRRect(RRect.makeXYWH((float)f, (float)f2, (float)f3, (float)f4, (float)f5));
        p\u0430x\u0435.j\u0456x(path, clipMode, true);
    }

    public static /* synthetic */ void oa\u0458\u043e\u0435(Path path, Color color) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        \u0435i\u0445cs\u043ei \u0435i\u0445cs\u043ei2 = (\u0435i\u0445cs\u043ei)\u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0430o\u0441\u0456p\u0455().\u0441c\u0458\u043e\u0430(\u0435i\u0445cs\u043ei.class);
        if (\u0435i\u0445cs\u043ei2.\u0458\u0435\u0456\u0430.axpacc() && \u0435i\u0445cs\u043ei2.\u0440\u0435\u0455x\u0435xe()) {
            Paint paint = p\u0430x\u0435.he\u0435\u0456\u0440\u0430(color);
            paint.setMaskFilter(\u0430\u0445\u0441c);
            p\u0430x\u0435.\u0441sp();
            p\u0430x\u0435.x\u0441\u0441().drawPath(path, paint);
            p\u0430x\u0435.jj\u0430c\u04bb\u0455\u0455();
            paint.close();
        }
    }

    public static /* synthetic */ void ip\u0458h\u0445(float f, float f2, float f3, float f4, float f5) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        \u0435i\u0445cs\u043ei \u0435i\u0445cs\u043ei2 = (\u0435i\u0445cs\u043ei)\u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0430o\u0441\u0456p\u0455().\u0441c\u0458\u043e\u0430(\u0435i\u0445cs\u043ei.class);
        if (\u0435i\u0445cs\u043ei2.\u0458\u0435\u0456\u0430.axpacc() && \u0435i\u0445cs\u043ei2.\u0440\u0435\u0455x\u0435xe()) {
            Paint paint = p\u0430x\u0435.he\u0435\u0456\u0440\u0430(\u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0456p\u0458.h\u0445ph().\u0458ces\u0435\u043ep());
            ImageFilter imageFilter = jo\u0456j.computeIfAbsent(\u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0456p\u0458.h\u0445ph().\u0458ces\u0435\u043ep().getRGB(), n -> {
                if (2 * 2 * 2 >= 0) {
                }
                return ImageFilter.makeDropShadowOnly((float)0.0f, (float)0.0f, (float)5.0f, (float)5.0f, (int)n);
            });
            paint.setImageFilter(imageFilter);
            p\u0430x\u0435.\u0441sp();
            p\u0430x\u0435.x\u0441\u0441().drawRRect(RRect.makeXYWH((float)f, (float)f2, (float)f3, (float)f4, (float)f5), paint);
            p\u0430x\u0435.jj\u0430c\u04bb\u0455\u0455();
            paint.close();
        }
    }

    public static /* synthetic */ void \u0440\u0445i(float f, float f2, float f3, float f4, float f5, Color color) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        \u0435i\u0445cs\u043ei \u0435i\u0445cs\u043ei2 = (\u0435i\u0445cs\u043ei)\u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0430o\u0441\u0456p\u0455().\u0441c\u0458\u043e\u0430(\u0435i\u0445cs\u043ei.class);
        if (\u0435i\u0445cs\u043ei2.\u0458\u0435\u0456\u0430.axpacc() && \u0435i\u0445cs\u043ei2.\u0440\u0435\u0455x\u0435xe()) {
            Paint paint = p\u0430x\u0435.he\u0435\u0456\u0440\u0430(color);
            paint.setMaskFilter(\u0430\u0445\u0441c);
            p\u0430x\u0435.\u0441sp();
            p\u0430x\u0435.x\u0441\u0441().drawRRect(RRect.makeXYWH((float)f, (float)f2, (float)f3, (float)f4, (float)f5), paint);
            p\u0430x\u0435.jj\u0430c\u04bb\u0455\u0455();
            paint.close();
        }
    }

    public static /* synthetic */ void i\u0430c\u0435(float f, float f2, float f3, Color color) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        \u0435i\u0445cs\u043ei \u0435i\u0445cs\u043ei2 = (\u0435i\u0445cs\u043ei)\u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0430o\u0441\u0456p\u0455().\u0441c\u0458\u043e\u0430(\u0435i\u0445cs\u043ei.class);
        if (\u0435i\u0445cs\u043ei2.\u0458\u0435\u0456\u0430.axpacc() && \u0435i\u0445cs\u043ei2.\u0440\u0435\u0455x\u0435xe()) {
            Paint paint = p\u0430x\u0435.he\u0435\u0456\u0440\u0430(color);
            paint.setMaskFilter(\u0430\u0445\u0441c);
            p\u0430x\u0435.\u0441sp();
            p\u0430x\u0435.x\u0441\u0441().drawCircle(f, f2, f3, paint);
            p\u0430x\u0435.jj\u0430c\u04bb\u0455\u0455();
            paint.close();
        }
    }

    public static /* synthetic */ void \u0440\u0430\u043ee\u0456\u04bbx(float f, float f2, float f3, float f4, float f5, float f6, Color color) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        Paint paint = p\u0430x\u0435.he\u0435\u0456\u0440\u0430(color);
        paint.setMode(PaintMode.STROKE);
        paint.setStrokeWidth(f6);
        paint.setStrokeCap(PaintStrokeCap.ROUND);
        p\u0430x\u0435.x\u0441\u0441().drawArc(f - f3, f2 - f3, f + f3, f2 + f3, f4, f5, false, paint);
        paint.close();
    }

    static {
        cai\u0458\u0430 = new jx\u0455\u043esep();
        \u0430\u0445\u0441c = MaskFilter.makeBlur((FilterBlurMode)FilterBlurMode.OUTER, (float)5.0f);
        ps\u043exs\u0435p = new ArrayList<oxia>();
        int[] nArray = new int[-757782177 + 757782193];
        nArray[0] = -613385991 + 596608775;
        nArray[1] = -1672607062 + 1655830016;
        nArray[2] = -1306270715 + 1289537019;
        nArray[3] = -1821980962 + 1805247436;
        nArray[4] = -1123327191 + 1117691095;
        nArray[5] = -83054644 + 77418718;
        nArray[-215537896 + 215537902] = -128042450 + 122428114;
        nArray[-1007949291 + 1007949298] = -1143191035 + 1137598629;
        nArray[-2071655462 + 2071655470] = -1265528464 + 1254343653;
        nArray[-250197235 + 250197244] = -1858693567 + 1847508926;
        nArray[-123211316 + 123211326] = -1511658006 + 1500516715;
        nArray[-1507425577 + 1507425588] = -892394646 + 881253525;
        nArray[-1312928173 + 1312928185] = -1717171454 + 1717127763;
        nArray[-24837249 + 24837262] = -304254124 + 304210603;
        nArray[-1978557926 + 1978557940] = -714479392 + 714479221;
        nArray[-1764547936 + 1764547951] = -1;
        \u043e\u0445six = nArray;
        \u0445\u0441sa\u0455\u0440 = new int[-67494569 + 67494601];
        for (int i = 0; i < \u0445\u0441sa\u0455\u0440.length; ++i) {
            int n = (i >> 3 & 1) * (-288864250 + 288864335);
            int n2 = (i >> 2 & 1) * (-2034626158 + 2034626328) + n;
            int n3 = (i >> 1 & 1) * (-1772329306 + 1772329476) + n;
            int n4 = (i & 1) * (-471927720 + 471927890) + n;
            if (i == -1566789655 + 1566789661) {
                n2 += 85;
            }
            if (i >= -1196086653 + 1196086669) {
                n2 /= 4;
                n3 /= 4;
                n4 /= 4;
            }
            p\u0430x\u0435.\u0445\u0441sa\u0455\u0440[i] = -1332333376 + 1315556160 | (n2 & -1380444339 + 1380444594) << -614012701 + 614012717 | (n3 & -1262260473 + 1262260728) << -296496488 + 296496496 | n4 & -271429876 + 271430131;
        }
        jo\u0456j = new HashMap<Integer, ImageFilter>();
    }
}

