package io.p071bidmachine.rendering.model.engagedclick;

import io.p071bidmachine.media3.common.util.b;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class d {
    public final int a;
    public final a b;
    public final int c;
    public final Double d;
    public final Double e;
    public final long f;

    public d(int i, a aVar, int i2, Double d, Double d2, long j) {
        if (i == 0 || i2 == 0) {
            throw null;
        }
        this.a = i;
        this.b = aVar;
        this.c = i2;
        this.d = d;
        this.e = d2;
        this.f = j;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("engagedClickAction - ");
        int i = this.a;
        if (i == 1) {
            str = "EXPAND";
        } else if (i != 2) {
            str = i != 3 ? "null" : "VISUAL_DIFF";
        } else {
            str = "COLLAPSE";
        }
        sb.append(str);
        sb.append(", profile - ");
        sb.append(this.b);
        sb.append(", source - ");
        sb.append(b.i(this.c));
        sb.append(", diffScore - ");
        sb.append(this.d);
        sb.append(", ambientDiff - ");
        sb.append(this.e);
        sb.append(", interactionDurationMs - ");
        sb.append(this.f);
        return sb.toString();
    }
}
