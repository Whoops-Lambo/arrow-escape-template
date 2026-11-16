package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/style/BrushStyle;", "Landroidx/compose/ui/text/style/TextDrawStyle;", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final /* data */ class BrushStyle implements TextDrawStyle {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof BrushStyle);
    }

    public final int hashCode() {
        throw null;
    }

    @Override // androidx.compose.ui.text.style.TextDrawStyle
    /* JADX INFO: renamed from: a */
    public final long getA() {
        int i = Color.j;
        return Color.i;
    }

    public final String toString() {
        return "BrushStyle(value=null)";
    }
}
