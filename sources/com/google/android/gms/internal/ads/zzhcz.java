package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.C4664b4;
import com.singular.sdk.internal.UserDetailsUtils;
import defpackage.ep0;
import defpackage.et4;
import defpackage.ft4;
import defpackage.fu4;
import defpackage.h50;
import defpackage.ht4;
import defpackage.it4;
import defpackage.jc1;
import defpackage.jt4;
import defpackage.n30;
import defpackage.ns1;
import defpackage.pv1;
import defpackage.rt4;
import defpackage.st4;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class zzhcz<V> extends st4 {
    public static void p(zzhcz zzhczVar, boolean z) {
        it4 it4Var = null;
        while (true) {
            for (rt4 rt4VarL = st4.g.L(zzhczVar); rt4VarL != null; rt4VarL = rt4VarL.b) {
                Thread thread = rt4VarL.a;
                if (thread != null) {
                    rt4VarL.a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                zzhczVar.l();
            }
            zzhczVar.g();
            it4 it4Var2 = it4Var;
            it4 it4VarM = st4.g.M(zzhczVar);
            it4 it4Var3 = it4Var2;
            while (it4VarM != null) {
                it4 it4Var4 = it4VarM.c;
                it4VarM.c = it4Var3;
                it4Var3 = it4VarM;
                it4VarM = it4Var4;
            }
            while (it4Var3 != null) {
                Runnable runnable = it4Var3.a;
                it4Var = it4Var3.c;
                Objects.requireNonNull(runnable);
                if (runnable instanceof ft4) {
                    ft4 ft4Var = (ft4) runnable;
                    zzhczVar = ft4Var.a;
                    if (zzhczVar.a == ft4Var) {
                        if (st4.g.N(zzhczVar, ft4Var, i(ft4Var.b))) {
                            z = false;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = it4Var3.b;
                    Objects.requireNonNull(executor);
                    r(runnable, executor);
                }
                it4Var3 = it4Var;
            }
            return;
        }
    }

    public void g() {
    }

    public void l() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object i(ListenableFuture listenableFuture) {
        Object obj;
        Throwable thC;
        if (listenableFuture instanceof jt4) {
            Object et4Var = ((zzhcz) listenableFuture).a;
            if (et4Var instanceof et4) {
                et4 et4Var2 = (et4) et4Var;
                if (et4Var2.a) {
                    Throwable th = et4Var2.b;
                    et4Var = th != null ? new et4(th, false) : et4.d;
                }
            }
            Objects.requireNonNull(et4Var);
            return et4Var;
        }
        if ((listenableFuture instanceof zzhfm) && (thC = ((zzhfm) listenableFuture).c()) != null) {
            return new ht4(thC);
        }
        boolean zIsCancelled = listenableFuture.isCancelled();
        boolean z = true;
        if ((!st4.f) && zIsCancelled) {
            et4 et4Var3 = et4.d;
            Objects.requireNonNull(et4Var3);
            return et4Var3;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    try {
                        obj = listenableFuture.get();
                        break;
                    } catch (Error | Exception e) {
                        e = e;
                        return new ht4(e);
                    } catch (CancellationException e2) {
                        return !zIsCancelled ? new ht4(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(listenableFuture)), e2)) : new et4(e2, false);
                    } catch (ExecutionException e3) {
                        return zIsCancelled ? new et4(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(listenableFuture)), e3), false) : new ht4(e3.getCause());
                    }
                } catch (InterruptedException unused) {
                    z2 = z;
                } catch (Throwable th2) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            } catch (Error e4) {
                e = e4;
                return new ht4(e);
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        if (!zIsCancelled) {
            return obj == null ? st4.d : obj;
        }
        String strValueOf = String.valueOf(listenableFuture);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 84);
        sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
        sb.append(strValueOf);
        return new et4(new IllegalArgumentException(sb.toString()), false);
    }

    public static Object j(Object obj) throws ExecutionException {
        if (obj instanceof et4) {
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(((et4) obj).b);
            throw cancellationException;
        }
        if (obj instanceof ht4) {
            throw new ExecutionException(((ht4) obj).a);
        }
        if (obj == st4.d) {
            return null;
        }
        return obj;
    }

    public static boolean k(Object obj) {
        return !(obj instanceof ft4);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
        it4 it4Var;
        it4 it4Var2 = it4.d;
        zzgvz.h(runnable, "Runnable was null.");
        zzgvz.h(executor, "Executor was null.");
        if (!isDone() && (it4Var = this.b) != it4Var2) {
            it4 it4Var3 = new it4(runnable, executor);
            do {
                it4Var3.c = it4Var;
                if (st4.g.K(this, it4Var, it4Var3)) {
                    return;
                } else {
                    it4Var = this.b;
                }
            } while (it4Var != it4Var2);
        }
        r(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzhfm
    public final Throwable c() {
        if (!(this instanceof jt4)) {
            return null;
        }
        Object obj = this.a;
        if (obj instanceof ht4) {
            return ((ht4) obj).a;
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        et4 et4Var;
        Object obj = this.a;
        if (!(obj instanceof ft4) && !(obj == null)) {
            return false;
        }
        if (st4.f) {
            et4Var = new et4(new CancellationException("Future.cancel() was called."), z);
        } else {
            et4Var = z ? et4.c : et4.d;
            Objects.requireNonNull(et4Var);
        }
        boolean z2 = false;
        while (true) {
            if (st4.g.N(this, obj, et4Var)) {
                p(this, z);
                if (obj instanceof ft4) {
                    ListenableFuture listenableFuture = ((ft4) obj).b;
                    if (listenableFuture instanceof jt4) {
                        this = (zzhcz) listenableFuture;
                        obj = this.a;
                        if (!(obj == null) && !(obj instanceof ft4)) {
                            return true;
                        }
                        z2 = true;
                    } else {
                        listenableFuture.cancel(z);
                    }
                }
                return true;
            }
            obj = this.a;
            if (k(obj)) {
                return z2;
            }
        }
    }

    public boolean e(Object obj) {
        if (obj == null) {
            obj = st4.d;
        }
        if (!st4.g.N(this, null, obj)) {
            return false;
        }
        p(this, false);
        return true;
    }

    public boolean f(Throwable th) {
        if (!st4.g.N(this, null, new ht4(th))) {
            return false;
        }
        p(this, false);
        return true;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long j2;
        boolean z;
        rt4 rt4Var = rt4.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.a;
        if ((obj != null) && k(obj)) {
            return j(obj);
        }
        long j3 = 0;
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            rt4 rt4Var2 = this.c;
            if (rt4Var2 != rt4Var) {
                rt4 rt4Var3 = new rt4();
                z = true;
                while (true) {
                    ns1 ns1Var = st4.g;
                    ns1Var.H(rt4Var3, rt4Var2);
                    if (ns1Var.J(this, rt4Var2, rt4Var3)) {
                        j2 = j3;
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                d(rt4Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.a;
                            if ((obj2 != null) && k(obj2)) {
                                return j(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        d(rt4Var3);
                        break;
                    }
                    long j4 = j3;
                    rt4Var2 = this.c;
                    if (rt4Var2 != rt4Var) {
                        j3 = j4;
                    }
                }
            }
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            return j(obj3);
        }
        j2 = 0;
        z = true;
        while (nanos > j2) {
            Object obj4 = this.a;
            if ((obj4 != null ? z : false) && k(obj4)) {
                return j(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String lowerCase2 = timeUnit.toString().toLowerCase(locale);
        StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 8 + String.valueOf(lowerCase2).length());
        n30.x(sb, "Waited ", j, " ");
        sb.append(lowerCase2);
        String string3 = sb.toString();
        if (nanos + 1000 < j2) {
            String strConcat = string3.concat(" (plus ");
            long j5 = -nanos;
            long jConvert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
            long nanos2 = j5 - timeUnit.toNanos(jConvert);
            boolean z2 = (jConvert == j2 || nanos2 > 1000) ? z : false;
            if (jConvert > j2) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(jConvert).length() + strConcat.length() + 1 + String.valueOf(lowerCase).length());
                n30.x(sb2, strConcat, jConvert, " ");
                sb2.append(lowerCase);
                String string4 = sb2.toString();
                if (z2) {
                    string4 = string4.concat(",");
                }
                strConcat = string4.concat(" ");
            }
            if (z2) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(nanos2).length() + strConcat.length() + 13);
                sb3.append(strConcat);
                sb3.append(nanos2);
                sb3.append(" nanoseconds ");
                strConcat = sb3.toString();
            }
            string3 = strConcat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(string3.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(jc1.o(string3, " for ", new StringBuilder(string3.length() + 5 + String.valueOf(string).length()), string));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String h() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder(String.valueOf(delay).length() + 21);
        sb.append("remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.a instanceof et4;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.a;
        return (obj != null) & k(obj);
    }

    public final boolean m() {
        Object obj = this.a;
        return (obj instanceof et4) && ((et4) obj).a;
    }

    public final void o(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(m());
        }
    }

    public final void q(StringBuilder sb) {
        V v;
        boolean z = false;
        while (true) {
            try {
                try {
                    v = get();
                    break;
                } catch (CancellationException unused) {
                    sb.append("CANCELLED");
                    return;
                } catch (ExecutionException e) {
                    sb.append("FAILURE, cause=[");
                    sb.append(e.getCause());
                    sb.append(C4664b4.j.e);
                    return;
                } catch (Exception e2) {
                    sb.append("UNKNOWN, cause=[");
                    sb.append(e2.getClass());
                    sb.append(" thrown from get()]");
                    return;
                }
            } catch (InterruptedException unused2) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        if (v == null) {
            sb.append("null");
        } else if (v == this) {
            sb.append("this future");
        } else {
            sb.append(v.getClass().getName());
            sb.append(UserDetailsUtils.UserDetailsLiterals.AT);
            sb.append(Integer.toHexString(System.identityHashCode(v)));
        }
        sb.append(C4664b4.j.e);
    }

    public String toString() {
        String strConcat;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            q(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.a;
            if (obj instanceof ft4) {
                sb.append(", setFuture=[");
                ListenableFuture listenableFuture = ((ft4) obj).b;
                try {
                    if (listenableFuture == this) {
                        sb.append("this future");
                    } else {
                        sb.append(listenableFuture);
                    }
                } catch (Throwable th) {
                    if ((th instanceof Error) && !(th instanceof StackOverflowError)) {
                        throw th;
                    }
                    sb.append("Exception thrown from implementation: ");
                    sb.append(th.getClass());
                }
                sb.append(C4664b4.j.e);
            } else {
                try {
                    strConcat = h();
                    if (ep0.Q(strConcat)) {
                        strConcat = null;
                    }
                } catch (Throwable th2) {
                    if ((th2 instanceof Error) && !(th2 instanceof StackOverflowError)) {
                        throw th2;
                    }
                    strConcat = "Exception thrown from implementation: ".concat(String.valueOf(th2.getClass()));
                }
                if (strConcat != null) {
                    h50.x(", info=[", strConcat, sb, C4664b4.j.e);
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                q(sb);
            }
        }
        sb.append(C4664b4.j.e);
        return sb.toString();
    }

    public static void r(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            Logger loggerB = st4.e.b();
            Level level = Level.SEVERE;
            String strValueOf = String.valueOf(runnable);
            String strValueOf2 = String.valueOf(executor);
            loggerB.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", pv1.p(new StringBuilder(strValueOf.length() + 57 + strValueOf2.length()), "RuntimeException while executing runnable ", strValueOf, " with executor ", strValueOf2), (Throwable) e);
        }
    }

    public final void n(ListenableFuture listenableFuture) {
        ht4 ht4Var;
        listenableFuture.getClass();
        Object obj = this.a;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (st4.g.N(this, null, i(listenableFuture))) {
                    p(this, false);
                    return;
                }
                return;
            }
            ft4 ft4Var = new ft4(this, listenableFuture);
            if (st4.g.N(this, null, ft4Var)) {
                try {
                    listenableFuture.addListener(ft4Var, fu4.a);
                    return;
                } catch (Throwable th) {
                    try {
                        ht4Var = new ht4(th);
                    } catch (Error | Exception unused) {
                        ht4Var = ht4.b;
                    }
                    st4.g.N(this, ft4Var, ht4Var);
                    return;
                }
            }
            obj = this.a;
        }
        if (obj instanceof et4) {
            listenableFuture.cancel(((et4) obj).a);
        }
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException {
        Object obj;
        rt4 rt4Var = rt4.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if ((obj2 != null) & k(obj2)) {
                return j(obj2);
            }
            rt4 rt4Var2 = this.c;
            if (rt4Var2 != rt4Var) {
                rt4 rt4Var3 = new rt4();
                do {
                    ns1 ns1Var = st4.g;
                    ns1Var.H(rt4Var3, rt4Var2);
                    if (ns1Var.J(this, rt4Var2, rt4Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                d(rt4Var3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & k(obj)));
                        return j(obj);
                    }
                    rt4Var2 = this.c;
                } while (rt4Var2 != rt4Var);
            }
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            return j(obj3);
        }
        throw new InterruptedException();
    }
}
