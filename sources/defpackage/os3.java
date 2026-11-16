package defpackage;

import com.google.android.gms.internal.p002firebaseauthapi.zzah;
import com.google.android.gms.internal.p002firebaseauthapi.zzu;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class os3 extends zzah {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ zzah e;

    public os3(zzah zzahVar, int i, int i2) {
        this.e = zzahVar;
        this.c = i;
        this.d = i2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzag
    public final int d() {
        return this.e.i() + this.c + this.d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzu.a(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzag
    public final int i() {
        return this.e.i() + this.c;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzag
    public final Object[] n() {
        return this.e.n();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzah, java.util.List
    /* JADX INFO: renamed from: o */
    public final zzah subList(int i, int i2) {
        zzu.b(i, i2, this.d);
        int i3 = this.c;
        return (zzah) this.e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
