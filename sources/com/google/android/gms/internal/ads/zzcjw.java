package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import defpackage.b04;
import defpackage.ps0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzcjw extends com.google.android.gms.ads.internal.util.zzb {
    public final zzcir a;
    public final zzcke b;
    public final String c;
    public final String[] d;

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        try {
            this.b.g(this.c, this.d);
        } finally {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new b04(this, 7));
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final ListenableFuture zzb() {
        return (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.P2)).booleanValue() && (this.b instanceof zzckn)) ? zzcgv.f.submit(new ps0(this, 5)) : super.zzb();
    }

    public zzcjw(zzcir zzcirVar, zzcke zzckeVar, String str, String[] strArr) {
        this.a = zzcirVar;
        this.b = zzckeVar;
        this.c = str;
        this.d = strArr;
        com.google.android.gms.ads.internal.zzt.zzB().a.add(this);
    }
}
