package com.fyber.inneractive.sdk.protobuf;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {
    public final b0 a;

    public final void a(int i, Object obj, t2 t2Var) {
        b0 b0Var = this.a;
        b0Var.c(i, 3);
        t2Var.a(obj, b0Var.a);
        b0Var.c(i, 4);
    }

    public c0(b0 b0Var) {
        Charset charset = l1.a;
        if (b0Var != null) {
            this.a = b0Var;
            b0Var.a = this;
        } else {
            defpackage.d.w("output");
            throw null;
        }
    }

    public final void a(int i, double d) {
        b0 b0Var = this.a;
        b0Var.getClass();
        b0Var.a(i, Double.doubleToRawLongBits(d));
    }

    public final void a(int i, int i2) {
        this.a.d(i, b0.d(i2));
    }

    public final void a(int i, long j) {
        this.a.b(i, b0.b(j));
    }

    public final void a(int i, float f) {
        b0 b0Var = this.a;
        b0Var.getClass();
        b0Var.a(i, Float.floatToRawIntBits(f));
    }
}
