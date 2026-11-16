package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.pv1;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgq extends zzdo {
    public final zza a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class zza {
        public static final zza b = new zza("TINK");
        public static final zza c = new zza("CRUNCHY");
        public static final zza d = new zza("NO_PREFIX");
        public final String a;

        public final String toString() {
            return this.a;
        }

        public zza(String str) {
            this.a = str;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcs
    public final boolean a() {
        return this.a != zza.d;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzgq) && ((zzgq) obj).a == this.a;
    }

    public final int hashCode() {
        return Objects.hash(zzgq.class, this.a);
    }

    public final String toString() {
        return pv1.n("XChaCha20Poly1305 Parameters (variant: ", String.valueOf(this.a), ")");
    }

    public zzgq(zza zzaVar) {
        this.a = zzaVar;
    }
}
