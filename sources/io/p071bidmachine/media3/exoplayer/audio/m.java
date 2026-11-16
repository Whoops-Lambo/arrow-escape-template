package io.p071bidmachine.media3.exoplayer.audio;

import defpackage.pv1;
import io.p071bidmachine.media3.common.n;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class m extends Exception {
    public final int a;
    public final boolean b;
    public final n c;

    public m(int i, n nVar, boolean z) {
        super(pv1.k(i, "AudioTrack write failed: "));
        this.b = z;
        this.a = i;
        this.c = nVar;
    }
}
