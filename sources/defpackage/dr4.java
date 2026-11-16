package defpackage;

import com.google.android.gms.internal.ads.zzgvz;
import com.google.android.gms.internal.ads.zzgzb;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class dr4 extends zzgzb {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ zzgzb e;

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final boolean o() {
        return true;
    }

    public dr4(zzgzb zzgzbVar, int i, int i2) {
        this.e = zzgzbVar;
        this.c = i;
        this.d = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzgvz.i(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object[] h() {
        return this.e.h();
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final int i() {
        return this.e.i() + this.c;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final int k() {
        return this.e.i() + this.c + this.d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.ads.zzgzb, java.util.List
    /* JADX INFO: renamed from: t */
    public final zzgzb subList(int i, int i2) {
        zzgvz.k(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }
}
