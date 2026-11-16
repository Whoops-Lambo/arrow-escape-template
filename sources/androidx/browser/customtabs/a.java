package androidx.browser.customtabs;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ EngagementSignalsCallback b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Bundle d;

    public /* synthetic */ a(EngagementSignalsCallback engagementSignalsCallback, boolean z, Bundle bundle, int i) {
        this.a = i;
        this.b = engagementSignalsCallback;
        this.c = z;
        this.d = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Bundle bundle = this.d;
        boolean z = this.c;
        EngagementSignalsCallback engagementSignalsCallback = this.b;
        switch (i) {
            case 0:
                int i2 = CustomTabsSession.AnonymousClass1.c;
                engagementSignalsCallback.onSessionEnded(z, bundle);
                break;
            default:
                int i3 = CustomTabsSession.AnonymousClass1.c;
                engagementSignalsCallback.onVerticalScrollEvent(z, bundle);
                break;
        }
    }
}
