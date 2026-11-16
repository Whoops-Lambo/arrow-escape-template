package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzbgz {
    public final long a;
    public final String b;
    public final int c;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbgz)) {
            return false;
        }
        zzbgz zzbgzVar = (zzbgz) obj;
        return zzbgzVar.a == this.a && zzbgzVar.c == this.c;
    }

    public final int hashCode() {
        return (int) this.a;
    }

    public zzbgz(int i, long j, String str) {
        this.a = j;
        this.b = str;
        this.c = i;
    }
}
