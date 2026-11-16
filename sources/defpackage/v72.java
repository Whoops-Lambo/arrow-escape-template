package defpackage;

import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.services.ads.UnityAdsImplementation;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class v72 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ IUnityAdsInitializationListener b;

    public /* synthetic */ v72(IUnityAdsInitializationListener iUnityAdsInitializationListener, int i) {
        this.a = i;
        this.b = iUnityAdsInitializationListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        IUnityAdsInitializationListener iUnityAdsInitializationListener = this.b;
        switch (i) {
            case 0:
                iUnityAdsInitializationListener.onInitializationComplete();
                break;
            default:
                UnityAdsImplementation.lambda$initialize$0(iUnityAdsInitializationListener);
                break;
        }
    }
}
