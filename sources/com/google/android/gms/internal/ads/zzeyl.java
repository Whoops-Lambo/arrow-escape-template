package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ry3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzeyl implements zzfdv {
    public final zzher a;

    @Override // com.google.android.gms.internal.ads.zzfdv
    public final ListenableFuture zza() {
        return this.a.submit(new ry3(2));
    }

    @Override // com.google.android.gms.internal.ads.zzfdv
    public final int zzb() {
        return 55;
    }

    public zzeyl(zzher zzherVar) {
        this.a = zzherVar;
    }
}
