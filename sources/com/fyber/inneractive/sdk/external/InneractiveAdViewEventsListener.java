package com.fyber.inneractive.sdk.external;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public interface InneractiveAdViewEventsListener extends InneractiveUnitController.EventsListener {
    @Override // com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    void onAdClicked(InneractiveAdSpot inneractiveAdSpot);

    void onAdCollapsed(InneractiveAdSpot inneractiveAdSpot);

    @Override // com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    void onAdEnteredErrorState(InneractiveAdSpot inneractiveAdSpot, InneractiveUnitController.AdDisplayError adDisplayError);

    void onAdExpanded(InneractiveAdSpot inneractiveAdSpot);

    @Override // com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    void onAdImpression(InneractiveAdSpot inneractiveAdSpot);

    void onAdResized(InneractiveAdSpot inneractiveAdSpot);

    @Override // com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    void onAdWillCloseInternalBrowser(InneractiveAdSpot inneractiveAdSpot);

    @Override // com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    void onAdWillOpenExternalApp(InneractiveAdSpot inneractiveAdSpot);
}
