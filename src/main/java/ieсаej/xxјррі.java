/*
 * Decompiled with CFR 0.152.
 */
package ie\u0441\u0430ej;

import ie\u0441\u0430ej.pjxx;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
import net.minecraft.class_1309;
import net.minecraft.class_243;
import net.minecraft.class_4184;

public class xx\u0458\u0440\u0440\u0456 {
    public static final /* synthetic */ double x\u043e\u0458\u0455\u0458 = Math.PI;
    static final /* synthetic */ double \u0455i\u043e\u043eh = Math.PI * 2;
    static final /* synthetic */ float h\u0455\u0440j\u043e\u0441h = (float)Math.PI;
    static final /* synthetic */ float ojo\u0430\u0435hc = (float)Math.PI * 2;
    static final /* synthetic */ double \u04bb\u0441ie = 1.5707963267948966;
    static final /* synthetic */ float c\u0435\u0458p\u0445oc = 1.5707964f;
    static final /* synthetic */ double oaoj = 0.7853981633974483;
    static final /* synthetic */ double h\u0440xa\u043e = 0.3183098861837907;
    public static final /* synthetic */ Random \u043e\u0435\u0440e\u0458\u043e\u0445;
    private static final /* synthetic */ float[] \u043e\u0441e;

    public xx\u0458\u0440\u0440\u0456() {
        if (true | false) {
        }
    }

