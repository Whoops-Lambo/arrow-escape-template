package defpackage;

import com.google.android.gms.internal.identity_googleid.zza;
import com.google.android.gms.internal.identity_googleid.zzj;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class cx4 extends zzj {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ zzj e;

    public cx4(zzj zzjVar, int i, int i2) {
        this.e = zzjVar;
        this.c = i;
        this.d = i2;
    }

    @Override // com.google.android.gms.internal.identity_googleid.zzf
    public final int d() {
        return this.e.h() + this.c + this.d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zza.a(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // com.google.android.gms.internal.identity_googleid.zzf
    public final int h() {
        return this.e.h() + this.c;
    }

    @Override // com.google.android.gms.internal.identity_googleid.zzf
    public final Object[] k() {
        return this.e.k();
    }

    @Override // com.google.android.gms.internal.identity_googleid.zzj, java.util.List
    /* JADX INFO: renamed from: n */
    public final zzj subList(int i, int i2) {
        zza.b(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
