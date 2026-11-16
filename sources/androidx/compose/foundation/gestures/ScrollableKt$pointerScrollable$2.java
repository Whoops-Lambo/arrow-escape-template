package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerInputChange;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class ScrollableKt$pointerScrollable$2 extends rc1 implements wr0 {
    public static final ScrollableKt$pointerScrollable$2 i = new ScrollableKt$pointerScrollable$2(1);

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        PointerInputChange pointerInputChange = (PointerInputChange) obj;
        pointerInputChange.getClass();
        return Boolean.valueOf(!(pointerInputChange.h == 2));
    }
}
