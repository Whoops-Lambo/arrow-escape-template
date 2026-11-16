package androidx.webkit.internal;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import androidx.annotation.RequiresApi;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@RequiresApi
public class WebViewRenderProcessClientFrameworkAdapter extends WebViewRenderProcessClient {
    public final void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        WeakHashMap weakHashMap = WebViewRenderProcessImpl.b;
        if (((WebViewRenderProcessImpl) weakHashMap.get(webViewRenderProcess)) == null) {
            WebViewRenderProcessImpl webViewRenderProcessImpl = new WebViewRenderProcessImpl();
            new WeakReference(webViewRenderProcess);
            weakHashMap.put(webViewRenderProcess, webViewRenderProcessImpl);
        }
        throw null;
    }

    public final void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        WeakHashMap weakHashMap = WebViewRenderProcessImpl.b;
        if (((WebViewRenderProcessImpl) weakHashMap.get(webViewRenderProcess)) == null) {
            WebViewRenderProcessImpl webViewRenderProcessImpl = new WebViewRenderProcessImpl();
            new WeakReference(webViewRenderProcess);
            weakHashMap.put(webViewRenderProcess, webViewRenderProcessImpl);
        }
        throw null;
    }
}
