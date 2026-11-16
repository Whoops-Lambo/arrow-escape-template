package androidx.compose.animation.core;

import androidx.compose.ui.geometry.Rect;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/AnimationVector4D;", "it", "Landroidx/compose/ui/geometry/Rect;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
public final class VectorConvertersKt$RectToVector$1 extends rc1 implements wr0 {
    public static final VectorConvertersKt$RectToVector$1 i = new VectorConvertersKt$RectToVector$1(1);

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        Rect rect = (Rect) obj;
        rect.getClass();
        return new AnimationVector4D(rect.a, rect.b, rect.c, rect.d);
    }
}
