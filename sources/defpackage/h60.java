package defpackage;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class h60 implements ListenerSet.Event {
    public final /* synthetic */ int a;
    public final /* synthetic */ AnalyticsListener.EventTime b;
    public final /* synthetic */ DecoderCounters c;

    public /* synthetic */ h60(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters, int i) {
        this.a = i;
        this.b = eventTime;
        this.c = decoderCounters;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((AnalyticsListener) obj).onAudioEnabled(this.b, this.c);
                break;
            case 1:
                ((AnalyticsListener) obj).onAudioDisabled(this.b, this.c);
                break;
            case 2:
                ((AnalyticsListener) obj).onVideoDisabled(this.b, this.c);
                break;
            default:
                ((AnalyticsListener) obj).onVideoEnabled(this.b, this.c);
                break;
        }
    }
}
