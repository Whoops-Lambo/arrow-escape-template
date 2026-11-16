package com.google.android.recaptcha.internal;

import defpackage.du;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzfz {

    @NotNull
    private final zzjj zza;

    @NotNull
    public final List zza() {
        return du.z0(this.zza);
    }

    public final boolean zzb(@NotNull List list) {
        this.zza.add(list);
        return true;
    }

    public zzfz(int i) {
        this.zza = zzjj.zza(i);
    }

    @NotNull
    public final List zwk() {
        return zza();
    }

    public zzfz() {
        this(1);
    }
}
