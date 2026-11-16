package defpackage;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class u60 implements ListenerSet.Event {
    public final /* synthetic */ int a;
    public final /* synthetic */ AnalyticsListener.EventTime b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ u60(AnalyticsListener.EventTime eventTime, Exception exc, int i) {
        this.a = i;
        this.b = eventTime;
        this.c = exc;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((AnalyticsListener) obj).onVideoCodecError(this.b, this.c);
                break;
            case 1:
                ((AnalyticsListener) obj).onDrmSessionManagerError(this.b, this.c);
                break;
            case 2:
                ((AnalyticsListener) obj).onAudioCodecError(this.b, this.c);
                break;
            default:
                ((AnalyticsListener) obj).onAudioSinkError(this.b, this.c);
                break;
        }
    }
}
