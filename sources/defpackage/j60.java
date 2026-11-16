package defpackage;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class j60 implements ListenerSet.Event {
    public final /* synthetic */ int a;
    public final /* synthetic */ AnalyticsListener.EventTime b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ j60(AnalyticsListener.EventTime eventTime, int i, boolean z) {
        this.a = i;
        this.b = eventTime;
        this.c = z;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                DefaultAnalyticsCollector.lambda$onIsLoadingChanged$35(this.b, this.c, (AnalyticsListener) obj);
                break;
            case 1:
                ((AnalyticsListener) obj).onSkipSilenceEnabledChanged(this.b, this.c);
                break;
            case 2:
                ((AnalyticsListener) obj).onIsPlayingChanged(this.b, this.c);
                break;
            default:
                ((AnalyticsListener) obj).onShuffleModeChanged(this.b, this.c);
                break;
        }
    }
}
