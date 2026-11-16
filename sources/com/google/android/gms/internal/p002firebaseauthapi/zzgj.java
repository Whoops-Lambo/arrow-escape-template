package com.google.android.gms.internal.p002firebaseauthapi;

import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgj extends zzdo {
    public final zza a;
    public final int b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class zza {
        public static final zza b = new zza("TINK");
        public static final zza c = new zza("NO_PREFIX");
        public final String a;

        public final String toString() {
            return this.a;
        }

        public zza(String str) {
            this.a = str;
        }
    }

    public static zzgj b(zza zzaVar, int i) throws GeneralSecurityException {
        if (i >= 8 && i <= 12) {
            return new zzgj(zzaVar, i);
        }
        e.d("Salt size must be between 8 and 12 bytes");
        return null;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcs
    public final boolean a() {
        return this.a != zza.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgj)) {
            return false;
        }
        zzgj zzgjVar = (zzgj) obj;
        return zzgjVar.a == this.a && zzgjVar.b == this.b;
    }

    public final int hashCode() {
        return Objects.hash(zzgj.class, this.a, Integer.valueOf(this.b));
    }

    public final String toString() {
        return "X-AES-GCM Parameters (variant: " + String.valueOf(this.a) + "salt_size_bytes: " + this.b + ")";
    }

    public zzgj(zza zzaVar, int i) {
        this.a = zzaVar;
        this.b = i;
    }
}
