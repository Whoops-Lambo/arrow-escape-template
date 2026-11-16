package androidx.compose.foundation.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/TextLayoutResultProxy;", "", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class TextLayoutResultProxy {
    public final TextLayoutResult a;
    public LayoutCoordinates b;
    public LayoutCoordinates c;

    public final long a(long j) {
        Rect rectK;
        LayoutCoordinates layoutCoordinates = this.b;
        Rect rect = Rect.e;
        if (layoutCoordinates != null) {
            if (layoutCoordinates.s()) {
                LayoutCoordinates layoutCoordinates2 = this.c;
                rectK = layoutCoordinates2 != null ? layoutCoordinates2.k(layoutCoordinates, true) : null;
            } else {
                rectK = rect;
            }
            if (rectK != null) {
                rect = rectK;
            }
        }
        float fC = Offset.c(j);
        float fC2 = rect.a;
        if (fC >= fC2) {
            float fC3 = Offset.c(j);
            fC2 = rect.c;
            if (fC3 <= fC2) {
                fC2 = Offset.c(j);
            }
        }
        float fD = Offset.d(j);
        float fD2 = rect.b;
        if (fD >= fD2) {
            float fD3 = Offset.d(j);
            fD2 = rect.d;
            if (fD3 <= fD2) {
                fD2 = Offset.d(j);
            }
        }
        return OffsetKt.a(fC2, fD2);
    }

    public final int b(long j, boolean z) {
        if (z) {
            j = a(j);
        }
        return this.a.j(c(j));
    }

    public final long c(long j) {
        Offset offset;
        LayoutCoordinates layoutCoordinates = this.b;
        if (layoutCoordinates != null) {
            LayoutCoordinates layoutCoordinates2 = this.c;
            if (layoutCoordinates2 != null) {
                offset = new Offset((layoutCoordinates.s() && layoutCoordinates2.s()) ? layoutCoordinates.r(layoutCoordinates2, j) : j);
            } else {
                offset = null;
            }
            if (offset != null) {
                return offset.a;
            }
        }
        return j;
    }

    public TextLayoutResultProxy(TextLayoutResult textLayoutResult) {
        this.a = textLayoutResult;
    }
}
