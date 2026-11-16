package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class y implements v {
    public com.fyber.inneractive.sdk.player.exoplayer2.util.v a;
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r b;
    public boolean c;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        long j;
        long j2;
        long j3;
        long j4 = -9223372036854775807L;
        if (!this.c) {
            com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar = this.a;
            long j5 = 0;
            if (vVar.a == Long.MAX_VALUE) {
                j2 = 0;
            } else {
                j2 = vVar.c == -9223372036854775807L ? -9223372036854775807L : vVar.b;
            }
            if (j2 == -9223372036854775807L) {
                return;
            }
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar = this.b;
            com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar2 = this.a;
            if (vVar2.a == Long.MAX_VALUE) {
                j3 = j5;
            } else if (vVar2.c == -9223372036854775807L) {
                j3 = -9223372036854775807L;
            } else {
                j5 = vVar2.b;
                j3 = j5;
            }
            rVar.a(new com.fyber.inneractive.sdk.player.exoplayer2.o(null, null, "application/x-scte35", null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, j3, null, null, null));
            this.c = true;
        }
        int i = nVar.c - nVar.b;
        this.b.a(i, nVar);
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar2 = this.b;
        com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar3 = this.a;
        if (vVar3.c == -9223372036854775807L) {
            long j6 = vVar3.a;
            if (j6 != Long.MAX_VALUE) {
                j = j6;
            }
            rVar2.a(j, 1, i, 0, null);
        }
        j4 = vVar3.c;
        j = j4;
        rVar2.a(j, 1, i, 0, null);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        this.a = vVar;
        e0Var.a();
        e0Var.b();
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA = jVar.a(e0Var.d, 4);
        this.b = gVarA;
        e0Var.b();
        gVarA.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(e0Var.e, "application/x-scte35", (com.fyber.inneractive.sdk.player.exoplayer2.drm.d) null));
    }
}
