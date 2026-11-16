package com.facebook;

import android.os.Handler;
import defpackage.j51;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class u0 {
    public final Handler a;
    public final k0 b;
    public final long c;
    public long d;
    public long e;
    public long f;

    public final void a() {
        long j = this.d;
        if (j > this.e) {
            g0 g0Var = this.b.g;
            long j2 = this.f;
            if (j2 <= 0 || !(g0Var instanceof i0)) {
                return;
            }
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new j51(g0Var, j, j2, 2));
            } else {
                ((i0) g0Var).onProgress(j, j2);
            }
            this.e = this.d;
        }
    }

    public u0(Handler handler, k0 k0Var) {
        k0Var.getClass();
        this.a = handler;
        this.b = k0Var;
        a0 a0Var = a0.a;
        com.facebook.internal.v0.U();
        this.c = a0.j.get();
    }
}
