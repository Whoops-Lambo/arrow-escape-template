package io.p071bidmachine.media3.exoplayer;

import io.p071bidmachine.media3.common.util.a;
import io.p071bidmachine.media3.common.util.x;
import io.p071bidmachine.media3.exoplayer.upstream.c;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class j {
    public final c a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final long g;
    public final HashMap h;
    public long i;

    public j() {
        c cVar = new c();
        a(1000, 0, "bufferForPlaybackMs", "0");
        a(2000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(50000, 1000, "minBufferMs", "bufferForPlaybackMs");
        a(50000, 2000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(50000, 50000, "maxBufferMs", "minBufferMs");
        a(0, 0, "backBufferDurationMs", "0");
        this.a = cVar;
        long jL = x.L(50000L);
        this.b = jL;
        this.c = jL;
        this.d = x.L(1000L);
        this.e = x.L(2000L);
        this.f = -1;
        this.g = x.L(0L);
        this.h = new HashMap();
        this.i = -1L;
    }

    public static void a(int i, int i2, String str, String str2) {
        a.b(str + " cannot be less than " + str2, i >= i2);
    }

    public final int b() {
        Iterator it = this.h.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((i) it.next()).b;
        }
        return i;
    }

    public final boolean c(f0 f0Var) {
        int i;
        long j = this.c;
        i iVar = (i) this.h.get(f0Var.a);
        iVar.getClass();
        c cVar = this.a;
        synchronized (cVar) {
            i = cVar.d * cVar.b;
        }
        boolean z = i >= b();
        long jMin = this.b;
        float f = f0Var.c;
        if (f > 1.0f) {
            jMin = Math.min(x.w(jMin, f), j);
        }
        long jMax = Math.max(jMin, 500000L);
        long j2 = f0Var.b;
        if (j2 < jMax) {
            iVar.a = !z;
            if (z && j2 < 500000) {
                a.A("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= j || z) {
            iVar.a = false;
        }
        return iVar.a;
    }

    public final void d() {
        boolean zIsEmpty = this.h.isEmpty();
        c cVar = this.a;
        if (!zIsEmpty) {
            cVar.a(b());
            return;
        }
        synchronized (cVar) {
            if (cVar.a) {
                cVar.a(0);
            }
        }
    }
}
