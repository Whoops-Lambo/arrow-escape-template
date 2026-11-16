package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.pv1;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzkl extends zzln {
    public static final Set g = (Set) zzqs.a(new zzqr() { // from class: com.google.android.gms.internal.firebase-auth-api.zzkn
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzqr
        public final Object zza() throws GeneralSecurityException {
            Set set = zzkl.g;
            HashSet hashSet = new HashSet();
            zzel.zza zzaVarB = zzel.b();
            zzaVarB.b();
            zzaVarB.c(16);
            zzaVarB.d();
            zzel.zzb zzbVar = zzel.zzb.d;
            zzaVarB.d = zzbVar;
            hashSet.add(zzaVarB.a());
            zzel.zza zzaVarB2 = zzel.b();
            zzaVarB2.b();
            zzaVarB2.c(32);
            zzaVarB2.d();
            zzaVarB2.d = zzbVar;
            hashSet.add(zzaVarB2.a());
            zzdw.zza zzaVarB3 = zzdw.b();
            zzaVarB3.b(16);
            zzaVarB3.c(32);
            zzaVarB3.e(16);
            zzaVarB3.d(16);
            zzdw.zzc zzcVar = zzdw.zzc.d;
            zzaVarB3.e = zzcVar;
            zzdw.zzb zzbVar2 = zzdw.zzb.d;
            zzaVarB3.f = zzbVar2;
            hashSet.add(zzaVarB3.a());
            zzdw.zza zzaVarB4 = zzdw.b();
            zzaVarB4.b(32);
            zzaVarB4.c(32);
            zzaVarB4.e(32);
            zzaVarB4.d(16);
            zzaVarB4.e = zzcVar;
            zzaVarB4.f = zzbVar2;
            hashSet.add(zzaVarB4.a());
            hashSet.add(new zzgq(zzgq.zza.d));
            zzjp.zza zzaVar = new zzjp.zza(0);
            zzaVar.b(64);
            zzaVar.b = zzjp.zzb.d;
            hashSet.add(zzaVar.a());
            return Collections.unmodifiableSet(hashSet);
        }
    });
    public final zzc a;
    public final zzb b;
    public final zze c;
    public final zzd d;
    public final zzcs e;
    public final zzaau f;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class zza {
        public zzc a;
        public zzb b;
        public zze c;
        public zzcs d;
        public zzd e;
        public zzaau f;

        public final zzkl a() throws GeneralSecurityException {
            zzc zzcVar = this.a;
            if (zzcVar == null) {
                e.d("Elliptic curve type is not set");
                return null;
            }
            if (this.b == null) {
                e.d("Hash type is not set");
                return null;
            }
            if (this.d == null) {
                e.d("DEM parameters are not set");
                return null;
            }
            if (this.e == null) {
                e.d("Variant is not set");
                return null;
            }
            zzc zzcVar2 = zzc.e;
            if (zzcVar != zzcVar2 && this.c == null) {
                e.d("Point format is not set");
                return null;
            }
            if (zzcVar != zzcVar2 || this.c == null) {
                return new zzkl(this.a, this.b, this.c, this.d, this.e, this.f);
            }
            e.d("For Curve25519 point format must not be set");
            return null;
        }

        public final void b(zzcs zzcsVar) throws GeneralSecurityException {
            if (!zzkl.g.contains(zzcsVar)) {
                throw new GeneralSecurityException(pv1.n("Invalid DEM parameters ", String.valueOf(zzcsVar), "; only AES128_GCM_RAW, AES256_GCM_RAW, AES128_CTR_HMAC_SHA256_RAW, AES256_CTR_HMAC_SHA256_RAW XCHACHA20_POLY1305_RAW and AES256_SIV_RAW are currently supported."));
            }
            this.d = zzcsVar;
        }

        private zza() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = zzd.d;
            this.f = null;
        }

        public /* synthetic */ zza(int i) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class zzb {
        public static final zzb b = new zzb("SHA1");
        public static final zzb c = new zzb("SHA224");
        public static final zzb d = new zzb("SHA256");
        public static final zzb e = new zzb("SHA384");
        public static final zzb f = new zzb("SHA512");
        public final String a;

        public final String toString() {
            return this.a;
        }

        public zzb(String str) {
            this.a = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class zzc {
        public static final zzc b = new zzc("NIST_P256");
        public static final zzc c = new zzc("NIST_P384");
        public static final zzc d = new zzc("NIST_P521");
        public static final zzc e = new zzc("X25519");
        public final String a;

        public final String toString() {
            return this.a;
        }

        public zzc(String str) {
            this.a = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class zzd {
        public static final zzd b = new zzd("TINK");
        public static final zzd c = new zzd("CRUNCHY");
        public static final zzd d = new zzd("NO_PREFIX");
        public final String a;

        public final String toString() {
            return this.a;
        }

        public zzd(String str) {
            this.a = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class zze {
        public static final zze b = new zze("COMPRESSED");
        public static final zze c = new zze("UNCOMPRESSED");
        public static final zze d = new zze("LEGACY_UNCOMPRESSED");
        public final String a;

        public final String toString() {
            return this.a;
        }

        public zze(String str) {
            this.a = str;
        }
    }

    public static zza b() {
        return new zza(0);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcs
    public final boolean a() {
        return this.d != zzd.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzkl)) {
            return false;
        }
        zzkl zzklVar = (zzkl) obj;
        return Objects.equals(zzklVar.a, this.a) && Objects.equals(zzklVar.b, this.b) && Objects.equals(zzklVar.c, this.c) && Objects.equals(zzklVar.e, this.e) && Objects.equals(zzklVar.d, this.d) && Objects.equals(zzklVar.f, this.f);
    }

    public final int hashCode() {
        return Objects.hash(zzkl.class, this.a, this.b, this.c, this.e, this.d, this.f);
    }

    public final String toString() {
        return String.format("EciesParameters(curveType=%s, hashType=%s, pointFormat=%s, demParameters=%s, variant=%s, salt=%s)", this.a, this.b, this.c, this.e, this.d, this.f);
    }

    public zzkl(zzc zzcVar, zzb zzbVar, zze zzeVar, zzcs zzcsVar, zzd zzdVar, zzaau zzaauVar) {
        this.a = zzcVar;
        this.b = zzbVar;
        this.c = zzeVar;
        this.e = zzcsVar;
        this.d = zzdVar;
        this.f = zzaauVar;
    }
}
