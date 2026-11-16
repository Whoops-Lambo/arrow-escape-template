package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzhl {
    public static int a(int i) {
        int i2 = 0;
        while (i > 0) {
            i >>>= 1;
            i2++;
        }
        return i2;
    }

    public static zzhi b(zzey zzeyVar, boolean z, boolean z2) throws zzat {
        if (z) {
            c(3, zzeyVar, false);
        }
        zzeyVar.k((int) zzeyVar.a(), StandardCharsets.UTF_8);
        long jA = zzeyVar.a();
        String[] strArr = new String[(int) jA];
        for (int i = 0; i < jA; i++) {
            strArr[i] = zzeyVar.k((int) zzeyVar.a(), StandardCharsets.UTF_8);
        }
        if (z2 && (zzeyVar.K() & 1) == 0) {
            throw zzat.b("framing bit expected to be set", null);
        }
        return new zzhi(strArr);
    }

    public static boolean c(int i, zzey zzeyVar, boolean z) throws zzat {
        if (zzeyVar.B() < 7) {
            if (!z) {
                int iB = zzeyVar.B();
                StringBuilder sb = new StringBuilder(String.valueOf(iB).length() + 18);
                sb.append("too short header: ");
                sb.append(iB);
                throw zzat.b(sb.toString(), null);
            }
            return false;
        }
        if (zzeyVar.K() != i) {
            if (!z) {
                throw zzat.b("expected header type ".concat(String.valueOf(Integer.toHexString(i))), null);
            }
            return false;
        }
        if (zzeyVar.K() == 118 && zzeyVar.K() == 111 && zzeyVar.K() == 114 && zzeyVar.K() == 98 && zzeyVar.K() == 105 && zzeyVar.K() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw zzat.b("expected characters 'vorbis'", null);
    }
}
