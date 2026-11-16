package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.ui.Alignment;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1 implements MeasuredItemFactory {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ LazyLayoutMeasureScope c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Alignment.Horizontal e;
    public final /* synthetic */ Alignment.Vertical f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ LazyListItemPlacementAnimator j;
    public final /* synthetic */ long k;

    public LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1(int i, int i2, LazyLayoutMeasureScope lazyLayoutMeasureScope, boolean z, Alignment.Horizontal horizontal, Alignment.Vertical vertical, boolean z2, int i3, int i4, LazyListItemPlacementAnimator lazyListItemPlacementAnimator, long j) {
        this.a = i;
        this.b = i2;
        this.c = lazyLayoutMeasureScope;
        this.d = z;
        this.e = horizontal;
        this.f = vertical;
        this.g = z2;
        this.h = i3;
        this.i = i4;
        this.j = lazyListItemPlacementAnimator;
        this.k = j;
    }
}
