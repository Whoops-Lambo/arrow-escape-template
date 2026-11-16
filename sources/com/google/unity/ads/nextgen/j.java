package com.google.unity.ads.nextgen;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ UnityRewardedInterstitialAd.AnonymousClass2 b;

    public /* synthetic */ j(UnityRewardedInterstitialAd.AnonymousClass2 anonymousClass2, int i) {
        this.a = i;
        this.b = anonymousClass2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        UnityRewardedInterstitialAd.AnonymousClass2 anonymousClass2 = this.b;
        switch (i) {
            case 0:
                anonymousClass2.lambda$onAdShowedFullScreenContent$0();
                break;
            case 1:
                anonymousClass2.lambda$onAdDismissedFullScreenContent$0();
                break;
            case 2:
                anonymousClass2.lambda$onAdImpression$0();
                break;
            default:
                anonymousClass2.lambda$onAdClicked$0();
                break;
        }
    }
}
