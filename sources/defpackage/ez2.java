package defpackage;

import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ez2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ IUnityAdsInitializationListener b;
    public final /* synthetic */ Throwable c;

    public /* synthetic */ ez2(IUnityAdsInitializationListener iUnityAdsInitializationListener, Throwable th, int i) {
        this.a = i;
        this.b = iUnityAdsInitializationListener;
        this.c = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Throwable th = this.c;
        IUnityAdsInitializationListener iUnityAdsInitializationListener = this.b;
        switch (i) {
            case 0:
                UnityAds.initialize$lambda$9$lambda$8$lambda$7(iUnityAdsInitializationListener, th);
                break;
            default:
                UnityAds.initialize$lambda$4$lambda$3$lambda$2(iUnityAdsInitializationListener, th);
                break;
        }
    }
}
