package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/IntrinsicsMeasureScope;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/unit/Density;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class IntrinsicsMeasureScope implements MeasureScope, Density {
    public final LayoutDirection a;
    public final /* synthetic */ Density b;

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: getDensity */
    public final float getA() {
        return this.b.getA();
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: getFontScale */
    public final float getB() {
        return this.b.getB();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    /* JADX INFO: renamed from: getLayoutDirection, reason: from getter */
    public final LayoutDirection getA() {
        return this.a;
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: roundToPx--R2X_6o */
    public final int mo0roundToPxR2X_6o(long j) {
        return this.b.mo0roundToPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: roundToPx-0680j_4 */
    public final int mo1roundToPx0680j_4(float f) {
        return this.b.mo1roundToPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-GaN1DYA */
    public final float mo2toDpGaN1DYA(long j) {
        return this.b.mo2toDpGaN1DYA(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public final float mo3toDpu2uoSUM(float f) {
        return this.b.mo3toDpu2uoSUM(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDpSize-k-rfVVM */
    public final long mo5toDpSizekrfVVM(long j) {
        return this.b.mo5toDpSizekrfVVM(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toPx--R2X_6o */
    public final float mo6toPxR2X_6o(long j) {
        return this.b.mo6toPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toPx-0680j_4 */
    public final float mo7toPx0680j_4(float f) {
        return this.b.mo7toPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSize-XkaWNTQ */
    public final long mo8toSizeXkaWNTQ(long j) {
        return this.b.mo8toSizeXkaWNTQ(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-0xMU5do */
    public final long mo9toSp0xMU5do(float f) {
        return this.b.mo9toSp0xMU5do(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public final long mo10toSpkPz2Gy4(float f) {
        return this.b.mo10toSpkPz2Gy4(f);
    }

    public IntrinsicsMeasureScope(Density density, LayoutDirection layoutDirection) {
        density.getClass();
        layoutDirection.getClass();
        this.a = layoutDirection;
        this.b = density;
    }

    @Override // androidx.compose.ui.unit.Density
    public final Rect toRect(DpRect dpRect) {
        dpRect.getClass();
        return this.b.toRect(dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public final float mo4toDpu2uoSUM(int i) {
        return this.b.mo4toDpu2uoSUM(i);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public final long mo11toSpkPz2Gy4(int i) {
        return this.b.mo11toSpkPz2Gy4(i);
    }
}
