package defpackage;

import com.applovin.impl.x2;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdDisplayListener;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class si3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AppLovinAdDisplayListener b;
    public final /* synthetic */ AppLovinAd c;

    public /* synthetic */ si3(AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAd appLovinAd, int i) {
        this.a = i;
        this.b = appLovinAdDisplayListener;
        this.c = appLovinAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        AppLovinAd appLovinAd = this.c;
        AppLovinAdDisplayListener appLovinAdDisplayListener = this.b;
        switch (i) {
            case 0:
                x2.c(appLovinAdDisplayListener, appLovinAd);
                break;
            default:
                x2.d(appLovinAdDisplayListener, appLovinAd);
                break;
        }
    }
}
