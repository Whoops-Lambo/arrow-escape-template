package defpackage;

import com.google.unity.ads.nextgen.UnityBannerAd;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class kz2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ UnityBannerAd b;

    public /* synthetic */ kz2(UnityBannerAd unityBannerAd, int i) {
        this.a = i;
        this.b = unityBannerAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        UnityBannerAd unityBannerAd = this.b;
        switch (i) {
            case 0:
                unityBannerAd.lambda$show$0();
                break;
            case 1:
                unityBannerAd.lambda$destroy$0();
                break;
            default:
                unityBannerAd.lambda$hide$0();
                break;
        }
    }
}
