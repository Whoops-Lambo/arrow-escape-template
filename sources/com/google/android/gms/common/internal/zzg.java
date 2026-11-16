package com.google.android.gms.common.internal;

import android.os.Bundle;
import androidx.annotation.BinderThread;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzg extends zza {
    final /* synthetic */ BaseGmsClient zzf;

    @Override // com.google.android.gms.common.internal.zza
    public final boolean zza() {
        this.zzf.zzc.onReportServiceBinding(ConnectionResult.RESULT_SUCCESS);
        return true;
    }

    @Override // com.google.android.gms.common.internal.zza
    public final void zzb(ConnectionResult connectionResult) {
        BaseGmsClient baseGmsClient = this.zzf;
        if (!baseGmsClient.enableLocalFallback() || !baseGmsClient.zzj()) {
            baseGmsClient.zzc.onReportServiceBinding(connectionResult);
            baseGmsClient.onConnectionFailed(connectionResult);
        } else if (baseGmsClient.zzk()) {
            baseGmsClient.zzi(16, this.zzc, false);
        } else {
            baseGmsClient.zzh(16);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @BinderThread
    public zzg(BaseGmsClient baseGmsClient, @Nullable int i, Bundle bundle, int i2) {
        super(baseGmsClient, i, bundle, i2);
        java.util.Objects.requireNonNull(baseGmsClient);
        this.zzf = baseGmsClient;
    }
}
