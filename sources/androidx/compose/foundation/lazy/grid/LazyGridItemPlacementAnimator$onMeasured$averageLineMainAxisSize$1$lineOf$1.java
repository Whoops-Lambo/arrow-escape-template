package androidx.compose.foundation.lazy.grid;

import defpackage.rc1;
import defpackage.wr0;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "invoke", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0}, xi = 48)
final class LazyGridItemPlacementAnimator$onMeasured$averageLineMainAxisSize$1$lineOf$1 extends rc1 implements wr0 {
    public final /* synthetic */ LazyGridItemPlacementAnimator i;
    public final /* synthetic */ ArrayList j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyGridItemPlacementAnimator$onMeasured$averageLineMainAxisSize$1$lineOf$1(LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, ArrayList arrayList) {
        super(1);
        this.i = lazyGridItemPlacementAnimator;
        this.j = arrayList;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        int iIntValue = ((Number) obj).intValue();
        this.i.getClass();
        return Integer.valueOf(((LazyGridPositionedItem) this.j.get(iIntValue)).f);
    }
}
