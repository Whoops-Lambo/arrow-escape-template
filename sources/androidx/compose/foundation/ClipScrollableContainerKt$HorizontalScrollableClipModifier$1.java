package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/foundation/ClipScrollableContainerKt$HorizontalScrollableClipModifier$1", "Landroidx/compose/ui/graphics/Shape;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ClipScrollableContainerKt$HorizontalScrollableClipModifier$1 implements Shape {
    @Override // androidx.compose.ui.graphics.Shape
    public final Outline a(long j, LayoutDirection layoutDirection, Density density) {
        layoutDirection.getClass();
        density.getClass();
        Modifier modifier = ClipScrollableContainerKt.a;
        float fMo1roundToPx0680j_4 = density.mo1roundToPx0680j_4(30.0f);
        return new Outline.Rectangle(new Rect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -fMo1roundToPx0680j_4, Size.d(j), Size.b(j) + fMo1roundToPx0680j_4));
    }
}
