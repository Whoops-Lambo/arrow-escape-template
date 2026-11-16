package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveContentController;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class j0 implements InneractiveContentController {
    protected WeakReference<InneractiveAdSpot> mAdSpot;
    protected InneractiveContentController.EventsListener mEventsListener;

    public abstract boolean canControl(InneractiveAdSpot inneractiveAdSpot);

    @Override // com.fyber.inneractive.sdk.external.InneractiveContentController
    public void destroy() {
        this.mEventsListener = null;
        this.mAdSpot = null;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveContentController
    public InneractiveAdSpot getAdSpot() {
        return (InneractiveAdSpot) com.fyber.inneractive.sdk.util.v.a(this.mAdSpot);
    }

    public InneractiveContentController.EventsListener getEventsListener() {
        return this.mEventsListener;
    }

    public void setAdSpot(InneractiveAdSpot inneractiveAdSpot) {
        this.mAdSpot = new WeakReference<>(inneractiveAdSpot);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveContentController
    public void setEventsListener(InneractiveContentController.EventsListener eventsListener) {
        this.mEventsListener = eventsListener;
    }
}
