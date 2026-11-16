package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ps0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzewy implements zzfdv {
    public final zzher a;
    public final zzfmj b;
    public final zzcgm c;

    @Override // com.google.android.gms.internal.ads.zzfdv
    public final ListenableFuture zza() {
        return this.a.submit(new ps0(this, 14));
    }

    @Override // com.google.android.gms.internal.ads.zzfdv
    public final int zzb() {
        return 9;
    }

    public zzewy(zzher zzherVar, zzfmj zzfmjVar, zzcgm zzcgmVar) {
        this.a = zzherVar;
        this.b = zzfmjVar;
        this.c = zzcgmVar;
    }
}
