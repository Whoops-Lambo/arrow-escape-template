package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils;

import android.content.res.Resources;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.h;
import com.unity3d.services.UnityAdsConstants;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred
public final class c {

    @NotNull
    public static final c a = new c();
    public static final int b = 0;

    @NotNull
    public final g a(@NotNull LayoutCoordinates layoutCoordinates) {
        layoutCoordinates.getClass();
        return new g(a((int) Offset.c(LayoutCoordinatesKt.e(layoutCoordinates))), a((int) Offset.d(LayoutCoordinatesKt.e(layoutCoordinates))));
    }

    @NotNull
    public final h b(@NotNull LayoutCoordinates layoutCoordinates) {
        layoutCoordinates.getClass();
        return new h(a((int) (layoutCoordinates.d() >> 32)), a((int) (layoutCoordinates.d() & 4294967295L)));
    }

    public final boolean a(@NotNull d dVar) {
        dVar.getClass();
        h hVar = dVar.c;
        return hVar.b > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && hVar.a > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final float a(int i) {
        return i / Resources.getSystem().getDisplayMetrics().density;
    }

    @NotNull
    public final g a(long j) {
        return new g(a((int) Offset.c(j)), a((int) Offset.d(j)));
    }

    @NotNull
    public final d a(@NotNull LayoutCoordinates layoutCoordinates, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c cVar) {
        layoutCoordinates.getClass();
        cVar.getClass();
        return new d(cVar, a(layoutCoordinates), b(layoutCoordinates));
    }
}
