package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.d;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaav {
    public final zzaau a;

    public static zzaav a(int i) {
        return new zzaav(zzaau.a(zzqm.a(i)));
    }

    public static zzaav b(byte[] bArr, zzdd zzddVar) {
        if (zzddVar != null) {
            return new zzaav(zzaau.a(bArr));
        }
        d.w("SecretKeyAccess required");
        return null;
    }

    public final byte[] c(zzdd zzddVar) {
        if (zzddVar != null) {
            return this.a.b();
        }
        d.w("SecretKeyAccess required");
        return null;
    }

    public zzaav(zzaau zzaauVar) {
        this.a = zzaauVar;
    }
}
