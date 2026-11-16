package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import defpackage.rc1;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/SpringSpec;", "Landroidx/compose/ui/unit/IntSize;", "<anonymous parameter 0>", "<anonymous parameter 1>", "invoke-TemP2vQ", "(JJ)Landroidx/compose/animation/core/SpringSpec;"}, k = 3, mv = {1, 6, 0}, xi = 48)
final class AnimatedContentKt$SizeTransform$1 extends rc1 implements zr0 {
    public static final AnimatedContentKt$SizeTransform$1 i = new AnimatedContentKt$SizeTransform$1(2);

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        long j = ((IntSize) obj).a;
        long j2 = ((IntSize) obj2).a;
        Rect rect = VisibilityThresholdsKt.a;
        return AnimationSpecKt.a(3, new IntSize(IntSizeKt.a(1, 1)));
    }
}
