package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScopeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectableValueKt;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class ShadowKt {
    public static Modifier a(Modifier modifier, float f, Shape shape) {
        long j = GraphicsLayerScopeKt.a;
        modifier.getClass();
        shape.getClass();
        if (Float.compare(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) <= 0) {
            return modifier;
        }
        InspectableValueKt.a();
        return InspectableValueKt.b(modifier, GraphicsLayerModifierKt.a(Modifier.Companion.a, new ShadowKt$shadow$2$1(f, shape, j, j)));
    }
}
