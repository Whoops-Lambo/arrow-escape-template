package com.google.android.exoplayer2.extractor;

import defpackage.sk0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public interface ExtractorOutput {
    public static final ExtractorOutput PLACEHOLDER = new sk0();

    void endTracks();

    void seekMap(SeekMap seekMap);

    TrackOutput track(int i, int i2);
}
