package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import defpackage.az2;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Laz2;", "invoke", "(Landroidx/compose/ui/graphics/GraphicsLayerScope;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
final class ShadowKt$shadow$2$1 extends rc1 implements wr0 {
    public final /* synthetic */ float i;
    public final /* synthetic */ Shape j;
    public final /* synthetic */ long k;
    public final /* synthetic */ long l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShadowKt$shadow$2$1(float f, Shape shape, long j, long j2) {
        super(1);
        this.i = f;
        this.j = shape;
        this.k = j;
        this.l = j2;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        GraphicsLayerScope graphicsLayerScope = (GraphicsLayerScope) obj;
        graphicsLayerScope.getClass();
        graphicsLayerScope.L(graphicsLayerScope.mo7toPx0680j_4(this.i));
        graphicsLayerScope.Q(this.j);
        graphicsLayerScope.E(false);
        graphicsLayerScope.g0(this.k);
        graphicsLayerScope.m0(this.l);
        return az2.a;
    }
}
