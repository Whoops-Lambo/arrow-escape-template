package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzfcs implements zzfdv {
    public final String a;

    @Override // com.google.android.gms.internal.ads.zzfdv
    public final ListenableFuture zza() {
        return zzheh.a(new zzfct(this.a));
    }

    @Override // com.google.android.gms.internal.ads.zzfdv
    public final int zzb() {
        return 31;
    }

    public zzfcs(String str) {
        this.a = str;
    }
}
