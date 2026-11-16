package androidx.datastore.preferences.protobuf;

import defpackage.d;
import defpackage.e32;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
class SmallSortedMap<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    public static final /* synthetic */ int g = 0;
    public List a;
    public Map b;
    public boolean c;
    public volatile EntrySet d;
    public Map e;
    public volatile DescendingEntrySet f;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.SmallSortedMap$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes9.dex */
    class AnonymousClass1 extends SmallSortedMap<FieldSet.FieldDescriptorLite<Object>, Object> {
        @Override // androidx.datastore.preferences.protobuf.SmallSortedMap
        public final void f() {
            if (!this.c) {
                for (int i = 0; i < this.a.size(); i++) {
                    Map.Entry entryC = c(i);
                    if (((FieldSet.FieldDescriptorLite) entryC.getKey()).isRepeated()) {
                        entryC.setValue(Collections.unmodifiableList((List) entryC.getValue()));
                    }
                }
                for (Map.Entry entry : d()) {
                    if (((FieldSet.FieldDescriptorLite) entry.getKey()).isRepeated()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.f();
        }

        @Override // androidx.datastore.preferences.protobuf.SmallSortedMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return put((Comparable) obj, obj2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class DescendingEntryIterator implements Iterator<Map.Entry<K, V>> {
        public int a;
        public Iterator b;

        public final Iterator a() {
            if (this.b == null) {
                this.b = SmallSortedMap.this.e.entrySet().iterator();
            }
            return this.b;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i = this.a;
            return (i > 0 && i <= SmallSortedMap.this.a.size()) || a().hasNext();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }

        public DescendingEntryIterator() {
            this.a = SmallSortedMap.this.a.size();
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (a().hasNext()) {
                return (Map.Entry) a().next();
            }
            List list = SmallSortedMap.this.a;
            int i = this.a - 1;
            this.a = i;
            return (Map.Entry) list.get(i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class DescendingEntrySet extends SmallSortedMap<K, V>.EntrySet {
        public DescendingEntrySet() {
            super();
        }

        @Override // androidx.datastore.preferences.protobuf.SmallSortedMap.EntrySet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return new DescendingEntryIterator();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class Entry implements Map.Entry<K, V>, Comparable<SmallSortedMap<K, V>.Entry> {
        public final Comparable a;
        public Object b;

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            boolean zEquals;
            boolean zEquals2;
            if (obj != this) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    Comparable comparable = this.a;
                    if (comparable == null) {
                        zEquals = key == null;
                    } else {
                        zEquals = comparable.equals(key);
                    }
                    if (zEquals) {
                        Object obj2 = this.b;
                        Object value = entry.getValue();
                        if (obj2 == null) {
                            zEquals2 = value == null;
                        } else {
                            zEquals2 = obj2.equals(value);
                        }
                        if (zEquals2) {
                        }
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            Comparable comparable = this.a;
            int iHashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.b;
            return iHashCode ^ (obj != null ? obj.hashCode() : 0);
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.a.compareTo(((Entry) obj).a);
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.a;
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            return this.b;
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            int i = SmallSortedMap.g;
            SmallSortedMap.this.b();
            Object obj2 = this.b;
            this.b = obj;
            return obj2;
        }

        public final String toString() {
            return this.a + "=" + this.b;
        }

        public Entry(Comparable comparable, Object obj) {
            this.a = comparable;
            this.b = obj;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class EntryIterator implements Iterator<Map.Entry<K, V>> {
        public int a = -1;
        public boolean b;
        public Iterator c;

        @Override // java.util.Iterator
        public final Object next() {
            this.b = true;
            int i = this.a + 1;
            this.a = i;
            SmallSortedMap smallSortedMap = SmallSortedMap.this;
            return i < smallSortedMap.a.size() ? (Map.Entry) smallSortedMap.a.get(this.a) : (Map.Entry) a().next();
        }

        public final Iterator a() {
            if (this.c == null) {
                this.c = SmallSortedMap.this.b.entrySet().iterator();
            }
            return this.c;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i = this.a + 1;
            SmallSortedMap smallSortedMap = SmallSortedMap.this;
            return i < smallSortedMap.a.size() || (!smallSortedMap.b.isEmpty() && a().hasNext());
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.b) {
                e32.i("remove() was called before next()");
                return;
            }
            this.b = false;
            int i = SmallSortedMap.g;
            SmallSortedMap smallSortedMap = SmallSortedMap.this;
            smallSortedMap.b();
            if (this.a >= smallSortedMap.a.size()) {
                a().remove();
                return;
            }
            int i2 = this.a;
            this.a = i2 - 1;
            smallSortedMap.j(i2);
        }

        public EntryIterator() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        public EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            SmallSortedMap.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            SmallSortedMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = SmallSortedMap.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new EntryIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            SmallSortedMap.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return SmallSortedMap.this.size();
        }
    }

    public static AnonymousClass1 g() {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        anonymousClass1.a = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        anonymousClass1.b = map;
        anonymousClass1.e = map;
        return anonymousClass1;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0038 A[SYNTHETIC] */
    public final int a(Comparable comparable) {
        int i;
        int i2;
        int i3;
        int iCompareTo;
        int size = this.a.size();
        int i4 = size - 1;
        if (i4 < 0) {
            i = 0;
            while (i <= i4) {
                i3 = (i + i4) / 2;
                iCompareTo = comparable.compareTo(((Entry) this.a.get(i3)).a);
                if (iCompareTo < 0) {
                    i4 = i3 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i3;
                    }
                    i = i3 + 1;
                }
            }
            i2 = i + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((Entry) this.a.get(i4)).a);
            if (iCompareTo2 > 0) {
                i2 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i4;
                }
                i = 0;
                while (i <= i4) {
                    i3 = (i + i4) / 2;
                    iCompareTo = comparable.compareTo(((Entry) this.a.get(i3)).a);
                    if (iCompareTo < 0) {
                        i4 = i3 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i3;
                        }
                        i = i3 + 1;
                    }
                }
                i2 = i + 1;
            }
        }
        return -i2;
    }

    public final void b() {
        if (this.c) {
            d.c();
        }
    }

    public final Map.Entry c(int i) {
        return (Map.Entry) this.a.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.b.containsKey(comparable);
    }

    public final Set d() {
        return this.b.isEmpty() ? Collections.EMPTY_SET : this.b.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.d == null) {
            this.d = new EntrySet();
        }
        return this.d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmallSortedMap)) {
            return super.equals(obj);
        }
        SmallSortedMap smallSortedMap = (SmallSortedMap) obj;
        int size = size();
        if (size == smallSortedMap.size()) {
            int size2 = this.a.size();
            if (size2 != smallSortedMap.a.size()) {
                return ((AbstractSet) entrySet()).equals(smallSortedMap.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (c(i).equals(smallSortedMap.c(i))) {
                }
            }
            if (size2 != size) {
                return this.b.equals(smallSortedMap.b);
            }
            return true;
        }
        return false;
    }

    public void f() {
        if (this.c) {
            return;
        }
        this.b = this.b.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.b);
        this.e = this.e.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.e);
        this.c = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((Entry) this.a.get(iA)).b : this.b.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.a.size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode += ((Entry) this.a.get(i)).hashCode();
        }
        return this.b.size() > 0 ? this.b.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.b.size() + this.a.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.a.isEmpty()) {
            this.a.clear();
        }
        if (!this.b.isEmpty()) {
            this.b.clear();
        }
    }

    public final SortedMap e() {
        b();
        if (this.b.isEmpty() && !(this.b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.b = treeMap;
            this.e = treeMap.descendingMap();
        }
        return (SortedMap) this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((Entry) this.a.get(iA)).setValue(obj);
        }
        b();
        if (this.a.isEmpty() && !(this.a instanceof ArrayList)) {
            this.a = new ArrayList(16);
        }
        int i = -(iA + 1);
        if (i >= 16) {
            return e().put(comparable, obj);
        }
        if (this.a.size() == 16) {
            Entry entry = (Entry) this.a.remove(15);
            e().put(entry.a, entry.b);
        }
        this.a.add(i, new Entry(comparable, obj));
        return null;
    }

    public final Object j(int i) {
        b();
        Object obj = ((Entry) this.a.remove(i)).b;
        if (!this.b.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.a;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new Entry((Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return j(iA);
        }
        if (this.b.isEmpty()) {
            return null;
        }
        return this.b.remove(comparable);
    }
}
