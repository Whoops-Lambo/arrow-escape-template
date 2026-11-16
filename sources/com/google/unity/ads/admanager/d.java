package com.google.unity.ads.admanager;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((UnityAdManagerInterstitialAd.AnonymousClass1) obj).lambda$onAdShowedFullScreenContent$0();
                break;
            case 1:
                ((UnityAdManagerInterstitialAd.AnonymousClass1) obj).lambda$onAdDismissedFullScreenContent$0();
                break;
            case 2:
                ((UnityAdManagerInterstitialAd.AnonymousClass1) obj).lambda$onAdImpression$0();
                break;
            case 3:
                ((UnityAdManagerInterstitialAd.AnonymousClass1) obj).lambda$onAdClicked$0();
                break;
            default:
                ((UnityAdManagerInterstitialAd.AnonymousClass4) obj).lambda$onAdLoaded$0();
                break;
        }
    }
}
