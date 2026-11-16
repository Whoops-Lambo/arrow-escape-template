package io.p071bidmachine.media3.exoplayer.source;

import io.p071bidmachine.media3.common.p0;
import io.p071bidmachine.media3.common.q0;
import io.p071bidmachine.media3.common.r0;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class w extends s {
    public static final Object e = new Object();
    public final Object c;
    public final Object d;

    @Override // io.p071bidmachine.media3.exoplayer.source.s, io.p071bidmachine.media3.common.r0
    public final int b(Object obj) {
        Object obj2;
        if (e == obj && (obj2 = this.d) != null) {
            obj = obj2;
        }
        return this.b.b(obj);
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.s, io.p071bidmachine.media3.common.r0
    public final p0 f(int i, p0 p0Var, boolean z) {
        this.b.f(i, p0Var, z);
        if (Objects.equals(p0Var.b, this.d) && z) {
            p0Var.b = e;
        }
        return p0Var;
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.s, io.p071bidmachine.media3.common.r0
    public final Object l(int i) {
        Object objL = this.b.l(i);
        return Objects.equals(objL, this.d) ? e : objL;
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.s, io.p071bidmachine.media3.common.r0
    public final q0 m(int i, q0 q0Var, long j) {
        this.b.m(i, q0Var, j);
        if (Objects.equals(q0Var.a, this.c)) {
            q0Var.a = q0.p;
        }
        return q0Var;
    }

    public w(r0 r0Var, Object obj, Object obj2) {
        super(r0Var);
        this.c = obj;
        this.d = obj2;
    }
}
