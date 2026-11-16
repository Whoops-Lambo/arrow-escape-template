package androidx.compose.ui.layout;

import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/layout/DefaultIntrinsicMeasurable;", "Landroidx/compose/ui/layout/Measurable;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class DefaultIntrinsicMeasurable implements Measurable {
    public final IntrinsicMeasurable a;
    public final IntrinsicMinMax b;
    public final IntrinsicWidthHeight c;

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int F(int i) {
        return this.a.F(i);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int N(int i) {
        return this.a.N(i);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int R(int i) {
        return this.a.R(i);
    }

    @Override // androidx.compose.ui.layout.Measurable
    public final Placeable Y(long j) {
        IntrinsicMeasurable intrinsicMeasurable = this.a;
        IntrinsicMinMax intrinsicMinMax = IntrinsicMinMax.b;
        IntrinsicWidthHeight intrinsicWidthHeight = this.c;
        IntrinsicWidthHeight intrinsicWidthHeight2 = IntrinsicWidthHeight.a;
        IntrinsicMinMax intrinsicMinMax2 = this.b;
        if (intrinsicWidthHeight == intrinsicWidthHeight2) {
            return new FixedSizeIntrinsicsPlaceable(intrinsicMinMax2 == intrinsicMinMax ? intrinsicMeasurable.R(Constraints.g(j)) : intrinsicMeasurable.N(Constraints.g(j)), Constraints.g(j));
        }
        return new FixedSizeIntrinsicsPlaceable(Constraints.h(j), intrinsicMinMax2 == intrinsicMinMax ? intrinsicMeasurable.p(Constraints.h(j)) : intrinsicMeasurable.F(Constraints.h(j)));
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final Object a() {
        return this.a.a();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int p(int i) {
        return this.a.p(i);
    }

    public DefaultIntrinsicMeasurable(IntrinsicMeasurable intrinsicMeasurable, IntrinsicMinMax intrinsicMinMax, IntrinsicWidthHeight intrinsicWidthHeight) {
        intrinsicMeasurable.getClass();
        this.a = intrinsicMeasurable;
        this.b = intrinsicMinMax;
        this.c = intrinsicWidthHeight;
    }
}
