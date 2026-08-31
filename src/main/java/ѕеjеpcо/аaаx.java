/*
 * Decompiled with CFR 0.152.
 */
package \u0455\u0435j\u0435pc\u043e;

import ao\u0430\u0441sxi.pxx\u0445\u0458;
import io.github.humbleui.skija.Canvas;
import io.github.humbleui.skija.ClipMode;
import io.github.humbleui.skija.Font;
import io.github.humbleui.skija.GradientStyle;
import io.github.humbleui.skija.Image;
import io.github.humbleui.skija.Paint;
import io.github.humbleui.skija.PaintMode;
import io.github.humbleui.skija.Path;
import io.github.humbleui.skija.Shader;
import io.github.humbleui.types.RRect;
import io.github.humbleui.types.Rect;
import java.awt.Color;
import java.io.InputStream;
import jx\u043ex.\u0458x\u0456\u0456ae;
import j\u0435a\u0435ca.pj\u0456oj\u0435\u0440;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_437;
import r.d8.Cade0e18b60fd9f037d8b2fc8;
import \u0430\u0435\u0435.p\u0430x\u0435;
import \u0435\u0435oj\u0455\u0435.xe\u0441e;
import \u0440o\u0456\u0445o.\u0445\u0440\u0430\u0435\u0445\u043e;
import \u0455hs.\u0440ox\u043e\u0456;
import \u0455\u0435j\u0435pc\u043e.i\u0440\u0440o\u0435si;
import \u0455\u0435j\u0435pc\u043e.\u04bb\u0441x\u0455\u043e\u0441;
import \u04bbejhxj.\u0440\u0455o\u0435;

