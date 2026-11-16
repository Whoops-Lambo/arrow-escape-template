package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import defpackage.ll4;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzghi implements zzghg {
    public final Executor a;
    public final PriorityQueue b = new PriorityQueue();

    @Override // com.google.android.gms.internal.ads.zzghg
    public final void a(long j, Runnable runnable) {
        if (j <= 0) {
            this.a.execute(runnable);
            return;
        }
        ll4 ll4Var = new ll4(SystemClock.elapsedRealtime() + j, runnable);
        PriorityQueue priorityQueue = this.b;
        synchronized (priorityQueue) {
            priorityQueue.add(ll4Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzghg
    public final void zzb() {
        PriorityQueue priorityQueue = this.b;
        synchronized (priorityQueue) {
            try {
                if (priorityQueue.isEmpty()) {
                    return;
                }
                PriorityQueue priorityQueue2 = new PriorityQueue();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                for (ll4 ll4Var = (ll4) priorityQueue.peek(); ll4Var != null && ll4Var.b <= jElapsedRealtime; ll4Var = (ll4) priorityQueue.peek()) {
                    priorityQueue2.add(ll4Var);
                }
                Iterator it = priorityQueue2.iterator();
                while (it.hasNext()) {
                    try {
                        this.a.execute(((ll4) it.next()).a);
                    } catch (RuntimeException unused) {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public zzghi(Executor executor) {
        this.a = executor;
    }
}
