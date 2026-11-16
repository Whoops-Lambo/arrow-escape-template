package com.safedk.android.utils;

import android.support.annotation.NonNull;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class SimpleConcurrentHashSet<T> extends ConcurrentHashMap<T, Boolean> {
    private static final Boolean a = Boolean.TRUE;

    public boolean a(T t) {
        return put(t, a) == null;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean remove(@NonNull Object obj) {
        return Boolean.valueOf(remove(obj, a));
    }

    @Override // java.util.concurrent.ConcurrentHashMap
    public boolean contains(@NonNull Object key) {
        return super.containsKey(key);
    }

    public Iterator<T> a() {
        return keySet().iterator();
    }

    public static <T> SimpleConcurrentHashSet<T> b() {
        return new SimpleConcurrentHashSet<>();
    }

    public boolean a(Collection<? extends T> collection) {
        Iterator<? extends T> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (a(it.next())) {
                z = true;
            }
        }
        return z;
    }
}
