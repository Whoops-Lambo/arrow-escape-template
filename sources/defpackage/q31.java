package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class q31 extends u21 implements Set {
    public static final /* synthetic */ int c = 0;
    public transient d31 b;

    public static q31 B(Object obj, Object obj2) {
        return x(2, obj, obj2);
    }

    public static q31 C(String str, String str2, String str3) {
        return x(3, str, str2, str3);
    }

    public static int t(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            fs1.f("collection too large", iMax < 1073741824);
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static q31 z(Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? x(objArr.length, (Object[]) objArr.clone()) : new mg2(objArr[0]);
        }
        return e42.j;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static q31 x(int i, Object... objArr) {
        if (i == 0) {
            return e42.j;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new mg2(obj);
        }
        int iT = t(i);
        Object[] objArr2 = new Object[iT];
        int i2 = iT - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                d.w(pv1.k(i5, "at index "));
                return null;
            }
            int iHashCode = obj2.hashCode();
            int iQ = vk3.q(iHashCode);
            while (true) {
                int i6 = iQ & i2;
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
                iQ++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new mg2(obj4);
        }
        if (t(i4) < iT / 2) {
            return x(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new e42(i3, i2, i4, objArr, objArr2);
    }

    public static q31 y(Collection collection) {
        if ((collection instanceof q31) && !(collection instanceof SortedSet)) {
            q31 q31Var = (q31) collection;
            if (!q31Var.o()) {
                return q31Var;
            }
        }
        Object[] array = collection.toArray();
        return x(array.length, array);
    }

    public d31 A() {
        Object[] array = toArray(u21.a);
        z21 z21Var = d31.b;
        return d31.t(array.length, array);
    }

    @Override // defpackage.u21
    public d31 d() {
        d31 d31Var = this.b;
        if (d31Var != null) {
            return d31Var;
        }
        d31 d31VarA = A();
        this.b = d31VarA;
        return d31VarA;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof q31) && (this instanceof e42) && (((q31) obj) instanceof e42) && hashCode() != obj.hashCode()) {
            return false;
        }
        return c71.i(this, obj);
    }

    @Override // defpackage.u21
    public Object writeReplace() {
        return new p31(toArray(u21.a));
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return c71.n(this);
    }
}
