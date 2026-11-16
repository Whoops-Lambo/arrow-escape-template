package io.p071bidmachine.media3.exoplayer.trackselection;

import defpackage.ev;
import io.p071bidmachine.media3.common.n;
import io.p071bidmachine.media3.exoplayer.e;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class f implements Comparable {
    public final boolean a;
    public final boolean b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        f fVar = (f) obj;
        return ev.a.d(this.b, fVar.b).d(this.a, fVar.a).f();
    }

    public f(n nVar, int i) {
        this.a = (nVar.e & 1) != 0;
        this.b = e.i(i, false);
    }
}
