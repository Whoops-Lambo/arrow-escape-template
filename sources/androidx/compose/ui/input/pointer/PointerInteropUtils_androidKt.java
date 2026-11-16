package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.ui.geometry.Offset;
import defpackage.d;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class PointerInteropUtils_androidKt {
    public static final void a(PointerEvent pointerEvent, long j, wr0 wr0Var, boolean z) {
        InternalPointerEvent internalPointerEvent = pointerEvent.b;
        MotionEvent motionEvent = internalPointerEvent != null ? internalPointerEvent.b.b : null;
        if (motionEvent == null) {
            d.r("The PointerEvent receiver cannot have a null MotionEvent.");
            return;
        }
        int action = motionEvent.getAction();
        if (z) {
            motionEvent.setAction(3);
        }
        motionEvent.offsetLocation(-Offset.c(j), -Offset.d(j));
        wr0Var.invoke(motionEvent);
        motionEvent.offsetLocation(Offset.c(j), Offset.d(j));
        motionEvent.setAction(action);
    }
}
