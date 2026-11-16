package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import defpackage.pv1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
final class zzb extends com.google.android.gms.internal.common.zzh {
    final /* synthetic */ BaseGmsClient zza;

    private static final void zza(Message message) {
        zzc zzcVar = (zzc) message.obj;
        if (zzcVar != null) {
            zzcVar.zze();
        }
    }

    private static final boolean zzb(Message message) {
        int i = message.what;
        return i == 2 || i == 1 || i == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        BaseGmsClient baseGmsClient = this.zza;
        if (baseGmsClient.zzd.get() != message.arg1) {
            if (zzb(message)) {
                zza(message);
                return;
            }
            return;
        }
        int i = message.what;
        boolean zZzs = true;
        if ((i == 1 || i == 7 || ((i == 4 && !baseGmsClient.enableLocalFallback()) || message.what == 5)) && !baseGmsClient.isConnecting()) {
            zza(message);
            return;
        }
        int i2 = message.what;
        if (i2 == 4) {
            baseGmsClient.zzr(new ConnectionResult(message.arg2));
            if (!baseGmsClient.zzk()) {
                zZzs = baseGmsClient.zzs();
            } else if (baseGmsClient.zzt() != baseGmsClient.zzd.get()) {
                zZzs = false;
            }
            if (!baseGmsClient.zzj() || zZzs) {
                ConnectionResult connectionResultZzq = baseGmsClient.zzq() != null ? baseGmsClient.zzq() : new ConnectionResult(8);
                baseGmsClient.zzc.onReportServiceBinding(connectionResultZzq);
                baseGmsClient.onConnectionFailed(connectionResultZzq);
                return;
            } else if (baseGmsClient.zzk()) {
                baseGmsClient.zze(3, null, message.arg1);
                return;
            } else {
                baseGmsClient.zzd(3, null);
                return;
            }
        }
        if (i2 == 5) {
            ConnectionResult connectionResultZzq2 = baseGmsClient.zzq() != null ? baseGmsClient.zzq() : new ConnectionResult(8);
            baseGmsClient.zzc.onReportServiceBinding(connectionResultZzq2);
            baseGmsClient.onConnectionFailed(connectionResultZzq2);
            return;
        }
        if (i2 == 3) {
            Object obj = message.obj;
            ConnectionResult connectionResult = new ConnectionResult(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            baseGmsClient.zzc.onReportServiceBinding(connectionResult);
            baseGmsClient.onConnectionFailed(connectionResult);
            return;
        }
        if (i2 != 6) {
            if (i2 == 2 && !baseGmsClient.isConnected()) {
                zza(message);
                return;
            } else if (zzb(message)) {
                ((zzc) message.obj).zzd();
                return;
            } else {
                int i3 = message.what;
                Log.wtf("GmsClient", pv1.l(i3, "Don't know how to handle message: ", new StringBuilder(String.valueOf(i3).length() + 34)), new Exception());
                return;
            }
        }
        if (baseGmsClient.zzk()) {
            baseGmsClient.zze(5, null, message.arg1);
        } else {
            baseGmsClient.zzd(5, null);
        }
        if (baseGmsClient.zzo() != null) {
            baseGmsClient.zzo().onConnectionSuspended(message.arg2);
        }
        baseGmsClient.onConnectionSuspended(message.arg2);
        if (baseGmsClient.zzk()) {
            baseGmsClient.zzg(5, 1, null, message.arg1);
        } else {
            baseGmsClient.zzf(5, 1, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzb(BaseGmsClient baseGmsClient, Looper looper) {
        super(looper);
        java.util.Objects.requireNonNull(baseGmsClient);
        this.zza = baseGmsClient;
    }
}
