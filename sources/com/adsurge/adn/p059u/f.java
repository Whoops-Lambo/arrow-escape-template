package com.adsurge.adn.p059u;

import com.adsurge.adn.Q.b;
import com.adsurge.adn.X.n;
import com.adsurge.adn.ads.AdSurgeAd;
import com.adsurge.adn.ads.AdSurgeAdFormat;
import com.adsurge.adn.ads.AdSurgeAdSize;
import com.adsurge.adn.ads.AdSurgeLossReason;
import com.adsurge.adn.ads.AdSurgePlacementType;
import com.adsurge.adn.ads.AdSurgePriceStrategyType;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class f {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a extends AdSurgeAd {
        public final /* synthetic */ b a;

        public a(b bVar) {
            this.a = bVar;
        }

        @Override // com.adsurge.adn.ads.AdSurgeAd
        public String getAdUnitId() {
            return this.a.y();
        }

        @Override // com.adsurge.adn.ads.AdSurgeAd
        public String getCreativeId() {
            return this.a.j();
        }

        @Override // com.adsurge.adn.ads.AdSurgeAd
        public AdSurgeAdFormat getFormat() {
            return this.a.x();
        }

        @Override // com.adsurge.adn.ads.AdSurgeAd
        public double getRevenue() {
            return this.a.b0();
        }

        @Override // com.adsurge.adn.ads.AdSurgeAd
        public AdSurgeAdSize getSize() {
            return this.a.x().getSize();
        }

        @Override // com.adsurge.adn.ads.AdSurgeAd
        public void sendLossNotification(Double d, String str, AdSurgeLossReason adSurgeLossReason, String str2, AdSurgePlacementType adSurgePlacementType, AdSurgePriceStrategyType adSurgePriceStrategyType) {
            n.a(this.a.T(), d, str, adSurgeLossReason, str2, adSurgePlacementType, adSurgePriceStrategyType);
        }

        @Override // com.adsurge.adn.ads.AdSurgeAd
        public void sendWinNotification(Double d, Double d2, String str, AdSurgePlacementType adSurgePlacementType, AdSurgePriceStrategyType adSurgePriceStrategyType) {
            n.a(this.a.W(), d, d2, str, adSurgePlacementType, adSurgePriceStrategyType);
        }
    }

    public static AdSurgeAd a(b bVar) {
        return new a(bVar);
    }
}
