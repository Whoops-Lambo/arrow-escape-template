package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import defpackage.fy;
import defpackage.l32;
import defpackage.t50;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@t50(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {829}, m = "verticalDrag-jO51t88")
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class DragGestureDetectorKt$verticalDrag$1 extends fy {
    public wr0 r;
    public AwaitPointerEventScope s;
    public AwaitPointerEventScope t;
    public l32 u;
    public /* synthetic */ Object v;
    public int w;

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.w |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.l(null, 0L, null, this);
    }
}
