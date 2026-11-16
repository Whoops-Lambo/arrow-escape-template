package androidx.compose.ui.text.font;

import defpackage.d;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/font/AndroidAssetFont;", "Landroidx/compose/ui/text/font/AndroidPreloadedFont;", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class AndroidAssetFont extends AndroidPreloadedFont {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AndroidAssetFont.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            return true;
        }
        d.w("null cannot be cast to non-null type androidx.compose.ui.text.font.AndroidAssetFont");
        return false;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "Font(assetManager, path=null, weight=null, style=" + ((Object) FontStyle.a(0)) + ')';
    }
}
