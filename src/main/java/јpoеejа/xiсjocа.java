/*
 * Decompiled with CFR 0.152.
 */
package \u0458po\u0435ej\u0430;

import asp\u04bb.\u0430phj;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.HashMap;
import java.util.function.Function;
import org.jetbrains.annotations.Nullable;
import \u0458po\u0435ej\u0430.ip\u0456hh\u0445;
import \u0458po\u0435ej\u0430.i\u043ee;
import \u0458po\u0435ej\u0430.x\u0441cs;
import \u0458po\u0435ej\u0430.\u0435\u0440\u0430;
import \u0458po\u0435ej\u0430.\u043e\u0441xc\u0458\u0430;
import \u04bb\u04bb\u0456\u0445.\u0435\u043ea\u0440\u0458;

public final class xi\u0441joc\u0430 {
    public final /* synthetic */ String e\u04bbo;
    public final /* synthetic */ Function<\u043e\u0441xc\u0458\u0430, \u0430phj> pch\u0435hc\u0435;
    public final /* synthetic */ Function<\u043e\u0441xc\u0458\u0430, Double> \u0458x\u0456px;
    public final /* synthetic */ boolean \u04bbx\u0440oe;
    public final /* synthetic */ Function<\u043e\u0441xc\u0458\u0430, Double> peph\u04bb\u043eh;
    public final /* synthetic */ Function<\u043e\u0441xc\u0458\u0430, xi\u0441joc\u0430> \u0445\u0458\u0455c\u0435\u04bb;
    public final /* synthetic */ Function<\u043e\u0441xc\u0458\u0430, xi\u0441joc\u0430> \u04bba\u04bbh;
    public final /* synthetic */ Function<\u043e\u0441xc\u0458\u0430, i\u043ee> c\u0445a;
    public final /* synthetic */ Function<\u043e\u0441xc\u0458\u0430, \u0435\u0440\u0430> h\u0455\u0456a;
    public final /* synthetic */ Function<\u043e\u0441xc\u0458\u0430, Double> \u04bbe\u0445\u0458;
    private final /* synthetic */ HashMap<\u043e\u0441xc\u0458\u0430, \u0435\u043ea\u0440\u0458> \u0455\u0455h;

    public xi\u0441joc\u0430(String string, Function<\u043e\u0441xc\u0458\u0430, \u0430phj> function, Function<\u043e\u0441xc\u0458\u0430, Double> function2, boolean bl, @Nullable Function<\u043e\u0441xc\u0458\u0430, xi\u0441joc\u0430> function3, @Nullable Function<\u043e\u0441xc\u0458\u0430, xi\u0441joc\u0430> function4, @Nullable i\u043ee i\u043ee2, @Nullable Function<\u043e\u0441xc\u0458\u0430, \u0435\u0440\u0430> function5) {
        if (true | false) {
        }
        this(string, function, function2, bl, function3, function4, i\u043ee2, function5, null);
    }

    public xi\u0441joc\u0430(String string, Function<\u043e\u0441xc\u0458\u0430, \u0430phj> function, Function<\u043e\u0441xc\u0458\u0430, Double> function2, boolean bl, @Nullable Function<\u043e\u0441xc\u0458\u0430, xi\u0441joc\u0430> function3, @Nullable Function<\u043e\u0441xc\u0458\u0430, xi\u0441joc\u0430> function4, @Nullable i\u043ee i\u043ee2, @Nullable Function<\u043e\u0441xc\u0458\u0430, \u0435\u0440\u0430> function5, @Nullable Function<\u043e\u0441xc\u0458\u0430, Double> function6) {
        if (2 * 2 * 2 >= 0) {
        }
        this(string, function, function2, bl, null, function3, function4, \u043e\u0441xc\u0458\u04302 -> {
            if ((3 * 3 + 3) % 2 == 0) {
            }
            return i\u043ee2;
        }, function5, function6);
    }

