package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.bd4;
import defpackage.o24;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzehp extends zzehn {
    public final Context g;
    public final Executor h;

    public final ListenableFuture c(zzcch zzcchVar) {
        synchronized (this.b) {
            try {
                if (this.c) {
                    return this.a;
                }
                this.c = true;
                this.e = zzcchVar;
                this.f.checkAvailabilityAndConnect();
                zzcha zzchaVar = this.a;
                zzchaVar.addListener(new bd4(this, 0), zzcgv.h);
                zzehn.b(this.g, zzchaVar, this.h);
                return zzchaVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.b) {
            try {
                if (!this.d) {
                    this.d = true;
                    try {
                        ((zzcbu) this.f.getService()).y0(this.e, ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Ze)).booleanValue() ? new zzehm(this.a, this.e) : new zzehl(this));
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.a.zzd(new zzeic(1));
                    } catch (Throwable th) {
                        com.google.android.gms.ads.internal.zzt.zzh().d("RemoteSignalsClientTask.onConnected", th);
                        this.a.zzd(new zzeic(1));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public zzehp(Context context, o24 o24Var) {
        this.g = context;
        this.h = o24Var;
        this.f = new zzcbj(context, com.google.android.gms.ads.internal.zzt.zzs().zza(), this, this);
    }
}
