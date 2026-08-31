/*
 * Decompiled with CFR 0.152.
 */
package po\u0458\u0440ia\u0430;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class \u0456\u0435cp\u0440s\u04bb {
    private /* synthetic */ float o\u0441j;
    private /* synthetic */ float o\u0430\u0430e\u04bb;
    private /* synthetic */ float pj\u04bbx\u0430\u04bb;

    public \u0456\u0435cp\u0440s\u04bb() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
    }

    public \u0456\u0435cp\u0440s\u04bb(float f, float f2, float f3) {
        if (true | false) {
        }
        this.\u0430\u0441\u0445i(f);
        this.sxjh(f2);
        this.e\u0440\u0435\u0430\u0435s\u0458(f3);
    }

    public /* synthetic */ void \u0430\u0441\u0445i(float f) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        this.o\u0441j = f < 0.0f ? 0.0f : (f > 360.0f ? 360.0f : f);
    }

    public /* synthetic */ void sxjh(float f) {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        this.o\u0430\u0430e\u04bb = f < 0.0f ? 0.0f : (f > 255.0f ? 255.0f : f);
    }

    public /* synthetic */ void e\u0440\u0435\u0430\u0435s\u0458(float f) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        this.pj\u04bbx\u0430\u04bb = f < 0.0f ? 0.0f : (f > 255.0f ? 255.0f : f);
    }

    public /* synthetic */ boolean equals(Object object) {
        if (true | false) {
        }
        if (0 != 0) {
        }
        if (!(object instanceof \u0456\u0435cp\u0440s\u04bb)) {
            return false;
        }
        \u0456\u0435cp\u0440s\u04bb \u0456\u0435cp\u0440s\u04bb2 = (\u0456\u0435cp\u0440s\u04bb)object;
        return this.\u0456\u0458\u043eaj() == \u0456\u0435cp\u0440s\u04bb2.\u0456\u0458\u043eaj() && this.\u04bb\u0458p\u0455p() == \u0456\u0435cp\u0440s\u04bb2.\u04bb\u0458p\u0455p() && this.pxx() == \u0456\u0435cp\u0440s\u04bb2.pxx();
    }

    public /* synthetic */ int hashCode() {
        if (true | false) {
        }
        if (0 != 0) {
        }
        return ((Float)((Object)\u0456\u0435cp\u0440s\u04bb.a_bsm0("valueOf", valueOf(float ), (float)(this.\u0456\u0458\u043eaj() * 1000000.0f + this.\u04bb\u0458p\u0455p() * 1000.0f + this.pxx())))).intValue();
    }

    public /* synthetic */ String toString() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        float f = this.pj\u04bbx\u0430\u04bb;
        float f2 = this.o\u0430\u0430e\u04bb;
        float f3 = this.o\u0441j;
        return (String)((Object)\u0456\u0435cp\u0440s\u04bb.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-130237805 + 130237728, -263011873 + 263011773, -18889469 + 18889520, -212607512 + 212607409, -598726871 + 598726794}, (int)(988385279 + 342671190), (int)(171422107 + 1819919637))) + f3 + (String)((Object)\u0456\u0435cp\u0440s\u04bb.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1916658682 + 1916658620, -595678113 + 595678164}, (int)(1442930645 + 1653037235), (int)(1113094925 + 605219678))) + f2 + (String)((Object)\u0456\u0435cp\u0440s\u04bb.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1300356610 + 1300356674, -1097237288 + 1097237178}, (int)(1420405984 + 1981881834), (int)(195104720 + 1822648435))) + f + (String)((Object)\u0456\u0435cp\u0440s\u04bb.a_bsm1("cachedDecodeString", cachedDecodeString(byte[] int int ), (byte[])new byte[]{-1395587757 + 1395587828}, (int)(790202149 + 132231125), (int)(21929555 + 1001954995)));
    }

    public /* synthetic */ float \u0456\u0458\u043eaj() {
        if (2 * 2 * 2 >= 0) {
        }
        if (0 != 0) {
        }
        return this.o\u0441j;
    }

    public /* synthetic */ float \u04bb\u0458p\u0455p() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return this.o\u0430\u0430e\u04bb;
    }

    public /* synthetic */ float pxx() {
        if ((3 * 3 + 3) % 2 == 0) {
        }
        if (0 != 0) {
        }
        return this.pj\u04bbx\u0430\u04bb;
    }

    private static /* synthetic */ CallSite a_bsm0(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }

    private static /* synthetic */ CallSite a_bsm1(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle);
    }
}

