package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzhgx {
    public final String a;
    public final zzifx b;
    public final zzhgv c;
    public final zzhgw d;
    public final Integer e;

    public static zzhgx a(String str, zzifx zzifxVar, zzhgv zzhgvVar, zzhgw zzhgwVar, Integer num) throws GeneralSecurityException {
        zzhgw zzhgwVar2 = zzhgw.e;
        if (num != null && zzhgwVar == zzhgwVar2) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("Cannot set idRequirement for OutputPrefixType RAW");
            return null;
        }
        if (num == null && zzhgwVar != zzhgwVar2) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("Cannot have null idRequirement unless OutputPrefixType is RAW");
            return null;
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '!' || cCharAt > '~') {
                StringBuilder sb = new StringBuilder(str.length() + 50 + String.valueOf(i).length());
                sb.append("typeURL ");
                sb.append(str);
                sb.append(" contains non-ascii character at position ");
                sb.append(i);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return new zzhgx(str, zzifxVar, zzhgvVar, zzhgwVar, num);
    }

    public zzhgx(String str, zzifx zzifxVar, zzhgv zzhgvVar, zzhgw zzhgwVar, Integer num) {
        this.a = str;
        this.b = zzifxVar;
        this.c = zzhgvVar;
        this.d = zzhgwVar;
        this.e = num;
    }
}
