package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.internal.StabilityInferred;
import defpackage.gg0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "", "Bucket", "LazyGridItemSpanScopeImpl", "LineConfiguration", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class LazyGridSpanLayoutProvider {
    public final LazyGridItemsSnapshot a;
    public final ArrayList b;
    public final ArrayList c;
    public List d;
    public int e;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider$LazyGridItemSpanScopeImpl;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class LazyGridItemSpanScopeImpl implements LazyGridItemSpanScope {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider$Bucket;", "", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Bucket {
        public final int a;

        public Bucket(int i, int i2) {
            this.a = i;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider$LineConfiguration;", "", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class LineConfiguration {
        public final int a;
        public final List b;

        public LineConfiguration(int i, List list) {
            list.getClass();
            this.a = i;
            this.b = list;
        }
    }

    public final LineConfiguration a(int i) {
        List list;
        int i2 = this.e;
        int i3 = i * i2;
        this.a.a.getClass();
        int i4 = 0 - i3;
        if (i2 > i4) {
            i2 = i4;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i2 == this.d.size()) {
            list = this.d;
        } else {
            ArrayList arrayList = new ArrayList(i2);
            for (int i5 = 0; i5 < i2; i5++) {
                arrayList.add(new GridItemSpan(1L));
            }
            this.d = arrayList;
            list = arrayList;
        }
        return new LineConfiguration(i3, list);
    }

    public LazyGridSpanLayoutProvider(LazyGridItemsSnapshot lazyGridItemsSnapshot) {
        this.a = lazyGridItemsSnapshot;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Bucket(0, 0));
        this.b = arrayList;
        this.c = new ArrayList();
        this.d = gg0.a;
    }
}
