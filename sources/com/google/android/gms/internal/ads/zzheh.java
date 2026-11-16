package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ar4;
import defpackage.bt4;
import defpackage.bu4;
import defpackage.ct4;
import defpackage.dt4;
import defpackage.e32;
import defpackage.fu4;
import defpackage.l24;
import defpackage.lu4;
import defpackage.mu4;
import defpackage.nu4;
import defpackage.ut4;
import defpackage.vt4;
import defpackage.vu4;
import defpackage.wt4;
import defpackage.wu4;
import defpackage.xu4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzheh {
    public static nu4 a(Object obj) {
        return obj == null ? nu4.b : new nu4(obj);
    }

    public static xu4 c(Executor executor, Callable callable) {
        xu4 xu4Var = new xu4(callable);
        executor.execute(xu4Var);
        return xu4Var;
    }

    public static xu4 d(zzhdn zzhdnVar, Executor executor) {
        xu4 xu4Var = new xu4();
        xu4Var.h = new wu4(xu4Var, zzhdnVar);
        executor.execute(xu4Var);
        return xu4Var;
    }

    public static ct4 e(ListenableFuture listenableFuture, Class cls, zzgvq zzgvqVar, Executor executor) {
        int i = dt4.k;
        ct4 ct4Var = new ct4(listenableFuture, cls, zzgvqVar);
        listenableFuture.addListener(ct4Var, zzhey.a(executor, ct4Var));
        return ct4Var;
    }

    public static bt4 f(ListenableFuture listenableFuture, Class cls, zzhdo zzhdoVar, Executor executor) {
        int i = dt4.k;
        bt4 bt4Var = new bt4(listenableFuture, cls, zzhdoVar);
        listenableFuture.addListener(bt4Var, zzhey.a(executor, bt4Var));
        return bt4Var;
    }

    public static ut4 h(ListenableFuture listenableFuture, zzhdo zzhdoVar, Executor executor) {
        int i = wt4.j;
        ut4 ut4Var = new ut4(listenableFuture, zzhdoVar);
        listenableFuture.addListener(ut4Var, zzhey.a(executor, ut4Var));
        return ut4Var;
    }

    public static vt4 i(ListenableFuture listenableFuture, zzgvq zzgvqVar, Executor executor) {
        int i = wt4.j;
        vt4 vt4Var = new vt4(listenableFuture, zzgvqVar);
        listenableFuture.addListener(vt4Var, zzhey.a(executor, vt4Var));
        return vt4Var;
    }

    public static bu4 j(ArrayList arrayList) {
        return new bu4(zzgzb.B(arrayList), true);
    }

    public static zzhef k(Iterable iterable) {
        ar4 ar4Var = zzgzb.b;
        iterable.getClass();
        return new zzhef(zzgzb.B((Collection) iterable), true);
    }

    public static mu4 b(Throwable th) {
        th.getClass();
        mu4 mu4Var = new mu4();
        mu4Var.f(th);
        return mu4Var;
    }

    public static ListenableFuture g(ListenableFuture listenableFuture, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (listenableFuture.isDone()) {
            return listenableFuture;
        }
        vu4 vu4Var = new vu4();
        vu4Var.h = listenableFuture;
        l24 l24Var = new l24(2);
        l24Var.b = vu4Var;
        vu4Var.i = scheduledExecutorService.schedule(l24Var, j, timeUnit);
        listenableFuture.addListener(l24Var, fu4.a);
        return vu4Var;
    }

    public static ListenableFuture l(ListenableFuture listenableFuture) {
        if (listenableFuture.isDone()) {
            return listenableFuture;
        }
        lu4 lu4Var = new lu4();
        lu4Var.h = listenableFuture;
        listenableFuture.addListener(lu4Var, fu4.a);
        return lu4Var;
    }

    public static Object m(Future future) {
        if (future.isDone()) {
            return zzhfl.a(future);
        }
        e32.i(zzgwq.a("Future was expected to be done: %s", future));
        return null;
    }

    public static Object n(zzcha zzchaVar) {
        try {
            return zzhfl.a(zzchaVar);
        } catch (ExecutionException e) {
            if (e.getCause() instanceof Error) {
                throw new zzhdw((Error) e.getCause());
            }
            throw new zzhfk(e.getCause());
        }
    }
}
