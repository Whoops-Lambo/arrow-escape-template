package com.google.android.gms.internal.ads;

import defpackage.o24;
import defpackage.ru4;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzgfm implements zzipf {
    public final zzipg a;

    @Override // com.google.android.gms.internal.ads.zzipu
    public final Object zzb() {
        ExecutorService executorService = (ExecutorService) this.a.a;
        if (executorService instanceof zzher) {
            return (zzher) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new ru4((ScheduledExecutorService) executorService) : new o24(executorService);
    }

    public zzgfm(zzipg zzipgVar) {
        this.a = zzipgVar;
    }
}
