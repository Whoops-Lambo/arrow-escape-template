package androidx.compose.ui.text;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import defpackage.pv1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/Placeholder;", "", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class Placeholder {
    public final boolean equals(Object obj) {
        boolean zA = TextUnit.a(0L, 0L);
        if (this == obj) {
            return true;
        }
        return (obj instanceof Placeholder) && zA && zA;
    }

    public final int hashCode() {
        TextUnitType[] textUnitTypeArr = TextUnit.b;
        return Integer.hashCode(0) + pv1.d(Long.hashCode(0L) * 31, 31, 0L);
    }

    public final String toString() {
        return "Placeholder(width=" + ((Object) TextUnit.d(0L)) + ", height=" + ((Object) TextUnit.d(0L)) + ", placeholderVerticalAlign=Invalid)";
    }
}
