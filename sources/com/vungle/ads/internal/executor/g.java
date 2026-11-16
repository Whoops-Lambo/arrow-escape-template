package com.vungle.ads.internal.executor;

import defpackage.j6;
import defpackage.sr0;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class g {
    public static final h a(Runnable runnable, Runnable runnable2) {
        int i = j.b;
        return runnable instanceof com.vungle.ads.internal.task.i ? new e(runnable, runnable2) : new f(runnable, runnable2);
    }

    public static Callable b(Callable callable, i iVar) {
        return new j6(4, callable, iVar);
    }

    public static final Object a(Callable callable, sr0 sr0Var) {
        callable.getClass();
        sr0Var.getClass();
        try {
            return callable.call();
        } catch (OutOfMemoryError unused) {
            sr0Var.invoke();
            return null;
        }
    }
}
