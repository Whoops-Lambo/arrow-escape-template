package com.google.android.recaptcha.internal;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzce extends Exception {

    @Nullable
    private final Throwable zza;

    @NotNull
    private final zztd zzb;

    @NotNull
    private final int zzc;

    @NotNull
    private final int zzd;

    @Override // java.lang.Throwable
    @Nullable
    public final Throwable getCause() {
        return this.zza;
    }

    @NotNull
    public final zztd zza() {
        return this.zzb;
    }

    @NotNull
    public final int zzb() {
        return this.zzd;
    }

    public zzce(@NotNull int i, @NotNull int i2, @Nullable Throwable th) {
        this.zzc = i;
        this.zzd = i2;
        this.zza = th;
        zztd zztdVarZzf = zzte.zzf();
        zztdVarZzf.zzq(i2);
        zztdVarZzf.zzr(i);
        this.zzb = zztdVarZzf;
    }
}
