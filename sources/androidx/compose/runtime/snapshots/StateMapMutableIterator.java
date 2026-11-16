package androidx.compose.runtime.snapshots;

import defpackage.d;
import io.p071bidmachine.media3.extractor.ts.y;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\b\"\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/snapshots/StateMapMutableIterator;", "K", "V", "", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
abstract class StateMapMutableIterator<K, V> {
    public final SnapshotStateMap a;
    public final Iterator b;
    public int c;
    public Map.Entry d;
    public Map.Entry e;

    public final void a() {
        this.d = this.e;
        Iterator it = this.b;
        this.e = it.hasNext() ? (Map.Entry) it.next() : null;
    }

    public final boolean hasNext() {
        return this.e != null;
    }

    public final void remove() {
        SnapshotStateMap snapshotStateMap = this.a;
        if (snapshotStateMap.a().d != this.c) {
            d.o();
            return;
        }
        Map.Entry entry = this.d;
        if (entry == null) {
            y.b();
            return;
        }
        snapshotStateMap.remove(entry.getKey());
        this.d = null;
        this.c = snapshotStateMap.a().d;
    }

    public StateMapMutableIterator(SnapshotStateMap snapshotStateMap, Iterator it) {
        this.a = snapshotStateMap;
        this.b = it;
        this.c = snapshotStateMap.a().d;
        a();
    }
}
