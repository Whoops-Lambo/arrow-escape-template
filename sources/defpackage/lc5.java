package defpackage;

import com.google.android.gms.internal.measurement.zzyq;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class lc5 extends zzyq {
    public final /* synthetic */ zzyq c;
    public final /* synthetic */ zzyq d;

    public lc5(zzyq zzyqVar, zzyq zzyqVar2) {
        this.c = zzyqVar;
        this.d = zzyqVar2;
    }

    @Override // com.google.android.gms.internal.measurement.zzyq
    public final void a() {
        zzyq zzyqVar = this.d;
        try {
            this.c.a();
        } finally {
            zzyqVar.a();
        }
    }
}
