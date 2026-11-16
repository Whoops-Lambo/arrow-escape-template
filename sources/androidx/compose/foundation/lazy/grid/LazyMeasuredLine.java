package androidx.compose.foundation.lazy.grid;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyMeasuredLine;", "", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class LazyMeasuredLine {
    public final int a;
    public final LazyMeasuredItem[] b;
    public final List c;
    public final boolean d;
    public final int e;
    public final LayoutDirection f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;

    /* JADX WARN: Code duplicated, block: B:46:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d0  */
    public final ArrayList a(int i, int i2, int i3) {
        int length;
        int size;
        int i4;
        LazyMeasuredItem[] lazyMeasuredItemArr = this.b;
        ArrayList arrayList = new ArrayList(lazyMeasuredItemArr.length);
        int length2 = lazyMeasuredItemArr.length;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i5 < length2) {
            LazyMeasuredItem lazyMeasuredItem = lazyMeasuredItemArr[i5];
            int i9 = i6 + 1;
            int i10 = (int) ((GridItemSpan) this.c.get(i6)).a;
            LayoutDirection layoutDirection = this.f;
            LayoutDirection layoutDirection2 = LayoutDirection.b;
            int i11 = layoutDirection == layoutDirection2 ? (this.e - i7) - i10 : i7;
            int i12 = this.a;
            boolean z = this.d;
            int i13 = z ? i12 : i11;
            int i14 = z ? i11 : i12;
            int i15 = lazyMeasuredItem.i;
            int i16 = lazyMeasuredItem.h;
            int i17 = lazyMeasuredItem.d;
            int i18 = lazyMeasuredItem.m;
            LazyMeasuredItem[] lazyMeasuredItemArr2 = lazyMeasuredItemArr;
            Placeable[] placeableArr = lazyMeasuredItem.j;
            int i19 = length2;
            boolean z2 = lazyMeasuredItem.f;
            ArrayList arrayList2 = new ArrayList();
            int i20 = i5;
            boolean z3 = lazyMeasuredItem.c;
            int i21 = z3 ? i3 : i2;
            int i22 = z2 ? (i21 - i) - i18 : i;
            int i23 = (z3 == 0 || lazyMeasuredItem.g != layoutDirection2) ? i8 : ((z3 != 0 ? i2 : i3) - i8) - i17;
            long jA = z3 != 0 ? IntOffsetKt.a(i23, i22) : IntOffsetKt.a(i22, i23);
            if (z2) {
                placeableArr.getClass();
                length = placeableArr.length - 1;
            } else {
                length = 0;
            }
            while (true) {
                if (z2) {
                    if (length < 0) {
                        break;
                    }
                    Placeable placeable = placeableArr[length];
                    if (z2) {
                        size = 0;
                    } else {
                        size = arrayList2.size();
                    }
                    Placeable[] placeableArr2 = placeableArr;
                    i4 = length;
                    arrayList2.add(size, new LazyGridPlaceableWrapper(placeable, placeableArr2[length].a()));
                    if (z2) {
                        length = i4 - 1;
                    } else {
                        length = i4 + 1;
                    }
                    placeableArr = placeableArr2;
                } else {
                    if (length >= placeableArr.length) {
                        break;
                    }
                    Placeable placeable2 = placeableArr[length];
                    if (z2) {
                        size = 0;
                    } else {
                        size = arrayList2.size();
                    }
                    Placeable[] placeableArr3 = placeableArr;
                    i4 = length;
                    arrayList2.add(size, new LazyGridPlaceableWrapper(placeable2, placeableArr3[length].a()));
                    if (z2) {
                        length = i4 - 1;
                    } else {
                        length = i4 + 1;
                    }
                    placeableArr = placeableArr3;
                }
            }
            long jA2 = z3 != 0 ? IntOffsetKt.a(i8, i) : IntOffsetKt.a(i, i8);
            int i24 = lazyMeasuredItem.a;
            Object obj = lazyMeasuredItem.b;
            long jA3 = z3 ? IntSizeKt.a(i17, i18) : IntSizeKt.a(i18, i17);
            int i25 = lazyMeasuredItem.e;
            int i26 = -(!z2 ? i16 : i15);
            if (z2) {
                i15 = i16;
            }
            LazyGridPositionedItem lazyGridPositionedItem = new LazyGridPositionedItem(jA2, jA, i24, obj, i13, i14, jA3, this.i, i25, i26, i21 + i15, lazyMeasuredItem.c, arrayList2, lazyMeasuredItem.k, lazyMeasuredItem.l);
            i8 += lazyMeasuredItem.d + this.h;
            i7 += i10;
            arrayList.add(lazyGridPositionedItem);
            i5 = i20 + 1;
            i6 = i9;
            lazyMeasuredItemArr = lazyMeasuredItemArr2;
            length2 = i19;
        }
        return arrayList;
    }

    public LazyMeasuredLine(int i, LazyMeasuredItem[] lazyMeasuredItemArr, List list, boolean z, int i2, LayoutDirection layoutDirection, int i3, int i4) {
        this.a = i;
        this.b = lazyMeasuredItemArr;
        this.c = list;
        this.d = z;
        this.e = i2;
        this.f = layoutDirection;
        this.g = i3;
        this.h = i4;
        int iMax = 0;
        for (LazyMeasuredItem lazyMeasuredItem : lazyMeasuredItemArr) {
            iMax = Math.max(iMax, lazyMeasuredItem.m);
        }
        this.i = iMax;
        this.j = iMax + this.g;
    }
}
