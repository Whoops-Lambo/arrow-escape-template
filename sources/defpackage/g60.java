package defpackage;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector;
import com.google.android.exoplayer2.util.ListenerSet;
import io.p071bidmachine.BidMachine;
import io.p071bidmachine.utils.lazy.b;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class g60 implements ListenerSet.Event, b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ g60(boolean z, String str) {
        this.a = 4;
        this.c = z;
        this.b = str;
    }

    @Override // io.p071bidmachine.utils.lazy.b
    /* JADX INFO: renamed from: get */
    public Object mo1394get() {
        return BidMachine.lambda$setConsentConfig$3(this.c, (String) this.b);
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((AnalyticsListener) obj).onSkipSilenceEnabledChanged((AnalyticsListener.EventTime) this.b, this.c);
                break;
            case 1:
                ((AnalyticsListener) obj).onIsPlayingChanged((AnalyticsListener.EventTime) this.b, this.c);
                break;
            case 2:
                ((AnalyticsListener) obj).onShuffleModeChanged((AnalyticsListener.EventTime) this.b, this.c);
                break;
            default:
                DefaultAnalyticsCollector.lambda$onIsLoadingChanged$32((AnalyticsListener.EventTime) this.b, this.c, (AnalyticsListener) obj);
                break;
        }
    }

    public /* synthetic */ g60(AnalyticsListener.EventTime eventTime, int i, boolean z) {
        this.a = i;
        this.b = eventTime;
        this.c = z;
    }
}
