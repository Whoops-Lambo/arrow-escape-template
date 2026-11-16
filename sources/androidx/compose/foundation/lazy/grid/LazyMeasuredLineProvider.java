package androidx.compose.foundation.lazy.grid;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import defpackage.d;
import defpackage.zr0;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyMeasuredLineProvider;", "", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class LazyMeasuredLineProvider {
    public final boolean a;
    public final int b;
    public final int c;
    public final LazyMeasuredItemProvider d;
    public final LazyGridSpanLayoutProvider e;
    public final MeasuredLineFactory f;
    public final zr0 g;

    public final LazyMeasuredLine a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        LazyMeasuredItem lazyMeasuredItem;
        int i6;
        LazyGridSpanLayoutProvider.LineConfiguration lineConfigurationA = this.e.a(i);
        int i7 = lineConfigurationA.a;
        List list = lineConfigurationA.b;
        int size = list.size();
        if (size == 0 || i7 + size == this.b) {
            i2 = 0;
            i3 = 0;
        } else {
            i3 = this.c;
            i2 = 0;
        }
        LazyMeasuredItem[] lazyMeasuredItemArr = new LazyMeasuredItem[size];
        int i8 = i2;
        while (i2 < size) {
            int i9 = (int) ((GridItemSpan) list.get(i2)).a;
            long j = ((Constraints) ((LazyMeasuredLineProvider$childConstraints$1) this.g).invoke(Integer.valueOf(i8), Integer.valueOf(i9))).a;
            int i10 = i7 + i2;
            LazyMeasuredItemProvider lazyMeasuredItemProvider = this.d;
            Object objD = lazyMeasuredItemProvider.a.d(i10);
            Placeable[] placeableArrY = lazyMeasuredItemProvider.b.y(i10, j);
            if (Constraints.f(j)) {
                i6 = Constraints.j(j);
            } else {
                if (Constraints.e(j)) {
                    i6 = Constraints.i(j);
                } else {
                    i4 = i9;
                    i5 = i3;
                    d.r("Failed requirement.");
                    lazyMeasuredItem = null;
                }
                i8 += i4;
                lazyMeasuredItemArr[i2] = lazyMeasuredItem;
                i2++;
                i3 = i5;
                size = size;
                i7 = i7;
            }
            int i11 = i6;
            LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1 = (LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1) lazyMeasuredItemProvider.d;
            objD.getClass();
            i5 = i3;
            i4 = i9;
            lazyMeasuredItem = new LazyMeasuredItem(i10, objD, lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1.b, i11, i5, lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1.c, lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1.a.getA(), lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1.d, lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1.e, placeableArrY, lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1.f, lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1.g);
            i8 += i4;
            lazyMeasuredItemArr[i2] = lazyMeasuredItem;
            i2++;
            i3 = i5;
            size = size;
            i7 = i7;
        }
        LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 = (LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1) this.f;
        return new LazyMeasuredLine(i, lazyMeasuredItemArr, list, lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1.a, lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1.b.size(), lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1.c.getA(), i3, lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1.d);
    }

    public LazyMeasuredLineProvider(boolean z, List list, int i, int i2, int i3, LazyMeasuredItemProvider lazyMeasuredItemProvider, LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider, MeasuredLineFactory measuredLineFactory) {
        this.a = z;
        this.b = i2;
        this.c = i3;
        this.d = lazyMeasuredItemProvider;
        this.e = lazyGridSpanLayoutProvider;
        this.f = measuredLineFactory;
        this.g = new LazyMeasuredLineProvider$childConstraints$1(list, i, this);
    }
}
