package io.p071bidmachine.media3.exoplayer.source.chunk;

import io.p071bidmachine.displays.mapper.a;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public interface k {
    public static final a n9 = new a(17);

    long getChunkEndTimeUs();

    long getChunkStartTimeUs();

    boolean next();
}
