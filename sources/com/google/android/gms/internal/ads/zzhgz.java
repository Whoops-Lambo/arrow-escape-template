package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzhgz {
    public final zzifx a;
    public final String b;
    public final zzhgw c;

    public static zzhgz a(zzhgw zzhgwVar, zzifx zzifxVar, String str) throws GeneralSecurityException {
        int i = zzhqq.a;
        byte[] bArr = new byte[str.length()];
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < '!' || cCharAt > '~') {
                StringBuilder sb = new StringBuilder(String.valueOf(cCharAt).length() + 33);
                sb.append("Not a printable ASCII character: ");
                sb.append(cCharAt);
                throw new GeneralSecurityException(sb.toString());
            }
            bArr[i2] = (byte) cCharAt;
        }
        zzidx.a(bArr);
        return new zzhgz(zzhgwVar, zzifxVar, str);
    }

    public zzhgz(zzhgw zzhgwVar, zzifx zzifxVar, String str) {
        this.a = zzifxVar;
        this.b = str;
        this.c = zzhgwVar;
    }
}
