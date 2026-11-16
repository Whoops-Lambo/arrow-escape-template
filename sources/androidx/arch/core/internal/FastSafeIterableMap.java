package androidx.arch.core.internal;

import androidx.annotation.RestrictTo;
import androidx.lifecycle.LifecycleObserver;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@RestrictTo
public class FastSafeIterableMap<K, V> extends SafeIterableMap<K, V> {
    public final HashMap e = new HashMap();

    @Override // androidx.arch.core.internal.SafeIterableMap
    public final SafeIterableMap.Entry a(Object obj) {
        return (SafeIterableMap.Entry) this.e.get(obj);
    }

    public final Map.Entry e(LifecycleObserver lifecycleObserver) {
        HashMap map = this.e;
        if (map.containsKey(lifecycleObserver)) {
            return ((SafeIterableMap.Entry) map.get(lifecycleObserver)).d;
        }
        return null;
    }

    @Override // androidx.arch.core.internal.SafeIterableMap
    public final Object c(Object obj, Object obj2) {
        SafeIterableMap.Entry entryA = a(obj);
        if (entryA != null) {
            return entryA.b;
        }
        SafeIterableMap.Entry entry = new SafeIterableMap.Entry(obj, obj2);
        this.d++;
        SafeIterableMap.Entry entry2 = this.b;
        if (entry2 == null) {
            this.a = entry;
            this.b = entry;
        } else {
            entry2.c = entry;
            entry.d = entry2;
            this.b = entry;
        }
        this.e.put(obj, entry);
        return null;
    }

    @Override // androidx.arch.core.internal.SafeIterableMap
    public final Object d(Object obj) {
        Object objD = super.d(obj);
        this.e.remove(obj);
        return objD;
    }
}
