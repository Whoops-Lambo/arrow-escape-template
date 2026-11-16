package com.bytedance.sdk.component.kgy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class xh<K, V> {
    private final Map<K, V> kgy = new HashMap();
    private final Map<V, Set<K>> ahm = new HashMap();

    public void ahm(K k) {
        Set<K> set;
        V vRemove = this.kgy.remove(k);
        if (vRemove == null || (set = this.ahm.get(vRemove)) == null) {
            return;
        }
        set.remove(k);
        if (set.isEmpty()) {
            this.ahm.remove(vRemove);
        }
    }

    public void kgy(Set<K> set, V v) {
        for (K k : set) {
            if (this.kgy.containsKey(k)) {
                ahm(k);
            }
        }
        Set<K> hashSet = this.ahm.get(v);
        if (hashSet == null) {
            hashSet = new HashSet<>();
            this.ahm.put(v, hashSet);
        }
        hashSet.addAll(set);
        Iterator<K> it = set.iterator();
        while (it.hasNext()) {
            this.kgy.put(it.next(), v);
        }
    }

    public V kgy(K k) {
        return this.kgy.get(k);
    }

    public void kgy() {
        this.kgy.clear();
        this.ahm.clear();
    }
}
