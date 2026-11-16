package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.e32;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzqt extends zzrp {
    public final zzra a;
    public final zzaav b;
    public final zzaau c;
    public final Integer d;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class zza {
        public zzra a;
        public zzaav b;
        public Integer c;

        public final zzqt a() throws GeneralSecurityException {
            zzaav zzaavVar;
            zzaau zzaauVarA;
            zzra zzraVar = this.a;
            if (zzraVar == null || (zzaavVar = this.b) == null) {
                e.d("Cannot build without parameters and/or key material");
                return null;
            }
            if (zzraVar.a != zzaavVar.a.a.length) {
                e.d("Key size mismatch");
                return null;
            }
            if (zzraVar.a() && this.c == null) {
                e.d("Cannot create key without ID requirement with parameters with ID requirement");
                return null;
            }
            if (!this.a.a() && this.c != null) {
                e.d("Cannot create key with ID requirement with parameters without ID requirement");
                return null;
            }
            zzra.zzb zzbVar = this.a.c;
            if (zzbVar == zzra.zzb.e) {
                zzaauVarA = zzpj.a;
            } else if (zzbVar == zzra.zzb.d || zzbVar == zzra.zzb.c) {
                zzaauVarA = zzpj.a(this.c.intValue());
            } else {
                if (zzbVar != zzra.zzb.b) {
                    e32.i("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(zzbVar)));
                    return null;
                }
                zzaauVarA = zzpj.b(this.c.intValue());
            }
            return new zzqt(this.a, this.b, zzaauVarA, this.c);
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

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzrp, com.google.android.gms.internal.p002firebaseauthapi.zzbt
    public final /* synthetic */ zzcs a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbt
    public final Integer b() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzrp
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzro a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzrp
    public final zzaau d() {
        return this.c;
    }

    public zzqt(zzra zzraVar, zzaav zzaavVar, zzaau zzaauVar, Integer num) {
        this.a = zzraVar;
        this.b = zzaavVar;
        this.c = zzaauVar;
        this.d = num;
    }
}
