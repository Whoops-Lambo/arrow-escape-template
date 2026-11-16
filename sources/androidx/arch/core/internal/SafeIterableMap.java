package androidx.arch.core.internal;

import androidx.annotation.RestrictTo;
import com.ironsource.C4664b4;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@RestrictTo
public class SafeIterableMap<K, V> implements Iterable<Map.Entry<K, V>> {
    public Entry a;
    public Entry b;
    public final WeakHashMap c = new WeakHashMap();
    public int d = 0;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class AscendingIterator<K, V> extends ListIterator<K, V> {
        @Override // androidx.arch.core.internal.SafeIterableMap.ListIterator
        public final Entry b(Entry entry) {
            return entry.d;
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.ListIterator
        public final Entry c(Entry entry) {
            return entry.c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class DescendingIterator<K, V> extends ListIterator<K, V> {
        @Override // androidx.arch.core.internal.SafeIterableMap.ListIterator
        public final Entry b(Entry entry) {
            return entry.c;
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.ListIterator
        public final Entry c(Entry entry) {
            return entry.d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class Entry<K, V> implements Map.Entry<K, V> {
        public final Object a;
        public final Object b;
        public Entry c;
        public Entry d;

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            return this.a.equals(entry.a) && this.b.equals(entry.b);
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
        public final int hashCode() {
            return this.b.hashCode() ^ this.a.hashCode();
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public final String toString() {
            return this.a + "=" + this.b;
        }

        public Entry(Object obj, Object obj2) {
            this.a = obj;
            this.b = obj2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RestrictTo
    public class IteratorWithAdditions extends SupportRemove<K, V> implements Iterator<Map.Entry<K, V>> {
        public Entry a;
        public boolean b = true;

        @Override // androidx.arch.core.internal.SafeIterableMap.SupportRemove
        public final void a(Entry entry) {
            Entry entry2 = this.a;
            if (entry == entry2) {
                Entry entry3 = entry2.d;
                this.a = entry3;
                this.b = entry3 == null;
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.b) {
                return SafeIterableMap.this.a != null;
            }
            Entry entry = this.a;
            return (entry == null || entry.c == null) ? false : true;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (this.b) {
                this.b = false;
                this.a = SafeIterableMap.this.a;
            } else {
                Entry entry = this.a;
                this.a = entry != null ? entry.c : null;
            }
            return this.a;
        }

        public IteratorWithAdditions() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class ListIterator<K, V> extends SupportRemove<K, V> implements Iterator<Map.Entry<K, V>> {
        public Entry a;
        public Entry b;

        public abstract Entry b(Entry entry);

        public abstract Entry c(Entry entry);

        @Override // androidx.arch.core.internal.SafeIterableMap.SupportRemove
        public final void a(Entry entry) {
            Entry entryC = null;
            if (this.a == entry && entry == this.b) {
                this.b = null;
                this.a = null;
            }
            Entry entry2 = this.a;
            if (entry2 == entry) {
                this.a = b(entry2);
            }
            Entry entry3 = this.b;
            if (entry3 == entry) {
                Entry entry4 = this.a;
                if (entry3 != entry4 && entry4 != null) {
                    entryC = c(entry3);
                }
                this.b = entryC;
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.b != null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            Entry entry = this.b;
            Entry entry2 = this.a;
            this.b = (entry == entry2 || entry2 == null) ? null : c(entry);
            return entry;
        }

        public ListIterator(Entry entry, Entry entry2) {
            this.a = entry2;
            this.b = entry;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RestrictTo
    public static abstract class SupportRemove<K, V> {
        public abstract void a(Entry entry);
    }

    public final boolean equals(Object obj) {
        ListIterator listIterator;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SafeIterableMap)) {
            return false;
        }
        SafeIterableMap safeIterableMap = (SafeIterableMap) obj;
        if (this.d != safeIterableMap.d) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = safeIterableMap.iterator();
        while (true) {
            listIterator = (ListIterator) it;
            if (!listIterator.hasNext()) {
                break;
            }
            ListIterator listIterator2 = (ListIterator) it2;
            if (!listIterator2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) listIterator.next();
            Object next = listIterator2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (listIterator.hasNext() || ((ListIterator) it2).hasNext()) ? false : true;
    }

    public Entry a(Object obj) {
        Entry entry = this.a;
        while (entry != null && !entry.a.equals(obj)) {
            entry = entry.c;
        }
        return entry;
    }

    public final Iterator descendingIterator() {
        DescendingIterator descendingIterator = new DescendingIterator(this.b, this.a);
        this.c.put(descendingIterator, Boolean.FALSE);
        return descendingIterator;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        AscendingIterator ascendingIterator = new AscendingIterator(this.a, this.b);
        this.c.put(ascendingIterator, Boolean.FALSE);
        return ascendingIterator;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(C4664b4.j.d);
        Iterator it = iterator();
        while (true) {
            ListIterator listIterator = (ListIterator) it;
            if (!listIterator.hasNext()) {
                sb.append(C4664b4.j.e);
                return sb.toString();
            }
            sb.append(((Map.Entry) listIterator.next()).toString());
            if (listIterator.hasNext()) {
                sb.append(", ");
            }
        }
    }

    public Object c(Object obj, Object obj2) {
        Entry entryA = a(obj);
        if (entryA != null) {
            return entryA.b;
        }
        Entry entry = new Entry(obj, obj2);
        this.d++;
        Entry entry2 = this.b;
        if (entry2 == null) {
            this.a = entry;
            this.b = entry;
            return null;
        }
        entry2.c = entry;
        entry.d = entry2;
        this.b = entry;
        return null;
    }

    public Object d(Object obj) {
        Entry entryA = a(obj);
        if (entryA == null) {
            return null;
        }
        this.d--;
        WeakHashMap weakHashMap = this.c;
        if (!weakHashMap.isEmpty()) {
            Iterator<K> it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((SupportRemove) it.next()).a(entryA);
            }
        }
        Entry entry = entryA.d;
        Entry entry2 = entryA.c;
        if (entry != null) {
            entry.c = entry2;
        } else {
            this.a = entry2;
        }
        Entry entry3 = entryA.c;
        if (entry3 != null) {
            entry3.d = entry;
        } else {
            this.b = entry;
        }
        entryA.c = null;
        entryA.d = null;
        return entryA.b;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            ListIterator listIterator = (ListIterator) it;
            if (listIterator.hasNext()) {
                iHashCode += ((Map.Entry) listIterator.next()).hashCode();
            } else {
                return iHashCode;
            }
        }
    }
}
