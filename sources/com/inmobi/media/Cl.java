package com.inmobi.media;

import defpackage.pv1;
import defpackage.s71;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class Cl extends Dl {
    public final String a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Cl) && s71.b(this.a, ((Cl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return pv1.n("NoContent(collectorId=", this.a, ")");
    }

    public Cl(String str) {
        str.getClass();
        this.a = str;
    }
}
