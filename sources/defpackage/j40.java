package defpackage;

import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.NativeAdEventsListener;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class j40 extends NativeAdEventsListener {
    public final /* synthetic */ l40 a;

    public j40(l40 l40Var) {
        this.a = l40Var;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public final void onAdClicked(InneractiveAdSpot inneractiveAdSpot) {
        inneractiveAdSpot.getClass();
        l40 l40Var = this.a;
        MediationNativeAdCallback mediationNativeAdCallback = l40Var.b;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdClicked();
        }
        MediationNativeAdCallback mediationNativeAdCallback2 = l40Var.b;
        if (mediationNativeAdCallback2 != null) {
            mediationNativeAdCallback2.onAdOpened();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public final void onAdImpression(InneractiveAdSpot inneractiveAdSpot) {
        inneractiveAdSpot.getClass();
        l40 l40Var = this.a;
        MediationNativeAdCallback mediationNativeAdCallback = l40Var.b;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onAdOpened();
        }
        MediationNativeAdCallback mediationNativeAdCallback2 = l40Var.b;
        if (mediationNativeAdCallback2 != null) {
            mediationNativeAdCallback2.reportAdImpression();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public final void onAdWillCloseInternalBrowser(InneractiveAdSpot inneractiveAdSpot) {
        inneractiveAdSpot.getClass();
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public final void onAdWillOpenExternalApp(InneractiveAdSpot inneractiveAdSpot) {
        inneractiveAdSpot.getClass();
        MediationNativeAdCallback mediationNativeAdCallback = this.a.b;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onAdLeftApplication();
        }
    }
}
