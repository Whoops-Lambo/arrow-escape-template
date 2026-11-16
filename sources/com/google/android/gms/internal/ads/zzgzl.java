package com.google.android.gms.internal.ads;

import defpackage.ar4;
import defpackage.c71;
import defpackage.gr4;
import defpackage.s71;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class zzgzl<E> extends zzgyx<E> implements Set<E> {
    public static final /* synthetic */ int c = 0;
    public transient zzgzb b;

    public static zzgzl t(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        int length = objArr.length;
        int i = length + 6;
        Object[] objArr2 = new Object[i];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, length);
        return B(i, objArr2);
    }

    public static int x(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            zzgvz.b("collection too large", iMax < 1073741824);
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (((double) iHighestOneBit) * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static zzgzk A(int i) {
        c71.z(i, "expectedSize");
        zzgzk zzgzkVar = new zzgzk(i);
        zzgzkVar.d = new Object[x(i)];
        return zzgzkVar;
    }

    public static zzgzl B(int i, Object... objArr) {
        if (i == 0) {
            return x.j;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new gr4(obj);
        }
        int iX = x(i);
        Object[] objArr2 = new Object[iX];
        int i2 = iX - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            zzhau.b(i5, obj2);
            int iHashCode = obj2.hashCode();
            int iH = s71.H(iHashCode);
            while (true) {
                int i6 = iH & i2;
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
                iH++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new gr4(obj4);
        }
        if (x(i4) < iX / 2) {
            return B(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new x(i3, i2, i4, objArr, objArr2);
    }

    public static zzgzl y(Set set) {
        if ((set instanceof zzgzl) && !(set instanceof SortedSet)) {
            zzgzl zzgzlVar = (zzgzl) set;
            if (!zzgzlVar.o()) {
                return zzgzlVar;
            }
        }
        Object[] array = set.toArray();
        return B(array.length, array);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzgzl) && (this instanceof x) && (((zzgzl) obj) instanceof x) && hashCode() != obj.hashCode()) {
            return false;
        }
        return zzhbl.d(this, obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public zzgzb n() {
        zzgzb zzgzbVar = this.b;
        if (zzgzbVar != null) {
            return zzgzbVar;
        }
        zzgzb zzgzbVarZ = z();
        this.b = zzgzbVarZ;
        return zzgzbVarZ;
    }

    public zzgzb z() {
        Object[] array = toArray(zzgyx.a);
        ar4 ar4Var = zzgzb.b;
        return zzgzb.D(array.length, array);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzhbl.c(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgyx, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
