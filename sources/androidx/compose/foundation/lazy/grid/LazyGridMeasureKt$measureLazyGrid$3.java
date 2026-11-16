package androidx.compose.foundation.lazy.grid;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import defpackage.az2;
import defpackage.rc1;
import defpackage.wr0;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Laz2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
final class LazyGridMeasureKt$measureLazyGrid$3 extends rc1 implements wr0 {
    public final /* synthetic */ ArrayList i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyGridMeasureKt$measureLazyGrid$3(ArrayList arrayList) {
        super(1);
        this.i = arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x009d  */
    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        long j;
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        placementScope.getClass();
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            LazyGridPositionedItem lazyGridPositionedItem = (LazyGridPositionedItem) arrayList.get(i);
            long j2 = lazyGridPositionedItem.b;
            boolean z = lazyGridPositionedItem.l;
            ArrayList arrayList2 = lazyGridPositionedItem.m;
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                Placeable placeable = ((LazyGridPlaceableWrapper) arrayList2.get(i2)).a;
                int i3 = lazyGridPositionedItem.j - (z ? placeable.b : placeable.a);
                int i4 = lazyGridPositionedItem.k;
                if (lazyGridPositionedItem.c(i2) != null) {
                    LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator = lazyGridPositionedItem.n;
                    Object obj2 = lazyGridPositionedItem.d;
                    lazyGridItemPlacementAnimator.getClass();
                    obj2.getClass();
                    throw null;
                }
                if (z) {
                    int i5 = IntOffset.c;
                    j = j2 & 4294967295L;
                } else {
                    int i6 = IntOffset.c;
                    j = j2 >> 32;
                }
                if (((int) j) > i3) {
                    if (((int) (z ? j2 & 4294967295L : j2 >> 32)) < i4) {
                        long j3 = lazyGridPositionedItem.o;
                        if (z) {
                            Placeable.PlacementScope.j(placementScope, placeable, IntOffsetKt.a(((int) (j2 >> 32)) + ((int) (j3 >> 32)), ((int) (j2 & 4294967295L)) + ((int) (j3 & 4294967295L))));
                        } else {
                            Placeable.PlacementScope.g(placementScope, placeable, IntOffsetKt.a(((int) (j3 >> 32)) + ((int) (j2 >> 32)), ((int) (j2 & 4294967295L)) + ((int) (j3 & 4294967295L))));
                        }
                    }
                }
                i2++;
                size = size;
                arrayList = arrayList;
                i = i;
            }
            i++;
        }
        return az2.a;
    }
}
