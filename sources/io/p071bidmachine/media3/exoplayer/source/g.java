package io.p071bidmachine.media3.exoplayer.source;

import io.p071bidmachine.media3.common.util.a;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class g extends IOException {
    public final int a;

    public g(int i, long j, long j2) {
        super("Illegal clipping: " + a(i, j, j2));
        this.a = i;
    }

    private static String a(int i, long j, long j2) {
        if (i == 0) {
            return "invalid period count";
        }
        if (i == 1) {
            return "not seekable to start";
        }
        if (i != 2) {
            return "unknown";
        }
        a.i((j == -9223372036854775807L || j2 == -9223372036854775807L) ? false : true);
        return "start exceeds end. Start time: " + j + ", End time: " + j2;
    }

    public g(int i) {
        this(i, -9223372036854775807L, -9223372036854775807L);
    }
}
