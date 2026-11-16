package androidx.compose.animation;

import androidx.compose.ui.unit.IntOffset;
import defpackage.rc1;
import defpackage.wr0;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/IntOffset;", "it", "Landroidx/compose/animation/EnterExitState;", "invoke-Bjo55l4", "(Landroidx/compose/animation/EnterExitState;)J"}, k = 3, mv = {1, 6, 0}, xi = 48)
final class SlideModifier$measure$1$slideOffset$1 extends rc1 implements wr0 {
    public final /* synthetic */ SlideModifier i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlideModifier$measure$1$slideOffset$1(SlideModifier slideModifier, long j) {
        super(1);
        this.i = slideModifier;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        EnterExitState enterExitState = (EnterExitState) obj;
        enterExitState.getClass();
        SlideModifier slideModifier = this.i;
        long j = IntOffset.b;
        int iOrdinal = enterExitState.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return new IntOffset(j);
        }
        e.b();
        return null;
    }
}
