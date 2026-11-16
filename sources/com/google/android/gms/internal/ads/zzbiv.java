package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.o64;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzbiv {
    public zzbfn a;
    public boolean b;
    public final ExecutorService c;

    public zzbiv(Context context) {
        ExecutorService executorService = com.google.android.gms.ads.internal.util.client.zzb.zzb;
        this.c = executorService;
        executorService.execute(new o64(8, this, context));
    }

    public zzbiv() {
        this.c = com.google.android.gms.ads.internal.util.client.zzb.zzb;
    }
}
