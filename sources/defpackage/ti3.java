package defpackage;

import com.applovin.impl.x2;
import com.applovin.sdk.AppLovinBidTokenCollectionListener;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class ti3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AppLovinBidTokenCollectionListener b;
    public final /* synthetic */ String c;

    public /* synthetic */ ti3(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener, String str, int i) {
        this.a = i;
        this.b = appLovinBidTokenCollectionListener;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        String str = this.c;
        AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener = this.b;
        switch (i) {
            case 0:
                x2.c(appLovinBidTokenCollectionListener, str);
                break;
            default:
                x2.d(appLovinBidTokenCollectionListener, str);
                break;
        }
    }
}
