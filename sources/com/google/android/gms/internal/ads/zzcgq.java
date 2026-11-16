package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzcgq {
    public zzher a;
    public zzeaw b;
    public Context c;
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final AtomicBoolean e = new AtomicBoolean(false);
    public long f = -1;
    public long g = -1;

    public final void a(zzher zzherVar, zzeaw zzeawVar, Context context) {
        if (this.d.getAndSet(true)) {
            return;
        }
        this.a = zzherVar;
        this.b = zzeawVar;
        this.f = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Qf)).longValue();
        this.g = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Rf)).longValue();
        this.c = context;
    }
}
