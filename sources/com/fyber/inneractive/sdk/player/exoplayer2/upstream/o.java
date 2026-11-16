package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class o implements g {
    public final Context a;
    public final m b;
    public final g c;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public final h a() {
        return new n(this.a, this.b, this.c.a());
    }

    public o(Context context, m mVar, q qVar) {
        this.a = context.getApplicationContext();
        this.b = mVar;
        this.c = qVar;
    }
}
