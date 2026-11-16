package com.google.android.gms.internal.ads;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public interface zzxv {
    void a(zzxu zzxuVar);

    void b(Handler handler, zzye zzyeVar);

    void c(zzxu zzxuVar);

    void d(zzxu zzxuVar);

    void e(zzye zzyeVar);

    default void f(zzak zzakVar) {
    }

    void g(zzut zzutVar);

    void h(Handler handler, zzut zzutVar);

    void i(zzxr zzxrVar);

    zzxr k(zzxt zzxtVar, zzabv zzabvVar, long j);

    zzak v();

    default void w() {
    }

    default void zzJ() {
    }

    void zzu();

    default void j(zzxu zzxuVar, zzqn zzqnVar, zzaca zzacaVar) {
        zzacaVar.getClass();
        throw new IllegalStateException("prepareSource(MediaSourceCaller, TransferListener, PlayerId) not implemented");
    }
}
