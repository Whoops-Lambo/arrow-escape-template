package defpackage;

import com.unity3d.ads.IUnityAdsTokenListener;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class dz2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ IUnityAdsTokenListener b;

    public /* synthetic */ dz2(IUnityAdsTokenListener iUnityAdsTokenListener, int i) {
        this.a = i;
        this.b = iUnityAdsTokenListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        IUnityAdsTokenListener iUnityAdsTokenListener = this.b;
        switch (i) {
            case 0:
                iUnityAdsTokenListener.onUnityAdsTokenReady(null);
                break;
            default:
                iUnityAdsTokenListener.onUnityAdsTokenReady(null);
                break;
        }
    }
}
