package androidx.compose.foundation.gestures;

import androidx.compose.runtime.Composer;
import defpackage.rc1;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class ScrollableKt$pointerScrollable$1 extends rc1 implements zr0 {
    public final /* synthetic */ ScrollDraggableState i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableKt$pointerScrollable$1(ScrollDraggableState scrollDraggableState) {
        super(2);
        this.i = scrollDraggableState;
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        ((Number) obj2).intValue();
        composer.B(498671830);
        composer.J();
        return this.i;
    }
}
