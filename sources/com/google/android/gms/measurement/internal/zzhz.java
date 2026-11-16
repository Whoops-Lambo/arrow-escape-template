package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import defpackage.e32;
import defpackage.i05;
import defpackage.ww4;
import defpackage.xw4;
import defpackage.yw4;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhz extends i05 {
    public static final AtomicLong k = new AtomicLong(Long.MIN_VALUE);
    public yw4 c;
    public yw4 d;
    public final PriorityBlockingQueue e;
    public final LinkedBlockingQueue f;
    public final ww4 g;
    public final ww4 h;
    public final Object i;
    public final Semaphore j;

    @Override // defpackage.i05
    public final boolean u() {
        return false;
    }

    public final Object D(AtomicReference atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            zzhz zzhzVar = ((zzic) this.a).g;
            zzic.l(zzhzVar);
            zzhzVar.C(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                zzgu zzguVar = ((zzic) this.a).f;
                zzic.l(zzguVar);
                zzgs zzgsVar = zzguVar.i;
                StringBuilder sb = new StringBuilder(str.length() + 24);
                sb.append("Interrupted waiting for ");
                sb.append(str);
                zzgsVar.a(sb.toString());
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            zzgu zzguVar2 = ((zzic) this.a).f;
            zzic.l(zzguVar2);
            zzguVar2.i.a("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final void G(xw4 xw4Var) {
        synchronized (this.i) {
            try {
                PriorityBlockingQueue priorityBlockingQueue = this.e;
                priorityBlockingQueue.add(xw4Var);
                yw4 yw4Var = this.c;
                if (yw4Var == null) {
                    yw4 yw4Var2 = new yw4(this, "Measurement Worker", priorityBlockingQueue);
                    this.c = yw4Var2;
                    yw4Var2.setUncaughtExceptionHandler(this.g);
                    this.c.start();
                } else {
                    Object obj = yw4Var.a;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public zzhz(zzic zzicVar) {
        super(zzicVar);
        this.i = new Object();
        this.j = new Semaphore(2);
        this.e = new PriorityBlockingQueue();
        this.f = new LinkedBlockingQueue();
        this.g = new ww4(this, "Thread death: Uncaught exception on worker thread");
        this.h = new ww4(this, "Thread death: Uncaught exception on network thread");
    }

    public final xw4 A(Callable callable) {
        v();
        Preconditions.checkNotNull(callable);
        xw4 xw4Var = new xw4(this, callable, false);
        if (Thread.currentThread() == this.c) {
            if (!this.e.isEmpty()) {
                zzgu zzguVar = ((zzic) this.a).f;
                zzic.l(zzguVar);
                zzguVar.i.a("Callable skipped the worker queue.");
            }
            xw4Var.run();
            return xw4Var;
        }
        G(xw4Var);
        return xw4Var;
    }

    public final xw4 B(Callable callable) {
        v();
        Preconditions.checkNotNull(callable);
        xw4 xw4Var = new xw4(this, callable, true);
        if (Thread.currentThread() == this.c) {
            xw4Var.run();
            return xw4Var;
        }
        G(xw4Var);
        return xw4Var;
    }

    public final void C(Runnable runnable) {
        v();
        Preconditions.checkNotNull(runnable);
        G(new xw4(this, runnable, false, "Task exception on worker thread"));
    }

    public final void E(Runnable runnable) {
        v();
        Preconditions.checkNotNull(runnable);
        G(new xw4(this, runnable, true, "Task exception on worker thread"));
    }

    public final void F(Runnable runnable) {
        v();
        Preconditions.checkNotNull(runnable);
        xw4 xw4Var = new xw4(this, runnable, false, "Task exception on network thread");
        synchronized (this.i) {
            try {
                LinkedBlockingQueue linkedBlockingQueue = this.f;
                linkedBlockingQueue.add(xw4Var);
                yw4 yw4Var = this.d;
                if (yw4Var == null) {
                    yw4 yw4Var2 = new yw4(this, "Measurement Network", linkedBlockingQueue);
                    this.d = yw4Var2;
                    yw4Var2.setUncaughtExceptionHandler(this.h);
                    this.d.start();
                } else {
                    Object obj = yw4Var.a;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.wt0
    public final void t() {
        if (Thread.currentThread() == this.c) {
            return;
        }
        e32.i("Call expected from worker thread");
    }

    public final void x() {
        if (Thread.currentThread() == this.d) {
            return;
        }
        e32.i("Call expected from network thread");
    }

    public final void y() {
        if (Thread.currentThread() != this.c) {
            return;
        }
        e32.i("Call not expected from worker thread");
    }

    public final boolean z() {
        if (Thread.currentThread() == this.c) {
            return true;
        }
        return false;
    }
}
