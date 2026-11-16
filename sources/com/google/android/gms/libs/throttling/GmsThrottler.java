package com.google.android.gms.libs.throttling;

import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@KeepForSdk
public interface GmsThrottler {
    boolean a(long j, ThrottlingLimits throttlingLimits);

    void b(long j);
}
