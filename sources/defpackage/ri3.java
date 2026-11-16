package defpackage;

import com.applovin.impl.x2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ri3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ MaxNativeAdListener c;
    public final /* synthetic */ MaxAd d;

    public /* synthetic */ ri3(boolean z, MaxNativeAdListener maxNativeAdListener, MaxAd maxAd, int i) {
        this.a = i;
        this.b = z;
        this.c = maxNativeAdListener;
        this.d = maxAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        MaxAd maxAd = this.d;
        MaxNativeAdListener maxNativeAdListener = this.c;
        boolean z = this.b;
        switch (i) {
            case 0:
                x2.a(z, maxNativeAdListener, maxAd);
                break;
            default:
                x2.b(z, maxNativeAdListener, maxAd);
                break;
        }
    }
}
