/*
 * Decompiled with CFR 0.152.
 */
package asp\u04bb;

import asp\u04bb.\u0456\u0458\u0455xp;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.HashMap;
import java.util.Map;
import \u04bb\u04bb\u0456\u0445.\u0435\u043ea\u0440\u0458;

public final class \u0430phj {
    /* synthetic */ Map<Integer, Integer> \u0430\u0441\u0455\u043e\u0441hs;
    /* synthetic */ \u0435\u043ea\u0440\u0458 \u0456x\u043e\u0456\u0458\u04bb;
    /* synthetic */ double \u0445\u0435xho\u04bb\u0456;
    /* synthetic */ double \u0430\u0430\u0441;

    public static /* synthetic */ \u0430phj h\u043ec\u0430\u043eo(int n) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return \u0430phj.\u0435\u0441x\u0435\u0440\u0435((\u0435\u043ea\u0440\u0458)((Object)\u0430phj.a_bsm0("h\u043ec\u0430\u043eo", h\u043ec\u0430\u043eo(int ), (int)n)));
    }

    public static /* synthetic */ \u0430phj \u0435\u0441x\u0435\u0440\u0435(\u0435\u043ea\u0440\u0458 \u0435\u043ea\u0440\u04582) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return new \u0430phj(\u0435\u043ea\u0440\u04582.\u0440os\u043eo(), \u0435\u043ea\u0440\u04582.\u04bbeis\u0430(), \u0435\u043ea\u0440\u04582);
    }

    public static /* synthetic */ \u0430phj oipa\u0455j(double d, double d2) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        \u0435\u043ea\u0440\u0458 \u0435\u043ea\u0440\u04582 = new \u0456\u0458\u0455xp(d, d2).x\u0441o();
        return new \u0430phj(d, d2, \u0435\u043ea\u0440\u04582);
    }

    private \u0430phj(double d, double d2, \u0435\u043ea\u0440\u0458 \u0435\u043ea\u0440\u04582) {
        if (2 * 2 * 2 >= 0) {
        }
        this.\u0430\u0441\u0455\u043e\u0441hs = new HashMap<Integer, Integer>();
        this.\u0445\u0435xho\u04bb\u0456 = d;
        this.\u0430\u0430\u0441 = d2;
        this.\u0456x\u043e\u0456\u0458\u04bb = \u0435\u043ea\u0440\u04582;
    }

    public /* synthetic */ int \u0456x\u0456\u0440\u0445p\u0445(int n) {
        Object object;
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        if ((object = this.\u0430\u0441\u0455\u043e\u0441hs.get(\u0430phj.a_bsm1("valueOf", valueOf(int ), (int)n))) == null) {
            object = n == -600250593 + 600250692 && \u0430phj.a_bsm2("c\u0445h\u043eps\u0445", c\u0445h\u043eps\u0445(double ), (double)this.\u0445\u0435xho\u04bb\u0456) != false ? \u0430phj.a_bsm1("valueOf", valueOf(int ), (int)this.i\u0456c(this.\u0456x\u0456\u0440\u0445p\u0445(-144746967 + 144747065), this.\u0456x\u0456\u0440\u0445p\u0445(-296232317 + 296232417))) : \u0430phj.a_bsm1("valueOf", valueOf(int ), (int)((\u0435\u043ea\u0440\u0458)((Object)\u0430phj.a_bsm3("\u043e\u0455\u043e", \u043e\u0455\u043e(double double double ), (double)this.\u0445\u0435xho\u04bb\u0456, (double)this.\u0430\u0430\u0441, (double)n))).e\u0456c\u04bb\u0456\u0430());
            this.\u0430\u0441\u0455\u043e\u0441hs.put((Integer)((Object)\u0430phj.a_bsm1("valueOf", valueOf(int ), (int)n)), (Integer)object);
        }
        return (Integer)object;
    }

    public /* synthetic */ \u0435\u043ea\u0440\u0458 a\u0458h\u0445p(double d) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if (d == 99.0 && \u0430phj.a_bsm2("c\u0445h\u043eps\u0445", c\u0445h\u043eps\u0445(double ), (double)this.\u0445\u0435xho\u04bb\u0456) != false) {
            return \u0430phj.a_bsm0("h\u043ec\u0430\u043eo", h\u043ec\u0430\u043eo(int ), (int)this.\u0456x\u0456\u0440\u0445p\u0445(-159856100 + 159856199));
        }
        return \u0430phj.a_bsm3("\u043e\u0455\u043e", \u043e\u0455\u043e(double double double ), (double)this.\u0445\u0435xho\u04bb\u0456, (double)this.\u0430\u0430\u0441, (double)d);
    }

    public /* synthetic */ double \u04bbeis\u0430() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return this.\u0430\u0430\u0441;
    }

    public /* synthetic */ double \u0440os\u043eo() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return this.\u0445\u0435xho\u04bb\u0456;
    }

    public /* synthetic */ \u0435\u043ea\u0440\u0458 \u0440aeo\u0445() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return this.\u0456x\u043e\u0456\u0458\u04bb;
    }

    private /* synthetic */ int i\u0456c(int n, int n2) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        int n3 = n >>> -1806428707 + 1806428723 & -899526426 + 899526681;
        int n4 = n >>> -815858920 + 815858928 & -1045559443 + 1045559698;
        int n5 = n & -925443288 + 925443543;
        int n6 = n2 >>> -1287382601 + 1287382617 & -945629705 + 945629960;
        int n7 = n2 >>> -804814064 + 804814072 & -1689739434 + 1689739689;
        int n8 = n2 & -261053644 + 261053899;
        CallSite callSite = \u0430phj.a_bsm4("round", round(float ), (float)((float)(n3 + n6) / 2.0f));
        CallSite callSite2 = \u0430phj.a_bsm4("round", round(float ), (float)((float)(n4 + n7) / 2.0f));
        CallSite callSite3 = \u0430phj.a_bsm4("round", round(float ), (float)((float)(n5 + n8) / 2.0f));
        return (-1429977694 + 1413200478 | (callSite & -690047616 + 690047871) << -1630513451 + 1630513467 | (callSite2 & -2112419938 + 2112420193) << -1931665248 + 1931665256 | callSite3 & -1160033533 + 1160033788) >>> 0;
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