public class \u0430a\u0430x
extends \u0458x\u0456\u0456ae {
    private static final /* synthetic */ float \u0445\u0435\u04bbh = 24.0f;
    private static final /* synthetic */ float ap\u0430 = 16.0f;
    private final /* synthetic */ Font \u0440\u0458i\u0456o;
    private final /* synthetic */ Font o\u0456ax\u0456;
    private final /* synthetic */ Font ejc\u04bbo;
    private final /* synthetic */ Font sic;
    private final /* synthetic */ Font \u0441\u0445\u0456\u04bb\u0441\u0445;
    private /* synthetic */ Image \u0458x\u04bboxc;
    private /* synthetic */ float \u0435pj;
    private /* synthetic */ float \u0430\u0430aac;
    private /* synthetic */ float p\u0441\u0456\u0456\u0445x;
    private /* synthetic */ \u04bb\u0441x\u0455\u043e\u0441 j\u04bbc\u04bb;

    public \u0430a\u0430x() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        this.\u0440\u0458i\u0456o = pj\u0456oj\u0435\u0440.\u0458haa\u0455\u0445(9.0f);
        this.o\u0456ax\u0456 = pj\u0456oj\u0435\u0440.\u0455iax\u0440(28.0f);
        this.ejc\u04bbo = pj\u0456oj\u0435\u0440.\u0455iax\u0440(22.0f);
        this.sic = pj\u0456oj\u0435\u0440.\u0455iax\u0440(24.0f);
        this.\u0441\u0445\u0456\u04bb\u0441\u0445 = pj\u0456oj\u0435\u0440.\u0455iax\u0440(16.0f);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected /* synthetic */ void method_25426() {
        block15: {
            this.\u0435pj = 0.0f;
            this.\u0430\u0430aac = 0.0f;
            this.p\u0441\u0456\u0456\u0445x = 0.0f;
            this.j\u04bbc\u04bb = null;
            if (this.\u0458x\u04bboxc != null) return;
            try {
                byte[] byArray = new byte[-355887992 + 355888016];
                byArray[0] = -634745443 + 634745375;
                byArray[1] = -1316477478 + 1316477431;
                byArray[2] = -1853333384 + 1853333492;
                byArray[3] = -1853169144 + 1853169271;
                byArray[4] = -761785899 + 761785795;
                byArray[5] = -552078208 + 552078235;
                byArray[-21719047 + 21719053] = -1869635287 + 1869635254;
                byArray[-1293993432 + 1293993439] = -183217541 + 183217486;
                byArray[-496822632 + 496822640] = -255463676 + 255463756;
                byArray[-788001284 + 788001293] = -1304456516 + 1304456561;
                byArray[-1635941170 + 1635941180] = -2077314942 + 2077315033;
                byArray[-2089430730 + 2089430741] = 0;
                byArray[-1216926023 + 1216926035] = -586449525 + 586449479;
                byArray[-1776459381 + 1776459394] = -749796178 + 749796072;
                byArray[-1291657941 + 1291657955] = -1892192670 + 1892192745;
                byArray[-90332636 + 90332651] = -227208665 + 227208695;
                byArray[-2146977648 + 2146977664] = -1564577572 + 1564577636;
                byArray[-1114970960 + 1114970977] = -1253860103 + 1253860142;
                byArray[-279048667 + 279048685] = -1258185302 + 1258185199;
                byArray[-108101895 + 108101914] = -1509298444 + 1509298513;
                byArray[-509395276 + 509395296] = -64968960 + 64969053;
                byArray[-310495358 + 310495379] = -1557056077 + 1557056113;
                byArray[-271974307 + 271974329] = -177411527 + 177411439;
                byArray[-950448386 + 950448409] = -1482112425 + 1482112330;
                InputStream inputStream = \u0440\u0455o\u0435.class.getResourceAsStream(Cade0e18b60fd9f037d8b2fc8.cachedDecodeString(byArray, 336432314 + 1232982224, 986601625 + 1971214259));
                try {
                    if (inputStream != null) {
                        this.\u0458x\u04bboxc = Image.makeFromEncoded((byte[])inputStream.readAllBytes());
                    }
                    if (inputStream == null) break block15;
                }
                catch (Throwable throwable) {
                    if (inputStream == null) throw throwable;
                    try {
                        inputStream.close();
                    }
                    catch (Throwable throwable2) {
                        throwable.addSuppressed(throwable2);
                        throw throwable;
                    }
                    switch (0) {
                        default: {
                            throw throwable;
                        }
                        case 1: {
                            throw throwable;
                        }
                        case 2: 
                    }
                    throw throwable;
                }
                inputStream.close();
            }
            catch (Exception exception) {
                // empty catch block
                return;
            }
        }
        switch (0) {
            default: {
                return;
            }
            case 1: {
                return;
            }
            case 2: 
        }
    }

    public /* synthetic */ void method_25394(class_332 class_3322, int n, int n2, float f) {
        boolean bl;
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        i\u0440\u0440o\u0435si i\u0440\u0440o\u0435si2 = this.createLayout();
        if (this.j\u04bbc\u04bb == null && this.contains(i\u0440\u0440o\u0435si2.e\u04bbec, n, n2) || this.j\u04bbc\u04bb == \u04bb\u0441x\u0455\u043e\u0441.\u0440\u04bb\u04bb\u0445he) {
            bl = true;
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
        } else {
            bl = false;
        }
        boolean bl2 = bl;
        boolean bl3 = this.j\u04bbc\u04bb == null && this.contains(i\u0440\u0440o\u0435si2.h\u0441\u0455\u0455\u0430, n, n2) || this.j\u04bbc\u04bb == \u04bb\u0441x\u0455\u043e\u0441.ec\u0440p\u0455;
        this.\u0435pj = this.animate(this.\u0435pj, bl2 ? 1.0f : 0.0f, 0.08f, f);
        this.\u0430\u0430aac = this.animate(this.\u0430\u0430aac, bl3 ? 1.0f : 0.0f, 0.08f, f);
        if (this.j\u04bbc\u04bb != null) {
            this.p\u0441\u0456\u0456\u0445x = Math.min(1.0f, this.p\u0441\u0456\u0456\u0445x + 0.12f * f);
        }
        \u0440ox\u043e\u0456.\u0456\u0440\u0430\u0455i\u0455(canvas -> {
            if (2 * 2 * 2 >= 0) {
            }
            p\u0430x\u0435.\u0441sp();
            p\u0430x\u0435.a\u04bbp\u0445((float)class_310.method_1551().method_22683().method_4495());
            this.drawPageBackground((Canvas)canvas);
            this.drawHeader(i\u0440\u0440o\u0435si2);
            this.drawBlurCard((Canvas)canvas, i\u0440\u0440o\u0435si2.e\u04bbec, this.\u0435pj);
            this.drawMaterialCard((Canvas)canvas, i\u0440\u0440o\u0435si2.h\u0441\u0455\u0455\u0430, this.\u0430\u0430aac);
            if (this.p\u0441\u0456\u0456\u0445x > 0.0f) {
                this.fillRect((Canvas)canvas, Rect.makeWH((float)this.field_22789, (float)this.field_22790), new Color(0, 0, 0, this.alpha(-1979690391 + 1979690646, this.p\u0441\u0456\u0456\u0445x)));
            }
            p\u0430x\u0435.jj\u0430c\u04bb\u0455\u0455();
        });
        if (this.p\u0441\u0456\u0456\u0445x >= 1.0f) {
            this.field_22787.method_1507((class_437)new pxx\u0445\u0458());
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private /* synthetic */ void drawPageBackground(Canvas canvas) {
        Shader shader;
        if (true | false) {
        }
        if (0 != 0) {
        }
        Paint paint = new Paint();
        try {
            shader = Shader.makeLinearGradient((float)((float)this.field_22789 / 2.0f), (float)0.0f, (float)((float)this.field_22789 / 2.0f), (float)this.field_22790, (int[])new int[]{-334073742 + 318217636, -122835524 + 106518861}, null, (GradientStyle)GradientStyle.DEFAULT);
            try {
                paint.setShader(shader);
                paint.setDither(true);
                canvas.drawRect(Rect.makeWH((float)this.field_22789, (float)this.field_22790), paint);
            }
            finally {
                if (shader != null) {
                    shader.close();
                }
            }
        }
        catch (Throwable throwable) {
            try {
                paint.close();
            }
            catch (Throwable throwable2) {
                throwable.addSuppressed(throwable2);
            }
            switch (0) {
                default: {
                    throw throwable;
                }
                case 1: {
                    throw throwable;
                }
                case 2: {
                    throw throwable;
                }
            }
            throw throwable;
        }
        paint.close();
        paint = new Paint();
        try {
            shader = Shader.makeRadialGradient((float)((float)this.field_22789 / 2.0f), (float)((float)this.field_22790 * 0.42f), (float)((float)Math.hypot(this.field_22789, this.field_22790) * 0.82f), (int[])new int[]{-71524800 + 389305535, 0}, null, (GradientStyle)GradientStyle.DEFAULT);
            try {
                paint.setShader(shader);
                paint.setDither(true);
                canvas.drawRect(Rect.makeWH((float)this.field_22789, (float)this.field_22790), paint);
                if (shader == null) return;
            }
            catch (Throwable throwable) {
                if (shader == null) throw throwable;
                try {
                    shader.close();
                }
                catch (Throwable throwable3) {
                    throwable.addSuppressed(throwable3);
                }
                switch (0) {
                    default: {
                        throw throwable;
                    }
                    case 1: {
                        throw throwable;
                    }
                    case 2: {
                        throw throwable;
                    }
                }
                throw throwable;
            }
            shader.close();
            return;
        }
        finally {
            paint.close();
        }
    }

    private /* synthetic */ void drawHeader(i\u0440\u0440o\u0435si i\u0440\u0440o\u0435si2) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        Color color = new Color(-1555018577 + 1555018817, -358962896 + 358963136, -2067672547 + 2067672787, -836943477 + 836943732);
        Color color2 = new Color(-1681438942 + 1681439062, -859400569 + 859400689, -200539791 + 200539911, -1740028241 + 1740028496);
        Font font = this.field_22789 < -399185315 + 399185815 ? this.ejc\u04bbo : this.o\u0456ax\u0456;
        byte[] byArray = new byte[-942306011 + 942306021];
        byArray[0] = -1733880747 + 1733880679;
        byArray[1] = -541548330 + 541548401;
        byArray[2] = -968520117 + 968520219;
        byArray[3] = -111494988 + 111494954;
        byArray[4] = -984248786 + 984248693;
        byArray[5] = -1755789805 + 1755789763;
        byArray[-1980041291 + 1980041297] = -839501333 + 839501425;
        byArray[-881308897 + 881308904] = -1214488745 + 1214488679;
        byArray[-1902144893 + 1902144901] = -1003211151 + 1003211234;
        byArray[-1762908153 + 1762908162] = -1192623422 + 1192623522;
        p\u0430x\u0435.j\u0455\u0445(Cade0e18b60fd9f037d8b2fc8.cachedDecodeString(byArray, -35749665 + 2038625921, 855178604 + 680418842), (float)this.field_22789 / 2.0f, i\u0440\u0440o\u0435si2.\u04bbh\u04bbp\u0458, color2, this.\u0440\u0458i\u0456o);
        byte[] byArray2 = new byte[-52184813 + 52184829];
        byArray2[0] = -714234594 + 714234472;
        byArray2[1] = -529211200 + 529211216;
        byArray2[2] = -778986115 + 778986178;
        byArray2[3] = -859506732 + 859506851;
        byArray2[4] = -2139019327 + 2139019393;
        byArray2[5] = -49826640 + 49826590;
        byArray2[-2108246471 + 2108246477] = -68961685 + 68961789;
        byArray2[-1727030607 + 1727030614] = 4;
        byArray2[-607936563 + 607936571] = -1218334921 + 1218334797;
        byArray2[-1359960858 + 1359960867] = -82022166 + 82022235;
        byArray2[-665051700 + 665051710] = -1534339913 + 1534339827;
        byArray2[-2097079079 + 2097079090] = -564987878 + 564987928;
        byArray2[-877284410 + 877284422] = -68337712 + 68337697;
        byArray2[-821055823 + 821055836] = -577502506 + 577502421;
        byArray2[-556436814 + 556436828] = -943729001 + 943729070;
        byArray2[-157468939 + 157468954] = -985730979 + 985731041;
        p\u0430x\u0435.j\u0455\u0445(Cade0e18b60fd9f037d8b2fc8.cachedDecodeString(byArray2, 1775354133 + 3647732, 672625420 + 589944885), (float)this.field_22789 / 2.0f, i\u0440\u0440o\u0435si2.\u04bbh\u04bbp\u0458 + 24.0f, color, font);
    }

    private /* synthetic */ void drawBlurCard(Canvas canvas, Rect rect, float f) {
        float f2;
        if (true | false) {
        }
        if (0 != 0) {
        }
        float f3 = 12.0f * f;
        Rect rect2 = Rect.makeXYWH((float)rect.getLeft(), (float)(rect.getTop() - f3), (float)rect.getWidth(), (float)rect.getHeight());
        if (this.j\u04bbc\u04bb == null || this.j\u04bbc\u04bb == \u04bb\u0441x\u0455\u043e\u0441.\u0440\u04bb\u04bb\u0445he) {
            f2 = 1.0f;
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
        } else {
            f2 = 0.25f;
        }
        float f4 = f2;
        this.drawShadow(canvas, rect2, 16.0f, f, f4);
        this.clipRounded(canvas, rect2, 16.0f, () -> {
            if (2 * 2 * 2 >= 0) {
            }
            if (this.\u0458x\u04bboxc != null) {
                float f3 = rect2.getWidth() * 1.05f;
                float f4 = rect2.getLeft() - rect2.getWidth() * 0.025f + f * 3.0f;
                this.drawImageCover(canvas, this.\u0458x\u04bboxc, Rect.makeXYWH((float)f4, (float)rect2.getTop(), (float)f3, (float)rect2.getHeight()), f4);
                int n = (int)(200.0f - 170.0f * f);
                this.fillRect(canvas, rect2, new Color(5, 5, 5, this.alpha(n, f4)));
            } else {
                this.fillRect(canvas, rect2, new Color(-1627985478 + 1627985493, -903926223 + 903926238, -1496968786 + 1496968801, this.alpha(-708296153 + 708296408, f4)));
            }
        });
        this.strokeRounded(canvas, rect2, 16.0f, 1.5f, new Color(-2039099508 + 2039099763, -579216915 + 579217170, -2132914111 + 2132914366, this.alpha((int)(20.0f + f * 120.0f), f4)));
        this.drawCardCopy(rect2, Cade0e18b60fd9f037d8b2fc8.cachedDecodeString(new byte[]{-470158503 + 470158526, -991583462 + 991583454, -1936519107 + 1936519008, -593536682 + 593536630}, -499390497 + 1196835250, 1967807987 + 2110428449), f4, true, null);
    }

    private /* synthetic */ void drawMaterialCard(Canvas canvas, Rect rect, float f) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        float f2 = 12.0f * f;
        Rect rect2 = Rect.makeXYWH((float)rect.getLeft(), (float)(rect.getTop() - f2), (float)rect.getWidth(), (float)rect.getHeight());
        float f3 = this.j\u04bbc\u04bb == null || this.j\u04bbc\u04bb == \u04bb\u0441x\u0455\u043e\u0441.ec\u0440p\u0455 ? 1.0f : 0.25f;
        xe\u0441e xe\u0441e2 = \u0445\u0440\u0430\u0435\u0445\u043e.jaa\u0435\u0445c().\u0456\u0440\u0430jj().\u0441ih();
        this.drawShadow(canvas, rect2, 16.0f, f, f3);
        this.clipRounded(canvas, rect2, 16.0f, () -> {
            if (2 * 2 * 2 >= 0) {
            }
            this.fillRect(canvas, rect2, this.withAlpha(xe\u0441e2.\u04bbha(), this.alpha(-1036558998 + 1036559253, f3)));
        });
        this.strokeRounded(canvas, rect2, 16.0f, 1.5f, this.withAlpha(xe\u0441e2.aj\u0445\u043e(), this.alpha((int)(40.0f + f * 180.0f), f3)));
        byte[] byArray = new byte[-1402277269 + 1402277279];
        byArray[0] = -460606149 + 460606043;
        byArray[1] = -2000780458 + 2000780371;
        byArray[2] = -2085962718 + 2085962590;
        byArray[3] = -466329131 + 466329179;
        byArray[4] = -454029315 + 454029268;
        byArray[5] = -1683161752 + 1683161770;
        byArray[-1894793441 + 1894793447] = -536884990 + 536884877;
        byArray[-2065161504 + 2065161511] = -266632525 + 266632591;
        byArray[-98536549 + 98536557] = -33086319 + 33086242;
        byArray[-284780085 + 284780094] = -685242775 + 685242753;
        this.drawCardCopy(rect2, Cade0e18b60fd9f037d8b2fc8.cachedDecodeString(byArray, -896356520 + 1915456869, -1288410619 + 300964638), f3, false, xe\u0441e2);
    }

    private /* synthetic */ void drawCardCopy(Rect rect, String string, float f, boolean bl, xe\u0441e xe\u0441e2) {
        boolean bl2;
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        if (rect.getWidth() < 120.0f) {
            bl2 = true;
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
        } else {
            bl2 = false;
        }
        boolean bl3 = bl2;
        float f2 = rect.getLeft() + rect.getWidth() / 2.0f;
        float f3 = rect.getTop() + rect.getHeight() / 2.0f;
        Color color = bl ? new Color(-1539261238 + 1539261478, -1958911901 + 1958912141, -71731036 + 71731276, this.alpha(-885525691 + 885525946, f)) : this.withAlpha(xe\u0441e2.\u04bb\u0455x\u04bb(), this.alpha(-1227421889 + 1227422144, f));
        p\u0430x\u0435.\u0455\u0435ee\u0441\u0430(string, f2, f3, color, bl3 ? this.\u0441\u0445\u0456\u04bb\u0441\u0445 : this.sic);
    }

    private /* synthetic */ void drawShadow(Canvas canvas, Rect rect, float f, float f2, float f3) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        Rect rect2 = Rect.makeXYWH((float)rect.getLeft(), (float)(rect.getTop() + 10.0f + f2 * 15.0f), (float)rect.getWidth(), (float)rect.getHeight());
        this.fillRounded(canvas, rect2, f, new Color(0, 0, 0, this.alpha((int)(20.0f + f2 * 25.0f), f3)));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private /* synthetic */ void drawImageCover(Canvas canvas, Image image, Rect rect, float f) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        float f2 = (float)image.getWidth() / (float)image.getHeight();
        float f3 = rect.getWidth() / rect.getHeight();
        float f4 = image.getWidth();
        float f5 = image.getHeight();
        float f6 = 0.0f;
        float f7 = 0.0f;
        if (f2 > f3) {
            f4 = f5 * f3;
            f6 = ((float)image.getWidth() - f4) / 2.0f;
        } else {
            f5 = f4 / f3;
            f7 = ((float)image.getHeight() - f5) / 2.0f;
        }
        Paint paint = new Paint().setAlpha(this.alpha(-1996580253 + 1996580508, f));
        try {
            canvas.drawImageRect(image, Rect.makeXYWH((float)f6, (float)f7, (float)f4, (float)f5), rect, paint, true);
            if (paint == null) return;
        }
        catch (Throwable throwable) {
            if (paint == null) throw throwable;
            try {
                paint.close();
            }
            catch (Throwable throwable2) {
                throwable.addSuppressed(throwable2);
            }
            switch (0) {
                default: {
                    throw throwable;
                }
                case 1: {
                    throw throwable;
                }
                case 2: {
                    throw throwable;
                }
            }
            throw throwable;
        }
        paint.close();
    }

    private /* synthetic */ void clipRounded(Canvas canvas, Rect rect, float f, Runnable runnable) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        try (Path path = new Path();){
            path.addRRect(RRect.makeXYWH((float)rect.getLeft(), (float)rect.getTop(), (float)rect.getWidth(), (float)rect.getHeight(), (float)f));
            canvas.save();
            canvas.clipPath(path, ClipMode.INTERSECT, true);
            runnable.run();
            canvas.restore();
        }
    }

    private /* synthetic */ void fillRect(Canvas canvas, Rect rect, Color color) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        try (Paint paint = new Paint().setColor(color.getRGB());){
            canvas.drawRect(rect, paint);
        }
    }

    private /* synthetic */ void fillRounded(Canvas canvas, Rect rect, float f, Color color) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        try (Paint paint = new Paint().setColor(color.getRGB());){
            canvas.drawRRect(RRect.makeXYWH((float)rect.getLeft(), (float)rect.getTop(), (float)rect.getWidth(), (float)rect.getHeight(), (float)f), paint);
        }
    }

    private /* synthetic */ void strokeRounded(Canvas canvas, Rect rect, float f, float f2, Color color) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        try (Paint paint = new Paint().setColor(color.getRGB()).setMode(PaintMode.STROKE).setStrokeWidth(f2);){
            canvas.drawRRect(RRect.makeXYWH((float)rect.getLeft(), (float)rect.getTop(), (float)rect.getWidth(), (float)rect.getHeight(), (float)f), paint);
        }
    }

    private /* synthetic */ i\u0440\u0440o\u0435si createLayout() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        float f = Math.max(24.0f, (float)this.field_22790 * 0.1f);
        float f2 = Math.max(80.0f, (float)this.field_22790 * 0.35f);
        float f3 = Math.max(20.0f, (float)this.field_22790 * 0.1f);
        float f4 = Math.max(12.0f, Math.min(48.0f, (float)this.field_22789 * 0.06f));
        float f5 = (float)this.field_22789 - f4 * 2.0f;
        float f6 = (float)this.field_22790 - f2 - f3;
        float f7 = Math.min(24.0f, f5 * 0.06f);
        float f8 = (f5 - f7) / 2.0f;
        return new i\u0440\u0440o\u0435si(Rect.makeXYWH((float)f4, (float)f2, (float)f8, (float)f6), Rect.makeXYWH((float)(f4 + f8 + f7), (float)f2, (float)f8, (float)f6), f);
    }

    private /* synthetic */ boolean contains(Rect rect, double d, double d2) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return d >= (double)rect.getLeft() && d <= (double)rect.getRight() && d2 >= (double)rect.getTop() && d2 <= (double)rect.getBottom();
    }

    private /* synthetic */ float animate(float f, float f2, float f3, float f4) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return f + (f2 - f) * Math.min(1.0f, f3 * f4);
    }

    private /* synthetic */ int alpha(int n, float f) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return Math.max(0, Math.min(-432582449 + 432582704, Math.round((float)n * f)));
    }

    private /* synthetic */ Color withAlpha(Color color, int n) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return new Color(color.getRed(), color.getGreen(), color.getBlue(), n);
    }

    public /* synthetic */ boolean method_25402(double d, double d2, int n) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (this.j\u04bbc\u04bb == null && n == 0) {
            i\u0440\u0440o\u0435si i\u0440\u0440o\u0435si2 = this.createLayout();
            if (this.contains(i\u0440\u0440o\u0435si2.e\u04bbec, d, d2)) {
                this.j\u04bbc\u04bb = \u04bb\u0441x\u0455\u043e\u0441.\u0440\u04bb\u04bb\u0445he;
                return true;
            }
            if (this.contains(i\u0440\u0440o\u0435si2.h\u0441\u0455\u0455\u0430, d, d2)) {
                this.j\u04bbc\u04bb = \u04bb\u0441x\u0455\u043e\u0441.ec\u0440p\u0455;
                return true;
            }
        }
        return super.method_25402(d, d2, n);
    }
}

