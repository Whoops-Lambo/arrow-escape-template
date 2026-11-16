package defpackage;

import com.google.unity.ads.admanager.UnityAdManagerInterstitialAd;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class cz2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ UnityAdManagerInterstitialAd b;

    public /* synthetic */ cz2(UnityAdManagerInterstitialAd unityAdManagerInterstitialAd, int i) {
        this.a = i;
        this.b = unityAdManagerInterstitialAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        UnityAdManagerInterstitialAd unityAdManagerInterstitialAd = this.b;
        switch (i) {
            case 0:
                unityAdManagerInterstitialAd.lambda$show$0();
                break;
            default:
                unityAdManagerInterstitialAd.lambda$pollAd$0();
                break;
        }
    }
}
