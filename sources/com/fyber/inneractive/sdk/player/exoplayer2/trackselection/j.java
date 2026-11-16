package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

import com.fyber.inneractive.sdk.player.exoplayer2.source.z;
import com.fyber.inneractive.sdk.player.exoplayer2.t;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class j {
    public final z a;
    public final h b;
    public final Object c;
    public final t[] d;

    public final boolean a(j jVar, int i) {
        return jVar != null && com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(this.b.b[i], jVar.b.b[i]) && com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(this.d[i], jVar.d[i]);
    }

    public j(z zVar, h hVar, f fVar, t[] tVarArr) {
        this.a = zVar;
        this.b = hVar;
        this.c = fVar;
        this.d = tVarArr;
    }
}
