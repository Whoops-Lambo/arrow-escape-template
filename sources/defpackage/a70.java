package defpackage;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.util.ListenerSet;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a70 implements ListenerSet.Event {
    public final /* synthetic */ int a;
    public final /* synthetic */ AnalyticsListener.EventTime b;
    public final /* synthetic */ MediaLoadData c;

    public /* synthetic */ a70(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData, int i) {
        this.a = i;
        this.b = eventTime;
        this.c = mediaLoadData;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((AnalyticsListener) obj).onDownstreamFormatChanged(this.b, this.c);
                break;
            default:
                ((AnalyticsListener) obj).onUpstreamDiscarded(this.b, this.c);
                break;
        }
    }
}
