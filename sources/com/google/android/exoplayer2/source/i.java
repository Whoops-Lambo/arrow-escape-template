package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class i extends ForwardingTimeline {
    public static final Object c = new Object();
    public final Object a;
    public final Object b;

    @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
    public final int getIndexOfPeriod(Object obj) {
        Object obj2;
        Timeline timeline = this.timeline;
        if (c == obj && (obj2 = this.b) != null) {
            obj = obj2;
        }
        return timeline.getIndexOfPeriod(obj);
    }

    @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
    public final Timeline.Period getPeriod(int i, Timeline.Period period, boolean z) {
        this.timeline.getPeriod(i, period, z);
        if (Util.areEqual(period.uid, this.b) && z) {
            period.uid = c;
        }
        return period;
    }

    @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
    public final Object getUidOfPeriod(int i) {
        Object uidOfPeriod = this.timeline.getUidOfPeriod(i);
        return Util.areEqual(uidOfPeriod, this.b) ? c : uidOfPeriod;
    }

    @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
    public final Timeline.Window getWindow(int i, Timeline.Window window, long j) {
        this.timeline.getWindow(i, window, j);
        if (Util.areEqual(window.uid, this.a)) {
            window.uid = Timeline.Window.SINGLE_WINDOW_UID;
        }
        return window;
    }

    public i(Timeline timeline, Object obj, Object obj2) {
        super(timeline);
        this.a = obj;
        this.b = obj2;
    }
}
