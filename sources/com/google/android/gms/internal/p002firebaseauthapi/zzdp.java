package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.e32;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdp extends zzdm {
    public final zzdw a;
    public final zzaav b;
    public final zzaav c;
    public final zzaau d;
    public final Integer e;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class zza {
        public zzdw a;
        public zzaav b;
        public zzaav c;
        public Integer d;

        public final zzdp a() throws GeneralSecurityException {
            zzaav zzaavVar;
            zzaau zzaauVarB;
            zzdw zzdwVar = this.a;
            if (zzdwVar == null) {
                e.d("Cannot build without parameters");
                return null;
            }
            zzaav zzaavVar2 = this.b;
            if (zzaavVar2 == null || (zzaavVar = this.c) == null) {
                e.d("Cannot build without key material");
                return null;
            }
            if (zzdwVar.a != zzaavVar2.a.a.length) {
                e.d("AES key size mismatch");
                return null;
            }
            if (zzdwVar.b != zzaavVar.a.a.length) {
                e.d("HMAC key size mismatch");
                return null;
            }
            if (zzdwVar.a() && this.d == null) {
                e.d("Cannot create key without ID requirement with parameters with ID requirement");
                return null;
            }
            if (!this.a.a() && this.d != null) {
                e.d("Cannot create key with ID requirement with parameters without ID requirement");
                return null;
            }
            zzdw.zzb zzbVar = this.a.e;
            if (zzbVar == zzdw.zzb.d) {
                zzaauVarB = zzpj.a;
            } else if (zzbVar == zzdw.zzb.c) {
                zzaauVarB = zzpj.a(this.d.intValue());
            } else {
                if (zzbVar != zzdw.zzb.b) {
                    e32.i("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(zzbVar)));
                    return null;
                }
                zzaauVarB = zzpj.b(this.d.intValue());
            }
            return new zzdp(this.a, this.b, this.c, zzaauVarB, this.d);
        }

        private zza() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
        }

        public /* synthetic */ zza(int i) {
            this();
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzdm, com.google.android.gms.internal.p002firebaseauthapi.zzbt
    public final /* synthetic */ zzcs a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbt
    public final Integer b() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzdm
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzdo a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzdm
    public final zzaau d() {
        return this.d;
    }

    public zzdp(zzdw zzdwVar, zzaav zzaavVar, zzaav zzaavVar2, zzaau zzaauVar, Integer num) {
        this.a = zzdwVar;
        this.b = zzaavVar;
        this.c = zzaavVar2;
        this.d = zzaauVar;
        this.e = num;
    }
}
