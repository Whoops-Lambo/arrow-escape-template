package com.inmobi.media;

import defpackage.e80;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class Fa {
    private final boolean GPID;

    public /* synthetic */ Fa(boolean z, int i, e80 e80Var) {
        this((i & 1) != 0 ? true : z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Fa) && this.GPID == ((Fa) obj).GPID;
    }

    public final boolean a() {
        return this.GPID;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.GPID);
    }

    public final String toString() {
        return "IncludeIdParams(GPID=" + this.GPID + ")";
    }

    public Fa(boolean z) {
        this.GPID = z;
    }

    public Fa() {
        this(false, 1, null);
    }
}
