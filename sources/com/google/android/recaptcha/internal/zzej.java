package com.google.android.recaptcha.internal;

import defpackage.s71;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzej {

    @NotNull
    private final String zza;
    private final long zzb;
    private final int zzc;

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof zzej)) {
            return false;
        }
        zzej zzejVar = (zzej) obj;
        return s71.b(zzejVar.zza, this.zza) && zzejVar.zzb == this.zzb && zzejVar.zzc == this.zzc;
    }

    public final int zza() {
        return this.zzc;
    }

    public final long zzb() {
        return this.zzb;
    }

    @NotNull
    public final String zzc() {
        return this.zza;
    }

    public zzej(@NotNull String str, long j, int i) {
        this.zza = str;
        this.zzb = j;
        this.zzc = i;
    }
}
