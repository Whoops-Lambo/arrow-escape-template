package androidx.webkit.internal;

import androidx.webkit.TracingController;
import org.chromium.support_lib_boundary.TracingControllerBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class TracingControllerImpl extends TracingController {
    public final TracingControllerBoundaryInterface a;

    public TracingControllerImpl() {
        ApiFeature.P p = WebViewFeatureInternal.g;
        if (p.b()) {
            android.webkit.TracingController.getInstance();
        } else {
            if (p.c()) {
                this.a = WebViewGlueCommunicator.LAZY_FACTORY_HOLDER.a.getTracingController();
                return;
            }
            throw WebViewFeatureInternal.a();
        }
    }
}
