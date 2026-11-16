package com.google.android.gms.games;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzh {
    int zza = 4368;
    final ArrayList zzb = new ArrayList();

    @Nullable
    String zzc = null;
    com.google.android.gms.games.internal.zzi zzd = com.google.android.gms.games.internal.zzi.zza;

    static {
        new AtomicInteger(0);
    }

    public final zzh zzb(@Nullable String str) {
        this.zzc = str;
        return this;
    }

    public final zzi zzd() {
        return new zzi(false, true, 17, false, this.zza, null, this.zzb, false, false, false, null, 0, 9, this.zzc, this.zzd, false, null);
    }

    private zzh() {
    }

    public final zzh zza(int i) {
        this.zza = 2101523;
        return this;
    }

    public final zzh zzc(com.google.android.gms.games.internal.zzi zziVar) {
        this.zzd = (com.google.android.gms.games.internal.zzi) Preconditions.checkNotNull(zziVar);
        return this;
    }

    public /* synthetic */ zzh(byte[] bArr) {
    }
}
