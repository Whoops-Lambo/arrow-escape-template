package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@VisibleForTesting
public final class zze implements ServiceConnection {
    final /* synthetic */ BaseGmsClient zza;
    private final int zzb;
    private final boolean zzc;

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        BaseGmsClient baseGmsClient = this.zza;
        if (iBinder == null) {
            if (baseGmsClient.zzk()) {
                baseGmsClient.zzi(16, this.zzb, this.zzc);
                return;
            } else {
                baseGmsClient.zzh(16);
                return;
            }
        }
        synchronized (baseGmsClient.zzl()) {
            try {
                if (!baseGmsClient.zzk() || this.zzb == baseGmsClient.zzd.get()) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    baseGmsClient.zzm((iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IGmsServiceBroker)) ? new zzac(iBinder) : (IGmsServiceBroker) iInterfaceQueryLocalInterface);
                    baseGmsClient.zzb(0, null, this.zzb);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        BaseGmsClient baseGmsClient = this.zza;
        synchronized (baseGmsClient.zzl()) {
            baseGmsClient.zzm(null);
        }
        BaseGmsClient baseGmsClient2 = this.zza;
        int i = this.zzb;
        Handler handler = baseGmsClient2.zzb;
        handler.sendMessage(handler.obtainMessage(6, i, 1));
    }

    public zze(BaseGmsClient baseGmsClient, int i, boolean z) {
        java.util.Objects.requireNonNull(baseGmsClient);
        this.zza = baseGmsClient;
        this.zzb = i;
        this.zzc = z;
    }
}
