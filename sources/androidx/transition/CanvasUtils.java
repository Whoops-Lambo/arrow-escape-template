package androidx.transition;

import android.graphics.Canvas;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
class CanvasUtils {
    public static Method a;
    public static Method b;
    public static boolean c;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api29Impl {
        @DoNotInline
        public static void a(Canvas canvas) {
            canvas.disableZ();
        }

        @DoNotInline
        public static void b(Canvas canvas) {
            canvas.enableZ();
        }
    }
}
