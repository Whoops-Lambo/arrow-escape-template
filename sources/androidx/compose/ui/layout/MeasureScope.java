package androidx.compose.ui.layout;

import androidx.compose.ui.unit.LayoutDirection;
import defpackage.wr0;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface MeasureScope extends IntrinsicMeasureScope {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    default MeasureResult C(final int i, final int i2, final Map map, final wr0 wr0Var) {
        wr0Var.getClass();
        return new MeasureResult(i, i2, map, this, wr0Var) { // from class: androidx.compose.ui.layout.MeasureScope$layout$1
            public final int a;
            public final int b;
            public final Map c;
            public final /* synthetic */ int d;
            public final /* synthetic */ MeasureScope e;
            public final /* synthetic */ wr0 f;

            @Override // androidx.compose.ui.layout.MeasureResult
            /* JADX INFO: renamed from: c, reason: from getter */
            public final Map getC() {
                return this.c;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public final void d() {
                LayoutDirection layoutDirection = this.e.getLayoutDirection();
                int i3 = Placeable.PlacementScope.c;
                LayoutDirection layoutDirection2 = Placeable.PlacementScope.b;
                Placeable.PlacementScope.c = this.d;
                Placeable.PlacementScope.b = layoutDirection;
                this.f.invoke(Placeable.PlacementScope.a);
                Placeable.PlacementScope.c = i3;
                Placeable.PlacementScope.b = layoutDirection2;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            /* JADX INFO: renamed from: getHeight, reason: from getter */
            public final int getB() {
                return this.b;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            /* JADX INFO: renamed from: getWidth, reason: from getter */
            public final int getA() {
                return this.a;
            }

            {
                this.d = i;
                this.e = this;
                this.f = wr0Var;
                this.a = i;
                this.b = i2;
                this.c = map;
            }
        };
    }
}
