package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/selection/TextSelectionColors;", "", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class TextSelectionColors {
    public final long a;
    public final long b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextSelectionColors)) {
            return false;
        }
        TextSelectionColors textSelectionColors = (TextSelectionColors) obj;
        return Color.c(this.a, textSelectionColors.a) && Color.c(this.b, textSelectionColors.b);
    }

    public final int hashCode() {
        int i = Color.j;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "SelectionColors(selectionHandleColor=" + ((Object) Color.i(this.a)) + ", selectionBackgroundColor=" + ((Object) Color.i(this.b)) + ')';
    }

    public TextSelectionColors(long j, long j2) {
        this.a = j;
        this.b = j2;
    }
}
