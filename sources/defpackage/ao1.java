package defpackage;

import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.moloco.sdk.publisher.NativeAd;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class ao1 implements NativeAd.InteractionListener {
    public final /* synthetic */ MediationNativeAdCallback a;

    @Override // com.moloco.sdk.publisher.NativeAd.InteractionListener
    public final void onGeneralClickHandled() {
        this.a.reportAdClicked();
    }

    @Override // com.moloco.sdk.publisher.NativeAd.InteractionListener
    public final void onImpressionHandled() {
        this.a.reportAdImpression();
    }

    public ao1(MediationNativeAdCallback mediationNativeAdCallback) {
        this.a = mediationNativeAdCallback;
    }
}
