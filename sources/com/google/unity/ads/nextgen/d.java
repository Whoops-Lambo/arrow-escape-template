package com.google.unity.ads.nextgen;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
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
                ((UnityAppOpenAd.AnonymousClass2) obj).lambda$onAdLoaded$0();
                break;
            case 1:
                ((UnityBannerAd.AnonymousClass1) obj).lambda$onAdLoaded$0();
                break;
            case 2:
                ((UnityInterstitialAd.AnonymousClass1) obj).lambda$onAdLoaded$0();
                break;
            case 3:
                ((UnityNativeTemplateAd.AnonymousClass2) obj).lambda$onNativeAdLoaded$0();
                break;
            case 4:
                ((UnityRewardedAd.AnonymousClass1) obj).lambda$onAdLoaded$0();
                break;
            default:
                ((UnityRewardedInterstitialAd.AnonymousClass1) obj).lambda$onAdLoaded$0();
                break;
        }
    }
}
