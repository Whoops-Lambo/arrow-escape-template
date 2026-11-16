package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class c implements zzihi {
    public static final c a = new c();

    @Override // com.google.android.gms.internal.ads.zzihi
    public final boolean zza(int i) {
        zzbiw.zzab.zzc zzcVar;
        if (i == 0) {
            zzcVar = zzbiw.zzab.zzc.NETWORKTYPE_UNSPECIFIED;
        } else if (i != 1) {
            zzcVar = i != 2 ? null : zzbiw.zzab.zzc.WIFI;
        } else {
            zzcVar = zzbiw.zzab.zzc.CELL;
        }
        return zzcVar != null;
    }
}
