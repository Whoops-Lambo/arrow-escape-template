package androidx.compose.animation;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.MeasureScope;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/LayoutModifierWithPassThroughIntrinsics;", "Landroidx/compose/ui/layout/LayoutModifier;", "animation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class LayoutModifierWithPassThroughIntrinsics implements LayoutModifier {
    @Override // androidx.compose.ui.layout.LayoutModifier
    public final int a(MeasureScope measureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        measureScope.getClass();
        intrinsicMeasurable.getClass();
        return intrinsicMeasurable.F(i);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final int j(MeasureScope measureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        measureScope.getClass();
        intrinsicMeasurable.getClass();
        return intrinsicMeasurable.R(i);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final int n(MeasureScope measureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        measureScope.getClass();
        intrinsicMeasurable.getClass();
        return intrinsicMeasurable.p(i);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final int p(MeasureScope measureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        measureScope.getClass();
        intrinsicMeasurable.getClass();
        return intrinsicMeasurable.N(i);
    }
}
