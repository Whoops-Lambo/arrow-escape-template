package io.p071bidmachine.media3.exoplayer.hls;

import io.p071bidmachine.media3.exoplayer.hls.playlist.f;
import io.p071bidmachine.media3.exoplayer.hls.playlist.i;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class h {
    public final i a;
    public final long b;
    public final int c;
    public final boolean d;

    public h(i iVar, long j, int i) {
        boolean z;
        this.a = iVar;
        this.b = j;
        this.c = i;
        if ((iVar instanceof f) && ((f) iVar).m) {
            z = true;
        } else {
            z = false;
        }
        this.d = z;
    }
}
