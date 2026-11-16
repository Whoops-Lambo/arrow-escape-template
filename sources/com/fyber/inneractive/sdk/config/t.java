package com.fyber.inneractive.sdk.config;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class t implements Runnable {
    public final /* synthetic */ v a;

    public t(v vVar) {
        this.a = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v vVar = this.a;
        Iterator it = vVar.c.iterator();
        while (it.hasNext()) {
            ((u) it.next()).onGlobalConfigChanged(vVar, vVar.b);
        }
    }
}
