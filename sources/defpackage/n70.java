package defpackage;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class n70 implements ListenerSet.Event {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ AnalyticsListener.EventTime b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ n70(AnalyticsListener.EventTime eventTime, int i, long j) {
        this.b = eventTime;
        this.d = i;
        this.c = j;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
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

    public /* synthetic */ n70(AnalyticsListener.EventTime eventTime, long j, int i) {
        this.b = eventTime;
        this.c = j;
        this.d = i;
    }
}
