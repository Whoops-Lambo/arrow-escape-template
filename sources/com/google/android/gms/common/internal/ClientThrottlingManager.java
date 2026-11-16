package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@KeepForSdk
public interface ClientThrottlingManager {

    @KeepForSdk
    public static final int NO_THROTTLING = Integer.MIN_VALUE;

    @KeepForSdk
    void release(int i);

    @KeepForSdk
    int tryAcquire(int i, @NonNull ConnectionThrottlingConfig connectionThrottlingConfig);
}
