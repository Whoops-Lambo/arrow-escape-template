package defpackage;

import com.google.android.gms.internal.p002firebaseauthapi.zzalo;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class kt3 extends AbstractMap {
    public static final /* synthetic */ int f = 0;
    public Object[] a;
    public int b;
    public Map c = Collections.EMPTY_MAP;
    public boolean d;
    public volatile yg2 e;

    /* JADX WARN: Code duplicated, block: B:13:0x001e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Code duplicated, block: B:21:0x0033 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0038 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0030 A[SYNTHETIC] */
    public final int a(zzalo zzaloVar) {
        int i;
        int i2;
        int i3;
        int iCompareTo;
        int i4 = this.b;
        int i5 = i4 - 1;
        if (i5 < 0) {
            i = 0;
            while (i <= i5) {
                i3 = (i + i5) / 2;
                iCompareTo = zzaloVar.compareTo(((jt3) this.a[i3]).a);
                if (iCompareTo < 0) {
                    i5 = i3 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i3;
                    }
                    i = i3 + 1;
                }
            }
            i2 = i + 1;
        } else {
            int iCompareTo2 = zzaloVar.compareTo(((jt3) this.a[i5]).a);
            if (iCompareTo2 > 0) {
                i2 = i4 + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i5;
                }
                i = 0;
                while (i <= i5) {
                    i3 = (i + i5) / 2;
                    iCompareTo = zzaloVar.compareTo(((jt3) this.a[i3]).a);
                    if (iCompareTo < 0) {
                        i5 = i3 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i3;
                        }
                        i = i3 + 1;
                    }
                }
                i2 = i + 1;
            }
        }
        return -i2;
    }

    public final jt3 c(int i) {
        if (i < this.b) {
            return (jt3) this.a[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        zzalo zzaloVar = (zzalo) obj;
        return a(zzaloVar) >= 0 || this.c.containsKey(zzaloVar);
    }

    public final Set e() {
        return this.c.isEmpty() ? Collections.EMPTY_SET : this.c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.e == null) {
            this.e = new yg2(this, 3);
        }
        return this.e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kt3)) {
            return super.equals(obj);
        }
        kt3 kt3Var = (kt3) obj;
        int size = size();
        if (size == kt3Var.size()) {
            int i = this.b;
            if (i != kt3Var.b) {
                return entrySet().equals(kt3Var.entrySet());
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (c(i2).equals(kt3Var.c(i2))) {
                }
            }
            if (i != size) {
                return this.c.equals(kt3Var.c);
            }
            return true;
        }
        return false;
    }

    public final void g() {
        if (this.d) {
            d.c();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        zzalo zzaloVar = (zzalo) obj;
        int iA = a(zzaloVar);
        return iA >= 0 ? ((jt3) this.a[iA]).b : this.c.get(zzaloVar);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += this.a[i2].hashCode();
        }
        return this.c.size() > 0 ? this.c.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c.size() + this.b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object put(zzalo zzaloVar, Object obj) {
        g();
        int iA = a(zzaloVar);
        if (iA >= 0) {
            return ((jt3) this.a[iA]).setValue(obj);
        }
        g();
        if (this.a == null) {
            this.a = new Object[16];
        }
        int i = -(iA + 1);
        if (i >= 16) {
            return f().put(zzaloVar, obj);
        }
        int i2 = this.b;
        if (i2 == 16) {
            jt3 jt3Var = (jt3) this.a[15];
            this.b = i2 - 1;
            f().put(jt3Var.a, jt3Var.b);
        }
        Object[] objArr = this.a;
        System.arraycopy(objArr, i, objArr, i + 1, (objArr.length - i) - 1);
        this.a[i] = new jt3(this, zzaloVar, obj);
        this.b++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        g();
        if (this.b != 0) {
            this.a = null;
            this.b = 0;
        }
        if (!this.c.isEmpty()) {
            this.c.clear();
        }
    }

    public final Object d(int i) {
        g();
        Object[] objArr = this.a;
        Object obj = ((jt3) objArr[i]).b;
        System.arraycopy(objArr, i + 1, objArr, i, (this.b - i) - 1);
        this.b--;
        if (!this.c.isEmpty()) {
            Iterator it = f().entrySet().iterator();
            Object[] objArr2 = this.a;
            int i2 = this.b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i2] = new jt3(this, (zzalo) entry.getKey(), entry.getValue());
            this.b++;
            it.remove();
        }
        return obj;
    }

    public final SortedMap f() {
        g();
        if (this.c.isEmpty() && !(this.c instanceof TreeMap)) {
            this.c = new TreeMap();
        }
        return (SortedMap) this.c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        g();
        zzalo zzaloVar = (zzalo) obj;
        int iA = a(zzaloVar);
        if (iA >= 0) {
            return d(iA);
        }
        if (this.c.isEmpty()) {
            return null;
        }
        return this.c.remove(zzaloVar);
    }
}
