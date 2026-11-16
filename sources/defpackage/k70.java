package defpackage;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class k70 implements ListenerSet.Event {
    public final /* synthetic */ int a;
    public final /* synthetic */ AnalyticsListener.EventTime b;
    public final /* synthetic */ String c;

    public /* synthetic */ k70(AnalyticsListener.EventTime eventTime, String str, int i) {
        this.a = i;
        this.b = eventTime;
        this.c = str;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((AnalyticsListener) obj).onAudioDecoderReleased(this.b, this.c);
                break;
            default:
                ((AnalyticsListener) obj).onVideoDecoderReleased(this.b, this.c);
                break;
        }
    }
}
