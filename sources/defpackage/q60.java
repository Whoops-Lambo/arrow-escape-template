package defpackage;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class q60 implements ListenerSet.Event {
    public final /* synthetic */ int a;
    public final /* synthetic */ AnalyticsListener.EventTime b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    public /* synthetic */ q60(AnalyticsListener.EventTime eventTime, int i, long j, long j2, int i2) {
        this.a = i2;
        this.b = eventTime;
        this.c = i;
        this.d = j;
        this.e = j2;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((AnalyticsListener) obj).onBandwidthEstimate(this.b, this.c, this.d, this.e);
                break;
            default:
                ((AnalyticsListener) obj).onAudioUnderrun(this.b, this.c, this.d, this.e);
                break;
        }
    }
}
