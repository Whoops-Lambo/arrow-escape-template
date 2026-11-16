package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import defpackage.q04;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzbvy implements zzhdo {
    public final ListenableFuture a;

    @Override // com.google.android.gms.internal.ads.zzhdo
    public final ListenableFuture zza(Object obj) {
        return zzheh.h(this.a, new q04(1, this, obj), zzcgv.h);
    }

    public zzbvy(ListenableFuture listenableFuture) {
        this.a = listenableFuture;
    }
}
