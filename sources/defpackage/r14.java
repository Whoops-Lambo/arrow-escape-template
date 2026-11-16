package defpackage;

import com.google.android.gms.internal.fido.zzbm;
import com.google.android.gms.internal.fido.zzcc;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class r14 extends zzcc {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ zzcc e;

    public r14(zzcc zzccVar, int i, int i2) {
        this.e = zzccVar;
        this.c = i;
        this.d = i2;
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final int d() {
        return this.e.h() + this.c + this.d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzbm.a(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final int h() {
        return this.e.h() + this.c;
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final Object[] k() {
        return this.e.k();
    }

    @Override // com.google.android.gms.internal.fido.zzcc, java.util.List
    /* JADX INFO: renamed from: o */
    public final zzcc subList(int i, int i2) {
        zzbm.b(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
