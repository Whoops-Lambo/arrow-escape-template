package androidx.compose.material.ripple;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material-ripple_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class RippleAnimationKt {
    public static final float a(LayoutNodeDrawScope layoutNodeDrawScope, boolean z, long j) {
        float fB = Offset.b(OffsetKt.a(Size.d(j), Size.b(j))) / 2.0f;
        if (z) {
            return layoutNodeDrawScope.mo7toPx0680j_4(10.0f) + fB;
        }
        return fB;
    }
}
