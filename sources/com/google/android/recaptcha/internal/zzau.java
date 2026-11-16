package com.google.android.recaptcha.internal;

import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzau {
    @NotNull
    public static final zzav zza() {
        zzav zzavVar = zzav.zzb;
        if (zzavVar == null) {
            zzav zzavVar2 = new zzav((Map) zzav.zzd.invoke(), null);
            zzav.zzc.clear();
            zzav.zzb = zzavVar2;
            return zzavVar2;
        }
        return zzavVar;
    }
}
