package io.p071bidmachine.media3.exoplayer.trackselection;

import io.p071bidmachine.media3.common.s0;
import io.p071bidmachine.media3.common.util.a;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class p {
    public final s0 a;
    public final int[] b;

    public p(int i, s0 s0Var, int[] iArr) {
        if (iArr.length == 0) {
            a.o("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.a = s0Var;
        this.b = iArr;
    }
}
