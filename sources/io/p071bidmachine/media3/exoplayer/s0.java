package io.p071bidmachine.media3.exoplayer;

import io.p071bidmachine.media3.common.r0;
import io.p071bidmachine.media3.exoplayer.source.a;
import io.p071bidmachine.media3.exoplayer.source.y;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class s0 implements m0 {
    public final y a;
    public int d;
    public boolean e;
    public final ArrayList c = new ArrayList();
    public final Object b = new Object();

    @Override // io.p071bidmachine.media3.exoplayer.m0
    public final r0 getTimeline() {
        return this.a.o;
    }

    @Override // io.p071bidmachine.media3.exoplayer.m0
    public final Object getUid() {
        return this.b;
    }

    public s0(a aVar, boolean z) {
        this.a = new y(aVar, z);
    }
}
