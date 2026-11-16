package com.mbridge.msdk.tracker.network;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class n implements Runnable {
    private final BlockingQueue<t<?>> a;
    private final m b;
    private final b c;
    private final w d;
    private volatile boolean e = false;

    private void a() throws InterruptedException {
        b(this.a.take());
    }

    @Override // java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                c0.c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public n(BlockingQueue<t<?>> blockingQueue, m mVar, b bVar, w wVar) {
        this.a = blockingQueue;
        this.b = mVar;
        this.c = bVar;
        this.d = wVar;
    }

    public void b(t<?> tVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        tVar.a(3);
        try {
            try {
                try {
                    tVar.a("network-queue-take");
                    if (tVar.v()) {
                        tVar.c("network-discard-cancelled");
                        tVar.x();
                        return;
                    }
                    if (tVar.y()) {
                        a(tVar);
                    }
                    q qVarA = this.b.a(tVar);
                    tVar.a("network-http-complete");
                    if (qVarA.e && tVar.u()) {
                        tVar.c("not-modified");
                        tVar.x();
                        return;
                    }
                    v<?> vVarA = tVar.a(qVarA);
                    tVar.a("network-parse-complete");
                    if (tVar.z() && vVarA.b != null) {
                        this.c.a(tVar.e(), vVarA.b);
                        tVar.a("network-cache-written");
                    }
                    tVar.w();
                    this.d.a(tVar, vVarA);
                    tVar.a(vVarA);
                } catch (b0 e) {
                    e.a(SystemClock.elapsedRealtime() - jElapsedRealtime);
                    a(tVar, e);
                    tVar.x();
                }
            } catch (Exception e2) {
                c0.a(e2, "Unhandled exception %s", e2.toString());
                a0 a0Var = new a0(e2);
                a0Var.a(SystemClock.elapsedRealtime() - jElapsedRealtime);
                this.d.a(tVar, a0Var);
                tVar.x();
            }
        } finally {
            tVar.a(4);
        }
    }

    private void a(t<?> tVar) {
        TrafficStats.setThreadStatsTag(tVar.s());
    }

    private void a(t<?> tVar, b0 b0Var) {
        this.d.a(tVar, tVar.c(b0Var));
    }
}
