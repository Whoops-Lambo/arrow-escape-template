package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ps0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzeyp implements zzfdv {
    public final zzher a;
    public final zzdys b;
    public final String c;
    public final zzfmj d;

    @Override // com.google.android.gms.internal.ads.zzfdv
    public final ListenableFuture zza() {
        return this.a.submit(new ps0(this, 18));
    }

    @Override // com.google.android.gms.internal.ads.zzfdv
    public final int zzb() {
        return 17;
    }

    public zzeyp(zzher zzherVar, zzdys zzdysVar, zzfmj zzfmjVar, String str) {
        this.a = zzherVar;
        this.b = zzdysVar;
        this.d = zzfmjVar;
        this.c = str;
    }
}
