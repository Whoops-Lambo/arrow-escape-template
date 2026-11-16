package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class i implements zzihi {
    public static final i a = new i();

    @Override // com.google.android.gms.internal.ads.zzihi
    public final boolean zza(int i) {
        zzbiw.zzo.zzb zzbVar;
        if (i == 0) {
            zzbVar = zzbiw.zzo.zzb.PLATFORM_UNSPECIFIED;
        } else if (i != 1) {
            zzbVar = i != 2 ? null : zzbiw.zzo.zzb.ANDROID;
        } else {
            zzbVar = zzbiw.zzo.zzb.IOS;
        }
        return zzbVar != null;
    }
}
