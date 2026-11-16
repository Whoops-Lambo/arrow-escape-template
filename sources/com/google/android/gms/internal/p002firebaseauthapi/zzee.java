package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.e32;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zzee extends zzdm {
    public final zzel a;
    public final zzaav b;
    public final zzaau c;
    public final Integer d;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class zza {
        public zzel a;
        public zzaav b;
        public Integer c;

        public final zzee a() throws GeneralSecurityException {
            zzaav zzaavVar;
            zzaau zzaauVarB;
            zzel zzelVar = this.a;
            if (zzelVar == null || (zzaavVar = this.b) == null) {
                e.d("Cannot build without parameters and/or key material");
                return null;
            }
            if (zzelVar.a != zzaavVar.a.a.length) {
                e.d("Key size mismatch");
                return null;
            }
            if (zzelVar.a() && this.c == null) {
                e.d("Cannot create key without ID requirement with parameters with ID requirement");
                return null;
            }
            if (!this.a.a() && this.c != null) {
                e.d("Cannot create key with ID requirement with parameters without ID requirement");
                return null;
            }
            zzel.zzb zzbVar = this.a.d;
            if (zzbVar == zzel.zzb.d) {
                zzaauVarB = zzpj.a;
            } else if (zzbVar == zzel.zzb.c) {
                zzaauVarB = zzpj.a(this.c.intValue());
            } else {
                if (zzbVar != zzel.zzb.b) {
                    e32.i("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(zzbVar)));
                    return null;
                }
                zzaauVarB = zzpj.b(this.c.intValue());
            }
            return new zzee(this.a, this.b, zzaauVarB, this.c);
        }

        private zza() {
            this.a = null;
            this.b = null;
            this.c = null;
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

    public zzee(zzel zzelVar, zzaav zzaavVar, zzaau zzaauVar, Integer num) {
        this.a = zzelVar;
        this.b = zzaavVar;
        this.c = zzaauVar;
        this.d = num;
    }
}
