package com.vungle.ads.internal;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class w implements v {
    public final /* synthetic */ BlockingQueue a;

    public w(LinkedBlockingQueue linkedBlockingQueue) {
        this.a = linkedBlockingQueue;
    }

    @Override // com.vungle.ads.internal.v
    public final void a() {
        boolean z = com.vungle.ads.internal.util.u.a;
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("Failed to send ");
        sbA.append(this.a.size());
        sbA.append(" errors");
        com.vungle.ads.internal.util.t.a("AnalyticsClient", sbA.toString());
        AnalyticsClient.INSTANCE.getClass();
        AnalyticsClient.a.addAll(this.a);
    }

    @Override // com.vungle.ads.internal.v
    public final void onSuccess() {
        boolean z = com.vungle.ads.internal.util.u.a;
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("Sent ");
        sbA.append(this.a.size());
        sbA.append(" errors");
        com.vungle.ads.internal.util.t.a("AnalyticsClient", sbA.toString());
    }
}
