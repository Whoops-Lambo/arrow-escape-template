package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.e32;
import defpackage.pv1;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeu extends zzdm {
    public final zzey a;
    public final zzaav b;
    public final zzaau c;
    public final Integer d;

    public static zzeu e(zzey.zza zzaVar, zzaav zzaavVar, Integer num) throws GeneralSecurityException {
        zzaau zzaauVarB;
        zzaau zzaauVar = zzaavVar.a;
        zzey.zza zzaVar2 = zzey.zza.d;
        if (zzaVar != zzaVar2 && num == null) {
            throw new GeneralSecurityException(pv1.n("For given Variant ", String.valueOf(zzaVar), " the value of idRequirement must be non-null"));
        }
        if (zzaVar == zzaVar2 && num != null) {
            e.d("For given Variant NO_PREFIX the value of idRequirement must be null");
            return null;
        }
        if (zzaauVar.a.length != 32) {
            throw new GeneralSecurityException(pv1.k(zzaauVar.a.length, "ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not "));
        }
        zzey zzeyVar = new zzey(zzaVar);
        zzey.zza zzaVar3 = zzeyVar.a;
        if (zzaVar3 == zzaVar2) {
            zzaauVarB = zzpj.a;
        } else if (zzaVar3 == zzey.zza.c) {
            zzaauVarB = zzpj.a(num.intValue());
        } else {
            if (zzaVar3 != zzey.zza.b) {
                e32.i("Unknown Variant: ".concat(String.valueOf(zzaVar3)));
                return null;
            }
            zzaauVarB = zzpj.b(num.intValue());
        }
        return new zzeu(zzeyVar, zzaavVar, zzaauVarB, num);
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

    public zzeu(zzey zzeyVar, zzaav zzaavVar, zzaau zzaauVar, Integer num) {
        this.a = zzeyVar;
        this.b = zzaavVar;
        this.c = zzaauVar;
        this.d = num;
    }
}
