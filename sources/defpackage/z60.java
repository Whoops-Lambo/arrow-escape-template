package defpackage;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector;
import com.google.android.exoplayer2.util.ListenerSet;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class z60 implements ListenerSet.Event {
    public final /* synthetic */ int a;
    public final /* synthetic */ AnalyticsListener.EventTime b;
    public final /* synthetic */ int c;

    public /* synthetic */ z60(AnalyticsListener.EventTime eventTime, int i, int i2) {
        this.a = i2;
        this.b = eventTime;
        this.c = i;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((AnalyticsListener) obj).onAudioSessionIdChanged(this.b, this.c);
                break;
            case 1:
                ((AnalyticsListener) obj).onPlaybackStateChanged(this.b, this.c);
                break;
            case 2:
                ((AnalyticsListener) obj).onRepeatModeChanged(this.b, this.c);
                break;
            case 3:
                ((AnalyticsListener) obj).onPlaybackSuppressionReasonChanged(this.b, this.c);
                break;
            case 4:
                ((AnalyticsListener) obj).onTimelineChanged(this.b, this.c);
                break;
            default:
                DefaultAnalyticsCollector.lambda$onDrmSessionAcquired$62(this.b, this.c, (AnalyticsListener) obj);
                break;
        }
    }
}
