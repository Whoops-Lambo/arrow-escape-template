package com.google.android.recaptcha.internal;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzbs {

    @NotNull
    private final GoogleApiAvailabilityLight zza;

    @NotNull
    public final int zza(@NotNull Context context) {
        int iIsGooglePlayServicesAvailable = this.zza.isGooglePlayServicesAvailable(context);
        return (iIsGooglePlayServicesAvailable == 1 || iIsGooglePlayServicesAvailable == 3 || iIsGooglePlayServicesAvailable == 9) ? 4 : 3;
    }

    public zzbs() {
        this.zza = GoogleApiAvailabilityLight.getInstance();
    }

    public zzbs(@NotNull GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        this.zza = googleApiAvailabilityLight;
    }
}
