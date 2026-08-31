/*
 * Decompiled with CFR 0.152.
 */
package ie\u0441\u0430ej;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import net.minecraft.class_1297;
import net.minecraft.class_1657;

public class i\u0456\u0441o {
    private static final /* synthetic */ List<String> p\u043e\u0440\u0456;

    public i\u0456\u0441o() {
        if (true | false) {
        }
    }

    public static /* synthetic */ boolean i\u0440\u04bbeco(class_1297 class_12972) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return class_12972 instanceof class_1657 && i\u0456\u0441o.phis\u0441i(class_12972.method_5477().getString());
    }

    public static /* synthetic */ boolean phis\u0441i(String string) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return p\u043e\u0440\u0456.stream().anyMatch(string2 -> {
            if ((3 * 3 + 3) % 2 == 0) {
            }
            return string2.equalsIgnoreCase(string);
        });
    }

    public static /* synthetic */ void o\u0441jx\u0445\u0458(class_1657 class_16572) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        i\u0456\u0441o.\u043e\u0441\u0430\u043e(class_16572.method_5477().getString());
    }

    public static /* synthetic */ void \u043e\u0441\u0430\u043e(String string) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if (!string.isBlank() && !i\u0456\u0441o.phis\u0441i(string)) {
            p\u043e\u0440\u0456.add(string);
        }
    }

    public static /* synthetic */ void \u0435p\u0440x\u0456(class_1657 class_16572) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        i\u0456\u0441o.j\u0430ca\u0458(class_16572.method_5477().getString());
    }

    public static /* synthetic */ void j\u0430ca\u0458(String string) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        p\u043e\u0440\u0456.removeIf(string2 -> {
            if (2 * 2 * 2 >= 0) {
            }
            return string2.equalsIgnoreCase(string);
        });
    }

    public static /* synthetic */ boolean \u0435\u0456s\u0441\u0435\u0455(String string) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if (i\u0456\u0441o.phis\u0441i(string)) {
            i\u0456\u0441o.j\u0430ca\u0458(string);
            return false;
        }
        i\u0456\u0441o.\u043e\u0441\u0430\u043e(string);
        return true;
    }

    public static /* synthetic */ List<String> sasc() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return p\u043e\u0440\u0456;
    }

    static {
        p\u043e\u0440\u0456 = new CopyOnWriteArrayList<String>();
    }
}

