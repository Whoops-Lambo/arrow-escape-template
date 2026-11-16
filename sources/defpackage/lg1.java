package defpackage;

import com.google.android.exoplayer2.source.ForwardingTimeline;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class lg1 extends ForwardingTimeline {
    @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
    public final int getNextWindowIndex(int i, int i2, boolean z) {
        int nextWindowIndex = this.timeline.getNextWindowIndex(i, i2, z);
        return nextWindowIndex == -1 ? getFirstWindowIndex(z) : nextWindowIndex;
    }

    @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
    public final int getPreviousWindowIndex(int i, int i2, boolean z) {
        int previousWindowIndex = this.timeline.getPreviousWindowIndex(i, i2, z);
        return previousWindowIndex == -1 ? getLastWindowIndex(z) : previousWindowIndex;
    }
}
