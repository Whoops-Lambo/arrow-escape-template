package io.p071bidmachine.media3.exoplayer;

import io.p071bidmachine.media3.common.r0;
import io.p071bidmachine.media3.exoplayer.source.y;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class v implements m0 {
    public final Object a;
    public r0 b;

    @Override // io.p071bidmachine.media3.exoplayer.m0
    public final r0 getTimeline() {
        return this.b;
    }

    @Override // io.p071bidmachine.media3.exoplayer.m0
    public final Object getUid() {
        return this.a;
    }

    public v(Object obj, y yVar) {
        this.a = obj;
        this.b = yVar.o;
    }
}
