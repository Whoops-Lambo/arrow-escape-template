package com.adsurge.adn.X;

import android.text.TextUtils;
import com.adsurge.adn.ads.AdSurgeLossReason;
import com.adsurge.adn.ads.AdSurgePlacementType;
import com.adsurge.adn.ads.AdSurgePriceStrategyType;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class n {
    public static void a(String str, Double d, String str2, AdSurgeLossReason adSurgeLossReason, String str3, AdSurgePlacementType adSurgePlacementType, AdSurgePriceStrategyType adSurgePriceStrategyType) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strA = a(str, "AUCTION_PRICE", a(d.doubleValue()));
        if (TextUtils.isEmpty(str2)) {
            str2 = "USD";
        }
        String strA2 = a(strA, "AUCTION_CURRENCY_TYPE", str2);
        if (adSurgeLossReason != null) {
            strA2 = a(strA2, "AUCTION_LOSS", String.valueOf(adSurgeLossReason.getValue()));
        }
        if (!TextUtils.isEmpty(str3)) {
            strA2 = a(strA2, "AUCTION_SEAT", str3);
        }
        if (adSurgePlacementType != null) {
            strA2 = a(strA2, "AUCTION_PLACEMENT_TYPE", String.valueOf(adSurgePlacementType.getValue()));
        }
        if (adSurgePriceStrategyType != null) {
            strA2 = a(strA2, "AUCTION_PRICE_STRATEGY_TYPE", String.valueOf(adSurgePriceStrategyType.getValue()));
        }
        v.a(strA2, true);
    }

    public static void a(String str, Double d, Double d2, String str2, AdSurgePlacementType adSurgePlacementType, AdSurgePriceStrategyType adSurgePriceStrategyType) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strA = a(a(str, "AUCTION_PRICE", a(d.doubleValue())), "AUCTION_CURRENCY_TYPE", "USD");
        if (d2 != null) {
            strA = a(strA, "AUCTION_MIN_TO_WIN_PRICE", a(d2.doubleValue()));
        }
        if (!TextUtils.isEmpty(str2)) {
            strA = a(strA, "AUCTION_MIN_TO_WIN_SEAT", str2);
        }
        if (adSurgePlacementType != null) {
            strA = a(strA, "AUCTION_MIN_TO_WIN_PLACEMENT_TYPE", String.valueOf(adSurgePlacementType.getValue()));
        }
        if (adSurgePriceStrategyType != null) {
            strA = a(strA, "AUCTION_MIN_TO_WIN_PRICE_STRATEGY_TYPE", String.valueOf(adSurgePriceStrategyType.getValue()));
        }
        v.a(strA, true);
    }

    public static String a(String str, String str2, String str3) {
        return str.replace("${" + str2 + "}", str3).replace("%24%7B" + str2 + "%7D", str3);
    }

    public static String a(double d) {
        return String.format(Locale.US, "%.6f", Double.valueOf(d));
    }
}
