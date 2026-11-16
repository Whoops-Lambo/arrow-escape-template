package io.p071bidmachine.rendering.internal.meanbackground;

import defpackage.jc1;
import defpackage.nc2;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class f {
    public final int a;
    public final int b;
    public final nc2 c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return this.a == fVar.a && this.b == fVar.b && this.c == fVar.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + jc1.d(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "Config(maxOffsetPx=" + this.a + ", maxSampleSizePx=" + this.b + ", samplingStrategy=" + this.c + ')';
    }

    public f(int i, int i2, nc2 nc2Var) {
        this.a = i;
        this.b = i2;
        this.c = nc2Var;
    }
}
