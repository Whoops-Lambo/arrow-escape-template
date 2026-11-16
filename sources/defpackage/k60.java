package defpackage;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class k60 implements ListenerSet.Event {
    public final /* synthetic */ int a;
    public final /* synthetic */ AnalyticsListener.EventTime b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ k60(AnalyticsListener.EventTime eventTime, Exception exc, int i) {
        this.a = i;
        this.b = eventTime;
        this.c = exc;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((AnalyticsListener) obj).onVideoCodecError(this.b, this.c);
                break;
            case 1:
                ((AnalyticsListener) obj).onAudioCodecError(this.b, this.c);
                break;
            case 2:
                ((AnalyticsListener) obj).onAudioSinkError(this.b, this.c);
                break;
            default:
                ((AnalyticsListener) obj).onDrmSessionManagerError(this.b, this.c);
                break;
        }
    }
}
