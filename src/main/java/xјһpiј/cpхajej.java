/*
 * Decompiled with CFR 0.152.
 */
package x\u0458\u04bbpi\u0458;

import hh\u04bb\u0445\u043e\u0430.e\u0458c;
import hh\u04bb\u0445\u043e\u0430.\u043e\u0455\u0456;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import \u0435\u0435oj\u0455\u0435.xe\u0441e;
import \u04bb\u04bb\u0456\u0445.\u0435\u043ea\u0440\u0458;

public class cp\u0445ajej {
    public cp\u0445ajej() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
    }

    public static /* synthetic */ \u0435\u043ea\u0440\u0458 hi\u0440(BufferedImage bufferedImage) {
        int n;
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        int[] nArray = cp\u0445ajej.\u0440\u0456\u0456\u0440aje(bufferedImage);
        CallSite callSite = cp\u0445ajej.a_bsm0("xej\u0458\u0440", xej\u0458\u0440(int[] int ), (int[])nArray, (int)(-839190899 + 839191027));
        ArrayList arrayList = new ArrayList(callSite.entrySet());
        arrayList.sort((entry, entry2) -> {
            if (true | false) {
            }
            return (Integer)entry2.getValue() - (Integer)entry.getValue();
        });
        boolean bl = true;
        for (int i = 0; i < cp\u0445ajej.a_bsm1("min", min(int int ), (int)5, (int)arrayList.size()); ++i) {
            int n2;
            int n3;
            n = (Integer)((Map.Entry)arrayList.get(i)).getKey();
            int n4 = n >> -1572466133 + 1572466149 & -1198395187 + 1198395442;
            if (cp\u0445ajej.a_bsm2("max", max(int int ), (int)n4, (int)cp\u0445ajej.a_bsm2("max", max(int int ), (int)(n3 = n >> -622968173 + 622968181 & -1955375956 + 1955376211), (int)(n2 = n & -798272958 + 798273213))) - cp\u0445ajej.a_bsm1("min", min(int int ), (int)n4, (int)cp\u0445ajej.a_bsm1("min", min(int int ), (int)n3, (int)n2)) < 5) continue;
            bl = false;
            break;
        }
        if (bl) {
            return null;
        }
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<Integer, Integer>();
        for (n = 0; n < cp\u0445ajej.a_bsm1("min", min(int int ), (int)(-1747732204 + 1747732254), (int)arrayList.size()); ++n) {
            linkedHashMap.put((Integer)((Map.Entry)arrayList.get(n)).getKey(), (Integer)((Map.Entry)arrayList.get(n)).getValue());
        }
        n = (Integer)cp\u0445ajej.a_bsm3("j\u0440oc\u0441\u0430p", j\u0440oc\u0441\u0430p(java.util.Map<java.lang.Integer, java.lang.Integer> ), linkedHashMap).get(0);
        return cp\u0445ajej.a_bsm4("h\u043ec\u0430\u043eo", h\u043ec\u0430\u043eo(int ), (int)n);
    }

    public static /* synthetic */ Color s\u043ejcch(BufferedImage bufferedImage) {
        \u0435\u043ea\u0440\u0458 \u0435\u043ea\u0440\u04582;
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if ((\u0435\u043ea\u0440\u04582 = cp\u0445ajej.hi\u0440(bufferedImage)) == null) {
            return new xe\u0441e(new e\u0458c((\u0435\u043ea\u0440\u0458)((Object)cp\u0445ajej.a_bsm5("\u043e\u0455\u043e", \u043e\u0455\u043e(double double double ), (double)100.0, (double)26.0, (double)6.0)), true, 0.0)).aj\u0445\u043e();
        }
        xe\u0441e xe\u0441e2 = new xe\u0441e(new \u043e\u0455\u0456(\u0435\u043ea\u0440\u04582, true, 0.0));
        return xe\u0441e2.aj\u0445\u043e();
    }

    private static /* synthetic */ int[] \u0440\u0456\u0456\u0440aje(BufferedImage bufferedImage) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        BufferedImage bufferedImage2 = new BufferedImage(-1430863026 + 1430863076, -885336480 + 885336530, 2);
        Graphics2D graphics2D = bufferedImage2.createGraphics();
        graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        graphics2D.drawImage(bufferedImage, 0, 0, -508372223 + 508372273, -94904339 + 94904389, null);
        graphics2D.dispose();
        return bufferedImage2.getRGB(0, 0, -1764078014 + 1764078064, -1788053960 + 1788054010, null, 0, -1086144255 + 1086144305);
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

