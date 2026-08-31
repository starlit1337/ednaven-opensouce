/*
 * Decompiled with CFR 0.152.
 */
package \u0445eo;

import c\u0445is.\u0441\u0430ahccx;
import c\u0445is.\u0455\u0456\u0440;
import h\u0441\u043e\u04bb\u0441\u0458\u0445.aih\u0441s;
import h\u0441\u043e\u04bb\u0441\u0458\u0445.c\u0455i\u0430\u0440\u0445;
import h\u0441\u043e\u04bb\u0441\u0458\u0445.o\u0430\u0456\u0440ah;
import h\u0441\u043e\u04bb\u0441\u0458\u0445.x\u0458\u043e\u0435jo;
import h\u0441\u043e\u04bb\u0441\u0458\u0445.\u0430\u0435\u04bbj;
import h\u0441\u043e\u04bb\u0441\u0458\u0445.\u0441px;
import h\u0441\u043e\u04bb\u0441\u0458\u0445.\u0441\u0458\u0435xpp;
import h\u0441\u043e\u04bb\u0441\u0458\u0445.\u0455\u0458\u0456;
import h\u0441\u043e\u04bb\u0441\u0458\u0445.\u0456\u0456o;
import h\u0441\u043e\u04bb\u0441\u0458\u0445.\u04bbos\u0445;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.class_310;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import o\u0455sio\u0440.\u0445\u0458\u0458h\u0445\u0430a;
import \u0430\u0456j\u0435x.xi\u0440o\u0440jj;
import \u0440expho.a\u0430\u0455se;
import \u0440expho.hc\u0445o;
import \u0440expho.h\u0455\u0445a\u0456s;
import \u0440expho.p\u043eo;
import \u0440expho.\u0430\u0435p\u0455;
import \u0440expho.\u0435oi\u043e;
import \u0440expho.\u0440coa\u0440c;
import \u0440expho.\u0441\u043e\u0456;
import \u0440expho.\u0445x\u04bbj\u043e;
import \u0440expho.\u0458c\u0430s;
import \u0440expho.\u0458hjss;
import \u0440o\u0456\u0445o.\u0445\u0440\u0430\u0435\u0445\u043e;
import \u0440\u0440e.a\u04bb\u0455\u0455p;
import \u0440\u0440e.ca\u0458s\u0440;
import \u0440\u0440e.h\u0440\u0456hs\u0455\u0445;
import \u0440\u0440e.i\u0430c;
import \u0440\u0440e.i\u0435\u0445\u0456sh;
import \u0440\u0440e.j\u0440i\u043ehe;
import \u0440\u0440e.j\u04bbe\u0430\u0445\u0458\u0458;
import \u0440\u0440e.oaei\u0441;
import \u0440\u0440e.po\u0440j;
import \u0440\u0440e.\u0430\u0456oh;
import \u0440\u0440e.\u043eoa;
import \u0440\u0440e.\u043eo\u043ea\u0456\u0441;
import \u0440\u0440e.\u0441\u0430ci;
import \u0440\u0440e.\u0445c\u0440\u043e;
import \u0440\u0440e.\u0455j\u0440;
import \u0440\u0440e.\u0456\u04bb\u0430;
import \u0440\u0440e.\u0458ac;
import \u0440\u0440e.\u04bbj\u0455;
import \u0445eo.c\u0455pi;
import \u0445eo.\u0458i\u0456x;
import \u0445\u0430p\u0440.ac\u0456\u0455;
import \u0445\u0430p\u0440.e\u0430is;
import \u0445\u0430p\u0440.e\u043ec\u0441;
import \u0445\u0430p\u0440.hh\u0458\u043e\u0445;
import \u0445\u0430p\u0440.hj\u0440\u0440\u0430h\u0430;
import \u0445\u0430p\u0440.jh\u0455;
import \u0445\u0430p\u0440.pi\u0458p;
import \u0445\u0430p\u0440.p\u0455\u0445hxh;
import \u0445\u0430p\u0440.so\u04bb\u0455p;
import \u0445\u0430p\u0440.xj\u0445h\u0441;
import \u0445\u0430p\u0440.x\u0435\u0430xepo;
import \u0445\u0430p\u0440.x\u0445ih;
import \u0445\u0430p\u0440.\u0430opc\u043e\u0440;
import \u0445\u0430p\u0440.\u0430\u04bbh\u0435\u043e\u04bba;
import \u0445\u0430p\u0440.\u0430\u04bb\u0441oe\u0430\u04bb;
import \u0445\u0430p\u0440.\u0435e\u0445a\u0458;
import \u0445\u0430p\u0440.\u0435i\u0445cs\u043ei;
import \u0445\u0430p\u0440.\u043ex\u0458\u043exxj;
import \u0445\u0430p\u0440.\u043e\u0430\u0458je;
import \u0445\u0430p\u0440.\u043e\u0458\u0455sc\u0458;
import \u0445\u0430p\u0440.\u0440\u0435o\u0440\u0445\u04bbi;
import \u0445\u0430p\u0440.\u0441c\u043e;
import \u0445\u0430p\u0440.\u0441ij;
import \u0445\u0430p\u0440.\u0455\u0441ap\u043eh\u0456;
import \u0445\u0430p\u0440.\u0455\u0455pe;
import \u0445\u0430p\u0440.\u0456app\u0435i;
import \u0445\u0430p\u0440.\u0456x\u043e;
import \u0445\u0430p\u0440.\u0458aoa;
import \u0445\u0430p\u0440.\u0458jj\u0440\u043eo;
import \u0445\u0430p\u0440.\u0458\u0430ajh;
import \u0445\u0430p\u0440.\u0458\u0458xhx;
import \u0445\u0430p\u0440.\u0458\u04bb\u0435;
import \u0445\u0430p\u0440.\u04bbc\u0456pxoe;
import \u0445\u0430p\u0440.\u04bb\u0455j\u0458\u0458;

