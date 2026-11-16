package io.p071bidmachine.media3.exoplayer.upstream;

import android.os.Looper;
import android.os.SystemClock;
import com.facebook.ads.f;
import defpackage.x73;
import io.p071bidmachine.media3.common.util.w;
import io.p071bidmachine.media3.common.util.x;
import io.p071bidmachine.media3.exoplayer.analytics.d;
import io.p071bidmachine.media3.exoplayer.util.a;
import java.io.IOException;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class l implements m {
    public static final x73 d = new x73(-9223372036854775807L, 0, false);
    public static final x73 e = new x73(-9223372036854775807L, 2, false);
    public static final x73 f = new x73(-9223372036854775807L, 3, false);
    public final a a;
    public h b;
    public IOException c;

    /* JADX WARN: Illegal instructions before constructor call */
    public l(String str) {
        String strConcat = "ExoPlayer:Loader:".concat(str);
        int i = x.a;
        this(new a(Executors.newSingleThreadExecutor(new w(strConcat)), new d(17)));
    }

    public final void a() {
        h hVar = this.b;
        io.p071bidmachine.media3.common.util.a.j(hVar);
        hVar.a(false);
    }

    public final boolean b() {
        return this.c != null;
    }

    public final boolean c() {
        return this.b != null;
    }

    public final void d(j jVar) {
        h hVar = this.b;
        if (hVar != null) {
            hVar.a(true);
        }
        a aVar = this.a;
        if (jVar != null) {
            aVar.execute(new f(jVar, 9));
        }
        aVar.b.accept(aVar.a);
    }

    @Override // io.p071bidmachine.media3.exoplayer.upstream.m
    public final void maybeThrowError() throws IOException {
        IOException iOException = this.c;
        if (iOException != null) {
            throw iOException;
        }
        h hVar = this.b;
        if (hVar != null) {
            int i = hVar.a;
            IOException iOException2 = hVar.e;
            if (iOException2 != null && hVar.f > i) {
                throw iOException2;
            }
        }
    }

    public final void e(i iVar, g gVar, int i) {
        boolean z;
        Looper looperMyLooper = Looper.myLooper();
        io.p071bidmachine.media3.common.util.a.j(looperMyLooper);
        this.c = null;
        h hVar = new h(this, looperMyLooper, iVar, gVar, i, SystemClock.elapsedRealtime());
        if (this.b == null) {
            z = true;
        } else {
            z = false;
        }
        io.p071bidmachine.media3.common.util.a.i(z);
        this.b = hVar;
        hVar.c();
    }

    public l(a aVar) {
        this.a = aVar;
    }
}
