package androidx.compose.ui.geometry;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-geometry_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class RectKt {
    public static final Rect a(long j, long j2) {
        return new Rect(Offset.c(j), Offset.d(j), Size.d(j2) + Offset.c(j), Size.b(j2) + Offset.d(j));
    }
}
