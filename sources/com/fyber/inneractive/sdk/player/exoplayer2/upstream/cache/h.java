package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class h {
    public final int a;
    public final String b;
    public final TreeSet c = new TreeSet();
    public long d;

    public final m a(long j) {
        m mVar = new m(this.b, j, -1L, -9223372036854775807L, null);
        m mVar2 = (m) this.c.floor(mVar);
        if (mVar2 != null && mVar2.b + mVar2.c > j) {
            return mVar2;
        }
        m mVar3 = (m) this.c.ceiling(mVar);
        String str = this.b;
        return mVar3 == null ? new m(str, j, -1L, -9223372036854775807L, null) : new m(str, j, mVar3.b - j, -9223372036854775807L, null);
    }

    public h(int i, String str, long j) {
        this.a = i;
        this.b = str;
        this.d = j;
    }
}
