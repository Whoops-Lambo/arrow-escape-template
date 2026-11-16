package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzieg extends zziee {
    public final zziet a = new zziet(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof zzieg) && ((zzieg) obj).a.equals(this.a);
        }
        return true;
    }

    public final zziee h(String str) {
        return (zziee) this.a.get(str);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
