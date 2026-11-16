package androidx.compose.ui.geometry;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-geometry_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class RoundRectKt {
    public static final boolean a(RoundRect roundRect) {
        roundRect.getClass();
        long j = roundRect.h;
        long j2 = roundRect.g;
        long j3 = roundRect.f;
        long j4 = roundRect.e;
        if (CornerRadius.b(j4) == CornerRadius.c(j4) && CornerRadius.b(j4) == CornerRadius.b(j3) && CornerRadius.b(j4) == CornerRadius.c(j3) && CornerRadius.b(j4) == CornerRadius.b(j2) && CornerRadius.b(j4) == CornerRadius.c(j2) && CornerRadius.b(j4) == CornerRadius.b(j) && CornerRadius.b(j4) == CornerRadius.c(j)) {
            return true;
        }
        return false;
    }
}
