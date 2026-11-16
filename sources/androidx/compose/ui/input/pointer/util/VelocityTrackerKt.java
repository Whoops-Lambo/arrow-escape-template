package androidx.compose.ui.input.pointer.util;

import androidx.compose.ui.input.pointer.HistoricalChange;
import androidx.compose.ui.input.pointer.PointerInputChange;
import defpackage.gg0;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class VelocityTrackerKt {
    public static final float a(float f) {
        return Math.signum(f) * ((float) Math.sqrt(Math.abs(f) * 2.0f));
    }

    public static final void b(VelocityTracker velocityTracker, PointerInputChange pointerInputChange) {
        velocityTracker.getClass();
        PointAtTime[] pointAtTimeArr = velocityTracker.a;
        pointerInputChange.getClass();
        List list = pointerInputChange.j;
        if (list == null) {
            list = gg0.a;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            HistoricalChange historicalChange = (HistoricalChange) list.get(i);
            long j = historicalChange.a;
            long j2 = historicalChange.b;
            int i2 = (velocityTracker.b + 1) % 20;
            velocityTracker.b = i2;
            pointAtTimeArr[i2] = new PointAtTime(j2, j);
        }
        long j3 = pointerInputChange.b;
        long j4 = pointerInputChange.c;
        int i3 = (velocityTracker.b + 1) % 20;
        velocityTracker.b = i3;
        pointAtTimeArr[i3] = new PointAtTime(j4, j3);
    }
}
