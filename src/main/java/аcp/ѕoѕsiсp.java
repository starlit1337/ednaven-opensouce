/*
 * Decompiled with CFR 0.152.
 */
package \u0430cp;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import \u0430cp.cs\u04bb;
import \u0430cp.p\u0455sa\u0440\u0445;
import \u0430cp.xi\u0441;
import \u0430cp.\u043es\u0455oxp\u0441;
import \u0430cp.\u0455ehaxop;
import \u0430cp.\u0456\u0456\u0455x\u0430;
import \u0430cp.\u04bb\u0456e\u0458e\u0441;

public final class \u0455o\u0455si\u0441p
implements p\u0455sa\u0440\u0445 {
    /* synthetic */ int[] s\u043e\u0435\u043ea\u04bbi;
    /* synthetic */ int[] o\u043e\u0440\u0435xx;
    /* synthetic */ int[] h\u0458i;
    /* synthetic */ int[] \u0445sj\u0455c\u0456\u04bb;
    /* synthetic */ double[] \u0455\u0435s\u043ex\u0430;
    /* synthetic */ \u043es\u0455oxp\u0441[] \u04bbh\u0440s\u043ej;
    private static final /* synthetic */ int \u04bbo\u04bb\u0440\u0440cp = 5;
    private static final /* synthetic */ int aji\u0455x = 33;
    private static final /* synthetic */ int ho\u0441hoe = 35937;

    public \u0455o\u0455si\u0441p() {
        if (true | false) {
        }
    }

    @Override
    public /* synthetic */ \u04bb\u0456e\u0458e\u0441 quantize(int[] nArray, int n) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        \u04bb\u0456e\u0458e\u0441 \u04bb\u0456e\u0458e\u04412 = new \u0456\u0456\u0455x\u0430().quantize(nArray, n);
        this.\u04bbo\u0445\u0440(\u04bb\u0456e\u0458e\u04412.pip\u043e\u04bb);
        this.es\u0435o();
        cs\u04bb cs\u04bb2 = this.px\u0445(n);
        List<Integer> list = this.p\u0455o\u0441(cs\u04bb2.hi\u043eo);
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<Integer, Integer>();
        for (int n2 : list) {
            linkedHashMap.put((Integer)((Object)\u0455o\u0455si\u0441p.a_bsm0("valueOf", valueOf(int ), (int)n2)), (Integer)((Object)\u0455o\u0455si\u0441p.a_bsm0("valueOf", valueOf(int ), (int)0)));
        }
        return new \u04bb\u0456e\u0458e\u0441(linkedHashMap);
    }

    static /* synthetic */ int \u04bbjoi\u0430(int n, int n2, int n3) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return (n << -1099027317 + 1099027327) + (n << -444740690 + 444740696) + n + (n2 << 5) + n2 + n3;
    }

    /* synthetic */ void \u04bbo\u0445\u0440(Map<Integer, Integer> map) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        this.s\u043e\u0435\u043ea\u04bbi = new int[-2014114604 + 2014150541];
        this.o\u043e\u0440\u0435xx = new int[-1993014158 + 1993050095];
        this.h\u0458i = new int[-1785383268 + 1785419205];
        this.\u0445sj\u0455c\u0456\u04bb = new int[-1983095027 + 1983130964];
        this.\u0455\u0435s\u043ex\u0430 = new double[-1115438093 + 1115474030];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int n;
            int n2 = entry.getKey();
            int n3 = entry.getValue();
            CallSite callSite = \u0455o\u0455si\u0441p.a_bsm1("\u0455p\u0455", \u0455p\u0455(int ), (int)n2);
            CallSite callSite2 = \u0455o\u0455si\u0441p.a_bsm2("\u0456\u04bbp\u0435oe", \u0456\u04bbp\u0435oe(int ), (int)n2);
            CallSite callSite3 = \u0455o\u0455si\u0441p.a_bsm3("js\u0435\u0435", js\u0435\u0435(int ), (int)n2);
            int n4 = 3;
            reference var10_10 = (callSite >> n4) + true;
            reference var11_11 = (callSite2 >> n4) + true;
            reference var12_12 = (callSite3 >> n4) + true;
            int n5 = n = \u0455o\u0455si\u0441p.\u04bbjoi\u0430((int)var10_10, (int)var11_11, (int)var12_12);
            this.s\u043e\u0435\u043ea\u04bbi[n5] = this.s\u043e\u0435\u043ea\u04bbi[n5] + n3;
            int n6 = n;
            this.o\u043e\u0440\u0435xx[n6] = this.o\u043e\u0440\u0435xx[n6] + callSite * n3;
            int n7 = n;
            this.h\u0458i[n7] = this.h\u0458i[n7] + callSite2 * n3;
            int n8 = n;
            this.\u0445sj\u0455c\u0456\u04bb[n8] = this.\u0445sj\u0455c\u0456\u04bb[n8] + callSite3 * n3;
            int n9 = n;
            this.\u0455\u0435s\u043ex\u0430[n9] = this.\u0455\u0435s\u043ex\u0430[n9] + (double)(n3 * (callSite * callSite + callSite2 * callSite2 + callSite3 * callSite3));
        }
    }

    /* synthetic */ void es\u0435o() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        for (int i = 1; i < -885021828 + 885021861; ++i) {
            int[] nArray = new int[-869550495 + 869550528];
            int[] nArray2 = new int[-1339112035 + 1339112068];
            int[] nArray3 = new int[-1093939521 + 1093939554];
            int[] nArray4 = new int[-941900989 + 941901022];
            double[] dArray = new double[-1069647276 + 1069647309];
            for (int j = 1; j < -1950371664 + 1950371697; ++j) {
                int n = 0;
                int n2 = 0;
                int n3 = 0;
                int n4 = 0;
                double d = 0.0;
                for (int k = 1; k < -729294671 + 729294704; ++k) {
                    int n5 = \u0455o\u0455si\u0441p.\u04bbjoi\u0430(i, j, k);
                    n += this.s\u043e\u0435\u043ea\u04bbi[n5];
                    n2 += this.o\u043e\u0440\u0435xx[n5];
                    n3 += this.h\u0458i[n5];
                    n4 += this.\u0445sj\u0455c\u0456\u04bb[n5];
                    d += this.\u0455\u0435s\u043ex\u0430[n5];
                    int n6 = k;
                    nArray[n6] = nArray[n6] + n;
                    int n7 = k;
                    nArray2[n7] = nArray2[n7] + n2;
                    int n8 = k;
                    nArray3[n8] = nArray3[n8] + n3;
                    int n9 = k;
                    nArray4[n9] = nArray4[n9] + n4;
                    int n10 = k;
                    dArray[n10] = dArray[n10] + d;
                    int n11 = \u0455o\u0455si\u0441p.\u04bbjoi\u0430(i - 1, j, k);
                    this.s\u043e\u0435\u043ea\u04bbi[n5] = this.s\u043e\u0435\u043ea\u04bbi[n11] + nArray[k];
                    this.o\u043e\u0440\u0435xx[n5] = this.o\u043e\u0440\u0435xx[n11] + nArray2[k];
                    this.h\u0458i[n5] = this.h\u0458i[n11] + nArray3[k];
                    this.\u0445sj\u0455c\u0456\u04bb[n5] = this.\u0445sj\u0455c\u0456\u04bb[n11] + nArray4[k];
                    this.\u0455\u0435s\u043ex\u0430[n5] = this.\u0455\u0435s\u043ex\u0430[n11] + dArray[k];
                }
            }
        }
    }

    /* synthetic */ cs\u04bb px\u0445(int n) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        this.\u04bbh\u0440s\u043ej = new \u043es\u0455oxp\u0441[n];
        for (int i = 0; i < n; ++i) {
            this.\u04bbh\u0440s\u043ej[i] = new \u043es\u0455oxp\u0441();
        }
        double[] dArray = new double[n];
        \u043es\u0455oxp\u0441 \u043es\u0455oxp\u04412 = this.\u04bbh\u0440s\u043ej[0];
        \u043es\u0455oxp\u04412.\u0455ccc = -398443069 + 398443101;
        \u043es\u0455oxp\u04412.x\u0455cc\u04bb = -268148032 + 268148064;
        \u043es\u0455oxp\u04412.\u0458\u0435\u0445 = -1462987126 + 1462987158;
        int n2 = n;
        int n3 = 0;
        for (int i = 1; i < n; ++i) {
            if (this.\u0456a\u0456a\u0455(this.\u04bbh\u0440s\u043ej[n3], this.\u04bbh\u0440s\u043ej[i]).booleanValue()) {
                dArray[n3] = this.\u04bbh\u0440s\u043ej[n3].\u043e\u0445\u043e > 1 ? this.i\u0430\u0441\u0441a(this.\u04bbh\u0440s\u043ej[n3]) : 0.0;
                dArray[i] = this.\u04bbh\u0440s\u043ej[i].\u043e\u0445\u043e > 1 ? this.i\u0430\u0441\u0441a(this.\u04bbh\u0440s\u043ej[i]) : 0.0;
            } else {
                dArray[n3] = 0.0;
                --i;
            }
            n3 = 0;
            double d = dArray[0];
            block6: for (int j = 1; j <= i; ++j) {
                if (dArray[j] > d) {
                    d = dArray[j];
                    n3 = j;
                }
                switch (0) {
                    default: {
                        continue block6;
                    }
                    case 1: {
                        continue block6;
                    }
                    case 2: 
                }
            }
            if (!(d <= 0.0)) continue;
            n2 = i + 1;
            break;
        }
        return new cs\u04bb(n, n2);
    }

    /* synthetic */ List<Integer> p\u0455o\u0441(int n) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < n; ++i) {
            \u043es\u0455oxp\u0441 \u043es\u0455oxp\u04412 = this.\u04bbh\u0440s\u043ej[i];
            int n2 = \u0455o\u0455si\u0441p.\u0440\u0430eac\u0441(\u043es\u0455oxp\u04412, this.s\u043e\u0435\u043ea\u04bbi);
            if (n2 <= 0) continue;
            int n3 = \u0455o\u0455si\u0441p.\u0440\u0430eac\u0441(\u043es\u0455oxp\u04412, this.o\u043e\u0440\u0435xx) / n2;
            int n4 = \u0455o\u0455si\u0441p.\u0440\u0430eac\u0441(\u043es\u0455oxp\u04412, this.h\u0458i) / n2;
            int n5 = \u0455o\u0455si\u0441p.\u0440\u0430eac\u0441(\u043es\u0455oxp\u04412, this.\u0445sj\u0455c\u0456\u04bb) / n2;
            int n6 = -837567723 + 820790507 | (n3 & -1635547111 + 1635547366) << -79282576 + 79282592 | (n4 & -493333591 + 493333846) << -2038592359 + 2038592367 | n5 & -1781324098 + 1781324353;
            arrayList.add((Integer)((Object)\u0455o\u0455si\u0441p.a_bsm0("valueOf", valueOf(int ), (int)n6)));
        }
        return arrayList;
    }

    /* synthetic */ double i\u0430\u0441\u0441a(\u043es\u0455oxp\u0441 \u043es\u0455oxp\u04412) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        int n = \u0455o\u0455si\u0441p.\u0440\u0430eac\u0441(\u043es\u0455oxp\u04412, this.o\u043e\u0440\u0435xx);
        int n2 = \u0455o\u0455si\u0441p.\u0440\u0430eac\u0441(\u043es\u0455oxp\u04412, this.h\u0458i);
        int n3 = \u0455o\u0455si\u0441p.\u0440\u0430eac\u0441(\u043es\u0455oxp\u04412, this.\u0445sj\u0455c\u0456\u04bb);
        double d = this.\u0455\u0435s\u043ex\u0430[\u0455o\u0455si\u0441p.\u04bbjoi\u0430(\u043es\u0455oxp\u04412.\u0455ccc, \u043es\u0455oxp\u04412.x\u0455cc\u04bb, \u043es\u0455oxp\u04412.\u0458\u0435\u0445)] - this.\u0455\u0435s\u043ex\u0430[\u0455o\u0455si\u0441p.\u04bbjoi\u0430(\u043es\u0455oxp\u04412.\u0455ccc, \u043es\u0455oxp\u04412.x\u0455cc\u04bb, \u043es\u0455oxp\u04412.\u0430h\u0435\u0458)] - this.\u0455\u0435s\u043ex\u0430[\u0455o\u0455si\u0441p.\u04bbjoi\u0430(\u043es\u0455oxp\u04412.\u0455ccc, \u043es\u0455oxp\u04412.po\u0456c, \u043es\u0455oxp\u04412.\u0458\u0435\u0445)] + this.\u0455\u0435s\u043ex\u0430[\u0455o\u0455si\u0441p.\u04bbjoi\u0430(\u043es\u0455oxp\u04412.\u0455ccc, \u043es\u0455oxp\u04412.po\u0456c, \u043es\u0455oxp\u04412.\u0430h\u0435\u0458)] - this.\u0455\u0435s\u043ex\u0430[\u0455o\u0455si\u0441p.\u04bbjoi\u0430(\u043es\u0455oxp\u04412.\u0445\u04bb\u0441\u0435\u0430, \u043es\u0455oxp\u04412.x\u0455cc\u04bb, \u043es\u0455oxp\u04412.\u0458\u0435\u0445)] + this.\u0455\u0435s\u043ex\u0430[\u0455o\u0455si\u0441p.\u04bbjoi\u0430(\u043es\u0455oxp\u04412.\u0445\u04bb\u0441\u0435\u0430, \u043es\u0455oxp\u04412.x\u0455cc\u04bb, \u043es\u0455oxp\u04412.\u0430h\u0435\u0458)] + this.\u0455\u0435s\u043ex\u0430[\u0455o\u0455si\u0441p.\u04bbjoi\u0430(\u043es\u0455oxp\u04412.\u0445\u04bb\u0441\u0435\u0430, \u043es\u0455oxp\u04412.po\u0456c, \u043es\u0455oxp\u04412.\u0458\u0435\u0445)] - this.\u0455\u0435s\u043ex\u0430[\u0455o\u0455si\u0441p.\u04bbjoi\u0430(\u043es\u0455oxp\u04412.\u0445\u04bb\u0441\u0435\u0430, \u043es\u0455oxp\u04412.po\u0456c, \u043es\u0455oxp\u04412.\u0430h\u0435\u0458)];
        int n4 = n * n + n2 * n2 + n3 * n3;
        int n5 = \u0455o\u0455si\u0441p.\u0440\u0430eac\u0441(\u043es\u0455oxp\u04412, this.s\u043e\u0435\u043ea\u04bbi);
        return d - (double)n4 / (double)n5;
    }

    /* synthetic */ Boolean \u0456a\u0456a\u0455(\u043es\u0455oxp\u0441 \u043es\u0455oxp\u04412, \u043es\u0455oxp\u0441 \u043es\u0455oxp\u04413) {
        \u0455ehaxop \u0455ehaxop2;
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        int n = \u0455o\u0455si\u0441p.\u0440\u0430eac\u0441(\u043es\u0455oxp\u04412, this.o\u043e\u0440\u0435xx);
        int n2 = \u0455o\u0455si\u0441p.\u0440\u0430eac\u0441(\u043es\u0455oxp\u04412, this.h\u0458i);
        int n3 = \u0455o\u0455si\u0441p.\u0440\u0430eac\u0441(\u043es\u0455oxp\u04412, this.\u0445sj\u0455c\u0456\u04bb);
        int n4 = \u0455o\u0455si\u0441p.\u0440\u0430eac\u0441(\u043es\u0455oxp\u04412, this.s\u043e\u0435\u043ea\u04bbi);
        xi\u0441 xi\u04412 = this.\u04bbih\u0435h\u0455e(\u043es\u0455oxp\u04412, \u0455ehaxop.a\u043e\u0430aa\u04bb, \u043es\u0455oxp\u04412.\u0445\u04bb\u0441\u0435\u0430 + 1, \u043es\u0455oxp\u04412.\u0455ccc, n, n2, n3, n4);
        xi\u0441 xi\u04413 = this.\u04bbih\u0435h\u0455e(\u043es\u0455oxp\u04412, \u0455ehaxop.\u0430\u0440xoeo\u043e, \u043es\u0455oxp\u04412.po\u0456c + 1, \u043es\u0455oxp\u04412.x\u0455cc\u04bb, n, n2, n3, n4);
        xi\u0441 xi\u04414 = this.\u04bbih\u0435h\u0455e(\u043es\u0455oxp\u04412, \u0455ehaxop.\u0458\u04bbc\u0445, \u043es\u0455oxp\u04412.\u0430h\u0435\u0458 + 1, \u043es\u0455oxp\u04412.\u0458\u0435\u0445, n, n2, n3, n4);
        double d = xi\u04412.pjj\u0445e\u0441\u04bb;
        double d2 = xi\u04413.pjj\u0445e\u0441\u04bb;
        double d3 = xi\u04414.pjj\u0445e\u0441\u04bb;
        if (d >= d2 && d >= d3) {
            if (xi\u04412.aaies\u0441\u0435 < 0) {
                return \u0455o\u0455si\u0441p.a_bsm4("valueOf", valueOf(boolean ), (boolean)false);
            }
            \u0455ehaxop2 = \u0455ehaxop.a\u043e\u0430aa\u04bb;
        } else {
            \u0455ehaxop2 = d2 >= d && d2 >= d3 ? \u0455ehaxop.\u0430\u0440xoeo\u043e : \u0455ehaxop.\u0458\u04bbc\u0445;
        }
        \u043es\u0455oxp\u04413.\u0455ccc = \u043es\u0455oxp\u04412.\u0455ccc;
        \u043es\u0455oxp\u04413.x\u0455cc\u04bb = \u043es\u0455oxp\u04412.x\u0455cc\u04bb;
        \u043es\u0455oxp\u04413.\u0458\u0435\u0445 = \u043es\u0455oxp\u04412.\u0458\u0435\u0445;
        block0 : switch (\u0455ehaxop2.ordinal()) {
            case 0: {
                \u043es\u0455oxp\u04413.\u0445\u04bb\u0441\u0435\u0430 = \u043es\u0455oxp\u04412.\u0455ccc = xi\u04412.aaies\u0441\u0435;
                \u043es\u0455oxp\u04413.po\u0456c = \u043es\u0455oxp\u04412.po\u0456c;
                \u043es\u0455oxp\u04413.\u0430h\u0435\u0458 = \u043es\u0455oxp\u04412.\u0430h\u0435\u0458;
                break;
            }
            case 1: {
                \u043es\u0455oxp\u04412.x\u0455cc\u04bb = xi\u04413.aaies\u0441\u0435;
                \u043es\u0455oxp\u04413.\u0445\u04bb\u0441\u0435\u0430 = \u043es\u0455oxp\u04412.\u0445\u04bb\u0441\u0435\u0430;
                \u043es\u0455oxp\u04413.po\u0456c = \u043es\u0455oxp\u04412.x\u0455cc\u04bb;
                \u043es\u0455oxp\u04413.\u0430h\u0435\u0458 = \u043es\u0455oxp\u04412.\u0430h\u0435\u0458;
                switch (0) {
                    default: {
                        break block0;
                    }
                    case 1: {
                        break block0;
                    }
                    case 2: 
                }
                break;
            }
            case 2: {
                \u043es\u0455oxp\u04412.\u0458\u0435\u0445 = xi\u04414.aaies\u0441\u0435;
                \u043es\u0455oxp\u04413.\u0445\u04bb\u0441\u0435\u0430 = \u043es\u0455oxp\u04412.\u0445\u04bb\u0441\u0435\u0430;
                \u043es\u0455oxp\u04413.po\u0456c = \u043es\u0455oxp\u04412.po\u0456c;
                \u043es\u0455oxp\u04413.\u0430h\u0435\u0458 = \u043es\u0455oxp\u04412.\u0458\u0435\u0445;
            }
        }
        \u043es\u0455oxp\u04412.\u043e\u0445\u043e = (\u043es\u0455oxp\u04412.\u0455ccc - \u043es\u0455oxp\u04412.\u0445\u04bb\u0441\u0435\u0430) * (\u043es\u0455oxp\u04412.x\u0455cc\u04bb - \u043es\u0455oxp\u04412.po\u0456c) * (\u043es\u0455oxp\u04412.\u0458\u0435\u0445 - \u043es\u0455oxp\u04412.\u0430h\u0435\u0458);
        \u043es\u0455oxp\u04413.\u043e\u0445\u043e = (\u043es\u0455oxp\u04413.\u0455ccc - \u043es\u0455oxp\u04413.\u0445\u04bb\u0441\u0435\u0430) * (\u043es\u0455oxp\u04413.x\u0455cc\u04bb - \u043es\u0455oxp\u04413.po\u0456c) * (\u043es\u0455oxp\u04413.\u0458\u0435\u0445 - \u043es\u0455oxp\u04413.\u0430h\u0435\u0458);
        return \u0455o\u0455si\u0441p.a_bsm4("valueOf", valueOf(boolean ), (boolean)true);
    }

    /* synthetic */ xi\u0441 \u04bbih\u0435h\u0455e(\u043es\u0455oxp\u0441 \u043es\u0455oxp\u04412, \u0455ehaxop \u0455ehaxop2, int n, int n2, int n3, int n4, int n5, int n6) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        int n7 = \u0455o\u0455si\u0441p.\u043e\u04bbeip(\u043es\u0455oxp\u04412, \u0455ehaxop2, this.o\u043e\u0440\u0435xx);
        int n8 = \u0455o\u0455si\u0441p.\u043e\u04bbeip(\u043es\u0455oxp\u04412, \u0455ehaxop2, this.h\u0458i);
        int n9 = \u0455o\u0455si\u0441p.\u043e\u04bbeip(\u043es\u0455oxp\u04412, \u0455ehaxop2, this.\u0445sj\u0455c\u0456\u04bb);
        int n10 = \u0455o\u0455si\u0441p.\u043e\u04bbeip(\u043es\u0455oxp\u04412, \u0455ehaxop2, this.s\u043e\u0435\u043ea\u04bbi);
        double d = 0.0;
        int n11 = -1;
        int n12 = 0;
        int n13 = 0;
        int n14 = 0;
        int n15 = 0;
        for (int i = n; i < n2; ++i) {
            n12 = n7 + \u0455o\u0455si\u0441p.\u0456\u0455p\u0440\u04bb(\u043es\u0455oxp\u04412, \u0455ehaxop2, i, this.o\u043e\u0440\u0435xx);
            n13 = n8 + \u0455o\u0455si\u0441p.\u0456\u0455p\u0440\u04bb(\u043es\u0455oxp\u04412, \u0455ehaxop2, i, this.h\u0458i);
            n14 = n9 + \u0455o\u0455si\u0441p.\u0456\u0455p\u0440\u04bb(\u043es\u0455oxp\u04412, \u0455ehaxop2, i, this.\u0445sj\u0455c\u0456\u04bb);
            n15 = n10 + \u0455o\u0455si\u0441p.\u0456\u0455p\u0440\u04bb(\u043es\u0455oxp\u04412, \u0455ehaxop2, i, this.s\u043e\u0435\u043ea\u04bbi);
            if (n15 == 0) continue;
            double d2 = n12 * n12 + n13 * n13 + n14 * n14;
            double d3 = n15;
            double d4 = d2 / d3;
            n12 = n3 - n12;
            n13 = n4 - n13;
            n14 = n5 - n14;
            if ((n15 = n6 - n15) == 0 || !((d4 += (d2 = (double)(n12 * n12 + n13 * n13 + n14 * n14)) / (d3 = (double)n15)) > d)) continue;
            d = d4;
            n11 = i;
        }
        return new xi\u0441(n11, d);
    }

    static /* synthetic */ int \u0440\u0430eac\u0441(\u043es\u0455oxp\u0441 \u043es\u0455oxp\u04412, int[] nArray) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return nArray[\u0455o\u0455si\u0441p.\u04bbjoi\u0430(\u043es\u0455oxp\u04412.\u0455ccc, \u043es\u0455oxp\u04412.x\u0455cc\u04bb, \u043es\u0455oxp\u04412.\u0458\u0435\u0445)] - nArray[\u0455o\u0455si\u0441p.\u04bbjoi\u0430(\u043es\u0455oxp\u04412.\u0455ccc, \u043es\u0455oxp\u04412.x\u0455cc\u04bb, \u043es\u0455oxp\u04412.\u0430h\u0435\u0458)] - nArray[\u0455o\u0455si\u0441p.\u04bbjoi\u0430(\u043es\u0455oxp\u04412.\u0455ccc, \u043es\u0455oxp\u04412.po\u0456c, \u043es\u0455oxp\u04412.\u0458\u0435\u0445)] + nArray[\u0455o\u0455si\u0441p.\u04bbjoi\u0430(\u043es\u0455oxp\u04412.\u0455ccc, \u043es\u0455oxp\u04412.po\u0456c, \u043es\u0455oxp\u04412.\u0430h\u0435\u0458)] - nArray[\u0455o\u0455si\u0441p.\u04bbjoi\u0430(\u043es\u0455oxp\u04412.\u0445\u04bb\u0441\u0435\u0430, \u043es\u0455oxp\u04412.x\u0455cc\u04bb, \u043es\u0455oxp\u04412.\u0458\u0435\u0445)] + nArray[\u0455o\u0455si\u0441p.\u04bbjoi\u0430(\u043es\u0455oxp\u04412.\u0445\u04bb\u0441\u0435\u0430, \u043es\u0455oxp\u04412.x\u0455cc\u04bb, \u043es\u0455oxp\u04412.\u0430h\u0435\u0458)] + nArray[\u0455o\u0455si\u0441p.\u04bbjoi\u0430(\u043es\u0455oxp\u04412.\u0445\u04bb\u0441\u0435\u0430, \u043es\u0455oxp\u04412.po\u0456c, \u043es\u0455oxp\u04412.\u0458\u0435\u0445)] - nArray[\u0455o\u0455si\u0441p.\u04bbjoi\u0430(\u043es\u0455oxp\u04412.\u0445\u04bb\u0441\u0435\u0430, \u043es\u0455oxp\u04412.po\u0456c, \u043es\u0455oxp\u04412.\u0430h\u0435\u0458)];
    }

    static /* synthetic */ int \u043e\u04bbeip(\u043es\u0455oxp\u0441 \u043es\u0455oxp\u04412, \u0455ehaxop \u0455ehaxop2, int[] nArray) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return switch (\u0455ehaxop2.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> -nArray[\u0455o\u0455si\u0441p.\u04bbjoi\u0430(\u043es\u0455oxp\u04412.\u0445\u04bb\u0441\u0435\u0430, \u043es\u0455oxp\u04412.x\u0455cc\u04bb, \u043es\u0455oxp\u04412.\u0458\u0435\u0445)] + nArray[\u0455o\u0455si\u0441p.\u04bbjoi\u0430(\u043es\u0455oxp\u04412.\u0445\u04bb\u0441\u0435\u0430, \u043es\u0455oxp\u04412.x\u0455cc\u04bb, \u043es\u0455oxp\u04412.\u0430h\u0435\u0458)] + nArray[\u0455o\u0455si\u0441p.\u04bbjoi\u0430(\u043es\u0455oxp\u04412.\u0445\u04bb\u0441\u0435\u0430, \u043es\u0455oxp\u04412.po\u0456c, \u043es\u0455oxp\u04412.\u0458\u0435\u0445)] - nArray[\u0455o\u0455si\u0441p.\u04bbjoi\u0430(\u043es\u0455oxp\u04412.\u0445\u04bb\u0441\u0435\u0430, \u043es\u0455oxp\u04412.po\u0456c, \u043es\u0455oxp\u04412.\u0430h\u0435\u0458)];
            case 1 -> -nArray[\u0455o\u0455si\u0441p.\u04bbjoi\u0430(\u043es\u0455oxp\u04412.\u0455ccc, \u043es\u0455oxp\u04412.po\u0456c, \u043es\u0455oxp\u04412.\u0458\u0435\u0445)] + nArray[\u0455o\u0455si\u0441p.\u04bbjoi\u0430(\u043es\u0455oxp\u04412.\u0455ccc, \u043es\u0455oxp\u04412.po\u0456c, \u043es\u0455oxp\u04412.\u0430h\u0435\u0458)] + nArray[\u0455o\u0455si\u0441p.\u04bbjoi\u0430(\u043es\u0455oxp\u04412.\u0445\u04bb\u0441\u0435\u0430, \u043es\u0455oxp\u04412.po\u0456c, \u043es\u0455oxp\u04412.\u0458\u0435\u0445)] - nArray[\u0455o\u0455si\u0441p.\u04bbjoi\u0430(\u043es\u0455oxp\u04412.\u0445\u04bb\u0441\u0435\u0430, \u043es\u0455oxp\u04412.po\u0456c, \u043es\u0455oxp\u04412.\u0430h\u0435\u0458)];
            case 2 -> -nArray[\u0455o\u0455si\u0441p.\u04bbjoi\u0430(\u043es\u0455oxp\u04412.\u0455ccc, \u043es\u0455oxp\u04412.x\u0455cc\u04bb, \u043es\u0455oxp\u04412.\u0430h\u0435\u0458)] + nArray[\u0455o\u0455si\u0441p.\u04bbjoi\u0430(\u043es\u0455oxp\u04412.\u0455ccc, \u043es\u0455oxp\u04412.po\u0456c, \u043es\u0455oxp\u04412.\u0430h\u0435\u0458)] + nArray[\u0455o\u0455si\u0441p.\u04bbjoi\u0430(\u043es\u0455oxp\u04412.\u0445\u04bb\u0441\u0435\u0430, \u043es\u0455oxp\u04412.x\u0455cc\u04bb, \u043es\u0455oxp\u04412.\u0430h\u0435\u0458)] - nArray[\u0455o\u0455si\u0441p.\u04bbjoi\u0430(\u043es\u0455oxp\u04412.\u0445\u04bb\u0441\u0435\u0430, \u043es\u0455oxp\u04412.po\u0456c, \u043es\u0455oxp\u04412.\u0430h\u0435\u0458)];
        };
    }

    static /* synthetic */ int \u0456\u0455p\u0440\u04bb(\u043es\u0455oxp\u0441 \u043es\u0455oxp\u04412, \u0455ehaxop \u0455ehaxop2, int n, int[] nArray) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return switch (\u0455ehaxop2.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> nArray[\u0455o\u0455si\u0441p.\u04bbjoi\u0430(n, \u043es\u0455oxp\u04412.x\u0455cc\u04bb, \u043es\u0455oxp\u04412.\u0458\u0435\u0445)] - nArray[\u0455o\u0455si\u0441p.\u04bbjoi\u0430(n, \u043es\u0455oxp\u04412.x\u0455cc\u04bb, \u043es\u0455oxp\u04412.\u0430h\u0435\u0458)] - nArray[\u0455o\u0455si\u0441p.\u04bbjoi\u0430(n, \u043es\u0455oxp\u04412.po\u0456c, \u043es\u0455oxp\u04412.\u0458\u0435\u0445)] + nArray[\u0455o\u0455si\u0441p.\u04bbjoi\u0430(n, \u043es\u0455oxp\u04412.po\u0456c, \u043es\u0455oxp\u04412.\u0430h\u0435\u0458)];
            case 1 -> nArray[\u0455o\u0455si\u0441p.\u04bbjoi\u0430(\u043es\u0455oxp\u04412.\u0455ccc, n, \u043es\u0455oxp\u04412.\u0458\u0435\u0445)] - nArray[\u0455o\u0455si\u0441p.\u04bbjoi\u0430(\u043es\u0455oxp\u04412.\u0455ccc, n, \u043es\u0455oxp\u04412.\u0430h\u0435\u0458)] - nArray[\u0455o\u0455si\u0441p.\u04bbjoi\u0430(\u043es\u0455oxp\u04412.\u0445\u04bb\u0441\u0435\u0430, n, \u043es\u0455oxp\u04412.\u0458\u0435\u0445)] + nArray[\u0455o\u0455si\u0441p.\u04bbjoi\u0430(\u043es\u0455oxp\u04412.\u0445\u04bb\u0441\u0435\u0430, n, \u043es\u0455oxp\u04412.\u0430h\u0435\u0458)];
            case 2 -> nArray[\u0455o\u0455si\u0441p.\u04bbjoi\u0430(\u043es\u0455oxp\u04412.\u0455ccc, \u043es\u0455oxp\u04412.x\u0455cc\u04bb, n)] - nArray[\u0455o\u0455si\u0441p.\u04bbjoi\u0430(\u043es\u0455oxp\u04412.\u0455ccc, \u043es\u0455oxp\u04412.po\u0456c, n)] - nArray[\u0455o\u0455si\u0441p.\u04bbjoi\u0430(\u043es\u0455oxp\u04412.\u0445\u04bb\u0441\u0435\u0430, \u043es\u0455oxp\u04412.x\u0455cc\u04bb, n)] + nArray[\u0455o\u0455si\u0441p.\u04bbjoi\u0430(\u043es\u0455oxp\u04412.\u0445\u04bb\u0441\u0435\u0430, \u043es\u0455oxp\u04412.po\u0456c, n)];
        };
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

