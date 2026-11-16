package androidx.compose.ui.layout;

import androidx.compose.ui.unit.IntSizeKt;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/layout/FixedSizeIntrinsicsPlaceable;", "Landroidx/compose/ui/layout/Placeable;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class FixedSizeIntrinsicsPlaceable extends Placeable {
    @Override // androidx.compose.ui.layout.Placeable
    public final void t0(long j, float f, wr0 wr0Var) {
    }

    public FixedSizeIntrinsicsPlaceable(int i, int i2) {
        w0(IntSizeKt.a(i, i2));
    }

    @Override // androidx.compose.ui.layout.Measured
    public final int f0(AlignmentLine alignmentLine) {
        alignmentLine.getClass();
        return Integer.MIN_VALUE;
    }
}
