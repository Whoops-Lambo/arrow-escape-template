package com.vungle.ads;

import com.ironsource.Yf;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/RewardedAdListener;", "Lcom/vungle/ads/FullscreenAdListener;", "Lcom/vungle/ads/BaseAd;", "baseAd", "Laz2;", Yf.i, "(Lcom/vungle/ads/BaseAd;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface RewardedAdListener extends FullscreenAdListener {
    void onAdRewarded(@NotNull BaseAd baseAd);
}
