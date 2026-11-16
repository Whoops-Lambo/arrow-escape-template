package io.p071bidmachine.media3.decoder;

import defpackage.jc1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class d extends IllegalStateException {
    public final int a;
    public final int b;

    public d(int i, int i2) {
        super(jc1.n("Buffer too small (", i, " < ", i2, ")"));
        this.a = i;
        this.b = i2;
    }
}
