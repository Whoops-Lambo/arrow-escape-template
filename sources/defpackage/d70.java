package defpackage;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d70 implements ListenerSet.Event {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ AnalyticsListener.EventTime b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ d70(AnalyticsListener.EventTime eventTime, int i, long j) {
        this.b = eventTime;
        this.d = i;
        this.c = j;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((AnalyticsListener) obj).onDroppedVideoFrames(this.b, this.d, this.c);
                break;
            default:
                ((AnalyticsListener) obj).onVideoFrameProcessingOffset(this.b, this.c, this.d);
                break;
        }
    }

    public /* synthetic */ d70(AnalyticsListener.EventTime eventTime, long j, int i) {
        this.b = eventTime;
        this.c = j;
        this.d = i;
    }
}
