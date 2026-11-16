package defpackage;

import com.adsurge.adn.ads.AdSurgeAd;
import com.adsurge.adn.p055s.d;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class kc3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;
    public final /* synthetic */ AdSurgeAd c;

    public /* synthetic */ kc3(d dVar, AdSurgeAd adSurgeAd, int i) {
        this.a = i;
        this.b = dVar;
        this.c = adSurgeAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        AdSurgeAd adSurgeAd = this.c;
        d dVar = this.b;
        switch (i) {
            case 0:
                dVar.d(adSurgeAd);
                break;
            case 1:
                dVar.a(adSurgeAd);
                break;
            case 2:
                dVar.c(adSurgeAd);
                break;
            default:
                dVar.b(adSurgeAd);
                break;
        }
    }
}
