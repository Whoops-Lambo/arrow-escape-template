package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzexw implements zzfdv {
    public final zzfmj a;

    @Override // com.google.android.gms.internal.ads.zzfdv
    public final ListenableFuture zza() {
        return zzheh.a(new zzexx(this.a.q));
    }

    @Override // com.google.android.gms.internal.ads.zzfdv
    public final int zzb() {
        return 58;
    }

    public zzexw(zzfmj zzfmjVar) {
        this.a = zzfmjVar;
    }
}
