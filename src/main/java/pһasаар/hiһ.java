/*
 * Decompiled with CFR 0.152.
 */
package p\u04bbas\u0430\u0430\u0440;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p\u04bbas\u0430\u0430\u0440.\u0441o\u0430;
import p\u04bbas\u0430\u0430\u0440.\u0445pcp;
import \u04bb\u04bb\u0456\u0445.\u0435\u043ea\u0440\u0458;

public final class hi\u04bb {
    private static final /* synthetic */ double \u0441\u043e\u0441 = 48.0;
    private static final /* synthetic */ double ahx\u0441p\u04bb = 0.7;
    private static final /* synthetic */ double \u0455cip = 0.3;
    private static final /* synthetic */ double hcecp = 0.1;
    private static final /* synthetic */ double \u0430\u0456\u0441c = 5.0;
    private static final /* synthetic */ double j\u0441jxij = 0.01;

    private hi\u04bb() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
    }

    public static /* synthetic */ List<Integer> j\u0440oc\u0441\u0430p(Map<Integer, Integer> map) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return hi\u04bb.\u0441e\u0456a\u0430(map, 4, -1068979434 + 1056561886, true);
    }

    public static /* synthetic */ List<Integer> p\u043ei\u0435\u043ep\u0440(Map<Integer, Integer> map, int n) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return hi\u04bb.\u0441e\u0456a\u0430(map, n, -526504368 + 514086820, true);
    }

    public static /* synthetic */ List<Integer> \u043eh\u043e\u0445ox(Map<Integer, Integer> map, int n, int n2) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return hi\u04bb.\u0441e\u0456a\u0430(map, n, n2, true);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ List<Integer> \u0441e\u0456a\u0430(Map<Integer, Integer> map, int n, int n2, boolean bl) {
        void arrayList4;
        Object object;
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        ArrayList<CallSite> arrayList = new ArrayList<CallSite>();
        int[] nArray = new int[-1513819738 + 1513820098];
        double d = 0.0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int n3;
            CallSite callSite = hi\u04bb.a_bsm0("h\u043ec\u0430\u043eo", h\u043ec\u0430\u043eo(int ), (int)entry.getKey());
            arrayList.add(callSite);
            int n4 = n3 = (int)hi\u04bb.a_bsm1("floor", floor(double ), (double)((\u0435\u043ea\u0440\u0458)((Object)callSite)).\u0440os\u043eo());
            nArray[n4] = nArray[n4] + entry.getValue();
            d += (double)entry.getValue().intValue();
        }
        Object object2 = new double[-1534786978 + 1534787338];
        for (int i = 0; i < -1057171248 + 1057171608; ++i) {
            double d2 = (double)nArray[i] / d;
            for (object = i - (-664275585 + 664275599); object < i + (-1737232014 + 1737232030); ++object) {
                CallSite object4 = hi\u04bb.a_bsm2("\u0458x\u0445\u0456\u0441\u043ei", \u0458x\u0445\u0456\u0441\u043ei(int ), (int)object);
                Object object3 = object2;
                CallSite callSite = object4;
                object3[callSite] = object3[callSite] + d2;
            }
        }
        ArrayList<\u0441o\u0430> arrayList2 = new ArrayList<\u0441o\u0430>();
        for (\u0435\u043ea\u0440\u0458 \u0435\u043ea\u0440\u04582 : arrayList) {
            object = hi\u04bb.a_bsm2("\u0458x\u0445\u0456\u0441\u043ei", \u0458x\u0445\u0456\u0441\u043ei(int ), (int)((int)hi\u04bb.a_bsm3("round", round(double ), (double)\u0435\u043ea\u0440\u04582.\u0440os\u043eo())));
            Object \u0441o\u04302 = object2[object];
            if (bl && (\u0435\u043ea\u0440\u04582.\u04bbeis\u0430() < 5.0 || \u0441o\u04302 <= 0.01)) continue;
            reference bl2 = \u0441o\u04302 * 100.0 * 0.7;
            double \u0435\u043ea\u0440\u04584 = \u0435\u043ea\u0440\u04582.\u04bbeis\u0430() < 48.0 ? 0.1 : 0.3;
            double d2 = (\u0435\u043ea\u0440\u04582.\u04bbeis\u0430() - 48.0) * \u0435\u043ea\u0440\u04584;
            reference var21_32 = bl2 + d2;
            arrayList2.add(new \u0441o\u0430(\u0435\u043ea\u0440\u04582, (double)var21_32));
        }
        hi\u04bb.a_bsm4("sort", sort(java.util.List<T> java.util.Comparator<? super T> ), arrayList2, (Comparator)new \u0445pcp());
        ArrayList arrayList3 = new ArrayList();
        int i = -404377469 + 404377559;
        while (arrayList4 >= -23198342 + 23198357) {
            arrayList3.clear();
            for (\u0441o\u0430 \u0435\u043ea\u0440\u04585 : arrayList2) {
                \u0435\u043ea\u0440\u0458 \u0435\u043ea\u0440\u04582 = \u0435\u043ea\u0440\u04585.\u0441se\u0455;
                boolean bl2 = false;
                Iterator iterator = arrayList3.iterator();
                while (iterator.hasNext()) {
                    \u0435\u043ea\u0440\u0458 \u0435\u043ea\u0440\u04583 = (\u0435\u043ea\u0440\u0458)iterator.next();
                    if (!(hi\u04bb.a_bsm5("cx\u0435j", cx\u0435j(double double ), (double)\u0435\u043ea\u0440\u04582.\u0440os\u043eo(), (double)\u0435\u043ea\u0440\u04583.\u0440os\u043eo()) < (double)arrayList4)) continue;
                    bl2 = true;
                    break;
                }
                if (!bl2) {
                    arrayList3.add(\u0435\u043ea\u0440\u04582);
                }
                if (arrayList3.size() < n) continue;
                break;
            }
            if (arrayList3.size() >= n) break;
            --arrayList4;
        }
        ArrayList<Integer> arrayList5 = new ArrayList<Integer>();
        if (arrayList3.isEmpty()) {
            arrayList5.add((Integer)((Object)hi\u04bb.a_bsm6("valueOf", valueOf(int ), (int)n2)));
        }
        Iterator iterator = arrayList3.iterator();
        block11: while (iterator.hasNext()) {
            \u0435\u043ea\u0440\u0458 \u0435\u043ea\u0440\u04584 = (\u0435\u043ea\u0440\u0458)iterator.next();
            arrayList5.add((Integer)((Object)hi\u04bb.a_bsm6("valueOf", valueOf(int ), (int)\u0435\u043ea\u0440\u04584.e\u0456c\u04bb\u0456\u0430())));
            switch (0) {
                default: {
                    continue block11;
                }
                case 1: {
                    continue block11;
                }
                case 2: 
            }
        }
        return arrayList5;
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
}

