package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputEvent;", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class PointerInputEvent {
    public final List a;
    public final MotionEvent b;

    public PointerInputEvent(ArrayList arrayList, MotionEvent motionEvent) {
        arrayList.getClass();
        motionEvent.getClass();
        this.a = arrayList;
        this.b = motionEvent;
    }
}
