package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@KeepForSdk
public final class InternalClientFlagRegistry {
    private static final InternalClientFlags zza = zzag.zza();

    @NonNull
    @KeepForSdk
    public static InternalClientFlags getClientFlags() {
        return zza;
    }

    private InternalClientFlagRegistry() {
    }
}
