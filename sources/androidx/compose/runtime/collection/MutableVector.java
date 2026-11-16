package androidx.compose.runtime.collection;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.bc1;
import defpackage.dc1;
import defpackage.eu;
import defpackage.n8;
import defpackage.s71;
import defpackage.wx;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00060\u0002j\u0002`\u0003:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/runtime/collection/MutableVector;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "MutableVectorList", "SubList", "VectorListIterator", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class MutableVector<T> implements RandomAccess {
    public Object[] a;
    public List b;
    public int c;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/collection/MutableVector$MutableVectorList;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class MutableVectorList<T> implements List<T>, dc1 {
        public final MutableVector a;

        @Override // java.util.List, java.util.Collection
        public final boolean add(Object obj) {
            this.a.b(obj);
            return true;
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            this.a.h();
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            return this.a.i(obj);
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            return this.a.l(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.a.m();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            MutableVector mutableVector = this.a;
            int i = mutableVector.c;
            if (i <= 0) {
                return -1;
            }
            int i2 = i - 1;
            Object[] objArr = mutableVector.a;
            while (!s71.b(obj, objArr[i2])) {
                i2--;
                if (i2 < 0) {
                    return -1;
                }
            }
            return i2;
        }

        @Override // java.util.List
        public final ListIterator listIterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.a.c;
        }

        public MutableVectorList(MutableVector mutableVector) {
            this.a = mutableVector;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection collection) {
            collection.getClass();
            MutableVector mutableVector = this.a;
            return mutableVector.d(mutableVector.c, collection);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection collection) {
            collection.getClass();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!this.a.i(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final Object get(int i) {
            MutableVectorKt.a(i, this);
            return this.a.a[i];
        }

        @Override // java.util.List
        public final Object remove(int i) {
            MutableVectorKt.a(i, this);
            return this.a.q(i);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection collection) {
            collection.getClass();
            if (!collection.isEmpty()) {
                MutableVector mutableVector = this.a;
                int i = mutableVector.c;
                Iterator<T> it = collection.iterator();
                while (it.hasNext()) {
                    mutableVector.o(it.next());
                }
                if (i != mutableVector.c) {
                    return true;
                }
                return false;
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection collection) {
            collection.getClass();
            MutableVector mutableVector = this.a;
            int i = mutableVector.c;
            for (int i2 = i - 1; -1 < i2; i2--) {
                if (!collection.contains(mutableVector.a[i2])) {
                    mutableVector.q(i2);
                }
            }
            if (i != mutableVector.c) {
                return true;
            }
            return false;
        }

        @Override // java.util.List
        public final Object set(int i, Object obj) {
            MutableVectorKt.a(i, this);
            Object[] objArr = this.a.a;
            Object obj2 = objArr[i];
            objArr[i] = obj;
            return obj2;
        }

        @Override // java.util.List
        public final List subList(int i, int i2) {
            MutableVectorKt.b(i, i2, this);
            return new SubList(i, i2, this);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray(Object[] objArr) {
            objArr.getClass();
            return wx.s(this, objArr);
        }

        @Override // java.util.List
        public final void add(int i, Object obj) {
            this.a.a(i, obj);
        }

        @Override // java.util.List
        public final ListIterator listIterator(int i) {
            return new VectorListIterator(this, i);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return wx.r(this);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            return this.a.o(obj);
        }

        @Override // java.util.List
        public final boolean addAll(int i, Collection collection) {
            collection.getClass();
            return this.a.d(i, collection);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/collection/MutableVector$SubList;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class SubList<T> implements List<T>, dc1 {
        public final List a;
        public final int b;
        public int c;

        @Override // java.util.List
        public final void add(int i, Object obj) {
            this.a.add(i + this.b, obj);
            this.c++;
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            int i = this.c - 1;
            int i2 = this.b;
            if (i2 <= i) {
                while (true) {
                    this.a.remove(i);
                    if (i == i2) {
                        break;
                    } else {
                        i--;
                    }
                }
            }
            this.c = i2;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            int i = this.c;
            for (int i2 = this.b; i2 < i; i2++) {
                if (s71.b(this.a.get(i2), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            int i = this.c;
            int i2 = this.b;
            for (int i3 = i2; i3 < i; i3++) {
                if (s71.b(this.a.get(i3), obj)) {
                    return i3 - i2;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.c == this.b;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            int i = this.c - 1;
            int i2 = this.b;
            if (i2 > i) {
                return -1;
            }
            while (!s71.b(this.a.get(i), obj)) {
                if (i == i2) {
                    return -1;
                }
                i--;
            }
            return i - i2;
        }

        @Override // java.util.List
        public final ListIterator listIterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            int i = this.c;
            for (int i2 = this.b; i2 < i; i2++) {
                List list = this.a;
                if (s71.b(list.get(i2), obj)) {
                    list.remove(i2);
                    this.c--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.c - this.b;
        }

        public SubList(int i, int i2, List list) {
            this.a = list;
            this.b = i;
            this.c = i2;
        }

        @Override // java.util.List
        public final boolean addAll(int i, Collection collection) {
            collection.getClass();
            this.a.addAll(i + this.b, collection);
            this.c = collection.size() + this.c;
            if (collection.size() > 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection collection) {
            collection.getClass();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final Object get(int i) {
            MutableVectorKt.a(i, this);
            return this.a.get(i + this.b);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection collection) {
            collection.getClass();
            int i = this.c;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            if (i != this.c) {
                return true;
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection collection) {
            collection.getClass();
            int i = this.c;
            int i2 = i - 1;
            int i3 = this.b;
            if (i3 <= i2) {
                while (true) {
                    List list = this.a;
                    if (!collection.contains(list.get(i2))) {
                        list.remove(i2);
                        this.c--;
                    }
                    if (i2 == i3) {
                        break;
                    }
                    i2--;
                }
            }
            if (i != this.c) {
                return true;
            }
            return false;
        }

        @Override // java.util.List
        public final Object set(int i, Object obj) {
            MutableVectorKt.a(i, this);
            return this.a.set(i + this.b, obj);
        }

        @Override // java.util.List
        public final List subList(int i, int i2) {
            MutableVectorKt.b(i, i2, this);
            return new SubList(i, i2, this);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray(Object[] objArr) {
            objArr.getClass();
            return wx.s(this, objArr);
        }

        @Override // java.util.List
        public final ListIterator listIterator(int i) {
            return new VectorListIterator(this, i);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return wx.r(this);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean add(Object obj) {
            int i = this.c;
            this.c = i + 1;
            this.a.add(i, obj);
            return true;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection collection) {
            collection.getClass();
            this.a.addAll(this.c, collection);
            this.c = collection.size() + this.c;
            return collection.size() > 0;
        }

        @Override // java.util.List
        public final Object remove(int i) {
            MutableVectorKt.a(i, this);
            Object objRemove = this.a.remove(i + this.b);
            this.c--;
            return objRemove;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/collection/MutableVector$VectorListIterator;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class VectorListIterator<T> implements ListIterator<T>, bc1 {
        public final List a;
        public int b;

        @Override // java.util.ListIterator
        public final void add(Object obj) {
            this.a.add(this.b, obj);
            this.b++;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.b < this.a.size();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.b > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            int i = this.b;
            this.b = i + 1;
            return this.a.get(i);
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.b;
        }

        @Override // java.util.ListIterator
        public final Object previous() {
            int i = this.b - 1;
            this.b = i;
            return this.a.get(i);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            int i = this.b - 1;
            this.b = i;
            this.a.remove(i);
        }

        @Override // java.util.ListIterator
        public final void set(Object obj) {
            this.a.set(this.b, obj);
        }

        public VectorListIterator(List list, int i) {
            this.a = list;
            this.b = i;
        }
    }

    public final void a(int i, Object obj) {
        k(this.c + 1);
        Object[] objArr = this.a;
        int i2 = this.c;
        if (i != i2) {
            n8.P(i + 1, i, i2, objArr, objArr);
        }
        objArr[i] = obj;
        this.c++;
    }

    public final void b(Object obj) {
        k(this.c + 1);
        Object[] objArr = this.a;
        int i = this.c;
        objArr[i] = obj;
        this.c = i + 1;
    }

    public final List e() {
        List list = this.b;
        if (list != null) {
            return list;
        }
        MutableVectorList mutableVectorList = new MutableVectorList(this);
        this.b = mutableVectorList;
        return mutableVectorList;
    }

    public final void h() {
        Object[] objArr = this.a;
        int i = this.c;
        while (true) {
            i--;
            if (-1 >= i) {
                this.c = 0;
                return;
            }
            objArr[i] = null;
        }
    }

    public final boolean i(Object obj) {
        int i = this.c - 1;
        if (i >= 0) {
            for (int i2 = 0; !s71.b(this.a[i2], obj); i2++) {
                if (i2 != i) {
                }
            }
            return true;
        }
        return false;
    }

    public final void k(int i) {
        Object[] objArr = this.a;
        if (objArr.length < i) {
            this.a = Arrays.copyOf(objArr, Math.max(i, objArr.length * 2));
        }
    }

    public final int l(Object obj) {
        int i = this.c;
        if (i <= 0) {
            return -1;
        }
        Object[] objArr = this.a;
        int i2 = 0;
        while (!s71.b(obj, objArr[i2])) {
            i2++;
            if (i2 >= i) {
                return -1;
            }
        }
        return i2;
    }

    public final boolean m() {
        return this.c == 0;
    }

    public final boolean n() {
        return this.c != 0;
    }

    public final Object q(int i) {
        Object[] objArr = this.a;
        Object obj = objArr[i];
        int i2 = this.c;
        if (i != i2 - 1) {
            n8.P(i, i + 1, i2, objArr, objArr);
        }
        int i3 = this.c - 1;
        this.c = i3;
        objArr[i3] = null;
        return obj;
    }

    public final void c(int i, MutableVector mutableVector) {
        mutableVector.getClass();
        if (mutableVector.m()) {
            return;
        }
        k(this.c + mutableVector.c);
        Object[] objArr = this.a;
        int i2 = this.c;
        if (i != i2) {
            n8.P(mutableVector.c + i, i, i2, objArr, objArr);
        }
        n8.P(i, 0, mutableVector.c, mutableVector.a, objArr);
        this.c += mutableVector.c;
    }

    public final boolean d(int i, Collection collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        k(collection.size() + this.c);
        Object[] objArr = this.a;
        if (i != this.c) {
            n8.P(collection.size() + i, i, this.c, objArr, objArr);
        }
        for (T t : collection) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                objArr[i2 + i] = t;
                i2 = i3;
            } else {
                eu.G();
                throw null;
            }
        }
        this.c = collection.size() + this.c;
        return true;
    }

    public final boolean o(Object obj) {
        int iL = l(obj);
        if (iL >= 0) {
            q(iL);
            return true;
        }
        return false;
    }

    public final void p(MutableVector mutableVector) {
        mutableVector.getClass();
        int i = mutableVector.c - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                o(mutableVector.a[i2]);
                if (i2 != i) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }
}
