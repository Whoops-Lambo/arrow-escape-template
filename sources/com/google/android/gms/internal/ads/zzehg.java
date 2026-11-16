package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.ConnectionResult;
import defpackage.o24;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzehg extends zzehn {
    public final Context g;
    public final Executor h;

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.b) {
            try {
                if (!this.d) {
                    this.d = true;
                    try {
                        ((zzcbu) this.f.getService()).Z(this.e, ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Ze)).booleanValue() ? new zzehm(this.a, this.e) : new zzehl(this));
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.a.zzd(new zzeic(1));
                    } catch (Throwable th) {
                        com.google.android.gms.ads.internal.zzt.zzh().d("RemoteAdRequestClientTask.onConnected", th);
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

    public zzehg(Context context, o24 o24Var) {
        this.g = context;
        this.h = o24Var;
        this.f = new zzcbj(context, com.google.android.gms.ads.internal.zzt.zzs().zza(), this, this);
    }
}
