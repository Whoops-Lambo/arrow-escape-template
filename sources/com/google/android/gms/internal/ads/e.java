package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class e implements zzihi {
    public static final e a = new e();

    @Override // com.google.android.gms.internal.ads.zzihi
    public final boolean zza(int i) {
        zzbiw.zzaf.zzd zzdVar;
        if (i == 0) {
            zzdVar = zzbiw.zzaf.zzd.UNSPECIFIED;
        } else if (i == 1) {
            zzdVar = zzbiw.zzaf.zzd.CONNECTING;
        } else if (i == 2) {
            zzdVar = zzbiw.zzaf.zzd.CONNECTED;
        } else if (i == 3) {
            zzdVar = zzbiw.zzaf.zzd.DISCONNECTING;
        } else if (i != 4) {
            zzdVar = i != 5 ? null : zzbiw.zzaf.zzd.SUSPENDED;
        } else {
            zzdVar = zzbiw.zzaf.zzd.DISCONNECTED;
        }
        return zzdVar != null;
    }
}
