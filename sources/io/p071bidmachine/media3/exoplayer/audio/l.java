package io.p071bidmachine.media3.exoplayer.audio;

import defpackage.h50;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class l extends Exception {
    public final long a;
    public final long b;

    /* JADX WARN: Illegal instructions before constructor call */
    public l(long j, long j2) {
        StringBuilder sbO = h50.o(j2, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
        sbO.append(j);
        super(sbO.toString());
        this.a = j;
        this.b = j2;
    }
}
