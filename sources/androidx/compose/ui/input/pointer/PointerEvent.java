package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerEvent;", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class PointerEvent {
    public final List a;
    public final InternalPointerEvent b;
    public final int c;
    public int d;

    /* JADX WARN: Code duplicated, block: B:29:0x0047  */
    /* JADX WARN: Code duplicated, block: B:30:0x0049  */
    /* JADX WARN: Code duplicated, block: B:31:0x004b  */
    public PointerEvent(List list, InternalPointerEvent internalPointerEvent) {
        MotionEvent motionEvent;
        int buttonState;
        MotionEvent motionEvent2;
        this.a = list;
        this.b = internalPointerEvent;
        if (internalPointerEvent != null) {
            motionEvent = internalPointerEvent.b.b;
        } else {
            motionEvent = null;
        }
        int i = 0;
        if (motionEvent != null) {
            buttonState = motionEvent.getButtonState();
        } else {
            buttonState = 0;
        }
        this.c = buttonState;
        if (internalPointerEvent != null) {
            motionEvent2 = internalPointerEvent.b.b;
        } else {
            motionEvent2 = null;
        }
        if (motionEvent2 != null) {
            motionEvent2.getMetaState();
        }
        MotionEvent motionEvent3 = internalPointerEvent != null ? internalPointerEvent.b.b : null;
        if (motionEvent3 != null) {
            int actionMasked = motionEvent3.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked == 2) {
                        i = 3;
                    } else {
                        switch (actionMasked) {
                            case 5:
                                i = 1;
                                break;
                            case 6:
                                i = 2;
                                break;
                            case 7:
                                i = 3;
                                break;
                            case 8:
                                i = 6;
                                break;
                            case 9:
                                i = 4;
                                break;
                            case 10:
                                i = 5;
                                break;
                        }
                    }
                } else {
                    i = 2;
                }
            } else {
                i = 1;
            }
        } else {
            int size = list.size();
            while (true) {
                if (i >= size) {
                    i = 3;
                } else {
                    PointerInputChange pointerInputChange = (PointerInputChange) list.get(i);
                    if (PointerEventKt.d(pointerInputChange)) {
                        i = 2;
                    } else if (PointerEventKt.b(pointerInputChange)) {
                        i = 1;
                    } else {
                        i++;
                    }
                }
            }
        }
        this.d = i;
    }
}
