package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class u implements h {
    public boolean a;
    public long b;
    public long c;
    public com.fyber.inneractive.sdk.player.exoplayer2.s d = com.fyber.inneractive.sdk.player.exoplayer2.s.d;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.util.h
    public final com.fyber.inneractive.sdk.player.exoplayer2.s a(com.fyber.inneractive.sdk.player.exoplayer2.s sVar) {
        if (this.a) {
            a(b());
        }
        this.d = sVar;
        return sVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.util.h
    public final long b() {
        long j = this.b;
        if (!this.a) {
            return j;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.c;
        com.fyber.inneractive.sdk.player.exoplayer2.s sVar = this.d;
        if (sVar.a != 1.0f) {
            return (jElapsedRealtime * ((long) sVar.c)) + j;
        }
        int i = com.fyber.inneractive.sdk.player.exoplayer2.b.a;
        return (jElapsedRealtime != -9223372036854775807L ? 1000 * jElapsedRealtime : -9223372036854775807L) + j;
    }

    public final void a(long j) {
        this.b = j;
        if (this.a) {
            this.c = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.util.h
    public final com.fyber.inneractive.sdk.player.exoplayer2.s a() {
        return this.d;
    }
}
