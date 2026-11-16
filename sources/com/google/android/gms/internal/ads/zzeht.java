package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeht extends zzehn {
    public String g;
    public int h;

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.b) {
            try {
                if (!this.d) {
                    this.d = true;
                    try {
                        try {
                            int i = this.h;
                            if (i == 2) {
                                ((zzcbu) this.f.getService()).s0(this.e, ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Ze)).booleanValue() ? new zzehm(this.a, this.e) : new zzehl(this));
                            } else if (i == 3) {
                                ((zzcbu) this.f.getService()).H3(this.g, ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Ze)).booleanValue() ? new zzehm(this.a, this.e) : new zzehl(this));
                            } else {
                                this.a.zzd(new zzeic(1));
                            }
                        } catch (RemoteException | IllegalArgumentException unused) {
                            this.a.zzd(new zzeic(1));
                        }
                    } catch (Throwable th) {
                        com.google.android.gms.ads.internal.zzt.zzh().d("RemoteUrlAndCacheKeyClientTask.onConnected", th);
                        this.a.zzd(new zzeic(1));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzehn, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        zzo.zzd("Cannot connect to remote service, fallback to local instance.");
        this.a.zzd(new zzeic(1));
    }
}
