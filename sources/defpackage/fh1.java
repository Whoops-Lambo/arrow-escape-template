package defpackage;

import com.ironsource.G5;
import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class fh1 implements Map, Serializable, fc1 {
    public static final fh1 n;
    public Object[] a;
    public Object[] b;
    public int[] c;
    public int[] d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public gh1 j;
    public hh1 k;
    public gh1 l;
    public boolean m;

    static {
        fh1 fh1Var = new fh1(0);
        fh1Var.m = true;
        n = fh1Var;
    }

    public fh1(int i) {
        if (i < 0) {
            d.r("capacity must be non-negative.");
            throw null;
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.a = objArr;
        this.b = null;
        this.c = iArr;
        this.d = new int[iHighestOneBit];
        this.e = 2;
        this.f = 0;
        this.g = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() throws NotSerializableException {
        if (!this.m) {
            throw new NotSerializableException("The map cannot be serialized while it is being built.");
        }
        da2 da2Var = new da2();
        da2Var.a = this;
        return da2Var;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        gh1 gh1Var = this.l;
        if (gh1Var != null) {
            return gh1Var;
        }
        gh1 gh1Var2 = new gh1(this, 0);
        this.l = gh1Var2;
        return gh1Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.i == map.size() && h(map.entrySet());
    }

    public final void f() {
        if (this.m) {
            d.c();
        }
    }

    public final void g(boolean z) {
        int i;
        Object[] objArr = this.b;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.c;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.a;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.d[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        j7.Y(this.a, i3, i);
        if (objArr != null) {
            j7.Y(objArr, i3, this.f);
        }
        this.f = i3;
    }

    @Override // java.util.Map
    public final int hashCode() {
        dh1 dh1Var = new dh1(this, 0);
        int i = 0;
        while (dh1Var.hasNext()) {
            int i2 = dh1Var.b;
            fh1 fh1Var = dh1Var.a;
            if (i2 >= fh1Var.f) {
                d.v();
                return 0;
            }
            dh1Var.b = i2 + 1;
            dh1Var.c = i2;
            Object obj = fh1Var.a[i2];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = fh1Var.b;
            objArr.getClass();
            Object obj2 = objArr[dh1Var.c];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            dh1Var.b();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.i == 0;
    }

    public final void j(int i) {
        Object[] objArr = this.a;
        int length = objArr.length;
        int i2 = this.f;
        int i3 = length - i2;
        int i4 = i2 - this.i;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            g(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            dr0.n();
            return;
        }
        if (i5 > objArr.length) {
            j1 j1Var = n1.Companion;
            int length2 = objArr.length;
            j1Var.getClass();
            int iE = j1.e(length2, i5);
            Object[] objArr2 = this.a;
            objArr2.getClass();
            this.a = Arrays.copyOf(objArr2, iE);
            Object[] objArr3 = this.b;
            this.b = objArr3 != null ? Arrays.copyOf(objArr3, iE) : null;
            this.c = Arrays.copyOf(this.c, iE);
            int iHighestOneBit = Integer.highestOneBit((iE >= 1 ? iE : 1) * 3);
            if (iHighestOneBit > this.d.length) {
                q(iHighestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final Set keySet() {
        gh1 gh1Var = this.j;
        if (gh1Var != null) {
            return gh1Var;
        }
        gh1 gh1Var2 = new gh1(this, 1);
        this.j = gh1Var2;
        return gh1Var2;
    }

    public final int n(Object obj) {
        int i = this.f;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.c[i] >= 0) {
                Object[] objArr = this.b;
                objArr.getClass();
                if (s71.b(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    public final int o(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.g;
    }

    public final void q(int i) {
        int[] iArr;
        this.h++;
        int i2 = 0;
        if (this.f > this.i) {
            g(false);
        }
        this.d = new int[i];
        this.g = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.f) {
            int i3 = i2 + 1;
            int iO = o(this.a[i2]);
            int i4 = this.e;
            while (true) {
                iArr = this.d;
                if (iArr[iO] == 0) {
                    break;
                }
                i4--;
                if (i4 < 0) {
                    e32.i("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                    return;
                }
                iO = iO == 0 ? iArr.length - 1 : iO - 1;
            }
            iArr[iO] = i3;
            this.c[i2] = iO;
            i2 = i3;
        }
    }

    public final void r(int i) {
        Object[] objArr = this.a;
        objArr.getClass();
        objArr[i] = null;
        Object[] objArr2 = this.b;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int length = this.c[i];
        int i2 = this.e * 2;
        int length2 = this.d.length / 2;
        if (i2 > length2) {
            i2 = length2;
        }
        int i3 = i2;
        int i4 = 0;
        int i5 = length;
        do {
            length = length == 0 ? this.d.length - 1 : length - 1;
            i4++;
            int i6 = this.e;
            int[] iArr = this.d;
            if (i4 > i6) {
                iArr[i5] = 0;
            } else {
                int i7 = iArr[length];
                if (i7 == 0) {
                    iArr[i5] = 0;
                } else {
                    if (i7 < 0) {
                        iArr[i5] = -1;
                    } else {
                        int i8 = i7 - 1;
                        int iO = o(this.a[i8]) - length;
                        int[] iArr2 = this.d;
                        if ((iO & (iArr2.length - 1)) >= i4) {
                            iArr2[i5] = i7;
                            this.c[i8] = i5;
                        }
                        i3--;
                    }
                    i5 = length;
                    i4 = 0;
                    i3--;
                }
            }
            this.c[i] = -1;
            this.i--;
            this.h++;
        } while (i3 >= 0);
        this.d[i5] = -1;
        this.c[i] = -1;
        this.i--;
        this.h++;
    }

    @Override // java.util.Map
    public final int size() {
        return this.i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.i * 3) + 2);
        sb.append("{");
        int i = 0;
        dh1 dh1Var = new dh1(this, 0);
        while (dh1Var.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = dh1Var.b;
            fh1 fh1Var = dh1Var.a;
            if (i2 >= fh1Var.f) {
                d.v();
                return null;
            }
            dh1Var.b = i2 + 1;
            dh1Var.c = i2;
            Object obj = fh1Var.a[i2];
            if (obj == fh1Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append(G5.U);
            Object[] objArr = fh1Var.b;
            objArr.getClass();
            Object obj2 = objArr[dh1Var.c];
            if (obj2 == fh1Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            dh1Var.b();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        hh1 hh1Var = this.k;
        if (hh1Var != null) {
            return hh1Var;
        }
        hh1 hh1Var2 = new hh1(this);
        this.k = hh1Var2;
        return hh1Var2;
    }

    public final int a(Object obj) {
        f();
        while (true) {
            int iO = o(obj);
            int i = this.e * 2;
            int length = this.d.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.d;
                int i3 = iArr[iO];
                if (i3 <= 0) {
                    int i4 = this.f;
                    Object[] objArr = this.a;
                    if (i4 >= objArr.length) {
                        j(1);
                        break;
                    }
                    int i5 = i4 + 1;
                    this.f = i5;
                    objArr[i4] = obj;
                    this.c[i4] = iO;
                    iArr[iO] = i5;
                    this.i++;
                    this.h++;
                    if (i2 > this.e) {
                        this.e = i2;
                    }
                    return i4;
                }
                if (s71.b(this.a[i3 - 1], obj)) {
                    return -i3;
                }
                i2++;
                if (i2 > i) {
                    q(this.d.length * 2);
                    break;
                }
                int i6 = iO - 1;
                if (iO == 0) {
                    iO = this.d.length - 1;
                } else {
                    iO = i6;
                }
            }
        }
    }

    @Override // java.util.Map
    public final void clear() {
        f();
        int i = this.f - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.c;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.d[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        j7.Y(this.a, 0, this.f);
        Object[] objArr = this.b;
        if (objArr != null) {
            j7.Y(objArr, 0, this.f);
        }
        this.i = 0;
        this.f = 0;
        this.h++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (k(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (n(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final fh1 d() {
        f();
        this.m = true;
        if (this.i > 0) {
            return this;
        }
        fh1 fh1Var = n;
        fh1Var.getClass();
        return fh1Var;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iK = k(obj);
        if (iK < 0) {
            return null;
        }
        Object[] objArr = this.b;
        objArr.getClass();
        return objArr[iK];
    }

    public final boolean h(Collection collection) {
        boolean zB;
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    Map.Entry entry = (Map.Entry) obj;
                    int iK = k(entry.getKey());
                    if (iK < 0) {
                        zB = false;
                    } else {
                        Object[] objArr = this.b;
                        objArr.getClass();
                        zB = s71.b(objArr[iK], entry.getValue());
                    }
                    if (!zB) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final int k(Object obj) {
        int iO = o(obj);
        int i = this.e;
        while (true) {
            int i2 = this.d[iO];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (s71.b(this.a[i3], obj)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            int i4 = iO - 1;
            if (iO == 0) {
                iO = this.d.length - 1;
            } else {
                iO = i4;
            }
        }
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        f();
        int iA = a(obj);
        Object[] objArr = this.b;
        if (objArr == null) {
            int length = this.a.length;
            if (length >= 0) {
                objArr = new Object[length];
                this.b = objArr;
            } else {
                d.r("capacity must be non-negative.");
                return null;
            }
        }
        if (iA < 0) {
            int i = (-iA) - 1;
            Object obj3 = objArr[i];
            objArr[i] = obj2;
            return obj3;
        }
        objArr[iA] = obj2;
        return null;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        f();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (!setEntrySet.isEmpty()) {
            j(setEntrySet.size());
            for (Map.Entry entry : setEntrySet) {
                int iA = a(entry.getKey());
                Object[] objArr = this.b;
                if (objArr == null) {
                    int length = this.a.length;
                    if (length >= 0) {
                        objArr = new Object[length];
                        this.b = objArr;
                    } else {
                        d.r("capacity must be non-negative.");
                        return;
                    }
                }
                if (iA >= 0) {
                    objArr[iA] = entry.getValue();
                } else {
                    int i = (-iA) - 1;
                    if (!s71.b(entry.getValue(), objArr[i])) {
                        objArr[i] = entry.getValue();
                    }
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        f();
        int iK = k(obj);
        if (iK < 0) {
            return null;
        }
        Object[] objArr = this.b;
        objArr.getClass();
        Object obj2 = objArr[iK];
        r(iK);
        return obj2;
    }

    public fh1() {
        this(8);
    }
}
