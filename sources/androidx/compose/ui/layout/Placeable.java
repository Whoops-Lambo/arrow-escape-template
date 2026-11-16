package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;
import defpackage.tb5;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/layout/Measured;", "PlacementScope", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class Placeable implements Measured {
    public int a;
    public int b;
    public long c = IntSizeKt.a(0, 0);
    public long d = PlaceableKt.b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Companion", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static abstract class PlacementScope {
        public static final Companion a = new Companion();
        public static LayoutDirection b = LayoutDirection.a;
        public static int c;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope$Companion;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class Companion extends PlacementScope {
            @Override // androidx.compose.ui.layout.Placeable.PlacementScope
            public final LayoutDirection a() {
                return PlacementScope.b;
            }

            @Override // androidx.compose.ui.layout.Placeable.PlacementScope
            public final int b() {
                return PlacementScope.c;
            }
        }

        public abstract LayoutDirection a();

        public abstract int b();

        public static void f(PlacementScope placementScope, Placeable placeable, int i, int i2) {
            wr0 wr0Var = PlaceableKt.a;
            placementScope.getClass();
            placeable.getClass();
            long jA = IntOffsetKt.a(i, i2);
            LayoutDirection layoutDirectionA = placementScope.a();
            LayoutDirection layoutDirection = LayoutDirection.a;
            PlaceableKt$DefaultLayerBlock$1 placeableKt$DefaultLayerBlock$1 = PlaceableKt$DefaultLayerBlock$1.i;
            if (layoutDirectionA == layoutDirection || placementScope.b() == 0) {
                long jL0 = placeable.l0();
                int i3 = IntOffset.c;
                placeable.t0(IntOffsetKt.a(((int) (jA >> 32)) + ((int) (jL0 >> 32)), ((int) (jA & 4294967295L)) + ((int) (jL0 & 4294967295L))), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, placeableKt$DefaultLayerBlock$1);
            } else {
                int iB = placementScope.b() - ((int) (placeable.c >> 32));
                int i4 = IntOffset.c;
                long jA2 = IntOffsetKt.a(iB - ((int) (jA >> 32)), (int) (jA & 4294967295L));
                long jL1 = placeable.l0();
                placeable.t0(IntOffsetKt.a(((int) (jA2 >> 32)) + ((int) (jL1 >> 32)), ((int) (jA2 & 4294967295L)) + ((int) (jL1 & 4294967295L))), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, placeableKt$DefaultLayerBlock$1);
            }
        }

        public static void g(PlacementScope placementScope, Placeable placeable, long j) {
            wr0 wr0Var = PlaceableKt.a;
            placementScope.getClass();
            placeable.getClass();
            LayoutDirection layoutDirectionA = placementScope.a();
            LayoutDirection layoutDirection = LayoutDirection.a;
            PlaceableKt$DefaultLayerBlock$1 placeableKt$DefaultLayerBlock$1 = PlaceableKt$DefaultLayerBlock$1.i;
            if (layoutDirectionA == layoutDirection || placementScope.b() == 0) {
                long jL0 = placeable.l0();
                int i = IntOffset.c;
                placeable.t0(IntOffsetKt.a(((int) (j >> 32)) + ((int) (jL0 >> 32)), ((int) (j & 4294967295L)) + ((int) (jL0 & 4294967295L))), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, placeableKt$DefaultLayerBlock$1);
            } else {
                int iB = placementScope.b() - ((int) (placeable.c >> 32));
                int i2 = IntOffset.c;
                long jA = IntOffsetKt.a(iB - ((int) (j >> 32)), (int) (j & 4294967295L));
                long jL1 = placeable.l0();
                placeable.t0(IntOffsetKt.a(((int) (jA >> 32)) + ((int) (jL1 >> 32)), ((int) (jA & 4294967295L)) + ((int) (jL1 & 4294967295L))), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, placeableKt$DefaultLayerBlock$1);
            }
        }

        public static void h(PlacementScope placementScope, Placeable placeable, int i, int i2, wr0 wr0Var, int i3) {
            if ((i3 & 8) != 0) {
                wr0 wr0Var2 = PlaceableKt.a;
                wr0Var = PlaceableKt$DefaultLayerBlock$1.i;
            }
            placementScope.getClass();
            wr0Var.getClass();
            long jA = IntOffsetKt.a(i, i2);
            long jL0 = placeable.l0();
            int i4 = IntOffset.c;
            placeable.t0(IntOffsetKt.a(((int) (jA >> 32)) + ((int) (jL0 >> 32)), ((int) (jA & 4294967295L)) + ((int) (jL0 & 4294967295L))), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, wr0Var);
        }

        public static /* synthetic */ void j(PlacementScope placementScope, Placeable placeable, long j) {
            wr0 wr0Var = PlaceableKt.a;
            placementScope.getClass();
            i(placeable, j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, PlaceableKt$DefaultLayerBlock$1.i);
        }

        public static void c(Placeable placeable, int i, int i2, float f) {
            placeable.getClass();
            long jA = IntOffsetKt.a(i, i2);
            long jL0 = placeable.l0();
            int i3 = IntOffset.c;
            placeable.t0(IntOffsetKt.a(((int) (jA >> 32)) + ((int) (jL0 >> 32)), ((int) (jA & 4294967295L)) + ((int) (jL0 & 4294967295L))), f, null);
        }

        public static void d(Placeable placeable, long j, float f) {
            placeable.getClass();
            long jL0 = placeable.l0();
            int i = IntOffset.c;
            placeable.t0(IntOffsetKt.a(((int) (j >> 32)) + ((int) (jL0 >> 32)), ((int) (j & 4294967295L)) + ((int) (jL0 & 4294967295L))), f, null);
        }

        public static void e(PlacementScope placementScope, Placeable placeable, int i, int i2) {
            placementScope.getClass();
            placeable.getClass();
            long jA = IntOffsetKt.a(i, i2);
            if (placementScope.a() != LayoutDirection.a && placementScope.b() != 0) {
                int iB = placementScope.b() - ((int) (placeable.c >> 32));
                int i3 = IntOffset.c;
                long jA2 = IntOffsetKt.a(iB - ((int) (jA >> 32)), (int) (jA & 4294967295L));
                long jL0 = placeable.l0();
                placeable.t0(IntOffsetKt.a(((int) (jA2 >> 32)) + ((int) (jL0 >> 32)), ((int) (jA2 & 4294967295L)) + ((int) (jL0 & 4294967295L))), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null);
                return;
            }
            long jL1 = placeable.l0();
            int i4 = IntOffset.c;
            placeable.t0(IntOffsetKt.a(((int) (jA >> 32)) + ((int) (jL1 >> 32)), ((int) (jA & 4294967295L)) + ((int) (jL1 & 4294967295L))), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null);
        }

        public static void i(Placeable placeable, long j, float f, wr0 wr0Var) {
            placeable.getClass();
            wr0Var.getClass();
            long jL0 = placeable.l0();
            int i = IntOffset.c;
            placeable.t0(IntOffsetKt.a(((int) (j >> 32)) + ((int) (jL0 >> 32)), ((int) (j & 4294967295L)) + ((int) (jL0 & 4294967295L))), f, wr0Var);
        }
    }

    public abstract void t0(long j, float f, wr0 wr0Var);

    public final long l0() {
        int i = this.a;
        long j = this.c;
        return IntOffsetKt.a((i - ((int) (j >> 32))) / 2, (this.b - ((int) (j & 4294967295L))) / 2);
    }

    public int n0() {
        return (int) (this.c & 4294967295L);
    }

    public int s0() {
        return (int) (this.c >> 32);
    }

    public final void u0() {
        this.a = tb5.g((int) (this.c >> 32), Constraints.j(this.d), Constraints.h(this.d));
        this.b = tb5.g((int) (this.c & 4294967295L), Constraints.i(this.d), Constraints.g(this.d));
    }

    public final void w0(long j) {
        if (IntSize.a(this.c, j)) {
            return;
        }
        this.c = j;
        u0();
    }

    public final void x0(long j) {
        if (Constraints.b(this.d, j)) {
            return;
        }
        this.d = j;
        u0();
    }
}
