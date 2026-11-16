package defpackage;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.util.ListenerSet;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class h70 implements ListenerSet.Event {
    public final /* synthetic */ int a;
    public final /* synthetic */ AnalyticsListener.EventTime b;
    public final /* synthetic */ DecoderCounters c;

    public /* synthetic */ h70(AnalyticsListener.EventTime eventTime, int i, DecoderCounters decoderCounters) {
        this.a = i;
        this.b = eventTime;
        this.c = decoderCounters;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                DefaultAnalyticsCollector.lambda$onVideoEnabled$13(this.b, this.c, (AnalyticsListener) obj);
                break;
            case 1:
                DefaultAnalyticsCollector.lambda$onVideoDisabled$18(this.b, this.c, (AnalyticsListener) obj);
                break;
            case 2:
                DefaultAnalyticsCollector.lambda$onAudioDisabled$9(this.b, this.c, (AnalyticsListener) obj);
                break;
            default:
                DefaultAnalyticsCollector.lambda$onAudioEnabled$3(this.b, this.c, (AnalyticsListener) obj);
                break;
        }
    }
}
