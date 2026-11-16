package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.d;
import defpackage.e32;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzji extends zzjr {
    public final zzjp a;
    public final zzaav b;
    public final zzaau c;
    public final Integer d;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class zza {
        public zzjp a;
        public zzaav b;
        public Integer c;

        public final zzji a() throws GeneralSecurityException {
            zzaav zzaavVar;
            zzaau zzaauVarB;
            zzjp zzjpVar = this.a;
            if (zzjpVar == null || (zzaavVar = this.b) == null) {
                d.r("Cannot build without parameters and/or key material");
                return null;
            }
            if (zzjpVar.a != zzaavVar.a.a.length) {
                e.d("Key size mismatch");
                return null;
            }
            if (zzjpVar.a() && this.c == null) {
                e.d("Cannot create key without ID requirement with parameters with ID requirement");
                return null;
            }
            if (!this.a.a() && this.c != null) {
                e.d("Cannot create key with ID requirement with parameters without ID requirement");
                return null;
            }
            zzjp.zzb zzbVar = this.a.b;
            if (zzbVar == zzjp.zzb.d) {
                zzaauVarB = zzpj.a;
            } else if (zzbVar == zzjp.zzb.c) {
                zzaauVarB = zzpj.a(this.c.intValue());
            } else {
                if (zzbVar != zzjp.zzb.b) {
                    e32.i("Unknown AesSivParameters.Variant: ".concat(String.valueOf(zzbVar)));
                    return null;
                }
                zzaauVarB = zzpj.b(this.c.intValue());
            }
            return new zzji(this.a, this.b, zzaauVarB, this.c);
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

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzjr, com.google.android.gms.internal.p002firebaseauthapi.zzbt
    public final /* synthetic */ zzcs a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbt
    public final Integer b() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzjr
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzjp a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzjr
    public final zzaau d() {
        return this.c;
    }

    public zzji(zzjp zzjpVar, zzaav zzaavVar, zzaau zzaauVar, Integer num) {
        this.a = zzjpVar;
        this.b = zzaavVar;
        this.c = zzaauVar;
        this.d = num;
    }
}
