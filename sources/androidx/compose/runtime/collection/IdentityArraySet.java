package androidx.compose.runtime.collection;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.bc1;
import defpackage.d;
import defpackage.n8;
import defpackage.wx;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0000\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/collection/IdentityArraySet;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class IdentityArraySet<T> implements Set<T>, bc1 {
    public int a;
    public Object[] b = new Object[16];

    /* JADX INFO: renamed from: androidx.compose.runtime.collection.IdentityArraySet$iterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010(\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/runtime/collection/IdentityArraySet$iterator$1", "", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class AnonymousClass1 implements Iterator<Object>, bc1 {
        public int a;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.a < IdentityArraySet.this.a;
        }

        @Override // java.util.Iterator
        public final Object next() {
            Object[] objArr = IdentityArraySet.this.b;
            int i = this.a;
            this.a = i + 1;
            Object obj = objArr[i];
            if (obj != null) {
                return obj;
            }
            d.w("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            return null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public AnonymousClass1() {
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return obj != null && a(obj) >= 0;
    }

    public final int a(Object obj) {
        int i = this.a - 1;
        int iIdentityHashCode = System.identityHashCode(obj);
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            Object obj2 = this.b[i3];
            if (obj2 == null) {
                d.w("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                return 0;
            }
            int iIdentityHashCode2 = System.identityHashCode(obj2);
            if (iIdentityHashCode2 < iIdentityHashCode) {
                i2 = i3 + 1;
            } else {
                if (iIdentityHashCode2 <= iIdentityHashCode) {
                    if (obj2 == obj) {
                        return i3;
                    }
                    for (int i4 = i3 - 1; -1 < i4; i4--) {
                        Object obj3 = this.b[i4];
                        if (obj3 == obj) {
                            return i4;
                        }
                        if (System.identityHashCode(obj3) != iIdentityHashCode) {
                            break;
                        }
                    }
                    int i5 = this.a;
                    for (int i6 = i3 + 1; i6 < i5; i6++) {
                        Object obj4 = this.b[i6];
                        if (obj4 == obj) {
                            return i6;
                        }
                        if (System.identityHashCode(obj4) != iIdentityHashCode) {
                            return -(i6 + 1);
                        }
                    }
                    return -(this.a + 1);
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        int i = this.a;
        for (int i2 = 0; i2 < i; i2++) {
            this.b[i2] = null;
        }
        this.a = 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.a == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new AnonymousClass1();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        int iA;
        if (obj == null || (iA = a(obj)) < 0) {
            return false;
        }
        int i = this.a;
        if (iA < i - 1) {
            Object[] objArr = this.b;
            n8.P(iA, iA + 1, i, objArr, objArr);
        }
        int i2 = this.a - 1;
        this.a = i2;
        this.b[i2] = null;
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.a;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        int iA;
        obj.getClass();
        if (this.a > 0) {
            iA = a(obj);
            if (iA >= 0) {
                return false;
            }
        } else {
            iA = -1;
        }
        int i = -(iA + 1);
        int i2 = this.a;
        Object[] objArr = this.b;
        if (i2 == objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            n8.P(i + 1, i, i2, objArr, objArr2);
            n8.S(0, i, 6, this.b, objArr2);
            this.b = objArr2;
        } else {
            n8.P(i + 1, i, i2, objArr, objArr);
        }
        this.b[i] = obj;
        this.a++;
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return wx.s(this, objArr);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return wx.r(this);
    }
}
