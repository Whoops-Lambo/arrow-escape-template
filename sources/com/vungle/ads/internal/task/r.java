package com.vungle.ads.internal.task;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import defpackage.s71;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class r implements g {
    public static final Handler g = new Handler(Looper.getMainLooper());
    public static final String h = "r";
    public final d a;
    public final Executor b;
    public final m c;
    public final CopyOnWriteArrayList d;
    public final q e;
    public long f;

    public final synchronized void a(e eVar) {
        try {
            eVar.getClass();
            e eVarA = eVar.a();
            if (eVarA != null) {
                String strD = eVarA.d();
                long jB = eVarA.b();
                eVarA.g();
                if (eVarA.f()) {
                    for (p pVar : this.d) {
                        e eVarA2 = pVar.a();
                        if (s71.b(eVarA2 != null ? eVarA2.d() : null, strD)) {
                            boolean z = u.a;
                            String str = h;
                            str.getClass();
                            t.a(str, "replacing pending job with new " + strD);
                            this.d.remove(pVar);
                        }
                    }
                }
                this.d.add(new p(SystemClock.uptimeMillis() + jB, eVarA));
                a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public r(d dVar, com.vungle.ads.internal.executor.j jVar, h hVar) {
        dVar.getClass();
        jVar.getClass();
        this.a = dVar;
        this.b = jVar;
        this.c = hVar;
        this.f = Long.MAX_VALUE;
        this.d = new CopyOnWriteArrayList();
        this.e = new q(new WeakReference(this));
    }

    public final synchronized void a() {
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            long jMin = Long.MAX_VALUE;
            for (p pVar : this.d) {
                long j = pVar.a;
                if (jUptimeMillis >= j) {
                    this.d.remove(pVar);
                    e eVar = pVar.b;
                    if (eVar != null) {
                        this.b.execute(new f(eVar, this.a, this, this.c));
                    }
                } else {
                    jMin = Math.min(jMin, j);
                }
            }
            if (jMin != Long.MAX_VALUE && jMin != this.f) {
                Handler handler = g;
                handler.removeCallbacks(this.e);
                handler.postAtTime(this.e, h, jMin);
            }
            this.f = jMin;
        } catch (Throwable th) {
            throw th;
        }
    }
}
