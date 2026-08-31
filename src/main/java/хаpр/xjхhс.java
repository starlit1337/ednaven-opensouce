/*
 * Decompiled with CFR 0.152.
 */
package \u0445\u0430p\u0440;

import c\u0445is.ex\u0441s\u04bbp\u0435;
import c\u0445is.\u0430\u0456i\u043ephj;
import ie\u0441\u0430ej.\u0441\u0455\u0440\u0435;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_1297;
import net.minecraft.class_1299;
import net.minecraft.class_1309;
import net.minecraft.class_1477;
import net.minecraft.class_1538;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_238;
import net.minecraft.class_2388;
import net.minecraft.class_2394;
import net.minecraft.class_2398;
import net.minecraft.class_243;
import net.minecraft.class_3414;
import net.minecraft.class_3417;
import net.minecraft.class_3419;
import o\u0455sio\u0440.\u0445\u0458\u0458h\u0445\u0430a;
import spso.\u0430c\u0440;
import spso.\u0441a\u0458p;
import \u0435xp.h\u04bb\u0455hpa;
import \u0435xp.\u043ea\u0441\u0430p;
import \u0441j\u0455\u0440.j\u0456h;
import \u0445eo.c\u0455pi;
import \u0445eo.\u0456p\u0430\u043e\u0458\u043e;
import \u0445eo.\u0458i\u0456x;
import \u0455ch.h\u0441exj;

