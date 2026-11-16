package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import defpackage.p04;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzbvv {
    public final zzbuy a;
    public ListenableFuture b;

    public final void a() {
        if (this.b == null) {
            zzcha zzchaVar = new zzcha();
            this.b = zzchaVar;
            this.a.b().a(new p04(zzchaVar), new p04(zzchaVar));
        }
    }

    public zzbvv(zzbuy zzbuyVar) {
        this.a = zzbuyVar;
    }
}
