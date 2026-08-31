/*
 * Decompiled with CFR 0.152.
 */
package \u0430cp;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import \u0430cp.\u0440\u0445\u043e\u0440;
import \u0430cp.\u0456\u0456o\u0445;

public final class \u04bb\u0441x {
    private static final /* synthetic */ int xie = 10;
    private static final /* synthetic */ double \u0441\u0430jo\u04bb = 3.0;

    private \u04bb\u0441x() {
        if (true | false) {
        }
    }

    public static /* synthetic */ Map<Integer, Integer> h\u04bbe\u0440h(int[] nArray, int[] nArray2, int n) {
        Object object;
        Object object2;
        int n2;
        int n3;
        Object object3;
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        Random random = new Random(272008L);
        LinkedHashMap<CallSite, CallSite> linkedHashMap = new LinkedHashMap<CallSite, CallSite>();
        double[][] dArrayArray = new double[nArray.length][];
        int[] nArray3 = new int[nArray.length];
        \u0456\u0456o\u0445 \u0456\u0456o\u04452 = new \u0456\u0456o\u0445();
        int n4 = 0;
        for (int i = 0; i < nArray.length; ++i) {
            object3 = nArray[i];
            Integer n5 = (Integer)linkedHashMap.get(\u04bb\u0441x.a_bsm0("valueOf", valueOf(int ), (int)object3));
            if (n5 == null) {
                dArrayArray[n4] = \u0456\u0456o\u04452.fromInt((int)object3);
                nArray3[n4] = object3;
                ++n4;
                linkedHashMap.put(\u04bb\u0441x.a_bsm0("valueOf", valueOf(int ), (int)object3), \u04bb\u0441x.a_bsm0("valueOf", valueOf(int ), (int)1));
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
            linkedHashMap.put(\u04bb\u0441x.a_bsm0("valueOf", valueOf(int ), (int)object3), \u04bb\u0441x.a_bsm0("valueOf", valueOf(int ), (int)(n5 + 1)));
        }
        int[] nArray4 = new int[n4];
        for (object3 = 0; object3 < n4; ++object3) {
            int n6 = nArray3[object3];
            nArray4[object3] = n3 = ((Integer)linkedHashMap.get(\u04bb\u0441x.a_bsm0("valueOf", valueOf(int ), (int)n6))).intValue();
        }
        object3 = \u04bb\u0441x.a_bsm1("min", min(int int ), (int)n, (int)n4);
        if (nArray2.length != 0) {
            object3 = \u04bb\u0441x.a_bsm1("min", min(int int ), (int)object3, (int)nArray2.length);
        }
        double[][] dArrayArray2 = new double[object3][];
        n3 = 0;
        for (n2 = 0; n2 < nArray2.length; ++n2) {
            dArrayArray2[n2] = \u0456\u0456o\u04452.fromInt(nArray2[n2]);
            ++n3;
        }
        n2 = object3 - n3;
        if (n2 > 0) {
            for (int i = 0; i < n2; ++i) {
            }
        }
        int[] nArray5 = new int[n4];
        for (int i = 0; i < n4; ++i) {
            nArray5[i] = random.nextInt((int)object3);
        }
        int[][] nArrayArray = new int[object3][];
        block29: for (Object object4 = 0; object4 < object3; ++object4) {
            nArrayArray[object4] = new int[object3];
            switch (0) {
                default: {
                    continue block29;
                }
                case 1: {
                    continue block29;
                }
                case 2: 
            }
        }
        \u0440\u0445\u043e\u0440[][] \u0440\u0445\u043e\u0440ArrayArray = new \u0440\u0445\u043e\u0440[object3][];
        for (Object object5 = 0; object5 < object3; ++object5) {
            \u0440\u0445\u043e\u0440ArrayArray[object5] = new \u0440\u0445\u043e\u0440[object3];
            for (object2 = 0; object2 < object3; ++object2) {
                \u0440\u0445\u043e\u0440ArrayArray[object5][object2] = new \u0440\u0445\u043e\u0440();
            }
        }
        int[] nArray6 = new int[object3];
        for (object2 = 0; object2 < -528465188 + 528465198; ++object2) {
            int n7;
            double[] dArray;
            int n8;
            for (object = 0; object < object3; ++object) {
                block34: for (n8 = object + 1; n8 < object3; ++n8) {
                    double d;
                    \u0440\u0445\u043e\u0440ArrayArray[n8][object].\u0430o\u0441\u04bb = d = \u0456\u0456o\u04452.distance(dArrayArray2[object], dArrayArray2[n8]);
                    \u0440\u0445\u043e\u0440ArrayArray[n8][object].\u0430\u0441o\u0430\u0430\u0435 = object;
                    \u0440\u0445\u043e\u0440ArrayArray[object][n8].\u0430o\u0441\u04bb = d;
                    \u0440\u0445\u043e\u0440ArrayArray[object][n8].\u0430\u0441o\u0430\u0430\u0435 = n8;
                    switch (0) {
                        default: {
                            continue block34;
                        }
                        case 1: {
                            continue block34;
                        }
                        case 2: 
                    }
                }
                \u04bb\u0441x.a_bsm2("sort", sort(java.lang.Object[] ), (Object[])\u0440\u0445\u043e\u0440ArrayArray[object]);
                for (n8 = 0; n8 < object3; ++n8) {
                    nArrayArray[object][n8] = \u0440\u0445\u043e\u0440ArrayArray[object][n8].\u0430\u0441o\u0430\u0430\u0435;
                }
            }
            object = 0;
            for (n8 = 0; n8 < n4; ++n8) {
                CallSite callSite;
                double d;
                dArray = dArrayArray[n8];
                int n9 = nArray5[n8];
                double[] dArray2 = dArrayArray2[n9];
                double d2 = d = \u0456\u0456o\u04452.distance(dArray, dArray2);
                int n10 = -1;
                block37: for (Object object6 = 0; object6 < object3; ++object6) {
                    if (\u0440\u0445\u043e\u0440ArrayArray[n9][object6].\u0430o\u0441\u04bb >= 4.0 * d) {
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
                        double d3 = \u0456\u0456o\u04452.distance(dArray, dArrayArray2[object6]);
                        if (d3 < d2) {
                            d2 = d3;
                            n10 = object6;
                        }
                    }
                    switch (0) {
                        default: {
                            continue block37;
                        }
                        case 1: {
                            continue block37;
                        }
                        case 2: 
                    }
                }
                if (n10 == -1 || !((callSite = \u04bb\u0441x.a_bsm4("abs", abs(double ), (double)(\u04bb\u0441x.a_bsm3("sqrt", sqrt(double ), (double)d2) - \u04bb\u0441x.a_bsm3("sqrt", sqrt(double ), (double)d)))) > 3.0)) continue;
                ++object;
                nArray5[n8] = n10;
            }
            if (object == 0 && object2 != 0) break;
            double[] dArray3 = new double[object3];
            dArray = new double[object3];
            double[] dArray4 = new double[object3];
            \u04bb\u0441x.a_bsm5("fill", fill(int[] int ), (int[])nArray6, (int)0);
            for (n7 = 0; n7 < n4; ++n7) {
                int n11 = nArray5[n7];
                double[] dArray5 = dArrayArray[n7];
                int n12 = nArray4[n7];
                int n13 = n11;
                nArray6[n13] = nArray6[n13] + n12;
                int n14 = n11;
                dArray3[n14] = dArray3[n14] + dArray5[0] * (double)n12;
                int n15 = n11;
                dArray[n15] = dArray[n15] + dArray5[1] * (double)n12;
                int n16 = n11;
                dArray4[n16] = dArray4[n16] + dArray5[2] * (double)n12;
            }
            for (n7 = 0; n7 < object3; ++n7) {
                int n17 = nArray6[n7];
                if (n17 == 0) {
                    dArrayArray2[n7] = new double[]{0.0, 0.0, 0.0};
                    continue;
                }
                double d = dArray3[n7] / (double)n17;
                double d4 = dArray[n7] / (double)n17;
                double d5 = dArray4[n7] / (double)n17;
                dArrayArray2[n7][0] = d;
                dArrayArray2[n7][1] = d4;
                dArrayArray2[n7][2] = d5;
            }
        }
        LinkedHashMap<Integer, Integer> linkedHashMap2 = new LinkedHashMap<Integer, Integer>();
        block40: for (object = 0; object < object3; ++object) {
            int n18;
            int n19 = nArray6[object];
            if (n19 != 0 && !linkedHashMap2.containsKey(\u04bb\u0441x.a_bsm0("valueOf", valueOf(int ), (int)(n18 = \u0456\u0456o\u04452.toInt(dArrayArray2[object]))))) {
                linkedHashMap2.put((Integer)((Object)\u04bb\u0441x.a_bsm0("valueOf", valueOf(int ), (int)n18)), (Integer)((Object)\u04bb\u0441x.a_bsm0("valueOf", valueOf(int ), (int)n19)));
            }
            switch (0) {
                default: {
                    continue block40;
                }
                case 1: {
                    continue block40;
                }
                case 2: 
            }
        }
        return linkedHashMap2;
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

