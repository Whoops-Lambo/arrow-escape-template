package io.p071bidmachine.rendering.internal.meanbackground;

import defpackage.jc1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class q {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.a == qVar.a && this.b == qVar.b && this.c == qVar.c && this.d == qVar.d;
    }

    public final int hashCode() {
        return p.b.hashCode() + jc1.d(this.d, jc1.d(this.c, jc1.d(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "Config(defaultColor=" + this.a + ", maxDimensionPx=" + this.b + ", minSampleStepPx=" + this.c + ", maxSampleStepPx=" + this.d + ", samplingStrategy=" + p.b + ')';
    }

    public q(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }
}
