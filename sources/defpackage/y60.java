package defpackage;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class y60 implements ListenerSet.Event {
    public final /* synthetic */ int a;
    public final /* synthetic */ AnalyticsListener.EventTime b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ y60(AnalyticsListener.EventTime eventTime, int i, boolean z) {
        this.a = 1;
        this.b = eventTime;
        this.c = i;
        this.d = z;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((AnalyticsListener) obj).onPlayerStateChanged(this.b, this.d, this.c);
                break;
            case 1:
                ((AnalyticsListener) obj).onDeviceVolumeChanged(this.b, this.c, this.d);
                break;
            default:
                ((AnalyticsListener) obj).onPlayWhenReadyChanged(this.b, this.d, this.c);
                break;
        }
    }

    public /* synthetic */ y60(AnalyticsListener.EventTime eventTime, int i, int i2, boolean z) {
        this.a = i2;
        this.b = eventTime;
        this.d = z;
        this.c = i;
    }
}
