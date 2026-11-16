package com.mbridge.msdk.click;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ironsource.G5;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.MintegralNetworkBridge;
import com.safedk.android.utils.Logger;
import defpackage.q63;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class o {
    private static final String r = "o";
    private int a;
    private int b;
    private com.mbridge.msdk.setting.g d;
    private f e;
    private String f;
    private String g;
    private WebView h;
    private boolean i;
    private String j;
    private int k;
    private boolean m;
    boolean n;
    boolean o;
    private boolean l = false;
    private final Runnable p = new d();
    private final Runnable q = new e();
    private Handler c = new Handler(Looper.getMainLooper());

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ Context c;

        public a(String str, String str2, Context context) {
            this.a = str;
            this.b = str2;
            this.c = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            o oVar = o.this;
            oVar.a(this.a, this.b, this.c, oVar.f);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class b extends WebViewClient {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ Context c;

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);
            CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.h.o, view, url);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/click/o$b;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V");
            BrandSafetyUtils.onWebViewPageStarted(com.safedk.android.utils.h.o, webView, str);
            safedk_o$b_onPageStarted_28ccb49a9a20d13d6cc83746920eacc8(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/click/o$b;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
            BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.o, webView, i, str, str2);
            safedk_o$b_onReceivedError_855435f363a40a01a5eee5477370e2c8(webView, i, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            try {
                synchronized (o.r) {
                    o.this.m = true;
                    o.this.b();
                    o.this.f();
                }
                if (o.this.e != null) {
                    o.this.e.a(-1, webView.getUrl(), "WebView render process crash.", o.this.j);
                }
                if (webView != null) {
                    webView.destroy();
                }
                return true;
            } catch (Throwable th) {
                q0.b(o.r, th.getMessage());
                return true;
            }
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.h.o, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/click/o$b;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
            boolean zSafedk_o$b_shouldOverrideUrlLoading_888edc82a385a396f150280d164a4fe2 = safedk_o$b_shouldOverrideUrlLoading_888edc82a385a396f150280d164a4fe2(webView, str);
            BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.o, webView, str, zSafedk_o$b_shouldOverrideUrlLoading_888edc82a385a396f150280d164a4fe2);
            return zSafedk_o$b_shouldOverrideUrlLoading_888edc82a385a396f150280d164a4fe2;
        }

        public b(String str, String str2, Context context) {
            this.a = str;
            this.b = str2;
            this.c = context;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            try {
                if (MBridgeConstans.IS_SP_CBT_CF && sslErrorHandler != null) {
                    sslErrorHandler.cancel();
                }
                if (TextUtils.isEmpty(this.a) || TextUtils.isEmpty(this.b)) {
                    return;
                }
                new com.mbridge.msdk.foundation.same.report.h(this.c).a(this.b, this.a, webView.getUrl());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void safedk_o$b_onPageStarted_28ccb49a9a20d13d6cc83746920eacc8(WebView p0, String p1, Bitmap p2) {
            try {
                MintegralNetworkBridge.webviewLoadUrl(p0, "javascript:window.navigator.vibrate([]);");
                boolean z = o.this.m;
                o oVar = o.this;
                if (z) {
                    oVar.k = 0;
                    o.this.f();
                    return;
                }
                oVar.o = false;
                if (p0.getTag() == null) {
                    p0.setTag("has_first_started");
                } else {
                    o.this.n = true;
                }
                synchronized (o.r) {
                    try {
                        o.this.f = p1;
                        if (o.this.e == null || !o.this.e.a(p1)) {
                            o.this.h();
                        } else {
                            o.this.m = true;
                            o.this.f();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            try {
                MintegralNetworkBridge.webviewLoadUrl(webView, "javascript:window.navigator.vibrate([]);");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void safedk_o$b_onReceivedError_855435f363a40a01a5eee5477370e2c8(WebView p0, int p1, String p2, String p3) {
            String p4 = o.r;
            synchronized (p4) {
                o.this.m = true;
                o.this.b();
                o.this.f();
            }
            if (o.this.e != null) {
                o.this.e.a(p1, p0.getUrl(), p2, o.this.j);
            }
        }

        public boolean safedk_o$b_shouldOverrideUrlLoading_888edc82a385a396f150280d164a4fe2(WebView p0, String p1) {
            synchronized (o.r) {
                try {
                    o oVar = o.this;
                    oVar.o = true;
                    oVar.c();
                    boolean z = o.this.m;
                    o oVar2 = o.this;
                    if (z) {
                        oVar2.d();
                        o.this.f();
                        return true;
                    }
                    oVar2.f = p1;
                    if (o.this.e != null && o.this.e.c(p1)) {
                        o.this.m = true;
                        o.this.d();
                        o.this.f();
                        return true;
                    }
                    if (o.this.i) {
                        HashMap map = new HashMap();
                        if (o.this.h.getUrl() != null) {
                            map.put("Referer", o.this.h.getUrl());
                        }
                        MintegralNetworkBridge.webviewLoadUrl(o.this.h, p1, map);
                    } else {
                        MintegralNetworkBridge.webviewLoadUrl(o.this.h, p1);
                    }
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class c extends WebChromeClient {
        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/click/o$c;->onJsPrompt(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsPromptResult;)Z");
            boolean zSafedk_o$c_onJsPrompt_d3c1c74d736f9f7dec18640801faf9cd = safedk_o$c_onJsPrompt_d3c1c74d736f9f7dec18640801faf9cd(webView, str, str2, str3, jsPromptResult);
            BrandSafetyUtils.onJsPrompt(com.safedk.android.utils.h.o, webView, str, str2, zSafedk_o$c_onJsPrompt_d3c1c74d736f9f7dec18640801faf9cd);
            return zSafedk_o$c_onJsPrompt_d3c1c74d736f9f7dec18640801faf9cd;
        }

        public boolean safedk_o$c_onJsPrompt_d3c1c74d736f9f7dec18640801faf9cd(WebView p0, String p1, String p2, String p3, JsPromptResult p4) {
            return true;
        }

        public c() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            if (i == 100) {
                try {
                    MintegralNetworkBridge.webviewLoadUrl(webView, "javascript:window.navigator.vibrate([]);");
                    if (!o.this.m) {
                        o oVar = o.this;
                        if (!oVar.o) {
                            oVar.g();
                        }
                    }
                    if (o.this.e != null) {
                        o.this.e.b(webView.getUrl());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o.this.l = true;
            o.this.k = 1;
            o.this.e();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o.this.l = true;
            o.this.k = 2;
            o.this.e();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface f {
        void a(int i, String str, String str2, String str3);

        void a(String str, boolean z, String str2);

        boolean a(String str);

        boolean b(String str);

        boolean c(String str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.c.removeCallbacks(this.p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.c.removeCallbacks(this.q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        synchronized (r) {
            try {
                try {
                    b();
                    this.h.destroy();
                    f fVar = this.e;
                    if (fVar != null) {
                        fVar.a(this.f, this.l, this.j);
                    }
                } catch (Exception e2) {
                    q0.b(r, e2.getMessage());
                } catch (Throwable th) {
                    q0.b(r, th.getMessage());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        synchronized (r) {
            try {
                try {
                    try {
                        b();
                        f fVar = this.e;
                        if (fVar != null) {
                            fVar.a(this.f, this.l, this.j);
                        }
                    } catch (Exception e2) {
                        q0.b(r, e2.getMessage());
                    }
                } catch (Throwable th) {
                    q0.b(r, th.getMessage());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void i() {
        this.c.postDelayed(this.p, this.b);
    }

    private void j() {
        this.c.postDelayed(this.q, this.a);
    }

    public o() {
        this.a = 15000;
        this.b = IronSourceError.ERROR_CAPPING_VALIDATION_FAILED;
        com.mbridge.msdk.setting.g gVarE = q63.e(com.mbridge.msdk.setting.i.b());
        this.d = gVarE;
        if (gVarE == null) {
            this.d = com.mbridge.msdk.setting.i.b().a();
        }
        this.i = this.d.P0();
        this.a = (int) this.d.v0();
        this.b = (int) this.d.v0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, Context context, String str3) {
        try {
            a(context, str, str2);
            if (!TextUtils.isEmpty(this.g)) {
                this.h.getSettings().setDefaultTextEncodingName(G5.O);
                this.b = 2000;
                this.a = 2000;
                q0.c(r, this.g);
                MintegralNetworkBridge.webviewLoadDataWithBaseURL(this.h, str3, this.g, "*/*", G5.O, str3);
                return;
            }
            if (this.i) {
                HashMap map = new HashMap();
                if (this.h.getUrl() != null) {
                    map.put("Referer", this.h.getUrl());
                }
                MintegralNetworkBridge.webviewLoadUrl(this.h, str3, map);
                return;
            }
            MintegralNetworkBridge.webviewLoadUrl(this.h, str3);
        } catch (Throwable th) {
            try {
                f fVar = this.e;
                if (fVar != null) {
                    fVar.a(0, this.f, th.getMessage(), this.j);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        c();
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        c();
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        d();
        j();
    }

    public void a(String str, String str2, Context context, String str3, String str4, f fVar) {
        if (fVar != null) {
            this.g = str4;
            this.f = str3;
            this.e = fVar;
            a(str, str2, context);
            return;
        }
        defpackage.d.w("OverrideUrlLoadingListener can not be null");
    }

    public void a(String str, String str2, Context context, String str3, f fVar) {
        if (fVar != null) {
            this.f = str3;
            this.e = fVar;
            a(str, str2, context);
            return;
        }
        defpackage.d.w("OverrideUrlLoadingListener can not be null");
    }

    private void a(String str, String str2, Context context) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            a(str, str2, context, this.f);
        } else {
            this.c.post(new a(str, str2, context));
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void a(Context context, String str, String str2) {
        WebView webView = new WebView(context);
        this.h = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.h.getSettings().setCacheMode(2);
        this.h.getSettings().setLoadsImagesAutomatically(false);
        this.h.setWebViewClient(new b(str2, str, context));
        MintegralNetworkBridge.webviewSetWebChromeClient(this.h, new c());
    }
}
