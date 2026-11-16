package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1 implements MeasuredItemFactory {
    public final /* synthetic */ LazyLayoutMeasureScope a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ LazyGridItemPlacementAnimator f;
    public final /* synthetic */ long g;

    public LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1(LazyLayoutMeasureScope lazyLayoutMeasureScope, boolean z, boolean z2, int i, int i2, LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, long j) {
        this.a = lazyLayoutMeasureScope;
        this.b = z;
        this.c = z2;
        this.d = i;
        this.e = i2;
        this.f = lazyGridItemPlacementAnimator;
        this.g = j;
    }
}
