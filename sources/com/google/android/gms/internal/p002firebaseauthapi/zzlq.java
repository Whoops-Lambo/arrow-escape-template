package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzlq {
    public static final byte[] a = new byte[0];

    public static zzlu a(zzkl zzklVar) throws GeneralSecurityException {
        zzcs zzcsVar = zzklVar.e;
        if (zzcsVar instanceof zzel) {
            return new o((zzel) zzcsVar);
        }
        if (zzcsVar instanceof zzdw) {
            return new p((zzdw) zzcsVar);
        }
        if (zzcsVar instanceof zzjp) {
            return new q((zzjp) zzcsVar);
        }
        throw new GeneralSecurityException("Unsupported DEM parameters: ".concat(String.valueOf(zzcsVar)));
    }
}
