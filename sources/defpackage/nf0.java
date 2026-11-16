package defpackage;

import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class nf0 implements Runnable {
    public final /* synthetic */ AudienceNetworkAds.InitListener a;
    public final /* synthetic */ Throwable b;

    @Override // java.lang.Runnable
    public final void run() {
        this.a.onInitialized(DynamicLoaderFactory.createErrorInitResult(this.b));
    }

    public nf0(AudienceNetworkAds.InitListener initListener, Throwable th) {
        this.a = initListener;
        this.b = th;
    }
}
