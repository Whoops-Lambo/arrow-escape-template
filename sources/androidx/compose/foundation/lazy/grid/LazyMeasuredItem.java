package androidx.compose.foundation.lazy.grid;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyMeasuredItem;", "", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class LazyMeasuredItem {
    public final int a;
    public final Object b;
    public final boolean c;
    public final int d;
    public final int e;
    public final boolean f;
    public final LayoutDirection g;
    public final int h;
    public final int i;
    public final Placeable[] j;
    public final LazyGridItemPlacementAnimator k;
    public final long l;
    public final int m;
    public final int n;

    public LazyMeasuredItem(int i, Object obj, boolean z, int i2, int i3, boolean z2, LayoutDirection layoutDirection, int i4, int i5, Placeable[] placeableArr, LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, long j) {
        int i6;
        this.a = i;
        this.b = obj;
        this.c = z;
        this.d = i2;
        this.e = i3;
        this.f = z2;
        this.g = layoutDirection;
        this.h = i4;
        this.i = i5;
        this.j = placeableArr;
        this.k = lazyGridItemPlacementAnimator;
        this.l = j;
        int iMax = 0;
        for (Placeable placeable : placeableArr) {
            if (this.c) {
                i6 = placeable.b;
            } else {
                i6 = placeable.a;
            }
            iMax = Math.max(iMax, i6);
        }
        this.m = iMax;
        this.n = iMax + this.e;
    }
}
