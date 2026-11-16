package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListPositionedItem;", "Landroidx/compose/foundation/lazy/LazyListItemInfo;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class LazyListPositionedItem implements LazyListItemInfo {
    public final int a;
    public final int b;
    public final Object c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final LazyListItemPlacementAnimator j;
    public final long k;
    public final boolean l;

    public final FiniteAnimationSpec a(int i) {
        Object obj = ((LazyListPlaceableWrapper) this.i.get(i)).c;
        if (obj instanceof FiniteAnimationSpec) {
            return (FiniteAnimationSpec) obj;
        }
        return null;
    }

    public final int b(int i) {
        Placeable placeable = ((LazyListPlaceableWrapper) this.i.get(i)).b;
        return this.h ? placeable.b : placeable.a;
    }

    public final long c(int i) {
        return ((LazyListPlaceableWrapper) this.i.get(i)).a;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    /* JADX INFO: renamed from: getIndex, reason: from getter */
    public final int getB() {
        return this.b;
    }

    public LazyListPositionedItem(int i, int i2, Object obj, int i3, int i4, int i5, int i6, boolean z, ArrayList arrayList, LazyListItemPlacementAnimator lazyListItemPlacementAnimator, long j) {
        this.a = i;
        this.b = i2;
        this.c = obj;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = z;
        this.i = arrayList;
        this.j = lazyListItemPlacementAnimator;
        this.k = j;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i7 = 0; i7 < size; i7++) {
            if (a(i7) != null) {
                z2 = true;
                break;
            }
        }
        this.l = z2;
    }

    public final void d(Placeable.PlacementScope placementScope) {
        placementScope.getClass();
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Placeable placeable = ((LazyListPlaceableWrapper) arrayList.get(i)).b;
            boolean z = this.h;
            if (z) {
                int i2 = placeable.b;
            } else {
                int i3 = placeable.a;
            }
            if (a(i) == null) {
                long jC = c(i);
                long j = this.k;
                if (z) {
                    int i4 = IntOffset.c;
                    Placeable.PlacementScope.j(placementScope, placeable, IntOffsetKt.a(((int) (jC >> 32)) + ((int) (j >> 32)), ((int) (jC & 4294967295L)) + ((int) (j & 4294967295L))));
                } else {
                    int i5 = IntOffset.c;
                    Placeable.PlacementScope.g(placementScope, placeable, IntOffsetKt.a(((int) (jC >> 32)) + ((int) (j >> 32)), ((int) (jC & 4294967295L)) + ((int) (j & 4294967295L))));
                }
            } else {
                c(i);
                this.j.getClass();
                this.c.getClass();
                throw null;
            }
        }
    }
}
