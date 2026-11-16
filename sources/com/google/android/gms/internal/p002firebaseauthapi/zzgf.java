package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.e32;
import defpackage.pv1;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgf extends zzdm {
    public final zzgj a;
    public final zzaav b;
    public final zzaau c;
    public final Integer d;

    public static zzgf e(zzgj zzgjVar, zzaav zzaavVar, Integer num) throws GeneralSecurityException {
        zzaau zzaauVarB;
        zzaau zzaauVar = zzaavVar.a;
        zzgj.zza zzaVar = zzgjVar.a;
        zzgj.zza zzaVar2 = zzgj.zza.c;
        if (zzaVar != zzaVar2 && num == null) {
            throw new GeneralSecurityException(pv1.n("For given Variant ", String.valueOf(zzaVar), " the value of idRequirement must be non-null"));
        }
        if (zzaVar == zzaVar2 && num != null) {
            e.d("For given Variant NO_PREFIX the value of idRequirement must be null");
            return null;
        }
        if (zzaauVar.a.length != 32) {
            throw new GeneralSecurityException(pv1.k(zzaauVar.a.length, "XAesGcmKey key must be constructed with key of length 32 bytes, not "));
        }
        if (zzaVar == zzaVar2) {
            zzaauVarB = zzpj.a;
        } else {
            if (zzaVar != zzgj.zza.b) {
                e32.i("Unknown Variant: ".concat(String.valueOf(zzaVar)));
                return null;
            }
            zzaauVarB = zzpj.b(num.intValue());
        }
        return new zzgf(zzgjVar, zzaavVar, zzaauVarB, num);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzdm, com.google.android.gms.internal.p002firebaseauthapi.zzbt
    public final /* synthetic */ zzcs a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbt
    public final Integer b() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzdm
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzdo a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzdm
    public final zzaau d() {
        return this.c;
    }

    public zzgf(zzgj zzgjVar, zzaav zzaavVar, zzaau zzaauVar, Integer num) {
        this.a = zzgjVar;
        this.b = zzaavVar;
        this.c = zzaauVar;
        this.d = num;
    }
}
