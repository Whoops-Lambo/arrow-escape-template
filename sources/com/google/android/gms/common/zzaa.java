package com.google.android.gms.common;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.common.a;
import com.google.android.gms.internal.common.zzam;
import defpackage.e32;
import defpackage.wq3;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
final class zzaa {

    @Nullable
    private String zza = null;
    private long zzb = -1;
    private zzam zzc;
    private zzam zzd;

    public final zzaa zza(String str) {
        this.zza = str;
        return this;
    }

    public final zzaa zzb(long j) {
        this.zzb = j;
        return this;
    }

    public final zzab zze() {
        if (this.zza == null) {
            e32.i("packageName must be defined");
            return null;
        }
        if (this.zzb < 0) {
            e32.i("minimumStampedVersionNumber must be greater than or equal to 0");
            return null;
        }
        if (!this.zzc.isEmpty() || !this.zzd.isEmpty()) {
            return new zzab(this.zza, this.zzb, this.zzc, this.zzd, null);
        }
        e32.i("Either orderedTestCerts or orderedProdCerts must have at least one cert");
        return null;
    }

    public zzaa() {
        wq3 wq3Var = zzam.b;
        a aVar = a.e;
        this.zzc = aVar;
        this.zzd = aVar;
    }

    public final zzaa zzc(List list) {
        Preconditions.checkNotNull(list);
        this.zzc = zzam.z(list);
        return this;
    }

    public final zzaa zzd(List list) {
        Preconditions.checkNotNull(list);
        this.zzd = zzam.z(list);
        return this;
    }
}
