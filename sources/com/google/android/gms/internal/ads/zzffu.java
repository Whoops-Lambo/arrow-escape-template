package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import defpackage.hg4;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzffu implements zzfdv {
    public final zzher a;
    public final List b;

    @Override // com.google.android.gms.internal.ads.zzfdv
    public final ListenableFuture zza() {
        return this.a.submit(new hg4(this, 4));
    }

    @Override // com.google.android.gms.internal.ads.zzfdv
    public final int zzb() {
        return 48;
    }

    public zzffu(zzher zzherVar, List list) {
        this.a = zzherVar;
        this.b = list;
    }
}
