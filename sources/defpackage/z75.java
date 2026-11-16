package defpackage;

import com.google.android.gms.internal.nearby.zzsg;
import com.google.android.gms.internal.nearby.zzsq;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class z75 extends zzsq {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ zzsq e;

    @Override // com.google.android.gms.internal.nearby.zzsn
    public final boolean n() {
        return true;
    }

    public z75(zzsq zzsqVar, int i, int i2) {
        this.e = zzsqVar;
        this.c = i;
        this.d = i2;
    }

    @Override // com.google.android.gms.internal.nearby.zzsn
    public final int d() {
        return this.e.h() + this.c + this.d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzsg.a(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // com.google.android.gms.internal.nearby.zzsn
    public final int h() {
        return this.e.h() + this.c;
    }

    @Override // com.google.android.gms.internal.nearby.zzsn
    public final Object[] o() {
        return this.e.o();
    }

    @Override // com.google.android.gms.internal.nearby.zzsq, java.util.List
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final zzsq subList(int i, int i2) {
        zzsg.b(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
