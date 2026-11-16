package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zznp {
    public static final zznp b = new zznp(new zzno());
    public final zzgzl a;

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.a, null, null, bool, bool, bool, bool, bool);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zznp) && this.a.equals(((zznp) obj).a);
    }

    public zznp(zzno zznoVar) {
        this.a = zznoVar.a;
    }
}
