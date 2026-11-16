package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.UserHandle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@KeepForSdk
public abstract class GmsClientSupervisor {

    @Nullable
    @VisibleForTesting
    static HandlerThread zza = null;
    private static final Object zzb = new Object();
    private static int zzc = 9;

    @Nullable
    private static zzt zzd;

    @Nullable
    private static Executor zze;
    private static boolean zzf;

    public boolean zza() {
        return false;
    }

    public abstract ConnectionResult zzb(zzo zzoVar, ServiceConnection serviceConnection, String str, @Nullable Executor executor);

    public abstract void zzd(zzo zzoVar, ServiceConnection serviceConnection, String str);

    @KeepForSdk
    public static int getDefaultBindFlags() {
        return 4225;
    }

    @NonNull
    @KeepForSdk
    public static GmsClientSupervisor getInstance(@NonNull Context context) {
        synchronized (zzb) {
            try {
                if (zzd == null) {
                    if (!zzf) {
                        zzf = GmsClientFlags.isBindServiceOptimizationEnabled(context.getPackageName());
                    }
                    zzd = new zzt(context.getApplicationContext(), zzf ? getOrStartHandlerThread().getLooper() : context.getMainLooper(), zze);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzd;
    }

    @NonNull
    @KeepForSdk
    public static HandlerThread getOrStartHandlerThread() {
        synchronized (zzb) {
            try {
                HandlerThread handlerThread = zza;
                if (handlerThread != null && handlerThread.isAlive()) {
                    return zza;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", zzc);
                zza = handlerThread2;
                handlerThread2.start();
                return zza;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @KeepForSdk
    public static void setDefaultBindExecutor(@Nullable Executor executor) {
        synchronized (zzb) {
            try {
                zzt zztVar = zzd;
                if (zztVar != null) {
                    zztVar.zzf(executor);
                }
                zze = executor;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @KeepForSdk
    public static boolean setGamHandlerThreadPriorityIfNotInitialized(int i) {
        synchronized (zzb) {
            try {
                if (zza != null) {
                    return false;
                }
                zzc = i;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @KeepForSdk
    public static void setUseHandlerThreadForCallbacks() {
        synchronized (zzb) {
            try {
                zzt zztVar = zzd;
                if (zztVar != null && !zzf) {
                    zztVar.zze(getOrStartHandlerThread().getLooper());
                }
                zzf = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @KeepForSdk
    public boolean bindService(@NonNull String str, @NonNull ServiceConnection serviceConnection, @NonNull String str2) {
        return zzb(new zzo(str, "com.google.android.gms", 4225, false, null), serviceConnection, str2, null).isSuccess();
    }

    @KeepForSdk
    public void unbindService(@NonNull String str, @NonNull ServiceConnection serviceConnection, @NonNull String str2) {
        zzd(new zzo(str, "com.google.android.gms", 4225, false, null), serviceConnection, str2);
    }

    public final void zzc(@NonNull String str, @NonNull String str2, int i, @NonNull ServiceConnection serviceConnection, @NonNull String str3, boolean z, @Nullable UserHandle userHandle) {
        zzd(new zzo(str, str2, 4225, z, userHandle), serviceConnection, str3);
    }

    @KeepForSdk
    public void unbindService(@NonNull ComponentName componentName, @NonNull ServiceConnection serviceConnection, @NonNull String str) {
        zzd(new zzo(componentName, 4225, null), serviceConnection, str);
    }

    @KeepForSdk
    public boolean bindService(@NonNull ComponentName componentName, @NonNull ServiceConnection serviceConnection, @NonNull String str, @Nullable Executor executor) {
        return zzb(new zzo(componentName, 4225, null), serviceConnection, str, executor).isSuccess();
    }

    @KeepForSdk
    public boolean bindService(@NonNull ComponentName componentName, @NonNull ServiceConnection serviceConnection, @NonNull String str) {
        return zzb(new zzo(componentName, 4225, null), serviceConnection, str, null).isSuccess();
    }

    @NonNull
    @KeepForSdk
    public static HandlerThread getOrStartHandlerThread(int i) {
        synchronized (zzb) {
            try {
                HandlerThread handlerThread = zza;
                if (handlerThread != null && handlerThread.isAlive()) {
                    return zza;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", i);
                zza = handlerThread2;
                handlerThread2.start();
                return zza;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
