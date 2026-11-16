package io.p071bidmachine.media3.common;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class a1 extends Exception {
    public final long a;

    public static a1 b(Exception exc, long j) {
        return exc instanceof a1 ? (a1) exc : new a1(exc, j);
    }

    public a1(Throwable th, long j) {
        super(th);
        this.a = j;
    }

    public static a1 a(Exception exc) {
        return b(exc, -9223372036854775807L);
    }
}
