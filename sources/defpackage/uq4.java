package defpackage;

import com.google.android.gms.internal.ads.zzgvz;
import com.google.android.gms.internal.ads.zzhai;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class uq4 implements Map, Serializable {
    public static final Object g = new Object();
    public transient Object a;
    public transient int[] b;
    public transient Object[] c;
    public transient Object[] d;
    public transient int e;
    public transient int f;

    public final int[] d() {
        int[] iArr = this.b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return new sq4(this, 0);
    }

    public final Object[] f() {
        Object[] objArr = this.c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object[] g() {
        Object[] objArr = this.d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final boolean h() {
        return this.a == null;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return new sq4(this, 0).hashCode();
    }

    public final Map j() {
        Object obj = this.a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void k(int i, int i2) {
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int[] iArrD = d();
        Object[] objArrF = f();
        Object[] objArrG = g();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArrF[i] = null;
            objArrG[i] = null;
            iArrD[i] = 0;
            return;
        }
        int i4 = i + 1;
        Object obj2 = objArrF[i3];
        objArrF[i] = obj2;
        objArrG[i] = objArrG[i3];
        objArrF[i3] = null;
        objArrG[i3] = null;
        iArrD[i] = iArrD[i3];
        iArrD[i3] = 0;
        int iJ = s71.J(obj2) & i2;
        int iB = kc2.B(iJ, obj);
        if (iB == size) {
            kc2.C(iJ, i4, obj);
            return;
        }
        while (true) {
            int i5 = iB - 1;
            int i6 = iArrD[i5];
            int i7 = i6 & i2;
            if (i7 == size) {
                iArrD[i5] = ((~i2) & i6) | (i4 & i2);
                return;
            }
            iB = i7;
        }
    }

    @Override // java.util.Map
    public final Set keySet() {
        return new sq4(this, 1);
    }

    public final int n() {
        return (1 << (this.e & 31)) - 1;
    }

    public final int o(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        Object objZ = kc2.z(i2);
        if (i4 != 0) {
            kc2.C(i3 & i5, i4 + 1, objZ);
        }
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int[] iArrD = d();
        for (int i6 = 0; i6 <= i; i6++) {
            int iB = kc2.B(i6, obj);
            while (iB != 0) {
                int i7 = iB - 1;
                int i8 = iArrD[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iB2 = kc2.B(i10, objZ);
                kc2.C(i10, iB, objZ);
                iArrD[i7] = ((~i5) & i9) | (iB2 & i5);
                iB = i8 & i;
            }
        }
        this.a = objZ;
        this.e = ((32 - Integer.numberOfLeadingZeros(i5)) & 31) | (this.e & (-32));
        return i5;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i;
        int i2 = 32;
        if (h()) {
            zzgvz.g("Arrays already allocated", h());
            int i3 = this.e;
            int iMax = Math.max(i3 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.a = kc2.z(iMax2);
            this.e = ((32 - Integer.numberOfLeadingZeros(iMax2 - 1)) & 31) | (this.e & (-32));
            this.b = new int[i3];
            this.c = new Object[i3];
            this.d = new Object[i3];
        }
        Map mapJ = j();
        if (mapJ != null) {
            return mapJ.put(obj, obj2);
        }
        int[] iArrD = d();
        Object[] objArrF = f();
        Object[] objArrG = g();
        int i4 = this.f;
        int i5 = i4 + 1;
        int iJ = s71.J(obj);
        int iN = n();
        int i6 = iJ & iN;
        Object obj3 = this.a;
        Objects.requireNonNull(obj3);
        int iB = kc2.B(i6, obj3);
        if (iB == 0) {
            if (i5 > iN) {
                iN = o(iN, (iN + 1) * (iN < 32 ? 4 : 2), iJ, i4);
            } else {
                Object obj4 = this.a;
                Objects.requireNonNull(obj4);
                kc2.C(i6, i5, obj4);
            }
            i = 1;
        } else {
            int i7 = ~iN;
            int i8 = iJ & i7;
            int i9 = 0;
            while (true) {
                int i10 = iB - 1;
                int i11 = iArrD[i10];
                i = 1;
                int i12 = i11 & i7;
                int i13 = i2;
                if (i12 == i8 && Objects.equals(obj, objArrF[i10])) {
                    Object obj5 = objArrG[i10];
                    objArrG[i10] = obj2;
                    return obj5;
                }
                int i14 = i11 & iN;
                int i15 = i9 + 1;
                if (i14 == 0) {
                    if (i15 < 9) {
                        if (i5 <= iN) {
                            iArrD[i10] = (i5 & iN) | i12;
                            break;
                        }
                        iN = o(iN, (iN < i13 ? 4 : 2) * (iN + 1), iJ, i4);
                        break;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(n() + 1, 1.0f);
                    int i16 = isEmpty() ? -1 : 0;
                    while (i16 >= 0) {
                        linkedHashMap.put(f()[i16], g()[i16]);
                        int i17 = i16 + 1;
                        i16 = i17 < this.f ? i17 : -1;
                    }
                    this.a = linkedHashMap;
                    this.b = null;
                    this.c = null;
                    this.d = null;
                    this.e += 32;
                    return linkedHashMap.put(obj, obj2);
                }
                iB = i14;
                i9 = i15;
                i2 = i13;
            }
        }
        int length = d().length;
        if (i5 > length) {
            int i18 = i;
            int iMin = Math.min(1073741823, (Math.max(i18, length >>> 1) + length) | i18);
            if (iMin != length) {
                this.b = Arrays.copyOf(d(), iMin);
                this.c = Arrays.copyOf(f(), iMin);
                this.d = Arrays.copyOf(g(), iMin);
            }
        }
        d()[i4] = (~iN) & iJ;
        f()[i4] = obj;
        g()[i4] = obj2;
        this.f = i5;
        this.e += 32;
        return null;
    }

    @Override // java.util.Map
    public final Collection values() {
        return new zu(3, this);
    }

    @Override // java.util.Map
    public final void clear() {
        if (h()) {
            return;
        }
        this.e += 32;
        Map mapJ = j();
        if (mapJ != null) {
            this.e = Math.min(Math.max(size(), 3), 1073741823);
            mapJ.clear();
            this.a = null;
            this.f = 0;
            return;
        }
        Arrays.fill(f(), 0, this.f, (Object) null);
        Arrays.fill(g(), 0, this.f, (Object) null);
        Object obj = this.a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(d(), 0, this.f, 0);
        this.f = 0;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapJ = j();
        if (mapJ != null) {
            return mapJ.containsKey(obj);
        }
        if (q(obj) == -1) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapJ = j();
        if (mapJ == null) {
            for (int i = 0; i < this.f; i++) {
                if (Objects.equals(obj, g()[i])) {
                    return true;
                }
            }
            return false;
        }
        return mapJ.containsValue(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return zzhai.a(obj, this);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        Map mapJ = j();
        if (mapJ != null) {
            return mapJ.get(obj);
        }
        int iQ = q(obj);
        if (iQ == -1) {
            return null;
        }
        return g()[iQ];
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public final int q(Object obj) {
        if (h()) {
            return -1;
        }
        int iJ = s71.J(obj);
        int iN = n();
        Object obj2 = this.a;
        Objects.requireNonNull(obj2);
        int iB = kc2.B(iJ & iN, obj2);
        if (iB != 0) {
            int i = ~iN;
            int i2 = iJ & i;
            do {
                int i3 = iB - 1;
                int i4 = d()[i3];
                if ((i4 & i) == i2 && Objects.equals(obj, f()[i3])) {
                    return i3;
                }
                iB = i4 & iN;
            } while (iB != 0);
        }
        return -1;
    }

    public final Object r(Object obj) {
        if (!h()) {
            int iN = n();
            Object obj2 = this.a;
            Objects.requireNonNull(obj2);
            int iD = kc2.D(obj, null, iN, obj2, d(), f(), null);
            if (iD != -1) {
                Object obj3 = g()[iD];
                k(iD, iN);
                this.f--;
                this.e += 32;
                return obj3;
            }
        }
        return g;
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        Map mapJ = j();
        if (mapJ != null) {
            return mapJ.remove(obj);
        }
        Object objR = r(obj);
        if (objR == g) {
            return null;
        }
        return objR;
    }

    @Override // java.util.Map
    public final int size() {
        Map mapJ = j();
        if (mapJ != null) {
            return mapJ.size();
        }
        return this.f;
    }

    public final String toString() {
        return zzhai.b(this);
    }
}
