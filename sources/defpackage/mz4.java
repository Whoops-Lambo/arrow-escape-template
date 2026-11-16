package defpackage;

import com.google.android.gms.internal.ads.zzigq;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class mz4 extends AbstractMap {
    public volatile yg2 d;
    public boolean c = false;
    public Object[] a = null;
    public int b = 0;
    public volatile boolean e = true;

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mz4)) {
            return super.equals(obj);
        }
        mz4 mz4Var = (mz4) obj;
        d();
        int i = this.b;
        mz4Var.d();
        if (i != mz4Var.b) {
            return false;
        }
        Object[] objArr = this.a;
        Object[] objArr2 = mz4Var.a;
        for (int i2 = 0; i2 < i; i2++) {
            if (!objArr[i2].equals(objArr2[i2])) {
                return false;
            }
        }
        return true;
    }

    public final void c(int i) {
        int length;
        Object[] objArr = this.a;
        if (objArr == null || (length = objArr.length) == 0) {
            this.a = new Object[Math.max(16, i)];
            return;
        }
        if (i > length) {
            if (!this.e) {
                d();
                if (i <= this.a.length) {
                    return;
                }
            }
            Object[] objArr2 = this.a;
            int length2 = objArr2.length;
            int i2 = length2 + (length2 >> 1);
            if (i2 - i >= 0) {
                i = i2;
            }
            if ((-2147483639) + i > 0) {
                i = 2147483639;
            }
            this.a = Arrays.copyOf(objArr2, i);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        d();
        return e((zzigq) obj) >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0041 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:8:0x000a, B:10:0x000e, B:14:0x0012, B:16:0x0017, B:18:0x0019, B:19:0x0020, B:21:0x0024, B:23:0x002c, B:25:0x003c, B:27:0x0047, B:26:0x0041, B:29:0x004c, B:30:0x0055, B:31:0x0057), top: B:36:0x000a }] */
    public final void d() {
        int i;
        if (this.c || this.e) {
            return;
        }
        synchronized (this) {
            try {
                if (this.e) {
                    return;
                }
                int i2 = this.b;
                if (i2 <= 1) {
                    return;
                }
                int i3 = 0;
                Arrays.sort(this.a, 0, i2);
                int i4 = 0;
                while (true) {
                    i = this.b;
                    if (i3 >= i) {
                        break;
                    }
                    Object[] objArr = this.a;
                    lz4 lz4Var = (lz4) objArr[i3];
                    if (i4 > 0) {
                        int i5 = i4 - 1;
                        if (((lz4) objArr[i5]).a.equals(lz4Var.a)) {
                            this.a[i5] = lz4Var;
                        } else {
                            this.a[i4] = lz4Var;
                            i4++;
                        }
                    } else {
                        this.a[i4] = lz4Var;
                        i4++;
                    }
                    i3++;
                }
                if (i4 < i) {
                    this.b = i4;
                    Object[] objArr2 = this.a;
                    Arrays.fill(objArr2, i4, objArr2.length, (Object) null);
                }
                this.e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int e(zzigq zzigqVar) {
        int i = this.b - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            int iCompareTo = ((lz4) this.a[i3]).a.compareTo(zzigqVar);
            if (iCompareTo < 0) {
                i2 = i3 + 1;
            } else {
                if (iCompareTo <= 0) {
                    return i3;
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public final void f() {
        if (this.c) {
            d.c();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        d();
        int iE = e((zzigq) obj);
        if (iE >= 0) {
            return ((lz4) this.a[iE]).b;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return this.b == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        b((zzigq) obj, obj2);
        return null;
    }

    public final lz4 a(int i) {
        d();
        if (i < this.b) {
            return (lz4) this.a[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public final void b(zzigq zzigqVar, Object obj) {
        f();
        Objects.requireNonNull(zzigqVar);
        boolean z = this.e;
        int i = this.b;
        if (i > 0) {
            int iCompareTo = zzigqVar.compareTo(((lz4) this.a[i - 1]).a);
            if (iCompareTo < 0) {
                z = false;
            } else if (iCompareTo == 0) {
                ((lz4) this.a[this.b - 1]).setValue(obj);
                return;
            }
        }
        c(this.b + 1);
        Object[] objArr = this.a;
        int i2 = this.b;
        this.b = i2 + 1;
        objArr[i2] = new lz4(this, zzigqVar, obj);
        this.e = z;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        f();
        if (this.b != 0) {
            this.a = null;
            this.b = 0;
            this.e = true;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        d();
        if (this.d == null) {
            this.d = new yg2(this, 6);
        }
        return this.d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        d();
        int i = this.b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += this.a[i2].hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        f();
        boolean z = map instanceof mz4;
        int i = this.b;
        if (z) {
            mz4 mz4Var = (mz4) map;
            c(i + mz4Var.b);
            int i2 = this.b;
            int i3 = mz4Var.b + i2;
            for (int i4 = i2; i4 < i3; i4++) {
                lz4 lz4Var = (lz4) mz4Var.a[i4 - i2];
                b(lz4Var.a, lz4Var.b);
            }
            return;
        }
        c(map.size() + i);
        for (Map.Entry entry : map.entrySet()) {
            b((zzigq) entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        f();
        d();
        int iE = e((zzigq) obj);
        if (iE < 0) {
            return null;
        }
        Object[] objArr = this.a;
        Object obj2 = ((lz4) objArr[iE]).b;
        System.arraycopy(objArr, iE + 1, objArr, iE, (this.b - iE) - 1);
        Object[] objArr2 = this.a;
        int i = this.b - 1;
        this.b = i;
        objArr2[i] = null;
        return obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        d();
        return this.b;
    }
}
