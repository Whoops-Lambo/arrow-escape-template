package androidx.compose.ui.input.pointer.util;

import androidx.compose.ui.geometry.Offset;
import defpackage.n30;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/input/pointer/util/PointAtTime;", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final /* data */ class PointAtTime {
    public final long a;
    public final long b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointAtTime)) {
            return false;
        }
        PointAtTime pointAtTime = (PointAtTime) obj;
        return Offset.a(this.a, pointAtTime.a) && this.b == pointAtTime.b;
    }

    public final int hashCode() {
        int i = Offset.e;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointAtTime(point=");
        sb.append((Object) Offset.h(this.a));
        sb.append(", time=");
        return n30.o(sb, this.b, ')');
    }

    public PointAtTime(long j, long j2) {
        this.a = j;
        this.b = j2;
    }
}
