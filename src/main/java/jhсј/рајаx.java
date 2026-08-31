/*
 * Decompiled with CFR 0.152.
 */
package jh\u0441\u0458;

import io.github.humbleui.skija.Image;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.ref.SoftReference;
import java.util.Base64;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import jh\u0441\u0458.csac\u0441;
import jh\u0441\u0458.hjc\u0456;
import jh\u0441\u0458.hse\u0435\u0441e;
import jh\u0441\u0458.\u0455\u043eio;

public class \u0440\u0430\u0458\u0430x {
    private static final /* synthetic */ int \u0435\u0440\u0430xi\u0456 = 50;
    private static final /* synthetic */ long e\u0430\u043ep = 0x10000000L;
    private static final /* synthetic */ long \u0455i\u0458osse = 300000L;
    private static final /* synthetic */ Base64.Decoder \u04bbce\u0430\u0430;
    private static final /* synthetic */ LinkedHashMap<String, SoftReference<byte[]>> i\u04bb\u0445j;
    private static final /* synthetic */ LinkedHashMap<String, hse\u0435\u0441e> \u04bb\u0441\u0430\u0456\u0430o;
    private static /* synthetic */ long \u0456\u0458\u043ej\u0441\u0458j;
    private static final /* synthetic */ LinkedHashMap<String, BufferedImage> \u0455\u0445\u0440\u0458\u0455\u0435p;

    public \u0440\u0430\u0458\u0430x() {
        if (true | false) {
        }
    }

