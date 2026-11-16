package androidx.compose.foundation.lazy;

import androidx.compose.ui.layout.Placeable;
import defpackage.az2;
import defpackage.rc1;
import defpackage.wr0;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Laz2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
final class LazyListMeasureKt$measureLazyList$3 extends rc1 implements wr0 {
    public final /* synthetic */ ArrayList i;
    public final /* synthetic */ LazyListPositionedItem j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyListMeasureKt$measureLazyList$3(ArrayList arrayList, LazyListPositionedItem lazyListPositionedItem) {
        super(1);
        this.i = arrayList;
        this.j = lazyListPositionedItem;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        LazyListPositionedItem lazyListPositionedItem;
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        placementScope.getClass();
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            lazyListPositionedItem = this.j;
            if (i >= size) {
                break;
            }
            LazyListPositionedItem lazyListPositionedItem2 = (LazyListPositionedItem) arrayList.get(i);
            if (lazyListPositionedItem2 != lazyListPositionedItem) {
                lazyListPositionedItem2.d(placementScope);
            }
            i++;
        }
        if (lazyListPositionedItem != null) {
            lazyListPositionedItem.d(placementScope);
        }
        return az2.a;
    }
}
