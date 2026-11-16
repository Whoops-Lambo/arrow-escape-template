package com.unity3d.ads.core.domain;

import com.ironsource.Yf;
import com.unity3d.ads.UnityAdsError;
import com.unity3d.ads.core.data.model.AdObject;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/unity3d/ads/core/domain/InternalLoadListener;", "", "Lcom/unity3d/ads/core/data/model/AdObject;", "adObject", "Laz2;", Yf.j, "(Lcom/unity3d/ads/core/data/model/AdObject;)V", "Lcom/unity3d/ads/UnityAdsError;", "error", "onAdLoadFail", "(Lcom/unity3d/ads/UnityAdsError;)V", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface InternalLoadListener {
    void onAdLoadFail(@NotNull UnityAdsError error);

    void onAdLoaded(@NotNull AdObject adObject);
}
