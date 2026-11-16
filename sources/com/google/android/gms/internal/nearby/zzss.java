package com.google.android.gms.internal.nearby;

import defpackage.d;
import defpackage.j85;
import defpackage.pv1;
import defpackage.x75;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class zzss extends zzsn implements Set {
    public transient zzsq b;

    public static int r(int i) {
        int iMax = Math.max(i, 2);
        if (iMax < 751619276) {
            int iHighestOneBit = Integer.highestOneBit(iMax - 1);
            do {
                iHighestOneBit += iHighestOneBit;
            } while (((double) iHighestOneBit) * 0.7d < iMax);
            return iHighestOneBit;
        }
        if (iMax < 1073741824) {
            return 1073741824;
        }
        d.r("collection too large");
        return 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzss) && (this instanceof b) && (((zzss) obj) instanceof b) && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                return size() == set.size() && containsAll(set);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static zzss x(int i, Object... objArr) {
        if (i == 0) {
            return b.i;
        }
        if (i == 1) {
            Object obj = objArr[0];
            obj.getClass();
            return new j85(obj);
        }
        int iR = r(i);
        Object[] objArr2 = new Object[iR];
        int i2 = iR - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                d.w(pv1.k(i5, "at index "));
                return null;
            }
            int iHashCode = obj2.hashCode();
            int iRotateLeft = (int) (((long) Integer.rotateLeft((int) (((long) iHashCode) * (-862048943)), 15)) * 461845907);
            while (true) {
                int i6 = iRotateLeft & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iRotateLeft++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            obj4.getClass();
            return new j85(obj4);
        }
        if (r(i4) < iR / 2) {
            return x(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new b(i3, i2, i4, objArr, objArr2);
    }

    @Override // com.google.android.gms.internal.nearby.zzsn
    public zzsq i() {
        zzsq zzsqVar = this.b;
        if (zzsqVar != null) {
            return zzsqVar;
        }
        a aVarT = t();
        this.b = aVarT;
        return aVarT;
    }

    public a t() {
        Object[] array = toArray(zzsn.a);
        x75 x75Var = zzsq.b;
        return zzsq.t(array.length, array);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int iHashCode;
        int i = 0;
        for (Object obj : this) {
            if (obj != null) {
                iHashCode = obj.hashCode();
            } else {
                iHashCode = 0;
            }
            i += iHashCode;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.nearby.zzsn, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
