package defpackage;

import com.google.android.gms.internal.play_billing.zzbj;
import com.google.android.gms.internal.play_billing.zzbw;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class n04 extends zzbw {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ zzbw e;

    @Override // com.google.android.gms.internal.play_billing.zzbt
    public final boolean n() {
        return true;
    }

    public n04(zzbw zzbwVar, int i, int i2) {
        this.e = zzbwVar;
        this.c = i;
        this.d = i2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbt
    public final int d() {
        return this.e.h() + this.c + this.d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzbj.a(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbt
    public final int h() {
        return this.e.h() + this.c;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbt
    public final Object[] o() {
        return this.e.o();
    }

    @Override // com.google.android.gms.internal.play_billing.zzbw, java.util.List
    /* JADX INFO: renamed from: r */
    public final zzbw subList(int i, int i2) {
        zzbj.c(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
