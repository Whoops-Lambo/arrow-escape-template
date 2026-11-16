package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerInputChange;
import defpackage.fy;
import defpackage.m32;
import defpackage.t50;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@t50(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {754}, m = "awaitLongPressOrCancellation")
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class DragGestureDetectorKt$awaitLongPressOrCancellation$1 extends fy {
    public PointerInputChange r;
    public m32 s;
    public /* synthetic */ Object t;
    public int u;

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.u |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.a(null, null, this);
    }
}
