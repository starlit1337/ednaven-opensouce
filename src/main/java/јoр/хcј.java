/*
 * Decompiled with CFR 0.152.
 */
package \u0458o\u0440;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Iterator;
import \u04bbejhxj.ia\u0440a\u0440;

public class \u0445c\u0458
extends ia\u0440a\u0440 {
    public \u0445c\u0458() {
        if (true | false) {
        }
        byte[] byArray = new byte[-807252650 + 807252660];
        byArray[0] = -1202576645 + 1202576606;
        byArray[1] = -1468940295 + 1468940317;
        byArray[2] = -1626750923 + 1626750896;
        byArray[3] = -1122933979 + 1122934098;
        byArray[4] = -646662707 + 646662690;
        byArray[5] = -675255527 + 675255600;
        byArray[-1749288430 + 1749288436] = -1432607815 + 1432607882;
        byArray[-1323868709 + 1323868716] = -1861200378 + 1861200471;
        byArray[-981726212 + 981726220] = -1940756732 + 1940756815;
        byArray[-2008096005 + 2008096014] = -470649469 + 470649503;
        super((String)((Object)\u0445c\u0458.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])byArray, (int)(1997610463 + 515274728), (int)(1258536552 + 281582948))));
    }

    @Override
    public /* synthetic */ void read(BufferedReader bufferedReader) throws IOException {
        while (true) {
            String string;
            if ((3 * 3 + 3) % 2 == 0) {
            }
            if (0 != 0) {
            }
            if ((string = bufferedReader.readLine()) == null) break;
            \u0445c\u0458.a_bsm1("\u043e\u0441\u0430\u043e", \u043e\u0441\u0430\u043e(java.lang.String ), (String)string);
        }
    }

    @Override
    public /* synthetic */ void save(BufferedWriter bufferedWriter) throws IOException {
        if (true | false) {
        }
        if (0 != 0) {
        }
        Iterator iterator = \u0445c\u0458.a_bsm2("sasc", sasc()).iterator();
        while (iterator.hasNext()) {
            String string;
            String string2 = string = (String)iterator.next();
            bufferedWriter.write(string2 + (String)((Object)\u0445c\u0458.a_bsm0("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-160889019 + 160889135}, (int)(356171195 + 97148233), (int)(427015035 + 1599192393))));
        }
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
}