    public static /* synthetic */ boolean j\u0430iss\u0455c(class_243 class_2432) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return class_2432.method_1027() < 1.0E-12;
    }

    public static /* synthetic */ float e\u0456\u043ee\u0455(float f, float f2) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return (float)(xx\u0458\u0440\u0440\u0456.a_bsm0("random", random()) * (double)(f2 - f) + (double)f);
    }

    public static /* synthetic */ float \u043e\u0440xx\u0430c(float f, float f2, float f3) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return f2 + f * (f3 - f2);
    }

    public static /* synthetic */ float c\u0430\u0435a\u0455\u0455s(float f, float f2, float f3) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return f + f3 * (f2 - f);
    }

    public static /* synthetic */ double \u0435h\u0458\u0455\u043ecc(double d, double d2, double d3) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return d2 + d * (d3 - d2);
    }

    public static /* synthetic */ boolean h\u0440\u0455\u0435(float f, float f2) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return xx\u0458\u0440\u0440\u0456.a_bsm1("abs", abs(float ), (float)(f2 - f)) < 1.0E-5f;
    }

    public static /* synthetic */ double \u043e\u0455i(double d, double d2, double d3) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return d + d3 * (d2 - d);
    }

    public static /* synthetic */ float p\u0430sh\u0440\u043e(float f) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return \u043e\u0441e[(int)(f * 10430.378f) & -1209778786 + 1209844321];
    }

    public static /* synthetic */ float \u0435o\u043e\u0455(float f) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return (float)xx\u0458\u0440\u0440\u0456.a_bsm2("sqrt", sqrt(double ), (double)f);
    }

    public static /* synthetic */ float o\u0455ji(double d) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return (float)xx\u0458\u0440\u0440\u0456.a_bsm2("sqrt", sqrt(double ), (double)d);
    }

    public static /* synthetic */ float \u0458x\u0435(float f) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (f > 90.0f) {
            return 90.0f;
        }
        return (float)xx\u0458\u0440\u0440\u0456.a_bsm3("max", max(float float ), (float)f, (float)-90.0f);
    }

    public static /* synthetic */ float p\u0441c\u0430h\u0430(float f, float f2, float f3, float f4, float f5) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return (f - f2) / (f3 - f2) * (f5 - f4) + f4;
    }

    public static /* synthetic */ double s\u0458\u0440(double d, double object, double d2) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return d < object ? object : (Object)xx\u0458\u0440\u0440\u0456.a_bsm4("min", min(double double ), (double)d, (double)d2);
    }

    public static /* synthetic */ int ci\u0435\u0430e(int n, int n2, int n3) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return n < n2 ? n2 : (int)xx\u0458\u0440\u0440\u0456.a_bsm5("min", min(int int ), (int)n, (int)n3);
    }

    public static /* synthetic */ <T extends Number> T \u0430\u043e\u0455\u0456sx(T t2, T t3, T t4) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        if (t2 instanceof Integer) {
            if (t2.intValue() > t4.intValue()) {
                t2 = t4;
            } else if (t2.intValue() < t3.intValue()) {
                t2 = t3;
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
            }
        } else if (t2 instanceof Float) {
            if (t2.floatValue() > t4.floatValue()) {
                t2 = t4;
            } else if (t2.floatValue() < t3.floatValue()) {
                t2 = t3;
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
            }
        } else if (t2 instanceof Double) {
            if (t2.doubleValue() > t4.doubleValue()) {
                t2 = t4;
            } else if (t2.doubleValue() < t3.doubleValue()) {
                t2 = t3;
            }
        } else if (t2 instanceof Long) {
            if (t2.longValue() > t4.longValue()) {
                t2 = t4;
            } else if (t2.longValue() < t3.longValue()) {
                t2 = t3;
            }
        } else if (t2 instanceof Short) {
            if (t2.shortValue() > t4.shortValue()) {
                t2 = t4;
            } else if (t2.shortValue() < t3.shortValue()) {
                t2 = t3;
            }
        } else if (t2 instanceof Byte) {
            if (t2.byteValue() > t4.byteValue()) {
                t2 = t4;
            } else if (t2.byteValue() < t3.byteValue()) {
                t2 = t3;
            }
        }
        return t2;
    }

    public static /* synthetic */ double chi(double d, double d2) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return d >= d2 ? d : \u043e\u0435\u0440e\u0458\u043e\u0445.nextDouble() * (d2 - d) + d;
    }

    public static /* synthetic */ int ipj(int n, int n2, Random random) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return n2 - n <= 0 ? n : n + random.nextInt(n2 - n);
    }

    public static /* synthetic */ int \u0441\u043ejc(int n, int n2) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return n2 - n <= 0 ? n : n + new Random().nextInt(n2 - n);
    }

    public static /* synthetic */ float ao\u0445\u043eh\u04bb\u0430(float f) {
        float f2;
        if (true | false) {
        }
        if (0 != 0) {
        }
        return (f2 = f % 360.0f) < -180.0f ? f2 + 360.0f : (f2 > 180.0f ? f2 - 360.0f : f2);
    }

    public static /* synthetic */ float e\u0458j\u0455\u0458ax(float f, float f2, float f3) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return f2 + f * (f3 - f2);
    }

    public static /* synthetic */ class_243 oe\u0458h(class_1309 class_13092, float f) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        class_4184 class_41842 = pjxx.\u0430\u0445j\u0445s\u0456\u04bb.field_1773.method_19418();
        class_243 class_2432 = class_13092.method_30950(f);
        return class_2432.method_1020(class_41842.method_19326());
    }

    public static /* synthetic */ double sp\u04bbii(double d, double d2, float f) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return d2 + d * ((double)f - d2);
    }

    public static /* synthetic */ double xpoca\u0430(float f, double d, double d2) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return d + (double)f * (d2 - d);
    }

    public static /* synthetic */ float \u0455aeo\u0445i(float f, float f2, float f3) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return f2 + f * xx\u0458\u0440\u0440\u0456.ao\u0445\u043eh\u04bb\u0430(f3 - f2);
    }

    public static /* synthetic */ double c\u0458i\u0445(double d, int n) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        return new BigDecimal(d).setScale(n, RoundingMode.HALF_UP).doubleValue();
    }

    public static /* synthetic */ <T extends Number> int \u0455ax(T t2) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (!(t2 instanceof Integer) && !(t2 instanceof Long)) {
            String[] stringArray = t2.toString().split((String)((Object)xx\u0458\u0440\u0440\u0456.a_bsm6("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-199533668 + 199533627, -1185654055 + 1185654107}, (int)(1205877184 + 325329283), (int)(-1870724446 + 1898905355))));
            if (stringArray.length == 2) {
                if (stringArray[1].endsWith((String)((Object)xx\u0458\u0440\u0440\u0456.a_bsm6("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1027374412 + 1027374316}, (int)(-2131597503 + 852446335), (int)(-251625582 + 579245044))))) {
                    stringArray[1] = stringArray[1].substring(0, stringArray[1].length() - 1);
                }
                return stringArray[1].length();
            }
            return 0;
        }
        return 0;
    }

    public static /* synthetic */ float \u0435\u0430\u0440\u04bbae(float f, float object, float f2) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return f < object ? object : (Object)xx\u0458\u0440\u0440\u0456.a_bsm7("min", min(float float ), (float)f, (float)f2);
    }

    public static /* synthetic */ int pe\u0458\u0441\u0458sa(int n, int n2, int n3) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return n < n2 ? n2 : (int)xx\u0458\u0440\u0440\u0456.a_bsm5("min", min(int int ), (int)n, (int)n3);
    }

    public static /* synthetic */ int \u0455sj(int n) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        int n2 = n - 1;
        n2 |= n2 >> 1;
        n2 |= n2 >> 2;
        n2 |= n2 >> 4;
        n2 |= n2 >> -1498861427 + 1498861435;
        n2 |= n2 >> -1237728683 + 1237728699;
        return n2 + 1;
    }

    public static /* synthetic */ float \u0440eh\u0435\u0445\u0458j(double d, double d2) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return (float)(xx\u0458\u0440\u0440\u0456.a_bsm8("log", log(double ), (double)d2) / xx\u0458\u0440\u0440\u0456.a_bsm8("log", log(double ), (double)d));
    }

    public static /* synthetic */ double bfiDwg(double d, int n) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        BigDecimal bigDecimal = new BigDecimal(d);
        bigDecimal = bigDecimal.setScale(n, RoundingMode.HALF_UP);
        return bigDecimal.doubleValue();
    }

    public static /* synthetic */ boolean \u0440cao\u0435j(float f, float f2, float f3, float f4, float f5, float f6) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return f > f3 && f < f5 && f2 > f4 && f2 < f6;
    }

    public static /* synthetic */ float \u043ep\u0430o\u0455\u0455(float f, float f2) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        double d = 3.141592653;
        double d2 = 1.0 / xx\u0458\u0440\u0440\u0456.a_bsm2("sqrt", sqrt(double ), (double)(2.0 * d * (double)(f2 * f2)));
        return (float)(d2 * xx\u0458\u0440\u0440\u0456.a_bsm9("exp", exp(double ), (double)((double)(-(f * f)) / (2.0 * (double)(f2 * f2)))));
    }

    public static /* synthetic */ double \u0455\u0440eji\u0455a(double d, double d2) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        double d3 = xx\u0458\u0440\u0440\u0456.\u0445\u0440ci\u0445\u0430\u0456(1.0 - d * d);
        double d4 = d2 + 1.5707963267948966;
        double d5 = d4 - (double)((int)(d4 / (Math.PI * 2))) * (Math.PI * 2);
        if (d5 < 0.0) {
            d5 += Math.PI * 2;
        }
        return d5 >= Math.PI ? -d3 : d3;
    }

    public static /* synthetic */ double \u0445\u0440ci\u0445\u0430\u0456(double d) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return (double)xx\u0458\u0440\u0440\u0456.a_bsm2("sqrt", sqrt(double ), (double)d);
    }

    static {
        \u043e\u0435\u0440e\u0458\u043e\u0445 = new Random();
        \u043e\u0441e = new float[-890034591 + 890100127];
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

    private static /* synthetic */ CallSite a_bsm6(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm7(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm8(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm9(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }
}

