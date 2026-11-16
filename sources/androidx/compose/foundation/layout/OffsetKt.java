package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import com.unity3d.services.UnityAdsConstants;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation-layout_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class OffsetKt {
    public static Modifier b(Modifier modifier, float f, int i) {
        int i2 = i & 1;
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (i2 != 0) {
            f = 0.0f;
        }
        if ((i & 2) == 0) {
            f2 = -1.0f;
        }
        modifier.getClass();
        return modifier.N(new OffsetModifier(f, f2, InspectableValueKt.a()));
    }

    public static final Modifier a(Modifier modifier, wr0 wr0Var) {
        modifier.getClass();
        wr0Var.getClass();
        return modifier.N(new OffsetPxModifier(wr0Var, InspectableValueKt.a()));
    }
}
