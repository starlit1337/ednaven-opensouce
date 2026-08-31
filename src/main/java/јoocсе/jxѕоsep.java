/*
 * Decompiled with CFR 0.152.
 */
package \u0458ooc\u0441\u0435;

import io.github.humbleui.skija.ColorType;
import io.github.humbleui.skija.DirectContext;
import io.github.humbleui.skija.Image;
import io.github.humbleui.skija.SurfaceOrigin;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import net.minecraft.class_2960;
import net.minecraft.class_3298;
import net.minecraft.class_3300;

public class jx\u0455\u043esep {
    private /* synthetic */ Map<String, Image> oae\u04bb\u0430;
    private /* synthetic */ Map<Integer, Image> \u043ehh;

    public jx\u0455\u043esep() {
        if (true | false) {
        }
        this.oae\u04bb\u0430 = new HashMap<String, Image>();
        this.\u043ehh = new HashMap<Integer, Image>();
    }

    public /* synthetic */ boolean \u0441s\u0441c\u0456(int n, float f, float f2, SurfaceOrigin surfaceOrigin) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        if (!this.\u043ehh.containsKey(jx\u0455\u043esep.a_bsm0("valueOf", valueOf(int ), (int)n))) {
            CallSite callSite = jx\u0455\u043esep.a_bsm2("adoptGLTextureFrom", adoptGLTextureFrom(io.github.humbleui.skija.DirectContext int int int int int io.github.humbleui.skija.SurfaceOrigin io.github.humbleui.skija.ColorType ), (DirectContext)jx\u0455\u043esep.a_bsm1("\u0430\u0458\u0458e\u0430\u0430j", \u0430\u0458\u0458e\u0430\u0430j()), (int)n, (int)(-983941908 + 983945461), (int)((int)f), (int)((int)f2), (int)(-1789675764 + 1789708620), (SurfaceOrigin)surfaceOrigin, (ColorType)ColorType.RGBA_8888);
            this.\u043ehh.put((Integer)((Object)jx\u0455\u043esep.a_bsm0("valueOf", valueOf(int ), (int)n)), (Image)callSite);
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public /* synthetic */ boolean hoe\u04bbox(class_2960 class_29602) {
        if (true | false) {
        }
        if (this.oae\u04bb\u0430.containsKey(class_29602.method_12832())) return true;
        class_3300 class_33002 = jx\u0455\u043esep.a_bsm3("method_1551", method_1551()).method_1478();
        try {
            class_3298 class_32982 = class_33002.getResourceOrThrow(class_29602);
            try (InputStream inputStream = class_32982.method_14482();){
                byte[] byArray = inputStream.readAllBytes();
                CallSite callSite = jx\u0455\u043esep.a_bsm4("makeDeferredFromEncodedBytes", makeDeferredFromEncodedBytes(byte[] ), (byte[])byArray);
                if (callSite == null) {
                    boolean bl = false;
                    return bl;
                }
                this.oae\u04bb\u0430.put(class_29602.method_12832(), (Image)callSite);
                boolean bl = true;
                return bl;
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
                return true;
            }
        }
        catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        return true;
    }

    public /* synthetic */ boolean jx\u04bbs\u0456\u043ex(String string) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (!this.oae\u04bb\u0430.containsKey(string)) {
            CallSite callSite = jx\u0455\u043esep.a_bsm5("xe\u0430\u043e\u0440", xe\u0430\u043e\u0440(java.lang.String ), (String)string);
            if (((Optional)((Object)callSite)).isPresent()) {
                this.oae\u04bb\u0430.put(string, (Image)jx\u0455\u043esep.a_bsm4("makeDeferredFromEncodedBytes", makeDeferredFromEncodedBytes(byte[] ), (byte[])((byte[])((Optional)((Object)callSite)).get())));
                return true;
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ boolean ae\u0441\u0435\u0435(File file) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if (!this.oae\u04bb\u0430.containsKey(file.getName())) {
            try {
                CallSite callSite = jx\u0455\u043esep.a_bsm6("toByteArray", toByteArray(java.io.InputStream ), (InputStream)new FileInputStream(file));
                this.oae\u04bb\u0430.put(file.getName(), (Image)jx\u0455\u043esep.a_bsm4("makeDeferredFromEncodedBytes", makeDeferredFromEncodedBytes(byte[] ), (byte[])callSite));
                return true;
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
                return false;
            }
        }
        return true;
    }

    public /* synthetic */ Image \u0430\u0455c\u04bb\u0445\u0441(String string) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (this.oae\u04bb\u0430.containsKey(string)) {
            return this.oae\u04bb\u0430.get(string);
        }
        return null;
    }

    public /* synthetic */ Image xeopp(int n) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if (this.\u043ehh.containsKey(jx\u0455\u043esep.a_bsm0("valueOf", valueOf(int ), (int)n))) {
            return this.\u043ehh.get(jx\u0455\u043esep.a_bsm0("valueOf", valueOf(int ), (int)n));
        }
        return null;
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

