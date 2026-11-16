package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzaac {
    public final long a;
    public final long b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaac)) {
            return false;
        }
        zzaac zzaacVar = (zzaac) obj;
        return this.a == zzaacVar.a && this.b == zzaacVar.b;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }

    public zzaac(long j, long j2) {
        this.a = j;
        this.b = j2;
    }
}
