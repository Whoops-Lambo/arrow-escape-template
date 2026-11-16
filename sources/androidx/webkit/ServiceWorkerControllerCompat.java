package androidx.webkit;

import android.webkit.ServiceWorkerController;
import androidx.annotation.AnyThread;
import androidx.webkit.internal.ServiceWorkerControllerImpl;
import androidx.webkit.internal.WebViewFeatureInternal;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@AnyThread
public abstract class ServiceWorkerControllerCompat {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class LAZY_HOLDER {
        static {
            ServiceWorkerControllerImpl serviceWorkerControllerImpl = new ServiceWorkerControllerImpl();
            WebViewFeatureInternal.a.getClass();
            ServiceWorkerController serviceWorkerController = ServiceWorkerController.getInstance();
            serviceWorkerControllerImpl.a = serviceWorkerController;
            if (serviceWorkerController == null) {
                serviceWorkerControllerImpl.a = ServiceWorkerController.getInstance();
            }
            serviceWorkerControllerImpl.a.getServiceWorkerWebSettings();
        }
    }
}
