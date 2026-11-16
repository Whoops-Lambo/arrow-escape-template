package defpackage;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class t60 implements ListenerSet.Event {
    public final /* synthetic */ int a;
    public final /* synthetic */ AnalyticsListener.EventTime b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;

    public /* synthetic */ t60(AnalyticsListener.EventTime eventTime, int i, boolean z) {
        this.a = 2;
        this.b = eventTime;
        this.d = i;
        this.c = z;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((AnalyticsListener) obj).onPlayWhenReadyChanged(this.b, this.c, this.d);
                break;
            case 1:
                ((AnalyticsListener) obj).onPlayerStateChanged(this.b, this.c, this.d);
                break;
            default:
                ((AnalyticsListener) obj).onDeviceVolumeChanged(this.b, this.d, this.c);
                break;
        }
    }

    public /* synthetic */ t60(AnalyticsListener.EventTime eventTime, boolean z, int i, int i2) {
        this.a = i2;
        this.b = eventTime;
        this.c = z;
        this.d = i;
    }
}
