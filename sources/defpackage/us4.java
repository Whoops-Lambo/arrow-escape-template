package defpackage;

import com.google.android.gms.internal.games_v2.zzfu;
import com.google.android.gms.internal.games_v2.zzhd;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class us4 extends zzhd {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ zzhd e;

    public us4(zzhd zzhdVar, int i, int i2) {
        this.e = zzhdVar;
        this.c = i;
        this.d = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzfu.a(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // com.google.android.gms.internal.games_v2.zzgy
    public final Object[] h() {
        return this.e.h();
    }

    @Override // com.google.android.gms.internal.games_v2.zzgy
    public final int i() {
        return this.e.i() + this.c;
    }

    @Override // com.google.android.gms.internal.games_v2.zzgy
    public final int k() {
        return this.e.i() + this.c + this.d;
    }

    @Override // com.google.android.gms.internal.games_v2.zzhd, java.util.List
    /* JADX INFO: renamed from: r */
    public final zzhd subList(int i, int i2) {
        zzfu.c(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
