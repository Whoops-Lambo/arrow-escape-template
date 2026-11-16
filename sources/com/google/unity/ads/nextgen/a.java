package com.google.unity.ads.nextgen;

import com.google.android.libraries.ads.mobile.sdk.appopen.AppOpenAd;
import com.google.android.libraries.ads.mobile.sdk.common.AdLoadCallback;
import com.google.android.libraries.ads.mobile.sdk.common.AdRequest;
import com.google.android.libraries.ads.mobile.sdk.interstitial.InterstitialAd;
import com.google.android.libraries.ads.mobile.sdk.rewarded.RewardedAd;
import com.google.android.libraries.ads.mobile.sdk.rewardedinterstitial.RewardedInterstitialAd;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements AdWrapper.AdLoader {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i) {
        this.a = i;
    }

    @Override // com.google.unity.ads.nextgen.AdWrapper.AdLoader
    public final void load(AdRequest adRequest, AdLoadCallback adLoadCallback) {
        switch (this.a) {
            case 0:
                RewardedAd.load(adRequest, adLoadCallback);
                break;
            case 1:
                AppOpenAd.load(adRequest, adLoadCallback);
                break;
            case 2:
                RewardedInterstitialAd.load(adRequest, adLoadCallback);
                break;
            default:
                InterstitialAd.load(adRequest, adLoadCallback);
                break;
        }
    }
}
