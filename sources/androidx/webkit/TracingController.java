package androidx.webkit;

import androidx.annotation.AnyThread;
import androidx.webkit.internal.TracingControllerImpl;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@AnyThread
public abstract class TracingController {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class LAZY_HOLDER {
        static {
            new TracingControllerImpl();
        }
    }
}
