/*
 * Decompiled with CFR 0.152.
 */
package p\u0430a\u04bb\u0430\u0456;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import \u04bb\u04bb\u0456\u0445.\u0435\u043ea\u0440\u0458;

public final class \u0458\u0445\u0458\u0440 {
    private final /* synthetic */ \u0435\u043ea\u0440\u0458 e\u043ep;
    private /* synthetic */ \u0435\u043ea\u0440\u0458 \u0430\u0441\u0445a\u0441e\u0456;
    private /* synthetic */ List<\u0435\u043ea\u0440\u0458> e\u0440\u0445\u0440\u0445cc;
    private /* synthetic */ List<\u0435\u043ea\u0440\u0458> \u0456\u0440j\u0435\u0458h;
    private /* synthetic */ Map<\u0435\u043ea\u0440\u0458, Double> ae\u0458io\u0441\u0445;

    private \u0458\u0445\u0458\u0440() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        throw new UnsupportedOperationException();
    }

    public \u0458\u0445\u0458\u0440(\u0435\u043ea\u0440\u0458 \u0435\u043ea\u0440\u04582) {
        if (2 * 2 * 2 >= 0) {
        }
        this.e\u043ep = \u0435\u043ea\u0440\u04582;
    }

    public /* synthetic */ \u0435\u043ea\u0440\u0458 \u0441aj() {
        double d;
        double d2;
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if (this.\u0430\u0441\u0445a\u0441e\u0456 != null) {
            return this.\u0430\u0441\u0445a\u0441e\u0456;
        }
        double d3 = this.\u0441io\u043exj().\u0440os\u043eo();
        double d4 = this.\u043ep\u04bbx\u0456().get(this.\u0441io\u043exj());
        double d5 = this.\u0430p\u0430\u0455\u0455s\u0430().\u0440os\u043eo();
        double d6 = this.\u043ep\u04bbx\u0456().get(this.\u0430p\u0430\u0455\u0455s\u0430());
        double d7 = d6 - d4;
        boolean bl = \u0458\u0445\u0458\u0440.\u0458\u0445\u043eo\u0440o(this.e\u043ep.\u0440os\u043eo(), d3, d5);
        double d8 = d2 = bl ? d5 : d3;
        if (bl) {
            d = d3;
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
            d = d5;
        }
        double d9 = d;
        double d10 = 1.0;
        Object object = 1000.0;
        \u0435\u043ea\u0440\u0458 \u0435\u043ea\u0440\u04582 = this.x\u0458\u0435e\u0458().get((int)\u0458\u0445\u0458\u0440.a_bsm0("round", round(double ), (double)this.e\u043ep.\u0440os\u043eo()));
        double d11 = 1.0 - this.ox\u04bbe(this.e\u043ep);
        block12: for (double d12 = 0.0; d12 <= 360.0; d12 += 1.0) {
            CallSite callSite = \u0458\u0445\u0458\u0440.a_bsm1("a\u04bbj\u043e\u043ec", a\u04bbj\u043e\u043ec(double ), (double)(d2 + d10 * d12));
            if (!\u0458\u0445\u0458\u0440.\u0458\u0445\u043eo\u0440o((double)callSite, d2, d9)) {
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
                \u0435\u043ea\u0440\u0458 \u0435\u043ea\u0440\u04583 = this.x\u0458\u0435e\u0458().get((int)\u0458\u0445\u0458\u0440.a_bsm0("round", round(double ), (double)callSite));
                double d13 = (this.\u043ep\u04bbx\u0456().get(\u0435\u043ea\u0440\u04583) - d4) / d7;
                CallSite callSite2 = \u0458\u0445\u0458\u0440.a_bsm2("abs", abs(double ), (double)(d11 - d13));
                if (callSite2 < object) {
                    object = callSite2;
                    \u0435\u043ea\u0440\u04582 = \u0435\u043ea\u0440\u04583;
                }
            }
            switch (0) {
                default: {
                    continue block12;
                }
                case 1: {
                    continue block12;
                }
                case 2: 
            }
        }
        this.\u0430\u0441\u0445a\u0441e\u0456 = \u0435\u043ea\u0440\u04582;
        return this.\u0430\u0441\u0445a\u0441e\u0456;
    }

    public /* synthetic */ List<\u0435\u043ea\u0440\u0458> \u0440\u0455\u0456pccc() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return this.\u0445x\u04bbj\u043e\u0441(5, -416728630 + 416728642);
    }

    public /* synthetic */ List<\u0435\u043ea\u0440\u0458> \u0445x\u04bbj\u043e\u0441(int n, int n2) {
        int n3;
        int n4;
        double d;
        int n5;
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        int n6 = (int)\u0458\u0445\u0458\u0440.a_bsm0("round", round(double ), (double)this.e\u043ep.\u0440os\u043eo());
        \u0435\u043ea\u0440\u0458 \u0435\u043ea\u0440\u04582 = this.x\u0458\u0435e\u0458().get(n6);
        double d2 = this.ox\u04bbe(\u0435\u043ea\u0440\u04582);
        ArrayList<\u0435\u043ea\u0440\u0458> arrayList = new ArrayList<\u0435\u043ea\u0440\u0458>();
        arrayList.add(\u0435\u043ea\u0440\u04582);
        double d3 = 0.0;
        for (n5 = 0; n5 < -1837974486 + 1837974846; ++n5) {
            CallSite callSite = \u0458\u0445\u0458\u0440.a_bsm3("\u0458x\u0445\u0456\u0441\u043ei", \u0458x\u0445\u0456\u0441\u043ei(int ), (int)(n6 + n5));
            \u0435\u043ea\u0440\u0458 \u0435\u043ea\u0440\u04583 = this.x\u0458\u0435e\u0458().get((int)callSite);
            d = this.ox\u04bbe(\u0435\u043ea\u0440\u04583);
            CallSite callSite2 = \u0458\u0445\u0458\u0440.a_bsm2("abs", abs(double ), (double)(d - d2));
            d2 = d;
            d3 += callSite2;
        }
        n5 = 1;
        double d4 = d3 / (double)n2;
        d = 0.0;
        d2 = this.ox\u04bbe(\u0435\u043ea\u0440\u04582);
        while (arrayList.size() < n2) {
            boolean bl;
            double d5;
            CallSite callSite = \u0458\u0445\u0458\u0440.a_bsm3("\u0458x\u0445\u0456\u0441\u043ei", \u0458x\u0445\u0456\u0441\u043ei(int ), (int)(n6 + n5));
            \u0435\u043ea\u0440\u0458 \u0435\u043ea\u0440\u04584 = this.x\u0458\u0435e\u0458().get((int)callSite);
            double d6 = this.ox\u04bbe(\u0435\u043ea\u0440\u04584);
            CallSite callSite3 = \u0458\u0445\u0458\u0440.a_bsm2("abs", abs(double ), (double)(d6 - d2));
            if ((d += callSite3) >= (d5 = (double)arrayList.size() * d4)) {
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
            int n7 = 1;
            while (bl2 && arrayList.size() < n2) {
                arrayList.add(\u0435\u043ea\u0440\u04584);
                d5 = (double)(arrayList.size() + n7) * d4;
                bl2 = d >= d5;
                ++n7;
            }
            d2 = d6;
            if (++n5 <= -941538317 + 941538677) continue;
            while (arrayList.size() < n2) {
                arrayList.add(\u0435\u043ea\u0440\u04584);
            }
            break block9;
        }
        ArrayList<\u0435\u043ea\u0440\u0458> arrayList2 = new ArrayList<\u0435\u043ea\u0440\u0458>();
        arrayList2.add(this.e\u043ep);
        int n8 = (int)\u0458\u0445\u0458\u0440.a_bsm4("floor", floor(double ), (double)(((double)n - 1.0) / 2.0));
        for (n4 = 1; n4 < n8 + 1; ++n4) {
            n3 = 0 - n4;
            block13: while (n3 < 0) {
                n3 = arrayList.size() + n3;
                switch (0) {
                    default: {
                        continue block13;
                    }
                    case 1: {
                        continue block13;
                    }
                    case 2: 
                }
            }
            if (n3 >= arrayList.size()) {
                n3 %= arrayList.size();
            }
            arrayList2.add(0, (\u0435\u043ea\u0440\u0458)arrayList.get(n3));
        }
        n4 = n - n8 - 1;
        for (n3 = 1; n3 < n4 + 1; ++n3) {
            int n9 = n3;
            while (n9 < 0) {
                n9 = arrayList.size() + n9;
            }
            if (n9 >= arrayList.size()) {
                n9 %= arrayList.size();
            }
            arrayList2.add((\u0435\u043ea\u0440\u0458)arrayList.get(n9));
        }
        return arrayList2;
    }

    public /* synthetic */ double ox\u04bbe(\u0435\u043ea\u0440\u0458 \u0435\u043ea\u0440\u04582) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        double d = this.\u043ep\u04bbx\u0456().get(this.\u0430p\u0430\u0455\u0455s\u0430()) - this.\u043ep\u04bbx\u0456().get(this.\u0441io\u043exj());
        double d2 = this.\u043ep\u04bbx\u0456().get(\u0435\u043ea\u0440\u04582) - this.\u043ep\u04bbx\u0456().get(this.\u0441io\u043exj());
        if (d == 0.0) {
            return 0.5;
        }
        return d2 / d;
    }

    public static /* synthetic */ double x\u043e\u0441o\u0430\u0445(\u0435\u043ea\u0440\u0458 \u0435\u043ea\u0440\u04582) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        CallSite callSite = \u0458\u0445\u0458\u0440.a_bsm5("e\u0445a", e\u0445a(int ), (int)\u0435\u043ea\u0440\u04582.e\u0456c\u04bb\u0456\u0430());
        CallSite callSite2 = \u0458\u0445\u0458\u0440.a_bsm1("a\u04bbj\u043e\u043ec", a\u04bbj\u043e\u043ec(double ), (double)\u0458\u0445\u0458\u0440.a_bsm7("toDegrees", toDegrees(double ), (double)\u0458\u0445\u0458\u0440.a_bsm6("atan2", atan2(double double ), (double)callSite[2], (double)callSite[1])));
        CallSite callSite3 = \u0458\u0445\u0458\u0440.a_bsm8("hypot", hypot(double double ), (double)callSite[1], (double)callSite[2]);
        return -0.5 + 0.02 * \u0458\u0445\u0458\u0440.a_bsm9("pow", pow(double double ), (double)callSite3, (double)1.07) * \u0458\u0445\u0458\u0440.a_bsm11("cos", cos(double ), (double)\u0458\u0445\u0458\u0440.a_bsm10("toRadians", toRadians(double ), (double)\u0458\u0445\u0458\u0440.a_bsm1("a\u04bbj\u043e\u043ec", a\u04bbj\u043e\u043ec(double ), (double)(callSite2 - 50.0))));
    }

    private /* synthetic */ \u0435\u043ea\u0440\u0458 \u0441io\u043exj() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return this.e\u0455\u0435().get(0);
    }

    private /* synthetic */ List<\u0435\u043ea\u0440\u0458> x\u0458\u0435e\u0458() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if (this.\u0456\u0440j\u0435\u0458h != null) {
            return this.\u0456\u0440j\u0435\u0458h;
        }
        ArrayList<CallSite> arrayList = new ArrayList<CallSite>();
        for (double d = 0.0; d <= 360.0; d += 1.0) {
            CallSite callSite = \u0458\u0445\u0458\u0440.a_bsm12("\u043e\u0455\u043e", \u043e\u0455\u043e(double double double ), (double)d, (double)this.e\u043ep.\u04bbeis\u0430(), (double)this.e\u043ep.ex\u0430i\u0440());
            arrayList.add(callSite);
        }
        this.\u0456\u0440j\u0435\u0458h = \u0458\u0445\u0458\u0440.a_bsm13("unmodifiableList", unmodifiableList(java.util.List<? extends T> ), arrayList);
        return this.\u0456\u0440j\u0435\u0458h;
    }

    private /* synthetic */ List<\u0435\u043ea\u0440\u0458> e\u0455\u0435() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (this.e\u0440\u0445\u0440\u0445cc != null) {
            return this.e\u0440\u0445\u0440\u0445cc;
        }
        ArrayList<\u0435\u043ea\u0440\u0458> arrayList = new ArrayList<\u0435\u043ea\u0440\u0458>(this.x\u0458\u0435e\u0458());
        arrayList.add(this.e\u043ep);
        CallSite callSite = \u0458\u0445\u0458\u0440.a_bsm14("comparing", comparing(java.util.function.Function<? super T, ? extends U> java.util.Comparator<? super U> ), \u0435\u043ea\u0440\u04582 -> {
            if (2 * 2 * 2 >= 0) {
            }
            return this.\u043ep\u04bbx\u0456().get(\u0435\u043ea\u0440\u04582);
        }, Double::compareTo);
        \u0458\u0445\u0458\u0440.a_bsm15("sort", sort(java.util.List<T> java.util.Comparator<? super T> ), arrayList, (Comparator)((Object)callSite));
        this.e\u0440\u0445\u0440\u0445cc = arrayList;
        return this.e\u0440\u0445\u0440\u0445cc;
    }

    private /* synthetic */ Map<\u0435\u043ea\u0440\u0458, Double> \u043ep\u04bbx\u0456() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        if (this.ae\u0458io\u0441\u0445 != null) {
            return this.ae\u0458io\u0441\u0445;
        }
        ArrayList<\u0435\u043ea\u0440\u0458> arrayList = new ArrayList<\u0435\u043ea\u0440\u0458>(this.x\u0458\u0435e\u0458());
        arrayList.add(this.e\u043ep);
        HashMap<\u0435\u043ea\u0440\u0458, Double> hashMap = new HashMap<\u0435\u043ea\u0440\u0458, Double>();
        for (\u0435\u043ea\u0440\u0458 \u0435\u043ea\u0440\u04582 : arrayList) {
            hashMap.put(\u0435\u043ea\u0440\u04582, (Double)((Object)\u0458\u0445\u0458\u0440.a_bsm16("valueOf", valueOf(double ), (double)\u0458\u0445\u0458\u0440.x\u043e\u0441o\u0430\u0445(\u0435\u043ea\u0440\u04582))));
        }
        this.ae\u0458io\u0441\u0445 = hashMap;
        return this.ae\u0458io\u0441\u0445;
    }

    private /* synthetic */ \u0435\u043ea\u0440\u0458 \u0430p\u0430\u0455\u0455s\u0430() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return this.e\u0455\u0435().get(this.e\u0455\u0435().size() - 1);
    }

    private static /* synthetic */ boolean \u0458\u0445\u043eo\u0440o(double d, double d2, double d3) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        if (d2 < d3) {
            return d2 <= d && d <= d3;
        }
        return d2 <= d || d <= d3;
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

    private static /* synthetic */ CallSite a_bsm10(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm11(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm12(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm13(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm14(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm15(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm16(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }
}

