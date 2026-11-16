package defpackage;

import com.google.android.gms.internal.play_billing.zzfz;
import io.p071bidmachine.media3.extractor.ts.y;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class iv4 extends zc4 implements RandomAccess {
    public static final Object[] d;
    public static final iv4 e;
    public Object[] b;
    public int c;

    static {
        Object[] objArr = new Object[0];
        d = objArr;
        e = new iv4(objArr, 0, false);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfz
    public final /* bridge */ /* synthetic */ zzfz zzd(int i) {
        if (i >= this.c) {
            return new iv4(i == 0 ? d : Arrays.copyOf(this.b, i), this.c, true);
        }
        e32.a();
        return null;
    }

    public final void zzi(int i) {
        if (i < 0 || i >= this.c) {
            y.p(nj.i(i, this.c, "Index:", ", Size:"));
        }
    }

    public iv4(Object[] objArr, int i, boolean z) {
        super(z);
        this.b = objArr;
        this.c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        zza();
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
        y.p(nj.i(i, this.c, "Index:", ", Size:"));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        zzi(i);
        return this.b[i];
    }

    @Override // defpackage.zc4, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        zza();
        zzi(i);
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
        zza();
        zzi(i);
        Object[] objArr = this.b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zza();
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
