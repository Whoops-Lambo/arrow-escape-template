package defpackage;

import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.util.Clock;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class kj0 implements gs0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AnalyticsCollector b;

    public /* synthetic */ kj0(AnalyticsCollector analyticsCollector, int i) {
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
                return ExoPlayer.Builder.lambda$new$13(analyticsCollector, clock);
            default:
                return ExoPlayer.Builder.lambda$setAnalyticsCollector$21(analyticsCollector, clock);
        }
    }
}
