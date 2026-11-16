package com.google.android.recaptcha.internal;

import androidx.annotation.OpenForTesting;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@OpenForTesting
public final class zzbn {
    private final long zza = System.currentTimeMillis();

    @NotNull
    private final zzjh zzb = zzjh.zzb();

    public final long zza(@NotNull TimeUnit timeUnit) {
        return this.zzb.zza(timeUnit);
    }

    public final long zzb() {
        return this.zza;
    }

    public final void zzc() {
        this.zzb.zzf();
    }
}
