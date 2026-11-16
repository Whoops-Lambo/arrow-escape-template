package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zznq {
    public static final zznq b;
    public static final zznq c;
    public final long a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zznq.class == obj.getClass() && this.a == ((zznq) obj).a;
    }

    static {
        zznq zznqVar = new zznq(0L);
        b = new zznq(Long.MAX_VALUE);
        c = zznqVar;
    }

    public final int hashCode() {
        return ((int) this.a) * 31;
    }

    public zznq(long j) {
        this.a = j;
    }
}
