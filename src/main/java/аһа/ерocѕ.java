/*
 * Decompiled with CFR 0.152.
 */
package \u0430\u04bb\u0430;

import c\u0445is.s\u0456a\u0458;
import c\u0445is.\u0435\u0441\u0441c\u043e\u043e;
import h\u0440x\u0455io\u0441.xcs\u0440ixh;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import net.minecraft.class_2749;
import net.minecraft.class_2757;
import net.minecraft.class_310;
import net.minecraft.class_742;
import o\u0455sio\u0440.\u0445\u0458\u0458h\u0445\u0430a;
import \u043e\u0445\u0440\u0430ose.i\u0456\u0445\u0430\u0441p;

public class \u0435\u0440oc\u0455
extends xcs\u0440ixh {
    public static final /* synthetic */ Map<String, AtomicInteger> p\u0430\u0440;

    public \u0435\u0440oc\u0455() {
        if (true | false) {
        }
    }

    @\u0445\u0458\u0458h\u0445\u0430a(\u0435o\u0435x\u0445s=0)
    public void a\u0458\u0445\u0456(\u0435\u0441\u0441c\u043e\u043e \u0435\u0441\u0441c\u043e\u043e2) {
        block8: {
            class_2757 class_27572;
            Object object;
            block9: {
                String string;
                block10: {
                    if ((3 * 3 + 3) % 2 == 0) {
                    }
                    if (0 != 0) {
                    }
                    if (\u0435\u0441\u0441c\u043e\u043e2.p\u0440\u04bb() != i\u0456\u0445\u0430\u0441p.h\u0430\u043e) break block8;
                    if (((class_310)\u0435\u0440oc\u0455.a_bsm0("method_1551", method_1551())).field_1724 == null || !((object = \u0435\u0441\u0441c\u043e\u043e2.ciao\u0455\u0455()) instanceof class_2757)) break block9;
                    class_27572 = (class_2757)object;
                    if (((class_310)\u0435\u0440oc\u0455.a_bsm0("method_1551", method_1551())).field_1687 == null) break block9;
                    object = class_27572.comp_2123();
                    string = class_27572.comp_2122();
                    byte[] byArray = new byte[-76545805 + 76545816];
                    byArray[0] = -295736685 + 295736676;
                    byArray[1] = -1494496473 + 1494496522;
                    byArray[2] = -53249318 + 53249278;
                    byArray[3] = -1511893914 + 1511894040;
                    byArray[4] = -1074644911 + 1074644850;
                    byArray[5] = -1446382775 + 1446382839;
                    byArray[-19141504 + 19141510] = -786663953 + 786664023;
                    byArray[-1537647947 + 1537647954] = -1736020757 + 1736020753;
                    byArray[-553478886 + 553478894] = 4;
                    byArray[-362121057 + 362121066] = -1961434875 + 1961434949;
                    byArray[-1308086786 + 1308086796] = -1313368667 + 1313368585;
                    if (((String)((Object)\u0435\u0440oc\u0455.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-1165222781 + 727107935), (int)(-1195872214 + 1424465269)))).equals(object)) break block10;
                    byte[] byArray2 = new byte[-237547289 + 237547295];
                    byArray2[0] = -1623528790 + 1623528730;
                    byArray2[1] = -1881622978 + 1881623069;
                    byArray2[2] = -1474704539 + 1474704550;
                    byArray2[3] = -698972591 + 698972476;
                    byArray2[4] = -2024634934 + 2024634907;
                    byArray2[5] = -363628392 + 363628265;
                    if (!((String)((Object)\u0435\u0440oc\u0455.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray2, (int)(-282324765 + 1314139292), (int)(2117207039 + 2133326170)))).equals(object)) break block9;
                }
                if (!string.equals(((class_310)\u0435\u0440oc\u0455.a_bsm0("method_1551", method_1551())).field_1724.method_7334().getName())) {
                    if (!p\u0430\u0440.containsKey(string)) {
                        p\u0430\u0440.put(string, new AtomicInteger());
                    }
                    p\u0430\u0440.get(string).set(class_27572.comp_2124());
                }
            }
            if ((object = \u0435\u0441\u0441c\u043e\u043e2.ciao\u0455\u0455()) instanceof class_2749 && (class_27572 = (class_2749)object).method_11833() > 20.0f) {
                \u0435\u0441\u0441c\u043e\u043e2.setCancelled(true);
            }
        }
    }

    @\u0445\u0458\u0458h\u0445\u0430a
    public void \u0441\u0445\u0455e\u0440(s\u0456a\u0458 s\u0456a\u04582) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        CallSite callSite = \u0435\u0440oc\u0455.a_bsm0("method_1551", method_1551());
        if (((class_310)callSite).field_1687 != null) {
            for (class_742 class_7422 : ((class_310)callSite).field_1687.method_18456()) {
                String string = class_7422.method_7334().getName();
                if (class_7422 == ((class_310)callSite).field_1724 || !p\u0430\u0440.containsKey(string)) continue;
                class_7422.method_6033((float)\u0435\u0440oc\u0455.a_bsm2("max", max(int int ), (int)1, (int)p\u0430\u0440.get(string).get()));
            }
        }
    }

    static {
        p\u0430\u0440 = new HashMap<String, AtomicInteger>();
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
}

