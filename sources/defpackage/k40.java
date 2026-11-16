package defpackage;

import android.content.Context;
import android.net.Uri;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.MediaView;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class k40 extends InneractiveAdSpot.NativeAdRequestListener {
    public final /* synthetic */ l40 a;
    public final /* synthetic */ MediationNativeAdConfiguration b;

    public k40(l40 l40Var, MediationNativeAdConfiguration mediationNativeAdConfiguration) {
        this.a = l40Var;
        this.b = mediationNativeAdConfiguration;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
    public final void onInneractiveFailedAdRequest(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode) {
        l40.a(this.a, "onInneractiveFailedAdRequest error: " + inneractiveErrorCode, inneractiveErrorCode);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.NativeAdRequestListener
    public final void onInneractiveSuccessfulNativeAdRequest(InneractiveAdSpot inneractiveAdSpot, NativeAdContent nativeAdContent) {
        l40 l40Var = this.a;
        if (nativeAdContent == null) {
            l40.a(l40Var, "content is NOT NativeAdContent", InneractiveErrorCode.SDK_INTERNAL_ERROR);
            return;
        }
        Context context = this.b.getContext();
        context.getClass();
        nativeAdContent.bindMediaView(new MediaView(context));
        l40Var.d = nativeAdContent;
        String adTitle = nativeAdContent.getAdTitle();
        if (adTitle != null) {
            l40Var.setHeadline(adTitle);
        }
        String adDescription = nativeAdContent.getAdDescription();
        if (adDescription != null) {
            l40Var.setBody(adDescription);
        }
        Uri appIcon = nativeAdContent.getAppIcon();
        if (appIcon != null) {
            l40Var.setIcon(new h40(appIcon));
        }
        String adCallToAction = nativeAdContent.getAdCallToAction();
        if (adCallToAction != null) {
            l40Var.setCallToAction(adCallToAction);
        }
        MediaView mediaView = nativeAdContent.getMediaView();
        if (mediaView != null) {
            l40Var.setMediaView(mediaView);
        }
        Float rating = nativeAdContent.getRating();
        if (rating != null) {
            l40Var.setStarRating(Double.valueOf(rating.floatValue()));
        }
        Float mediaAspectRatio = nativeAdContent.getMediaAspectRatio();
        if (mediaAspectRatio != null) {
            l40Var.setMediaContentAspectRatio(mediaAspectRatio.floatValue());
        }
        l40Var.setOverrideClickHandling(true);
        l40Var.setOverrideImpressionRecording(true);
        l40Var.b = (MediationNativeAdCallback) l40Var.a.onSuccess(l40Var);
    }
}
