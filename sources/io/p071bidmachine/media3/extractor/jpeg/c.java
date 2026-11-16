package io.p071bidmachine.media3.extractor.jpeg;

import defpackage.ta3;
import io.p071bidmachine.media3.extractor.a0;
import io.p071bidmachine.media3.extractor.s;
import io.p071bidmachine.media3.extractor.y;
import io.p071bidmachine.media3.extractor.z;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class c extends s {
    public final /* synthetic */ z b;
    public final /* synthetic */ ta3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ta3 ta3Var, z zVar, z zVar2) {
        super(zVar);
        this.c = ta3Var;
        this.b = zVar2;
    }

    @Override // io.p071bidmachine.media3.extractor.s, io.p071bidmachine.media3.extractor.z
    public final y getSeekPoints(long j) {
        y seekPoints = this.b.getSeekPoints(j);
        a0 a0Var = seekPoints.a;
        long j2 = a0Var.a;
        long j3 = a0Var.b;
        long j4 = this.c.a;
        a0 a0Var2 = new a0(j2, j3 + j4);
        a0 a0Var3 = seekPoints.b;
        return new y(a0Var2, new a0(a0Var3.a, a0Var3.b + j4));
    }
}
