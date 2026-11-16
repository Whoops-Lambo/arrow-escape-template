package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import defpackage.rc1;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class LazyLayoutKt$LazyLayout$2$1 extends rc1 implements zr0 {
    public final /* synthetic */ LazyLayoutItemContentFactory i;
    public final /* synthetic */ zr0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutKt$LazyLayout$2$1(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, zr0 zr0Var) {
        super(2);
        this.i = lazyLayoutItemContentFactory;
        this.j = zr0Var;
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        SubcomposeMeasureScope subcomposeMeasureScope = (SubcomposeMeasureScope) obj;
        long j = ((Constraints) obj2).a;
        subcomposeMeasureScope.getClass();
        LazyLayoutItemContentFactory lazyLayoutItemContentFactory = this.i;
        lazyLayoutItemContentFactory.getClass();
        if (!subcomposeMeasureScope.equals(lazyLayoutItemContentFactory.d) || !Constraints.b(j, lazyLayoutItemContentFactory.e)) {
            lazyLayoutItemContentFactory.d = subcomposeMeasureScope;
            lazyLayoutItemContentFactory.e = j;
            lazyLayoutItemContentFactory.c.clear();
        }
        return (MeasureResult) this.j.invoke(new LazyLayoutMeasureScopeImpl(lazyLayoutItemContentFactory, subcomposeMeasureScope), new Constraints(j));
    }
}
