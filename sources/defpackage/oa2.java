package defpackage;

import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.ForwardingTimeline;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.source.ads.ServerSideAdInsertionUtil;
import com.google.android.exoplayer2.util.Assertions;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class oa2 extends ForwardingTimeline {
    public final i31 a;

    @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
    public final Timeline.Period getPeriod(int i, Timeline.Period period, boolean z) {
        super.getPeriod(i, period, true);
        Object obj = period.uid;
        i31 i31Var = this.a;
        AdPlaybackState adPlaybackState = (AdPlaybackState) Assertions.checkNotNull((AdPlaybackState) i31Var.get(obj));
        long j = period.durationUs;
        long mediaPeriodPositionUsForContent = j == -9223372036854775807L ? adPlaybackState.contentDurationUs : ServerSideAdInsertionUtil.getMediaPeriodPositionUsForContent(j, -1, adPlaybackState);
        Timeline.Period period2 = new Timeline.Period();
        long mediaPeriodPositionUsForContent2 = 0;
        for (int i2 = 0; i2 < i + 1; i2++) {
            this.timeline.getPeriod(i2, period2, true);
            AdPlaybackState adPlaybackState2 = (AdPlaybackState) Assertions.checkNotNull((AdPlaybackState) i31Var.get(period2.uid));
            if (i2 == 0) {
                mediaPeriodPositionUsForContent2 = -ServerSideAdInsertionUtil.getMediaPeriodPositionUsForContent(-period2.getPositionInWindowUs(), -1, adPlaybackState2);
            }
            if (i2 != i) {
                mediaPeriodPositionUsForContent2 = ServerSideAdInsertionUtil.getMediaPeriodPositionUsForContent(period2.durationUs, -1, adPlaybackState2) + mediaPeriodPositionUsForContent2;
            }
        }
        period.set(period.id, period.uid, period.windowIndex, mediaPeriodPositionUsForContent, mediaPeriodPositionUsForContent2, adPlaybackState, period.isPlaceholder);
        return period;
    }

    public oa2(Timeline timeline, i31 i31Var) {
        boolean z;
        super(timeline);
        if (timeline.getWindowCount() == 1) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkState(z);
        Timeline.Period period = new Timeline.Period();
        for (int i = 0; i < timeline.getPeriodCount(); i++) {
            timeline.getPeriod(i, period, true);
            Assertions.checkState(i31Var.containsKey(Assertions.checkNotNull(period.uid)));
        }
        this.a = i31Var;
    }

    @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
    public final Timeline.Window getWindow(int i, Timeline.Window window, long j) {
        super.getWindow(i, window, j);
        Timeline.Period period = new Timeline.Period();
        getPeriod(window.firstPeriodIndex, period, true);
        Object objCheckNotNull = Assertions.checkNotNull(period.uid);
        i31 i31Var = this.a;
        AdPlaybackState adPlaybackState = (AdPlaybackState) Assertions.checkNotNull((AdPlaybackState) i31Var.get(objCheckNotNull));
        long mediaPeriodPositionUsForContent = ServerSideAdInsertionUtil.getMediaPeriodPositionUsForContent(window.positionInFirstPeriodUs, -1, adPlaybackState);
        if (window.durationUs == -9223372036854775807L) {
            long j2 = adPlaybackState.contentDurationUs;
            if (j2 != -9223372036854775807L) {
                window.durationUs = j2 - mediaPeriodPositionUsForContent;
            }
        } else {
            Timeline.Period period2 = super.getPeriod(window.lastPeriodIndex, period, true);
            long j3 = period2.positionInWindowUs;
            AdPlaybackState adPlaybackState2 = (AdPlaybackState) Assertions.checkNotNull((AdPlaybackState) i31Var.get(period2.uid));
            Timeline.Period period3 = getPeriod(window.lastPeriodIndex, period);
            window.durationUs = period3.positionInWindowUs + ServerSideAdInsertionUtil.getMediaPeriodPositionUsForContent(window.durationUs - j3, -1, adPlaybackState2);
        }
        window.positionInFirstPeriodUs = mediaPeriodPositionUsForContent;
        return window;
    }
}
