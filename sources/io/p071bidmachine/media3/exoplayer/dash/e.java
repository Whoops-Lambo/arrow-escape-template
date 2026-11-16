package io.p071bidmachine.media3.exoplayer.dash;

import android.net.Uri;
import com.facebook.internal.j0;
import defpackage.x73;
import io.p071bidmachine.media3.common.g0;
import io.p071bidmachine.media3.common.util.a;
import io.p071bidmachine.media3.datasource.q;
import io.p071bidmachine.media3.datasource.x;
import io.p071bidmachine.media3.exoplayer.dash.manifest.c;
import io.p071bidmachine.media3.exoplayer.source.u;
import io.p071bidmachine.media3.exoplayer.upstream.g;
import io.p071bidmachine.media3.exoplayer.upstream.i;
import io.p071bidmachine.media3.exoplayer.upstream.k;
import io.p071bidmachine.media3.exoplayer.upstream.l;
import io.p071bidmachine.media3.exoplayer.upstream.m;
import io.p071bidmachine.media3.exoplayer.upstream.o;
import io.p071bidmachine.media3.exoplayer.util.b;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class e implements g, m {
    public final /* synthetic */ i a;

    public void a() {
        long j;
        i iVar = this.a;
        synchronized (b.b) {
            try {
                j = b.c ? b.d : -9223372036854775807L;
            } catch (Throwable th) {
                throw th;
            }
        }
        iVar.L = j;
        iVar.x(true);
    }

    @Override // io.p071bidmachine.media3.exoplayer.upstream.g
    public void c(i iVar, long j, long j2) {
        o oVar = (o) iVar;
        i iVar2 = this.a;
        long j3 = oVar.a;
        x xVar = oVar.d;
        Uri uri = xVar.c;
        u uVar = new u(xVar.d, j2);
        iVar2.m.getClass();
        iVar2.q.d(uVar, oVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        c cVar = (c) oVar.f;
        c cVar2 = iVar2.H;
        int size = cVar2 == null ? 0 : cVar2.m.size();
        long j4 = cVar.a(0).b;
        int i = 0;
        while (i < size && iVar2.H.a(i).b < j4) {
            i++;
        }
        if (cVar.d) {
            if (size - i > cVar.m.size()) {
                a.A("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j5 = iVar2.N;
                if (j5 == -9223372036854775807L || cVar.h * 1000 > j5) {
                    iVar2.M = 0;
                } else {
                    a.A("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.h + ", " + iVar2.N);
                }
            }
            int i2 = iVar2.M;
            iVar2.M = i2 + 1;
            if (i2 < iVar2.m.r(oVar.c)) {
                iVar2.D.postDelayed(iVar2.v, Math.min((iVar2.M - 1) * 1000, 5000));
                return;
            } else {
                iVar2.C = new a();
                return;
            }
        }
        iVar2.H = cVar;
        iVar2.I = cVar.d & iVar2.I;
        iVar2.J = j - j2;
        iVar2.K = j;
        iVar2.O += i;
        synchronized (iVar2.t) {
            try {
                if (oVar.b.a == iVar2.F) {
                    Uri uri2 = iVar2.H.k;
                    if (uri2 == null) {
                        uri2 = oVar.d.c;
                    }
                    iVar2.F = uri2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c cVar3 = iVar2.H;
        if (!cVar3.d || iVar2.L != -9223372036854775807) {
            iVar2.x(true);
            return;
        }
        j0 j0Var = cVar3.i;
        if (j0Var == null) {
            iVar2.u();
            return;
        }
        String str = (String) j0Var.c;
        if (Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") || Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
            try {
                iVar2.L = io.p071bidmachine.media3.common.util.x.O((String) j0Var.b) - iVar2.K;
                iVar2.x(true);
                return;
            } catch (g0 e) {
                iVar2.w(e);
                return;
            }
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            iVar2.y(j0Var, new g());
            return;
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            iVar2.y(j0Var, new io.p071bidmachine.displays.mapper.a(11));
        } else if (Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") || Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
            iVar2.u();
        } else {
            iVar2.w(new IOException("Unsupported UTC timing scheme"));
        }
    }

    @Override // io.p071bidmachine.media3.exoplayer.upstream.g
    public void d(i iVar, long j, long j2, int i) {
        u uVar;
        o oVar = (o) iVar;
        if (i == 0) {
            long j3 = oVar.a;
            uVar = new u(oVar.b);
        } else {
            long j4 = oVar.a;
            x xVar = oVar.d;
            Uri uri = xVar.c;
            uVar = new u(xVar.d, j2);
        }
        this.a.q.g(uVar, oVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    @Override // io.p071bidmachine.media3.exoplayer.upstream.g
    public void e(i iVar, long j, long j2, boolean z) {
        this.a.v((o) iVar, j2);
    }

    @Override // io.p071bidmachine.media3.exoplayer.upstream.g
    public x73 f(i iVar, long j, long j2, IOException iOException, int i) {
        o oVar = (o) iVar;
        long j3 = oVar.a;
        x xVar = oVar.d;
        Uri uri = xVar.c;
        u uVar = new u(xVar.d, j2);
        int i2 = oVar.c;
        i iVar2 = this.a;
        iVar2.m.getClass();
        long jMin = ((iOException instanceof g0) || (iOException instanceof FileNotFoundException) || (iOException instanceof q) || (iOException instanceof k) || io.p071bidmachine.media3.datasource.i.a(iOException)) ? -9223372036854775807L : Math.min((i - 1) * 1000, 5000);
        x73 x73Var = jMin == -9223372036854775807L ? l.f : new x73(jMin, 0, false);
        iVar2.q.f(uVar, i2, iOException, !x73Var.a());
        return x73Var;
    }

    @Override // io.p071bidmachine.media3.exoplayer.upstream.m
    public void maybeThrowError() throws IOException {
        i iVar = this.a;
        iVar.A.maybeThrowError();
        a aVar = iVar.C;
        if (aVar != null) {
            throw aVar;
        }
    }
}
