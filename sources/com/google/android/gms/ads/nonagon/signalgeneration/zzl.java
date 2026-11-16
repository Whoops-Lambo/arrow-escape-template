package com.google.android.gms.ads.nonagon.signalgeneration;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.query.QueryInfo;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzl {

    @Nullable
    private final QueryInfo zza;
    private final String zzb;
    private final long zzc;
    private final int zzd;
    private final AtomicBoolean zze = new AtomicBoolean(false);

    @Nullable
    public final QueryInfo zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final int zzd() {
        return this.zzd;
    }

    public final boolean zze() {
        return this.zze.get();
    }

    public final void zzf() {
        this.zze.set(true);
    }

    public zzl(@Nullable QueryInfo queryInfo, String str, long j, int i) {
        this.zza = queryInfo;
        this.zzb = str;
        this.zzc = j;
        this.zzd = i;
    }

    public final boolean zzc() {
        if (this.zzc <= com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()) {
            return true;
        }
        return false;
    }
}
