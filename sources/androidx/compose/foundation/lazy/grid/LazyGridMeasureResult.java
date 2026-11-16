package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.layout.MeasureResult;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "Landroidx/compose/ui/layout/MeasureResult;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class LazyGridMeasureResult implements LazyGridLayoutInfo, MeasureResult {
    public final LazyMeasuredLine a;
    public final int b;
    public final boolean c;
    public final float d;
    public final List e;
    public final int f;
    public final /* synthetic */ MeasureResult g;

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getF() {
        return this.f;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getE() {
        return this.e;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    /* JADX INFO: renamed from: c */
    public final Map getC() {
        return this.g.getC();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final void d() {
        this.g.d();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    /* JADX INFO: renamed from: getHeight */
    public final int getB() {
        return this.g.getB();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    /* JADX INFO: renamed from: getWidth */
    public final int getA() {
        return this.g.getA();
    }

    public LazyGridMeasureResult(LazyMeasuredLine lazyMeasuredLine, int i, boolean z, float f, MeasureResult measureResult, List list, int i2, Orientation orientation) {
        measureResult.getClass();
        this.a = lazyMeasuredLine;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = list;
        this.f = i2;
        this.g = measureResult;
    }
}
