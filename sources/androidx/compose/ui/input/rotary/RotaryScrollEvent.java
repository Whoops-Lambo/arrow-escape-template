package androidx.compose.ui.input.rotary;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.input.focus.FocusAwareEvent;
import defpackage.n30;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred
@ExperimentalComposeUiApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/input/rotary/RotaryScrollEvent;", "Landroidx/compose/ui/input/focus/FocusAwareEvent;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class RotaryScrollEvent implements FocusAwareEvent {
    public final float a;
    public final float b;
    public final long c;

    public final boolean equals(Object obj) {
        if (!(obj instanceof RotaryScrollEvent)) {
            return false;
        }
        RotaryScrollEvent rotaryScrollEvent = (RotaryScrollEvent) obj;
        return rotaryScrollEvent.a == this.a && rotaryScrollEvent.b == this.b && rotaryScrollEvent.c == this.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + n30.b(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RotaryScrollEvent(verticalScrollPixels=");
        sb.append(this.a);
        sb.append(",horizontalScrollPixels=");
        sb.append(this.b);
        sb.append(",uptimeMillis=");
        return n30.o(sb, this.c, ')');
    }

    public RotaryScrollEvent(float f, float f2, long j) {
        this.a = f;
        this.b = f2;
        this.c = j;
    }
}
