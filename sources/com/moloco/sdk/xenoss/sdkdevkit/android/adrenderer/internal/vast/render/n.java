package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import defpackage.n30;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class n extends p {
    public final long a;
    public final long b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.a == nVar.a && this.b == nVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Position(currentPositionMillis=");
        sb.append(this.a);
        sb.append(", totalDurationMillis=");
        return n30.o(sb, this.b, ')');
    }

    public n(long j, long j2) {
        this.a = j;
        this.b = j2;
    }
}
