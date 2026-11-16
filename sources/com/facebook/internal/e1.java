package com.facebook.internal;

import defpackage.y93;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class e1 {
    public final int a;
    public int b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;

    public void a(t tVar) {
        t tVar2;
        ReentrantLock reentrantLock = (ReentrantLock) this.d;
        reentrantLock.lock();
        if (tVar != null) {
            this.f = tVar.b((t) this.f);
            this.b--;
        }
        if (this.b < this.a) {
            tVar2 = (t) this.e;
            if (tVar2 != null) {
                this.e = tVar2.b(tVar2);
                this.f = tVar2.a((t) this.f, false);
                this.b++;
            }
        } else {
            tVar2 = null;
        }
        reentrantLock.unlock();
        if (tVar2 != null) {
            ((Executor) this.c).execute(new y93(25, tVar2, this));
        }
    }

    public e1() {
        Executor executorC = com.facebook.a0.c();
        this.a = 8;
        this.c = executorC;
        this.d = new ReentrantLock();
    }

    public e1(int i, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.h hVar, int i2, com.moloco.sdk.internal.n nVar, com.moloco.sdk.internal.ortb.model.q qVar, com.moloco.sdk.internal.ortb.model.s sVar) {
        this.a = i;
        this.c = hVar;
        this.b = i2;
        this.d = nVar;
        this.e = qVar;
        this.f = sVar;
    }
}
