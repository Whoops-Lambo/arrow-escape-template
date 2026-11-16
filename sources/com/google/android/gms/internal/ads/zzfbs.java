package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzfbs implements zzfdt {
    public final zzflp a;

    @Override // com.google.android.gms.internal.ads.zzfdt
    public final void zza(Object obj) {
        boolean z;
        boolean z2;
        Bundle bundle = (Bundle) obj;
        zzflp zzflpVar = this.a;
        if (zzflpVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Od)).booleanValue()) {
                return;
            }
            synchronized (zzflpVar.c) {
                zzflpVar.b();
                z = zzflpVar.e == 2;
            }
            bundle.putBoolean("render_in_browser", z);
            synchronized (zzflpVar.c) {
                zzflpVar.b();
                z2 = zzflpVar.e == 3;
            }
            bundle.putBoolean("disable_ml", z2);
        }
    }

    public zzfbs(zzflp zzflpVar) {
        this.a = zzflpVar;
    }
}
