package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.node.LayoutNode$measureScope$1;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bç\u0080\u0001\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/MeasurePolicy;", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface MeasurePolicy {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    MeasureResult a(MeasureScope measureScope, List list, long j);

    default int b(LayoutNode$measureScope$1 layoutNode$measureScope$1, List list, int i) {
        layoutNode$measureScope$1.getClass();
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new DefaultIntrinsicMeasurable((IntrinsicMeasurable) list.get(i2), IntrinsicMinMax.b, IntrinsicWidthHeight.a));
        }
        return a(new IntrinsicsMeasureScope(layoutNode$measureScope$1, layoutNode$measureScope$1.a.r), arrayList, ConstraintsKt.b(0, i, 7)).getA();
    }

    default int c(LayoutNode$measureScope$1 layoutNode$measureScope$1, List list, int i) {
        layoutNode$measureScope$1.getClass();
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new DefaultIntrinsicMeasurable((IntrinsicMeasurable) list.get(i2), IntrinsicMinMax.a, IntrinsicWidthHeight.a));
        }
        return a(new IntrinsicsMeasureScope(layoutNode$measureScope$1, layoutNode$measureScope$1.a.r), arrayList, ConstraintsKt.b(0, i, 7)).getA();
    }

    default int d(LayoutNode$measureScope$1 layoutNode$measureScope$1, List list, int i) {
        layoutNode$measureScope$1.getClass();
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new DefaultIntrinsicMeasurable((IntrinsicMeasurable) list.get(i2), IntrinsicMinMax.b, IntrinsicWidthHeight.b));
        }
        return a(new IntrinsicsMeasureScope(layoutNode$measureScope$1, layoutNode$measureScope$1.a.r), arrayList, ConstraintsKt.b(i, 0, 13)).getB();
    }

    default int e(LayoutNode$measureScope$1 layoutNode$measureScope$1, List list, int i) {
        layoutNode$measureScope$1.getClass();
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new DefaultIntrinsicMeasurable((IntrinsicMeasurable) list.get(i2), IntrinsicMinMax.a, IntrinsicWidthHeight.b));
        }
        return a(new IntrinsicsMeasureScope(layoutNode$measureScope$1, layoutNode$measureScope$1.a.r), arrayList, ConstraintsKt.b(i, 0, 13)).getB();
    }
}
