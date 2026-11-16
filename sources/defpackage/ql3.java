package defpackage;

import com.google.android.gms.internal.measurement.zzabe;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class ql3 extends AbstractMap {
    public static final zm g = new zm(26);
    public static final sl3 h = new sl3(10);
    public final /* synthetic */ int a;
    public final Object[] b;
    public final int[] c;
    public Integer d;
    public String e;
    public final AbstractSet f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, ql3] */
    /* JADX WARN: Type inference failed for: r0v1, types: [ql3] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public ql3(ql3 ql3Var, ql3 ql3Var2) {
        Object obj;
        Object[] objArr;
        int i = 0;
        abstractMap.a = 0;
        ?? abstractMap = new AbstractMap();
        abstractMap.f = new pl3(abstractMap, -1);
        abstractMap.d = null;
        abstractMap.e = null;
        int size = ql3Var2.size() + ql3Var.size();
        int i2 = ql3Var.c[ql3Var.size()] + ql3Var2.c[ql3Var2.size()];
        int i3 = size + 1;
        Object[] objArr2 = new Object[i2];
        int[] iArr = new int[i3];
        iArr[0] = size;
        Map.Entry entryC = ql3Var.c(0);
        Map.Entry entryC2 = ql3Var2.c(0);
        int i4 = 0;
        int i5 = 0;
        int iA = size;
        int i6 = 0;
        while (true) {
            if (entryC == null && entryC2 == null) {
                break;
            }
            i6++;
            if (entryC != null) {
                if (entryC2 != null) {
                    int iCompareTo = ((String) entryC.getKey()).compareTo((String) entryC2.getKey());
                    if (iCompareTo == 0) {
                        int i7 = i4 + 1;
                        int i8 = i5 + 1;
                        objArr2[i6] = new AbstractMap.SimpleImmutableEntry((String) entryC.getKey(), new pl3(abstractMap, i6));
                        pl3 pl3Var = (pl3) entryC.getValue();
                        pl3 pl3Var2 = (pl3) entryC2.getValue();
                        int i9 = 0;
                        int i10 = 0;
                        abstractMap = abstractMap;
                        while (true) {
                            int iD = pl3Var.d();
                            ql3 ql3Var3 = pl3Var.b;
                            if (i9 >= iD - pl3Var.c() && i10 >= pl3Var2.d() - pl3Var2.c()) {
                                break;
                            }
                            int iCompare = i9 == pl3Var.d() - pl3Var.c() ? 1 : i10 == pl3Var2.d() - pl3Var2.c() ? -1 : 0;
                            if (iCompare == 0) {
                                zm zmVar = zzabe.b;
                                iCompare = zzabe.b.compare(ql3Var3.b[pl3Var.c() + i9], pl3Var2.b.b[pl3Var2.c() + i10]);
                            }
                            if (iCompare < 0) {
                                i9++;
                                obj = ql3Var3.b[pl3Var.c() + i9];
                            } else {
                                int i11 = i10 + 1;
                                Object obj2 = pl3Var2.b.b[pl3Var2.c() + i10];
                                if (iCompare == 0) {
                                    i10 = i11;
                                    obj = obj2;
                                    i9++;
                                } else {
                                    i10 = i11;
                                    obj = obj2;
                                    i9 = i9;
                                }
                            }
                            objArr2[iA] = obj;
                            abstractMap = this;
                            iA++;
                        }
                        iArr[i6] = iA;
                        entryC = ql3Var.c(i8);
                        entryC2 = ql3Var2.c(i7);
                        i5 = i8;
                        i4 = i7;
                        i = 0;
                    } else {
                        if (iCompareTo < 0) {
                        }
                        i = 0;
                        abstractMap = this;
                    }
                }
                i5++;
                iA = a(entryC, i6, iA, objArr2, iArr);
                entryC = ql3Var.c(i5);
                i = 0;
                abstractMap = this;
            }
            Map.Entry entry = entryC;
            i4++;
            int iA2 = a(entryC2, i6, iA, objArr2, iArr);
            entryC2 = ql3Var2.c(i4);
            iA = iA2;
            entryC = entry;
            i = 0;
            abstractMap = this;
        }
        int i12 = iArr[i];
        int i13 = i12 - i6;
        if (i13 != 0) {
            for (int i14 = i; i14 <= i6; i14++) {
                iArr[i14] = iArr[i14] - i13;
            }
            int i15 = iArr[i6];
            int i16 = i15 - i6;
            if (b(i2, i15)) {
                objArr = new Object[i15];
                System.arraycopy(objArr2, i, objArr, i, i6);
            } else {
                objArr = objArr2;
            }
            System.arraycopy(objArr2, i12, objArr, i6, i16);
            objArr2 = objArr;
        }
        abstractMap.b = objArr2;
        int i17 = iArr[i] + 1;
        abstractMap.c = b(i3, i17) ? Arrays.copyOf(iArr, i17) : iArr;
    }

    public static boolean b(int i, int i2) {
        return i > 16 && i * 9 > i2 * 10;
    }

    public Map.Entry c(int i) {
        if (i < this.c[0]) {
            return (Map.Entry) this.b[i];
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        switch (this.a) {
            case 0:
                return (pl3) this.f;
            default:
                return (kg4) this.f;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        switch (this.a) {
            case 0:
                if (this.d == null) {
                    this.d = Integer.valueOf(super.hashCode());
                }
                break;
            default:
                if (this.d == null) {
                    this.d = Integer.valueOf(super.hashCode());
                }
                break;
        }
        return this.d.intValue();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        switch (this.a) {
            case 0:
                if (this.e == null) {
                    this.e = super.toString();
                }
                break;
            default:
                if (this.e == null) {
                    this.e = super.toString();
                }
                break;
        }
        return this.e;
    }

    public int a(Map.Entry entry, int i, int i2, Object[] objArr, int[] iArr) {
        pl3 pl3Var = (pl3) entry.getValue();
        int iD = pl3Var.d() - pl3Var.c();
        System.arraycopy(pl3Var.b.b, pl3Var.c(), objArr, i2, iD);
        objArr[i] = new AbstractMap.SimpleImmutableEntry((String) entry.getKey(), new pl3(this, i));
        int i3 = i2 + iD;
        iArr[i + 1] = i3;
        return i3;
    }

    public ql3(int i) {
        this.a = i;
        switch (i) {
            case 1:
                List list = Collections.EMPTY_LIST;
                this.f = new kg4(this);
                this.d = null;
                this.e = null;
                Iterator it = list.iterator();
                if (!it.hasNext()) {
                    int size = list.size();
                    Object[] objArrCopyOf = new Object[size];
                    Iterator it2 = list.iterator();
                    if (!it2.hasNext()) {
                        int[] iArr = {0};
                        if (size > 16 && size * 9 > 0) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, 0);
                        }
                        this.b = objArrCopyOf;
                        this.c = iArr;
                        return;
                    }
                    it2.next().getClass();
                    m93.b();
                    throw null;
                }
                it.next().getClass();
                m93.b();
                throw null;
            default:
                List list2 = Collections.EMPTY_LIST;
                this.f = new pl3(this, -1);
                this.d = null;
                this.e = null;
                Iterator it3 = list2.iterator();
                if (!it3.hasNext()) {
                    int size2 = list2.size();
                    Object[] objArr = new Object[size2];
                    Iterator it4 = list2.iterator();
                    if (!it4.hasNext()) {
                        int[] iArr2 = {0};
                        this.b = b(size2, 0) ? Arrays.copyOf(objArr, 0) : objArr;
                        this.c = iArr2;
                        return;
                    } else {
                        it4.next().getClass();
                        m93.b();
                        throw null;
                    }
                }
                it3.next().getClass();
                m93.b();
                throw null;
        }
    }
}
