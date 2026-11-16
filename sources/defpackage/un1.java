package defpackage;

import com.applovin.mediation.adapter.listeners.MaxAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapters.MolocoMediationAdapter;
import com.moloco.sdk.publisher.InterstitialAd;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.RewardedInterstitialAd;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class un1 implements zr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MolocoMediationAdapter b;
    public final /* synthetic */ MaxAdapterResponseParameters c;
    public final /* synthetic */ MaxAdapterListener d;

    public /* synthetic */ un1(MolocoMediationAdapter molocoMediationAdapter, MaxAdapterListener maxAdapterListener, MaxAdapterResponseParameters maxAdapterResponseParameters, int i) {
        this.a = i;
        this.b = molocoMediationAdapter;
        this.d = maxAdapterListener;
        this.c = maxAdapterResponseParameters;
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        MaxAdapterResponseParameters maxAdapterResponseParameters = this.c;
        MaxAdapterListener maxAdapterListener = this.d;
        MolocoMediationAdapter molocoMediationAdapter = this.b;
        switch (i) {
            case 0:
                return molocoMediationAdapter.lambda$loadInterstitialAd$2((MaxInterstitialAdapterListener) maxAdapterListener, maxAdapterResponseParameters, (InterstitialAd) obj, (MolocoAdError.AdCreateError) obj2);
            default:
                return molocoMediationAdapter.lambda$loadRewardedAd$3((MaxRewardedAdapterListener) maxAdapterListener, maxAdapterResponseParameters, (RewardedInterstitialAd) obj, (MolocoAdError.AdCreateError) obj2);
        }
    }
}
