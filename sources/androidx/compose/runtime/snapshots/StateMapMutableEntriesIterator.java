package androidx.compose.runtime.snapshots;

import defpackage.bc1;
import defpackage.d;
import defpackage.ec1;
import io.p071bidmachine.media3.extractor.ts.y;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/snapshots/StateMapMutableEntriesIterator;", "K", "V", "Landroidx/compose/runtime/snapshots/StateMapMutableIterator;", "", "", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class StateMapMutableEntriesIterator<K, V> extends StateMapMutableIterator<K, V> implements Iterator<Map.Entry<K, V>>, bc1 {

    /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.StateMapMutableEntriesIterator$next$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010'\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/runtime/snapshots/StateMapMutableEntriesIterator$next$1", "", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class AnonymousClass1 implements Map.Entry<Object, Object>, ec1 {
        public final Object a;
        public Object b;

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.a;
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            return this.b;
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            StateMapMutableEntriesIterator stateMapMutableEntriesIterator = StateMapMutableEntriesIterator.this;
            SnapshotStateMap snapshotStateMap = stateMapMutableEntriesIterator.a;
            if (snapshotStateMap.a().d != stateMapMutableEntriesIterator.c) {
                d.o();
                return null;
            }
            Object obj2 = this.b;
            snapshotStateMap.put(this.a, obj);
            this.b = obj;
            return obj2;
        }

        public AnonymousClass1() {
            Map.Entry entry = StateMapMutableEntriesIterator.this.d;
            entry.getClass();
            this.a = entry.getKey();
            Map.Entry entry2 = StateMapMutableEntriesIterator.this.d;
            entry2.getClass();
            this.b = entry2.getValue();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        if (this.d != null) {
            return new AnonymousClass1();
        }
        y.b();
        return null;
    }
}
