package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.n30;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfh extends zzdo {
    public final String a;
    public final zza b;

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

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcs
    public final boolean a() {
        return this.b != zza.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzfh)) {
            return false;
        }
        zzfh zzfhVar = (zzfh) obj;
        return zzfhVar.a.equals(this.a) && zzfhVar.b.equals(this.b);
    }

    public final int hashCode() {
        return Objects.hash(zzfh.class, this.a, this.b);
    }

    public final String toString() {
        return n30.n("LegacyKmsAead Parameters (keyUri: ", this.a, ", variant: ", String.valueOf(this.b), ")");
    }

    public zzfh(String str, zza zzaVar) {
        this.a = str;
        this.b = zzaVar;
    }
}
