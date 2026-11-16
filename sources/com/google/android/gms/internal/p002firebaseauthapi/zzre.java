package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.e32;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzre extends zzrp {
    public final zzrl a;
    public final zzaav b;
    public final zzaau c;
    public final Integer d;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class zza {
        public zzrl a;
        public zzaav b;
        public Integer c;

        public final zzre a() throws GeneralSecurityException {
            zzaav zzaavVar;
            zzaau zzaauVarA;
            zzrl zzrlVar = this.a;
            if (zzrlVar == null || (zzaavVar = this.b) == null) {
                e.d("Cannot build without parameters and/or key material");
                return null;
            }
            if (zzrlVar.a != zzaavVar.a.a.length) {
                e.d("Key size mismatch");
                return null;
            }
            if (zzrlVar.a() && this.c == null) {
                e.d("Cannot create key without ID requirement with parameters with ID requirement");
                return null;
            }
            if (!this.a.a() && this.c != null) {
                e.d("Cannot create key with ID requirement with parameters without ID requirement");
                return null;
            }
            zzrl.zzb zzbVar = this.a.c;
            if (zzbVar == zzrl.zzb.e) {
                zzaauVarA = zzpj.a;
            } else if (zzbVar == zzrl.zzb.d || zzbVar == zzrl.zzb.c) {
                zzaauVarA = zzpj.a(this.c.intValue());
            } else {
                if (zzbVar != zzrl.zzb.b) {
                    e32.i("Unknown HmacParameters.Variant: ".concat(String.valueOf(zzbVar)));
                    return null;
                }
                zzaauVarA = zzpj.b(this.c.intValue());
            }
            return new zzre(this.a, this.b, zzaauVarA, this.c);
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

    public zzre(zzrl zzrlVar, zzaav zzaavVar, zzaau zzaauVar, Integer num) {
        this.a = zzrlVar;
        this.b = zzaavVar;
        this.c = zzaauVar;
        this.d = num;
    }
}
