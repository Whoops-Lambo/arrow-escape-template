package io.p071bidmachine.media3.exoplayer.trackselection;

import io.p071bidmachine.media3.common.n;
import io.p071bidmachine.media3.common.s0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class m {
    public final int a;
    public final s0 b;
    public final int c;
    public final n d;

    public abstract int a();

    public abstract boolean b(m mVar);

    public m(int i, s0 s0Var, int i2) {
        this.a = i;
        this.b = s0Var;
        this.c = i2;
        this.d = s0Var.d[i2];
    }
}
