package io.p071bidmachine.utils;

import io.p071bidmachine.AdProcessCallback;
import io.p071bidmachine.iab.mraid.m;
import io.p071bidmachine.iab.utils.n;
import io.p071bidmachine.unified.c;
import io.p071bidmachine.util.h;
import io.p071bidmachine.util.j;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class d implements j {
    public final c a;
    public final n b;

    @Override // io.p071bidmachine.util.j
    public final void o(h hVar) {
        boolean z = hVar.a;
        n nVar = this.b;
        if (z) {
            nVar.d();
            ((AdProcessCallback) ((m) this.a).a).processClicked(hVar.b, null);
        }
        nVar.a();
    }

    public d(c cVar, n nVar) {
        cVar.getClass();
        this.a = cVar;
        this.b = nVar;
    }
}
