package com.moloco.sdk.publisher;

import com.ironsource.Yf;
import com.mbridge.msdk.MBridgeConstans;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/moloco/sdk/publisher/MolocoAdapterBannerListener;", "Lcom/moloco/sdk/publisher/BannerAdShowListener;", "Lcom/moloco/sdk/publisher/MolocoAd;", "ad", "Lcom/moloco/sdk/publisher/Banner;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Laz2;", Yf.j, "(Lcom/moloco/sdk/publisher/MolocoAd;Lcom/moloco/sdk/publisher/Banner;)V", "Lcom/moloco/sdk/publisher/MolocoAdError;", "error", Yf.b, "(Lcom/moloco/sdk/publisher/MolocoAdError;)V", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface MolocoAdapterBannerListener extends BannerAdShowListener {
    void onAdLoadFailed(@NotNull MolocoAdError error);

    void onAdLoaded(@NotNull MolocoAd ad, @NotNull Banner view);
}
