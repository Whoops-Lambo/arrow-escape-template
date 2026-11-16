package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class su extends w4 {
    public static final ld1 o = new ld1(0, su.class);
    public u21 l;
    public final boolean m;
    public ru n;

    public final void v(ListenableFuture listenableFuture) {
        try {
            boolean z = false;
            if (listenableFuture.isCancelled()) {
                this.l = null;
                cancel(false);
            } else {
                while (true) {
                    try {
                        try {
                            listenableFuture.get();
                            break;
                        } catch (ExecutionException e) {
                            s(e.getCause());
                        } catch (Throwable th) {
                            s(th);
                        }
                    } catch (InterruptedException unused) {
                        z = true;
                    } catch (Throwable th2) {
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                        throw th2;
                    }
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
            r(null);
        } catch (Throwable th3) {
            r(null);
            throw th3;
        }
    }

    @Override // defpackage.c1
    public final void d() {
        u21 u21Var = this.l;
        this.l = null;
        this.n = null;
        if ((this.a instanceof n0) && (u21Var != null)) {
            boolean zQ = q();
            d03 it = u21Var.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zQ);
            }
        }
    }

    @Override // defpackage.c1
    public final void j() {
        ru ruVar = this.n;
        if (ruVar != null) {
            ruVar.d();
        }
    }

    @Override // defpackage.c1
    public final String k() {
        u21 u21Var = this.l;
        if (u21Var == null) {
            return super.k();
        }
        return "futures=" + u21Var;
    }

    public final void r(u21 u21Var) {
        int iJ = w4.j.j(this);
        fs1.n("Less than 0 remaining futures", iJ >= 0);
        if (iJ == 0) {
            if (u21Var != null) {
                d03 it = u21Var.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        boolean z = false;
                        while (true) {
                            try {
                                future.get();
                                break;
                            } catch (InterruptedException unused) {
                                z = true;
                            } catch (Throwable th) {
                                if (z) {
                                    Thread.currentThread().interrupt();
                                }
                                throw th;
                            }
                        }
                        if (z) {
                            try {
                                Thread.currentThread().interrupt();
                            } catch (ExecutionException e) {
                                s(e.getCause());
                            } catch (Throwable th2) {
                                s(th2);
                            }
                        }
                    }
                }
            }
            this.h = null;
            ru ruVar = this.n;
            if (ruVar != null) {
                try {
                    ruVar.f.execute(ruVar);
                } catch (RejectedExecutionException e2) {
                    ruVar.g.n(e2);
                }
            }
            this.l = null;
        }
    }

    public final void u() {
        Objects.requireNonNull(this.l);
        if (this.l.isEmpty()) {
            ru ruVar = this.n;
            if (ruVar != null) {
                try {
                    ruVar.f.execute(ruVar);
                    return;
                } catch (RejectedExecutionException e) {
                    ruVar.g.n(e);
                    return;
                }
            }
            return;
        }
        boolean z = this.m;
        gc0 gc0Var = gc0.a;
        if (!z) {
            q4 q4Var = new q4(4, this, (Object) null);
            d03 it = this.l.iterator();
            while (it.hasNext()) {
                ListenableFuture listenableFuture = (ListenableFuture) it.next();
                if (listenableFuture.isDone()) {
                    r(null);
                } else {
                    listenableFuture.addListener(q4Var, gc0Var);
                }
            }
            return;
        }
        d03 it2 = this.l.iterator();
        int i = 0;
        while (it2.hasNext()) {
            ListenableFuture listenableFuture2 = (ListenableFuture) it2.next();
            int i2 = i + 1;
            if (listenableFuture2.isDone()) {
                v(listenableFuture2);
            } else {
                listenableFuture2.addListener(new q4(this, i, listenableFuture2), gc0Var);
            }
            i = i2;
        }
    }

    public su(u21 u21Var, boolean z) {
        int size = u21Var.size();
        this.h = null;
        this.i = size;
        this.l = u21Var;
        this.m = z;
    }

    public final void s(Throwable th) {
        th.getClass();
        String str = "Input Future failed with Error";
        if (this.m && !n(th)) {
            Set set = this.h;
            if (set == null) {
                Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                setNewSetFromMap.getClass();
                if (!(this.a instanceof n0)) {
                    Throwable thP = p();
                    Objects.requireNonNull(thP);
                    while (thP != null && setNewSetFromMap.add(thP)) {
                        thP = thP.getCause();
                    }
                }
                w4.j.i(this, setNewSetFromMap);
                set = this.h;
                Objects.requireNonNull(set);
            }
            Throwable cause = th;
            while (true) {
                if (cause != null) {
                    if (!set.add(cause)) {
                        break;
                    } else {
                        cause = cause.getCause();
                    }
                } else {
                    if (!(th instanceof Error)) {
                        str = "Got more than one input Future failure. Logging failures after the first";
                    }
                    o.a().log(Level.SEVERE, str, th);
                    return;
                }
            }
        }
        if (th instanceof Error) {
            o.a().log(Level.SEVERE, "Input Future failed with Error", th);
        }
    }
}
