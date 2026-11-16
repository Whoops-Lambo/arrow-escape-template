package io.p071bidmachine.media3.exoplayer.source.chunk;

import io.p071bidmachine.media3.common.g;
import io.p071bidmachine.media3.common.n;
import io.p071bidmachine.media3.common.util.q;
import io.p071bidmachine.media3.common.util.x;
import io.p071bidmachine.media3.extractor.d0;
import io.p071bidmachine.media3.extractor.e0;
import io.p071bidmachine.media3.extractor.l;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class c implements e0 {
    public final int a;
    public final n b;
    public final l c = new l();
    public n d;
    public e0 e;
    public long f;

    @Override // io.p071bidmachine.media3.extractor.e0
    public final int a(g gVar, int i, boolean z) {
        e0 e0Var = this.e;
        int i2 = x.a;
        return e0Var.a(gVar, i, z);
    }

    @Override // io.p071bidmachine.media3.extractor.e0
    public final void b(long j, int i, int i2, int i3, d0 d0Var) {
        long j2 = this.f;
        if (j2 != -9223372036854775807L && j >= j2) {
            this.e = this.c;
        }
        e0 e0Var = this.e;
        int i4 = x.a;
        e0Var.b(j, i, i2, i3, d0Var);
    }

    @Override // io.p071bidmachine.media3.extractor.e0
    public final void c(n nVar) {
        n nVar2 = this.b;
        if (nVar2 != null) {
            nVar = nVar.d(nVar2);
        }
        this.d = nVar;
        e0 e0Var = this.e;
        int i = x.a;
        e0Var.c(nVar);
    }

    @Override // io.p071bidmachine.media3.extractor.e0
    public final void d(q qVar, int i, int i2) {
        e0 e0Var = this.e;
        int i3 = x.a;
        e0Var.d(qVar, i, 0);
    }

    public c(int i, int i2, n nVar) {
        this.a = i2;
        this.b = nVar;
    }
}
