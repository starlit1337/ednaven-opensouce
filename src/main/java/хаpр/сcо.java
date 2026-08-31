/*
 * Decompiled with CFR 0.152.
 */
package \u0445\u0430p\u0440;

import c\u0445is.h\u0430p\u043ee\u0440;
import c\u0445is.i\u0456o\u0430\u0435o;
import c\u0445is.\u0430\u0456i\u043ephj;
import c\u0445is.\u04bbj\u0441x\u0440;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import net.minecraft.class_2246;
import net.minecraft.class_2281;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_2382;
import net.minecraft.class_2561;
import net.minecraft.class_2586;
import net.minecraft.class_2595;
import net.minecraft.class_2596;
import net.minecraft.class_2623;
import net.minecraft.class_2680;
import net.minecraft.class_2745;
import net.minecraft.class_2769;
import net.minecraft.class_287;
import net.minecraft.class_4587;
import net.minecraft.class_5904;
import net.minecraft.class_757;
import org.joml.Matrix4f;
import o\u0455sio\u0440.\u0445\u0458\u0458h\u0445\u0430a;
import spso.\u0430c\u0440;
import spso.\u0441a\u0458p;
import \u0435xp.h\u04bb\u0455hpa;
import \u0435xp.\u043ea\u0441\u0430p;
import \u043e\u0445\u0440\u0430ose.i\u0456\u0445\u0430\u0441p;
import \u0440o\u0456\u0445o.\u0445\u0440\u0430\u0435\u0445\u043e;
import \u0440\u0440e.\u043eo\u043ea\u0456\u0441;
import \u0445eo.c\u0455pi;
import \u0445eo.\u0456p\u0430\u043e\u0458\u043e;
import \u0445eo.\u0458i\u0456x;
import \u0445\u0430p\u0440.x\u0455\u0455\u0458;

