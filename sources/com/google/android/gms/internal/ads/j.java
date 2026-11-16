package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class j implements zzihi {
    public static final j a = new j();

    @Override // com.google.android.gms.internal.ads.zzihi
    public final boolean zza(int i) {
        zzbiw.zzq zzqVar;
        if (i == 0) {
            zzqVar = zzbiw.zzq.ENUM_FALSE;
        } else if (i != 1) {
            zzqVar = i != 1000 ? null : zzbiw.zzq.ENUM_UNKNOWN;
        } else {
            zzqVar = zzbiw.zzq.ENUM_TRUE;
        }
        return zzqVar != null;
    }
}
