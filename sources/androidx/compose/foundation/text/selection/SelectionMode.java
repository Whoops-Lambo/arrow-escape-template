package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionMode;", "", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public enum SelectionMode {
    a { // from class: androidx.compose.foundation.text.selection.SelectionMode.Vertical
        @Override // androidx.compose.foundation.text.selection.SelectionMode
        public final int a(long j, Rect rect) {
            if (rect.a(j)) {
                return 0;
            }
            if (Offset.d(j) >= rect.b) {
                if (Offset.c(j) < rect.a && Offset.d(j) < rect.d) {
                    return -1;
                }
                return 1;
            }
            return -1;
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    EF9 { // from class: androidx.compose.foundation.text.selection.SelectionMode.Horizontal
        @Override // androidx.compose.foundation.text.selection.SelectionMode
        public final int a(long j, Rect rect) {
            throw null;
        }
    };

    public abstract int a(long j, Rect rect);
}
