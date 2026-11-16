package androidx.compose.foundation.lazy.grid;

import androidx.compose.ui.unit.Constraints;
import defpackage.rc1;
import defpackage.zr0;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/Constraints;", "startSlot", "", "span", "invoke-JhjzzOo", "(II)J"}, k = 3, mv = {1, 6, 0}, xi = 48)
final class LazyMeasuredLineProvider$childConstraints$1 extends rc1 implements zr0 {
    public final /* synthetic */ List i;
    public final /* synthetic */ int j;
    public final /* synthetic */ LazyMeasuredLineProvider k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyMeasuredLineProvider$childConstraints$1(List list, int i, LazyMeasuredLineProvider lazyMeasuredLineProvider) {
        super(2);
        this.i = list;
        this.j = i;
        this.k = lazyMeasuredLineProvider;
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        List list = this.i;
        int iIntValue3 = ((iIntValue2 - 1) * this.j) + (((Number) list.get((iIntValue + iIntValue2) - 1)).intValue() - (iIntValue == 0 ? 0 : ((Number) list.get(iIntValue - 1)).intValue()));
        return new Constraints(this.k.a ? Constraints.Companion.e(iIntValue3) : Constraints.Companion.d(iIntValue3));
    }
}
