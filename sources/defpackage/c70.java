package defpackage;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c70 implements ListenerSet.Event, androidx.media3.common.util.ListenerSet.Event {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c70(int i, int i2, int i3, Object obj) {
        this.a = i3;
        this.d = obj;
        this.b = i;
        this.c = i2;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((AnalyticsListener) obj).onSurfaceSizeChanged((AnalyticsListener.EventTime) this.d, this.b, this.c);
                break;
            default:
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onSurfaceSizeChanged((androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime) this.d, this.b, this.c);
                break;
        }
    }
}
