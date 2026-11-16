package androidx.compose.ui.text.font;

import defpackage.n30;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/text/font/FontLoadingStrategy;", "", "Companion", "value", "", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class FontLoadingStrategy {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/font/FontLoadingStrategy$Companion;", "", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    public final int hashCode() {
        return Integer.hashCode(0);
    }

    public final String toString() {
        return a(0);
    }

    public static String a(int i) {
        if (i == 0) {
            return "Blocking";
        }
        if (i == 1) {
            return "Optional";
        }
        return i == 2 ? "Async" : n30.k("Invalid(value=", i, ')');
    }

    public final boolean equals(Object obj) {
        return obj instanceof FontLoadingStrategy;
    }
}
