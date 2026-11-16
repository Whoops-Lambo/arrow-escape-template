package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.flow.x;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public interface InneractiveAdSpot {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class NativeAdRequestListener implements RequestListener {
        @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
        public final void onInneractiveSuccessfulAdRequest(InneractiveAdSpot inneractiveAdSpot) {
        }

        public abstract void onInneractiveSuccessfulNativeAdRequest(InneractiveAdSpot inneractiveAdSpot, NativeAdContent nativeAdContent);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface RequestListener {
        void onInneractiveFailedAdRequest(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode);

        void onInneractiveSuccessfulAdRequest(InneractiveAdSpot inneractiveAdSpot);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class RequestListenerAdapter implements RequestListener {
        public abstract void onInneractiveAdRequestResult(InneractiveAdSpot inneractiveAdSpot, boolean z, InneractiveErrorCode inneractiveErrorCode);

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
        public void onInneractiveFailedAdRequest(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode) {
            onInneractiveAdRequestResult(inneractiveAdSpot, false, inneractiveErrorCode);
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
        public void onInneractiveSuccessfulAdRequest(InneractiveAdSpot inneractiveAdSpot) {
            onInneractiveAdRequestResult(inneractiveAdSpot, true, null);
        }
    }

    void addUnitController(InneractiveUnitController inneractiveUnitController);

    void destroy();

    x getAdContent();

    InneractiveAdRequest getCurrentProcessedRequest();

    String getLocalUniqueId();

    InneractiveMediationName getMediationName();

    String getMediationNameString();

    String getMediationVersion();

    String getRequestedSpotId();

    InneractiveUnitController getSelectedUnitController();

    boolean isReady();

    void loadAd(String str);

    void loadAd(String str, String str2);

    void removeUnitController(InneractiveUnitController inneractiveUnitController);

    void requestAd(InneractiveAdRequest inneractiveAdRequest);

    void setMediationName(InneractiveMediationName inneractiveMediationName);

    void setMediationName(String str);

    void setMediationVersion(String str);

    void setRequestListener(RequestListener requestListener);
}
