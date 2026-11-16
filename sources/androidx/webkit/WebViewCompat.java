package androidx.webkit;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.webkit.internal.ApiFeature;
import androidx.webkit.internal.WebMessageListenerAdapter;
import androidx.webkit.internal.WebViewFeatureInternal;
import androidx.webkit.internal.WebViewGlueCommunicator;
import androidx.webkit.internal.WebViewProviderAdapter;
import defpackage.dr0;
import defpackage.zj;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class WebViewCompat {
    public static final /* synthetic */ int a = 0;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface VisualStateCallback {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface WebMessageListener {
        void onPostMessage(WebView webView, WebMessageCompat webMessageCompat, Uri uri, boolean z, JavaScriptReplyProxy javaScriptReplyProxy);
    }

    static {
        Uri.parse("*");
        Uri.parse("");
    }

    public static void a(WebView webView, String str, Set set) {
        if (!WebViewFeatureInternal.j.c()) {
            throw WebViewFeatureInternal.a();
        }
        WebViewProviderAdapter webViewProviderAdapterD = d(webView);
    }

    public static void b(WebView webView, String str, Set set, WebMessageListener webMessageListener) {
        if (!WebViewFeatureInternal.i.c()) {
            throw WebViewFeatureInternal.a();
        }
        WebViewProviderAdapter webViewProviderAdapterD = d(webView);
        String[] strArr = (String[]) set.toArray(new String[0]);
        webViewProviderAdapterD.a.addWebMessageListener(str, strArr, new zj(new WebMessageListenerAdapter(webMessageListener), 0));
    }

    public static PackageInfo c() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }

    public static WebViewProviderAdapter d(WebView webView) {
        return new WebViewProviderAdapter(WebViewGlueCommunicator.b().createWebView(webView));
    }

    public static String e() {
        if (WebViewFeatureInternal.k.c()) {
            return WebViewGlueCommunicator.b().getStatics().getVariationsHeader();
        }
        throw WebViewFeatureInternal.a();
    }

    public static WebViewClient f(WebView webView) {
        ApiFeature.O o = WebViewFeatureInternal.f;
        if (o.b()) {
            return webView.getWebViewClient();
        }
        if (!o.c()) {
            throw WebViewFeatureInternal.a();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Looper webViewLooper = webView.getWebViewLooper();
            if (webViewLooper != Looper.myLooper()) {
                StringBuilder sb = new StringBuilder("A WebView method was called on thread '");
                sb.append(Thread.currentThread().getName());
                sb.append("'. All WebView methods must be called on the same thread. (Expected Looper ");
                sb.append(webViewLooper);
                sb.append(" called on ");
                sb.append(Looper.myLooper());
                Looper mainLooper = Looper.getMainLooper();
                sb.append(", FYI main Looper is ");
                sb.append(mainLooper);
                sb.append(")");
                throw new RuntimeException(sb.toString());
            }
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("checkThread", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(webView, null);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                dr0.m(e);
                return null;
            }
        }
        return d(webView).a.getWebViewClient();
    }

    public static void g(WebView webView, String str) {
        if (!WebViewFeatureInternal.i.c()) {
            throw WebViewFeatureInternal.a();
        }
        d(webView).a.removeWebMessageListener(str);
    }

    public static void h(WebView webView, boolean z) {
        if (!WebViewFeatureInternal.m.c()) {
            throw WebViewFeatureInternal.a();
        }
        d(webView).a.setAudioMuted(z);
    }
}
