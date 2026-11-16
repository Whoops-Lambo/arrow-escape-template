package androidx.compose.foundation.lazy.grid;

import defpackage.n30;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0081@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LineIndex;", "", "value", "", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class LineIndex {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof LineIndex) {
            return this.a == ((LineIndex) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return n30.k("LineIndex(value=", this.a, ')');
    }
}
