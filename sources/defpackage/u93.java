package defpackage;

import com.adsurge.adn.ads.AdSurgeAd;
import com.adsurge.adn.p022g.a;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class u93 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;
    public final /* synthetic */ AdSurgeAd c;

    public /* synthetic */ u93(a aVar, AdSurgeAd adSurgeAd, int i) {
        this.a = i;
        this.b = aVar;
        this.c = adSurgeAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        AdSurgeAd adSurgeAd = this.c;
        a aVar = this.b;
        switch (i) {
            case 0:
                aVar.c(adSurgeAd);
                break;
            case 1:
                aVar.d(adSurgeAd);
                break;
            case 2:
                aVar.a(adSurgeAd);
                break;
            default:
                aVar.b(adSurgeAd);
                break;
        }
    }
}
