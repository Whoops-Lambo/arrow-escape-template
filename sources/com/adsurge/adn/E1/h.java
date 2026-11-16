package com.adsurge.adn.E1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.DownloadListener;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import androidx.core.app.NotificationCompat;
import com.adsurge.adn.ads.AdSurgeAdFormat;
import com.safedk.android.utils.Logger;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import defpackage.h50;
import defpackage.x6;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class h extends WebView implements z, q {
    public static final com.adsurge.adn.F1.b m = new com.adsurge.adn.F1.b("webviewLayout", null);
    public static final int n = com.adsurge.adn.N.b.a("ewvmc", 0, (AdSurgeAdFormat) null, (String) null);
    public static final com.adsurge.adn.F1.g o = new a();
    public List a;
    public com.adsurge.adn.M1.a b;
    public final e c;
    public boolean d;
    public boolean e;
    public boolean f;
    public com.adsurge.adn.F1.g g;
    public A h;
    public boolean i;
    public B j;
    public boolean k;
    public boolean l;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements com.adsurge.adn.F1.g {
        @Override // com.adsurge.adn.F1.g
        public void b(String str) {
        }

        @Override // com.adsurge.adn.F1.g
        public com.adsurge.adn.F1.f a(String str) {
            return new com.adsurge.adn.F1.f(1000, "");
        }

        @Override // com.adsurge.adn.F1.g
        public void a(com.adsurge.adn.F1.b bVar) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class b implements DownloadListener {
        public final /* synthetic */ Context a;

        public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
            Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
            if (p1 == null) {
                return;
            }
            p0.startActivity(p1);
        }

        public b(Context context) {
            this.a = context;
        }

        @Override // android.webkit.DownloadListener
        public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            if (intent.resolveActivity(com.adsurge.adn.s1.a.b().a().getPackageManager()) != null) {
                if (!(this.a instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                try {
                    safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this.a, intent);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class c extends WebViewClient {
        public c() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (Build.VERSION.SDK_INT < 26 || renderProcessGoneDetail == null || !renderProcessGoneDetail.didCrash()) {
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
            }
            y.a().a(webView);
            com.adsurge.adn.w1.b.b(9130001, null, 1);
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class d implements A.b {
        @Override // com.adsurge.adn.E1.A.b
        public void a() {
        }

        @Override // com.adsurge.adn.E1.A.b
        public void b() {
        }

        @Override // com.adsurge.adn.E1.A.b
        public void onDismiss() {
        }

        @Override // com.adsurge.adn.E1.A.b
        public void onShow() {
        }

        public d() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class e implements View.OnTouchListener {
        public View.OnTouchListener a;
        public View.OnTouchListener b;

        public void a(View.OnTouchListener onTouchListener) {
            this.b = onTouchListener;
        }

        public void b(View.OnTouchListener onTouchListener) {
            this.a = onTouchListener;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            View.OnTouchListener onTouchListener = this.b;
            if (onTouchListener != null) {
                onTouchListener.onTouch(view, motionEvent);
            }
            View.OnTouchListener onTouchListener2 = this.a;
            return onTouchListener2 != null && onTouchListener2.onTouch(view, motionEvent);
        }
    }

    public void a(com.adsurge.adn.u1.c cVar) {
        if (cVar == null || !cVar.W0()) {
            return;
        }
        this.b = new com.adsurge.adn.M1.a(cVar);
        com.adsurge.adn.M1.b.a().a(cVar.h(), this.b);
        this.c.a(new x6(this, 2));
    }

    public void b(boolean z) {
        this.i = z;
        if (z) {
            A a2 = new A(getContext(), this);
            this.h = a2;
            a2.setCallback(new d());
        }
    }

    public boolean d() {
        return this.k;
    }

    @Override // android.webkit.WebView
    public void destroy() {
        try {
            if (this.e) {
                return;
            }
            com.adsurge.adn.x1.j.d();
            loadUrl(AndroidWebViewClient.BLANK_PAGE);
            ViewParent parent = getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(this);
            }
            if (this.j != null) {
                this.j = null;
            }
            this.g = o;
            removeAllViews();
            super.destroy();
            this.e = true;
        } catch (Throwable unused) {
        }
    }

    public void e(boolean z) {
        if (!z) {
            setLayerType(2, null);
            return;
        }
        WebSettings settings = getSettings();
        settings.setMixedContentMode(n);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setSupportMultipleWindows(false);
        settings.setSaveFormData(false);
        File fileA = com.adsurge.adn.x1.l.a(getContext());
        if (!fileA.exists()) {
            fileA.mkdirs();
        }
        String absolutePath = fileA.getAbsolutePath();
        settings.setDatabaseEnabled(true);
        settings.setDatabasePath(absolutePath);
        settings.setGeolocationEnabled(true);
        settings.setGeolocationDatabasePath(absolutePath);
        settings.setMediaPlaybackRequiresUserGesture(false);
    }

    public l.a g() {
        return this.b;
    }

    public boolean h() {
        return this.e;
    }

    public void i() {
        setWebViewClient(new c());
        setWebChromeClient(null);
        this.g = o;
        this.j = null;
    }

    public final void j() {
        removeJavascriptInterface("searchBoxJavaBridge_");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
    }

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        A a2;
        if (!this.f) {
            scrollTo(i, 0);
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
        if (!this.i || (a2 = this.h) == null) {
            return;
        }
        if (i2 > i4) {
            a2.b();
        } else {
            a2.d();
        }
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.c.b(onTouchListener);
        super.setOnTouchListener(this.c);
    }

    @Override // android.webkit.WebView
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        if (webChromeClient != null && !(webChromeClient instanceof g)) {
            com.adsurge.adn.Y0.d dVar = new com.adsurge.adn.Y0.d();
            dVar.a(NotificationCompat.CATEGORY_MESSAGE, webChromeClient.toString());
            com.adsurge.adn.w1.b.b(9130004, (com.adsurge.adn.Y0.c) null, (Integer) 0, dVar);
            if (com.adsurge.adn.s1.a.b().c().a("iswcc", 1) != 0) {
                return;
            }
        }
        super.setWebChromeClient(webChromeClient);
    }

    public h(Context context) {
        super(a(context));
        this.a = new ArrayList();
        this.c = new e();
        this.d = false;
        this.f = true;
        k();
        getSettings().setJavaScriptEnabled(true);
        f();
        e();
        setDownloadListener(new b(context));
        resumeTimers();
    }

    public final void f() {
        j();
        getSettings().setSavePassword(false);
    }

    public final void k() {
        WebSettings settings = getSettings();
        StringBuilder sbQ = h50.q(settings.getUserAgentString(), " GDTMobSDK/");
        sbQ.append(com.adsurge.adn.X.w.a());
        settings.setUserAgentString(sbQ.toString());
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        try {
            super.loadUrl(str);
        } catch (Throwable unused) {
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        A a2;
        super.onAttachedToWindow();
        if (this.i && (a2 = this.h) != null && a2.getParent() == null) {
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup instanceof FrameLayout) {
                viewGroup.addView(this.h);
            }
        }
    }

    @Override // android.widget.AbsoluteLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        com.adsurge.adn.F1.g gVar;
        super.onLayout(z, i, i2, i3, i4);
        if (!this.d && (gVar = this.g) != null) {
            this.d = true;
            gVar.a(m);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        B b2 = this.j;
        if (b2 != null) {
            b2.a(i);
        }
    }

    public void f(boolean z) {
        this.l = z;
    }

    public static Context a(Context context) {
        return context;
    }

    public final /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
        this.b.a(motionEvent);
        return false;
    }

    public void a(WebViewClient webViewClient) {
        if (webViewClient != null) {
            setWebViewClient(webViewClient);
        }
    }

    public void a(g gVar) {
        if (gVar != null) {
            setWebChromeClient(gVar);
        }
    }

    public void a(com.adsurge.adn.F1.g gVar) {
        this.g = gVar;
        this.j = new B(gVar);
    }

    public void a(String str, ValueCallback valueCallback) {
        try {
            evaluateJavascript(str, valueCallback);
        } catch (Throwable unused) {
        }
    }

    public A a() {
        return this.h;
    }

    public final void e() {
        try {
            WebSettings settings = getSettings();
            settings.setAllowFileAccess(false);
            settings.setLoadsImagesAutomatically(true);
            settings.setCacheMode(-1);
            settings.setDomStorageEnabled(true);
        } catch (Throwable unused) {
        }
    }
}
