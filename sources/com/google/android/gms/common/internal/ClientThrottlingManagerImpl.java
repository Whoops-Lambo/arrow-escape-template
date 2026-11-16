package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.libs.throttling.GmsThrottler;
import com.google.android.gms.libs.throttling.InFlightThrottler;
import com.google.android.gms.libs.throttling.ThrottlingLimits;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@KeepForSdk
public class ClientThrottlingManagerImpl implements ClientThrottlingManager {
    private final GmsThrottler zza;

    @Override // com.google.android.gms.common.internal.ClientThrottlingManager
    @KeepForSdk
    public void release(int i) {
        this.zza.b(i);
    }

    @KeepForSdk
    public ClientThrottlingManagerImpl() {
        this.zza = new InFlightThrottler();
    }

    @Override // com.google.android.gms.common.internal.ClientThrottlingManager
    @KeepForSdk
    public int tryAcquire(int i, @NonNull ConnectionThrottlingConfig connectionThrottlingConfig) {
        ThrottlingLimits throttlingLimitsZza = connectionThrottlingConfig.zza(i);
        if (throttlingLimitsZza != null && !this.zza.a(i, throttlingLimitsZza)) {
            return throttlingLimitsZza.a;
        }
        return Integer.MIN_VALUE;
    }

    @KeepForSdk
    public ClientThrottlingManagerImpl(@NonNull GmsThrottler gmsThrottler) {
        this.zza = gmsThrottler;
    }
}
