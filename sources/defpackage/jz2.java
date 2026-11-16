package defpackage;

import com.google.unity.ads.UnityAppOpenAd;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class jz2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ UnityAppOpenAd b;

    public /* synthetic */ jz2(UnityAppOpenAd unityAppOpenAd, int i) {
        this.a = i;
        this.b = unityAppOpenAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        UnityAppOpenAd unityAppOpenAd = this.b;
        switch (i) {
            case 0:
                unityAppOpenAd.lambda$show$0();
                break;
            case 1:
                unityAppOpenAd.lambda$setAppOpenAd$0();
                break;
            default:
                unityAppOpenAd.lambda$pollAd$1();
                break;
        }
    }
}
