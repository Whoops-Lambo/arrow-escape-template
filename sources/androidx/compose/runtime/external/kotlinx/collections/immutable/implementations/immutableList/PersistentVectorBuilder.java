package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import defpackage.d;
import defpackage.e32;
import defpackage.h2;
import defpackage.k1;
import defpackage.n8;
import defpackage.rc1;
import defpackage.wr0;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder;", "E", "Lh2;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList$Builder;", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class PersistentVectorBuilder<E> extends h2 implements PersistentList.Builder<E> {
    public PersistentList a;
    public Object[] b;
    public Object[] c;
    public int d;
    public MutabilityOwnership e;
    public Object[] f;
    public Object[] g;
    public int h;

    /* JADX INFO: renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder$removeAll$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "E", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    final class AnonymousClass1 extends rc1 implements wr0 {
        public final /* synthetic */ Collection i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Collection collection) {
            super(1);
            this.i = collection;
        }

        @Override // defpackage.wr0
        public final Object invoke(Object obj) {
            return Boolean.valueOf(this.i.contains(obj));
        }
    }

    public final Object[] E(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            e32.i("Check failed.");
            return null;
        }
        if (i2 == 0) {
            return objArr;
        }
        int iA = UtilsKt.a(i, i2);
        Object obj = objArr[iA];
        if (obj == null) {
            d.w("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            return null;
        }
        Object objE = E((Object[]) obj, i, i2 - 5);
        if (iA < 31) {
            int i3 = iA + 1;
            if (objArr[i3] != null) {
                if (y(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] objArrC = C();
                n8.P(0, 0, i3, objArr, objArrC);
                objArr = objArrC;
            }
        }
        if (objE == objArr[iA]) {
            return objArr;
        }
        Object[] objArrA = A(objArr);
        objArrA[iA] = objE;
        return objArrA;
    }

    public final void G(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.f = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.g = objArr;
            this.h = i;
            this.d = i2;
            return;
        }
        ObjectRef objectRef = new ObjectRef(null);
        objArr.getClass();
        Object[] objArrF = F(objArr, i2, i, objectRef);
        objArrF.getClass();
        Object obj = objectRef.a;
        if (obj == null) {
            d.w("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            return;
        }
        this.g = (Object[]) obj;
        this.h = i;
        if (objArrF[1] == null) {
            this.f = (Object[]) objArrF[0];
            this.d = i2 - 5;
        } else {
            this.f = objArrF;
            this.d = i2;
        }
    }

    public final int M(wr0 wr0Var, Object[] objArr, int i, ObjectRef objectRef) {
        Object[] objArrA = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) wr0Var.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArrA = A(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArrA[i2] = obj;
                i2++;
            }
        }
        objectRef.a = objArrA;
        return i2;
    }

    public final void V(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArrC;
        if (i3 < 1) {
            e32.i("Check failed.");
            return;
        }
        Object[] objArrA = A(objArr);
        objArr2[0] = objArrA;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            n8.P(size + 1, i4, i2, objArrA, objArr3);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                objArrC = objArrA;
            } else {
                objArrC = C();
                i3--;
                objArr2[i3] = objArrC;
            }
            int i7 = i2 - i6;
            n8.P(0, i7, i2, objArrA, objArr3);
            n8.P(size + 1, i4, i7, objArrA, objArrC);
            objArr3 = objArrC;
        }
        Iterator<E> it = collection.iterator();
        n(objArrA, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] objArrC2 = C();
            n(objArrC2, 0, it);
            objArr2[i8] = objArrC2;
        }
        n(objArr3, 0, it);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final boolean y(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.e;
    }

    public static void n(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public final Object[] A(Object[] objArr) {
        if (objArr == null) {
            return C();
        }
        if (y(objArr)) {
            return objArr;
        }
        Object[] objArrC = C();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        n8.S(0, length, 6, objArr, objArrC);
        return objArrC;
    }

    public final Object[] C() {
        Object[] objArr = new Object[33];
        objArr[32] = this.e;
        return objArr;
    }

    public final Object[] D(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.e;
        return objArr;
    }

    public final Object[] F(Object[] objArr, int i, int i2, ObjectRef objectRef) {
        Object[] objArrF;
        int iA = UtilsKt.a(i2 - 1, i);
        if (i == 5) {
            objectRef.a = objArr[iA];
            objArrF = null;
        } else {
            Object obj = objArr[iA];
            if (obj == null) {
                d.w("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                return null;
            }
            objArrF = F((Object[]) obj, i - 5, i2, objectRef);
        }
        if (objArrF == null && iA == 0) {
            return null;
        }
        Object[] objArrA = A(objArr);
        objArrA[iA] = objArrF;
        return objArrA;
    }

    public final Object[] I(Object[] objArr, int i, Object[][] objArr2) {
        k1 k1Var = new k1(objArr2);
        int i2 = i >> 5;
        int i3 = this.d;
        Object[] objArrH = i2 < (1 << i3) ? H(objArr, i, i3, k1Var) : A(objArr);
        while (k1Var.hasNext()) {
            this.d += 5;
            objArrH = D(objArrH);
            int i4 = this.d;
            H(objArrH, 1 << i4, i4, k1Var);
        }
        return objArrH;
    }

    public final void J(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.h;
        int i2 = i >> 5;
        int i3 = this.d;
        if (i2 > (1 << i3)) {
            this.f = K(D(objArr), objArr2, this.d + 5);
            this.g = objArr3;
            this.d += 5;
            this.h++;
            return;
        }
        if (objArr == null) {
            this.f = objArr2;
            this.g = objArr3;
            this.h = i + 1;
        } else {
            this.f = K(objArr, objArr2, i3);
            this.g = objArr3;
            this.h++;
        }
    }

    public final int O(wr0 wr0Var, int i, ObjectRef objectRef) {
        int iM = M(wr0Var, this.g, i, objectRef);
        Object obj = objectRef.a;
        if (iM == i) {
            return i;
        }
        if (obj == null) {
            d.w("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            return 0;
        }
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iM, i, (Object) null);
        this.g = objArr;
        this.h -= i - iM;
        return iM;
    }

    public final boolean P(wr0 wr0Var) {
        wr0 wr0Var2 = wr0Var;
        int iW = W();
        Object[] objArrE = null;
        ObjectRef objectRef = new ObjectRef(null);
        boolean z = false;
        if (this.f != null) {
            AbstractListIterator abstractListIteratorZ = z(0);
            int iM = 32;
            while (iM == 32 && abstractListIteratorZ.hasNext()) {
                iM = M(wr0Var2, (Object[]) abstractListIteratorZ.next(), 32, objectRef);
            }
            if (iM == 32) {
                abstractListIteratorZ.hasNext();
                int iO = O(wr0Var2, iW, objectRef);
                if (iO == 0) {
                    G(this.f, this.h, this.d);
                }
                if (iO != iW) {
                }
            } else {
                int iPreviousIndex = abstractListIteratorZ.previousIndex() << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iL = iM;
                while (abstractListIteratorZ.hasNext()) {
                    iL = L(wr0Var2, (Object[]) abstractListIteratorZ.next(), 32, iL, objectRef, arrayList2, arrayList);
                    wr0Var2 = wr0Var;
                }
                int iL2 = L(wr0Var, this.g, iW, iL, objectRef, arrayList2, arrayList);
                Object obj = objectRef.a;
                if (obj == null) {
                    d.w("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    return false;
                }
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iL2, 32, (Object) null);
                boolean zIsEmpty = arrayList.isEmpty();
                Object[] objArrH = this.f;
                if (zIsEmpty) {
                    objArrH.getClass();
                } else {
                    objArrH = H(objArrH, iPreviousIndex, this.d, arrayList.iterator());
                }
                int size = iPreviousIndex + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    e32.i("Check failed.");
                    return false;
                }
                if (size != 0) {
                    int i = size - 1;
                    while (true) {
                        int i2 = this.d;
                        if ((i >> i2) != 0) {
                            objArrE = E(objArrH, i, i2);
                            break;
                        }
                        this.d = i2 - 5;
                        Object[] objArr2 = objArrH[0];
                        if (objArr2 == null) {
                            d.w("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                            return false;
                        }
                        objArrH = objArr2;
                    }
                } else {
                    this.d = 0;
                }
                this.f = objArrE;
                this.g = objArr;
                this.h = size + iL2;
            }
            z = true;
        } else if (O(wr0Var2, iW, objectRef) != iW) {
            z = true;
        }
        if (z) {
            ((AbstractList) this).modCount++;
        }
        return z;
    }

    public final Object S(int i, int i2, int i3, Object[] objArr) {
        int i4 = this.h - i;
        Object[] objArr2 = this.g;
        if (i4 == 1) {
            Object obj = objArr2[0];
            G(objArr, i, i2);
            return obj;
        }
        Object obj2 = objArr2[i3];
        Object[] objArrA = A(objArr2);
        n8.P(i3, i3 + 1, i4, objArr2, objArrA);
        objArrA[i4 - 1] = null;
        this.f = objArr;
        this.g = objArrA;
        this.h = (i + i4) - 1;
        this.d = i2;
        return obj2;
    }

    public final int T() {
        int i = this.h;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    public final int W() {
        int i = this.h;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    @Override // defpackage.h2
    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getH() {
        return this.h;
    }

    public final PersistentList k() {
        PersistentList persistentVector;
        Object[] objArr = this.f;
        if (objArr == this.b && this.g == this.c) {
            persistentVector = this.a;
        } else {
            this.e = new MutabilityOwnership();
            this.b = objArr;
            Object[] objArr2 = this.g;
            this.c = objArr2;
            if (objArr == null) {
                persistentVector = objArr2.length == 0 ? SmallPersistentVector.b : new SmallPersistentVector(Arrays.copyOf(objArr2, this.h));
            } else {
                persistentVector = new PersistentVector(objArr, objArr2, this.h, this.d);
            }
        }
        this.a = persistentVector;
        return persistentVector;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        ListImplementation.b(i, this.h);
        return new PersistentVectorMutableIterator(this, i);
    }

    public final int o() {
        return ((AbstractList) this).modCount;
    }

    public final void r(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.f == null) {
            e32.i("Required value was null.");
            return;
        }
        int i4 = i >> 5;
        AbstractListIterator abstractListIteratorZ = z(T() >> 5);
        int i5 = i3;
        Object[] objArrB = objArr2;
        while (abstractListIteratorZ.previousIndex() != i4) {
            Object[] objArr3 = (Object[]) abstractListIteratorZ.previous();
            n8.P(0, 32 - i2, 32, objArr3, objArrB);
            objArrB = B(i2, objArr3);
            i5--;
            objArr[i5] = objArrB;
        }
        Object[] objArr4 = (Object[]) abstractListIteratorZ.previous();
        int iT = i3 - (((T() >> 5) - 1) - i4);
        if (iT < i3) {
            objArr2 = objArr[iT];
            objArr2.getClass();
        }
        V(collection, i, objArr4, 32, objArr, iT, objArr2);
    }

    public final AbstractListIterator z(int i) {
        if (this.f == null) {
            e32.i("Required value was null.");
            return null;
        }
        int iT = T() >> 5;
        ListImplementation.b(i, iT);
        int i2 = this.d;
        Object[] objArr = this.f;
        if (i2 == 0) {
            objArr.getClass();
            return new SingleElementListIterator(objArr, i);
        }
        objArr.getClass();
        return new TrieIterator(i, iT, i2 / 5, objArr);
    }

    public PersistentVectorBuilder(AbstractPersistentList abstractPersistentList, Object[] objArr, Object[] objArr2, int i) {
        objArr2.getClass();
        this.a = abstractPersistentList;
        this.b = objArr;
        this.c = objArr2;
        this.d = i;
        this.e = new MutabilityOwnership();
        this.f = objArr;
        this.g = objArr2;
        this.h = abstractPersistentList.size();
    }

    public final Object[] B(int i, Object[] objArr) {
        if (y(objArr)) {
            n8.P(i, 0, 32 - i, objArr, objArr);
            return objArr;
        }
        Object[] objArrC = C();
        n8.P(i, 0, 32 - i, objArr, objArrC);
        return objArrC;
    }

    public final Object[] H(Object[] objArr, int i, int i2, Iterator it) {
        if (it.hasNext()) {
            if (i2 >= 0) {
                if (i2 == 0) {
                    return (Object[]) it.next();
                }
                Object[] objArrA = A(objArr);
                int iA = UtilsKt.a(i, i2);
                int i3 = i2 - 5;
                objArrA[iA] = H((Object[]) objArrA[iA], i, i3, it);
                while (true) {
                    iA++;
                    if (iA >= 32 || !it.hasNext()) {
                        break;
                    }
                    objArrA[iA] = H((Object[]) objArrA[iA], 0, i3, it);
                }
                return objArrA;
            }
            e32.i("Check failed.");
            return null;
        }
        e32.i("Check failed.");
        return null;
    }

    public final Object[] K(Object[] objArr, Object[] objArr2, int i) {
        int iA = UtilsKt.a(getH() - 1, i);
        Object[] objArrA = A(objArr);
        if (i == 5) {
            objArrA[iA] = objArr2;
            return objArrA;
        }
        objArrA[iA] = K((Object[]) objArrA[iA], objArr2, i - 5);
        return objArrA;
    }

    public final int L(wr0 wr0Var, Object[] objArr, int i, int i2, ObjectRef objectRef, ArrayList arrayList, ArrayList arrayList2) {
        Object[] objArrC;
        if (y(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = objectRef.a;
        if (obj != null) {
            Object[] objArr2 = (Object[]) obj;
            Object[] objArr3 = objArr2;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj2 = objArr[i3];
                if (!((Boolean) wr0Var.invoke(obj2)).booleanValue()) {
                    if (i2 == 32) {
                        if (!arrayList.isEmpty()) {
                            objArrC = (Object[]) arrayList.remove(arrayList.size() - 1);
                        } else {
                            objArrC = C();
                        }
                        objArr3 = objArrC;
                        i2 = 0;
                    }
                    objArr3[i2] = obj2;
                    i2++;
                }
            }
            objectRef.a = objArr3;
            if (objArr2 != objArr3) {
                arrayList2.add(objArr2);
            }
            return i2;
        }
        d.w("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return 0;
    }

    public final Object[] Q(Object[] objArr, int i, int i2, ObjectRef objectRef) {
        int iA = UtilsKt.a(i2, i);
        int iA2 = 31;
        if (i == 0) {
            Object obj = objArr[iA];
            Object[] objArrA = A(objArr);
            n8.P(iA, iA + 1, 32, objArr, objArrA);
            objArrA[31] = objectRef.a;
            objectRef.a = obj;
            return objArrA;
        }
        if (objArr[31] == null) {
            iA2 = UtilsKt.a(T() - 1, i);
        }
        Object[] objArrA2 = A(objArr);
        int i3 = i - 5;
        int i4 = iA + 1;
        if (i4 <= iA2) {
            while (true) {
                Object obj2 = objArrA2[iA2];
                if (obj2 != null) {
                    objArrA2[iA2] = Q((Object[]) obj2, i3, 0, objectRef);
                    if (iA2 == i4) {
                        break;
                    }
                    iA2--;
                } else {
                    d.w("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    return null;
                }
            }
        }
        Object obj3 = objArrA2[iA];
        if (obj3 != null) {
            objArrA2[iA] = Q((Object[]) obj3, i3, i2, objectRef);
            return objArrA2;
        }
        d.w("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return null;
    }

    public final Object[] U(Object[] objArr, int i, int i2, Object obj, ObjectRef objectRef) {
        int iA = UtilsKt.a(i2, i);
        Object[] objArrA = A(objArr);
        if (i == 0) {
            if (objArrA != objArr) {
                ((AbstractList) this).modCount++;
            }
            objectRef.a = objArrA[iA];
            objArrA[iA] = obj;
            return objArrA;
        }
        Object obj2 = objArrA[iA];
        if (obj2 != null) {
            objArrA[iA] = U((Object[]) obj2, i - 5, i2, obj, objectRef);
            return objArrA;
        }
        d.w("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        ListImplementation.b(i, getH());
        if (i == getH()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iT = T();
        if (i >= iT) {
            x(i - iT, obj, this.f);
            return;
        }
        ObjectRef objectRef = new ObjectRef(null);
        Object[] objArr = this.f;
        objArr.getClass();
        x(0, objectRef.a, t(objArr, this.d, i, obj, objectRef));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        Object[] objArrC;
        collection.getClass();
        ListImplementation.b(i, this.h);
        if (i == this.h) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.h - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.g;
            Object[] objArrA = A(objArr);
            n8.P(size2 + 1, i3, W(), objArr, objArrA);
            n(objArrA, i3, collection.iterator());
            this.g = objArrA;
            this.h = collection.size() + this.h;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iW = W();
        int size3 = collection.size() + this.h;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= T()) {
            objArrC = C();
            collection2 = collection;
            V(collection2, i, this.g, iW, objArr2, size, objArrC);
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            Object[] objArr3 = this.g;
            if (size3 > iW) {
                int i4 = size3 - iW;
                Object[] objArrB = B(i4, objArr3);
                r(collection2, i, i4, objArr2, size, objArrB);
                objArr2 = objArr2;
                objArrC = objArrB;
            } else {
                objArrC = C();
                int i5 = iW - size3;
                n8.P(0, i5, iW, objArr3, objArrC);
                int i6 = 32 - i5;
                Object[] objArrB2 = B(i6, this.g);
                int i7 = size - 1;
                objArr2[i7] = objArrB2;
                r(collection2, i, i6, objArr2, i7, objArrB2);
                collection2 = collection2;
            }
        }
        this.f = I(this.f, i2, objArr2);
        this.g = objArrC;
        this.h = collection2.size() + this.h;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        ListImplementation.a(i, getH());
        if (T() <= i) {
            objArr = this.g;
        } else {
            Object[] objArr2 = this.f;
            objArr2.getClass();
            for (int i2 = this.d; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[UtilsKt.a(i, i2)];
                if (objArr3 != null) {
                    objArr2 = objArr3;
                } else {
                    d.w("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    return null;
                }
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // defpackage.h2
    public final Object h(int i) {
        ListImplementation.a(i, getH());
        ((AbstractList) this).modCount++;
        int iT = T();
        if (i >= iT) {
            return S(iT, this.d, i - iT, this.f);
        }
        ObjectRef objectRef = new ObjectRef(this.g[0]);
        Object[] objArr = this.f;
        objArr.getClass();
        S(iT, this.d, 0, Q(objArr, this.d, i, objectRef));
        return objectRef.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        return P(new AnonymousClass1(collection));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        ListImplementation.a(i, getH());
        if (T() <= i) {
            Object[] objArrA = A(this.g);
            if (objArrA != this.g) {
                ((AbstractList) this).modCount++;
            }
            int i2 = i & 31;
            Object obj2 = objArrA[i2];
            objArrA[i2] = obj;
            this.g = objArrA;
            return obj2;
        }
        ObjectRef objectRef = new ObjectRef(null);
        Object[] objArr = this.f;
        objArr.getClass();
        this.f = U(objArr, this.d, i, obj, objectRef);
        return objectRef.a;
    }

    public final Object[] t(Object[] objArr, int i, int i2, Object obj, ObjectRef objectRef) {
        Object obj2;
        int iA = UtilsKt.a(i2, i);
        if (i == 0) {
            objectRef.a = objArr[31];
            Object[] objArrA = A(objArr);
            n8.P(iA + 1, iA, 31, objArr, objArrA);
            objArrA[iA] = obj;
            return objArrA;
        }
        Object[] objArrA2 = A(objArr);
        int i3 = i - 5;
        Object obj3 = objArrA2[iA];
        if (obj3 != null) {
            objArrA2[iA] = t((Object[]) obj3, i3, i2, obj, objectRef);
            while (true) {
                iA++;
                if (iA >= 32 || (obj2 = objArrA2[iA]) == null) {
                    break;
                }
                objArrA2[iA] = t((Object[]) obj2, i3, 0, objectRef.a, objectRef);
            }
            return objArrA2;
        }
        d.w("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return null;
    }

    public final void x(int i, Object obj, Object[] objArr) {
        int iW = W();
        Object[] objArrA = A(this.g);
        Object[] objArr2 = this.g;
        if (iW < 32) {
            n8.P(i + 1, i, iW, objArr2, objArrA);
            objArrA[i] = obj;
            this.f = objArr;
            this.g = objArrA;
            this.h++;
            return;
        }
        Object obj2 = objArr2[31];
        n8.P(i + 1, i, 31, objArr2, objArrA);
        objArrA[i] = obj;
        J(objArr, objArrA, D(obj2));
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iW = W();
        if (iW < 32) {
            Object[] objArrA = A(this.g);
            objArrA[iW] = obj;
            this.g = objArrA;
            this.h = getH() + 1;
        } else {
            J(this.f, this.g, D(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iW = W();
        Iterator<E> it = collection.iterator();
        if (32 - iW >= collection.size()) {
            Object[] objArrA = A(this.g);
            n(objArrA, iW, it);
            this.g = objArrA;
            this.h = collection.size() + this.h;
            return true;
        }
        int size = ((collection.size() + iW) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrA2 = A(this.g);
        n(objArrA2, iW, it);
        objArr[0] = objArrA2;
        for (int i = 1; i < size; i++) {
            Object[] objArrC = C();
            n(objArrC, 0, it);
            objArr[i] = objArrC;
        }
        this.f = I(this.f, T(), objArr);
        Object[] objArrC2 = C();
        n(objArrC2, 0, it);
        this.g = objArrC2;
        this.h = collection.size() + this.h;
        return true;
    }
}
