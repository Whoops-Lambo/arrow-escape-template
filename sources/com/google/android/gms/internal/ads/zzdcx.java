package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzdcx {
    public final AtomicLong a;

    public final void a(long j) {
        this.a.set(j);
    }

    public zzdcx(zzfmb zzfmbVar) {
        AtomicLong atomicLong = new AtomicLong();
        this.a = atomicLong;
        atomicLong.set(zzfmbVar.a.a.u.get());
    }
}
