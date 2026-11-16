package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.InnerPlaceable;
import androidx.compose.ui.node.LayoutNodeWrapper;
import com.unity3d.services.UnityAdsConstants;
import defpackage.uu;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class LayoutCoordinatesKt {
    public static final Rect a(InnerPlaceable innerPlaceable) {
        innerPlaceable.getClass();
        LayoutNodeWrapper layoutNodeWrapperM = innerPlaceable.m();
        if (layoutNodeWrapperM != null) {
            return layoutNodeWrapperM.k(innerPlaceable, true);
        }
        long j = innerPlaceable.c;
        return new Rect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (int) (j >> 32), (int) (j & 4294967295L));
    }

    public static final Rect b(LayoutCoordinates layoutCoordinates) {
        layoutCoordinates.getClass();
        return d(layoutCoordinates).k(layoutCoordinates, true);
    }

    public static final Rect c(LayoutCoordinates layoutCoordinates) {
        layoutCoordinates.getClass();
        LayoutCoordinates layoutCoordinatesD = d(layoutCoordinates);
        Rect rectB = b(layoutCoordinates);
        float f = rectB.a;
        float f2 = rectB.b;
        long j = layoutCoordinatesD.j(OffsetKt.a(f, f2));
        float f3 = rectB.c;
        long j2 = layoutCoordinatesD.j(OffsetKt.a(f3, f2));
        float f4 = rectB.d;
        long j3 = layoutCoordinatesD.j(OffsetKt.a(f3, f4));
        long j4 = layoutCoordinatesD.j(OffsetKt.a(f, f4));
        return new Rect(uu.G(new float[]{Offset.c(j2), Offset.c(j4), Offset.c(j3)}, Offset.c(j)), uu.G(new float[]{Offset.d(j2), Offset.d(j4), Offset.d(j3)}, Offset.d(j)), uu.D(new float[]{Offset.c(j2), Offset.c(j4), Offset.c(j3)}, Offset.c(j)), uu.D(new float[]{Offset.d(j2), Offset.d(j4), Offset.d(j3)}, Offset.d(j)));
    }

    public static final LayoutCoordinates d(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates layoutCoordinates2;
        LayoutNodeWrapper layoutNodeWrapper;
        layoutCoordinates.getClass();
        LayoutNodeWrapper layoutNodeWrapperM = layoutCoordinates.m();
        while (true) {
            LayoutNodeWrapper layoutNodeWrapper2 = layoutNodeWrapperM;
            layoutCoordinates2 = layoutCoordinates;
            layoutCoordinates = layoutNodeWrapper2;
            if (layoutCoordinates == null) {
                break;
            }
            layoutNodeWrapperM = layoutCoordinates.m();
        }
        if (layoutCoordinates2 instanceof LayoutNodeWrapper) {
            layoutNodeWrapper = (LayoutNodeWrapper) layoutCoordinates2;
        } else {
            layoutNodeWrapper = null;
        }
        if (layoutNodeWrapper == null) {
            return layoutCoordinates2;
        }
        LayoutNodeWrapper layoutNodeWrapper3 = layoutNodeWrapper.f;
        while (true) {
            LayoutNodeWrapper layoutNodeWrapper4 = layoutNodeWrapper3;
            LayoutNodeWrapper layoutNodeWrapper5 = layoutNodeWrapper;
            layoutNodeWrapper = layoutNodeWrapper4;
            if (layoutNodeWrapper != null) {
                layoutNodeWrapper3 = layoutNodeWrapper.f;
            } else {
                return layoutNodeWrapper5;
            }
        }
    }

    public static final long e(LayoutCoordinates layoutCoordinates) {
        layoutCoordinates.getClass();
        int i = Offset.e;
        return layoutCoordinates.n(Offset.b);
    }
}
