package defpackage;

import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.unity.MaxUnityAdManager;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class aj1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MaxUnityAdManager b;
    public final /* synthetic */ String c;
    public final /* synthetic */ MaxAdFormat d;

    public /* synthetic */ aj1(MaxUnityAdManager maxUnityAdManager, MaxAdFormat maxAdFormat, String str, int i) {
        this.a = i;
        this.b = maxUnityAdManager;
        this.d = maxAdFormat;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        MaxAdFormat maxAdFormat = this.d;
        String str = this.c;
        MaxUnityAdManager maxUnityAdManager = this.b;
        switch (i) {
            case 0:
                maxUnityAdManager.lambda$hideAdView$27(maxAdFormat, str);
                break;
            case 1:
                maxUnityAdManager.lambda$positionAdView$33(str, maxAdFormat);
                break;
            case 2:
                maxUnityAdManager.lambda$destroyAdView$28(maxAdFormat, str);
                break;
            case 3:
                maxUnityAdManager.lambda$showAdView$26(maxAdFormat, str);
                break;
            case 4:
                maxUnityAdManager.lambda$stopAdViewAutoRefresh$23(maxAdFormat, str);
                break;
            case 5:
                maxUnityAdManager.lambda$startAdViewAutoRefresh$22(maxAdFormat, str);
                break;
            default:
                maxUnityAdManager.lambda$loadAdView$20(str, maxAdFormat);
                break;
        }
    }

    public /* synthetic */ aj1(MaxUnityAdManager maxUnityAdManager, String str, MaxAdFormat maxAdFormat, int i) {
        this.a = i;
        this.b = maxUnityAdManager;
        this.c = str;
        this.d = maxAdFormat;
    }
}
