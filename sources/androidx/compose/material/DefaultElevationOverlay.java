package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/DefaultElevationOverlay;", "Landroidx/compose/material/ElevationOverlay;", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class DefaultElevationOverlay implements ElevationOverlay {
    public static final DefaultElevationOverlay a = new DefaultElevationOverlay();

    @Override // androidx.compose.material.ElevationOverlay
    public final long a(long j, float f, Composer composer, int i) {
        Colors colorsA = MaterialTheme.a(composer);
        if (Float.compare(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > 0 && !colorsA.g()) {
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ElevationOverlayKt.a;
            return ColorKt.d(Color.b(ColorsKt.b(j, composer), ((((float) Math.log(f + 1.0f)) * 4.5f) + 2.0f) / 100.0f), j);
        }
        return j;
    }
}
