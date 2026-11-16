package com.google.unity.ads.nextgen;

import com.google.android.libraries.ads.mobile.sdk.common.AdValue;
import com.google.android.libraries.ads.mobile.sdk.common.FullScreenContentError;
import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;
import com.google.android.libraries.ads.mobile.sdk.rewarded.RewardItem;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        ((UnityAppOpenAd.AnonymousClass1) this.b).lambda$onAdPaid$0((AdValue) this.c);
    }

    private final void c() {
        ((UnityAppOpenAd.AnonymousClass1) this.b).lambda$onAdFailedToShowFullScreenContent$0((FullScreenContentError) this.c);
    }

    private final void d() {
        ((UnityAppOpenAd.AnonymousClass2) this.b).lambda$onAdFailedToLoad$0((LoadAdError) this.c);
    }

    private final void e() {
        ((UnityBannerAd.AnonymousClass1) this.b).lambda$onAdFailedToLoad$0((LoadAdError) this.c);
    }

    private final void f() {
        ((UnityBannerAd.AnonymousClass1.C03111) this.b).lambda$onAdPaid$0((AdValue) this.c);
    }

    private final void g() {
        ((UnityInterstitialAd.AnonymousClass1) this.b).lambda$onAdFailedToLoad$0((LoadAdError) this.c);
    }

    private final void h() {
        ((UnityInterstitialAd.AnonymousClass2) this.b).lambda$onAdFailedToShowFullScreenContent$0((FullScreenContentError) this.c);
    }

    private final void i() {
        ((UnityInterstitialAd.AnonymousClass2) this.b).lambda$onAdPaid$0((AdValue) this.c);
    }

    private final void j() {
        ((UnityNativeTemplateAd.AnonymousClass2) this.b).lambda$onAdFailedToLoad$0((LoadAdError) this.c);
    }

    private final void k() {
        ((UnityNativeTemplateAd.AnonymousClass3) this.b).lambda$onAdPaid$0((AdValue) this.c);
    }

    private final void l() {
        ((UnityRewardedAd.AnonymousClass1) this.b).lambda$onAdFailedToLoad$0((LoadAdError) this.c);
    }

    private final void m() {
        ((UnityRewardedAd.AnonymousClass2) this.b).lambda$onAdPaid$0((AdValue) this.c);
    }

    private final void n() {
        ((UnityRewardedAd.AnonymousClass2) this.b).lambda$onAdFailedToShowFullScreenContent$0((FullScreenContentError) this.c);
    }

    private final void o() {
        ((UnityRewardedAd.AnonymousClass3) this.b).lambda$onUserEarnedReward$0((RewardItem) this.c);
    }

    private final void p() {
        ((UnityRewardedInterstitialAd.AnonymousClass1) this.b).lambda$onAdFailedToLoad$0((LoadAdError) this.c);
    }

    private final void q() {
        ((UnityRewardedInterstitialAd.AnonymousClass2) this.b).lambda$onAdFailedToShowFullScreenContent$0((FullScreenContentError) this.c);
    }

    private final void r() {
        ((UnityRewardedInterstitialAd.AnonymousClass2) this.b).lambda$onAdPaid$0((AdValue) this.c);
    }

    private final void s() {
        ((UnityRewardedInterstitialAd.AnonymousClass3) this.b).lambda$onUserEarnedReward$0((RewardItem) this.c);
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                a();
                break;
            case 1:
                c();
                break;
            case 2:
                d();
                break;
            case 3:
                ((UnityAppOpenAdPreloader.AnonymousClass1) obj2).lambda$onAdsExhausted$0((String) obj);
                break;
            case 4:
                e();
                break;
            case 5:
                f();
                break;
            case 6:
                ((UnityBannerAdPreloader.AnonymousClass1) obj2).lambda$onAdsExhausted$0((String) obj);
                break;
            case 7:
                g();
                break;
            case 8:
                h();
                break;
            case 9:
                i();
                break;
            case 10:
                ((UnityInterstitialAdPreloader.AnonymousClass1) obj2).lambda$onAdsExhausted$0((String) obj);
                break;
            case 11:
                j();
                break;
            case 12:
                k();
                break;
            case 13:
                l();
                break;
            case 14:
                m();
                break;
            case 15:
                n();
                break;
            case 16:
                o();
                break;
            case 17:
                ((UnityRewardedAdPreloader.AnonymousClass1) obj2).lambda$onAdsExhausted$0((String) obj);
                break;
            case 18:
                p();
                break;
            case 19:
                q();
                break;
            case 20:
                r();
                break;
            case 21:
                s();
                break;
            default:
                ((UnityRewardedInterstitialAdPreloader.AnonymousClass1) obj2).lambda$onAdsExhausted$0((String) obj);
                break;
        }
    }
}
