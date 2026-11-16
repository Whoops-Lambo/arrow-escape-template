package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import defpackage.du;
import defpackage.iu;
import defpackage.j71;
import defpackage.tb5;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;", "", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class LazyListItemPlacementAnimator {
    public Map a;
    public int b;
    public int c;
    public int d;
    public int e;

    public final int a(int i, int i2, int i3, long j, boolean z, int i4, int i5, ArrayList arrayList) {
        int i6 = this.d;
        int iB = 0;
        boolean z2 = z ? i6 > i : i6 < i;
        int i7 = this.b;
        boolean z3 = z ? i7 < i : i7 > i;
        if (z2) {
            j71 j71VarD = !z ? tb5.D(i6 + 1, i) : tb5.D(i + 1, i6);
            int i8 = j71VarD.a;
            int i9 = j71VarD.b;
            if (i8 <= i9) {
                while (true) {
                    iB += b(arrayList, i8, i3);
                    if (i8 == i9) {
                        break;
                    }
                    i8++;
                }
            }
            return c(j) + i4 + this.e + iB;
        }
        if (!z3) {
            return i5;
        }
        j71 j71VarD2 = !z ? tb5.D(i + 1, i7) : tb5.D(i7 + 1, i);
        int i10 = j71VarD2.a;
        int i11 = j71VarD2.b;
        if (i10 <= i11) {
            while (true) {
                i2 += b(arrayList, i10, i3);
                if (i10 == i11) {
                    break;
                }
                i10++;
            }
        }
        return c(j) + (this.c - i2);
    }

    public final int c(long j) {
        int i = IntOffset.c;
        return (int) (j >> 32);
    }

    public final void d(LazyListPositionedItem lazyListPositionedItem, ItemInfo itemInfo) {
        ArrayList arrayList;
        long j;
        long j2;
        ArrayList arrayList2 = lazyListPositionedItem.i;
        while (true) {
            arrayList = itemInfo.b;
            if (arrayList.size() <= arrayList2.size()) {
                break;
            } else {
                iu.S(arrayList);
            }
        }
        while (true) {
            j = 4294967295L;
            if (arrayList.size() >= arrayList2.size()) {
                break;
            }
            int size = arrayList.size();
            long jC = lazyListPositionedItem.c(size);
            long j3 = itemInfo.a;
            int i = IntOffset.c;
            arrayList.add(new PlaceableInfo(IntOffsetKt.a(((int) (jC >> 32)) - ((int) (j3 >> 32)), ((int) (jC & 4294967295L)) - ((int) (4294967295L & j3))), lazyListPositionedItem.b(size)));
        }
        int size2 = arrayList.size();
        int i2 = 0;
        while (i2 < size2) {
            PlaceableInfo placeableInfo = (PlaceableInfo) arrayList.get(i2);
            long j4 = placeableInfo.c;
            long j5 = itemInfo.a;
            int i3 = IntOffset.c;
            long jA = IntOffsetKt.a(((int) (j4 >> 32)) + ((int) (j5 >> 32)), ((int) (j4 & j)) + ((int) (j5 & j)));
            long jC2 = lazyListPositionedItem.c(i2);
            placeableInfo.a = lazyListPositionedItem.b(i2);
            FiniteAnimationSpec finiteAnimationSpecA = lazyListPositionedItem.a(i2);
            if (jA == jC2) {
                j2 = j;
            } else {
                long j6 = itemInfo.a;
                j2 = j;
                placeableInfo.c = IntOffsetKt.a(((int) (jC2 >> 32)) - ((int) (j6 >> 32)), ((int) (jC2 & j2)) - ((int) (j6 & j2)));
                if (finiteAnimationSpecA != null) {
                    placeableInfo.d.setValue(Boolean.TRUE);
                    tb5.t(null, null, null, new LazyListItemPlacementAnimator$startAnimationsIfNeeded$1$1(placeableInfo, finiteAnimationSpecA, null), 3);
                }
            }
            i2++;
            j = j2;
        }
    }

    public static int b(ArrayList arrayList, int i, int i2) {
        int i3;
        if (!arrayList.isEmpty() && i >= ((LazyListPositionedItem) du.a0(arrayList)).b && i <= ((LazyListPositionedItem) du.h0(arrayList)).b) {
            if (i - ((LazyListPositionedItem) du.a0(arrayList)).b < ((LazyListPositionedItem) du.h0(arrayList)).b - i) {
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    LazyListPositionedItem lazyListPositionedItem = (LazyListPositionedItem) arrayList.get(i4);
                    int i5 = lazyListPositionedItem.b;
                    if (i5 == i) {
                        return lazyListPositionedItem.e;
                    }
                    if (i5 > i) {
                        break;
                    }
                }
            } else {
                int size2 = arrayList.size();
                do {
                    size2--;
                    if (-1 >= size2) {
                        break;
                    }
                    LazyListPositionedItem lazyListPositionedItem2 = (LazyListPositionedItem) arrayList.get(size2);
                    i3 = lazyListPositionedItem2.b;
                    if (i3 == i) {
                        return lazyListPositionedItem2.e;
                    }
                } while (i3 >= i);
            }
        }
        return i2;
    }
}
