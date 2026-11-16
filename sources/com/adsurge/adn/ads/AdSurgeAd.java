package com.adsurge.adn.ads;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AdSurgeAd {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class NoAd extends AdSurgeAd {
        public final String a;
        public final AdSurgeAdFormat b;

        @Override // com.adsurge.adn.ads.AdSurgeAd
        public void sendLossNotification(@NonNull Double d, @Nullable String str, @Nullable AdSurgeLossReason adSurgeLossReason, @Nullable String str2, @Nullable AdSurgePlacementType adSurgePlacementType, @Nullable AdSurgePriceStrategyType adSurgePriceStrategyType) {
        }

        @Override // com.adsurge.adn.ads.AdSurgeAd
        public void sendWinNotification(@NonNull Double d, @Nullable Double d2, @Nullable String str, @Nullable AdSurgePlacementType adSurgePlacementType, @Nullable AdSurgePriceStrategyType adSurgePriceStrategyType) {
        }

        @Override // com.adsurge.adn.ads.AdSurgeAd
        public String getAdUnitId() {
            return this.a;
        }

        @Override // com.adsurge.adn.ads.AdSurgeAd
        public String getCreativeId() {
            return "";
        }

        @Override // com.adsurge.adn.ads.AdSurgeAd
        public AdSurgeAdFormat getFormat() {
            return this.b;
        }

        @Override // com.adsurge.adn.ads.AdSurgeAd
        public double getRevenue() {
            return 0.0d;
        }

        @Override // com.adsurge.adn.ads.AdSurgeAd
        public AdSurgeAdSize getSize() {
            return AdSurgeAdSize.UNSPECIFIED;
        }

        public NoAd(AdSurgeAdFormat adSurgeAdFormat, String str) {
            this.a = str;
            this.b = adSurgeAdFormat;
        }
    }

    public abstract String getAdUnitId();

    public abstract String getCreativeId();

    public abstract AdSurgeAdFormat getFormat();

    public abstract double getRevenue();

    public abstract AdSurgeAdSize getSize();

    public abstract void sendLossNotification(@NonNull Double d, @Nullable String str, @Nullable AdSurgeLossReason adSurgeLossReason, @Nullable String str2, @Nullable AdSurgePlacementType adSurgePlacementType, @Nullable AdSurgePriceStrategyType adSurgePriceStrategyType);

    public abstract void sendWinNotification(@NonNull Double d, @Nullable Double d2, @Nullable String str, @Nullable AdSurgePlacementType adSurgePlacementType, @Nullable AdSurgePriceStrategyType adSurgePriceStrategyType);

    @NonNull
    public String toString() {
        return "AdSurgeAd{format=" + getFormat() + ", adUnitId='" + getAdUnitId() + "', revenue=" + getRevenue() + ", creativeId='" + getCreativeId() + "'}";
    }
}
