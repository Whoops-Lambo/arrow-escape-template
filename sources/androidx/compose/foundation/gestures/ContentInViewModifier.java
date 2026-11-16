package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.FocusedBoundsKt;
import androidx.compose.foundation.relocation.BringIntoViewResponder;
import androidx.compose.foundation.relocation.BringIntoViewResponderKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.OnPlacedModifier;
import androidx.compose.ui.layout.OnRemeasuredModifier;
import androidx.compose.ui.node.LayoutNodeWrapper;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import com.unity3d.services.UnityAdsConstants;
import defpackage.az2;
import defpackage.dn;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.tb5;
import defpackage.ul2;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/gestures/ContentInViewModifier;", "Landroidx/compose/foundation/relocation/BringIntoViewResponder;", "Landroidx/compose/ui/layout/OnRemeasuredModifier;", "Landroidx/compose/ui/layout/OnPlacedModifier;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class ContentInViewModifier implements BringIntoViewResponder, OnRemeasuredModifier, OnPlacedModifier {
    public final dn a;
    public final Orientation b;
    public final ScrollableState c;
    public final boolean d;
    public LayoutCoordinates e;
    public LayoutCoordinates f;
    public IntSize g;
    public final Modifier h;

    public static float f(float f, float f2, float f3) {
        if ((f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f2 <= f3) || (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f2 > f3)) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float f4 = f2 - f3;
        return Math.abs(f) < Math.abs(f4) ? f : f4;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // androidx.compose.ui.layout.OnRemeasuredModifier
    public final void Y(long j) {
        LayoutCoordinates layoutCoordinates;
        LayoutCoordinates layoutCoordinates2 = this.f;
        IntSize intSize = this.g;
        if (intSize != null) {
            long j2 = intSize.a;
            if (!IntSize.a(j2, j) && layoutCoordinates2 != null && layoutCoordinates2.s() && (this.b != Orientation.b ? ((int) (layoutCoordinates2.d() & 4294967295L)) < ((int) (j2 & 4294967295L)) : ((int) (layoutCoordinates2.d() >> 32)) < ((int) (j2 >> 32))) && (layoutCoordinates = this.e) != null) {
                Rect rectK = layoutCoordinates2.k(layoutCoordinates, false);
                Rect rectA = RectKt.a(Offset.b, IntSizeKt.b(j2));
                Rect rectD = d(layoutCoordinates2.d(), rectK);
                boolean zE = rectA.e(rectK);
                boolean zEquals = rectD.equals(rectK);
                if (zE && !zEquals) {
                    tb5.t(this.a, null, null, new ContentInViewModifier$onSizeChanged$1(this, rectK, rectD, null), 3);
                }
            }
        }
        this.g = new IntSize(j);
    }

    public final Object e(Rect rect, Rect rect2, ul2 ul2Var) {
        float f;
        float f2;
        int iOrdinal = this.b.ordinal();
        if (iOrdinal == 0) {
            f = rect.b;
            f2 = rect2.b;
        } else {
            if (iOrdinal != 1) {
                e.b();
                return null;
            }
            f = rect.a;
            f2 = rect2.a;
        }
        float f3 = f - f2;
        if (this.d) {
            f3 = -f3;
        }
        Object objA = ScrollExtensionsKt.a(this.c, f3, AnimationSpecKt.a(7, null), ul2Var);
        return objA == dz.a ? objA : az2.a;
    }

    public ContentInViewModifier(dn dnVar, Orientation orientation, ScrollableState scrollableState, boolean z) {
        scrollableState.getClass();
        this.a = dnVar;
        this.b = orientation;
        this.c = scrollableState;
        this.d = z;
        this.h = BringIntoViewResponderKt.a(FocusedBoundsKt.a(this, new ContentInViewModifier$modifier$1(this)), this);
    }

    @Override // androidx.compose.ui.layout.OnPlacedModifier
    public final void F(LayoutNodeWrapper layoutNodeWrapper) {
        layoutNodeWrapper.getClass();
        this.f = layoutNodeWrapper;
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewResponder
    public final Object b(Rect rect, dy dyVar) {
        Object objE = e(rect, c(rect), (ul2) dyVar);
        if (objE == dz.a) {
            return objE;
        }
        return az2.a;
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewResponder
    public final Rect c(Rect rect) {
        rect.getClass();
        IntSize intSize = this.g;
        if (intSize != null) {
            return d(intSize.a, rect);
        }
        e32.i("Expected BringIntoViewRequester to not be used before parents are placed.");
        return null;
    }

    public final Rect d(long j, Rect rect) {
        long jB = IntSizeKt.b(j);
        int iOrdinal = this.b.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return rect.f(f(rect.a, rect.c, Size.d(jB)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            e.b();
            return null;
        }
        return rect.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f(rect.b, rect.d, Size.b(jB)));
    }
}
