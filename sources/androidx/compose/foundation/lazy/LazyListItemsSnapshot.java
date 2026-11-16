package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.IntervalList;
import defpackage.e32;
import defpackage.hg0;
import defpackage.j71;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListItemsSnapshot;", "", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class LazyListItemsSnapshot {
    public final IntervalList a;
    public final Map b;

    public LazyListItemsSnapshot(IntervalList intervalList, j71 j71Var) {
        Map map;
        intervalList.getClass();
        j71Var.getClass();
        this.a = intervalList;
        int i = j71Var.a;
        if (i >= 0) {
            int iMin = Math.min(j71Var.b, -1);
            if (iMin < i) {
                map = hg0.a;
            } else {
                HashMap map2 = new HashMap();
                intervalList.a(i, iMin, new LazyListItemProviderImplKt$generateKeyToIndexMap$1$1(1));
                map = map2;
            }
            this.b = map;
            return;
        }
        e32.i("Check failed.");
        throw null;
    }
}
