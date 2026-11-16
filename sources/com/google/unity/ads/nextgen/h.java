package com.google.unity.ads.nextgen;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ UnityNativeTemplateAd.AnonymousClass3 b;

    public /* synthetic */ h(UnityNativeTemplateAd.AnonymousClass3 anonymousClass3, int i) {
        this.a = i;
        this.b = anonymousClass3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        UnityNativeTemplateAd.AnonymousClass3 anonymousClass3 = this.b;
        switch (i) {
            case 0:
                anonymousClass3.lambda$onAdShowedFullScreenContent$0();
                break;
            case 1:
                anonymousClass3.lambda$onAdDismissedFullScreenContent$0();
                break;
            case 2:
                anonymousClass3.lambda$onAdImpression$0();
                break;
            default:
                anonymousClass3.lambda$onAdClicked$0();
                break;
        }
    }
}
