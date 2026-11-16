package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.annotation.BinderThread;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zza extends zzc {
    public final int zza;

    @Nullable
    public final Bundle zzb;
    final int zzc;
    final /* synthetic */ BaseGmsClient zzd;

    public abstract boolean zza();

    public abstract void zzb(ConnectionResult connectionResult);

    @Override // com.google.android.gms.common.internal.zzc
    public final /* bridge */ /* synthetic */ void zzc(Object obj) {
        BaseGmsClient baseGmsClient = this.zzd;
        int i = this.zza;
        boolean zZzk = baseGmsClient.zzk();
        if (i != 0) {
            if (zZzk) {
                baseGmsClient.zze(1, null, this.zzc);
            } else {
                baseGmsClient.zzd(1, null);
            }
            Bundle bundle = this.zzb;
            zzb(new ConnectionResult(i, bundle != null ? (PendingIntent) bundle.getParcelable(BaseGmsClient.KEY_PENDING_INTENT) : null));
            return;
        }
        if (zza()) {
            return;
        }
        if (zZzk) {
            baseGmsClient.zze(1, null, this.zzc);
        } else {
            baseGmsClient.zzd(1, null);
        }
        zzb(new ConnectionResult(8, null));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @BinderThread
    public zza(BaseGmsClient baseGmsClient, @Nullable int i, Bundle bundle, int i2) {
        super(baseGmsClient, Boolean.TRUE);
        java.util.Objects.requireNonNull(baseGmsClient);
        this.zzd = baseGmsClient;
        this.zza = i;
        this.zzb = bundle;
        this.zzc = i2;
    }
}
