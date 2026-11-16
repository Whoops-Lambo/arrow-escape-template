package io.p071bidmachine.media3.exoplayer.source.chunk;

import io.p071bidmachine.media3.common.n;
import io.p071bidmachine.media3.datasource.h;
import io.p071bidmachine.media3.datasource.k;
import io.p071bidmachine.media3.datasource.x;
import io.p071bidmachine.media3.exoplayer.source.u;
import io.p071bidmachine.media3.exoplayer.upstream.i;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class e implements i {
    public final long a = u.c.getAndIncrement();
    public final k b;
    public final int c;
    public final n d;
    public final int e;
    public final Object f;
    public final long g;
    public final long h;
    public final x i;

    public e(h hVar, k kVar, int i, n nVar, int i2, Object obj, long j, long j2) {
        this.i = new x(hVar);
        this.b = kVar;
        this.c = i;
        this.d = nVar;
        this.e = i2;
        this.f = obj;
        this.g = j;
        this.h = j2;
    }
}
