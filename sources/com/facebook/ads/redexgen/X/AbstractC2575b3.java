package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.b3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public abstract class AbstractC2575b3 {
    public static byte[] A00;
    public static String[] A01 = {"bWm4MdcTIwBOXnaA6gk00N", "2egpmu6QICmDaEoNAGV4KoEhrE", "VtNQfL8fGYouF2P2CY5m8Tg7KTaoXEyS", "IqrQCDQ5grOO7J3jMUqBT8WUSgZM", "ViQjihdRfJv4dSHacOdgHgP3pHJs", "AeQb7kz", "g7oQuvQq3H7nw7Ugglblr7aD13p3MdPF", "WiM2hEomy3K"};

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 26);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-69, -34, -34, -45, -84, -33, -38, -40, -64, -33, -44, -41, -98, -73, -68, -66, -71, -71, -72, -69, -67, -82, -83, 105, -71, -68, -68, -79, 105, -65, -82, -69, -68, -78, -72, -73, -125, 105};
    }

    static {
        A03();
    }

    public static C2574b2 A00(byte[] bArr) {
        C2181Mk c2181Mk = new C2181Mk(bArr);
        if (c2181Mk.A0A() < 32) {
            return null;
        }
        c2181Mk.A0f(0);
        if (c2181Mk.A0C() != c2181Mk.A07() + 4 || c2181Mk.A0C() != 1886614376) {
            return null;
        }
        int dataSize = AbstractC2552ag.A03(c2181Mk.A0C());
        if (dataSize > 1) {
            MV.A07(A01(0, 12, 81), A01(12, 26, 47) + dataSize);
            return null;
        }
        UUID uuid = new UUID(c2181Mk.A0P(), c2181Mk.A0P());
        if (dataSize == 1) {
            int atomType = c2181Mk.A0L() * 16;
            if (A01[4].length() != 28) {
                throw new RuntimeException();
            }
            A01[4] = "8kunImGG1Wvt4Tl8nInnCvkZmBXs";
            c2181Mk.A0g(atomType);
        }
        int atomSize = c2181Mk.A0L();
        if (atomSize != c2181Mk.A07()) {
            return null;
        }
        byte[] bArr2 = new byte[atomSize];
        c2181Mk.A0k(bArr2, 0, atomSize);
        return new C2574b2(uuid, dataSize, bArr2);
    }

    public static UUID A02(byte[] bArr) {
        C2574b2 parsedAtom = A00(bArr);
        if (parsedAtom != null) {
            return parsedAtom.A01;
        }
        return null;
    }
}
