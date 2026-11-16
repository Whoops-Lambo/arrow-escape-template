package defpackage;

import androidx.media3.common.MediaMetadata;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o70 implements ListenerSet.Event {
    public final /* synthetic */ int a;
    public final /* synthetic */ AnalyticsListener.EventTime b;
    public final /* synthetic */ MediaMetadata c;

    public /* synthetic */ o70(AnalyticsListener.EventTime eventTime, MediaMetadata mediaMetadata, int i) {
        this.a = i;
        this.b = eventTime;
        this.c = mediaMetadata;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((AnalyticsListener) obj).onPlaylistMetadataChanged(this.b, this.c);
                break;
            default:
                ((AnalyticsListener) obj).onMediaMetadataChanged(this.b, this.c);
                break;
        }
    }
}
