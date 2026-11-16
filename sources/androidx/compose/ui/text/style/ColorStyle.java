package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.Color;
import defpackage.d;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/style/ColorStyle;", "Landroidx/compose/ui/text/style/TextDrawStyle;", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final /* data */ class ColorStyle implements TextDrawStyle {
    public final long a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ColorStyle) && Color.c(this.a, ((ColorStyle) obj).a);
    }

    @Override // androidx.compose.ui.text.style.TextDrawStyle
    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getA() {
        return this.a;
    }

    public final int hashCode() {
        int i = Color.j;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) Color.i(this.a)) + ')';
    }

    public ColorStyle(long j) {
        this.a = j;
        if (j != Color.i) {
            return;
        }
        d.r("ColorStyle value must be specified, use TextDrawStyle.Unspecified instead.");
        throw null;
    }
}
