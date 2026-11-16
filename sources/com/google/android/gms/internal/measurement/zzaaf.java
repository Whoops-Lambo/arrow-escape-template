package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzaaf {
    public final zzabn a;
    public final String b;

    public final boolean equals(Object obj) {
        if (obj instanceof zzaaf) {
            zzaaf zzaafVar = (zzaaf) obj;
            if (this.a.equals(zzaafVar.a) && this.b.equals(zzaafVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ this.a.hashCode();
    }

    public zzaaf(zzabn zzabnVar, String str) {
        zzabr.a(zzabnVar, "parser");
        this.a = zzabnVar;
        this.b = str;
    }
}
