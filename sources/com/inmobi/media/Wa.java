package com.inmobi.media;

import defpackage.s71;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Wa extends AbstractC3878ab {
    public final Vg a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Wa) && s71.b(this.a, ((Wa) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Duplicate(ping=" + this.a + ")";
    }

    public Wa(Vg vg) {
        vg.getClass();
        this.a = vg;
    }
}