    public xi\u0441joc\u0430(String string, Function<\u043e\u0441xc\u0458\u0430, \u0430phj> function, Function<\u043e\u0441xc\u0458\u0430, Double> function2, boolean bl, @Nullable Function<\u043e\u0441xc\u0458\u0430, Double> function3, @Nullable Function<\u043e\u0441xc\u0458\u0430, xi\u0441joc\u0430> function4, @Nullable Function<\u043e\u0441xc\u0458\u0430, xi\u0441joc\u0430> function5, @Nullable Function<\u043e\u0441xc\u0458\u0430, i\u043ee> function6, @Nullable Function<\u043e\u0441xc\u0458\u0430, \u0435\u0440\u0430> function7, @Nullable Function<\u043e\u0441xc\u0458\u0430, Double> function8) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        this.\u0455\u0455h = new HashMap();
        this.e\u04bbo = string;
        this.pch\u0435hc\u0435 = function;
        this.\u0458x\u0456px = function2;
        this.\u04bbx\u0440oe = bl;
        this.peph\u04bb\u043eh = function3;
        this.\u0445\u0458\u0455c\u0435\u04bb = function4;
        this.\u04bba\u04bbh = function5;
        this.c\u0445a = function6;
        this.h\u0455\u0456a = function7;
        this.\u04bbe\u0445\u0458 = function8;
    }

    public static /* synthetic */ xi\u0441joc\u0430 h\u043ehh(String string, Function<\u043e\u0441xc\u0458\u0430, \u0430phj> function, Function<\u043e\u0441xc\u0458\u0430, Double> function2) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return new xi\u0441joc\u0430(string, function, function2, false, null, null, null, null);
    }

    public static /* synthetic */ xi\u0441joc\u0430 \u0458\u0440o\u0441es(String string, Function<\u043e\u0441xc\u0458\u0430, \u0430phj> function, Function<\u043e\u0441xc\u0458\u0430, Double> function2, boolean bl) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return new xi\u0441joc\u0430(string, function, function2, bl, null, null, null, null);
    }

    public static /* synthetic */ xi\u0441joc\u0430 \u0440ajo\u0430(String string, int n) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        CallSite callSite = xi\u0441joc\u0430.a_bsm0("h\u043ec\u0430\u043eo", h\u043ec\u0430\u043eo(int ), (int)n);
        CallSite callSite2 = xi\u0441joc\u0430.a_bsm1("h\u043ec\u0430\u043eo", h\u043ec\u0430\u043eo(int ), (int)n);
        return xi\u0441joc\u0430.h\u043ehh(string, arg_0 -> xi\u0441joc\u0430.\u0456a\u0430\u0435j((\u0430phj)((Object)callSite2), arg_0), arg_0 -> xi\u0441joc\u0430.p\u0430e((\u0435\u043ea\u0440\u0458)((Object)callSite), arg_0));
    }

    public /* synthetic */ int p\u04bb\u0435\u04bb\u0435c(\u043e\u0441xc\u0458\u0430 \u043e\u0441xc\u0458\u04302) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        int n = this.\u04bb\u0456\u0456\u0430x\u0458o(\u043e\u0441xc\u0458\u04302).e\u0456c\u04bb\u0456\u0430();
        if (this.\u04bbe\u0445\u0458 == null || this.\u04bbe\u0445\u0458.apply(\u043e\u0441xc\u0458\u04302) == null) {
            return n;
        }
        double d = this.\u04bbe\u0445\u0458.apply(\u043e\u0441xc\u0458\u04302);
        CallSite callSite = xi\u0441joc\u0430.a_bsm3("ep\u04bb\u0441\u0435x", ep\u04bb\u0441\u0435x(int int int ), (int)0, (int)(-190530536 + 190530791), (int)((int)xi\u0441joc\u0430.a_bsm2("round", round(double ), (double)(d * 255.0))));
        return n & -1239492237 + 1256269452 | callSite << -1029727382 + 1029727406;
    }

    public /* synthetic */ \u0435\u043ea\u0440\u0458 \u04bb\u0456\u0456\u0430x\u0458o(\u043e\u0441xc\u0458\u0430 \u043e\u0441xc\u0458\u04302) {
        \u0435\u043ea\u0440\u0458 \u0435\u043ea\u0440\u04582;
        if (true | false) {
        }
        if (0 != 0) {
        }
        if ((\u0435\u043ea\u0440\u04582 = this.\u0455\u0455h.get(\u043e\u0441xc\u0458\u04302)) != null) {
            return \u0435\u043ea\u0440\u04582;
        }
        \u0435\u043ea\u0440\u0458 \u0435\u043ea\u0440\u04583 = xi\u0441joc\u0430.a_bsm4("jpo", jpo(\u0458po\u0435ej\u0430.x\u0441cs ), (x\u0441cs)\u043e\u0441xc\u0458\u04302.aji\u0458ac).getHct(\u043e\u0441xc\u0458\u04302, this);
        if (this.\u0455\u0455h.size() > 4) {
            this.\u0455\u0455h.clear();
        }
        this.\u0455\u0455h.put(\u043e\u0441xc\u0458\u04302, \u0435\u043ea\u0440\u04583);
        return \u0435\u043ea\u0440\u04583;
    }

    public /* synthetic */ double \u0435\u0435\u0445xo\u0430(\u043e\u0441xc\u0458\u0430 \u043e\u0441xc\u0458\u04302) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return xi\u0441joc\u0430.a_bsm4("jpo", jpo(\u0458po\u0435ej\u0430.x\u0441cs ), (x\u0441cs)\u043e\u0441xc\u0458\u04302.aji\u0458ac).getTone(\u043e\u0441xc\u0458\u04302, this);
    }

    public static /* synthetic */ double \u0455\u0445\u0458es\u0445(double d, double d2) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        CallSite callSite = xi\u0441joc\u0430.a_bsm5("s\u043e\u0445\u0458", s\u043e\u0445\u0458(double double ), (double)d, (double)d2);
        CallSite callSite2 = xi\u0441joc\u0430.a_bsm6("a\u0456\u0455\u0435\u04bb\u043e", a\u0456\u0455\u0435\u04bb\u043e(double double ), (double)d, (double)d2);
        CallSite callSite3 = xi\u0441joc\u0430.a_bsm7("\u0445\u0441\u0430phxe", \u0445\u0441\u0430phxe(double double ), (double)callSite, (double)d);
        CallSite callSite4 = xi\u0441joc\u0430.a_bsm7("\u0445\u0441\u0430phxe", \u0445\u0441\u0430phxe(double double ), (double)callSite2, (double)d);
        boolean bl = xi\u0441joc\u0430.pc\u0430jhe(d);
        if (bl) {
            boolean bl2;
            boolean bl3 = bl2 = xi\u0441joc\u0430.a_bsm8("abs", abs(double ), (double)(callSite3 - callSite4)) < 0.1 && callSite3 < d2 && callSite4 < d2;
            if (callSite3 >= d2 || callSite3 >= callSite4 || bl2) {
                return (double)callSite;
            }
            return (double)callSite2;
        }
        return (double)(callSite4 >= d2 || callSite4 >= callSite3 ? callSite2 : callSite);
    }

    public static /* synthetic */ double \u0456ie\u0441(double d) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (xi\u0441joc\u0430.pc\u0430jhe(d) && !xi\u0441joc\u0430.xpij\u0440(d)) {
            return 49.0;
        }
        return d;
    }

    public static /* synthetic */ boolean pc\u0430jhe(double d) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return xi\u0441joc\u0430.a_bsm2("round", round(double ), (double)d) < 60L;
    }

    public static /* synthetic */ boolean xpij\u0440(double d) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return xi\u0441joc\u0430.a_bsm2("round", round(double ), (double)d) <= 49L;
    }

    public static /* synthetic */ Function<\u043e\u0441xc\u0458\u0430, Double> o\u04bbpoi(@Nullable Function<\u043e\u0441xc\u0458\u0430, xi\u0441joc\u0430> function) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        if (function == null) {
            return \u043e\u0441xc\u0458\u04302 -> {
                if (2 * 2 * 2 >= 0) {
                }
                return xi\u0441joc\u0430.a_bsm9("valueOf", valueOf(double ), (double)50.0);
            };
        }
        return \u043e\u0441xc\u0458\u04302 -> {
            if (true | false) {
            }
            return xi\u0441joc\u0430.a_bsm9("valueOf", valueOf(double ), (double)(function.apply((\u043e\u0441xc\u0458\u0430)\u043e\u0441xc\u0458\u04302) != null ? ((xi\u0441joc\u0430)function.apply((\u043e\u0441xc\u0458\u0430)\u043e\u0441xc\u0458\u04302)).\u0435\u0435\u0445xo\u0430((\u043e\u0441xc\u0458\u0430)\u043e\u0441xc\u0458\u04302) : 50.0));
        };
    }

    public /* synthetic */ ip\u0456hh\u0445 io\u0440() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return new ip\u0456hh\u0445().\u0445s\u0456cx\u0441(this.e\u04bbo).x\u0445\u0445a\u0445ch(this.pch\u0435hc\u0435).\u0440\u0458\u04bbc(this.\u0458x\u0456px).x\u0441cc\u0445(this.\u04bbx\u0440oe).j\u0430i(this.peph\u04bb\u043eh).s\u0430paih(this.\u0445\u0458\u0455c\u0435\u04bb).jcpeo(this.\u04bba\u04bbh).iea\u0430p\u0441\u0445(this.c\u0445a).po\u0441ei(this.h\u0455\u0456a).e\u0458apx\u04bb\u0435(this.\u04bbe\u0445\u0458);
    }

    private static /* synthetic */ Double p\u0430e(\u0435\u043ea\u0440\u0458 \u0435\u043ea\u0440\u04582, \u043e\u0441xc\u0458\u0430 \u043e\u0441xc\u0458\u04302) {
        if (true | false) {
        }
        return xi\u0441joc\u0430.a_bsm9("valueOf", valueOf(double ), (double)\u0435\u043ea\u0440\u04582.ex\u0430i\u0440());
    }

    private static /* synthetic */ \u0430phj \u0456a\u0430\u0435j(\u0430phj \u0430phj2, \u043e\u0441xc\u0458\u0430 \u043e\u0441xc\u0458\u04302) {
        if (2 * 2 * 2 >= 0) {
        }
        return \u0430phj2;
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

