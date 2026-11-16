package io.p071bidmachine.media3.exoplayer;

import android.os.SystemClock;
import io.p071bidmachine.media3.common.i0;
import io.p071bidmachine.media3.common.util.s;
import io.p071bidmachine.media3.common.util.x;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class d1 implements i0 {
    public final s a;
    public boolean b;
    public long c;
    public long d;
    public i0 e = i0.d;

    @Override // io.p071bidmachine.media3.exoplayer.i0
    public final void a(i0 i0Var) {
        if (this.b) {
            b(getPositionUs());
        }
        this.e = i0Var;
    }

    public final void b(long j) {
        this.c = j;
        if (this.b) {
            this.a.getClass();
            this.d = SystemClock.elapsedRealtime();
        }
    }

    public final void c() {
        if (this.b) {
            return;
        }
        this.a.getClass();
        this.d = SystemClock.elapsedRealtime();
        this.b = true;
    }

    @Override // io.p071bidmachine.media3.exoplayer.i0
    public final i0 getPlaybackParameters() {
        return this.e;
    }

    @Override // io.p071bidmachine.media3.exoplayer.i0
    public final long getPositionUs() {
        long j = this.c;
        if (!this.b) {
            return j;
        }
        this.a.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.d;
        i0 i0Var = this.e;
        return (i0Var.a == 1.0f ? x.L(jElapsedRealtime) : jElapsedRealtime * ((long) i0Var.c)) + j;
    }

    public d1(s sVar) {
        this.a = sVar;
    }
}
