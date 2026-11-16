package defpackage;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.unity.MaxUnityAdManager;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class zi1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MaxUnityAdManager b;
    public final /* synthetic */ MaxAd c;

    public /* synthetic */ zi1(MaxUnityAdManager maxUnityAdManager, MaxAd maxAd, int i) {
        this.a = i;
        this.b = maxUnityAdManager;
        this.c = maxAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        MaxAd maxAd = this.c;
        MaxUnityAdManager maxUnityAdManager = this.b;
        switch (i) {
            case 0:
                maxUnityAdManager.lambda$onAdLoaded$7(maxAd);
                break;
            case 1:
                maxUnityAdManager.lambda$onAdClicked$9(maxAd);
                break;
            case 2:
                maxUnityAdManager.lambda$onAdCollapsed$13(maxAd);
                break;
            case 3:
                maxUnityAdManager.lambda$onAdDisplayed$10(maxAd);
                break;
            case 4:
                maxUnityAdManager.lambda$onAdRevenuePaid$16(maxAd);
                break;
            case 5:
                maxUnityAdManager.lambda$onAdExpanded$14(maxAd);
                break;
            default:
                maxUnityAdManager.lambda$onAdHidden$12(maxAd);
                break;
        }
    }
}
