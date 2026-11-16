package com.mbridge.msdk.config.dynamic.binddata.wrapper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.AbstractMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class e extends AbstractMap<String, Object> {
    private final ConcurrentHashMap<String, a> a = new ConcurrentHashMap<>();
    private final ReferenceQueue<Object> b = new ReferenceQueue<>();

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object put(String str, Object obj) {
        if (str == null) {
            return null;
        }
        a();
        ConcurrentHashMap<String, a> concurrentHashMap = this.a;
        if (obj == null) {
            a aVarRemove = concurrentHashMap.remove(str);
            if (aVarRemove == null) {
                return null;
            }
            return aVarRemove.get();
        }
        a aVarPut = concurrentHashMap.put(str, new a(str, obj, this.b));
        if (aVarPut == null) {
            return null;
        }
        return aVarPut.get();
    }

    @Override // java.util.AbstractMap, java.util.Map
    @Nullable
    public Object get(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        a();
        a aVar = this.a.get(obj);
        if (aVar == null) {
            return null;
        }
        return aVar.get();
    }

    @Override // java.util.AbstractMap, java.util.Map
    @Nullable
    public Object remove(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        a();
        a aVarRemove = this.a.remove(obj);
        if (aVarRemove == null) {
            return null;
        }
        return aVarRemove.get();
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class a extends WeakReference<Object> {
        final String a;

        public a(String str, Object obj, ReferenceQueue<Object> referenceQueue) {
            super(obj, referenceQueue);
            this.a = str;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@Nullable Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @NonNull
    public Set<Map.Entry<String, Object>> entrySet() {
        a();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry<String, a> entry : this.a.entrySet()) {
            Object obj = entry.getValue().get();
            if (obj != null) {
                linkedHashSet.add(new AbstractMap.SimpleEntry(entry.getKey(), obj));
            }
        }
        return linkedHashSet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        a();
        return this.a.size();
    }

    private void a() {
        while (true) {
            a aVar = (a) this.b.poll();
            if (aVar == null) {
                return;
            } else {
                this.a.remove(aVar.a, aVar);
            }
        }
    }
}
