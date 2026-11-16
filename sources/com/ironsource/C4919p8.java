package com.ironsource;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.OpenUrlActivity;
import com.ironsource.sdk.utils.Logger;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.singular.sdk.internal.UserDetailsUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.p8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class C4919p8 implements L8 {
    private static final String g = "loadWithUrl | webView is not null";
    private static final String h = "p8";
    private static final String i = "file://";
    private final String a;
    private String b;
    private WebView c;
    private C4883n8 d;
    private C4794i8 e;
    private Context f;

    /* JADX INFO: renamed from: com.ironsource.p8$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ JSONObject b;
        final /* synthetic */ String c;

        public a(String str, JSONObject jSONObject, String str2) {
            this.a = str;
            this.b = jSONObject;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C4919p8.this.c != null) {
                A8.a(C4853le.q, new C5026v8().a(G5.A, C4919p8.g).a());
            }
            try {
                C4919p8.this.b(this.a);
                IronSourceNetworkBridge.webviewLoadUrl(C4919p8.this.c, C4919p8.this.a(this.b.getString("urlForWebView")));
                JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
                jSONObjectJsonObjectInit.put("adViewId", C4919p8.this.a);
                C4919p8.this.d.a(this.c, jSONObjectJsonObjectInit);
            } catch (Exception e) {
                C4950r4.d().a(e);
                C4919p8.this.b(this.a, e.getMessage());
                A8.a(C4853le.q, new C5026v8().a(G5.A, e.getMessage()).a());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.p8$b */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class b implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        public b(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                WebView webView = C4919p8.this.c;
                if (webView != null) {
                    webView.destroy();
                }
                JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
                jSONObjectJsonObjectInit.put("adViewId", C4919p8.this.a);
                C4883n8 c4883n8 = C4919p8.this.d;
                if (c4883n8 != null) {
                    c4883n8.a(this.a, jSONObjectJsonObjectInit);
                    C4919p8.this.d.b();
                }
                C4919p8 c4919p8 = C4919p8.this;
                c4919p8.d = null;
                c4919p8.f = null;
            } catch (Exception e) {
                C4950r4.d().a(e);
                Log.e(C4919p8.h, "performCleanup | could not destroy ISNAdView webView ID: " + C4919p8.this.a);
                A8.a(C4853le.r, new C5026v8().a(G5.A, e.getMessage()).a());
                C4919p8.this.b(this.b, e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.p8$c */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class c implements L8.a {
        final /* synthetic */ String a;

        public c(String str) {
            this.a = str;
        }

        @Override // com.ironsource.L8.a
        public void a(String str) {
            Logger.i(C4919p8.h, "ISNAdViewWebPresenter | WebViewClient | reportOnError: " + str);
            C4919p8.this.b(this.a, str);
        }

        @Override // com.ironsource.L8.a
        public void b(String str) {
            Logger.i(C4919p8.h, "ISNAdViewWebPresenter | WebViewClient | onRenderProcessGone: " + str);
            try {
                ((ViewGroup) C4919p8.this.c.getParent()).removeView(C4919p8.this.c);
            } catch (Exception e) {
                C4950r4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
            C4919p8.this.d();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.p8$d */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class d extends WebChromeClient {
        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            com.safedk.android.utils.Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/p8$d;->onCreateWindow(Landroid/webkit/WebView;ZZLandroid/os/Message;)Z");
            boolean zSafedk_p8$d_onCreateWindow_ffa13f30241774dae9099e42472887fb = safedk_p8$d_onCreateWindow_ffa13f30241774dae9099e42472887fb(webView, z, z2, message);
            BrandSafetyUtils.onWebChromeClientCreateWindow(com.safedk.android.utils.h.f, webView, message, zSafedk_p8$d_onCreateWindow_ffa13f30241774dae9099e42472887fb);
            return zSafedk_p8$d_onCreateWindow_ffa13f30241774dae9099e42472887fb;
        }

        private d() {
        }

        public boolean safedk_p8$d_onCreateWindow_ffa13f30241774dae9099e42472887fb(WebView p0, boolean p1, boolean p2, Message p3) {
            WebView webView = new WebView(p0.getContext());
            webView.setWebChromeClient(C4919p8.this.new d());
            webView.setWebViewClient(new e(C4919p8.this, 0));
            ((WebView.WebViewTransport) p3.obj).setWebView(webView);
            p3.sendToTarget();
            Logger.i("onCreateWindow", "onCreateWindow");
            return true;
        }

        public /* synthetic */ d(C4919p8 c4919p8, int i) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.p8$e */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class e extends WebViewClient {
        public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
            com.safedk.android.utils.Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
            if (p1 == null) {
                return;
            }
            BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.f);
            p0.startActivity(p1);
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);
            CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.h.f, view, url);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            BrandSafetyUtils.onWebViewPageStarted(com.safedk.android.utils.h.f, view, url);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
            super.onReceivedError(view, errorCode, description, failingUrl);
            BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.f, view, errorCode, description, failingUrl);
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.h.f, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            com.safedk.android.utils.Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/p8$e;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
            boolean zSafedk_p8$e_shouldOverrideUrlLoading_f598abfa386a60cef21329269a544b1f = safedk_p8$e_shouldOverrideUrlLoading_f598abfa386a60cef21329269a544b1f(webView, str);
            BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.f, webView, str, zSafedk_p8$e_shouldOverrideUrlLoading_f598abfa386a60cef21329269a544b1f);
            return zSafedk_p8$e_shouldOverrideUrlLoading_f598abfa386a60cef21329269a544b1f;
        }

        private e() {
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(26)
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Logger.e(C4919p8.h, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            return true;
        }

        public boolean safedk_p8$e_shouldOverrideUrlLoading_f598abfa386a60cef21329269a544b1f(WebView p0, String p1) {
            Context context = p0.getContext();
            Intent intentA = new OpenUrlActivity.e(new com.ironsource.sdk.controller.k.c()).a(p1).b(false).a(context);
            intentA.addFlags(268435456);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intentA);
            return true;
        }

        public /* synthetic */ e(C4919p8 c4919p8, int i) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"AddJavascriptInterface"})
    public void b(String str) {
        Logger.i(h, "ISNAdViewWebPresenter | createWebView");
        WebView webView = new WebView(this.f);
        this.c = webView;
        IronSourceNetworkBridge.webviewAddJavascriptInterface(webView, new C4865m8(this), C4811j8.e);
        this.c.setWebViewClient(new C4901o8(new c(str)));
        this.c.setWebChromeClient(new d(this, 0));
        eh.a(this.c);
        this.d.a(this.c);
    }

    private String d(String str) {
        String strSubstring = str.substring(str.indexOf("/") + 1);
        return strSubstring.substring(strSubstring.indexOf("/"));
    }

    @Override // com.ironsource.L8
    public void c(JSONObject jSONObject, String str, String str2) throws JSONException {
        try {
            this.d.a(jSONObject.getString("params"), str, str2);
        } catch (Exception e2) {
            C4950r4.d().a(e2);
            Logger.i(h, "sendMessageToAd fail message: " + e2.getMessage());
            throw e2;
        }
    }

    @Override // com.ironsource.L8
    public WebView getPresentingView() {
        return this.c;
    }

    @JavascriptInterface
    public void handleMessageFromAd(String str) {
        this.d.c(str);
    }

    public C4919p8(InterfaceC4847l8 interfaceC4847l8, Context context, String str, C4794i8 c4794i8) {
        this.f = context;
        C4883n8 c4883n8 = new C4883n8();
        this.d = c4883n8;
        c4883n8.g(str);
        this.a = str;
        this.d.a(interfaceC4847l8);
        this.e = c4794i8;
    }

    @Override // com.ironsource.L8
    public void a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            b(str3, C4664b4.c.D);
            return;
        }
        Logger.i(h, "trying to perform WebView Action: " + str);
        try {
            if (str.equals(C4664b4.i.t0)) {
                this.c.onPause();
                this.d.f(str2);
            } else if (str.equals(C4664b4.i.u0)) {
                this.c.onResume();
                this.d.f(str2);
            } else {
                b(str3, C4664b4.c.C);
            }
        } catch (Exception e2) {
            C4950r4.d().a(e2);
            b(str3, C4664b4.c.E);
        }
    }

    public void e(String str) {
        this.b = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void d() {
        a("", "");
    }

    public C4794i8 c() {
        return this.e;
    }

    private boolean c(String str) {
        return str.startsWith(UserDetailsUtils.UserDetailsLiterals.DOT);
    }

    public C4883n8 b() {
        return this.d;
    }

    @Override // com.ironsource.L8
    public void b(JSONObject jSONObject, String str, String str2) {
        V7.a.d(new a(str2, jSONObject, str));
    }

    public void b(String str, String str2) {
        C4883n8 c4883n8 = this.d;
        if (c4883n8 != null) {
            c4883n8.a(str, str2);
        }
    }

    public String a() {
        return this.a;
    }

    @Override // com.ironsource.L8
    public void a(JSONObject jSONObject, String str, String str2) {
        try {
            this.d.e(str);
        } catch (Exception e2) {
            C4950r4.d().a(e2);
            Logger.i(h, "sendHandleGetViewVisibility fail with reason: " + e2.getMessage());
        }
    }

    @Override // com.ironsource.L8
    public synchronized void a(String str, String str2) {
        if (this.f == null) {
            return;
        }
        Logger.i(h, "performCleanup");
        V7.a.d(new b(str, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
        if (!c(str)) {
            return str;
        }
        return i + this.b + d(str);
    }
}
