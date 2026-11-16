package androidx.compose.material;

import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import com.unity3d.services.UnityAdsConstants;
import defpackage.rc1;
import defpackage.sr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/material/Shapes;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
public final class ShapesKt$LocalShapes$1 extends rc1 implements sr0 {
    public static final ShapesKt$LocalShapes$1 i = new ShapesKt$LocalShapes$1(0);

    @Override // defpackage.sr0
    public final Object invoke() {
        return new Shapes(RoundedCornerShapeKt.a(4.0f), RoundedCornerShapeKt.a(4.0f), RoundedCornerShapeKt.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
    }
}
