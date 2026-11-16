package defpackage;

import com.google.unity.ads.Interstitial;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class r71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Interstitial b;

    public /* synthetic */ r71(Interstitial interstitial, int i) {
        this.a = i;
        this.b = interstitial;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Interstitial interstitial = this.b;
        switch (i) {
            case 0:
                interstitial.lambda$show$0();
                break;
            case 1:
                interstitial.lambda$setInterstitialAd$0();
                break;
            default:
                interstitial.lambda$pollAd$1();
                break;
        }
    }
}
