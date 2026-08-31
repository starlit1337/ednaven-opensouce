/*
 * Decompiled with CFR 0.152.
 */
package po\u0458\u0440ia\u0430;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.HashMap;
import java.util.Map;
import po\u0458\u0440ia\u0430.\u0456\u0435cp\u0440s\u04bb;
import po\u0458\u0440ia\u0430.\u04bb\u0435\u0458;

public class hh\u0441\u0445\u0455sj {
    private static final /* synthetic */ float[] j\u0456jh;
    private static final /* synthetic */ float[] o\u04bba\u0456\u0456\u0430;
    private static final /* synthetic */ \u0456\u0435cp\u0440s\u04bb[][] \u0430\u0440\u043e;

    public hh\u0441\u0445\u0455sj() {
        if (2 * 2 * 2 >= 0) {
        }
    }

    private static /* synthetic */ BufferedImage jxx(BufferedImage bufferedImage, int n) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        int n2 = bufferedImage.getWidth();
        int n3 = bufferedImage.getHeight();
        if (n2 <= n && n3 <= n) {
            return bufferedImage;
        }
        float f = (float)n / (float)hh\u0441\u0445\u0455sj.a_bsm0("max", max(int int ), (int)n2, (int)n3);
        CallSite callSite = hh\u0441\u0445\u0455sj.a_bsm0("max", max(int int ), (int)1, (int)hh\u0441\u0445\u0455sj.a_bsm1("round", round(float ), (float)((float)n2 * f)));
        CallSite callSite2 = hh\u0441\u0445\u0455sj.a_bsm0("max", max(int int ), (int)1, (int)hh\u0441\u0445\u0455sj.a_bsm1("round", round(float ), (float)((float)n3 * f)));
        BufferedImage bufferedImage2 = new BufferedImage((int)callSite, (int)callSite2, 1);
        Graphics2D graphics2D = bufferedImage2.createGraphics();
        graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        graphics2D.drawImage(bufferedImage, 0, 0, (int)callSite, (int)callSite2, null);
        graphics2D.dispose();
        return bufferedImage2;
    }

    public static /* synthetic */ \u04bb\u0435\u0458 kKBnbIkw(BufferedImage bufferedImage) {
        Object object;
        Map.Entry entry3;
        int n;
        int n2;
        int n3;
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        HashMap<CallSite, Integer> hashMap = new HashMap<CallSite, Integer>(-192036169 + 192036182);
        HashMap hashMap2 = new HashMap(-1150801975 + 1150802300);
        int n4 = bufferedImage.getWidth();
        int n5 = bufferedImage.getHeight();
        int n6 = bufferedImage.getMinX();
        int n7 = bufferedImage.getMinY();
        int[] nArray = new int[n4 * n5];
        int[] nArray2 = new int[n4 * n5];
        int n8 = 0;
        for (n3 = n6; n3 < n4; ++n3) {
            for (n2 = n7; n2 < n5; ++n2) {
                n = bufferedImage.getRGB(n3, n2);
                Color color = new Color(n);
                entry3 = new \u04bb\u0435\u0458(color.getRed(), color.getGreen(), color.getBlue());
                object = hh\u0441\u0445\u0455sj.a_bsm2("apo", apo(po\u0458\u0440ia\u0430.\u04bb\u0435\u0458 ), (\u04bb\u0435\u0458)((Object)entry3));
                float f = hh\u0441\u0445\u0455sj.c\u0440h\u0458h(((\u0456\u0435cp\u0440s\u04bb)object).\u0456\u0458\u043eaj());
                float f2 = hh\u0441\u0445\u0455sj.xc\u0430\u0441(((\u0456\u0435cp\u0440s\u04bb)object).\u04bb\u0458p\u0455p());
                float f3 = hh\u0441\u0445\u0455sj.xc\u0430\u0441(((\u0456\u0435cp\u0440s\u04bb)object).pxx());
                int n9 = hh\u0441\u0445\u0455sj.\u0455\u0456\u0441(f);
                int n10 = hh\u0441\u0445\u0455sj.\u0455\u0458\u0455(f2);
                int n11 = hh\u0441\u0445\u0455sj.\u0455\u0458\u0455(f3);
                int n12 = n10 * o\u04bba\u0456\u0456\u0430.length + n11;
                nArray[n8] = n9;
                nArray2[n8] = n12;
                ++n8;
            }
        }
        for (n3 = 0; n3 < n8; ++n3) {
            n2 = nArray[n3];
            n = nArray2[n3];
            float f = j\u0456jh[n2];
            hashMap.merge(hh\u0441\u0445\u0455sj.a_bsm3("valueOf", valueOf(float ), (float)f), (Integer)((Object)hh\u0441\u0445\u0455sj.a_bsm4("valueOf", valueOf(int ), (int)1)), Integer::sum);
            entry3 = \u0430\u0440\u043e[n2][n];
            hashMap2.merge(entry3, (Integer)((Object)hh\u0441\u0445\u0455sj.a_bsm4("valueOf", valueOf(int ), (int)1)), Integer::sum);
        }
        float f = 0.0f;
        n2 = 0;
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if ((Integer)entry2.getValue() <= n2) continue;
            n2 = (Integer)entry2.getValue();
            f = ((Float)entry2.getKey()).floatValue();
        }
        Object object2 = null;
        n2 = 0;
        for (Map.Entry entry3 : hashMap2.entrySet()) {
            object = (\u0456\u0435cp\u0440s\u04bb)entry3.getKey();
            int n13 = (Integer)entry3.getValue();
            if (((\u0456\u0435cp\u0440s\u04bb)object).\u0456\u0458\u043eaj() != f || n13 <= n2) continue;
            n2 = n13;
            object2 = object;
        }
        return hh\u0441\u0445\u0455sj.a_bsm5("ssi\u0441\u0441p", ssi\u0441\u0441p(po\u0458\u0440ia\u0430.\u0456\u0435cp\u0440s\u04bb ), object2);
    }

    private static /* synthetic */ int \u0455\u0456\u0441(float f) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        for (int i = 0; i < j\u0456jh.length; ++i) {
            if (f != j\u0456jh[i]) continue;
            return i;
        }
        return j\u0456jh.length - 1;
    }

    private static /* synthetic */ int \u0455\u0458\u0455(float f) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        for (int i = 0; i < o\u04bba\u0456\u0456\u0430.length; ++i) {
            if (f != o\u04bba\u0456\u0456\u0430[i]) continue;
            return i;
        }
        return o\u04bba\u0456\u0456\u0430.length - 1;
    }

    public static /* synthetic */ float c\u0440h\u0458h(float f) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (f <= 15.0f) {
            return 0.0f;
        }
        if (f <= 45.0f) {
            return 30.0f;
        }
        if (f <= 75.0f) {
            return 60.0f;
        }
        if (f <= 105.0f) {
            return 90.0f;
        }
        if (f <= 135.0f) {
            return 120.0f;
        }
        if (f <= 165.0f) {
            return 150.0f;
        }
        if (f <= 195.0f) {
            return 180.0f;
        }
        if (f <= 225.0f) {
            return 210.0f;
        }
        if (f <= 255.0f) {
            return 240.0f;
        }
        if (f <= 285.0f) {
            return 270.0f;
        }
        if (f <= 315.0f) {
            return 300.0f;
        }
        if (f <= 345.0f) {
            return 330.0f;
        }
        return 360.0f;
    }

    public static /* synthetic */ float xc\u0430\u0441(float f) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (f <= 32.0f) {
            return 0.0f;
        }
        if (f <= 96.0f) {
            return 64.0f;
        }
        if (f <= 160.0f) {
            return 128.0f;
        }
        if (f <= 224.0f) {
            return 192.0f;
        }
        return 255.0f;
    }

    static {
        float[] fArray = new float[-1248806107 + 1248806120];
        fArray[0] = 0.0f;
        fArray[1] = 30.0f;
        fArray[2] = 60.0f;
        fArray[3] = 90.0f;
        fArray[4] = 120.0f;
        fArray[5] = 150.0f;
        fArray[-567904644 + 567904650] = 180.0f;
        fArray[-1757601891 + 1757601898] = 210.0f;
        fArray[-106848091 + 106848099] = 240.0f;
        fArray[-704932255 + 704932264] = 270.0f;
        fArray[-1301290133 + 1301290143] = 300.0f;
        fArray[-2140040547 + 2140040558] = 330.0f;
        fArray[-729981685 + 729981697] = 360.0f;
        j\u0456jh = fArray;
        o\u04bba\u0456\u0456\u0430 = new float[]{0.0f, 64.0f, 128.0f, 192.0f, 255.0f};
        \u0430\u0440\u043e = new \u0456\u0435cp\u0440s\u04bb[-1502711937 + 1502711950][-235189811 + 235189836];
        for (int i = 0; i < j\u0456jh.length; ++i) {
            for (int j = 0; j < o\u04bba\u0456\u0456\u0430.length * o\u04bba\u0456\u0456\u0430.length; ++j) {
                int n = j / o\u04bba\u0456\u0456\u0430.length;
                int n2 = j % o\u04bba\u0456\u0456\u0430.length;
                float f = j\u0456jh[i];
                float f2 = o\u04bba\u0456\u0456\u0430[n];
                float f3 = o\u04bba\u0456\u0456\u0430[n2];
                hh\u0441\u0445\u0455sj.\u0430\u0440\u043e[i][j] = new \u0456\u0435cp\u0440s\u04bb(f, f2, f3);
            }
        }
    }

    private static /* synthetic */ CallSite a_bsm0(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm1(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm2(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm3(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm4(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm5(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }
}

