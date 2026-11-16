package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.AbstractConcatenatedTimeline;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.util.Assertions;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class h extends AbstractConcatenatedTimeline {
    public final Timeline a;
    public final int b;
    public final int c;
    public final int d;

    public h(Timeline timeline, int i) {
        super(false, new ShuffleOrder.UnshuffledShuffleOrder(i));
        this.a = timeline;
        int periodCount = timeline.getPeriodCount();
        this.b = periodCount;
        this.c = timeline.getWindowCount();
        this.d = i;
        if (periodCount > 0) {
            Assertions.checkState(i <= Integer.MAX_VALUE / periodCount, "LoopingMediaSource contains too many periods");
        }
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    public final int getChildIndexByChildUid(Object obj) {
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    public final int getChildIndexByPeriodIndex(int i) {
        return i / this.b;
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    public final int getChildIndexByWindowIndex(int i) {
        return i / this.c;
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    public final int getFirstPeriodIndexByChildIndex(int i) {
        return i * this.b;
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    public final int getFirstWindowIndexByChildIndex(int i) {
        return i * this.c;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final int getPeriodCount() {
        return this.b * this.d;
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    public final Timeline getTimelineByChildIndex(int i) {
        return this.a;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final int getWindowCount() {
        return this.c * this.d;
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    public final Object getChildUidByChildIndex(int i) {
        return Integer.valueOf(i);
    }
}
