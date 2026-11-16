package defpackage;

import com.applovin.impl.x2;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdRewardListener;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ni3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AppLovinAdRewardListener b;
    public final /* synthetic */ AppLovinAd c;
    public final /* synthetic */ Map d;

    public /* synthetic */ ni3(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, Map map, int i) {
        this.a = i;
        this.b = appLovinAdRewardListener;
        this.c = appLovinAd;
        this.d = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Map map = this.d;
        AppLovinAd appLovinAd = this.c;
        AppLovinAdRewardListener appLovinAdRewardListener = this.b;
        switch (i) {
            case 0:
                x2.e(appLovinAdRewardListener, appLovinAd, map);
                break;
            case 1:
                x2.d(appLovinAdRewardListener, appLovinAd, map);
                break;
            default:
                x2.f(appLovinAdRewardListener, appLovinAd, map);
                break;
        }
    }
}
