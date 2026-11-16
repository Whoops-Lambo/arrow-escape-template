package androidx.compose.ui.input.pointer;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class InternalPointerEvent {
    public final LinkedHashMap a;
    public final PointerInputEvent b;
    public boolean c;

    public final boolean a(long j) {
        Object obj;
        List list = this.b.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (PointerId.a(((PointerInputEventData) obj).a, j)) {
                break;
            }
            i++;
        }
        PointerInputEventData pointerInputEventData = (PointerInputEventData) obj;
        if (pointerInputEventData != null) {
            return pointerInputEventData.g;
        }
        return false;
    }

    public InternalPointerEvent(LinkedHashMap linkedHashMap, PointerInputEvent pointerInputEvent) {
        this.a = linkedHashMap;
        this.b = pointerInputEvent;
    }
}
