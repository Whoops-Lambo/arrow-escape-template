package com.bytedance.adsdk.ahm;

import defpackage.d;
import io.p071bidmachine.media3.extractor.ts.y;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
abstract class vs<K, V> {
    vs<K, V>.ahm ahm;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public final class ahm implements Set<K> {
        public ahm() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            vs.this.rz();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return vs.this.kgy(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return vs.kgy(vs.this.ahm(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int iKgy = vs.this.kgy() - 1; iKgy >= 0; iKgy--) {
                Object objKgy = vs.this.kgy(iKgy, 0);
                iHashCode += objKgy == null ? 0 : objKgy.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return vs.this.kgy() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new kgy(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int iKgy = vs.this.kgy(obj);
            if (iKgy < 0) {
                return false;
            }
            vs.this.kgy(iKgy);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return vs.ahm(vs.this.ahm(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return vs.rz(vs.this.ahm(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return vs.this.kgy();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return vs.this.ahm(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return vs.kgy(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) vs.this.kgy(tArr, 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public final class kgy<T> implements Iterator<T> {
        int ahm;
        final int kgy;
        int rz;
        boolean uq = false;

        public kgy(int i) {
            this.kgy = i;
            this.ahm = vs.this.kgy();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.rz < this.ahm;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.uq) {
                y.b();
                return;
            }
            int i = this.rz - 1;
            this.rz = i;
            this.ahm--;
            this.uq = false;
            vs.this.kgy(i);
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                T t = (T) vs.this.kgy(this.rz, this.kgy);
                this.rz++;
                this.uq = true;
                return t;
            }
            d.v();
            return null;
        }
    }

    public abstract Map<K, V> ahm();

    public abstract int kgy();

    public abstract int kgy(Object obj);

    public abstract Object kgy(int i, int i2);

    public abstract void kgy(int i);

    public abstract void rz();

    public Set<K> uq() {
        if (this.ahm == null) {
            this.ahm = new ahm();
        }
        return this.ahm;
    }

    public static <K, V> boolean ahm(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        if (size != map.size()) {
            return true;
        }
        return false;
    }

    public static <K, V> boolean rz(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        if (size != map.size()) {
            return true;
        }
        return false;
    }

    public <T> T[] kgy(T[] tArr, int i) {
        int iKgy = kgy();
        if (tArr.length < iKgy) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), iKgy));
        }
        for (int i2 = 0; i2 < iKgy; i2++) {
            tArr[i2] = kgy(i2, i);
        }
        if (tArr.length > iKgy) {
            tArr[iKgy] = null;
        }
        return tArr;
    }

    public Object[] ahm(int i) {
        int iKgy = kgy();
        Object[] objArr = new Object[iKgy];
        for (int i2 = 0; i2 < iKgy; i2++) {
            objArr[i2] = kgy(i2, i);
        }
        return objArr;
    }

    public static <K, V> boolean kgy(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean kgy(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size() && set.containsAll(set2)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }
}
