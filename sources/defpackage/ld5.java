package defpackage;

import com.google.android.gms.internal.measurement.zzyl;
import com.google.android.gms.internal.measurement.zzzj;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class ld5 implements Iterator {
    public final zzyl a;
    public int b;
    public int c;
    public final /* synthetic */ md5 d;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.b;
        md5 md5Var = this.d;
        zzzj zzzjVar = md5Var.b;
        int iA = zzzjVar.a();
        Object objCast = this.a.b.cast(i >= iA ? md5Var.c.c(i - iA) : zzzjVar.c(i));
        int i2 = this.c;
        if (i2 == 0) {
            this.b = -1;
            return objCast;
        }
        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i2) + 1;
        this.c >>>= iNumberOfTrailingZeros;
        this.b += iNumberOfTrailingZeros;
        return objCast;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ ld5(md5 md5Var, zzyl zzylVar, int i) {
        this.d = md5Var;
        this.a = zzylVar;
        int i2 = i & 31;
        this.b = i2;
        this.c = i >>> (i2 + 5);
    }
}
