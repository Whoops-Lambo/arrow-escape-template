package androidx.compose.foundation.layout;

import defpackage.h50;
import defpackage.jc1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/OrientationIndependentConstraints;", "", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class OrientationIndependentConstraints {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrientationIndependentConstraints)) {
            return false;
        }
        OrientationIndependentConstraints orientationIndependentConstraints = (OrientationIndependentConstraints) obj;
        return this.a == orientationIndependentConstraints.a && this.b == orientationIndependentConstraints.b && this.c == orientationIndependentConstraints.c && this.d == orientationIndependentConstraints.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + jc1.d(this.c, jc1.d(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrientationIndependentConstraints(mainAxisMin=");
        sb.append(this.a);
        sb.append(", mainAxisMax=");
        sb.append(this.b);
        sb.append(", crossAxisMin=");
        sb.append(this.c);
        sb.append(", crossAxisMax=");
        return h50.l(sb, this.d, ')');
    }

    public OrientationIndependentConstraints(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }
}
