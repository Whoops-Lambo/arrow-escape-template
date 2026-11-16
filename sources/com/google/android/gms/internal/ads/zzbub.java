package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import defpackage.e04;
import defpackage.f04;
import defpackage.mx3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzbub implements zzbtt, zzbtr {
    public zzcly a;

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void A(String str, zzbqs zzbqsVar) {
        zzcly zzclyVar = this.a;
        if (zzclyVar != null) {
            zzclyVar.M(str, new e04(this, zzbqsVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void z(String str, zzbqs zzbqsVar) {
        zzcly zzclyVar = this.a;
        if (zzclyVar != null) {
            zzclyVar.e0(str, new mx3(zzbqsVar, 6));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zza(String str) {
        com.google.android.gms.ads.internal.util.zze.zza("invokeJavascript on adWebView from js");
        H(new f04(this, str, 1));
    }

    @Override // com.google.android.gms.internal.ads.zzbtt
    public final void zzj() {
        zzcly zzclyVar = this.a;
        if (zzclyVar != null) {
            zzclyVar.destroy();
            this.a = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtt
    public final boolean zzk() {
        zzcly zzclyVar = this.a;
        return zzclyVar == null || zzclyVar.i();
    }

    @Override // com.google.android.gms.internal.ads.zzbtt
    public final zzbva zzl() {
        return new zzbva(this);
    }

    public static final void H(Runnable runnable) {
        com.google.android.gms.ads.internal.client.zzay.zza();
        if (com.google.android.gms.ads.internal.util.client.zzf.zzB()) {
            com.google.android.gms.ads.internal.util.zze.zza("runOnUiThread > the UI thread is the main thread, the runnable will be run now");
            runnable.run();
        } else {
            com.google.android.gms.ads.internal.util.zze.zza("runOnUiThread > the UI thread is not the main thread, the runnable will be added to the message queue");
            if (!com.google.android.gms.ads.internal.util.zzs.zza.post(runnable)) {
                zzo.zzi("runOnUiThread > the runnable could not be placed to the message queue");
            }
        }
    }
}
