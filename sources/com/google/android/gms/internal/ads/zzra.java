package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzra {
    public static final zzra d = new zzqz().a();
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzra.class != obj.getClass()) {
            return false;
        }
        zzra zzraVar = (zzra) obj;
        return this.a == zzraVar.a && this.b == zzraVar.b && this.c == zzraVar.c;
    }

    public final int hashCode() {
        int i = (this.a ? 1 : 0) << 2;
        boolean z = this.b;
        return (z ? 1 : 0) + (z ? 1 : 0) + i + (this.c ? 1 : 0);
    }

    public /* synthetic */ zzra(zzqz zzqzVar) {
        this.a = zzqzVar.a;
        this.b = zzqzVar.b;
        this.c = zzqzVar.c;
    }
}
