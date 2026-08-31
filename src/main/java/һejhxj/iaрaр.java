/*
 * Decompiled with CFR 0.152.
 */
package \u04bbejhxj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import r.d3.C1a946c5246ca0949bfd0e13d;
import \u04bbejhxj.\u0440\u0455o\u0435;

public abstract class ia\u0440a\u0440 {
    private final /* synthetic */ String oexa\u0455i;
    private final /* synthetic */ File \u0435s\u0458i;

    public ia\u0440a\u0440(String string) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        this.oexa\u0455i = string;
        this.\u0435s\u0458i = new File(\u0440\u0455o\u0435.\u04bbx\u0458c\u0456xj, string);
    }

    public abstract /* synthetic */ void read(BufferedReader var1) throws IOException;

    public abstract /* synthetic */ void save(BufferedWriter var1) throws IOException;

    public /* synthetic */ String o\u04bb\u0458\u043e\u0458() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return this.oexa\u0455i;
    }

    public /* synthetic */ File jp\u0456scjx() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return this.\u0435s\u0458i;
    }

    static {
        C1a946c5246ca0949bfd0e13d.m_4487bf5f5bb3efe5("decrypt", "windows-x64", "vm-diverse");
    }
}

