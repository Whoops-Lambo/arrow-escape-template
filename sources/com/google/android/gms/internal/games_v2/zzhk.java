package com.google.android.gms.internal.games_v2;

import defpackage.bz4;
import defpackage.d;
import defpackage.qb5;
import defpackage.ur4;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzhk extends zzgy implements Set {
    public transient zzhd b;

    public static int zzf(int i) {
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
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzhk) && (this instanceof b) && (((zzhk) obj) instanceof b) && hashCode() != obj.hashCode()) {
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

    public static zzhk t(int i, Object... objArr) {
        if (i == 0) {
            return b.i;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new bz4(obj);
        }
        int iZzf = zzf(i);
        Object[] objArr2 = new Object[iZzf];
        int i2 = iZzf - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            zzhs.a(i5, obj2);
            int iHashCode = obj2.hashCode();
            int iT = qb5.t(iHashCode);
            while (true) {
                int i6 = iT & i2;
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
                iT++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new bz4(obj4);
        }
        if (zzf(i4) < iZzf / 2) {
            return t(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new b(i3, i2, i4, objArr, objArr2);
    }

    public final zzhd o() {
        zzhd zzhdVar = this.b;
        if (zzhdVar != null) {
            return zzhdVar;
        }
        zzhd zzhdVarR = r();
        this.b = zzhdVarR;
        return zzhdVarR;
    }

    public zzhd r() {
        Object[] array = toArray(zzgy.a);
        ur4 ur4Var = zzhd.b;
        int length = array.length;
        return length == 0 ? a.e : new a(array, length);
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

    @Override // com.google.android.gms.internal.games_v2.zzgy, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
