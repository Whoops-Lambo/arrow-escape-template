package com.google.android.gms.common.wrappers;

import android.content.AttributionSource;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@KeepForSdk
public final class AttributionSourceWrapper {

    @Nullable
    private final AttributionSource zza;

    @Nullable
    @KeepForSdk
    public AttributionSource getAttributionSource() {
        return this.zza;
    }

    @KeepForSdk
    public AttributionSourceWrapper(@Nullable AttributionSource attributionSource) {
        this.zza = attributionSource;
    }
}
