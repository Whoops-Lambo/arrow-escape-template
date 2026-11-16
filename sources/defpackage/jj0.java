package defpackage;

import androidx.media3.common.util.Clock;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.analytics.AnalyticsCollector;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class jj0 implements gs0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AnalyticsCollector b;

    public /* synthetic */ jj0(AnalyticsCollector analyticsCollector, int i) {
        this.a = i;
        this.b = analyticsCollector;
    }

    @Override // defpackage.gs0
    public final Object apply(Object obj) {
        int i = this.a;
        AnalyticsCollector analyticsCollector = this.b;
        Clock clock = (Clock) obj;
        switch (i) {
            case 0:
                return ExoPlayer.Builder.lambda$setAnalyticsCollector$21(analyticsCollector, clock);
            default:
                return ExoPlayer.Builder.lambda$new$13(analyticsCollector, clock);
        }
    }
}
