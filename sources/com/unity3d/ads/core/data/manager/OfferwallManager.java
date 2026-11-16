package com.unity3d.ads.core.data.manager;

import com.ironsource.C4962rg;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.h;
import defpackage.bp0;
import defpackage.dy;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H¦@¢\u0006\u0004\b\u0006\u0010\u0004J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H¦@¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u000b\u0010\tJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/unity3d/ads/core/data/manager/OfferwallManager;", "", "", C4962rg.b, "(Ldy;)Ljava/lang/Object;", "", "isConnected", "placementName", "isAdReady", "(Ljava/lang/String;Ldy;)Ljava/lang/Object;", "Laz2;", "loadAd", "Lbp0;", "Lcom/unity3d/ads/core/domain/offerwall/OfferwallEventData;", h.aj, "(Ljava/lang/String;)Lbp0;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface OfferwallManager {
    @Nullable
    Object getVersion(@NotNull dy dyVar);

    @Nullable
    Object isAdReady(@NotNull String str, @NotNull dy dyVar);

    @Nullable
    Object isConnected(@NotNull dy dyVar);

    @Nullable
    Object loadAd(@NotNull String str, @NotNull dy dyVar);

    @NotNull
    bp0 showAd(@NotNull String placementName);
}
