package io.p071bidmachine.rendering.internal.meanbackground;

import defpackage.h50;
import defpackage.j71;
import defpackage.jc1;
import defpackage.n30;
import defpackage.s71;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class j {
    public final j71 a;
    public final int b;
    public final int c;
    public final j71 d;
    public final float e;
    public final float f;
    public final float g;

    public j() {
        j71 j71Var = new j71(200, 512, 1);
        j71 j71Var2 = new j71(1, 8, 1);
        this.a = j71Var;
        this.b = 5;
        this.c = 25;
        this.d = j71Var2;
        this.e = 0.01f;
        this.f = 0.02f;
        this.g = 0.04f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return s71.b(this.a, jVar.a) && this.b == jVar.b && this.c == jVar.c && s71.b(this.d, jVar.d) && Float.compare(this.e, jVar.e) == 0 && Float.compare(this.f, jVar.f) == 0 && Float.compare(this.g, jVar.g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + n30.b(this.f, n30.b(this.e, (this.d.hashCode() + jc1.d(this.c, jc1.d(this.b, this.a.hashCode() * 31, 31), 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Config(dimensionsRangePx=");
        sb.append(this.a);
        sb.append(", maxOffsetPx=");
        sb.append(this.b);
        sb.append(", maxSampleSizePx=");
        sb.append(this.c);
        sb.append(", sampleStepRangePx=");
        sb.append(this.d);
        sb.append(", detectorAlphaThreshold=");
        sb.append(this.e);
        sb.append(", detectorTolerance=");
        sb.append(this.f);
        sb.append(", detectorBrightnessThreshold=");
        return h50.k(sb, this.g, ')');
    }
}
