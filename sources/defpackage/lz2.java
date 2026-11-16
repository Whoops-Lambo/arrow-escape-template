package defpackage;

import com.google.unity.ads.nextgen.UnityBannerAd;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class lz2 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ UnityBannerAd b;

    public /* synthetic */ lz2(UnityBannerAd unityBannerAd, int i) {
        this.a = i;
        this.b = unityBannerAd;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.a;
        UnityBannerAd unityBannerAd = this.b;
        switch (i) {
            case 0:
                return unityBannerAd.lambda$getWidthInPixels$0();
            default:
                return unityBannerAd.lambda$getHeightInPixels$0();
        }
    }
}
