package com.bytedance.sdk.component.noq.ahm.rz.kgy;

import java.lang.ref.SoftReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class rz<K, V> {
    private int ahm;
    private final LinkedHashMap<K, SoftReference<V>> kgy = new LinkedHashMap<>(0, 0.75f, true);

    public synchronized void kgy(int i) {
        int size = this.kgy.size() - i;
        if (size > 0) {
            Iterator<Map.Entry<K, SoftReference<V>>> it = this.kgy.entrySet().iterator();
            for (int i2 = 0; i2 < size; i2++) {
                it.next();
                it.remove();
            }
        }
        if (i == 0) {
            return;
        }
        Iterator<Map.Entry<K, SoftReference<V>>> it2 = this.kgy.entrySet().iterator();
        while (it2.hasNext()) {
            if (it2.next().getValue().get() == null) {
                it2.remove();
            }
        }
    }

    public final synchronized String toString() {
        return String.format("LruCache[maxCount=%d,size=%d]", Integer.valueOf(this.ahm), Integer.valueOf(this.kgy.size()));
    }

    public rz(int i) {
        this.ahm = i;
    }

    public synchronized void kgy(K k, V v) {
        if (this.ahm <= 0) {
            return;
        }
        if (k == null || v == null) {
            return;
        }
        this.kgy.put(k, new SoftReference<>(v));
        int size = this.kgy.size();
        int i = this.ahm;
        if (size > i) {
            kgy((int) (((double) i) * 0.7d));
        }
    }

    public synchronized V kgy(K k) {
        V v = null;
        if (k == null) {
            return null;
        }
        if (this.ahm <= 0) {
            return null;
        }
        SoftReference<V> softReference = this.kgy.get(k);
        if (softReference != null) {
            v = softReference.get();
            if (v != null) {
                return v;
            }
            this.kgy.remove(k);
        }
        return v;
    }
}
