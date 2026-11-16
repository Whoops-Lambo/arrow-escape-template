package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzfok implements zzfoi {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof zzfok) {
            return this.a.equals(((zzfok) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }

    public zzfok(String str) {
        this.a = str;
    }
}
