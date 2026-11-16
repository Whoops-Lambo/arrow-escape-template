package defpackage;

import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ae1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LevelPlayNativeAd b;
    public final /* synthetic */ AdInfo c;

    public /* synthetic */ ae1(LevelPlayNativeAd levelPlayNativeAd, AdInfo adInfo, int i) {
        this.a = i;
        this.b = levelPlayNativeAd;
        this.c = adInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        AdInfo adInfo = this.c;
        LevelPlayNativeAd levelPlayNativeAd = this.b;
        switch (i) {
            case 0:
                LevelPlayNativeAd.a(levelPlayNativeAd, adInfo);
                break;
            default:
                LevelPlayNativeAd.b(levelPlayNativeAd, adInfo);
                break;
        }
    }
}
