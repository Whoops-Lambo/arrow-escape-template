package androidx.compose.animation;

import androidx.compose.ui.unit.IntSize;
import defpackage.rc1;
import defpackage.wr0;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/IntSize;", "it", "Landroidx/compose/animation/EnterExitState;", "invoke-YEO4UFw", "(Landroidx/compose/animation/EnterExitState;)J"}, k = 3, mv = {1, 6, 0}, xi = 48)
final class ExpandShrinkModifier$measure$currentSize$1 extends rc1 implements wr0 {
    public final /* synthetic */ ExpandShrinkModifier i;
    public final /* synthetic */ long j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandShrinkModifier$measure$currentSize$1(ExpandShrinkModifier expandShrinkModifier, long j) {
        super(1);
        this.i = expandShrinkModifier;
        this.j = j;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        EnterExitState enterExitState = (EnterExitState) obj;
        enterExitState.getClass();
        ExpandShrinkModifier expandShrinkModifier = this.i;
        ChangeSize changeSize = (ChangeSize) expandShrinkModifier.c.getA();
        long j = this.j;
        long j2 = changeSize != null ? ((IntSize) changeSize.b.invoke(new IntSize(j))).a : j;
        ChangeSize changeSize2 = (ChangeSize) expandShrinkModifier.d.getA();
        long j3 = changeSize2 != null ? ((IntSize) changeSize2.b.invoke(new IntSize(j))).a : j;
        int iOrdinal = enterExitState.ordinal();
        if (iOrdinal == 0) {
            j = j2;
        } else if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                e.b();
                return null;
            }
            j = j3;
        }
        return new IntSize(j);
    }
}
