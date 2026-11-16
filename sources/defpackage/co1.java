package defpackage;

import com.google.ads.mediation.moloco.MolocoMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.RewardedInterstitialAd;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class co1 extends rc1 implements zr0 {
    public final /* synthetic */ do1 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public co1(do1 do1Var) {
        super(2);
        this.i = do1Var;
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        RewardedInterstitialAd rewardedInterstitialAd = (RewardedInterstitialAd) obj;
        MolocoAdError.AdCreateError adCreateError = (MolocoAdError.AdCreateError) obj2;
        do1 do1Var = this.i;
        MediationAdLoadCallback mediationAdLoadCallback = do1Var.a;
        if (adCreateError != null) {
            mediationAdLoadCallback.onFailure(new AdError(adCreateError.getErrorCode(), adCreateError.getDescription(), "com.moloco.sdk"));
        } else if (rewardedInterstitialAd == null) {
            mediationAdLoadCallback.onFailure(new AdError(103, MolocoMediationAdapter.ERROR_MSG_AD_IS_NULL, MolocoMediationAdapter.ADAPTER_ERROR_DOMAIN));
        } else {
            do1Var.e = rewardedInterstitialAd;
            rewardedInterstitialAd.load(do1Var.c, do1Var);
        }
        return az2.a;
    }
}