    public static synchronized /* synthetic */ BufferedImage ep\u043ea\u0456(String string) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        if (string == null || string.isEmpty()) {
            return null;
        }
        String string2 = \u0440\u0430\u0458\u0430x.s\u0441xx\u0441\u0456\u0455(string);
        BufferedImage bufferedImage = \u0455\u0445\u0440\u0458\u0455\u0435p.get(string2);
        if (bufferedImage != null) {
            return bufferedImage;
        }
        byte[] byArray = \u0440\u0430\u0458\u0430x.\u043e\u0435\u0430piai(string, string2);
        if (byArray == null) {
            return null;
        }
        try {
            CallSite callSite = \u0440\u0430\u0458\u0430x.a_bsm0("read", read(java.io.InputStream ), (InputStream)new ByteArrayInputStream(byArray));
            if (callSite == null) {
                return null;
            }
            \u0455\u0445\u0440\u0458\u0455\u0435p.put(string2, (BufferedImage)((Object)callSite));
            return callSite;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    public static synchronized /* synthetic */ BufferedImage ceppi\u04bb(String string, int n) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (string == null || string.isEmpty()) {
            return null;
        }
        int n2 = n;
        String string2 = \u0440\u0430\u0458\u0430x.s\u0441xx\u0441\u0456\u0455(string);
        String string3 = string2 + (String)((Object)\u0440\u0430\u0458\u0430x.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1173950817 + 1173950897}, (int)(1383077139 + 2109979424), (int)(672675566 + 712186781))) + n2;
        BufferedImage bufferedImage = \u0455\u0445\u0440\u0458\u0455\u0435p.get(string3);
        if (bufferedImage != null) {
            return bufferedImage;
        }
        BufferedImage bufferedImage2 = \u0440\u0430\u0458\u0430x.ep\u043ea\u0456(string);
        if (bufferedImage2 == null) {
            return null;
        }
        int n3 = bufferedImage2.getWidth();
        int n4 = bufferedImage2.getHeight();
        CallSite callSite = \u0440\u0430\u0458\u0430x.a_bsm2("min", min(float float ), (float)((float)n / (float)n3), (float)((float)n / (float)n4));
        CallSite callSite2 = \u0440\u0430\u0458\u0430x.a_bsm3("max", max(int int ), (int)1, (int)((int)((float)n3 * callSite)));
        CallSite callSite3 = \u0440\u0430\u0458\u0430x.a_bsm3("max", max(int int ), (int)1, (int)((int)((float)n4 * callSite)));
        BufferedImage bufferedImage3 = new BufferedImage((int)callSite2, (int)callSite3, 2);
        Graphics2D graphics2D = bufferedImage3.createGraphics();
        graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        graphics2D.drawImage(bufferedImage2, 0, 0, (int)callSite2, (int)callSite3, null);
        graphics2D.dispose();
        \u0455\u0445\u0440\u0458\u0455\u0435p.put(string3, bufferedImage3);
        return bufferedImage3;
    }

    public static synchronized /* synthetic */ Image s\u04bb\u0455\u043e(String string) {
        byte[] byArray;
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        if (string == null || string.isEmpty()) {
            return null;
        }
        String string2 = \u0440\u0430\u0458\u0430x.s\u0441xx\u0441\u0456\u0455(string);
        hse\u0435\u0441e hse\u0435\u0441e2 = \u04bb\u0441\u0430\u0456\u0430o.get(string2);
        if (hse\u0435\u0441e2 != null) {
            CallSite callSite = \u0440\u0430\u0458\u0430x.a_bsm4("currentTimeMillis", currentTimeMillis());
            if (callSite - hse\u0435\u0441e2.\u0455xi\u0441\u0445j < 300000L) {
                hse\u0435\u0441e2.\u0455xi\u0441\u0445j = (long)callSite;
                return hse\u0435\u0441e2.\u0440\u0458hpa\u0458;
            }
            \u04bb\u0441\u0430\u0456\u0430o.remove(string2);
            \u0456\u0458\u043ej\u0441\u0458j -= hse\u0435\u0441e2.\u0441io;
            \u0440\u0430\u0458\u0430x.\u0455sip(hse\u0435\u0441e2);
        }
        if ((byArray = \u0440\u0430\u0458\u0430x.\u043e\u0435\u0430piai(string, string2)) == null) {
            return null;
        }
        Image image = \u0440\u0430\u0458\u0430x.c\u0456eh(byArray);
        if (image == null) {
            return null;
        }
        long l2 = \u0440\u0430\u0458\u0430x.ap\u04bbe(image);
        \u0440\u0430\u0458\u0430x.p\u0455\u0455x\u0458(l2);
        \u04bb\u0441\u0430\u0456\u0430o.put(string2, new hse\u0435\u0441e(image, l2));
        \u0456\u0458\u043ej\u0441\u0458j += l2;
        return image;
    }

    public static synchronized /* synthetic */ void \u043ehso() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        \u04bb\u0441\u0430\u0456\u0430o.values().forEach(hse\u0435\u0441e2 -> {
            try {
                if (true | false) {
                }
                if (0 != 0) {
                }
                hse\u0435\u0441e2.\u0440\u0458hpa\u0458.close();
            }
            catch (Exception exception) {
                // empty catch block
            }
        });
        \u04bb\u0441\u0430\u0456\u0430o.clear();
        \u0456\u0458\u043ej\u0441\u0458j = 0L;
        \u0455\u0445\u0440\u0458\u0455\u0435p.clear();
        i\u04bb\u0445j.clear();
    }

    public static synchronized /* synthetic */ void \u04bb\u0435a\u0458\u0430s(String string) {
        String string2;
        hse\u0435\u0441e hse\u0435\u0441e2;
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        if ((hse\u0435\u0441e2 = (hse\u0435\u0441e)\u04bb\u0441\u0430\u0456\u0430o.remove(string2 = \u0440\u0430\u0458\u0430x.s\u0441xx\u0441\u0456\u0455(string))) != null) {
            \u0456\u0458\u043ej\u0441\u0458j -= hse\u0435\u0441e2.\u0441io;
            \u0440\u0430\u0458\u0430x.\u0455sip(hse\u0435\u0441e2);
        }
        \u0455\u0445\u0440\u0458\u0455\u0435p.remove(string2);
        i\u04bb\u0445j.remove(string2);
    }

    private static /* synthetic */ String s\u0441xx\u0441\u0456\u0455(String string) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        int n = string.length();
        CallSite callSite = \u0440\u0430\u0458\u0430x.a_bsm3("max", max(int int ), (int)0, (int)(n - (-635426139 + 635426171)));
        String string2 = string.substring((int)callSite);
        String string3 = string.substring(0, (int)\u0440\u0430\u0458\u0430x.a_bsm5("min", min(int int ), (int)(-340474110 + 340474142), (int)n));
        int n2 = n;
        return n2 + (String)((Object)\u0440\u0430\u0458\u0430x.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-287897790 + 287897686}, (int)(-724886638 + 717218808), (int)(793408850 + 566614973))) + string3 + string2;
    }

    private static /* synthetic */ byte[] \u043e\u0435\u0430piai(String string, String string2) {
        Object object;
        SoftReference<byte[]> softReference;
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if ((softReference = i\u04bb\u0445j.get(string2)) != null && (object = (Object)softReference.get()) != null) {
            return object;
        }
        try {
            object = string;
            int n = string.indexOf(-1067598047 + 1067598091);
            if (n != -1) {
                object = string.substring(n + 1);
            }
            byte[] byArray = \u04bbce\u0430\u0430.decode((String)object);
            i\u04bb\u0445j.put(string2, new SoftReference<byte[]>(byArray));
            return byArray;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    private static /* synthetic */ Image c\u0456eh(byte[] byArray) {
        try {
            if (true | false) {
            }
            if (0 != 0) {
            }
            return \u0440\u0430\u0458\u0430x.a_bsm6("makeFromEncoded", makeFromEncoded(byte[] ), (byte[])byArray);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    private static /* synthetic */ long ap\u04bbe(Image image) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return (long)image.getWidth() * (long)image.getHeight() * 4L;
    }

    private static /* synthetic */ void p\u0455\u0455x\u0458(long l2) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if (\u0456\u0458\u043ej\u0441\u0458j + l2 <= 0x10000000L) {
            return;
        }
        Iterator<Map.Entry<String, hse\u0435\u0441e>> iterator = \u04bb\u0441\u0430\u0456\u0430o.entrySet().iterator();
        while (iterator.hasNext() && \u0456\u0458\u043ej\u0441\u0458j + l2 > 0x10000000L) {
            Map.Entry<String, hse\u0435\u0441e> entry = iterator.next();
            \u0456\u0458\u043ej\u0441\u0458j -= entry.getValue().\u0441io;
            \u0440\u0430\u0458\u0430x.\u0455sip(entry.getValue());
            iterator.remove();
        }
    }

    static {
        \u04bbce\u0430\u0430 = Base64.getDecoder();
        i\u04bb\u0445j = new \u0455\u043eio(-571797237 + 571797253, 0.75f, true);
        \u04bb\u0441\u0430\u0456\u0430o = new hjc\u0456(-746146081 + 746146097, 0.75f, true);
        \u0456\u0458\u043ej\u0441\u0458j = 0L;
        \u0455\u0445\u0440\u0458\u0455\u0435p = new csac\u0441(-1354273448 + 1354273464, 0.75f, true);
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
}

