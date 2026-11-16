package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ei3;
import defpackage.m62;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzbvq implements zzbvc {
    public final zzbve a;
    public final zzbvf b;
    public final zzbuy c;
    public final String d;

    public final ListenableFuture a(Object obj) {
        zzcha zzchaVar = new zzcha();
        zzbus zzbusVarB = this.c.b();
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise created");
        zzbusVarB.a(new m62(24, this, zzbusVarB, obj, zzchaVar, false), new ei3(18, this, zzchaVar, zzbusVarB));
        return zzchaVar;
    }

    public zzbvq(zzbuy zzbuyVar, String str, zzbvf zzbvfVar, zzbve zzbveVar) {
        this.c = zzbuyVar;
        this.d = str;
        this.b = zzbvfVar;
        this.a = zzbveVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhdo
    public final ListenableFuture zza(Object obj) {
        return a(obj);
    }
}
