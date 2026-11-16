package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils;

import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.h;
import com.unity3d.services.UnityAdsConstants;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class b {
    @NotNull
    public static final d a(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c cVar) {
        cVar.getClass();
        return new d(cVar, new g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), new h(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
    }
}
