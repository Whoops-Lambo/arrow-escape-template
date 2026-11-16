package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.wr0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/layout/MeasureScope;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class LazyLayoutMeasureScopeImpl implements LazyLayoutMeasureScope, MeasureScope {
    public final LazyLayoutItemContentFactory a;
    public final SubcomposeMeasureScope b;
    public final HashMap c;

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: getDensity */
    public final float getB() {
        return this.b.getB();
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: getFontScale */
    public final float getC() {
        return this.b.getC();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    /* JADX INFO: renamed from: getLayoutDirection */
    public final LayoutDirection getA() {
        return this.b.getA();
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

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-GaN1DYA */
    public final float mo2toDpGaN1DYA(long j) {
        return this.b.mo2toDpGaN1DYA(j);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public final float mo4toDpu2uoSUM(int i) {
        return this.b.mo4toDpu2uoSUM(i);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
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

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSize-XkaWNTQ */
    public final long mo8toSizeXkaWNTQ(long j) {
        return this.b.mo8toSizeXkaWNTQ(j);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-0xMU5do */
    public final long mo9toSp0xMU5do(float f) {
        return this.b.mo9toSp0xMU5do(f);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public final long mo10toSpkPz2Gy4(float f) {
        return this.b.mo10toSpkPz2Gy4(f);
    }

    public LazyLayoutMeasureScopeImpl(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, SubcomposeMeasureScope subcomposeMeasureScope) {
        lazyLayoutItemContentFactory.getClass();
        subcomposeMeasureScope.getClass();
        this.a = lazyLayoutItemContentFactory;
        this.b = subcomposeMeasureScope;
        this.c = new HashMap();
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public final MeasureResult C(int i, int i2, Map map, wr0 wr0Var) {
        wr0Var.getClass();
        return this.b.C(i, i2, map, wr0Var);
    }

    @Override // androidx.compose.ui.unit.Density
    public final Rect toRect(DpRect dpRect) {
        dpRect.getClass();
        return this.b.toRect(dpRect);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope
    public final Placeable[] y(int i, long j) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.c;
        Placeable[] placeableArr = (Placeable[]) map.get(numValueOf);
        if (placeableArr != null) {
            return placeableArr;
        }
        LazyLayoutItemContentFactory lazyLayoutItemContentFactory = this.a;
        Object objD = ((LazyLayoutItemProvider) ((LazyLayoutKt$LazyLayout$itemContentFactory$1$1) lazyLayoutItemContentFactory.b).invoke()).d(i);
        List listW = this.b.w(objD, lazyLayoutItemContentFactory.a(i, objD));
        int size = listW.size();
        Placeable[] placeableArr2 = new Placeable[size];
        for (int i2 = 0; i2 < size; i2++) {
            placeableArr2[i2] = ((Measurable) listW.get(i2)).Y(j);
        }
        map.put(Integer.valueOf(i), placeableArr2);
        return placeableArr2;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public final float mo3toDpu2uoSUM(float f) {
        return this.b.mo3toDpu2uoSUM(f);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public final long mo11toSpkPz2Gy4(int i) {
        return this.b.mo11toSpkPz2Gy4(i);
    }
}
