package androidx.compose.foundation.shape;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;
import defpackage.s71;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/shape/RoundedCornerShape;", "Landroidx/compose/foundation/shape/CornerBasedShape;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class RoundedCornerShape extends CornerBasedShape {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoundedCornerShape)) {
            return false;
        }
        RoundedCornerShape roundedCornerShape = (RoundedCornerShape) obj;
        return s71.b(this.a, roundedCornerShape.a) && s71.b(this.b, roundedCornerShape.b) && s71.b(this.c, roundedCornerShape.c) && s71.b(this.d, roundedCornerShape.d);
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    public final Outline b(long j, float f, float f2, float f3, float f4, LayoutDirection layoutDirection) {
        layoutDirection.getClass();
        if (f + f2 + f3 + f4 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return new Outline.Rectangle(SizeKt.c(j));
        }
        Rect rectC = SizeKt.c(j);
        LayoutDirection layoutDirection2 = LayoutDirection.a;
        float f5 = layoutDirection == layoutDirection2 ? f : f2;
        long jA = CornerRadiusKt.a(f5, f5);
        float f6 = layoutDirection == layoutDirection2 ? f2 : f;
        long jA2 = CornerRadiusKt.a(f6, f6);
        float f7 = layoutDirection == layoutDirection2 ? f3 : f4;
        long jA3 = CornerRadiusKt.a(f7, f7);
        float f8 = layoutDirection == layoutDirection2 ? f4 : f3;
        return new Outline.Rounded(new RoundRect(rectC.a, rectC.b, rectC.c, rectC.d, jA, jA2, jA3, CornerRadiusKt.a(f8, f8)));
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.a + ", topEnd = " + this.b + ", bottomEnd = " + this.c + ", bottomStart = " + this.d + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundedCornerShape(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        super(cornerSize, cornerSize2, cornerSize3, cornerSize4);
        cornerSize.getClass();
        cornerSize2.getClass();
        cornerSize3.getClass();
        cornerSize4.getClass();
    }
}
