package com.google.android.gms.internal.p002firebaseauthapi;

import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfp extends zzdm {
    public final zzfo a;
    public final zzaau b;
    public final Integer c;

    public static zzfp e(zzfo zzfoVar, Integer num) throws GeneralSecurityException {
        zzaau zzaauVarB;
        zzfo.zzc zzcVar = zzfoVar.a;
        if (zzcVar == zzfo.zzc.c) {
            if (num != null) {
                e.d("For given Variant NO_PREFIX the value of idRequirement must be null");
                return null;
            }
            zzaauVarB = zzpj.a;
        } else {
            if (zzcVar != zzfo.zzc.b) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(zzcVar)));
            }
            if (num == null) {
                e.d("For given Variant TINK the value of idRequirement must be non-null");
                return null;
            }
            zzaauVarB = zzpj.b(num.intValue());
        }
        return new zzfp(zzfoVar, zzaauVarB, num);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzdm, com.google.android.gms.internal.p002firebaseauthapi.zzbt
    public final /* synthetic */ zzcs a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbt
    public final Integer b() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzdm
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzdo a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzdm
    public final zzaau d() {
        return this.b;
    }

    public zzfp(zzfo zzfoVar, zzaau zzaauVar, Integer num) {
        this.a = zzfoVar;
        this.b = zzaauVar;
        this.c = num;
    }
}
