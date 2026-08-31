/*
 * Decompiled with CFR 0.152.
 */
package r.d8;

import java.nio.charset.StandardCharsets;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import r.d3.C1a946c5246ca0949bfd0e13d;

public final class Cade0e18b60fd9f037d8b2fc8 {
    private static final /* synthetic */ ConcurrentMap<String, String> CACHE;

    private Cade0e18b60fd9f037d8b2fc8() {
    }

    public static native /* synthetic */ byte[] m_121bf99412409b5c(byte[] var0, int var1, int var2);

    public static /* synthetic */ String cachedDecodeString(byte[] byArray, int n, int n2) {
        if (0 != 0) {
        }
        String string2 = n + ":" + n2 + ":" + new String(byArray, StandardCharsets.ISO_8859_1);
        return CACHE.computeIfAbsent(string2, string -> new String(Cade0e18b60fd9f037d8b2fc8.m_121bf99412409b5c(byArray, n, n2), StandardCharsets.UTF_8));
    }

    static {
        C1a946c5246ca0949bfd0e13d.m_4487bf5f5bb3efe5("decrypt", "auto", "vm-diverse");
        CACHE = new ConcurrentHashMap<String, String>();
    }
}

