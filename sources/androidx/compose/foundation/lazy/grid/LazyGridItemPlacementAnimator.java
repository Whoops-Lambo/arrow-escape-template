package androidx.compose.foundation.lazy.grid;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import defpackage.d;
import defpackage.iu;
import defpackage.tb5;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class LazyGridItemPlacementAnimator {
    public int a;
    public Map b;
    public int c;
    public int d;
    public int e;
    public int f;

    public final int a(int i, int i2, int i3, long j, boolean z, int i4, int i5) {
        if (this.a == 0) {
            d.r("Failed requirement.");
            return 0;
        }
        int i6 = this.e;
        boolean z2 = false;
        boolean z3 = z ? i6 > i : i6 < i;
        int i7 = this.c;
        if (z ? i7 < i : i7 > i) {
            z2 = true;
        }
        if (z3) {
            int iAbs = Math.abs(i - this.e);
            int i8 = this.a;
            return b(j) + (((((iAbs + i8) - 1) / i8) - 1) * i3) + i4 + this.f;
        }
        if (!z2) {
            return i5;
        }
        int iAbs2 = Math.abs(this.c - i);
        int i9 = this.a;
        return b(j) + ((this.d - i2) - (((((iAbs2 + i9) - 1) / i9) - 1) * i3));
    }

    public final int b(long j) {
        int i = IntOffset.c;
        return (int) (j >> 32);
    }

    public final void c(LazyGridPositionedItem lazyGridPositionedItem, ItemInfo itemInfo) {
        ArrayList arrayList;
        char c;
        LazyGridPositionedItem lazyGridPositionedItem2 = lazyGridPositionedItem;
        ItemInfo itemInfo2 = itemInfo;
        boolean z = lazyGridPositionedItem2.l;
        ArrayList arrayList2 = lazyGridPositionedItem2.m;
        while (true) {
            arrayList = itemInfo2.d;
            if (arrayList.size() <= arrayList2.size()) {
                break;
            } else {
                iu.S(arrayList);
            }
        }
        while (true) {
            c = ' ';
            if (arrayList.size() >= arrayList2.size()) {
                break;
            }
            int size = arrayList.size();
            long j = lazyGridPositionedItem2.a;
            long j2 = itemInfo2.c;
            int i = IntOffset.c;
            long jA = IntOffsetKt.a(((int) (j >> 32)) - ((int) (j2 >> 32)), ((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)));
            Placeable placeable = ((LazyGridPlaceableWrapper) arrayList2.get(size)).a;
            arrayList.add(new PlaceableInfo(jA, z ? placeable.b : placeable.a));
        }
        int size2 = arrayList.size();
        int i2 = 0;
        while (i2 < size2) {
            PlaceableInfo placeableInfo = (PlaceableInfo) arrayList.get(i2);
            long j3 = placeableInfo.c;
            long j4 = itemInfo2.c;
            int i3 = IntOffset.c;
            char c2 = c;
            long jA2 = IntOffsetKt.a(((int) (j3 >> c2)) + ((int) (j4 >> c2)), ((int) (j3 & 4294967295L)) + ((int) (j4 & 4294967295L)));
            long j5 = lazyGridPositionedItem2.b;
            Placeable placeable2 = ((LazyGridPlaceableWrapper) arrayList2.get(i2)).a;
            placeableInfo.a = z ? placeable2.b : placeable2.a;
            FiniteAnimationSpec finiteAnimationSpecC = lazyGridPositionedItem2.c(i2);
            if (jA2 != j5) {
                long j6 = itemInfo2.c;
                placeableInfo.c = IntOffsetKt.a(((int) (j5 >> c2)) - ((int) (j6 >> c2)), ((int) (j5 & 4294967295L)) - ((int) (j6 & 4294967295L)));
                if (finiteAnimationSpecC != null) {
                    placeableInfo.d.setValue(Boolean.TRUE);
                    tb5.t(null, null, null, new LazyGridItemPlacementAnimator$startAnimationsIfNeeded$1$1(placeableInfo, finiteAnimationSpecC, null), 3);
                }
            }
            i2++;
            c = c2;
            lazyGridPositionedItem2 = lazyGridPositionedItem;
            itemInfo2 = itemInfo;
        }
    }
}
