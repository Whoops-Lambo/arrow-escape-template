package defpackage;

import com.google.android.gms.internal.location.zzbm;
import com.google.android.gms.internal.location.zzbs;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class rz3 extends zzbs {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ zzbs e;

    @Override // com.google.android.gms.internal.location.zzbp
    public final boolean o() {
        return true;
    }

    public rz3(zzbs zzbsVar, int i, int i2) {
        this.e = zzbsVar;
        this.c = i;
        this.d = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzbm.a(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // com.google.android.gms.internal.location.zzbp
    public final Object[] h() {
        return this.e.h();
    }

    @Override // com.google.android.gms.internal.location.zzbp
    public final int i() {
        return this.e.i() + this.c;
    }

    @Override // com.google.android.gms.internal.location.zzbp
    public final int k() {
        return this.e.i() + this.c + this.d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.location.zzbs, java.util.List
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final zzbs subList(int i, int i2) {
        zzbm.b(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }
}
