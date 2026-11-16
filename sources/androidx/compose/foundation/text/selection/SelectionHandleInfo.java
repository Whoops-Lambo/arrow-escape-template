package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionHandleInfo;", "", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class SelectionHandleInfo {
    public final Handle a;
    public final long b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectionHandleInfo)) {
            return false;
        }
        SelectionHandleInfo selectionHandleInfo = (SelectionHandleInfo) obj;
        return this.a == selectionHandleInfo.a && Offset.a(this.b, selectionHandleInfo.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = Offset.e;
        return Long.hashCode(this.b) + iHashCode;
    }

    public final String toString() {
        return "SelectionHandleInfo(handle=" + this.a + ", position=" + ((Object) Offset.h(this.b)) + ')';
    }

    public SelectionHandleInfo(Handle handle, long j) {
        this.a = handle;
        this.b = j;
    }
}
