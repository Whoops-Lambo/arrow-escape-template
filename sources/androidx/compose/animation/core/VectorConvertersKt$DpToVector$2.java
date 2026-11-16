package androidx.compose.animation.core;

import androidx.compose.ui.unit.Dp;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/Dp;", "it", "Landroidx/compose/animation/core/AnimationVector1D;", "invoke-u2uoSUM", "(Landroidx/compose/animation/core/AnimationVector1D;)F"}, k = 3, mv = {1, 6, 0}, xi = 48)
public final class VectorConvertersKt$DpToVector$2 extends rc1 implements wr0 {
    public static final VectorConvertersKt$DpToVector$2 i = new VectorConvertersKt$DpToVector$2(1);

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        AnimationVector1D animationVector1D = (AnimationVector1D) obj;
        animationVector1D.getClass();
        return new Dp(animationVector1D.a);
    }
}
