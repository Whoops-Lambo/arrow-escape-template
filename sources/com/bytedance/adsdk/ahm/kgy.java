package com.bytedance.adsdk.ahm;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class kgy<E> implements Collection<E>, Set<E> {
    private static Object[] ct;
    private static int fi;
    private static int noq;
    private static final int[] rz = new int[0];
    private static final Object[] uq = new Object[0];
    private static Object[] yo;
    int ahm;
    private int[] gf;
    Object[] kgy;
    private vs<E, E> ra;

    private static void kgy(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (kgy.class) {
                try {
                    if (fi < 10) {
                        objArr[0] = yo;
                        objArr[1] = iArr;
                        for (int i2 = i - 1; i2 >= 2; i2--) {
                            objArr[i2] = null;
                        }
                        yo = objArr;
                        fi++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (kgy.class) {
                try {
                    if (noq < 10) {
                        objArr[0] = ct;
                        objArr[1] = iArr;
                        for (int i3 = i - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        ct = objArr;
                        noq++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e) {
        int i;
        int iKgy;
        if (e == null) {
            iKgy = kgy();
            i = 0;
        } else {
            int iHashCode = e.hashCode();
            i = iHashCode;
            iKgy = kgy(e, iHashCode);
        }
        if (iKgy >= 0) {
            return false;
        }
        int i2 = ~iKgy;
        int i3 = this.ahm;
        int[] iArr = this.gf;
        if (i3 >= iArr.length) {
            int i4 = 8;
            if (i3 >= 8) {
                i4 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.kgy;
            uq(i4);
            int[] iArr2 = this.gf;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.kgy, 0, objArr.length);
            }
            kgy(iArr, objArr, this.ahm);
        }
        int i5 = this.ahm;
        if (i2 < i5) {
            int[] iArr3 = this.gf;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr2 = this.kgy;
            System.arraycopy(objArr2, i2, objArr2, i6, this.ahm - i2);
        }
        this.gf[i2] = i;
        this.kgy[i2] = e;
        this.ahm++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i = 0; i < this.ahm; i++) {
                try {
                    if (!set.contains(ahm(i))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.ahm) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.ahm));
        }
        System.arraycopy(this.kgy, 0, tArr, 0, this.ahm);
        int length = tArr.length;
        int i = this.ahm;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    private vs<E, E> ahm() {
        if (this.ra == null) {
            this.ra = new vs<E, E>() { // from class: com.bytedance.adsdk.ahm.kgy.1
                @Override // com.bytedance.adsdk.ahm.vs
                public Map<E, E> ahm() {
                    throw new UnsupportedOperationException("not a map");
                }

                @Override // com.bytedance.adsdk.ahm.vs
                public Object kgy(int i, int i2) {
                    return kgy.this.kgy[i];
                }

                @Override // com.bytedance.adsdk.ahm.vs
                public void rz() {
                    kgy.this.clear();
                }

                @Override // com.bytedance.adsdk.ahm.vs
                public int kgy() {
                    return kgy.this.ahm;
                }

                @Override // com.bytedance.adsdk.ahm.vs
                public int kgy(Object obj) {
                    return kgy.this.kgy(obj);
                }

                @Override // com.bytedance.adsdk.ahm.vs
                public void kgy(int i) {
                    kgy.this.rz(i);
                }
            };
        }
        return this.ra;
    }

    private void uq(int i) {
        if (i == 8) {
            synchronized (kgy.class) {
                Object[] objArr = yo;
                if (objArr != null) {
                    this.kgy = objArr;
                    yo = (Object[]) objArr[0];
                    this.gf = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    fi--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (kgy.class) {
                Object[] objArr2 = ct;
                if (objArr2 != null) {
                    this.kgy = objArr2;
                    ct = (Object[]) objArr2[0];
                    this.gf = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    noq--;
                    return;
                }
            }
        }
        this.gf = new int[i];
        this.kgy = new Object[i];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        kgy(collection.size() + this.ahm);
        Iterator<? extends E> it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i = this.ahm;
        if (i != 0) {
            kgy(this.gf, this.kgy, i);
            this.gf = rz;
            this.kgy = uq;
            this.ahm = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.gf;
        int i = this.ahm;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.ahm <= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.ahm - 1; i >= 0; i--) {
            if (!collection.contains(this.kgy[i])) {
                rz(i);
                z = true;
            }
        }
        return z;
    }

    public E rz(int i) {
        Object[] objArr = this.kgy;
        E e = (E) objArr[i];
        int i2 = this.ahm;
        int[] iArr = this.gf;
        if (i2 <= 1) {
            kgy(iArr, objArr, i2);
            this.gf = rz;
            this.kgy = uq;
            this.ahm = 0;
            return e;
        }
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            int i3 = i2 - 1;
            this.ahm = i3;
            if (i < i3) {
                int i4 = i + 1;
                System.arraycopy(iArr, i4, iArr, i, i3 - i);
                Object[] objArr2 = this.kgy;
                System.arraycopy(objArr2, i4, objArr2, i, this.ahm - i);
            }
            this.kgy[this.ahm] = null;
            return e;
        }
        uq(i2 > 8 ? i2 + (i2 >> 1) : 8);
        this.ahm--;
        if (i > 0) {
            System.arraycopy(iArr, 0, this.gf, 0, i);
            System.arraycopy(objArr, 0, this.kgy, 0, i);
        }
        int i5 = this.ahm;
        if (i < i5) {
            int i6 = i + 1;
            System.arraycopy(iArr, i6, this.gf, i, i5 - i);
            System.arraycopy(objArr, i6, this.kgy, i, this.ahm - i);
        }
        return e;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.ahm;
    }

    public kgy(int i) {
        if (i == 0) {
            this.gf = rz;
            this.kgy = uq;
        } else {
            uq(i);
        }
        this.ahm = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (kgy(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return ahm().uq().iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iKgy = kgy(obj);
        if (iKgy >= 0) {
            rz(iKgy);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    public String toString() {
        if (isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb = new StringBuilder(this.ahm * 14);
        sb.append('{');
        for (int i = 0; i < this.ahm; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            E eAhm = ahm(i);
            if (eAhm != this) {
                sb.append(eAhm);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public E ahm(int i) {
        return (E) this.kgy[i];
    }

    public kgy() {
        this(0);
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i = this.ahm;
        Object[] objArr = new Object[i];
        System.arraycopy(this.kgy, 0, objArr, 0, i);
        return objArr;
    }

    private int kgy() {
        int i = this.ahm;
        if (i == 0) {
            return -1;
        }
        int iKgy = ahm.kgy(this.gf, i, 0);
        if (iKgy < 0 || this.kgy[iKgy] == null) {
            return iKgy;
        }
        int i2 = iKgy + 1;
        while (i2 < i && this.gf[i2] == 0) {
            if (this.kgy[i2] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iKgy - 1; i3 >= 0 && this.gf[i3] == 0; i3--) {
            if (this.kgy[i3] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    private int kgy(Object obj, int i) {
        int i2 = this.ahm;
        if (i2 == 0) {
            return -1;
        }
        int iKgy = ahm.kgy(this.gf, i2, i);
        if (iKgy < 0 || obj.equals(this.kgy[iKgy])) {
            return iKgy;
        }
        int i3 = iKgy + 1;
        while (i3 < i2 && this.gf[i3] == i) {
            if (obj.equals(this.kgy[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iKgy - 1; i4 >= 0 && this.gf[i4] == i; i4--) {
            if (obj.equals(this.kgy[i4])) {
                return i4;
            }
        }
        return ~i3;
    }

    public void kgy(int i) {
        int[] iArr = this.gf;
        if (iArr.length < i) {
            Object[] objArr = this.kgy;
            uq(i);
            int i2 = this.ahm;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.gf, 0, i2);
                System.arraycopy(objArr, 0, this.kgy, 0, this.ahm);
            }
            kgy(iArr, objArr, this.ahm);
        }
    }

    public int kgy(Object obj) {
        return obj == null ? kgy() : kgy(obj, obj.hashCode());
    }
}