public class xc\u0435x\u04bb\u0435 {
    private static final /* synthetic */ Logger \u043e\u0455\u04bb;
    private final /* synthetic */ List<c\u0455pi> \u0445\u0441x;
    private final /* synthetic */ Map<Class<? extends c\u0455pi>, c\u0455pi> \u0441\u0435p\u0455\u0441\u0435;
    private final /* synthetic */ Map<String, c\u0455pi> a\u0435s;

    public xc\u0435x\u04bb\u0435() {
        if (true | false) {
        }
        this.\u0445\u0441x = new ArrayList<c\u0455pi>();
        this.\u0441\u0435p\u0455\u0441\u0435 = new HashMap<Class<? extends c\u0455pi>, c\u0455pi>();
        this.a\u0435s = new HashMap<String, c\u0455pi>();
        try {
            this.\u0435\u04bb\u043eo\u0455();
            this.\u0445\u0441x.sort((c\u0455pi2, c\u0455pi3) -> {
                if (true | false) {
                }
                return c\u0455pi2.getName().compareToIgnoreCase(c\u0455pi3.getName());
            });
        }
        catch (Exception exception) {
            byte[] byArray = new byte[-976937553 + 976937581];
            byArray[0] = -660980531 + 660980629;
            byArray[1] = -607390599 + 607390722;
            byArray[2] = -764883999 + 764884049;
            byArray[3] = -1282885028 + 1282885144;
            byArray[4] = -511397507 + 511397535;
            byArray[5] = -486976856 + 486976837;
            byArray[-1046756790 + 1046756796] = -2057789890 + 2057789780;
            byArray[-72234338 + 72234345] = -314806276 + 314806288;
            byArray[-2046938615 + 2046938623] = -815457078 + 815457125;
            byArray[-2126157430 + 2126157439] = -1261107713 + 1261107753;
            byArray[-2081657684 + 2081657694] = -3069250 + 3069188;
            byArray[-1850820715 + 1850820726] = -1203863473 + 1203863558;
            byArray[-879308050 + 879308062] = -528713139 + 528713123;
            byArray[-323955453 + 323955466] = -99805476 + 99805413;
            byArray[-1801024298 + 1801024312] = -1;
            byArray[-1123338943 + 1123338958] = -1335504982 + 1335504854;
            byArray[-1159594472 + 1159594488] = -1117933153 + 1117933208;
            byArray[-687051676 + 687051693] = -1690563722 + 1690563758;
            byArray[-458568364 + 458568382] = -1749126141 + 1749126162;
            byArray[-1770910355 + 1770910374] = -1727359264 + 1727359388;
            byArray[-1766507609 + 1766507629] = -1935127467 + 1935127522;
            byArray[-803397386 + 803397407] = -237280310 + 237280374;
            byArray[-18673269 + 18673291] = -1860997055 + 1860997086;
            byArray[-2064716106 + 2064716129] = -632120243 + 632120344;
            byArray[-2040846981 + 2040847005] = -335391248 + 335391290;
            byArray[-1787067007 + 1787067032] = -16205071 + 16205124;
            byArray[-1772941532 + 1772941558] = -909749897 + 909750007;
            byArray[-486275803 + 486275830] = -1977518922 + 1977518866;
            \u043e\u0455\u04bb.error((String)((Object)xc\u0435x\u04bb\u0435.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(516459837 + 1327882416), (int)(436333031 + 164641258))), (Throwable)exception);
            throw new RuntimeException(exception);
        }
        ((\u0445\u0440\u0430\u0435\u0445\u043e)((Object)xc\u0435x\u04bb\u0435.a_bsm1("jaa\u0435\u0445c", jaa\u0435\u0445c()))).\u0458poi\u0440().\u0441\u0430\u0456(this);
    }

    private /* synthetic */ void \u0435\u04bb\u043eo\u0455() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        c\u0455pi[] c\u0455piArray = new c\u0455pi[-1036490681 + 1036490754];
        c\u0455piArray[0] = new \u0430\u0435\u04bbj();
        c\u0455piArray[1] = new \u0455\u0458\u0456();
        c\u0455piArray[2] = new o\u0430\u0456\u0440ah();
        c\u0455piArray[3] = new \u0456\u0456o();
        c\u0455piArray[4] = new \u0441px();
        c\u0455piArray[5] = new \u04bbos\u0445();
        c\u0455piArray[-1496519641 + 1496519647] = new c\u0455i\u0430\u0440\u0445();
        c\u0455piArray[-1786175072 + 1786175079] = new aih\u0441s();
        c\u0455piArray[-1848273231 + 1848273239] = new x\u0458\u043e\u0435jo();
        c\u0455piArray[-817429722 + 817429731] = new \u0441\u0458\u0435xpp();
        c\u0455piArray[-1894460255 + 1894460265] = new \u0456\u04bb\u0430();
        c\u0455piArray[-469144557 + 469144568] = new h\u0440\u0456hs\u0455\u0445();
        c\u0455piArray[-1243041478 + 1243041490] = new a\u04bb\u0455\u0455p();
        c\u0455piArray[-1219141669 + 1219141682] = new \u0458ac();
        c\u0455piArray[-819215916 + 819215930] = new j\u0440i\u043ehe();
        c\u0455piArray[-1643956137 + 1643956152] = new \u043eoa();
        c\u0455piArray[-20685403 + 20685419] = new \u0455j\u0440();
        c\u0455piArray[-1438729548 + 1438729565] = new po\u0440j();
        c\u0455piArray[-1048947880 + 1048947898] = new ca\u0458s\u0440();
        c\u0455piArray[-586981904 + 586981923] = new \u0441\u0430ci();
        c\u0455piArray[-407879955 + 407879975] = new i\u0435\u0445\u0456sh();
        c\u0455piArray[-2025334376 + 2025334397] = new \u0430\u0456oh();
        c\u0455piArray[-145982276 + 145982298] = new j\u04bbe\u0430\u0445\u0458\u0458();
        c\u0455piArray[-986624377 + 986624400] = new \u04bbj\u0455();
        c\u0455piArray[-2007169060 + 2007169084] = new \u043eo\u043ea\u0456\u0441();
        c\u0455piArray[-1254604512 + 1254604537] = new \u0445c\u0440\u043e();
        c\u0455piArray[-1742228855 + 1742228881] = new oaei\u0441();
        c\u0455piArray[-1090804356 + 1090804383] = new i\u0430c();
        c\u0455piArray[-1489031553 + 1489031581] = new hc\u0445o();
        c\u0455piArray[-1258511915 + 1258511944] = new \u0435oi\u043e();
        c\u0455piArray[-1203691091 + 1203691121] = new h\u0455\u0445a\u0456s();
        c\u0455piArray[-2093260207 + 2093260238] = new \u0440coa\u0440c();
        c\u0455piArray[-864706308 + 864706340] = new a\u0430\u0455se();
        c\u0455piArray[-1113449652 + 1113449685] = new \u0430\u0435p\u0455();
        c\u0455piArray[-462538947 + 462538981] = new \u0458c\u0430s();
        c\u0455piArray[-1457415176 + 1457415211] = new \u0441\u043e\u0456();
        c\u0455piArray[-1359007287 + 1359007323] = new \u0445x\u04bbj\u043e();
        c\u0455piArray[-787098838 + 787098875] = new p\u043eo();
        c\u0455piArray[-1886904675 + 1886904713] = new \u0458hjss();
        c\u0455piArray[-604873981 + 604874020] = new pi\u0458p();
        c\u0455piArray[-71904960 + 71905000] = new \u0458\u0458xhx();
        c\u0455piArray[-1148305926 + 1148305967] = new \u0455\u0455pe();
        c\u0455piArray[-1705034748 + 1705034790] = new \u0458jj\u0440\u043eo();
        c\u0455piArray[-1521735503 + 1521735546] = new \u0430\u04bb\u0441oe\u0430\u04bb();
        c\u0455piArray[-986051942 + 986051986] = new \u0441c\u043e();
        c\u0455piArray[-742696976 + 742697021] = new \u043e\u0458\u0455sc\u0458();
        c\u0455piArray[-1905915547 + 1905915593] = new \u0456x\u043e();
        c\u0455piArray[-2107195173 + 2107195220] = new \u043ex\u0458\u043exxj();
        c\u0455piArray[-824272324 + 824272372] = new \u04bbc\u0456pxoe();
        c\u0455piArray[-1246696570 + 1246696619] = new \u0430opc\u043e\u0440();
        c\u0455piArray[-863298636 + 863298686] = new \u0458\u04bb\u0435();
        c\u0455piArray[-936627005 + 936627056] = new \u0440\u0435o\u0440\u0445\u04bbi();
        c\u0455piArray[-91008137 + 91008189] = new x\u0435\u0430xepo();
        c\u0455piArray[-1311644677 + 1311644730] = new p\u0455\u0445hxh();
        c\u0455piArray[-2085587320 + 2085587374] = new xj\u0445h\u0441();
        c\u0455piArray[-633951037 + 633951092] = new hh\u0458\u043e\u0445();
        c\u0455piArray[-1621759080 + 1621759136] = new \u0430\u04bbh\u0435\u043e\u04bba();
        c\u0455piArray[-1112176209 + 1112176266] = new hj\u0440\u0440\u0430h\u0430();
        c\u0455piArray[-517295064 + 517295122] = new jh\u0455();
        c\u0455piArray[-1468934440 + 1468934499] = new \u04bb\u0455j\u0458\u0458();
        c\u0455piArray[-1624596387 + 1624596447] = new ac\u0456\u0455();
        c\u0455piArray[-1762695584 + 1762695645] = new e\u0430is();
        c\u0455piArray[-1542133781 + 1542133843] = new \u0456app\u0435i();
        c\u0455piArray[-247336940 + 247337003] = new \u0435i\u0445cs\u043ei();
        c\u0455piArray[-1180954672 + 1180954736] = new \u0458aoa();
        c\u0455piArray[-860852403 + 860852468] = new so\u04bb\u0455p();
        c\u0455piArray[-630292222 + 630292288] = new e\u043ec\u0441();
        c\u0455piArray[-477939991 + 477940058] = new \u0455\u0441ap\u043eh\u0456();
        c\u0455piArray[-1978075269 + 1978075337] = new \u043e\u0430\u0458je();
        c\u0455piArray[-515640528 + 515640597] = new x\u0445ih();
        c\u0455piArray[-1958292581 + 1958292651] = new \u0458\u0430ajh();
        c\u0455piArray[-1823247274 + 1823247345] = new \u0435e\u0445a\u0458();
        c\u0455piArray[-1385500421 + 1385500493] = new \u0441ij();
        this.\u0455s\u0456(c\u0455piArray);
    }

    private /* synthetic */ void \u0455s\u0456(c\u0455pi ... c\u0455piArray) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        block4: for (c\u0455pi c\u0455pi2 : c\u0455piArray) {
            this.os\u0458j(c\u0455pi2);
            switch (0) {
                default: {
                    continue block4;
                }
                case 1: {
                    continue block4;
                }
                case 2: 
            }
        }
    }

    private /* synthetic */ void os\u0458j(c\u0455pi c\u0455pi2) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        c\u0455pi2.initModule();
        this.\u0445\u0441x.add(c\u0455pi2);
        this.\u0441\u0435p\u0455\u0441\u0435.put(c\u0455pi2.getClass(), c\u0455pi2);
        this.a\u0435s.put(c\u0455pi2.getName().toLowerCase(), c\u0455pi2);
    }

    public /* synthetic */ List<c\u0455pi> \u0456\u0456a(\u0458i\u0456x \u0458i\u0456x2) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        ArrayList<c\u0455pi> arrayList = new ArrayList<c\u0455pi>();
        for (c\u0455pi c\u0455pi2 : this.\u0445\u0441x) {
            if (c\u0455pi2.cpho() != \u0458i\u0456x2) continue;
            arrayList.add(c\u0455pi2);
        }
        return arrayList;
    }

    public /* synthetic */ c\u0455pi \u0441c\u0458\u043e\u0430(Class<? extends c\u0455pi> clazz) {
        c\u0455pi c\u0455pi2;
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if ((c\u0455pi2 = this.\u0441\u0435p\u0455\u0441\u0435.get(clazz)) == null) {
            throw new xi\u0440o\u0440jj();
        }
        return c\u0455pi2;
    }

    public /* synthetic */ c\u0455pi s\u0445\u043e\u0458i(String string) {
        c\u0455pi c\u0455pi2;
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        if ((c\u0455pi2 = this.a\u0435s.get(string.toLowerCase())) == null) {
            throw new xi\u0440o\u0440jj();
        }
        return c\u0455pi2;
    }

    @\u0445\u0458\u0458h\u0445\u0430a
    public void \u0458\u0458\u04bbi\u0455(\u0441\u0430ahccx \u0441\u0430ahccx2) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        if (((class_310)xc\u0435x\u04bb\u0435.a_bsm2("method_1551", method_1551())).field_1755 == null) {
            this.\u0445\u0441x.stream().filter(c\u0455pi2 -> {
                if ((3 * 3 + 3) % 2 == 0) {
                }
                return c\u0455pi2.x\u04bb\u043e\u04bb\u0456x() == \u0441\u0430ahccx2.x\u04bb\u043e\u04bb\u0456x();
            }).forEach(c\u0455pi::\u043e\u0440\u0440s\u0435);
        }
    }

    @\u0445\u0458\u0458h\u0445\u0430a
    public void \u0445hs(\u0455\u0456\u0440 \u0455\u0456\u04402) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if (!(\u0455\u0456\u04402.\u0440\u0430\u0440\u043e() || \u0455\u0456\u04402.x\u04bb\u043e\u04bb\u0456x() != 3 && \u0455\u0456\u04402.x\u04bb\u043e\u04bb\u0456x() != 4)) {
            for (c\u0455pi c\u0455pi2 : this.\u0445\u0441x) {
                if (c\u0455pi2.x\u04bb\u043e\u04bb\u0456x() != -\u0455\u0456\u04402.x\u04bb\u043e\u04bb\u0456x()) continue;
                c\u0455pi2.\u043e\u0440\u0440s\u0435();
            }
        }
    }

    public /* synthetic */ List<c\u0455pi> h\u0445ca() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return this.\u0445\u0441x;
    }

    static {
        \u043e\u0455\u04bb = LogManager.getLogger(xc\u0435x\u04bb\u0435.class);
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

