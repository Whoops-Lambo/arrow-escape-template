package com.inmobi.media;

import defpackage.s71;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class Za extends AbstractC3878ab {
    public final Vg a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Za) && s71.b(this.a, ((Za) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Rejected(ping=" + this.a + ")";
    }

    public Za(Vg vg) {
        vg.getClass();
        this.a = vg;
    }
}
