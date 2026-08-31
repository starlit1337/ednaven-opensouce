/*
 * Decompiled with CFR 0.152.
 */
package o\u0455sio\u0440;

import cop\u04bb\u04bbj.xca\u0430\u043e;
import cop\u04bb\u04bbj.\u0435a\u0440\u0435j\u0458e;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import o\u0455sio\u0440.h\u0440\u0441h\u0456\u043e\u0458;
import o\u0455sio\u0440.o\u0440\u0456;
import o\u0455sio\u0440.\u0445\u0458\u0458h\u0445\u0430a;
import r.d8.Cade0e18b60fd9f037d8b2fc8;
import \u043e\u0445\u0440\u0430ose.c\u04bb\u04bbx\u0445j;

public final class ia\u0430 {
    private static final /* synthetic */ Logger \u0455\u0445\u0455p\u043e;
    private final /* synthetic */ Map<Class<? extends \u0435a\u0440\u0435j\u0458e>, List<o\u0440\u0456>> j\u0435\u04bbieac;

    public ia\u0430() {
        if (2 * 2 * 2 >= 0) {
        }
        this.j\u0435\u04bbieac = new HashMap<Class<? extends \u0435a\u0440\u0435j\u0458e>, List<o\u0440\u0456>>();
    }

    public /* synthetic */ void \u0441\u0430\u0456(Object object) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        for (Method method : object.getClass().getDeclaredMethods()) {
            if (this.op\u0440\u0445(method)) continue;
            this.j\u0435e\u0430(method, object);
        }
    }

    public /* synthetic */ void iox\u0445(Object object, Class<? extends \u0435a\u0440\u0435j\u0458e> clazz) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        block4: for (Method method : object.getClass().getDeclaredMethods()) {
            if (!this.\u0435s\u0441\u0458(method, clazz)) {
                this.j\u0435e\u0430(method, object);
            }
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

    public /* synthetic */ void \u0455j\u043e\u0440o(Object object) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        block4: for (List<o\u0440\u0456> list : this.j\u0435\u04bbieac.values()) {
            for (o\u0440\u0456 o\u0440\u04562 : list) {
                if (!o\u0440\u04562.\u04bbpa\u04bb().equals(object)) continue;
                list.remove(o\u0440\u04562);
            }
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
        this.sshh\u04bbe(true);
    }

    public /* synthetic */ void \u0458o\u0441(Object object, Class<? extends \u0435a\u0440\u0435j\u0458e> clazz) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        if (this.j\u0435\u04bbieac.containsKey(clazz)) {
            for (o\u0440\u0456 o\u0440\u04562 : this.j\u0435\u04bbieac.get(clazz)) {
                if (!o\u0440\u04562.\u04bbpa\u04bb().equals(object)) continue;
                this.j\u0435\u04bbieac.get(clazz).remove(o\u0440\u04562);
            }
            this.sshh\u04bbe(true);
        }
    }

    private /* synthetic */ void j\u0435e\u0430(Method method, Object object) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        Class<?> clazz = method.getParameterTypes()[0];
        o\u0440\u0456 o\u0440\u04562 = new o\u0440\u0456(object, method, method.getAnnotation(\u0445\u0458\u0458h\u0445\u0430a.class).\u0435o\u0435x\u0445s());
        if (!o\u0440\u04562.\u0458s\u0430().isAccessible()) {
            o\u0440\u04562.\u0458s\u0430().setAccessible(true);
        }
        if (this.j\u0435\u04bbieac.containsKey(clazz)) {
            if (!this.j\u0435\u04bbieac.get(clazz).contains(o\u0440\u04562)) {
                this.j\u0435\u04bbieac.get(clazz).add(o\u0440\u04562);
                this.a\u043e\u0455i\u0456(clazz);
            }
        } else {
            this.j\u0435\u04bbieac.put(clazz, new h\u0440\u0441h\u0456\u043e\u0458(this, o\u0440\u04562));
        }
    }

    public /* synthetic */ void j\u0456h\u04bbo\u0440(Class<? extends \u0435a\u0440\u0435j\u0458e> clazz) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        Iterator<Map.Entry<Class<? extends \u0435a\u0440\u0435j\u0458e>, List<o\u0440\u0456>>> iterator = this.j\u0435\u04bbieac.entrySet().iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().getKey().equals(clazz)) continue;
            iterator.remove();
            break;
        }
    }

    public /* synthetic */ void sshh\u04bbe(boolean bl) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        Iterator<Map.Entry<Class<? extends \u0435a\u0440\u0435j\u0458e>, List<o\u0440\u0456>>> iterator = this.j\u0435\u04bbieac.entrySet().iterator();
        while (iterator.hasNext()) {
            if (bl && !iterator.next().getValue().isEmpty()) continue;
            iterator.remove();
        }
    }

    private /* synthetic */ void a\u043e\u0455i\u0456(Class<? extends \u0435a\u0440\u0435j\u0458e> clazz) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        CopyOnWriteArrayList<o\u0440\u0456> copyOnWriteArrayList = new CopyOnWriteArrayList<o\u0440\u0456>();
        for (byte by : c\u04bb\u04bbx\u0445j.x\u0441eji) {
            block5: for (o\u0440\u0456 o\u0440\u04562 : this.j\u0435\u04bbieac.get(clazz)) {
                if (o\u0440\u04562.\u0441e\u0441\u0435x\u0456o() == by) {
                    copyOnWriteArrayList.add(o\u0440\u04562);
                }
                switch (0) {
                    default: {
                        continue block5;
                    }
                    case 1: {
                        continue block5;
                    }
                    case 2: 
                }
            }
        }
        this.j\u0435\u04bbieac.put(clazz, copyOnWriteArrayList);
    }

    private /* synthetic */ boolean op\u0440\u0445(Method method) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return method.getParameterTypes().length != 1 || !method.isAnnotationPresent(\u0445\u0458\u0458h\u0445\u0430a.class);
    }

    private /* synthetic */ boolean \u0435s\u0441\u0458(Method method, Class<? extends \u0435a\u0440\u0435j\u0458e> clazz) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return this.op\u0440\u0445(method) || !method.getParameterTypes()[0].equals(clazz);
    }

    public /* synthetic */ \u0435a\u0440\u0435j\u0458e \u0435ecjj\u0458(\u0435a\u0440\u0435j\u0458e \u0435a\u0440\u0435j\u0458e2) {
        block6: {
            List<o\u0440\u0456> list;
            if (2 * 2 * 2 >= 0) {
            }
            if (0 != 0) {
            }
            if ((list = this.j\u0435\u04bbieac.get(\u0435a\u0440\u0435j\u0458e2.getClass())) == null) break block6;
            if (\u0435a\u0440\u0435j\u0458e2 instanceof xca\u0430\u043e) {
                xca\u0430\u043e xca\u0430\u043e2 = (xca\u0430\u043e)\u0435a\u0440\u0435j\u0458e2;
                for (o\u0440\u0456 o\u0440\u04562 : list) {
                    this.s\u0435s(o\u0440\u04562, \u0435a\u0440\u0435j\u0458e2);
                    if (!xca\u0430\u043e2.h\u0440h\u0440\u0445()) continue;
                    break;
                }
            } else {
                for (o\u0440\u0456 o\u0440\u04563 : list) {
                    this.s\u0435s(o\u0440\u04563, \u0435a\u0440\u0435j\u0458e2);
                }
            }
        }
        return \u0435a\u0440\u0435j\u0458e2;
    }

    public /* synthetic */ boolean i\u0456\u0456\u0430j(Class<? extends \u0435a\u0440\u0435j\u0458e> clazz) {
        List<o\u0440\u0456> list;
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return (list = this.j\u0435\u04bbieac.get(clazz)) != null && !list.isEmpty();
    }

    private /* synthetic */ void s\u0435s(o\u0440\u0456 o\u0440\u04562, \u0435a\u0440\u0435j\u0458e \u0435a\u0440\u0435j\u0458e2) {
        try {
            if (2 * 2 * 2 >= 0) {
            }
            if (0 != 0) {
            }
            o\u0440\u04562.\u0458s\u0430().invoke(o\u0440\u04562.\u04bbpa\u04bb(), \u0435a\u0440\u0435j\u0458e2);
        }
        catch (InvocationTargetException invocationTargetException) {
            byte[] byArray = new byte[-1168608572 + 1168608592];
            byArray[0] = -1191609718 + 1191609732;
            byArray[1] = -1905468928 + 1905468973;
            byArray[2] = -1139265776 + 1139265667;
            byArray[3] = -1829952296 + 1829952224;
            byArray[4] = -1849532236 + 1849532143;
            byArray[5] = -873277658 + 873277785;
            byArray[-393401675 + 393401681] = -478026321 + 478026331;
            byArray[-882123513 + 882123520] = -2066257532 + 2066257655;
            byArray[-1258041738 + 1258041746] = -588735422 + 588735306;
            byArray[-1621330442 + 1621330451] = -1097677740 + 1097677827;
            byArray[-983539696 + 983539706] = -1429626928 + 1429627000;
            byArray[-1088560008 + 1088560019] = -230476825 + 230476807;
            byArray[-1438404612 + 1438404624] = -1249890342 + 1249890256;
            byArray[-1711107365 + 1711107378] = -799090918 + 799090889;
            byArray[-348870897 + 348870911] = -864935479 + 864935524;
            byArray[-1812683699 + 1812683714] = -1571959593 + 1571959588;
            byArray[-32394985 + 32395001] = -1117454894 + 1117454986;
            byArray[-513505186 + 513505203] = -82745129 + 82745076;
            byArray[-672236854 + 672236872] = -1369773556 + 1369773601;
            byArray[-806911766 + 806911785] = -216540093 + 216540203;
            \u0455\u0445\u0455p\u043e.error(Cade0e18b60fd9f037d8b2fc8.cachedDecodeString(byArray, -1870687241 + 711730931, -1761794333 + 584618737), o\u0440\u04562.shch\u0456\u0456\u043e, (Object)o\u0440\u04562.\u0435\u043e\u0456);
            invocationTargetException.getTargetException().printStackTrace();
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
        }
        catch (Exception exception) {
            byte[] byArray = new byte[-638132133 + 638132153];
            byArray[0] = -14378661 + 14378753;
            byArray[1] = 0;
            byArray[2] = -543223693 + 543223817;
            byArray[3] = -1643115360 + 1643115312;
            byArray[4] = -1396234809 + 1396234689;
            byArray[5] = -1918062849 + 1918062920;
            byArray[-1390735751 + 1390735757] = -615602120 + 615602209;
            byArray[-172326746 + 172326753] = -2046092955 + 2046093021;
            byArray[-1698589174 + 1698589182] = -99924302 + 99924183;
            byArray[-68905233 + 68905242] = -2073821010 + 2073820986;
            byArray[-969170039 + 969170049] = -1941895970 + 1941895960;
            byArray[-1714559478 + 1714559489] = -2066828896 + 2066828841;
            byArray[-1021849761 + 1021849773] = -1109555193 + 1109555292;
            byArray[-1568451986 + 1568451999] = -1756562815 + 1756562835;
            byArray[-1339901157 + 1339901171] = -131830065 + 131830005;
            byArray[-1486686553 + 1486686568] = -1324122826 + 1324122743;
            byArray[-2101804440 + 2101804456] = -1999113948 + 1999114056;
            byArray[-463367109 + 463367126] = -1315870485 + 1315870454;
            byArray[-1276410527 + 1276410545] = -1866612061 + 1866612025;
            byArray[-2028704527 + 2028704546] = -77669178 + 77669258;
            \u0455\u0445\u0455p\u043e.error(Cade0e18b60fd9f037d8b2fc8.cachedDecodeString(byArray, -1594496283 + 129613258, -1673856022 + 223653285), o\u0440\u04562.shch\u0456\u0456\u043e, (Object)o\u0440\u04562.\u0435\u043e\u0456);
            exception.printStackTrace();
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
    }

    static {
        \u0455\u0445\u0455p\u043e = LogManager.getLogger(ia\u0430.class);
    }
}

