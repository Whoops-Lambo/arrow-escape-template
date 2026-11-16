package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Size;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/layout/ContentScale$Companion$FillHeight$1", "Landroidx/compose/ui/layout/ContentScale;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ContentScale$Companion$FillHeight$1 implements ContentScale {
    @Override // androidx.compose.ui.layout.ContentScale
    public final long a(long j, long j2) {
        float fB = Size.b(j2) / Size.b(j);
        return ScaleFactorKt.a(fB, fB);
    }
}
