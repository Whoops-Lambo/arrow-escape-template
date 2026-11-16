package com.google.android.gms.internal.ads;

import defpackage.ds4;
import defpackage.es4;
import defpackage.is4;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class zzgze<K, V> implements Map<K, V>, Serializable {
    @Override // java.util.Map
    /* JADX INFO: renamed from: d */
    public abstract ds4 entrySet();

    @Override // java.util.Map
    /* JADX INFO: renamed from: f */
    public abstract es4 keySet();

    @Override // java.util.Map
    /* JADX INFO: renamed from: g */
    public abstract is4 values();

    @Override // java.util.Map
    public abstract Object get(Object obj);

    public static zzgze a(Map map) {
        if ((map instanceof zzgze) && !(map instanceof SortedMap)) {
            return (zzgze) map;
        }
        Set<Map.Entry<K, V>> setEntrySet = map.entrySet();
        zzgzd zzgzdVar = new zzgzd(setEntrySet != null ? setEntrySet.size() : 4);
        zzgzdVar.b(setEntrySet);
        return zzgzdVar.d(true);
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return zzhai.a(obj, this);
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zzhbl.c(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return zzhai.b(this);
    }
}
