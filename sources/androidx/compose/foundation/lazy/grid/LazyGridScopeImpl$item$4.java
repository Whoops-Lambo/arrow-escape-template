package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.Composer;
import defpackage.az2;
import defpackage.bs0;
import defpackage.rc1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "", "it", "Laz2;", "invoke", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;ILandroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
final class LazyGridScopeImpl$item$4 extends rc1 implements bs0 {
    @Override // defpackage.bs0
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        LazyGridItemScope lazyGridItemScope = (LazyGridItemScope) obj;
        ((Number) obj2).intValue();
        Composer composer = (Composer) obj3;
        int iIntValue = ((Number) obj4).intValue();
        lazyGridItemScope.getClass();
        if ((iIntValue & 14) == 0) {
            iIntValue |= composer.l(lazyGridItemScope) ? 4 : 2;
        }
        if ((iIntValue & 651) != 130 || !composer.b()) {
            throw null;
        }
        composer.h();
        return az2.a;
    }
}
