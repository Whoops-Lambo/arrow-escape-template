package io.p071bidmachine.media3.exoplayer.analytics;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.facebook.gamingservices.b;
import defpackage.d31;
import defpackage.d42;
import defpackage.vj0;
import defpackage.vq0;
import defpackage.y32;
import defpackage.z21;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import io.p071bidmachine.internal.p;
import io.p071bidmachine.media3.common.b0;
import io.p071bidmachine.media3.common.b1;
import io.p071bidmachine.media3.common.i0;
import io.p071bidmachine.media3.common.j0;
import io.p071bidmachine.media3.common.k0;
import io.p071bidmachine.media3.common.l0;
import io.p071bidmachine.media3.common.m0;
import io.p071bidmachine.media3.common.n0;
import io.p071bidmachine.media3.common.p0;
import io.p071bidmachine.media3.common.q0;
import io.p071bidmachine.media3.common.r0;
import io.p071bidmachine.media3.common.text.c;
import io.p071bidmachine.media3.common.util.a;
import io.p071bidmachine.media3.common.util.j;
import io.p071bidmachine.media3.common.util.m;
import io.p071bidmachine.media3.common.util.s;
import io.p071bidmachine.media3.common.util.u;
import io.p071bidmachine.media3.common.util.x;
import io.p071bidmachine.media3.common.w0;
import io.p071bidmachine.media3.common.y;
import io.p071bidmachine.media3.common.y0;
import io.p071bidmachine.media3.exoplayer.r;
import io.p071bidmachine.media3.exoplayer.source.d0;
import io.p071bidmachine.media3.exoplayer.source.h0;
import io.p071bidmachine.media3.exoplayer.source.z;
import io.p071bidmachine.media3.exoplayer.w;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements l0, h0, io.p071bidmachine.media3.exoplayer.drm.f {
    public final s a;
    public final p0 b;
    public final q0 c;
    public final vq0 d;
    public final SparseArray e;
    public m f;
    public n0 g;
    public u h;
    public boolean i;

    @Override // io.p071bidmachine.media3.common.l0
    public final void i(m0 m0Var, m0 m0Var2, int i) {
        if (i == 1) {
            this.i = false;
        }
        n0 n0Var = this.g;
        n0Var.getClass();
        vq0 vq0Var = this.d;
        vq0Var.d = vq0.k(n0Var, (d31) vq0Var.b, (d0) vq0Var.e, (p0) vq0Var.a);
        a aVarU = u();
        z(aVarU, 11, new vj0(aVarU, i, m0Var, m0Var2));
    }

    @Override // io.p071bidmachine.media3.common.l0
    public final void o(k0 k0Var) {
    }

    @Override // io.p071bidmachine.media3.common.l0
    public final void onRenderedFirstFrame() {
    }

    public final void A(w wVar, Looper looper) {
        a.i(this.g == null || ((d31) this.d.b).isEmpty());
        wVar.getClass();
        this.g = wVar;
        this.h = this.a.a(looper, null);
        m mVar = this.f;
        this.f = new m(mVar.d, looper, mVar.a, new p(this, wVar), mVar.i);
    }

    @Override // io.p071bidmachine.media3.common.l0
    public final void c(int i) {
        n0 n0Var = this.g;
        n0Var.getClass();
        vq0 vq0Var = this.d;
        vq0Var.d = vq0.k(n0Var, (d31) vq0Var.b, (d0) vq0Var.e, (p0) vq0Var.a);
        vq0Var.p(((w) n0Var).j());
        z(u(), 0, new e(27));
    }

    @Override // io.p071bidmachine.media3.common.l0
    public final void f(io.p071bidmachine.media3.common.h0 h0Var) {
        d0 d0Var;
        z((!(h0Var instanceof io.p071bidmachine.media3.exoplayer.m) || (d0Var = ((io.p071bidmachine.media3.exoplayer.m) h0Var).o) == null) ? u() : w(d0Var), 10, new d(13));
    }

    @Override // io.p071bidmachine.media3.common.l0
    public final void l(io.p071bidmachine.media3.common.h0 h0Var) {
        d0 d0Var;
        a aVarU = (!(h0Var instanceof io.p071bidmachine.media3.exoplayer.m) || (d0Var = ((io.p071bidmachine.media3.exoplayer.m) h0Var).o) == null) ? u() : w(d0Var);
        z(aVarU, 10, new b(aVarU, (Object) h0Var, 18));
    }

    public final a u() {
        return w((d0) this.d.d);
    }

    public final a v(r0 r0Var, int i, d0 d0Var) {
        d0 d0Var2 = r0Var.p() ? null : d0Var;
        this.a.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = r0Var.equals(((w) this.g).j()) && i == ((w) this.g).g();
        long jX = 0;
        if (d0Var2 == null || !d0Var2.b()) {
            if (z) {
                w wVar = (w) this.g;
                wVar.P();
                jX = wVar.d(wVar.h0);
            } else if (!r0Var.p()) {
                jX = x.X(r0Var.m(i, this.c, 0L).k);
            }
        } else if (z && ((w) this.g).e() == d0Var2.b && ((w) this.g).f() == d0Var2.c) {
            jX = ((w) this.g).h();
        }
        long j = jX;
        d0 d0Var3 = (d0) this.d.d;
        r0 r0VarJ = ((w) this.g).j();
        int iG = ((w) this.g).g();
        long jH = ((w) this.g).h();
        w wVar2 = (w) this.g;
        wVar2.P();
        return new a(jElapsedRealtime, r0Var, i, d0Var2, j, r0VarJ, iG, d0Var3, jH, x.X(wVar2.h0.r));
    }

    public final a w(d0 d0Var) {
        this.g.getClass();
        r0 r0Var = d0Var == null ? null : (r0) ((d42) this.d.c).get(d0Var);
        if (d0Var != null && r0Var != null) {
            return v(r0Var, r0Var.g(d0Var.a, this.b).c, d0Var);
        }
        int iG = ((w) this.g).g();
        r0 r0VarJ = ((w) this.g).j();
        if (iG >= r0VarJ.o()) {
            r0VarJ = r0.a;
        }
        return v(r0VarJ, iG, null);
    }

    public final a x(int i, d0 d0Var) {
        this.g.getClass();
        if (d0Var != null) {
            return ((r0) ((d42) this.d.c).get(d0Var)) != null ? w(d0Var) : v(r0.a, i, d0Var);
        }
        r0 r0VarJ = ((w) this.g).j();
        if (i >= r0VarJ.o()) {
            r0VarJ = r0.a;
        }
        return v(r0VarJ, i, null);
    }

    public final a y() {
        return w((d0) this.d.f);
    }

    public final void z(a aVar, int i, j jVar) {
        this.e.put(i, aVar);
        this.f.e(i, jVar);
    }

    public f(s sVar) {
        sVar.getClass();
        this.a = sVar;
        int i = x.a;
        Looper looperMyLooper = Looper.myLooper();
        this.f = new m(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, sVar, new c(3));
        p0 p0Var = new p0();
        this.b = p0Var;
        this.c = new q0();
        vq0 vq0Var = new vq0();
        vq0Var.a = p0Var;
        z21 z21Var = d31.b;
        vq0Var.b = y32.e;
        vq0Var.c = d42.g;
        this.d = vq0Var;
        this.e = new SparseArray();
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.h0
    public final void a(int i, d0 d0Var, io.p071bidmachine.media3.exoplayer.source.u uVar, z zVar) {
        z(x(i, d0Var), 1001, new c(18));
    }

    @Override // io.p071bidmachine.media3.common.l0
    public final void b(b1 b1Var) {
        a aVarY = y();
        z(aVarY, 25, new io.p071bidmachine.media3.exoplayer.s(aVarY, b1Var));
    }

    @Override // io.p071bidmachine.media3.common.l0
    public final void d(y yVar, int i) {
        z(u(), 1, new c(15));
    }

    @Override // io.p071bidmachine.media3.common.l0
    public final void e(y0 y0Var) {
        z(u(), 2, new c(5));
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.h0
    public final void g(int i, d0 d0Var, io.p071bidmachine.media3.exoplayer.source.u uVar, z zVar) {
        z(x(i, d0Var), 1002, new c(28));
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.h0
    public final void h(int i, d0 d0Var, io.p071bidmachine.media3.exoplayer.source.u uVar, z zVar, IOException iOException, boolean z) {
        a aVarX = x(i, d0Var);
        z(aVarX, 1003, new b(aVarX, uVar, zVar, iOException, z));
    }

    @Override // io.p071bidmachine.media3.common.l0
    public final void j(i0 i0Var) {
        z(u(), 12, new c(1));
    }

    @Override // io.p071bidmachine.media3.common.l0
    public final void k(io.p071bidmachine.media3.common.d0 d0Var) {
        z(u(), 28, new c(26));
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.h0
    public final void m(int i, d0 d0Var, z zVar) {
        a aVarX = x(i, d0Var);
        z(aVarX, 1004, new p(aVarX, zVar));
    }

    @Override // io.p071bidmachine.media3.common.l0
    public final void n(c cVar) {
        z(u(), 27, new c(7));
    }

    @Override // io.p071bidmachine.media3.common.l0
    public final void onAudioSessionIdChanged(int i) {
        z(y(), 21, new c(20));
    }

    @Override // io.p071bidmachine.media3.common.l0
    public final void onCues(List list) {
        a aVarU = u();
        z(aVarU, 27, new r(aVarU, list));
    }

    @Override // io.p071bidmachine.media3.common.l0
    public final void onIsLoadingChanged(boolean z) {
        z(u(), 3, new c(14));
    }

    @Override // io.p071bidmachine.media3.common.l0
    public final void onIsPlayingChanged(boolean z) {
        z(u(), 7, new c(16));
    }

    @Override // io.p071bidmachine.media3.common.l0
    public final void onPlayWhenReadyChanged(boolean z, int i) {
        z(u(), 5, new c(4));
    }

    @Override // io.p071bidmachine.media3.common.l0
    public final void onPlaybackStateChanged(int i) {
        z(u(), 4, new c(11));
    }

    @Override // io.p071bidmachine.media3.common.l0
    public final void onPlaybackSuppressionReasonChanged(int i) {
        z(u(), 6, new c(13));
    }

    @Override // io.p071bidmachine.media3.common.l0
    public final void onPlayerStateChanged(boolean z, int i) {
        z(u(), -1, new c(12));
    }

    @Override // io.p071bidmachine.media3.common.l0
    public final void onRepeatModeChanged(int i) {
        z(u(), 8, new c(17));
    }

    @Override // io.p071bidmachine.media3.common.l0
    public final void onShuffleModeEnabledChanged(boolean z) {
        z(u(), 9, new c(29));
    }

    @Override // io.p071bidmachine.media3.common.l0
    public final void onSkipSilenceEnabledChanged(boolean z) {
        z(y(), 23, new d(10));
    }

    @Override // io.p071bidmachine.media3.common.l0
    public final void onSurfaceSizeChanged(int i, int i2) {
        z(y(), 24, new d(12));
    }

    @Override // io.p071bidmachine.media3.common.l0
    public final void onVolumeChanged(float f) {
        z(y(), 22, new d(4));
    }

    @Override // io.p071bidmachine.media3.common.l0
    public final void p(w0 w0Var) {
        z(u(), 19, new d(7));
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.h0
    public final void q(int i, d0 d0Var, io.p071bidmachine.media3.exoplayer.source.u uVar, z zVar, int i2) {
        z(x(i, d0Var), 1000, new c(25));
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.h0
    public final void r(int i, d0 d0Var, z zVar) {
        z(x(i, d0Var), 1005, new c(24));
    }

    @Override // io.p071bidmachine.media3.common.l0
    public final void s(b0 b0Var) {
        z(u(), 14, new e(26));
    }

    @Override // io.p071bidmachine.media3.common.l0
    public final void t(j0 j0Var) {
        z(u(), 13, new d(11));
    }
}
