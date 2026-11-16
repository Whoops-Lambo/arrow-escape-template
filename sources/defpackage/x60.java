package defpackage;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class x60 implements ListenerSet.Event {
    public final /* synthetic */ int a;
    public final /* synthetic */ AnalyticsListener.EventTime b;

    public /* synthetic */ x60(AnalyticsListener.EventTime eventTime, int i) {
        this.a = i;
        this.b = eventTime;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        int i = this.a;
        AnalyticsListener.EventTime eventTime = this.b;
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        switch (i) {
            case 0:
                analyticsListener.onSeekStarted(eventTime);
                break;
            case 1:
                analyticsListener.onSeekProcessed(eventTime);
                break;
            case 2:
                analyticsListener.onPlayerReleased(eventTime);
                break;
            case 3:
                analyticsListener.onDrmKeysLoaded(eventTime);
                break;
            case 4:
                analyticsListener.onDrmSessionReleased(eventTime);
                break;
            case 5:
                analyticsListener.onDrmKeysRemoved(eventTime);
                break;
            default:
                analyticsListener.onDrmKeysRestored(eventTime);
                break;
        }
    }
}
