package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.pq;
import defpackage.pv1;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzkq extends zzln {
    public final zzf a;
    public final zzc b;
    public final zzb c;
    public final zze d;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class zzb extends pq {
        public static final zzb d = new zzb("AES_128_GCM", 1);
        public static final zzb e = new zzb("AES_256_GCM", 2);
        public static final zzb f = new zzb("CHACHA20_POLY1305", 3);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class zzc extends pq {
        public static final zzc d = new zzc("HKDF_SHA256", 1);
        public static final zzc e = new zzc("HKDF_SHA384", 2);
        public static final zzc f = new zzc("HKDF_SHA512", 3);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class zzd {
        public zzf a;
        public zzc b;
        public zzb c;
        public zze d;

        public final zzkq a() throws GeneralSecurityException {
            zzf zzfVar = this.a;
            if (zzfVar == null) {
                e.d("HPKE KEM parameter is not set");
                return null;
            }
            zzc zzcVar = this.b;
            if (zzcVar == null) {
                e.d("HPKE KDF parameter is not set");
                return null;
            }
            if (this.c == null) {
                e.d("HPKE AEAD parameter is not set");
                return null;
            }
            if (this.d == null) {
                e.d("HPKE variant is not set");
                return null;
            }
            if (zzfVar != zzf.h || zzcVar.equals(zzc.d)) {
                return new zzkq(this.a, this.b, this.c, this.d);
            }
            e.d("Only SHA256 KDF is supported with X-Wing KEM");
            return null;
        }

        private zzd() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = zze.d;
        }

        public /* synthetic */ zzd(int i) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class zze {
        public static final zze b = new zze("TINK");
        public static final zze c = new zze("CRUNCHY");
        public static final zze d = new zze("NO_PREFIX");
        public final String a;

        public final String toString() {
            return this.a;
        }

        public zze(String str) {
            this.a = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class zzf extends pq {
        public static final zzf d = new zzf("DHKEM_P256_HKDF_SHA256", 16);
        public static final zzf e = new zzf("DHKEM_P384_HKDF_SHA384", 17);
        public static final zzf f = new zzf("DHKEM_P521_HKDF_SHA512", 18);
        public static final zzf g = new zzf("DHKEM_X25519_HKDF_SHA256", 32);
        public static final zzf h = new zzf("XWING", 25722);
    }

    public static zzd b() {
        return new zzd(0);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcs
    public final boolean a() {
        return this.d != zze.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzkq)) {
            return false;
        }
        zzkq zzkqVar = (zzkq) obj;
        return this.a == zzkqVar.a && this.b == zzkqVar.b && this.c == zzkqVar.c && this.d == zzkqVar.d;
    }

    public final int hashCode() {
        return Objects.hash(zzkq.class, this.a, this.b, this.c, this.d);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.d);
        String strValueOf2 = String.valueOf(this.a);
        return pv1.p(pv1.r("HPKE Parameters (Variant: ", strValueOf, ", KemId: ", strValueOf2, ", KdfId: "), String.valueOf(this.b), ", AeadId: ", String.valueOf(this.c), ")");
    }

    public zzkq(zzf zzfVar, zzc zzcVar, zzb zzbVar, zze zzeVar) {
        this.a = zzfVar;
        this.b = zzcVar;
        this.c = zzbVar;
        this.d = zzeVar;
    }
}
