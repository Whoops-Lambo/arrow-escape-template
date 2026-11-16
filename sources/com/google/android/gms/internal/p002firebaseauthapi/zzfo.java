package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.pv1;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfo extends zzdo {
    public final zzc a;
    public final String b;
    public final zza c;
    public final zzdo d;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class zza {
        public static final zza b = new zza("ASSUME_AES_GCM");
        public static final zza c = new zza("ASSUME_XCHACHA20POLY1305");
        public static final zza d = new zza("ASSUME_CHACHA20POLY1305");
        public static final zza e = new zza("ASSUME_AES_CTR_HMAC");
        public static final zza f = new zza("ASSUME_AES_EAX");
        public static final zza g = new zza("ASSUME_AES_GCM_SIV");
        public final String a;

        public final String toString() {
            return this.a;
        }

        public zza(String str) {
            this.a = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class zzc {
        public static final zzc b = new zzc("TINK");
        public static final zzc c = new zzc("NO_PREFIX");
        public final String a;

        public final String toString() {
            return this.a;
        }

        public zzc(String str) {
            this.a = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class zzb {
        public zzc a;
        public String b;
        public zza c;
        public zzdo d;

        public /* synthetic */ zzb(int i) {
            this();
        }

        private zzb() {
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcs
    public final boolean a() {
        return this.a != zzc.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzfo)) {
            return false;
        }
        zzfo zzfoVar = (zzfo) obj;
        return zzfoVar.c.equals(this.c) && zzfoVar.d.equals(this.d) && zzfoVar.b.equals(this.b) && zzfoVar.a.equals(this.a);
    }

    public final int hashCode() {
        return Objects.hash(zzfo.class, this.b, this.c, this.d, this.a);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.c);
        return pv1.p(pv1.r("LegacyKmsEnvelopeAead Parameters (kekUri: ", this.b, ", dekParsingStrategy: ", strValueOf, ", dekParametersForNewKeys: "), String.valueOf(this.d), ", variant: ", String.valueOf(this.a), ")");
    }

    public zzfo(zzc zzcVar, String str, zza zzaVar, zzdo zzdoVar) {
        this.a = zzcVar;
        this.b = str;
        this.c = zzaVar;
        this.d = zzdoVar;
    }
}
