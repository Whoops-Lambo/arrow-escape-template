package androidx.compose.foundation.lazy;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.d;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/LazyMeasuredItem;", "", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class LazyMeasuredItem {
    public final int a;
    public final Placeable[] b;
    public final boolean c;
    public final Alignment.Horizontal d;
    public final Alignment.Vertical e;
    public final LayoutDirection f;
    public final boolean g;
    public final int h;
    public final int i;
    public final LazyListItemPlacementAnimator j;
    public final int k;
    public final long l;
    public final Object m;
    public final int n;
    public final int o;
    public final int p;

    /* JADX WARN: Code duplicated, block: B:21:0x0034  */
    /* JADX WARN: Code duplicated, block: B:22:0x0036  */
    /* JADX WARN: Code duplicated, block: B:25:0x003f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0043  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x006c  */
    /* JADX WARN: Code duplicated, block: B:35:0x006f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0054 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0082 A[SYNTHETIC] */
    public final LazyListPositionedItem a(int i, int i2, int i3) {
        int length;
        Placeable placeable;
        int size;
        Alignment.Vertical vertical;
        long jA;
        int i4;
        Alignment.Horizontal horizontal;
        ArrayList arrayList = new ArrayList();
        boolean z = this.c;
        int i5 = z ? i3 : i2;
        boolean z2 = this.g;
        int i6 = z2 ? (i5 - i) - this.n : i;
        Placeable[] placeableArr = this.b;
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
                placeable = placeableArr[length];
                if (z2) {
                    size = 0;
                } else {
                    size = arrayList.size();
                }
                if (z) {
                    horizontal = this.d;
                    if (horizontal != null) {
                        d.r("Required value was null.");
                        return null;
                    }
                    jA = IntOffsetKt.a(horizontal.a(placeable.a, i2, this.f), i6);
                } else {
                    vertical = this.e;
                    if (vertical != null) {
                        d.r("Required value was null.");
                        return null;
                    }
                    jA = IntOffsetKt.a(i6, vertical.a(placeable.b, i3));
                }
                if (z) {
                    i4 = placeable.b;
                } else {
                    i4 = placeable.a;
                }
                i6 += i4;
                arrayList.add(size, new LazyListPlaceableWrapper(jA, placeable, placeableArr[length].a()));
                length = z2 ? length - 1 : length + 1;
            } else {
                if (length >= placeableArr.length) {
                    break;
                }
                placeable = placeableArr[length];
                if (z2) {
                    size = 0;
                } else {
                    size = arrayList.size();
                }
                if (z) {
                    horizontal = this.d;
                    if (horizontal != null) {
                        d.r("Required value was null.");
                        return null;
                    }
                    jA = IntOffsetKt.a(horizontal.a(placeable.a, i2, this.f), i6);
                } else {
                    vertical = this.e;
                    if (vertical != null) {
                        d.r("Required value was null.");
                        return null;
                    }
                    jA = IntOffsetKt.a(i6, vertical.a(placeable.b, i3));
                }
                if (z) {
                    i4 = placeable.b;
                } else {
                    i4 = placeable.a;
                }
                i6 += i4;
                arrayList.add(size, new LazyListPlaceableWrapper(jA, placeable, placeableArr[length].a()));
                if (z2) {
                }
            }
        }
        int i7 = this.i;
        int i8 = this.h;
        int i9 = -(!z2 ? i8 : i7);
        if (z2) {
            i7 = i8;
        }
        return new LazyListPositionedItem(i, this.a, this.m, this.n, this.o, i9, i5 + i7, this.c, arrayList, this.j, this.l);
    }

    public LazyMeasuredItem(int i, Placeable[] placeableArr, boolean z, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z2, int i2, int i3, LazyListItemPlacementAnimator lazyListItemPlacementAnimator, int i4, long j, Object obj) {
        int i5;
        int i6;
        this.a = i;
        this.b = placeableArr;
        this.c = z;
        this.d = horizontal;
        this.e = vertical;
        this.f = layoutDirection;
        this.g = z2;
        this.h = i2;
        this.i = i3;
        this.j = lazyListItemPlacementAnimator;
        this.k = i4;
        this.l = j;
        this.m = obj;
        int i7 = 0;
        int iMax = 0;
        for (Placeable placeable : placeableArr) {
            boolean z3 = this.c;
            if (z3) {
                i5 = placeable.b;
            } else {
                i5 = placeable.a;
            }
            i7 += i5;
            if (!z3) {
                i6 = placeable.b;
            } else {
                i6 = placeable.a;
            }
            iMax = Math.max(iMax, i6);
        }
        this.n = i7;
        this.o = i7 + this.k;
        this.p = iMax;
    }
}
