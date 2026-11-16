package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.UserHandle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
final class zzt extends GmsClientSupervisor {
    private final HashMap zzb = new HashMap();
    private final Context zzc;
    private volatile Handler zzd;
    private final zzs zze;
    private final ConnectionTracker zzf;
    private final long zzg;
    private final long zzh;

    @Nullable
    private volatile Executor zzi;
    private final boolean zzj;

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    public final boolean zza() {
        return this.zzj;
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    public final ConnectionResult zzb(zzo zzoVar, ServiceConnection serviceConnection, String str, @Nullable Executor executor) {
        ConnectionResult connectionResultZzb;
        Preconditions.checkNotNull(serviceConnection, "ServiceConnection must not be null");
        HashMap map = this.zzb;
        synchronized (map) {
            try {
                zzr zzrVar = (zzr) map.get(zzoVar);
                if (executor == null) {
                    executor = this.zzi;
                }
                if (zzrVar == null) {
                    zzrVar = new zzr(this, zzoVar);
                    zzrVar.zze(serviceConnection, serviceConnection, str);
                    UserHandle userHandleZze = zzoVar.zze();
                    connectionResultZzb = (userHandleZze == null || Build.VERSION.SDK_INT < 33) ? zzrVar.zzb(str, executor) : zzrVar.zzc(str, userHandleZze);
                    map.put(zzoVar, zzrVar);
                } else {
                    this.zzd.removeMessages(0, zzoVar);
                    if (zzrVar.zzi(serviceConnection)) {
                        String string = zzoVar.toString();
                        StringBuilder sb = new StringBuilder(string.length() + 81);
                        sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb.append(string);
                        throw new IllegalStateException(sb.toString());
                    }
                    zzrVar.zze(serviceConnection, serviceConnection, str);
                    int iZzh = zzrVar.zzh();
                    if (iZzh == 1) {
                        serviceConnection.onServiceConnected(zzrVar.zzl(), zzrVar.zzk());
                    } else if (iZzh == 2) {
                        UserHandle userHandleZze2 = zzoVar.zze();
                        connectionResultZzb = (userHandleZze2 == null || Build.VERSION.SDK_INT < 33) ? zzrVar.zzb(str, executor) : zzrVar.zzc(str, userHandleZze2);
                    }
                    connectionResultZzb = null;
                }
                if (zzrVar.zzg()) {
                    return ConnectionResult.RESULT_SUCCESS;
                }
                if (connectionResultZzb == null) {
                    connectionResultZzb = new ConnectionResult(-1);
                }
                return connectionResultZzb;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    public final void zzd(zzo zzoVar, ServiceConnection serviceConnection, String str) {
        Preconditions.checkNotNull(serviceConnection, "ServiceConnection must not be null");
        HashMap map = this.zzb;
        synchronized (map) {
            try {
                zzr zzrVar = (zzr) map.get(zzoVar);
                if (zzrVar == null) {
                    String string = zzoVar.toString();
                    StringBuilder sb = new StringBuilder(string.length() + 50);
                    sb.append("Nonexistent connection status for service config: ");
                    sb.append(string);
                    throw new IllegalStateException(sb.toString());
                }
                if (!zzrVar.zzi(serviceConnection)) {
                    String string2 = zzoVar.toString();
                    StringBuilder sb2 = new StringBuilder(string2.length() + 76);
                    sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb2.append(string2);
                    throw new IllegalStateException(sb2.toString());
                }
                zzrVar.zzf(serviceConnection, str);
                if (zzrVar.zzj()) {
                    this.zzd.sendMessageDelayed(this.zzd.obtainMessage(0, zzoVar), this.zzg);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zze(Looper looper) {
        synchronized (this.zzb) {
            this.zzd = new com.google.android.gms.internal.common.zzh(looper, this.zze);
        }
    }

    public final void zzf(@Nullable Executor executor) {
        synchronized (this.zzb) {
            this.zzi = executor;
        }
    }

    public final /* synthetic */ HashMap zzh() {
        return this.zzb;
    }

    public final /* synthetic */ Context zzi() {
        return this.zzc;
    }

    public final /* synthetic */ Handler zzj() {
        return this.zzd;
    }

    public final /* synthetic */ ConnectionTracker zzk() {
        return this.zzf;
    }

    public final /* synthetic */ long zzl() {
        return this.zzh;
    }

    public final /* synthetic */ boolean zzm() {
        return this.zzj;
    }

    public zzt(Context context, Looper looper, @Nullable Executor executor) {
        zzs zzsVar = new zzs(this, null);
        this.zze = zzsVar;
        this.zzc = context.getApplicationContext();
        this.zzd = new com.google.android.gms.internal.common.zzh(looper, zzsVar);
        this.zzf = ConnectionTracker.getInstance();
        this.zzg = 5000L;
        this.zzh = 300000L;
        this.zzi = executor;
        this.zzj = InternalClientFlagRegistry.getClientFlags().zza();
    }

    public final /* synthetic */ void zzg(zzr zzrVar) {
        if (zzrVar.zzs() != null) {
            this.zzd.removeMessages(1, zzrVar.zzs());
            zzrVar.zzt(null);
        }
    }
}
