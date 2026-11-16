package androidx.webkit.internal;

import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebView;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@RequiresApi
public class ApiHelperForM {

    /* JADX INFO: renamed from: androidx.webkit.internal.ApiHelperForM$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes7.dex */
    class AnonymousClass3 extends WebView.VisualStateCallback {
        @Override // android.webkit.WebView.VisualStateCallback
        public final void onComplete(long j) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.webkit.internal.ApiHelperForM$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes7.dex */
    class AnonymousClass1 extends WebMessagePort.WebMessageCallback {
        @Override // android.webkit.WebMessagePort.WebMessageCallback
        public final void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            WebMessagePortImpl.a(webMessage);
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.webkit.internal.ApiHelperForM$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes7.dex */
    class AnonymousClass2 extends WebMessagePort.WebMessageCallback {
        @Override // android.webkit.WebMessagePort.WebMessageCallback
        public final void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            WebMessagePortImpl.a(webMessage);
            throw null;
        }
    }
}
