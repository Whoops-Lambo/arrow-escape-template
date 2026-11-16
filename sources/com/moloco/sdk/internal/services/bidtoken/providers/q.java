package com.moloco.sdk.internal.services.bidtoken.providers;

import defpackage.s71;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class q {
    public final Boolean a;
    public final Long b;
    public final Long c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return s71.b(this.a, qVar.a) && s71.b(this.b, qVar.b) && s71.b(this.c, qVar.c);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.c;
        return iHashCode2 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        return "MemoryInfoSignal(lowMemory=" + this.a + ", threshold=" + this.b + ", totalMem=" + this.c + ')';
    }

    public q(Boolean bool, Long l, Long l2) {
        this.a = bool;
        this.b = l;
        this.c = l2;
    }
}
