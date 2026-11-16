package com.google.unity.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Interstitial.AnonymousClass1 b;

    public /* synthetic */ a(Interstitial.AnonymousClass1 anonymousClass1, int i) {
        this.a = i;
        this.b = anonymousClass1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Interstitial.AnonymousClass1 anonymousClass1 = this.b;
        switch (i) {
            case 0:
                anonymousClass1.lambda$onAdDismissedFullScreenContent$0();
                break;
            case 1:
                anonymousClass1.lambda$onAdClicked$0();
                break;
            case 2:
                anonymousClass1.lambda$onAdImpression$0();
                break;
            default:
                anonymousClass1.lambda$onAdShowedFullScreenContent$0();
                break;
        }
    }
}
