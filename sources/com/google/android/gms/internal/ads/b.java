package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class b implements zzihi {
    public static final b a = new b();

    @Override // com.google.android.gms.internal.ads.zzihi
    public final boolean zza(int i) {
        zzbiw.zzab.zzb zzbVar;
        if (i == 0) {
            zzbVar = zzbiw.zzab.zzb.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
        } else if (i == 1) {
            zzbVar = zzbiw.zzab.zzb.TWO_G;
        } else if (i != 2) {
            zzbVar = i != 4 ? null : zzbiw.zzab.zzb.LTE;
        } else {
            zzbVar = zzbiw.zzab.zzb.THREE_G;
        }
        return zzbVar != null;
    }
}
