package defpackage;

import com.google.android.gms.internal.common.zzam;
import com.google.android.gms.internal.common.zzs;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class tr3 extends zzam {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ zzam e;

    @Override // com.google.android.gms.internal.common.zzah
    public final boolean o() {
        return true;
    }

    public tr3(zzam zzamVar, int i, int i2) {
        this.e = zzamVar;
        this.c = i;
        this.d = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzs.a(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // com.google.android.gms.internal.common.zzah
    public final Object[] h() {
        return this.e.h();
    }

    @Override // com.google.android.gms.internal.common.zzah
    public final int i() {
        return this.e.i() + this.c;
    }

    @Override // com.google.android.gms.internal.common.zzah
    public final int k() {
        return this.e.i() + this.c + this.d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.common.zzam, java.util.List
    /* JADX INFO: renamed from: x */
    public final zzam subList(int i, int i2) {
        zzs.c(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }
}
