package io.p071bidmachine.rendering.internal.meanbackground;

import defpackage.nc2;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class a {
    public final nc2 a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.a == ((a) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode() + (Integer.hashCode(35) * 31);
    }

    public final String toString() {
        return "Config(minContentDimensionPx=35, samplingStrategy=" + this.a + ')';
    }

    public a(nc2 nc2Var) {
        this.a = nc2Var;
    }
}
