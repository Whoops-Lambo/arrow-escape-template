package com.google.unity.ads.nextgen;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ UnityBannerAd.AnonymousClass1.C03111 b;

    public /* synthetic */ f(UnityBannerAd.AnonymousClass1.C03111 c03111, int i) {
        this.a = i;
        this.b = c03111;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        UnityBannerAd.AnonymousClass1.C03111 c03111 = this.b;
        switch (i) {
            case 0:
                c03111.lambda$onAdClicked$0();
                break;
            case 1:
                c03111.lambda$onAdImpression$0();
                break;
            case 2:
                c03111.lambda$onAdShowedFullScreenContent$0();
                break;
            default:
                c03111.lambda$onAdDismissedFullScreenContent$0();
                break;
        }
    }
}
