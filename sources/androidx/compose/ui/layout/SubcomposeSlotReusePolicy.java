package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import defpackage.bc1;
import defpackage.wx;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;", "", "SlotIdsSet", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface SubcomposeSlotReusePolicy {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;", "", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class SlotIdsSet implements Collection<Object>, bc1 {
        public final Set a = new LinkedHashSet();

        @Override // java.util.Collection
        public final boolean add(Object obj) {
            return this.a.add(obj);
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final void clear() {
            this.a.clear();
        }

        @Override // java.util.Collection
        public final boolean contains(Object obj) {
            return this.a.contains(obj);
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return this.a.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return this.a.iterator();
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            return this.a.remove(obj);
        }

        @Override // java.util.Collection
        public final boolean removeIf(Predicate<? super Object> predicate) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final int size() {
            return this.a.size();
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection collection) {
            collection.getClass();
            return this.a.containsAll(collection);
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection collection) {
            collection.getClass();
            return this.a.remove(collection);
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection collection) {
            collection.getClass();
            return this.a.retainAll(collection);
        }

        @Override // java.util.Collection
        public final Object[] toArray(Object[] objArr) {
            objArr.getClass();
            return wx.s(this, objArr);
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            return wx.r(this);
        }
    }

    void a(SlotIdsSet slotIdsSet);

    boolean b(Object obj, Object obj2);
}
