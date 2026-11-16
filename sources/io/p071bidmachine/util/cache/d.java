package io.p071bidmachine.util.cache;

import defpackage.tb5;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class d {
    public final long a;
    public final double b;

    public final double a(double d) {
        long j = this.a;
        if (j == 0) {
            return 0.0d;
        }
        return this.b * tb5.e(1.0d - (d / j), 0.0d, 1.0d);
    }

    public d(long j, double d) {
        this.a = j;
        this.b = d;
    }
}
