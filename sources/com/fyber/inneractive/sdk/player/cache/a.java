package com.fyber.inneractive.sdk.player.cache;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements Callable {
    public final /* synthetic */ g a;

    public a(g gVar) {
        this.a = gVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        synchronized (this.a) {
            try {
                g gVar = this.a;
                if (gVar.i == null) {
                    return null;
                }
                gVar.d();
                g gVar2 = this.a;
                int i = gVar2.k;
                if (i >= 2000 && i >= gVar2.j.size()) {
                    this.a.c();
                    this.a.k = 0;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