@\u0456p\u0430\u043e\u0458\u043e(sp\u0456p\u0445\u0435="KillEffect", a\u0456j\u0430\u0455\u04bb="Displays a custom effect when you kill someone", s\u0455cj=\u0458i\u0456x.RENDER)
public class xj\u0445h\u0441
extends c\u0455pi {
    private final /* synthetic */ \u043ea\u0441\u0430p a\u0441a;
    private final /* synthetic */ h\u04bb\u0455hpa o\u0435sax\u0435;
    private final /* synthetic */ h\u04bb\u0455hpa o\u0458\u0435s;
    private final /* synthetic */ h\u04bb\u0455hpa \u0430\u0440x;
    private final /* synthetic */ h\u04bb\u0455hpa \u0435\u043ec\u0435;
    private final /* synthetic */ h\u04bb\u0455hpa paje\u0458\u0430;
    private /* synthetic */ class_1309 scoe\u0430\u0430h;
    public final /* synthetic */ List<j\u0456h> ap\u0445o\u0440o;
    private /* synthetic */ double \u0455\u0435\u0440h;
    private /* synthetic */ long \u0455ce;
    private final /* synthetic */ h\u0441exj i\u0435px\u0430\u0445;

    public xj\u0445h\u0441() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        byte[] byArray = new byte[-1552028462 + 1552028472];
        byArray[0] = -2086282593 + 2086282589;
        byArray[1] = -1788430627 + 1788430638;
        byArray[2] = -92019011 + 92019137;
        byArray[3] = -613154420 + 613154511;
        byArray[4] = -492553534 + 492553565;
        byArray[5] = -660533900 + 660534000;
        byArray[-553313133 + 553313139] = -1564394769 + 1564394775;
        byArray[-1870293585 + 1870293592] = 2;
        byArray[-680969957 + 680969965] = -1406607550 + 1406607454;
        byArray[-1070175357 + 1070175366] = -396988553 + 396988610;
        this.a\u0441a = ((\u0430c\u0440)((Object)xj\u0445h\u0441.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)xj\u0445h\u0441.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(-355280124 + 599274374), (int)(25817924 + 318316863)))))).s\u0458\u0458a(1000.0f).\u043ecxi\u0455(50.0f).a\u0455\u0445\u0435c(3000.0f).x\u0455heah\u0445(50.0f).\u0458c\u0456\u0440().getFloatValue();
        byte[] byArray2 = new byte[-343099727 + 343099736];
        byArray2[0] = -1386047183 + 1386047056;
        byArray2[1] = -2076612069 + 2076612048;
        byArray2[2] = -895122230 + 895122170;
        byArray2[3] = -1445368363 + 1445368236;
        byArray2[4] = -1262794959 + 1262794866;
        byArray2[5] = -1140154200 + 1140154241;
        byArray2[-1696176806 + 1696176812] = -335606188 + 335606220;
        byArray2[-1264128105 + 1264128112] = -1513843328 + 1513843203;
        byArray2[-2104381508 + 2104381516] = -1740540451 + 1740540554;
        this.o\u0435sax\u0435 = ((\u0430c\u0440)((Object)xj\u0445h\u0441.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)xj\u0445h\u0441.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray2, (int)(501825694 + 1507211040), (int)(-716363608 + 2080843947)))))).\u0455xi\u0440(false).\u0458c\u0456\u0440().getBooleanValue();
        byte[] byArray3 = new byte[-1653873139 + 1653873148];
        byArray3[0] = -2019074926 + 2019075013;
        byArray3[1] = -885258853 + 885258818;
        byArray3[2] = -1668189079 + 1668189187;
        byArray3[3] = -553753091 + 553753074;
        byArray3[4] = -944446790 + 944446731;
        byArray3[5] = -156282237 + 156282232;
        byArray3[-751863869 + 751863875] = -521224557 + 521224445;
        byArray3[-1993672274 + 1993672281] = -1684570251 + 1684570341;
        byArray3[-554389719 + 554389727] = -1983240091 + 1983240119;
        this.o\u0458\u0435s = ((\u0430c\u0440)((Object)xj\u0445h\u0441.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)xj\u0445h\u0441.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray3, (int)(-1591522448 + 1833616125), (int)(-944132426 + 1314744160)))))).\u0455xi\u0440(false).\u0458c\u0456\u0440().getBooleanValue();
        this.\u0430\u0440x = ((\u0430c\u0440)((Object)xj\u0445h\u0441.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)xj\u0445h\u0441.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1581873874 + 1581873978, -2006331465 + 2006331462, -693385394 + 693385372, -2004149869 + 2004149845, -1645828766 + 1645828728}, (int)(1855830501 + 907406030), (int)(-1442697591 + 819440720)))))).\u0455xi\u0440(false).\u0458c\u0456\u0440().getBooleanValue();
        this.\u0435\u043ec\u0435 = ((\u0430c\u0440)((Object)xj\u0445h\u0441.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)xj\u0445h\u0441.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1559021761 + 1559021880, -1176831712 + 1176831601, -2047203030 + 2047202935, -1551503253 + 1551503337, 3}, (int)(-430006380 + 199053991), (int)(-720144408 + 1117167553)))))).\u0455xi\u0440(false).\u0458c\u0456\u0440().getBooleanValue();
        this.paje\u0458\u0430 = ((\u0430c\u0440)((Object)xj\u0445h\u0441.a_bsm1("\u04bboo\u04bb", \u04bboo\u04bb(spso.\u0441a\u0458p java.lang.String ), (\u0441a\u0458p)this, (String)((Object)xj\u0445h\u0441.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-932518218 + 932518166, -1814536460 + 1814536533, -149890405 + 149890332, -488342389 + 488342268, -1095034660 + 1095034746}, (int)(1455588044 + 170122778), (int)(-1314382047 + 717536587)))))).\u0455xi\u0440(false).\u0458c\u0456\u0440().getBooleanValue();
        this.ap\u0445o\u0440o = new ArrayList<j\u0456h>();
        this.\u0455\u0435\u0440h = 0.0;
        this.i\u0435px\u0430\u0445 = new h\u0441exj();
    }

    @\u0445\u0458\u0458h\u0445\u0430a
    public void \u043e\u0456xhhx(\u0430\u0456i\u043ephj \u0430\u0456i\u043ephj2) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (xj\u0445h\u0441.\u0430\u0445j\u0445s\u0456\u04bb.field_1724 == null || xj\u0445h\u0441.\u0430\u0445j\u0445s\u0456\u04bb.field_1687 == null) {
            return;
        }
        if (this.\u0455ce != 0L && (float)(xj\u0445h\u0441.a_bsm2("currentTimeMillis", currentTimeMillis()) - this.\u0455ce) > this.a\u0441a.axpacc()) {
            this.scoe\u0430\u0430h = null;
        }
        if (this.\u0435\u043ec\u0435.axpacc()) {
            if (this.ap\u0445o\u0440o != null) {
                for (j\u0456h j\u0456h2 : this.ap\u0445o\u0440o) {
                    if (!j\u0456h2.method_31481() || j\u0456h2.method_5805()) {
                        if (this.\u0455\u0435\u0440h < 1.0) {
                            this.\u0455\u0435\u0440h += xj\u0445h\u0441.a_bsm3("random", random()) * 0.048;
                        }
                        if (!(this.\u0455\u0435\u0440h >= 1.0)) continue;
                        this.\u0455\u0435\u0440h = 0.0;
                        for (int i = 0; i <= -1675440866 + 1675440874; ++i) {
                            xj\u0445h\u0441.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.method_8406((class_2394)class_2398.field_11240, j\u0456h2.method_23317(), j\u0456h2.method_23318() + (double)j\u0456h2.method_17682() * 0.5, j\u0456h2.method_23321(), 0.0, 0.0, 0.0);
                        }
                        j\u0456h2.method_31472();
                        this.ap\u0445o\u0440o.remove((Object)j\u0456h2);
                        return;
                    }
                    this.\u0455\u0435\u0440h = 0.0;
                }
                double d = this.a\u043eop\u04bbc\u0456(1.0 - this.\u0455\u0435\u0440h);
                this.i\u0435px\u0430\u0445.jjica\u0440((float)d, -962120871 + 962121321);
                for (j\u0456h j\u0456h3 : this.ap\u0445o\u0440o) {
                    j\u0456h3.method_24203(j\u0456h3.method_23317(), j\u0456h3.method_23318() + (double)this.i\u0435px\u0430\u0445.\u0455ap\u0435p() * 0.2, j\u0456h3.method_23321());
                }
            }
            if (this.ap\u0445o\u0440o != null) {
                for (j\u0456h j\u0456h2 : this.ap\u0445o\u0440o) {
                    j\u0456h2.field_6907 = 0.0f;
                    j\u0456h2.field_6905 = 0.0f;
                    j\u0456h2.field_6903 = 0.0f;
                    j\u0456h2.field_6908 = 90.0f;
                    j\u0456h2.field_5960 = true;
                    j\u0456h2.method_5875(true);
                    j\u0456h2.method_5857((class_238)xj\u0445h\u0441.a_bsm4("method_30048", method_30048(net.minecraft.class_243 double double double ), (class_243)j\u0456h2.method_19538(), (double)0.0, (double)0.0, (double)0.0));
                    j\u0456h2.method_5684(true);
                }
            }
        }
        if (this.scoe\u0430\u0430h != null && (!this.scoe\u0430\u0430h.method_5805() || this.scoe\u0430\u0430h.method_31481())) {
            class_1538 class_15382;
            if (this.paje\u0458\u0430.axpacc()) {
                xj\u0445h\u0441.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.method_8486(this.scoe\u0430\u0430h.method_23317(), this.scoe\u0430\u0430h.method_23318(), this.scoe\u0430\u0430h.method_23321(), \u0441\u0455\u0440\u0435.\u0456\u0455\u0455epeh, class_3419.field_15245, 40.0f, 0.8f + xj\u0445h\u0441.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.field_9229.method_43057() * 0.2f, false);
            }
            if (this.\u0435\u043ec\u0435.axpacc()) {
                for (int i = 0; i <= -205111245 + 205111253; ++i) {
                    xj\u0445h\u0441.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.method_8406((class_2394)class_2398.field_11240, this.scoe\u0430\u0430h.method_23317(), this.scoe\u0430\u0430h.method_23318(), this.scoe\u0430\u0430h.method_23321(), 0.0, 0.0, 0.0);
                }
                xj\u0445h\u0441.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.method_8486(this.scoe\u0430\u0430h.method_23317(), this.scoe\u0430\u0430h.method_23318(), this.scoe\u0430\u0430h.method_23321(), class_3417.field_15013, class_3419.field_15248, 40.0f, 0.8f + xj\u0445h\u0441.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.field_9229.method_43057() * 0.2f, false);
                j\u0456h j\u0456h4 = new j\u0456h((class_1299<? extends class_1477>)class_1299.field_6114, (class_1937)xj\u0445h\u0441.\u0430\u0445j\u0445s\u0456\u04bb.field_1687);
                if (j\u0456h4 != null) {
                    j\u0456h4.method_24203(this.scoe\u0430\u0430h.method_23317(), this.scoe\u0430\u0430h.method_23318(), this.scoe\u0430\u0430h.method_23321());
                    xj\u0445h\u0441.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.method_53875((class_1297)j\u0456h4);
                    if (this.ap\u0445o\u0440o != null) {
                        this.ap\u0445o\u0440o.add(j\u0456h4);
                    }
                }
            }
            if (this.o\u0435sax\u0435.axpacc() && (class_15382 = (class_1538)class_1299.field_6112.method_5883((class_1937)xj\u0445h\u0441.\u0430\u0445j\u0445s\u0456\u04bb.field_1687)) != null) {
                class_15382.method_24203(this.scoe\u0430\u0430h.method_23317(), this.scoe\u0430\u0430h.method_23318(), this.scoe\u0430\u0430h.method_23321());
                xj\u0445h\u0441.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.method_53875((class_1297)class_15382);
                xj\u0445h\u0441.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.method_8486(this.scoe\u0430\u0430h.method_23317(), this.scoe\u0430\u0430h.method_23318(), this.scoe\u0430\u0430h.method_23321(), class_3417.field_14865, class_3419.field_15252, 40.0f, 0.8f + xj\u0445h\u0441.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.field_9229.method_43057() * 0.2f, false);
            }
            if (this.o\u0458\u0435s.axpacc()) {
                for (int i = 0; i < 5; ++i) {
                    xj\u0445h\u0441.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.method_8406((class_2394)class_2398.field_11221, this.scoe\u0430\u0430h.method_23317(), this.scoe\u0430\u0430h.method_23318() + (double)(this.scoe\u0430\u0430h.method_17682() / 2.0f), this.scoe\u0430\u0430h.method_23321(), 0.0, 0.0, 0.0);
                }
                xj\u0445h\u0441.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.method_8486(this.scoe\u0430\u0430h.method_23317(), this.scoe\u0430\u0430h.method_23318(), this.scoe\u0430\u0430h.method_23321(), (class_3414)class_3417.field_15152.comp_349(), class_3419.field_15245, 4.0f, 1.0f, false);
            }
            if (this.\u0430\u0440x.axpacc()) {
                for (int i = 0; i < -452218848 + 452218968; ++i) {
                    xj\u0445h\u0441.\u0430\u0445j\u0445s\u0456\u04bb.field_1687.method_8406((class_2394)new class_2388(class_2398.field_11217, class_2246.field_10002.method_9564()), this.scoe\u0430\u0430h.method_23317(), this.scoe\u0430\u0430h.method_23318() + (double)this.scoe\u0430\u0430h.method_17682() - 0.75, this.scoe\u0430\u0430h.method_23321(), (double)((xj\u0445h\u0441.a_bsm3("random", random()) - 0.5) * 0.5), (double)(xj\u0445h\u0441.a_bsm3("random", random()) * 0.5), (double)((xj\u0445h\u0441.a_bsm3("random", random()) - 0.5) * 0.5));
                }
            }
            this.scoe\u0430\u0430h = null;
        }
    }

    public /* synthetic */ double a\u043eop\u04bbc\u0456(double d) {
        Object object;
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if (d < 0.5) {
            object = (1.0 - xj\u0445h\u0441.a_bsm6("sqrt", sqrt(double ), (double)(1.0 - xj\u0445h\u0441.a_bsm5("pow", pow(double double ), (double)(2.0 * d), (double)2.0)))) / 2.0;
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
            object = (xj\u0445h\u0441.a_bsm6("sqrt", sqrt(double ), (double)(1.0 - xj\u0445h\u0441.a_bsm5("pow", pow(double double ), (double)(-2.0 * d + 2.0), (double)2.0))) + 1.0) / 2.0;
        }
        return object;
    }

    @\u0445\u0458\u0458h\u0445\u0430a
    public void \u0440xsx(ex\u0441s\u04bbp\u0435 ex\u0441s\u04bbp\u04352) {
        class_1297 class_12972;
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if ((class_12972 = ex\u0441s\u04bbp\u04352.\u0458s\u0430()) instanceof class_1309) {
            class_1309 class_13092 = (class_1309)class_12972;
            if (xj\u0445h\u0441.a_bsm7("h\u0441h", h\u0441h(net.minecraft.class_1297 ), (class_1297)class_12972) != false) {
                this.scoe\u0430\u0430h = class_13092;
                this.\u0455ce = (long)xj\u0445h\u0441.a_bsm2("currentTimeMillis", currentTimeMillis());
            }
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
}

