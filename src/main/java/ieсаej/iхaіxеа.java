/*
 * Decompiled with CFR 0.152.
 */
package ie\u0441\u0430ej;

import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.Kernel;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class i\u0445a\u0456x\u0435\u0430 {
    protected /* synthetic */ float \u043ecxssj;
    protected /* synthetic */ Kernel \u0445s\u043eo;

    public i\u0445a\u0456x\u0435\u0430(float f) {
        if (true | false) {
        }
        this.\u0430\u0435a\u043e\u0430\u04bb\u0458(f);
    }

    public static /* synthetic */ void c\u04bbx\u0458p\u0456(Kernel kernel, int[] nArray, int[] nArray2, int n, int n2, boolean bl, boolean bl2, boolean bl3, int n3) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        float[] fArray = kernel.getKernelData(null);
        int n4 = kernel.getWidth();
        int n5 = n4 / 2;
        for (int i = 0; i < n2; ++i) {
            int n6 = i;
            int n7 = i * n;
            for (int j = 0; j < n; ++j) {
                int n8;
                int n9;
                int n10;
                float f = 0.0f;
                float f2 = 0.0f;
                float f3 = 0.0f;
                float f4 = 0.0f;
                for (n10 = -n5; n10 <= n5; ++n10) {
                    float f5 = fArray[n5 + n10];
                    if (f5 == 0.0f) continue;
                    n9 = j + n10;
                    if (n9 < 0) {
                        if (n3 == 1) {
                            n9 = 0;
                        } else if (n3 == 2) {
                            n9 = (j + n) % n;
                        }
                    } else if (n9 >= n) {
                        if (n3 == 1) {
                            n9 = n - 1;
                        } else if (n3 == 2) {
                            n9 = (j + n) % n;
                        }
                    }
                    n8 = nArray[n7 + n9];
                    int n11 = n8 >> -1714881124 + 1714881148 & -532203047 + 532203302;
                    int n12 = n8 >> -5431296 + 5431312 & -1407130513 + 1407130768;
                    int n13 = n8 >> -1274763451 + 1274763459 & -1050311864 + 1050312119;
                    int n14 = n8 & -1277969324 + 1277969579;
                    if (bl2) {
                        float f6 = (float)n11 * 0.003921569f;
                        n12 = (int)((float)n12 * f6);
                        n13 = (int)((float)n13 * f6);
                        n14 = (int)((float)n14 * f6);
                    }
                    f4 += f5 * (float)n11;
                    f += f5 * (float)n12;
                    f2 += f5 * (float)n13;
                    f3 += f5 * (float)n14;
                }
                if (bl3 && f4 != 0.0f && f4 != 255.0f) {
                    float f7 = 255.0f / f4;
                    f *= f7;
                    f2 *= f7;
                    f3 *= f7;
                }
                n10 = bl ? i\u0445a\u0456x\u0435\u0430.ho\u0458\u043ee\u0441p((int)((double)f4 + 0.5)) : -2059010736 + 2059010991;
                int n15 = i\u0445a\u0456x\u0435\u0430.ho\u0458\u043ee\u0441p((int)((double)f + 0.5));
                n9 = i\u0445a\u0456x\u0435\u0430.ho\u0458\u043ee\u0441p((int)((double)f2 + 0.5));
                n8 = i\u0445a\u0456x\u0435\u0430.ho\u0458\u043ee\u0441p((int)((double)f3 + 0.5));
                nArray2[n6] = n10 << -1144460716 + 1144460740 | n15 << -191326470 + 191326486 | n9 << -2025921209 + 2025921217 | n8;
                n6 += n2;
            }
        }
    }

    public static /* synthetic */ int ho\u0458\u043ee\u0441p(int n) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (n < 0) {
            return 0;
        }
        return (int)i\u0445a\u0456x\u0435\u0430.a_bsm0("min", min(int int ), (int)n, (int)(-1693837725 + 1693837980));
    }

    public static /* synthetic */ Kernel \u04bbspa\u0430\u043e\u0456(float f) {
        int n;
        if (true | false) {
        }
        if (0 != 0) {
        }
        int n2 = (int)i\u0445a\u0456x\u0435\u0430.a_bsm1("ceil", ceil(double ), (double)f);
        int n3 = n2 * 2 + 1;
        float[] fArray = new float[n3];
        float f2 = f / 3.0f;
        float f3 = 2.0f * f2 * f2;
        float f4 = (float)Math.PI * 2 * f2;
        float f5 = (float)i\u0445a\u0456x\u0435\u0430.a_bsm2("sqrt", sqrt(double ), (double)f4);
        float f6 = f * f;
        float f7 = 0.0f;
        int n4 = 0;
        for (n = -n2; n <= n2; ++n) {
            float f8 = n * n;
            fArray[n4] = f8 > f6 ? 0.0f : (float)i\u0445a\u0456x\u0435\u0430.a_bsm3("exp", exp(double ), (double)(-f8 / f3)) / f5;
            f7 += fArray[n4];
            ++n4;
        }
        for (n = 0; n < n3; ++n) {
            fArray[n] = fArray[n] / f7;
        }
        return new Kernel(n3, 1, fArray);
    }

    public /* synthetic */ void \u0430\u0435a\u043e\u0430\u04bb\u0458(float f) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        this.\u043ecxssj = f;
        this.\u0445s\u043eo = i\u0445a\u0456x\u0435\u0430.\u04bbspa\u0430\u043e\u0456(f);
    }

    public /* synthetic */ BufferedImage \u043eos\u043e\u0445(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        int n = bufferedImage.getWidth();
        int n2 = bufferedImage.getHeight();
        if (bufferedImage2 == null) {
            bufferedImage2 = this.jx\u0430(bufferedImage, null);
        }
        int[] nArray = new int[n * n2];
        int[] nArray2 = new int[n * n2];
        bufferedImage.getRGB(0, 0, n, n2, nArray, 0, n);
        if (this.\u043ecxssj > 0.0f) {
            i\u0445a\u0456x\u0435\u0430.c\u04bbx\u0458p\u0456(this.\u0445s\u043eo, nArray, nArray2, n, n2, true, true, false, 1);
            i\u0445a\u0456x\u0435\u0430.c\u04bbx\u0458p\u0456(this.\u0445s\u043eo, nArray2, nArray, n2, n, true, false, true, 1);
        }
        bufferedImage2.setRGB(0, 0, n, n2, nArray, 0, n);
        return bufferedImage2;
    }

    public /* synthetic */ BufferedImage jx\u0430(BufferedImage bufferedImage, ColorModel colorModel) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if (colorModel == null) {
            colorModel = bufferedImage.getColorModel();
        }
        return new BufferedImage(colorModel, colorModel.createCompatibleWritableRaster(bufferedImage.getWidth(), bufferedImage.getHeight()), colorModel.isAlphaPremultiplied(), null);
    }

    public /* synthetic */ String toString() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        byte[] byArray = new byte[-126046118 + 126046139];
        byArray[0] = -1443110906 + 1443110811;
        byArray[1] = -1528634597 + 1528634569;
        byArray[2] = -1386687508 + 1386687408;
        byArray[3] = -2101627829 + 2101627743;
        byArray[4] = -1702691344 + 1702691296;
        byArray[5] = -52338464 + 52338453;
        byArray[-817053585 + 817053591] = -477999355 + 477999240;
        byArray[-1293469381 + 1293469388] = -1952476092 + 1952476176;
        byArray[-570470570 + 0x2200B0B2] = -1674653500 + 1674653404;
        byArray[-814283830 + 814283839] = -446744725 + 446744649;
        byArray[-1712270255 + 1712270265] = -265636633 + 265636700;
        byArray[-54689837 + 54689848] = -1001062203 + 1001062280;
        byArray[-1559721619 + 1559721631] = -1173137282 + 1173137378;
        byArray[-1480441635 + 1480441648] = -724487507 + 724487454;
        byArray[-1769244525 + 1769244539] = -141754691 + 141754570;
        byArray[-307641861 + 307641876] = -937211852 + 937211736;
        byArray[-154591230 + 154591246] = -95494836 + 95494830;
        byArray[-2077133261 + 2077133278] = -634351598 + 634351629;
        byArray[-1126029278 + 1126029296] = -1234909666 + 1234909769;
        byArray[-276121276 + 276121295] = -1635347664 + 1635347543;
        byArray[-12787528 + 12787548] = -1945174039 + 1945174141;
        return i\u0445a\u0456x\u0435\u0430.a_bsm4("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-1890839366 + 1052358987), (int)(-1991450308 + 1565459806));
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
}

