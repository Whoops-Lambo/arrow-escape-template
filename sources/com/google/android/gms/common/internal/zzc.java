package com.google.android.gms.common.internal;

import android.util.Log;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zzc {

    @Nullable
    private Object zza;
    private boolean zzb;
    final /* synthetic */ BaseGmsClient zze;

    public abstract void zzc(Object obj);

    public final void zzf() {
        synchronized (this) {
            this.zza = null;
        }
    }

    public final void zzd() {
        Object obj;
        synchronized (this) {
            try {
                obj = this.zza;
                if (this.zzb) {
                    String string = toString();
                    StringBuilder sb = new StringBuilder(string.length() + 47);
                    sb.append("Callback proxy ");
                    sb.append(string);
                    sb.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj != null) {
            zzc(obj);
        }
        synchronized (this) {
            this.zzb = true;
        }
        zze();
    }

    public zzc(BaseGmsClient baseGmsClient, Object obj) {
        java.util.Objects.requireNonNull(baseGmsClient);
        this.zze = baseGmsClient;
        this.zza = obj;
        this.zzb = false;
    }

    public final void zze() {
        zzf();
        BaseGmsClient baseGmsClient = this.zze;
        synchronized (baseGmsClient.zzn()) {
            baseGmsClient.zzn().remove(this);
        }
    }
}
