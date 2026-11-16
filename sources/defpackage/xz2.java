package defpackage;

import com.google.unity.ads.UnityRewardedAd;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class xz2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ UnityRewardedAd b;

    public /* synthetic */ xz2(UnityRewardedAd unityRewardedAd, int i) {
        this.a = i;
        this.b = unityRewardedAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        UnityRewardedAd unityRewardedAd = this.b;
        switch (i) {
            case 0:
                unityRewardedAd.lambda$setRewardedAd$0();
                break;
            case 1:
                unityRewardedAd.lambda$show$0();
                break;
            default:
                unityRewardedAd.lambda$pollAd$1();
                break;
        }
    }
}
