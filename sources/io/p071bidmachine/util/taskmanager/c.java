package io.p071bidmachine.util.taskmanager;

import defpackage.s71;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public interface c {
    default boolean a(Runnable runnable) {
        Boolean bool;
        runnable.getClass();
        try {
            execute(runnable);
            bool = Boolean.TRUE;
        } catch (Throwable unused) {
            bool = null;
        }
        return s71.b(bool, Boolean.TRUE);
    }

    default boolean b(long j, Runnable runnable) {
        Boolean bool;
        runnable.getClass();
        try {
            a aVar = (a) this;
            aVar.c(runnable, false);
            aVar.e(j, runnable);
            bool = Boolean.TRUE;
        } catch (Throwable unused) {
            bool = null;
        }
        return s71.b(bool, Boolean.TRUE);
    }

    default void execute(Runnable runnable) {
        runnable.getClass();
        a aVar = (a) this;
        aVar.c(runnable, false);
        aVar.e(0L, runnable);
    }
}
