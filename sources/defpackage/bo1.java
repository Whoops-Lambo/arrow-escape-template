package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.NativeAd;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class bo1 extends NativeAdMapper implements AdLoad.Listener {
    public final String a;
    public final String b;
    public final String c;
    public final MediationAdLoadCallback d;
    public NativeAd e;

    @Override // com.google.android.gms.ads.mediation.NativeAdMapper
    public final void destroy() {
        NativeAd nativeAd = this.e;
        if (nativeAd != null) {
            nativeAd.destroy();
        }
        this.e = null;
    }

    @Override // com.google.android.gms.ads.mediation.NativeAdMapper
    public final void recordImpression() {
        NativeAd nativeAd = this.e;
        if (nativeAd != null) {
            nativeAd.handleImpression();
        }
    }

    public bo1(MediationAdLoadCallback mediationAdLoadCallback, String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = mediationAdLoadCallback;
    }

    @Override // com.google.android.gms.ads.mediation.NativeAdMapper
    public final void handleClick(View view) {
        view.getClass();
        NativeAd nativeAd = this.e;
        if (nativeAd != null) {
            nativeAd.handleGeneralAdClick();
        }
    }

    @Override // com.moloco.sdk.publisher.AdLoad.Listener
    public final void onAdLoadFailed(MolocoAdError molocoAdError) {
        molocoAdError.getClass();
        this.d.onFailure(new AdError(molocoAdError.getErrorType().getErrorCode(), molocoAdError.getErrorType().getDescription(), "com.moloco.sdk"));
    }

    @Override // com.moloco.sdk.publisher.AdLoad.Listener
    public final void onAdLoadSuccess(MolocoAd molocoAd) {
        NativeAd.Assets assets;
        Drawable drawableCreateFromPath;
        molocoAd.getClass();
        setOverrideClickHandling(true);
        NativeAd nativeAd = this.e;
        if (nativeAd != null && (assets = nativeAd.getAssets()) != null) {
            Float rating = assets.getRating();
            if (rating != null) {
                setStarRating(Double.valueOf(rating.floatValue()));
            }
            String sponsorText = assets.getSponsorText();
            if (sponsorText != null) {
                setAdvertiser(sponsorText);
            }
            setStore("Google Play");
            String title = assets.getTitle();
            if (title != null) {
                setHeadline(title);
            }
            String description = assets.getDescription();
            if (description != null) {
                setBody(description);
            }
            String callToActionText = assets.getCallToActionText();
            if (callToActionText != null) {
                setCallToAction(callToActionText);
            }
            Uri iconUri = assets.getIconUri();
            if (iconUri != null && (drawableCreateFromPath = Drawable.createFromPath(iconUri.toString())) != null) {
                setIcon(new yn1(drawableCreateFromPath));
            }
            View mediaView = assets.getMediaView();
            if (mediaView != null) {
                mediaView.setTag("native_ad_media_view");
                setMediaView(mediaView);
            }
        }
        Object objOnSuccess = this.d.onSuccess(this);
        objOnSuccess.getClass();
        MediationNativeAdCallback mediationNativeAdCallback = (MediationNativeAdCallback) objOnSuccess;
        NativeAd nativeAd2 = this.e;
        if (nativeAd2 == null) {
            return;
        }
        nativeAd2.setInteractionListener(new ao1(mediationNativeAdCallback));
    }

    @Override // com.google.android.gms.ads.mediation.NativeAdMapper
    public final void trackViews(View view, Map map, Map map2) {
        view.getClass();
        map.getClass();
        map2.getClass();
        final int i = 0;
        view.setOnClickListener(new View.OnClickListener(this) { // from class: xn1
            public final /* synthetic */ bo1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i2 = i;
                bo1 bo1Var = this.b;
                switch (i2) {
                    case 0:
                        NativeAd nativeAd = bo1Var.e;
                        if (nativeAd != null) {
                            nativeAd.handleGeneralAdClick();
                        }
                        break;
                    default:
                        NativeAd nativeAd2 = bo1Var.e;
                        if (nativeAd2 != null) {
                            nativeAd2.handleGeneralAdClick();
                        }
                        break;
                }
            }
        });
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            final int i2 = 1;
            ((View) it.next()).setOnClickListener(new View.OnClickListener(this) { // from class: xn1
                public final /* synthetic */ bo1 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i3 = i2;
                    bo1 bo1Var = this.b;
                    switch (i3) {
                        case 0:
                            NativeAd nativeAd = bo1Var.e;
                            if (nativeAd != null) {
                                nativeAd.handleGeneralAdClick();
                            }
                            break;
                        default:
                            NativeAd nativeAd2 = bo1Var.e;
                            if (nativeAd2 != null) {
                                nativeAd2.handleGeneralAdClick();
                            }
                            break;
                    }
                }
            });
        }
    }
}
