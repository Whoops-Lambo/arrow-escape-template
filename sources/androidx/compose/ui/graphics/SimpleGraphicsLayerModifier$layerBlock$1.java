package androidx.compose.ui.graphics;

import com.unity3d.services.UnityAdsConstants;
import defpackage.az2;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Laz2;", "invoke", "(Landroidx/compose/ui/graphics/GraphicsLayerScope;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
final class SimpleGraphicsLayerModifier$layerBlock$1 extends rc1 implements wr0 {
    public final /* synthetic */ SimpleGraphicsLayerModifier i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleGraphicsLayerModifier$layerBlock$1(SimpleGraphicsLayerModifier simpleGraphicsLayerModifier) {
        super(1);
        this.i = simpleGraphicsLayerModifier;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        GraphicsLayerScope graphicsLayerScope = (GraphicsLayerScope) obj;
        graphicsLayerScope.getClass();
        SimpleGraphicsLayerModifier simpleGraphicsLayerModifier = this.i;
        graphicsLayerScope.l(simpleGraphicsLayerModifier.b);
        graphicsLayerScope.o(simpleGraphicsLayerModifier.c);
        graphicsLayerScope.b(simpleGraphicsLayerModifier.d);
        graphicsLayerScope.q();
        graphicsLayerScope.c(simpleGraphicsLayerModifier.e);
        graphicsLayerScope.L(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        graphicsLayerScope.e();
        graphicsLayerScope.f();
        graphicsLayerScope.h(simpleGraphicsLayerModifier.f);
        graphicsLayerScope.g(simpleGraphicsLayerModifier.g);
        graphicsLayerScope.G(simpleGraphicsLayerModifier.h);
        graphicsLayerScope.Q(simpleGraphicsLayerModifier.i);
        graphicsLayerScope.E(simpleGraphicsLayerModifier.j);
        graphicsLayerScope.o0(null);
        graphicsLayerScope.g0(simpleGraphicsLayerModifier.k);
        graphicsLayerScope.m0(simpleGraphicsLayerModifier.l);
        return az2.a;
    }
}
