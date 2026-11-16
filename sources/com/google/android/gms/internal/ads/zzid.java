package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzid implements zzhv {
    public zziu b;
    public String c;
    public boolean f;
    public final zzio a = new zzio();
    public int d = 8000;
    public int e = 8000;

    @Override // com.google.android.gms.internal.ads.zzhv
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzih zza() {
        zzih zzihVar = new zzih(this.c, this.d, this.e, this.f, this.a);
        zziu zziuVar = this.b;
        if (zziuVar != null) {
            zzihVar.a(zziuVar);
        }
        return zzihVar;
    }
}
