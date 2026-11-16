package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme;

import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.Shapes;
import com.unity3d.services.UnityAdsConstants;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class c {

    @NotNull
    public static final Shapes a = new Shapes(RoundedCornerShapeKt.a(4.0f), RoundedCornerShapeKt.a(4.0f), RoundedCornerShapeKt.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));

    @NotNull
    public static final Shapes a() {
        return a;
    }
}
