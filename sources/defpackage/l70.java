package defpackage;

import androidx.media3.common.Format;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class l70 implements ListenerSet.Event {
    public final /* synthetic */ int a;
    public final /* synthetic */ AnalyticsListener.EventTime b;
    public final /* synthetic */ Format c;
    public final /* synthetic */ DecoderReuseEvaluation d;

    public /* synthetic */ l70(AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation, int i) {
        this.a = i;
        this.b = eventTime;
        this.c = format;
        this.d = decoderReuseEvaluation;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((AnalyticsListener) obj).onVideoInputFormatChanged(this.b, this.c, this.d);
                break;
            default:
                ((AnalyticsListener) obj).onAudioInputFormatChanged(this.b, this.c, this.d);
                break;
        }
    }
}
