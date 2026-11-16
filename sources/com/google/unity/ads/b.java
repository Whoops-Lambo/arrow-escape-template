package com.google.unity.ads;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewarded.RewardItem;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((Interstitial.AnonymousClass1) obj2).lambda$onAdFailedToShowFullScreenContent$0((AdError) obj);
                break;
            case 1:
                ((Interstitial.AnonymousClass2) obj2).lambda$onPaidEvent$0((AdValue) obj);
                break;
            case 2:
                ((Interstitial.AnonymousClass3) obj2).lambda$onAdFailedToLoad$0((LoadAdError) obj);
                break;
            case 3:
                ((UnityAppOpenAd.AnonymousClass1) obj2).lambda$onPaidEvent$0((AdValue) obj);
                break;
            case 4:
                ((UnityAppOpenAd.AnonymousClass2) obj2).lambda$onAdFailedToShowFullScreenContent$0((AdError) obj);
                break;
            case 5:
                ((UnityAppOpenAd.AnonymousClass3) obj2).lambda$onAdFailedToLoad$0((LoadAdError) obj);
                break;
            case 6:
                ((UnityAppOpenAdPreloader.AnonymousClass1) obj2).lambda$onAdsExhausted$0((String) obj);
                break;
            case 7:
                ((UnityInterstitialAdPreloader.AnonymousClass1) obj2).lambda$onAdsExhausted$0((String) obj);
                break;
            case 8:
                ((UnityRewardedAd.AnonymousClass1) obj2).lambda$onPaidEvent$0((AdValue) obj);
                break;
            case 9:
                ((UnityRewardedAd.AnonymousClass2) obj2).lambda$onAdFailedToShowFullScreenContent$0((AdError) obj);
                break;
            case 10:
                ((UnityRewardedAd.AnonymousClass3) obj2).lambda$onAdFailedToLoad$0((LoadAdError) obj);
                break;
            case 11:
                ((UnityRewardedAd.AnonymousClass4) obj2).lambda$onUserEarnedReward$0((RewardItem) obj);
                break;
            case 12:
                ((UnityRewardedAdPreloader.AnonymousClass1) obj2).lambda$onAdsExhausted$0((String) obj);
                break;
            default:
                ((UnityRewardedInterstitialAd.AnonymousClass2.AnonymousClass1) obj2).lambda$onUserEarnedReward$0((RewardItem) obj);
                break;
        }
    }
}
