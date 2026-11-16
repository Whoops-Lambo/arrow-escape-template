package com.explorestack.protobuf;

import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class j6 implements Map {
    public final k6 a;
    public final Map b;

    @Override // java.util.Map
    public final void clear() {
        this.a.f();
        this.b.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.b.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.b.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return new i6(this.a, this.b.entrySet());
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return this.b.equals(obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.b.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.b.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return new i6(this.a, this.b.keySet());
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.a.f();
        Charset charset = l5.a;
        obj.getClass();
        obj2.getClass();
        return this.b.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.a.f();
        for (Object obj : map.keySet()) {
            Charset charset = l5.a;
            obj.getClass();
            map.get(obj).getClass();
        }
        this.b.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        this.a.f();
        return this.b.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.b.size();
    }

    public final String toString() {
        return this.b.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        return new g6(this.a, this.b.values());
    }

    public j6(k6 k6Var, Map map) {
        this.a = k6Var;
        this.b = map;
    }
}
