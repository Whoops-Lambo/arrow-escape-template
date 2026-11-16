package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zznt implements zzmj {
    public boolean a;
    public long b;
    public long c;
    public zzav d;

    public final void a(long j) {
        this.b = j;
        if (this.a) {
            this.c = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmj
    public final void p(zzav zzavVar) {
        if (this.a) {
            a(zzg());
        }
        this.d = zzavVar;
    }

    @Override // com.google.android.gms.internal.ads.zzmj
    public final long zzg() {
        long j = this.b;
        if (!this.a) {
            return j;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.c;
        zzav zzavVar = this.d;
        return (zzavVar.a == 1.0f ? zzfq.u(jElapsedRealtime) : jElapsedRealtime * ((long) zzavVar.c)) + j;
    }

    @Override // com.google.android.gms.internal.ads.zzmj
    public final zzav zzj() {
        return this.d;
    }
}
