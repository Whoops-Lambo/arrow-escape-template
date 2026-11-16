package defpackage;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.util.ListenerSet;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class v60 implements ListenerSet.Event {
    public final /* synthetic */ int a;
    public final /* synthetic */ AnalyticsListener.EventTime b;
    public final /* synthetic */ LoadEventInfo c;
    public final /* synthetic */ MediaLoadData d;

    public /* synthetic */ v60(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i) {
        this.a = i;
        this.b = eventTime;
        this.c = loadEventInfo;
        this.d = mediaLoadData;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((AnalyticsListener) obj).onLoadCompleted(this.b, this.c, this.d);
                break;
            case 1:
                ((AnalyticsListener) obj).onLoadStarted(this.b, this.c, this.d);
                break;
            default:
                ((AnalyticsListener) obj).onLoadCanceled(this.b, this.c, this.d);
                break;
        }
    }
}
