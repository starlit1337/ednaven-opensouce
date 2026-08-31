/*
 * Decompiled with CFR 0.152.
 */
package i\u0456x\u0430;

import i\u0456x\u0430.a\u0445es;
import r.d3.C1a946c5246ca0949bfd0e13d;

public abstract class a\u043e\u0456 {
    private /* synthetic */ String \u0430h\u0445\u0445o\u0440x;
    private /* synthetic */ String is\u0435\u0441;
    private /* synthetic */ String[] \u0445eji\u0430;

    protected /* synthetic */ void \u043eooh\u043ep() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        if (this.getClass().isAnnotationPresent(a\u0445es.class)) {
            a\u0445es a\u0445es2 = this.getClass().getAnnotation(a\u0445es.class);
            this.\u0430h\u0445\u0445o\u0440x = a\u0445es2.sp\u0456p\u0445\u0435();
            this.is\u0435\u0441 = a\u0445es2.a\u0456j\u0430\u0455\u04bb();
            this.\u0445eji\u0430 = a\u0445es2.\u0435\u0430\u0435\u0445exj();
        }
    }

    public abstract /* synthetic */ void onCommand(String[] var1);

    public abstract /* synthetic */ String[] onTab(String[] var1);

    public a\u043e\u0456(String string, String string2, String[] stringArray) {
        if (2 * 2 * 2 >= 0) {
        }
        this.\u0430h\u0445\u0445o\u0440x = string;
        this.is\u0435\u0441 = string2;
        this.\u0445eji\u0430 = stringArray;
    }

    public a\u043e\u0456() {
        if (2 * 2 * 2 >= 0) {
        }
    }

    public /* synthetic */ String getName() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return this.\u0430h\u0445\u0445o\u0440x;
    }

    public /* synthetic */ String i\u04bb\u0435o\u0441\u0458a() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return this.is\u0435\u0441;
    }

    public /* synthetic */ String[] hes\u04bbhpi() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return this.\u0445eji\u0430;
    }

    static {
        C1a946c5246ca0949bfd0e13d.m_4487bf5f5bb3efe5("decrypt", "windows-x64", "vm-diverse");
    }
}

