package com.google.android.exoplayer2.extractor.mp3;

import com.google.android.exoplayer2.extractor.SeekMap;
import defpackage.b82;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class Seeker$UnseekableSeeker extends SeekMap.Unseekable implements b82 {
    @Override // defpackage.b82
    public long getDataEndPosition() {
        return -1L;
    }

    @Override // defpackage.b82
    public long getTimeUs(long j) {
        return 0L;
    }

    public Seeker$UnseekableSeeker() {
        super(-9223372036854775807L);
    }
}
