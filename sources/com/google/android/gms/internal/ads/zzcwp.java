package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzcwp implements zzipf {
    public final zzipe a;
    public final zzipe b;
    public final zzipe c;

    @Override // com.google.android.gms.internal.ads.zzipu
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzdhd zzb() {
        return new zzdhd((ScheduledExecutorService) this.a.zzb(), (Clock) this.b.zzb(), (zzeaw) this.c.zzb());
    }

    public zzcwp(zzipe zzipeVar, zzipe zzipeVar2, zzipe zzipeVar3) {
        this.a = zzipeVar;
        this.b = zzipeVar2;
        this.c = zzipeVar3;
    }
}
