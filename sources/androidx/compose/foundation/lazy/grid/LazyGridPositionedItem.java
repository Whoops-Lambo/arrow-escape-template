package androidx.compose.foundation.lazy.grid;

import androidx.compose.animation.core.FiniteAnimationSpec;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridPositionedItem;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class LazyGridPositionedItem implements LazyGridItemInfo {
    public final long a;
    public final long b;
    public final int c;
    public final Object d;
    public final int e;
    public final int f;
    public final long g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final boolean l;
    public final ArrayList m;
    public final LazyGridItemPlacementAnimator n;
    public final long o;
    public final boolean p;

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getF() {
        return this.f;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getE() {
        return this.e;
    }

    public final FiniteAnimationSpec c(int i) {
        Object obj = ((LazyGridPlaceableWrapper) this.m.get(i)).b;
        if (obj instanceof FiniteAnimationSpec) {
            return (FiniteAnimationSpec) obj;
        }
        return null;
    }

    public final int d() {
        boolean z = this.l;
        long j = this.g;
        return this.i + ((int) (z ? j & 4294967295L : j >> 32));
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    /* JADX INFO: renamed from: getIndex, reason: from getter */
    public final int getC() {
        return this.c;
    }

    public LazyGridPositionedItem(long j, long j2, int i, Object obj, int i2, int i3, long j3, int i4, int i5, int i6, int i7, boolean z, ArrayList arrayList, LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, long j4) {
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = obj;
        this.e = i2;
        this.f = i3;
        this.g = j3;
        this.h = i4;
        this.i = i5;
        this.j = i6;
        this.k = i7;
        this.l = z;
        this.m = arrayList;
        this.n = lazyGridItemPlacementAnimator;
        this.o = j4;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i8 = 0; i8 < size; i8++) {
            if (c(i8) != null) {
                z2 = true;
                break;
            }
        }
        this.p = z2;
    }
}
