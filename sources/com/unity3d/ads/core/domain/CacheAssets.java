package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.AdObject;
import defpackage.dy;
import gatewayprotocol.v1.CampaignMetadataOuterClass;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J&\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H¦B¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/unity3d/ads/core/domain/CacheAssets;", "", "Lcom/unity3d/ads/core/data/model/AdObject;", "adObject", "", "Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignAsset;", "assets", "Lcom/unity3d/ads/core/domain/CacheAssetsEvent;", "invoke", "(Lcom/unity3d/ads/core/data/model/AdObject;Ljava/util/List;Ldy;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface CacheAssets {
    @Nullable
    Object invoke(@NotNull AdObject adObject, @NotNull List<CampaignMetadataOuterClass.CampaignAsset> list, @NotNull dy dyVar);
}
