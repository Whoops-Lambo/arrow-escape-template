package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzib implements zzhv {
    public final Context a;
    public final zzid b;

    public zzib(Context context) {
        zzid zzidVar = new zzid();
        this.a = context.getApplicationContext();
        this.b = zzidVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhv
    public final /* bridge */ /* synthetic */ zzhw zza() {
        return new zzic(this.a, this.b.zza());
    }
}
