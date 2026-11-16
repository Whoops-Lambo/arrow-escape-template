package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.CacheRepository;
import defpackage.az2;
import defpackage.dy;
import defpackage.dz;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t¨\u0006\n"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonCleanAssets;", "Lcom/unity3d/ads/core/domain/CleanAssets;", "Lcom/unity3d/ads/core/data/repository/CacheRepository;", "cacheRepository", "<init>", "(Lcom/unity3d/ads/core/data/repository/CacheRepository;)V", "Laz2;", "invoke", "(Ldy;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/data/repository/CacheRepository;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CommonCleanAssets implements CleanAssets {

    @NotNull
    private final CacheRepository cacheRepository;

    @Override // com.unity3d.ads.core.domain.CleanAssets
    @Nullable
    public Object invoke(@NotNull dy dyVar) {
        Object objClearCache = this.cacheRepository.clearCache(dyVar);
        return objClearCache == dz.a ? objClearCache : az2.a;
    }

    public CommonCleanAssets(@NotNull CacheRepository cacheRepository) {
        cacheRepository.getClass();
        this.cacheRepository = cacheRepository;
    }
}