@\u0456p\u0430\u043e\u0458\u043e(sp\u0456p\u0445\u0435="ChestESP", a\u0456j\u0430\u0455\u04bb="Highlights chests with performance optimizations", s\u0455cj=\u0458i\u0456x.RENDER)
public class \u0441c\u043e
extends c\u0455pi {
    private final /* synthetic */ h\u04bb\u0455hpa oh\u0458a;
    public /* synthetic */ \u043ea\u0441\u0430p \u0458\u0440xa;
    private final /* synthetic */ Set<class_2338> e\u0458\u043e\u0441\u0456;
    private final /* synthetic */ List<x\u0455\u0455\u0458> so\u0445\u0455p\u043ep;
    private /* synthetic */ int ih\u0458c\u0435;

    public \u0441c\u043e() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        byte[] byArray = new byte[-1390600224 + 1390600240];
        byArray[0] = -1140630014 + 1140629996;
        byArray[1] = -1451087047 + 1451087069;
        byArray[2] = -589739342 + 589739373;
        byArray[3] = -263778136 + 263778102;
        byArray[4] = -1027303010 + 1027302887;
        byArray[5] = -2102743658 + 2102743580;
        byArray[-1514054564 + 1514054570] = -975703026 + 975703067;
        byArray[-1873465196 + 1873465203] = -544949291 + 544949315;
        byArray[-1246249981 + 1246249989] = -278405434 + 278405538;
        byArray[-122351456 + 122351465] = -1056922206 + 1056922085;
        byArray[-1824042701 + 1824042711] = -1207711628 + 1207711721;
        byArray[-1051853274 + 1051853285] = -1571929150 + 1571929080;
        byArray[-1122595901 + 1122595913] = -1986887149 + 1986887107;
        byArray[-802519289 + 802519302] = -1003993782 + 1003993866;
        byArray[-549013133 + 549013147] = -1523205809 + 1523205701;
        byArray[-441891123 + 441891138] = -1644748278 + 1644748177;
        this.oh\u0458a = ((\u0430c\u0440)((Object)\u0441c\u043e.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)\u0441c\u043e.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-759333173 + 1797308178), (int)(1963423577 + 514858077)))))).\u0455xi\u0440(true).\u0458c\u0456\u0440().getBooleanValue();
        byte[] byArray2 = new byte[-1039728983 + 1039728995];
        byArray2[0] = -994394348 + 994394463;
        byArray2[1] = -324945725 + 324945788;
        byArray2[2] = -859319846 + 859319963;
        byArray2[3] = -847484971 + 847484962;
        byArray2[4] = -1261658664 + 1261658676;
        byArray2[5] = -1514328556 + 1514328673;
        byArray2[-416249101 + 416249107] = -422246777 + 422246750;
        byArray2[-872576871 + 872576878] = -1842981848 + 1842981832;
        byArray2[-1803031379 + 1803031387] = -676158725 + 676158713;
        byArray2[-1942993618 + 1942993627] = -1891650752 + 1891650723;
        byArray2[-1020762278 + 1020762288] = -1819971832 + 1819971920;
        byArray2[-1472203428 + 1472203439] = -715635426 + 715635416;
        this.\u0458\u0440xa = ((\u0430c\u0440)((Object)\u0441c\u043e.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)\u0441c\u043e.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray2, (int)(1802156034 + 751689781), (int)(292918564 + 1191494485)))))).\u043ecxi\u0455(8.0f).a\u0455\u0445\u0435c(256.0f).s\u0458\u0458a(64.0f).x\u0455heah\u0445(8.0f).\u0458c\u0456\u0440().getFloatValue();
        this.e\u0458\u043e\u0441\u0456 = \u0441c\u043e.a_bsm2("newKeySet", newKeySet());
        this.so\u0445\u0455p\u043ep = new ArrayList<x\u0455\u0455\u0458>();
        this.ih\u0458c\u0435 = 0;
    }

    @\u0445\u0458\u0458h\u0445\u0430a
    public void \u0458\u0435p\u043e\u0435aa(h\u0430p\u043ee\u0440 h\u0430p\u043ee\u04402) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        this.e\u0458\u043e\u0441\u0456.clear();
        this.so\u0445\u0455p\u043ep.clear();
    }

    @\u0445\u0458\u0458h\u0445\u0430a
    public void o\u043eec\u04bb\u0445h(\u04bbj\u0441x\u0440 \u04bbj\u0441x\u04402) {
        class_2596<?> class_25962;
        class_2623 class_26232;
        class_2561 class_25612;
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        if (\u0441c\u043e.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 == null || this.oh\u0458a.axpacc() && !((\u0445\u0440\u0430\u0435\u0445\u043e)((Object)\u0441c\u043e.a_bsm3("jaa\u0435\u0445c", jaa\u0435\u0445c()))).\u0430o\u0441\u0456p\u0455().\u0441c\u0458\u043e\u0430(\u043eo\u043ea\u0456\u0441.class).\u0440\u0435\u0455x\u0435xe()) {
            return;
        }
        if (\u04bbj\u0441x\u04402.p\u0440\u04bb() == i\u0456\u0445\u0430\u0441p.h\u0430\u043e && (class_25612 = \u04bbj\u0441x\u04402.ciao\u0455\u0455()) instanceof class_2623 && ((class_26232 = (class_2623)class_25612).method_11295() == class_2246.field_10034 || class_26232.method_11295() == class_2246.field_10380) && class_26232.method_11294() == 1 && class_26232.method_11296() == 1) {
            this.e\u0458\u043e\u0441\u0456.add(class_26232.method_11298().method_10062());
        }
        if ((class_25962 = \u04bbj\u0441x\u04402.ciao\u0455\u0455()) instanceof class_5904) {
            class_26232 = (class_5904)class_25962;
            try {
                class_2561 class_25613;
                class_25612 = class_25613 = class_26232.comp_2281();
            }
            catch (Throwable throwable) {
                throw new MatchException(throwable.toString(), throwable);
            }
            byte[] byArray = new byte[-1248512166 + 1248512178];
            byArray[0] = -2041339785 + 2041339864;
            byArray[1] = -1350757436 + 1350757396;
            byArray[2] = -1359078243 + 1359078299;
            byArray[3] = -1607922214 + 1607922194;
            byArray[4] = -986793149 + 986793108;
            byArray[5] = -1294520427 + 1294520541;
            byArray[-529524658 + 529524664] = -1503451517 + 1503451447;
            byArray[-1743841270 + 1743841277] = -1406731003 + 1406730974;
            byArray[-1560591604 + 1560591612] = -1470449280 + 1470449364;
            byArray[-1835865823 + 1835865832] = -2058721526 + 2058721637;
            byArray[-266305278 + 266305288] = -2129894257 + 2129894358;
            byArray[-638855072 + 638855083] = -1845977221 + 1845977304;
            if (class_25612.getString().contains((CharSequence)((Object)\u0441c\u043e.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(520193740 + 316582675), (int)(-978938009 + 950691561))))) {
                this.e\u0458\u043e\u0441\u0456.clear();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @\u0445\u0458\u0458h\u0445\u0430a
    public void xps(\u0430\u0456i\u043ephj \u0430\u0456i\u043ephj2) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (\u0430\u0456i\u043ephj2.p\u0440\u04bb() != i\u0456\u0445\u0430\u0441p.cc\u0441 || \u0441c\u043e.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 == null) {
            return;
        }
        if (this.oh\u0458a.axpacc() && !((\u0445\u0440\u0430\u0435\u0445\u043e)((Object)\u0441c\u043e.a_bsm3("jaa\u0435\u0445c", jaa\u0435\u0445c()))).\u0430o\u0441\u0456p\u0455().\u0441c\u0458\u043e\u0430(\u043eo\u043ea\u0456\u0441.class).\u0440\u0435\u0455x\u0435xe()) {
            return;
        }
        if (this.ih\u0458c\u0435++ % 5 != 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        CallSite callSite = \u0441c\u043e.a_bsm4("pow", pow(double double ), (double)this.\u0458\u0440xa.axpacc(), (double)2.0);
        class_2338 class_23382 = \u0441c\u043e.\u0430\u0445j\u0445s\u0456\u04bb.field_1724.method_24515();
        \u0441c\u043e.a_bsm5("\u0456is", \u0456is()).forEach(arg_0 -> this.ihjs\u0441i(class_23382, (double)callSite, arrayList, arg_0));
        List<x\u0455\u0455\u0458> list = this.so\u0445\u0455p\u043ep;
        synchronized (list) {
            this.so\u0445\u0455p\u043ep.clear();
            this.so\u0445\u0455p\u043ep.addAll(arrayList);
        }
    }

    private /* synthetic */ class_238 pc\u0458aic\u043e(class_2595 class_25952) {
        class_2680 class_26802;
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if (!(class_26802 = class_25952.method_11010()).method_28498((class_2769)class_2281.field_10770)) {
            return null;
        }
        class_2745 class_27452 = (class_2745)class_26802.method_11654((class_2769)class_2281.field_10770);
        if (class_27452 == class_2745.field_12574) {
            return null;
        }
        class_2338 class_23382 = class_25952.method_11016();
        CallSite callSite = \u0441c\u043e.a_bsm6("\u0435hj", \u0435hj(net.minecraft.class_2338 ), (class_2338)class_23382);
        if (callSite == null) {
            return null;
        }
        if (class_27452 != class_2745.field_12569) {
            class_2338 class_23383 = class_23382.method_10093((class_2350)\u0441c\u043e.a_bsm7("method_9758", method_9758(net.minecraft.class_2680 ), (class_2680)class_26802));
            CallSite callSite2 = \u0441c\u043e.a_bsm6("\u0435hj", \u0435hj(net.minecraft.class_2338 ), (class_2338)class_23383);
            if (callSite2 == null) {
                return callSite;
            }
            callSite = callSite.method_991((class_238)callSite2);
        }
        return callSite;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @\u0445\u0458\u0458h\u0445\u0430a
    public void o\u04bbjp(i\u0456o\u0430\u0435o i\u0456o\u0430\u0435o2) {
        if (this.so\u0445\u0455p\u043ep.isEmpty() || this.oh\u0458a.axpacc() && !((\u0445\u0440\u0430\u0435\u0445\u043e)((Object)\u0441c\u043e.a_bsm3("jaa\u0435\u0445c", jaa\u0435\u0445c()))).\u0430o\u0441\u0456p\u0455().\u0441c\u0458\u043e\u0430(\u043eo\u043ea\u0456\u0441.class).\u0440\u0435\u0455x\u0435xe()) {
            return;
        }
        class_4587 class_45872 = i\u0456o\u0430\u0435o2.\u0445\u0455i\u0430pi();
        class_45872.method_22903();
        \u0441c\u043e.a_bsm8("disableDepthTest", disableDepthTest());
        \u0441c\u043e.a_bsm9("enableBlend", enableBlend());
        \u0441c\u043e.a_bsm10("defaultBlendFunc", defaultBlendFunc());
        \u0441c\u043e.a_bsm11("setShader", setShader(java.util.function.Supplier ), class_757::method_34539);
        class_287 class_2872 = \u0441c\u043e.a_bsm12("method_1348", method_1348()).method_1349();
        List<x\u0455\u0455\u0458> list = this.so\u0445\u0455p\u043ep;
        synchronized (list) {
            for (x\u0455\u0455\u0458 x\u0455\u0455\u04582 : this.so\u0445\u0455p\u043ep) {
                if (x\u0455\u0455\u04582.a\u043e\u0445\u0445s\u0455) {
                    \u0441c\u043e.a_bsm13("setShaderColor", setShaderColor(float float float float ), (float)1.0f, (float)0.0f, (float)0.0f, (float)0.25f);
                } else {
                    \u0441c\u043e.a_bsm13("setShaderColor", setShaderColor(float float float float ), (float)0.0f, (float)1.0f, (float)0.0f, (float)0.25f);
                }
                \u0441c\u043e.a_bsm14("p\u0430j\u0430\u043ec", p\u0430j\u0430\u043ec(net.minecraft.class_287 org.joml.Matrix4f net.minecraft.class_238 ), (class_287)class_2872, (Matrix4f)class_45872.method_23760().method_23761(), (class_238)x\u0455\u0455\u04582.e\u0458\u0441);
            }
        }
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
        \u0441c\u043e.a_bsm15("disableBlend", disableBlend());
        \u0441c\u043e.a_bsm16("enableDepthTest", enableDepthTest());
        \u0441c\u043e.a_bsm13("setShaderColor", setShaderColor(float float float float ), (float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        class_45872.method_22909();
    }

    private /* synthetic */ void ihjs\u0441i(class_2338 class_23382, double d, List list, class_2586 class_25862) {
        class_238 class_2383;
        class_2595 class_25952;
        class_2338 class_23383;
        if (2 * 2 * 2 >= 0) {
        }
        if (class_25862 instanceof class_2595 && (class_23383 = (class_25952 = (class_2595)class_25862).method_11016()).method_10262((class_2382)class_23382) <= d && (class_2383 = this.pc\u0458aic\u043e(class_25952)) != null) {
            boolean bl = this.e\u0458\u043e\u0441\u0456.contains(class_23383);
            list.add(new x\u0455\u0455\u0458(class_2383, bl));
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

