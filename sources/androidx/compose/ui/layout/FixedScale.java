package androidx.compose.ui.layout;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/layout/FixedScale;", "Landroidx/compose/ui/layout/ContentScale;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class FixedScale implements ContentScale {
    @Override // androidx.compose.ui.layout.ContentScale
    public final long a(long j, long j2) {
        return ScaleFactorKt.a(1.0f, 1.0f);
    }

    public final boolean equals(Object obj) {
        Object objValueOf = Float.valueOf(1.0f);
        if (this == obj) {
            return true;
        }
        return (obj instanceof FixedScale) && objValueOf.equals(objValueOf);
    }

    public final int hashCode() {
        return Float.hashCode(1.0f);
    }

    public final String toString() {
        return "FixedScale(value=1.0)";
    }
}
