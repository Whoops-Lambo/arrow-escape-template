package defpackage;

import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.impl.x2;
import com.applovin.sdk.AppLovinAd;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class pi3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AppLovinAdViewEventListener b;
    public final /* synthetic */ AppLovinAd c;
    public final /* synthetic */ AppLovinAdView d;

    public /* synthetic */ pi3(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView, int i) {
        this.a = i;
        this.b = appLovinAdViewEventListener;
        this.c = appLovinAd;
        this.d = appLovinAdView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        AppLovinAdView appLovinAdView = this.d;
        AppLovinAd appLovinAd = this.c;
        AppLovinAdViewEventListener appLovinAdViewEventListener = this.b;
        switch (i) {
            case 0:
                x2.d(appLovinAdViewEventListener, appLovinAd, appLovinAdView);
                break;
            case 1:
                x2.e(appLovinAdViewEventListener, appLovinAd, appLovinAdView);
                break;
            default:
                x2.f(appLovinAdViewEventListener, appLovinAd, appLovinAdView);
                break;
        }
    }
}
