package defpackage;

import com.google.android.gms.internal.play_billing.zzbj;
import com.google.android.gms.internal.play_billing.zzbw;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class p24 extends zzbw {
    public final transient Object[] c;
    public final transient int d;
    public final transient int e;

    @Override // com.google.android.gms.internal.play_billing.zzbt
    public final boolean n() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzbj.a(i, this.e);
        Object obj = this.c[i + i + this.d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e;
    }

    public p24(Object[] objArr, int i, int i2) {
        this.c = objArr;
        this.d = i;
        this.e = i2;
    }
}
