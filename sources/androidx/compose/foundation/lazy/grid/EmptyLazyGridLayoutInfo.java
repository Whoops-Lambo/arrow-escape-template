package androidx.compose.foundation.lazy.grid;

import defpackage.gg0;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/grid/EmptyLazyGridLayoutInfo;", "Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class EmptyLazyGridLayoutInfo implements LazyGridLayoutInfo {
    public static final EmptyLazyGridLayoutInfo a = new EmptyLazyGridLayoutInfo();

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public final int a() {
        return 0;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public final List b() {
        return gg0.a;
    }
}
