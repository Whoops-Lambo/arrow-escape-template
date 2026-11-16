package io.p071bidmachine.internal;

import android.content.Context;
import defpackage.jc1;
import defpackage.sr0;
import defpackage.wr0;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class h extends Thread {
    public final long a;
    public final sr0 b;
    public final wr0 c;
    public final wr0 d;
    public volatile long e;
    public volatile int f;
    public volatile WeakReference g;
    public e h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(long j) {
        super(jc1.l(j, "bm:s:0:"));
        f fVar = f.j;
        g gVar = g.j;
        g gVar2 = g.k;
        this.a = j;
        this.b = fVar;
        this.c = gVar;
        this.d = gVar2;
    }

    public final String a() {
        long jLongValue = ((Number) this.b.invoke()).longValue();
        return "bm:s:" + this.f + ':' + this.a + ':' + (this.e < this.a ? "" : String.valueOf(this.e - this.a)) + ':' + (jLongValue - this.a);
    }

    public final void c(int i) {
        if (i < this.f) {
            return;
        }
        if (i != 2) {
            this.f = i;
            return;
        }
        this.e = ((Number) this.b.invoke()).longValue();
        this.f = i;
        try {
            interrupt();
        } catch (Throwable unused) {
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (this.f < 2) {
            d();
            try {
                this.c.invoke(200L);
            } catch (InterruptedException unused) {
                if (this.f == 2) {
                    d();
                    this.c.invoke(5000L);
                }
            }
        }
        d();
        try {
            this.c.invoke(5000L);
        } catch (Throwable unused2) {
        }
    }

    public final void d() {
        e eVar;
        boolean z;
        Context context;
        try {
            setName(a());
        } catch (Throwable unused) {
        }
        try {
            WeakReference weakReference = this.g;
            if (weakReference != null && (context = (Context) weakReference.get()) != null) {
                eVar = this.h;
                if (eVar == null) {
                    eVar = (e) this.d.invoke(context);
                    this.h = eVar;
                }
            } else {
                eVar = null;
            }
            if (eVar != null) {
                long jLongValue = this.e;
                if (jLongValue == 0) {
                    jLongValue = ((Number) this.b.invoke()).longValue();
                }
                long j = this.a;
                long j2 = jLongValue - j;
                if (jLongValue != 0) {
                    z = true;
                } else {
                    z = false;
                }
                eVar.a(new d(j, j2, z));
            }
        } catch (Throwable unused2) {
        }
    }
}
