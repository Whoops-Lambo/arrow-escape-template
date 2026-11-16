package io.p071bidmachine.media3.exoplayer.source;

import android.net.Uri;
import android.os.Handler;
import com.facebook.login.p;
import defpackage.a50;
import defpackage.x73;
import io.p071bidmachine.displays.mapper.a;
import io.p071bidmachine.media3.common.d0;
import io.p071bidmachine.media3.common.f0;
import io.p071bidmachine.media3.common.g0;
import io.p071bidmachine.media3.common.m;
import io.p071bidmachine.media3.common.n;
import io.p071bidmachine.media3.datasource.h;
import io.p071bidmachine.media3.datasource.q;
import io.p071bidmachine.media3.datasource.x;
import io.p071bidmachine.media3.exoplayer.c1;
import io.p071bidmachine.media3.exoplayer.drm.e;
import io.p071bidmachine.media3.exoplayer.drm.i;
import io.p071bidmachine.media3.exoplayer.h0;
import io.p071bidmachine.media3.exoplayer.upstream.c;
import io.p071bidmachine.media3.exoplayer.upstream.g;
import io.p071bidmachine.media3.exoplayer.upstream.j;
import io.p071bidmachine.media3.exoplayer.upstream.k;
import io.p071bidmachine.media3.exoplayer.upstream.l;
import io.p071bidmachine.media3.extractor.e0;
import io.p071bidmachine.media3.extractor.metadata.icy.b;
import io.p071bidmachine.media3.extractor.o;
import io.p071bidmachine.media3.extractor.w;
import io.p071bidmachine.media3.extractor.y;
import io.p071bidmachine.media3.extractor.z;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class s0 implements b0, o, g, j, z0 {
    public static final Map P;
    public static final n Q;
    public z A;
    public long B;
    public boolean C;
    public int D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public boolean I;
    public long J;
    public long K;
    public boolean L;
    public int M;
    public boolean N;
    public boolean O;
    public final Uri a;
    public final h b;
    public final i c;
    public final a d;
    public final e e;
    public final e f;
    public final v0 g;
    public final c h;
    public final long i;
    public final n j;
    public final long k;
    public final l l;
    public final p m;
    public final a50 n;
    public final n0 o;
    public final n0 p;
    public final Handler q;
    public a0 r;
    public b s;
    public a1[] t;
    public r0[] u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public com.moloco.sdk.internal.error.crash.data.network.b z;

    @Override // io.p071bidmachine.media3.extractor.o
    public final void endTracks() {
        this.v = true;
        this.q.post(this.o);
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.d1
    public final void reevaluateBuffer(long j) {
    }

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        P = Collections.unmodifiableMap(map);
        m mVar = new m();
        mVar.a = "icy";
        mVar.m = f0.p("application/x-icy");
        Q = new n(mVar);
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.d1
    public final boolean a(h0 h0Var) {
        if (this.N) {
            return false;
        }
        l lVar = this.l;
        if (lVar.b() || this.L) {
            return false;
        }
        if ((this.w || this.j != null) && this.H == 0) {
            return false;
        }
        boolean zC = this.n.c();
        if (lVar.c()) {
            return zC;
        }
        u();
        return true;
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.b0
    public final void b(a0 a0Var, long j) {
        this.r = a0Var;
        n nVar = this.j;
        if (nVar == null) {
            this.n.c();
            u();
        } else {
            track(0, 3).c(nVar);
            t(new w(new long[]{0}, new long[]{0}, -9223372036854775807L));
            endTracks();
            this.K = j;
        }
    }

    @Override // io.p071bidmachine.media3.exoplayer.upstream.g
    public final void c(io.p071bidmachine.media3.exoplayer.upstream.i iVar, long j, long j2) {
        p0 p0Var = (p0) iVar;
        if (this.B == -9223372036854775807L && this.A != null) {
            long jN = n(true);
            long j3 = jN == Long.MIN_VALUE ? 0L : jN + 10000;
            this.B = j3;
            this.g.u(j3, this.A, this.C);
        }
        x xVar = p0Var.b;
        Uri uri = xVar.c;
        u uVar = new u(xVar.d, j2);
        this.d.getClass();
        this.e.d(uVar, 1, -1, null, 0, null, p0Var.i, this.B);
        this.N = true;
        a0 a0Var = this.r;
        a0Var.getClass();
        a0Var.p(this);
    }

    @Override // io.p071bidmachine.media3.exoplayer.upstream.g
    public final void d(io.p071bidmachine.media3.exoplayer.upstream.i iVar, long j, long j2, int i) {
        u uVar;
        p0 p0Var = (p0) iVar;
        x xVar = p0Var.b;
        if (i == 0) {
            uVar = new u(p0Var.j);
        } else {
            Uri uri = xVar.c;
            uVar = new u(xVar.d, j2);
        }
        this.e.g(uVar, 1, -1, null, 0, null, p0Var.i, this.B, i);
    }

    @Override // io.p071bidmachine.media3.exoplayer.upstream.g
    public final void e(io.p071bidmachine.media3.exoplayer.upstream.i iVar, long j, long j2, boolean z) {
        p0 p0Var = (p0) iVar;
        x xVar = p0Var.b;
        Uri uri = xVar.c;
        u uVar = new u(xVar.d, j2);
        this.d.getClass();
        this.e.c(uVar, 1, -1, null, 0, null, p0Var.i, this.B);
        if (z) {
            return;
        }
        for (a1 a1Var : this.t) {
            a1Var.z(false);
        }
        if (this.H > 0) {
            a0 a0Var = this.r;
            a0Var.getClass();
            a0Var.p(this);
        }
    }

    @Override // io.p071bidmachine.media3.exoplayer.upstream.g
    public final x73 f(io.p071bidmachine.media3.exoplayer.upstream.i iVar, long j, long j2, IOException iOException, int i) {
        x73 x73Var;
        z zVar;
        p0 p0Var = (p0) iVar;
        x xVar = p0Var.b;
        Uri uri = xVar.c;
        u uVar = new u(xVar.d, j2);
        int i2 = io.p071bidmachine.media3.common.util.x.a;
        this.d.getClass();
        long jMin = ((iOException instanceof g0) || (iOException instanceof FileNotFoundException) || (iOException instanceof q) || (iOException instanceof k) || io.p071bidmachine.media3.datasource.i.a(iOException)) ? -9223372036854775807L : Math.min((i - 1) * 1000, 5000);
        if (jMin == -9223372036854775807L) {
            x73Var = l.f;
        } else {
            int iM = m();
            int i3 = iM > this.M ? 1 : 0;
            if (this.I || !((zVar = this.A) == null || zVar.getDurationUs() == -9223372036854775807L)) {
                this.M = iM;
            } else if (!this.w || v()) {
                this.F = this.w;
                this.J = 0L;
                this.M = 0;
                for (a1 a1Var : this.t) {
                    a1Var.z(false);
                }
                p0Var.f.a = 0L;
                p0Var.i = 0L;
                p0Var.h = true;
                p0Var.l = false;
            } else {
                this.L = true;
                x73Var = l.e;
            }
            x73Var = new x73(jMin, i3, false);
        }
        x73 x73Var2 = x73Var;
        this.e.e(uVar, 1, -1, null, 0, null, p0Var.i, this.B, iOException, !x73Var2.a());
        return x73Var2;
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.z0
    public final void g() {
        this.q.post(this.o);
    }

    @Override // io.p071bidmachine.media3.extractor.o
    public final void h(z zVar) {
        this.q.post(new io.p071bidmachine.ads.networks.gam_dynamic.versions.v22_0_0.g(27, this, zVar));
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.d1
    public final boolean isLoading() {
        boolean z;
        if (!this.l.c()) {
            return false;
        }
        a50 a50Var = this.n;
        synchronized (a50Var) {
            z = a50Var.b;
        }
        return z;
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.b0
    public final void j(long j) throws Throwable {
        if (this.y) {
            return;
        }
        l();
        if (o()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.z.d;
        int length = this.t.length;
        for (int i = 0; i < length; i++) {
            this.t[i].g(j, zArr[i]);
        }
    }

    public final void l() {
        io.p071bidmachine.media3.common.util.a.i(this.w);
        this.z.getClass();
        this.A.getClass();
    }

    public final int m() {
        int i = 0;
        for (a1 a1Var : this.t) {
            i += a1Var.q + a1Var.p;
        }
        return i;
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.b0
    public final void maybeThrowPrepareError() throws IOException {
        int iR = this.d.r(this.D);
        l lVar = this.l;
        IOException iOException = lVar.c;
        if (iOException != null) {
            throw iOException;
        }
        io.p071bidmachine.media3.exoplayer.upstream.h hVar = lVar.b;
        if (hVar != null) {
            if (iR == Integer.MIN_VALUE) {
                iR = hVar.a;
            }
            IOException iOException2 = hVar.e;
            if (iOException2 != null && hVar.f > iR) {
                throw iOException2;
            }
        }
        if (this.N && !this.w) {
            throw g0.a("Loading finished before preparation is complete.", null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public final long n(boolean z) {
        long jMax = Long.MIN_VALUE;
        for (int i = 0; i < this.t.length; i++) {
            if (z) {
                jMax = Math.max(jMax, this.t[i].n());
            } else {
                com.moloco.sdk.internal.error.crash.data.network.b bVar = this.z;
                bVar.getClass();
                if (((boolean[]) bVar.d)[i]) {
                    jMax = Math.max(jMax, this.t[i].n());
                }
            }
        }
        return jMax;
    }

    public final boolean o() {
        return this.K != -9223372036854775807L;
    }

    @Override // io.p071bidmachine.media3.exoplayer.upstream.j
    public final void onLoaderReleased() {
        for (a1 a1Var : this.t) {
            a1Var.z(true);
            io.p071bidmachine.iab.mraid.w wVar = a1Var.h;
            if (wVar != null) {
                wVar.O(a1Var.e);
                a1Var.h = null;
                a1Var.g = null;
            }
        }
        p pVar = this.m;
        io.p071bidmachine.media3.extractor.m mVar = (io.p071bidmachine.media3.extractor.m) pVar.b;
        if (mVar != null) {
            mVar.release();
            pVar.b = null;
        }
        pVar.c = null;
    }

    public final void p() {
        long j = this.k;
        if (this.O || this.w || !this.v || this.A == null) {
            return;
        }
        for (a1 a1Var : this.t) {
            if (a1Var.s() == null) {
                return;
            }
        }
        a50 a50Var = this.n;
        synchronized (a50Var) {
            a50Var.b = false;
        }
        int length = this.t.length;
        io.p071bidmachine.media3.common.s0[] s0VarArr = new io.p071bidmachine.media3.common.s0[length];
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            n nVarS = this.t[i].s();
            nVarS.getClass();
            String str = nVarS.n;
            boolean zK = f0.k(str);
            boolean z = zK || f0.o(str);
            zArr[i] = z;
            this.x = z | this.x;
            this.y = j != -9223372036854775807L && length == 1 && f0.m(str);
            b bVar = this.s;
            if (bVar != null) {
                int i2 = bVar.a;
                if (zK || this.u[i].b) {
                    d0 d0Var = nVarS.l;
                    d0 d0Var2 = d0Var == null ? new d0(bVar) : d0Var.a(bVar);
                    m mVarA = nVarS.a();
                    mVarA.k = d0Var2;
                    nVarS = new n(mVarA);
                }
                if (zK && nVarS.h == -1 && nVarS.i == -1 && i2 != -1) {
                    m mVarA2 = nVarS.a();
                    mVarA2.h = i2;
                    nVarS = new n(mVarA2);
                }
            }
            int iA = this.c.a(nVarS);
            m mVarA3 = nVarS.a();
            mVarA3.L = iA;
            n nVar = new n(mVarA3);
            s0VarArr[i] = new io.p071bidmachine.media3.common.s0(Integer.toString(i), nVar);
            this.G = nVar.t | this.G;
        }
        this.z = new com.moloco.sdk.internal.error.crash.data.network.b(new i1(s0VarArr), zArr);
        if (this.y && this.B == -9223372036854775807L) {
            this.B = j;
            this.A = new o0(this, this.A);
        }
        this.g.u(this.B, this.A, this.C);
        this.w = true;
        a0 a0Var = this.r;
        a0Var.getClass();
        a0Var.l(this);
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.b0
    public final long readDiscontinuity() {
        if (this.G) {
            this.G = false;
            return this.J;
        }
        if (!this.F) {
            return -9223372036854775807L;
        }
        if (!this.N && m() <= this.M) {
            return -9223372036854775807L;
        }
        this.F = false;
        return this.J;
    }

    public final e0 s(r0 r0Var) {
        int length = this.t.length;
        for (int i = 0; i < length; i++) {
            if (r0Var.equals(this.u[i])) {
                return this.t[i];
            }
        }
        if (this.v) {
            io.p071bidmachine.media3.common.util.a.A("ProgressiveMediaPeriod", "Extractor added new track (id=" + r0Var.a + ") after finishing tracks.");
            return new io.p071bidmachine.media3.extractor.l();
        }
        i iVar = this.c;
        iVar.getClass();
        a1 a1Var = new a1(this.h, iVar, this.f);
        a1Var.f = this;
        int i2 = length + 1;
        r0[] r0VarArr = (r0[]) Arrays.copyOf(this.u, i2);
        r0VarArr[length] = r0Var;
        int i3 = io.p071bidmachine.media3.common.util.x.a;
        this.u = r0VarArr;
        a1[] a1VarArr = (a1[]) Arrays.copyOf(this.t, i2);
        a1VarArr[length] = a1Var;
        this.t = a1VarArr;
        return a1Var;
    }

    public final void t(z zVar) {
        this.A = this.s == null ? zVar : new io.p071bidmachine.media3.extractor.q(-9223372036854775807L);
        this.B = zVar.getDurationUs();
        boolean z = !this.I && zVar.getDurationUs() == -9223372036854775807L;
        this.C = z;
        this.D = z ? 7 : 1;
        if (this.w) {
            this.g.u(this.B, zVar, z);
        } else {
            p();
        }
    }

    @Override // io.p071bidmachine.media3.extractor.o
    public final e0 track(int i, int i2) {
        return s(new r0(i, false));
    }

    public final void u() {
        p0 p0Var = new p0(this, this.a, this.b, this.m, this, this.n);
        if (this.w) {
            io.p071bidmachine.media3.common.util.a.i(o());
            long j = this.B;
            if (j != -9223372036854775807L && this.K > j) {
                this.N = true;
                this.K = -9223372036854775807L;
                return;
            }
            z zVar = this.A;
            zVar.getClass();
            long j2 = zVar.getSeekPoints(this.K).a.b;
            long j3 = this.K;
            p0Var.f.a = j2;
            p0Var.i = j3;
            p0Var.h = true;
            p0Var.l = false;
            for (a1 a1Var : this.t) {
                a1Var.t = this.K;
            }
            this.K = -9223372036854775807L;
        }
        this.M = m();
        this.l.e(p0Var, this, this.d.r(this.D));
    }

    public final boolean v() {
        return this.F || o();
    }

    public s0(Uri uri, h hVar, p pVar, i iVar, e eVar, a aVar, e eVar2, v0 v0Var, c cVar, int i, n nVar, long j, io.p071bidmachine.media3.exoplayer.util.a aVar2) {
        l lVar;
        this.a = uri;
        this.b = hVar;
        this.c = iVar;
        this.f = eVar;
        this.d = aVar;
        this.e = eVar2;
        this.g = v0Var;
        this.h = cVar;
        this.i = i;
        this.j = nVar;
        if (aVar2 != null) {
            lVar = new l(aVar2);
        } else {
            lVar = new l("ProgressiveMediaPeriod");
        }
        this.l = lVar;
        this.m = pVar;
        this.k = j;
        this.n = new a50(4);
        this.o = new n0(this, 0);
        this.p = new n0(this, 1);
        this.q = io.p071bidmachine.media3.common.util.x.m(null);
        this.u = new r0[0];
        this.t = new a1[0];
        this.K = -9223372036854775807L;
        this.D = 1;
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.d1
    public final long getBufferedPositionUs() {
        long jN;
        boolean z;
        l();
        if (this.N || this.H == 0) {
            return Long.MIN_VALUE;
        }
        if (o()) {
            return this.K;
        }
        if (this.x) {
            int length = this.t.length;
            jN = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                com.moloco.sdk.internal.error.crash.data.network.b bVar = this.z;
                if (((boolean[]) bVar.c)[i] && ((boolean[]) bVar.d)[i]) {
                    a1 a1Var = this.t[i];
                    synchronized (a1Var) {
                        z = a1Var.w;
                    }
                    if (!z) {
                        jN = Math.min(jN, this.t[i].n());
                    }
                }
            }
        } else {
            jN = Long.MAX_VALUE;
        }
        if (jN == Long.MAX_VALUE) {
            jN = n(false);
        }
        if (jN == Long.MIN_VALUE) {
            return this.J;
        }
        return jN;
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.d1
    public final long getNextLoadPositionUs() {
        return getBufferedPositionUs();
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.b0
    public final i1 getTrackGroups() {
        l();
        return (i1) this.z.b;
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.b0
    public final long i(long j, c1 c1Var) {
        l();
        if (!this.A.isSeekable()) {
            return 0L;
        }
        y seekPoints = this.A.getSeekPoints(j);
        return c1Var.a(j, seekPoints.a.a, seekPoints.b.a);
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.b0
    public final long k(io.p071bidmachine.media3.exoplayer.trackselection.q[] qVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j) throws Throwable {
        boolean z;
        io.p071bidmachine.media3.exoplayer.trackselection.q qVar;
        boolean z2;
        boolean z3;
        l();
        com.moloco.sdk.internal.error.crash.data.network.b bVar = this.z;
        i1 i1Var = (i1) bVar.b;
        boolean[] zArr3 = (boolean[]) bVar.d;
        int i = this.H;
        int i2 = 0;
        for (int i3 = 0; i3 < qVarArr.length; i3++) {
            b1 b1Var = b1VarArr[i3];
            if (b1Var != null && (qVarArr[i3] == null || !zArr[i3])) {
                int i4 = ((q0) b1Var).a;
                io.p071bidmachine.media3.common.util.a.i(zArr3[i4]);
                this.H--;
                zArr3[i4] = false;
                b1VarArr[i3] = null;
            }
        }
        if (!this.E ? !(j == 0 || this.y) : i == 0) {
            z = true;
        } else {
            z = false;
        }
        for (int i5 = 0; i5 < qVarArr.length; i5++) {
            if (b1VarArr[i5] == null && (qVar = qVarArr[i5]) != null) {
                if (qVar.length() == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                io.p071bidmachine.media3.common.util.a.i(z2);
                if (qVar.getIndexInTrackGroup(0) == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                io.p071bidmachine.media3.common.util.a.i(z3);
                int iB = i1Var.b(qVar.getTrackGroup());
                io.p071bidmachine.media3.common.util.a.i(!zArr3[iB]);
                this.H++;
                zArr3[iB] = true;
                this.G = qVar.getSelectedFormat().t | this.G;
                b1VarArr[i5] = new q0(this, iB);
                zArr2[i5] = true;
                if (!z) {
                    a1 a1Var = this.t[iB];
                    if (a1Var.p() != 0 && !a1Var.B(j, true)) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
        }
        if (this.H == 0) {
            this.L = false;
            this.F = false;
            this.G = false;
            l lVar = this.l;
            if (lVar.c()) {
                a1[] a1VarArr = this.t;
                int length = a1VarArr.length;
                while (i2 < length) {
                    a1VarArr[i2].h();
                    i2++;
                }
                lVar.a();
            } else {
                this.N = false;
                for (a1 a1Var2 : this.t) {
                    a1Var2.z(false);
                }
            }
        } else if (z) {
            j = seekToUs(j);
            while (i2 < b1VarArr.length) {
                if (b1VarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.E = true;
        return j;
    }

    public final void q(int i) {
        l();
        com.moloco.sdk.internal.error.crash.data.network.b bVar = this.z;
        boolean[] zArr = (boolean[]) bVar.e;
        if (!zArr[i]) {
            n nVar = ((i1) bVar.b).a(i).d[0];
            this.e.b(f0.i(nVar.n), nVar, 0, null, this.J);
            zArr[i] = true;
        }
    }

    public final void r(int i) {
        l();
        if (this.L) {
            if ((!this.x || ((boolean[]) this.z.c)[i]) && !this.t[i].t(false)) {
                this.K = 0L;
                this.L = false;
                this.F = true;
                this.J = 0L;
                this.M = 0;
                for (a1 a1Var : this.t) {
                    a1Var.z(false);
                }
                a0 a0Var = this.r;
                a0Var.getClass();
                a0Var.p(this);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x007f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0084 A[LOOP:1: B:42:0x0082->B:43:0x0084, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:0x0090  */
    /* JADX WARN: Code duplicated, block: B:48:0x0099 A[LOOP:2: B:47:0x0097->B:48:0x0099, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:41:0x007f, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:46:0x0090, please report this as an issue */
    @Override // io.p071bidmachine.media3.exoplayer.source.b0
    public final long seekToUs(long j) throws Throwable {
        boolean z;
        int i;
        boolean zB;
        l();
        boolean[] zArr = (boolean[]) this.z.c;
        if (!this.A.isSeekable()) {
            j = 0;
        }
        this.F = false;
        boolean z2 = true;
        if (this.J == j) {
            z = true;
        } else {
            z = false;
        }
        this.J = j;
        if (o()) {
            this.K = j;
            return j;
        }
        int i2 = this.D;
        l lVar = this.l;
        if (i2 != 7 && (this.N || lVar.c())) {
            int length = this.t.length;
            for (int i3 = 0; i3 < length; i3++) {
                a1 a1Var = this.t[i3];
                if (a1Var.p() != 0 || !z) {
                    if (this.y) {
                        zB = a1Var.A(a1Var.q);
                    } else {
                        zB = a1Var.B(j, false);
                    }
                    if (!zB && (zArr[i3] || !this.x)) {
                        z2 = false;
                        break;
                    }
                }
            }
            if (!z2) {
                this.L = false;
                this.K = j;
                this.N = false;
                this.G = false;
                if (lVar.c()) {
                    for (a1 a1Var2 : this.t) {
                        a1Var2.h();
                    }
                    lVar.a();
                    return j;
                }
                lVar.c = null;
                for (a1 a1Var3 : this.t) {
                    a1Var3.z(false);
                }
            }
        } else {
            this.L = false;
            this.K = j;
            this.N = false;
            this.G = false;
            if (lVar.c()) {
                while (i < r0) {
                    a1Var2.h();
                }
                lVar.a();
                return j;
            }
            lVar.c = null;
            while (i < r0) {
                a1Var3.z(false);
            }
        }
        return j;
    }
}
