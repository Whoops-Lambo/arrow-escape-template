package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzdyb implements zzdex {
    public final zzcly a;

    @Override // com.google.android.gms.internal.ads.zzdex
    public final void d(Context context) {
        zzcly zzclyVar = this.a;
        if (zzclyVar != null) {
            zzclyVar.destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdex
    public final void x(Context context) {
        zzcly zzclyVar = this.a;
        if (zzclyVar != null) {
            zzclyVar.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdex
    public final void zza(Context context) {
        zzcly zzclyVar = this.a;
        if (zzclyVar != null) {
            zzclyVar.onPause();
        }
    }

    public zzdyb(zzcly zzclyVar) {
        this.a = zzclyVar;
    }
}
