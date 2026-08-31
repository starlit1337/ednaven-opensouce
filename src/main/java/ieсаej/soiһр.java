/*
 * Decompiled with CFR 0.152.
 */
package ie\u0441\u0430ej;

import c\u0445is.io\u0441;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import r.d3.C1a946c5246ca0949bfd0e13d;
import r.d8.Cade0e18b60fd9f037d8b2fc8;

public class soi\u04bb\u0440 {
    public soi\u04bb\u0440() {
        if (true | false) {
        }
    }

    public static /* synthetic */ Class<?>[] hsp(String string) {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        ArrayList arrayList = new ArrayList();
        String string2 = string.replace(-2000378511 + 1716418520 + (1180436447 + -896476410), -1120431485 + 511512555 + (-736158713 + 1345077690));
        try {
            Enumeration<URL> enumeration = Thread.currentThread().getContextClassLoader().getResources(string2);
            while (enumeration.hasMoreElements()) {
                URL uRL = enumeration.nextElement();
                File file = new File(uRL.getFile());
                if (!file.exists()) continue;
                arrayList.addAll(soi\u04bb\u0440.ca\u0441\u0445(file, string));
            }
        }
        catch (IOException | ClassNotFoundException exception) {
            exception.printStackTrace();
        }
        return arrayList.toArray(new Class[0]);
    }

    private static /* synthetic */ List<Class<?>> ca\u0441\u0445(File file, String string) throws ClassNotFoundException {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        ArrayList arrayList = new ArrayList();
        if (!file.exists()) {
            return arrayList;
        }
        File[] fileArray = file.listFiles();
        if (fileArray == null) {
            return arrayList;
        }
        for (File file2 : fileArray) {
            if (file2.isDirectory()) {
                String string2 = file2.getName();
                String string3 = string;
                arrayList.addAll(soi\u04bb\u0440.ca\u0441\u0445(file2, string3 + Cade0e18b60fd9f037d8b2fc8.cachedDecodeString(new byte[]{817576750 + 1446547135 + (37324696 + 1993518677)}, -1618293818 + 189060035 + (-212908260 + 284674160), -2020626351 + 1106286967 + (2015109199 + 31578470)) + string2));
                continue;
            }
            byte[] byArray = new byte[-972260005 + -11982898 + (1055405976 + -71163067)];
            byArray[0] = 1342584000 + -1989717536 + (48201342 + 598932277);
            byArray[1] = -1735772923 + 982311435 + (-1987547957 + -1553957913);
            byArray[2] = -1111918020 + -66182007 + (-1025440396 + -2091426864);
            byArray[3] = -449805307 + -885320772 + (-1426920545 + -1532920794);
            byArray[4] = -1069975038 + 703066464 + (-97398465 + 464306987);
            byArray[5] = 136404405 + -1871951637 + (1428000472 + 307546835);
            if (!file2.getName().endsWith(Cade0e18b60fd9f037d8b2fc8.cachedDecodeString(byArray, -1211721437 + -2059248187 + (-1042489479 + 1580828350), 819315574 + -1182375679 + (501816396 + 720564853)))) continue;
            String string4 = file2.getName().substring(0, file2.getName().length() - (-635949700 + 515753530 + (448976752 + -328780576)));
            String string5 = string;
            String string6 = string5 + Cade0e18b60fd9f037d8b2fc8.cachedDecodeString(new byte[]{1504012054 + -1911531881 + (-746019334 + 1153539142)}, 1221934239 + -1532789724 + (813055406 + -620952966), -300129762 + 15259759 + (1540704199 + -1390316122)) + string4;
            arrayList.add(Class.forName(io\u0441.jpe\u0440(string6)));
        }
        return arrayList;
    }

    static {
        C1a946c5246ca0949bfd0e13d.m_4487bf5f5bb3efe5("decrypt", "windows-x64", "vm-diverse");
    }
}

