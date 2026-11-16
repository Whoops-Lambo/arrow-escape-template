package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import com.unity3d.services.UnityAdsConstants;
import defpackage.pv1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/RadialGradient;", "Landroidx/compose/ui/graphics/ShaderBrush;", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class RadialGradient extends ShaderBrush {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RadialGradient) && Offset.a(0L, 0L);
    }

    public final int hashCode() {
        throw null;
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    public final Shader b(long j) {
        float fD;
        float fD2;
        if (0 != Offset.d) {
            fD2 = Offset.c(0L) == Float.POSITIVE_INFINITY ? Size.d(j) : Offset.c(0L);
            fD = Offset.d(0L) == Float.POSITIVE_INFINITY ? Size.b(j) : Offset.d(0L);
        } else {
            long jB = SizeKt.b(j);
            float fC = Offset.c(jB);
            fD = Offset.d(jB);
            fD2 = fC;
        }
        OffsetKt.a(fD2, fD);
        throw null;
    }

    public final String toString() {
        String str;
        String str2 = "";
        if (OffsetKt.c(0L)) {
            str = "center=" + ((Object) Offset.h(0L)) + ", ";
        } else {
            str = "";
        }
        if (!Float.isInfinite(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) && !Float.isNaN(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
            str2 = "radius=0.0, ";
        }
        return pv1.o("RadialGradient(colors=null, stops=null, ", str, str2, "tileMode=Clamp)");
    }
}
