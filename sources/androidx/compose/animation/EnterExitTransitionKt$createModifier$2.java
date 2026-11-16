package androidx.compose.animation;

import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import defpackage.az2;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class EnterExitTransitionKt$createModifier$2 extends rc1 implements wr0 {
    public final /* synthetic */ State i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$createModifier$2(State state) {
        super(1);
        this.i = state;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        GraphicsLayerScope graphicsLayerScope = (GraphicsLayerScope) obj;
        graphicsLayerScope.getClass();
        TwoWayConverter twoWayConverter = EnterExitTransitionKt.a;
        graphicsLayerScope.b(((Number) this.i.getA()).floatValue());
        return az2.a;
    }
}
