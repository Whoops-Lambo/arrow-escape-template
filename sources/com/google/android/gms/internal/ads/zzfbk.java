package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ps0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzfbk implements zzfdv {
    public final zzher a;
    public final zzeec b;

    @Override // com.google.android.gms.internal.ads.zzfdv
    public final ListenableFuture zza() {
        return this.a.submit(new ps0(this, 23));
    }

    @Override // com.google.android.gms.internal.ads.zzfdv
    public final int zzb() {
        return 23;
    }

    public zzfbk(zzher zzherVar, zzeec zzeecVar) {
        this.a = zzherVar;
        this.b = zzeecVar;
    }
}
