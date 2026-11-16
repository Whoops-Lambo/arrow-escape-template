package defpackage;

import com.ironsource.C4664b4;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class q71 extends AtomicReference implements Runnable {
    public static final w b;
    public static final w c;
    public static final w d;
    public static final w e;
    public final /* synthetic */ int a;

    public abstract void a(Throwable th);

    public abstract void c(Object obj);

    public abstract boolean f();

    public abstract Object g();

    public abstract String h();

    public abstract Object j();

    public abstract String n();

    public abstract boolean o();

    public abstract void q(Object obj);

    public abstract void r(Throwable th);

    static {
        int i = 1;
        b = new w(i);
        c = new w(i);
        int i2 = 12;
        d = new w(i2);
        e = new w(i2);
    }

    public /* synthetic */ q71(int i) {
        this.a = i;
    }

    public void d() {
        w wVar = c;
        w wVar2 = b;
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            p71 p71Var = new p71(this);
            p71.a(p71Var, Thread.currentThread());
            if (compareAndSet(runnable, p71Var)) {
                try {
                    ((Thread) runnable).interrupt();
                } finally {
                    if (((Runnable) getAndSet(wVar2)) == wVar) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objG = null;
        switch (this.a) {
            case 0:
                Thread threadCurrentThread = Thread.currentThread();
                if (compareAndSet(null, threadCurrentThread)) {
                    boolean zF = f();
                    w wVar = b;
                    if (!zF) {
                        try {
                            objG = g();
                            break;
                        } catch (Throwable th) {
                            try {
                                if (th instanceof InterruptedException) {
                                    Thread.currentThread().interrupt();
                                    break;
                                }
                                if (!compareAndSet(threadCurrentThread, wVar)) {
                                    i(threadCurrentThread);
                                }
                                if (zF) {
                                    return;
                                }
                                a(th);
                                return;
                            } catch (Throwable th2) {
                                if (!compareAndSet(threadCurrentThread, wVar)) {
                                    i(threadCurrentThread);
                                }
                                if (!zF) {
                                    c(null);
                                }
                                throw th2;
                            }
                        }
                    }
                    if (!compareAndSet(threadCurrentThread, wVar)) {
                        i(threadCurrentThread);
                    }
                    if (zF) {
                        return;
                    }
                    c(objG);
                    return;
                }
                return;
            default:
                Thread threadCurrentThread2 = Thread.currentThread();
                if (compareAndSet(null, threadCurrentThread2)) {
                    boolean zO = o();
                    w wVar2 = d;
                    if (!zO) {
                        try {
                            objG = j();
                            break;
                        } catch (Throwable th3) {
                            try {
                                if (th3 instanceof InterruptedException) {
                                    Thread.currentThread().interrupt();
                                    break;
                                }
                                if (!compareAndSet(threadCurrentThread2, wVar2)) {
                                    k(threadCurrentThread2);
                                }
                                r(th3);
                                return;
                            } catch (Throwable th4) {
                                if (!compareAndSet(threadCurrentThread2, wVar2)) {
                                    k(threadCurrentThread2);
                                }
                                q(null);
                                throw th4;
                            }
                        }
                    }
                    if (!compareAndSet(threadCurrentThread2, wVar2)) {
                        k(threadCurrentThread2);
                    }
                    if (zO) {
                        return;
                    }
                    q(objG);
                    return;
                }
                return;
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String strO = "running=[NOT STARTED YET]";
        switch (this.a) {
            case 0:
                Runnable runnable = (Runnable) get();
                if (runnable == b) {
                    strO = "running=[DONE]";
                } else if (runnable instanceof p71) {
                    strO = "running=[INTERRUPTED]";
                } else if (runnable instanceof Thread) {
                    strO = "running=[RUNNING ON " + ((Thread) runnable).getName() + C4664b4.j.e;
                }
                StringBuilder sbQ = h50.q(strO, ", ");
                sbQ.append(h());
                return sbQ.toString();
            default:
                Runnable runnable2 = (Runnable) get();
                if (runnable2 == d) {
                    strO = "running=[DONE]";
                } else if (runnable2 instanceof ou4) {
                    strO = "running=[INTERRUPTED]";
                } else if (runnable2 instanceof Thread) {
                    String name = ((Thread) runnable2).getName();
                    strO = jc1.o("running=[RUNNING ON ", name, new StringBuilder(String.valueOf(name).length() + 21), C4664b4.j.e);
                }
                String strN = n();
                return jc1.o(strO, ", ", new StringBuilder(strO.length() + 2 + String.valueOf(strN).length()), strN);
        }
    }

    public void x() {
        w wVar = e;
        w wVar2 = d;
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            ou4 ou4Var = new ou4(this);
            ou4Var.a(Thread.currentThread());
            if (compareAndSet(runnable, ou4Var)) {
                try {
                    ((Thread) runnable).interrupt();
                    if (((Runnable) getAndSet(wVar2)) == wVar) {
                    }
                } finally {
                    if (((Runnable) getAndSet(wVar2)) == wVar) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    public void i(Thread thread) {
        Runnable runnable = (Runnable) get();
        p71 p71Var = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof p71;
            w wVar = c;
            if (!z2 && runnable != wVar) {
                break;
            }
            if (z2) {
                p71Var = (p71) runnable;
            }
            i++;
            if (i > 1000) {
                if (runnable == wVar || compareAndSet(runnable, wVar)) {
                    if (!Thread.interrupted() && !z) {
                        z = false;
                    } else {
                        z = true;
                    }
                    LockSupport.park(p71Var);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    public void k(Thread thread) {
        Runnable runnable = (Runnable) get();
        ou4 ou4Var = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof ou4;
            w wVar = e;
            if (!z2) {
                if (runnable != wVar) {
                    break;
                }
            } else {
                ou4Var = (ou4) runnable;
            }
            i++;
            if (i > 1000) {
                if (runnable == wVar || compareAndSet(runnable, wVar)) {
                    if (Thread.interrupted() || z) {
                        z = true;
                    } else {
                        z = false;
                    }
                    LockSupport.park(ou4Var);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }
}
