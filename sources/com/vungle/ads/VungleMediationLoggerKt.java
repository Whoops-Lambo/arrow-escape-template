package com.vungle.ads;

import com.vungle.ads.internal.util.s;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"vungle-ads_release"}, k = 2, mv = {1, 7, 1})
public final class VungleMediationLoggerKt {
    public static final s access$getAdLogEntry(VungleAdType vungleAdType) {
        if (vungleAdType instanceof BaseAd) {
            return ((BaseAd) vungleAdType).getLogEntry();
        }
        if (vungleAdType instanceof VungleBannerView) {
            return ((VungleBannerView) vungleAdType).getLogEntry$vungle_ads_release();
        }
        return null;
    }
}
