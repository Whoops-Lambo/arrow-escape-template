package androidx.compose.ui.text.font;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/font/ResourceFont;", "Landroidx/compose/ui/text/font/Font;", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ResourceFont implements Font {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ResourceFont);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "ResourceFont(resId=0, weight=null, style=" + ((Object) FontStyle.a(0)) + ", loadingStrategy=" + ((Object) FontLoadingStrategy.a(0)) + ')';
    }
}
