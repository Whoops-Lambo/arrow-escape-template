package io.p071bidmachine.rendering.internal;

import io.p071bidmachine.rendering.model.y;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class i implements a0 {
    public long a;
    public long b;
    public final /* synthetic */ j c;

    @Override // io.p071bidmachine.util.k
    public final void t() {
        j jVar = this.c;
        jVar.a.b(y.OnScheduled, null, null);
        jVar.b.remove(this);
    }

    public i(j jVar) {
        this.c = jVar;
        jVar.b.add(this);
    }
}
