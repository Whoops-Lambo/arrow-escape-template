package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import defpackage.ku4;
import defpackage.y40;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzehn implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    public final zzcha a = new zzcha();
    public final Object b = new Object();
    public boolean c = false;
    public boolean d = false;
    public zzcch e;
    public zzcbj f;

    public static void b(Context context, zzcha zzchaVar, Executor executor) {
        if (((Boolean) zzblk.j.c()).booleanValue() || ((Boolean) zzblk.h.c()).booleanValue()) {
            zzchaVar.addListener(new ku4(0, zzchaVar, new y40(context, 7)), executor);
        }
    }

    public final void a() {
        synchronized (this.b) {
            try {
                this.d = true;
                if (this.f.isConnected() || this.f.isConnecting()) {
                    this.f.disconnect();
                }
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onConnectionFailed(ConnectionResult connectionResult) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        zzo.zzd("Disconnected from remote ad request service.");
        this.a.zzd(new zzeic(1));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public void onConnectionSuspended(int i) {
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        zzo.zzd("Cannot connect to remote service, fallback to local instance.");
    }
}
