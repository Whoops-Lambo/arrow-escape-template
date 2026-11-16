package androidx.collection;

import defpackage.fc1;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Landroidx/collection/MutableScatterMap;", "K", "V", "Landroidx/collection/ScatterMap;", "MutableMapWrapper", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MutableScatterMap<K, V> extends ScatterMap<K, V> {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0000\b\u0082\u0004\u0018\u00002\u00120\u0001R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/collection/MutableScatterMap$MutableMapWrapper;", "Landroidx/collection/ScatterMap$MapWrapper;", "Landroidx/collection/ScatterMap;", "", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class MutableMapWrapper extends ScatterMap<K, V>.MapWrapper implements Map<K, V>, fc1 {
        @Override // androidx.collection.ScatterMap.MapWrapper, java.util.Map
        public final void clear() {
            throw null;
        }

        @Override // androidx.collection.ScatterMap.MapWrapper, java.util.Map
        public final Object put(Object obj, Object obj2) {
            throw null;
        }

        @Override // androidx.collection.ScatterMap.MapWrapper, java.util.Map
        public final Object remove(Object obj) {
            throw null;
        }

        @Override // androidx.collection.ScatterMap.MapWrapper
        public final Set a() {
            return new MutableScatterMap$MutableMapWrapper$entries$1();
        }

        @Override // androidx.collection.ScatterMap.MapWrapper
        public final Set b() {
            return new MutableScatterMap$MutableMapWrapper$keys$1();
        }

        @Override // androidx.collection.ScatterMap.MapWrapper
        public final Collection c() {
            return new MutableScatterMap$MutableMapWrapper$values$1();
        }

        @Override // androidx.collection.ScatterMap.MapWrapper, java.util.Map
        public final void putAll(Map map) {
            map.getClass();
            for (Map.Entry<K, V> entry : map.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
        }
    }
}
