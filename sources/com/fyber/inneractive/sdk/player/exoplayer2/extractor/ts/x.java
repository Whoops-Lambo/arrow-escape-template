package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class x {
    public final List a;
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.r[] b;

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        for (int i = 0; i < this.b.length; i++) {
            e0Var.a();
            e0Var.b();
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA = jVar.a(e0Var.d, 3);
            com.fyber.inneractive.sdk.player.exoplayer2.o oVar = (com.fyber.inneractive.sdk.player.exoplayer2.o) this.a.get(i);
            String str = oVar.f;
            com.fyber.inneractive.sdk.player.exoplayer2.util.a.a("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption mime type provided: " + str);
            String str2 = oVar.a;
            if (str2 == null) {
                e0Var.b();
                str2 = e0Var.e;
            }
            gVarA.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(str2, str, oVar.x, oVar.y, oVar.z, null, Long.MAX_VALUE, Collections.EMPTY_LIST));
            this.b[i] = gVarA;
        }
    }

    public x(List list) {
        this.a = list;
        this.b = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.r[list.size()];
    }
}
