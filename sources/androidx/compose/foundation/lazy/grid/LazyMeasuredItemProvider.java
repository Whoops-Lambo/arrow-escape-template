package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyMeasuredItemProvider;", "", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class LazyMeasuredItemProvider {
    public final LazyGridItemProvider a;
    public final LazyLayoutMeasureScope b;
    public final int c;
    public final MeasuredItemFactory d;

    public LazyMeasuredItemProvider(LazyGridItemProvider lazyGridItemProvider, LazyLayoutMeasureScope lazyLayoutMeasureScope, int i, MeasuredItemFactory measuredItemFactory) {
        lazyGridItemProvider.getClass();
        lazyLayoutMeasureScope.getClass();
        this.a = lazyGridItemProvider;
        this.b = lazyLayoutMeasureScope;
        this.c = i;
        this.d = measuredItemFactory;
    }
}
