package defpackage;

import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.ForwardingTimeline;
import com.google.android.exoplayer2.util.Assertions;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class ll1 extends ForwardingTimeline {
    public final long[] a;
    public final long[] b;

    public ll1(Timeline timeline, Map map) {
        super(timeline);
        int windowCount = timeline.getWindowCount();
        this.b = new long[timeline.getWindowCount()];
        Timeline.Window window = new Timeline.Window();
        for (int i = 0; i < windowCount; i++) {
            this.b[i] = timeline.getWindow(i, window).durationUs;
        }
        int periodCount = timeline.getPeriodCount();
        this.a = new long[periodCount];
        Timeline.Period period = new Timeline.Period();
        for (int i2 = 0; i2 < periodCount; i2++) {
            timeline.getPeriod(i2, period, true);
            long jLongValue = ((Long) Assertions.checkNotNull((Long) map.get(period.uid))).longValue();
            long[] jArr = this.a;
            jLongValue = jLongValue == Long.MIN_VALUE ? period.durationUs : jLongValue;
            jArr[i2] = jLongValue;
            long j = period.durationUs;
            if (j != -9223372036854775807L) {
                long[] jArr2 = this.b;
                int i3 = period.windowIndex;
                jArr2[i3] = jArr2[i3] - (j - jLongValue);
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
    public final Timeline.Period getPeriod(int i, Timeline.Period period, boolean z) {
        super.getPeriod(i, period, z);
        period.durationUs = this.a[i];
        return period;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
    public final Timeline.Window getWindow(int i, Timeline.Window window, long j) {
        long jMin;
        super.getWindow(i, window, j);
        long j2 = this.b[i];
        window.durationUs = j2;
        if (j2 != -9223372036854775807L) {
            long j3 = window.defaultPositionUs;
            if (j3 != -9223372036854775807L) {
                jMin = Math.min(j3, j2);
            } else {
                jMin = window.defaultPositionUs;
            }
        } else {
            jMin = window.defaultPositionUs;
        }
        window.defaultPositionUs = jMin;
        return window;
    }
}
