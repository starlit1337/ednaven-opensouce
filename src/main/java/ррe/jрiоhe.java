/*
 * Decompiled with CFR 0.152.
 */
package \u0440\u0440e;

import c\u0445is.\u0430\u0456i\u043ephj;
import c\u0445is.\u043eo\u0435;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_1268;
import net.minecraft.class_1799;
import net.minecraft.class_1829;
import net.minecraft.class_1887;
import net.minecraft.class_1893;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_239;
import net.minecraft.class_2431;
import net.minecraft.class_2449;
import net.minecraft.class_2560;
import net.minecraft.class_2680;
import net.minecraft.class_3965;
import o\u0455sio\u0440.\u0445\u0458\u0458h\u0445\u0430a;
import spso.\u0430c\u0440;
import spso.\u0441a\u0458p;
import \u0435xp.h\u04bb\u0455hpa;
import \u043e\u0445\u0440\u0430ose.i\u0456\u0445\u0430\u0441p;
import \u0445eo.c\u0455pi;
import \u0445eo.\u0456p\u0430\u043e\u0458\u043e;
import \u0445eo.\u0458i\u0456x;

@\u0456p\u0430\u043e\u0458\u043e(sp\u0456p\u0445\u0435="AutoTools", a\u0456j\u0430\u0455\u04bb="Automatically switches to the best tool for the job", s\u0455cj=\u0458i\u0456x.MISC)
public class j\u0440i\u043ehe
extends c\u0455pi {
    private final /* synthetic */ h\u04bb\u0455hpa \u0435ea;
    private final /* synthetic */ h\u04bb\u0455hpa \u0458joa\u0445c;
    private final /* synthetic */ h\u04bb\u0455hpa i\u0456\u0455sc\u0458\u0458;
    private /* synthetic */ int se\u0435c;
    private /* synthetic */ class_2338 \u04bbs\u0435\u0455hh\u04bb;
    private static /* synthetic */ int __js_dispatch_state = 0;

    public j\u0440i\u043ehe() {
        if (2 * 2 * 2 >= 0) {
        }
        if (j\u0440i\u043ehe.$_h1qyl2y01ngan17lfe((long)j\u0440i\u043ehe.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)j\u0440i\u043ehe.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        byte[] byArray = new byte[-1212582922 + 1212582933];
        byArray[0] = -1451747390 + 1451747461;
        byArray[1] = -102490765 + 102490647;
        byArray[2] = -1477296546 + 1477296629;
        byArray[3] = -865221257 + 865221344;
        byArray[4] = -1686180263 + 1686180173;
        byArray[5] = -1119012978 + 1119013038;
        byArray[-548062374 + 548062380] = -98961670 + 98961588;
        byArray[-1233177680 + 1233177687] = -307795462 + 307795389;
        byArray[-555104046 + 555104054] = -828227345 + 828227433;
        byArray[-719967319 + 719967328] = -1229338153 + 1229338094;
        byArray[-1830538983 + 1830538993] = -886034372 + 886034495;
        this.\u0435ea = ((\u0430c\u0440)((Object)j\u0440i\u043ehe.a_bsm2("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)j\u0440i\u043ehe.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-775285172 + 1234634004), (int)(-1017675074 + 622421426)))))).\u0455xi\u0440(true).\u0458c\u0456\u0440().getBooleanValue();
        byte[] byArray2 = new byte[-1685200826 + 1685200837];
        byArray2[0] = -649440251 + 649440355;
        byArray2[1] = -975558175 + 975558249;
        byArray2[2] = -1918243445 + 1918243475;
        byArray2[3] = -1004058513 + 1004058636;
        byArray2[4] = -1271522071 + 1271522192;
        byArray2[5] = -1327952866 + 1327952793;
        byArray2[-1697857440 + 1697857446] = -1454100853 + 1454100766;
        byArray2[-1455311564 + 1455311571] = -1465321356 + 1465321402;
        byArray2[-1234468628 + 1234468636] = -99499702 + 99499640;
        byArray2[-319720798 + 319720807] = -331970954 + 331971067;
        byArray2[-164639469 + 164639479] = -149612002 + 149611912;
        this.\u0458joa\u0445c = ((\u0430c\u0440)((Object)j\u0440i\u043ehe.a_bsm2("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)j\u0440i\u043ehe.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray2, (int)(844291628 + 1436002750), (int)(-1111914804 + 1016099709)))))).\u0455xi\u0440(true).\u0458c\u0456\u0440().getBooleanValue();
        byte[] byArray3 = new byte[-276031187 + 276031193];
        byArray3[0] = -1681537 + 1681431;
        byArray3[1] = -409140488 + 409140385;
        byArray3[2] = 4;
        byArray3[3] = -25766103 + 25766091;
        byArray3[4] = -834352476 + 834352375;
        byArray3[5] = -294144791 + 294144851;
        CallSite callSite = j\u0440i\u043ehe.a_bsm2("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)j\u0440i\u043ehe.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray3, (int)(45140574 + 1679531118), (int)(-2132558317 + 1042874616))));
        h\u04bb\u0455hpa h\u04bb\u0455hpa2 = this.\u0458joa\u0445c;
        j\u0440i\u043ehe.a_bsm3("requireNonNull", requireNonNull(T ), (Object)h\u04bb\u0455hpa2);
        this.i\u0456\u0455sc\u0458\u0458 = ((\u0430c\u0440)((Object)callSite)).p\u0441\u0445(h\u04bb\u0455hpa2::axpacc).\u0455xi\u0440(true).\u0458c\u0456\u0440().getBooleanValue();
        this.se\u0435c = -1;
    }

    @\u0445\u0458\u0458h\u0445\u0430a
    public void h\u0458\u0456\u0441(\u043eo\u0435 \u043eo\u04352) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (true | false) {
        }
        if (j\u0440i\u043ehe.$_h1qyl2y11ngan17lff((long)j\u0440i\u043ehe.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)j\u0440i\u043ehe.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        if (0 != 0) {
        }
        if (this.\u0458joa\u0445c.axpacc() && this.i\u0456\u0455sc\u0458\u0458.axpacc() && \u043eo\u04352.\u0456\u0455\u0455xpa\u0455() == class_1268.field_5808 && this.se\u0435c != -1) {
            \u043eo\u04352.\u0435oo\u0458\u0445(j\u0440i\u043ehe.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().method_5438(this.se\u0435c));
        }
    }

    @\u0445\u0458\u0458h\u0445\u0430a
    public void \u043e\u0456xhhx(\u0430\u0456i\u043ephj \u0430\u0456i\u043ephj2) {
        boolean bl;
        block18: {
            block17: {
                bl = false;
                if (bl) {
                    __js_dispatch_state = 0;
                    if (bl) {
                        __js_dispatch_state = 0;
                    }
                }
                if (2 * 2 * 2 >= 0) {
                }
                if (j\u0440i\u043ehe.$_h1qyl2y21ngan17lfg((long)j\u0440i\u043ehe.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)j\u0440i\u043ehe.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
                    throw null;
                }
                if (0 != 0) {
                }
                if (j\u0440i\u043ehe.\u0430\u0445j\u0445s\u0456\u04bb.field_1761 == null) break block17;
                if (j\u0440i\u043ehe.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 != null) break block18;
            }
            return;
        }
        if (\u0430\u0456i\u043ephj2.p\u0440\u04bb() == i\u0456\u0445\u0430\u0441p.cc\u0441) {
            if (!j\u0440i\u043ehe.\u0430\u0445j\u0445s\u0456\u04bb.field_1761.method_2923() && this.\u04bbs\u0435\u0455hh\u04bb == null) {
                return;
            }
            if (this.\u0435ea.axpacc() && j\u0440i\u043ehe.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_6047().method_7909() instanceof class_1829) {
                return;
            }
            class_2338 class_23382 = this.\u04bbs\u0435\u0455hh\u04bb;
            if (class_23382 == null) {
                if (j\u0440i\u043ehe.\u0430\u0445j\u0445s\u0456\u04bb.field_1765.method_17783() != class_239.class_240.field_1332) {
                    return;
                }
                class_23382 = ((class_3965)j\u0440i\u043ehe.\u0430\u0445j\u0445s\u0456\u04bb.field_1765).method_17777();
            }
            this.\u0430\u0435jos\u0435\u04bb(class_23382, true);
            if (bl) {
                __js_dispatch_state = 0;
            }
        } else if (!j\u0440i\u043ehe.\u0430\u0445j\u0445s\u0456\u04bb.field_1761.method_2923() && this.\u04bbs\u0435\u0455hh\u04bb == null) {
            this.oca\u04bbax();
        }
    }

    public /* synthetic */ void i\u0440\u0458(class_2338 class_23382) {
        block8: {
            block7: {
                boolean bl = false;
                if (bl) {
                    __js_dispatch_state = 0;
                }
                if (true | false) {
                }
                if (j\u0440i\u043ehe.$_h1qyl2y31ngan17lfh((long)j\u0440i\u043ehe.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)j\u0440i\u043ehe.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
                    throw null;
                }
                if (0 != 0) {
                }
                if (!this.\u0440\u0435\u0455x\u0435xe() || j\u0440i\u043ehe.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 == null) break block7;
                if (j\u0440i\u043ehe.\u0430\u0445j\u0445s\u0456\u04bb.field_1687 != null) break block8;
            }
            return;
        }
        this.\u04bbs\u0435\u0455hh\u04bb = class_23382;
        this.\u0430\u0435jos\u0435\u04bb(class_23382, false);
    }

    public /* synthetic */ void \u043ec\u0456() {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if (true | false) {
        }
        if (j\u0440i\u043ehe.$_h1qyl2y41ngan17lfi((long)j\u0440i\u043ehe.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)j\u0440i\u043ehe.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        if (0 != 0) {
        }
        this.\u04bbs\u0435\u0455hh\u04bb = null;
        this.oca\u04bbax();
    }

    private /* synthetic */ void \u0430\u0435jos\u0435\u04bb(class_2338 class_23382, boolean bl) {
        boolean bl2 = false;
        if (bl2) {
            __js_dispatch_state = 0;
        }
        if (2 * 2 * 2 >= 0) {
        }
        if (j\u0440i\u043ehe.$_h1qyl2y51ngan17lfj((long)j\u0440i\u043ehe.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)j\u0440i\u043ehe.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        if (0 != 0) {
        }
        if (bl && this.\u0435ea.axpacc() && j\u0440i\u043ehe.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_6047().method_7909() instanceof class_1829) {
            return;
        }
        int n = this.\u0430epxx(class_23382);
        if (n != -1 && n != j\u0440i\u043ehe.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7545) {
            if (this.se\u0435c == -1) {
                this.se\u0435c = j\u0440i\u043ehe.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7545;
            }
            j\u0440i\u043ehe.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7545 = n;
        }
    }

    private /* synthetic */ void oca\u04bbax() {
        block9: {
            block8: {
                boolean bl = false;
                if (bl) {
                    __js_dispatch_state = 0;
                }
                if ((3 * 3 + 3) % 2 == 0) {
                }
                if (j\u0440i\u043ehe.$_h1qyl2y61ngan17lfk((long)j\u0440i\u043ehe.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)j\u0440i\u043ehe.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
                    throw null;
                }
                if (0 != 0) {
                }
                if (this.se\u0435c == -1) break block8;
                if (j\u0440i\u043ehe.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 != null) break block9;
            }
            return;
        }
        if (this.\u0458joa\u0445c.axpacc()) {
            j\u0440i\u043ehe.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().field_7545 = this.se\u0435c;
        }
        this.se\u0435c = -1;
    }

    @Override
    public /* synthetic */ void onDisable() {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
        }
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (j\u0440i\u043ehe.$_h1qyl2y71ngan17lfl((long)j\u0440i\u043ehe.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)j\u0440i\u043ehe.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        if (0 != 0) {
        }
        this.\u04bbs\u0435\u0455hh\u04bb = null;
        this.oca\u04bbax();
    }

    private /* synthetic */ int \u0430epxx(class_2338 class_23382) {
        boolean bl = false;
        if (bl) {
            __js_dispatch_state = 0;
            if (bl) {
                __js_dispatch_state = 0;
            }
        }
        if (2 * 2 * 2 >= 0) {
        }
        if (j\u0440i\u043ehe.$_h1qyl2y81ngan17lfm((long)j\u0440i\u043ehe.a_bsm0("nanoTime", nanoTime()) == Long.MIN_VALUE ? 0 : ((long)j\u0440i\u043ehe.a_bsm0("nanoTime", nanoTime()) < Long.MIN_VALUE ? -1 : 1)) == 0) {
            throw null;
        }
        if (0 != 0) {
        }
        class_2680 class_26802 = j\u0440i\u043ehe.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.method_8320(class_23382);
        class_2248 class_22482 = class_26802.method_26204();
        int n = -1;
        float f = 1.0f;
        for (int i = 0; i < -1361726660 + 1361726669; ++i) {
            CallSite callSite;
            class_1799 class_17992 = j\u0440i\u043ehe.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_31548().method_5438(i);
            if (class_17992.method_7960() || class_26802.method_26215()) continue;
            if (j\u0440i\u043ehe.a_bsm4("s\u0441\u043e", s\u0441\u043e(net.minecraft.class_1799 ), (class_1799)class_17992) != false) {
                if (!bl) continue;
                __js_dispatch_state = 0;
                continue;
            }
            if (class_17992.method_7909() instanceof class_1829 && !(class_22482 instanceof class_2560)) continue;
            float f2 = class_17992.method_7909().method_58404(class_17992, class_26802);
            if (j\u0440i\u043ehe.$_hxy41zc1ngan17lfn(f2 == 1.0f ? 0 : (f2 > 1.0f ? 1 : -1)) > 0 && !(class_22482 instanceof class_2431) && !(class_22482 instanceof class_2449) && (callSite = j\u0440i\u043ehe.a_bsm5("method_8225", method_8225(net.minecraft.class_1887 net.minecraft.class_1799 ), (class_1887)class_1893.field_9131, (class_1799)class_17992)) > 0) {
                f2 += (float)(callSite * callSite + true);
            }
            if (j\u0440i\u043ehe.$_hxy41zd1ngan17lfo(f2 == f ? 0 : (f2 > f ? 1 : -1)) <= 0) continue;
            n = i;
            f = f2;
        }
        return n;
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

