package com.inmobi.media;

import defpackage.cz;
import defpackage.s71;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class Rp {
    public final cz a;
    public final int b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rp)) {
            return false;
        }
        Rp rp = (Rp) obj;
        return s71.b(this.a, rp.a) && this.b == rp.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ViewabilityTrackerConfig(coroutineScope=" + this.a + ", impressionMinDuration=" + this.b + ")";
    }

    public Rp(cz czVar, int i) {
        czVar.getClass();
        this.a = czVar;
        this.b = i;
    }
}
