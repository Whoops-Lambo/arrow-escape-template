package com.google.android.exoplayer2;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class i extends Timeline {
    @Override // com.google.android.exoplayer2.Timeline
    public final int getIndexOfPeriod(Object obj) {
        return -1;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final int getPeriodCount() {
        return 0;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final int getWindowCount() {
        return 0;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final Timeline.Period getPeriod(int i, Timeline.Period period, boolean z) {
        throw new IndexOutOfBoundsException();
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final Object getUidOfPeriod(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final Timeline.Window getWindow(int i, Timeline.Window window, long j) {
        throw new IndexOutOfBoundsException();
    }
}
