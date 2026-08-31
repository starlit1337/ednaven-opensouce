/*
 * Decompiled with CFR 0.152.
 */
package spso;

import java.util.ArrayList;
import java.util.List;
import r.d3.C1a946c5246ca0949bfd0e13d;
import spso.\u0430\u0430p\u043e;
import spso.\u0441a\u0458p;
import \u0430\u0456j\u0435x.\u043ei\u0445;

public class \u0458e\u0445\u0430 {
    private final /* synthetic */ List<\u0430\u0430p\u043e> hpe\u0455;

    public \u0458e\u0445\u0430() {
        if (2 * 2 * 2 >= 0) {
        }
        this.hpe\u0455 = new ArrayList<\u0430\u0430p\u043e>();
    }

    public /* synthetic */ void c\u0455ecxh(\u0430\u0430p\u043e \u0430\u0430p\u043e2) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        this.hpe\u0455.add(\u0430\u0430p\u043e2);
    }

    public /* synthetic */ List<\u0430\u0430p\u043e> iop\u0441c(\u0441a\u0458p \u0441a\u0458p2) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        ArrayList<\u0430\u0430p\u043e> arrayList = new ArrayList<\u0430\u0430p\u043e>();
        for (\u0430\u0430p\u043e \u0430\u0430p\u043e2 : this.hpe\u0455) {
            if (\u0430\u0430p\u043e2.x\u04bb\u043e\u04bb\u0456x() != \u0441a\u0458p2) continue;
            arrayList.add(\u0430\u0430p\u043e2);
        }
        return arrayList;
    }

    public /* synthetic */ \u0430\u0430p\u043e \u0458oc(\u0441a\u0458p \u0441a\u0458p2, String string) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        for (\u0430\u0430p\u043e \u0430\u0430p\u043e2 : this.hpe\u0455) {
            if (\u0430\u0430p\u043e2.x\u04bb\u043e\u04bb\u0456x() != \u0441a\u0458p2 || !\u0430\u0430p\u043e2.getName().equals(string)) continue;
            return \u0430\u0430p\u043e2;
        }
        throw new \u043ei\u0445();
    }

    public /* synthetic */ List<\u0430\u0430p\u043e> \u0440h\u0440\u0441() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return this.hpe\u0455;
    }

    static {
        C1a946c5246ca0949bfd0e13d.m_4487bf5f5bb3efe5("decrypt", "windows-x64", "vm-diverse");
    }
}

