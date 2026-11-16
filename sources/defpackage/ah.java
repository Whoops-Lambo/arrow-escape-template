package defpackage;

import com.ironsource.Gb;
import com.unity3d.ironsourceads.banner.BannerAdLoader;
import com.unity3d.ironsourceads.interstitial.InterstitialAdLoader;
import com.unity3d.ironsourceads.rewarded.RewardedAdLoader;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ah implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Gb b;

    public /* synthetic */ ah(Gb gb, int i) {
        this.a = i;
        this.b = gb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Gb gb = this.b;
        switch (i) {
            case 0:
                BannerAdLoader.a(gb);
                break;
            case 1:
                InterstitialAdLoader.a(gb);
                break;
            default:
                RewardedAdLoader.a(gb);
                break;
        }
    }
}
