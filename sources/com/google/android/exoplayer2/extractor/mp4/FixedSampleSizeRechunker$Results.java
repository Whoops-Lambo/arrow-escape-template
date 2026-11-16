package com.google.android.exoplayer2.extractor.mp4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class FixedSampleSizeRechunker$Results {
    public final long duration;
    public final int[] flags;
    public final int maximumSize;
    public final long[] offsets;
    public final int[] sizes;
    public final long[] timestamps;

    private FixedSampleSizeRechunker$Results(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        this.offsets = jArr;
        this.sizes = iArr;
        this.maximumSize = i;
        this.timestamps = jArr2;
        this.flags = iArr2;
        this.duration = j;
    }
}
