package androidx.compose.foundation.lazy;

import androidx.compose.ui.layout.BeyondBoundsLayout;
import defpackage.e32;
import defpackage.m32;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/foundation/lazy/LazyListBeyondBoundsModifierLocal$layout$2", "Landroidx/compose/ui/layout/BeyondBoundsLayout$BeyondBoundsScope;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class LazyListBeyondBoundsModifierLocal$layout$2 implements BeyondBoundsLayout.BeyondBoundsScope {
    public final /* synthetic */ LazyListBeyondBoundsModifierLocal a;
    public final /* synthetic */ m32 b;
    public final /* synthetic */ int c;

    @Override // androidx.compose.ui.layout.BeyondBoundsLayout.BeyondBoundsScope
    public final boolean a() {
        LazyListBeyondBoundsInfo.Interval interval = (LazyListBeyondBoundsInfo.Interval) this.b.a;
        int i = this.c;
        if (i == 1) {
            return LazyListBeyondBoundsModifierLocal.d(interval);
        }
        LazyListBeyondBoundsModifierLocal lazyListBeyondBoundsModifierLocal = this.a;
        if (i == 2) {
            return LazyListBeyondBoundsModifierLocal.c(interval, lazyListBeyondBoundsModifierLocal);
        }
        if (i == 5) {
            return LazyListBeyondBoundsModifierLocal.d(interval);
        }
        if (i == 6) {
            return LazyListBeyondBoundsModifierLocal.c(interval, lazyListBeyondBoundsModifierLocal);
        }
        if (i == 3 || i == 4) {
            throw null;
        }
        e32.i("Lazy list does not support beyond bounds layout for the specified direction");
        return false;
    }

    public LazyListBeyondBoundsModifierLocal$layout$2(LazyListBeyondBoundsModifierLocal lazyListBeyondBoundsModifierLocal, m32 m32Var, int i) {
        this.a = lazyListBeyondBoundsModifierLocal;
        this.b = m32Var;
        this.c = i;
    }
}
