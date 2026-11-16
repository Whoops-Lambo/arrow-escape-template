package io.p071bidmachine.rendering.internal.meanbackground;

import defpackage.h50;
import defpackage.n30;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class g {
    public final Integer a;
    public final float b;
    public final float c;
    public final float d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.a.equals(gVar.a) && Float.compare(this.b, gVar.b) == 0 && Float.compare(this.c, gVar.c) == 0 && Float.compare(this.d, gVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + n30.b(this.c, n30.b(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Config(backgroundColor=");
        sb.append(this.a);
        sb.append(", alphaThreshold=");
        sb.append(this.b);
        sb.append(", tolerance=");
        sb.append(this.c);
        sb.append(", brightnessThreshold=");
        return h50.k(sb, this.d, ')');
    }

    public g(Integer num, float f, float f2, float f3) {
        this.a = num;
        this.b = f;
        this.c = f2;
        this.d = f3;
    }
}
