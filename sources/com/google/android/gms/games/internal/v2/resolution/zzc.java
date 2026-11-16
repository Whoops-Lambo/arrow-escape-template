package com.google.android.gms.games.internal.v2.resolution;

import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzc {
    private final boolean zza;
    private final Intent zzb;

    public static zzc zza(Intent intent) {
        return new zzc(true, intent);
    }

    public static zzc zzb(Intent intent) {
        return new zzc(false, intent);
    }

    public final boolean zzc() {
        return this.zza;
    }

    public final Intent zzd() {
        return this.zzb;
    }

    private zzc(boolean z, Intent intent) {
        this.zza = z;
        this.zzb = intent;
    }
}
