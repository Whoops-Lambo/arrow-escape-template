package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
final class zzcu implements ServiceConnection {
    final /* synthetic */ zzcw zza;

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.internal.play_billing.zzay zzawVar;
        com.google.android.gms.internal.play_billing.zzc.g("BillingClientTesting", "Billing Override Service connected.");
        zzcw zzcwVar = this.zza;
        int i = com.google.android.gms.internal.play_billing.zzax.a;
        if (iBinder == null) {
            zzawVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
            zzawVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.play_billing.zzay ? (com.google.android.gms.internal.play_billing.zzay) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.play_billing.zzaw(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
        }
        zzcwVar.zzc = zzawVar;
        zzcwVar.zzb = 2;
        zzcwVar.zzaO(26);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.internal.play_billing.zzc.h("BillingClientTesting", "Billing Override Service disconnected.");
        zzcw zzcwVar = this.zza;
        zzcwVar.zzc = null;
        zzcwVar.zzb = 0;
    }

    public /* synthetic */ zzcu(zzcw zzcwVar, zzcv zzcvVar) {
        Objects.requireNonNull(zzcwVar);
        this.zza = zzcwVar;
    }
}
