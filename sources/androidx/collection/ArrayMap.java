package androidx.collection;

import defpackage.d;
import defpackage.e32;
import defpackage.s71;
import io.p071bidmachine.media3.extractor.ts.y;
import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class ArrayMap<K, V> extends SimpleArrayMap<K, V> implements Map<K, V> {
    public EntrySet d;
    public KeySet e;
    public ValueCollection f;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public final class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        public EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return new MapIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return ArrayMap.this.c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public final class KeyIterator extends IndexBasedArrayIterator<K> {
        public KeyIterator() {
            super(ArrayMap.this.c);
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        public final Object a(int i) {
            return ArrayMap.this.f(i);
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        public final void b(int i) {
            ArrayMap.this.g(i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public final class KeySet implements Set<K> {
        @Override // java.util.Set, java.util.Collection
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            ArrayMap.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            return ArrayMap.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection collection) {
            return ArrayMap.this.k(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean equals(Object obj) {
            ArrayMap arrayMap = ArrayMap.this;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Set)) {
                return false;
            }
            Set set = (Set) obj;
            try {
                return arrayMap.c == set.size() && arrayMap.k(set);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
            ArrayMap arrayMap = ArrayMap.this;
            int iHashCode = 0;
            for (int i = arrayMap.c - 1; i >= 0; i--) {
                Object objF = arrayMap.f(i);
                iHashCode += objF == null ? 0 : objF.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            return ArrayMap.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return new KeyIterator();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            ArrayMap arrayMap = ArrayMap.this;
            int iD = arrayMap.d(obj);
            if (iD < 0) {
                return false;
            }
            arrayMap.g(iD);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection collection) {
            return ArrayMap.this.l(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection collection) {
            return ArrayMap.this.m(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return ArrayMap.this.c;
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray(Object[] objArr) {
            ArrayMap arrayMap = ArrayMap.this;
            int i = arrayMap.c;
            if (objArr.length < i) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
            }
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = arrayMap.f(i2);
            }
            if (objArr.length > i) {
                objArr[i] = null;
            }
            return objArr;
        }

        public KeySet() {
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            ArrayMap arrayMap = ArrayMap.this;
            int i = arrayMap.c;
            Object[] objArr = new Object[i];
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = arrayMap.f(i2);
            }
            return objArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public final class MapIterator implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {
        public int a;
        public int b = -1;
        public boolean c;

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!this.c) {
                e32.i("This container does not support retaining Map.Entry objects");
                return false;
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                int i = this.b;
                ArrayMap arrayMap = ArrayMap.this;
                if (s71.b(key, arrayMap.f(i)) && s71.b(entry.getValue(), arrayMap.j(this.b))) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            if (this.c) {
                return ArrayMap.this.f(this.b);
            }
            e32.i("This container does not support retaining Map.Entry objects");
            return null;
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            if (this.c) {
                return ArrayMap.this.j(this.b);
            }
            e32.i("This container does not support retaining Map.Entry objects");
            return null;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.b < this.a;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            if (!this.c) {
                e32.i("This container does not support retaining Map.Entry objects");
                return 0;
            }
            int i = this.b;
            ArrayMap arrayMap = ArrayMap.this;
            Object objF = arrayMap.f(i);
            Object objJ = arrayMap.j(this.b);
            return (objF == null ? 0 : objF.hashCode()) ^ (objJ != null ? objJ.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.c) {
                y.b();
                return;
            }
            ArrayMap.this.g(this.b);
            this.b--;
            this.a--;
            this.c = false;
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (this.c) {
                return ArrayMap.this.h(this.b, obj);
            }
            e32.i("This container does not support retaining Map.Entry objects");
            return null;
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }

        public MapIterator() {
            this.a = ArrayMap.this.c - 1;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (hasNext()) {
                this.b++;
                this.c = true;
                return this;
            }
            d.v();
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public final class ValueCollection implements Collection<V> {
        @Override // java.util.Collection
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final void clear() {
            ArrayMap.this.clear();
        }

        @Override // java.util.Collection
        public final boolean contains(Object obj) {
            return ArrayMap.this.a(obj) >= 0;
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return ArrayMap.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return new ValueIterator();
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            ArrayMap arrayMap = ArrayMap.this;
            int iA = arrayMap.a(obj);
            if (iA < 0) {
                return false;
            }
            arrayMap.g(iA);
            return true;
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection collection) {
            ArrayMap arrayMap = ArrayMap.this;
            int i = arrayMap.c;
            int i2 = 0;
            boolean z = false;
            while (i2 < i) {
                if (collection.contains(arrayMap.j(i2))) {
                    arrayMap.g(i2);
                    i2--;
                    i--;
                    z = true;
                }
                i2++;
            }
            return z;
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection collection) {
            ArrayMap arrayMap = ArrayMap.this;
            int i = arrayMap.c;
            int i2 = 0;
            boolean z = false;
            while (i2 < i) {
                if (!collection.contains(arrayMap.j(i2))) {
                    arrayMap.g(i2);
                    i2--;
                    i--;
                    z = true;
                }
                i2++;
            }
            return z;
        }

        @Override // java.util.Collection
        public final int size() {
            return ArrayMap.this.c;
        }

        @Override // java.util.Collection
        public final Object[] toArray(Object[] objArr) {
            ArrayMap arrayMap = ArrayMap.this;
            int i = arrayMap.c;
            if (objArr.length < i) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
            }
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = arrayMap.j(i2);
            }
            if (objArr.length > i) {
                objArr[i] = null;
            }
            return objArr;
        }

        public ValueCollection() {
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            ArrayMap arrayMap = ArrayMap.this;
            int i = arrayMap.c;
            Object[] objArr = new Object[i];
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = arrayMap.j(i2);
            }
            return objArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public final class ValueIterator extends IndexBasedArrayIterator<V> {
        public ValueIterator() {
            super(ArrayMap.this.c);
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        public final Object a(int i) {
            return ArrayMap.this.j(i);
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        public final void b(int i) {
            ArrayMap.this.g(i);
        }
    }

    public ArrayMap() {
        super(0);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        EntrySet entrySet = this.d;
        if (entrySet != null) {
            return entrySet;
        }
        EntrySet entrySet2 = new EntrySet();
        this.d = entrySet2;
        return entrySet2;
    }

    @Override // java.util.Map
    public final Set keySet() {
        KeySet keySet = this.e;
        if (keySet != null) {
            return keySet;
        }
        KeySet keySet2 = new KeySet();
        this.e = keySet2;
        return keySet2;
    }

    public final boolean l(Collection collection) {
        int i = this.c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.c;
    }

    public final boolean m(Collection collection) {
        int i = this.c;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(f(i2))) {
                g(i2);
            }
        }
        return i != this.c;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.c);
        for (Map.Entry<K, V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        ValueCollection valueCollection = this.f;
        if (valueCollection != null) {
            return valueCollection;
        }
        ValueCollection valueCollection2 = new ValueCollection();
        this.f = valueCollection2;
        return valueCollection2;
    }

    public final boolean k(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }
}
