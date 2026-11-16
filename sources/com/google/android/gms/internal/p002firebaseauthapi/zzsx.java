package com.google.android.gms.internal.p002firebaseauthapi;

import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzsx extends zzsy {
    public final zzsw a;
    public final zzaav b;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbt
    public final Integer b() {
        return null;
    }

    public static zzsx d(zzsw zzswVar, zzaav zzaavVar) throws GeneralSecurityException {
        if (zzswVar.a == zzaavVar.a.a.length) {
            return new zzsx(zzswVar, zzaavVar);
        }
        e.d("Key size mismatch");
        return null;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzsy, com.google.android.gms.internal.p002firebaseauthapi.zzbt
    public final /* synthetic */ zzcs a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzsy
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzsw a() {
        return this.a;
    }

    public zzsx(zzsw zzswVar, zzaav zzaavVar) {
        this.a = zzswVar;
        this.b = zzaavVar;
    }
}
