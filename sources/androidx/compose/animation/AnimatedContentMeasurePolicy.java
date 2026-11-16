package androidx.compose.animation;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNode$measureScope$1;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/AnimatedContentMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "animation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class AnimatedContentMeasurePolicy implements MeasurePolicy {
    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult a(MeasureScope measureScope, List list, long j) {
        Placeable placeable;
        int i;
        int i2;
        int i3;
        Placeable placeable2;
        int i4;
        int i5;
        measureScope.getClass();
        list.getClass();
        int size = list.size();
        Placeable[] placeableArr = new Placeable[size];
        int size2 = list.size();
        int i6 = 0;
        for (int i7 = 0; i7 < size2; i7++) {
            ((Measurable) list.get(i7)).a();
        }
        int size3 = list.size();
        for (int i8 = 0; i8 < size3; i8++) {
            Measurable measurable = (Measurable) list.get(i8);
            if (placeableArr[i8] == null) {
                placeableArr[i8] = measurable.Y(j);
            }
        }
        int i9 = 1;
        if (size == 0) {
            placeable = null;
        } else {
            placeable = placeableArr[0];
            int i10 = size - 1;
            if (i10 != 0) {
                if (placeable != null) {
                    i = placeable.a;
                } else {
                    i = 0;
                }
                if (1 <= i10) {
                    int i11 = 1;
                    while (true) {
                        Placeable placeable3 = placeableArr[i11];
                        if (placeable3 != null) {
                            i2 = placeable3.a;
                        } else {
                            i2 = 0;
                        }
                        if (i < i2) {
                            placeable = placeable3;
                            i = i2;
                        }
                        if (i11 == i10) {
                            break;
                        }
                        i11++;
                    }
                }
            }
        }
        if (placeable != null) {
            i3 = placeable.a;
        } else {
            i3 = 0;
        }
        if (size == 0) {
            placeable2 = null;
        } else {
            placeable2 = placeableArr[0];
            int i12 = size - 1;
            if (i12 != 0) {
                if (placeable2 != null) {
                    i4 = placeable2.b;
                } else {
                    i4 = 0;
                }
                if (1 <= i12) {
                    while (true) {
                        Placeable placeable4 = placeableArr[i9];
                        if (placeable4 != null) {
                            i5 = placeable4.b;
                        } else {
                            i5 = 0;
                        }
                        if (i4 < i5) {
                            placeable2 = placeable4;
                            i4 = i5;
                        }
                        if (i9 == i12) {
                            break;
                        }
                        i9++;
                    }
                }
            }
        }
        if (placeable2 != null) {
            i6 = placeable2.b;
        }
        new IntSize(IntSizeKt.a(i3, i6));
        throw null;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int b(LayoutNode$measureScope$1 layoutNode$measureScope$1, List list, int i) {
        Comparable comparable;
        layoutNode$measureScope$1.getClass();
        AnimatedContentMeasurePolicy$maxIntrinsicWidth$1 animatedContentMeasurePolicy$maxIntrinsicWidth$1 = new AnimatedContentMeasurePolicy$maxIntrinsicWidth$1(i);
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            comparable = null;
        } else {
            Comparable comparable2 = (Comparable) animatedContentMeasurePolicy$maxIntrinsicWidth$1.invoke(it.next());
            while (it.hasNext()) {
                Comparable comparable3 = (Comparable) animatedContentMeasurePolicy$maxIntrinsicWidth$1.invoke(it.next());
                if (comparable2.compareTo(comparable3) < 0) {
                    comparable2 = comparable3;
                }
            }
            comparable = comparable2;
        }
        Integer num = (Integer) comparable;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int c(LayoutNode$measureScope$1 layoutNode$measureScope$1, List list, int i) {
        Comparable comparable;
        layoutNode$measureScope$1.getClass();
        AnimatedContentMeasurePolicy$minIntrinsicWidth$1 animatedContentMeasurePolicy$minIntrinsicWidth$1 = new AnimatedContentMeasurePolicy$minIntrinsicWidth$1(i);
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            comparable = null;
        } else {
            Comparable comparable2 = (Comparable) animatedContentMeasurePolicy$minIntrinsicWidth$1.invoke(it.next());
            while (it.hasNext()) {
                Comparable comparable3 = (Comparable) animatedContentMeasurePolicy$minIntrinsicWidth$1.invoke(it.next());
                if (comparable2.compareTo(comparable3) < 0) {
                    comparable2 = comparable3;
                }
            }
            comparable = comparable2;
        }
        Integer num = (Integer) comparable;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int d(LayoutNode$measureScope$1 layoutNode$measureScope$1, List list, int i) {
        Comparable comparable;
        layoutNode$measureScope$1.getClass();
        AnimatedContentMeasurePolicy$maxIntrinsicHeight$1 animatedContentMeasurePolicy$maxIntrinsicHeight$1 = new AnimatedContentMeasurePolicy$maxIntrinsicHeight$1(i);
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            comparable = null;
        } else {
            Comparable comparable2 = (Comparable) animatedContentMeasurePolicy$maxIntrinsicHeight$1.invoke(it.next());
            while (it.hasNext()) {
                Comparable comparable3 = (Comparable) animatedContentMeasurePolicy$maxIntrinsicHeight$1.invoke(it.next());
                if (comparable2.compareTo(comparable3) < 0) {
                    comparable2 = comparable3;
                }
            }
            comparable = comparable2;
        }
        Integer num = (Integer) comparable;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int e(LayoutNode$measureScope$1 layoutNode$measureScope$1, List list, int i) {
        Comparable comparable;
        layoutNode$measureScope$1.getClass();
        AnimatedContentMeasurePolicy$minIntrinsicHeight$1 animatedContentMeasurePolicy$minIntrinsicHeight$1 = new AnimatedContentMeasurePolicy$minIntrinsicHeight$1(i);
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            comparable = null;
        } else {
            Comparable comparable2 = (Comparable) animatedContentMeasurePolicy$minIntrinsicHeight$1.invoke(it.next());
            while (it.hasNext()) {
                Comparable comparable3 = (Comparable) animatedContentMeasurePolicy$minIntrinsicHeight$1.invoke(it.next());
                if (comparable2.compareTo(comparable3) < 0) {
                    comparable2 = comparable3;
                }
            }
            comparable = comparable2;
        }
        Integer num = (Integer) comparable;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
