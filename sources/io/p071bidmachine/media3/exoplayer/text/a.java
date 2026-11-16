package io.p071bidmachine.media3.exoplayer.text;

import defpackage.d31;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public interface a {
    boolean a(io.p071bidmachine.media3.extractor.text.a aVar, long j);

    void clear();

    void discardCuesBeforeTimeUs(long j);

    d31 getCuesAtTimeUs(long j);

    long getNextCueChangeTimeUs(long j);

    long getPreviousCueChangeTimeUs(long j);
}
