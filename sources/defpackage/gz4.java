package defpackage;

import com.google.android.gms.internal.ads.zziho;
import io.p071bidmachine.media3.extractor.ts.y;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class gz4 extends cy4 implements RandomAccess, Serializable {
    public static final Object[] d;
    public static final gz4 e;
    public Object[] b;
    public int c;

    static {
        Object[] objArr = new Object[0];
        d = objArr;
        e = new gz4(objArr, 0, false);
    }

    @Override // defpackage.cy4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int i = this.c;
        if (i != list.size()) {
            return false;
        }
        if (!(obj instanceof gz4)) {
            for (int i2 = 0; i2 < i; i2++) {
                if (!this.b[i2].equals(list.get(i2))) {
                    return false;
                }
            }
            return true;
        }
        gz4 gz4Var = (gz4) obj;
        for (int i3 = 0; i3 < i; i3++) {
            if (!this.b[i3].equals(gz4Var.b[i3])) {
                return false;
            }
        }
        return true;
    }

    public final void h(int i) {
        if (i < 0 || i >= this.c) {
            y.p(i(i));
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = this.c;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode = (iHashCode * 31) + this.b[i2].hashCode();
        }
        return iHashCode;
    }

    public final String i(int i) {
        int i2 = this.c;
        return pv1.j(i, i2, "Index:", ", Size:", new StringBuilder(String.valueOf(i).length() + 13 + String.valueOf(i2).length()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.ads.zziho
    public final /* bridge */ /* synthetic */ zziho zzh(int i) {
        if (i >= this.c) {
            return new gz4(i == 0 ? d : Arrays.copyOf(this.b, i), this.c, true);
        }
        e32.a();
        return null;
    }

    public gz4(Object[] objArr, int i, boolean z) {
        super(z);
        this.b = objArr;
        this.c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        d();
        if (i >= 0 && i <= (i2 = this.c)) {
            int i3 = i + 1;
            Object[] objArr = this.b;
            int length = objArr.length;
            if (i2 < length) {
                System.arraycopy(objArr, i, objArr, i3, i2 - i);
            } else {
                Object[] objArr2 = new Object[rl3.f(length, 3, 2, 1, 10)];
                System.arraycopy(this.b, 0, objArr2, 0, i);
                System.arraycopy(this.b, i, objArr2, i3, this.c - i);
                this.b = objArr2;
            }
            this.b[i] = obj;
            this.c++;
            ((AbstractList) this).modCount++;
            return;
        }
        y.p(i(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        h(i);
        return this.b[i];
    }

    @Override // defpackage.cy4, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        d();
        h(i);
        Object[] objArr = this.b;
        Object obj = objArr[i];
        int i2 = this.c;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        d();
        h(i);
        Object[] objArr = this.b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        d();
        int i = this.c;
        int length = this.b.length;
        if (i == length) {
            this.b = Arrays.copyOf(this.b, rl3.f(length, 3, 2, 1, 10));
        }
        Object[] objArr = this.b;
        int i2 = this.c;
        this.c = i2 + 1;
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
