package defpackage;

import com.google.ads.mediation.moloco.MolocoMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.moloco.sdk.publisher.InterstitialAd;
import com.moloco.sdk.publisher.MolocoAdError;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class pn1 extends rc1 implements zr0 {
    public final /* synthetic */ qn1 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pn1(qn1 qn1Var) {
        super(2);
        this.i = qn1Var;
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        InterstitialAd interstitialAd = (InterstitialAd) obj;
        MolocoAdError.AdCreateError adCreateError = (MolocoAdError.AdCreateError) obj2;
        qn1 qn1Var = this.i;
        MediationAdLoadCallback mediationAdLoadCallback = qn1Var.a;
        if (adCreateError != null) {
            mediationAdLoadCallback.onFailure(new AdError(adCreateError.getErrorCode(), adCreateError.getDescription(), "com.moloco.sdk"));
        } else if (interstitialAd == null) {
            mediationAdLoadCallback.onFailure(new AdError(103, MolocoMediationAdapter.ERROR_MSG_AD_IS_NULL, MolocoMediationAdapter.ADAPTER_ERROR_DOMAIN));
        } else {
            qn1Var.e = interstitialAd;
            interstitialAd.load(qn1Var.c, qn1Var);
        }
        return az2.a;
    }
}
