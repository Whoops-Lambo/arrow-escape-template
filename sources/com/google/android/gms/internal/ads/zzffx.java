package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.xm4;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzffx implements zzfdv {
    public final ScheduledExecutorService a;

    @Override // com.google.android.gms.internal.ads.zzfdv
    public final ListenableFuture zza() {
        return zzheh.i(zzheh.g(zzheh.a(new Bundle()), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.t5)).longValue(), TimeUnit.MILLISECONDS, this.a), xm4.t, zzcgv.a);
    }

    @Override // com.google.android.gms.internal.ads.zzfdv
    public final int zzb() {
        return 49;
    }

    public zzffx(ScheduledExecutorService scheduledExecutorService) {
        this.a = scheduledExecutorService;
    }
}
