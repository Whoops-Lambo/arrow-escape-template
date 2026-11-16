package androidx.datastore.preferences.protobuf;

import defpackage.d;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class LazyField extends LazyFieldLite {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class LazyEntry<K> implements Map.Entry<K, Object> {
        public Map.Entry a;

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.a.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            LazyField lazyField = (LazyField) this.a.getValue();
            if (lazyField == null) {
                return null;
            }
            return lazyField.a(null);
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (!(obj instanceof MessageLite)) {
                d.r("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
                return null;
            }
            LazyField lazyField = (LazyField) this.a.getValue();
            MessageLite messageLite = lazyField.a;
            lazyField.b = null;
            lazyField.a = (MessageLite) obj;
            return messageLite;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class LazyIterator<K> implements Iterator<Map.Entry<K, Object>> {
        public final Iterator a;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.a.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            Map.Entry entry = (Map.Entry) this.a.next();
            if (!(entry.getValue() instanceof LazyField)) {
                return entry;
            }
            LazyEntry lazyEntry = new LazyEntry();
            lazyEntry.a = entry;
            return lazyEntry;
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.a.remove();
        }

        public LazyIterator(Iterator it) {
            this.a = it;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.LazyFieldLite
    public final boolean equals(Object obj) {
        return a(null).equals(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.LazyFieldLite
    public final int hashCode() {
        return a(null).hashCode();
    }

    public final String toString() {
        return a(null).toString();
    }
}
